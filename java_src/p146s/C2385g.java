package p146s;

import java.util.ArrayList;
import p137p.C2306d;
import p146s.C2383e;

/* JADX INFO: renamed from: s.g */
/* JADX INFO: loaded from: classes.dex */
public class C2385g extends AbstractC2390l {

    /* JADX INFO: renamed from: v1 */
    private C2383e[] f11044v1;

    /* JADX INFO: renamed from: Y0 */
    private int f11021Y0 = -1;

    /* JADX INFO: renamed from: Z0 */
    private int f11022Z0 = -1;

    /* JADX INFO: renamed from: a1 */
    private int f11023a1 = -1;

    /* JADX INFO: renamed from: b1 */
    private int f11024b1 = -1;

    /* JADX INFO: renamed from: c1 */
    private int f11025c1 = -1;

    /* JADX INFO: renamed from: d1 */
    private int f11026d1 = -1;

    /* JADX INFO: renamed from: e1 */
    private float f11027e1 = 0.5f;

    /* JADX INFO: renamed from: f1 */
    private float f11028f1 = 0.5f;

    /* JADX INFO: renamed from: g1 */
    private float f11029g1 = 0.5f;

    /* JADX INFO: renamed from: h1 */
    private float f11030h1 = 0.5f;

    /* JADX INFO: renamed from: i1 */
    private float f11031i1 = 0.5f;

    /* JADX INFO: renamed from: j1 */
    private float f11032j1 = 0.5f;

    /* JADX INFO: renamed from: k1 */
    private int f11033k1 = 0;

    /* JADX INFO: renamed from: l1 */
    private int f11034l1 = 0;

    /* JADX INFO: renamed from: m1 */
    private int f11035m1 = 2;

    /* JADX INFO: renamed from: n1 */
    private int f11036n1 = 2;

    /* JADX INFO: renamed from: o1 */
    private int f11037o1 = 0;

    /* JADX INFO: renamed from: p1 */
    private int f11038p1 = -1;

    /* JADX INFO: renamed from: q1 */
    private int f11039q1 = 0;

    /* JADX INFO: renamed from: r1 */
    private ArrayList f11040r1 = new ArrayList();

    /* JADX INFO: renamed from: s1 */
    private C2383e[] f11041s1 = null;

    /* JADX INFO: renamed from: t1 */
    private C2383e[] f11042t1 = null;

    /* JADX INFO: renamed from: u1 */
    private int[] f11043u1 = null;

    /* JADX INFO: renamed from: w1 */
    private int f11045w1 = 0;

    /* JADX INFO: renamed from: s.g$a */
    private class a {

        /* JADX INFO: renamed from: a */
        private int f11046a;

        /* JADX INFO: renamed from: d */
        private C2382d f11049d;

        /* JADX INFO: renamed from: e */
        private C2382d f11050e;

        /* JADX INFO: renamed from: f */
        private C2382d f11051f;

        /* JADX INFO: renamed from: g */
        private C2382d f11052g;

        /* JADX INFO: renamed from: h */
        private int f11053h;

        /* JADX INFO: renamed from: i */
        private int f11054i;

        /* JADX INFO: renamed from: j */
        private int f11055j;

        /* JADX INFO: renamed from: k */
        private int f11056k;

        /* JADX INFO: renamed from: q */
        private int f11062q;

        /* JADX INFO: renamed from: b */
        private C2383e f11047b = null;

        /* JADX INFO: renamed from: c */
        int f11048c = 0;

        /* JADX INFO: renamed from: l */
        private int f11057l = 0;

        /* JADX INFO: renamed from: m */
        private int f11058m = 0;

        /* JADX INFO: renamed from: n */
        private int f11059n = 0;

        /* JADX INFO: renamed from: o */
        private int f11060o = 0;

        /* JADX INFO: renamed from: p */
        private int f11061p = 0;

        public a(int i3, C2382d c2382d, C2382d c2382d2, C2382d c2382d3, C2382d c2382d4, int i4) {
            this.f11053h = 0;
            this.f11054i = 0;
            this.f11055j = 0;
            this.f11056k = 0;
            this.f11062q = 0;
            this.f11046a = i3;
            this.f11049d = c2382d;
            this.f11050e = c2382d2;
            this.f11051f = c2382d3;
            this.f11052g = c2382d4;
            this.f11053h = C2385g.this.m11488t1();
            this.f11054i = C2385g.this.m11490v1();
            this.f11055j = C2385g.this.m11489u1();
            this.f11056k = C2385g.this.m11487s1();
            this.f11062q = i4;
        }

