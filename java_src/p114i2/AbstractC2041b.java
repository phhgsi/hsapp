package p114i2;

import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p044O1.AbstractC0452b;
import p047P1.AbstractC0470a;
import p047P1.AbstractC0476g;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0616u;
import p102f2.AbstractC1947n0;
import p102f2.C1954r;
import p110h2.AbstractC1989C;
import p110h2.C2017x;

/* JADX INFO: renamed from: i2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2041b {
    /* JADX INFO: renamed from: a */
    public static final void m10256a(InterfaceC0581p interfaceC0581p, Object obj, InterfaceC0442e interfaceC0442e) {
        InterfaceC0442e interfaceC0442eM1765a = AbstractC0476g.m1765a(interfaceC0442e);
        try {
            InterfaceC0446i interfaceC0446iMo1615c = interfaceC0442e.mo1615c();
            Object objM10104c = AbstractC1989C.m10104c(interfaceC0446iMo1615c, null);
            try {
                Object objD = !(interfaceC0581p instanceof AbstractC0470a) ? AbstractC0452b.m1645d(interfaceC0581p, obj, interfaceC0442eM1765a) : ((InterfaceC0581p) AbstractC0616u.m2168b(interfaceC0581p, 2)).mo1609d(obj, interfaceC0442eM1765a);
                AbstractC1989C.m10102a(interfaceC0446iMo1615c, objM10104c);
                if (objD != AbstractC0452b.m1647e()) {
                    interfaceC0442eM1765a.mo1616j(AbstractC0381m.m1369a(objD));
                }
            } catch (Throwable th) {
                AbstractC1989C.m10102a(interfaceC0446iMo1615c, objM10104c);
                throw th;
            }
        } catch (Throwable th2) {
            AbstractC0381m.a aVar = AbstractC0381m.f1498d;
            interfaceC0442eM1765a.mo1616j(AbstractC0381m.m1369a(AbstractC0382n.m1372a(th2)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m10257b(C2017x c2017x, Object obj, InterfaceC0581p interfaceC0581p) throws Throwable {
        Object c1954r;
        try {
            c1954r = !(interfaceC0581p instanceof AbstractC0470a) ? AbstractC0452b.m1645d(interfaceC0581p, obj, c2017x) : ((InterfaceC0581p) AbstractC0616u.m2168b(interfaceC0581p, 2)).mo1609d(obj, c2017x);
        } catch (Throwable th) {
            c1954r = new C1954r(th, false, 2, null);
        }
        if (c1954r == AbstractC0452b.m1647e()) {
            return AbstractC0452b.m1647e();
        }
        Object objM9972d0 = c2017x.m9972d0(c1954r);
        if (objM9972d0 == AbstractC1947n0.f9463b) {
            return AbstractC0452b.m1647e();
        }
        if (objM9972d0 instanceof C1954r) {
            throw ((C1954r) objM9972d0).f9476a;
        }
        return AbstractC1947n0.m10005h(objM9972d0);
    }
}
