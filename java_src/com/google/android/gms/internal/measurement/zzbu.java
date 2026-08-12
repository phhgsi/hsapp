package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class zzbu implements IInterface {
    private final IBinder zza;
    private final String zzb;

    protected zzbu(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    /* JADX INFO: renamed from: a_ */
    protected final Parcel m7249a_() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzb);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zza;
    }

    protected final Parcel zza(int i3, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.zza.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void zzb(int i3, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.zza.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
