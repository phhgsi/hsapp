package co.median.android;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.core.content.AbstractC0966b;
import co.median.android.DownloadService;
import co.median.android.jrejze.R;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p083b.AbstractC1294b;
import p083b.InterfaceC1293a;
import p087c.C1308b;
import p135o0.AbstractC2296j;
import p135o0.C2287a;
import p135o0.C2292f;
import p135o0.InterfaceC2293g;
import p141q0.C2350d;

/* JADX INFO: renamed from: co.median.android.d */
/* JADX INFO: loaded from: classes.dex */
public class C1346d implements DownloadListener {

    /* JADX INFO: renamed from: j */
    private static final String f6567j = "co.median.android.d";

    /* JADX INFO: renamed from: k */
    private static Uri f6568k;

    /* JADX INFO: renamed from: a */
    private final MainActivity f6569a;

    /* JADX INFO: renamed from: b */
    private final d f6570b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1294b f6571c;

    /* JADX INFO: renamed from: d */
    private C1321B f6572d;

    /* JADX INFO: renamed from: e */
    private String f6573e;

    /* JADX INFO: renamed from: f */
    private DownloadService f6574f;

    /* JADX INFO: renamed from: g */
    private boolean f6575g = false;

    /* JADX INFO: renamed from: h */
    private e f6576h;

    /* JADX INFO: renamed from: i */
    private final ServiceConnection f6577i;

