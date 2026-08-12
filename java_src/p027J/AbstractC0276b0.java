package p027J;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import p158w.AbstractC2485c;

/* JADX INFO: renamed from: J.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0276b0 {

    /* JADX INFO: renamed from: a */
    private static final WindowInsets f1311a = C0318w0.f1386b.m1099x();

    /* JADX INFO: renamed from: b */
    static boolean f1312b = false;

    /* JADX INFO: renamed from: J.b0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m923a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WindowInsets m920a(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        windowInsetsArr[0] = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets) : view.onApplyWindowInsets(windowInsets);
        return f1311a;
    }

    /* JADX INFO: renamed from: b */
    static WindowInsets m921b(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(AbstractC2485c.f11522M);
        Object tag2 = view.getTag(AbstractC2485c.f11529T);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        final WindowInsets[] windowInsetsArr = {f1311a};
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: J.a0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return AbstractC0276b0.m920a(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(AbstractC2485c.f11521L);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                m921b(viewGroup.getChildAt(i3), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets3 = windowInsetsArr[0];
        return windowInsets3 != null ? windowInsets3 : f1311a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m922c(ViewGroup viewGroup) {
        return a.m923a(viewGroup);
    }
}
