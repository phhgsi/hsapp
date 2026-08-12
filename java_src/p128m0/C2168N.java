package p128m0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ClientCertRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import co.median.android.AbstractC1323D;
import co.median.android.C1321B;
import co.median.android.C1361s;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.Objects;
import p135o0.InterfaceC2294h;

/* JADX INFO: renamed from: m0.N */
/* JADX INFO: loaded from: classes.dex */
public class C2168N extends WebViewClient {

    /* JADX INFO: renamed from: a */
    private final C1321B f9993a;

    /* JADX INFO: renamed from: b */
    private final MainActivity f9994b;

    /* JADX INFO: renamed from: c */
    private boolean f9995c = false;

    public C2168N(MainActivity mainActivity, C1321B c1321b) {
        this.f9993a = c1321b;
        this.f9994b = mainActivity;
    }

    /* JADX INFO: renamed from: c */
    private WebResourceResponse m10649c(final WebResourceRequest webResourceRequest) {
        if (this.f9995c || !this.f9994b.m6937m2() || !this.f9994b.m6931j2()) {
            return null;
        }
        this.f9995c = true;
        if (Objects.equals(AbstractC1323D.f6441b, webResourceRequest.getRequestHeaders().get("User-Agent"))) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        webResourceResponse.setStatusCodeAndReasonPhrase(204, "No Content");
        final Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        requestHeaders.put("User-Agent", AbstractC1323D.f6441b);
        this.f9994b.runOnUiThread(new Runnable() { // from class: m0.L
            @Override // java.lang.Runnable
            public final void run() {
                this.f9983d.m10650d(webResourceRequest, requestHeaders);
            }
        });
        return webResourceResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m10650d(WebResourceRequest webResourceRequest, Map map) {
        this.f9994b.m6902O2(webResourceRequest.getUrl().toString(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m10651e(String str) {
        this.f9994b.m6912U2(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        this.f9993a.m6726r((InterfaceC2294h) webView, str, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public boolean m10652f(WebView webView, String str, boolean z2) {
        return this.f9993a.m6720T((InterfaceC2294h) webView, str, z2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f9993a.m6711J((InterfaceC2294h) webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        this.f9993a.m6712K(str);
        super.onPageCommitVisible(webView, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f9993a.m6713L((InterfaceC2294h) webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f9993a.m6714M(str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f9993a.m6715N(webView.getUrl(), clientCertRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i3, String str, String str2) {
        this.f9993a.m6716O((InterfaceC2294h) webView, i3, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
        this.f9993a.m6717P(sslError, webView.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        final String url;
        if (webView != null) {
            url = webView.getUrl();
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.destroy();
        } else {
            url = null;
        }
        this.f9994b.runOnUiThread(new Runnable() { // from class: m0.M
            @Override // java.lang.Runnable
            public final void run() {
                this.f9989d.m10651e(url);
            }
        });
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f3, float f4) {
        super.onScaleChanged(webView, f3, f4);
        this.f9994b.m6932j3(f4);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f9993a.m6729x((C1361s) webView, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f9993a.m6719S((InterfaceC2294h) webView, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f9993a.m6716O((InterfaceC2294h) webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        WebResourceResponse webResourceResponseM10649c = m10649c(webResourceRequest);
        if (webResourceResponseM10649c != null) {
            return webResourceResponseM10649c;
        }
        WebResourceResponse webResourceResponseM10937j = ((GoNativeApplication) this.f9994b.getApplicationContext()).f6483l.m10937j(this.f9994b, webResourceRequest);
        if (webResourceResponseM10937j != null) {
            return webResourceResponseM10937j;
        }
        String method = webResourceRequest.getMethod();
        if (method == null || !method.equalsIgnoreCase("GET") || (url = webResourceRequest.getUrl()) == null || !url.getScheme().startsWith("http")) {
            return null;
        }
        return shouldInterceptRequest(webView, url.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 24) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return this.f9993a.m6720T((InterfaceC2294h) webView, webResourceRequest.getUrl().toString(), false, webResourceRequest.isRedirect());
    }
}
