package p001A0;

import java.util.concurrent.Executor;
import p004B0.InterfaceC0054d;
import p007C0.InterfaceC0086b;
import p032K1.InterfaceC0359a;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: A0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0024w implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f68a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0359a f69b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0359a f70c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0359a f71d;

    public C0024w(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4) {
        this.f68a = interfaceC0359a;
        this.f69b = interfaceC0359a2;
        this.f70c = interfaceC0359a3;
        this.f71d = interfaceC0359a4;
    }

    /* JADX INFO: renamed from: a */
    public static C0024w m76a(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4) {
        return new C0024w(interfaceC0359a, interfaceC0359a2, interfaceC0359a3, interfaceC0359a4);
    }

    /* JADX INFO: renamed from: c */
    public static C0023v m77c(Executor executor, InterfaceC0054d interfaceC0054d, InterfaceC0025x interfaceC0025x, InterfaceC0086b interfaceC0086b) {
        return new C0023v(executor, interfaceC0054d, interfaceC0025x, interfaceC0086b);
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0023v get() {
        return m77c((Executor) this.f68a.get(), (InterfaceC0054d) this.f69b.get(), (InterfaceC0025x) this.f70c.get(), (InterfaceC0086b) this.f71d.get());
    }
}
