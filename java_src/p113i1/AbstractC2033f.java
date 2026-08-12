package p113i1;

import java.util.Arrays;

/* JADX INFO: renamed from: i1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2033f extends AbstractC2029b {
    /* JADX INFO: renamed from: a */
    public static boolean m10228a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m10229b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
