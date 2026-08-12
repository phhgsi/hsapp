package p102f2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p071X1.AbstractC0606k;
import p086b2.AbstractC1304d;

/* JADX INFO: renamed from: f2.E */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1899E extends AbstractC1911Q implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: l */
    public static final RunnableC1899E f9406l;

    /* JADX INFO: renamed from: m */
    private static final long f9407m;

    static {
        Long l3;
        RunnableC1899E runnableC1899E = new RunnableC1899E();
        f9406l = runnableC1899E;
        AbstractC1910P.m9819L(runnableC1899E, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f9407m = timeUnit.toNanos(l3.longValue());
    }

    private RunnableC1899E() {
    }

    /* JADX INFO: renamed from: e0 */
    private final synchronized void m9784e0() {
        if (m9787h0()) {
            debugStatus = 3;
            m9839c0();
            AbstractC0606k.m2143c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: f0 */
    private final synchronized Thread m9785f0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(RunnableC1899E.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* JADX INFO: renamed from: g0 */
    private final boolean m9786g0() {
        return debugStatus == 4;
    }

    /* JADX INFO: renamed from: h0 */
    private final boolean m9787h0() {
        int i3 = debugStatus;
        return i3 == 2 || i3 == 3;
    }

    /* JADX INFO: renamed from: i0 */
    private final synchronized boolean m9788i0() {
        if (m9787h0()) {
            return false;
        }
        debugStatus = 1;
        AbstractC0606k.m2143c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    private final void m9789j0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p102f2.AbstractC1912S
    /* JADX INFO: renamed from: P */
    protected Thread mo9790P() {
        Thread thread = _thread;
        return thread == null ? m9785f0() : thread;
    }

    @Override // p102f2.AbstractC1911Q
    /* JADX INFO: renamed from: T */
    public void mo9791T(Runnable runnable) {
        if (m9786g0()) {
            m9789j0();
        }
        super.mo9791T(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM9837Z;
        C1967x0.f9488a.m10037c(this);
        AbstractC1924c.m9856a();
        try {
            if (!m9788i0()) {
                if (zM9837Z) {
                    return;
                } else {
                    return;
                }
            }
            long j3 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jM9838a0 = m9838a0();
                if (jM9838a0 == Long.MAX_VALUE) {
                    AbstractC1924c.m9856a();
                    long jNanoTime = System.nanoTime();
                    if (j3 == Long.MAX_VALUE) {
                        j3 = f9407m + jNanoTime;
                    }
                    long j4 = j3 - jNanoTime;
                    if (j4 <= 0) {
                        _thread = null;
                        m9784e0();
                        AbstractC1924c.m9856a();
                        if (m9837Z()) {
                            return;
                        }
                        mo9790P();
                        return;
                    }
                    jM9838a0 = AbstractC1304d.m6633c(jM9838a0, j4);
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (jM9838a0 > 0) {
                    if (m9787h0()) {
                        _thread = null;
                        m9784e0();
                        AbstractC1924c.m9856a();
                        if (m9837Z()) {
                            return;
                        }
                        mo9790P();
                        return;
                    }
                    AbstractC1924c.m9856a();
                    LockSupport.parkNanos(this, jM9838a0);
                }
            }
        } finally {
            _thread = null;
            m9784e0();
            AbstractC1924c.m9856a();
            if (!m9837Z()) {
                mo9790P();
            }
        }
    }

    @Override // p102f2.AbstractC1911Q, p102f2.AbstractC1910P
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
