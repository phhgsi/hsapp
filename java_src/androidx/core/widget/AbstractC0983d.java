package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: androidx.core.widget.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0983d {

    /* JADX INFO: renamed from: androidx.core.widget.d$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m4364a(EdgeEffect edgeEffect, float f3, float f4) {
            edgeEffect.onPull(f3, f4);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.d$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        public static EdgeEffect m4365a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* JADX INFO: renamed from: b */
        public static float m4366b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* JADX INFO: renamed from: c */
        public static float m4367c(EdgeEffect edgeEffect, float f3, float f4) {
            try {
                return edgeEffect.onPullDistance(f3, f4);
            } catch (Throwable unused) {
                edgeEffect.onPull(f3, f4);
                return 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static EdgeEffect m4360a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.m4365a(context, attributeSet) : new EdgeEffect(context);
    }

    /* JADX INFO: renamed from: b */
    public static float m4361b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m4366b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static void m4362c(EdgeEffect edgeEffect, float f3, float f4) {
        a.m4364a(edgeEffect, f3, f4);
    }

    /* JADX INFO: renamed from: d */
    public static float m4363d(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m4367c(edgeEffect, f3, f4);
        }
        m4362c(edgeEffect, f3, f4);
        return f3;
    }
}
