package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class zzf {
    private final zzjh zza;

    zzf(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    static zzf zza(String str) {
        return new zzf((TextUtils.isEmpty(str) || str.length() > 1) ? zzjh.UNINITIALIZED : zzje.zza(str.charAt(0)));
    }

    final String zzb() {
        return String.valueOf(zzje.zza(this.zza));
    }

    final zzjh zza() {
        return this.zza;
    }
}
