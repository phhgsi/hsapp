package co.median.android;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.security.KeyChain;
import android.security.KeyChainAliasCallback;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import co.median.android.C1321B;
import co.median.android.MainActivity;
import co.median.android.jrejze.R;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URISyntaxException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p128m0.AbstractC2172P;
import p128m0.AbstractC2181U;
import p128m0.AbstractC2244r;
import p128m0.C2142A;
import p128m0.C2152F;
import p128m0.C2154G;
import p128m0.C2170O;
import p128m0.C2171O0;
import p128m0.C2210f1;
import p128m0.C2237o1;
import p128m0.EnumC2240p1;
import p128m0.InterfaceC2247s;
import p135o0.AbstractC2296j;
import p135o0.AbstractC2298l;
import p135o0.C2287a;
import p135o0.C2292f;
import p135o0.C2297k;
import p135o0.InterfaceC2294h;

/* JADX INFO: renamed from: co.median.android.B */
/* JADX INFO: loaded from: classes.dex */
public class C1321B {

    /* JADX INFO: renamed from: r */
    private static final String f6400r = "co.median.android.B";

    /* JADX INFO: renamed from: a */
    private MainActivity f6401a;

    /* JADX INFO: renamed from: b */
    private String f6402b;

    /* JADX INFO: renamed from: c */
    private String f6403c;

    /* JADX INFO: renamed from: d */
    private String f6404d;

    /* JADX INFO: renamed from: e */
    private String f6405e;

    /* JADX INFO: renamed from: j */
    private boolean f6410j;

    /* JADX INFO: renamed from: k */
    private double f6411k;

    /* JADX INFO: renamed from: n */
    private final String f6414n;

    /* JADX INFO: renamed from: o */
    private final String f6415o;

    /* JADX INFO: renamed from: p */
    private boolean f6416p;

    /* JADX INFO: renamed from: q */
    private ValueCallback f6417q;

    /* JADX INFO: renamed from: g */
    private Handler f6407g = new Handler();

    /* JADX INFO: renamed from: h */
    private EnumC1327E f6408h = EnumC1327E.STATE_UNKNOWN;

    /* JADX INFO: renamed from: i */
    private boolean f6409i = false;

    /* JADX INFO: renamed from: l */
    private String f6412l = "";

    /* JADX INFO: renamed from: m */
    private boolean f6413m = false;

    /* JADX INFO: renamed from: f */
    private C2170O f6406f = new C2170O();

    /* JADX INFO: renamed from: co.median.android.B$a */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (C1321B.this.f6401a.m6907R2(str)) {
                return;
            }
            Intent intent = new Intent(C1321B.this.f6401a.getBaseContext(), (Class<?>) MainActivity.class);
            intent.putExtra("isRoot", false);
            intent.putExtra(ImagesContract.URL, str);
            intent.putExtra("ignoreInterceptMaxWindows", true);
            C1321B.this.f6401a.startActivityForResult(intent, 400);
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f6419d;

