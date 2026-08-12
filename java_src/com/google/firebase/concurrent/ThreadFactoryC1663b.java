package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.google.firebase.concurrent.b */
/* JADX INFO: loaded from: classes.dex */
class ThreadFactoryC1663b implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    private static final ThreadFactory f8374e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    private final AtomicLong f8375a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    private final String f8376b;

    /* JADX INFO: renamed from: c */
    private final int f8377c;

    /* JADX INFO: renamed from: d */
    private final StrictMode.ThreadPolicy f8378d;

    ThreadFactoryC1663b(String str, int i3, StrictMode.ThreadPolicy threadPolicy) {
        this.f8376b = str;
        this.f8377c = i3;
        this.f8378d = threadPolicy;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9129a(ThreadFactoryC1663b threadFactoryC1663b, Runnable runnable) {
        Process.setThreadPriority(threadFactoryC1663b.f8377c);
        StrictMode.ThreadPolicy threadPolicy = threadFactoryC1663b.f8378d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f8374e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC1663b.m9129a(this.f8372d, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f8376b, Long.valueOf(this.f8375a.getAndIncrement())));
        return threadNewThread;
    }
}
