package p110h2;

import java.util.Collection;
import java.util.ServiceLoader;
import p094d2.AbstractC1821g;
import p102f2.InterfaceC1966x;

/* JADX INFO: renamed from: h2.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1998e {

    /* JADX INFO: renamed from: a */
    private static final Collection f9569a = AbstractC1821g.m9604t(AbstractC1821g.m9588d(ServiceLoader.load(InterfaceC1966x.class, InterfaceC1966x.class.getClassLoader()).iterator()));

    /* JADX INFO: renamed from: a */
    public static final Collection m10120a() {
        return f9569a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m10121b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
