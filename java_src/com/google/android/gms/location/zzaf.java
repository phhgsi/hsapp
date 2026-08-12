package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        com.google.android.gms.internal.location.zze zzeVar = null;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        long j3 = -1;
        float f3 = 0.0f;
        int i5 = Integer.MAX_VALUE;
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        long j6 = 0;
        long j7 = 600000;
        long j8 = 3600000;
        int i6 = 102;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                case 14:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 5:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    f3 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 15:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, header, WorkSource.CREATOR);
                    break;
                case 17:
                    zzeVar = (com.google.android.gms.internal.location.zze) SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.location.zze.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationRequest(i6, j8, j7, j6, j4, j5, i5, f3, z2, j3, i3, i4, z3, workSource, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new LocationRequest[i3];
    }
}
