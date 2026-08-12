package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface zzdj extends IInterface {
    void beginAdUnitExposure(String str, long j3);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j3);

    void endAdUnitExposure(String str, long j3);

    void generateEventId(zzdo zzdoVar);

    void getAppInstanceId(zzdo zzdoVar);

    void getCachedAppInstanceId(zzdo zzdoVar);

    void getConditionalUserProperties(String str, String str2, zzdo zzdoVar);

    void getCurrentScreenClass(zzdo zzdoVar);

    void getCurrentScreenName(zzdo zzdoVar);

    void getGmpAppId(zzdo zzdoVar);

    void getMaxUserProperties(String str, zzdo zzdoVar);

    void getSessionId(zzdo zzdoVar);

    void getTestFlag(zzdo zzdoVar, int i3);

    void getUserProperties(String str, String str2, boolean z2, zzdo zzdoVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdw zzdwVar, long j3);

    void isDataCollectionEnabled(zzdo zzdoVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j3);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzdo zzdoVar, long j3);

    void logHealthData(int i3, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j3);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j3);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j3);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j3);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdo zzdoVar, long j3);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j3);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j3);

    void performAction(Bundle bundle, zzdo zzdoVar, long j3);

    void registerOnMeasurementEventListener(zzdp zzdpVar);

    void resetAnalyticsData(long j3);

    void setConditionalUserProperty(Bundle bundle, long j3);

    void setConsent(Bundle bundle, long j3);

    void setConsentThirdParty(Bundle bundle, long j3);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j3);

    void setDataCollectionEnabled(boolean z2);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzdp zzdpVar);

    void setInstanceIdProvider(zzdu zzduVar);

    void setMeasurementEnabled(boolean z2, long j3);

    void setMinimumSessionDuration(long j3);

    void setSessionTimeoutDuration(long j3);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j3);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j3);

    void unregisterOnMeasurementEventListener(zzdp zzdpVar);
}
