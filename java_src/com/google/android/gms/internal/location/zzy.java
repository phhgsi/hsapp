package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzy extends zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        Location location = (Location) zzc.zza(parcel, Location.CREATOR);
        zzc.zzd(parcel);
        zzb(status, location);
        return true;
    }
}
