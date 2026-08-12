package p108h0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p024I.AbstractC0211h;
import p060U.C0531b;

/* JADX INFO: renamed from: h0.a */
/* JADX INFO: loaded from: classes.dex */
public class C1985a extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g */
    private static final Interpolator f9517g = new LinearInterpolator();

    /* JADX INFO: renamed from: h */
    private static final Interpolator f9518h = new C0531b();

    /* JADX INFO: renamed from: i */
    private static final int[] f9519i = {-16777216};

    /* JADX INFO: renamed from: a */
    private final c f9520a;

    /* JADX INFO: renamed from: b */
    private float f9521b;

    /* JADX INFO: renamed from: c */
    private Resources f9522c;

    /* JADX INFO: renamed from: d */
    private Animator f9523d;

    /* JADX INFO: renamed from: e */
    float f9524e;

    /* JADX INFO: renamed from: f */
    boolean f9525f;

    /* JADX INFO: renamed from: h0.a$a */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f9526a;

        a(c cVar) {
            this.f9526a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1985a.this.m10065n(fFloatValue, this.f9526a);
            C1985a.this.m10057b(fFloatValue, this.f9526a, false);
            C1985a.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: h0.a$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        final RectF f9530a = new RectF();

        /* JADX INFO: renamed from: b */
        final Paint f9531b;

        /* JADX INFO: renamed from: c */
        final Paint f9532c;

        /* JADX INFO: renamed from: d */
        final Paint f9533d;

        /* JADX INFO: renamed from: e */
        float f9534e;

        /* JADX INFO: renamed from: f */
        float f9535f;

        /* JADX INFO: renamed from: g */
        float f9536g;

        /* JADX INFO: renamed from: h */
        float f9537h;

        /* JADX INFO: renamed from: i */
        int[] f9538i;

        /* JADX INFO: renamed from: j */
        int f9539j;

        /* JADX INFO: renamed from: k */
        float f9540k;

        /* JADX INFO: renamed from: l */
        float f9541l;

        /* JADX INFO: renamed from: m */
        float f9542m;

        /* JADX INFO: renamed from: n */
        boolean f9543n;

        /* JADX INFO: renamed from: o */
        Path f9544o;

        /* JADX INFO: renamed from: p */
        float f9545p;

        /* JADX INFO: renamed from: q */
        float f9546q;

        /* JADX INFO: renamed from: r */
        int f9547r;

        /* JADX INFO: renamed from: s */
        int f9548s;

        /* JADX INFO: renamed from: t */
        int f9549t;

        /* JADX INFO: renamed from: u */
        int f9550u;

        c() {
            Paint paint = new Paint();
            this.f9531b = paint;
            Paint paint2 = new Paint();
            this.f9532c = paint2;
            Paint paint3 = new Paint();
            this.f9533d = paint3;
            this.f9534e = 0.0f;
            this.f9535f = 0.0f;
            this.f9536g = 0.0f;
            this.f9537h = 5.0f;
            this.f9545p = 1.0f;
            this.f9549t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* JADX INFO: renamed from: A */
        void m10066A() {
            this.f9540k = this.f9534e;
            this.f9541l = this.f9535f;
            this.f9542m = this.f9536g;
        }

        /* JADX INFO: renamed from: a */
        void m10067a(Canvas canvas, Rect rect) {
            RectF rectF = this.f9530a;
            float f3 = this.f9546q;
            float fMin = (this.f9537h / 2.0f) + f3;
            if (f3 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f9547r * this.f9545p) / 2.0f, this.f9537h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f4 = this.f9534e;
            float f5 = this.f9536g;
            float f6 = (f4 + f5) * 360.0f;
            float f7 = ((this.f9535f + f5) * 360.0f) - f6;
            this.f9531b.setColor(this.f9550u);
            this.f9531b.setAlpha(this.f9549t);
            float f8 = this.f9537h / 2.0f;
            rectF.inset(f8, f8);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f9533d);
            float f9 = -f8;
            rectF.inset(f9, f9);
            canvas.drawArc(rectF, f6, f7, false, this.f9531b);
            m10068b(canvas, f6, f7, rectF);
        }

        /* JADX INFO: renamed from: b */
        void m10068b(Canvas canvas, float f3, float f4, RectF rectF) {
            if (this.f9543n) {
                Path path = this.f9544o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f9544o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f5 = (this.f9547r * this.f9545p) / 2.0f;
                this.f9544o.moveTo(0.0f, 0.0f);
                this.f9544o.lineTo(this.f9547r * this.f9545p, 0.0f);
                Path path3 = this.f9544o;
                float f6 = this.f9547r;
                float f7 = this.f9545p;
                path3.lineTo((f6 * f7) / 2.0f, this.f9548s * f7);
                this.f9544o.offset((fMin + rectF.centerX()) - f5, rectF.centerY() + (this.f9537h / 2.0f));
                this.f9544o.close();
                this.f9532c.setColor(this.f9550u);
                this.f9532c.setAlpha(this.f9549t);
                canvas.save();
                canvas.rotate(f3 + f4, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f9544o, this.f9532c);
                canvas.restore();
            }
        }

        /* JADX INFO: renamed from: c */
        int m10069c() {
            return this.f9549t;
        }

        /* JADX INFO: renamed from: d */
        float m10070d() {
            return this.f9535f;
        }

        /* JADX INFO: renamed from: e */
        int m10071e() {
            return this.f9538i[m10072f()];
        }

        /* JADX INFO: renamed from: f */
        int m10072f() {
            return (this.f9539j + 1) % this.f9538i.length;
        }

        /* JADX INFO: renamed from: g */
        float m10073g() {
            return this.f9534e;
        }

        /* JADX INFO: renamed from: h */
        int m10074h() {
            return this.f9538i[this.f9539j];
        }

        /* JADX INFO: renamed from: i */
        float m10075i() {
            return this.f9541l;
        }

        /* JADX INFO: renamed from: j */
        float m10076j() {
            return this.f9542m;
        }

        /* JADX INFO: renamed from: k */
        float m10077k() {
            return this.f9540k;
        }

        /* JADX INFO: renamed from: l */
        void m10078l() {
            m10086t(m10072f());
        }

        /* JADX INFO: renamed from: m */
        void m10079m() {
            this.f9540k = 0.0f;
            this.f9541l = 0.0f;
            this.f9542m = 0.0f;
            m10091y(0.0f);
            m10088v(0.0f);
            m10089w(0.0f);
        }

        /* JADX INFO: renamed from: n */
        void m10080n(int i3) {
            this.f9549t = i3;
        }

        /* JADX INFO: renamed from: o */
        void m10081o(float f3, float f4) {
            this.f9547r = (int) f3;
            this.f9548s = (int) f4;
        }

        /* JADX INFO: renamed from: p */
        void m10082p(float f3) {
            if (f3 != this.f9545p) {
                this.f9545p = f3;
            }
        }

        /* JADX INFO: renamed from: q */
        void m10083q(float f3) {
            this.f9546q = f3;
        }

        /* JADX INFO: renamed from: r */
        void m10084r(int i3) {
            this.f9550u = i3;
        }

        /* JADX INFO: renamed from: s */
        void m10085s(ColorFilter colorFilter) {
            this.f9531b.setColorFilter(colorFilter);
        }

        /* JADX INFO: renamed from: t */
        void m10086t(int i3) {
            this.f9539j = i3;
            this.f9550u = this.f9538i[i3];
        }

        /* JADX INFO: renamed from: u */
        void m10087u(int[] iArr) {
            this.f9538i = iArr;
            m10086t(0);
        }

        /* JADX INFO: renamed from: v */
        void m10088v(float f3) {
            this.f9535f = f3;
        }

        /* JADX INFO: renamed from: w */
        void m10089w(float f3) {
            this.f9536g = f3;
        }

        /* JADX INFO: renamed from: x */
        void m10090x(boolean z2) {
            if (this.f9543n != z2) {
                this.f9543n = z2;
            }
        }

        /* JADX INFO: renamed from: y */
        void m10091y(float f3) {
            this.f9534e = f3;
        }

        /* JADX INFO: renamed from: z */
        void m10092z(float f3) {
            this.f9537h = f3;
            this.f9531b.setStrokeWidth(f3);
        }
    }

    public C1985a(Context context) {
        this.f9522c = ((Context) AbstractC0211h.m610g(context)).getResources();
        c cVar = new c();
        this.f9520a = cVar;
        cVar.m10087u(f9519i);
        m10063k(2.5f);
        m10056m();
    }

    /* JADX INFO: renamed from: a */
    private void m10052a(float f3, c cVar) {
        m10065n(f3, cVar);
        float fFloor = (float) (Math.floor(cVar.m10076j() / 0.8f) + 1.0d);
        cVar.m10091y(cVar.m10077k() + (((cVar.m10075i() - 0.01f) - cVar.m10077k()) * f3));
        cVar.m10088v(cVar.m10075i());
        cVar.m10089w(cVar.m10076j() + ((fFloor - cVar.m10076j()) * f3));
    }

    /* JADX INFO: renamed from: c */
    private int m10053c(float f3, int i3, int i4) {
        return ((((i3 >> 24) & 255) + ((int) ((((i4 >> 24) & 255) - r0) * f3))) << 24) | ((((i3 >> 16) & 255) + ((int) ((((i4 >> 16) & 255) - r1) * f3))) << 16) | ((((i3 >> 8) & 255) + ((int) ((((i4 >> 8) & 255) - r2) * f3))) << 8) | ((i3 & 255) + ((int) (f3 * ((i4 & 255) - r8))));
    }

    /* JADX INFO: renamed from: h */
    private void m10054h(float f3) {
        this.f9521b = f3;
    }

    /* JADX INFO: renamed from: i */
    private void m10055i(float f3, float f4, float f5, float f6) {
        c cVar = this.f9520a;
        float f7 = this.f9522c.getDisplayMetrics().density;
        cVar.m10092z(f4 * f7);
        cVar.m10083q(f3 * f7);
        cVar.m10086t(0);
        cVar.m10081o(f5 * f7, f6 * f7);
    }

    /* JADX INFO: renamed from: m */
    private void m10056m() {
        c cVar = this.f9520a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f9517g);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.f9523d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: b */
    void m10057b(float f3, c cVar, boolean z2) {
        float interpolation;
        float interpolation2;
        if (this.f9525f) {
            m10052a(f3, cVar);
            return;
        }
        if (f3 != 1.0f || z2) {
            float fM10076j = cVar.m10076j();
            if (f3 < 0.5f) {
                interpolation = cVar.m10077k();
                interpolation2 = (f9518h.getInterpolation(f3 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM10077k = cVar.m10077k() + 0.79f;
                interpolation = fM10077k - (((1.0f - f9518h.getInterpolation((f3 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM10077k;
            }
            float f4 = fM10076j + (0.20999998f * f3);
            float f5 = (f3 + this.f9524e) * 216.0f;
            cVar.m10091y(interpolation);
            cVar.m10088v(interpolation2);
            cVar.m10089w(f4);
            m10054h(f5);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m10058d(boolean z2) {
        this.f9520a.m10090x(z2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f9521b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f9520a.m10067a(canvas, bounds);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m10059e(float f3) {
        this.f9520a.m10082p(f3);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: f */
    public void m10060f(int... iArr) {
        this.f9520a.m10087u(iArr);
        this.f9520a.m10086t(0);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m10061g(float f3) {
        this.f9520a.m10089w(f3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9520a.m10069c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f9523d.isRunning();
    }

    /* JADX INFO: renamed from: j */
    public void m10062j(float f3, float f4) {
        this.f9520a.m10091y(f3);
        this.f9520a.m10088v(f4);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m10063k(float f3) {
        this.f9520a.m10092z(f3);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m10064l(int i3) {
        if (i3 == 0) {
            m10055i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m10055i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: n */
    void m10065n(float f3, c cVar) {
        if (f3 > 0.75f) {
            cVar.m10084r(m10053c((f3 - 0.75f) / 0.25f, cVar.m10074h(), cVar.m10071e()));
        } else {
            cVar.m10084r(cVar.m10074h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        this.f9520a.m10080n(i3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9520a.m10085s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f9523d.cancel();
        this.f9520a.m10066A();
        if (this.f9520a.m10070d() != this.f9520a.m10073g()) {
            this.f9525f = true;
            this.f9523d.setDuration(666L);
            this.f9523d.start();
        } else {
            this.f9520a.m10086t(0);
            this.f9520a.m10079m();
            this.f9523d.setDuration(1332L);
            this.f9523d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f9523d.cancel();
        m10054h(0.0f);
        this.f9520a.m10090x(false);
        this.f9520a.m10086t(0);
        this.f9520a.m10079m();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: h0.a$b */
    class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f9528a;

        b(c cVar) {
            this.f9528a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C1985a.this.m10057b(1.0f, this.f9528a, true);
            this.f9528a.m10066A();
            this.f9528a.m10078l();
            C1985a c1985a = C1985a.this;
            if (!c1985a.f9525f) {
                c1985a.f9524e += 1.0f;
                return;
            }
            c1985a.f9525f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f9528a.m10090x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1985a.this.f9524e = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
