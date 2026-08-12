package p149t;

import p146s.C2383e;
import p146s.C2386h;

/* JADX INFO: renamed from: t.j */
/* JADX INFO: loaded from: classes.dex */
class C2418j extends AbstractC2424p {
    public C2418j(C2383e c2383e) {
        super(c2383e);
        c2383e.f10940e.mo11599f();
        c2383e.f10942f.mo11599f();
        this.f11333f = ((C2386h) c2383e).m11457m1();
    }

    /* JADX INFO: renamed from: q */
    private void m11632q(C2414f c2414f) {
        this.f11335h.f11285k.add(c2414f);
        c2414f.f11286l.add(this.f11335h);
    }

    @Override // p149t.AbstractC2424p, p149t.InterfaceC2412d
    /* JADX INFO: renamed from: a */
    public void mo11596a(InterfaceC2412d interfaceC2412d) {
        C2414f c2414f = this.f11335h;
        if (c2414f.f11277c && !c2414f.f11284j) {
            this.f11335h.mo11618d((int) ((((C2414f) c2414f.f11286l.get(0)).f11281g * ((C2386h) this.f11329b).m11460p1()) + 0.5f));
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: d */
    void mo11597d() {
        C2386h c2386h = (C2386h) this.f11329b;
        int iM11458n1 = c2386h.m11458n1();
        int iM11459o1 = c2386h.m11459o1();
        c2386h.m11460p1();
        if (c2386h.m11457m1() == 1) {
            if (iM11458n1 != -1) {
                this.f11335h.f11286l.add(this.f11329b.f10931Z.f10940e.f11335h);
                this.f11329b.f10931Z.f10940e.f11335h.f11285k.add(this.f11335h);
                this.f11335h.f11280f = iM11458n1;
            } else if (iM11459o1 != -1) {
                this.f11335h.f11286l.add(this.f11329b.f10931Z.f10940e.f11336i);
                this.f11329b.f10931Z.f10940e.f11336i.f11285k.add(this.f11335h);
                this.f11335h.f11280f = -iM11459o1;
            } else {
                C2414f c2414f = this.f11335h;
                c2414f.f11276b = true;
                c2414f.f11286l.add(this.f11329b.f10931Z.f10940e.f11336i);
                this.f11329b.f10931Z.f10940e.f11336i.f11285k.add(this.f11335h);
            }
            m11632q(this.f11329b.f10940e.f11335h);
            m11632q(this.f11329b.f10940e.f11336i);
            return;
        }
        if (iM11458n1 != -1) {
            this.f11335h.f11286l.add(this.f11329b.f10931Z.f10942f.f11335h);
            this.f11329b.f10931Z.f10942f.f11335h.f11285k.add(this.f11335h);
            this.f11335h.f11280f = iM11458n1;
        } else if (iM11459o1 != -1) {
            this.f11335h.f11286l.add(this.f11329b.f10931Z.f10942f.f11336i);
            this.f11329b.f10931Z.f10942f.f11336i.f11285k.add(this.f11335h);
            this.f11335h.f11280f = -iM11459o1;
        } else {
            C2414f c2414f2 = this.f11335h;
            c2414f2.f11276b = true;
            c2414f2.f11286l.add(this.f11329b.f10931Z.f10942f.f11336i);
            this.f11329b.f10931Z.f10942f.f11336i.f11285k.add(this.f11335h);
        }
        m11632q(this.f11329b.f10942f.f11335h);
        m11632q(this.f11329b.f10942f.f11336i);
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: e */
    public void mo11598e() {
        if (((C2386h) this.f11329b).m11457m1() == 1) {
            this.f11329b.m11328g1(this.f11335h.f11281g);
        } else {
            this.f11329b.m11330h1(this.f11335h.f11281g);
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: f */
    void mo11599f() {
        this.f11335h.m11617c();
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: m */
    boolean mo11601m() {
        return false;
    }
}
