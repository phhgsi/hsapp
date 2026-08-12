package p102f2;

import p041N1.C0447j;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0443f;
import p041N1.InterfaceC0446i;
import p044O1.AbstractC0452b;
import p047P1.AbstractC0476g;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;
import p110h2.AbstractC1989C;
import p110h2.C2017x;
import p114i2.AbstractC2040a;
import p114i2.AbstractC2041b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: f2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1932g {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1901G m9874a(InterfaceC1970z interfaceC1970z, InterfaceC0446i interfaceC0446i, EnumC1895B enumC1895B, InterfaceC0581p interfaceC0581p) throws Throwable {
        InterfaceC0446i interfaceC0446iM10023e = AbstractC1962v.m10023e(interfaceC1970z, interfaceC0446i);
        C1902H c1949o0 = enumC1895B.m9780c() ? new C1949o0(interfaceC0446iM10023e, interfaceC0581p) : new C1902H(interfaceC0446iM10023e, true);
        c1949o0.m9850D0(enumC1895B, c1949o0, interfaceC0581p);
        return c1949o0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC1901G m9875b(InterfaceC1970z interfaceC1970z, InterfaceC0446i interfaceC0446i, EnumC1895B enumC1895B, InterfaceC0581p interfaceC0581p, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            interfaceC0446i = C0447j.f1593d;
        }
        if ((i3 & 2) != 0) {
            enumC1895B = EnumC1895B.f9398d;
        }
        return AbstractC1930f.m9859a(interfaceC1970z, interfaceC0446i, enumC1895B, interfaceC0581p);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC1931f0 m9876c(InterfaceC1970z interfaceC1970z, InterfaceC0446i interfaceC0446i, EnumC1895B enumC1895B, InterfaceC0581p interfaceC0581p) throws Throwable {
        InterfaceC0446i interfaceC0446iM10023e = AbstractC1962v.m10023e(interfaceC1970z, interfaceC0446i);
        C1963v0 c1951p0 = enumC1895B.m9780c() ? new C1951p0(interfaceC0446iM10023e, interfaceC0581p) : new C1963v0(interfaceC0446iM10023e, true);
        c1951p0.m9850D0(enumC1895B, c1951p0, interfaceC0581p);
        return c1951p0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC1931f0 m9877d(InterfaceC1970z interfaceC1970z, InterfaceC0446i interfaceC0446i, EnumC1895B enumC1895B, InterfaceC0581p interfaceC0581p, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            interfaceC0446i = C0447j.f1593d;
        }
        if ((i3 & 2) != 0) {
            enumC1895B = EnumC1895B.f9398d;
        }
        return AbstractC1930f.m9861c(interfaceC1970z, interfaceC0446i, enumC1895B, interfaceC0581p);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m9878e(InterfaceC0446i interfaceC0446i, InterfaceC0581p interfaceC0581p, InterfaceC0442e interfaceC0442e) throws Throwable {
        Object objM9799E0;
        InterfaceC0446i interfaceC0446iMo1615c = interfaceC0442e.mo1615c();
        InterfaceC0446i interfaceC0446iM10022d = AbstractC1962v.m10022d(interfaceC0446iMo1615c, interfaceC0446i);
        AbstractC1939j0.m9913e(interfaceC0446iM10022d);
        if (interfaceC0446iM10022d == interfaceC0446iMo1615c) {
            C2017x c2017x = new C2017x(interfaceC0446iM10022d, interfaceC0442e);
            objM9799E0 = AbstractC2041b.m10257b(c2017x, c2017x, interfaceC0581p);
        } else {
            InterfaceC0443f.b bVar = InterfaceC0443f.f1591a;
            if (AbstractC0606k.m2141a(interfaceC0446iM10022d.mo1603b(bVar), interfaceC0446iMo1615c.mo1603b(bVar))) {
                C1971z0 c1971z0 = new C1971z0(interfaceC0446iM10022d, interfaceC0442e);
                InterfaceC0446i interfaceC0446iMo1615c2 = c1971z0.mo1615c();
                Object objM10104c = AbstractC1989C.m10104c(interfaceC0446iMo1615c2, null);
                try {
                    Object objM10257b = AbstractC2041b.m10257b(c1971z0, c1971z0, interfaceC0581p);
                    AbstractC1989C.m10102a(interfaceC0446iMo1615c2, objM10104c);
                    objM9799E0 = objM10257b;
                } catch (Throwable th) {
                    AbstractC1989C.m10102a(interfaceC0446iMo1615c2, objM10104c);
                    throw th;
                }
            } else {
                C1904J c1904j = new C1904J(interfaceC0446iM10022d, interfaceC0442e);
                AbstractC2040a.m10255d(interfaceC0581p, c1904j, c1904j, null, 4, null);
                objM9799E0 = c1904j.m9799E0();
            }
        }
        if (objM9799E0 == AbstractC0452b.m1647e()) {
            AbstractC0476g.m1767c(interfaceC0442e);
        }
        return objM9799E0;
    }
}
