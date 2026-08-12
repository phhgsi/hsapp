package p038M1;

import java.util.Arrays;
import java.util.List;
import p071X1.AbstractC0606k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: M1.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0416j extends AbstractC0415i {
    /* JADX INFO: renamed from: c */
    public static List m1435c(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "<this>");
        List listM1453a = AbstractC0418l.m1453a(objArr);
        AbstractC0606k.m2144d(listM1453a, "asList(...)");
        return listM1453a;
    }

    /* JADX INFO: renamed from: d */
    public static int[] m1436d(int[] iArr, int[] iArr2, int i3, int i4, int i5) {
        AbstractC0606k.m2145e(iArr, "<this>");
        AbstractC0606k.m2145e(iArr2, "destination");
        System.arraycopy(iArr, i4, iArr2, i3, i5 - i4);
        return iArr2;
    }

    /* JADX INFO: renamed from: e */
    public static long[] m1437e(long[] jArr, long[] jArr2, int i3, int i4, int i5) {
        AbstractC0606k.m2145e(jArr, "<this>");
        AbstractC0606k.m2145e(jArr2, "destination");
        System.arraycopy(jArr, i4, jArr2, i3, i5 - i4);
        return jArr2;
    }

    /* JADX INFO: renamed from: f */
    public static Object[] m1438f(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        AbstractC0606k.m2145e(objArr, "<this>");
        AbstractC0606k.m2145e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
        return objArr2;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int[] m1439g(int[] iArr, int[] iArr2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = iArr.length;
        }
        return m1436d(iArr, iArr2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object[] m1440h(Object[] objArr, Object[] objArr2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = objArr.length;
        }
        return m1438f(objArr, objArr2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: i */
    public static Object[] m1441i(Object[] objArr, int i3, int i4) {
        AbstractC0606k.m2145e(objArr, "<this>");
        AbstractC0414h.m1434b(i4, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i3, i4);
        AbstractC0606k.m2144d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: j */
    public static final void m1442j(Object[] objArr, Object obj, int i3, int i4) {
        AbstractC0606k.m2145e(objArr, "<this>");
        Arrays.fill(objArr, i3, i4, obj);
    }
}
