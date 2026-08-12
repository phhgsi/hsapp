package p117j1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: j1.H */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2055H {
    /* JADX INFO: renamed from: a */
    static Object[] m10281a(Object[] objArr, int i3, int i4, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i3, i4, objArr2.getClass());
    }

    /* JADX INFO: renamed from: b */
    static Object[] m10282b(Object[] objArr, int i3) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
    }

    /* JADX INFO: renamed from: c */
    static Map m10283c() {
        return C2075i.m10361r();
    }
}
