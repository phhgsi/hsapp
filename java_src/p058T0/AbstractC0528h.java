package p058T0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import p016F0.AbstractC0150k;
import p045P.C0466l;
import p067W0.AbstractC0556b;
import p167z.AbstractC2574g;

/* JADX INFO: renamed from: T0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0528h {
    /* JADX INFO: renamed from: a */
    private static float m1905a(String[] strArr, int i3) {
        float f3 = Float.parseFloat(strArr[i3]);
        if (f3 >= 0.0f && f3 <= 1.0f) {
            return f3;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f3);
    }

    /* JADX INFO: renamed from: b */
    private static String m1906b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* JADX INFO: renamed from: c */
    private static TimeInterpolator m1907c(String str) {
        if (!m1909e(str, "cubic-bezier")) {
            if (m1909e(str, "path")) {
                return new PathInterpolator(AbstractC2574g.m12282e(m1906b(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = m1906b(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(m1905a(strArrSplit, 0), m1905a(strArrSplit, 1), m1905a(strArrSplit, 2), m1905a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m1908d(String str) {
        return m1909e(str, "cubic-bezier") || m1909e(str, "path");
    }

    /* JADX INFO: renamed from: e */
    private static boolean m1909e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: f */
    public static int m1910f(Context context, int i3, int i4) {
        return AbstractC0556b.m2072d(context, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static TimeInterpolator m1911g(Context context, int i3, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return m1908d(strValueOf) ? m1907c(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    /* JADX INFO: renamed from: h */
    public static C0466l m1912h(Context context, int i3, int i4) {
        TypedValue typedValueM2069a = AbstractC0556b.m2069a(context, i3);
        TypedArray typedArrayObtainStyledAttributes = typedValueM2069a == null ? context.obtainStyledAttributes(null, AbstractC0150k.f843b4, 0, i4) : context.obtainStyledAttributes(typedValueM2069a.resourceId, AbstractC0150k.f843b4);
        C0466l c0466l = new C0466l();
        try {
            float f3 = typedArrayObtainStyledAttributes.getFloat(AbstractC0150k.f863d4, Float.MIN_VALUE);
            if (f3 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f4 = typedArrayObtainStyledAttributes.getFloat(AbstractC0150k.f853c4, Float.MIN_VALUE);
            if (f4 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            c0466l.m1724h(f3);
            c0466l.m1722f(f4);
            return c0466l;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
