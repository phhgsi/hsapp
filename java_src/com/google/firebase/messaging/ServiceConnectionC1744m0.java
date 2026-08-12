package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ServiceConnectionC1744m0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.messaging.m0 */
/* JADX INFO: loaded from: classes.dex */
class ServiceConnectionC1744m0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final Context f8653a;

    /* JADX INFO: renamed from: b */
    private final Intent f8654b;

    /* JADX INFO: renamed from: c */
    private final ScheduledExecutorService f8655c;

    /* JADX INFO: renamed from: d */
    private final Queue f8656d;

    /* JADX INFO: renamed from: e */
    private BinderC1738j0 f8657e;

    /* JADX INFO: renamed from: f */
    private boolean f8658f;

    /* JADX INFO: renamed from: com.google.firebase.messaging.m0$a */
    static class a {

        /* JADX INFO: renamed from: a */
        final Intent f8659a;

        /* JADX INFO: renamed from: b */
        private final TaskCompletionSource f8660b = new TaskCompletionSource();

        a(Intent intent) {
            this.f8659a = intent;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m9486b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f8659a.getAction() + " finishing.");
            aVar.m9488d();
        }

        /* JADX INFO: renamed from: c */
        void m9487c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.k0
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC1744m0.a.m9486b(this.f8651d);
                }
            }, 20L, TimeUnit.SECONDS);
            m9489e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.l0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: d */
        public void m9488d() {
            this.f8660b.trySetResult(null);
        }

        /* JADX INFO: renamed from: e */
        Task m9489e() {
            return this.f8660b.getTask();
        }
    }

    ServiceConnectionC1744m0(Context context, String str) {
        this(context, str, m9480a());
    }

    /* JADX INFO: renamed from: a */
    private static ScheduledThreadPoolExecutor m9480a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    private void m9481b() {
        while (!this.f8656d.isEmpty()) {
            ((a) this.f8656d.poll()).m9488d();
        }
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m9482c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f8656d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                BinderC1738j0 binderC1738j0 = this.f8657e;
                if (binderC1738j0 == null || !binderC1738j0.isBinderAlive()) {
                    m9483e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f8657e.m9479b((a) this.f8656d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m9483e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f8658f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f8658f) {
            return;
        }
        this.f8658f = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f8653a, this.f8654b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e3) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e3);
        }
        this.f8658f = false;
        m9481b();
    }

    /* JADX INFO: renamed from: d */
    synchronized Task m9484d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.m9487c(this.f8655c);
            this.f8656d.add(aVar);
            m9482c();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.m9489e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f8658f = false;
            if (iBinder instanceof BinderC1738j0) {
                this.f8657e = (BinderC1738j0) iBinder;
                m9482c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m9481b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m9482c();
    }

    ServiceConnectionC1744m0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f8656d = new ArrayDeque();
        this.f8658f = false;
        Context applicationContext = context.getApplicationContext();
        this.f8653a = applicationContext;
        this.f8654b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f8655c = scheduledExecutorService;
    }
}
