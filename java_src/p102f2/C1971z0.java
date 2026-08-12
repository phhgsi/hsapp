package p102f2;

import p035L1.AbstractC0385q;
import p035L1.C0380l;
import p035L1.C0388t;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0443f;
import p041N1.InterfaceC0446i;
import p110h2.AbstractC1989C;
import p110h2.C2017x;

/* JADX INFO: renamed from: f2.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1971z0 extends C2017x {

    /* JADX INFO: renamed from: h */
    private final ThreadLocal f9491h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1971z0(InterfaceC0446i interfaceC0446i, InterfaceC0442e interfaceC0442e) {
        C1894A0 c1894a0 = C1894A0.f9397d;
        super(interfaceC0446i.mo1603b(c1894a0) == null ? interfaceC0446i.mo1605p(c1894a0) : interfaceC0446i, interfaceC0442e);
        this.f9491h = new ThreadLocal();
        if (interfaceC0442e.mo1615c().mo1603b(InterfaceC0443f.f1591a) instanceof AbstractC1964w) {
            return;
        }
        Object objM10104c = AbstractC1989C.m10104c(interfaceC0446i, null);
        AbstractC1989C.m10102a(interfaceC0446i, objM10104c);
        m10041F0(interfaceC0446i, objM10104c);
    }

    @Override // p110h2.C2017x, p102f2.AbstractC1920a
    /* JADX INFO: renamed from: A0 */
    protected void mo9798A0(Object obj) {
        if (this.threadLocalIsSet) {
            C0380l c0380l = (C0380l) this.f9491h.get();
            if (c0380l != null) {
                AbstractC1989C.m10102a((InterfaceC0446i) c0380l.m1365a(), c0380l.m1366b());
            }
            this.f9491h.remove();
        }
        Object objM10015a = AbstractC1960u.m10015a(obj, this.f9605g);
        InterfaceC0442e interfaceC0442e = this.f9605g;
        InterfaceC0446i interfaceC0446iMo1615c = interfaceC0442e.mo1615c();
        Object objM10104c = AbstractC1989C.m10104c(interfaceC0446iMo1615c, null);
        C1971z0 c1971z0M10025g = objM10104c != AbstractC1989C.f9554a ? AbstractC1962v.m10025g(interfaceC0442e, interfaceC0446iMo1615c, objM10104c) : null;
        try {
            this.f9605g.mo1616j(objM10015a);
            C0388t c0388t = C0388t.f1507a;
            if (c1971z0M10025g == null || c1971z0M10025g.m10040E0()) {
                AbstractC1989C.m10102a(interfaceC0446iMo1615c, objM10104c);
            }
        } catch (Throwable th) {
            if (c1971z0M10025g == null || c1971z0M10025g.m10040E0()) {
                AbstractC1989C.m10102a(interfaceC0446iMo1615c, objM10104c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m10040E0() {
        boolean z2 = this.threadLocalIsSet && this.f9491h.get() == null;
        this.f9491h.remove();
        return !z2;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m10041F0(InterfaceC0446i interfaceC0446i, Object obj) {
        this.threadLocalIsSet = true;
        this.f9491h.set(AbstractC0385q.m1378a(interfaceC0446i, obj));
    }
}
