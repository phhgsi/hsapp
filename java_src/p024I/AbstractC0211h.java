package p024I;

import java.util.Locale;

/* JADX INFO: renamed from: I.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0211h {
    /* JADX INFO: renamed from: a */
    public static void m604a(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m605b(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m606c(int i3, int i4, int i5, String str) {
        if (i3 < i4) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        if (i3 <= i5) {
            return i3;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    /* JADX INFO: renamed from: d */
    public static int m607d(int i3) {
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: e */
    public static int m608e(int i3, String str) {
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: f */
    public static int m609f(int i3, int i4) {
        if ((i3 & i4) == i3) {
            return i3;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(i4) + " are allowed");
    }

    /* JADX INFO: renamed from: g */
    public static Object m610g(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Object m611h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* JADX INFO: renamed from: i */
    public static void m612i(boolean z2, String str) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }
}
