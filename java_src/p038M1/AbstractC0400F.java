package p038M1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p035L1.C0380l;
import p071X1.AbstractC0606k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: M1.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0400F extends AbstractC0399E {
    /* JADX INFO: renamed from: d */
    public static Map m1398d() {
        C0432z c0432z = C0432z.f1541d;
        AbstractC0606k.m2143c(c0432z, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c0432z;
    }

    /* JADX INFO: renamed from: e */
    public static final Map m1399e(Map map) {
        AbstractC0606k.m2145e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : AbstractC0399E.m1397c(map) : m1398d();
    }

    /* JADX INFO: renamed from: f */
    public static final void m1400f(Map map, Iterable iterable) {
        AbstractC0606k.m2145e(map, "<this>");
        AbstractC0606k.m2145e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C0380l c0380l = (C0380l) it.next();
            map.put(c0380l.m1365a(), c0380l.m1366b());
        }
    }

    /* JADX INFO: renamed from: g */
    public static Map m1401g(Iterable iterable) {
        AbstractC0606k.m2145e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m1399e(m1402h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m1398d();
        }
        if (size != 1) {
            return m1402h(iterable, new LinkedHashMap(AbstractC0399E.m1395a(collection.size())));
        }
        return AbstractC0399E.m1396b((C0380l) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    /* JADX INFO: renamed from: h */
    public static final Map m1402h(Iterable iterable, Map map) {
        AbstractC0606k.m2145e(iterable, "<this>");
        AbstractC0606k.m2145e(map, "destination");
        m1400f(map, iterable);
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static Map m1403i(Map map) {
        AbstractC0606k.m2145e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m1404j(map) : AbstractC0399E.m1397c(map) : m1398d();
    }

    /* JADX INFO: renamed from: j */
    public static final Map m1404j(Map map) {
        AbstractC0606k.m2145e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
