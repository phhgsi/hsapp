package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;

/* JADX INFO: loaded from: classes.dex */
final class zzff extends zzdy.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdy zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzff(zzdy zzdyVar, Long l3, String str, String str2, Bundle bundle, boolean z2, boolean z3) {
        super(zzdyVar);
        this.zzc = l3;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    final void zza() {
        Long l3 = this.zzc;
        ((zzdj) Preconditions.checkNotNull(this.zzi.zzj)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l3 == null ? this.zza : l3.longValue());
    }
}
