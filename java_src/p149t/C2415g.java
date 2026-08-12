package p149t;

import p149t.C2414f;

/* JADX INFO: renamed from: t.g */
/* JADX INFO: loaded from: classes.dex */
class C2415g extends C2414f {

    /* JADX INFO: renamed from: m */
    public int f11296m;

    public C2415g(AbstractC2424p abstractC2424p) {
        super(abstractC2424p);
        if (abstractC2424p instanceof C2420l) {
            this.f11279e = C2414f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f11279e = C2414f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p149t.C2414f
    /* JADX INFO: renamed from: d */
    public void mo11618d(int i3) {
        if (this.f11284j) {
            return;
        }
        this.f11284j = true;
        this.f11281g = i3;
        for (InterfaceC2412d interfaceC2412d : this.f11285k) {
            interfaceC2412d.mo11596a(interfaceC2412d);
        }
    }
}
