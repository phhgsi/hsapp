package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import p071X1.AbstractC0606k;
import p098e2.AbstractC1868d;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "ClientIdentityCreator")
@SafeParcelable.Reserved({2, 5})
public final class zze extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getUid", m7227id = 1)
    private final int zzb;

    @SafeParcelable.Field(getter = "getPackageName", m7227id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getAttributionTag", m7227id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getListenerId", m7227id = 6)
    private final String zze;

    @SafeParcelable.Field(getter = "getClientFeatures", m7227id = 8)
    private final List zzf;

    @SafeParcelable.Field(getter = "getImpersonator", m7227id = 7)
    private final zze zzg;
    public static final zzd zza = new zzd(null);
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    static {
        Process.myUid();
        Process.myPid();
    }

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(m7228id = 1) int i3, @SafeParcelable.Param(m7228id = 3) String str, @SafeParcelable.Param(m7228id = 4) String str2, @SafeParcelable.Param(m7228id = 6) String str3, @SafeParcelable.Param(m7228id = 8) List list, @SafeParcelable.Param(m7228id = 7) zze zzeVar) {
        AbstractC0606k.m2145e(str, "packageName");
        if (zzeVar != null && zzeVar.zza()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.zzb = i3;
        this.zzc = str;
        this.zzd = str2;
        this.zze = str3 == null ? zzeVar != null ? zzeVar.zze : null : str3;
        if (list == null) {
            list = zzeVar != null ? zzeVar.zzf : null;
            if (list == null) {
                list = zzex.zzi();
                AbstractC0606k.m2144d(list, "of(...)");
            }
        }
        AbstractC0606k.m2145e(list, "<this>");
        zzex zzexVarZzj = zzex.zzj(list);
        AbstractC0606k.m2144d(zzexVarZzj, "copyOf(...)");
        this.zzf = zzexVarZzj;
        this.zzg = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (this.zzb == zzeVar.zzb && AbstractC0606k.m2141a(this.zzc, zzeVar.zzc) && AbstractC0606k.m2141a(this.zzd, zzeVar.zzd) && AbstractC0606k.m2141a(this.zze, zzeVar.zze) && AbstractC0606k.m2141a(this.zzg, zzeVar.zzg) && AbstractC0606k.m2141a(this.zzf, zzeVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzg});
    }

    public final String toString() {
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        StringBuilder sb = new StringBuilder(length + (str != null ? str.length() : 0));
        sb.append(this.zzb);
        sb.append("/");
        sb.append(this.zzc);
        String str2 = this.zzd;
        if (str2 != null) {
            sb.append("[");
            if (AbstractC1868d.m9672i(str2, this.zzc, false, 2, null)) {
                sb.append((CharSequence) str2, this.zzc.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        if (this.zze != null) {
            sb.append("/");
            String str3 = this.zze;
            sb.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb.toString();
        AbstractC0606k.m2144d(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        AbstractC0606k.m2145e(parcel, "dest");
        int i4 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i4);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i3, false);
        SafeParcelWriter.writeTypedList(parcel, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.zzg != null;
    }
}
