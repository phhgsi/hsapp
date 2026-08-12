package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.AbstractC1549t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p019G0.AbstractC0176a;
import p055S0.AbstractC0505a;
import p058T0.AbstractC0528h;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a */
    private final int f8302a;

    /* JADX INFO: renamed from: b */
    private final TimeInterpolator f8303b;

    /* JADX INFO: renamed from: c */
    private final ValueAnimator f8304c;

    /* JADX INFO: renamed from: d */
    private boolean f8305d;

    /* JADX INFO: renamed from: e */
    private float f8306e;

    /* JADX INFO: renamed from: f */
    private float f8307f;

    /* JADX INFO: renamed from: g */
    private boolean f8308g;

    /* JADX INFO: renamed from: h */
    private final int f8309h;

    /* JADX INFO: renamed from: i */
    private boolean f8310i;

    /* JADX INFO: renamed from: j */
    private final List f8311j;

    /* JADX INFO: renamed from: k */
    private final int f8312k;

    /* JADX INFO: renamed from: l */
    private final float f8313l;

    /* JADX INFO: renamed from: m */
    private final Paint f8314m;

    /* JADX INFO: renamed from: n */
    private final RectF f8315n;

    /* JADX INFO: renamed from: o */
    private final int f8316o;

    /* JADX INFO: renamed from: p */
    private float f8317p;

    /* JADX INFO: renamed from: q */
    private boolean f8318q;

    /* JADX INFO: renamed from: r */
    private double f8319r;

    /* JADX INFO: renamed from: s */
    private int f8320s;

    /* JADX INFO: renamed from: t */
    private int f8321t;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$a */
    class C1641a extends AnimatorListenerAdapter {
        C1641a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public interface InterfaceC1642b {
        /* JADX INFO: renamed from: a */
        void mo9065a(float f3, boolean z2);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f352t);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9066a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.m9074p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* JADX INFO: renamed from: c */
    private void m9067c(float f3, float f4) {
        this.f8321t = AbstractC0505a.m1848b((float) (getWidth() / 2), (float) (getHeight() / 2), f3, f4) > ((float) m9070h(2)) + AbstractC1549t.m8498c(getContext(), 12) ? 1 : 2;
    }

    /* JADX INFO: renamed from: d */
    private void m9068d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f3 = width;
        float fM9070h = m9070h(this.f8321t);
        float fCos = (((float) Math.cos(this.f8319r)) * fM9070h) + f3;
        float f4 = height;
        float fSin = (fM9070h * ((float) Math.sin(this.f8319r))) + f4;
        this.f8314m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f8312k, this.f8314m);
        double dSin = Math.sin(this.f8319r);
        double dCos = Math.cos(this.f8319r);
        this.f8314m.setStrokeWidth(this.f8316o);
        canvas.drawLine(f3, f4, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f8314m);
        canvas.drawCircle(f3, f4, this.f8313l, this.f8314m);
    }

    /* JADX INFO: renamed from: f */
    private int m9069f(float f3, float f4) {
        int degrees = (int) Math.toDegrees(Math.atan2(f4 - (getHeight() / 2), f3 - (getWidth() / 2)));
        int i3 = degrees + 90;
        return i3 < 0 ? degrees + 450 : i3;
    }

    /* JADX INFO: renamed from: h */
    private int m9070h(int i3) {
        return i3 == 2 ? Math.round(this.f8320s * 0.66f) : this.f8320s;
    }

    /* JADX INFO: renamed from: j */
    private Pair m9071j(float f3) {
        float fM9077g = m9077g();
        if (Math.abs(fM9077g - f3) > 180.0f) {
            if (fM9077g > 180.0f && f3 < 180.0f) {
                f3 += 360.0f;
            }
            if (fM9077g < 180.0f && f3 > 180.0f) {
                fM9077g += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fM9077g), Float.valueOf(f3));
    }

    /* JADX INFO: renamed from: k */
    private boolean m9072k(float f3, float f4, boolean z2, boolean z3, boolean z4) {
        float fM9069f = m9069f(f3, f4);
        boolean z5 = false;
        boolean z6 = m9077g() != fM9069f;
        if (z3 && z6) {
            return true;
        }
        if (!z6 && !z2) {
            return false;
        }
        if (z4 && this.f8305d) {
            z5 = true;
        }
        m9081o(fM9069f, z5);
        return true;
    }

    /* JADX INFO: renamed from: l */
    private void m9073l() {
        this.f8304c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.m9066a(this.f8340a, valueAnimator);
            }
        });
        this.f8304c.addListener(new C1641a());
    }

    /* JADX INFO: renamed from: p */
    private void m9074p(float f3, boolean z2) {
        float f4 = f3 % 360.0f;
        this.f8317p = f4;
        this.f8319r = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM9070h = m9070h(this.f8321t);
        float fCos = width + (((float) Math.cos(this.f8319r)) * fM9070h);
        float fSin = height + (fM9070h * ((float) Math.sin(this.f8319r)));
        RectF rectF = this.f8315n;
        int i3 = this.f8312k;
        rectF.set(fCos - i3, fSin - i3, fCos + i3, fSin + i3);
        Iterator it = this.f8311j.iterator();
        while (it.hasNext()) {
            ((InterfaceC1642b) it.next()).mo9065a(f4, z2);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public void m9075b(InterfaceC1642b interfaceC1642b) {
        this.f8311j.add(interfaceC1642b);
    }

    /* JADX INFO: renamed from: e */
    public RectF m9076e() {
        return this.f8315n;
    }

    /* JADX INFO: renamed from: g */
    public float m9077g() {
        return this.f8317p;
    }

    /* JADX INFO: renamed from: i */
    public int m9078i() {
        return this.f8312k;
    }

    /* JADX INFO: renamed from: m */
    public void m9079m(int i3) {
        this.f8320s = i3;
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public void m9080n(float f3) {
        m9081o(f3, false);
    }

    /* JADX INFO: renamed from: o */
    public void m9081o(float f3, boolean z2) {
        this.f8304c.cancel();
        if (!z2) {
            m9074p(f3, false);
            return;
        }
        Pair pairM9071j = m9071j(f3);
        this.f8304c.setFloatValues(((Float) pairM9071j.first).floatValue(), ((Float) pairM9071j.second).floatValue());
        this.f8304c.setDuration(this.f8302a);
        this.f8304c.setInterpolator(this.f8303b);
        this.f8304c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m9068d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        if (this.f8304c.isRunning()) {
            return;
        }
        m9080n(m9077g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f8306e = x2;
            this.f8307f = y2;
            this.f8308g = true;
            this.f8318q = false;
            z2 = true;
            z3 = false;
            z4 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i3 = (int) (x2 - this.f8306e);
            int i4 = (int) (y2 - this.f8307f);
            this.f8308g = (i3 * i3) + (i4 * i4) > this.f8309h;
            z3 = this.f8318q;
            boolean z5 = actionMasked == 1;
            if (this.f8310i) {
                m9067c(x2, y2);
            }
            z4 = z5;
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
            z4 = false;
        }
        this.f8318q |= m9072k(x2, y2, z3, z2, z4);
        return true;
    }

    /* JADX INFO: renamed from: q */
    void m9082q(boolean z2) {
        if (this.f8310i && !z2) {
            this.f8321t = 1;
        }
        this.f8310i = z2;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f8304c = new ValueAnimator();
        this.f8311j = new ArrayList();
        Paint paint = new Paint();
        this.f8314m = paint;
        this.f8315n = new RectF();
        this.f8321t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f704M1, i3, AbstractC0149j.f593z);
        this.f8302a = AbstractC0528h.m1910f(context, AbstractC0140a.f357y, 200);
        this.f8303b = AbstractC0528h.m1911g(context, AbstractC0140a.f314G, AbstractC0176a.f1126b);
        this.f8320s = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0150k.f722O1, 0);
        this.f8312k = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0150k.f731P1, 0);
        this.f8316o = getResources().getDimensionPixelSize(AbstractC0142c.f374H);
        this.f8313l = r7.getDimensionPixelSize(AbstractC0142c.f372F);
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC0150k.f713N1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m9080n(0.0f);
        this.f8309h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        m9073l();
    }
}
