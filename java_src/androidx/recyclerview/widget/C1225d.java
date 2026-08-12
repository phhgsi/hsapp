package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import p027J.AbstractC0268W;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d */
/* JADX INFO: loaded from: classes.dex */
class C1225d extends RecyclerView.AbstractC1204o implements RecyclerView.InterfaceC1208s {

    /* JADX INFO: renamed from: D */
    private static final int[] f5942D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E */
    private static final int[] f5943E = new int[0];

    /* JADX INFO: renamed from: A */
    int f5944A;

    /* JADX INFO: renamed from: B */
    private final Runnable f5945B;

    /* JADX INFO: renamed from: C */
    private final RecyclerView.AbstractC1209t f5946C;

    /* JADX INFO: renamed from: a */
    private final int f5947a;

    /* JADX INFO: renamed from: b */
    private final int f5948b;

    /* JADX INFO: renamed from: c */
    final StateListDrawable f5949c;

    /* JADX INFO: renamed from: d */
    final Drawable f5950d;

    /* JADX INFO: renamed from: e */
    private final int f5951e;

    /* JADX INFO: renamed from: f */
    private final int f5952f;

    /* JADX INFO: renamed from: g */
    private final StateListDrawable f5953g;

    /* JADX INFO: renamed from: h */
    private final Drawable f5954h;

    /* JADX INFO: renamed from: i */
    private final int f5955i;

    /* JADX INFO: renamed from: j */
    private final int f5956j;

    /* JADX INFO: renamed from: k */
    int f5957k;

    /* JADX INFO: renamed from: l */
    int f5958l;

    /* JADX INFO: renamed from: m */
    float f5959m;

    /* JADX INFO: renamed from: n */
    int f5960n;

    /* JADX INFO: renamed from: o */
    int f5961o;

    /* JADX INFO: renamed from: p */
    float f5962p;

    /* JADX INFO: renamed from: s */
    private RecyclerView f5965s;

    /* JADX INFO: renamed from: z */
    final ValueAnimator f5972z;

    /* JADX INFO: renamed from: q */
    private int f5963q = 0;

    /* JADX INFO: renamed from: r */
    private int f5964r = 0;

    /* JADX INFO: renamed from: t */
    private boolean f5966t = false;

    /* JADX INFO: renamed from: u */
    private boolean f5967u = false;

    /* JADX INFO: renamed from: v */
    private int f5968v = 0;

    /* JADX INFO: renamed from: w */
    private int f5969w = 0;

    /* JADX INFO: renamed from: x */
    private final int[] f5970x = new int[2];

