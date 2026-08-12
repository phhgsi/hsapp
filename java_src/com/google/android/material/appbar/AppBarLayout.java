package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.drawable.AbstractC1519d;
import com.google.android.material.internal.AbstractC1546q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p000A.AbstractC0000a;
import p009D.AbstractC0091a;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0145f;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p019G0.AbstractC0176a;
import p024I.AbstractC0206c;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p027J.C0318w0;
import p027J.InterfaceC0225A;
import p027J.InterfaceC0235F;
import p030K.C0356y;
import p043O0.AbstractC0450a;
import p058T0.AbstractC0528h;
import p067W0.AbstractC0557c;
import p076Z0.AbstractC0638i;
import p076Z0.C0637h;
import p089c1.AbstractC1313a;
import p095e.AbstractC1832a;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0952b {

    /* JADX INFO: renamed from: B */
    private static final int f6884B = AbstractC0149j.f572e;

    /* JADX INFO: renamed from: A */
    private Behavior f6885A;

    /* JADX INFO: renamed from: a */
    private int f6886a;

    /* JADX INFO: renamed from: b */
    private int f6887b;

    /* JADX INFO: renamed from: c */
    private int f6888c;

    /* JADX INFO: renamed from: d */
    private int f6889d;

    /* JADX INFO: renamed from: e */
    private boolean f6890e;

    /* JADX INFO: renamed from: f */
    private int f6891f;

    /* JADX INFO: renamed from: g */
    private C0318w0 f6892g;

    /* JADX INFO: renamed from: h */
    private List f6893h;

    /* JADX INFO: renamed from: i */
    private boolean f6894i;

    /* JADX INFO: renamed from: j */
    private boolean f6895j;

    /* JADX INFO: renamed from: k */
    private boolean f6896k;

    /* JADX INFO: renamed from: l */
    private boolean f6897l;

    /* JADX INFO: renamed from: m */
    private ColorStateList f6898m;

    /* JADX INFO: renamed from: n */
    private int f6899n;

    /* JADX INFO: renamed from: o */
    private WeakReference f6900o;

    /* JADX INFO: renamed from: p */
    private ValueAnimator f6901p;

    /* JADX INFO: renamed from: q */
    private ValueAnimator.AnimatorUpdateListener f6902q;

    /* JADX INFO: renamed from: r */
    private final List f6903r;

    /* JADX INFO: renamed from: s */
    private final LinkedHashSet f6904s;

    /* JADX INFO: renamed from: t */
    private final long f6905t;

    /* JADX INFO: renamed from: u */
    private final TimeInterpolator f6906u;

    /* JADX INFO: renamed from: v */
    private int[] f6907v;

    /* JADX INFO: renamed from: w */
    private int f6908w;

    /* JADX INFO: renamed from: x */
    private Drawable f6909x;

    /* JADX INFO: renamed from: y */
    private Integer f6910y;

    /* JADX INFO: renamed from: z */
    private final float f6911z;

    protected static class BaseBehavior<T extends AppBarLayout> extends AbstractC1428d {

        /* JADX INFO: renamed from: k */
        private int f6912k;

        /* JADX INFO: renamed from: l */
        private int f6913l;

        /* JADX INFO: renamed from: m */
        private ValueAnimator f6914m;

        /* JADX INFO: renamed from: n */
        private SavedState f6915n;

        /* JADX INFO: renamed from: o */
        private WeakReference f6916o;

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C1419a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CoordinatorLayout f6922a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AppBarLayout f6923b;

            C1419a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f6922a = coordinatorLayout;
                this.f6923b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m7364T(this.f6922a, this.f6923b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C1420b extends C0273a {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ AppBarLayout f6925d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ CoordinatorLayout f6926e;

            C1420b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f6925d = appBarLayout;
                this.f6926e = coordinatorLayout;
            }

            @Override // p027J.C0273a
            /* JADX INFO: renamed from: g */
            public void mo905g(View view, C0356y c0356y) {
                View viewM7310j0;
                super.mo905g(view, c0356y);
                c0356y.m1287s0(ScrollView.class.getName());
                if (this.f6925d.getTotalScrollRange() == 0 || (viewM7310j0 = BaseBehavior.this.m7310j0(this.f6926e)) == null || !BaseBehavior.this.m7306f0(this.f6925d)) {
                    return;
                }
                if (BaseBehavior.this.mo7316Q() != (-this.f6925d.getTotalScrollRange())) {
                    c0356y.m1263b(C0356y.a.f1460q);
                    c0356y.m1237L0(true);
                }
                if (BaseBehavior.this.mo7316Q() != 0) {
                    if (!viewM7310j0.canScrollVertically(-1)) {
                        c0356y.m1263b(C0356y.a.f1461r);
                        c0356y.m1237L0(true);
                    } else if ((-this.f6925d.getDownNestedPreScrollRange()) != 0) {
                        c0356y.m1263b(C0356y.a.f1461r);
                        c0356y.m1237L0(true);
                    }
                }
            }

            @Override // p027J.C0273a
            /* JADX INFO: renamed from: j */
            public boolean mo908j(View view, int i3, Bundle bundle) {
                if (i3 == 4096) {
                    this.f6925d.setExpanded(false);
                    return true;
                }
                if (i3 != 8192) {
                    return super.mo908j(view, i3, bundle);
                }
                if (BaseBehavior.this.mo7316Q() != 0) {
                    View viewM7310j0 = BaseBehavior.this.m7310j0(this.f6926e);
                    if (!viewM7310j0.canScrollVertically(-1)) {
                        this.f6925d.setExpanded(true);
                        return true;
                    }
                    int i4 = -this.f6925d.getDownNestedPreScrollRange();
                    if (i4 != 0) {
                        BaseBehavior.this.mo4156u(this.f6926e, this.f6925d, viewM7310j0, 0, i4, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        /* JADX INFO: renamed from: A0 */
        private void m7295A0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iMo7316Q = mo7316Q() - topInset;
            int iM7309i0 = m7309i0(appBarLayout, iMo7316Q);
            if (iM7309i0 >= 0) {
                View childAt = appBarLayout.getChildAt(iM7309i0);
                C1424d c1424d = (C1424d) childAt.getLayoutParams();
                int iM7350c = c1424d.m7350c();
                if ((iM7350c & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iM7309i0 == 0 && appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (m7305e0(iM7350c, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (m7305e0(iM7350c, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (iMo7316Q < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (m7305e0(iM7350c, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) c1424d).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c1424d).bottomMargin;
                    }
                    m7301Z(coordinatorLayout, appBarLayout, AbstractC0091a.m258b(m7303b0(iMo7316Q, minimumHeight, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX INFO: renamed from: B0 */
        private void m7296B0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3, int i4, boolean z2) {
            View viewM7308h0 = m7308h0(appBarLayout, i3);
            boolean zM7282C = false;
            if (viewM7308h0 != null) {
                int iM7350c = ((C1424d) viewM7308h0.getLayoutParams()).m7350c();
                if ((iM7350c & 1) != 0) {
                    int minimumHeight = viewM7308h0.getMinimumHeight();
                    if (i4 <= 0 || (iM7350c & 12) == 0 ? !((iM7350c & 2) == 0 || (-i3) < (viewM7308h0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i3) >= (viewM7308h0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zM7282C = true;
                    }
                }
            }
            if (appBarLayout.m7288o()) {
                zM7282C = appBarLayout.m7282C(m7307g0(coordinatorLayout));
            }
            boolean zM7294z = appBarLayout.m7294z(zM7282C);
            if (z2 || (zM7294z && m7312z0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        /* JADX INFO: renamed from: Y */
        private void m7300Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (AbstractC0268W.m742K(coordinatorLayout)) {
                return;
            }
            AbstractC0268W.m775i0(coordinatorLayout, new C1420b(appBarLayout, coordinatorLayout));
        }

        /* JADX INFO: renamed from: Z */
        private void m7301Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3, float f3) {
            int iAbs = Math.abs(mo7316Q() - i3);
            float fAbs = Math.abs(f3);
            m7302a0(coordinatorLayout, appBarLayout, i3, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        /* JADX INFO: renamed from: a0 */
        private void m7302a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3, int i4) {
            int iMo7316Q = mo7316Q();
            if (iMo7316Q == i3) {
                ValueAnimator valueAnimator = this.f6914m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f6914m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f6914m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f6914m = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC0176a.f1129e);
                this.f6914m.addUpdateListener(new C1419a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f6914m.setDuration(Math.min(i4, 600));
            this.f6914m.setIntValues(iMo7316Q, i3);
            this.f6914m.start();
        }

        /* JADX INFO: renamed from: b0 */
        private int m7303b0(int i3, int i4, int i5) {
            return i3 < (i4 + i5) / 2 ? i4 : i5;
        }

        /* JADX INFO: renamed from: d0 */
        private boolean m7304d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.m7287k() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        /* JADX INFO: renamed from: e0 */
        private static boolean m7305e0(int i3, int i4) {
            return (i3 & i4) == i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f0 */
        public boolean m7306f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (((C1424d) appBarLayout.getChildAt(i3).getLayoutParams()).f6931a != 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g0 */
        private View m7307g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                if ((childAt instanceof InterfaceC0225A) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: h0 */
        private static View m7308h0(AppBarLayout appBarLayout, int i3) {
            int iAbs = Math.abs(i3);
            int childCount = appBarLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = appBarLayout.getChildAt(i4);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i0 */
        private int m7309i0(AppBarLayout appBarLayout, int i3) {
            int childCount = appBarLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = appBarLayout.getChildAt(i4);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C1424d c1424d = (C1424d) childAt.getLayoutParams();
                if (m7305e0(c1424d.m7350c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c1424d).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c1424d).bottomMargin;
                }
                int i5 = -i3;
                if (top <= i5 && bottom >= i5) {
                    return i4;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j0 */
        public View m7310j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                if (((CoordinatorLayout.C0956f) childAt.getLayoutParams()).m4169e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: m0 */
        private int m7311m0(AppBarLayout appBarLayout, int i3) {
            int iAbs = Math.abs(i3);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i4);
                C1424d c1424d = (C1424d) childAt.getLayoutParams();
                Interpolator interpolatorM7351d = c1424d.m7351d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i4++;
                } else if (interpolatorM7351d != null) {
                    int iM7350c = c1424d.m7350c();
                    if ((iM7350c & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) c1424d).topMargin + ((LinearLayout.LayoutParams) c1424d).bottomMargin;
                        if ((iM7350c & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f3 = topInset;
                        return Integer.signum(i3) * (childAt.getTop() + Math.round(f3 * interpolatorM7351d.getInterpolation((iAbs - childAt.getTop()) / f3)));
                    }
                }
            }
            return i3;
        }

        /* JADX INFO: renamed from: z0 */
        private boolean m7312z0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listM4124s = coordinatorLayout.m4124s(appBarLayout);
            int size = listM4124s.size();
            for (int i3 = 0; i3 < size; i3++) {
                CoordinatorLayout.AbstractC0953c abstractC0953cM4169e = ((CoordinatorLayout.C0956f) ((View) listM4124s.get(i3)).getLayoutParams()).m4169e();
                if (abstractC0953cM4169e instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) abstractC0953cM4169e).m7368O() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.AbstractC1428d
        /* JADX INFO: renamed from: Q */
        int mo7316Q() {
            return mo7337I() + this.f6912k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1428d
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean mo7313L(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f6916o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1428d
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int mo7314O(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1428d
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int mo7315P(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1428d
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void mo7317R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m7295A0(coordinatorLayout, appBarLayout);
            if (appBarLayout.m7288o()) {
                appBarLayout.m7294z(appBarLayout.m7282C(m7307g0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.AbstractC1430f, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean mo4151p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3) {
            boolean zMo4151p = super.mo4151p(coordinatorLayout, appBarLayout, i3);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f6915n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z2 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i4 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z2) {
                            m7301Z(coordinatorLayout, appBarLayout, i4, 0.0f);
                        } else {
                            m7364T(coordinatorLayout, appBarLayout, i4);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z2) {
                            m7301Z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            m7364T(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f6917f) {
                m7364T(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f6918g) {
                m7364T(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f6919h);
                m7364T(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f6915n.f6921j ? childAt.getMinimumHeight() + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f6915n.f6920i)));
            }
            appBarLayout.m7292v();
            this.f6915n = null;
            mo7338K(AbstractC0091a.m258b(mo7337I(), -appBarLayout.getTotalScrollRange(), 0));
            m7296B0(coordinatorLayout, appBarLayout, mo7337I(), 0, true);
            appBarLayout.m7290t(mo7337I());
            m7300Y(coordinatorLayout, appBarLayout);
            return zMo4151p;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean mo4152q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3, int i4, int i5, int i6) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0956f) appBarLayout.getLayoutParams())).height != -2) {
                return super.mo4152q(coordinatorLayout, appBarLayout, i3, i4, i5, i6);
            }
            coordinatorLayout.m4112J(appBarLayout, i3, i4, View.MeasureSpec.makeMeasureSpec(0, 0), i6);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo4156u(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L26
                if (r11 >= 0) goto L11
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
            Le:
                r4 = r10
                r5 = r13
                goto L18
            L11:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
                goto Le
            L18:
                if (r4 == r5) goto L26
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.m7363S(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L27
            L26:
                r2 = r8
            L27:
                boolean r7 = r2.m7288o()
                if (r7 == 0) goto L34
                boolean r7 = r2.m7282C(r9)
                r2.m7294z(r7)
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo4156u(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void mo4159x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i8;
            if (i6 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i8 = i6;
                iArr[1] = m7363S(coordinatorLayout2, appBarLayout2, i8, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i8 = i6;
            }
            if (i8 == 0) {
                m7300Y(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void mo4133B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                m7331w0((SavedState) parcelable, true);
                super.mo4133B(coordinatorLayout, appBarLayout, this.f6915n.m4418a());
            } else {
                super.mo4133B(coordinatorLayout, appBarLayout, parcelable);
                this.f6915n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable mo4134C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableMo4134C = super.mo4134C(coordinatorLayout, appBarLayout);
            SavedState savedStateM7332x0 = m7332x0(parcelableMo4134C, appBarLayout);
            return savedStateM7332x0 == null ? parcelableMo4134C : savedStateM7332x0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean mo4136E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i3, int i4) {
            ValueAnimator valueAnimator;
            boolean z2 = (i3 & 2) != 0 && (appBarLayout.m7288o() || appBarLayout.m7289q() || m7304d0(coordinatorLayout, appBarLayout, view));
            if (z2 && (valueAnimator = this.f6914m) != null) {
                valueAnimator.cancel();
            }
            this.f6916o = null;
            this.f6913l = i4;
            return z2;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void mo4138G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3) {
            if (this.f6913l == 0 || i3 == 1) {
                m7295A0(coordinatorLayout, appBarLayout);
                if (appBarLayout.m7288o()) {
                    appBarLayout.m7294z(appBarLayout.m7282C(view));
                }
            }
            this.f6916o = new WeakReference(view);
        }

        /* JADX INFO: renamed from: w0 */
        void m7331w0(SavedState savedState, boolean z2) {
            if (this.f6915n == null || z2) {
                this.f6915n = savedState;
            }
        }

        /* JADX INFO: renamed from: x0 */
        SavedState m7332x0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iMo7337I = mo7337I();
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                int bottom = childAt.getBottom() + iMo7337I;
                if (childAt.getTop() + iMo7337I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f4742e;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z2 = iMo7337I == 0;
                    savedState.f6918g = z2;
                    savedState.f6917f = !z2 && (-iMo7337I) >= appBarLayout.getTotalScrollRange();
                    savedState.f6919h = i3;
                    savedState.f6921j = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    savedState.f6920i = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1428d
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int mo7318U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3, int i4, int i5) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int iMo7316Q = mo7316Q();
            int i6 = 0;
            if (i4 == 0 || iMo7316Q < i4 || iMo7316Q > i5) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f6912k = 0;
            } else {
                int iM258b = AbstractC0091a.m258b(i3, i4, i5);
                if (iMo7316Q != iM258b) {
                    int iM7311m0 = appBarLayout.m7286i() ? m7311m0(appBarLayout, iM258b) : iM258b;
                    boolean zMo7338K = mo7338K(iM7311m0);
                    int i7 = iMo7316Q - iM258b;
                    this.f6912k = iM258b - iM7311m0;
                    if (zMo7338K) {
                        while (i6 < appBarLayout.getChildCount()) {
                            C1424d c1424d = (C1424d) appBarLayout.getChildAt(i6).getLayoutParams();
                            AbstractC1422b abstractC1422bM7349b = c1424d.m7349b();
                            if (abstractC1422bM7349b != null && (c1424d.m7350c() & 1) != 0) {
                                abstractC1422bM7349b.mo7346a(appBarLayout, appBarLayout.getChildAt(i6), mo7337I());
                            }
                            i6++;
                        }
                    }
                    if (!zMo7338K && appBarLayout.m7286i()) {
                        coordinatorLayout.m4117g(appBarLayout);
                    }
                    appBarLayout.m7290t(mo7337I());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    m7296B0(coordinatorLayout2, appBarLayout2, iM258b, iM258b < iMo7316Q ? -1 : 1, false);
                    i6 = i7;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            m7300Y(coordinatorLayout2, appBarLayout2);
            return i6;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C1418a();

            /* JADX INFO: renamed from: f */
            boolean f6917f;

            /* JADX INFO: renamed from: g */
            boolean f6918g;

            /* JADX INFO: renamed from: h */
            int f6919h;

            /* JADX INFO: renamed from: i */
            float f6920i;

            /* JADX INFO: renamed from: j */
            boolean f6921j;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            class C1418a implements Parcelable.ClassLoaderCreator {
                C1418a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i3) {
                    return new SavedState[i3];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f6917f = parcel.readByte() != 0;
                this.f6918g = parcel.readByte() != 0;
                this.f6919h = parcel.readInt();
                this.f6920i = parcel.readFloat();
                this.f6921j = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i3) {
                super.writeToParcel(parcel, i3);
                parcel.writeByte(this.f6917f ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f6918g ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f6919h);
                parcel.writeFloat(this.f6920i);
                parcel.writeByte(this.f6921j ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AbstractC1428d, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo4139H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo4139H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AbstractC1430f
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ int mo7337I() {
            return super.mo7337I();
        }

        @Override // com.google.android.material.appbar.AbstractC1430f
        /* JADX INFO: renamed from: K */
        public /* bridge */ /* synthetic */ boolean mo7338K(int i3) {
            return super.mo7338K(i3);
        }

        @Override // com.google.android.material.appbar.AbstractC1428d, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: o */
        public /* bridge */ /* synthetic */ boolean mo4150o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo4150o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean mo4151p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3) {
            return super.mo4151p(coordinatorLayout, appBarLayout, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean mo4152q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3, int i4, int i5, int i6) {
            return super.mo4152q(coordinatorLayout, appBarLayout, i3, i4, i5, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ void mo4156u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3, int i4, int[] iArr, int i5) {
            super.mo4156u(coordinatorLayout, appBarLayout, view, i3, i4, iArr, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void mo4159x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
            super.mo4159x(coordinatorLayout, appBarLayout, view, i3, i4, i5, i6, i7, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: s0 */
        public /* bridge */ /* synthetic */ void mo4133B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo4133B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable mo4134C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo4134C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean mo4136E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i3, int i4) {
            return super.mo4136E(coordinatorLayout, appBarLayout, view, view2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: v0 */
        public /* bridge */ /* synthetic */ void mo4138G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3) {
            super.mo4138G(coordinatorLayout, appBarLayout, view, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC1429e {
        public ScrollingViewBehavior() {
        }

        /* JADX INFO: renamed from: V */
        private static int m7339V(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0953c abstractC0953cM4169e = ((CoordinatorLayout.C0956f) appBarLayout.getLayoutParams()).m4169e();
            if (abstractC0953cM4169e instanceof BaseBehavior) {
                return ((BaseBehavior) abstractC0953cM4169e).mo7316Q();
            }
            return 0;
        }

        /* JADX INFO: renamed from: W */
        private void m7340W(View view, View view2) {
            CoordinatorLayout.AbstractC0953c abstractC0953cM4169e = ((CoordinatorLayout.C0956f) view2.getLayoutParams()).m4169e();
            if (abstractC0953cM4169e instanceof BaseBehavior) {
                AbstractC0268W.m751T(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC0953cM4169e).f6912k) + m7369Q()) - m7367M(view2));
            }
        }

        /* JADX INFO: renamed from: X */
        private void m7341X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m7288o()) {
                    appBarLayout.m7294z(appBarLayout.m7282C(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: A */
        public boolean mo4132A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
            AppBarLayout appBarLayoutMo7342L = mo7342L(coordinatorLayout.m4123r(view));
            if (appBarLayoutMo7342L != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f6957d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutMo7342L.m7293w(false, !z2);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.AbstractC1429e
        /* JADX INFO: renamed from: N */
        float mo7343N(View view) {
            int i3;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iM7339V = m7339V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iM7339V > downNestedPreScrollRange) && (i3 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iM7339V / i3) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC1429e
        /* JADX INFO: renamed from: P */
        int mo7344P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo7344P(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC1429e
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout mo7342L(List list) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) list.get(i3);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: i */
        public boolean mo4144i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: l */
        public boolean mo4147l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m7340W(view, view2);
            m7341X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: m */
        public void mo4148m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AbstractC0268W.m775i0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.AbstractC1430f, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
            return super.mo4151p(coordinatorLayout, view, i3);
        }

        @Override // com.google.android.material.appbar.AbstractC1429e, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: q */
        public /* bridge */ /* synthetic */ boolean mo4152q(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
            return super.mo4152q(coordinatorLayout, view, i3, i4, i5, i6);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f816Y5);
            m7370S(typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0150k.f825Z5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C1421a implements InterfaceC0235F {
        C1421a() {
        }

        @Override // p027J.InterfaceC0235F
        /* JADX INFO: renamed from: a */
        public C0318w0 mo662a(View view, C0318w0 c0318w0) {
            return AppBarLayout.this.m7291u(c0318w0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public static abstract class AbstractC1422b {
        /* JADX INFO: renamed from: a */
        public abstract void mo7346a(AppBarLayout appBarLayout, View view, float f3);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C1423c extends AbstractC1422b {

        /* JADX INFO: renamed from: a */
        private final Rect f6929a = new Rect();

        /* JADX INFO: renamed from: b */
        private final Rect f6930b = new Rect();

        /* JADX INFO: renamed from: b */
        private static void m7347b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC1422b
        /* JADX INFO: renamed from: a */
        public void mo7346a(AppBarLayout appBarLayout, View view, float f3) {
            m7347b(this.f6929a, appBarLayout, view);
            float fAbs = this.f6929a.top - Math.abs(f3);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fM257a = 1.0f - AbstractC0091a.m257a(Math.abs(fAbs / this.f6929a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f6929a.height() * 0.3f) * (1.0f - (fM257a * fM257a)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f6930b);
            this.f6930b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f6930b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f6930b);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f333a);
    }

    /* JADX INFO: renamed from: B */
    private boolean m7263B() {
        return this.f6909x != null && getTopInset() > 0;
    }

    /* JADX INFO: renamed from: D */
    private boolean m7264D() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    private void m7265E(float f3, float f4) {
        ValueAnimator valueAnimator = this.f6901p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f4);
        this.f6901p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f6905t);
        this.f6901p.setInterpolator(this.f6906u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f6902q;
        if (animatorUpdateListener != null) {
            this.f6901p.addUpdateListener(animatorUpdateListener);
        }
        this.f6901p.start();
    }

    /* JADX INFO: renamed from: F */
    private void m7266F() {
        setWillNotDraw(!m7263B());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7267a(AppBarLayout appBarLayout, C0637h c0637h, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c0637h.m2273b0(fFloatValue);
        Drawable drawable = appBarLayout.f6909x;
        if (drawable instanceof C0637h) {
            ((C0637h) drawable).m2273b0(fFloatValue);
        }
        Iterator it = appBarLayout.f6903r.iterator();
        if (it.hasNext()) {
            AbstractC0740E.m2693a(it.next());
            c0637h.m2258E();
            throw null;
        }
        Iterator it2 = appBarLayout.f6904s.iterator();
        if (it2.hasNext()) {
            AbstractC0740E.m2693a(it2.next());
            c0637h.m2258E();
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7268b(AppBarLayout appBarLayout, ColorStateList colorStateList, C0637h c0637h, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iM1638j = AbstractC0450a.m1638j(appBarLayout.f6908w, colorStateList.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        c0637h.m2274c0(ColorStateList.valueOf(iM1638j));
        if (appBarLayout.f6909x != null && (num2 = appBarLayout.f6910y) != null && num2.equals(num)) {
            appBarLayout.f6909x.setTint(iM1638j);
        }
        if (!appBarLayout.f6903r.isEmpty()) {
            Iterator it = appBarLayout.f6903r.iterator();
            while (it.hasNext()) {
                AbstractC0740E.m2693a(it.next());
                if (c0637h.m2255B() != null) {
                    throw null;
                }
            }
        }
        if (appBarLayout.f6904s.isEmpty()) {
            return;
        }
        Iterator it2 = appBarLayout.f6904s.iterator();
        if (it2.hasNext()) {
            AbstractC0740E.m2693a(it2.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7269c() {
        WeakReference weakReference = this.f6900o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6900o = null;
    }

    /* JADX INFO: renamed from: d */
    private Integer m7270d() {
        Drawable drawable = this.f6909x;
        if (drawable instanceof C0637h) {
            return Integer.valueOf(((C0637h) drawable).m2258E());
        }
        ColorStateList colorStateListM8253f = AbstractC1519d.m8253f(drawable);
        if (colorStateListM8253f != null) {
            return Integer.valueOf(colorStateListM8253f.getDefaultColor());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private View m7271e(View view) {
        int i3;
        if (this.f6900o == null && (i3 = this.f6899n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i3) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f6899n);
            }
            if (viewFindViewById != null) {
                this.f6900o = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f6900o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private boolean m7272j() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (((C1424d) getChildAt(i3).getLayoutParams()).m7352e()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private void m7273l(final C0637h c0637h, final ColorStateList colorStateList) {
        final Integer numM1634f = AbstractC0450a.m1634f(getContext(), AbstractC0140a.f341i);
        this.f6902q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.m7268b(this.f6941a, colorStateList, c0637h, numM1634f, valueAnimator);
            }
        };
    }

    /* JADX INFO: renamed from: m */
    private void m7274m(Context context, final C0637h c0637h) {
        c0637h.m2266Q(context);
        this.f6902q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.m7267a(this.f6945a, c0637h, valueAnimator);
            }
        };
    }

    /* JADX INFO: renamed from: n */
    private void m7275n() {
        Behavior behavior = this.f6885A;
        BaseBehavior.SavedState savedStateM7332x0 = (behavior == null || this.f6887b == -1 || this.f6891f != 0) ? null : behavior.m7332x0(AbsSavedState.f4742e, this);
        this.f6887b = -1;
        this.f6888c = -1;
        this.f6889d = -1;
        if (savedStateM7332x0 != null) {
            this.f6885A.m7331w0(savedStateM7332x0, false);
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m7276p() {
        return getBackground() instanceof C0637h;
    }

    /* JADX INFO: renamed from: r */
    private C0637h m7277r(Drawable drawable) {
        if (drawable instanceof C0637h) {
            return (C0637h) drawable;
        }
        ColorStateList colorStateListM8253f = AbstractC1519d.m8253f(drawable);
        if (colorStateListM8253f == null) {
            return null;
        }
        C0637h c0637h = new C0637h();
        c0637h.m2274c0(colorStateListM8253f);
        return c0637h;
    }

    /* JADX INFO: renamed from: s */
    private Drawable m7278s(Context context, Drawable drawable) {
        C0637h c0637hM7277r = m7277r(drawable);
        if (c0637hM7277r == null || c0637hM7277r.m2255B() == null) {
            return drawable;
        }
        this.f6908w = c0637hM7277r.m2255B().getDefaultColor();
        ColorStateList colorStateList = this.f6898m;
        if (colorStateList != null) {
            m7273l(c0637hM7277r, colorStateList);
            return c0637hM7277r;
        }
        m7274m(context, c0637hM7277r);
        return c0637hM7277r;
    }

    /* JADX INFO: renamed from: x */
    private void m7279x(boolean z2, boolean z3, boolean z4) {
        this.f6891f = (z2 ? 1 : 2) | (z3 ? 4 : 0) | (z4 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: renamed from: y */
    private boolean m7280y(boolean z2) {
        if (this.f6895j == z2) {
            return false;
        }
        this.f6895j = z2;
        refreshDrawableState();
        return true;
    }

    /* JADX INFO: renamed from: A */
    boolean m7281A(boolean z2, boolean z3) {
        if (!z3 || this.f6896k == z2) {
            return false;
        }
        this.f6896k = z2;
        refreshDrawableState();
        if (!m7276p()) {
            return true;
        }
        if (this.f6898m != null) {
            m7265E(z2 ? 0.0f : 1.0f, z2 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f6897l) {
            return true;
        }
        m7265E(z2 ? 0.0f : this.f6911z, z2 ? this.f6911z : 0.0f);
        return true;
    }

    /* JADX INFO: renamed from: C */
    boolean m7282C(View view) {
        View viewM7271e = m7271e(view);
        if (viewM7271e != null) {
            view = viewM7271e;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1424d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m7263B()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f6886a);
            this.f6909x.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6909x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1424d generateDefaultLayoutParams() {
        return new C1424d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1424d generateLayoutParams(AttributeSet attributeSet) {
        return new C1424d(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0952b
    public CoordinatorLayout.AbstractC0953c getBehavior() {
        Behavior behavior = new Behavior();
        this.f6885A = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i3 = this.f6888c;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C1424d c1424d = (C1424d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i5 = c1424d.f6931a;
                if ((i5 & 5) != 5) {
                    if (i4 > 0) {
                        break;
                    }
                } else {
                    int i6 = ((LinearLayout.LayoutParams) c1424d).topMargin + ((LinearLayout.LayoutParams) c1424d).bottomMargin;
                    if ((i5 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i5 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i6 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i4 += iMin;
                    }
                    iMin = i6 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i4 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i4);
        this.f6888c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i3 = this.f6889d;
        if (i3 != -1) {
            return i3;
        }
        int childCount = getChildCount();
        int i4 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1424d c1424d = (C1424d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c1424d).topMargin + ((LinearLayout.LayoutParams) c1424d).bottomMargin;
                int i5 = c1424d.f6931a;
                if ((i5 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i5 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i4++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f6889d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f6899n;
    }

    public C0637h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C0637h) {
            return (C0637h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i3 = (minimumHeight * 2) + topInset;
            return i3 < getHeight() ? i3 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i4 = (minimumHeight2 * 2) + topInset;
        return i4 < getHeight() ? i4 : minimumHeight2 + topInset;
    }

    int getPendingAction() {
        return this.f6891f;
    }

    public Drawable getStatusBarForeground() {
        return this.f6909x;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C0318w0 c0318w0 = this.f6892g;
        if (c0318w0 != null) {
            return c0318w0.m1088l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i3 = this.f6887b;
        if (i3 != -1) {
            return i3;
        }
        int childCount = getChildCount();
        int i4 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1424d c1424d = (C1424d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i5 = c1424d.f6931a;
                if ((i5 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) c1424d).topMargin + ((LinearLayout.LayoutParams) c1424d).bottomMargin;
                if (i4 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i5 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i4++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f6887b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1424d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C1424d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1424d((ViewGroup.MarginLayoutParams) layoutParams) : new C1424d(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    boolean m7286i() {
        return this.f6890e;
    }

    /* JADX INFO: renamed from: k */
    boolean m7287k() {
        return getTotalScrollRange() != 0;
    }

    /* JADX INFO: renamed from: o */
    public boolean m7288o() {
        return this.f6897l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0638i.m2300e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i3) {
        if (this.f6907v == null) {
            this.f6907v = new int[4];
        }
        int[] iArr = this.f6907v;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + iArr.length);
        boolean z2 = this.f6895j;
        int i4 = AbstractC0140a.f328U;
        if (!z2) {
            i4 = -i4;
        }
        iArr[0] = i4;
        iArr[1] = (z2 && this.f6896k) ? AbstractC0140a.f329V : -AbstractC0140a.f329V;
        int i5 = AbstractC0140a.f325R;
        if (!z2) {
            i5 = -i5;
        }
        iArr[2] = i5;
        iArr[3] = (z2 && this.f6896k) ? AbstractC0140a.f324Q : -AbstractC0140a.f324Q;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7269c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        boolean z3 = true;
        if (getFitsSystemWindows() && m7264D()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                AbstractC0268W.m751T(getChildAt(childCount), topInset);
            }
        }
        m7275n();
        this.f6890e = false;
        int childCount2 = getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount2) {
                break;
            }
            if (((C1424d) getChildAt(i7).getLayoutParams()).m7351d() != null) {
                this.f6890e = true;
                break;
            }
            i7++;
        }
        Drawable drawable = this.f6909x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f6894i) {
            return;
        }
        if (!this.f6897l && !m7272j()) {
            z3 = false;
        }
        m7280y(z3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i4);
        if (mode != 1073741824 && getFitsSystemWindows() && m7264D()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = AbstractC0091a.m258b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i4));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m7275n();
    }

    /* JADX INFO: renamed from: q */
    public boolean m7289q() {
        return this.f6896k;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(m7278s(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        AbstractC0638i.m2299d(this, f3);
    }

    public void setExpanded(boolean z2) {
        m7293w(z2, isLaidOut());
    }

    public void setLiftOnScroll(boolean z2) {
        this.f6897l = z2;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f6898m != colorStateList) {
            this.f6898m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f6899n = -1;
        if (view == null) {
            m7269c();
        } else {
            this.f6900o = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i3) {
        this.f6899n = i3;
        m7269c();
    }

    public void setLiftableOverrideEnabled(boolean z2) {
        this.f6894i = z2;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i3) {
        if (i3 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i3);
    }

    void setPendingAction(int i3) {
        this.f6891f = i3;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f6909x;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f6909x = drawable != null ? drawable.mutate() : null;
            this.f6910y = m7270d();
            Drawable drawable3 = this.f6909x;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f6909x.setState(getDrawableState());
                }
                AbstractC0000a.m12m(this.f6909x, getLayoutDirection());
                this.f6909x.setVisible(getVisibility() == 0, false);
                this.f6909x.setCallback(this);
            }
            m7266F();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i3) {
        setStatusBarForeground(new ColorDrawable(i3));
    }

    public void setStatusBarForegroundResource(int i3) {
        setStatusBarForeground(AbstractC1832a.m9609b(getContext(), i3));
    }

    @Deprecated
    public void setTargetElevation(float f3) {
        AbstractC1432h.m7378b(this, f3);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z2 = i3 == 0;
        Drawable drawable = this.f6909x;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
    }

    /* JADX INFO: renamed from: t */
    void m7290t(int i3) {
        this.f6886a = i3;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.f6893h;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0740E.m2693a(this.f6893h.get(i4));
            }
        }
    }

    /* JADX INFO: renamed from: u */
    C0318w0 m7291u(C0318w0 c0318w0) {
        C0318w0 c0318w02 = getFitsSystemWindows() ? c0318w0 : null;
        if (!AbstractC0206c.m596a(this.f6892g, c0318w02)) {
            this.f6892g = c0318w02;
            m7266F();
            requestLayout();
        }
        return c0318w0;
    }

    /* JADX INFO: renamed from: v */
    void m7292v() {
        this.f6891f = 0;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6909x;
    }

    /* JADX INFO: renamed from: w */
    public void m7293w(boolean z2, boolean z3) {
        m7279x(z2, z3, true);
    }

    /* JADX INFO: renamed from: z */
    boolean m7294z(boolean z2) {
        return m7281A(z2, !this.f6894i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f6884B;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i4), attributeSet, i3);
        this.f6887b = -1;
        this.f6888c = -1;
        this.f6889d = -1;
        this.f6891f = 0;
        this.f6903r = new ArrayList();
        this.f6904s = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            AbstractC1432h.m7377a(this);
        }
        AbstractC1432h.m7379c(this, attributeSet, i3, i4);
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context2, attributeSet, AbstractC0150k.f828a, i3, i4, new int[0]);
        this.f6898m = AbstractC0557c.m2077a(context2, typedArrayM8488i, AbstractC0150k.f898h);
        this.f6905t = AbstractC0528h.m1910f(context2, AbstractC0140a.f358z, getResources().getInteger(AbstractC0145f.f507a));
        this.f6906u = AbstractC0528h.m1911g(context2, AbstractC0140a.f317J, AbstractC0176a.f1125a);
        int i5 = AbstractC0150k.f878f;
        if (typedArrayM8488i.hasValue(i5)) {
            m7279x(typedArrayM8488i.getBoolean(i5, false), false, false);
        }
        if (typedArrayM8488i.hasValue(AbstractC0150k.f868e)) {
            AbstractC1432h.m7378b(this, typedArrayM8488i.getDimensionPixelSize(r10, 0));
        }
        setBackground(typedArrayM8488i.getDrawable(AbstractC0150k.f838b));
        if (Build.VERSION.SDK_INT >= 26) {
            int i6 = AbstractC0150k.f858d;
            if (typedArrayM8488i.hasValue(i6)) {
                setKeyboardNavigationCluster(typedArrayM8488i.getBoolean(i6, false));
            }
            int i7 = AbstractC0150k.f848c;
            if (typedArrayM8488i.hasValue(i7)) {
                setTouchscreenBlocksFocus(typedArrayM8488i.getBoolean(i7, false));
            }
        }
        this.f6911z = getResources().getDimension(AbstractC0142c.f397c);
        this.f6897l = typedArrayM8488i.getBoolean(AbstractC0150k.f888g, false);
        this.f6899n = typedArrayM8488i.getResourceId(AbstractC0150k.f908i, -1);
        setStatusBarForeground(typedArrayM8488i.getDrawable(AbstractC0150k.f918j));
        typedArrayM8488i.recycle();
        AbstractC0268W.m795s0(this, new C1421a());
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C1424d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        int f6931a;

        /* JADX INFO: renamed from: b */
        private AbstractC1422b f6932b;

        /* JADX INFO: renamed from: c */
        Interpolator f6933c;

        public C1424d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6931a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f938l);
            this.f6931a = typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f958n, 0);
            m7353f(typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f948m, 0));
            int i3 = AbstractC0150k.f968o;
            if (typedArrayObtainStyledAttributes.hasValue(i3)) {
                this.f6933c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i3, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        private AbstractC1422b m7348a(int i3) {
            if (i3 != 1) {
                return null;
            }
            return new C1423c();
        }

        /* JADX INFO: renamed from: b */
        public AbstractC1422b m7349b() {
            return this.f6932b;
        }

        /* JADX INFO: renamed from: c */
        public int m7350c() {
            return this.f6931a;
        }

        /* JADX INFO: renamed from: d */
        public Interpolator m7351d() {
            return this.f6933c;
        }

        /* JADX INFO: renamed from: e */
        boolean m7352e() {
            int i3 = this.f6931a;
            return (i3 & 1) == 1 && (i3 & 10) != 0;
        }

        /* JADX INFO: renamed from: f */
        public void m7353f(int i3) {
            this.f6932b = m7348a(i3);
        }

        public C1424d(int i3, int i4) {
            super(i3, i4);
            this.f6931a = 1;
        }

        public C1424d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6931a = 1;
        }

        public C1424d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6931a = 1;
        }

        public C1424d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6931a = 1;
        }
    }
}
