package p038M1;

import java.lang.reflect.Array;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: M1.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0414h {
    /* JADX INFO: renamed from: a */
    public static final Object[] m1433a(Object[] objArr, int i3) {
        AbstractC0606k.m2145e(objArr, "reference");
        Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
        AbstractC0606k.m2143c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1434b(int i3, int i4) {
        if (i3 <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i4 + ").");
    }
}
