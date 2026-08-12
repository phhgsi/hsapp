package com.google.android.gms.measurement.internal;

import androidx.collection.C0928h;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzho extends C0928h {
    private final /* synthetic */ zzhl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzho(zzhl zzhlVar, int i3) {
        super(20);
        this.zza = zzhlVar;
    }

    @Override // androidx.collection.C0928h
    protected final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzhl.zza(this.zza, str);
    }
}
