package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b */
    private final Rect f8348b;

    /* JADX INFO: renamed from: c */
    private final RectF f8349c;

    /* JADX INFO: renamed from: d */
    private final RectF f8350d;

    /* JADX INFO: renamed from: e */
    private final int[] f8351e;

    public FabTransformationBehavior() {
        this.f8348b = new Rect();
        this.f8349c = new RectF();
        this.f8350d = new RectF();
        this.f8351e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: i */
    public boolean mo4144i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: k */
    public void mo4146k(CoordinatorLayout.C0956f c0956f) {
        if (c0956f.f4626h == 0) {
            c0956f.f4626h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8348b = new Rect();
        this.f8349c = new RectF();
        this.f8350d = new RectF();
        this.f8351e = new int[2];
    }
}
