package androidx.collection;

import p071X1.AbstractC0606k;
import p134o.AbstractC2284a;

/* JADX INFO: renamed from: androidx.collection.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0931k {

    /* JADX INFO: renamed from: a */
    private static final Object f3815a = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object m3961c(C0930j c0930j, int i3) {
        Object obj;
        AbstractC0606k.m2145e(c0930j, "<this>");
        int iM10890a = AbstractC2284a.m10890a(c0930j.f3812e, c0930j.f3814g, i3);
        if (iM10890a < 0 || (obj = c0930j.f3813f[iM10890a]) == f3815a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m3962d(C0930j c0930j, int i3, Object obj) {
        Object obj2;
        AbstractC0606k.m2145e(c0930j, "<this>");
        int iM10890a = AbstractC2284a.m10890a(c0930j.f3812e, c0930j.f3814g, i3);
        return (iM10890a < 0 || (obj2 = c0930j.f3813f[iM10890a]) == f3815a) ? obj : obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m3963e(C0930j c0930j) {
        int i3 = c0930j.f3814g;
        int[] iArr = c0930j.f3812e;
        Object[] objArr = c0930j.f3813f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f3815a) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        c0930j.f3811d = false;
        c0930j.f3814g = i4;
    }
}
