package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0702b;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p009D.AbstractC0091a;
import p016F0.AbstractC0148i;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p019G0.AbstractC0176a;
import p027J.AbstractC0268W;
import p030K.C0356y;
import p030K.InterfaceC0331B;
import p039N.C0435c;
import p058T0.C0527g;
import p058T0.InterfaceC0522b;
import p067W0.AbstractC0557c;
import p076Z0.C0637h;
import p076Z0.C0641l;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0953c implements InterfaceC0522b {

    /* JADX INFO: renamed from: a */
    private AbstractC1585c f7991a;

    /* JADX INFO: renamed from: b */
    private float f7992b;

    /* JADX INFO: renamed from: c */
    private C0637h f7993c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f7994d;

    /* JADX INFO: renamed from: e */
    private C0641l f7995e;

    /* JADX INFO: renamed from: f */
    private final C1582c f7996f;

    /* JADX INFO: renamed from: g */
    private float f7997g;

    /* JADX INFO: renamed from: h */
    private boolean f7998h;

    /* JADX INFO: renamed from: i */
    private int f7999i;

    /* JADX INFO: renamed from: j */
    private int f8000j;

    /* JADX INFO: renamed from: k */
    private C0435c f8001k;

    /* JADX INFO: renamed from: l */
    private boolean f8002l;

    /* JADX INFO: renamed from: m */
    private float f8003m;

    /* JADX INFO: renamed from: n */
    private int f8004n;

    /* JADX INFO: renamed from: o */
    private int f8005o;

    /* JADX INFO: renamed from: p */
    private int f8006p;

    /* JADX INFO: renamed from: q */
    private int f8007q;

    /* JADX INFO: renamed from: r */
    private WeakReference f8008r;

    /* JADX INFO: renamed from: s */
    private WeakReference f8009s;

    /* JADX INFO: renamed from: t */
    private int f8010t;

    /* JADX INFO: renamed from: u */
    private VelocityTracker f8011u;

    /* JADX INFO: renamed from: v */
    private C0527g f8012v;

    /* JADX INFO: renamed from: w */
    private int f8013w;

    /* JADX INFO: renamed from: x */
    private final Set f8014x;

    /* JADX INFO: renamed from: y */
    private final C0435c.c f8015y;

    /* JADX INFO: renamed from: z */
    private static final int f7990z = AbstractC0148i.f540D;

    /* JADX INFO: renamed from: A */
    private static final int f7989A = AbstractC0149j.f580m;

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    class C1580a extends C0435c.c {
        C1580a() {
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: a */
        public int mo1589a(View view, int i3, int i4) {
            return AbstractC0091a.m258b(i3, SideSheetBehavior.this.f7991a.mo8688g(), SideSheetBehavior.this.f7991a.mo8687f());
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: b */
        public int mo1590b(View view, int i3, int i4) {
            return view.getTop();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: d */
        public int mo1592d(View view) {
            return SideSheetBehavior.this.f8004n + SideSheetBehavior.this.m8671k0();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: j */
        public void mo1598j(int i3) {
            if (i3 == 1 && SideSheetBehavior.this.f7998h) {
                SideSheetBehavior.this.m8663G0(1);
            }
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: k */
        public void mo1599k(View view, int i3, int i4, int i5, int i6) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewM8667f0 = SideSheetBehavior.this.m8667f0();
            if (viewM8667f0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM8667f0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f7991a.mo8697p(marginLayoutParams, view.getLeft(), view.getRight());
                viewM8667f0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.m8645a0(view, i3);
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: l */
        public void mo1600l(View view, float f3, float f4) {
            int iM8641W = SideSheetBehavior.this.m8641W(view, f3, f4);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.m8626L0(view, iM8641W, sideSheetBehavior.m8665K0());
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: m */
        public boolean mo1601m(View view, int i3) {
            return (SideSheetBehavior.this.f7999i == 1 || SideSheetBehavior.this.f8008r == null || SideSheetBehavior.this.f8008r.get() != view) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    class C1581b extends AnimatorListenerAdapter {
        C1581b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.m8663G0(5);
            if (SideSheetBehavior.this.f8008r == null || SideSheetBehavior.this.f8008r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f8008r.get()).requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$c */
    class C1582c {

        /* JADX INFO: renamed from: a */
        private int f8019a;

        /* JADX INFO: renamed from: b */
        private boolean f8020b;

        /* JADX INFO: renamed from: c */
        private final Runnable f8021c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.C1582c.m8680a(this.f8025d);
            }
        };

        C1582c() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m8680a(C1582c c1582c) {
            c1582c.f8020b = false;
            if (SideSheetBehavior.this.f8001k != null && SideSheetBehavior.this.f8001k.m1583m(true)) {
                c1582c.m8681b(c1582c.f8019a);
            } else if (SideSheetBehavior.this.f7999i == 2) {
                SideSheetBehavior.this.m8663G0(c1582c.f8019a);
            }
        }

        /* JADX INFO: renamed from: b */
        void m8681b(int i3) {
            if (SideSheetBehavior.this.f8008r == null || SideSheetBehavior.this.f8008r.get() == null) {
                return;
            }
            this.f8019a = i3;
            if (this.f8020b) {
                return;
            }
            ((View) SideSheetBehavior.this.f8008r.get()).postOnAnimation(this.f8021c);
            this.f8020b = true;
        }
    }

    public SideSheetBehavior() {
        this.f7996f = new C1582c();
        this.f7998h = true;
        this.f7999i = 5;
        this.f8000j = 5;
        this.f8003m = 0.1f;
        this.f8010t = -1;
        this.f8014x = new LinkedHashSet();
        this.f8015y = new C1580a();
    }

    /* JADX INFO: renamed from: A0 */
    private void m8617A0(View view, Runnable runnable) {
        if (m8655v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: D0 */
    private void m8618D0(int i3) {
        AbstractC1585c abstractC1585c = this.f7991a;
        if (abstractC1585c == null || abstractC1585c.mo8691j() != i3) {
            if (i3 == 0) {
                this.f7991a = new C1584b(this);
                if (this.f7995e == null || m8652s0()) {
                    return;
                }
                C0641l.b bVarM2326w = this.f7995e.m2326w();
                bVarM2326w.m2349G(0.0f).m2362y(0.0f);
                m8632O0(bVarM2326w.m2351m());
                return;
            }
            if (i3 == 1) {
                this.f7991a = new C1583a(this);
                if (this.f7995e == null || m8651r0()) {
                    return;
                }
                C0641l.b bVarM2326w2 = this.f7995e.m2326w();
                bVarM2326w2.m2345C(0.0f).m2358u(0.0f);
                m8632O0(bVarM2326w2.m2351m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i3 + ". Must be 0 or 1.");
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m8619E0(View view, int i3) {
        m8618D0(Gravity.getAbsoluteGravity(((CoordinatorLayout.C0956f) view.getLayoutParams()).f4621c, i3) == 3 ? 1 : 0);
    }

    /* JADX INFO: renamed from: H0 */
    private boolean m8620H0() {
        if (this.f8001k != null) {
            return this.f7998h || this.f7999i == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ boolean m8621I(SideSheetBehavior sideSheetBehavior, int i3, View view, InterfaceC0331B.a aVar) {
        sideSheetBehavior.m8662F0(i3);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m8622J(SideSheetBehavior sideSheetBehavior, int i3) {
        View view = (View) sideSheetBehavior.f8008r.get();
        if (view != null) {
            sideSheetBehavior.m8626L0(view, i3, false);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m8623J0(View view) {
        return (view.isShown() || AbstractC0268W.m784n(view) != null) && this.f7998h;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m8624K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i3, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f7991a.mo8696o(marginLayoutParams, AbstractC0176a.m484c(i3, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public void m8626L0(View view, int i3, boolean z2) {
        if (!m8656w0(view, i3, z2)) {
            m8663G0(i3);
        } else {
            m8663G0(2);
            this.f7996f.m8681b(i3);
        }
    }

    /* JADX INFO: renamed from: M0 */
    private void m8628M0() {
        View view;
        WeakReference weakReference = this.f8008r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0268W.m763c0(view, 262144);
        AbstractC0268W.m763c0(view, 1048576);
        if (this.f7999i != 5) {
            m8658y0(view, C0356y.a.f1468y, 5);
        }
        if (this.f7999i != 3) {
            m8658y0(view, C0356y.a.f1466w, 3);
        }
    }

    /* JADX INFO: renamed from: N0 */
    private void m8630N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f8008r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f8008r.get();
        View viewM8667f0 = m8667f0();
        if (viewM8667f0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM8667f0.getLayoutParams()) == null) {
            return;
        }
        this.f7991a.mo8696o(marginLayoutParams, (int) ((this.f8004n * view.getScaleX()) + this.f8007q));
        viewM8667f0.requestLayout();
    }

    /* JADX INFO: renamed from: O0 */
    private void m8632O0(C0641l c0641l) {
        C0637h c0637h = this.f7993c;
        if (c0637h != null) {
            c0637h.setShapeAppearanceModel(c0641l);
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m8634P0(View view) {
        int i3 = this.f7999i == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
    }

    /* JADX INFO: renamed from: U */
    private int m8639U(int i3, View view) {
        int i4 = this.f7999i;
        if (i4 == 1 || i4 == 2) {
            return i3 - this.f7991a.mo8689h(view);
        }
        if (i4 == 3) {
            return 0;
        }
        if (i4 == 5) {
            return this.f7991a.mo8686e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f7999i);
    }

    /* JADX INFO: renamed from: V */
    private float m8640V(float f3, float f4) {
        return Math.abs(f3 - f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public int m8641W(View view, float f3, float f4) {
        if (m8654u0(f3)) {
            return 3;
        }
        if (m8664I0(view, f3)) {
            return (this.f7991a.mo8694m(f3, f4) || this.f7991a.mo8693l(view)) ? 5 : 3;
        }
        if (f3 != 0.0f && AbstractC1586d.m8698a(f3, f4)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - m8668g0()) < Math.abs(left - this.f7991a.mo8686e()) ? 3 : 5;
    }

    /* JADX INFO: renamed from: X */
    private void m8642X() {
        WeakReference weakReference = this.f8009s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8009s = null;
    }

    /* JADX INFO: renamed from: Y */
    private InterfaceC0331B m8643Y(final int i3) {
        return new InterfaceC0331B() { // from class: a1.a
            @Override // p030K.InterfaceC0331B
            /* JADX INFO: renamed from: a */
            public final boolean mo1175a(View view, InterfaceC0331B.a aVar) {
                return SideSheetBehavior.m8621I(this.f2346a, i3, view, aVar);
            }
        };
    }

    /* JADX INFO: renamed from: Z */
    private void m8644Z(Context context) {
        if (this.f7995e == null) {
            return;
        }
        C0637h c0637h = new C0637h(this.f7995e);
        this.f7993c = c0637h;
        c0637h.m2266Q(context);
        ColorStateList colorStateList = this.f7994d;
        if (colorStateList != null) {
            this.f7993c.m2274c0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f7993c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m8645a0(View view, int i3) {
        if (this.f8014x.isEmpty()) {
            return;
        }
        this.f7991a.mo8683b(i3);
        Iterator it = this.f8014x.iterator();
        if (it.hasNext()) {
            AbstractC0740E.m2693a(it.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m8646b0(View view) {
        if (AbstractC0268W.m784n(view) == null) {
            AbstractC0268W.m779k0(view, view.getResources().getString(f7990z));
        }
    }

    /* JADX INFO: renamed from: c0 */
    private int m8647c0(int i3, int i4, int i5, int i6) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, i4, i6);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
        }
        if (size != 0) {
            i5 = Math.min(size, i5);
        }
        return View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: e0 */
    private ValueAnimator.AnimatorUpdateListener m8648e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewM8667f0 = m8667f0();
        if (viewM8667f0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM8667f0.getLayoutParams()) == null) {
            return null;
        }
        final int iMo8684c = this.f7991a.mo8684c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: a1.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.m8624K(this.f2350a, marginLayoutParams, iMo8684c, viewM8667f0, valueAnimator);
            }
        };
    }

    /* JADX INFO: renamed from: h0 */
    private int m8649h0() {
        AbstractC1585c abstractC1585c = this.f7991a;
        return (abstractC1585c == null || abstractC1585c.mo8691j() == 0) ? 5 : 3;
    }

    /* JADX INFO: renamed from: q0 */
    private CoordinatorLayout.C0956f m8650q0() {
        View view;
        WeakReference weakReference = this.f8008r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.C0956f)) {
            return null;
        }
        return (CoordinatorLayout.C0956f) view.getLayoutParams();
    }

    /* JADX INFO: renamed from: r0 */
    private boolean m8651r0() {
        CoordinatorLayout.C0956f c0956fM8650q0 = m8650q0();
        return c0956fM8650q0 != null && ((ViewGroup.MarginLayoutParams) c0956fM8650q0).leftMargin > 0;
    }

    /* JADX INFO: renamed from: s0 */
    private boolean m8652s0() {
        CoordinatorLayout.C0956f c0956fM8650q0 = m8650q0();
        return c0956fM8650q0 != null && ((ViewGroup.MarginLayoutParams) c0956fM8650q0).rightMargin > 0;
    }

    /* JADX INFO: renamed from: t0 */
    private boolean m8653t0(MotionEvent motionEvent) {
        return m8620H0() && m8640V((float) this.f8013w, motionEvent.getX()) > ((float) this.f8001k.m1588z());
    }

    /* JADX INFO: renamed from: u0 */
    private boolean m8654u0(float f3) {
        return this.f7991a.mo8692k(f3);
    }

    /* JADX INFO: renamed from: v0 */
    private boolean m8655v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: w0 */
    private boolean m8656w0(View view, int i3, boolean z2) {
        int iM8672l0 = m8672l0(i3);
        C0435c c0435cM8676p0 = m8676p0();
        if (c0435cM8676p0 != null) {
            return z2 ? c0435cM8676p0.m1575O(iM8672l0, view.getTop()) : c0435cM8676p0.m1577Q(view, iM8672l0, view.getTop());
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    private void m8657x0(CoordinatorLayout coordinatorLayout) {
        int i3;
        View viewFindViewById;
        if (this.f8009s != null || (i3 = this.f8010t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i3)) == null) {
            return;
        }
        this.f8009s = new WeakReference(viewFindViewById);
    }

    /* JADX INFO: renamed from: y0 */
    private void m8658y0(View view, C0356y.a aVar, int i3) {
        AbstractC0268W.m767e0(view, aVar, null, m8643Y(i3));
    }

    /* JADX INFO: renamed from: z0 */
    private void m8659z0() {
        VelocityTracker velocityTracker = this.f8011u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8011u = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: B */
    public void mo4133B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.m4418a() != null) {
            super.mo4133B(coordinatorLayout, view, savedState.m4418a());
        }
        int i3 = savedState.f8016f;
        if (i3 == 1 || i3 == 2) {
            i3 = 5;
        }
        this.f7999i = i3;
        this.f8000j = i3;
    }

    /* JADX INFO: renamed from: B0 */
    public void m8660B0(int i3) {
        this.f8010t = i3;
        m8642X();
        WeakReference weakReference = this.f8008r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i3 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: C */
    public Parcelable mo4134C(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.mo4134C(coordinatorLayout, view), this);
    }

    /* JADX INFO: renamed from: C0 */
    public void m8661C0(boolean z2) {
        this.f7998h = z2;
    }

    /* JADX INFO: renamed from: F0 */
    public void m8662F0(final int i3) {
        if (i3 == 1 || i3 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f8008r;
        if (weakReference == null || weakReference.get() == null) {
            m8663G0(i3);
        } else {
            m8617A0((View) this.f8008r.get(), new Runnable() { // from class: a1.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.m8622J(this.f2348d, i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G0 */
    void m8663G0(int i3) {
        View view;
        if (this.f7999i == i3) {
            return;
        }
        this.f7999i = i3;
        if (i3 == 3 || i3 == 5) {
            this.f8000j = i3;
        }
        WeakReference weakReference = this.f8008r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        m8634P0(view);
        Iterator it = this.f8014x.iterator();
        if (it.hasNext()) {
            AbstractC0740E.m2693a(it.next());
            throw null;
        }
        m8628M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: H */
    public boolean mo4139H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7999i == 1 && actionMasked == 0) {
            return true;
        }
        if (m8620H0()) {
            this.f8001k.m1570F(motionEvent);
        }
        if (actionMasked == 0) {
            m8659z0();
        }
        if (this.f8011u == null) {
            this.f8011u = VelocityTracker.obtain();
        }
        this.f8011u.addMovement(motionEvent);
        if (m8620H0() && actionMasked == 2 && !this.f8002l && m8653t0(motionEvent)) {
            this.f8001k.m1580b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f8002l;
    }

    /* JADX INFO: renamed from: I0 */
    boolean m8664I0(View view, float f3) {
        return this.f7991a.mo8695n(view, f3);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m8665K0() {
        return true;
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: a */
    public void mo1877a() {
        C0527g c0527g = this.f8012v;
        if (c0527g == null) {
            return;
        }
        C0702b c0702bM1874c = c0527g.m1874c();
        if (c0702bM1874c == null || Build.VERSION.SDK_INT < 34) {
            m8662F0(5);
        } else {
            this.f8012v.m1901h(c0702bM1874c, m8649h0(), new C1581b(), m8648e0());
        }
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: b */
    public void mo1878b(C0702b c0702b) {
        C0527g c0527g = this.f8012v;
        if (c0527g == null) {
            return;
        }
        c0527g.m1902j(c0702b);
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: c */
    public void mo1879c(C0702b c0702b) {
        C0527g c0527g = this.f8012v;
        if (c0527g == null) {
            return;
        }
        c0527g.m1904l(c0702b, m8649h0());
        m8630N0();
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: d */
    public void mo1880d() {
        C0527g c0527g = this.f8012v;
        if (c0527g == null) {
            return;
        }
        c0527g.m1900f();
    }

    /* JADX INFO: renamed from: d0 */
    int m8666d0() {
        return this.f8004n;
    }

    /* JADX INFO: renamed from: f0 */
    public View m8667f0() {
        WeakReference weakReference = this.f8009s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public int m8668g0() {
        return this.f7991a.mo8685d();
    }

    /* JADX INFO: renamed from: i0 */
    public float m8669i0() {
        return this.f8003m;
    }

    /* JADX INFO: renamed from: j0 */
    float m8670j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: k */
    public void mo4146k(CoordinatorLayout.C0956f c0956f) {
        super.mo4146k(c0956f);
        this.f8008r = null;
        this.f8001k = null;
        this.f8012v = null;
    }

    /* JADX INFO: renamed from: k0 */
    int m8671k0() {
        return this.f8007q;
    }

    /* JADX INFO: renamed from: l0 */
    int m8672l0(int i3) {
        if (i3 == 3) {
            return m8668g0();
        }
        if (i3 == 5) {
            return this.f7991a.mo8686e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i3);
    }

    /* JADX INFO: renamed from: m0 */
    int m8673m0() {
        return this.f8006p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: n */
    public void mo4149n() {
        super.mo4149n();
        this.f8008r = null;
        this.f8001k = null;
        this.f8012v = null;
    }

    /* JADX INFO: renamed from: n0 */
    int m8674n0() {
        return this.f8005o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: o */
    public boolean mo4150o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0435c c0435c;
        if (!m8623J0(view)) {
            this.f8002l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m8659z0();
        }
        if (this.f8011u == null) {
            this.f8011u = VelocityTracker.obtain();
        }
        this.f8011u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f8013w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f8002l) {
            this.f8002l = false;
            return false;
        }
        return (this.f8002l || (c0435c = this.f8001k) == null || !c0435c.m1576P(motionEvent)) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    int m8675o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: p */
    public boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f8008r == null) {
            this.f8008r = new WeakReference(view);
            this.f8012v = new C0527g(view);
            C0637h c0637h = this.f7993c;
            if (c0637h != null) {
                view.setBackground(c0637h);
                C0637h c0637h2 = this.f7993c;
                float elevation = this.f7997g;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c0637h2.m2273b0(elevation);
            } else {
                ColorStateList colorStateList = this.f7994d;
                if (colorStateList != null) {
                    AbstractC0268W.m783m0(view, colorStateList);
                }
            }
            m8634P0(view);
            m8628M0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            m8646b0(view);
        }
        m8619E0(view, i3);
        if (this.f8001k == null) {
            this.f8001k = C0435c.m1559o(coordinatorLayout, this.f8015y);
        }
        int iMo8689h = this.f7991a.mo8689h(view);
        coordinatorLayout.m4111I(view, i3);
        this.f8005o = coordinatorLayout.getWidth();
        this.f8006p = this.f7991a.mo8690i(coordinatorLayout);
        this.f8004n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f8007q = marginLayoutParams != null ? this.f7991a.mo8682a(marginLayoutParams) : 0;
        AbstractC0268W.m750S(view, m8639U(iMo8689h, view));
        m8657x0(coordinatorLayout);
        Iterator it = this.f8014x.iterator();
        while (it.hasNext()) {
            AbstractC0740E.m2693a(it.next());
        }
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    C0435c m8676p0() {
        return this.f8001k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: q */
    public boolean mo4152q(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m8647c0(i3, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, -1, marginLayoutParams.width), m8647c0(i5, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, -1, marginLayoutParams.height));
        return true;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1579a();

        /* JADX INFO: renamed from: f */
        final int f8016f;

        /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$a */
        class C1579a implements Parcelable.ClassLoaderCreator {
            C1579a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f8016f = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f8016f);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f8016f = sideSheetBehavior.f7999i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7996f = new C1582c();
        this.f7998h = true;
        this.f7999i = 5;
        this.f8000j = 5;
        this.f8003m = 0.1f;
        this.f8010t = -1;
        this.f8014x = new LinkedHashSet();
        this.f8015y = new C1580a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f975o6);
        int i3 = AbstractC0150k.f994q6;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f7994d = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, i3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC0150k.f1021t6)) {
            this.f7995e = C0641l.m2308e(context, attributeSet, 0, f7989A).m2351m();
        }
        int i4 = AbstractC0150k.f1012s6;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            m8660B0(typedArrayObtainStyledAttributes.getResourceId(i4, -1));
        }
        m8644Z(context);
        this.f7997g = typedArrayObtainStyledAttributes.getDimension(AbstractC0150k.f985p6, -1.0f);
        m8661C0(typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f1003r6, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f7992b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
