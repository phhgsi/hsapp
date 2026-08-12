package p024I;

import java.util.Objects;

/* JADX INFO: renamed from: I.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0206c {
    /* JADX INFO: renamed from: a */
    public static boolean m596a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public static int m597b(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* JADX INFO: renamed from: c */
    public static Object m598c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m599d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
