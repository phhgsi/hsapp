package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.H */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1249H extends AbstractC1245D {

    /* JADX INFO: renamed from: d */
    private static boolean f6061d = true;

    /* JADX INFO: renamed from: e */
    private static boolean f6062e = true;

    /* JADX INFO: renamed from: androidx.transition.H$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m6331a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        /* JADX INFO: renamed from: b */
        static void m6332b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        /* JADX INFO: renamed from: c */
        static void m6333c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    AbstractC1249H() {
    }

    @Override // androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: g */
    public void mo6324g(View view, Matrix matrix) {
        if (f6061d) {
            try {
                a.m6332b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f6061d = false;
            }
        }
    }

    @Override // androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: h */
    public void mo6325h(View view, Matrix matrix) {
        if (f6062e) {
            try {
                a.m6333c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f6062e = false;
            }
        }
    }
}
