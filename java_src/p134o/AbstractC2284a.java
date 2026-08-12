package p134o;

import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: o.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2284a {

    /* JADX INFO: renamed from: a */
    public static final int[] f10460a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f10461b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f10462c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final int m10890a(int[] iArr, int i3, int i4) {
        AbstractC0606k.m2145e(iArr, "array");
        int i5 = i3 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = iArr[i7];
            if (i8 < i4) {
                i6 = i7 + 1;
            } else {
                if (i8 <= i4) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }

    /* JADX INFO: renamed from: b */
    public static final int m10891b(long[] jArr, int i3, long j3) {
        AbstractC0606k.m2145e(jArr, "array");
        int i4 = i3 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j4 = jArr[i6];
            if (j4 < j3) {
                i5 = i6 + 1;
            } else {
                if (j4 <= j3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m10892c(Object obj, Object obj2) {
        return AbstractC0606k.m2141a(obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static final int m10893d(int i3) {
        for (int i4 = 4; i4 < 32; i4++) {
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                return i5;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: e */
    public static final int m10894e(int i3) {
        return m10893d(i3 * 4) / 4;
    }

    /* JADX INFO: renamed from: f */
    public static final int m10895f(int i3) {
        return m10893d(i3 * 8) / 8;
    }
}
