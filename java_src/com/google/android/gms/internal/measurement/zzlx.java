package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzlx implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzlv zzc;

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.zza;
        return (i3 > 0 && i3 <= this.zzc.zzb) || zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        Object[] objArr = this.zzc.zza;
        int i3 = this.zza - 1;
        this.zza = i3;
        return (zzlz) objArr[i3];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzlx(zzlv zzlvVar) {
        this.zzc = zzlvVar;
        this.zza = zzlvVar.zzb;
    }
}
