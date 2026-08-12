package p149t;

import p146s.C2382d;
import p146s.C2383e;
import p146s.InterfaceC2387i;
import p149t.AbstractC2424p;
import p149t.C2414f;

/* JADX INFO: renamed from: t.l */
/* JADX INFO: loaded from: classes.dex */
public class C2420l extends AbstractC2424p {

    /* JADX INFO: renamed from: k */
    private static int[] f11300k = new int[2];

    /* JADX INFO: renamed from: t.l$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f11301a;

        static {
            int[] iArr = new int[AbstractC2424p.b.values().length];
            f11301a = iArr;
            try {
                iArr[AbstractC2424p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11301a[AbstractC2424p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11301a[AbstractC2424p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2420l(C2383e c2383e) {
        super(c2383e);
        this.f11335h.f11279e = C2414f.a.LEFT;
        this.f11336i.f11279e = C2414f.a.RIGHT;
        this.f11333f = 0;
    }

    /* JADX INFO: renamed from: q */
    private void m11634q(int[] iArr, int i3, int i4, int i5, int i6, float f3, int i7) {
        int i8 = i4 - i3;
        int i9 = i6 - i5;
        if (i7 != -1) {
            if (i7 == 0) {
                iArr[0] = (int) ((i9 * f3) + 0.5f);
                iArr[1] = i9;
                return;
            } else {
                if (i7 != 1) {
                    return;
                }
                iArr[0] = i8;
                iArr[1] = (int) ((i8 * f3) + 0.5f);
                return;
            }
        }
        int i10 = (int) ((i9 * f3) + 0.5f);
        int i11 = (int) ((i8 / f3) + 0.5f);
        if (i10 <= i8) {
            iArr[0] = i10;
            iArr[1] = i9;
        } else if (i11 <= i9) {
            iArr[0] = i8;
            iArr[1] = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ca  */
    @Override // p149t.AbstractC2424p, p149t.InterfaceC2412d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo11596a(p149t.InterfaceC2412d r14) {
        /*
            Method dump skipped, instruction units count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149t.C2420l.mo11596a(t.d):void");
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: d */
    void mo11597d() {
        C2383e c2383eM11282K;
        C2383e c2383eM11282K2;
        C2383e c2383e = this.f11329b;
        if (c2383e.f10932a) {
            this.f11332e.mo11618d(c2383e.m11300T());
        }
        if (this.f11332e.f11284j) {
            C2383e.b bVar = this.f11331d;
            C2383e.b bVar2 = C2383e.b.MATCH_PARENT;
            if (bVar == bVar2 && (c2383eM11282K = this.f11329b.m11282K()) != null && (c2383eM11282K.m11262A() == C2383e.b.FIXED || c2383eM11282K.m11262A() == bVar2)) {
                m11652b(this.f11335h, c2383eM11282K.f10940e.f11335h, this.f11329b.f10919N.m11243f());
                m11652b(this.f11336i, c2383eM11282K.f10940e.f11336i, -this.f11329b.f10921P.m11243f());
                return;
            }
        } else {
            C2383e.b bVarM11262A = this.f11329b.m11262A();
            this.f11331d = bVarM11262A;
            if (bVarM11262A != C2383e.b.MATCH_CONSTRAINT) {
                C2383e.b bVar3 = C2383e.b.MATCH_PARENT;
                if (bVarM11262A == bVar3 && (c2383eM11282K2 = this.f11329b.m11282K()) != null && (c2383eM11282K2.m11262A() == C2383e.b.FIXED || c2383eM11282K2.m11262A() == bVar3)) {
                    int iM11300T = (c2383eM11282K2.m11300T() - this.f11329b.f10919N.m11243f()) - this.f11329b.f10921P.m11243f();
                    m11652b(this.f11335h, c2383eM11282K2.f10940e.f11335h, this.f11329b.f10919N.m11243f());
                    m11652b(this.f11336i, c2383eM11282K2.f10940e.f11336i, -this.f11329b.f10921P.m11243f());
                    this.f11332e.mo11618d(iM11300T);
                    return;
                }
                if (this.f11331d == C2383e.b.FIXED) {
                    this.f11332e.mo11618d(this.f11329b.m11300T());
                }
            }
        }
        C2415g c2415g = this.f11332e;
        if (c2415g.f11284j) {
            C2383e c2383e2 = this.f11329b;
            if (c2383e2.f10932a) {
                C2382d[] c2382dArr = c2383e2.f10927V;
                C2382d c2382d = c2382dArr[0];
                C2382d c2382d2 = c2382d.f10882f;
                if (c2382d2 != null && c2382dArr[1].f10882f != null) {
                    if (c2383e2.m11325f0()) {
                        this.f11335h.f11280f = this.f11329b.f10927V[0].m11243f();
                        this.f11336i.f11280f = -this.f11329b.f10927V[1].m11243f();
                        return;
                    }
                    C2414f c2414fM11655h = m11655h(this.f11329b.f10927V[0]);
                    if (c2414fM11655h != null) {
                        m11652b(this.f11335h, c2414fM11655h, this.f11329b.f10927V[0].m11243f());
                    }
                    C2414f c2414fM11655h2 = m11655h(this.f11329b.f10927V[1]);
                    if (c2414fM11655h2 != null) {
                        m11652b(this.f11336i, c2414fM11655h2, -this.f11329b.f10927V[1].m11243f());
                    }
                    this.f11335h.f11276b = true;
                    this.f11336i.f11276b = true;
                    return;
                }
                if (c2382d2 != null) {
                    C2414f c2414fM11655h3 = m11655h(c2382d);
                    if (c2414fM11655h3 != null) {
                        m11652b(this.f11335h, c2414fM11655h3, this.f11329b.f10927V[0].m11243f());
                        m11652b(this.f11336i, this.f11335h, this.f11332e.f11281g);
                        return;
                    }
                    return;
                }
                C2382d c2382d3 = c2382dArr[1];
                if (c2382d3.f10882f != null) {
                    C2414f c2414fM11655h4 = m11655h(c2382d3);
                    if (c2414fM11655h4 != null) {
                        m11652b(this.f11336i, c2414fM11655h4, -this.f11329b.f10927V[1].m11243f());
                        m11652b(this.f11335h, this.f11336i, -this.f11332e.f11281g);
                        return;
                    }
                    return;
                }
                if ((c2383e2 instanceof InterfaceC2387i) || c2383e2.m11282K() == null || this.f11329b.mo11343o(C2382d.b.CENTER).f10882f != null) {
                    return;
                }
                m11652b(this.f11335h, this.f11329b.m11282K().f10940e.f11335h, this.f11329b.m11302U());
                m11652b(this.f11336i, this.f11335h, this.f11332e.f11281g);
                return;
            }
        }
        if (this.f11331d == C2383e.b.MATCH_CONSTRAINT) {
            C2383e c2383e3 = this.f11329b;
            int i3 = c2383e3.f10974v;
            if (i3 == 2) {
                C2383e c2383eM11282K3 = c2383e3.m11282K();
                if (c2383eM11282K3 != null) {
                    C2415g c2415g2 = c2383eM11282K3.f10942f.f11332e;
                    this.f11332e.f11286l.add(c2415g2);
                    c2415g2.f11285k.add(this.f11332e);
                    C2415g c2415g3 = this.f11332e;
                    c2415g3.f11276b = true;
                    c2415g3.f11285k.add(this.f11335h);
                    this.f11332e.f11285k.add(this.f11336i);
                }
            } else if (i3 == 3) {
                if (c2383e3.f10976w == 3) {
                    this.f11335h.f11275a = this;
                    this.f11336i.f11275a = this;
                    C2422n c2422n = c2383e3.f10942f;
                    c2422n.f11335h.f11275a = this;
                    c2422n.f11336i.f11275a = this;
                    c2415g.f11275a = this;
                    if (c2383e3.m11329h0()) {
                        this.f11332e.f11286l.add(this.f11329b.f10942f.f11332e);
                        this.f11329b.f10942f.f11332e.f11285k.add(this.f11332e);
                        C2422n c2422n2 = this.f11329b.f10942f;
                        c2422n2.f11332e.f11275a = this;
                        this.f11332e.f11286l.add(c2422n2.f11335h);
                        this.f11332e.f11286l.add(this.f11329b.f10942f.f11336i);
                        this.f11329b.f10942f.f11335h.f11285k.add(this.f11332e);
                        this.f11329b.f10942f.f11336i.f11285k.add(this.f11332e);
                    } else if (this.f11329b.m11325f0()) {
                        this.f11329b.f10942f.f11332e.f11286l.add(this.f11332e);
                        this.f11332e.f11285k.add(this.f11329b.f10942f.f11332e);
                    } else {
                        this.f11329b.f10942f.f11332e.f11286l.add(this.f11332e);
                    }
                } else {
                    C2415g c2415g4 = c2383e3.f10942f.f11332e;
                    c2415g.f11286l.add(c2415g4);
                    c2415g4.f11285k.add(this.f11332e);
                    this.f11329b.f10942f.f11335h.f11285k.add(this.f11332e);
                    this.f11329b.f10942f.f11336i.f11285k.add(this.f11332e);
                    C2415g c2415g5 = this.f11332e;
                    c2415g5.f11276b = true;
                    c2415g5.f11285k.add(this.f11335h);
                    this.f11332e.f11285k.add(this.f11336i);
                    this.f11335h.f11286l.add(this.f11332e);
                    this.f11336i.f11286l.add(this.f11332e);
                }
            }
        }
        C2383e c2383e4 = this.f11329b;
        C2382d[] c2382dArr2 = c2383e4.f10927V;
        C2382d c2382d4 = c2382dArr2[0];
        C2382d c2382d5 = c2382d4.f10882f;
        if (c2382d5 != null && c2382dArr2[1].f10882f != null) {
            if (c2383e4.m11325f0()) {
                this.f11335h.f11280f = this.f11329b.f10927V[0].m11243f();
                this.f11336i.f11280f = -this.f11329b.f10927V[1].m11243f();
                return;
            }
            C2414f c2414fM11655h5 = m11655h(this.f11329b.f10927V[0]);
            C2414f c2414fM11655h6 = m11655h(this.f11329b.f10927V[1]);
            if (c2414fM11655h5 != null) {
                c2414fM11655h5.m11616b(this);
            }
            if (c2414fM11655h6 != null) {
                c2414fM11655h6.m11616b(this);
            }
            this.f11337j = AbstractC2424p.b.CENTER;
            return;
        }
        if (c2382d5 != null) {
            C2414f c2414fM11655h7 = m11655h(c2382d4);
            if (c2414fM11655h7 != null) {
                m11652b(this.f11335h, c2414fM11655h7, this.f11329b.f10927V[0].m11243f());
                m11653c(this.f11336i, this.f11335h, 1, this.f11332e);
                return;
            }
            return;
        }
        C2382d c2382d6 = c2382dArr2[1];
        if (c2382d6.f10882f != null) {
            C2414f c2414fM11655h8 = m11655h(c2382d6);
            if (c2414fM11655h8 != null) {
                m11652b(this.f11336i, c2414fM11655h8, -this.f11329b.f10927V[1].m11243f());
                m11653c(this.f11335h, this.f11336i, -1, this.f11332e);
                return;
            }
            return;
        }
        if ((c2383e4 instanceof InterfaceC2387i) || c2383e4.m11282K() == null) {
            return;
        }
        m11652b(this.f11335h, this.f11329b.m11282K().f10940e.f11335h, this.f11329b.m11302U());
        m11653c(this.f11336i, this.f11335h, 1, this.f11332e);
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: e */
    public void mo11598e() {
        C2414f c2414f = this.f11335h;
        if (c2414f.f11284j) {
            this.f11329b.m11328g1(c2414f.f11281g);
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: f */
    void mo11599f() {
        this.f11330c = null;
        this.f11335h.m11617c();
        this.f11336i.m11617c();
        this.f11332e.m11617c();
        this.f11334g = false;
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: m */
    boolean mo11601m() {
        return this.f11331d != C2383e.b.MATCH_CONSTRAINT || this.f11329b.f10974v == 0;
    }

    /* JADX INFO: renamed from: r */
    void m11635r() {
        this.f11334g = false;
        this.f11335h.m11617c();
        this.f11335h.f11284j = false;
        this.f11336i.m11617c();
        this.f11336i.f11284j = false;
        this.f11332e.f11284j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f11329b.m11353t();
    }
}