        /* JADX INFO: renamed from: h */
        private void m11447h() {
            this.f11057l = 0;
            this.f11058m = 0;
            this.f11047b = null;
            this.f11048c = 0;
            int i3 = this.f11060o;
            for (int i4 = 0; i4 < i3 && this.f11059n + i4 < C2385g.this.f11045w1; i4++) {
                C2383e c2383e = C2385g.this.f11044v1[this.f11059n + i4];
                if (this.f11046a == 0) {
                    int iM11300T = c2383e.m11300T();
                    int i5 = C2385g.this.f11033k1;
                    if (c2383e.m11298S() == 8) {
                        i5 = 0;
                    }
                    this.f11057l += iM11300T + i5;
                    int iM11421e2 = C2385g.this.m11421e2(c2383e, this.f11062q);
                    if (this.f11047b == null || this.f11048c < iM11421e2) {
                        this.f11047b = c2383e;
                        this.f11048c = iM11421e2;
                        this.f11058m = iM11421e2;
                    }
                } else {
                    int iM11422f2 = C2385g.this.m11422f2(c2383e, this.f11062q);
                    int iM11421e22 = C2385g.this.m11421e2(c2383e, this.f11062q);
                    int i6 = C2385g.this.f11034l1;
                    if (c2383e.m11298S() == 8) {
                        i6 = 0;
                    }
                    this.f11058m += iM11421e22 + i6;
                    if (this.f11047b == null || this.f11048c < iM11422f2) {
                        this.f11047b = c2383e;
                        this.f11048c = iM11422f2;
                        this.f11057l = iM11422f2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m11448b(C2383e c2383e) {
            if (this.f11046a == 0) {
                int iM11422f2 = C2385g.this.m11422f2(c2383e, this.f11062q);
                if (c2383e.m11262A() == C2383e.b.MATCH_CONSTRAINT) {
                    this.f11061p++;
                    iM11422f2 = 0;
                }
                this.f11057l += iM11422f2 + (c2383e.m11298S() != 8 ? C2385g.this.f11033k1 : 0);
                int iM11421e2 = C2385g.this.m11421e2(c2383e, this.f11062q);
                if (this.f11047b == null || this.f11048c < iM11421e2) {
                    this.f11047b = c2383e;
                    this.f11048c = iM11421e2;
                    this.f11058m = iM11421e2;
                }
            } else {
                int iM11422f22 = C2385g.this.m11422f2(c2383e, this.f11062q);
                int iM11421e22 = C2385g.this.m11421e2(c2383e, this.f11062q);
                if (c2383e.m11294Q() == C2383e.b.MATCH_CONSTRAINT) {
                    this.f11061p++;
                    iM11421e22 = 0;
                }
                this.f11058m += iM11421e22 + (c2383e.m11298S() != 8 ? C2385g.this.f11034l1 : 0);
                if (this.f11047b == null || this.f11048c < iM11422f22) {
                    this.f11047b = c2383e;
                    this.f11048c = iM11422f22;
                    this.f11057l = iM11422f22;
                }
            }
            this.f11060o++;
        }

        /* JADX INFO: renamed from: c */
        public void m11449c() {
            this.f11048c = 0;
            this.f11047b = null;
            this.f11057l = 0;
            this.f11058m = 0;
            this.f11059n = 0;
            this.f11060o = 0;
            this.f11061p = 0;
        }

        /* JADX INFO: renamed from: d */
        public void m11450d(boolean z2, int i3, boolean z3) {
            C2383e c2383e;
            int i4;
            char c3;
            float f3;
            float f4;
            int i5 = this.f11060o;
            for (int i6 = 0; i6 < i5 && this.f11059n + i6 < C2385g.this.f11045w1; i6++) {
                C2383e c2383e2 = C2385g.this.f11044v1[this.f11059n + i6];
                if (c2383e2 != null) {
                    c2383e2.m11350r0();
                }
            }
            if (i5 == 0 || this.f11047b == null) {
                return;
            }
            boolean z4 = z3 && i3 == 0;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = z2 ? (i5 - 1) - i9 : i9;
                if (this.f11059n + i10 >= C2385g.this.f11045w1) {
                    break;
                }
                if (C2385g.this.f11044v1[this.f11059n + i10].m11298S() == 0) {
                    if (i7 == -1) {
                        i7 = i9;
                    }
                    i8 = i9;
                }
            }
            C2383e c2383e3 = null;
            if (this.f11046a != 0) {
                C2383e c2383e4 = this.f11047b;
                c2383e4.m11277H0(C2385g.this.f11021Y0);
                int i11 = this.f11053h;
                if (i3 > 0) {
                    i11 += C2385g.this.f11033k1;
                }
                if (z2) {
                    c2383e4.f10921P.m11238a(this.f11051f, i11);
                    if (z3) {
                        c2383e4.f10919N.m11238a(this.f11049d, this.f11055j);
                    }
                    if (i3 > 0) {
                        this.f11051f.f10880d.f10919N.m11238a(c2383e4.f10921P, 0);
                    }
                } else {
                    c2383e4.f10919N.m11238a(this.f11049d, i11);
                    if (z3) {
                        c2383e4.f10921P.m11238a(this.f11051f, this.f11055j);
                    }
                    if (i3 > 0) {
                        this.f11049d.f10880d.f10921P.m11238a(c2383e4.f10919N, 0);
                    }
                }
                int i12 = 0;
                while (i12 < i5 && this.f11059n + i12 < C2385g.this.f11045w1) {
                    C2383e c2383e5 = C2385g.this.f11044v1[this.f11059n + i12];
                    if (i12 == 0) {
                        c2383e5.m11336k(c2383e5.f10920O, this.f11050e, this.f11054i);
                        int i13 = C2385g.this.f11022Z0;
                        float f5 = C2385g.this.f11028f1;
                        if (this.f11059n == 0 && C2385g.this.f11024b1 != -1) {
                            i13 = C2385g.this.f11024b1;
                            f5 = C2385g.this.f11030h1;
                        } else if (z3 && C2385g.this.f11026d1 != -1) {
                            i13 = C2385g.this.f11026d1;
                            f5 = C2385g.this.f11032j1;
                        }
                        c2383e5.m11311Y0(i13);
                        c2383e5.m11309X0(f5);
                    }
                    if (i12 == i5 - 1) {
                        c2383e5.m11336k(c2383e5.f10922Q, this.f11052g, this.f11056k);
                    }
                    if (c2383e3 != null) {
                        c2383e5.f10920O.m11238a(c2383e3.f10922Q, C2385g.this.f11034l1);
                        if (i12 == i7) {
                            c2383e5.f10920O.m11258u(this.f11054i);
                        }
                        c2383e3.f10922Q.m11238a(c2383e5.f10920O, 0);
                        if (i12 == i8 + 1) {
                            c2383e3.f10922Q.m11258u(this.f11056k);
                        }
                    }
                    if (c2383e5 != c2383e4) {
                        if (z2) {
                            int i14 = C2385g.this.f11035m1;
                            if (i14 == 0) {
                                c2383e5.f10921P.m11238a(c2383e4.f10921P, 0);
                            } else if (i14 == 1) {
                                c2383e5.f10919N.m11238a(c2383e4.f10919N, 0);
                            } else if (i14 == 2) {
                                c2383e5.f10919N.m11238a(c2383e4.f10919N, 0);
                                c2383e5.f10921P.m11238a(c2383e4.f10921P, 0);
                            }
                        } else {
                            int i15 = C2385g.this.f11035m1;
                            if (i15 == 0) {
                                c2383e5.f10919N.m11238a(c2383e4.f10919N, 0);
                            } else if (i15 == 1) {
                                c2383e5.f10921P.m11238a(c2383e4.f10921P, 0);
                            } else if (i15 == 2) {
                                if (z4) {
                                    c2383e5.f10919N.m11238a(this.f11049d, this.f11053h);
                                    c2383e5.f10921P.m11238a(this.f11051f, this.f11055j);
                                } else {
                                    c2383e5.f10919N.m11238a(c2383e4.f10919N, 0);
                                    c2383e5.f10921P.m11238a(c2383e4.f10921P, 0);
                                }
                            }
                        }
                    }
                    i12++;
                    c2383e3 = c2383e5;
                }
                return;
            }
            C2383e c2383e6 = this.f11047b;
            c2383e6.m11311Y0(C2385g.this.f11022Z0);
            int i16 = this.f11054i;
            if (i3 > 0) {
                i16 += C2385g.this.f11034l1;
            }
            c2383e6.f10920O.m11238a(this.f11050e, i16);
            if (z3) {
                c2383e6.f10922Q.m11238a(this.f11052g, this.f11056k);
            }
            if (i3 > 0) {
                this.f11050e.f10880d.f10922Q.m11238a(c2383e6.f10920O, 0);
            }
            if (C2385g.this.f11036n1 != 3 || c2383e6.m11306W()) {
                c2383e = c2383e6;
            } else {
                for (int i17 = 0; i17 < i5; i17++) {
                    int i18 = z2 ? (i5 - 1) - i17 : i17;
                    if (this.f11059n + i18 >= C2385g.this.f11045w1) {
                        break;
                    }
                    c2383e = C2385g.this.f11044v1[this.f11059n + i18];
                    if (c2383e.m11306W()) {
                        break;
                    }
                }
                c2383e = c2383e6;
            }
            int i19 = 0;
            while (i19 < i5) {
                int i20 = z2 ? (i5 - 1) - i19 : i19;
                if (this.f11059n + i20 >= C2385g.this.f11045w1) {
                    return;
                }
                C2383e c2383e7 = C2385g.this.f11044v1[this.f11059n + i20];
                if (i19 == 0) {
                    i4 = 1;
                    c2383e7.m11336k(c2383e7.f10919N, this.f11049d, this.f11053h);
                } else {
                    i4 = 1;
                }
                if (i20 == 0) {
                    int i21 = C2385g.this.f11021Y0;
                    float f6 = C2385g.this.f11027e1;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    if (this.f11059n != 0 || C2385g.this.f11023a1 == -1) {
                        if (z3 && C2385g.this.f11025c1 != -1) {
                            i21 = C2385g.this.f11025c1;
                            if (z2) {
                                f4 = C2385g.this.f11031i1;
                                f3 = 1.0f - f4;
                                f6 = f3;
                            } else {
                                f3 = C2385g.this.f11031i1;
                                f6 = f3;
                            }
                        }
                        c2383e7.m11277H0(i21);
                        c2383e7.m11275G0(f6);
                    } else {
                        i21 = C2385g.this.f11023a1;
                        if (z2) {
                            f4 = C2385g.this.f11029g1;
                            f3 = 1.0f - f4;
                            f6 = f3;
                            c2383e7.m11277H0(i21);
                            c2383e7.m11275G0(f6);
                        } else {
                            f3 = C2385g.this.f11029g1;
                            f6 = f3;
                            c2383e7.m11277H0(i21);
                            c2383e7.m11275G0(f6);
                        }
                    }
                }
                if (i19 == i5 - 1) {
                    c2383e7.m11336k(c2383e7.f10921P, this.f11051f, this.f11055j);
                }
                if (c2383e3 != null) {
                    c2383e7.f10919N.m11238a(c2383e3.f10921P, C2385g.this.f11033k1);
                    if (i19 == i7) {
                        c2383e7.f10919N.m11258u(this.f11053h);
                    }
                    c2383e3.f10921P.m11238a(c2383e7.f10919N, 0);
                    if (i19 == i8 + 1) {
                        c2383e3.f10921P.m11258u(this.f11055j);
                    }
                }
                if (c2383e7 != c2383e6) {
                    c3 = 3;
                    if (C2385g.this.f11036n1 == 3 && c2383e.m11306W() && c2383e7 != c2383e && c2383e7.m11306W()) {
                        c2383e7.f10923R.m11238a(c2383e.f10923R, 0);
                    } else {
                        int i22 = C2385g.this.f11036n1;
                        if (i22 == 0) {
                            c2383e7.f10920O.m11238a(c2383e6.f10920O, 0);
                        } else if (i22 == i4) {
                            c2383e7.f10922Q.m11238a(c2383e6.f10922Q, 0);
                        } else if (z4) {
                            c2383e7.f10920O.m11238a(this.f11050e, this.f11054i);
                            c2383e7.f10922Q.m11238a(this.f11052g, this.f11056k);
                        } else {
                            c2383e7.f10920O.m11238a(c2383e6.f10920O, 0);
                            c2383e7.f10922Q.m11238a(c2383e6.f10922Q, 0);
                        }
                    }
                } else {
                    c3 = 3;
                }
                i19++;
                c2383e3 = c2383e7;
            }
        }

        /* JADX INFO: renamed from: e */
        public int m11451e() {
            return this.f11046a == 1 ? this.f11058m - C2385g.this.f11034l1 : this.f11058m;
        }

        /* JADX INFO: renamed from: f */
        public int m11452f() {
            return this.f11046a == 0 ? this.f11057l - C2385g.this.f11033k1 : this.f11057l;
        }

        /* JADX INFO: renamed from: g */
        public void m11453g(int i3) {
            int i4 = this.f11061p;
            if (i4 == 0) {
                return;
            }
            int i5 = this.f11060o;
            int i6 = i3 / i4;
            for (int i7 = 0; i7 < i5 && this.f11059n + i7 < C2385g.this.f11045w1; i7++) {
                C2383e c2383e = C2385g.this.f11044v1[this.f11059n + i7];
                if (this.f11046a == 0) {
                    if (c2383e != null && c2383e.m11262A() == C2383e.b.MATCH_CONSTRAINT && c2383e.f10974v == 0) {
                        C2385g.this.m11491x1(c2383e, C2383e.b.FIXED, i6, c2383e.m11294Q(), c2383e.m11361x());
                    }
                } else if (c2383e != null && c2383e.m11294Q() == C2383e.b.MATCH_CONSTRAINT && c2383e.f10976w == 0) {
                    int i8 = i6;
                    C2385g.this.m11491x1(c2383e, c2383e.m11262A(), c2383e.m11300T(), C2383e.b.FIXED, i8);
                    i6 = i8;
                }
            }
            m11447h();
        }

        /* JADX INFO: renamed from: i */
        public void m11454i(int i3) {
            this.f11059n = i3;
        }

        /* JADX INFO: renamed from: j */
        public void m11455j(int i3, C2382d c2382d, C2382d c2382d2, C2382d c2382d3, C2382d c2382d4, int i4, int i5, int i6, int i7, int i8) {
            this.f11046a = i3;
            this.f11049d = c2382d;
            this.f11050e = c2382d2;
            this.f11051f = c2382d3;
            this.f11052g = c2382d4;
            this.f11053h = i4;
            this.f11054i = i5;
            this.f11055j = i6;
            this.f11056k = i7;
            this.f11062q = i8;
        }
    }

    /* JADX INFO: renamed from: d2 */
    private void m11420d2(boolean z2) {
        C2383e c2383e;
        float f3;
        int i3;
        if (this.f11043u1 == null || this.f11042t1 == null || this.f11041s1 == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f11045w1; i4++) {
            this.f11044v1[i4].m11350r0();
        }
        int[] iArr = this.f11043u1;
        int i5 = iArr[0];
        int i6 = iArr[1];
        float f4 = this.f11027e1;
        C2383e c2383e2 = null;
        int i7 = 0;
        while (i7 < i5) {
            if (z2) {
                i3 = (i5 - i7) - 1;
                f3 = 1.0f - this.f11027e1;
            } else {
                f3 = f4;
                i3 = i7;
            }
            C2383e c2383e3 = this.f11042t1[i3];
            if (c2383e3 != null && c2383e3.m11298S() != 8) {
                if (i7 == 0) {
                    c2383e3.m11336k(c2383e3.f10919N, this.f10919N, m11488t1());
                    c2383e3.m11277H0(this.f11021Y0);
                    c2383e3.m11275G0(f3);
                }
                if (i7 == i5 - 1) {
                    c2383e3.m11336k(c2383e3.f10921P, this.f10921P, m11489u1());
                }
                if (i7 > 0 && c2383e2 != null) {
                    c2383e3.m11336k(c2383e3.f10919N, c2383e2.f10921P, this.f11033k1);
                    c2383e2.m11336k(c2383e2.f10921P, c2383e3.f10919N, 0);
                }
                c2383e2 = c2383e3;
            }
            i7++;
            f4 = f3;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            C2383e c2383e4 = this.f11041s1[i8];
            if (c2383e4 != null && c2383e4.m11298S() != 8) {
                if (i8 == 0) {
                    c2383e4.m11336k(c2383e4.f10920O, this.f10920O, m11490v1());
                    c2383e4.m11311Y0(this.f11022Z0);
                    c2383e4.m11309X0(this.f11028f1);
                }
                if (i8 == i6 - 1) {
                    c2383e4.m11336k(c2383e4.f10922Q, this.f10922Q, m11487s1());
                }
                if (i8 > 0 && c2383e2 != null) {
                    c2383e4.m11336k(c2383e4.f10920O, c2383e2.f10922Q, this.f11034l1);
                    c2383e2.m11336k(c2383e2.f10922Q, c2383e4.f10920O, 0);
                }
                c2383e2 = c2383e4;
            }
        }
        for (int i9 = 0; i9 < i5; i9++) {
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = (i10 * i5) + i9;
                if (this.f11039q1 == 1) {
                    i11 = (i9 * i6) + i10;
                }
                C2383e[] c2383eArr = this.f11044v1;
                if (i11 < c2383eArr.length && (c2383e = c2383eArr[i11]) != null && c2383e.m11298S() != 8) {
                    C2383e c2383e5 = this.f11042t1[i9];
                    C2383e c2383e6 = this.f11041s1[i10];
                    if (c2383e != c2383e5) {
                        c2383e.m11336k(c2383e.f10919N, c2383e5.f10919N, 0);
                        c2383e.m11336k(c2383e.f10921P, c2383e5.f10921P, 0);
                    }
                    if (c2383e != c2383e6) {
                        c2383e.m11336k(c2383e.f10920O, c2383e6.f10920O, 0);
                        c2383e.m11336k(c2383e.f10922Q, c2383e6.f10922Q, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public final int m11421e2(C2383e c2383e, int i3) {
        C2383e c2383e2;
        if (c2383e == null) {
            return 0;
        }
        if (c2383e.m11294Q() == C2383e.b.MATCH_CONSTRAINT) {
            int i4 = c2383e.f10976w;
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 2) {
                int i5 = (int) (c2383e.f10904D * i3);
                if (i5 != c2383e.m11361x()) {
                    c2383e.m11299S0(true);
                    m11491x1(c2383e, c2383e.m11262A(), c2383e.m11300T(), C2383e.b.FIXED, i5);
                }
                return i5;
            }
            c2383e2 = c2383e;
            if (i4 == 1) {
                return c2383e2.m11361x();
            }
            if (i4 == 3) {
                return (int) ((c2383e2.m11300T() * c2383e2.f10937c0) + 0.5f);
            }
        } else {
            c2383e2 = c2383e;
        }
        return c2383e2.m11361x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public final int m11422f2(C2383e c2383e, int i3) {
        C2383e c2383e2;
        if (c2383e == null) {
            return 0;
        }
        if (c2383e.m11262A() == C2383e.b.MATCH_CONSTRAINT) {
            int i4 = c2383e.f10974v;
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 2) {
                int i5 = (int) (c2383e.f10898A * i3);
                if (i5 != c2383e.m11300T()) {
                    c2383e.m11299S0(true);
                    m11491x1(c2383e, C2383e.b.FIXED, i5, c2383e.m11294Q(), c2383e.m11361x());
                }
                return i5;
            }
            c2383e2 = c2383e;
            if (i4 == 1) {
                return c2383e2.m11300T();
            }
            if (i4 == 3) {
                return (int) ((c2383e2.m11361x() * c2383e2.f10937c0) + 0.5f);
            }
        } else {
            c2383e2 = c2383e;
        }
        return c2383e2.m11300T();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: g2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m11423g2(p146s.C2383e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p146s.C2385g.m11423g2(s.e[], int, int, int, int[]):void");
    }

    /* JADX INFO: renamed from: h2 */
    private void m11424h2(C2383e[] c2383eArr, int i3, int i4, int i5, int[] iArr) {
        int i6;
        C2385g c2385g;
        int i7;
        C2382d c2382d;
        int i8;
        C2385g c2385g2 = this;
        if (i3 == 0) {
            return;
        }
        c2385g2.f11040r1.clear();
        int i9 = i5;
        a aVar = c2385g2.new a(i4, c2385g2.f10919N, c2385g2.f10920O, c2385g2.f10921P, c2385g2.f10922Q, i9);
        c2385g2.f11040r1.add(aVar);
        if (i4 == 0) {
            i6 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i11 < i3) {
                C2383e c2383e = c2383eArr[i11];
                int iM11422f2 = c2385g2.m11422f2(c2383e, i9);
                if (c2383e.m11262A() == C2383e.b.MATCH_CONSTRAINT) {
                    i6++;
                }
                int i12 = i6;
                boolean z2 = (i10 == i9 || (c2385g2.f11033k1 + i10) + iM11422f2 > i9) && aVar.f11047b != null;
                if (!z2 && i11 > 0 && (i8 = c2385g2.f11038p1) > 0 && i11 % i8 == 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar = c2385g2.new a(i4, c2385g2.f10919N, c2385g2.f10920O, c2385g2.f10921P, c2385g2.f10922Q, i9);
                    aVar.m11454i(i11);
                    c2385g2.f11040r1.add(aVar);
                } else {
                    if (i11 > 0) {
                        i10 += c2385g2.f11033k1 + iM11422f2;
                    }
                    aVar.m11448b(c2383e);
                    i11++;
                    i6 = i12;
                }
                i10 = iM11422f2;
                aVar.m11448b(c2383e);
                i11++;
                i6 = i12;
            }
        } else {
            i6 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i3) {
                C2383e c2383e2 = c2383eArr[i14];
                int iM11421e2 = c2385g2.m11421e2(c2383e2, i9);
                if (c2383e2.m11294Q() == C2383e.b.MATCH_CONSTRAINT) {
                    i6++;
                }
                int i15 = i6;
                boolean z3 = (i13 == i9 || (c2385g2.f11034l1 + i13) + iM11421e2 > i9) && aVar.f11047b != null;
                if (!z3 && i14 > 0 && (i7 = c2385g2.f11038p1) > 0 && i14 % i7 == 0) {
                    z3 = true;
                }
                if (z3) {
                    aVar = c2385g2.new a(i4, c2385g2.f10919N, c2385g2.f10920O, c2385g2.f10921P, c2385g2.f10922Q, i9);
                    c2385g = c2385g2;
                    aVar.m11454i(i14);
                    c2385g.f11040r1.add(aVar);
                } else {
                    c2385g = c2385g2;
                    if (i14 > 0) {
                        i13 += c2385g.f11034l1 + iM11421e2;
                    }
                    aVar.m11448b(c2383e2);
                    i14++;
                    i9 = i5;
                    i6 = i15;
                    c2385g2 = c2385g;
                }
                i13 = iM11421e2;
                aVar.m11448b(c2383e2);
                i14++;
                i9 = i5;
                i6 = i15;
                c2385g2 = c2385g;
            }
        }
        C2385g c2385g3 = c2385g2;
        int size = c2385g3.f11040r1.size();
        C2382d c2382d2 = c2385g3.f10919N;
        C2382d c2382d3 = c2385g3.f10920O;
        C2382d c2382d4 = c2385g3.f10921P;
        C2382d c2382d5 = c2385g3.f10922Q;
        int iM11488t1 = c2385g3.m11488t1();
        int iM11490v1 = c2385g3.m11490v1();
        int iM11489u1 = c2385g3.m11489u1();
        int iM11487s1 = c2385g3.m11487s1();
        C2383e.b bVarM11262A = c2385g3.m11262A();
        C2383e.b bVar = C2383e.b.WRAP_CONTENT;
        boolean z4 = bVarM11262A == bVar || c2385g3.m11294Q() == bVar;
        if (i6 > 0 && z4) {
            for (int i16 = 0; i16 < size; i16++) {
                a aVar2 = (a) c2385g3.f11040r1.get(i16);
                if (i4 == 0) {
                    aVar2.m11453g(i5 - aVar2.m11452f());
                } else {
                    aVar2.m11453g(i5 - aVar2.m11451e());
                }
            }
        }
        C2382d c2382d6 = c2382d2;
        int iM11487s12 = iM11487s1;
        int i17 = 0;
        int iM11489u12 = iM11489u1;
        int i18 = iM11490v1;
        int i19 = iM11488t1;
        C2382d c2382d7 = c2382d5;
        C2382d c2382d8 = c2382d4;
        C2382d c2382d9 = c2382d3;
        int i20 = 0;
        for (int i21 = 0; i21 < size; i21++) {
            a aVar3 = (a) c2385g3.f11040r1.get(i21);
            if (i4 == 0) {
                if (i21 < size - 1) {
                    c2382d7 = ((a) c2385g3.f11040r1.get(i21 + 1)).f11047b.f10920O;
                    iM11487s12 = 0;
                } else {
                    c2382d7 = c2385g3.f10922Q;
                    iM11487s12 = c2385g3.m11487s1();
                }
                C2382d c2382d10 = aVar3.f11047b.f10922Q;
                int i22 = i20;
                aVar3.m11455j(i4, c2382d6, c2382d9, c2382d8, c2382d7, i19, i18, iM11489u12, iM11487s12, i5);
                int iMax = Math.max(i17, aVar3.m11452f());
                int iM11451e = aVar3.m11451e() + i22;
                if (i21 > 0) {
                    iM11451e += c2385g3.f11034l1;
                }
                i20 = iM11451e;
                i17 = iMax;
                c2382d9 = c2382d10;
                i18 = 0;
            } else {
                int i23 = i17;
                int i24 = i20;
                if (i21 < size - 1) {
                    c2382d = ((a) c2385g3.f11040r1.get(i21 + 1)).f11047b.f10919N;
                    iM11489u12 = 0;
                } else {
                    c2382d = c2385g3.f10921P;
                    iM11489u12 = c2385g3.m11489u1();
                }
                c2382d8 = c2382d;
                C2382d c2382d11 = aVar3.f11047b.f10921P;
                aVar3.m11455j(i4, c2382d6, c2382d9, c2382d8, c2382d7, i19, i18, iM11489u12, iM11487s12, i5);
                int iM11452f = aVar3.m11452f() + i23;
                int iMax2 = Math.max(i24, aVar3.m11451e());
                if (i21 > 0) {
                    iM11452f += c2385g3.f11033k1;
                }
                int i25 = iM11452f;
                i20 = iMax2;
                i17 = i25;
                i19 = 0;
                c2382d6 = c2382d11;
            }
        }
        iArr[0] = i17;
        iArr[1] = i20;
    }

    /* JADX INFO: renamed from: i2 */
    private void m11425i2(C2383e[] c2383eArr, int i3, int i4, int i5, int[] iArr) {
        a aVar;
        if (i3 == 0) {
            return;
        }
        if (this.f11040r1.size() == 0) {
            aVar = new a(i4, this.f10919N, this.f10920O, this.f10921P, this.f10922Q, i5);
            this.f11040r1.add(aVar);
        } else {
            a aVar2 = (a) this.f11040r1.get(0);
            aVar2.m11449c();
            aVar2.m11455j(i4, this.f10919N, this.f10920O, this.f10921P, this.f10922Q, m11488t1(), m11490v1(), m11489u1(), m11487s1(), i5);
            aVar = aVar2;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            aVar.m11448b(c2383eArr[i6]);
        }
        iArr[0] = aVar.m11452f();
        iArr[1] = aVar.m11451e();
    }

    /* JADX INFO: renamed from: A2 */
    public void m11426A2(int i3) {
        this.f11022Z0 = i3;
    }

    /* JADX INFO: renamed from: B2 */
    public void m11427B2(int i3) {
        this.f11037o1 = i3;
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: g */
    public void mo11220g(C2306d c2306d, boolean z2) {
        super.mo11220g(c2306d, z2);
        boolean z3 = m11282K() != null && ((C2384f) m11282K()).m11382J1();
        int i3 = this.f11037o1;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = this.f11040r1.size();
                int i4 = 0;
                while (i4 < size) {
                    ((a) this.f11040r1.get(i4)).m11450d(z3, i4, i4 == size + (-1));
                    i4++;
                }
            } else if (i3 == 2) {
                m11420d2(z3);
            }
        } else if (this.f11040r1.size() > 0) {
            ((a) this.f11040r1.get(0)).m11450d(z3, 0, true);
        }
        m11473A1(false);
    }

    /* JADX INFO: renamed from: j2 */
    public void m11428j2(float f3) {
        this.f11029g1 = f3;
    }

    /* JADX INFO: renamed from: k2 */
    public void m11429k2(int i3) {
        this.f11023a1 = i3;
    }

    /* JADX INFO: renamed from: l2 */
    public void m11430l2(float f3) {
        this.f11030h1 = f3;
    }

    /* JADX INFO: renamed from: m2 */
    public void m11431m2(int i3) {
        this.f11024b1 = i3;
    }

    /* JADX INFO: renamed from: n2 */
    public void m11432n2(int i3) {
        this.f11035m1 = i3;
    }

    /* JADX INFO: renamed from: o2 */
    public void m11433o2(float f3) {
        this.f11027e1 = f3;
    }

    /* JADX INFO: renamed from: p2 */
    public void m11434p2(int i3) {
        this.f11033k1 = i3;
    }

    /* JADX INFO: renamed from: q2 */
    public void m11435q2(int i3) {
        this.f11021Y0 = i3;
    }

    /* JADX INFO: renamed from: r2 */
    public void m11436r2(float f3) {
        this.f11031i1 = f3;
    }

    /* JADX INFO: renamed from: s2 */
    public void m11437s2(int i3) {
        this.f11025c1 = i3;
    }

    /* JADX INFO: renamed from: t2 */
    public void m11438t2(float f3) {
        this.f11032j1 = f3;
    }

    /* JADX INFO: renamed from: u2 */
    public void m11439u2(int i3) {
        this.f11026d1 = i3;
    }

    /* JADX INFO: renamed from: v2 */
    public void m11440v2(int i3) {
        this.f11038p1 = i3;
    }

    @Override // p146s.AbstractC2390l
    /* JADX INFO: renamed from: w1 */
    public void mo11441w1(int i3, int i4, int i5, int i6) {
        int i7;
        C2383e[] c2383eArr;
        if (this.f11073K0 > 0 && !m11492y1()) {
            m11474B1(0, 0);
            m11473A1(false);
            return;
        }
        int iM11488t1 = m11488t1();
        int iM11489u1 = m11489u1();
        int iM11490v1 = m11490v1();
        int iM11487s1 = m11487s1();
        int[] iArr = new int[2];
        int i8 = (i4 - iM11488t1) - iM11489u1;
        int i9 = this.f11039q1;
        if (i9 == 1) {
            i8 = (i6 - iM11490v1) - iM11487s1;
        }
        int i10 = i8;
        if (i9 == 0) {
            if (this.f11021Y0 == -1) {
                this.f11021Y0 = 0;
            }
            if (this.f11022Z0 == -1) {
                this.f11022Z0 = 0;
            }
        } else {
            if (this.f11021Y0 == -1) {
                this.f11021Y0 = 0;
            }
            if (this.f11022Z0 == -1) {
                this.f11022Z0 = 0;
            }
        }
        C2383e[] c2383eArr2 = this.f11072J0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i7 = this.f11073K0;
            if (i11 >= i7) {
                break;
            }
            if (this.f11072J0[i11].m11298S() == 8) {
                i12++;
            }
            i11++;
        }
        if (i12 > 0) {
            C2383e[] c2383eArr3 = new C2383e[i7 - i12];
            int i13 = 0;
            i7 = 0;
            while (i13 < this.f11073K0) {
                C2383e c2383e = this.f11072J0[i13];
                C2383e[] c2383eArr4 = c2383eArr3;
                if (c2383e.m11298S() != 8) {
                    c2383eArr4[i7] = c2383e;
                    i7++;
                }
                i13++;
                c2383eArr3 = c2383eArr4;
            }
            c2383eArr = c2383eArr3;
        } else {
            c2383eArr = c2383eArr2;
        }
        int i14 = i7;
        this.f11044v1 = c2383eArr;
        this.f11045w1 = i14;
        int i15 = this.f11037o1;
        if (i15 == 0) {
            m11425i2(c2383eArr, i14, this.f11039q1, i10, iArr);
        } else if (i15 == 1) {
            m11424h2(c2383eArr, i14, this.f11039q1, i10, iArr);
        } else if (i15 == 2) {
            m11423g2(c2383eArr, i14, this.f11039q1, i10, iArr);
        }
        int iMin = iArr[0] + iM11488t1 + iM11489u1;
        int iMin2 = iArr[1] + iM11490v1 + iM11487s1;
        if (i3 == 1073741824) {
            iMin = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i4);
        } else if (i3 != 0) {
            iMin = 0;
        }
        if (i5 == 1073741824) {
            iMin2 = i6;
        } else if (i5 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i6);
        } else if (i5 != 0) {
            iMin2 = 0;
        }
        m11474B1(iMin, iMin2);
        m11323e1(iMin);
        m11273F0(iMin2);
        m11473A1(this.f11073K0 > 0);
    }

    /* JADX INFO: renamed from: w2 */
    public void m11442w2(int i3) {
        this.f11039q1 = i3;
    }

    /* JADX INFO: renamed from: x2 */
    public void m11443x2(int i3) {
        this.f11036n1 = i3;
    }

    /* JADX INFO: renamed from: y2 */
    public void m11444y2(float f3) {
        this.f11028f1 = f3;
    }

    /* JADX INFO: renamed from: z2 */
    public void m11445z2(int i3) {
        this.f11034l1 = i3;
    }
}
