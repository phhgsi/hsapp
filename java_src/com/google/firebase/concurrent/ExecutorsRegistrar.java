package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p002A1.InterfaceC0027b;
import p136o1.InterfaceC2299a;
import p136o1.InterfaceC2300b;
import p136o1.InterfaceC2301c;
import p136o1.InterfaceC2302d;
import p139p1.C2318E;
import p139p1.C2322c;
import p139p1.C2343x;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    static final C2343x f8368a = new C2343x(new InterfaceC0027b() { // from class: q1.b
        @Override // p002A1.InterfaceC0027b
        public final Object get() {
            return ExecutorsRegistrar.m9128m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.m9126k("Firebase Background", 10, ExecutorsRegistrar.m9124i())));
        }
    });

    /* JADX INFO: renamed from: b */
    static final C2343x f8369b = new C2343x(new InterfaceC0027b() { // from class: q1.c
        @Override // p002A1.InterfaceC0027b
        public final Object get() {
            return ExecutorsRegistrar.m9128m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.m9126k("Firebase Lite", 0, ExecutorsRegistrar.m9127l())));
        }
    });

    /* JADX INFO: renamed from: c */
    static final C2343x f8370c = new C2343x(new InterfaceC0027b() { // from class: q1.d
        @Override // p002A1.InterfaceC0027b
        public final Object get() {
            return ExecutorsRegistrar.m9128m(Executors.newCachedThreadPool(ExecutorsRegistrar.m9125j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d */
    static final C2343x f8371d = new C2343x(new InterfaceC0027b() { // from class: q1.e
        @Override // p002A1.InterfaceC0027b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.m9125j("Firebase Scheduler", 0));
        }
    });

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ScheduledExecutorService m9116a(InterfaceC2324e interfaceC2324e) {
        return (ScheduledExecutorService) f8369b.get();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ScheduledExecutorService m9120e(InterfaceC2324e interfaceC2324e) {
        return (ScheduledExecutorService) f8370c.get();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ ScheduledExecutorService m9122g(InterfaceC2324e interfaceC2324e) {
        return (ScheduledExecutorService) f8368a.get();
    }

    /* JADX INFO: renamed from: i */
    private static StrictMode.ThreadPolicy m9124i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i3 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i3 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    /* JADX INFO: renamed from: j */
    private static ThreadFactory m9125j(String str, int i3) {
        return new ThreadFactoryC1663b(str, i3, null);
    }

    /* JADX INFO: renamed from: k */
    private static ThreadFactory m9126k(String str, int i3, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC1663b(str, i3, threadPolicy);
    }

    /* JADX INFO: renamed from: l */
    private static StrictMode.ThreadPolicy m9127l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static ScheduledExecutorService m9128m(ExecutorService executorService) {
        return new ScheduledExecutorServiceC1676o(executorService, (ScheduledExecutorService) f8371d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C2322c.m11098f(C2318E.m11084a(InterfaceC2299a.class, ScheduledExecutorService.class), C2318E.m11084a(InterfaceC2299a.class, ExecutorService.class), C2318E.m11084a(InterfaceC2299a.class, Executor.class)).m11119f(new InterfaceC2327h() { // from class: q1.f
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return ExecutorsRegistrar.m9122g(interfaceC2324e);
            }
        }).m11117d(), C2322c.m11098f(C2318E.m11084a(InterfaceC2300b.class, ScheduledExecutorService.class), C2318E.m11084a(InterfaceC2300b.class, ExecutorService.class), C2318E.m11084a(InterfaceC2300b.class, Executor.class)).m11119f(new InterfaceC2327h() { // from class: q1.g
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return ExecutorsRegistrar.m9120e(interfaceC2324e);
            }
        }).m11117d(), C2322c.m11098f(C2318E.m11084a(InterfaceC2301c.class, ScheduledExecutorService.class), C2318E.m11084a(InterfaceC2301c.class, ExecutorService.class), C2318E.m11084a(InterfaceC2301c.class, Executor.class)).m11119f(new InterfaceC2327h() { // from class: q1.h
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return ExecutorsRegistrar.m9116a(interfaceC2324e);
            }
        }).m11117d(), C2322c.m11097e(C2318E.m11084a(InterfaceC2302d.class, Executor.class)).m11119f(new InterfaceC2327h() { // from class: q1.i
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return EnumC2362l.INSTANCE;
            }
        }).m11117d());
    }
}
