package p102f2;

import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p044O1.AbstractC0452b;
import p047P1.AbstractC0476g;
import p068W1.InterfaceC0581p;
import p110h2.C1997d;
import p110h2.C2017x;
import p114i2.AbstractC2041b;

/* JADX INFO: renamed from: f2.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1893A {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1970z m9776a(InterfaceC0446i interfaceC0446i) {
        if (interfaceC0446i.mo1603b(InterfaceC1931f0.f9437c) == null) {
            interfaceC0446i = interfaceC0446i.mo1605p(AbstractC1941k0.m9920b(null, 1, null));
        }
        return new C1997d(interfaceC0446i);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m9777b(InterfaceC0581p interfaceC0581p, InterfaceC0442e interfaceC0442e) throws Throwable {
        C2017x c2017x = new C2017x(interfaceC0442e.mo1615c(), interfaceC0442e);
        Object objM10257b = AbstractC2041b.m10257b(c2017x, c2017x, interfaceC0581p);
        if (objM10257b == AbstractC0452b.m1647e()) {
            AbstractC0476g.m1767c(interfaceC0442e);
        }
        return objM10257b;
    }
}
