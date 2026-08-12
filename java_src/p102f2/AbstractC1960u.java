package p102f2;

import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p041N1.InterfaceC0442e;
import p068W1.InterfaceC0577l;

/* JADX INFO: renamed from: f2.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1960u {
    /* JADX INFO: renamed from: a */
    public static final Object m10015a(Object obj, InterfaceC0442e interfaceC0442e) {
        if (!(obj instanceof C1954r)) {
            return AbstractC0381m.m1369a(obj);
        }
        AbstractC0381m.a aVar = AbstractC0381m.f1498d;
        return AbstractC0381m.m1369a(AbstractC0382n.m1372a(((C1954r) obj).f9476a));
    }

    /* JADX INFO: renamed from: b */
    public static final Object m10016b(Object obj, InterfaceC0577l interfaceC0577l) {
        Throwable thM1370b = AbstractC0381m.m1370b(obj);
        return thM1370b == null ? interfaceC0577l != null ? new C1956s(obj, interfaceC0577l) : obj : new C1954r(thM1370b, false, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m10017c(Object obj, InterfaceC1936i interfaceC1936i) {
        Throwable thM1370b = AbstractC0381m.m1370b(obj);
        return thM1370b == null ? obj : new C1954r(thM1370b, false, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m10018d(Object obj, InterfaceC0577l interfaceC0577l, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            interfaceC0577l = null;
        }
        return m10016b(obj, interfaceC0577l);
    }
}
