package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzbb {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    zzbb(String str, String str2, long j3, long j4, long j5, long j6, Long l3, Long l4, Long l5, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j5, 0L, null, null, null, null);
    }

    final zzbb zza(Long l3, Long l4, Boolean bool) {
        return new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l3, l4, (bool == null || bool.booleanValue()) ? bool : null);
    }

    zzbb(String str, String str2, long j3, long j4, long j5, long j6, long j7, Long l3, Long l4, Long l5, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j4 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        Preconditions.checkArgument(j7 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
        this.zzg = j7;
        this.zzh = l3;
        this.zzi = l4;
        this.zzj = l5;
        this.zzk = bool;
    }

    final zzbb zza(long j3, long j4) {
        return new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j3, Long.valueOf(j4), this.zzi, this.zzj, this.zzk);
    }

    final zzbb zza(long j3) {
        return new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j3, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
