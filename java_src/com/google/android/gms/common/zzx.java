package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class zzx {
    private static final zzx zze = new zzx(true, 3, 1, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzx(boolean z2, int i3, int i4, String str, Throwable th) {
        this.zza = z2;
        this.zzd = i3;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    static zzx zzb() {
        return zze;
    }

    static zzx zzc(String str) {
        return new zzx(false, 1, 5, str, null);
    }

    static zzx zzd(String str, Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    static zzx zzf(int i3) {
        return new zzx(true, i3, 1, null, null);
    }

    static zzx zzg(int i3, int i4, String str, Throwable th) {
        return new zzx(false, i3, i4, str, th);
    }

    String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
