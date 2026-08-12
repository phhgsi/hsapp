package p115j;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: loaded from: classes.dex */
public class C2045d extends AbstractC2046e {

    /* JADX INFO: renamed from: a */
    private final Object f9665a = new Object();

    /* JADX INFO: renamed from: b */
    private final ExecutorService f9666b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c */
    private volatile Handler f9667c;

    /* JADX INFO: renamed from: j.d$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f9668a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f9668a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: j.d$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        public static Handler m10265a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: d */
    private static Handler m10264d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m10265a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p115j.AbstractC2046e
    /* JADX INFO: renamed from: a */
    public void mo10261a(Runnable runnable) {
        this.f9666b.execute(runnable);
    }

    @Override // p115j.AbstractC2046e
    /* JADX INFO: renamed from: b */
    public boolean mo10262b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p115j.AbstractC2046e
    /* JADX INFO: renamed from: c */
    public void mo10263c(Runnable runnable) {
        if (this.f9667c == null) {
            synchronized (this.f9665a) {
                try {
                    if (this.f9667c == null) {
                        this.f9667c = m10264d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f9667c.post(runnable);
    }
}
