package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class zzin extends zzip {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzik zzc;

    zzin(zzik zzikVar) {
        this.zzc = zzikVar;
        this.zzb = zzikVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zziq
    public final byte zza() {
        int i3 = this.zza;
        if (i3 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i3 + 1;
        return this.zzc.zzb(i3);
    }
}
