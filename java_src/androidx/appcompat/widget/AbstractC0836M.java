package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000A.AbstractC0000a;

/* JADX INFO: renamed from: androidx.appcompat.widget.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0836M {

    /* JADX INFO: renamed from: a */
    private static final int[] f3288a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    private static final int[] f3289b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f3290c = new Rect();

    /* JADX INFO: renamed from: androidx.appcompat.widget.M$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private static final boolean f3291a;

        /* JADX INFO: renamed from: b */
        private static final Method f3292b;

        /* JADX INFO: renamed from: c */
        private static final Field f3293c;

        /* JADX INFO: renamed from: d */
        private static final Field f3294d;

        /* JADX INFO: renamed from: e */
        private static final Field f3295e;

        /* JADX INFO: renamed from: f */
        private static final Field f3296f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L3a
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2d java.lang.ClassNotFoundException -> L30 java.lang.NoSuchMethodException -> L32
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L46
                r8 = r0
                goto L48
            L2b:
                r7 = r1
                goto L46
            L2d:
                r6 = r1
            L2e:
                r7 = r6
                goto L46
            L30:
                r6 = r1
                goto L2e
            L32:
                r6 = r1
                goto L2e
            L34:
                r5 = r1
            L35:
                r6 = r5
                goto L2e
            L37:
                r5 = r1
            L38:
                r6 = r5
                goto L2e
            L3a:
                r5 = r1
            L3b:
                r6 = r5
                goto L2e
            L3d:
                r4 = r1
                r5 = r4
                goto L35
            L40:
                r4 = r1
                r5 = r4
                goto L38
            L43:
                r4 = r1
                r5 = r4
                goto L3b
            L46:
                r3 = r1
                r8 = r2
            L48:
                if (r8 == 0) goto L57
                androidx.appcompat.widget.AbstractC0836M.a.f3292b = r4
                androidx.appcompat.widget.AbstractC0836M.a.f3293c = r5
                androidx.appcompat.widget.AbstractC0836M.a.f3294d = r6
                androidx.appcompat.widget.AbstractC0836M.a.f3295e = r7
                androidx.appcompat.widget.AbstractC0836M.a.f3296f = r3
                androidx.appcompat.widget.AbstractC0836M.a.f3291a = r0
                goto L63
            L57:
                androidx.appcompat.widget.AbstractC0836M.a.f3292b = r1
                androidx.appcompat.widget.AbstractC0836M.a.f3293c = r1
                androidx.appcompat.widget.AbstractC0836M.a.f3294d = r1
                androidx.appcompat.widget.AbstractC0836M.a.f3295e = r1
                androidx.appcompat.widget.AbstractC0836M.a.f3296f = r1
                androidx.appcompat.widget.AbstractC0836M.a.f3291a = r2
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0836M.a.<clinit>():void");
        }

        /* JADX INFO: renamed from: a */
        static Rect m3455a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f3291a) {
                try {
                    Object objInvoke = f3292b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f3293c.getInt(objInvoke), f3294d.getInt(objInvoke), f3295e.getInt(objInvoke), f3296f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return AbstractC0836M.f3290c;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.M$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static Insets m3456a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3450a(Drawable drawable) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    static void m3451b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || i3 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        m3452c(drawable);
    }

    /* JADX INFO: renamed from: c */
    private static void m3452c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f3288a);
        } else {
            drawable.setState(f3289b);
        }
        drawable.setState(state);
    }

    /* JADX INFO: renamed from: d */
    public static Rect m3453d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.m3455a(AbstractC0000a.m16q(drawable));
        }
        Insets insetsM3456a = b.m3456a(drawable);
        return new Rect(insetsM3456a.left, insetsM3456a.top, insetsM3456a.right, insetsM3456a.bottom);
    }

    /* JADX INFO: renamed from: e */
    public static PorterDuff.Mode m3454e(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
