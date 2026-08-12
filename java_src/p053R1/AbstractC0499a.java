package p053R1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p038M1.AbstractC0413g;
import p071X1.AbstractC0606k;
import p077Z1.AbstractC0653c;
import p077Z1.C0652b;

/* JADX INFO: renamed from: R1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0499a {

    /* JADX INFO: renamed from: R1.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f1731a = new a();

        /* JADX INFO: renamed from: b */
        public static final Method f1732b;

        /* JADX INFO: renamed from: c */
        public static final Method f1733c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC0606k.m2142b(methods);
            int length = methods.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                method = null;
                if (i4 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i4];
                if (AbstractC0606k.m2141a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC0606k.m2144d(parameterTypes, "getParameterTypes(...)");
                    if (AbstractC0606k.m2141a(AbstractC0413g.m1450r(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i4++;
            }
            f1732b = method2;
            int length2 = methods.length;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                Method method3 = methods[i3];
                if (AbstractC0606k.m2141a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i3++;
            }
            f1733c = method;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo1842a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        AbstractC0606k.m2145e(th, "cause");
        AbstractC0606k.m2145e(th2, "exception");
        Method method = a.f1732b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0653c mo1843b() {
        return new C0652b();
    }
}
