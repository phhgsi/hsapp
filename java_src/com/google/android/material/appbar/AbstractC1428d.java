package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: com.google.android.material.appbar.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1428d extends AbstractC1430f {

    /* JADX INFO: renamed from: d */
    private Runnable f6947d;

    /* JADX INFO: renamed from: e */
    OverScroller f6948e;

    /* JADX INFO: renamed from: f */
    private boolean f6949f;

    /* JADX INFO: renamed from: g */
    private int f6950g;

    /* JADX INFO: renamed from: h */
    private int f6951h;

    /* JADX INFO: renamed from: i */
    private int f6952i;

    /* JADX INFO: renamed from: j */
    private VelocityTracker f6953j;

    /* JADX INFO: renamed from: com.google.android.material.appbar.d$a */
    private class a implements Runnable {

        /* JADX INFO: renamed from: d */
        private final CoordinatorLayout f6954d;

        /* JADX INFO: renamed from: e */
        private final View f6955e;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f6954d = coordinatorLayout;
            this.f6955e = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f6955e == null || (overScroller = AbstractC1428d.this.f6948e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC1428d.this.mo7317R(this.f6954d, this.f6955e);
                return;
            }
            AbstractC1428d abstractC1428d = AbstractC1428d.this;
            abstractC1428d.m7364T(this.f6954d, this.f6955e, abstractC1428d.f6948e.getCurrY());
            this.f6955e.postOnAnimation(this);
        }
    }

    public AbstractC1428d() {
        this.f6950g = -1;
        this.f6952i = -1;
    }

    /* JADX INFO: renamed from: M */
    private void m7361M() {
        if (this.f6953j == null) {
            this.f6953j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo4139H(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 1
            r8 = 0
            if (r1 == r7) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = r7
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f6950g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f6951h = r1
            goto L4b
        L2d:
            int r1 = r9.f6950g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r8
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f6951h
            int r3 = r3 - r1
            r9.f6951h = r1
            int r4 = r9.mo7314O(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.m7363S(r1, r2, r3, r4, r5)
        L4b:
            r1 = r8
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f6953j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f6953j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f6953j
            int r3 = r9.f6950g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.mo7315P(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.m7362N(r1, r2, r3, r4, r5)
            r1 = r7
            goto L72
        L71:
            r1 = r8
        L72:
            r9.f6949f = r8
            r9.f6950g = r6
            android.view.VelocityTracker r2 = r9.f6953j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f6953j = r2
        L80:
            android.view.VelocityTracker r2 = r9.f6953j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f6949f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r8
        L8f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC1428d.mo4139H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: L */
    abstract boolean mo7313L(View view);

    /* JADX INFO: renamed from: N */
    final boolean m7362N(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, float f3) {
        Runnable runnable = this.f6947d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f6947d = null;
        }
        if (this.f6948e == null) {
            this.f6948e = new OverScroller(view.getContext());
        }
        this.f6948e.fling(0, mo7337I(), 0, Math.round(f3), 0, 0, i3, i4);
        if (!this.f6948e.computeScrollOffset()) {
            mo7317R(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f6947d = aVar;
        view.postOnAnimation(aVar);
        return true;
    }

    /* JADX INFO: renamed from: O */
    abstract int mo7314O(View view);

    /* JADX INFO: renamed from: P */
    abstract int mo7315P(View view);

    /* JADX INFO: renamed from: Q */
    abstract int mo7316Q();

    /* JADX INFO: renamed from: R */
    abstract void mo7317R(CoordinatorLayout coordinatorLayout, View view);

    /* JADX INFO: renamed from: S */
    final int m7363S(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        return mo7318U(coordinatorLayout, view, mo7316Q() - i3, i4, i5);
    }

    /* JADX INFO: renamed from: T */
    int m7364T(CoordinatorLayout coordinatorLayout, View view, int i3) {
        return mo7318U(coordinatorLayout, view, i3, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: U */
    abstract int mo7318U(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: o */
    public boolean mo4150o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f6952i < 0) {
            this.f6952i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f6949f) {
            int i3 = this.f6950g;
            if (i3 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i3)) == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y2 - this.f6951h) > this.f6952i) {
                this.f6951h = y2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f6950g = -1;
            int x2 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            boolean z2 = mo7313L(view) && coordinatorLayout.m4108B(view, x2, y3);
            this.f6949f = z2;
            if (z2) {
                this.f6951h = y3;
                this.f6950g = motionEvent.getPointerId(0);
                m7361M();
                OverScroller overScroller = this.f6948e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f6948e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f6953j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC1428d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6950g = -1;
        this.f6952i = -1;
    }
}
