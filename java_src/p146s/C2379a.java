package p146s;

import p137p.C2306d;
import p137p.C2311i;
import p146s.C2382d;
import p146s.C2383e;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: loaded from: classes.dex */
public class C2379a extends AbstractC2388j {

    /* JADX INFO: renamed from: L0 */
    private int f10851L0 = 0;

    /* JADX INFO: renamed from: M0 */
    private boolean f10852M0 = true;

    /* JADX INFO: renamed from: N0 */
    private int f10853N0 = 0;

    /* JADX INFO: renamed from: O0 */
    boolean f10854O0 = false;

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: g */
    public void mo11220g(C2306d c2306d, boolean z2) {
        C2382d[] c2382dArr;
        boolean z3;
        int i3;
        int i4;
        int i5;
        C2382d[] c2382dArr2 = this.f10927V;
        c2382dArr2[0] = this.f10919N;
        c2382dArr2[2] = this.f10920O;
        c2382dArr2[1] = this.f10921P;
        c2382dArr2[3] = this.f10922Q;
        int i6 = 0;
        while (true) {
            c2382dArr = this.f10927V;
            if (i6 >= c2382dArr.length) {
                break;
            }
            C2382d c2382d = c2382dArr[i6];
            c2382d.f10885i = c2306d.m11043q(c2382d);
            i6++;
        }
        int i7 = this.f10851L0;
        if (i7 < 0 || i7 >= 4) {
            return;
        }
        C2382d c2382d2 = c2382dArr[i7];
        if (!this.f10854O0) {
            m11224n1();
        }
        if (this.f10854O0) {
            this.f10854O0 = false;
            int i8 = this.f10851L0;
            if (i8 == 0 || i8 == 1) {
                c2306d.m11034f(this.f10919N.f10885i, this.f10941e0);
                c2306d.m11034f(this.f10921P.f10885i, this.f10941e0);
                return;
            } else {
                if (i8 == 2 || i8 == 3) {
                    c2306d.m11034f(this.f10920O.f10885i, this.f10943f0);
                    c2306d.m11034f(this.f10922Q.f10885i, this.f10943f0);
                    return;
                }
                return;
            }
        }
        for (int i9 = 0; i9 < this.f11073K0; i9++) {
            C2383e c2383e = this.f11072J0[i9];
            if ((this.f10852M0 || c2383e.mo11221h()) && ((((i4 = this.f10851L0) == 0 || i4 == 1) && c2383e.m11262A() == C2383e.b.MATCH_CONSTRAINT && c2383e.f10919N.f10882f != null && c2383e.f10921P.f10882f != null) || (((i5 = this.f10851L0) == 2 || i5 == 3) && c2383e.m11294Q() == C2383e.b.MATCH_CONSTRAINT && c2383e.f10920O.f10882f != null && c2383e.f10922Q.f10882f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = this.f10919N.m11249l() || this.f10921P.m11249l();
        boolean z5 = this.f10920O.m11249l() || this.f10922Q.m11249l();
        int i10 = !(!z3 && (((i3 = this.f10851L0) == 0 && z4) || ((i3 == 2 && z5) || ((i3 == 1 && z4) || (i3 == 3 && z5))))) ? 4 : 5;
        for (int i11 = 0; i11 < this.f11073K0; i11++) {
            C2383e c2383e2 = this.f11072J0[i11];
            if (this.f10852M0 || c2383e2.mo11221h()) {
                C2311i c2311iM11043q = c2306d.m11043q(c2383e2.f10927V[this.f10851L0]);
                C2382d[] c2382dArr3 = c2383e2.f10927V;
                int i12 = this.f10851L0;
                C2382d c2382d3 = c2382dArr3[i12];
                c2382d3.f10885i = c2311iM11043q;
                C2382d c2382d4 = c2382d3.f10882f;
                int i13 = (c2382d4 == null || c2382d4.f10880d != this) ? 0 : c2382d3.f10883g;
                if (i12 == 0 || i12 == 2) {
                    c2306d.m11037i(c2382d2.f10885i, c2311iM11043q, this.f10853N0 - i13, z3);
                } else {
                    c2306d.m11035g(c2382d2.f10885i, c2311iM11043q, this.f10853N0 + i13, z3);
                }
                c2306d.m11033e(c2382d2.f10885i, c2311iM11043q, this.f10853N0 + i13, i10);
            }
        }
        int i14 = this.f10851L0;
        if (i14 == 0) {
            c2306d.m11033e(this.f10921P.f10885i, this.f10919N.f10885i, 0, 8);
            c2306d.m11033e(this.f10919N.f10885i, this.f10931Z.f10921P.f10885i, 0, 4);
            c2306d.m11033e(this.f10919N.f10885i, this.f10931Z.f10919N.f10885i, 0, 0);
            return;
        }
        if (i14 == 1) {
            c2306d.m11033e(this.f10919N.f10885i, this.f10921P.f10885i, 0, 8);
            c2306d.m11033e(this.f10919N.f10885i, this.f10931Z.f10919N.f10885i, 0, 4);
            c2306d.m11033e(this.f10919N.f10885i, this.f10931Z.f10921P.f10885i, 0, 0);
        } else if (i14 == 2) {
            c2306d.m11033e(this.f10922Q.f10885i, this.f10920O.f10885i, 0, 8);
            c2306d.m11033e(this.f10920O.f10885i, this.f10931Z.f10922Q.f10885i, 0, 4);
            c2306d.m11033e(this.f10920O.f10885i, this.f10931Z.f10920O.f10885i, 0, 0);
        } else if (i14 == 3) {
            c2306d.m11033e(this.f10920O.f10885i, this.f10922Q.f10885i, 0, 8);
            c2306d.m11033e(this.f10920O.f10885i, this.f10931Z.f10920O.f10885i, 0, 4);
            c2306d.m11033e(this.f10920O.f10885i, this.f10931Z.f10922Q.f10885i, 0, 0);
        }
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: h */
    public boolean mo11221h() {
        return true;
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: k0 */
    public boolean mo11222k0() {
        return this.f10854O0;
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: l0 */
    public boolean mo11223l0() {
        return this.f10854O0;
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m11224n1() {
        int i3;
        int i4;
        int i5;
        boolean z2 = true;
        int i6 = 0;
        while (true) {
            i3 = this.f11073K0;
            if (i6 >= i3) {
                break;
            }
            C2383e c2383e = this.f11072J0[i6];
            if ((this.f10852M0 || c2383e.mo11221h()) && ((((i4 = this.f10851L0) == 0 || i4 == 1) && !c2383e.mo11222k0()) || (((i5 = this.f10851L0) == 2 || i5 == 3) && !c2383e.mo11223l0()))) {
                z2 = false;
            }
            i6++;
        }
        if (!z2 || i3 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z3 = false;
        for (int i7 = 0; i7 < this.f11073K0; i7++) {
            C2383e c2383e2 = this.f11072J0[i7];
            if (this.f10852M0 || c2383e2.mo11221h()) {
                if (!z3) {
                    int i8 = this.f10851L0;
                    if (i8 == 0) {
                        iMax = c2383e2.mo11343o(C2382d.b.LEFT).m11242e();
                    } else if (i8 == 1) {
                        iMax = c2383e2.mo11343o(C2382d.b.RIGHT).m11242e();
                    } else if (i8 == 2) {
                        iMax = c2383e2.mo11343o(C2382d.b.TOP).m11242e();
                    } else if (i8 == 3) {
                        iMax = c2383e2.mo11343o(C2382d.b.BOTTOM).m11242e();
                    }
                    z3 = true;
                }
                int i9 = this.f10851L0;
                if (i9 == 0) {
                    iMax = Math.min(iMax, c2383e2.mo11343o(C2382d.b.LEFT).m11242e());
                } else if (i9 == 1) {
                    iMax = Math.max(iMax, c2383e2.mo11343o(C2382d.b.RIGHT).m11242e());
                } else if (i9 == 2) {
                    iMax = Math.min(iMax, c2383e2.mo11343o(C2382d.b.TOP).m11242e());
                } else if (i9 == 3) {
                    iMax = Math.max(iMax, c2383e2.mo11343o(C2382d.b.BOTTOM).m11242e());
                }
            }
        }
        int i10 = iMax + this.f10853N0;
        int i11 = this.f10851L0;
        if (i11 == 0 || i11 == 1) {
            m11366z0(i10, i10);
        } else {
            m11267C0(i10, i10);
        }
        this.f10854O0 = true;
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m11225o1() {
        return this.f10852M0;
    }

    /* JADX INFO: renamed from: p1 */
    public int m11226p1() {
        return this.f10851L0;
    }

    /* JADX INFO: renamed from: q1 */
    public int m11227q1() {
        return this.f10853N0;
    }

    /* JADX INFO: renamed from: r1 */
    public int m11228r1() {
        int i3 = this.f10851L0;
        if (i3 == 0 || i3 == 1) {
            return 0;
        }
        return (i3 == 2 || i3 == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: s1 */
    protected void m11229s1() {
        for (int i3 = 0; i3 < this.f11073K0; i3++) {
            C2383e c2383e = this.f11072J0[i3];
            if (this.f10852M0 || c2383e.mo11221h()) {
                int i4 = this.f10851L0;
                if (i4 == 0 || i4 == 1) {
                    c2383e.m11287M0(0, true);
                } else if (i4 == 2 || i4 == 3) {
                    c2383e.m11287M0(1, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m11230t1(boolean z2) {
        this.f10852M0 = z2;
    }

    @Override // p146s.C2383e
    public String toString() {
        String str = "[Barrier] " + m11353t() + " {";
        for (int i3 = 0; i3 < this.f11073K0; i3++) {
            C2383e c2383e = this.f11072J0[i3];
            if (i3 > 0) {
                str = str + ", ";
            }
            str = str + c2383e.m11353t();
        }
        return str + "}";
    }

    /* JADX INFO: renamed from: u1 */
    public void m11231u1(int i3) {
        this.f10851L0 = i3;
    }

    /* JADX INFO: renamed from: v1 */
    public void m11232v1(int i3) {
        this.f10853N0 = i3;
    }
}
