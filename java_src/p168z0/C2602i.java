package p168z0;

import android.content.Context;
import p001A0.AbstractC0007f;
import p001A0.InterfaceC0025x;
import p004B0.InterfaceC0054d;
import p010D0.InterfaceC0092a;
import p032K1.InterfaceC0359a;
import p156v0.AbstractC2477d;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: z0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2602i implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f11947a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0359a f11948b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0359a f11949c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0359a f11950d;

    public C2602i(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4) {
        this.f11947a = interfaceC0359a;
        this.f11948b = interfaceC0359a2;
        this.f11949c = interfaceC0359a3;
        this.f11950d = interfaceC0359a4;
    }

    /* JADX INFO: renamed from: a */
    public static C2602i m12356a(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4) {
        return new C2602i(interfaceC0359a, interfaceC0359a2, interfaceC0359a3, interfaceC0359a4);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0025x m12357c(Context context, InterfaceC0054d interfaceC0054d, AbstractC0007f abstractC0007f, InterfaceC0092a interfaceC0092a) {
        return (InterfaceC0025x) AbstractC2477d.m11790c(AbstractC2601h.m12355a(context, interfaceC0054d, abstractC0007f, interfaceC0092a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC0025x get() {
        return m12357c((Context) this.f11947a.get(), (InterfaceC0054d) this.f11948b.get(), (AbstractC0007f) this.f11949c.get(), (InterfaceC0092a) this.f11950d.get());
    }
}
