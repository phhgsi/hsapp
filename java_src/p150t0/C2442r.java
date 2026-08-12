package p150t0;

import p144r0.AbstractC2367d;
import p144r0.C2366c;
import p144r0.InterfaceC2370g;
import p144r0.InterfaceC2371h;
import p144r0.InterfaceC2373j;

/* JADX INFO: renamed from: t0.r */
/* JADX INFO: loaded from: classes.dex */
final class C2442r implements InterfaceC2371h {

    /* JADX INFO: renamed from: a */
    private final AbstractC2439o f11417a;

    /* JADX INFO: renamed from: b */
    private final String f11418b;

    /* JADX INFO: renamed from: c */
    private final C2366c f11419c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2370g f11420d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC2443s f11421e;

    C2442r(AbstractC2439o abstractC2439o, String str, C2366c c2366c, InterfaceC2370g interfaceC2370g, InterfaceC2443s interfaceC2443s) {
        this.f11417a = abstractC2439o;
        this.f11418b = str;
        this.f11419c = c2366c;
        this.f11420d = interfaceC2370g;
        this.f11421e = interfaceC2443s;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11729b(Exception exc) {
    }

    @Override // p144r0.InterfaceC2371h
    /* JADX INFO: renamed from: a */
    public void mo11217a(AbstractC2367d abstractC2367d) {
        m11730c(abstractC2367d, new InterfaceC2373j() { // from class: t0.q
            @Override // p144r0.InterfaceC2373j
            /* JADX INFO: renamed from: a */
            public final void mo11219a(Exception exc) {
                C2442r.m11729b(exc);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m11730c(AbstractC2367d abstractC2367d, InterfaceC2373j interfaceC2373j) {
        this.f11421e.mo11731a(AbstractC2438n.m11724a().mo11691e(this.f11417a).mo11689c(abstractC2367d).mo11692f(this.f11418b).mo11690d(this.f11420d).mo11688b(this.f11419c).mo11687a(), interfaceC2373j);
    }
}
