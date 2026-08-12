package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
final class zzl extends zzk {
    private final char zza;

    zzl(char c3) {
        this.zza = c3;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i3 = this.zza;
        for (int i4 = 0; i4 < 4; i4++) {
            cArr[5 - i4] = "0123456789ABCDEF".charAt(i3 & 15);
            i3 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c3) {
        return c3 == this.zza;
    }
}
