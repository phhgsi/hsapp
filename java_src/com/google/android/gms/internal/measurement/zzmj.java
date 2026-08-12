package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzmj {
    private static final zzmj zza = new zzmj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmj() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzmj zzc() {
        return zza;
    }

    static zzmj zzd() {
        return new zzmj();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmj)) {
            return false;
        }
        zzmj zzmjVar = (zzmj) obj;
        int i3 = this.zzb;
        if (i3 == zzmjVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmjVar.zzc;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmjVar.zzd;
                    int i5 = this.zzb;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (objArr[i6].equals(objArr2[i6])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.zzb;
        int i4 = (i3 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i4 + i5) * 31;
        Object[] objArr = this.zzd;
        int i8 = this.zzb;
        for (int i9 = 0; i9 < i8; i9++) {
            iHashCode = (iHashCode * 31) + objArr[i9].hashCode();
        }
        return i7 + iHashCode;
    }

    public final int zza() {
        int iZzg;
        int i3 = this.zze;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            int i6 = this.zzc[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                iZzg = zzjc.zzg(i7, ((Long) this.zzd[i5]).longValue());
            } else if (i8 == 1) {
                iZzg = zzjc.zzc(i7, ((Long) this.zzd[i5]).longValue());
            } else if (i8 == 2) {
                iZzg = zzjc.zzc(i7, (zzik) this.zzd[i5]);
            } else if (i8 == 3) {
                iZzg = (zzjc.zzi(i7) << 1) + ((zzmj) this.zzd[i5]).zza();
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException(zzkb.zza());
                }
                iZzg = zzjc.zzf(i7, ((Integer) this.zzd[i5]).intValue());
            }
            i4 += iZzg;
        }
        this.zze = i4;
        return i4;
    }

    public final int zzb() {
        int i3 = this.zze;
        if (i3 != -1) {
            return i3;
        }
        int iZzd = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            iZzd += zzjc.zzd(this.zzc[i4] >>> 3, (zzik) this.zzd[i4]);
        }
        this.zze = iZzd;
        return iZzd;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzmj(int i3, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i3;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public final void zzb(zznb zznbVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zznbVar.zza() == 1) {
            for (int i3 = 0; i3 < this.zzb; i3++) {
                zza(this.zzc[i3], this.zzd[i3], zznbVar);
            }
            return;
        }
        for (int i4 = this.zzb - 1; i4 >= 0; i4--) {
            zza(this.zzc[i4], this.zzd[i4], zznbVar);
        }
    }

    final zzmj zza(zzmj zzmjVar) {
        if (zzmjVar.equals(zza)) {
            return this;
        }
        zzf();
        int i3 = this.zzb + zzmjVar.zzb;
        zza(i3);
        System.arraycopy(zzmjVar.zzc, 0, this.zzc, this.zzb, zzmjVar.zzb);
        System.arraycopy(zzmjVar.zzd, 0, this.zzd, this.zzb, zzmjVar.zzb);
        this.zzb = i3;
        return this;
    }

    static zzmj zza(zzmj zzmjVar, zzmj zzmjVar2) {
        int i3 = zzmjVar.zzb + zzmjVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzmjVar.zzc, i3);
        System.arraycopy(zzmjVar2.zzc, 0, iArrCopyOf, zzmjVar.zzb, zzmjVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzmjVar.zzd, i3);
        System.arraycopy(zzmjVar2.zzd, 0, objArrCopyOf, zzmjVar.zzb, zzmjVar2.zzb);
        return new zzmj(i3, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i3) {
        int[] iArr = this.zzc;
        if (i3 > iArr.length) {
            int i4 = this.zzb;
            int i5 = i4 + (i4 / 2);
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i3);
            this.zzd = Arrays.copyOf(this.zzd, i3);
        }
    }

    final void zza(StringBuilder sb, int i3) {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzld.zza(sb, i3, String.valueOf(this.zzc[i4] >>> 3), this.zzd[i4]);
        }
    }

    final void zza(int i3, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i4 = this.zzb;
        iArr[i4] = i3;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }

    final void zza(zznb zznbVar) {
        if (zznbVar.zza() == 2) {
            for (int i3 = this.zzb - 1; i3 >= 0; i3--) {
                zznbVar.zza(this.zzc[i3] >>> 3, this.zzd[i3]);
            }
            return;
        }
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zznbVar.zza(this.zzc[i4] >>> 3, this.zzd[i4]);
        }
    }

    private static void zza(int i3, Object obj, zznb zznbVar) {
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            zznbVar.zzb(i4, ((Long) obj).longValue());
            return;
        }
        if (i5 == 1) {
            zznbVar.zza(i4, ((Long) obj).longValue());
            return;
        }
        if (i5 == 2) {
            zznbVar.zza(i4, (zzik) obj);
            return;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                zznbVar.zzb(i4, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzkb.zza());
        }
        if (zznbVar.zza() == 1) {
            zznbVar.zzb(i4);
            ((zzmj) obj).zzb(zznbVar);
            zznbVar.zza(i4);
        } else {
            zznbVar.zza(i4);
            ((zzmj) obj).zzb(zznbVar);
            zznbVar.zzb(i4);
        }
    }
}
