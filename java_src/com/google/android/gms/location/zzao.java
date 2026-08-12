package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    i8 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    i9 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new SleepClassifyEvent(i3, i4, i5, i6, i7, i8, i9, z2, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new SleepClassifyEvent[i3];
    }
}
