package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzs extends zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            int i5 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            zzc.zzd(parcel);
            zzb(i5, strArrCreateStringArray);
        } else if (i3 == 2) {
            int i6 = parcel.readInt();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            zzc.zzd(parcel);
            zzc(i6, strArrCreateStringArray2);
        } else {
            if (i3 != 3) {
                return false;
            }
            int i7 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR);
            zzc.zzd(parcel);
            zzd(i7, pendingIntent);
        }
        return true;
    }
}
