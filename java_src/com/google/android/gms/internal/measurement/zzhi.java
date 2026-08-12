package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import p113i1.AbstractC2034g;

/* JADX INFO: loaded from: classes.dex */
public final class zzhi {
    private static volatile AbstractC2034g zza = AbstractC2034g.m10230a();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (zza.mo10221c()) {
            return ((Boolean) zza.mo10220b()).booleanValue();
        }
        synchronized (zzb) {
            try {
                if (zza.mo10221c()) {
                    return ((Boolean) zza.mo10220b()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    zza = AbstractC2034g.m10231d(Boolean.valueOf(z2));
                    return ((Boolean) zza.mo10220b()).booleanValue();
                }
                if (zza(context)) {
                    z2 = true;
                }
                zza = AbstractC2034g.m10231d(Boolean.valueOf(z2));
                return ((Boolean) zza.mo10220b()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
