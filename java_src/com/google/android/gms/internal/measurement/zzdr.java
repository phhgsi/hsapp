package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzdr extends zzbu implements zzdp {
    zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final int zza() {
        Parcel parcelZza = zza(2, m7249a_());
        int i3 = parcelZza.readInt();
        parcelZza.recycle();
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final void zza(String str, String str2, Bundle bundle, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        zzbw.zza(parcelM7249a_, bundle);
        parcelM7249a_.writeLong(j3);
        zzb(1, parcelM7249a_);
    }
}
