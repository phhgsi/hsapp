package com.google.android.material.bottomsheet;

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
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.C0702b;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.AbstractC1549t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p009D.AbstractC0091a;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0148i;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p027J.AbstractC0268W;
import p030K.C0356y;
import p030K.InterfaceC0331B;
import p039N.C0435c;
import p058T0.C0526f;
import p058T0.InterfaceC0522b;
import p067W0.AbstractC0557c;
import p076Z0.C0637h;
import p076Z0.C0641l;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0953c implements InterfaceC0522b {

    /* JADX INFO: renamed from: l0 */
    private static final int f7098l0 = AbstractC0149j.f574g;

    /* JADX INFO: renamed from: A */
    private boolean f7099A;

    /* JADX INFO: renamed from: B */
    private final C1460g f7100B;

    /* JADX INFO: renamed from: C */
    private ValueAnimator f7101C;

    /* JADX INFO: renamed from: D */
    int f7102D;

    /* JADX INFO: renamed from: E */
    int f7103E;

    /* JADX INFO: renamed from: F */
    int f7104F;

    /* JADX INFO: renamed from: G */
    float f7105G;

    /* JADX INFO: renamed from: H */
    int f7106H;

    /* JADX INFO: renamed from: I */
    float f7107I;

    /* JADX INFO: renamed from: J */
    boolean f7108J;

    /* JADX INFO: renamed from: K */
    private boolean f7109K;

    /* JADX INFO: renamed from: L */
    private boolean f7110L;

    /* JADX INFO: renamed from: M */
    private boolean f7111M;

    /* JADX INFO: renamed from: N */
    private boolean f7112N;

    /* JADX INFO: renamed from: O */
    int f7113O;

    /* JADX INFO: renamed from: P */
    int f7114P;

    /* JADX INFO: renamed from: Q */
    C0435c f7115Q;

    /* JADX INFO: renamed from: R */
    private boolean f7116R;

    /* JADX INFO: renamed from: S */
    private int f7117S;

    /* JADX INFO: renamed from: T */
    private boolean f7118T;

    /* JADX INFO: renamed from: U */
    private float f7119U;

    /* JADX INFO: renamed from: V */
    private int f7120V;

    /* JADX INFO: renamed from: W */
    int f7121W;

    /* JADX INFO: renamed from: X */
    int f7122X;

    /* JADX INFO: renamed from: Y */
    WeakReference f7123Y;

    /* JADX INFO: renamed from: Z */
    WeakReference f7124Z;

    /* JADX INFO: renamed from: a */
    private int f7125a;

    /* JADX INFO: renamed from: a0 */
    WeakReference f7126a0;

    /* JADX INFO: renamed from: b */
    private boolean f7127b;

    /* JADX INFO: renamed from: b0 */
    WeakReference f7128b0;

    /* JADX INFO: renamed from: c */
    private boolean f7129c;

    /* JADX INFO: renamed from: c0 */
    private final ArrayList f7130c0;

    /* JADX INFO: renamed from: d */
    private float f7131d;

    /* JADX INFO: renamed from: d0 */
    private VelocityTracker f7132d0;

    /* JADX INFO: renamed from: e */
    private int f7133e;

    /* JADX INFO: renamed from: e0 */
    C0526f f7134e0;

    /* JADX INFO: renamed from: f */
    private int f7135f;

    /* JADX INFO: renamed from: f0 */
    int f7136f0;

    /* JADX INFO: renamed from: g */
    private boolean f7137g;

    /* JADX INFO: renamed from: g0 */
    private int f7138g0;

    /* JADX INFO: renamed from: h */
    private int f7139h;

    /* JADX INFO: renamed from: h0 */
    boolean f7140h0;

    /* JADX INFO: renamed from: i */
    private int f7141i;

    /* JADX INFO: renamed from: i0 */
    private Map f7142i0;

    /* JADX INFO: renamed from: j */
    private C0637h f7143j;

    /* JADX INFO: renamed from: j0 */
    final SparseIntArray f7144j0;

    /* JADX INFO: renamed from: k */
    private ColorStateList f7145k;

    /* JADX INFO: renamed from: k0 */
    private final C0435c.c f7146k0;

    /* JADX INFO: renamed from: l */
    private int f7147l;

    /* JADX INFO: renamed from: m */
    private int f7148m;

    /* JADX INFO: renamed from: n */
    private int f7149n;

    /* JADX INFO: renamed from: o */
    private boolean f7150o;

    /* JADX INFO: renamed from: p */
    private boolean f7151p;

    /* JADX INFO: renamed from: q */
    private boolean f7152q;

    /* JADX INFO: renamed from: r */
    private boolean f7153r;

    /* JADX INFO: renamed from: s */
    private boolean f7154s;

    /* JADX INFO: renamed from: t */
    private boolean f7155t;

    /* JADX INFO: renamed from: u */
    private boolean f7156u;

    /* JADX INFO: renamed from: v */
    private boolean f7157v;

    /* JADX INFO: renamed from: w */
    private int f7158w;

    /* JADX INFO: renamed from: x */
    private int f7159x;

    /* JADX INFO: renamed from: y */
    private boolean f7160y;

    /* JADX INFO: renamed from: z */
    private C0641l f7161z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class RunnableC1454a implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ View f7167d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f7168e;

        RunnableC1454a(View view, int i3) {
            this.f7167d = view;
            this.f7168e = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m7618c1(this.f7167d, this.f7168e, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C1455b extends AnimatorListenerAdapter {
        C1455b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.m7655V0(5);
            WeakReference weakReference = BottomSheetBehavior.this.f7123Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.f7123Y.get()).requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C1456c implements ValueAnimator.AnimatorUpdateListener {
        C1456c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f7143j != null) {
                BottomSheetBehavior.this.f7143j.m2275d0(fFloatValue);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C1457d implements AbstractC1549t.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f7172a;

        C1457d(boolean z2) {
            this.f7172a = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.AbstractC1549t.c
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p027J.C0318w0 mo7586a(android.view.View r11, p027J.C0318w0 r12, com.google.android.material.internal.AbstractC1549t.d r13) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C1457d.mo7586a(android.view.View, J.w0, com.google.android.material.internal.t$d):J.w0");
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    class C1458e extends C0435c.c {

        /* JADX INFO: renamed from: a */
        private long f7174a;

        C1458e() {
        }

        /* JADX INFO: renamed from: n */
        private boolean m7670n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f7122X + bottomSheetBehavior.m7662q0()) / 2;
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: a */
        public int mo1589a(View view, int i3, int i4) {
            return view.getLeft();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: b */
        public int mo1590b(View view, int i3, int i4) {
            return AbstractC0091a.m258b(i3, BottomSheetBehavior.this.m7662q0(), mo1593e(view));
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: e */
        public int mo1593e(View view) {
            return BottomSheetBehavior.this.m7629i0() ? BottomSheetBehavior.this.f7122X : BottomSheetBehavior.this.f7106H;
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: j */
        public void mo1598j(int i3) {
            if (i3 == 1 && BottomSheetBehavior.this.f7110L) {
                BottomSheetBehavior.this.m7655V0(1);
            }
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: k */
        public void mo1599k(View view, int i3, int i4, int i5, int i6) {
            BottomSheetBehavior.this.m7660n0(i4);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo1600l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C1458e.mo1600l(android.view.View, float, float):void");
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: m */
        public boolean mo1601m(View view, int i3) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i4 = bottomSheetBehavior.f7113O;
            if (i4 == 1 || bottomSheetBehavior.f7140h0) {
                return false;
            }
            if (i4 == 3 && bottomSheetBehavior.f7136f0 == i3) {
                WeakReference weakReference = bottomSheetBehavior.f7128b0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f7174a = SystemClock.uptimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f7123Y;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    class C1459f implements InterfaceC0331B {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f7176a;

        C1459f(int i3) {
            this.f7176a = i3;
        }

        @Override // p030K.InterfaceC0331B
        /* JADX INFO: renamed from: a */
        public boolean mo1175a(View view, InterfaceC0331B.a aVar) {
            BottomSheetBehavior.this.m7654U0(this.f7176a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f7125a = 0;
        this.f7127b = true;
        this.f7129c = false;
        this.f7147l = -1;
        this.f7148m = -1;
        this.f7100B = new C1460g(this, null);
        this.f7105G = 0.5f;
        this.f7107I = -1.0f;
        this.f7110L = true;
        this.f7111M = true;
        this.f7113O = 4;
        this.f7114P = 4;
        this.f7119U = 0.1f;
        this.f7130c0 = new ArrayList();
        this.f7138g0 = -1;
        this.f7144j0 = new SparseIntArray();
        this.f7146k0 = new C1458e();
    }

    /* JADX INFO: renamed from: A0 */
    private boolean m7589A0(CoordinatorLayout coordinatorLayout, int i3, int i4) {
        WeakReference weakReference = this.f7126a0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.m4108B(view, i3, i4);
    }

    /* JADX INFO: renamed from: B0 */
    private boolean m7590B0(CoordinatorLayout coordinatorLayout, int i3, int i4) {
        WeakReference weakReference = this.f7128b0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.m4108B(view, i3, i4);
    }

    /* JADX INFO: renamed from: C0 */
    private void m7591C0(View view, C0356y.a aVar, int i3) {
        AbstractC0268W.m767e0(view, aVar, null, m7631k0(i3));
    }

    /* JADX INFO: renamed from: D0 */
    private void m7592D0() {
        this.f7136f0 = -1;
        this.f7138g0 = -1;
        VelocityTracker velocityTracker = this.f7132d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7132d0 = null;
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m7593E0(SavedState savedState) {
        int i3 = this.f7125a;
        if (i3 == 0) {
            return;
        }
        if (i3 == -1 || (i3 & 1) == 1) {
            this.f7135f = savedState.f7163g;
        }
        if (i3 == -1 || (i3 & 2) == 2) {
            this.f7127b = savedState.f7164h;
        }
        if (i3 == -1 || (i3 & 4) == 4) {
            this.f7108J = savedState.f7165i;
        }
        if (i3 == -1 || (i3 & 8) == 8) {
            this.f7109K = savedState.f7166j;
        }
    }

    /* JADX INFO: renamed from: F0 */
    private void m7594F0(View view, Runnable runnable) {
        if (m7639y0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: W0 */
    private void m7610W0(View view) {
        boolean z2 = (Build.VERSION.SDK_INT < 29 || m7663v0() || this.f7137g) ? false : true;
        if (this.f7151p || this.f7152q || this.f7153r || this.f7155t || this.f7156u || this.f7157v || z2) {
            AbstractC1549t.m8497b(view, new C1457d(z2));
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private boolean m7613Y0() {
        if (this.f7115Q != null) {
            return this.f7110L || this.f7113O == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    private int m7616b0(View view, int i3, int i4) {
        return AbstractC0268W.m762c(view, view.getResources().getString(i3), m7631k0(i4));
    }

    /* JADX INFO: renamed from: c0 */
    private void m7617c0() {
        int iM7625g0 = m7625g0();
        if (this.f7127b) {
            this.f7106H = Math.max(this.f7122X - iM7625g0, this.f7103E);
        } else {
            this.f7106H = this.f7122X - iM7625g0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public void m7618c1(View view, int i3, boolean z2) {
        int iM7635r0 = m7635r0(i3);
        C0435c c0435c = this.f7115Q;
        if (c0435c == null || (!z2 ? c0435c.m1577Q(view, view.getLeft(), iM7635r0) : c0435c.m1575O(view.getLeft(), iM7635r0))) {
            m7655V0(i3);
            return;
        }
        m7655V0(2);
        m7624f1(i3, true);
        this.f7100B.m7673c(i3);
    }

    /* JADX INFO: renamed from: d0 */
    private float m7619d0(float f3, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f3 > 0.0f) {
                return radius / f3;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d1 */
    private void m7620d1() {
        WeakReference weakReference = this.f7123Y;
        if (weakReference != null) {
            m7622e1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f7124Z;
        if (weakReference2 != null) {
            m7622e1((View) weakReference2.get(), 1);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m7621e0() {
        this.f7104F = (int) (this.f7122X * (1.0f - this.f7105G));
    }

    /* JADX INFO: renamed from: e1 */
    private void m7622e1(View view, int i3) {
        if (view == null) {
            return;
        }
        m7630j0(view, i3);
        if (!this.f7127b && this.f7113O != 6) {
            this.f7144j0.put(i3, m7616b0(view, AbstractC0148i.f541a, 6));
        }
        if (this.f7108J && m7665x0() && this.f7113O != 5) {
            m7591C0(view, C0356y.a.f1468y, 5);
        }
        int i4 = this.f7113O;
        if (i4 == 3) {
            m7591C0(view, C0356y.a.f1467x, this.f7127b ? 4 : 6);
            return;
        }
        if (i4 == 4) {
            m7591C0(view, C0356y.a.f1466w, this.f7127b ? 3 : 6);
        } else {
            if (i4 != 6) {
                return;
            }
            m7591C0(view, C0356y.a.f1467x, 4);
            m7591C0(view, C0356y.a.f1466w, 3);
        }
    }

    /* JADX INFO: renamed from: f0 */
    private float m7623f0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f7143j == null || (weakReference = this.f7123Y) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f7123Y.get();
        if (!m7637t0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(m7619d0(this.f7143j.m2262J(), rootWindowInsets.getRoundedCorner(0)), m7619d0(this.f7143j.m2263K(), rootWindowInsets.getRoundedCorner(1)));
    }

    /* JADX INFO: renamed from: f1 */
    private void m7624f1(int i3, boolean z2) {
        boolean zM7638u0;
        ValueAnimator valueAnimator;
        if (i3 == 2 || this.f7099A == (zM7638u0 = m7638u0()) || this.f7143j == null) {
            return;
        }
        this.f7099A = zM7638u0;
        if (!z2 || (valueAnimator = this.f7101C) == null) {
            ValueAnimator valueAnimator2 = this.f7101C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f7101C.cancel();
            }
            this.f7143j.m2275d0(this.f7099A ? m7623f0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f7101C.reverse();
        } else {
            this.f7101C.setFloatValues(this.f7143j.m2256C(), zM7638u0 ? m7623f0() : 1.0f);
            this.f7101C.start();
        }
    }

    /* JADX INFO: renamed from: g0 */
    private int m7625g0() {
        int i3;
        return this.f7137g ? Math.min(Math.max(this.f7139h, this.f7122X - ((this.f7121W * 9) / 16)), this.f7120V) + this.f7158w : (this.f7150o || this.f7151p || (i3 = this.f7149n) <= 0) ? this.f7135f + this.f7158w : Math.max(this.f7135f, i3 + this.f7141i);
    }

    /* JADX INFO: renamed from: g1 */
    private void m7626g1(boolean z2) {
        Map map;
        WeakReference weakReference = this.f7123Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f7142i0 != null) {
                    return;
                } else {
                    this.f7142i0 = new HashMap(childCount);
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                if (childAt != this.f7123Y.get()) {
                    if (z2) {
                        this.f7142i0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f7129c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f7129c && (map = this.f7142i0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f7142i0.get(childAt)).intValue());
                    }
                }
            }
            if (!z2) {
                this.f7142i0 = null;
            } else if (this.f7129c) {
                ((View) this.f7123Y.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    private float m7627h0(int i3) {
        float f3;
        float fM7662q0;
        int i4 = this.f7106H;
        if (i3 > i4 || i4 == m7662q0()) {
            int i5 = this.f7106H;
            f3 = i5 - i3;
            fM7662q0 = this.f7122X - i5;
        } else {
            int i6 = this.f7106H;
            f3 = i6 - i3;
            fM7662q0 = i6 - m7662q0();
        }
        return f3 / fM7662q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public void m7628h1(boolean z2) {
        View view;
        if (this.f7123Y != null) {
            m7617c0();
            if (this.f7113O != 4 || (view = (View) this.f7123Y.get()) == null) {
                return;
            }
            if (z2) {
                m7654U0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public boolean m7629i0() {
        return m7664w0() && m7665x0();
    }

    /* JADX INFO: renamed from: j0 */
    private void m7630j0(View view, int i3) {
        if (view == null) {
            return;
        }
        AbstractC0268W.m763c0(view, 524288);
        AbstractC0268W.m763c0(view, 262144);
        AbstractC0268W.m763c0(view, 1048576);
        int i4 = this.f7144j0.get(i3, -1);
        if (i4 != -1) {
            AbstractC0268W.m763c0(view, i4);
            this.f7144j0.delete(i3);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private InterfaceC0331B m7631k0(int i3) {
        return new C1459f(i3);
    }

    /* JADX INFO: renamed from: l0 */
    private void m7632l0(Context context) {
        if (this.f7161z == null) {
            return;
        }
        C0637h c0637h = new C0637h(this.f7161z);
        this.f7143j = c0637h;
        c0637h.m2266Q(context);
        ColorStateList colorStateList = this.f7145k;
        if (colorStateList != null) {
            this.f7143j.m2274c0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f7143j.setTint(typedValue.data);
    }

    /* JADX INFO: renamed from: m0 */
    private void m7633m0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m7623f0(), 1.0f);
        this.f7101C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f7101C.addUpdateListener(new C1456c());
    }

    /* JADX INFO: renamed from: p0 */
    private int m7634p0(int i3, int i4, int i5, int i6) {
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

    /* JADX INFO: renamed from: r0 */
    private int m7635r0(int i3) {
        if (i3 == 3) {
            return m7662q0();
        }
        if (i3 == 4) {
            return this.f7106H;
        }
        if (i3 == 5) {
            return this.f7122X;
        }
        if (i3 == 6) {
            return this.f7104F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i3);
    }

    /* JADX INFO: renamed from: s0 */
    private float m7636s0() {
        VelocityTracker velocityTracker = this.f7132d0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f7131d);
        return this.f7132d0.getYVelocity(this.f7136f0);
    }

    /* JADX INFO: renamed from: t0 */
    private boolean m7637t0() {
        WeakReference weakReference = this.f7123Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f7123Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    private boolean m7638u0() {
        if (this.f7113O == 3) {
            return this.f7160y || m7637t0();
        }
        return false;
    }

    /* JADX INFO: renamed from: y0 */
    private boolean m7639y0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: B */
    public void mo4133B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo4133B(coordinatorLayout, view, savedState.m4418a());
        m7593E0(savedState);
        int i3 = savedState.f7162f;
        if (i3 == 1 || i3 == 2) {
            this.f7113O = 4;
            this.f7114P = 4;
        } else {
            this.f7113O = i3;
            this.f7114P = i3;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: C */
    public Parcelable mo4134C(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.mo4134C(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: E */
    public boolean mo4136E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
        this.f7117S = 0;
        this.f7118T = false;
        return (i3 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4138G(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m7662q0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.m7655V0(r0)
            return
        Lf:
            boolean r3 = r2.m7666z0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f7128b0
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f7118T
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f7117S
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f7127b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f7104F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f7108J
            if (r3 == 0) goto L49
            float r3 = r2.m7636s0()
            boolean r3 = r2.m7657Z0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f7117S
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f7127b
            if (r1 == 0) goto L68
            int r5 = r2.f7103E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f7106H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f7104F
            if (r3 >= r1) goto L7e
            int r1 = r2.f7106H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.m7658a1()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f7106H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f7127b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f7104F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f7106H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.m7618c1(r4, r0, r3)
            r2.f7118T = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo4138G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* JADX INFO: renamed from: G0 */
    public void m7640G0(boolean z2) {
        this.f7110L = z2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: H */
    public boolean mo4139H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7113O == 1 && actionMasked == 0) {
            return true;
        }
        if (m7613Y0()) {
            this.f7115Q.m1570F(motionEvent);
        }
        if (actionMasked == 0) {
            m7592D0();
        }
        if (this.f7132d0 == null) {
            this.f7132d0 = VelocityTracker.obtain();
        }
        this.f7132d0.addMovement(motionEvent);
        if (m7613Y0() && actionMasked == 2 && !this.f7116R && Math.abs(this.f7138g0 - motionEvent.getY()) > this.f7115Q.m1588z()) {
            this.f7115Q.m1580b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f7116R;
    }

    /* JADX INFO: renamed from: H0 */
    public void m7641H0(boolean z2) {
        this.f7111M = z2;
    }

    /* JADX INFO: renamed from: I0 */
    public void m7642I0(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f7102D = i3;
        m7624f1(this.f7113O, true);
    }

    /* JADX INFO: renamed from: J0 */
    public void m7643J0(boolean z2) {
        if (this.f7127b == z2) {
            return;
        }
        this.f7127b = z2;
        if (this.f7123Y != null) {
            m7617c0();
        }
        m7655V0((this.f7127b && this.f7113O == 6) ? 3 : this.f7113O);
        m7624f1(this.f7113O, true);
        m7620d1();
    }

    /* JADX INFO: renamed from: K0 */
    public void m7644K0(boolean z2) {
        this.f7150o = z2;
    }

    /* JADX INFO: renamed from: L0 */
    public void m7645L0(float f3) {
        if (f3 <= 0.0f || f3 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f7105G = f3;
        if (this.f7123Y != null) {
            m7621e0();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m7646M0(boolean z2) {
        if (this.f7108J != z2) {
            this.f7108J = z2;
            if (!z2 && this.f7113O == 5) {
                m7654U0(4);
            }
            m7620d1();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m7647N0(int i3) {
        this.f7148m = i3;
    }

    /* JADX INFO: renamed from: O0 */
    public void m7648O0(int i3) {
        this.f7147l = i3;
    }

    /* JADX INFO: renamed from: P0 */
    public void m7649P0(int i3) {
        m7650Q0(i3, false);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m7650Q0(int i3, boolean z2) {
        if (i3 == -1) {
            if (this.f7137g) {
                return;
            } else {
                this.f7137g = true;
            }
        } else {
            if (!this.f7137g && this.f7135f == i3) {
                return;
            }
            this.f7137g = false;
            this.f7135f = Math.max(0, i3);
        }
        m7628h1(z2);
    }

    /* JADX INFO: renamed from: R0 */
    public void m7651R0(int i3) {
        this.f7125a = i3;
    }

    /* JADX INFO: renamed from: S0 */
    public void m7652S0(int i3) {
        this.f7133e = i3;
    }

    /* JADX INFO: renamed from: T0 */
    public void m7653T0(boolean z2) {
        this.f7109K = z2;
    }

    /* JADX INFO: renamed from: U0 */
    public void m7654U0(int i3) {
        if (i3 == 1 || i3 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f7108J && i3 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i3);
            return;
        }
        int i4 = (i3 == 6 && this.f7127b && m7635r0(i3) <= this.f7103E) ? 3 : i3;
        WeakReference weakReference = this.f7123Y;
        if (weakReference == null || weakReference.get() == null) {
            m7655V0(i3);
        } else {
            View view = (View) this.f7123Y.get();
            m7594F0(view, new RunnableC1454a(view, i4));
        }
    }

    /* JADX INFO: renamed from: V0 */
    void m7655V0(int i3) {
        if (this.f7113O == i3) {
            return;
        }
        this.f7113O = i3;
        if (i3 == 4 || i3 == 3 || i3 == 6 || (this.f7108J && i3 == 5)) {
            this.f7114P = i3;
        }
        WeakReference weakReference = this.f7123Y;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i3 == 3) {
            m7626g1(true);
        } else if (i3 == 6 || i3 == 5 || i3 == 4) {
            m7626g1(false);
        }
        m7624f1(i3, true);
        if (this.f7130c0.size() <= 0) {
            m7620d1();
        } else {
            AbstractC0740E.m2693a(this.f7130c0.get(0));
            throw null;
        }
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m7656X0(long j3, float f3) {
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    boolean m7657Z0(View view, float f3) {
        if (this.f7109K) {
            return true;
        }
        if (m7665x0() && view.getTop() >= this.f7106H) {
            return Math.abs((((float) view.getTop()) + (f3 * this.f7119U)) - ((float) this.f7106H)) / ((float) m7625g0()) > 0.5f;
        }
        return false;
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: a */
    public void mo1877a() {
        C0526f c0526f = this.f7134e0;
        if (c0526f == null) {
            return;
        }
        C0702b c0702bM1874c = c0526f.m1874c();
        if (c0702bM1874c == null || Build.VERSION.SDK_INT < 34) {
            m7654U0(this.f7108J ? 5 : 4);
        } else if (this.f7108J) {
            this.f7134e0.m1893h(c0702bM1874c, new C1455b());
        } else {
            this.f7134e0.m1894i(c0702bM1874c, null);
            m7654U0(4);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m7658a1() {
        return false;
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: b */
    public void mo1878b(C0702b c0702b) {
        C0526f c0526f = this.f7134e0;
        if (c0526f == null) {
            return;
        }
        c0526f.m1895j(c0702b);
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m7659b1() {
        return true;
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: c */
    public void mo1879c(C0702b c0702b) {
        C0526f c0526f = this.f7134e0;
        if (c0526f == null) {
            return;
        }
        c0526f.m1897l(c0702b);
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: d */
    public void mo1880d() {
        C0526f c0526f = this.f7134e0;
        if (c0526f == null) {
            return;
        }
        c0526f.m1892f();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: k */
    public void mo4146k(CoordinatorLayout.C0956f c0956f) {
        super.mo4146k(c0956f);
        this.f7123Y = null;
        this.f7115Q = null;
        this.f7134e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: n */
    public void mo4149n() {
        super.mo4149n();
        this.f7123Y = null;
        this.f7115Q = null;
        this.f7134e0 = null;
    }

    /* JADX INFO: renamed from: n0 */
    void m7660n0(int i3) {
        if (((View) this.f7123Y.get()) == null || this.f7130c0.isEmpty()) {
            return;
        }
        m7627h0(i3);
        if (this.f7130c0.size() <= 0) {
            return;
        }
        AbstractC0740E.m2693a(this.f7130c0.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: o */
    public boolean mo4150o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i3;
        C0435c c0435c;
        if (!view.isShown() || !this.f7110L) {
            this.f7116R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m7592D0();
        }
        if (this.f7132d0 == null) {
            this.f7132d0 = VelocityTracker.obtain();
        }
        this.f7132d0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            this.f7138g0 = y2;
            if (this.f7113O != 2 && m7590B0(coordinatorLayout, x2, y2)) {
                this.f7136f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!m7589A0(coordinatorLayout, x2, this.f7138g0)) {
                    this.f7140h0 = true;
                }
            }
            this.f7116R = this.f7136f0 == -1 && !coordinatorLayout.m4108B(view, x2, this.f7138g0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7140h0 = false;
            this.f7136f0 = -1;
            if (this.f7116R) {
                this.f7116R = false;
                return false;
            }
        }
        if (!this.f7116R && (c0435c = this.f7115Q) != null && c0435c.m1576P(motionEvent)) {
            return true;
        }
        WeakReference weakReference = this.f7128b0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        return (actionMasked != 2 || view2 == null || this.f7116R || this.f7113O == 1 || coordinatorLayout.m4108B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f7115Q == null || (i3 = this.f7138g0) == -1 || Math.abs(((float) i3) - motionEvent.getY()) <= ((float) this.f7115Q.m1588z())) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    View m7661o0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View viewM7661o0 = m7661o0(viewGroup.getChildAt(i3));
                if (viewM7661o0 != null) {
                    return viewM7661o0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: p */
    public boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f7123Y == null) {
            this.f7139h = coordinatorLayout.getResources().getDimensionPixelSize(AbstractC0142c.f409i);
            m7610W0(view);
            AbstractC0268W.m807y0(view, new C1461a(view));
            this.f7123Y = new WeakReference(view);
            this.f7134e0 = new C0526f(view);
            C0637h c0637h = this.f7143j;
            if (c0637h != null) {
                view.setBackground(c0637h);
                C0637h c0637h2 = this.f7143j;
                float elevation = this.f7107I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c0637h2.m2273b0(elevation);
            } else {
                ColorStateList colorStateList = this.f7145k;
                if (colorStateList != null) {
                    AbstractC0268W.m783m0(view, colorStateList);
                }
            }
            m7620d1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f7115Q == null) {
            this.f7115Q = C0435c.m1559o(coordinatorLayout, this.f7146k0);
        }
        int top = view.getTop();
        coordinatorLayout.m4111I(view, i3);
        this.f7121W = coordinatorLayout.getWidth();
        this.f7122X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f7120V = height;
        int iMin = this.f7122X;
        int i4 = iMin - height;
        int i5 = this.f7159x;
        if (i4 < i5) {
            if (this.f7154s) {
                int i6 = this.f7148m;
                if (i6 != -1) {
                    iMin = Math.min(iMin, i6);
                }
                this.f7120V = iMin;
            } else {
                int iMin2 = iMin - i5;
                int i7 = this.f7148m;
                if (i7 != -1) {
                    iMin2 = Math.min(iMin2, i7);
                }
                this.f7120V = iMin2;
            }
        }
        this.f7103E = Math.max(0, this.f7122X - this.f7120V);
        m7621e0();
        m7617c0();
        int i8 = this.f7113O;
        if (i8 == 3) {
            AbstractC0268W.m751T(view, m7662q0());
        } else if (i8 == 6) {
            AbstractC0268W.m751T(view, this.f7104F);
        } else if (this.f7108J && i8 == 5) {
            AbstractC0268W.m751T(view, this.f7122X);
        } else if (i8 == 4) {
            AbstractC0268W.m751T(view, this.f7106H);
        } else if (i8 == 1 || i8 == 2) {
            AbstractC0268W.m751T(view, top - view.getTop());
        }
        m7624f1(this.f7113O, false);
        this.f7128b0 = new WeakReference(m7661o0(view));
        if (this.f7130c0.size() <= 0) {
            return true;
        }
        AbstractC0740E.m2693a(this.f7130c0.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: q */
    public boolean mo4152q(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m7634p0(i3, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f7147l, marginLayoutParams.width), m7634p0(i5, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, this.f7148m, marginLayoutParams.height));
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public int m7662q0() {
        if (this.f7127b) {
            return this.f7103E;
        }
        return Math.max(this.f7102D, this.f7154s ? 0 : this.f7159x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: s */
    public boolean mo4154s(CoordinatorLayout coordinatorLayout, View view, View view2, float f3, float f4) {
        WeakReference weakReference;
        return m7666z0() && (weakReference = this.f7128b0) != null && view2 == weakReference.get() && (!(this.f7113O == 3 || this.f7112N) || super.mo4154s(coordinatorLayout, view, view2, f3, f4));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: u */
    public void mo4156u(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
        if (i5 == 1) {
            return;
        }
        WeakReference weakReference = this.f7128b0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!m7666z0() || view2 == view3) {
            int top = view.getTop();
            int i6 = top - i4;
            if (i4 > 0) {
                if (!this.f7118T && !this.f7111M && view2 == view3 && view2.canScrollVertically(1)) {
                    this.f7112N = true;
                    return;
                }
                if (i6 < m7662q0()) {
                    int iM7662q0 = top - m7662q0();
                    iArr[1] = iM7662q0;
                    AbstractC0268W.m751T(view, -iM7662q0);
                    m7655V0(3);
                } else {
                    if (!this.f7110L) {
                        return;
                    }
                    iArr[1] = i4;
                    AbstractC0268W.m751T(view, -i4);
                    m7655V0(1);
                }
            } else if (i4 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.f7118T && !this.f7111M && view2 == view3 && zCanScrollVertically) {
                    this.f7112N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i6 > this.f7106H && !m7629i0()) {
                        int i7 = top - this.f7106H;
                        iArr[1] = i7;
                        AbstractC0268W.m751T(view, -i7);
                        m7655V0(4);
                    } else {
                        if (!this.f7110L) {
                            return;
                        }
                        iArr[1] = i4;
                        AbstractC0268W.m751T(view, -i4);
                        m7655V0(1);
                    }
                }
            }
            m7660n0(view.getTop());
            this.f7117S = i4;
            this.f7118T = true;
            this.f7112N = false;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m7663v0() {
        return this.f7150o;
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m7664w0() {
        return this.f7108J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: x */
    public void mo4159x(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m7665x0() {
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m7666z0() {
        return true;
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    private class C1460g {

        /* JADX INFO: renamed from: a */
        private int f7178a;

        /* JADX INFO: renamed from: b */
        private boolean f7179b;

        /* JADX INFO: renamed from: c */
        private final Runnable f7180c;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1460g.this.f7179b = false;
                C0435c c0435c = BottomSheetBehavior.this.f7115Q;
                if (c0435c != null && c0435c.m1583m(true)) {
                    C1460g c1460g = C1460g.this;
                    c1460g.m7673c(c1460g.f7178a);
                    return;
                }
                C1460g c1460g2 = C1460g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f7113O == 2) {
                    bottomSheetBehavior.m7655V0(c1460g2.f7178a);
                }
            }
        }

        private C1460g() {
            this.f7180c = new a();
        }

        /* JADX INFO: renamed from: c */
        void m7673c(int i3) {
            WeakReference weakReference = BottomSheetBehavior.this.f7123Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f7178a = i3;
            if (this.f7179b) {
                return;
            }
            ((View) BottomSheetBehavior.this.f7123Y.get()).postOnAnimation(this.f7180c);
            this.f7179b = true;
        }

        /* synthetic */ C1460g(BottomSheetBehavior bottomSheetBehavior, RunnableC1454a runnableC1454a) {
            this();
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1453a();

        /* JADX INFO: renamed from: f */
        final int f7162f;

        /* JADX INFO: renamed from: g */
        int f7163g;

        /* JADX INFO: renamed from: h */
        boolean f7164h;

        /* JADX INFO: renamed from: i */
        boolean f7165i;

        /* JADX INFO: renamed from: j */
        boolean f7166j;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        class C1453a implements Parcelable.ClassLoaderCreator {
            C1453a() {
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
            this.f7162f = parcel.readInt();
            this.f7163g = parcel.readInt();
            this.f7164h = parcel.readInt() == 1;
            this.f7165i = parcel.readInt() == 1;
            this.f7166j = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f7162f);
            parcel.writeInt(this.f7163g);
            parcel.writeInt(this.f7164h ? 1 : 0);
            parcel.writeInt(this.f7165i ? 1 : 0);
            parcel.writeInt(this.f7166j ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f7162f = bottomSheetBehavior.f7113O;
            this.f7163g = bottomSheetBehavior.f7135f;
            this.f7164h = bottomSheetBehavior.f7127b;
            this.f7165i = bottomSheetBehavior.f7108J;
            this.f7166j = bottomSheetBehavior.f7109K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i3;
        super(context, attributeSet);
        this.f7125a = 0;
        this.f7127b = true;
        this.f7129c = false;
        this.f7147l = -1;
        this.f7148m = -1;
        this.f7100B = new C1460g(this, null);
        this.f7105G = 0.5f;
        this.f7107I = -1.0f;
        this.f7110L = true;
        this.f7111M = true;
        this.f7113O = 4;
        this.f7114P = 4;
        this.f7119U = 0.1f;
        this.f7130c0 = new ArrayList();
        this.f7138g0 = -1;
        this.f7144j0 = new SparseIntArray();
        this.f7146k0 = new C1458e();
        this.f7141i = context.getResources().getDimensionPixelSize(AbstractC0142c.f426q0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f949m0);
        int i4 = AbstractC0150k.f988q0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f7145k = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, i4);
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC0150k.f676J0)) {
            this.f7161z = C0641l.m2308e(context, attributeSet, AbstractC0140a.f336d, f7098l0).m2351m();
        }
        m7632l0(context);
        m7633m0();
        this.f7107I = typedArrayObtainStyledAttributes.getDimension(AbstractC0150k.f979p0, -1.0f);
        int i5 = AbstractC0150k.f959n0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            m7648O0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        int i6 = AbstractC0150k.f969o0;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            m7647N0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        int i7 = AbstractC0150k.f1051x0;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i7);
        if (typedValuePeekValue != null && (i3 = typedValuePeekValue.data) == -1) {
            m7649P0(i3);
        } else {
            m7649P0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, -1));
        }
        m7646M0(typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f1042w0, false));
        m7644K0(typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f604B0, false));
        m7643J0(typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f1024u0, true));
        m7653T0(typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f595A0, false));
        m7640G0(typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f997r0, true));
        m7641H0(typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f1006s0, true));
        m7651R0(typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f1060y0, 0));
        m7645L0(typedArrayObtainStyledAttributes.getFloat(AbstractC0150k.f1033v0, 0.5f));
        int i8 = AbstractC0150k.f1015t0;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i8);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            m7642I0(typedValuePeekValue2.data);
        } else {
            m7642I0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i8, 0));
        }
        m7652S0(typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f1069z0, 500));
        this.f7151p = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f640F0, false);
        this.f7152q = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f649G0, false);
        this.f7153r = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f658H0, false);
        this.f7154s = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f667I0, true);
        this.f7155t = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f613C0, false);
        this.f7156u = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f622D0, false);
        this.f7157v = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f631E0, false);
        this.f7160y = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f685K0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f7131d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
