package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzio extends zziv {
    private final int zzc;
    private final int zzd;

    zzio(byte[] bArr, int i3, int i4) {
        super(bArr);
        zzik.zza(i3, i3 + i4, bArr.length);
        this.zzc = i3;
        this.zzd = i4;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final byte zza(int i3) {
        int iZzb = zzb();
        if (((iZzb - (i3 + 1)) | i3) >= 0) {
            return this.zzb[this.zzc + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i3);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + iZzb);
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    final byte zzb(int i3) {
        return this.zzb[this.zzc + i3];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final int zzb() {
        return this.zzd;
    }
}
