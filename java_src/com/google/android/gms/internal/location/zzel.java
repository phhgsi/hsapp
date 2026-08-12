package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i3 = -1;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        long j3 = 0;
        float f3 = 0.0f;
        double d3 = 0.0d;
        double d4 = 0.0d;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    s2 = SafeParcelReader.readShort(parcel, header);
                    break;
                case 4:
                    d3 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 5:
                    d4 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 6:
                    f3 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    i5 = SafeParcelReader.readInt(parcel, header);
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
        return new zzek(strCreateString, i4, s2, d3, d4, f3, j3, i5, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new zzek[i3];
    }
}
