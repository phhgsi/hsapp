package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0143d;
import p016F0.AbstractC0148i;
import p019G0.AbstractC0176a;
import p030K.C0356y;
import p058T0.AbstractC0528h;

/* JADX INFO: renamed from: com.google.android.material.textfield.q */
/* JADX INFO: loaded from: classes.dex */
class C1627q extends AbstractC1630t {

    /* JADX INFO: renamed from: e */
    private final int f8180e;

    /* JADX INFO: renamed from: f */
    private final int f8181f;

    /* JADX INFO: renamed from: g */
    private final TimeInterpolator f8182g;

    /* JADX INFO: renamed from: h */
    private AutoCompleteTextView f8183h;

    /* JADX INFO: renamed from: i */
    private final View.OnClickListener f8184i;

    /* JADX INFO: renamed from: j */
    private final View.OnFocusChangeListener f8185j;

    /* JADX INFO: renamed from: k */
    private final AccessibilityManager.TouchExplorationStateChangeListener f8186k;

    /* JADX INFO: renamed from: l */
    private boolean f8187l;

    /* JADX INFO: renamed from: m */
    private boolean f8188m;

    /* JADX INFO: renamed from: n */
    private boolean f8189n;

    /* JADX INFO: renamed from: o */
    private long f8190o;

    /* JADX INFO: renamed from: p */
    private AccessibilityManager f8191p;

    /* JADX INFO: renamed from: q */
    private ValueAnimator f8192q;

