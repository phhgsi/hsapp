package co.median.android;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import co.median.android.C1322C;
import p128m0.AbstractC2181U;
import p128m0.C2168N;
import p135o0.C2287a;
import p135o0.C2292f;
import p135o0.InterfaceC2294h;

/* JADX INFO: renamed from: co.median.android.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1323D {

    /* JADX INFO: renamed from: a */
    private static final String f6440a = "co.median.android.D";

    /* JADX INFO: renamed from: b */
    public static String f6441b = "";

    /* JADX INFO: renamed from: a */
    public static void m6734a(C1361s c1361s) {
        c1361s.setWebViewClient(null);
        c1361s.setWebChromeClient(null);
    }

    /* JADX INFO: renamed from: b */
    public static void m6735b(InterfaceC2294h interfaceC2294h, Context context) {
        if (!(interfaceC2294h instanceof C1361s)) {
            C2292f.m10956b().m10959e(f6440a, "Expected webview to be of class LeanWebView and not " + interfaceC2294h.getClass().getName());
            return;
        }
        C2287a c2287aM10903f = C2287a.m10903f(context);
        C1361s c1361s = (C1361s) interfaceC2294h;
        WebSettings settings = c1361s.getSettings();
        if (C2287a.m10903f(context).f10568r) {
            settings.setBuiltInZoomControls(true);
        } else {
            settings.setBuiltInZoomControls(false);
        }
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMinimumFontSize(1);
        settings.setMinimumLogicalFontSize(1);
        settings.setMixedContentMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(c1361s, true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(c2287aM10903f.f10572t.m10924b());
        settings.setDatabaseEnabled(true);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        if (TextUtils.isEmpty(f6441b)) {
            if (!TextUtils.isEmpty(c2287aM10903f.f10584z)) {
                f6441b = c2287aM10903f.f10584z;
            } else if (TextUtils.isEmpty(c2287aM10903f.f10547k)) {
                f6441b = interfaceC2294h.getDefaultUserAgent();
            } else {
                f6441b = interfaceC2294h.getDefaultUserAgent() + " " + c2287aM10903f.f10547k;
            }
        }
        settings.setUserAgentString(f6441b);
        if (c2287aM10903f.f10534f1 == 1) {
            settings.setSupportMultipleWindows(false);
        } else {
            settings.setSupportMultipleWindows(c2287aM10903f.f10541i);
        }
        settings.setGeolocationEnabled(c2287aM10903f.f10508V0.m11197d());
        settings.setMediaPlaybackRequiresUserGesture(false);
        int i3 = c2287aM10903f.f10574u;
        if (i3 > 0) {
            settings.setTextZoom(i3);
        }
        if (c2287aM10903f.f10570s) {
            c1361s.setOverScrollMode(2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c1361s.setLayerType(2, null);
        } else {
            c1361s.setLayerType(1, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6736c(InterfaceC2294h interfaceC2294h, final MainActivity mainActivity) {
        Message messageM6774i;
        WebView.WebViewTransport webViewTransport;
        if (!(interfaceC2294h instanceof C1361s)) {
            C2292f.m10956b().m10959e(f6440a, "Expected webview to be of class LeanWebView and not " + interfaceC2294h.getClass().getName());
            return;
        }
        C1361s c1361s = (C1361s) interfaceC2294h;
        m6735b(c1361s, mainActivity);
        C1321B c1321b = new C1321B(mainActivity);
        c1321b.m6718R(interfaceC2294h.getUrl());
        c1361s.setWebChromeClient(new C1359q(mainActivity, c1321b));
        c1361s.setWebViewClient(new C2168N(mainActivity, c1321b));
        C1346d c1346dM6891H1 = mainActivity.m6891H1();
        if (c1346dM6891H1 != null) {
            c1361s.setDownloadListener(c1346dM6891H1);
            c1346dM6891H1.m7014E(c1321b);
        }
        c1361s.removeJavascriptInterface("median_status_checker");
        c1361s.addJavascriptInterface(mainActivity.m6908S1(), "median_status_checker");
        c1361s.removeJavascriptInterface("gonative_file_writer_sharer");
        c1361s.addJavascriptInterface(mainActivity.m6894J1().m7036j(), "gonative_file_writer_sharer");
        c1361s.removeJavascriptInterface("JSBridge");
        c1361s.addJavascriptInterface(new C1322C(new C1322C.a() { // from class: m0.q1
            @Override // co.median.android.C1322C.a
            /* JADX INFO: renamed from: a */
            public final void mo6733a(String str) {
                mainActivity.m6921a2(str);
            }
        }), "JSBridge");
        ((GoNativeApplication) mainActivity.getApplication()).f6483l.m10953z(mainActivity, c1361s);
        if (!mainActivity.m6931j2() || (messageM6774i = ((GoNativeApplication) mainActivity.getApplication()).m6774i()) == null || (webViewTransport = (WebView.WebViewTransport) messageM6774i.obj) == null) {
            return;
        }
        webViewTransport.setWebView(c1361s);
        messageM6774i.sendToTarget();
    }

    /* JADX INFO: renamed from: d */
    public static void m6737d(Context context) {
        String str;
        if (C2287a.m10903f(context).f10502S0 || (str = (String) AbstractC2181U.m10674b(context).get("distribution")) == null) {
            return;
        }
        if (str.equals("debug") || str.equals("adhoc")) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }
}
