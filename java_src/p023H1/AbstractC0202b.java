package p023H1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: H1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0202b {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0201a f1227a;

    /* JADX INFO: renamed from: b */
    private static volatile InterfaceC0201a f1228b;

    /* JADX INFO: renamed from: H1.b$b */
    private static class b implements InterfaceC0201a {
        private b() {
        }

        @Override // p023H1.InterfaceC0201a
        /* JADX INFO: renamed from: a */
        public ExecutorService mo591a(ThreadFactory threadFactory, EnumC0203c enumC0203c) {
            return m593b(1, threadFactory, enumC0203c);
        }

        /* JADX INFO: renamed from: b */
        public ExecutorService m593b(int i3, ThreadFactory threadFactory, EnumC0203c enumC0203c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i3, i3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        f1227a = bVar;
        f1228b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0201a m592a() {
        return f1228b;
    }
}
