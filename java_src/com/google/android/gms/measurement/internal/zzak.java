package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
enum zzak {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzl;

    zzak(char c3) {
        this.zzl = c3;
    }

    public static zzak zza(char c3) {
        for (zzak zzakVar : values()) {
            if (zzakVar.zzl == c3) {
                return zzakVar;
            }
        }
        return UNSET;
    }
}
