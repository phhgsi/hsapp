package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzmy;
import com.google.android.gms.measurement.internal.zznc;
import p063V.AbstractC0551a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements zznc {
    private zzmy<AppMeasurementService> zza;

    private final zzmy<AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new zzmy<>(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return zza().zza(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zza().zza();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zza().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        zza().zzb(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i4) {
        return zza().zza(intent, i3, i4);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final void zza(Intent intent) {
        AbstractC0551a.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final void zza(JobParameters jobParameters, boolean z2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final boolean zza(int i3) {
        return stopSelfResult(i3);
    }
}
