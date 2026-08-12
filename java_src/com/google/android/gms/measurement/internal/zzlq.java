package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzlq implements Runnable {
    private final /* synthetic */ zzlk zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzlj zzc;

    zzlq(zzlj zzljVar, zzlk zzlkVar, long j3) {
        this.zza = zzlkVar;
        this.zzb = j3;
        this.zzc = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        zzlj zzljVar = this.zzc;
        zzljVar.zza = null;
        zzljVar.zzo().zza((zzlk) null);
    }
}
