package p038M1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p071X1.AbstractC0606k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: M1.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0420n {
    /* JADX INFO: renamed from: a */
    public static final Object[] m1454a(Object[] objArr, boolean z2) {
        AbstractC0606k.m2145e(objArr, "<this>");
        if (z2 && AbstractC0606k.m2141a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC0606k.m2144d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static List m1455b(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC0606k.m2144d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: c */
    public static final Object[] m1456c(int i3, Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "array");
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
