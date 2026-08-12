package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class zziw {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzjb zzc;

    public static int zza(int i3) {
        return (-(i3 & 1)) ^ (i3 >>> 1);
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzb(int i3);

    public abstract int zzc();

    public abstract void zzc(int i3);

    public abstract int zzd();

    public abstract void zzd(int i3);

    public abstract int zze();

    public abstract boolean zze(int i3);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzik zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    private zziw() {
        this.zzb = zzd;
    }

    public static long zza(long j3) {
        return (-(j3 & 1)) ^ (j3 >>> 1);
    }

    static zziw zza(byte[] bArr, int i3, int i4, boolean z2) {
        zziz zzizVar = new zziz(bArr, i4);
        try {
            zzizVar.zzb(i4);
            return zzizVar;
        } catch (zzkb e3) {
            throw new IllegalArgumentException(e3);
        }
    }
}
