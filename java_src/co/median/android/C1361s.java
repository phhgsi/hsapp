package co.median.android;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p128m0.C2168N;
import p135o0.InterfaceC2294h;

/* JADX INFO: renamed from: co.median.android.s */
/* JADX INFO: loaded from: classes.dex */
public class C1361s extends WebView implements InterfaceC2294h {

    /* JADX INFO: renamed from: a */
    private final String f6707a;

    /* JADX INFO: renamed from: b */
    private WebViewClient f6708b;

    /* JADX INFO: renamed from: c */
    private WebChromeClient f6709c;

    /* JADX INFO: renamed from: d */
    private boolean f6710d;

    /* JADX INFO: renamed from: e */
    private GestureDetector f6711e;

    /* JADX INFO: renamed from: f */
    private boolean f6712f;

    /* JADX INFO: renamed from: g */
    private String f6713g;

    /* JADX INFO: renamed from: h */
    GestureDetector.SimpleOnGestureListener f6714h;

    /* JADX INFO: renamed from: co.median.android.s$a */
    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
            C1361s.m7076g(C1361s.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
            C1361s.m7076g(C1361s.this);
            return false;
        }
    }

    /* JADX INFO: renamed from: co.median.android.s$b */
    public interface b {
    }

    public C1361s(Context context) {
        super(context);
        this.f6707a = getSettings().getUserAgentString();
        this.f6708b = null;
        this.f6709c = null;
        this.f6710d = true;
        this.f6712f = false;
        this.f6713g = "";
        this.f6714h = new a();
        this.f6711e = new GestureDetector(context, this.f6714h);
    }

    /* JADX INFO: renamed from: g */
    static /* bridge */ /* synthetic */ b m7076g(C1361s c1361s) {
        c1361s.getClass();
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7077h() {
        return false;
    }

    @Override // p135o0.InterfaceC2294h
    /* JADX INFO: renamed from: a */
    public void mo7078a(String str) {
        evaluateJavascript(str, null);
    }

    @Override // p135o0.InterfaceC2294h
    /* JADX INFO: renamed from: b */
    public void mo7079b(String str) {
        super.loadUrl(str);
    }

    @Override // p135o0.InterfaceC2294h
    /* JADX INFO: renamed from: c */
    public void mo7080c(Bundle bundle) {
        saveState(bundle);
    }

    @Override // android.webkit.WebView, p135o0.InterfaceC2294h
    public boolean canGoForward() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + 1);
        return (itemAtIndex == null || !"file:///android_asset/offline.html".equals(itemAtIndex.getUrl())) ? super.canGoForward() : webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + 2) != null;
    }

    @Override // p135o0.InterfaceC2294h
    /* JADX INFO: renamed from: d */
    public boolean mo7081d() {
        WebChromeClient webChromeClient = this.f6709c;
        if (webChromeClient == null || !(webChromeClient instanceof C1359q)) {
            return false;
        }
        return ((C1359q) webChromeClient).m7048j();
    }

    @Override // p135o0.InterfaceC2294h
    /* JADX INFO: renamed from: e */
    public void mo7082e(Bundle bundle) {
        restoreState(bundle);
    }

    @Override // p135o0.InterfaceC2294h
    /* JADX INFO: renamed from: f */
    public void mo7083f(String str, ValueCallback valueCallback) {
        evaluateJavascript(str, valueCallback);
    }

    @Override // p135o0.InterfaceC2294h
    public String getDefaultUserAgent() {
        return this.f6707a;
    }

    @Override // p135o0.InterfaceC2294h
    public int getMaxHorizontalScroll() {
        return computeHorizontalScrollRange() - getWidth();
    }

    @Deprecated
    public b getOnSwipeListener() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // p135o0.InterfaceC2294h
    public int getWebViewScrollX() {
        return getScrollX();
    }

    @Override // p135o0.InterfaceC2294h
    public int getWebViewScrollY() {
        return getScrollY();
    }

    @Override // android.webkit.WebView, p135o0.InterfaceC2294h
    public void goBack() {
        WebHistoryItem itemAtIndex;
        int currentIndex;
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
            int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex() - 1;
            while (true) {
                if (currentIndex2 < 0) {
                    itemAtIndex = null;
                    currentIndex = 0;
                    break;
                } else {
                    itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex2);
                    if (!itemAtIndex.getUrl().equals("file:///android_asset/offline.html")) {
                        currentIndex = currentIndex2 - webBackForwardListCopyBackForwardList.getCurrentIndex();
                        break;
                    }
                    currentIndex2--;
                }
            }
            if (itemAtIndex != null && !this.f6708b.shouldOverrideUrlLoading(this, itemAtIndex.getUrl())) {
                super.goBackOrForward(currentIndex);
            }
        } catch (Exception unused) {
            super.goBack();
        }
    }

    @Override // android.webkit.WebView, p135o0.InterfaceC2294h
    public void goForward() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + 1);
        if (itemAtIndex == null || !"file:///android_asset/offline.html".equals(itemAtIndex.getUrl())) {
            super.goForward();
        } else if (webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + 2) != null) {
            goBackOrForward(2);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7084i() {
        WebHistoryItem itemAtIndex;
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex() - 1;
            while (true) {
                if (currentIndex < 0) {
                    itemAtIndex = null;
                    break;
                }
                itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex);
                if (!itemAtIndex.getUrl().equals("file:///android_asset/offline.html")) {
                    break;
                } else {
                    currentIndex--;
                }
            }
            if (itemAtIndex != null) {
                this.f6713g = itemAtIndex.getUrl();
            }
            goBack();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m7085j(String str) {
        if (!this.f6713g.equals(str)) {
            return false;
        }
        this.f6713g = "";
        stopLoading();
        reload();
        return true;
    }

    @Override // android.webkit.WebView, p135o0.InterfaceC2294h
    public void loadUrl(String str) {
        WebViewClient webViewClient;
        if (str == null) {
            return;
        }
        if ("file:///offline.html".equals(str)) {
            str = "file:///android_asset/offline.html";
        }
        if (str.startsWith("javascript:") || (webViewClient = this.f6708b) == null || !webViewClient.shouldOverrideUrlLoading(this, str)) {
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.f6711e.onTouchEvent(motionEvent);
        } catch (Exception unused) {
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, p135o0.InterfaceC2294h
    public void reload() {
        WebViewClient webViewClient = this.f6708b;
        if (webViewClient == null || !(webViewClient instanceof C2168N)) {
            super.reload();
        } else {
            if (((C2168N) webViewClient).m10652f(this, getUrl(), true)) {
                return;
            }
            super.reload();
        }
    }

    @Override // android.view.View, p135o0.InterfaceC2294h
    public void scrollTo(int i3, int i4) {
        super.scrollTo(i3, i4);
    }

    @Override // p135o0.InterfaceC2294h
    public void setCheckLoginSignup(boolean z2) {
        this.f6710d = z2;
    }

    @Deprecated
    public void setOnSwipeListener(b bVar) {
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f6709c = webChromeClient;
        super.setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.f6708b = webViewClient;
        super.setWebViewClient(webViewClient);
    }

    @Override // android.webkit.WebView
    public void zoomBy(float f3) {
        super.zoomBy(f3);
        this.f6712f = true;
    }

    @Override // android.webkit.WebView
    public boolean zoomOut() {
        this.f6712f = false;
        return super.zoomOut();
    }
}
