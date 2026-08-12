package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.google.android.material.appbar.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1430f extends CoordinatorLayout.AbstractC0953c {

    /* JADX INFO: renamed from: a */
    private C1431g f6961a;

    /* JADX INFO: renamed from: b */
    private int f6962b;

    /* JADX INFO: renamed from: c */
    private int f6963c;

    public AbstractC1430f() {
        this.f6962b = 0;
        this.f6963c = 0;
    }

    /* JADX INFO: renamed from: I */
    public int mo7337I() {
        C1431g c1431g = this.f6961a;
        if (c1431g != null) {
            return c1431g.m7373b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    protected void mo7366J(CoordinatorLayout coordinatorLayout, View view, int i3) {
        coordinatorLayout.m4111I(view, i3);
    }

    /* JADX INFO: renamed from: K */
    public boolean mo7338K(int i3) {
        C1431g c1431g = this.f6961a;
        if (c1431g != null) {
            return c1431g.m7376e(i3);
        }
        this.f6962b = i3;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: p */
    public boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
        mo7366J(coordinatorLayout, view, i3);
        if (this.f6961a == null) {
            this.f6961a = new C1431g(view);
        }
        this.f6961a.m7374c();
        this.f6961a.m7372a();
        int i4 = this.f6962b;
        if (i4 != 0) {
            this.f6961a.m7376e(i4);
            this.f6962b = 0;
        }
        int i5 = this.f6963c;
        if (i5 == 0) {
            return true;
        }
        this.f6961a.m7375d(i5);
        this.f6963c = 0;
        return true;
    }

    public AbstractC1430f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6962b = 0;
        this.f6963c = 0;
    }
}
