package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzad implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        zzon zzonVar = null;
        String strCreateString3 = null;
        zzbf zzbfVar = null;
        zzbf zzbfVar2 = null;
        zzbf zzbfVar3 = null;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    zzonVar = (zzon) SafeParcelReader.createParcelable(parcel, header, zzon.CREATOR);
                    break;
                case 5:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    zzbfVar = (zzbf) SafeParcelReader.createParcelable(parcel, header, zzbf.CREATOR);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    zzbfVar2 = (zzbf) SafeParcelReader.createParcelable(parcel, header, zzbf.CREATOR);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    zzbfVar3 = (zzbf) SafeParcelReader.createParcelable(parcel, header, zzbf.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzae(strCreateString, strCreateString2, zzonVar, j3, z2, strCreateString3, zzbfVar, j4, zzbfVar2, j5, zzbfVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i3) {
        return new zzae[i3];
    }
}
