package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public final class zzjf {
    public static <T> T zza(Bundle bundle, String str, Class<T> cls, T t2) {
        T t3 = (T) bundle.get(str);
        if (t3 == null) {
            return t2;
        }
        if (cls.isAssignableFrom(t3.getClass())) {
            return t3;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t3.getClass().getCanonicalName()));
    }

    public static void zza(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.VALUE, ((Long) obj).longValue());
        } else {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, obj.toString());
        }
    }
}
