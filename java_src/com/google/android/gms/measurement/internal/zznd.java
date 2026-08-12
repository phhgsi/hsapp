package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class zznd implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zznb zzb;

    zznd(zznb zznbVar, long j3) {
        this.zza = j3;
        this.zzb = zznbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznb.zza(this.zzb, this.zza);
    }
}
