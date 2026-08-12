package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        com.google.android.gms.internal.location.zze zzeVar = null;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        long j3 = Long.MAX_VALUE;
        long j4 = Long.MAX_VALUE;
        int i5 = 102;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 2:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, header, WorkSource.CREATOR);
                    break;
                case 7:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    zzeVar = (com.google.android.gms.internal.location.zze) SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.location.zze.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CurrentLocationRequest(j3, i3, i5, j4, z2, i4, workSource, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new CurrentLocationRequest[i3];
    }
}
