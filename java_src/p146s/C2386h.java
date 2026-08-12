package p146s;

import p137p.C2306d;
import p137p.C2311i;
import p146s.C2382d;
import p146s.C2383e;

/* JADX INFO: renamed from: s.h */
/* JADX INFO: loaded from: classes.dex */
public class C2386h extends C2383e {

    /* JADX INFO: renamed from: J0 */
    protected float f11064J0 = -1.0f;

    /* JADX INFO: renamed from: K0 */
    protected int f11065K0 = -1;

    /* JADX INFO: renamed from: L0 */
    protected int f11066L0 = -1;

    /* JADX INFO: renamed from: M0 */
    private C2382d f11067M0 = this.f10920O;

    /* JADX INFO: renamed from: N0 */
    private int f11068N0 = 0;

    /* JADX INFO: renamed from: O0 */
    private int f11069O0 = 0;

    /* JADX INFO: renamed from: P0 */
    private boolean f11070P0;

    /* JADX INFO: renamed from: s.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f11071a;

        static {
            int[] iArr = new int[C2382d.b.values().length];
            f11071a = iArr;
            try {
                iArr[C2382d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11071a[C2382d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11071a[C2382d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11071a[C2382d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11071a[C2382d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11071a[C2382d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11071a[C2382d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11071a[C2382d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11071a[C2382d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C2386h() {
        this.f10928W.clear();
        this.f10928W.add(this.f11067M0);
        int length = this.f10927V.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f10927V[i3] = this.f11067M0;
        }
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: g */
    public void mo11220g(C2306d c2306d, boolean z2) {
        C2384f c2384f = (C2384f) m11282K();
        if (c2384f == null) {
            return;
        }
        C2382d c2382dMo11343o = c2384f.mo11343o(C2382d.b.LEFT);
        C2382d c2382dMo11343o2 = c2384f.mo11343o(C2382d.b.RIGHT);
        C2383e c2383e = this.f10931Z;
        boolean z3 = c2383e != null && c2383e.f10930Y[0] == C2383e.b.WRAP_CONTENT;
        if (this.f11068N0 == 0) {
            c2382dMo11343o = c2384f.mo11343o(C2382d.b.TOP);
            c2382dMo11343o2 = c2384f.mo11343o(C2382d.b.BOTTOM);
            C2383e c2383e2 = this.f10931Z;
            z3 = c2383e2 != null && c2383e2.f10930Y[1] == C2383e.b.WRAP_CONTENT;
        }
        if (this.f11070P0 && this.f11067M0.m11251n()) {
            C2311i c2311iM11043q = c2306d.m11043q(this.f11067M0);
            c2306d.m11034f(c2311iM11043q, this.f11067M0.m11242e());
            if (this.f11065K0 != -1) {
                if (z3) {
                    c2306d.m11036h(c2306d.m11043q(c2382dMo11343o2), c2311iM11043q, 0, 5);
                }
            } else if (this.f11066L0 != -1 && z3) {
                C2311i c2311iM11043q2 = c2306d.m11043q(c2382dMo11343o2);
                c2306d.m11036h(c2311iM11043q, c2306d.m11043q(c2382dMo11343o), 0, 5);
                c2306d.m11036h(c2311iM11043q2, c2311iM11043q, 0, 5);
            }
            this.f11070P0 = false;
            return;
        }
        if (this.f11065K0 != -1) {
            C2311i c2311iM11043q3 = c2306d.m11043q(this.f11067M0);
            c2306d.m11033e(c2311iM11043q3, c2306d.m11043q(c2382dMo11343o), this.f11065K0, 8);
            if (z3) {
                c2306d.m11036h(c2306d.m11043q(c2382dMo11343o2), c2311iM11043q3, 0, 5);
                return;
            }
            return;
        }
        if (this.f11066L0 == -1) {
            if (this.f11064J0 != -1.0f) {
                c2306d.m11032d(C2306d.m11024s(c2306d, c2306d.m11043q(this.f11067M0), c2306d.m11043q(c2382dMo11343o2), this.f11064J0));
                return;
            }
            return;
        }
        C2311i c2311iM11043q4 = c2306d.m11043q(this.f11067M0);
        C2311i c2311iM11043q5 = c2306d.m11043q(c2382dMo11343o2);
        c2306d.m11033e(c2311iM11043q4, c2311iM11043q5, -this.f11066L0, 8);
        if (z3) {
            c2306d.m11036h(c2311iM11043q4, c2306d.m11043q(c2382dMo11343o), 0, 5);
            c2306d.m11036h(c2311iM11043q5, c2311iM11043q4, 0, 5);
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
        return this.f11070P0;
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: k1 */
    public void mo11337k1(C2306d c2306d, boolean z2) {
        if (m11282K() == null) {
            return;
        }
        int iM11047x = c2306d.m11047x(this.f11067M0);
        if (this.f11068N0 == 1) {
            m11328g1(iM11047x);
            m11330h1(0);
            m11273F0(m11282K().m11361x());
            m11323e1(0);
            return;
        }
        m11328g1(0);
        m11330h1(iM11047x);
        m11323e1(m11282K().m11300T());
        m11273F0(0);
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: l0 */
    public boolean mo11223l0() {
        return this.f11070P0;
    }

    /* JADX INFO: renamed from: l1 */
    public C2382d m11456l1() {
        return this.f11067M0;
    }

    /* JADX INFO: renamed from: m1 */
    public int m11457m1() {
        return this.f11068N0;
    }

    /* JADX INFO: renamed from: n1 */
    public int m11458n1() {
        return this.f11065K0;
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: o */
    public C2382d mo11343o(C2382d.b bVar) {
        int i3 = a.f11071a[bVar.ordinal()];
        if (i3 == 1 || i3 == 2) {
            if (this.f11068N0 == 1) {
                return this.f11067M0;
            }
            return null;
        }
        if ((i3 == 3 || i3 == 4) && this.f11068N0 == 0) {
            return this.f11067M0;
        }
        return null;
    }

    /* JADX INFO: renamed from: o1 */
    public int m11459o1() {
        return this.f11066L0;
    }

    /* JADX INFO: renamed from: p1 */
    public float m11460p1() {
        return this.f11064J0;
    }

    /* JADX INFO: renamed from: q1 */
    public void m11461q1(int i3) {
        this.f11067M0.m11257t(i3);
        this.f11070P0 = true;
    }

    /* JADX INFO: renamed from: r1 */
    public void m11462r1(int i3) {
        if (i3 > -1) {
            this.f11064J0 = -1.0f;
            this.f11065K0 = i3;
            this.f11066L0 = -1;
        }
    }

    /* JADX INFO: renamed from: s1 */
    public void m11463s1(int i3) {
        if (i3 > -1) {
            this.f11064J0 = -1.0f;
            this.f11065K0 = -1;
            this.f11066L0 = i3;
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m11464t1(float f3) {
        if (f3 > -1.0f) {
            this.f11064J0 = f3;
            this.f11065K0 = -1;
            this.f11066L0 = -1;
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m11465u1(int i3) {
        if (this.f11068N0 == i3) {
            return;
        }
        this.f11068N0 = i3;
        this.f10928W.clear();
        if (this.f11068N0 == 1) {
            this.f11067M0 = this.f10919N;
        } else {
            this.f11067M0 = this.f10920O;
        }
        this.f10928W.add(this.f11067M0);
        int length = this.f10927V.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f10927V[i4] = this.f11067M0;
        }
    }
}
