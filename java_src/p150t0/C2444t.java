package p150t0;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p001A0.C0019r;
import p001A0.C0023v;
import p010D0.InterfaceC0092a;
import p144r0.C2366c;
import p144r0.InterfaceC2372i;
import p144r0.InterfaceC2373j;
import p168z0.InterfaceC2598e;

/* JADX INFO: renamed from: t0.t */
/* JADX INFO: loaded from: classes.dex */
public class C2444t implements InterfaceC2443s {

    /* JADX INFO: renamed from: e */
    private static volatile AbstractC2445u f11422e;

    /* JADX INFO: renamed from: a */
    private final InterfaceC0092a f11423a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0092a f11424b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2598e f11425c;

    /* JADX INFO: renamed from: d */
    private final C0019r f11426d;

    C2444t(InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2, InterfaceC2598e interfaceC2598e, C0019r c0019r, C0023v c0023v) {
        this.f11423a = interfaceC0092a;
        this.f11424b = interfaceC0092a2;
        this.f11425c = interfaceC2598e;
        this.f11426d = c0019r;
        c0023v.m75c();
    }

    /* JADX INFO: renamed from: b */
    private AbstractC2433i m11732b(AbstractC2438n abstractC2438n) {
        return AbstractC2433i.m11709a().mo11679i(this.f11423a.mo259a()).mo11681k(this.f11424b.mo259a()).mo11680j(abstractC2438n.mo11686g()).mo11678h(new C2432h(abstractC2438n.mo11682b(), abstractC2438n.m11725d())).mo11677g(abstractC2438n.mo11683c().mo11208a()).mo11674d();
    }

    /* JADX INFO: renamed from: c */
    public static C2444t m11733c() {
        AbstractC2445u abstractC2445u = f11422e;
        if (abstractC2445u != null) {
            return abstractC2445u.mo11703b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX INFO: renamed from: d */
    private static Set m11734d(InterfaceC2430f interfaceC2430f) {
        return interfaceC2430f instanceof InterfaceC2431g ? Collections.unmodifiableSet(((InterfaceC2431g) interfaceC2430f).mo7188a()) : Collections.singleton(C2366c.m11213b("proto"));
    }

    /* JADX INFO: renamed from: f */
    public static void m11735f(Context context) {
        if (f11422e == null) {
            synchronized (C2444t.class) {
                try {
                    if (f11422e == null) {
                        f11422e = C2429e.m11700c().mo11705b(context).mo11704a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p150t0.InterfaceC2443s
    /* JADX INFO: renamed from: a */
    public void mo11731a(AbstractC2438n abstractC2438n, InterfaceC2373j interfaceC2373j) {
        this.f11425c.mo12347a(abstractC2438n.mo11685f().m11728f(abstractC2438n.mo11683c().mo11210c()), m11732b(abstractC2438n), interfaceC2373j);
    }

    /* JADX INFO: renamed from: e */
    public C0019r m11736e() {
        return this.f11426d;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC2372i m11737g(InterfaceC2430f interfaceC2430f) {
        return new C2440p(m11734d(interfaceC2430f), AbstractC2439o.m11726a().mo11697b(interfaceC2430f.getName()).mo11698c(interfaceC2430f.getExtras()).mo11696a(), this);
    }
}
