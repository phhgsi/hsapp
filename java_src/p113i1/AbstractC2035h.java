package p113i1;

/* JADX INFO: renamed from: i1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2035h {
    /* JADX INFO: renamed from: a */
    private static String m10232a(int i3, int i4, String str) {
        if (i3 < 0) {
            return AbstractC2037j.m10248a("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return AbstractC2037j.m10248a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    private static String m10233b(int i3, int i4, String str) {
        if (i3 < 0) {
            return AbstractC2037j.m10248a("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return AbstractC2037j.m10248a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    private static String m10234c(int i3, int i4, int i5) {
        return (i3 < 0 || i3 > i5) ? m10233b(i3, i5, "start index") : (i4 < 0 || i4 > i5) ? m10233b(i4, i5, "end index") : AbstractC2037j.m10248a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: d */
    public static void m10235d(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m10236e(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m10237f(boolean z2, String str, int i3, int i4) {
        if (!z2) {
            throw new IllegalArgumentException(AbstractC2037j.m10248a(str, Integer.valueOf(i3), Integer.valueOf(i4)));
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m10238g(int i3, int i4) {
        return m10239h(i3, i4, "index");
    }

    /* JADX INFO: renamed from: h */
    public static int m10239h(int i3, int i4, String str) {
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(m10232a(i3, i4, str));
        }
        return i3;
    }

    /* JADX INFO: renamed from: i */
    public static Object m10240i(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: j */
    public static Object m10241j(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* JADX INFO: renamed from: k */
    public static int m10242k(int i3, int i4) {
        return m10243l(i3, i4, "index");
    }

    /* JADX INFO: renamed from: l */
    public static int m10243l(int i3, int i4, String str) {
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(m10233b(i3, i4, str));
        }
        return i3;
    }

    /* JADX INFO: renamed from: m */
    public static void m10244m(int i3, int i4, int i5) {
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            throw new IndexOutOfBoundsException(m10234c(i3, i4, i5));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m10245n(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m10246o(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m10247p(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalStateException(AbstractC2037j.m10248a(str, obj));
        }
    }
}
