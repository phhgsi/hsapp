package p061U0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC1283b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p019G0.AbstractC0176a;

/* JADX INFO: renamed from: U0.l */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0545l extends Drawable implements Animatable {

    /* JADX INFO: renamed from: q */
    private static final Property f1903q = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: a */
    final Context f1904a;

    /* JADX INFO: renamed from: b */
    final AbstractC0536c f1905b;

    /* JADX INFO: renamed from: d */
    private ValueAnimator f1907d;

    /* JADX INFO: renamed from: e */
    private ValueAnimator f1908e;

    /* JADX INFO: renamed from: f */
    private boolean f1909f;

    /* JADX INFO: renamed from: g */
    private boolean f1910g;

    /* JADX INFO: renamed from: h */
    private float f1911h;

    /* JADX INFO: renamed from: j */
    private List f1913j;

    /* JADX INFO: renamed from: k */
    private AbstractC1283b f1914k;

    /* JADX INFO: renamed from: l */
    private boolean f1915l;

    /* JADX INFO: renamed from: m */
    private float f1916m;

    /* JADX INFO: renamed from: o */
    private int f1918o;

    /* JADX INFO: renamed from: i */
    private float f1912i = -1.0f;

    /* JADX INFO: renamed from: n */
    final Paint f1917n = new Paint();

    /* JADX INFO: renamed from: p */
    Rect f1919p = new Rect();

    /* JADX INFO: renamed from: c */
    C0534a f1906c = new C0534a();

    /* JADX INFO: renamed from: U0.l$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC0545l.this.m2033f();
        }
    }

    /* JADX INFO: renamed from: U0.l$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC0545l.super.setVisible(false, false);
            AbstractC0545l.this.m2032e();
        }
    }

    /* JADX INFO: renamed from: U0.l$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(AbstractC0545l abstractC0545l) {
            return Float.valueOf(abstractC0545l.m2039h());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(AbstractC0545l abstractC0545l, Float f3) {
            abstractC0545l.m2041p(f3.floatValue());
        }
    }

    AbstractC0545l(Context context, AbstractC0536c abstractC0536c) {
        this.f1904a = context;
        this.f1905b = abstractC0536c;
        setAlpha(255);
    }

    /* JADX INFO: renamed from: d */
    private void m2031d(ValueAnimator... valueAnimatorArr) {
        boolean z2 = this.f1915l;
        this.f1915l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f1915l = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m2032e() {
        AbstractC1283b abstractC1283b = this.f1914k;
        if (abstractC1283b != null) {
            abstractC1283b.mo1933b(this);
        }
        List list = this.f1913j;
        if (list == null || this.f1915l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC1283b) it.next()).mo1933b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m2033f() {
        AbstractC1283b abstractC1283b = this.f1914k;
        if (abstractC1283b != null) {
            abstractC1283b.mo6476c(this);
        }
        List list = this.f1913j;
        if (list == null || this.f1915l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC1283b) it.next()).mo6476c(this);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2034g(ValueAnimator... valueAnimatorArr) {
        boolean z2 = this.f1915l;
        this.f1915l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f1915l = z2;
    }

    /* JADX INFO: renamed from: k */
    private boolean m2035k() {
        return this instanceof C0544k;
    }

    /* JADX INFO: renamed from: n */
    private void m2036n() {
        if (this.f1907d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<AbstractC0545l, Float>) f1903q, 0.0f, 1.0f);
            this.f1907d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f1907d.setInterpolator(AbstractC0176a.f1126b);
            m2038r(this.f1907d);
        }
        if (this.f1908e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<AbstractC0545l, Float>) f1903q, 1.0f, 0.0f);
            this.f1908e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f1908e.setInterpolator(AbstractC0176a.f1126b);
            m2037q(this.f1908e);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m2037q(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f1908e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f1908e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    /* JADX INFO: renamed from: r */
    private void m2038r(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f1907d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f1907d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1918o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    float m2039h() {
        if (this.f1905b.m1939d() || this.f1905b.m1938c()) {
            return (this.f1910g || this.f1909f) ? this.f1911h : this.f1916m;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: i */
    float m2040i() {
        float f3 = this.f1912i;
        if (f3 > 0.0f) {
            return f3;
        }
        if (this.f1905b.m1937b(m2035k()) && this.f1905b.f1838m != 0) {
            float fM1914a = this.f1906c.m1914a(this.f1904a.getContentResolver());
            if (fM1914a > 0.0f) {
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) r0)) / ((int) ((((m2035k() ? this.f1905b.f1835j : this.f1905b.f1836k) * 1000.0f) / this.f1905b.f1838m) * fM1914a));
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public boolean isRunning() {
        return mo2021m() || mo2020l();
    }

    /* JADX INFO: renamed from: j */
    public boolean mo2019j() {
        return mo2023s(false, false, false);
    }

    /* JADX INFO: renamed from: l */
    public boolean mo2020l() {
        ValueAnimator valueAnimator = this.f1908e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f1910g;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo2021m() {
        ValueAnimator valueAnimator = this.f1907d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f1909f;
    }

    /* JADX INFO: renamed from: o */
    public void mo2022o(AbstractC1283b abstractC1283b) {
        if (this.f1913j == null) {
            this.f1913j = new ArrayList();
        }
        if (this.f1913j.contains(abstractC1283b)) {
            return;
        }
        this.f1913j.add(abstractC1283b);
    }

    /* JADX INFO: renamed from: p */
    void m2041p(float f3) {
        if (this.f1916m != f3) {
            this.f1916m = f3;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean mo2023s(boolean z2, boolean z3, boolean z4) {
        return mo2024t(z2, z3, z4 && this.f1906c.m1914a(this.f1904a.getContentResolver()) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        this.f1918o = i3;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1917n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        return mo2023s(z2, z3, true);
    }

    public void start() {
        mo2024t(true, true, false);
    }

    public void stop() {
        mo2024t(false, true, false);
    }

    /* JADX INFO: renamed from: t */
    boolean mo2024t(boolean z2, boolean z3, boolean z4) {
        m2036n();
        if (!isVisible() && !z2) {
            return false;
        }
        ValueAnimator valueAnimator = z2 ? this.f1907d : this.f1908e;
        ValueAnimator valueAnimator2 = z2 ? this.f1908e : this.f1907d;
        if (!z4) {
            if (valueAnimator2.isRunning()) {
                m2031d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m2034g(valueAnimator);
            }
            return super.setVisible(z2, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z5 = !z2 || super.setVisible(z2, false);
        if (!(z2 ? this.f1905b.m1939d() : this.f1905b.m1938c())) {
            m2034g(valueAnimator);
            return z5;
        }
        if (z3 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z5;
        }
        valueAnimator.resume();
        return z5;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo2025u(AbstractC1283b abstractC1283b) {
        List list = this.f1913j;
        if (list == null || !list.contains(abstractC1283b)) {
            return false;
        }
        this.f1913j.remove(abstractC1283b);
        if (!this.f1913j.isEmpty()) {
            return true;
        }
        this.f1913j = null;
        return true;
    }
}
