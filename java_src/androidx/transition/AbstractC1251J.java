package androidx.transition;

import android.view.View;

/* JADX INFO: renamed from: androidx.transition.J */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1251J extends AbstractC1249H {

    /* JADX INFO: renamed from: f */
    private static boolean f6063f = true;

    /* JADX INFO: renamed from: androidx.transition.J$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m6335a(View view, int i3, int i4, int i5, int i6) {
            view.setLeftTopRightBottom(i3, i4, i5, i6);
        }
    }

    AbstractC1251J() {
    }

    @Override // androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: d */
    public void mo6321d(View view, int i3, int i4, int i5, int i6) {
        if (f6063f) {
            try {
                a.m6335a(view, i3, i4, i5, i6);
            } catch (NoSuchMethodError unused) {
                f6063f = false;
            }
        }
    }
}
