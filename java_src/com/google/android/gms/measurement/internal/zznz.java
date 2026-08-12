package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zznz implements zzgu {
    private final /* synthetic */ String zza;
    private final /* synthetic */ List zzb;
    private final /* synthetic */ zznv zzc;

    zznz(zznv zznvVar, String str, List list) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zznvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final void zza(String str, int i3, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzc.zza(true, i3, th, bArr, this.zza, this.zzb);
    }
}
