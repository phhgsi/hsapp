package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzca extends zzbu implements zzbz {
    zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final Bundle zza(Bundle bundle) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, bundle);
        Parcel parcelZza = zza(1, parcelM7249a_);
        Bundle bundle2 = (Bundle) zzbw.zza(parcelZza, Bundle.CREATOR);
        parcelZza.recycle();
        return bundle2;
    }
}