    /* JADX INFO: renamed from: co.median.android.d$a */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1346d.this.f6574f = ((DownloadService.BinderC1324a) iBinder).m6747a();
            C1346d.this.f6574f.m6744g(C1346d.this);
            C1346d.this.f6575g = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1346d.this.f6574f = null;
            C1346d.this.f6575g = false;
        }
    }

    /* JADX INFO: renamed from: co.median.android.d$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1346d.this.f6569a.m6948u3();
        }
    }

    /* JADX INFO: renamed from: co.median.android.d$c */
    class c implements DownloadService.InterfaceC1325b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f6580a;

        c(String str) {
            this.f6580a = str;
        }

        @Override // co.median.android.DownloadService.InterfaceC1325b
        /* JADX INFO: renamed from: a */
        public void mo6748a(String str) {
            C1346d.m6983C(C1346d.this.f6569a, this.f6580a, str);
        }

        @Override // co.median.android.DownloadService.InterfaceC1325b
        public void onSuccess() {
            C1346d.m6984D(C1346d.this.f6569a, this.f6580a);
        }
    }

    /* JADX INFO: renamed from: co.median.android.d$d */
    public enum d {
        PUBLIC_DOWNLOADS,
        PRIVATE_INTERNAL
    }

    C1346d(final MainActivity mainActivity) {
        a aVar = new a();
        this.f6577i = aVar;
        this.f6569a = mainActivity;
        C2350d c2350d = C2287a.m10903f(mainActivity).f10508V0;
        if (!c2350d.m11194a()) {
            this.f6570b = d.PRIVATE_INTERNAL;
        } else if (Build.VERSION.SDK_INT <= 28 && !c2350d.m11195b()) {
            this.f6570b = d.PRIVATE_INTERNAL;
        } else {
            this.f6570b = d.PUBLIC_DOWNLOADS;
        }
        mainActivity.bindService(new Intent(mainActivity, (Class<?>) DownloadService.class), aVar, 1);
        this.f6571c = mainActivity.m2525W(new C1308b(), new InterfaceC1293a() { // from class: m0.t
            @Override // p083b.InterfaceC1293a
            /* JADX INFO: renamed from: a */
            public final void mo4866a(Object obj) {
                this.f10383a.m7012z(mainActivity, (Map) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    private static void m6982B(final InterfaceC2293g interfaceC2293g, final String str, final JSONObject jSONObject) {
        ((Activity) interfaceC2293g).runOnUiThread(new Runnable() { // from class: m0.u
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2293g.mo6920a(AbstractC2296j.m10965b(str, jSONObject));
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static void m6983C(InterfaceC2293g interfaceC2293g, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", false);
            jSONObject.put("error", str2);
            m6982B(interfaceC2293g, str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m6984D(InterfaceC2293g interfaceC2293g, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", true);
            m6982B(interfaceC2293g, str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: F */
    private boolean m6985F(e eVar) {
        if (Build.VERSION.SDK_INT > 28 || this.f6570b != d.PUBLIC_DOWNLOADS || AbstractC0966b.checkSelfPermission(this.f6569a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        this.f6576h = eVar;
        this.f6571c.m6590a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        return true;
    }

    /* JADX INFO: renamed from: G */
    private void m6986G(e eVar, String str) {
        this.f6574f.m6745h(eVar, this.f6570b, new c(str));
    }

    /* JADX INFO: renamed from: I */
    private void m6987I(String str, String str2, String str3, boolean z2, boolean z3, String str4) {
        if (!this.f6575g) {
            C2292f.m10956b().m10960f(f6567j, "verifyAndStartDownload: Unable to start download.", new Exception("DownloadService not bound."));
            return;
        }
        e eVar = new e(str, str2, str3, z2, z3, false, str4);
        if (m6985F(eVar)) {
            return;
        }
        m6986G(eVar, str4);
    }

    /* JADX INFO: renamed from: J */
    public static void m6988J(final Activity activity, Uri uri, String str, boolean z2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, str);
            intent.setFlags(268435457);
            activity.startActivity(intent);
            if (z2) {
                f6568k = uri;
            }
        } catch (ActivityNotFoundException unused) {
            final String string = activity.getResources().getString(R.string.file_handler_not_found);
            activity.runOnUiThread(new Runnable() { // from class: m0.x
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(activity, string, 1).show();
                }
            });
        } catch (Exception e3) {
            C2292f.m10956b().m10960f(f6567j, "viewFile: Exception:", e3);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m6998j(Uri uri) {
        Log.d(f6567j, "addFileToGallery: Adding to Albums . . .");
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        this.f6569a.sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: k */
    public static Uri m6999k(ContentResolver contentResolver, String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", str3);
        Uri uriM7005q = m7005q(str3);
        if (uriM7005q == null) {
            return null;
        }
        return m7000l(uriM7005q, contentResolver, contentValues, str, str2);
    }

    /* JADX INFO: renamed from: l */
    private static Uri m7000l(Uri uri, ContentResolver contentResolver, ContentValues contentValues, String str, String str2) {
        try {
            Uri uriInsert = contentResolver.insert(uri, contentValues);
            return uriInsert == null ? m7002n(uri, contentResolver, contentValues, str, str2) : uriInsert;
        } catch (IllegalStateException unused) {
            return m7002n(uri, contentResolver, contentValues, str, str2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static File m7001m(File file, String str, String str2) {
        return new File(file, m7009v(str + "." + str2, file));
    }

    /* JADX INFO: renamed from: n */
    private static Uri m7002n(Uri uri, ContentResolver contentResolver, ContentValues contentValues, String str, String str2) {
        try {
            contentValues.put("_display_name", m7008u(contentResolver, uri, str, MimeTypeMap.getSingleton().getExtensionFromMimeType(str2)));
            return contentResolver.insert(uri, contentValues);
        } catch (IllegalStateException unused) {
            return m7003o(uri, contentResolver, contentValues, str);
        }
    }

    /* JADX INFO: renamed from: o */
    private static Uri m7003o(Uri uri, ContentResolver contentResolver, ContentValues contentValues, String str) {
        try {
            contentValues.put("_display_name", str + "_" + System.currentTimeMillis());
            return contentResolver.insert(uri, contentValues);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    private static boolean m7004p(ContentResolver contentResolver, Uri uri, String str) {
        try {
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, "_display_name=?", new String[]{str}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return true;
                    }
                } finally {
                }
            }
            if (cursorQuery == null) {
                return false;
            }
            cursorQuery.close();
            return false;
        } catch (Exception e3) {
            Log.w(f6567j, "externalFileExists: ", e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    private static Uri m7005q(String str) {
        if (Objects.equals(str, Environment.DIRECTORY_PICTURES)) {
            return MediaStore.Images.Media.getContentUri("external");
        }
        if (Objects.equals(str, Environment.DIRECTORY_DOWNLOADS)) {
            return MediaStore.Files.getContentUri("external");
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static String m7006r(Uri uri, ContentResolver contentResolver) {
        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("_display_name")) : null;
            cursorQuery.close();
            return string;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m7007s(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return null;
        }
        return iLastIndexOf == 0 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: u */
    private static String m7008u(ContentResolver contentResolver, Uri uri, String str, String str2) {
        String str3 = str;
        int i3 = 1;
        while (true) {
            if (!m7004p(contentResolver, uri, str3 + "." + str2)) {
                return str3;
            }
            str3 = str + " (" + i3 + ")";
            i3++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m7009v(String str, File file) {
        if (!new File(file, str).exists()) {
            return str;
        }
        String strSubstring = str.substring(0, str.lastIndexOf(46));
        String strSubstring2 = str.substring(str.lastIndexOf(46));
        File file2 = new File(file, strSubstring + "_1" + strSubstring2);
        int i3 = 1;
        while (file2.exists()) {
            i3++;
            file2 = new File(file, strSubstring + "_" + i3 + strSubstring2);
        }
        return file2.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m7010x(boolean z2, String str) {
        if (z2) {
            Toast.makeText(this.f6569a, R.string.file_download_finished_gallery, 0).show();
        } else {
            MainActivity mainActivity = this.f6569a;
            Toast.makeText(mainActivity, String.format(mainActivity.getString(R.string.file_download_finished_with_name), str), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m7011y(String str) {
        MainActivity mainActivity = this.f6569a;
        Toast.makeText(mainActivity, String.format(mainActivity.getString(R.string.file_download_finished_with_name), str), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m7012z(MainActivity mainActivity, Map map) {
        if (map.containsKey("android.permission.WRITE_EXTERNAL_STORAGE") && Boolean.FALSE.equals(map.get("android.permission.WRITE_EXTERNAL_STORAGE"))) {
            Toast.makeText(mainActivity, "Unable to save download, storage permission denied", 0).show();
            e eVar = this.f6576h;
            if (eVar != null) {
                m6983C(mainActivity, eVar.f6591g, "Unable to save download, storage permission denied.");
                this.f6576h = null;
                return;
            }
            return;
        }
        e eVar2 = this.f6576h;
        if (eVar2 == null || !this.f6575g) {
            return;
        }
        if (eVar2.f6590f) {
            C1349g c1349gM6894J1 = mainActivity.m6894J1();
            e eVar3 = this.f6576h;
            c1349gM6894J1.m7035i(eVar3.f6585a, eVar3.f6586b, eVar3.f6589e, eVar3.f6591g);
        } else {
            m6986G(eVar2, eVar2.f6591g);
        }
        this.f6576h = null;
    }

    /* JADX INFO: renamed from: A */
    public void m7013A() {
        Uri uri = f6568k;
        if (uri == null || uri.getPath() == null) {
            return;
        }
        Log.d(f6567j, "onAppResume: Deleting file after viewing: " + f6568k.getPath());
        this.f6569a.getContentResolver().delete(f6568k, null, null);
    }

    /* JADX INFO: renamed from: E */
    public void m7014E(C1321B c1321b) {
        this.f6572d = c1321b;
    }

    /* JADX INFO: renamed from: H */
    public void m7015H() {
        if (this.f6575g) {
            this.f6569a.unbindService(this.f6577i);
            this.f6575g = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    @Override // android.webkit.DownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDownloadStart(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, long r12) {
        /*
            r7 = this;
            co.median.android.B r9 = r7.f6572d
            if (r9 == 0) goto L7
            r9.m6710I()
        L7:
            co.median.android.MainActivity r9 = r7.f6569a
            if (r9 == 0) goto L13
            co.median.android.d$b r12 = new co.median.android.d$b
            r12.<init>()
            r9.runOnUiThread(r12)
        L13:
            boolean r9 = android.text.TextUtils.isEmpty(r10)
            if (r9 != 0) goto L1f
            java.lang.String r9 = p135o0.AbstractC2296j.m10968e(r8, r10, r11)
        L1d:
            r2 = r9
            goto L21
        L1f:
            r9 = 0
            goto L1d
        L21:
            java.lang.String r9 = "blob:"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L54
            co.median.android.MainActivity r9 = r7.f6569a
            if (r9 == 0) goto L54
            co.median.android.d$d r9 = r7.f6570b
            co.median.android.d$d r10 = co.median.android.C1346d.d.PRIVATE_INTERNAL
            if (r9 != r10) goto L36
            r9 = 1
        L34:
            r4 = r9
            goto L38
        L36:
            r9 = 0
            goto L34
        L38:
            co.median.android.d$e r0 = new co.median.android.d$e
            r3 = 1
            java.lang.String r5 = ""
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r8 = r7.m6985F(r0)
            if (r8 == 0) goto L48
            return
        L48:
            co.median.android.MainActivity r8 = r7.f6569a
            co.median.android.g r8 = r8.m6894J1()
            java.lang.String r9 = ""
            r8.m7035i(r1, r2, r4, r9)
            return
        L54:
            r1 = r8
            r7.f6573e = r1
            if (r11 == 0) goto L69
            java.lang.String r8 = "application/force-download"
            boolean r8 = r11.equalsIgnoreCase(r8)
            if (r8 != 0) goto L69
            java.lang.String r8 = "application/octet-stream"
            boolean r8 = r11.equalsIgnoreCase(r8)
            if (r8 == 0) goto L81
        L69:
            android.webkit.MimeTypeMap r8 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r9 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r1)
            if (r9 == 0) goto L81
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L81
            java.lang.String r8 = r8.getMimeTypeFromExtension(r9)
            if (r8 == 0) goto L81
            r3 = r8
            goto L82
        L81:
            r3 = r11
        L82:
            r5 = 0
            java.lang.String r6 = ""
            r4 = 0
            r0 = r7
            r0.m6987I(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.median.android.C1346d.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    /* JADX INFO: renamed from: t */
    public String m7016t() {
        return this.f6573e;
    }

    /* JADX INFO: renamed from: w */
    public void m7017w(Uri uri, String str, final boolean z2, boolean z3, final String str2) {
        if (uri == null) {
            return;
        }
        if (this.f6570b != d.PUBLIC_DOWNLOADS) {
            if (z3) {
                m6988J(this.f6569a, uri, str, true);
                return;
            } else {
                this.f6569a.runOnUiThread(new Runnable() { // from class: m0.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10394d.m7011y(str2);
                    }
                });
                return;
            }
        }
        if (z2) {
            m6998j(uri);
        }
        if (z3) {
            m6988J(this.f6569a, uri, str, false);
        } else {
            this.f6569a.runOnUiThread(new Runnable() { // from class: m0.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10390d.m7010x(z2, str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: co.median.android.d$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        String f6585a;

        /* JADX INFO: renamed from: b */
        String f6586b;

        /* JADX INFO: renamed from: c */
        String f6587c;

        /* JADX INFO: renamed from: d */
        boolean f6588d;

        /* JADX INFO: renamed from: e */
        boolean f6589e;

        /* JADX INFO: renamed from: f */
        boolean f6590f;

        /* JADX INFO: renamed from: g */
        String f6591g;

        public e(String str, String str2, String str3, boolean z2, boolean z3, boolean z4, String str4) {
            this.f6585a = str;
            this.f6586b = str2;
            this.f6587c = str3;
            this.f6588d = z2;
            this.f6589e = z3;
            this.f6590f = z4;
            this.f6591g = str4;
        }

        public e(String str, String str2, boolean z2, boolean z3, String str3) {
            this.f6585a = str;
            this.f6586b = str2;
            this.f6590f = z2;
            this.f6589e = z3;
            this.f6591g = str3;
        }
    }
}
