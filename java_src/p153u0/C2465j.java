package p153u0;

import android.content.Context;
import p010D0.InterfaceC0092a;
import p032K1.InterfaceC0359a;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: u0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2465j implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f11455a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0359a f11456b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0359a f11457c;

    public C2465j(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3) {
        this.f11455a = interfaceC0359a;
        this.f11456b = interfaceC0359a2;
        this.f11457c = interfaceC0359a3;
    }

    /* JADX INFO: renamed from: a */
    public static C2465j m11774a(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3) {
        return new C2465j(interfaceC0359a, interfaceC0359a2, interfaceC0359a3);
    }

    /* JADX INFO: renamed from: c */
    public static C2464i m11775c(Context context, InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2) {
        return new C2464i(context, interfaceC0092a, interfaceC0092a2);
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2464i get() {
        return m11775c((Context) this.f11455a.get(), (InterfaceC0092a) this.f11456b.get(), (InterfaceC0092a) this.f11457c.get());
    }
}
