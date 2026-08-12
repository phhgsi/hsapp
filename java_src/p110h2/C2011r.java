package p110h2;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p094d2.AbstractC1821g;
import p102f2.AbstractC1953q0;

/* JADX INFO: renamed from: h2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2011r {

    /* JADX INFO: renamed from: a */
    public static final C2011r f9602a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC1953q0 f9603b;

    static {
        C2011r c2011r = new C2011r();
        f9602a = c2011r;
        AbstractC2019z.m10195f("kotlinx.coroutines.fast.service.loader", true);
        f9603b = c2011r.m10181a();
    }

    private C2011r() {
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC1953q0 m10181a() {
        Object next;
        AbstractC1953q0 abstractC1953q0M10186e;
        try {
            List listT = AbstractC1821g.m9604t(AbstractC1821g.m9588d(ServiceLoader.load(InterfaceC2010q.class, InterfaceC2010q.class.getClassLoader()).iterator()));
            Iterator it = listT.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iMo10047c = ((InterfaceC2010q) next).mo10047c();
                    do {
                        Object next2 = it.next();
                        int iMo10047c2 = ((InterfaceC2010q) next2).mo10047c();
                        if (iMo10047c < iMo10047c2) {
                            next = next2;
                            iMo10047c = iMo10047c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC2010q interfaceC2010q = (InterfaceC2010q) next;
            if (interfaceC2010q != null && (abstractC1953q0M10186e = AbstractC2012s.m10186e(interfaceC2010q, listT)) != null) {
                return abstractC1953q0M10186e;
            }
            AbstractC2012s.m10183b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            AbstractC2012s.m10183b(th, null, 2, null);
            return null;
        }
    }
}
