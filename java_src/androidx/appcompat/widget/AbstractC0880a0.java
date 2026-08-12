package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p091d.AbstractC1769j;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: androidx.appcompat.widget.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0880a0 {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f3621a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    static final int[] f3622b = {-16842910};

    /* JADX INFO: renamed from: c */
    static final int[] f3623c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    static final int[] f3624d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e */
    static final int[] f3625e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    static final int[] f3626f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g */
    static final int[] f3627g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h */
    static final int[] f3628h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i */
    static final int[] f3629i = new int[0];

    /* JADX INFO: renamed from: j */
    private static final int[] f3630j = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m3741a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC1769j.f9133y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(AbstractC1769j.f8892D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m3742b(Context context, int i3) {
        ColorStateList colorStateListM3745e = m3745e(context, i3);
        if (colorStateListM3745e != null && colorStateListM3745e.isStateful()) {
            return colorStateListM3745e.getColorForState(f3622b, colorStateListM3745e.getDefaultColor());
        }
        TypedValue typedValueM3746f = m3746f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM3746f, true);
        return m3744d(context, i3, typedValueM3746f.getFloat());
    }

    /* JADX INFO: renamed from: c */
    public static int m3743c(Context context, int i3) {
        int[] iArr = f3630j;
        iArr[0] = i3;
        C0888e0 c0888e0M3764u = C0888e0.m3764u(context, null, iArr);
        try {
            return c0888e0M3764u.m3767b(0, 0);
        } finally {
            c0888e0M3764u.m3786x();
        }
    }

    /* JADX INFO: renamed from: d */
    static int m3744d(Context context, int i3, float f3) {
        return AbstractC2571d.m12269k(m3743c(context, i3), Math.round(Color.alpha(r0) * f3));
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m3745e(Context context, int i3) {
        int[] iArr = f3630j;
        iArr[0] = i3;
        C0888e0 c0888e0M3764u = C0888e0.m3764u(context, null, iArr);
        try {
            return c0888e0M3764u.m3768c(0);
        } finally {
            c0888e0M3764u.m3786x();
        }
    }

    /* JADX INFO: renamed from: f */
    private static TypedValue m3746f() {
        ThreadLocal threadLocal = f3621a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
