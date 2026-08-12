package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.AbstractC0969e;

/* JADX INFO: loaded from: classes.dex */
final class zzhc implements zzhb {
    private static zzhc zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhc() {
        this.zzb = null;
        this.zzc = null;
    }

    static zzhc zza(Context context) {
        zzhc zzhcVar;
        synchronized (zzhc.class) {
            try {
                if (zza == null) {
                    zza = AbstractC0969e.m4232b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhc(context) : new zzhc();
                }
                zzhcVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzhb
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        Context context = this.zzb;
        if (context != null && !zzgs.zza(context)) {
            try {
                return (String) zzha.zza(new zzhd() { // from class: com.google.android.gms.internal.measurement.zzhf
                    @Override // com.google.android.gms.internal.measurement.zzhd
                    public final Object zza() {
                        return this.zza.zzb(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e3) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e3);
            }
        }
        return null;
    }

    final /* synthetic */ String zzb(String str) {
        return zzgj.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzhc(Context context) {
        this.zzb = context;
        zzhe zzheVar = new zzhe(this, null);
        this.zzc = zzheVar;
        context.getContentResolver().registerContentObserver(zzgi.zza, true, zzheVar);
    }

    static synchronized void zza() {
        Context context;
        try {
            zzhc zzhcVar = zza;
            if (zzhcVar != null && (context = zzhcVar.zzb) != null && zzhcVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
