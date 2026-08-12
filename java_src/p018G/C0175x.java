package p018G;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: G.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0175x {

    /* JADX INFO: renamed from: a */
    public static final C0175x f1124a = new C0175x();

    private C0175x() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m480a(Resources.Theme theme, View view, TypedValue typedValue) {
        AbstractC0606k.m2145e(theme, "theme");
        AbstractC0606k.m2145e(view, "decor");
        AbstractC0606k.m2145e(typedValue, "tv");
        int i3 = (!theme.resolveAttribute(R.attr.windowLightStatusBar, typedValue, true) || typedValue.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, typedValue, true) && typedValue.data != 0) {
            i3 |= 16;
        }
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        AbstractC0606k.m2142b(windowInsetsController);
        windowInsetsController.setSystemBarsAppearance(i3, 24);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m481b(Resources.Theme theme, View view, TypedValue typedValue, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            typedValue = new TypedValue();
        }
        m480a(theme, view, typedValue);
    }
}
