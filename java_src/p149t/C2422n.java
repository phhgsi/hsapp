package p149t;

import p146s.C2382d;
import p146s.C2383e;
import p146s.InterfaceC2387i;
import p149t.AbstractC2424p;
import p149t.C2414f;

/* JADX INFO: renamed from: t.n */
/* JADX INFO: loaded from: classes.dex */
public class C2422n extends AbstractC2424p {

    /* JADX INFO: renamed from: k */
    public C2414f f11310k;

    /* JADX INFO: renamed from: l */
    C2415g f11311l;

    /* JADX INFO: renamed from: t.n$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f11312a;

        static {
            int[] iArr = new int[AbstractC2424p.b.values().length];
            f11312a = iArr;
            try {
                iArr[AbstractC2424p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11312a[AbstractC2424p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11312a[AbstractC2424p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2422n(C2383e c2383e) {
        super(c2383e);
        C2414f c2414f = new C2414f(this);
        this.f11310k = c2414f;
        this.f11311l = null;
        this.f11335h.f11279e = C2414f.a.TOP;
        this.f11336i.f11279e = C2414f.a.BOTTOM;
        c2414f.f11279e = C2414f.a.BASELINE;
        this.f11333f = 1;
    }

    @Override // p149t.AbstractC2424p, p149t.InterfaceC2412d
    /* JADX INFO: renamed from: a */
    public void mo11596a(InterfaceC2412d interfaceC2412d) {
        float f3;
        float fM11357v;
        float fM11357v2;
        int i3;
        int i4 = a.f11312a[this.f11337j.ordinal()];
        if (i4 == 1) {
            m11660p(interfaceC2412d);
        } else if (i4 == 2) {
            m11659o(interfaceC2412d);
        } else if (i4 == 3) {
            C2383e c2383e = this.f11329b;
            m11658n(interfaceC2412d, c2383e.f10920O, c2383e.f10922Q, 1);
            return;
        }
        C2415g c2415g = this.f11332e;
        if (c2415g.f11277c && !c2415g.f11284j && this.f11331d == C2383e.b.MATCH_CONSTRAINT) {
            C2383e c2383e2 = this.f11329b;
            int i5 = c2383e2.f10976w;
            if (i5 == 2) {
                C2383e c2383eM11282K = c2383e2.m11282K();
                if (c2383eM11282K != null) {
                    if (c2383eM11282K.f10942f.f11332e.f11284j) {
                        this.f11332e.mo11618d((int) ((r7.f11281g * this.f11329b.f10904D) + 0.5f));
                    }
                }
            } else if (i5 == 3 && c2383e2.f10940e.f11332e.f11284j) {
                int iM11359w = c2383e2.m11359w();
                if (iM11359w == -1) {
                    C2383e c2383e3 = this.f11329b;
                    f3 = c2383e3.f10940e.f11332e.f11281g;
                    fM11357v = c2383e3.m11357v();
                } else if (iM11359w == 0) {
                    fM11357v2 = r7.f10940e.f11332e.f11281g * this.f11329b.m11357v();
                    i3 = (int) (fM11357v2 + 0.5f);
                    this.f11332e.mo11618d(i3);
                } else if (iM11359w != 1) {
                    i3 = 0;
                    this.f11332e.mo11618d(i3);
                } else {
                    C2383e c2383e4 = this.f11329b;
                    f3 = c2383e4.f10940e.f11332e.f11281g;
                    fM11357v = c2383e4.m11357v();
                }
                fM11357v2 = f3 / fM11357v;
                i3 = (int) (fM11357v2 + 0.5f);
                this.f11332e.mo11618d(i3);
            }
        }
        C2414f c2414f = this.f11335h;
        if (c2414f.f11277c) {
            C2414f c2414f2 = this.f11336i;
            if (c2414f2.f11277c) {
                if (c2414f.f11284j && c2414f2.f11284j && this.f11332e.f11284j) {
                    return;
                }
                if (!this.f11332e.f11284j && this.f11331d == C2383e.b.MATCH_CONSTRAINT) {
                    C2383e c2383e5 = this.f11329b;
                    if (c2383e5.f10974v == 0 && !c2383e5.m11329h0()) {
                        C2414f c2414f3 = (C2414f) this.f11335h.f11286l.get(0);
                        C2414f c2414f4 = (C2414f) this.f11336i.f11286l.get(0);
                        int i6 = c2414f3.f11281g;
                        C2414f c2414f5 = this.f11335h;
                        int i7 = i6 + c2414f5.f11280f;
                        int i8 = c2414f4.f11281g + this.f11336i.f11280f;
                        c2414f5.mo11618d(i7);
                        this.f11336i.mo11618d(i8);
                        this.f11332e.mo11618d(i8 - i7);
                        return;
                    }
                }
                if (!this.f11332e.f11284j && this.f11331d == C2383e.b.MATCH_CONSTRAINT && this.f11328a == 1 && this.f11335h.f11286l.size() > 0 && this.f11336i.f11286l.size() > 0) {
                    C2414f c2414f6 = (C2414f) this.f11335h.f11286l.get(0);
                    int i9 = (((C2414f) this.f11336i.f11286l.get(0)).f11281g + this.f11336i.f11280f) - (c2414f6.f11281g + this.f11335h.f11280f);
                    C2415g c2415g2 = this.f11332e;
                    int i10 = c2415g2.f11296m;
                    if (i9 < i10) {
                        c2415g2.mo11618d(i9);
                    } else {
                        c2415g2.mo11618d(i10);
                    }
                }
                if (this.f11332e.f11284j && this.f11335h.f11286l.size() > 0 && this.f11336i.f11286l.size() > 0) {
                    C2414f c2414f7 = (C2414f) this.f11335h.f11286l.get(0);
                    C2414f c2414f8 = (C2414f) this.f11336i.f11286l.get(0);
                    int i11 = c2414f7.f11281g + this.f11335h.f11280f;
                    int i12 = c2414f8.f11281g + this.f11336i.f11280f;
                    float fM11290O = this.f11329b.m11290O();
                    if (c2414f7 == c2414f8) {
                        i11 = c2414f7.f11281g;
                        i12 = c2414f8.f11281g;
                        fM11290O = 0.5f;
                    }
                    this.f11335h.mo11618d((int) (i11 + 0.5f + (((i12 - i11) - this.f11332e.f11281g) * fM11290O)));
                    this.f11336i.mo11618d(this.f11335h.f11281g + this.f11332e.f11281g);
                }
            }
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: d */
    void mo11597d() {
        C2383e c2383eM11282K;
        C2383e c2383eM11282K2;
        C2383e c2383e = this.f11329b;
        if (c2383e.f10932a) {
            this.f11332e.mo11618d(c2383e.m11361x());
        }
        if (!this.f11332e.f11284j) {
            this.f11331d = this.f11329b.m11294Q();
            if (this.f11329b.m11306W()) {
                this.f11311l = new C2409a(this);
            }
            C2383e.b bVar = this.f11331d;
            if (bVar != C2383e.b.MATCH_CONSTRAINT) {
                if (bVar == C2383e.b.MATCH_PARENT && (c2383eM11282K2 = this.f11329b.m11282K()) != null && c2383eM11282K2.m11294Q() == C2383e.b.FIXED) {
                    int iM11361x = (c2383eM11282K2.m11361x() - this.f11329b.f10920O.m11243f()) - this.f11329b.f10922Q.m11243f();
                    m11652b(this.f11335h, c2383eM11282K2.f10942f.f11335h, this.f11329b.f10920O.m11243f());
                    m11652b(this.f11336i, c2383eM11282K2.f10942f.f11336i, -this.f11329b.f10922Q.m11243f());
                    this.f11332e.mo11618d(iM11361x);
                    return;
                }
                if (this.f11331d == C2383e.b.FIXED) {
                    this.f11332e.mo11618d(this.f11329b.m11361x());
                }
            }
        } else if (this.f11331d == C2383e.b.MATCH_PARENT && (c2383eM11282K = this.f11329b.m11282K()) != null && c2383eM11282K.m11294Q() == C2383e.b.FIXED) {
            m11652b(this.f11335h, c2383eM11282K.f10942f.f11335h, this.f11329b.f10920O.m11243f());
            m11652b(this.f11336i, c2383eM11282K.f10942f.f11336i, -this.f11329b.f10922Q.m11243f());
            return;
        }
        C2415g c2415g = this.f11332e;
        boolean z2 = c2415g.f11284j;
        if (z2) {
            C2383e c2383e2 = this.f11329b;
            if (c2383e2.f10932a) {
                C2382d[] c2382dArr = c2383e2.f10927V;
                C2382d c2382d = c2382dArr[2];
                C2382d c2382d2 = c2382d.f10882f;
                if (c2382d2 != null && c2382dArr[3].f10882f != null) {
                    if (c2383e2.m11329h0()) {
                        this.f11335h.f11280f = this.f11329b.f10927V[2].m11243f();
                        this.f11336i.f11280f = -this.f11329b.f10927V[3].m11243f();
                    } else {
                        C2414f c2414fM11655h = m11655h(this.f11329b.f10927V[2]);
                        if (c2414fM11655h != null) {
                            m11652b(this.f11335h, c2414fM11655h, this.f11329b.f10927V[2].m11243f());
                        }
                        C2414f c2414fM11655h2 = m11655h(this.f11329b.f10927V[3]);
                        if (c2414fM11655h2 != null) {
                            m11652b(this.f11336i, c2414fM11655h2, -this.f11329b.f10927V[3].m11243f());
                        }
                        this.f11335h.f11276b = true;
                        this.f11336i.f11276b = true;
                    }
                    if (this.f11329b.m11306W()) {
                        m11652b(this.f11310k, this.f11335h, this.f11329b.m11345p());
                        return;
                    }
                    return;
                }
                if (c2382d2 != null) {
                    C2414f c2414fM11655h3 = m11655h(c2382d);
                    if (c2414fM11655h3 != null) {
                        m11652b(this.f11335h, c2414fM11655h3, this.f11329b.f10927V[2].m11243f());
                        m11652b(this.f11336i, this.f11335h, this.f11332e.f11281g);
                        if (this.f11329b.m11306W()) {
                            m11652b(this.f11310k, this.f11335h, this.f11329b.m11345p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C2382d c2382d3 = c2382dArr[3];
                if (c2382d3.f10882f != null) {
                    C2414f c2414fM11655h4 = m11655h(c2382d3);
                    if (c2414fM11655h4 != null) {
                        m11652b(this.f11336i, c2414fM11655h4, -this.f11329b.f10927V[3].m11243f());
                        m11652b(this.f11335h, this.f11336i, -this.f11332e.f11281g);
                    }
                    if (this.f11329b.m11306W()) {
                        m11652b(this.f11310k, this.f11335h, this.f11329b.m11345p());
                        return;
                    }
                    return;
                }
                C2382d c2382d4 = c2382dArr[4];
                if (c2382d4.f10882f != null) {
                    C2414f c2414fM11655h5 = m11655h(c2382d4);
                    if (c2414fM11655h5 != null) {
                        m11652b(this.f11310k, c2414fM11655h5, 0);
                        m11652b(this.f11335h, this.f11310k, -this.f11329b.m11345p());
                        m11652b(this.f11336i, this.f11335h, this.f11332e.f11281g);
                        return;
                    }
                    return;
                }
                if ((c2383e2 instanceof InterfaceC2387i) || c2383e2.m11282K() == null || this.f11329b.mo11343o(C2382d.b.CENTER).f10882f != null) {
                    return;
                }
                m11652b(this.f11335h, this.f11329b.m11282K().f10942f.f11335h, this.f11329b.m11304V());
                m11652b(this.f11336i, this.f11335h, this.f11332e.f11281g);
                if (this.f11329b.m11306W()) {
                    m11652b(this.f11310k, this.f11335h, this.f11329b.m11345p());
                    return;
                }
                return;
            }
        }
        if (z2 || this.f11331d != C2383e.b.MATCH_CONSTRAINT) {
            c2415g.m11616b(this);
        } else {
            C2383e c2383e3 = this.f11329b;
            int i3 = c2383e3.f10976w;
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
            } else if (i3 == 3 && !c2383e3.m11329h0()) {
                C2383e c2383e4 = this.f11329b;
                if (c2383e4.f10974v != 3) {
                    C2415g c2415g4 = c2383e4.f10940e.f11332e;
                    this.f11332e.f11286l.add(c2415g4);
                    c2415g4.f11285k.add(this.f11332e);
                    C2415g c2415g5 = this.f11332e;
                    c2415g5.f11276b = true;
                    c2415g5.f11285k.add(this.f11335h);
                    this.f11332e.f11285k.add(this.f11336i);
                }
            }
        }
        C2383e c2383e5 = this.f11329b;
        C2382d[] c2382dArr2 = c2383e5.f10927V;
        C2382d c2382d5 = c2382dArr2[2];
        C2382d c2382d6 = c2382d5.f10882f;
        if (c2382d6 != null && c2382dArr2[3].f10882f != null) {
            if (c2383e5.m11329h0()) {
                this.f11335h.f11280f = this.f11329b.f10927V[2].m11243f();
                this.f11336i.f11280f = -this.f11329b.f10927V[3].m11243f();
            } else {
                C2414f c2414fM11655h6 = m11655h(this.f11329b.f10927V[2]);
                C2414f c2414fM11655h7 = m11655h(this.f11329b.f10927V[3]);
                if (c2414fM11655h6 != null) {
                    c2414fM11655h6.m11616b(this);
                }
                if (c2414fM11655h7 != null) {
                    c2414fM11655h7.m11616b(this);
                }
                this.f11337j = AbstractC2424p.b.CENTER;
            }
            if (this.f11329b.m11306W()) {
                m11653c(this.f11310k, this.f11335h, 1, this.f11311l);
            }
        } else if (c2382d6 != null) {
            C2414f c2414fM11655h8 = m11655h(c2382d5);
            if (c2414fM11655h8 != null) {
                m11652b(this.f11335h, c2414fM11655h8, this.f11329b.f10927V[2].m11243f());
                m11653c(this.f11336i, this.f11335h, 1, this.f11332e);
                if (this.f11329b.m11306W()) {
                    m11653c(this.f11310k, this.f11335h, 1, this.f11311l);
                }
                C2383e.b bVar2 = this.f11331d;
                C2383e.b bVar3 = C2383e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f11329b.m11357v() > 0.0f) {
                    C2420l c2420l = this.f11329b.f10940e;
                    if (c2420l.f11331d == bVar3) {
                        c2420l.f11332e.f11285k.add(this.f11332e);
                        this.f11332e.f11286l.add(this.f11329b.f10940e.f11332e);
                        this.f11332e.f11275a = this;
                    }
                }
            }
        } else {
            C2382d c2382d7 = c2382dArr2[3];
            if (c2382d7.f10882f != null) {
                C2414f c2414fM11655h9 = m11655h(c2382d7);
                if (c2414fM11655h9 != null) {
                    m11652b(this.f11336i, c2414fM11655h9, -this.f11329b.f10927V[3].m11243f());
                    m11653c(this.f11335h, this.f11336i, -1, this.f11332e);
                    if (this.f11329b.m11306W()) {
                        m11653c(this.f11310k, this.f11335h, 1, this.f11311l);
                    }
                }
            } else {
                C2382d c2382d8 = c2382dArr2[4];
                if (c2382d8.f10882f != null) {
                    C2414f c2414fM11655h10 = m11655h(c2382d8);
                    if (c2414fM11655h10 != null) {
                        m11652b(this.f11310k, c2414fM11655h10, 0);
                        m11653c(this.f11335h, this.f11310k, -1, this.f11311l);
                        m11653c(this.f11336i, this.f11335h, 1, this.f11332e);
                    }
                } else if (!(c2383e5 instanceof InterfaceC2387i) && c2383e5.m11282K() != null) {
                    m11652b(this.f11335h, this.f11329b.m11282K().f10942f.f11335h, this.f11329b.m11304V());
                    m11653c(this.f11336i, this.f11335h, 1, this.f11332e);
                    if (this.f11329b.m11306W()) {
                        m11653c(this.f11310k, this.f11335h, 1, this.f11311l);
                    }
                    C2383e.b bVar4 = this.f11331d;
                    C2383e.b bVar5 = C2383e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f11329b.m11357v() > 0.0f) {
                        C2420l c2420l2 = this.f11329b.f10940e;
                        if (c2420l2.f11331d == bVar5) {
                            c2420l2.f11332e.f11285k.add(this.f11332e);
                            this.f11332e.f11286l.add(this.f11329b.f10940e.f11332e);
                            this.f11332e.f11275a = this;
                        }
                    }
                }
            }
        }
        if (this.f11332e.f11286l.size() == 0) {
            this.f11332e.f11277c = true;
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: e */
    public void mo11598e() {
        C2414f c2414f = this.f11335h;
        if (c2414f.f11284j) {
            this.f11329b.m11330h1(c2414f.f11281g);
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: f */
    void mo11599f() {
        this.f11330c = null;
        this.f11335h.m11617c();
        this.f11336i.m11617c();
        this.f11310k.m11617c();
        this.f11332e.m11617c();
        this.f11334g = false;
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: m */
    boolean mo11601m() {
        return this.f11331d != C2383e.b.MATCH_CONSTRAINT || this.f11329b.f10976w == 0;
    }

    /* JADX INFO: renamed from: q */
    void m11640q() {
        this.f11334g = false;
        this.f11335h.m11617c();
        this.f11335h.f11284j = false;
        this.f11336i.m11617c();
        this.f11336i.f11284j = false;
        this.f11310k.m11617c();
        this.f11310k.f11284j = false;
        this.f11332e.f11284j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f11329b.m11353t();
    }
}
