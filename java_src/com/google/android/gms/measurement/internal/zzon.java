package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzon extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzon> CREATOR = new zzoq();
    public final String zza;
    public final long zzb;
    public final Long zzc;
    public final String zzd;
    public final String zze;
    public final Double zzf;
    private final int zzg;

    zzon(zzop zzopVar) {
        this(zzopVar.zzc, zzopVar.zzd, zzopVar.zze, zzopVar.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzg);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 7, this.zze, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Object zza() {
        Long l3 = this.zzc;
        if (l3 != null) {
            return l3;
        }
        Double d3 = this.zzf;
        if (d3 != null) {
            return d3;
        }
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzon(String str, long j3, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zzg = 2;
        this.zza = str;
        this.zzb = j3;
        this.zze = str2;
        if (obj == null) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzc = (Long) obj;
            this.zzf = null;
            this.zzd = null;
        } else if (obj instanceof String) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.zzc = null;
            this.zzf = (Double) obj;
            this.zzd = null;
        }
    }

    zzon(int i3, String str, long j3, Long l3, Float f3, String str2, String str3, Double d3) {
        this.zzg = i3;
        this.zza = str;
        this.zzb = j3;
        this.zzc = l3;
        if (i3 == 1) {
            this.zzf = f3 != null ? Double.valueOf(f3.doubleValue()) : null;
        } else {
            this.zzf = d3;
        }
        this.zzd = str2;
        this.zze = str3;
    }
}
