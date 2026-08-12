package p000A;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: A.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0000a {

    /* JADX INFO: renamed from: A.a$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m18a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* JADX INFO: renamed from: b */
        static boolean m19b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* JADX INFO: renamed from: c */
        static ColorFilter m20c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* JADX INFO: renamed from: d */
        static void m21d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* JADX INFO: renamed from: e */
        static void m22e(Drawable drawable, float f3, float f4) {
            drawable.setHotspot(f3, f4);
        }

        /* JADX INFO: renamed from: f */
        static void m23f(Drawable drawable, int i3, int i4, int i5, int i6) {
            drawable.setHotspotBounds(i3, i4, i5, i6);
        }

        /* JADX INFO: renamed from: g */
        static void m24g(Drawable drawable, int i3) {
            drawable.setTint(i3);
        }

        /* JADX INFO: renamed from: h */
        static void m25h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* JADX INFO: renamed from: i */
        static void m26i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: A.a$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static int m27a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* JADX INFO: renamed from: b */
        static boolean m28b(Drawable drawable, int i3) {
            return drawable.setLayoutDirection(i3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m0a(Drawable drawable, Resources.Theme theme) {
        a.m18a(drawable, theme);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1b(Drawable drawable) {
        return a.m19b(drawable);
    }

    /* JADX INFO: renamed from: c */
    public static void m2c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public static int m3d(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* JADX INFO: renamed from: e */
    public static ColorFilter m4e(Drawable drawable) {
        return a.m20c(drawable);
    }

    /* JADX INFO: renamed from: f */
    public static int m5f(Drawable drawable) {
        return b.m27a(drawable);
    }

    /* JADX INFO: renamed from: g */
    public static void m6g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        a.m21d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* JADX INFO: renamed from: i */
    public static void m8i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* JADX INFO: renamed from: j */
    public static void m9j(Drawable drawable, boolean z2) {
        drawable.setAutoMirrored(z2);
    }

    /* JADX INFO: renamed from: k */
    public static void m10k(Drawable drawable, float f3, float f4) {
        a.m22e(drawable, f3, f4);
    }

    /* JADX INFO: renamed from: l */
    public static void m11l(Drawable drawable, int i3, int i4, int i5, int i6) {
        a.m23f(drawable, i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m12m(Drawable drawable, int i3) {
        return b.m28b(drawable, i3);
    }

    /* JADX INFO: renamed from: n */
    public static void m13n(Drawable drawable, int i3) {
        a.m24g(drawable, i3);
    }

    /* JADX INFO: renamed from: o */
    public static void m14o(Drawable drawable, ColorStateList colorStateList) {
        a.m25h(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: p */
    public static void m15p(Drawable drawable, PorterDuff.Mode mode) {
        a.m26i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static Drawable m16q(Drawable drawable) {
        return drawable instanceof InterfaceC0001b ? ((InterfaceC0001b) drawable).m30b() : drawable;
    }

    /* JADX INFO: renamed from: r */
    public static Drawable m17r(Drawable drawable) {
        return drawable;
    }
}
