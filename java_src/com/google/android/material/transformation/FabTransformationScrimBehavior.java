package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p019G0.C0180e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b */
    private final C0180e f8352b;

    /* JADX INFO: renamed from: c */
    private final C0180e f8353c;

    public FabTransformationScrimBehavior() {
        this.f8352b = new C0180e(75L, 150L);
        this.f8353c = new C0180e(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: H */
    public boolean mo4139H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo4139H(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: i */
    public boolean mo4144i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8352b = new C0180e(75L, 150L);
        this.f8353c = new C0180e(0L, 150L);
    }
}
