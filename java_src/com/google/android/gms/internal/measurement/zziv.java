package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
class zziv extends zzis {
    protected final byte[] zzb;

    zziv(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzik) || zzb() != ((zzik) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zziv)) {
            return obj.equals(this);
        }
        zziv zzivVar = (zziv) obj;
        int iZza = zza();
        int iZza2 = zzivVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzivVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public byte zza(int i3) {
        return this.zzb[i3];
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    byte zzb(int i3) {
        return this.zzb[i3];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final zzik zza(int i3, int i4) {
        int iZza = zzik.zza(0, i4, zzb());
        return iZza == 0 ? zzik.zza : new zzio(this.zzb, zzc(), iZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    protected final int zzb(int i3, int i4, int i5) {
        return zzjv.zza(i3, this.zzb, zzc(), i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    final void zza(zzil zzilVar) {
        zzilVar.zza(this.zzb, zzc(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    final boolean zza(zzik zzikVar, int i3, int i4) {
        if (i4 <= zzikVar.zzb()) {
            if (i4 <= zzikVar.zzb()) {
                if (zzikVar instanceof zziv) {
                    zziv zzivVar = (zziv) zzikVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzivVar.zzb;
                    int iZzc = zzc() + i4;
                    int iZzc2 = zzc();
                    int iZzc3 = zzivVar.zzc();
                    while (iZzc2 < iZzc) {
                        if (bArr[iZzc2] != bArr2[iZzc3]) {
                            return false;
                        }
                        iZzc2++;
                        iZzc3++;
                    }
                    return true;
                }
                return zzikVar.zza(0, i4).equals(zza(0, i4));
            }
            throw new IllegalArgumentException("Ran off end of other: 0, " + i4 + ", " + zzikVar.zzb());
        }
        throw new IllegalArgumentException("Length too large: " + i4 + zzb());
    }
}
