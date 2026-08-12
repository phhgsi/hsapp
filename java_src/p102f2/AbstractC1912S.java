package p102f2;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: f2.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1912S extends AbstractC1910P {
    /* JADX INFO: renamed from: P */
    protected abstract Thread mo9790P();

    /* JADX INFO: renamed from: Q */
    protected final void m9840Q() {
        Thread threadMo9790P = mo9790P();
        if (Thread.currentThread() != threadMo9790P) {
            AbstractC1924c.m9856a();
            LockSupport.unpark(threadMo9790P);
        }
    }
}