        b(String str) {
            this.f6419d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1321B.this.f6401a.m6900N2(this.f6419d);
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC2294h f6421d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f6422e;

        c(InterfaceC2294h interfaceC2294h, String str) {
            this.f6421d = interfaceC2294h;
            this.f6422e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1321B.this.f6401a.m6883B3(this.f6421d, true, false);
            C1321B.this.f6401a.m6942p1(this.f6422e);
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC2294h f6424d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f6425e;

        d(InterfaceC2294h interfaceC2294h, String str) {
            this.f6424d = interfaceC2294h;
            this.f6425e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1321B.this.f6401a.m6883B3(this.f6424d, true, false);
            C1321B.this.f6401a.m6942p1(this.f6425e);
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC2294h f6427d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f6428e;

        e(InterfaceC2294h interfaceC2294h, String str) {
            this.f6427d = interfaceC2294h;
            this.f6428e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1321B.this.f6401a.m6883B3(this.f6427d, true, false);
            C1321B.this.f6401a.m6942p1(this.f6428e);
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC2294h f6430d;

        f(InterfaceC2294h interfaceC2294h) {
            this.f6430d = interfaceC2294h;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2287a c2287aM10903f = C2287a.m10903f(C1321B.this.f6401a);
            String url = this.f6430d.getUrl();
            if (!c2287aM10903f.f10563p0 || "file:///android_asset/offline.html".equals(url)) {
                return;
            }
            this.f6430d.mo7079b("file:///android_asset/offline.html");
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$g */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CookieManager.getInstance().flush();
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC2294h f6433d;

        h(InterfaceC2294h interfaceC2294h) {
            this.f6433d = interfaceC2294h;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6433d.reload();
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$i */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1321B.this.f6401a.m6948u3();
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$j */
    class j implements InterfaceC2247s {
        j() {
        }

        @Override // p128m0.InterfaceC2247s
        /* JADX INFO: renamed from: a */
        public void mo6730a(Uri uri) {
            if (C1321B.this.f6417q != null) {
                C1321B.this.f6417q.onReceiveValue(new Uri[]{uri});
                C1321B.this.f6417q = null;
            }
        }

        @Override // p128m0.InterfaceC2247s
        public void onFailure(Exception exc) {
            Log.e(C1321B.f6400r, "onFailure: ", exc);
            C1321B.this.m6723m();
        }
    }

    /* JADX INFO: renamed from: co.median.android.B$k */
    private static class k extends AsyncTask {

        /* JADX INFO: renamed from: a */
        private Activity f6437a;

        /* JADX INFO: renamed from: b */
        private ClientCertRequest f6438b;

        public k(Activity activity, ClientCertRequest clientCertRequest) {
            this.f6437a = activity;
            this.f6438b = clientCertRequest;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair doInBackground(String... strArr) {
            String str = strArr[0];
            try {
                return new Pair(KeyChain.getPrivateKey(this.f6437a, str), KeyChain.getCertificateChain(this.f6437a, str));
            } catch (Exception e3) {
                C2292f.m10956b().m10960f(C1321B.f6400r, "Error getting private key for alias " + str, e3);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair pair) {
            if (pair != null) {
                Object obj = pair.first;
                boolean z2 = obj != null;
                Object obj2 = pair.second;
                if ((obj2 != null) & z2) {
                    this.f6438b.proceed((PrivateKey) obj, (X509Certificate[]) obj2);
                    return;
                }
            }
            this.f6438b.ignore();
        }
    }

    C1321B(MainActivity mainActivity) {
        this.f6410j = false;
        this.f6416p = false;
        this.f6401a = mainActivity;
        if (this.f6401a.m6915W1() != null) {
            this.f6401a.m6915W1().m6680k(this);
        }
        C2287a c2287aM10903f = C2287a.m10903f(this.f6401a);
        if (c2287aM10903f.f10493O != null) {
            this.f6402b = "median_profile_picker.parseJson(eval(" + AbstractC2296j.m10969f(c2287aM10903f.f10493O) + "))";
            this.f6403c = "gonative_profile_picker.parseJson(eval(" + AbstractC2296j.m10969f(c2287aM10903f.f10493O) + "))";
        }
        if (this.f6401a.getIntent().getBooleanExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", false)) {
            this.f6410j = true;
        }
        this.f6411k = c2287aM10903f.f10499R;
        this.f6414n = ((GoNativeApplication) this.f6401a.getApplication()).m6769d();
        this.f6415o = ((GoNativeApplication) this.f6401a.getApplication()).m6770e();
        this.f6416p = ((GoNativeApplication) this.f6401a.getApplication()).m6776k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m6682A(String str) {
        if (!Boolean.parseBoolean(str)) {
            Log.d(f6400r, "Custom CSS Injection Failed");
        } else {
            this.f6413m = true;
            Log.d(f6400r, "Custom CSS Injection Success");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m6683B(WebChromeClient.FileChooserParams fileChooserParams, C2152F c2152f, String[] strArr, int[] iArr) {
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str = strArr[i3];
            int i4 = iArr[i3];
            if (Objects.equals(str, "android.permission.CAMERA")) {
                if (i4 == -1) {
                    if (fileChooserParams.isCaptureEnabled()) {
                        Toast.makeText(this.f6401a, R.string.upload_camera_permission_denied, 0).show();
                        m6723m();
                        return;
                    }
                    c2152f.m10642p(false);
                } else if (i4 == 0) {
                    c2152f.m10642p(true);
                }
            }
            if (Objects.equals(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (i4 == -1) {
                    c2152f.m10641o(false);
                } else if (i4 == 0) {
                    c2152f.m10641o(true);
                }
            }
            this.f6401a.m6926f3(this);
            this.f6401a.m6893I1().m6590a(c2152f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m6684C() {
        this.f6401a.m6948u3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m6685D(C2287a c2287a, String str) {
        float f3 = Float.parseFloat(str);
        this.f6401a.m6927g3(f3);
        if (this.f6401a.m6887E1() < 0.0f) {
            this.f6401a.m6932j3(f3);
        }
        this.f6401a.m6924e3(c2287a.f10501S);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m6686E(ClientCertRequest clientCertRequest, String str) {
        if (str == null) {
            clientCertRequest.ignore();
        } else {
            new k(this.f6401a, clientCertRequest).execute(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m6687F(String str) {
        this.f6401a.m6943p3(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m6688G() {
        this.f6401a.m6951w3();
    }

    /* JADX INFO: renamed from: Q */
    private void m6689Q(String str) {
        Map mapM10674b = AbstractC2181U.m10674b(this.f6401a);
        mapM10674b.put("isFirstLaunch", Boolean.valueOf(this.f6416p));
        this.f6401a.mo6920a(AbstractC2296j.m10965b(str, new JSONObject(mapM10674b)));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m6694e(InterfaceC2294h interfaceC2294h) {
        interfaceC2294h.stopLoading();
        interfaceC2294h.mo7079b("file:///android_asset/offline.html");
    }

    /* JADX INFO: renamed from: o */
    private String m6702o() {
        return "(function() {var parent = document.getElementsByTagName('head').item(0);var style = document.createElement('style');style.type = 'text/css';style.id = 'median-custom-css';style.innerHTML = window.atob('" + this.f6414n + "');parent.appendChild(style);return document.getElementById('median-custom-css') !== null;})()";
    }

    /* JADX INFO: renamed from: p */
    private void m6703p(Message message, boolean z2) {
        this.f6401a.m6897L1().m6778p(message);
        Intent intent = new Intent(this.f6401a.getBaseContext(), (Class<?>) MainActivity.class);
        intent.putExtra("isRoot", false);
        intent.putExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", true);
        if (z2) {
            intent.putExtra("ignoreInterceptMaxWindows", true);
        }
        this.f6401a.startActivityForResult(intent, 400);
    }

    /* JADX INFO: renamed from: u */
    private void m6704u() {
        if (TextUtils.isEmpty(this.f6414n) || this.f6413m) {
            return;
        }
        try {
            this.f6401a.m6922a3(m6702o(), new ValueCallback() { // from class: m0.l1
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    this.f10328a.m6682A((String) obj);
                }
            });
        } catch (Exception e3) {
            C2292f.m10956b().m10960f(f6400r, "Error injecting customCSS via javascript", e3);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m6705v(String str) {
        if (AbstractC2296j.m10964a(str, this.f6401a)) {
            try {
                if (this.f6405e == null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AbstractC2172P.m10665b(new BufferedInputStream(this.f6401a.getAssets().open("GoNativeJSBridgeLibrary.js")), byteArrayOutputStream);
                    this.f6405e = byteArrayOutputStream.toString();
                }
                this.f6401a.mo6920a(this.f6405e);
                this.f6401a.m6897L1().f6483l.m10936i(this.f6401a);
                this.f6401a.mo6920a(AbstractC2296j.m10965b("median_library_ready", null));
                this.f6401a.mo6920a(AbstractC2296j.m10965b("gonative_library_ready", null));
                Log.d(f6400r, "GoNative JSBridgeLibrary Injection Success");
            } catch (Exception e3) {
                Log.d(f6400r, "GoNative JSBridgeLibrary Injection Error:- " + e3.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private void m6706w() {
        if (TextUtils.isEmpty(this.f6415o)) {
            return;
        }
        try {
            this.f6401a.mo6920a("javascript:(function() {var parent = document.getElementsByTagName('head').item(0);var script = document.createElement('script');script.type = 'text/javascript';script.innerHTML = window.atob('" + this.f6415o + "');parent.appendChild(script)})()");
            Log.d(f6400r, "Custom JS Injection Success");
        } catch (Exception e3) {
            C2292f.m10956b().m10960f(f6400r, "Error injecting customJS via javascript", e3);
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m6707y(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https"))) {
            C2287a c2287aM10903f = C2287a.m10903f(this.f6401a);
            C2297k c2297k = c2287aM10903f.f10548k0;
            String string = uri.toString();
            if (!c2297k.m10975b()) {
                return c2297k.m10974a(string).equals("internal");
            }
            String host = uri.getHost();
            String str = c2287aM10903f.f10497Q;
            if (AbstractC2244r.m10824e(this.f6401a, uri.toString())) {
                return true;
            }
            if (host != null) {
                if (!host.equals(str)) {
                    if (host.endsWith("." + str)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    private boolean m6708z(String str) {
        int i3;
        if (str != null && str.startsWith("data:image/")) {
            try {
                byte[] bArrDecode = Base64.decode(str.substring(str.indexOf(",") + 1).trim(), 0);
                if (bArrDecode.length < 10) {
                    return false;
                }
                if (str.startsWith("data:image/gif")) {
                    String str2 = new String(bArrDecode, 0, 6, "US-ASCII");
                    if (str2.equals("GIF87a") || str2.equals("GIF89a")) {
                        return ((bArrDecode[6] & 255) | ((bArrDecode[7] & 255) << 8)) == 1 && (((bArrDecode[9] & 255) << 8) | (bArrDecode[8] & 255)) == 1;
                    }
                    return false;
                }
                if (str.startsWith("data:image/png")) {
                    if (bArrDecode.length < 24) {
                        return false;
                    }
                    return (((((bArrDecode[16] & 255) << 24) | ((bArrDecode[17] & 255) << 16)) | ((bArrDecode[18] & 255) << 8)) | (bArrDecode[19] & 255)) == 1 && (((((bArrDecode[21] & 255) << 16) | ((bArrDecode[20] & 255) << 24)) | ((bArrDecode[22] & 255) << 8)) | (bArrDecode[23] & 255)) == 1;
                }
                if (str.startsWith("data:image/jpeg")) {
                    for (2; i3 < bArrDecode.length && (bArrDecode[i3] & 255) == 255; i3 + (((bArrDecode[i3 + 2] & 255) << 8) | (bArrDecode[i3 + 3] & 255)) + 2) {
                        int i4 = bArrDecode[i3 + 1] & 255;
                        i3 = (i4 == 192 || i4 == 194) ? 2 : i3 + (((bArrDecode[i3 + 2] & 255) << 8) | (bArrDecode[i3 + 3] & 255)) + 2;
                        int i5 = ((bArrDecode[i3 + 5] & 255) << 8) | (bArrDecode[i3 + 6] & 255);
                        if (((bArrDecode[i3 + 8] & 255) | ((bArrDecode[i3 + 7] & 255) << 8)) == 1 && i5 == 1) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public void m6709H(ValueCallback valueCallback, final WebChromeClient.FileChooserParams fileChooserParams) {
        this.f6417q = valueCallback;
        final C2152F c2152f = new C2152F(fileChooserParams);
        if (!fileChooserParams.isCaptureEnabled() && !c2152f.m10634h()) {
            this.f6401a.m6926f3(this);
            this.f6401a.m6893I1().m6590a(c2152f);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (AbstractC2298l.m10977b(this.f6401a, "android.permission.CAMERA")) {
            c2152f.m10642p(true);
        } else {
            arrayList.add("android.permission.CAMERA");
        }
        boolean zM10615r = C2142A.m10615r();
        boolean zM10976a = AbstractC2298l.m10976a(this.f6401a, "android.permission.WRITE_EXTERNAL_STORAGE");
        boolean zM11185a = C2287a.m10903f(this.f6401a).f10510W0.m11185a();
        if (zM10615r) {
            c2152f.m10641o(true);
        } else if (zM10976a && zM11185a) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            c2152f.m10641o(false);
        }
        if (!arrayList.isEmpty()) {
            this.f6401a.m6906R1((String[]) arrayList.toArray(new String[0]), new MainActivity.InterfaceC1338j() { // from class: m0.n1
                @Override // co.median.android.MainActivity.InterfaceC1338j
                /* JADX INFO: renamed from: a */
                public final void mo6964a(String[] strArr, int[] iArr) {
                    this.f10337a.m6683B(fileChooserParams, c2152f, strArr, iArr);
                }
            });
        } else {
            this.f6401a.m6926f3(this);
            this.f6401a.m6893I1().m6590a(c2152f);
        }
    }

    /* JADX INFO: renamed from: I */
    protected void m6710I() {
        this.f6407g.removeCallbacksAndMessages(null);
        this.f6408h = EnumC1327E.STATE_DONE;
    }

    /* JADX INFO: renamed from: J */
    public void m6711J(InterfaceC2294h interfaceC2294h, Message message, Message message2) {
        message2.sendToTarget();
    }

    /* JADX INFO: renamed from: K */
    public void m6712K(String str) {
        if (this.f6412l.equals(str)) {
            return;
        }
        m6704u();
    }

    /* JADX INFO: renamed from: L */
    public void m6713L(InterfaceC2294h interfaceC2294h, String str) {
        List list;
        if (this.f6412l.equals(str)) {
            this.f6412l = "";
            return;
        }
        if (this.f6401a.m6915W1() != null) {
            this.f6401a.m6915W1().m6677g();
        }
        Log.d(f6400r, "onpagefinished " + str);
        this.f6408h = EnumC1327E.STATE_DONE;
        m6718R(str);
        final C2287a c2287aM10903f = C2287a.m10903f(this.f6401a);
        if (str != null && (list = c2287aM10903f.f10569r0) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Pattern) it.next()).matcher(str).matches()) {
                    return;
                }
            }
        }
        m6704u();
        m6706w();
        this.f6401a.m6941o3();
        this.f6401a.runOnUiThread(new Runnable() { // from class: m0.i1
            @Override // java.lang.Runnable
            public final void run() {
                this.f10321d.m6684C();
            }
        });
        C2210f1.m10771a().m10775d(str);
        if (m6707y(Uri.parse(str))) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new g());
        }
        if (c2287aM10903f.f10556n) {
            m6705v(this.f6404d);
        }
        if (c2287aM10903f.f10465A != null) {
            if (this.f6409i) {
                this.f6401a.m6886D3();
            }
            this.f6409i = AbstractC2296j.m10973j(str, c2287aM10903f.f10469C) || AbstractC2296j.m10973j(str, c2287aM10903f.f10467B);
        }
        String str2 = c2287aM10903f.f10495P;
        if (str2 != null) {
            interfaceC2294h.mo7078a(str2);
        }
        String str3 = this.f6402b;
        if (str3 != null) {
            interfaceC2294h.mo7078a(str3);
        }
        String str4 = this.f6403c;
        if (str4 != null) {
            interfaceC2294h.mo7078a(str4);
        }
        this.f6401a.m6942p1(str);
        MainActivity mainActivity = this.f6401a;
        String str5 = mainActivity.f6526g0;
        if (str5 != null) {
            mainActivity.f6526g0 = null;
            mainActivity.mo6920a(str5);
        }
        this.f6401a.m6897L1().m6773h().m10809n(this.f6401a);
        String str6 = this.f6404d;
        boolean zM10964a = str6 != null ? AbstractC2296j.m10964a(str6, this.f6401a) : true;
        if (zM10964a) {
            m6689Q("median_device_info");
            m6689Q("gonative_device_info");
        }
        this.f6401a.m6897L1().f6483l.m10950w(this.f6401a, zM10964a);
        this.f6401a.m6916X1().evaluateJavascript("window.devicePixelRatio", new ValueCallback() { // from class: m0.j1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f10322a.m6685D(c2287aM10903f, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m6714M(String str) {
        this.f6401a.m6932j3(-1.0f);
        try {
            if (this.f6401a.m6901O1().m7085j(str)) {
                return;
            }
        } catch (Exception unused) {
        }
        if (this.f6401a.m6915W1() != null) {
            this.f6401a.m6915W1().m6678h();
        }
        this.f6408h = EnumC1327E.STATE_PAGE_STARTED;
        this.f6407g.removeCallbacksAndMessages(null);
        this.f6406f.m10657c(str);
        C2210f1.m10771a().m10775d(str);
        Uri uri = Uri.parse(str);
        if (C2287a.m10903f(this.f6401a).f10465A != null && m6707y(uri)) {
            this.f6401a.m6886D3();
        }
        this.f6401a.m6952x3();
        this.f6401a.m6944q1(str);
        this.f6401a.m6897L1().m6773h().m10810o();
        if ("file:///android_asset/offline.html".equals(str)) {
            this.f6401a.m6953y1();
        } else {
            this.f6401a.m6917X2();
        }
        this.f6413m = false;
    }

    /* JADX INFO: renamed from: N */
    public void m6715N(String str, final ClientCertRequest clientCertRequest) {
        Uri.parse(str);
        KeyChain.choosePrivateKeyAlias(this.f6401a, new KeyChainAliasCallback() { // from class: m0.k1
            @Override // android.security.KeyChainAliasCallback
            public final void alias(String str2) {
                this.f10325a.m6686E(clientCertRequest, str2);
            }
        }, clientCertRequest.getKeyTypes(), clientCertRequest.getPrincipals(), clientCertRequest.getHost(), clientCertRequest.getPort(), null);
    }

    /* JADX INFO: renamed from: O */
    public void m6716O(final InterfaceC2294h interfaceC2294h, int i3, String str, String str2) {
        EnumC1327E enumC1327E;
        if (str != null && str.contains("net::ERR_CACHE_MISS")) {
            this.f6401a.runOnUiThread(new h(interfaceC2294h));
            return;
        }
        if (!C2287a.m10903f(this.f6401a).f10563p0 || (!((enumC1327E = this.f6408h) == EnumC1327E.STATE_PAGE_STARTED || enumC1327E == EnumC1327E.STATE_START_LOAD) || (!this.f6401a.m6929i2() && (i3 != -2 || str2 == null || interfaceC2294h.getUrl() == null || !str2.equals(interfaceC2294h.getUrl()))))) {
            this.f6401a.runOnUiThread(new i());
        } else {
            this.f6401a.runOnUiThread(new Runnable() { // from class: m0.m1
                @Override // java.lang.Runnable
                public final void run() {
                    C1321B.m6694e(interfaceC2294h);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6717P(android.net.http.SslError r5, java.lang.String r6) {
        /*
            r4 = this;
            int r0 = r5.getPrimaryError()
            r1 = 1
            if (r0 == 0) goto L1a
            if (r0 == r1) goto L16
            r2 = 2
            if (r0 == r2) goto L1a
            r2 = 3
            if (r0 == r2) goto L1a
            r2 = 4
            if (r0 == r2) goto L1a
            r0 = 2131886326(0x7f1200f6, float:1.9407228E38)
            goto L1d
        L16:
            r0 = 2131886325(0x7f1200f5, float:1.9407226E38)
            goto L1d
        L1a:
            r0 = 2131886324(0x7f1200f4, float:1.9407224E38)
        L1d:
            co.median.android.MainActivity r2 = r4.f6401a
            o0.a r2 = p135o0.C2287a.m10903f(r2)
            boolean r2 = r2.f10489M
            if (r2 == 0) goto L30
            co.median.android.MainActivity r2 = r4.f6401a
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r0, r1)
            r2.show()
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            co.median.android.MainActivity r3 = r4.f6401a
            java.lang.String r0 = r3.getString(r0)
            r2.append(r0)
            java.lang.String r0 = " - Error url: "
            r2.append(r0)
            java.lang.String r5 = r5.getUrl()
            r2.append(r5)
            java.lang.String r5 = " - Source page: "
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            o0.f r6 = p135o0.C2292f.m10956b()
            java.lang.String r0 = co.median.android.C1321B.f6400r
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r5)
            r6.m10961g(r0, r5, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.median.android.C1321B.m6717P(android.net.http.SslError, java.lang.String):void");
    }

    /* JADX INFO: renamed from: R */
    public void m6718R(String str) {
        this.f6404d = str;
        this.f6401a.m6897L1().f6483l.m10928B(str);
    }

    /* JADX INFO: renamed from: S */
    public boolean m6719S(InterfaceC2294h interfaceC2294h, String str) {
        return m6720T(interfaceC2294h, str, false, false);
    }

    /* JADX INFO: renamed from: T */
    public boolean m6720T(InterfaceC2294h interfaceC2294h, String str, boolean z2, boolean z3) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("data:") && m6708z(str)) {
            Log.d(f6400r, "shouldOverrideUrlLoading: Detected 1x1 pixel tracking image. Allowing WebView to load. URL: " + str);
            return false;
        }
        if (m6721U(interfaceC2294h, str, false)) {
            if (this.f6410j) {
                this.f6401a.finish();
            }
            if (!z3) {
                return true;
            }
            this.f6412l = str;
            this.f6408h = EnumC1327E.STATE_DONE;
            this.f6407g.removeCallbacksAndMessages(null);
            this.f6401a.m6948u3();
            return true;
        }
        this.f6410j = false;
        this.f6406f.m10657c(str);
        this.f6401a.m6923d2();
        this.f6408h = EnumC1327E.STATE_START_LOAD;
        if (!Double.isNaN(this.f6411k) && !Double.isInfinite(this.f6411k) && this.f6411k > 0.0d) {
            this.f6407g.postDelayed(new f(interfaceC2294h), (long) (this.f6411k * 1000.0d));
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public boolean m6721U(InterfaceC2294h interfaceC2294h, final String str, boolean z2) {
        String str2;
        if (str == null || str.startsWith("file:///android_asset/") || str.startsWith("blob:")) {
            return false;
        }
        interfaceC2294h.setCheckLoginSignup(true);
        Uri uri = Uri.parse(str);
        if (uri.getScheme() != null && uri.getScheme().equals("gonative-bridge")) {
            if (z2) {
                return true;
            }
            try {
                JSONArray jSONArray = new JSONArray(uri.getQueryParameter("json"));
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("command");
                        if (!strOptString.isEmpty()) {
                            if (strOptString.equals("pop")) {
                                if (this.f6401a.m6937m2()) {
                                    this.f6401a.finish();
                                }
                            } else if (strOptString.equals("clearPools")) {
                                this.f6401a.m6897L1().m6773h().m10807l();
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        }
        C2287a c2287aM10903f = C2287a.m10903f(this.f6401a);
        if (("median".equals(uri.getScheme()) || "gonative".equals(uri.getScheme())) && (str2 = this.f6404d) != null && !AbstractC2296j.m10964a(str2, this.f6401a)) {
            C2292f.m10956b().m10959e(f6400r, "URL not authorized for native bridge: " + this.f6404d);
            return true;
        }
        if ("median".equals(uri.getScheme()) || "gonative".equals(uri.getScheme())) {
            this.f6401a.m6897L1().f6483l.m10934g(this.f6401a, uri);
            return true;
        }
        if (c2287aM10903f.m10918h() != null) {
            String str3 = (String) c2287aM10903f.m10918h().get(str);
            if (str3 == null) {
                str3 = (String) c2287aM10903f.m10918h().get("*");
            }
            if (str3 != null && !str3.equals(str)) {
                if (z2) {
                    return true;
                }
                this.f6401a.runOnUiThread(new b(str3));
                return true;
            }
        }
        Intent uri2 = null;
        if (!m6707y(uri)) {
            if (z2) {
                return true;
            }
            if (c2287aM10903f.f10548k0.m10974a(uri.toString()).equals("appbrowser")) {
                this.f6401a.m6909S2(uri);
            } else {
                Log.d(f6400r, "processing dynamic link: " + uri);
                try {
                    try {
                        if ("intent".equals(uri.getScheme())) {
                            uri2 = Intent.parseUri(uri.toString(), 1);
                            this.f6401a.startActivity(uri2);
                        } else if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) {
                            this.f6401a.m6911T2(uri);
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW", uri);
                            try {
                                this.f6401a.startActivity(intent);
                            } catch (ActivityNotFoundException e3) {
                                uri2 = intent;
                                e = e3;
                                if (uri2 != null) {
                                    String stringExtra = uri2.getStringExtra("browser_fallback_url");
                                    if (TextUtils.isEmpty(stringExtra)) {
                                        Toast.makeText(this.f6401a, R.string.app_not_installed, 1).show();
                                        C2292f.m10956b().m10961g(f6400r, this.f6401a.getString(R.string.app_not_installed), e, 1);
                                    } else {
                                        this.f6401a.m6900N2(stringExtra);
                                    }
                                }
                            }
                        }
                    } catch (URISyntaxException e4) {
                        C2292f.m10956b().m10960f(f6400r, e4.getMessage(), e4);
                    }
                } catch (ActivityNotFoundException e5) {
                    e = e5;
                }
            }
            if ("app_links".equals(this.f6401a.m6899N1()) && m6727s() == null) {
                this.f6401a.m6900N2(c2287aM10903f.m10916e());
            }
            return true;
        }
        if (!this.f6401a.m6938n2()) {
            this.f6401a.m6928h3(-1.0f);
            this.f6401a.m6934l3(false);
        }
        if (c2287aM10903f.f10537g1) {
            C1360r c1360rM6898M1 = this.f6401a.m6898M1();
            if (c1360rM6898M1.m7056h(this.f6401a.m6884C1())) {
                c1360rM6898M1.m7062n(this.f6401a.m6884C1(), false);
            } else if (c2287aM10903f.f10534f1 > 0 && c1360rM6898M1.m7055g() > 1 && c1360rM6898M1.m7055g() >= c2287aM10903f.f10534f1 && this.f6401a.m6907R2(str)) {
                return true;
            }
        }
        int iM6913V1 = this.f6401a.m6913V1();
        int iM6896K3 = this.f6401a.m6896K3(str);
        if (iM6913V1 >= 0 && iM6896K3 >= 0) {
            if (iM6896K3 > iM6913V1) {
                if (z2) {
                    return true;
                }
                Intent intent2 = new Intent(this.f6401a.getBaseContext(), (Class<?>) MainActivity.class);
                intent2.putExtra("isRoot", false);
                intent2.putExtra(ImagesContract.URL, str);
                intent2.putExtra("parentUrlLevel", iM6913V1);
                intent2.putExtra("postLoadJavascript", this.f6401a.f6526g0);
                if (c2287aM10903f.f10537g1) {
                    intent2.putExtra("ignoreInterceptMaxWindows", true);
                }
                this.f6401a.startActivityForResult(intent2, 400);
                MainActivity mainActivity = this.f6401a;
                mainActivity.f6526g0 = null;
                mainActivity.f6527h0 = null;
                return true;
            }
            if (iM6896K3 < iM6913V1 && iM6896K3 <= this.f6401a.m6905Q1()) {
                if (z2) {
                    return true;
                }
                Intent intent3 = new Intent();
                intent3.putExtra(ImagesContract.URL, str);
                intent3.putExtra("urlLevel", iM6896K3);
                intent3.putExtra("postLoadJavascript", this.f6401a.f6526g0);
                this.f6401a.setResult(-1, intent3);
                this.f6401a.finish();
                return true;
            }
        }
        if (iM6896K3 >= 0) {
            this.f6401a.m6939n3(iM6896K3);
        }
        if (!z2) {
            this.f6401a.runOnUiThread(new Runnable() { // from class: m0.g1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10318d.m6687F(str);
                }
            });
        }
        C2237o1 c2237o1M6773h = this.f6401a.m6897L1().m6773h();
        Pair pairM10811s = c2237o1M6773h.m10811s(str);
        InterfaceC2294h interfaceC2294h2 = (InterfaceC2294h) pairM10811s.first;
        EnumC2240p1 enumC2240p1 = (EnumC2240p1) pairM10811s.second;
        if (z2 && interfaceC2294h2 != null) {
            return true;
        }
        if (interfaceC2294h2 != null && enumC2240p1 == EnumC2240p1.Always) {
            this.f6401a.runOnUiThread(new c(interfaceC2294h2, str));
            c2237o1M6773h.m10806k(interfaceC2294h2);
            c2237o1M6773h.m10809n(this.f6401a);
            return true;
        }
        if (interfaceC2294h2 != null && enumC2240p1 == EnumC2240p1.Never) {
            this.f6401a.runOnUiThread(new d(interfaceC2294h2, str));
            return true;
        }
        if (interfaceC2294h2 != null && enumC2240p1 == EnumC2240p1.Reload && !AbstractC2296j.m10973j(str, this.f6404d)) {
            this.f6401a.runOnUiThread(new e(interfaceC2294h2, str));
            return true;
        }
        if (this.f6401a.f6498G) {
            c2237o1M6773h.m10806k(interfaceC2294h);
            this.f6401a.f6498G = false;
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public void m6722V() {
        this.f6401a.runOnUiThread(new Runnable() { // from class: m0.h1
            @Override // java.lang.Runnable
            public final void run() {
                this.f10320d.m6688G();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m6723m() {
        ValueCallback valueCallback = this.f6417q;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
            this.f6417q = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m6724n() {
        Handler handler = this.f6407g;
        if (handler != null || this.f6408h == EnumC1327E.STATE_START_LOAD) {
            handler.removeCallbacksAndMessages(null);
            m6722V();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6725q(WebView webView, Message message) {
        C2287a c2287aM10903f = C2287a.m10903f(this.f6401a);
        if (!c2287aM10903f.f10537g1 || c2287aM10903f.f10534f1 <= 0 || this.f6401a.m6898M1().m7055g() < c2287aM10903f.f10534f1) {
            m6703p(message, c2287aM10903f.f10537g1);
            return;
        }
        WebView webView2 = new WebView(webView.getContext());
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        webView2.setWebViewClient(new a());
    }

    /* JADX INFO: renamed from: r */
    public void m6726r(InterfaceC2294h interfaceC2294h, String str, boolean z2) {
        if (this.f6401a.m6915W1() != null) {
            this.f6401a.m6915W1().m6679i(str);
        }
        if (this.f6408h == EnumC1327E.STATE_START_LOAD) {
            this.f6408h = EnumC1327E.STATE_PAGE_STARTED;
            this.f6407g.removeCallbacksAndMessages(null);
        }
        if (z2 || str.equals("file:///android_asset/offline.html")) {
            return;
        }
        this.f6401a.m6933l1(str);
    }

    /* JADX INFO: renamed from: s */
    public String m6727s() {
        return this.f6404d;
    }

    /* JADX INFO: renamed from: t */
    public void m6728t(C2154G c2154g) {
        if (!c2154g.m10645c()) {
            m6723m();
            return;
        }
        if (c2154g.m10644b()) {
            Uri[] uriArrM10643a = c2154g.m10643a();
            Objects.requireNonNull(uriArrM10643a);
            C2171O0.m10659b(this.f6401a, uriArrM10643a[0], new j());
            return;
        }
        ValueCallback valueCallback = this.f6417q;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(c2154g.m10643a());
            this.f6417q = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public WebResourceResponse m6729x(C1361s c1361s, String str) {
        return this.f6406f.m10656b(this.f6401a, c1361s, str, this.f6404d);
    }
}
