package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzhj;
import p063V.AbstractC0551a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC0551a implements zzhj.zza {
    private zzhj zza;

    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj.zza
    public final void doStartService(Context context, Intent intent) {
        AbstractC0551a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new zzhj(this);
        }
        this.zza.zza(context, intent);
    }
}
