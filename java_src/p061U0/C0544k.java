package p061U0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import androidx.vectordrawable.graphics.drawable.AbstractC1283b;
import p009D.AbstractC0091a;
import p016F0.AbstractC0140a;
import p019G0.AbstractC0176a;
import p045P.AbstractC0463i;
import p045P.C0465k;
import p045P.C0466l;
import p058T0.AbstractC0528h;
import p061U0.AbstractC0546m;

/* JADX INFO: renamed from: U0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0544k extends AbstractC0545l {

    /* JADX INFO: renamed from: C */
    private static final AbstractC0463i f1891C = new a("indicatorLevel");

    /* JADX INFO: renamed from: A */
    private TimeInterpolator f1892A;

    /* JADX INFO: renamed from: B */
    private TimeInterpolator f1893B;

    /* JADX INFO: renamed from: r */
    private AbstractC0546m f1894r;

    /* JADX INFO: renamed from: s */
    private final C0466l f1895s;

    /* JADX INFO: renamed from: t */
    private final C0465k f1896t;

    /* JADX INFO: renamed from: u */
    private final AbstractC0546m.a f1897u;

    /* JADX INFO: renamed from: v */
    private float f1898v;

    /* JADX INFO: renamed from: w */
    private boolean f1899w;

    /* JADX INFO: renamed from: x */
    private final ValueAnimator f1900x;

    /* JADX INFO: renamed from: y */
    private ValueAnimator f1901y;

    /* JADX INFO: renamed from: z */
    private TimeInterpolator f1902z;

    /* JADX INFO: renamed from: U0.k$a */
    class a extends AbstractC0463i {
        a(String str) {
            super(str);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(C0544k c0544k) {
            return c0544k.m2005D() * 10000.0f;
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(C0544k c0544k, float f3) {
            c0544k.m2009J(f3 / 10000.0f);
            c0544k.m2007F((int) f3);
        }
    }

    C0544k(Context context, final AbstractC0536c abstractC0536c, AbstractC0546m abstractC0546m) {
        super(context, abstractC0536c);
        this.f1899w = false;
        m2016H(abstractC0546m);
        AbstractC0546m.a aVar = new AbstractC0546m.a();
        this.f1897u = aVar;
        aVar.f1934h = true;
        C0466l c0466l = new C0466l();
        this.f1895s = c0466l;
        c0466l.m1722f(1.0f);
        c0466l.m1724h(50.0f);
        C0465k c0465k = new C0465k(this, f1891C);
        this.f1896t = c0465k;
        c0465k.m1715q(c0466l);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1900x = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: U0.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C0544k.m2010v(this.f1889a, abstractC0536c, valueAnimator2);
            }
        });
        if (abstractC0536c.m1937b(true) && abstractC0536c.f1838m != 0) {
            valueAnimator.start();
        }
        m2041p(1.0f);
    }

    /* JADX INFO: renamed from: A */
    static C0544k m2003A(Context context, C0541h c0541h, C0537d c0537d) {
        return new C0544k(context, c0541h, c0537d);
    }

    /* JADX INFO: renamed from: B */
    private float m2004B(int i3) {
        float f3 = i3;
        return (f3 < 1000.0f || f3 > 9000.0f) ? 0.0f : 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public float m2005D() {
        return this.f1897u.f1928b;
    }

    /* JADX INFO: renamed from: E */
    private void m2006E() {
        if (this.f1901y != null) {
            return;
        }
        Context context = this.f1904a;
        int i3 = AbstractC0140a.f317J;
        TimeInterpolator timeInterpolator = AbstractC0176a.f1125a;
        this.f1892A = AbstractC0528h.m1911g(context, i3, timeInterpolator);
        this.f1893B = AbstractC0528h.m1911g(this.f1904a, AbstractC0140a.f312E, timeInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1901y = valueAnimator;
        valueAnimator.setDuration(500L);
        this.f1901y.setFloatValues(0.0f, 1.0f);
        this.f1901y.setInterpolator(null);
        this.f1901y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: U0.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C0544k c0544k = this.f1888a;
                c0544k.f1897u.f1931e = c0544k.f1902z.getInterpolation(c0544k.f1901y.getAnimatedFraction());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m2007F(int i3) {
        if (this.f1905b.m1937b(true)) {
            m2006E();
            float fM2004B = m2004B(i3);
            if (fM2004B == this.f1898v) {
                if (this.f1901y.isRunning()) {
                    return;
                }
                m2008G(fM2004B);
                return;
            }
            if (this.f1901y.isRunning()) {
                this.f1901y.cancel();
            }
            this.f1898v = fM2004B;
            if (fM2004B == 1.0f) {
                this.f1902z = this.f1892A;
                this.f1901y.start();
            } else {
                this.f1902z = this.f1893B;
                this.f1901y.reverse();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private void m2008G(float f3) {
        this.f1897u.f1931e = f3;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public void m2009J(float f3) {
        this.f1897u.f1928b = f3;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m2010v(C0544k c0544k, AbstractC0536c abstractC0536c, ValueAnimator valueAnimator) {
        c0544k.getClass();
        if (abstractC0536c.m1937b(true) && abstractC0536c.f1838m != 0 && c0544k.isVisible()) {
            c0544k.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: C */
    AbstractC0546m m2015C() {
        return this.f1894r;
    }

    /* JADX INFO: renamed from: H */
    void m2016H(AbstractC0546m abstractC0546m) {
        this.f1894r = abstractC0546m;
    }

    /* JADX INFO: renamed from: I */
    void m2017I(boolean z2) {
        if (z2 && !this.f1900x.isRunning()) {
            this.f1900x.start();
        } else {
            if (z2 || !this.f1900x.isRunning()) {
                return;
            }
            this.f1900x.cancel();
        }
    }

    /* JADX INFO: renamed from: K */
    void m2018K(float f3) {
        setLevel((int) (f3 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f1919p)) {
            canvas.save();
            this.f1894r.m2044h(canvas, getBounds(), m2039h(), mo2021m(), mo2020l());
            this.f1897u.f1932f = m2040i();
            this.f1917n.setStyle(Paint.Style.FILL);
            this.f1917n.setAntiAlias(true);
            AbstractC0546m.a aVar = this.f1897u;
            AbstractC0536c abstractC0536c = this.f1905b;
            aVar.f1929c = abstractC0536c.f1830e[0];
            int i3 = abstractC0536c.f1834i;
            if (i3 > 0) {
                this.f1894r.mo1952d(canvas, this.f1917n, m2005D(), 1.0f, this.f1905b.f1831f, getAlpha(), (int) ((i3 * AbstractC0091a.m257a(m2005D(), 0.0f, 0.01f)) / 0.01f));
            } else {
                this.f1894r.mo1952d(canvas, this.f1917n, 0.0f, 1.0f, abstractC0536c.f1831f, getAlpha(), 0);
            }
            this.f1894r.mo1951c(canvas, this.f1917n, this.f1897u, getAlpha());
            this.f1894r.mo1950b(canvas, this.f1917n, this.f1905b.f1830e[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1894r.mo1953e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1894r.mo1954f();
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo2019j() {
        return super.mo2019j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f1896t.m1716r();
        m2009J(getLevel() / 10000.0f);
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo2020l() {
        return super.mo2020l();
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo2021m() {
        return super.mo2021m();
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: o */
    public /* bridge */ /* synthetic */ void mo2022o(AbstractC1283b abstractC1283b) {
        super.mo2022o(abstractC1283b);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i3) {
        float fM2004B = m2004B(i3);
        if (!this.f1899w) {
            this.f1896t.m1678i(m2005D() * 10000.0f);
            this.f1896t.m1712m(i3);
            return true;
        }
        this.f1896t.m1716r();
        m2009J(i3 / 10000.0f);
        m2008G(fM2004B);
        return true;
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ boolean mo2023s(boolean z2, boolean z3, boolean z4) {
        return super.mo2023s(z2, z3, z4);
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i3) {
        super.setAlpha(i3);
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3);
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: t */
    boolean mo2024t(boolean z2, boolean z3, boolean z4) {
        boolean zMo2024t = super.mo2024t(z2, z3, z4);
        float fM1914a = this.f1906c.m1914a(this.f1904a.getContentResolver());
        if (fM1914a == 0.0f) {
            this.f1899w = true;
            return zMo2024t;
        }
        this.f1899w = false;
        this.f1895s.m1724h(50.0f / fM1914a);
        return zMo2024t;
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ boolean mo2025u(AbstractC1283b abstractC1283b) {
        return super.mo2025u(abstractC1283b);
    }
}
