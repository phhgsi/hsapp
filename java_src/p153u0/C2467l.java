package p153u0;

import android.content.Context;
import p032K1.InterfaceC0359a;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: u0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2467l implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f11463a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0359a f11464b;

    public C2467l(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2) {
        this.f11463a = interfaceC0359a;
        this.f11464b = interfaceC0359a2;
    }

    /* JADX INFO: renamed from: a */
    public static C2467l m11781a(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2) {
        return new C2467l(interfaceC0359a, interfaceC0359a2);
    }

    /* JADX INFO: renamed from: c */
    public static C2466k m11782c(Context context, Object obj) {
        return new C2466k(context, (C2464i) obj);
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2466k get() {
        return m11782c((Context) this.f11463a.get(), this.f11464b.get());
    }
}
