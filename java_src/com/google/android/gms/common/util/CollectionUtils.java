package com.google.android.gms.common.util;

import androidx.collection.C0921a;
import androidx.collection.C0922b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    public static <K, V> Map<K, V> mapOf(K k3, V v2, K k4, V v3, K k5, V v4) {
        Map mapZza = zza(3, false);
        mapZza.put(k3, v2);
        mapZza.put(k4, v3);
        mapZza.put(k5, v4);
        return Collections.unmodifiableMap(mapZza);
    }

    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZza = zza(length, false);
        for (int i3 = 0; i3 < kArr.length; i3++) {
            mapZza.put(kArr[i3], vArr[i3]);
        }
        return Collections.unmodifiableMap(mapZza);
    }

    public static <T> Set<T> mutableSetOfWithSize(int i3) {
        return i3 == 0 ? new C0922b() : zzb(i3, true);
    }

    @Deprecated
    public static <T> Set<T> setOf(T t2, T t3, T t4) {
        Set setZzb = zzb(3, false);
        setZzb.add(t2);
        setZzb.add(t3);
        setZzb.add(t4);
        return Collections.unmodifiableSet(setZzb);
    }

    private static Map zza(int i3, boolean z2) {
        return i3 <= 256 ? new C0921a(i3) : new HashMap(i3, 1.0f);
    }

    private static Set zzb(int i3, boolean z2) {
        if (i3 <= (true != z2 ? 256 : 128)) {
            return new C0922b(i3);
        }
        return new HashSet(i3, true != z2 ? 1.0f : 0.75f);
    }

    @Deprecated
    public static <T> List<T> listOf(T t2) {
        return Collections.singletonList(t2);
    }

    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    public static <K, V> Map<K, V> mapOf(K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7) {
        Map mapZza = zza(6, false);
        mapZza.put(k3, v2);
        mapZza.put(k4, v3);
        mapZza.put(k5, v4);
        mapZza.put(k6, v5);
        mapZza.put(k7, v6);
        mapZza.put(k8, v7);
        return Collections.unmodifiableMap(mapZza);
    }

    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t2 = tArr[0];
            T t3 = tArr[1];
            Set setZzb = zzb(2, false);
            setZzb.add(t2);
            setZzb.add(t3);
            return Collections.unmodifiableSet(setZzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZzb2 = zzb(length, false);
            Collections.addAll(setZzb2, tArr);
            return Collections.unmodifiableSet(setZzb2);
        }
        T t4 = tArr[0];
        T t5 = tArr[1];
        T t6 = tArr[2];
        T t7 = tArr[3];
        Set setZzb3 = zzb(4, false);
        setZzb3.add(t4);
        setZzb3.add(t5);
        setZzb3.add(t6);
        setZzb3.add(t7);
        return Collections.unmodifiableSet(setZzb3);
    }
}
