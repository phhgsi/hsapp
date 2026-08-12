package androidx.collection;

import java.util.ConcurrentModificationException;
import p071X1.AbstractC0606k;
import p134o.AbstractC2284a;

/* JADX INFO: renamed from: androidx.collection.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0924d {
    /* JADX INFO: renamed from: a */
    public static final void m3921a(C0922b c0922b, int i3) {
        AbstractC0606k.m2145e(c0922b, "<this>");
        c0922b.m3917i(new int[i3]);
        c0922b.m3916h(new Object[i3]);
    }

    /* JADX INFO: renamed from: b */
    public static final int m3922b(C0922b c0922b, int i3) {
        AbstractC0606k.m2145e(c0922b, "<this>");
        try {
            return AbstractC2284a.m10890a(c0922b.m3912d(), c0922b.m3914f(), i3);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m3923c(C0922b c0922b, Object obj, int i3) {
        AbstractC0606k.m2145e(c0922b, "<this>");
        int iM3914f = c0922b.m3914f();
        if (iM3914f == 0) {
            return -1;
        }
        int iM3922b = m3922b(c0922b, i3);
        if (iM3922b < 0 || AbstractC0606k.m2141a(obj, c0922b.m3911c()[iM3922b])) {
            return iM3922b;
        }
        int i4 = iM3922b + 1;
        while (i4 < iM3914f && c0922b.m3912d()[i4] == i3) {
            if (AbstractC0606k.m2141a(obj, c0922b.m3911c()[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iM3922b - 1; i5 >= 0 && c0922b.m3912d()[i5] == i3; i5--) {
            if (AbstractC0606k.m2141a(obj, c0922b.m3911c()[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: d */
    public static final int m3924d(C0922b c0922b) {
        AbstractC0606k.m2145e(c0922b, "<this>");
        return m3923c(c0922b, null, 0);
    }
}
