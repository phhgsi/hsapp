package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p024I.AbstractC0206c;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: e */
    private static final String[] f4650e = {"_display_name", "_size"};

    /* JADX INFO: renamed from: f */
    private static final File f4651f = new File("/");

    /* JADX INFO: renamed from: g */
    private static final HashMap f4652g = new HashMap();

    /* JADX INFO: renamed from: a */
    private final Object f4653a;

    /* JADX INFO: renamed from: b */
    private final int f4654b;

    /* JADX INFO: renamed from: c */
    private String f4655c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0963b f4656d;

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$a */
    static class C0962a {
        /* JADX INFO: renamed from: a */
        static File[] m4209a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$b */
    interface InterfaceC0963b {
        /* JADX INFO: renamed from: a */
        File mo4210a(Uri uri);

        /* JADX INFO: renamed from: b */
        Uri mo4211b(File file);
    }

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$c */
    static class C0964c implements InterfaceC0963b {

        /* JADX INFO: renamed from: a */
        private final String f4657a;

        /* JADX INFO: renamed from: b */
        private final HashMap f4658b = new HashMap();

        C0964c(String str) {
            this.f4657a = str;
        }

        /* JADX INFO: renamed from: d */
        private boolean m4212d(String str, String str2) {
            return FileProvider.m4208k(str).startsWith(FileProvider.m4208k(str2) + '/');
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0963b
        /* JADX INFO: renamed from: a */
        public File mo4210a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Unable to find path from root: " + uri);
            }
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = (File) this.f4658b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (m4212d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0963b
        /* JADX INFO: renamed from: b */
        public Uri mo4211b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f4658b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (m4212d(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.f4657a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* JADX INFO: renamed from: c */
        void m4213c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f4658b.put(str, file.getCanonicalFile());
            } catch (IOException e3) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e3);
            }
        }
    }

    public FileProvider() {
        this(0);
    }

    /* JADX INFO: renamed from: b */
    private static File m4199b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: c */
    private static Object[] m4200c(Object[] objArr, int i3) {
        Object[] objArr2 = new Object[i3];
        System.arraycopy(objArr, 0, objArr2, 0, i3);
        return objArr2;
    }

    /* JADX INFO: renamed from: d */
    private static String[] m4201d(String[] strArr, int i3) {
        String[] strArr2 = new String[i3];
        System.arraycopy(strArr, 0, strArr2, 0, i3);
        return strArr2;
    }

    /* JADX INFO: renamed from: e */
    static XmlResourceParser m4202e(Context context, String str, ProviderInfo providerInfo, int i3) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i3 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i3);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* JADX INFO: renamed from: f */
    private InterfaceC0963b m4203f() {
        InterfaceC0963b interfaceC0963b;
        synchronized (this.f4653a) {
            try {
                AbstractC0206c.m599d(this.f4655c, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f4656d == null) {
                    this.f4656d = m4204g(getContext(), this.f4655c, this.f4654b);
                }
                interfaceC0963b = this.f4656d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0963b;
    }

    /* JADX INFO: renamed from: g */
    private static InterfaceC0963b m4204g(Context context, String str, int i3) {
        InterfaceC0963b interfaceC0963bM4207j;
        HashMap map = f4652g;
        synchronized (map) {
            try {
                interfaceC0963bM4207j = (InterfaceC0963b) map.get(str);
                if (interfaceC0963bM4207j == null) {
                    try {
                        try {
                            interfaceC0963bM4207j = m4207j(context, str, i3);
                            map.put(str, interfaceC0963bM4207j);
                        } catch (IOException e3) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                        }
                    } catch (XmlPullParserException e4) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0963bM4207j;
    }

    /* JADX INFO: renamed from: h */
    public static Uri m4205h(Context context, String str, File file) {
        return m4204g(context, str, 0).mo4211b(file);
    }

    /* JADX INFO: renamed from: i */
    private static int m4206i(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* JADX INFO: renamed from: j */
    private static InterfaceC0963b m4207j(Context context, String str, int i3) throws XmlPullParserException, IOException {
        C0964c c0964c = new C0964c(str);
        XmlResourceParser xmlResourceParserM4202e = m4202e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i3);
        while (true) {
            int next = xmlResourceParserM4202e.next();
            if (next == 1) {
                return c0964c;
            }
            if (next == 2) {
                String name = xmlResourceParserM4202e.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserM4202e.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
                String attributeValue2 = xmlResourceParserM4202e.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f4651f;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = AbstractC0966b.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = AbstractC0966b.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrM4209a = C0962a.m4209a(context);
                    if (fileArrM4209a.length > 0) {
                        externalStorageDirectory = fileArrM4209a[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    c0964c.m4213c(attributeValue, m4199b(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static String m4208k(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.f4653a) {
            this.f4655c = str2;
        }
        HashMap map = f4652g;
        synchronized (map) {
            map.remove(str2);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return m4203f().mo4210a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileMo4210a = m4203f().mo4210a(uri);
        int iLastIndexOf = fileMo4210a.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileMo4210a.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(m4203f().mo4210a(uri), m4206i(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i3;
        File fileMo4210a = m4203f().mo4210a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f4650e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i4 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i4] = "_display_name";
                i3 = i4 + 1;
                objArr[i4] = queryParameter == null ? fileMo4210a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i4] = "_size";
                i3 = i4 + 1;
                objArr[i4] = Long.valueOf(fileMo4210a.length());
            }
            i4 = i3;
        }
        String[] strArrM4201d = m4201d(strArr3, i4);
        Object[] objArrM4200c = m4200c(objArr, i4);
        MatrixCursor matrixCursor = new MatrixCursor(strArrM4201d, 1);
        matrixCursor.addRow(objArrM4200c);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(int i3) {
        this.f4653a = new Object();
        this.f4654b = i3;
    }
}
