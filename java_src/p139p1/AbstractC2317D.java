package p139p1;

/* JADX INFO: renamed from: p1.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2317D {
    /* JADX INFO: renamed from: a */
    public static void m11080a(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m11081b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static Object m11082c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m11083d(boolean z2, String str) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }
}
