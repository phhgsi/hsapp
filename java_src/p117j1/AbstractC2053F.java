package p117j1;

/* JADX INFO: renamed from: j1.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2053F {
    /* JADX INFO: renamed from: a */
    static Object m10272a(Object obj, int i3) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i3);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    static Object[] m10273b(Object... objArr) {
        m10274c(objArr, objArr.length);
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    static Object[] m10274c(Object[] objArr, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            m10272a(objArr[i4], i4);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: d */
    public static Object[] m10275d(Object[] objArr, int i3) {
        return AbstractC2055H.m10282b(objArr, i3);
    }
}
