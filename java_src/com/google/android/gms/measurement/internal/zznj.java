package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class zznj {
    final /* synthetic */ zznb zza;

    zznj(zznb zznbVar) {
        this.zza = zznbVar;
    }

    private final void zzb(long j3, boolean z2) {
        this.zza.zzt();
        if (this.zza.zzu.zzac()) {
            this.zza.zzk().zzk.zza(j3);
            this.zza.zzj().zzp().zza("Session started, time", Long.valueOf(this.zza.zzb().elapsedRealtime()));
            long j4 = j3 / 1000;
            this.zza.zzm().zza("auto", "_sid", Long.valueOf(j4), j3);
            this.zza.zzk().zzl.zza(j4);
            this.zza.zzk().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j4);
            this.zza.zzm().zza("auto", "_s", j3, bundle);
            String strZza = this.zza.zzk().zzq.zza();
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strZza);
            this.zza.zzm().zza("auto", "_ssr", j3, bundle2);
        }
    }

    final void zza() {
        this.zza.zzt();
        if (this.zza.zzk().zza(this.zza.zzb().currentTimeMillis())) {
            this.zza.zzk().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.zza.zzj().zzp().zza("Detected application was in foreground");
                zzb(this.zza.zzb().currentTimeMillis(), false);
            }
        }
    }

    final void zza(long j3, boolean z2) {
        this.zza.zzt();
        this.zza.zzab();
        if (this.zza.zzk().zza(j3)) {
            this.zza.zzk().zzg.zza(true);
            this.zza.zzg().zzag();
        }
        this.zza.zzk().zzk.zza(j3);
        if (this.zza.zzk().zzg.zza()) {
            zzb(j3, z2);
        }
    }
}
