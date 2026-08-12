package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzds extends zzbx implements zzdp {
    public zzds() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
            long j3 = parcel.readLong();
            zzbw.zzb(parcel);
            zza(string, string2, bundle, j3);
            parcel2.writeNoException();
        } else {
            if (i3 != 2) {
                return false;
            }
            int iZza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(iZza);
        }
        return true;
    }
}
