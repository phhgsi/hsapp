package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: androidx.collection.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0923c {
    /* JADX INFO: renamed from: a */
    static Object[] m3920a(Object[] objArr, int i3) {
        if (objArr.length < i3) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
