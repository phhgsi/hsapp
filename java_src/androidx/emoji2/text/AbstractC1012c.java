package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.emoji2.text.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1012c {

    /* JADX INFO: renamed from: androidx.emoji2.text.c$a */
    static class a {
        /* JADX INFO: renamed from: a */
        public static Handler m4510a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m4507a(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* JADX INFO: renamed from: b */
    static ThreadPoolExecutor m4508b(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC1012c.m4507a(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    static Handler m4509c() {
        return Build.VERSION.SDK_INT >= 28 ? a.m4510a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
