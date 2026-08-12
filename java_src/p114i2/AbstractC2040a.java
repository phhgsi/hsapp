package p114i2;

import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p035L1.C0388t;
import p041N1.InterfaceC0442e;
import p044O1.AbstractC0452b;
import p068W1.InterfaceC0577l;
import p068W1.InterfaceC0581p;
import p110h2.AbstractC2002i;

/* JADX INFO: renamed from: i2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2040a {
    /* JADX INFO: renamed from: a */
    private static final void m10252a(InterfaceC0442e interfaceC0442e, Throwable th) throws Throwable {
        AbstractC0381m.a aVar = AbstractC0381m.f1498d;
        interfaceC0442e.mo1616j(AbstractC0381m.m1369a(AbstractC0382n.m1372a(th)));
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static final void m10253b(InterfaceC0442e interfaceC0442e, InterfaceC0442e interfaceC0442e2) throws Throwable {
        try {
            InterfaceC0442e interfaceC0442eC = AbstractC0452b.m1644c(interfaceC0442e);
            AbstractC0381m.a aVar = AbstractC0381m.f1498d;
            AbstractC2002i.m10132c(interfaceC0442eC, AbstractC0381m.m1369a(C0388t.f1507a), null, 2, null);
        } catch (Throwable th) {
            m10252a(interfaceC0442e2, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10254c(InterfaceC0581p interfaceC0581p, Object obj, InterfaceC0442e interfaceC0442e, InterfaceC0577l interfaceC0577l) throws Throwable {
        try {
            InterfaceC0442e interfaceC0442eC = AbstractC0452b.m1644c(AbstractC0452b.m1642a(interfaceC0581p, obj, interfaceC0442e));
            AbstractC0381m.a aVar = AbstractC0381m.f1498d;
            AbstractC2002i.m10131b(interfaceC0442eC, AbstractC0381m.m1369a(C0388t.f1507a), interfaceC0577l);
        } catch (Throwable th) {
            m10252a(interfaceC0442e, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10255d(InterfaceC0581p interfaceC0581p, Object obj, InterfaceC0442e interfaceC0442e, InterfaceC0577l interfaceC0577l, int i3, Object obj2) throws Throwable {
        if ((i3 & 4) != 0) {
            interfaceC0577l = null;
        }
        m10254c(interfaceC0581p, obj, interfaceC0442e, interfaceC0577l);
    }
}
