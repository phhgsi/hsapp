package p128m0;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import co.median.android.C1361s;
import p128m0.C2237o1;
import p135o0.InterfaceC2294h;

/* JADX INFO: renamed from: m0.T0 */
/* JADX INFO: loaded from: classes.dex */
public class C2180T0 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    private C2237o1.d f10038a;

    /* JADX INFO: renamed from: b */
    private final Activity f10039b;

    /* JADX INFO: renamed from: m0.T0$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ WebView f10040d;

        a(WebView webView) {
            this.f10040d = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10040d.setWebViewClient(null);
        }
    }

    public C2180T0(Activity activity, C2237o1.d dVar, C1361s c1361s) {
        this.f10039b = activity;
        this.f10038a = dVar;
        c1361s.setWebViewClient(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        new Handler(webView.getContext().getMainLooper()).post(new a(webView));
        this.f10038a.m10813b(this.f10039b, (InterfaceC2294h) webView, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f10038a.m10812a(this.f10039b, (InterfaceC2294h) webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String method = webResourceRequest.getMethod();
        if (method == null || !method.equalsIgnoreCase("GET") || (url = webResourceRequest.getUrl()) == null || !url.getScheme().startsWith("http")) {
            return null;
        }
        return shouldInterceptRequest(webView, url.toString());
    }
}
