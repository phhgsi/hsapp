package p146s;

import java.util.ArrayList;
import p146s.C2383e;

/* JADX INFO: renamed from: s.c */
/* JADX INFO: loaded from: classes.dex */
public class C2381c {

    /* JADX INFO: renamed from: a */
    protected C2383e f10855a;

    /* JADX INFO: renamed from: b */
    protected C2383e f10856b;

    /* JADX INFO: renamed from: c */
    protected C2383e f10857c;

    /* JADX INFO: renamed from: d */
    protected C2383e f10858d;

    /* JADX INFO: renamed from: e */
    protected C2383e f10859e;

    /* JADX INFO: renamed from: f */
    protected C2383e f10860f;

    /* JADX INFO: renamed from: g */
    protected C2383e f10861g;

    /* JADX INFO: renamed from: h */
    protected ArrayList f10862h;

    /* JADX INFO: renamed from: i */
    protected int f10863i;

    /* JADX INFO: renamed from: j */
    protected int f10864j;

    /* JADX INFO: renamed from: k */
    protected float f10865k = 0.0f;

    /* JADX INFO: renamed from: l */
    int f10866l;

    /* JADX INFO: renamed from: m */
    int f10867m;

    /* JADX INFO: renamed from: n */
    int f10868n;

    /* JADX INFO: renamed from: o */
    boolean f10869o;

    /* JADX INFO: renamed from: p */
    private int f10870p;

    /* JADX INFO: renamed from: q */
    private boolean f10871q;

    /* JADX INFO: renamed from: r */
    protected boolean f10872r;

    /* JADX INFO: renamed from: s */
    protected boolean f10873s;

    /* JADX INFO: renamed from: t */
    protected boolean f10874t;

    /* JADX INFO: renamed from: u */
    protected boolean f10875u;

    /* JADX INFO: renamed from: v */
    private boolean f10876v;

    public C2381c(C2383e c2383e, int i3, boolean z2) {
        this.f10855a = c2383e;
        this.f10870p = i3;
        this.f10871q = z2;
    }

    /* JADX INFO: renamed from: b */
    private void m11235b() {
        int i3 = this.f10870p * 2;
        C2383e c2383e = this.f10855a;
        this.f10869o = true;
        C2383e c2383e2 = c2383e;
        boolean z2 = false;
        while (!z2) {
            this.f10863i++;
            C2383e[] c2383eArr = c2383e.f10905D0;
            int i4 = this.f10870p;
            C2383e c2383e3 = null;
            c2383eArr[i4] = null;
            c2383e.f10903C0[i4] = null;
            if (c2383e.m11298S() != 8) {
                this.f10866l++;
                C2383e.b bVarM11355u = c2383e.m11355u(this.f10870p);
                C2383e.b bVar = C2383e.b.MATCH_CONSTRAINT;
                if (bVarM11355u != bVar) {
                    this.f10867m += c2383e.m11270E(this.f10870p);
                }
                int iM11243f = this.f10867m + c2383e.f10927V[i3].m11243f();
                this.f10867m = iM11243f;
                int i5 = i3 + 1;
                this.f10867m = iM11243f + c2383e.f10927V[i5].m11243f();
                int iM11243f2 = this.f10868n + c2383e.f10927V[i3].m11243f();
                this.f10868n = iM11243f2;
                this.f10868n = iM11243f2 + c2383e.f10927V[i5].m11243f();
                if (this.f10856b == null) {
                    this.f10856b = c2383e;
                }
                this.f10858d = c2383e;
                C2383e.b[] bVarArr = c2383e.f10930Y;
                int i6 = this.f10870p;
                if (bVarArr[i6] == bVar) {
                    int i7 = c2383e.f10978x[i6];
                    if (i7 == 0 || i7 == 3 || i7 == 2) {
                        this.f10864j++;
                        float f3 = c2383e.f10901B0[i6];
                        if (f3 > 0.0f) {
                            this.f10865k += f3;
                        }
                        if (m11236c(c2383e, i6)) {
                            if (f3 < 0.0f) {
                                this.f10872r = true;
                            } else {
                                this.f10873s = true;
                            }
                            if (this.f10862h == null) {
                                this.f10862h = new ArrayList();
                            }
                            this.f10862h.add(c2383e);
                        }
                        if (this.f10860f == null) {
                            this.f10860f = c2383e;
                        }
                        C2383e c2383e4 = this.f10861g;
                        if (c2383e4 != null) {
                            c2383e4.f10903C0[this.f10870p] = c2383e;
                        }
                        this.f10861g = c2383e;
                    }
                    if (this.f10870p == 0) {
                        if (c2383e.f10974v != 0 || c2383e.f10980y != 0 || c2383e.f10982z != 0) {
                            this.f10869o = false;
                        }
                    } else if (c2383e.f10976w != 0 || c2383e.f10900B != 0 || c2383e.f10902C != 0) {
                        this.f10869o = false;
                    }
                    if (c2383e.f10937c0 != 0.0f) {
                        this.f10869o = false;
                        this.f10875u = true;
                    }
                }
            }
            if (c2383e2 != c2383e) {
                c2383e2.f10905D0[this.f10870p] = c2383e;
            }
            C2382d c2382d = c2383e.f10927V[i3 + 1].f10882f;
            if (c2382d != null) {
                C2383e c2383e5 = c2382d.f10880d;
                C2382d c2382d2 = c2383e5.f10927V[i3].f10882f;
                if (c2382d2 != null && c2382d2.f10880d == c2383e) {
                    c2383e3 = c2383e5;
                }
            }
            if (c2383e3 == null) {
                c2383e3 = c2383e;
                z2 = true;
            }
            c2383e2 = c2383e;
            c2383e = c2383e3;
        }
        C2383e c2383e6 = this.f10856b;
        if (c2383e6 != null) {
            this.f10867m -= c2383e6.f10927V[i3].m11243f();
        }
        C2383e c2383e7 = this.f10858d;
        if (c2383e7 != null) {
            this.f10867m -= c2383e7.f10927V[i3 + 1].m11243f();
        }
        this.f10857c = c2383e;
        if (this.f10870p == 0 && this.f10871q) {
            this.f10859e = c2383e;
        } else {
            this.f10859e = this.f10855a;
        }
        this.f10874t = this.f10873s && this.f10872r;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m11236c(C2383e c2383e, int i3) {
        if (c2383e.m11298S() == 8 || c2383e.f10930Y[i3] != C2383e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i4 = c2383e.f10978x[i3];
        return i4 == 0 || i4 == 3;
    }

    /* JADX INFO: renamed from: a */
    public void m11237a() {
        if (!this.f10876v) {
            m11235b();
        }
        this.f10876v = true;
    }
}
