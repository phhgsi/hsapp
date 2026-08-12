package p156v0;

/* JADX INFO: renamed from: v0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2477d {
    /* JADX INFO: renamed from: a */
    public static void m11788a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* JADX INFO: renamed from: b */
    public static Object m11789b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static Object m11790c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
