package p168z0;

import java.util.concurrent.Executor;
import p001A0.InterfaceC0025x;
import p004B0.InterfaceC0054d;
import p007C0.InterfaceC0086b;
import p032K1.InterfaceC0359a;
import p153u0.InterfaceC2460e;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: z0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2597d implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f11941a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0359a f11942b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0359a f11943c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0359a f11944d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0359a f11945e;

    public C2597d(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4, InterfaceC0359a interfaceC0359a5) {
        this.f11941a = interfaceC0359a;
        this.f11942b = interfaceC0359a2;
        this.f11943c = interfaceC0359a3;
        this.f11944d = interfaceC0359a4;
        this.f11945e = interfaceC0359a5;
    }

    /* JADX INFO: renamed from: a */
    public static C2597d m12348a(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4, InterfaceC0359a interfaceC0359a5) {
        return new C2597d(interfaceC0359a, interfaceC0359a2, interfaceC0359a3, interfaceC0359a4, interfaceC0359a5);
    }

    /* JADX INFO: renamed from: c */
    public static C2596c m12349c(Executor executor, InterfaceC2460e interfaceC2460e, InterfaceC0025x interfaceC0025x, InterfaceC0054d interfaceC0054d, InterfaceC0086b interfaceC0086b) {
        return new C2596c(executor, interfaceC2460e, interfaceC0025x, interfaceC0054d, interfaceC0086b);
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2596c get() {
        return m12349c((Executor) this.f11941a.get(), (InterfaceC2460e) this.f11942b.get(), (InterfaceC0025x) this.f11943c.get(), (InterfaceC0054d) this.f11944d.get(), (InterfaceC0086b) this.f11945e.get());
    }
}
