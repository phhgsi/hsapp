package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: h */
    private boolean f7988h;

    public SearchBar$ScrollingViewBehavior() {
        this.f7988h = false;
    }

    /* JADX INFO: renamed from: Y */
    private void m8615Y(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setTargetElevation(0.0f);
    }

    @Override // com.google.android.material.appbar.AbstractC1429e
    /* JADX INFO: renamed from: T */
    protected boolean mo7371T() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: l */
    public boolean mo4147l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean zMo4147l = super.mo4147l(coordinatorLayout, view, view2);
        if (!this.f7988h && (view2 instanceof AppBarLayout)) {
            this.f7988h = true;
            m8615Y((AppBarLayout) view2);
        }
        return zMo4147l;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7988h = false;
    }
}
