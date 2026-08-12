package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.AbstractC1699H;
import com.google.firebase.messaging.C1745n;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    /* JADX INFO: renamed from: a */
    private static Intent m9150a(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new C1745n(context).m9496g(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException e3) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e3);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected void onNotificationDismissed(Context context, Bundle bundle) {
        Intent intentM9150a = m9150a(context, CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS, bundle);
        if (AbstractC1699H.m9273D(intentM9150a)) {
            AbstractC1699H.m9296v(intentM9150a);
        }
    }
}
