package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.IntentSenderRequest;
import p083b.AbstractC1294b;

/* JADX INFO: loaded from: classes.dex */
final class zac implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ AbstractC1294b zac;
    final /* synthetic */ GoogleApiAvailability zad;

    zac(GoogleApiAvailability googleApiAvailability, Activity activity, int i3, AbstractC1294b abstractC1294b) {
        this.zad = googleApiAvailability;
        this.zaa = activity;
        this.zab = i3;
        this.zac = abstractC1294b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.zac.m6590a(new IntentSenderRequest.C0721a(errorResolutionPendingIntent.getIntentSender()).m2645a());
    }
}
