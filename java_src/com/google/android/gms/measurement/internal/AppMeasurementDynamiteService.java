package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.C0921a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzdm {
    zzhy zza = null;
    private final Map<Integer, zzjl> zzb = new C0921a();

    class zza implements zzjm {
        private com.google.android.gms.internal.measurement.zzdp zza;

        zza(com.google.android.gms.internal.measurement.zzdp zzdpVar) {
            this.zza = zzdpVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzjm
        public final void interceptEvent(String str, String str2, Bundle bundle, long j3) {
            try {
                this.zza.zza(str, str2, bundle, j3);
            } catch (RemoteException e3) {
                zzhy zzhyVar = AppMeasurementDynamiteService.this.zza;
                if (zzhyVar != null) {
                    zzhyVar.zzj().zzu().zza("Event interceptor threw exception", e3);
                }
            }
        }
    }

    class zzb implements zzjl {
        private com.google.android.gms.internal.measurement.zzdp zza;

        zzb(com.google.android.gms.internal.measurement.zzdp zzdpVar) {
            this.zza = zzdpVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzjl
        public final void onEvent(String str, String str2, Bundle bundle, long j3) {
            try {
                this.zza.zza(str, str2, bundle, j3);
            } catch (RemoteException e3) {
                zzhy zzhyVar = AppMeasurementDynamiteService.this.zza;
                if (zzhyVar != null) {
                    zzhyVar.zzj().zzu().zza("Event listener threw exception", e3);
                }
            }
        }
    }

    private final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void beginAdUnitExposure(String str, long j3) {
        zza();
        this.zza.zze().zza(str, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zza();
        this.zza.zzp().zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void clearMeasurementEnabled(long j3) {
        zza();
        this.zza.zzp().zza((Boolean) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void endAdUnitExposure(String str, long j3) {
        zza();
        this.zza.zze().zzb(str, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void generateEventId(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        long jZzn = this.zza.zzt().zzn();
        zza();
        this.zza.zzt().zza(zzdoVar, jZzn);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        this.zza.zzl().zzb(new zzi(this, zzdoVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        zza(zzdoVar, this.zza.zzp().zzag());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        this.zza.zzl().zzb(new zzl(this, zzdoVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        zza(zzdoVar, this.zza.zzp().zzah());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        zza(zzdoVar, this.zza.zzp().zzai());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        zza(zzdoVar, this.zza.zzp().zzaj());
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        this.zza.zzp();
        zzjq.zza(str);
        zza();
        this.zza.zzt().zza(zzdoVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getSessionId(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        this.zza.zzp().zza(zzdoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getTestFlag(com.google.android.gms.internal.measurement.zzdo zzdoVar, int i3) {
        zza();
        if (i3 == 0) {
            this.zza.zzt().zza(zzdoVar, this.zza.zzp().zzak());
            return;
        }
        if (i3 == 1) {
            this.zza.zzt().zza(zzdoVar, this.zza.zzp().zzaf().longValue());
            return;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                this.zza.zzt().zza(zzdoVar, this.zza.zzp().zzae().intValue());
                return;
            } else {
                if (i3 != 4) {
                    return;
                }
                this.zza.zzt().zza(zzdoVar, this.zza.zzp().zzac().booleanValue());
                return;
            }
        }
        zzos zzosVarZzt = this.zza.zzt();
        double dDoubleValue = this.zza.zzp().zzad().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e3) {
            zzosVarZzt.zzu.zzj().zzu().zza("Error returning double value to wrapper", e3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void getUserProperties(String str, String str2, boolean z2, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        this.zza.zzl().zzb(new zzj(this, zzdoVar, str, str2, z2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void initForTests(Map map) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdw zzdwVar, long j3) {
        zzhy zzhyVar = this.zza;
        if (zzhyVar == null) {
            this.zza = zzhy.zza((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzdwVar, Long.valueOf(j3));
        } else {
            zzhyVar.zzj().zzu().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zza();
        this.zza.zzl().zzb(new zzn(this, zzdoVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j3) {
        zza();
        this.zza.zzp().zza(str, str2, bundle, z2, z3, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzdo zzdoVar, long j3) {
        zza();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzl().zzb(new zzk(this, zzdoVar, new zzbf(str2, new zzbe(bundle), "app", j3), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void logHealthData(int i3, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        zza();
        this.zza.zzj().zza(i3, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j3) {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksZzaa = this.zza.zzp().zzaa();
        if (activityLifecycleCallbacksZzaa != null) {
            this.zza.zzp().zzao();
            activityLifecycleCallbacksZzaa.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j3) {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksZzaa = this.zza.zzp().zzaa();
        if (activityLifecycleCallbacksZzaa != null) {
            this.zza.zzp().zzao();
            activityLifecycleCallbacksZzaa.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j3) {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksZzaa = this.zza.zzp().zzaa();
        if (activityLifecycleCallbacksZzaa != null) {
            this.zza.zzp().zzao();
            activityLifecycleCallbacksZzaa.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j3) {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksZzaa = this.zza.zzp().zzaa();
        if (activityLifecycleCallbacksZzaa != null) {
            this.zza.zzp().zzao();
            activityLifecycleCallbacksZzaa.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdo zzdoVar, long j3) {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksZzaa = this.zza.zzp().zzaa();
        Bundle bundle = new Bundle();
        if (activityLifecycleCallbacksZzaa != null) {
            this.zza.zzp().zzao();
            activityLifecycleCallbacksZzaa.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e3) {
            this.zza.zzj().zzu().zza("Error returning bundle value to wrapper", e3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j3) {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksZzaa = this.zza.zzp().zzaa();
        if (activityLifecycleCallbacksZzaa != null) {
            this.zza.zzp().zzao();
            activityLifecycleCallbacksZzaa.onActivityStarted((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j3) {
        zza();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksZzaa = this.zza.zzp().zzaa();
        if (activityLifecycleCallbacksZzaa != null) {
            this.zza.zzp().zzao();
            activityLifecycleCallbacksZzaa.onActivityStopped((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzdo zzdoVar, long j3) {
        zza();
        zzdoVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdp zzdpVar) {
        zzjl zzbVar;
        zza();
        synchronized (this.zzb) {
            try {
                zzbVar = this.zzb.get(Integer.valueOf(zzdpVar.zza()));
                if (zzbVar == null) {
                    zzbVar = new zzb(zzdpVar);
                    this.zzb.put(Integer.valueOf(zzdpVar.zza()), zzbVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzp().zza(zzbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void resetAnalyticsData(long j3) {
        zza();
        this.zza.zzp().zza(j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setConditionalUserProperty(Bundle bundle, long j3) {
        zza();
        if (bundle == null) {
            this.zza.zzj().zzg().zza("Conditional user property must not be null");
        } else {
            this.zza.zzp().zzb(bundle, j3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setConsent(Bundle bundle, long j3) {
        zza();
        this.zza.zzp().zzc(bundle, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setConsentThirdParty(Bundle bundle, long j3) {
        zza();
        this.zza.zzp().zzd(bundle, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j3) {
        zza();
        this.zza.zzq().zza((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setDataCollectionEnabled(boolean z2) {
        zza();
        this.zza.zzp().zzc(z2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setDefaultEventParameters(Bundle bundle) {
        zza();
        this.zza.zzp().zzc(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzdp zzdpVar) {
        zza();
        zza zzaVar = new zza(zzdpVar);
        if (this.zza.zzl().zzg()) {
            this.zza.zzp().zza(zzaVar);
        } else {
            this.zza.zzl().zzb(new zzm(this, zzaVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdu zzduVar) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setMeasurementEnabled(boolean z2, long j3) {
        zza();
        this.zza.zzp().zza(Boolean.valueOf(z2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setMinimumSessionDuration(long j3) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setSessionTimeoutDuration(long j3) {
        zza();
        this.zza.zzp().zzc(j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setSgtmDebugInfo(Intent intent) {
        zza();
        this.zza.zzp().zza(intent);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setUserId(String str, long j3) {
        zza();
        this.zza.zzp().zza(str, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j3) {
        zza();
        this.zza.zzp().zza(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z2, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdp zzdpVar) {
        zzjl zzjlVarRemove;
        zza();
        synchronized (this.zzb) {
            zzjlVarRemove = this.zzb.remove(Integer.valueOf(zzdpVar.zza()));
        }
        if (zzjlVarRemove == null) {
            zzjlVarRemove = new zzb(zzdpVar);
        }
        this.zza.zzp().zzb(zzjlVarRemove);
    }

    private final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, String str) {
        zza();
        this.zza.zzt().zza(zzdoVar, str);
    }
}
