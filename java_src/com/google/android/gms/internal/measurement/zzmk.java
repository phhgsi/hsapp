package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract class zzmk<T, B> {
    private static volatile int zza = 100;

    zzmk() {
    }

    abstract int zza(T t2);

    abstract B zza();

    abstract T zza(T t2, T t3);

    abstract void zza(B b3, int i3, int i4);

    abstract void zza(B b3, int i3, long j3);

    abstract void zza(B b3, int i3, zzik zzikVar);

    abstract void zza(B b3, int i3, T t2);

    abstract void zza(T t2, zznb zznbVar);

    abstract boolean zza(zzlr zzlrVar);

    final boolean zza(B b3, zzlr zzlrVar, int i3) throws zzkb {
        int iZzd = zzlrVar.zzd();
        int i4 = iZzd >>> 3;
        int i5 = iZzd & 7;
        if (i5 == 0) {
            zzb(b3, i4, zzlrVar.zzl());
            return true;
        }
        if (i5 == 1) {
            zza(b3, i4, zzlrVar.zzk());
            return true;
        }
        if (i5 == 2) {
            zza((Object) b3, i4, zzlrVar.zzp());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw zzkb.zza();
            }
            zza((Object) b3, i4, zzlrVar.zzf());
            return true;
        }
        B bZza = zza();
        int i6 = 4 | (i4 << 3);
        int i7 = i3 + 1;
        if (i7 >= zza) {
            throw zzkb.zzh();
        }
        while (zzlrVar.zzc() != Integer.MAX_VALUE && zza(bZza, zzlrVar, i7)) {
        }
        if (i6 != zzlrVar.zzd()) {
            throw zzkb.zzb();
        }
        zza(b3, i4, zze(bZza));
        return true;
    }

    abstract int zzb(T t2);

    abstract void zzb(B b3, int i3, long j3);

    abstract void zzb(T t2, zznb zznbVar);

    abstract void zzb(Object obj, B b3);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t2);

    abstract T zzd(Object obj);

    abstract T zze(B b3);

    abstract void zzf(Object obj);
}
