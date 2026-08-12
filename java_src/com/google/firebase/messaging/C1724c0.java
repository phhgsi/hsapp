package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.c0 */
/* JADX INFO: loaded from: classes.dex */
final class C1724c0 {

    /* JADX INFO: renamed from: d */
    private static WeakReference f8593d;

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f8594a;

    /* JADX INFO: renamed from: b */
    private C1717Y f8595b;

    /* JADX INFO: renamed from: c */
    private final Executor f8596c;

    private C1724c0(SharedPreferences sharedPreferences, Executor executor) {
        this.f8596c = executor;
        this.f8594a = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C1724c0 m9409a(Context context, Executor executor) {
        C1724c0 c1724c0;
        try {
            WeakReference weakReference = f8593d;
            c1724c0 = weakReference != null ? (C1724c0) weakReference.get() : null;
            if (c1724c0 == null) {
                c1724c0 = new C1724c0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c1724c0.m9410c();
                f8593d = new WeakReference(c1724c0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1724c0;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m9410c() {
        this.f8595b = C1717Y.m9371c(this.f8594a, "topic_operation_queue", ",", this.f8596c);
    }

    /* JADX INFO: renamed from: b */
    synchronized C1722b0 m9411b() {
        return C1722b0.m9403a(this.f8595b.m9375e());
    }

    /* JADX INFO: renamed from: d */
    synchronized boolean m9412d(C1722b0 c1722b0) {
        return this.f8595b.m9376f(c1722b0.m9407e());
    }
}
