package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum zzs {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    zzs(int i3) {
    }

    public static zzs zza(int i3) {
        return i3 != 2 ? i3 != 3 ? i3 != 5 ? i3 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
