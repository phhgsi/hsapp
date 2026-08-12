package p059T1;

import p056S1.AbstractC0506a;
import p077Z1.AbstractC0653c;
import p081a2.C0661a;

/* JADX INFO: renamed from: T1.a */
/* JADX INFO: loaded from: classes.dex */
public class C0529a extends AbstractC0506a {

    /* JADX INFO: renamed from: T1.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f1799a = new a();

        /* JADX INFO: renamed from: b */
        public static final Integer f1800b;

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
            f1800b = num;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m1913c(int i3) {
        Integer num = a.f1800b;
        return num == null || num.intValue() >= i3;
    }

    @Override // p053R1.AbstractC0499a
    /* JADX INFO: renamed from: b */
    public AbstractC0653c mo1843b() {
        return m1913c(34) ? new C0661a() : super.mo1843b();
    }
}
