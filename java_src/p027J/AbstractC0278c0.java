package p027J;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: J.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0278c0 {

    /* JADX INFO: renamed from: J.c0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m932a(ViewParent viewParent, View view, float f3, float f4, boolean z2) {
            return viewParent.onNestedFling(view, f3, f4, z2);
        }

        /* JADX INFO: renamed from: b */
        static boolean m933b(ViewParent viewParent, View view, float f3, float f4) {
            return viewParent.onNestedPreFling(view, f3, f4);
        }

        /* JADX INFO: renamed from: c */
        static void m934c(ViewParent viewParent, View view, int i3, int i4, int[] iArr) {
            viewParent.onNestedPreScroll(view, i3, i4, iArr);
        }

        /* JADX INFO: renamed from: d */
        static void m935d(ViewParent viewParent, View view, int i3, int i4, int i5, int i6) {
            viewParent.onNestedScroll(view, i3, i4, i5, i6);
        }

        /* JADX INFO: renamed from: e */
        static void m936e(ViewParent viewParent, View view, View view2, int i3) {
            viewParent.onNestedScrollAccepted(view, view2, i3);
        }

        /* JADX INFO: renamed from: f */
        static boolean m937f(ViewParent viewParent, View view, View view2, int i3) {
            return viewParent.onStartNestedScroll(view, view2, i3);
        }

        /* JADX INFO: renamed from: g */
        static void m938g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m925a(ViewParent viewParent, View view, float f3, float f4, boolean z2) {
        try {
            return a.m932a(viewParent, view, f3, f4, z2);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m926b(ViewParent viewParent, View view, float f3, float f4) {
        try {
            return a.m933b(viewParent, view, f3, f4);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m927c(ViewParent viewParent, View view, int i3, int i4, int[] iArr, int i5) {
        if (viewParent instanceof InterfaceC0229C) {
            ((InterfaceC0229C) viewParent).mo650j(view, i3, i4, iArr, i5);
            return;
        }
        if (i5 == 0) {
            try {
                a.m934c(viewParent, view, i3, i4, iArr);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e3);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m928d(ViewParent viewParent, View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        if (viewParent instanceof InterfaceC0231D) {
            ((InterfaceC0231D) viewParent).mo654m(view, i3, i4, i5, i6, i7, iArr);
            return;
        }
        iArr[0] = iArr[0] + i5;
        iArr[1] = iArr[1] + i6;
        if (viewParent instanceof InterfaceC0229C) {
            ((InterfaceC0229C) viewParent).mo651n(view, i3, i4, i5, i6, i7);
            return;
        }
        if (i7 == 0) {
            try {
                a.m935d(viewParent, view, i3, i4, i5, i6);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e3);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m929e(ViewParent viewParent, View view, View view2, int i3, int i4) {
        if (viewParent instanceof InterfaceC0229C) {
            ((InterfaceC0229C) viewParent).mo648c(view, view2, i3, i4);
            return;
        }
        if (i4 == 0) {
            try {
                a.m936e(viewParent, view, view2, i3);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e3);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m930f(ViewParent viewParent, View view, View view2, int i3, int i4) {
        if (viewParent instanceof InterfaceC0229C) {
            return ((InterfaceC0229C) viewParent).mo652o(view, view2, i3, i4);
        }
        if (i4 != 0) {
            return false;
        }
        try {
            return a.m937f(viewParent, view, view2, i3);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m931g(ViewParent viewParent, View view, int i3) {
        if (viewParent instanceof InterfaceC0229C) {
            ((InterfaceC0229C) viewParent).mo649i(view, i3);
            return;
        }
        if (i3 == 0) {
            try {
                a.m938g(viewParent, view);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e3);
            }
        }
    }
}
