package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.L */
/* JADX INFO: loaded from: classes.dex */
class C1253L extends AbstractC1251J {

    /* JADX INFO: renamed from: g */
    private static boolean f6064g = true;

    /* JADX INFO: renamed from: androidx.transition.L$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m6337a(View view, int i3) {
            view.setTransitionVisibility(i3);
        }
    }

    C1253L() {
    }

    @Override // androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: f */
    public void mo6323f(View view, int i3) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo6323f(view, i3);
        } else if (f6064g) {
            try {
                a.m6337a(view, i3);
            } catch (NoSuchMethodError unused) {
                f6064g = false;
            }
        }
    }
}
