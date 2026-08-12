package co.median.android;

import android.app.Service;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import co.median.android.C1346d;
import co.median.android.jrejze.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p135o0.AbstractC2296j;
import p135o0.C2287a;
import p135o0.C2292f;

/* JADX INFO: loaded from: classes.dex */
public class DownloadService extends Service {

    /* JADX INFO: renamed from: b */
    private C1346d f6443b;

    /* JADX INFO: renamed from: e */
    private String f6446e;

    /* JADX INFO: renamed from: a */
    private final Handler f6442a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    private final Map f6444c = new HashMap();

    /* JADX INFO: renamed from: d */
    private int f6445d = 0;

    /* JADX INFO: renamed from: co.median.android.DownloadService$a */
    public class BinderC1324a extends Binder {
        public BinderC1324a() {
        }

        /* JADX INFO: renamed from: a */
        public DownloadService m6747a() {
            return DownloadService.this;
        }
    }

    /* JADX INFO: renamed from: co.median.android.DownloadService$b */
    public interface InterfaceC1325b {
        /* JADX INFO: renamed from: a */
        void mo6748a(String str);

        void onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: co.median.android.DownloadService$c */
    class C1326c {

        /* JADX INFO: renamed from: a */
        private final int f6448a;

        /* JADX INFO: renamed from: b */
        private final String f6449b;

        /* JADX INFO: renamed from: c */
        private boolean f6450c;

        /* JADX INFO: renamed from: d */
        private HttpURLConnection f6451d;

        /* JADX INFO: renamed from: e */
        private InputStream f6452e;

        /* JADX INFO: renamed from: f */
        private FileOutputStream f6453f;

        /* JADX INFO: renamed from: h */
        private Uri f6455h;

        /* JADX INFO: renamed from: i */
        private String f6456i;

        /* JADX INFO: renamed from: j */
        private String f6457j;

        /* JADX INFO: renamed from: k */
        private String f6458k;

        /* JADX INFO: renamed from: l */
        private boolean f6459l;

        /* JADX INFO: renamed from: m */
        private boolean f6460m;

        /* JADX INFO: renamed from: n */
        private final C1346d.d f6461n;

        /* JADX INFO: renamed from: o */
        private final InterfaceC1325b f6462o;

        /* JADX INFO: renamed from: p */
        AtomicReference f6463p;

        /* JADX INFO: renamed from: g */
        private File f6454g = null;

        /* JADX INFO: renamed from: q */
        private boolean f6464q = false;

        public C1326c(String str, String str2, String str3, boolean z2, boolean z3, C1346d.d dVar, InterfaceC1325b interfaceC1325b) {
            int i3 = DownloadService.this.f6445d;
            DownloadService.this.f6445d = i3 + 1;
            this.f6448a = i3;
            this.f6449b = str;
            this.f6456i = str2;
            this.f6458k = str3;
            this.f6450c = false;
            this.f6459l = z2;
            this.f6460m = z3;
            this.f6461n = dVar;
            this.f6462o = interfaceC1325b;
            this.f6463p = new AtomicReference(str2);
        }

        /* JADX INFO: renamed from: e */
        private void m6751e() throws IOException {
            String schemeSpecificPart = Uri.parse(this.f6449b).getSchemeSpecificPart();
            this.f6458k = schemeSpecificPart.substring(0, schemeSpecificPart.indexOf(";"));
            this.f6457j = MimeTypeMap.getSingleton().getExtensionFromMimeType(this.f6458k);
            if (TextUtils.isEmpty(this.f6456i)) {
                int iIndexOf = schemeSpecificPart.indexOf("filename=");
                if (iIndexOf != -1) {
                    int i3 = iIndexOf + 9;
                    int iIndexOf2 = schemeSpecificPart.indexOf(";", i3);
                    this.f6456i = Uri.decode(iIndexOf2 != -1 ? schemeSpecificPart.substring(i3, iIndexOf2) : schemeSpecificPart.substring(i3));
                }
                if (TextUtils.isEmpty(this.f6456i)) {
                    this.f6456i = "download";
                }
            }
            if (!Objects.equals(this.f6456i, "download")) {
                String strM7007s = C1346d.m7007s(this.f6456i);
                if (!TextUtils.isEmpty(strM7007s)) {
                    this.f6457j = strM7007s;
                    if (!Objects.equals(this.f6456i, strM7007s)) {
                        String str = this.f6456i;
                        this.f6456i = str.substring(0, str.length() - (strM7007s.length() + 1));
                        this.f6458k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.f6457j);
                    }
                }
            }
            m6753g();
            if (schemeSpecificPart.contains(";base64")) {
                this.f6453f.write(Base64.decode(schemeSpecificPart.substring(schemeSpecificPart.indexOf(";base64,") + 8), 0));
            } else {
                this.f6453f.write(schemeSpecificPart.substring(schemeSpecificPart.indexOf(",") + 1).getBytes(StandardCharsets.UTF_8));
            }
        }