    /* JADX INFO: renamed from: y */
    private final int[] f5971y = new int[2];

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1225d.this.m6161q(500);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$b */
    class b extends RecyclerView.AbstractC1209t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1209t
        /* JADX INFO: renamed from: b */
        public void mo5890b(RecyclerView recyclerView, int i3, int i4) {
            C1225d.this.m6159B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$c */
    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        private boolean f5975a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5975a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5975a) {
                this.f5975a = false;
                return;
            }
            if (((Float) C1225d.this.f5972z.getAnimatedValue()).floatValue() == 0.0f) {
                C1225d c1225d = C1225d.this;
                c1225d.f5944A = 0;
                c1225d.m6165y(0);
            } else {
                C1225d c1225d2 = C1225d.this;
                c1225d2.f5944A = 2;
                c1225d2.m6164v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1225d.this.f5949c.setAlpha(iFloatValue);
            C1225d.this.f5950d.setAlpha(iFloatValue);
            C1225d.this.m6164v();
        }
    }

    C1225d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5972z = valueAnimatorOfFloat;
        this.f5944A = 0;
        this.f5945B = new a();
        this.f5946C = new b();
        this.f5949c = stateListDrawable;
        this.f5950d = drawable;
        this.f5953g = stateListDrawable2;
        this.f5954h = drawable2;
        this.f5951e = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f5952f = Math.max(i3, drawable.getIntrinsicWidth());
        this.f5955i = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f5956j = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f5947a = i4;
        this.f5948b = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        m6160j(recyclerView);
    }

    /* JADX INFO: renamed from: C */
    private void m6146C(float f3) {
        int[] iArrM6152p = m6152p();
        float fMax = Math.max(iArrM6152p[0], Math.min(iArrM6152p[1], f3));
        if (Math.abs(this.f5958l - fMax) < 2.0f) {
            return;
        }
        int iM6156x = m6156x(this.f5959m, fMax, iArrM6152p, this.f5965s.computeVerticalScrollRange(), this.f5965s.computeVerticalScrollOffset(), this.f5964r);
        if (iM6156x != 0) {
            this.f5965s.scrollBy(0, iM6156x);
        }
        this.f5959m = fMax;
    }

    /* JADX INFO: renamed from: k */
    private void m6147k() {
        this.f5965s.removeCallbacks(this.f5945B);
    }

    /* JADX INFO: renamed from: l */
    private void m6148l() {
        this.f5965s.m5585W0(this);
        this.f5965s.m5587X0(this);
        this.f5965s.m5589Y0(this.f5946C);
        m6147k();
    }

    /* JADX INFO: renamed from: m */
    private void m6149m(Canvas canvas) {
        int i3 = this.f5964r;
        int i4 = this.f5955i;
        int i5 = this.f5961o;
        int i6 = this.f5960n;
        this.f5953g.setBounds(0, 0, i6, i4);
        this.f5954h.setBounds(0, 0, this.f5963q, this.f5956j);
        canvas.translate(0.0f, i3 - i4);
        this.f5954h.draw(canvas);
        canvas.translate(i5 - (i6 / 2), 0.0f);
        this.f5953g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* JADX INFO: renamed from: n */
    private void m6150n(Canvas canvas) {
        int i3 = this.f5963q;
        int i4 = this.f5951e;
        int i5 = i3 - i4;
        int i6 = this.f5958l;
        int i7 = this.f5957k;
        int i8 = i6 - (i7 / 2);
        this.f5949c.setBounds(0, 0, i4, i7);
        this.f5950d.setBounds(0, 0, this.f5952f, this.f5964r);
        if (!m6154s()) {
            canvas.translate(i5, 0.0f);
            this.f5950d.draw(canvas);
            canvas.translate(0.0f, i8);
            this.f5949c.draw(canvas);
            canvas.translate(-i5, -i8);
            return;
        }
        this.f5950d.draw(canvas);
        canvas.translate(this.f5951e, i8);
        canvas.scale(-1.0f, 1.0f);
        this.f5949c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f5951e, -i8);
    }

    /* JADX INFO: renamed from: o */
    private int[] m6151o() {
        int[] iArr = this.f5971y;
        int i3 = this.f5948b;
        iArr[0] = i3;
        iArr[1] = this.f5963q - i3;
        return iArr;
    }

    /* JADX INFO: renamed from: p */
    private int[] m6152p() {
        int[] iArr = this.f5970x;
        int i3 = this.f5948b;
        iArr[0] = i3;
        iArr[1] = this.f5964r - i3;
        return iArr;
    }

    /* JADX INFO: renamed from: r */
    private void m6153r(float f3) {
        int[] iArrM6151o = m6151o();
        float fMax = Math.max(iArrM6151o[0], Math.min(iArrM6151o[1], f3));
        if (Math.abs(this.f5961o - fMax) < 2.0f) {
            return;
        }
        int iM6156x = m6156x(this.f5962p, fMax, iArrM6151o, this.f5965s.computeHorizontalScrollRange(), this.f5965s.computeHorizontalScrollOffset(), this.f5963q);
        if (iM6156x != 0) {
            this.f5965s.scrollBy(iM6156x, 0);
        }
        this.f5962p = fMax;
    }

    /* JADX INFO: renamed from: s */
    private boolean m6154s() {
        return AbstractC0268W.m806y(this.f5965s) == 1;
    }

    /* JADX INFO: renamed from: w */
    private void m6155w(int i3) {
        m6147k();
        this.f5965s.postDelayed(this.f5945B, i3);
    }

    /* JADX INFO: renamed from: x */
    private int m6156x(float f3, float f4, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 == 0) {
            return 0;
        }
        int i7 = i3 - i5;
        int i8 = (int) (((f4 - f3) / i6) * i7);
        int i9 = i4 + i8;
        if (i9 >= i7 || i9 < 0) {
            return 0;
        }
        return i8;
    }

    /* JADX INFO: renamed from: z */
    private void m6157z() {
        this.f5965s.m5601h(this);
        this.f5965s.m5604j(this);
        this.f5965s.m5607k(this.f5946C);
    }

    /* JADX INFO: renamed from: A */
    public void m6158A() {
        int i3 = this.f5944A;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                this.f5972z.cancel();
            }
        }
        this.f5944A = 1;
        ValueAnimator valueAnimator = this.f5972z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f5972z.setDuration(500L);
        this.f5972z.setStartDelay(0L);
        this.f5972z.start();
    }

    /* JADX INFO: renamed from: B */
    void m6159B(int i3, int i4) {
        int iComputeVerticalScrollRange = this.f5965s.computeVerticalScrollRange();
        int i5 = this.f5964r;
        this.f5966t = iComputeVerticalScrollRange - i5 > 0 && i5 >= this.f5947a;
        int iComputeHorizontalScrollRange = this.f5965s.computeHorizontalScrollRange();
        int i6 = this.f5963q;
        boolean z2 = iComputeHorizontalScrollRange - i6 > 0 && i6 >= this.f5947a;
        this.f5967u = z2;
        boolean z3 = this.f5966t;
        if (!z3 && !z2) {
            if (this.f5968v != 0) {
                m6165y(0);
                return;
            }
            return;
        }
        if (z3) {
            float f3 = i5;
            this.f5958l = (int) ((f3 * (i4 + (f3 / 2.0f))) / iComputeVerticalScrollRange);
            this.f5957k = Math.min(i5, (i5 * i5) / iComputeVerticalScrollRange);
        }
        if (this.f5967u) {
            float f4 = i6;
            this.f5961o = (int) ((f4 * (i3 + (f4 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f5960n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = this.f5968v;
        if (i7 == 0 || i7 == 1) {
            m6165y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1208s
    /* JADX INFO: renamed from: a */
    public boolean mo5886a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i3 = this.f5968v;
        if (i3 != 1) {
            return i3 == 2;
        }
        boolean zM6163u = m6163u(motionEvent.getX(), motionEvent.getY());
        boolean zM6162t = m6162t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zM6163u && !zM6162t)) {
            return false;
        }
        if (zM6162t) {
            this.f5969w = 1;
            this.f5962p = (int) motionEvent.getX();
        } else if (zM6163u) {
            this.f5969w = 2;
            this.f5959m = (int) motionEvent.getY();
        }
        m6165y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1208s
    /* JADX INFO: renamed from: b */
    public void mo5887b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5968v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM6163u = m6163u(motionEvent.getX(), motionEvent.getY());
            boolean zM6162t = m6162t(motionEvent.getX(), motionEvent.getY());
            if (zM6163u || zM6162t) {
                if (zM6162t) {
                    this.f5969w = 1;
                    this.f5962p = (int) motionEvent.getX();
                } else if (zM6163u) {
                    this.f5969w = 2;
                    this.f5959m = (int) motionEvent.getY();
                }
                m6165y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f5968v == 2) {
            this.f5959m = 0.0f;
            this.f5962p = 0.0f;
            m6165y(1);
            this.f5969w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f5968v == 2) {
            m6158A();
            if (this.f5969w == 1) {
                m6153r(motionEvent.getX());
            }
            if (this.f5969w == 2) {
                m6146C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1208s
    /* JADX INFO: renamed from: c */
    public void mo5888c(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1204o
    /* JADX INFO: renamed from: i */
    public void mo5772i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1215z c1215z) {
        if (this.f5963q != this.f5965s.getWidth() || this.f5964r != this.f5965s.getHeight()) {
            this.f5963q = this.f5965s.getWidth();
            this.f5964r = this.f5965s.getHeight();
            m6165y(0);
        } else if (this.f5944A != 0) {
            if (this.f5966t) {
                m6150n(canvas);
            }
            if (this.f5967u) {
                m6149m(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m6160j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5965s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m6148l();
        }
        this.f5965s = recyclerView;
        if (recyclerView != null) {
            m6157z();
        }
    }

    /* JADX INFO: renamed from: q */
    void m6161q(int i3) {
        int i4 = this.f5944A;
        if (i4 == 1) {
            this.f5972z.cancel();
        } else if (i4 != 2) {
            return;
        }
        this.f5944A = 3;
        ValueAnimator valueAnimator = this.f5972z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f5972z.setDuration(i3);
        this.f5972z.start();
    }

    /* JADX INFO: renamed from: t */
    boolean m6162t(float f3, float f4) {
        if (f4 < this.f5964r - this.f5955i) {
            return false;
        }
        int i3 = this.f5961o;
        int i4 = this.f5960n;
        return f3 >= ((float) (i3 - (i4 / 2))) && f3 <= ((float) (i3 + (i4 / 2)));
    }

    /* JADX INFO: renamed from: u */
    boolean m6163u(float f3, float f4) {
        if (m6154s()) {
            if (f3 > this.f5951e) {
                return false;
            }
        } else if (f3 < this.f5963q - this.f5951e) {
            return false;
        }
        int i3 = this.f5958l;
        int i4 = this.f5957k;
        return f4 >= ((float) (i3 - (i4 / 2))) && f4 <= ((float) (i3 + (i4 / 2)));
    }

    /* JADX INFO: renamed from: v */
    void m6164v() {
        this.f5965s.invalidate();
    }

    /* JADX INFO: renamed from: y */
    void m6165y(int i3) {
        if (i3 == 2 && this.f5968v != 2) {
            this.f5949c.setState(f5942D);
            m6147k();
        }
        if (i3 == 0) {
            m6164v();
        } else {
            m6158A();
        }
        if (this.f5968v == 2 && i3 != 2) {
            this.f5949c.setState(f5943E);
            m6155w(1200);
        } else if (i3 == 1) {
            m6155w(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f5968v = i3;
    }
}
