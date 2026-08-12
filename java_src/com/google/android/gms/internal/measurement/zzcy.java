package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcy {
    private static zzcy zza = new zzcx();

    public static synchronized zzcy zza() {
        return zza;
    }

    public abstract URLConnection zza(URL url, String str);
}
