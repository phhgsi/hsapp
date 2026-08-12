package p047P1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: P1.h */
/* JADX INFO: loaded from: classes.dex */
final class C0477h {

    /* JADX INFO: renamed from: a */
    public static final C0477h f1682a = new C0477h();

    /* JADX INFO: renamed from: b */
    private static final a f1683b = new a(null, null, null);

    /* JADX INFO: renamed from: c */
    private static a f1684c;

    /* JADX INFO: renamed from: P1.h$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public final Method f1685a;

        /* JADX INFO: renamed from: b */
        public final Method f1686b;

        /* JADX INFO: renamed from: c */
        public final Method f1687c;

        public a(Method method, Method method2, Method method3) {
            this.f1685a = method;
            this.f1686b = method2;
            this.f1687c = method3;
        }
    }

    private C0477h() {
    }

    /* JADX INFO: renamed from: a */
    private final a m1768a(AbstractC0470a abstractC0470a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), abstractC0470a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC0470a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, null));
            f1684c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f1683b;
            f1684c = aVar2;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m1769b(AbstractC0470a abstractC0470a) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        AbstractC0606k.m2145e(abstractC0470a, "continuation");
        a aVarM1768a = f1684c;
        if (aVarM1768a == null) {
            aVarM1768a = m1768a(abstractC0470a);
        }
        if (aVarM1768a != f1683b && (method = aVarM1768a.f1685a) != null && (objInvoke = method.invoke(abstractC0470a.getClass(), null)) != null && (method2 = aVarM1768a.f1686b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarM1768a.f1687c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
