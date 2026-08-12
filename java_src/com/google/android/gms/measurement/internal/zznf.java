package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class zznf implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzng zzc;

    zznf(zzng zzngVar, long j3, long j4) {
        this.zzc = zzngVar;
        this.zza = j3;
        this.zzb = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzni
            @Override // java.lang.Runnable
            public final void run() {
                zznf zznfVar = this.zza;
                zzng zzngVar = zznfVar.zzc;
                long j3 = zznfVar.zza;
                long j4 = zznfVar.zzb;
                zzngVar.zza.zzt();
                zzngVar.zza.zzj().zzc().zza("Application going to the background");
                zzngVar.zza.zzk().zzn.zza(true);
                zzngVar.zza.zza(true);
                if (!zzngVar.zza.zze().zzw()) {
                    if (zzngVar.zza.zze().zza(zzbh.zzcp)) {
                        zzngVar.zza.zza(false, false, j4);
                        zzngVar.zza.zzb.zzb(j4);
                    } else {
                        zzngVar.zza.zzb.zzb(j4);
                        zzngVar.zza.zza(false, false, j4);
                    }
                }
                zzngVar.zza.zzj().zzo().zza("Application backgrounded at: timestamp_millis", Long.valueOf(j3));
                if (zzngVar.zza.zze().zza(zzbh.zzdd)) {
                    zzngVar.zza.zzm().zzam();
                }
            }
        });
    }
}
