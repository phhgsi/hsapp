package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzev extends zzet {
    private final zzex zza;

    zzev(zzex zzexVar, int i3) {
        super(zzexVar.size(), i3);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.location.zzet
    protected final Object zza(int i3) {
        return this.zza.get(i3);
    }
}
