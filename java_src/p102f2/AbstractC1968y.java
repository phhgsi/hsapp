package p102f2;

import p035L1.AbstractC0369a;
import p041N1.InterfaceC0446i;
import p110h2.AbstractC1999f;

/* JADX INFO: renamed from: f2.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1968y {
    /* JADX INFO: renamed from: a */
    public static final void m10038a(InterfaceC0446i interfaceC0446i, Throwable th) {
        try {
            InterfaceC1966x interfaceC1966x = (InterfaceC1966x) interfaceC0446i.mo1603b(InterfaceC1966x.f9486b);
            if (interfaceC1966x != null) {
                interfaceC1966x.mo10034C(interfaceC0446i, th);
            } else {
                AbstractC1999f.m10122a(interfaceC0446i, th);
            }
        } catch (Throwable th2) {
            AbstractC1999f.m10122a(interfaceC0446i, m10039b(th, th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Throwable m10039b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC0369a.m1360a(runtimeException, th);
        return runtimeException;
    }
}
