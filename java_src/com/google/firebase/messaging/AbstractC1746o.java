package com.google.firebase.messaging;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p023H1.AbstractC0202b;
import p023H1.EnumC0203c;

/* JADX INFO: renamed from: com.google.firebase.messaging.o */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1746o {
    /* JADX INFO: renamed from: a */
    private static Executor m9498a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    /* JADX INFO: renamed from: b */
    static Executor m9499b() {
        return m9498a("Firebase-Messaging-File-Io");
    }

    /* JADX INFO: renamed from: c */
    static ScheduledExecutorService m9500c() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }

    /* JADX INFO: renamed from: d */
    static ExecutorService m9501d() {
        return AbstractC0202b.m592a().mo591a(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), EnumC0203c.HIGH_SPEED);
    }

    /* JADX INFO: renamed from: e */
    static ExecutorService m9502e() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: renamed from: f */
    static ExecutorService m9503f() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
    }

    /* JADX INFO: renamed from: g */
    static ScheduledExecutorService m9504g() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }
}
