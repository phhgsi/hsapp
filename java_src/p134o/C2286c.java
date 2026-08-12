package p134o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Set;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: o.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2286c {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap f10463a;

    public C2286c(int i3, float f3) {
        this.f10463a = new LinkedHashMap(i3, f3, true);
    }

    /* JADX INFO: renamed from: a */
    public final Object m10896a(Object obj) {
        AbstractC0606k.m2145e(obj, "key");
        return this.f10463a.get(obj);
    }

    /* JADX INFO: renamed from: b */
    public final Set m10897b() {
        Set setEntrySet = this.f10463a.entrySet();
        AbstractC0606k.m2144d(setEntrySet, "map.entries");
        return setEntrySet;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10898c() {
        return this.f10463a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final Object m10899d(Object obj, Object obj2) {
        AbstractC0606k.m2145e(obj, "key");
        AbstractC0606k.m2145e(obj2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return this.f10463a.put(obj, obj2);
    }

    /* JADX INFO: renamed from: e */
    public final Object m10900e(Object obj) {
        AbstractC0606k.m2145e(obj, "key");
        return this.f10463a.remove(obj);
    }
}
