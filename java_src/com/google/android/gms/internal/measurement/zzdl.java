package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzdl extends zzbu implements zzdj {
    zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void beginAdUnitExposure(String str, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeLong(j3);
        zzb(23, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        zzbw.zza(parcelM7249a_, bundle);
        zzb(9, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void clearMeasurementEnabled(long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeLong(j3);
        zzb(43, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void endAdUnitExposure(String str, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeLong(j3);
        zzb(24, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void generateEventId(zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(22, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getAppInstanceId(zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(20, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getCachedAppInstanceId(zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(19, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getConditionalUserProperties(String str, String str2, zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(10, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getCurrentScreenClass(zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(17, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getCurrentScreenName(zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(16, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getGmpAppId(zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(21, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getMaxUserProperties(String str, zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(6, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getSessionId(zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(46, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getTestFlag(zzdo zzdoVar, int i3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdoVar);
        parcelM7249a_.writeInt(i3);
        zzb(38, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getUserProperties(String str, String str2, boolean z2, zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        zzbw.zza(parcelM7249a_, z2);
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(5, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void initForTests(Map map) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeMap(map);
        zzb(37, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void initialize(IObjectWrapper iObjectWrapper, zzdw zzdwVar, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        zzbw.zza(parcelM7249a_, zzdwVar);
        parcelM7249a_.writeLong(j3);
        zzb(1, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void isDataCollectionEnabled(zzdo zzdoVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdoVar);
        zzb(40, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        zzbw.zza(parcelM7249a_, bundle);
        zzbw.zza(parcelM7249a_, z2);
        zzbw.zza(parcelM7249a_, z3);
        parcelM7249a_.writeLong(j3);
        zzb(2, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzdo zzdoVar, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        zzbw.zza(parcelM7249a_, bundle);
        zzbw.zza(parcelM7249a_, zzdoVar);
        parcelM7249a_.writeLong(j3);
        zzb(3, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void logHealthData(int i3, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeInt(i3);
        parcelM7249a_.writeString(str);
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        zzbw.zza(parcelM7249a_, iObjectWrapper2);
        zzbw.zza(parcelM7249a_, iObjectWrapper3);
        zzb(33, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        zzbw.zza(parcelM7249a_, bundle);
        parcelM7249a_.writeLong(j3);
        zzb(27, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        parcelM7249a_.writeLong(j3);
        zzb(28, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        parcelM7249a_.writeLong(j3);
        zzb(29, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        parcelM7249a_.writeLong(j3);
        zzb(30, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdo zzdoVar, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        zzbw.zza(parcelM7249a_, zzdoVar);
        parcelM7249a_.writeLong(j3);
        zzb(31, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        parcelM7249a_.writeLong(j3);
        zzb(25, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        parcelM7249a_.writeLong(j3);
        zzb(26, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void performAction(Bundle bundle, zzdo zzdoVar, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, bundle);
        zzbw.zza(parcelM7249a_, zzdoVar);
        parcelM7249a_.writeLong(j3);
        zzb(32, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void registerOnMeasurementEventListener(zzdp zzdpVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdpVar);
        zzb(35, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void resetAnalyticsData(long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeLong(j3);
        zzb(12, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setConditionalUserProperty(Bundle bundle, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, bundle);
        parcelM7249a_.writeLong(j3);
        zzb(8, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setConsent(Bundle bundle, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, bundle);
        parcelM7249a_.writeLong(j3);
        zzb(44, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setConsentThirdParty(Bundle bundle, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, bundle);
        parcelM7249a_.writeLong(j3);
        zzb(45, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        parcelM7249a_.writeLong(j3);
        zzb(15, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setDataCollectionEnabled(boolean z2) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, z2);
        zzb(39, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, bundle);
        zzb(42, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setEventInterceptor(zzdp zzdpVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdpVar);
        zzb(34, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setInstanceIdProvider(zzdu zzduVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzduVar);
        zzb(18, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setMeasurementEnabled(boolean z2, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, z2);
        parcelM7249a_.writeLong(j3);
        zzb(11, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setMinimumSessionDuration(long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeLong(j3);
        zzb(13, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setSessionTimeoutDuration(long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeLong(j3);
        zzb(14, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, intent);
        zzb(48, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setUserId(String str, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeLong(j3);
        zzb(7, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j3) {
        Parcel parcelM7249a_ = m7249a_();
        parcelM7249a_.writeString(str);
        parcelM7249a_.writeString(str2);
        zzbw.zza(parcelM7249a_, iObjectWrapper);
        zzbw.zza(parcelM7249a_, z2);
        parcelM7249a_.writeLong(j3);
        zzb(4, parcelM7249a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void unregisterOnMeasurementEventListener(zzdp zzdpVar) {
        Parcel parcelM7249a_ = m7249a_();
        zzbw.zza(parcelM7249a_, zzdpVar);
        zzb(36, parcelM7249a_);
    }
}
