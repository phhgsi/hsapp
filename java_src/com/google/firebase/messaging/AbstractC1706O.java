package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p092d0.ExecutorC1782m;

/* JADX INFO: renamed from: com.google.firebase.messaging.O */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1706O {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9338a(Context context, boolean z2, TaskCompletionSource taskCompletionSource) {
        try {
            if (!m9339b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            AbstractC1708Q.m9348e(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z2) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m9339b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* JADX INFO: renamed from: c */
    static void m9340c(Context context) {
        if (AbstractC1708Q.m9346c(context)) {
            return;
        }
        m9342e(new ExecutorC1782m(), context, m9343f(context));
    }

    /* JADX INFO: renamed from: d */
    static boolean m9341d(Context context) {
        if (!PlatformVersion.isAtLeastQ()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        }
        if (!m9339b(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "GMS core is set for proxying");
        return true;
    }

    /* JADX INFO: renamed from: e */
    static Task m9342e(Executor executor, final Context context, final boolean z2) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.N
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1706O.m9338a(context, z2, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: f */
    private static boolean m9343f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
