package p102f2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import p041N1.InterfaceC0446i;
import p110h2.AbstractC1996c;

/* JADX INFO: renamed from: f2.X */
/* JADX INFO: loaded from: classes.dex */
public final class C1917X extends AbstractC1916W implements InterfaceC1903I {

    /* JADX INFO: renamed from: g */
    private final Executor f9427g;

    public C1917X(Executor executor) {
        this.f9427g = executor;
        AbstractC1996c.m10119a(m9846H());
    }

    /* JADX INFO: renamed from: G */
    private final void m9845G(InterfaceC0446i interfaceC0446i, RejectedExecutionException rejectedExecutionException) {
        AbstractC1939j0.m9911c(interfaceC0446i, AbstractC1915V.m9843a("The task was rejected", rejectedExecutionException));
    }

    @Override // p102f2.AbstractC1964w
    /* JADX INFO: renamed from: D */
    public void mo9836D(InterfaceC0446i interfaceC0446i, Runnable runnable) {
        try {
            Executor executorM9846H = m9846H();
            AbstractC1924c.m9856a();
            executorM9846H.execute(runnable);
        } catch (RejectedExecutionException e3) {
            AbstractC1924c.m9856a();
            m9845G(interfaceC0446i, e3);
            C1907M.m9813b().mo9836D(interfaceC0446i, runnable);
        }
    }

    /* JADX INFO: renamed from: H */
    public Executor m9846H() {
        return this.f9427g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorM9846H = m9846H();
        ExecutorService executorService = executorM9846H instanceof ExecutorService ? (ExecutorService) executorM9846H : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1917X) && ((C1917X) obj).m9846H() == m9846H();
    }

    public int hashCode() {
        return System.identityHashCode(m9846H());
    }

    @Override // p102f2.AbstractC1964w
    public String toString() {
        return m9846H().toString();
    }
}
