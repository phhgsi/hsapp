package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzgd extends com.google.android.gms.internal.measurement.zzbu implements zzgb {
    zzgd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzaj zza(zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        Parcel parcelZza = zza(21, parcelM7249a_);
        zzaj zzajVar = (zzaj) com.google.android.gms.internal.measurement.zzbw.zza(parcelZza, zzaj.CREATOR);
        parcelZza.recycle();
        return zzajVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String zzb(zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        Parcel parcelZza = zza(11, parcelM7249a_);
        String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzc(zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(27, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzd(zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(4, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zze(zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(18, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzf(zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(20, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzg(zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(26, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzh(zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(6, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzi(zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(25, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzno> zza(zzo zzoVar, Bundle bundle) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, bundle);
        Parcel parcelZza = zza(24, parcelM7249a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzno.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzb(Bundle bundle, zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, bundle);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(28, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzon> zza(zzo zzoVar, boolean z2) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, z2);
        Parcel parcelZza = zza(7, parcelM7249a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzon.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzae> zza(String str, String str2, zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        Parcel parcelZza = zza(16, parcelM7249a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzae.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzae> zza(String str, String str2, String str3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        parcelM7249a_.writeString(str3);
        Parcel parcelZza = zza(17, parcelM7249a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzae.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzon> zza(String str, String str2, boolean z2, zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, z2);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        Parcel parcelZza = zza(14, parcelM7249a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzon.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List<zzon> zza(String str, String str2, String str3, boolean z2) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        parcelM7249a_.writeString(str3);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, z2);
        Parcel parcelZza = zza(15, parcelM7249a_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(zzon.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzbf zzbfVar, zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzbfVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(1, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzbf zzbfVar, String str, String str2) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzbfVar);
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        zzb(5, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzae zzaeVar, zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzaeVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(12, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzae zzaeVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzaeVar);
        zzb(13, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(long j3, String str, String str2, String str3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeLong(j3);
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        parcelM7249a_.writeString(str3);
        zzb(10, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(Bundle bundle, zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, bundle);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(19, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zza(zzon zzonVar, zzo zzoVar) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzonVar);
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzoVar);
        zzb(2, parcelM7249a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] zza(zzbf zzbfVar, String str) {
        Parcel parcelM7249a_ = m7249a_();
        com.google.android.gms.internal.measurement.zzbw.zza(parcelM7249a_, zzbfVar);
        parcelM7249a_.writeString(str);
        Parcel parcelZza = zza(9, parcelM7249a_);
        byte[] bArrCreateByteArray = parcelZza.createByteArray();
        parcelZza.recycle();
        return bArrCreateByteArray;
    }
}
