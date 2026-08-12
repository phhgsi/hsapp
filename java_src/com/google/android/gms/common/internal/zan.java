package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        long j3 = 0;
        long j4 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MethodInvocation(i4, i5, i6, j3, j4, strCreateString, strCreateString2, i7, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new MethodInvocation[i3];
    }
}
