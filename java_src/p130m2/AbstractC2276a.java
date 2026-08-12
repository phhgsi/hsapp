package p130m2;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* JADX INFO: renamed from: m2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2276a {
    /* JADX INFO: renamed from: a */
    public static Object m10867a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(AbstractC2276a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10868b(Collection collection, String str) {
        if (collection.contains(str)) {
            return true;
        }
        if (!m10869c()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return collection.contains(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    private static boolean m10869c() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
