package p135o0;

import android.os.Bundle;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: renamed from: o0.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2294h {
    /* JADX INFO: renamed from: a */
    void mo7078a(String str);

    /* JADX INFO: renamed from: b */
    void mo7079b(String str);

    /* JADX INFO: renamed from: c */
    void mo7080c(Bundle bundle);

    boolean canGoBack();

    boolean canGoForward();

    void clearCache(boolean z2);

    void clearFocus();

    /* JADX INFO: renamed from: d */
    boolean mo7081d();

    void destroy();

    /* JADX INFO: renamed from: e */
    void mo7082e(Bundle bundle);

    void evaluateJavascript(String str, ValueCallback valueCallback);

    /* JADX INFO: renamed from: f */
    void mo7083f(String str, ValueCallback valueCallback);

    String getDefaultUserAgent();

    WebView.HitTestResult getHitTestResult();

    int getMaxHorizontalScroll();

    ViewParent getParent();

    int getProgress();

    int getScrollX();

    WebSettings getSettings();

    String getTitle();

    String getUrl();

    int getWebViewScrollX();

    int getWebViewScrollY();

    int getWidth();

    void goBack();

    void goForward();

    void loadUrl(String str);

    void onPause();

    void onResume();

    void reload();

    void scrollTo(int i3, int i4);

    void setCheckLoginSignup(boolean z2);

    void stopLoading();
}
