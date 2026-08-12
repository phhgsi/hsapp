package p110h2;

import java.util.Iterator;
import p035L1.AbstractC0369a;
import p041N1.InterfaceC0446i;
import p102f2.AbstractC1968y;
import p102f2.InterfaceC1966x;

/* JADX INFO: renamed from: h2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1999f {
    /* JADX INFO: renamed from: a */
    public static final void m10122a(InterfaceC0446i interfaceC0446i, Throwable th) {
        Iterator it = AbstractC1998e.m10120a().iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC1966x) it.next()).mo10034C(interfaceC0446i, th);
            } catch (Throwable th2) {
                AbstractC1998e.m10121b(AbstractC1968y.m10039b(th, th2));
            }
        }
        try {
            AbstractC0369a.m1360a(th, new C2000g(interfaceC0446i));
        } catch (Throwable unused) {
        }
        AbstractC1998e.m10121b(th);
    }
}
