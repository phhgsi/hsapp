package p118j2;

import java.util.concurrent.Executor;
import p041N1.C0447j;
import p041N1.InterfaceC0446i;
import p086b2.AbstractC1304d;
import p102f2.AbstractC1916W;
import p102f2.AbstractC1964w;
import p110h2.AbstractC1988B;
import p110h2.AbstractC2019z;

/* JADX INFO: renamed from: j2.b */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2094b extends AbstractC1916W implements Executor {

    /* JADX INFO: renamed from: g */
    public static final ExecutorC2094b f9805g = new ExecutorC2094b();

    /* JADX INFO: renamed from: h */
    private static final AbstractC1964w f9806h = C2105m.f9826f.mo10030F(AbstractC1988B.m10100e("kotlinx.coroutines.io.parallelism", AbstractC1304d.m6631a(64, AbstractC2019z.m10190a()), 0, 0, 12, null));

    private ExecutorC2094b() {
    }

    @Override // p102f2.AbstractC1964w
    /* JADX INFO: renamed from: D */
    public void mo9836D(InterfaceC0446i interfaceC0446i, Runnable runnable) {
        f9806h.mo9836D(interfaceC0446i, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo9836D(C0447j.f1593d, runnable);
    }

    @Override // p102f2.AbstractC1964w
    public String toString() {
        return "Dispatchers.IO";
    }
}
