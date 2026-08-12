package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.firebase.messaging.q */
/* JADX INFO: loaded from: classes.dex */
class C1748q implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private final Queue f8667a = new ArrayDeque(10);

    C1748q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m9506b(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String strM9282h = AbstractC1699H.m9282h(extras);
                if (!TextUtils.isEmpty(strM9282h)) {
                    if (this.f8667a.contains(strM9282h)) {
                        return;
                    } else {
                        this.f8667a.add(strM9282h);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e3) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e3);
        }
        if (AbstractC1699H.m9274E(bundle)) {
            AbstractC1699H.m9298x(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.messaging.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8665d.m9506b(intent);
                }
            });
        } else {
            m9506b(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
