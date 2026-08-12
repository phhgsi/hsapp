package p102f2;

import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p041N1.InterfaceC0442e;
import p110h2.C2001h;

/* JADX INFO: renamed from: f2.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1898D {
    /* JADX INFO: renamed from: a */
    public static final String m9781a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: b */
    public static final String m9782b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: c */
    public static final String m9783c(InterfaceC0442e interfaceC0442e) {
        Object objM1369a;
        if (interfaceC0442e instanceof C2001h) {
            return interfaceC0442e.toString();
        }
        try {
            AbstractC0381m.a aVar = AbstractC0381m.f1498d;
            objM1369a = AbstractC0381m.m1369a(interfaceC0442e + '@' + m9782b(interfaceC0442e));
        } catch (Throwable th) {
            AbstractC0381m.a aVar2 = AbstractC0381m.f1498d;
            objM1369a = AbstractC0381m.m1369a(AbstractC0382n.m1372a(th));
        }
        if (AbstractC0381m.m1370b(objM1369a) != null) {
            objM1369a = interfaceC0442e.getClass().getName() + '@' + m9782b(interfaceC0442e);
        }
        return (String) objM1369a;
    }
}
