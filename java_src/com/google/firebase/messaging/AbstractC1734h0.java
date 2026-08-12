package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.messaging.h0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1734h0 {

    /* JADX INFO: renamed from: a */
    static final long f8635a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b */
    private static final Object f8636b = new Object();

    /* JADX INFO: renamed from: c */
    private static WakeLock f8637c;

    /* JADX INFO: renamed from: b */
    private static void m9464b(Context context) {
        if (f8637c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f8637c = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: c */
    public static void m9465c(Intent intent) {
        synchronized (f8636b) {
            try {
                if (f8637c != null && m9466d(intent)) {
                    m9468f(intent, false);
                    f8637c.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    static boolean m9466d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: renamed from: e */
    static void m9467e(Context context, ServiceConnectionC1744m0 serviceConnectionC1744m0, final Intent intent) {
        synchronized (f8636b) {
            try {
                m9464b(context);
                boolean zM9466d = m9466d(intent);
                m9468f(intent, true);
                if (!zM9466d) {
                    f8637c.acquire(f8635a);
                }
                serviceConnectionC1744m0.m9484d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.g0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        AbstractC1734h0.m9465c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m9468f(Intent intent, boolean z2) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z2);
    }

    /* JADX INFO: renamed from: g */
    static ComponentName m9469g(Context context, Intent intent) {
        synchronized (f8636b) {
            try {
                m9464b(context);
                boolean zM9466d = m9466d(intent);
                m9468f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zM9466d) {
                    f8637c.acquire(f8635a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
