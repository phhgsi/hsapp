package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.firebase.messaging.f0 */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1730f0 implements Runnable {

    /* JADX INFO: renamed from: i */
    private static final Object f8619i = new Object();

    /* JADX INFO: renamed from: j */
    private static Boolean f8620j;

    /* JADX INFO: renamed from: k */
    private static Boolean f8621k;

    /* JADX INFO: renamed from: d */
    private final Context f8622d;

    /* JADX INFO: renamed from: e */
    private final C1700I f8623e;

    /* JADX INFO: renamed from: f */
    private final PowerManager.WakeLock f8624f;

    /* JADX INFO: renamed from: g */
    private final C1728e0 f8625g;

    /* JADX INFO: renamed from: h */
    private final long f8626h;

    /* JADX INFO: renamed from: com.google.firebase.messaging.f0$a */
    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private RunnableC1730f0 f8627a;

        public a(RunnableC1730f0 runnableC1730f0) {
            this.f8627a = runnableC1730f0;
        }

        /* JADX INFO: renamed from: a */
        public void m9462a() {
            if (RunnableC1730f0.m9461j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC1730f0.this.f8622d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                RunnableC1730f0 runnableC1730f0 = this.f8627a;
                if (runnableC1730f0 == null) {
                    return;
                }
                if (runnableC1730f0.m9460i()) {
                    if (RunnableC1730f0.m9461j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f8627a.f8625g.m9442k(this.f8627a, 0L);
                    context.unregisterReceiver(this);
                    this.f8627a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    RunnableC1730f0(C1728e0 c1728e0, Context context, C1700I c1700i, long j3) {
        this.f8625g = c1728e0;
        this.f8622d = context;
        this.f8626h = j3;
        this.f8623e = c1700i;
        this.f8624f = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: renamed from: e */
    private static String m9456e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* JADX INFO: renamed from: f */
    private static boolean m9457f(Context context) {
        boolean zBooleanValue;
        synchronized (f8619i) {
            try {
                Boolean bool = f8621k;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m9458g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f8621k = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m9458g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z2 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z2 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m9456e(str));
        }
        return z2;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m9459h(Context context) {
        boolean zBooleanValue;
        synchronized (f8619i) {
            try {
                Boolean bool = f8620j;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m9458g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f8620j = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean m9460i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f8622d     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.RunnableC1730f0.m9460i():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static boolean m9461j() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m9459h(this.f8622d)) {
            this.f8624f.acquire(AbstractC1727e.f8606a);
        }
        try {
            try {
                try {
                    this.f8625g.m9443l(true);
                    if (!this.f8623e.m9308g()) {
                        this.f8625g.m9443l(false);
                        if (!m9459h(this.f8622d)) {
                            return;
                        } else {
                            wakeLock = this.f8624f;
                        }
                    } else if (!m9457f(this.f8622d) || m9460i()) {
                        if (this.f8625g.m9445o()) {
                            this.f8625g.m9443l(false);
                        } else {
                            this.f8625g.m9446p(this.f8626h);
                        }
                        if (!m9459h(this.f8622d)) {
                            return;
                        } else {
                            wakeLock = this.f8624f;
                        }
                    } else {
                        new a(this).m9462a();
                        if (!m9459h(this.f8622d)) {
                            return;
                        } else {
                            wakeLock = this.f8624f;
                        }
                    }
                    wakeLock.release();
                } catch (RuntimeException unused) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (IOException e3) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e3.getMessage());
                this.f8625g.m9443l(false);
                if (m9459h(this.f8622d)) {
                    this.f8624f.release();
                }
            }
        } catch (Throwable th) {
            if (m9459h(this.f8622d)) {
                try {
                    this.f8624f.release();
                } catch (RuntimeException unused2) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
