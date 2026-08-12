package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityLifecycleObserver {
    /* JADX INFO: renamed from: of */
    public static final ActivityLifecycleObserver m7212of(Activity activity) {
        return new zab(zaa.zaa(activity));
    }

    public abstract ActivityLifecycleObserver onStopCallOnce(Runnable runnable);
}
