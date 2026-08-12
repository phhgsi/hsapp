package p015F;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p024I.AbstractC0211h;
import p024I.InterfaceC0204a;

/* JADX INFO: renamed from: F.k */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0139k {

    /* JADX INFO: renamed from: F.k$a */
    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private String f298a;

        /* JADX INFO: renamed from: b */
        private int f299b;

        /* JADX INFO: renamed from: F.k$a$a, reason: collision with other inner class name */
        private static class C2604a extends Thread {

            /* JADX INFO: renamed from: d */
            private final int f300d;

            C2604a(Runnable runnable, String str, int i3) {
                super(runnable, str);
                this.f300d = i3;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f300d);
                super.run();
            }
        }

        a(String str, int i3) {
            this.f298a = str;
            this.f299b = i3;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C2604a(runnable, this.f298a, this.f299b);
        }
    }

    /* JADX INFO: renamed from: F.k$b */
    private static class b implements Executor {

        /* JADX INFO: renamed from: d */
        private final Handler f301d;

        b(Handler handler) {
            this.f301d = (Handler) AbstractC0211h.m610g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f301d.post((Runnable) AbstractC0211h.m610g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f301d + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: F.k$c */
    private static class c implements Runnable {

        /* JADX INFO: renamed from: d */
        private Callable f302d;

        /* JADX INFO: renamed from: e */
        private InterfaceC0204a f303e;

        /* JADX INFO: renamed from: f */
        private Handler f304f;

        /* JADX INFO: renamed from: F.k$c$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ InterfaceC0204a f305d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ Object f306e;

            a(InterfaceC0204a interfaceC0204a, Object obj) {
                this.f305d = interfaceC0204a;
                this.f306e = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f305d.accept(this.f306e);
            }
        }

        c(Handler handler, Callable callable, InterfaceC0204a interfaceC0204a) {
            this.f302d = callable;
            this.f303e = interfaceC0204a;
            this.f304f = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f302d.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f304f.post(new a(this.f303e, objCall));
        }
    }

    /* JADX INFO: renamed from: a */
    static ThreadPoolExecutor m420a(String str, int i3, int i4) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i4, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i3));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    static Executor m421b(Handler handler) {
        return new b(handler);
    }

    /* JADX INFO: renamed from: c */
    static void m422c(Executor executor, Callable callable, InterfaceC0204a interfaceC0204a) {
        executor.execute(new c(AbstractC0130b.m369a(), callable, interfaceC0204a));
    }

    /* JADX INFO: renamed from: d */
    static Object m423d(ExecutorService executorService, Callable callable, int i3) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i3, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            throw e3;
        } catch (ExecutionException e4) {
            throw new RuntimeException(e4);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
