package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();
    final int zaa;
    private final Account zab;
    private final int zac;
    private final GoogleSignInAccount zad;

    zat(int i3, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.zaa = i3;
        this.zab = account;
        this.zac = i4;
        this.zad = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i4);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i3, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zad, i3, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zat(Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i3, googleSignInAccount);
    }
}
