package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzls implements zzla {
    private final zzlc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzls(zzlc zzlcVar, String str, Object[] objArr) {
        this.zza = zzlcVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i4 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 55296) {
                this.zzd = i3 | (cCharAt2 << i4);
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i5 = i6;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final zzlc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final zzln zzb() {
        int i3 = this.zzd;
        return (i3 & 1) != 0 ? zzln.PROTO2 : (i3 & 4) == 4 ? zzln.EDITIONS : zzln.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
