package com.google.android.gms.internal.measurement;

import p113i1.AbstractC2035h;
import p117j1.AbstractC2083q;

/* JADX INFO: loaded from: classes.dex */
public final class zzhy {
    private final boolean zza;

    public zzhy(zzhx zzhxVar) {
        AbstractC2035h.m10241j(zzhxVar, "BuildInfo must be non-null");
        this.zza = !zzhxVar.zza();
    }

    public final boolean zza(String str) {
        AbstractC2035h.m10241j(str, "flagName must not be null");
        if (this.zza) {
            return ((AbstractC2083q) zzia.zza.get()).mo10328b(str);
        }
        return true;
    }
}
