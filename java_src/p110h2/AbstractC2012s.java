package p110h2;

import java.util.List;
import p035L1.C0372d;
import p102f2.AbstractC1953q0;

/* JADX INFO: renamed from: h2.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2012s {
    /* JADX INFO: renamed from: a */
    private static final AbstractC2013t m10182a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        m10185d();
        throw new C0372d();
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ AbstractC2013t m10183b(Throwable th, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            th = null;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return m10182a(th, str);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m10184c(AbstractC1953q0 abstractC1953q0) {
        return abstractC1953q0.mo10010G() instanceof AbstractC2013t;
    }

    /* JADX INFO: renamed from: d */
    public static final Void m10185d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC1953q0 m10186e(InterfaceC2010q interfaceC2010q, List list) {
        try {
            return interfaceC2010q.mo10046b(list);
        } catch (Throwable th) {
            return m10182a(th, interfaceC2010q.mo10045a());
        }
    }
}
