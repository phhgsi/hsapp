package com.google.firebase.concurrent;

import com.google.firebase.concurrent.ScheduledFutureC1677p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p164y.AbstractC2533f;

/* JADX INFO: renamed from: com.google.firebase.concurrent.o */
/* JADX INFO: loaded from: classes.dex */
class ScheduledExecutorServiceC1676o implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: d */
    private final ExecutorService f8417d;

    /* JADX INFO: renamed from: e */
    private final ScheduledExecutorService f8418e;

    ScheduledExecutorServiceC1676o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f8417d = executorService;
        this.f8418e = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m9134g(Callable callable, ScheduledFutureC1677p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e3) {
            bVar.mo9146a(e3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m9135h(Runnable runnable, ScheduledFutureC1677p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e3) {
            bVar.mo9146a(e3);
            throw e3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m9138p(Runnable runnable, ScheduledFutureC1677p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e3) {
            bVar.mo9146a(e3);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m9140r(Runnable runnable, ScheduledFutureC1677p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e3) {
            bVar.mo9146a(e3);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return this.f8417d.awaitTermination(j3, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC2533f.m12105a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f8417d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f8417d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f8417d.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f8417d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f8417d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j3, final TimeUnit timeUnit) {
        return new ScheduledFutureC1677p(new ScheduledFutureC1677p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.ScheduledFutureC1677p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo9130a(ScheduledFutureC1677p.b bVar) {
                ScheduledExecutorServiceC1676o scheduledExecutorServiceC1676o = this.f8379a;
                return scheduledExecutorServiceC1676o.f8418e.schedule(new Runnable() { // from class: com.google.firebase.concurrent.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC1676o.f8417d.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC1676o.m9140r(runnable, bVar);
                            }
                        });
                    }
                }, j3, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j3, final long j4, final TimeUnit timeUnit) {
        return new ScheduledFutureC1677p(new ScheduledFutureC1677p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.ScheduledFutureC1677p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo9130a(ScheduledFutureC1677p.b bVar) {
                ScheduledExecutorServiceC1676o scheduledExecutorServiceC1676o = this.f8387a;
                return scheduledExecutorServiceC1676o.f8418e.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC1676o.f8417d.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                ScheduledExecutorServiceC1676o.m9135h(runnable, bVar);
                            }
                        });
                    }
                }, j3, j4, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j3, final long j4, final TimeUnit timeUnit) {
        return new ScheduledFutureC1677p(new ScheduledFutureC1677p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.ScheduledFutureC1677p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo9130a(ScheduledFutureC1677p.b bVar) {
                ScheduledExecutorServiceC1676o scheduledExecutorServiceC1676o = this.f8392a;
                return scheduledExecutorServiceC1676o.f8418e.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        scheduledExecutorServiceC1676o.f8417d.execute(new Runnable() { // from class: com.google.firebase.concurrent.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC1676o.m9138p(runnable, bVar);
                            }
                        });
                    }
                }, j3, j4, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f8417d.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f8417d.invokeAll(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f8417d.invokeAny(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j3, final TimeUnit timeUnit) {
        return new ScheduledFutureC1677p(new ScheduledFutureC1677p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.ScheduledFutureC1677p.c
            /* JADX INFO: renamed from: a */
            public final ScheduledFuture mo9130a(ScheduledFutureC1677p.b bVar) {
                ScheduledExecutorServiceC1676o scheduledExecutorServiceC1676o = this.f8397a;
                return scheduledExecutorServiceC1676o.f8418e.schedule(new Callable() { // from class: com.google.firebase.concurrent.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return scheduledExecutorServiceC1676o.f8417d.submit(new Runnable() { // from class: com.google.firebase.concurrent.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScheduledExecutorServiceC1676o.m9134g(callable, bVar);
                            }
                        });
                    }
                }, j3, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f8417d.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f8417d.submit(runnable);
    }
}
