package co.median.android;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import co.median.android.C1346d;
import co.median.android.MainActivity;
import co.median.android.jrejze.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p128m0.AbstractC2172P;
import p135o0.AbstractC2296j;
import p135o0.C2287a;
import p135o0.C2292f;

/* JADX INFO: renamed from: co.median.android.g */
/* JADX INFO: loaded from: classes.dex */
public class C1349g {

    /* JADX INFO: renamed from: f */
    private static final String f6596f = "g";

    /* JADX INFO: renamed from: a */
    private final C1346d.d f6597a;

    /* JADX INFO: renamed from: b */
    private String f6598b;

    /* JADX INFO: renamed from: d */
    private final MainActivity f6600d;

    /* JADX INFO: renamed from: c */
    private final b f6599c = new b();

    /* JADX INFO: renamed from: e */
    private final Map f6601e = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: co.median.android.g$a */
    static class a {

        /* JADX INFO: renamed from: a */
        public String f6602a;

        /* JADX INFO: renamed from: b */
        public String f6603b;

        /* JADX INFO: renamed from: c */
        public long f6604c;

        /* JADX INFO: renamed from: d */
        public String f6605d;

        /* JADX INFO: renamed from: e */
        public String f6606e;

        /* JADX INFO: renamed from: f */
        public File f6607f;

        /* JADX INFO: renamed from: g */
        public Uri f6608g;

        /* JADX INFO: renamed from: h */
        public OutputStream f6609h;

        /* JADX INFO: renamed from: i */
        public long f6610i;

        /* JADX INFO: renamed from: j */
        public String f6611j;

        /* JADX INFO: renamed from: k */
        public boolean f6612k;

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: co.median.android.g$b */
    class b {
        @JavascriptInterface
        public void postMessage(String str) {
            Log.d(C1349g.f6596f, "got message " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strM10970g = AbstractC2296j.m10970g(jSONObject, "event");
                if ("fileStart".equals(strM10970g)) {
                    C1349g.this.m7033q(jSONObject);
                    return;
                }
                if ("fileChunk".equals(strM10970g)) {
                    C1349g.this.m7031o(jSONObject);
                    return;
                }
                if ("fileEnd".equals(strM10970g)) {
                    C1349g.this.m7032p(jSONObject);
                    return;
                }
                C2292f.m10956b().m10959e(C1349g.f6596f, "Invalid event " + strM10970g);
            } catch (IOException e3) {
                C2292f.m10956b().m10960f(C1349g.f6596f, "IO Error", e3);
            } catch (JSONException e4) {
                C2292f.m10956b().m10960f(C1349g.f6596f, "Error parsing message as json", e4);
            }
        }

        private b() {
        }
    }

