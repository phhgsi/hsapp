package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p009D.AbstractC0091a;
import p027J.C0318w0;

/* JADX INFO: renamed from: com.google.android.material.appbar.e */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1429e extends AbstractC1430f {

    /* JADX INFO: renamed from: d */
    final Rect f6957d;

    /* JADX INFO: renamed from: e */
    final Rect f6958e;

    /* JADX INFO: renamed from: f */
    private int f6959f;

    /* JADX INFO: renamed from: g */
    private int f6960g;

    public AbstractC1429e() {
        this.f6957d = new Rect();
        this.f6958e = new Rect();
        this.f6959f = 0;
    }

    /* JADX INFO: renamed from: R */
    private static int m7365R(int i3) {
        if (i3 == 0) {
            return 8388659;
        }
        return i3;
    }

    @Override // com.google.android.material.appbar.AbstractC1430f
    /* JADX INFO: renamed from: J */
    protected void mo7366J(CoordinatorLayout coordinatorLayout, View view, int i3) {
        View viewMo7342L = mo7342L(coordinatorLayout.m4123r(view));
        if (viewMo7342L == null) {
            super.mo7366J(coordinatorLayout, view, i3);
            this.f6959f = 0;
            return;
        }
        CoordinatorLayout.C0956f c0956f = (CoordinatorLayout.C0956f) view.getLayoutParams();
        Rect rect = this.f6957d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0956f).leftMargin, viewMo7342L.getBottom() + ((ViewGroup.MarginLayoutParams) c0956f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0956f).rightMargin, ((coordinatorLayout.getHeight() + viewMo7342L.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0956f).bottomMargin);
        C0318w0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.m1086j();
            rect.right -= lastWindowInsets.m1087k();
        }
        Rect rect2 = this.f6958e;
        Gravity.apply(m7365R(c0956f.f4621c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i3);
        int iM7367M = m7367M(viewMo7342L);
        view.layout(rect2.left, rect2.top - iM7367M, rect2.right, rect2.bottom - iM7367M);
        this.f6959f = rect2.top - viewMo7342L.getBottom();
    }

    /* JADX INFO: renamed from: L */
    abstract View mo7342L(List list);

    /* JADX INFO: renamed from: M */
    final int m7367M(View view) {
        if (this.f6960g == 0) {
            return 0;
        }
        float fMo7343N = mo7343N(view);
        int i3 = this.f6960g;
        return AbstractC0091a.m258b((int) (fMo7343N * i3), 0, i3);
    }

    /* JADX INFO: renamed from: N */
    abstract float mo7343N(View view);

    /* JADX INFO: renamed from: O */
    public final int m7368O() {
        return this.f6960g;
    }

    /* JADX INFO: renamed from: P */
    int mo7344P(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: Q */
    final int m7369Q() {
        return this.f6959f;
    }

    /* JADX INFO: renamed from: S */
    public final void m7370S(int i3) {
        this.f6960g = i3;
    }

    /* JADX INFO: renamed from: T */
    protected boolean mo7371T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: q */
    public boolean mo4152q(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
        View viewMo7342L;
        C0318w0 lastWindowInsets;
        int i7 = view.getLayoutParams().height;
        if ((i7 != -1 && i7 != -2) || (viewMo7342L = mo7342L(coordinatorLayout.m4123r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewMo7342L.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m1088l() + lastWindowInsets.m1085i();
        }
        int iMo7344P = size + mo7344P(viewMo7342L);
        int measuredHeight = viewMo7342L.getMeasuredHeight();
        if (mo7371T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iMo7344P -= measuredHeight;
        }
        coordinatorLayout.m4112J(view, i3, i4, View.MeasureSpec.makeMeasureSpec(iMo7344P, i7 == -1 ? 1073741824 : Integer.MIN_VALUE), i6);
        return true;
    }

    public AbstractC1429e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6957d = new Rect();
        this.f6958e = new Rect();
        this.f6959f = 0;
    }
}
