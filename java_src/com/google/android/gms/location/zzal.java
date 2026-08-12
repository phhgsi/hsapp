package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    zzal(int i3, int i4, long j3, long j4) {
        this.zza = i3;
        this.zzb = i4;
        this.zzc = j3;
        this.zzd = j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.zza == zzalVar.zza && this.zzb == zzalVar.zzb && this.zzc == zzalVar.zzc && this.zzd == zzalVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zza), Long.valueOf(this.zzd), Long.valueOf(this.zzc));
    }

    public final String toString() {
        int i3 = this.zza;
        int length = String.valueOf(i3).length();
        int i4 = this.zzb;
        int length2 = String.valueOf(i4).length();
        long j3 = this.zzd;
        int length3 = String.valueOf(j3).length();
        long j4 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j4).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i3);
        sb.append(" Cell status: ");
        sb.append(i4);
        sb.append(" elapsed time NS: ");
        sb.append(j3);
        sb.append(" system time ms: ");
        sb.append(j4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i4);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
