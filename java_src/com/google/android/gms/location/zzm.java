package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        byte b3 = 0;
        long j3 = 0;
        float[] fArrCreateFloatArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 4:
                        f3 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    case 5:
                        f4 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    case 6:
                        j3 = SafeParcelReader.readLong(parcel, header);
                        break;
                    case 7:
                        b3 = SafeParcelReader.readByte(parcel, header);
                        break;
                    case 8:
                        f5 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        f6 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                fArrCreateFloatArray = SafeParcelReader.createFloatArray(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new DeviceOrientation(fArrCreateFloatArray, f3, f4, j3, b3, f5, f6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new DeviceOrientation[i3];
    }
}
