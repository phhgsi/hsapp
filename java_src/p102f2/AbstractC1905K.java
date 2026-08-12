package p102f2;

import java.util.concurrent.CancellationException;
import p035L1.AbstractC0369a;
import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p035L1.C0388t;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p071X1.AbstractC0606k;
import p110h2.AbstractC1989C;
import p110h2.C2001h;
import p118j2.AbstractRunnableC2100h;
import p118j2.InterfaceC2101i;

/* JADX INFO: renamed from: f2.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1905K extends AbstractRunnableC2100h {

    /* JADX INFO: renamed from: f */
    public int f9411f;

    public AbstractC1905K(int i3) {
        this.f9411f = i3;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9801a(Object obj, Throwable th);

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0442e mo9802b();

    /* JADX INFO: renamed from: d */
    public Throwable mo9803d(Object obj) {
        C1954r c1954r = obj instanceof C1954r ? (C1954r) obj : null;
        if (c1954r != null) {
            return c1954r.f9476a;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m9805g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0369a.m1360a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC0606k.m2142b(th);
        AbstractC1968y.m10038a(mo9802b().mo1615c(), new C1897C("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo9806h();

    @Override // java.lang.Runnable
    public final void run() {
        Object objM1369a;
        Object objM1369a2;
        InterfaceC2101i interfaceC2101i = this.f9815e;
        try {
            InterfaceC0442e interfaceC0442eMo9802b = mo9802b();
            AbstractC0606k.m2143c(interfaceC0442eMo9802b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2001h c2001h = (C2001h) interfaceC0442eMo9802b;
            InterfaceC0442e interfaceC0442e = c2001h.f9573h;
            Object obj = c2001h.f9575j;
            InterfaceC0446i interfaceC0446iMo1615c = interfaceC0442e.mo1615c();
            Object objM10104c = AbstractC1989C.m10104c(interfaceC0446iMo1615c, obj);
            C1971z0 c1971z0M10025g = objM10104c != AbstractC1989C.f9554a ? AbstractC1962v.m10025g(interfaceC0442e, interfaceC0446iMo1615c, objM10104c) : null;
            try {
                InterfaceC0446i interfaceC0446iMo1615c2 = interfaceC0442e.mo1615c();
                Object objMo9806h = mo9806h();
                Throwable thMo9803d = mo9803d(objMo9806h);
                InterfaceC1931f0 interfaceC1931f0 = (thMo9803d == null && AbstractC1906L.m9808b(this.f9411f)) ? (InterfaceC1931f0) interfaceC0446iMo1615c2.mo1603b(InterfaceC1931f0.f9437c) : null;
                if (interfaceC1931f0 != null && !interfaceC1931f0.mo9853a()) {
                    CancellationException cancellationExceptionMo9868v = interfaceC1931f0.mo9868v();
                    mo9801a(objMo9806h, cancellationExceptionMo9868v);
                    AbstractC0381m.a aVar = AbstractC0381m.f1498d;
                    interfaceC0442e.mo1616j(AbstractC0381m.m1369a(AbstractC0382n.m1372a(cancellationExceptionMo9868v)));
                } else if (thMo9803d != null) {
                    AbstractC0381m.a aVar2 = AbstractC0381m.f1498d;
                    interfaceC0442e.mo1616j(AbstractC0381m.m1369a(AbstractC0382n.m1372a(thMo9803d)));
                } else {
                    AbstractC0381m.a aVar3 = AbstractC0381m.f1498d;
                    interfaceC0442e.mo1616j(AbstractC0381m.m1369a(mo9804f(objMo9806h)));
                }
                C0388t c0388t = C0388t.f1507a;
                if (c1971z0M10025g == null || c1971z0M10025g.m10040E0()) {
                    AbstractC1989C.m10102a(interfaceC0446iMo1615c, objM10104c);
                }
                try {
                    interfaceC2101i.mo10529a();
                    objM1369a2 = AbstractC0381m.m1369a(C0388t.f1507a);
                } catch (Throwable th) {
                    AbstractC0381m.a aVar4 = AbstractC0381m.f1498d;
                    objM1369a2 = AbstractC0381m.m1369a(AbstractC0382n.m1372a(th));
                }
                m9805g(null, AbstractC0381m.m1370b(objM1369a2));
            } catch (Throwable th2) {
                if (c1971z0M10025g == null || c1971z0M10025g.m10040E0()) {
                    AbstractC1989C.m10102a(interfaceC0446iMo1615c, objM10104c);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                AbstractC0381m.a aVar5 = AbstractC0381m.f1498d;
                interfaceC2101i.mo10529a();
                objM1369a = AbstractC0381m.m1369a(C0388t.f1507a);
            } catch (Throwable th4) {
                AbstractC0381m.a aVar6 = AbstractC0381m.f1498d;
                objM1369a = AbstractC0381m.m1369a(AbstractC0382n.m1372a(th4));
            }
            m9805g(th3, AbstractC0381m.m1370b(objM1369a));
        }
    }

    /* JADX INFO: renamed from: f */
    public Object mo9804f(Object obj) {
        return obj;
    }
}
