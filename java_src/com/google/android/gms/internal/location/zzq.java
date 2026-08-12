package com.google.android.gms.internal.location;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzq extends zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            zzl zzlVar = (zzl) zzc.zza(parcel, zzl.CREATOR);
            zzc.zzd(parcel);
            zzd(zzlVar);
        } else {
            if (i3 != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
