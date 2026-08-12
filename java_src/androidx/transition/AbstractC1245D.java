package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: androidx.transition.D */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1245D {

    /* JADX INFO: renamed from: a */
    private static boolean f6058a = true;

    /* JADX INFO: renamed from: b */
    private static Field f6059b;

    /* JADX INFO: renamed from: c */
    private static boolean f6060c;

    /* JADX INFO: renamed from: androidx.transition.D$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static float m6326a(View view) {
            return view.getTransitionAlpha();
        }

        /* JADX INFO: renamed from: b */
        static void m6327b(View view, float f3) {
            view.setTransitionAlpha(f3);
        }
    }

    AbstractC1245D() {
    }

    /* JADX INFO: renamed from: a */
    public void m6318a(View view) {
    }

    /* JADX INFO: renamed from: b */
    public float mo6319b(View view) {
        if (f6058a) {
            try {
                return a.m6326a(view);
            } catch (NoSuchMethodError unused) {
                f6058a = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: c */
    public void m6320c(View view) {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo6321d(View view, int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: e */
    public void mo6322e(View view, float f3) {
        if (f6058a) {
            try {
                a.m6327b(view, f3);
                return;
            } catch (NoSuchMethodError unused) {
                f6058a = false;
            }
        }
        view.setAlpha(f3);
    }

    /* JADX INFO: renamed from: f */
    public void mo6323f(View view, int i3) {
        if (!f6060c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6059b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f6060c = true;
        }
        Field field = f6059b;
        if (field != null) {
            try {
                f6059b.setInt(view, i3 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo6324g(View view, Matrix matrix);

    /* JADX INFO: renamed from: h */
    public abstract void mo6325h(View view, Matrix matrix);
}
