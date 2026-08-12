package p102f2;

import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p035L1.C0388t;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p071X1.AbstractC0606k;
import p110h2.AbstractC1989C;
import p110h2.C2001h;

/* JADX INFO: renamed from: f2.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1906L {
    /* JADX INFO: renamed from: a */
    public static final void m9807a(AbstractC1905K abstractC1905K, int i3) {
        InterfaceC0442e interfaceC0442eMo9802b = abstractC1905K.mo9802b();
        boolean z2 = i3 == 4;
        if (z2 || !(interfaceC0442eMo9802b instanceof C2001h) || m9808b(i3) != m9808b(abstractC1905K.f9411f)) {
            m9810d(abstractC1905K, interfaceC0442eMo9802b, z2);
            return;
        }
        AbstractC1964w abstractC1964w = ((C2001h) interfaceC0442eMo9802b).f9572g;
        InterfaceC0446i interfaceC0446iMo1615c = interfaceC0442eMo9802b.mo1615c();
        if (abstractC1964w.mo10029E(interfaceC0446iMo1615c)) {
            abstractC1964w.mo9836D(interfaceC0446iMo1615c, abstractC1905K);
        } else {
            m9811e(abstractC1905K);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9808b(int i3) {
        return i3 == 1 || i3 == 2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9809c(int i3) {
        return i3 == 2;
    }

    /* JADX INFO: renamed from: d */
    public static final void m9810d(AbstractC1905K abstractC1905K, InterfaceC0442e interfaceC0442e, boolean z2) {
        Object objMo9804f;
        Object objMo9806h = abstractC1905K.mo9806h();
        Throwable thMo9803d = abstractC1905K.mo9803d(objMo9806h);
        if (thMo9803d != null) {
            AbstractC0381m.a aVar = AbstractC0381m.f1498d;
            objMo9804f = AbstractC0382n.m1372a(thMo9803d);
        } else {
            AbstractC0381m.a aVar2 = AbstractC0381m.f1498d;
            objMo9804f = abstractC1905K.mo9804f(objMo9806h);
        }
        Object objM1369a = AbstractC0381m.m1369a(objMo9804f);
        if (!z2) {
            interfaceC0442e.mo1616j(objM1369a);
            return;
        }
        AbstractC0606k.m2143c(interfaceC0442e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2001h c2001h = (C2001h) interfaceC0442e;
        InterfaceC0442e interfaceC0442e2 = c2001h.f9573h;
        Object obj = c2001h.f9575j;
        InterfaceC0446i interfaceC0446iMo1615c = interfaceC0442e2.mo1615c();
        Object objM10104c = AbstractC1989C.m10104c(interfaceC0446iMo1615c, obj);
        C1971z0 c1971z0M10025g = objM10104c != AbstractC1989C.f9554a ? AbstractC1962v.m10025g(interfaceC0442e2, interfaceC0446iMo1615c, objM10104c) : null;
        try {
            c2001h.f9573h.mo1616j(objM1369a);
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

    /* JADX INFO: renamed from: e */
    private static final void m9811e(AbstractC1905K abstractC1905K) {
        AbstractC1910P abstractC1910PM10035a = C1967x0.f9488a.m10035a();
        if (abstractC1910PM10035a.m9824M()) {
            abstractC1910PM10035a.m9821I(abstractC1905K);
            return;
        }
        abstractC1910PM10035a.m9823K(true);
        try {
            m9810d(abstractC1905K, abstractC1905K.mo9802b(), true);
            do {
            } while (abstractC1910PM10035a.m9826O());
        } finally {
            try {
            } finally {
            }
        }
    }
}
