package co.median.android;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: co.median.android.C */
/* JADX INFO: loaded from: classes.dex */
public class C1322C {

    /* JADX INFO: renamed from: a */
    private final a f6439a;

    /* JADX INFO: renamed from: co.median.android.C$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6733a(String str);
    }

    public C1322C(a aVar) {
        this.f6439a = aVar;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.f6439a.mo6733a(str);
    }
}
