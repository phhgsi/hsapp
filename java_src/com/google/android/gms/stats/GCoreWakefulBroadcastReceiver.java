package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import p063V.AbstractC0551a;

/* JADX INFO: loaded from: classes.dex */
public abstract class GCoreWakefulBroadcastReceiver extends AbstractC0551a {
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return AbstractC0551a.completeWakefulIntent(intent);
    }
}
