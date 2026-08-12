package co.median.android;

import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p098e2.AbstractC1868d;
import p135o0.InterfaceC2294h;

/* JADX INFO: renamed from: co.median.android.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1320A {

    /* JADX INFO: renamed from: f */
    public static final a f6394f = new a(null);

    /* JADX INFO: renamed from: a */
    private final MainActivity f6395a;

    /* JADX INFO: renamed from: b */
    private final boolean f6396b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2294h f6397c;

    /* JADX INFO: renamed from: d */
    public C1321B f6398d;

    /* JADX INFO: renamed from: e */
    private boolean f6399e;

    /* JADX INFO: renamed from: co.median.android.A$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    public C1320A(MainActivity mainActivity, boolean z2) {
        AbstractC0606k.m2145e(mainActivity, "mainActivity");
        this.f6395a = mainActivity;
        this.f6396b = z2;
        InterfaceC2294h interfaceC2294hM6916X1 = mainActivity.m6916X1();
        AbstractC0606k.m2144d(interfaceC2294hM6916X1, "getWebView(...)");
        this.f6397c = interfaceC2294hM6916X1;
    }

    /* JADX INFO: renamed from: b */
    private final void m6670b(String str, boolean z2, boolean z3) {
        if (str == null || AbstractC1868d.m9686s(str)) {
            return;
        }
        if (!this.f6396b || !z2 || !this.f6395a.m6889G1().m10667a("_median_url_changed")) {
            this.f6397c.loadUrl(str);
            return;
        }
        if (AbstractC1868d.m9672i(str, "javascript:", false, 2, null)) {
            this.f6397c.mo7079b(str);
        } else if (z3 || !m6672a().m6721U(this.f6397c, str, false)) {
            m6671j(str);
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m6671j(String str) {
        if (str == null || AbstractC1868d.m9686s(str)) {
            return;
        }
        this.f6395a.m6925f2("_median_url_changed", new JSONObject().put(ImagesContract.URL, str));
    }

    /* JADX INFO: renamed from: a */
    public final C1321B m6672a() {
        C1321B c1321b = this.f6398d;
        if (c1321b != null) {
            return c1321b;
        }
        AbstractC0606k.m2154n("urlNavigation");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m6673c(String str) {
        m6675e(str, false, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m6674d(String str, boolean z2) {
        m6675e(str, z2, false);
    }

    /* JADX INFO: renamed from: e */
    public final void m6675e(String str, boolean z2, boolean z3) {
        if (str == null) {
            return;
        }
        MainActivity mainActivity = this.f6395a;
        mainActivity.f6526g0 = null;
        mainActivity.f6527h0 = null;
        if (AbstractC1868d.m9667d(str, "median_logout", true) || AbstractC1868d.m9667d(str, "gonative_logout", true)) {
            this.f6395a.m6904P2();
        } else {
            m6670b(str, z2, z3);
        }
        if (z3 || this.f6395a.m6910T1() == null) {
            return;
        }
        this.f6395a.m6910T1().m7184m(str, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m6676f(String str, String str2, boolean z2, boolean z3) {
        AbstractC0606k.m2145e(str2, "javascript");
        String url = this.f6397c.getUrl();
        if ((str == null || AbstractC1868d.m9686s(str)) && ((url == null || AbstractC1868d.m9686s(url)) && AbstractC0606k.m2141a(str, url))) {
            this.f6395a.mo6920a(str2);
            this.f6395a.f6527h0 = str2;
        } else {
            MainActivity mainActivity = this.f6395a;
            mainActivity.f6526g0 = str2;
            mainActivity.f6527h0 = str2;
            m6670b(str, z2, z3);
        }
        if (z3 || this.f6395a.m6910T1() == null) {
            return;
        }
        this.f6395a.m6910T1().m7184m(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public final void m6677g() {
        this.f6399e = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m6678h() {
        this.f6399e = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m6679i(String str) {
        if (!this.f6396b || this.f6399e) {
            return;
        }
        m6672a().m6714M(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m6680k(C1321B c1321b) {
        AbstractC0606k.m2145e(c1321b, "<set-?>");
        this.f6398d = c1321b;
    }
}
