package p124l0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p130m2.AbstractC2276a;

/* JADX INFO: renamed from: l0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2130n {

    /* JADX INFO: renamed from: l0.n$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static final C2133q f9933a = new C2133q(AbstractC2130n.m10594d().getWebkitToCompatConverter());
    }

    /* JADX INFO: renamed from: l0.n$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        static final InterfaceC2131o f9934a = AbstractC2130n.m10591a();
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC2131o m10591a() {
        try {
            return new C2132p((WebViewProviderFactoryBoundaryInterface) AbstractC2276a.m10867a(WebViewProviderFactoryBoundaryInterface.class, m10592b()));
        } catch (ClassNotFoundException unused) {
            return new C2125i();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: b */
    private static InvocationHandler m10592b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m10595e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    /* JADX INFO: renamed from: c */
    public static C2133q m10593c() {
        return a.f9933a;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC2131o m10594d() {
        return b.f9934a;
    }

    /* JADX INFO: renamed from: e */
    public static ClassLoader m10595e() {
        return Build.VERSION.SDK_INT >= 28 ? AbstractC2121e.m10582a() : m10596f().getClass().getClassLoader();
    }

    /* JADX INFO: renamed from: f */
    private static Object m10596f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
