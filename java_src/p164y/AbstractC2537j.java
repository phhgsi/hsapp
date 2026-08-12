package p164y;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: y.j */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2537j {
    /* JADX INFO: renamed from: a */
    public static int[] m12132a(int[] iArr, int i3, int i4) {
        if (i3 + 1 > iArr.length) {
            int[] iArr2 = new int[m12134c(i3)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            iArr = iArr2;
        }
        iArr[i3] = i4;
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m12133b(Object[] objArr, int i3, Object obj) {
        if (i3 + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m12134c(i3));
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            objArr = objArr2;
        }
        objArr[i3] = obj;
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m12134c(int i3) {
        if (i3 <= 4) {
            return 8;
        }
        return i3 * 2;
    }
}
