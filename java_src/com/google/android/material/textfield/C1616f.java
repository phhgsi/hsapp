package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0143d;
import p016F0.AbstractC0148i;
import p019G0.AbstractC0176a;
import p058T0.AbstractC0528h;

/* JADX INFO: renamed from: com.google.android.material.textfield.f */
/* JADX INFO: loaded from: classes.dex */
class C1616f extends AbstractC1630t {

    /* JADX INFO: renamed from: e */
    private final int f8160e;

    /* JADX INFO: renamed from: f */
    private final int f8161f;

    /* JADX INFO: renamed from: g */
    private final TimeInterpolator f8162g;

    /* JADX INFO: renamed from: h */
    private final TimeInterpolator f8163h;

    /* JADX INFO: renamed from: i */
    private EditText f8164i;

    /* JADX INFO: renamed from: j */
    private final View.OnClickListener f8165j;

    /* JADX INFO: renamed from: k */
    private final View.OnFocusChangeListener f8166k;

    /* JADX INFO: renamed from: l */
    private AnimatorSet f8167l;

    /* JADX INFO: renamed from: m */
    private ValueAnimator f8168m;

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1616f.this.f8226b.m8936a0(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.f$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1616f.this.f8226b.m8936a0(false);
        }
    }

    C1616f(C1629s c1629s) {
        super(c1629s);
        this.f8165j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1616f.m8843v(this.f8155a, view);
            }
        };
        this.f8166k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                C1616f c1616f = this.f8156a;
                c1616f.m8838A(c1616f.m8842E());
            }
        };
        Context context = c1629s.getContext();
        int i3 = AbstractC0140a.f310C;
        this.f8160e = AbstractC0528h.m1910f(context, i3, 100);
        this.f8161f = AbstractC0528h.m1910f(c1629s.getContext(), i3, 150);
        this.f8162g = AbstractC0528h.m1911g(c1629s.getContext(), AbstractC0140a.f315H, AbstractC0176a.f1125a);
        this.f8163h = AbstractC0528h.m1911g(c1629s.getContext(), AbstractC0140a.f314G, AbstractC0176a.f1128d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m8838A(boolean z2) {
        boolean z3 = this.f8226b.m8916F() == z2;
        if (z2 && !this.f8167l.isRunning()) {
            this.f8168m.cancel();
            this.f8167l.start();
            if (z3) {
                this.f8167l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f8167l.cancel();
        this.f8168m.start();
        if (z3) {
            this.f8168m.end();
        }
    }

    /* JADX INFO: renamed from: B */
    private ValueAnimator m8839B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8162g);
        valueAnimatorOfFloat.setDuration(this.f8160e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1616f.m8845x(this.f8157a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: C */
    private ValueAnimator m8840C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f8163h);
        valueAnimatorOfFloat.setDuration(this.f8161f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1616f.m8846y(this.f8159a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: D */
    private void m8841D() {
        ValueAnimator valueAnimatorM8840C = m8840C();
        ValueAnimator valueAnimatorM8839B = m8839B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f8167l = animatorSet;
        animatorSet.playTogether(valueAnimatorM8840C, valueAnimatorM8839B);
        this.f8167l.addListener(new a());
        ValueAnimator valueAnimatorM8839B2 = m8839B(1.0f, 0.0f);
        this.f8168m = valueAnimatorM8839B2;
        valueAnimatorM8839B2.addListener(new b());
    }

    /* JADX INFO: renamed from: E */
    private boolean m8842E() {
        EditText editText = this.f8164i;
        if (editText != null) {
            return (editText.hasFocus() || this.f8228d.hasFocus()) && this.f8164i.getText().length() > 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m8843v(C1616f c1616f, View view) {
        EditText editText = c1616f.f8164i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        c1616f.m8974r();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m8845x(C1616f c1616f, ValueAnimator valueAnimator) {
        c1616f.getClass();
        c1616f.f8228d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8846y(C1616f c1616f, ValueAnimator valueAnimator) {
        c1616f.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c1616f.f8228d.setScaleX(fFloatValue);
        c1616f.f8228d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: a */
    void mo8848a(Editable editable) {
        if (this.f8226b.m8965w() != null) {
            return;
        }
        m8838A(m8842E());
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: c */
    int mo8849c() {
        return AbstractC0148i.f545e;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: d */
    int mo8850d() {
        return AbstractC0143d.f453i;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: e */
    View.OnFocusChangeListener mo8851e() {
        return this.f8166k;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: f */
    View.OnClickListener mo8852f() {
        return this.f8165j;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: g */
    View.OnFocusChangeListener mo8853g() {
        return this.f8166k;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: n */
    public void mo8854n(EditText editText) {
        this.f8164i = editText;
        this.f8225a.setEndIconVisible(m8842E());
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: q */
    void mo8855q(boolean z2) {
        if (this.f8226b.m8965w() == null) {
            return;
        }
        m8838A(z2);
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: s */
    void mo8856s() {
        m8841D();
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: u */
    void mo8857u() {
        EditText editText = this.f8164i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8158d.m8838A(true);
                }
            });
        }
    }
}
