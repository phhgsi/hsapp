package com.google.android.gms.internal.measurement;

import android.content.Context;
import p113i1.InterfaceC2038k;

/* JADX INFO: loaded from: classes.dex */
final class zzgv extends zzhu {
    private final Context zza;
    private final InterfaceC2038k zzb;

    zzgv(Context context, InterfaceC2038k interfaceC2038k) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = interfaceC2038k;
    }

    public final boolean equals(Object obj) {
        InterfaceC2038k interfaceC2038k;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhu) {
            zzhu zzhuVar = (zzhu) obj;
            if (this.zza.equals(zzhuVar.zza()) && ((interfaceC2038k = this.zzb) != null ? interfaceC2038k.equals(zzhuVar.zzb()) : zzhuVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        InterfaceC2038k interfaceC2038k = this.zzb;
        return iHashCode ^ (interfaceC2038k == null ? 0 : interfaceC2038k.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.zza) + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    final InterfaceC2038k zzb() {
        return this.zzb;
    }
}
