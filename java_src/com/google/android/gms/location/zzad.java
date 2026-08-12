package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();
    private final boolean zza;
    private final com.google.android.gms.internal.location.zze zzb;

    zzad(boolean z2, com.google.android.gms.internal.location.zze zzeVar) {
        this.zza = z2;
        this.zzb = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        return this.zza == zzadVar.zza && Objects.equal(this.zzb, zzadVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationAvailabilityRequest[");
        if (this.zza) {
            sb.append("bypass, ");
        }
        if (this.zzb != null) {
            sb.append("impersonation=");
            sb.append(this.zzb);
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        boolean z2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z2);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i3, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
