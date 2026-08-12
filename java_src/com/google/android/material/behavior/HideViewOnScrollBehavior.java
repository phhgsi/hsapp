package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.AbstractC0966b;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p016F0.AbstractC0140a;
import p019G0.AbstractC0176a;
import p058T0.AbstractC0528h;

/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0953c {

    /* JADX INFO: renamed from: o */
    private static final int f7047o = AbstractC0140a.f357y;

    /* JADX INFO: renamed from: p */
    private static final int f7048p = AbstractC0140a.f308A;

    /* JADX INFO: renamed from: q */
    private static final int f7049q = AbstractC0140a.f314G;

    /* JADX INFO: renamed from: a */
    private AbstractC1446d f7050a;

    /* JADX INFO: renamed from: b */
    private AccessibilityManager f7051b;

    /* JADX INFO: renamed from: c */
    private AccessibilityManager.TouchExplorationStateChangeListener f7052c;

    /* JADX INFO: renamed from: d */
    private boolean f7053d;

    /* JADX INFO: renamed from: e */
    private final LinkedHashSet f7054e;

    /* JADX INFO: renamed from: f */
    private int f7055f;

    /* JADX INFO: renamed from: g */
    private int f7056g;

    /* JADX INFO: renamed from: h */
    private TimeInterpolator f7057h;

    /* JADX INFO: renamed from: i */
    private TimeInterpolator f7058i;

    /* JADX INFO: renamed from: j */
    private int f7059j;

    /* JADX INFO: renamed from: k */
    private int f7060k;

    /* JADX INFO: renamed from: l */
    private int f7061l;

    /* JADX INFO: renamed from: m */
    private ViewPropertyAnimator f7062m;

    /* JADX INFO: renamed from: n */
    private boolean f7063n;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$a */
    class ViewOnAttachStateChangeListenerC1438a implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC1438a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f7052c == null || HideViewOnScrollBehavior.this.f7051b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f7051b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f7052c);
            HideViewOnScrollBehavior.this.f7052c = null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$b */
    class C1439b extends AnimatorListenerAdapter {
        C1439b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f7062m = null;
        }
    }

    public HideViewOnScrollBehavior() {
        this.f7053d = true;
        this.f7054e = new LinkedHashSet();
        this.f7059j = 0;
        this.f7060k = 2;
        this.f7061l = 0;
        this.f7063n = false;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m7542I(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z2) {
        if (hideViewOnScrollBehavior.f7053d && z2 && hideViewOnScrollBehavior.m7555S()) {
            hideViewOnScrollBehavior.m7556V(view);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m7547N(View view, int i3, long j3, TimeInterpolator timeInterpolator) {
        this.f7062m = this.f7050a.mo7574d(view, i3).setInterpolator(timeInterpolator).setDuration(j3).setListener(new C1439b());
    }

    /* JADX INFO: renamed from: O */
    private void m7548O(final View view) {
        if (this.f7051b == null) {
            this.f7051b = (AccessibilityManager) AbstractC0966b.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f7051b == null || this.f7052c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: I0.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                HideViewOnScrollBehavior.m7542I(this.f1239a, view, z2);
            }
        };
        this.f7052c = touchExplorationStateChangeListener;
        this.f7051b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1438a());
    }

    /* JADX INFO: renamed from: P */
    private boolean m7549P(int i3) {
        return i3 == 80 || i3 == 81;
    }

    /* JADX INFO: renamed from: Q */
    private boolean m7550Q(int i3) {
        return i3 == 3 || i3 == 19;
    }

    /* JADX INFO: renamed from: T */
    private void m7551T(View view, int i3) {
        if (this.f7063n) {
            return;
        }
        int i4 = ((CoordinatorLayout.C0956f) view.getLayoutParams()).f4621c;
        if (m7549P(i4)) {
            m7552U(1);
        } else {
            m7552U(m7550Q(Gravity.getAbsoluteGravity(i4, i3)) ? 2 : 0);
        }
    }

    /* JADX INFO: renamed from: U */
    private void m7552U(int i3) {
        AbstractC1446d abstractC1446d = this.f7050a;
        if (abstractC1446d == null || abstractC1446d.mo7573c() != i3) {
            if (i3 == 0) {
                this.f7050a = new C1445c();
                return;
            }
            if (i3 == 1) {
                this.f7050a = new C1443a();
                return;
            }
            if (i3 == 2) {
                this.f7050a = new C1444b();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i3 + ". Must be 0, 1 or 2.");
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m7553Z(View view, int i3) {
        this.f7060k = i3;
        Iterator it = this.f7054e.iterator();
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

    /* JADX INFO: renamed from: R */
    public boolean m7554R() {
        return this.f7060k == 2;
    }

    /* JADX INFO: renamed from: S */
    public boolean m7555S() {
        return this.f7060k == 1;
    }

    /* JADX INFO: renamed from: V */
    public void m7556V(View view) {
        m7557W(view, true);
    }

    /* JADX INFO: renamed from: W */
    public void m7557W(View view, boolean z2) {
        if (m7554R()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7062m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m7553Z(view, 2);
        int iMo7572b = this.f7050a.mo7572b();
        if (z2) {
            m7547N(view, iMo7572b, this.f7055f, this.f7057h);
        } else {
            this.f7050a.mo7575e(view, iMo7572b);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m7558X(View view) {
        m7559Y(view, true);
    }

    /* JADX INFO: renamed from: Y */
    public void m7559Y(View view, boolean z2) {
        AccessibilityManager accessibilityManager;
        if (m7555S()) {
            return;
        }
        if (this.f7053d && (accessibilityManager = this.f7051b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7062m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m7553Z(view, 1);
        int i3 = this.f7059j + this.f7061l;
        if (z2) {
            m7547N(view, i3, this.f7056g, this.f7058i);
        } else {
            this.f7050a.mo7575e(view, i3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: p */
    public boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
        m7548O(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        m7551T(view, i3);
        this.f7059j = this.f7050a.mo7571a(view, marginLayoutParams);
        this.f7055f = AbstractC0528h.m1910f(view.getContext(), f7047o, 225);
        this.f7056g = AbstractC0528h.m1910f(view.getContext(), f7048p, 175);
        Context context = view.getContext();
        int i4 = f7049q;
        this.f7057h = AbstractC0528h.m1911g(context, i4, AbstractC0176a.f1128d);
        this.f7058i = AbstractC0528h.m1911g(view.getContext(), i4, AbstractC0176a.f1127c);
        return super.mo4151p(coordinatorLayout, view, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: x */
    public void mo4159x(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        if (i4 > 0) {
            m7558X(view);
        } else if (i4 < 0) {
            m7556V(view);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7053d = true;
        this.f7054e = new LinkedHashSet();
        this.f7059j = 0;
        this.f7060k = 2;
        this.f7061l = 0;
        this.f7063n = false;
    }
}
