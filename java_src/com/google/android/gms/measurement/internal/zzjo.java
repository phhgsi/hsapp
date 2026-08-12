package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class zzjo {
    final Context zza;
    String zzb;
    String zzc;
    String zzd;
    Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzdw zzg;
    boolean zzh;
    Long zzi;
    String zzj;

    public zzjo(Context context, com.google.android.gms.internal.measurement.zzdw zzdwVar, Long l3) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l3;
        if (zzdwVar != null) {
            this.zzg = zzdwVar;
            this.zzb = zzdwVar.zzf;
            this.zzc = zzdwVar.zze;
            this.zzd = zzdwVar.zzd;
            this.zzh = zzdwVar.zzc;
            this.zzf = zzdwVar.zzb;
            this.zzj = zzdwVar.zzh;
            Bundle bundle = zzdwVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
