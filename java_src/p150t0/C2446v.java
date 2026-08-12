package p150t0;

import p001A0.C0019r;
import p001A0.C0023v;
import p010D0.InterfaceC0092a;
import p032K1.InterfaceC0359a;
import p156v0.InterfaceC2475b;
import p168z0.InterfaceC2598e;

/* JADX INFO: renamed from: t0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2446v implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f11427a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0359a f11428b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0359a f11429c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0359a f11430d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0359a f11431e;

    public C2446v(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4, InterfaceC0359a interfaceC0359a5) {
        this.f11427a = interfaceC0359a;
        this.f11428b = interfaceC0359a2;
        this.f11429c = interfaceC0359a3;
        this.f11430d = interfaceC0359a4;
        this.f11431e = interfaceC0359a5;
    }

    /* JADX INFO: renamed from: a */
    public static C2446v m11738a(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4, InterfaceC0359a interfaceC0359a5) {
        return new C2446v(interfaceC0359a, interfaceC0359a2, interfaceC0359a3, interfaceC0359a4, interfaceC0359a5);
    }

    /* JADX INFO: renamed from: c */
    public static C2444t m11739c(InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2, InterfaceC2598e interfaceC2598e, C0019r c0019r, C0023v c0023v) {
        return new C2444t(interfaceC0092a, interfaceC0092a2, interfaceC2598e, c0019r, c0023v);
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2444t get() {
        return m11739c((InterfaceC0092a) this.f11427a.get(), (InterfaceC0092a) this.f11428b.get(), (InterfaceC2598e) this.f11429c.get(), (C0019r) this.f11430d.get(), (C0023v) this.f11431e.get());
    }
}