        /* JADX INFO: renamed from: f */
        private void m6752f() throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f6449b).openConnection();
            this.f6451d = httpURLConnection;
            httpURLConnection.setInstanceFollowRedirects(true);
            this.f6451d.setRequestProperty("User-Agent", DownloadService.this.f6446e);
            this.f6451d.setConnectTimeout(5000);
            this.f6451d.connect();
            if (this.f6451d.getResponseCode() != 200) {
                C2292f.m10956b().m10959e("DownloadService", "Server returned HTTP " + this.f6451d.getResponseCode() + " " + this.f6451d.getResponseMessage());
                this.f6450c = false;
                this.f6462o.mo6748a("Response code: " + this.f6451d.getResponseCode() + ". " + this.f6451d.getResponseMessage());
                return;
            }
            Log.d("DownloadService", "startDownload: File size in MB: " + (((double) this.f6451d.getContentLength()) / 1048576.0d));
            if (this.f6451d.getHeaderField("Content-Type") != null) {
                this.f6458k = this.f6451d.getHeaderField("Content-Type");
            }
            if (TextUtils.isEmpty(this.f6456i)) {
                String strM10968e = AbstractC2296j.m10968e(this.f6449b, this.f6451d.getHeaderField("Content-Disposition"), this.f6458k);
                int iLastIndexOf = strM10968e.lastIndexOf(46);
                if (iLastIndexOf == -1) {
                    this.f6456i = strM10968e;
                    this.f6457j = "";
                } else if (iLastIndexOf == 0) {
                    this.f6456i = "download";
                    this.f6457j = strM10968e.substring(1);
                } else {
                    this.f6456i = strM10968e.substring(0, iLastIndexOf);
                    this.f6457j = strM10968e.substring(iLastIndexOf + 1);
                }
                if (!TextUtils.isEmpty(this.f6457j)) {
                    this.f6458k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.f6457j);
                }
            } else {
                String strM7007s = C1346d.m7007s(this.f6456i);
                this.f6457j = strM7007s;
                if (TextUtils.isEmpty(strM7007s)) {
                    this.f6457j = MimeTypeMap.getSingleton().getExtensionFromMimeType(this.f6458k);
                } else if (Objects.equals(this.f6456i, this.f6457j)) {
                    this.f6456i = "download";
                } else {
                    String str = this.f6456i;
                    this.f6456i = str.substring(0, str.length() - (this.f6457j.length() + 1));
                    this.f6458k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.f6457j);
                }
            }
            m6753g();
            int contentLength = this.f6451d.getContentLength();
            this.f6452e = this.f6451d.getInputStream();
            byte[] bArr = new byte[4096];
            int i3 = 0;
            while (true) {
                int i4 = this.f6452e.read(bArr);
                if (i4 == -1 || !this.f6450c) {
                    return;
                }
                this.f6453f.write(bArr, 0, i4);
                i3 += i4;
                Log.d("DownloadService", "startDownload: Download progress: " + ((i3 * 100) / contentLength));
            }
        }

        /* JADX INFO: renamed from: g */
        private void m6753g() {
            if (this.f6461n != C1346d.d.PUBLIC_DOWNLOADS) {
                this.f6460m = true;
                File fileM7001m = C1346d.m7001m(DownloadService.this.getFilesDir(), this.f6456i, this.f6457j);
                this.f6454g = fileM7001m;
                this.f6463p.set(fileM7001m.getName());
                this.f6453f = new FileOutputStream(this.f6454g);
                return;
            }
            if (Build.VERSION.SDK_INT <= 28) {
                if (this.f6459l) {
                    this.f6454g = C1346d.m7001m(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), this.f6456i, this.f6457j);
                } else {
                    this.f6454g = C1346d.m7001m(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), this.f6456i, this.f6457j);
                }
                this.f6463p.set(this.f6454g.getName());
                this.f6453f = new FileOutputStream(this.f6454g);
                return;
            }
            ContentResolver contentResolver = DownloadService.this.getApplicationContext().getContentResolver();
            if (this.f6459l && this.f6458k.contains("image")) {
                this.f6455h = C1346d.m6999k(contentResolver, this.f6456i, this.f6458k, Environment.DIRECTORY_PICTURES);
            } else {
                this.f6455h = C1346d.m6999k(contentResolver, this.f6456i, this.f6458k, Environment.DIRECTORY_DOWNLOADS);
                this.f6459l = false;
            }
            Uri uri = this.f6455h;
            if (uri != null) {
                this.f6463p.set(C1346d.m7006r(uri, contentResolver));
                this.f6453f = (FileOutputStream) contentResolver.openOutputStream(this.f6455h);
                return;
            }
            this.f6450c = false;
            DownloadService.this.f6442a.post(new Runnable() { // from class: co.median.android.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6566d.m6754j();
                }
            });
            C2292f.m10956b().m10959e("DownloadService", "Error creating file - filename: " + this.f6456i + ", mimetype: " + this.f6458k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public /* synthetic */ void m6754j() {
            DownloadService downloadService = DownloadService.this;
            Toast.makeText(downloadService, downloadService.getString(R.string.file_download_error), 0).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[PHI: r0
  0x0079: PHI (r0v25 java.io.File) = (r0v18 java.io.File), (r0v29 java.io.File) binds: [B:49:0x00eb, B:31:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0110 A[PHI: r0
  0x0110: PHI (r0v4 java.io.File) = (r0v3 java.io.File), (r0v9 java.io.File) binds: [B:62:0x014a, B:55:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ void m6755k() {
            /*
                Method dump skipped, instruction units count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: co.median.android.DownloadService.C1326c.m6755k():void");
        }

        /* JADX INFO: renamed from: c */
        public void m6756c() {
            this.f6450c = false;
            Toast.makeText(DownloadService.this, DownloadService.this.getString(R.string.download_canceled) + " " + this.f6456i, 0).show();
        }

        /* JADX INFO: renamed from: d */
        public void m6757d() {
            try {
                InputStream inputStream = this.f6452e;
                if (inputStream != null) {
                    inputStream.close();
                }
                FileOutputStream fileOutputStream = this.f6453f;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                HttpURLConnection httpURLConnection = this.f6451d;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e3) {
                C2292f.m10956b().m10960f("DownloadService", "startDownload: ", e3);
            }
        }

        /* JADX INFO: renamed from: h */
        public int m6758h() {
            return this.f6448a;
        }

        /* JADX INFO: renamed from: i */
        public boolean m6759i() {
            return this.f6450c;
        }

        /* JADX INFO: renamed from: l */
        public void m6760l() {
            Log.d("DownloadService", "startDownload: Starting download");
            this.f6450c = true;
            new Thread(new Runnable() { // from class: co.median.android.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6565d.m6755k();
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m6743f(int i3) {
        C1326c c1326c = (C1326c) this.f6444c.get(Integer.valueOf(i3));
        if (c1326c == null || !c1326c.m6759i()) {
            return;
        }
        c1326c.m6756c();
    }

    /* JADX INFO: renamed from: g */
    public void m6744g(C1346d c1346d) {
        this.f6443b = c1346d;
    }

    /* JADX INFO: renamed from: h */
    public void m6745h(C1346d.e eVar, C1346d.d dVar, InterfaceC1325b interfaceC1325b) {
        m6746i(eVar.f6585a, eVar.f6586b, eVar.f6587c, eVar.f6588d, eVar.f6589e, dVar, interfaceC1325b);
    }

    /* JADX INFO: renamed from: i */
    public void m6746i(String str, String str2, String str3, boolean z2, boolean z3, C1346d.d dVar, InterfaceC1325b interfaceC1325b) {
        C1326c c1326c = new C1326c(str, str2, str3, z2, z3, dVar, interfaceC1325b);
        this.f6444c.put(Integer.valueOf(c1326c.m6758h()), c1326c);
        c1326c.m6760l();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new BinderC1324a();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6446e = C2287a.m10903f(this).f10584z;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i3, int i4) {
        if (!intent.getAction().equals("action_cancel_download")) {
            return 2;
        }
        m6743f(intent.getIntExtra("download_id", 0));
        return 2;
    }
}
