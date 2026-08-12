package com.google.android.gms.common.internal.service;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 != 1) {
            return false;
        }
        int i5 = parcel.readInt();
        com.google.android.gms.internal.base.zac.zab(parcel);
        zab(i5);
        return true;
    }
}
