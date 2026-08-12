package p004B0;

import p010D0.InterfaceC0092a;
import p032K1.InterfaceC0359a;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: B0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0043N implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f93a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0359a f94b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0359a f95c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0359a f96d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0359a f97e;

    public C0043N(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4, InterfaceC0359a interfaceC0359a5) {
        this.f93a = interfaceC0359a;
        this.f94b = interfaceC0359a2;
        this.f95c = interfaceC0359a3;
        this.f96d = interfaceC0359a4;
        this.f97e = interfaceC0359a5;
    }

    /* JADX INFO: renamed from: a */
    public static C0043N m143a(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4, InterfaceC0359a interfaceC0359a5) {
        return new C0043N(interfaceC0359a, interfaceC0359a2, interfaceC0359a3, interfaceC0359a4, interfaceC0359a5);
    }

    /* JADX INFO: renamed from: c */
    public static C0042M m144c(InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2, Object obj, Object obj2, InterfaceC0359a interfaceC0359a) {
        return new C0042M(interfaceC0092a, interfaceC0092a2, (AbstractC0055e) obj, (C0049U) obj2, interfaceC0359a);
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0042M get() {
        return m144c((InterfaceC0092a) this.f93a.get(), (InterfaceC0092a) this.f94b.get(), this.f95c.get(), this.f96d.get(), this.f97e);
    }
}
