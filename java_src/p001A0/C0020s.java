package p001A0;

import android.content.Context;
import java.util.concurrent.Executor;
import p004B0.InterfaceC0053c;
import p004B0.InterfaceC0054d;
import p007C0.InterfaceC0086b;
import p010D0.InterfaceC0092a;
import p032K1.InterfaceC0359a;
import p153u0.InterfaceC2460e;
import p156v0.InterfaceC2475b;

/* JADX INFO: renamed from: A0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0020s implements InterfaceC2475b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0359a f53a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0359a f54b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0359a f55c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0359a f56d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0359a f57e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0359a f58f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC0359a f59g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC0359a f60h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC0359a f61i;

    public C0020s(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4, InterfaceC0359a interfaceC0359a5, InterfaceC0359a interfaceC0359a6, InterfaceC0359a interfaceC0359a7, InterfaceC0359a interfaceC0359a8, InterfaceC0359a interfaceC0359a9) {
        this.f53a = interfaceC0359a;
        this.f54b = interfaceC0359a2;
        this.f55c = interfaceC0359a3;
        this.f56d = interfaceC0359a4;
        this.f57e = interfaceC0359a5;
        this.f58f = interfaceC0359a6;
        this.f59g = interfaceC0359a7;
        this.f60h = interfaceC0359a8;
        this.f61i = interfaceC0359a9;
    }

    /* JADX INFO: renamed from: a */
    public static C0020s m70a(InterfaceC0359a interfaceC0359a, InterfaceC0359a interfaceC0359a2, InterfaceC0359a interfaceC0359a3, InterfaceC0359a interfaceC0359a4, InterfaceC0359a interfaceC0359a5, InterfaceC0359a interfaceC0359a6, InterfaceC0359a interfaceC0359a7, InterfaceC0359a interfaceC0359a8, InterfaceC0359a interfaceC0359a9) {
        return new C0020s(interfaceC0359a, interfaceC0359a2, interfaceC0359a3, interfaceC0359a4, interfaceC0359a5, interfaceC0359a6, interfaceC0359a7, interfaceC0359a8, interfaceC0359a9);
    }

    /* JADX INFO: renamed from: c */
    public static C0019r m71c(Context context, InterfaceC2460e interfaceC2460e, InterfaceC0054d interfaceC0054d, InterfaceC0025x interfaceC0025x, Executor executor, InterfaceC0086b interfaceC0086b, InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2, InterfaceC0053c interfaceC0053c) {
        return new C0019r(context, interfaceC2460e, interfaceC0054d, interfaceC0025x, executor, interfaceC0086b, interfaceC0092a, interfaceC0092a2, interfaceC0053c);
    }

    @Override // p032K1.InterfaceC0359a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0019r get() {
        return m71c((Context) this.f53a.get(), (InterfaceC2460e) this.f54b.get(), (InterfaceC0054d) this.f55c.get(), (InterfaceC0025x) this.f56d.get(), (Executor) this.f57e.get(), (InterfaceC0086b) this.f58f.get(), (InterfaceC0092a) this.f59g.get(), (InterfaceC0092a) this.f60h.get(), (InterfaceC0053c) this.f61i.get());
    }
}
