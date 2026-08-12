package p071X1;

import java.util.Arrays;
import p035L1.C0387s;

/* JADX INFO: renamed from: X1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0606k {
    /* JADX INFO: renamed from: a */
    public static boolean m2141a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static void m2142b(Object obj) {
        if (obj == null) {
            m2150j();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2143c(Object obj, String str) {
        if (obj == null) {
            m2151k(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2144d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m2148h(new NullPointerException(str + " must not be null")));
    }

    /* JADX INFO: renamed from: e */
    public static void m2145e(Object obj, String str) {
        if (obj == null) {
            m2152l(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m2146f(int i3, int i4) {
        if (i3 < i4) {
            return -1;
        }
        return i3 == i4 ? 0 : 1;
    }

    /* JADX INFO: renamed from: g */
    private static String m2147g(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC0606k.class.getName();
        int i3 = 0;
        while (!stackTrace[i3].getClassName().equals(name)) {
            i3++;
        }
        while (stackTrace[i3].getClassName().equals(name)) {
            i3++;
        }
        StackTraceElement stackTraceElement = stackTrace[i3];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* JADX INFO: renamed from: h */
    private static Throwable m2148h(Throwable th) {
        return m2149i(th, AbstractC0606k.class.getName());
    }

    /* JADX INFO: renamed from: i */
    static Throwable m2149i(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(stackTrace[i4].getClassName())) {
                i3 = i4;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
        return th;
    }

    /* JADX INFO: renamed from: j */
    public static void m2150j() {
        throw ((NullPointerException) m2148h(new NullPointerException()));
    }

    /* JADX INFO: renamed from: k */
    public static void m2151k(String str) {
        throw ((NullPointerException) m2148h(new NullPointerException(str)));
    }

    /* JADX INFO: renamed from: l */
    private static void m2152l(String str) {
        throw ((NullPointerException) m2148h(new NullPointerException(m2147g(str))));
    }

    /* JADX INFO: renamed from: m */
    public static void m2153m(String str) {
        throw ((C0387s) m2148h(new C0387s(str)));
    }

    /* JADX INFO: renamed from: n */
    public static void m2154n(String str) {
        m2153m("lateinit property " + str + " has not been initialized");
    }
}
