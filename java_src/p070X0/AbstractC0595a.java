package p070X0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: X0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0595a {

    /* JADX INFO: renamed from: a */
    private static final int[] f1985a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    private static final int[] f1986b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c */
    private static final int[] f1987c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d */
    private static final int[] f1988d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e */
    private static final int[] f1989e = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    static final String f1990f = AbstractC0595a.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m2125a(ColorStateList colorStateList) {
        int[] iArr = f1986b;
        return new ColorStateList(new int[][]{f1988d, iArr, StateSet.NOTHING}, new int[]{m2127c(colorStateList, f1987c), m2127c(colorStateList, iArr), m2127c(colorStateList, f1985a)});
    }

    /* JADX INFO: renamed from: b */
    private static int m2126b(int i3) {
        return AbstractC2571d.m12269k(i3, Math.min(Color.alpha(i3) * 2, 255));
    }

    /* JADX INFO: renamed from: c */
    private static int m2127c(ColorStateList colorStateList, int[] iArr) {
        return m2126b(colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m2128d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1989e, 0)) != 0) {
            Log.w(f1990f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2129e(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 : iArr) {
            if (i3 == 16842910) {
                z2 = true;
            } else if (i3 == 16842908 || i3 == 16842919 || i3 == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }
}
