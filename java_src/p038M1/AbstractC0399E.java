package p038M1;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Map;
import p035L1.C0380l;
import p071X1.AbstractC0606k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: M1.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399E extends AbstractC0398D {
    /* JADX INFO: renamed from: a */
    public static int m1395a(int i3) {
        return i3 < 0 ? i3 : i3 < 3 ? i3 + 1 : i3 < 1073741824 ? (int) ((i3 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: b */
    public static final Map m1396b(C0380l c0380l) {
        AbstractC0606k.m2145e(c0380l, "pair");
        Map mapSingletonMap = Collections.singletonMap(c0380l.m1367c(), c0380l.m1368d());
        AbstractC0606k.m2144d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: c */
    public static final Map m1397c(Map map) {
        AbstractC0606k.m2145e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC0606k.m2144d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
