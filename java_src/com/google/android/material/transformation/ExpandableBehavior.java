package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p052R0.InterfaceC0498a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0953c {

    /* JADX INFO: renamed from: a */
    private int f8347a;

    public ExpandableBehavior() {
        this.f8347a = 0;
    }

    /* JADX INFO: renamed from: I */
    protected InterfaceC0498a m9100I(CoordinatorLayout coordinatorLayout, View view) {
        List listM4123r = coordinatorLayout.m4123r(view);
        int size = listM4123r.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) listM4123r.get(i3);
            if (mo4144i(coordinatorLayout, view, view2)) {
                AbstractC0740E.m2693a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: i */
    public abstract boolean mo4144i(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: l */
    public boolean mo4147l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0740E.m2693a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: p */
    public boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
        if (view.isLaidOut()) {
            return false;
        }
        m9100I(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8347a = 0;
    }
}
