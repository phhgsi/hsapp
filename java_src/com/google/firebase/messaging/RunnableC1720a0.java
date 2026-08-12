package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.messaging.a0 */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1720a0 implements Runnable {

    /* JADX INFO: renamed from: d */
    private final long f8582d;

    /* JADX INFO: renamed from: e */
    private final PowerManager.WakeLock f8583e;

    /* JADX INFO: renamed from: f */
    private final FirebaseMessaging f8584f;

    /* JADX INFO: renamed from: g */
    ExecutorService f8585g = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* JADX INFO: renamed from: com.google.firebase.messaging.a0$a */
    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private RunnableC1720a0 f8586a;

        public a(RunnableC1720a0 runnableC1720a0) {
            this.f8586a = runnableC1720a0;
        }

        /* JADX INFO: renamed from: a */
        public void m9397a() {
            if (RunnableC1720a0.m9393c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f8586a.m9394b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC1720a0 runnableC1720a0 = this.f8586a;
            if (runnableC1720a0 != null && runnableC1720a0.m9395d()) {
                if (RunnableC1720a0.m9393c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f8586a.f8584f.m9247l(this.f8586a, 0L);
                this.f8586a.m9394b().unregisterReceiver(this);
                this.f8586a = null;
            }
        }
    }

    public RunnableC1720a0(FirebaseMessaging firebaseMessaging, long j3) {
        this.f8584f = firebaseMessaging;
        this.f8582d = j3;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) m9394b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f8583e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: renamed from: c */
    static boolean m9393c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: renamed from: b */
    Context m9394b() {
        return this.f8584f.m9248m();
    }

    /* JADX INFO: renamed from: d */
    boolean m9395d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m9394b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: e */
    boolean m9396e() throws IOException {
        try {
            if (this.f8584f.m9246k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e3) {
            if (!C1694D.m9210h(e3.getMessage())) {
                if (e3.getMessage() != null) {
                    throw e3;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e3.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1715W.m9363b().m9367e(m9394b())) {
            this.f8583e.acquire();
        }
        try {
            try {
                this.f8584f.m9253y(true);
                if (!this.f8584f.m9252x()) {
                    this.f8584f.m9253y(false);
                    if (!C1715W.m9363b().m9367e(m9394b())) {
                        return;
                    }
                } else if (!C1715W.m9363b().m9366d(m9394b()) || m9395d()) {
                    if (m9396e()) {
                        this.f8584f.m9253y(false);
                    } else {
                        this.f8584f.m9244C(this.f8582d);
                    }
                    if (!C1715W.m9363b().m9367e(m9394b())) {
                        return;
                    }
                } else {
                    new a(this).m9397a();
                    if (!C1715W.m9363b().m9367e(m9394b())) {
                        return;
                    }
                }
                this.f8583e.release();
            } catch (IOException e3) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e3.getMessage() + ". Won't retry the operation.");
                this.f8584f.m9253y(false);
                if (C1715W.m9363b().m9367e(m9394b())) {
                    this.f8583e.release();
                }
            }
        } catch (Throwable th) {
            if (C1715W.m9363b().m9367e(m9394b())) {
                this.f8583e.release();
            }
            throw th;
        }
    }
}
