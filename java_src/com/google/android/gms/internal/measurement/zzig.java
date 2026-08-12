package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzjt;

/* JADX INFO: loaded from: classes.dex */
final class zzig {
    private static volatile int zza = 100;

    static double zza(byte[] bArr, int i3) {
        return Double.longBitsToDouble(zzd(bArr, i3));
    }

    static float zzb(byte[] bArr, int i3) {
        return Float.intBitsToFloat(zzc(bArr, i3));
    }

    static int zzc(byte[] bArr, int i3) {
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    static int zzd(byte[] bArr, int i3, zzij zzijVar) {
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        if (j3 >= 0) {
            zzijVar.zzb = j3;
            return i4;
        }
        int i5 = i3 + 2;
        byte b3 = bArr[i4];
        long j4 = (j3 & 127) | (((long) (b3 & 127)) << 7);
        int i6 = 7;
        while (b3 < 0) {
            int i7 = i5 + 1;
            byte b4 = bArr[i5];
            i6 += 7;
            j4 |= ((long) (b4 & 127)) << i6;
            b3 = b4;
            i5 = i7;
        }
        zzijVar.zzb = j4;
        return i5;
    }

    static int zza(byte[] bArr, int i3, zzij zzijVar) throws zzkb {
        int iZzc = zzc(bArr, i3, zzijVar);
        int i4 = zzijVar.zza;
        if (i4 < 0) {
            throw zzkb.zzf();
        }
        if (i4 > bArr.length - iZzc) {
            throw zzkb.zzi();
        }
        if (i4 == 0) {
            zzijVar.zzc = zzik.zza;
            return iZzc;
        }
        zzijVar.zzc = zzik.zza(bArr, iZzc, i4);
        return iZzc + i4;
    }

    static int zzb(zzlu<?> zzluVar, int i3, byte[] bArr, int i4, int i5, zzkc<?> zzkcVar, zzij zzijVar) throws zzkb {
        int iZza = zza(zzluVar, bArr, i4, i5, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (iZza < i5) {
            int iZzc = zzc(bArr, iZza, zzijVar);
            if (i3 != zzijVar.zza) {
                break;
            }
            iZza = zza(zzluVar, bArr, iZzc, i5, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return iZza;
    }

    static int zzc(byte[] bArr, int i3, zzij zzijVar) {
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        if (b3 < 0) {
            return zza(b3, bArr, i4, zzijVar);
        }
        zzijVar.zza = b3;
        return i4;
    }

    static long zzd(byte[] bArr, int i3) {
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    static int zzb(byte[] bArr, int i3, zzij zzijVar) throws zzkb {
        int iZzc = zzc(bArr, i3, zzijVar);
        int i4 = zzijVar.zza;
        if (i4 < 0) {
            throw zzkb.zzf();
        }
        if (i4 == 0) {
            zzijVar.zzc = "";
            return iZzc;
        }
        zzijVar.zzc = zzmp.zzb(bArr, iZzc, i4);
        return iZzc + i4;
    }

    static int zza(int i3, byte[] bArr, int i4, int i5, Object obj, zzlc zzlcVar, zzmk<zzmj, zzmj> zzmkVar, zzij zzijVar) {
        if (zzijVar.zzd.zza(zzlcVar, i3 >>> 3) == null) {
            return zza(i3, bArr, i4, i5, zzlg.zzc(obj), zzijVar);
        }
        zzjt.zzd zzdVar = (zzjt.zzd) obj;
        zzdVar.zza();
        zzjm<zzjt.zzc> zzjmVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static int zza(zzlu zzluVar, byte[] bArr, int i3, int i4, int i5, zzij zzijVar) throws zzkb {
        Object objZza = zzluVar.zza();
        int iZza = zza(objZza, zzluVar, bArr, i3, i4, i5, zzijVar);
        zzluVar.zzd(objZza);
        zzijVar.zzc = objZza;
        return iZza;
    }

    static int zza(zzlu zzluVar, int i3, byte[] bArr, int i4, int i5, zzkc<?> zzkcVar, zzij zzijVar) throws zzkb {
        int i6 = (i3 & (-8)) | 4;
        int iZza = zza(zzluVar, bArr, i4, i5, i6, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (iZza < i5) {
            int iZzc = zzc(bArr, iZza, zzijVar);
            if (i3 != zzijVar.zza) {
                break;
            }
            iZza = zza(zzluVar, bArr, iZzc, i5, i6, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return iZza;
    }

    static int zza(zzlu zzluVar, byte[] bArr, int i3, int i4, zzij zzijVar) throws zzkb {
        Object objZza = zzluVar.zza();
        int iZza = zza(objZza, zzluVar, bArr, i3, i4, zzijVar);
        zzluVar.zzd(objZza);
        zzijVar.zzc = objZza;
        return iZza;
    }

    static int zza(byte[] bArr, int i3, zzkc<?> zzkcVar, zzij zzijVar) throws zzkb {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int iZzc = zzc(bArr, i3, zzijVar);
        int i4 = zzijVar.zza + iZzc;
        while (iZzc < i4) {
            iZzc = zzc(bArr, iZzc, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        if (iZzc == i4) {
            return iZzc;
        }
        throw zzkb.zzi();
    }

    static int zza(int i3, byte[] bArr, int i4, int i5, zzmj zzmjVar, zzij zzijVar) throws zzkb {
        if ((i3 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i6 = i3 & 7;
        if (i6 == 0) {
            int iZzd = zzd(bArr, i4, zzijVar);
            zzmjVar.zza(i3, Long.valueOf(zzijVar.zzb));
            return iZzd;
        }
        if (i6 == 1) {
            zzmjVar.zza(i3, Long.valueOf(zzd(bArr, i4)));
            return i4 + 8;
        }
        if (i6 == 2) {
            int iZzc = zzc(bArr, i4, zzijVar);
            int i7 = zzijVar.zza;
            if (i7 >= 0) {
                if (i7 > bArr.length - iZzc) {
                    throw zzkb.zzi();
                }
                if (i7 == 0) {
                    zzmjVar.zza(i3, zzik.zza);
                } else {
                    zzmjVar.zza(i3, zzik.zza(bArr, iZzc, i7));
                }
                return iZzc + i7;
            }
            throw zzkb.zzf();
        }
        if (i6 != 3) {
            if (i6 == 5) {
                zzmjVar.zza(i3, Integer.valueOf(zzc(bArr, i4)));
                return i4 + 4;
            }
            throw zzkb.zzc();
        }
        zzmj zzmjVarZzd = zzmj.zzd();
        int i8 = (i3 & (-8)) | 4;
        int i9 = zzijVar.zze + 1;
        zzijVar.zze = i9;
        zza(i9);
        int i10 = 0;
        while (true) {
            if (i4 >= i5) {
                break;
            }
            int iZzc2 = zzc(bArr, i4, zzijVar);
            i10 = zzijVar.zza;
            if (i10 == i8) {
                i4 = iZzc2;
                break;
            }
            i4 = zza(i10, bArr, iZzc2, i5, zzmjVarZzd, zzijVar);
        }
        zzijVar.zze--;
        if (i4 <= i5 && i10 == i8) {
            zzmjVar.zza(i3, zzmjVarZzd);
            return i4;
        }
        throw zzkb.zzg();
    }

    static int zza(int i3, byte[] bArr, int i4, zzij zzijVar) {
        int i5 = i3 & ModuleDescriptor.MODULE_VERSION;
        int i6 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            zzijVar.zza = i5 | (b3 << 7);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 7);
        int i8 = i4 + 2;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            zzijVar.zza = i7 | (b4 << 14);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 14);
        int i10 = i4 + 3;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            zzijVar.zza = i9 | (b5 << 21);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 21);
        int i12 = i4 + 4;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            zzijVar.zza = i11 | (b6 << 28);
            return i12;
        }
        int i13 = i11 | ((b6 & 127) << 28);
        while (true) {
            int i14 = i12 + 1;
            if (bArr[i12] >= 0) {
                zzijVar.zza = i13;
                return i14;
            }
            i12 = i14;
        }
    }

    static int zza(int i3, byte[] bArr, int i4, int i5, zzkc<?> zzkcVar, zzij zzijVar) {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int iZzc = zzc(bArr, i4, zzijVar);
        zzjwVar.zzd(zzijVar.zza);
        while (iZzc < i5) {
            int iZzc2 = zzc(bArr, iZzc, zzijVar);
            if (i3 != zzijVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        return iZzc;
    }

    static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i3, int i4, int i5, zzij zzijVar) throws zzkb {
        int i6 = zzijVar.zze + 1;
        zzijVar.zze = i6;
        zza(i6);
        int iZza = ((zzlg) zzluVar).zza(obj, bArr, i3, i4, i5, zzijVar);
        zzijVar.zze--;
        zzijVar.zzc = obj;
        return iZza;
    }

    static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i3, int i4, zzij zzijVar) throws zzkb {
        int iZza = i3 + 1;
        int i5 = bArr[i3];
        if (i5 < 0) {
            iZza = zza(i5, bArr, iZza, zzijVar);
            i5 = zzijVar.zza;
        }
        int i6 = iZza;
        if (i5 >= 0 && i5 <= i4 - i6) {
            int i7 = zzijVar.zze + 1;
            zzijVar.zze = i7;
            zza(i7);
            int i8 = i6 + i5;
            zzluVar.zza(obj, bArr, i6, i8, zzijVar);
            zzijVar.zze--;
            zzijVar.zzc = obj;
            return i8;
        }
        throw zzkb.zzi();
    }

    static int zza(int i3, byte[] bArr, int i4, int i5, zzij zzijVar) throws zzkb {
        if ((i3 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i6 = i3 & 7;
        if (i6 == 0) {
            return zzd(bArr, i4, zzijVar);
        }
        if (i6 == 1) {
            return i4 + 8;
        }
        if (i6 == 2) {
            return zzc(bArr, i4, zzijVar) + zzijVar.zza;
        }
        if (i6 != 3) {
            if (i6 == 5) {
                return i4 + 4;
            }
            throw zzkb.zzc();
        }
        int i7 = (i3 & (-8)) | 4;
        int i8 = 0;
        while (i4 < i5) {
            i4 = zzc(bArr, i4, zzijVar);
            i8 = zzijVar.zza;
            if (i8 == i7) {
                break;
            }
            i4 = zza(i8, bArr, i4, i5, zzijVar);
        }
        if (i4 > i5 || i8 != i7) {
            throw zzkb.zzg();
        }
        return i4;
    }

    private static void zza(int i3) throws zzkb {
        if (i3 >= zza) {
            throw zzkb.zzh();
        }
    }
}
