package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.AbstractC0966b;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p016F0.AbstractC0140a;
import p019G0.AbstractC0176a;
import p058T0.AbstractC0528h;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0953c {

    /* JADX INFO: renamed from: m */
    private static final int f7030m = AbstractC0140a.f357y;

    /* JADX INFO: renamed from: n */
    private static final int f7031n = AbstractC0140a.f308A;

    /* JADX INFO: renamed from: o */
    private static final int f7032o = AbstractC0140a.f314G;

    /* JADX INFO: renamed from: a */
    private final LinkedHashSet f7033a;

    /* JADX INFO: renamed from: b */
    private int f7034b;

    /* JADX INFO: renamed from: c */
    private int f7035c;

    /* JADX INFO: renamed from: d */
    private TimeInterpolator f7036d;

    /* JADX INFO: renamed from: e */
    private TimeInterpolator f7037e;

    /* JADX INFO: renamed from: f */
    private int f7038f;

    /* JADX INFO: renamed from: g */
    private AccessibilityManager f7039g;

    /* JADX INFO: renamed from: h */
    private AccessibilityManager.TouchExplorationStateChangeListener f7040h;

    /* JADX INFO: renamed from: i */
    private boolean f7041i;

    /* JADX INFO: renamed from: j */
    private int f7042j;

    /* JADX INFO: renamed from: k */
    private int f7043k;

    /* JADX INFO: renamed from: l */
    private ViewPropertyAnimator f7044l;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class ViewOnAttachStateChangeListenerC1436a implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC1436a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f7040h == null || HideBottomViewOnScrollBehavior.this.f7039g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f7039g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f7040h);
            HideBottomViewOnScrollBehavior.this.f7040h = null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$b */
    class C1437b extends AnimatorListenerAdapter {
        C1437b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f7044l = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f7033a = new LinkedHashSet();
        this.f7038f = 0;
        this.f7041i = true;
        this.f7042j = 2;
        this.f7043k = 0;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m7528I(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z2) {
        if (!z2) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.m7536P()) {
            hideBottomViewOnScrollBehavior.m7540T(view);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m7533N(View view, int i3, long j3, TimeInterpolator timeInterpolator) {
        this.f7044l = view.animate().translationY(i3).setInterpolator(timeInterpolator).setDuration(j3).setListener(new C1437b());
    }

    /* JADX INFO: renamed from: O */
    private void m7534O(final View view) {
        if (this.f7039g == null) {
            this.f7039g = (AccessibilityManager) AbstractC0966b.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f7039g == null || this.f7040h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: I0.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                HideBottomViewOnScrollBehavior.m7528I(this.f1237a, view, z2);
            }
        };
        this.f7040h = touchExplorationStateChangeListener;
        this.f7039g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1436a());
    }

    /* JADX INFO: renamed from: V */
    private void m7535V(View view, int i3) {
        this.f7042j = i3;
        Iterator it = this.f7033a.iterator();
        if (it.hasNext()) {
            AbstractC0740E.m2693a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: E */
    public boolean mo4136E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
        return i3 == 2;
    }

    /* JADX INFO: renamed from: P */
    public boolean m7536P() {
        return this.f7042j == 1;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m7537Q() {
        return this.f7042j == 2;
    }

    /* JADX INFO: renamed from: R */
    public void m7538R(View view) {
        m7539S(view, true);
    }

    /* JADX INFO: renamed from: S */
    public void m7539S(View view, boolean z2) {
        AccessibilityManager accessibilityManager;
        if (m7536P()) {
            return;
        }
        if (this.f7041i && (accessibilityManager = this.f7039g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7044l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m7535V(view, 1);
        int i3 = this.f7038f + this.f7043k;
        if (z2) {
            m7533N(view, i3, this.f7035c, this.f7037e);
        } else {
            view.setTranslationY(i3);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m7540T(View view) {
        m7541U(view, true);
    }

    /* JADX INFO: renamed from: U */
    public void m7541U(View view, boolean z2) {
        if (m7537Q()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7044l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m7535V(view, 2);
        if (z2) {
            m7533N(view, 0, this.f7034b, this.f7036d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: p */
    public boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
        this.f7038f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f7034b = AbstractC0528h.m1910f(view.getContext(), f7030m, 225);
        this.f7035c = AbstractC0528h.m1910f(view.getContext(), f7031n, 175);
        Context context = view.getContext();
        int i4 = f7032o;
        this.f7036d = AbstractC0528h.m1911g(context, i4, AbstractC0176a.f1128d);
        this.f7037e = AbstractC0528h.m1911g(view.getContext(), i4, AbstractC0176a.f1127c);
        m7534O(view);
        return super.mo4151p(coordinatorLayout, view, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: x */
    public void mo4159x(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        if (i4 > 0) {
            m7538R(view);
        } else if (i4 < 0) {
            m7540T(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7033a = new LinkedHashSet();
        this.f7038f = 0;
        this.f7041i = true;
        this.f7042j = 2;
        this.f7043k = 0;
    }
}
