package p061U0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC1283b;
import p019G0.C0178c;
import p060U.C0531b;
import p061U0.AbstractC0546m;

/* JADX INFO: renamed from: U0.e */
/* JADX INFO: loaded from: classes.dex */
final class C0538e extends AbstractC0547n {

    /* JADX INFO: renamed from: k */
    private static final int[] f1852k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l */
    private static final int[] f1853l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m */
    private static final int[] f1854m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n */
    private static final Property f1855n = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o */
    private static final Property f1856o = new d(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c */
    private ObjectAnimator f1857c;

    /* JADX INFO: renamed from: d */
    private ObjectAnimator f1858d;

    /* JADX INFO: renamed from: e */
    private final C0531b f1859e;

    /* JADX INFO: renamed from: f */
    private final AbstractC0536c f1860f;

    /* JADX INFO: renamed from: g */
    private int f1861g;

    /* JADX INFO: renamed from: h */
    private float f1862h;

    /* JADX INFO: renamed from: i */
    private float f1863i;

    /* JADX INFO: renamed from: j */
    AbstractC1283b f1864j;

    /* JADX INFO: renamed from: U0.e$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C0538e c0538e = C0538e.this;
            c0538e.f1861g = (c0538e.f1861g + 4) % C0538e.this.f1860f.f1830e.length;
        }
    }

    /* JADX INFO: renamed from: U0.e$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C0538e.this.mo1969a();
            C0538e c0538e = C0538e.this;
            AbstractC1283b abstractC1283b = c0538e.f1864j;
            if (abstractC1283b != null) {
                abstractC1283b.mo1933b(c0538e.f1939a);
            }
        }
    }

    /* JADX INFO: renamed from: U0.e$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C0538e c0538e) {
            return Float.valueOf(c0538e.m1962o());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0538e c0538e, Float f3) {
            c0538e.m1976t(f3.floatValue());
        }
    }

    /* JADX INFO: renamed from: U0.e$d */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C0538e c0538e) {
            return Float.valueOf(c0538e.m1963p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0538e c0538e, Float f3) {
            c0538e.m1966u(f3.floatValue());
        }
    }

    public C0538e(C0541h c0541h) {
        super(1);
        this.f1861g = 0;
        this.f1864j = null;
        this.f1860f = c0541h;
        this.f1859e = new C0531b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public float m1962o() {
        return this.f1862h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public float m1963p() {
        return this.f1863i;
    }

    /* JADX INFO: renamed from: q */
    private void m1964q() {
        if (this.f1857c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C0538e, Float>) f1855n, 0.0f, 1.0f);
            this.f1857c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f1860f.f1839n * 5400.0f));
            this.f1857c.setInterpolator(null);
            this.f1857c.setRepeatCount(-1);
            this.f1857c.addListener(new a());
        }
        if (this.f1858d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<C0538e, Float>) f1856o, 0.0f, 1.0f);
            this.f1858d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f1860f.f1839n * 333.0f));
            this.f1858d.setInterpolator(this.f1859e);
            this.f1858d.addListener(new b());
        }
    }

    /* JADX INFO: renamed from: r */
    private void m1965r(int i3) {
        for (int i4 = 0; i4 < 4; i4++) {
            float fM2050b = m2050b(i3, f1854m[i4], 333);
            if (fM2050b > 0.0f && fM2050b < 1.0f) {
                int i5 = i4 + this.f1861g;
                int[] iArr = this.f1860f.f1830e;
                int length = i5 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i6 = iArr[length];
                int i7 = iArr[length2];
                ((AbstractC0546m.a) this.f1940b.get(0)).f1929c = C0178c.m486b().evaluate(this.f1859e.getInterpolation(fM2050b), Integer.valueOf(i6), Integer.valueOf(i7)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m1966u(float f3) {
        this.f1863i = f3;
    }

    /* JADX INFO: renamed from: v */
    private void m1967v() {
        m1964q();
        this.f1857c.setDuration((long) (this.f1860f.f1839n * 5400.0f));
        this.f1858d.setDuration((long) (this.f1860f.f1839n * 333.0f));
    }

    /* JADX INFO: renamed from: w */
    private void m1968w(int i3) {
        AbstractC0546m.a aVar = (AbstractC0546m.a) this.f1940b.get(0);
        float f3 = this.f1862h;
        aVar.f1927a = (f3 * 1520.0f) - 20.0f;
        aVar.f1928b = f3 * 1520.0f;
        for (int i4 = 0; i4 < 4; i4++) {
            aVar.f1928b += this.f1859e.getInterpolation(m2050b(i3, f1852k[i4], 667)) * 250.0f;
            aVar.f1927a += this.f1859e.getInterpolation(m2050b(i3, f1853l[i4], 667)) * 250.0f;
        }
        float f4 = aVar.f1927a;
        float f5 = aVar.f1928b;
        aVar.f1927a = (f4 + ((f5 - f4) * this.f1863i)) / 360.0f;
        aVar.f1928b = f5 / 360.0f;
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: a */
    void mo1969a() {
        ObjectAnimator objectAnimator = this.f1857c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: c */
    public void mo1970c() {
        m1967v();
        m1975s();
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: d */
    public void mo1971d(AbstractC1283b abstractC1283b) {
        this.f1864j = abstractC1283b;
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: f */
    void mo1972f() {
        ObjectAnimator objectAnimator = this.f1858d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f1939a.isVisible()) {
            this.f1858d.start();
        } else {
            mo1969a();
        }
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: g */
    void mo1973g() {
        m1964q();
        m1975s();
        this.f1857c.start();
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: h */
    public void mo1974h() {
        this.f1864j = null;
    }

    /* JADX INFO: renamed from: s */
    void m1975s() {
        this.f1861g = 0;
        ((AbstractC0546m.a) this.f1940b.get(0)).f1929c = this.f1860f.f1830e[0];
        this.f1863i = 0.0f;
    }

    /* JADX INFO: renamed from: t */
    void m1976t(float f3) {
        this.f1862h = f3;
        int i3 = (int) (f3 * 5400.0f);
        m1968w(i3);
        m1965r(i3);
        this.f1939a.invalidateSelf();
    }
}
