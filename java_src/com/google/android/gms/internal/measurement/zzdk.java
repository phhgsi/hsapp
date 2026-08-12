package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzdk extends zzdn {
    private final AtomicReference<Bundle> zza = new AtomicReference<>();
    private boolean zzb;

    public final Bundle zza(long j3) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j3);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.zza.get();
        }
        return bundle;
    }

    public final Long zzb(long j3) {
        return (Long) zza(zza(j3), Long.class);
    }

    public final String zzc(long j3) {
        return (String) zza(zza(j3), String.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T zza(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L43
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L43
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdk.zza(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.zzdo
    public final void zza(Bundle bundle) {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(bundle);
                    this.zzb = true;
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