    public C1349g(MainActivity mainActivity) {
        this.f6600d = mainActivity;
        if (C2287a.m10903f(mainActivity).f10508V0.m11194a()) {
            this.f6597a = C1346d.d.PUBLIC_DOWNLOADS;
        } else {
            this.f6597a = C1346d.d.PRIVATE_INTERNAL;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m7027k(a aVar) {
        if (aVar.f6608g == null && aVar.f6607f != null) {
            aVar.f6608g = FileProvider.m4205h(this.f6600d, this.f6600d.getApplicationContext().getPackageName() + ".fileprovider", aVar.f6607f);
        }
        Uri uri = aVar.f6608g;
        if (uri == null) {
            return;
        }
        C1346d.m6988J(this.f6600d, uri, aVar.f6605d, this.f6597a == C1346d.d.PRIVATE_INTERNAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m7028l() {
        this.f6600d.mo6920a("medianGotStoragePermissions()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m7029m(a aVar, String[] strArr, int[] iArr) {
        try {
            m7034r(aVar, iArr[0] == 0);
            this.f6600d.runOnUiThread(new Runnable() { // from class: m0.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9978d.m7028l();
                }
            });
        } catch (IOException e3) {
            C2292f.m10956b().m10960f(f6596f, "IO Error", e3);
            C1346d.m6983C(this.f6600d, aVar.f6611j, "IO Error - " + e3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m7030n() {
        this.f6600d.mo6920a("medianGotStoragePermissions()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m7031o(JSONObject jSONObject) throws IOException {
        a aVar;
        String strM10970g;
        int iIndexOf;
        String strM10970g2 = AbstractC2296j.m10970g(jSONObject, "id");
        if (TextUtils.isEmpty(strM10970g2) || (aVar = (a) this.f6601e.get(strM10970g2)) == null || (strM10970g = AbstractC2296j.m10970g(jSONObject, "data")) == null || (iIndexOf = strM10970g.indexOf(";base64,")) == -1) {
            return;
        }
        byte[] bArrDecode = Base64.decode(strM10970g.substring(iIndexOf + 8), 0);
        if (aVar.f6610i + ((long) bArrDecode.length) <= aVar.f6604c) {
            aVar.f6609h.write(bArrDecode);
            aVar.f6610i += (long) bArrDecode.length;
            return;
        }
        try {
            aVar.f6609h.close();
            aVar.f6607f.delete();
            this.f6601e.remove(strM10970g2);
        } catch (Exception unused) {
        }
        C2292f.m10956b().m10959e(f6596f, "Received too many bytes. Expected " + aVar.f6604c);
        C1346d.m6983C(this.f6600d, aVar.f6611j, "Received too many bytes. Expected " + aVar.f6604c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m7032p(JSONObject jSONObject) throws IOException {
        String string;
        String strM10970g = AbstractC2296j.m10970g(jSONObject, "id");
        if (TextUtils.isEmpty(strM10970g)) {
            C2292f.m10956b().m10959e(f6596f, "Invalid identifier " + strM10970g + " for fileEnd");
            C1346d.m6983C(this.f6600d, this.f6598b, "Unable to retrieve download info on file end.");
            return;
        }
        final a aVar = (a) this.f6601e.get(strM10970g);
        if (aVar == null) {
            C2292f.m10956b().m10959e(f6596f, "Invalid identifier " + strM10970g + " for fileEnd");
            C1346d.m6983C(this.f6600d, this.f6598b, "Unable to retrieve download info on file end.");
            return;
        }
        OutputStream outputStream = aVar.f6609h;
        if (outputStream != null) {
            outputStream.close();
        }
        String strOptString = jSONObject.optString("error");
        if (!TextUtils.isEmpty(strOptString)) {
            C1346d.m6983C(this.f6600d, aVar.f6611j, strOptString);
            return;
        }
        if (aVar.f6612k) {
            this.f6600d.runOnUiThread(new Runnable() { // from class: co.median.android.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6592d.m7027k(aVar);
                }
            });
        } else {
            String str = aVar.f6603b;
            if (str == null || str.isEmpty()) {
                string = this.f6600d.getString(R.string.file_download_finished);
            } else {
                string = String.format(this.f6600d.getString(R.string.file_download_finished_with_name), aVar.f6603b + '.' + aVar.f6606e);
            }
            Toast.makeText(this.f6600d, string, 0).show();
        }
        C1346d.m6984D(this.f6600d, aVar.f6611j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m7033q(JSONObject jSONObject) {
        String strM10970g = AbstractC2296j.m10970g(jSONObject, "id");
        if (TextUtils.isEmpty(strM10970g)) {
            C2292f.m10956b().m10959e(f6596f, "Invalid file id");
            C1346d.m6983C(this.f6600d, this.f6598b, "Unable to retrieve download info on file start.");
            return;
        }
        final a aVar = (a) this.f6601e.get(strM10970g);
        if (aVar == null) {
            C1346d.m6983C(this.f6600d, this.f6598b, "Unable to retrieve download info on file start.");
            return;
        }
        if (TextUtils.isEmpty(aVar.f6603b)) {
            String strM10970g2 = AbstractC2296j.m10970g(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME);
            aVar.f6603b = strM10970g2;
            if (TextUtils.isEmpty(strM10970g2)) {
                aVar.f6603b = "download";
            }
        } else {
            String strM7007s = C1346d.m7007s(aVar.f6603b);
            aVar.f6606e = strM7007s;
            if (!TextUtils.isEmpty(strM7007s)) {
                if (Objects.equals(aVar.f6606e, aVar.f6603b)) {
                    aVar.f6603b = "download";
                } else {
                    String str = aVar.f6603b;
                    aVar.f6603b = str.substring(0, str.length() - (aVar.f6606e.length() + 1));
                }
                aVar.f6605d = MimeTypeMap.getSingleton().getMimeTypeFromExtension(aVar.f6606e);
            }
        }
        long jOptLong = jSONObject.optLong("size", -1L);
        if (jOptLong <= 0 || jOptLong > 1073741824) {
            C2292f.m10956b().m10959e(f6596f, "Invalid file size");
            C1346d.m6983C(this.f6600d, aVar.f6611j, "Invalid file size.");
            return;
        }
        aVar.f6604c = jOptLong;
        if (TextUtils.isEmpty(aVar.f6605d)) {
            String strM10970g3 = AbstractC2296j.m10970g(jSONObject, "type");
            aVar.f6605d = strM10970g3;
            if (TextUtils.isEmpty(strM10970g3)) {
                C2292f.m10956b().m10959e(f6596f, "Invalid file type");
                C1346d.m6983C(this.f6600d, aVar.f6611j, "Invalid file type.");
                return;
            }
        }
        if (TextUtils.isEmpty(aVar.f6606e)) {
            aVar.f6606e = MimeTypeMap.getSingleton().getExtensionFromMimeType(aVar.f6605d);
        }
        if (Build.VERSION.SDK_INT < 29 && this.f6597a == C1346d.d.PUBLIC_DOWNLOADS) {
            this.f6600d.m6906R1(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new MainActivity.InterfaceC1338j() { // from class: co.median.android.f
                @Override // co.median.android.MainActivity.InterfaceC1338j
                /* JADX INFO: renamed from: a */
                public final void mo6964a(String[] strArr, int[] iArr) {
                    this.f6594a.m7029m(aVar, strArr, iArr);
                }
            });
        } else {
            m7034r(aVar, true);
            this.f6600d.runOnUiThread(new Runnable() { // from class: m0.H
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9975d.m7030n();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    private void m7034r(a aVar, boolean z2) {
        if (!z2 || this.f6597a != C1346d.d.PUBLIC_DOWNLOADS) {
            aVar.f6607f = C1346d.m7001m(this.f6600d.getFilesDir(), aVar.f6603b, aVar.f6606e);
            aVar.f6609h = new BufferedOutputStream(new FileOutputStream(aVar.f6607f));
        } else if (Build.VERSION.SDK_INT > 28) {
            ContentResolver contentResolver = this.f6600d.getApplicationContext().getContentResolver();
            Uri uriM6999k = C1346d.m6999k(contentResolver, aVar.f6603b, aVar.f6605d, Environment.DIRECTORY_DOWNLOADS);
            if (uriM6999k != null) {
                aVar.f6609h = contentResolver.openOutputStream(uriM6999k);
                aVar.f6608g = uriM6999k;
            }
        } else {
            aVar.f6607f = C1346d.m7001m(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), aVar.f6603b, aVar.f6606e);
            aVar.f6609h = new BufferedOutputStream(new FileOutputStream(aVar.f6607f));
        }
        aVar.f6610i = 0L;
        this.f6601e.put(aVar.f6602a, aVar);
    }

    /* JADX INFO: renamed from: i */
    public void m7035i(String str, String str2, boolean z2, String str3) {
        if (str == null || !str.startsWith("blob:")) {
            return;
        }
        this.f6598b = str3;
        a aVar = new a();
        String string = UUID.randomUUID().toString();
        aVar.f6602a = string;
        aVar.f6603b = str2;
        aVar.f6611j = str3;
        aVar.f6612k = z2;
        this.f6601e.put(string, aVar);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AbstractC2172P.m10665b(new BufferedInputStream(this.f6600d.getAssets().open("BlobDownloader.js")), byteArrayOutputStream);
            this.f6600d.mo6920a(byteArrayOutputStream.toString());
            this.f6600d.mo6920a(String.format("medianDownloadBlobUrl(%s, '%s', '%s')", AbstractC2296j.m10969f(str), aVar.f6602a, aVar.f6603b));
        } catch (IOException e3) {
            C2292f.m10956b().m10960f(f6596f, e3.getMessage(), e3);
            C1346d.m6983C(this.f6600d, str3, "IO Error - " + e3.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public b m7036j() {
        return this.f6599c;
    }
}
