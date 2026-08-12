package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.z */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1281z {

    /* JADX INFO: renamed from: a */
    private static boolean f6218a = true;

    /* JADX INFO: renamed from: androidx.transition.z$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static int m6473a(ViewGroup viewGroup, int i3) {
            return viewGroup.getChildDrawingOrder(i3);
        }

        /* JADX INFO: renamed from: b */
        static void m6474b(ViewGroup viewGroup, boolean z2) {
            viewGroup.suppressLayout(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6471a(ViewGroup viewGroup, boolean z2) {
        if (f6218a) {
            try {
                a.m6474b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f6218a = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static void m6472b(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m6474b(viewGroup, z2);
        } else {
            m6471a(viewGroup, z2);
        }
    }
}
