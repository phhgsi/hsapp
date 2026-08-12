package p056S1;

import java.lang.reflect.InvocationTargetException;
import p053R1.AbstractC0499a;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: S1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0506a extends AbstractC0499a {

    /* JADX INFO: renamed from: S1.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f1751a = new a();

        /* JADX INFO: renamed from: b */
        public static final Integer f1752b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f1752b = num;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m1850c(int i3) {
        Integer num = a.f1752b;
        return num == null || num.intValue() >= i3;
    }

    @Override // p053R1.AbstractC0499a
    /* JADX INFO: renamed from: a */
    public void mo1842a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        AbstractC0606k.m2145e(th, "cause");
        AbstractC0606k.m2145e(th2, "exception");
        if (m1850c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo1842a(th, th2);
        }
    }
}
