package p149t;

import java.util.Iterator;
import p146s.C2379a;
import p146s.C2383e;
import p149t.C2414f;

/* JADX INFO: renamed from: t.k */
/* JADX INFO: loaded from: classes.dex */
class C2419k extends AbstractC2424p {
    public C2419k(C2383e c2383e) {
        super(c2383e);
    }

    /* JADX INFO: renamed from: q */
    private void m11633q(C2414f c2414f) {
        this.f11335h.f11285k.add(c2414f);
        c2414f.f11286l.add(this.f11335h);
    }

    @Override // p149t.AbstractC2424p, p149t.InterfaceC2412d
    /* JADX INFO: renamed from: a */
    public void mo11596a(InterfaceC2412d interfaceC2412d) {
        C2379a c2379a = (C2379a) this.f11329b;
        int iM11226p1 = c2379a.m11226p1();
        Iterator it = this.f11335h.f11286l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((C2414f) it.next()).f11281g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (iM11226p1 == 0 || iM11226p1 == 2) {
            this.f11335h.mo11618d(i4 + c2379a.m11227q1());
        } else {
            this.f11335h.mo11618d(i3 + c2379a.m11227q1());
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: d */
    void mo11597d() {
        C2383e c2383e = this.f11329b;
        if (c2383e instanceof C2379a) {
            this.f11335h.f11276b = true;
            C2379a c2379a = (C2379a) c2383e;
            int iM11226p1 = c2379a.m11226p1();
            boolean zM11225o1 = c2379a.m11225o1();
            int i3 = 0;
            if (iM11226p1 == 0) {
                this.f11335h.f11279e = C2414f.a.LEFT;
                while (i3 < c2379a.f11073K0) {
                    C2383e c2383e2 = c2379a.f11072J0[i3];
                    if (zM11225o1 || c2383e2.m11298S() != 8) {
                        C2414f c2414f = c2383e2.f10940e.f11335h;
                        c2414f.f11285k.add(this.f11335h);
                        this.f11335h.f11286l.add(c2414f);
                    }
                    i3++;
                }
                m11633q(this.f11329b.f10940e.f11335h);
                m11633q(this.f11329b.f10940e.f11336i);
                return;
            }
            if (iM11226p1 == 1) {
                this.f11335h.f11279e = C2414f.a.RIGHT;
                while (i3 < c2379a.f11073K0) {
                    C2383e c2383e3 = c2379a.f11072J0[i3];
                    if (zM11225o1 || c2383e3.m11298S() != 8) {
                        C2414f c2414f2 = c2383e3.f10940e.f11336i;
                        c2414f2.f11285k.add(this.f11335h);
                        this.f11335h.f11286l.add(c2414f2);
                    }
                    i3++;
                }
                m11633q(this.f11329b.f10940e.f11335h);
                m11633q(this.f11329b.f10940e.f11336i);
                return;
            }
            if (iM11226p1 == 2) {
                this.f11335h.f11279e = C2414f.a.TOP;
                while (i3 < c2379a.f11073K0) {
                    C2383e c2383e4 = c2379a.f11072J0[i3];
                    if (zM11225o1 || c2383e4.m11298S() != 8) {
                        C2414f c2414f3 = c2383e4.f10942f.f11335h;
                        c2414f3.f11285k.add(this.f11335h);
                        this.f11335h.f11286l.add(c2414f3);
                    }
                    i3++;
                }
                m11633q(this.f11329b.f10942f.f11335h);
                m11633q(this.f11329b.f10942f.f11336i);
                return;
            }
            if (iM11226p1 != 3) {
                return;
            }
            this.f11335h.f11279e = C2414f.a.BOTTOM;
            while (i3 < c2379a.f11073K0) {
                C2383e c2383e5 = c2379a.f11072J0[i3];
                if (zM11225o1 || c2383e5.m11298S() != 8) {
                    C2414f c2414f4 = c2383e5.f10942f.f11336i;
                    c2414f4.f11285k.add(this.f11335h);
                    this.f11335h.f11286l.add(c2414f4);
                }
                i3++;
            }
            m11633q(this.f11329b.f10942f.f11335h);
            m11633q(this.f11329b.f10942f.f11336i);
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: e */
    public void mo11598e() {
        C2383e c2383e = this.f11329b;
        if (c2383e instanceof C2379a) {
            int iM11226p1 = ((C2379a) c2383e).m11226p1();
            if (iM11226p1 == 0 || iM11226p1 == 1) {
                this.f11329b.m11328g1(this.f11335h.f11281g);
            } else {
                this.f11329b.m11330h1(this.f11335h.f11281g);
            }
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: f */
    void mo11599f() {
        this.f11330c = null;
        this.f11335h.m11617c();
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: m */
    boolean mo11601m() {
        return false;
    }
}
