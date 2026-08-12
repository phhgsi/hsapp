package p125l1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p113i1.AbstractC2031d;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: l1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2135b extends AbstractC2136c {

    /* JADX INFO: renamed from: l1.b$a */
    private static final class a implements Runnable {

        /* JADX INFO: renamed from: d */
        final Future f9937d;

        /* JADX INFO: renamed from: e */
        final InterfaceC2134a f9938e;

        a(Future future, InterfaceC2134a interfaceC2134a) {
            this.f9937d = future;
            this.f9938e = interfaceC2134a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9938e.onSuccess(AbstractC2135b.m10599b(this.f9937d));
            } catch (Error e3) {
                e = e3;
                this.f9938e.onFailure(e);
            } catch (RuntimeException e4) {
                e = e4;
                this.f9938e.onFailure(e);
            } catch (ExecutionException e5) {
                this.f9938e.onFailure(e5.getCause());
            }
        }

        public String toString() {
            return AbstractC2031d.m10222a(this).m10226c(this.f9938e).toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10598a(InterfaceFutureC2137d interfaceFutureC2137d, InterfaceC2134a interfaceC2134a, Executor executor) {
        AbstractC2035h.m10240i(interfaceC2134a);
        interfaceFutureC2137d.mo3975a(new a(interfaceFutureC2137d, interfaceC2134a), executor);
    }

    /* JADX INFO: renamed from: b */
    public static Object m10599b(Future future) {
        AbstractC2035h.m10247p(future.isDone(), "Future was expected to be done: %s", future);
        return AbstractC2138e.m10600a(future);
    }
}
