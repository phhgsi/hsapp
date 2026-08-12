package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0910p0 {

    /* JADX INFO: renamed from: a */
    private static boolean f3753a;

    /* JADX INFO: renamed from: b */
    private static Method f3754b;

    /* JADX INFO: renamed from: c */
    static final boolean f3755c;

    /* JADX INFO: renamed from: androidx.appcompat.widget.p0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m3880a(View view, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f3755c = Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: a */
    public static void m3877a(View view, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m3880a(view, rect, rect2);
            return;
        }
        if (!f3753a) {
            f3753a = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f3754b = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f3754b.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = f3754b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e3) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3878b(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m3879c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e4) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
        }
    }
}
