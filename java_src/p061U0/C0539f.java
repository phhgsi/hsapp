package p061U0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC1283b;
import com.google.android.gms.common.ConnectionResult;
import p016F0.AbstractC0140a;
import p019G0.AbstractC0176a;
import p019G0.C0178c;
import p055S0.AbstractC0505a;
import p058T0.AbstractC0528h;
import p061U0.AbstractC0546m;

/* JADX INFO: renamed from: U0.f */
/* JADX INFO: loaded from: classes.dex */
final class C0539f extends AbstractC0547n {

    /* JADX INFO: renamed from: k */
    private static final TimeInterpolator f1867k = AbstractC0176a.f1126b;

    /* JADX INFO: renamed from: l */
    private static final int[] f1868l = {0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 3000, 4500};

    /* JADX INFO: renamed from: m */
    private static final float[] f1869m = {0.1f, 0.87f};

    /* JADX INFO: renamed from: n */
    private static final Property f1870n = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o */
    private static final Property f1871o = new d(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c */
    private ObjectAnimator f1872c;

    /* JADX INFO: renamed from: d */
    private ObjectAnimator f1873d;

    /* JADX INFO: renamed from: e */
    private final TimeInterpolator f1874e;

    /* JADX INFO: renamed from: f */
    private final AbstractC0536c f1875f;

    /* JADX INFO: renamed from: g */
    private int f1876g;

    /* JADX INFO: renamed from: h */
    private float f1877h;

    /* JADX INFO: renamed from: i */
    private float f1878i;

    /* JADX INFO: renamed from: j */
    AbstractC1283b f1879j;

    /* JADX INFO: renamed from: U0.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C0539f c0539f = C0539f.this;
            c0539f.f1876g = (c0539f.f1876g + C0539f.f1868l.length) % C0539f.this.f1875f.f1830e.length;
        }
    }

    /* JADX INFO: renamed from: U0.f$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C0539f.this.mo1969a();
            C0539f c0539f = C0539f.this;
            AbstractC1283b abstractC1283b = c0539f.f1879j;
            if (abstractC1283b != null) {
                abstractC1283b.mo1933b(c0539f.f1939a);
            }
        }
    }

    /* JADX INFO: renamed from: U0.f$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C0539f c0539f) {
            return Float.valueOf(c0539f.m1988p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0539f c0539f, Float f3) {
            c0539f.m1996u(f3.floatValue());
        }
    }

    /* JADX INFO: renamed from: U0.f$d */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C0539f c0539f) {
            return Float.valueOf(c0539f.m1989q());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0539f c0539f, Float f3) {
            c0539f.m1992v(f3.floatValue());
        }
    }

    public C0539f(Context context, C0541h c0541h) {
        super(1);
        this.f1876g = 0;
        this.f1879j = null;
        this.f1875f = c0541h;
        this.f1874e = AbstractC0528h.m1911g(context, AbstractC0140a.f317J, f1867k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public float m1988p() {
        return this.f1877h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public float m1989q() {
        return this.f1878i;
    }

    /* JADX INFO: renamed from: r */
    private void m1990r() {
        if (this.f1872c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C0539f, Float>) f1870n, 0.0f, 1.0f);
            this.f1872c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f1875f.f1839n * 6000.0f));
            this.f1872c.setInterpolator(null);
            this.f1872c.setRepeatCount(-1);
            this.f1872c.addListener(new a());
        }
        if (this.f1873d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<C0539f, Float>) f1871o, 0.0f, 1.0f);
            this.f1873d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f1875f.f1839n * 500.0f));
            this.f1873d.addListener(new b());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m1991s(int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = f1868l;
            if (i4 >= iArr.length) {
                return;
            }
            float fM2050b = m2050b(i3, iArr[i4], 100);
            if (fM2050b >= 0.0f && fM2050b <= 1.0f) {
                int i5 = i4 + this.f1876g;
                int[] iArr2 = this.f1875f.f1830e;
                int length = i5 % iArr2.length;
                int length2 = (length + 1) % iArr2.length;
                int i6 = iArr2[length];
                int i7 = iArr2[length2];
                ((AbstractC0546m.a) this.f1940b.get(0)).f1929c = C0178c.m486b().evaluate(this.f1874e.getInterpolation(fM2050b), Integer.valueOf(i6), Integer.valueOf(i7)).intValue();
                return;
            }
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m1992v(float f3) {
        this.f1878i = f3;
    }

    /* JADX INFO: renamed from: w */
    private void m1993w() {
        m1990r();
        this.f1872c.setDuration((long) (this.f1875f.f1839n * 6000.0f));
        this.f1873d.setDuration((long) (this.f1875f.f1839n * 500.0f));
    }

    /* JADX INFO: renamed from: x */
    private void m1994x(int i3) {
        AbstractC0546m.a aVar = (AbstractC0546m.a) this.f1940b.get(0);
        float f3 = this.f1877h * 1080.0f;
        float interpolation = 0.0f;
        for (int i4 : f1868l) {
            interpolation += this.f1874e.getInterpolation(m2050b(i3, i4, 500)) * 90.0f;
        }
        aVar.f1933g = f3 + interpolation;
        float interpolation2 = this.f1874e.getInterpolation(m2050b(i3, 0, 3000)) - this.f1874e.getInterpolation(m2050b(i3, 3000, 3000));
        aVar.f1927a = 0.0f;
        float[] fArr = f1869m;
        float fM1849c = AbstractC0505a.m1849c(fArr[0], fArr[1], interpolation2);
        aVar.f1928b = fM1849c;
        float f4 = this.f1878i;
        if (f4 > 0.0f) {
            aVar.f1928b = fM1849c * (1.0f - f4);
        }
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: a */
    void mo1969a() {
        ObjectAnimator objectAnimator = this.f1872c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: c */
    public void mo1970c() {
        m1993w();
        m1995t();
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: d */
    public void mo1971d(AbstractC1283b abstractC1283b) {
        this.f1879j = abstractC1283b;
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: f */
    void mo1972f() {
        ObjectAnimator objectAnimator = this.f1873d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f1939a.isVisible()) {
            this.f1873d.start();
        } else {
            mo1969a();
        }
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: g */
    void mo1973g() {
        m1990r();
        m1995t();
        this.f1872c.start();
    }

    @Override // p061U0.AbstractC0547n
    /* JADX INFO: renamed from: h */
    public void mo1974h() {
        this.f1879j = null;
    }

    /* JADX INFO: renamed from: t */
    void m1995t() {
        this.f1876g = 0;
        ((AbstractC0546m.a) this.f1940b.get(0)).f1929c = this.f1875f.f1830e[0];
        this.f1878i = 0.0f;
    }

    /* JADX INFO: renamed from: u */
    void m1996u(float f3) {
        this.f1877h = f3;
        int i3 = (int) (f3 * 6000.0f);
        m1994x(i3);
        m1991s(i3);
        this.f1939a.invalidateSelf();
    }
}
