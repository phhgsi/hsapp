package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.location.internal.IBooleanStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        boolean z2 = parcel.readInt() != 0;
        zzc.zzd(parcel);
        zzb(status, z2);
        return true;
    }
}