    /* JADX INFO: renamed from: r */
    private ValueAnimator f8193r;

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1627q.this.m8974r();
            C1627q.this.f8193r.start();
        }
    }

    C1627q(C1629s c1629s) {
        super(c1629s);
        this.f8184i = new View.OnClickListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8176a.m8876J();
            }
        };
        this.f8185j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                C1627q.m8881y(this.f8177a, view, z2);
            }
        };
        this.f8186k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.o
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                C1627q.m8879w(this.f8178a, z2);
            }
        };
        this.f8190o = Long.MAX_VALUE;
        Context context = c1629s.getContext();
        int i3 = AbstractC0140a.f310C;
        this.f8181f = AbstractC0528h.m1910f(context, i3, 67);
        this.f8180e = AbstractC0528h.m1910f(c1629s.getContext(), i3, 50);
        this.f8182g = AbstractC0528h.m1911g(c1629s.getContext(), AbstractC0140a.f315H, AbstractC0176a.f1125a);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8867A(C1627q c1627q) {
        c1627q.m8877K();
        c1627q.m8874H(false);
    }

    /* JADX INFO: renamed from: D */
    private static AutoCompleteTextView m8870D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX INFO: renamed from: E */
    private ValueAnimator m8871E(int i3, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8182g);
        valueAnimatorOfFloat.setDuration(i3);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1627q.m8880x(this.f8173a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: F */
    private void m8872F() {
        this.f8193r = m8871E(this.f8181f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorM8871E = m8871E(this.f8180e, 1.0f, 0.0f);
        this.f8192q = valueAnimatorM8871E;
        valueAnimatorM8871E.addListener(new a());
    }

    /* JADX INFO: renamed from: G */
    private boolean m8873G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f8190o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    /* JADX INFO: renamed from: H */
    private void m8874H(boolean z2) {
        if (this.f8189n != z2) {
            this.f8189n = z2;
            this.f8193r.cancel();
            this.f8192q.start();
        }
    }

    /* JADX INFO: renamed from: I */
    private void m8875I() {
        this.f8183h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C1627q.m8882z(this.f8174a, view, motionEvent);
            }
        });
        this.f8183h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.l
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C1627q.m8867A(this.f8175a);
            }
        });
        this.f8183h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public void m8876J() {
        if (this.f8183h == null) {
            return;
        }
        if (m8873G()) {
            this.f8188m = false;
        }
        if (this.f8188m) {
            this.f8188m = false;
            return;
        }
        m8874H(!this.f8189n);
        if (!this.f8189n) {
            this.f8183h.dismissDropDown();
        } else {
            this.f8183h.requestFocus();
            this.f8183h.showDropDown();
        }
    }

    /* JADX INFO: renamed from: K */
    private void m8877K() {
        this.f8188m = true;
        this.f8190o = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m8878v(C1627q c1627q) {
        boolean zIsPopupShowing = c1627q.f8183h.isPopupShowing();
        c1627q.m8874H(zIsPopupShowing);
        c1627q.f8188m = zIsPopupShowing;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m8879w(C1627q c1627q, boolean z2) {
        AutoCompleteTextView autoCompleteTextView = c1627q.f8183h;
        if (autoCompleteTextView == null || AbstractC1628r.m8892a(autoCompleteTextView)) {
            return;
        }
        c1627q.f8228d.setImportantForAccessibility(z2 ? 2 : 1);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m8880x(C1627q c1627q, ValueAnimator valueAnimator) {
        c1627q.getClass();
        c1627q.f8228d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8881y(C1627q c1627q, View view, boolean z2) {
        c1627q.f8187l = z2;
        c1627q.m8974r();
        if (z2) {
            return;
        }
        c1627q.m8874H(false);
        c1627q.f8188m = false;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m8882z(C1627q c1627q, View view, MotionEvent motionEvent) {
        c1627q.getClass();
        if (motionEvent.getAction() == 1) {
            if (c1627q.m8873G()) {
                c1627q.f8188m = false;
            }
            c1627q.m8876J();
            c1627q.m8877K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: a */
    public void mo8848a(Editable editable) {
        if (this.f8191p.isTouchExplorationEnabled() && AbstractC1628r.m8892a(this.f8183h) && !this.f8228d.hasFocus()) {
            this.f8183h.dismissDropDown();
        }
        this.f8183h.post(new Runnable() { // from class: com.google.android.material.textfield.p
            @Override // java.lang.Runnable
            public final void run() {
                C1627q.m8878v(this.f8179d);
            }
        });
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: c */
    int mo8849c() {
        return AbstractC0148i.f547g;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: d */
    int mo8850d() {
        return AbstractC0143d.f452h;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: e */
    View.OnFocusChangeListener mo8851e() {
        return this.f8185j;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: f */
    View.OnClickListener mo8852f() {
        return this.f8184i;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: h */
    public AccessibilityManager.TouchExplorationStateChangeListener mo8883h() {
        return this.f8186k;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: i */
    boolean mo8884i(int i3) {
        return i3 != 0;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: j */
    boolean mo8885j() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: k */
    boolean mo8886k() {
        return this.f8187l;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: l */
    boolean mo8887l() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: m */
    boolean mo8888m() {
        return this.f8189n;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: n */
    public void mo8854n(EditText editText) {
        this.f8183h = m8870D(editText);
        m8875I();
        this.f8225a.setErrorIconDrawable((Drawable) null);
        if (!AbstractC1628r.m8892a(editText) && this.f8191p.isTouchExplorationEnabled()) {
            this.f8228d.setImportantForAccessibility(2);
        }
        this.f8225a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: o */
    public void mo8889o(View view, C0356y c0356y) {
        if (!AbstractC1628r.m8892a(this.f8183h)) {
            c0356y.m1287s0(Spinner.class.getName());
        }
        if (c0356y.m1266c0()) {
            c0356y.m1222C0(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: p */
    public void mo8890p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f8191p.isEnabled() || AbstractC1628r.m8892a(this.f8183h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f8189n && !this.f8183h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            m8876J();
            m8877K();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: s */
    void mo8856s() {
        m8872F();
        this.f8191p = (AccessibilityManager) this.f8227c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: t */
    boolean mo8891t() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: u */
    void mo8857u() {
        AutoCompleteTextView autoCompleteTextView = this.f8183h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f8183h.setOnDismissListener(null);
        }
    }
}
