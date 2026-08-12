package p168z0;

import p001A0.AbstractC0007f;
import p010D0.InterfaceC0092a;
import p032K1.InterfaceC0359a;
import p156v0.AbstractC2477d;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: z0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2600g implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f11946a;

    public C2600g(InterfaceC0359a interfaceC0359a) {
        this.f11946a = interfaceC0359a;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0007f m12352a(InterfaceC0092a interfaceC0092a) {
        return (AbstractC0007f) AbstractC2477d.m11790c(AbstractC2599f.m12351a(interfaceC0092a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX INFO: renamed from: b */
    public static C2600g m12353b(InterfaceC0359a interfaceC0359a) {
        return new C2600g(interfaceC0359a);
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC0007f get() {
        return m12352a((InterfaceC0092a) this.f11946a.get());
    }
}
