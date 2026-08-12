package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.internal.zzlb;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C1680c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b */
    private static volatile FirebaseAnalytics f8359b;

    /* JADX INFO: renamed from: a */
    private final zzdy f8360a;

    private FirebaseAnalytics(zzdy zzdyVar) {
        Preconditions.checkNotNull(zzdyVar);
        this.f8360a = zzdyVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f8359b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f8359b == null) {
                        f8359b = new FirebaseAnalytics(zzdy.zza(context));
                    }
                } finally {
                }
            }
        }
        return f8359b;
    }

    public static zzlb getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdy zzdyVarZza = zzdy.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zzdyVarZza == null) {
            return null;
        }
        return new C1659a(zzdyVarZza);
    }

    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(C1680c.m9176q().mo193b(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        } catch (ExecutionException e4) {
            throw new IllegalStateException(e4.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f8360a.zza(activity, str, str2);
    }
}
