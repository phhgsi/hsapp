package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzdq extends zzbu implements zzdo {
    zzdq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzdo
    public final void zza(Bundle bundle) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, bundle);
        zzb(1, parcelM7249a_);
    }
}
