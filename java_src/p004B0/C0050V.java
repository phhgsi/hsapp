package p004B0;

import android.content.Context;
import p032K1.InterfaceC0359a;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: B0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0050V implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f108a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0359a f109b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0359a f110c;

    public C0050V(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3) {
        this.f108a = interfaceC0359a;
        this.f109b = interfaceC0359a2;
        this.f110c = interfaceC0359a3;
    }

    /* JADX INFO: renamed from: a */
    public static C0050V m155a(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3) {
        return new C0050V(interfaceC0359a, interfaceC0359a2, interfaceC0359a3);
    }

    /* JADX INFO: renamed from: c */
    public static C0049U m156c(Context context, String str, int i3) {
        return new C0049U(context, str, i3);
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0049U get() {
        return m156c((Context) this.f108a.get(), (String) this.f109b.get(), ((Integer) this.f110c.get()).intValue());
    }
}
