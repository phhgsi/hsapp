package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.M */
/* JADX INFO: loaded from: classes.dex */
class C1254M extends C1253L {
    C1254M() {
    }

    @Override // androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: b */
    public float mo6319b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.AbstractC1251J, androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: d */
    public void mo6321d(View view, int i3, int i4, int i5, int i6) {
        view.setLeftTopRightBottom(i3, i4, i5, i6);
    }

    @Override // androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: e */
    public void mo6322e(View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // androidx.transition.C1253L, androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: f */
    public void mo6323f(View view, int i3) {
        view.setTransitionVisibility(i3);
    }

    @Override // androidx.transition.AbstractC1249H, androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: g */
    public void mo6324g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.AbstractC1249H, androidx.transition.AbstractC1245D
    /* JADX INFO: renamed from: h */
    public void mo6325h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
