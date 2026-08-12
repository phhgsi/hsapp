package co.median.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p135o0.C2287a;

/* JADX INFO: loaded from: classes.dex */
public class AppUpgradeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null || !"android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            return;
        }
        C2287a.m10903f(context).m10915d();
    }
}
