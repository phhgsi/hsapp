package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p027J.AbstractC0268W;

/* JADX INFO: renamed from: androidx.core.widget.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0980a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    private static final int f4705r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c */
    final View f4708c;

    /* JADX INFO: renamed from: d */
    private Runnable f4709d;

    /* JADX INFO: renamed from: g */
    private int f4712g;

    /* JADX INFO: renamed from: h */
    private int f4713h;

    /* JADX INFO: renamed from: l */
    private boolean f4717l;

    /* JADX INFO: renamed from: m */
    boolean f4718m;

    /* JADX INFO: renamed from: n */
    boolean f4719n;

    /* JADX INFO: renamed from: o */
    boolean f4720o;

    /* JADX INFO: renamed from: p */
    private boolean f4721p;

    /* JADX INFO: renamed from: q */
    private boolean f4722q;

    /* JADX INFO: renamed from: a */
    final a f4706a = new a();

    /* JADX INFO: renamed from: b */
    private final Interpolator f4707b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e */
    private float[] f4710e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f */
    private float[] f4711f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i */
    private float[] f4714i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j */
    private float[] f4715j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k */
    private float[] f4716k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private int f4723a;

        /* JADX INFO: renamed from: b */
        private int f4724b;

        /* JADX INFO: renamed from: c */
        private float f4725c;

        /* JADX INFO: renamed from: d */
        private float f4726d;

        /* JADX INFO: renamed from: j */
        private float f4732j;

        /* JADX INFO: renamed from: k */
        private int f4733k;

        /* JADX INFO: renamed from: e */
        private long f4727e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i */
        private long f4731i = -1;

        /* JADX INFO: renamed from: f */
        private long f4728f = 0;

        /* JADX INFO: renamed from: g */
        private int f4729g = 0;

        /* JADX INFO: renamed from: h */
        private int f4730h = 0;

        a() {
        }

        /* JADX INFO: renamed from: e */
        private float m4332e(long j3) {
            if (j3 < this.f4727e) {
                return 0.0f;
            }
            long j4 = this.f4731i;
            if (j4 < 0 || j3 < j4) {
                return AbstractViewOnTouchListenerC0980a.m4311e((j3 - r0) / this.f4723a, 0.0f, 1.0f) * 0.5f;
            }
            float f3 = this.f4732j;
            return (1.0f - f3) + (f3 * AbstractViewOnTouchListenerC0980a.m4311e((j3 - j4) / this.f4733k, 0.0f, 1.0f));
        }

        /* JADX INFO: renamed from: g */
        private float m4333g(float f3) {
            return ((-4.0f) * f3 * f3) + (f3 * 4.0f);
        }

        /* JADX INFO: renamed from: a */
        public void m4334a() {
            if (this.f4728f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM4333g = m4333g(m4332e(jCurrentAnimationTimeMillis));
            long j3 = jCurrentAnimationTimeMillis - this.f4728f;
            this.f4728f = jCurrentAnimationTimeMillis;
            float f3 = j3 * fM4333g;
            this.f4729g = (int) (this.f4725c * f3);
            this.f4730h = (int) (f3 * this.f4726d);
        }

        /* JADX INFO: renamed from: b */
        public int m4335b() {
            return this.f4729g;
        }

        /* JADX INFO: renamed from: c */
        public int m4336c() {
            return this.f4730h;
        }

        /* JADX INFO: renamed from: d */
        public int m4337d() {
            float f3 = this.f4725c;
            return (int) (f3 / Math.abs(f3));
        }

        /* JADX INFO: renamed from: f */
        public int m4338f() {
            float f3 = this.f4726d;
            return (int) (f3 / Math.abs(f3));
        }

        /* JADX INFO: renamed from: h */
        public boolean m4339h() {
            return this.f4731i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f4731i + ((long) this.f4733k);
        }

        /* JADX INFO: renamed from: i */
        public void m4340i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4733k = AbstractViewOnTouchListenerC0980a.m4312f((int) (jCurrentAnimationTimeMillis - this.f4727e), 0, this.f4724b);
            this.f4732j = m4332e(jCurrentAnimationTimeMillis);
            this.f4731i = jCurrentAnimationTimeMillis;
        }

        /* JADX INFO: renamed from: j */
        public void m4341j(int i3) {
            this.f4724b = i3;
        }

        /* JADX INFO: renamed from: k */
        public void m4342k(int i3) {
            this.f4723a = i3;
        }

        /* JADX INFO: renamed from: l */
        public void m4343l(float f3, float f4) {
            this.f4725c = f3;
            this.f4726d = f4;
        }

        /* JADX INFO: renamed from: m */
        public void m4344m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4727e = jCurrentAnimationTimeMillis;
            this.f4731i = -1L;
            this.f4728f = jCurrentAnimationTimeMillis;
            this.f4732j = 0.5f;
            this.f4729g = 0;
            this.f4730h = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.a$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0980a abstractViewOnTouchListenerC0980a = AbstractViewOnTouchListenerC0980a.this;
            if (abstractViewOnTouchListenerC0980a.f4720o) {
                if (abstractViewOnTouchListenerC0980a.f4718m) {
                    abstractViewOnTouchListenerC0980a.f4718m = false;
                    abstractViewOnTouchListenerC0980a.f4706a.m4344m();
                }
                a aVar = AbstractViewOnTouchListenerC0980a.this.f4706a;
                if (aVar.m4339h() || !AbstractViewOnTouchListenerC0980a.this.m4331u()) {
                    AbstractViewOnTouchListenerC0980a.this.f4720o = false;
                    return;
                }
                AbstractViewOnTouchListenerC0980a abstractViewOnTouchListenerC0980a2 = AbstractViewOnTouchListenerC0980a.this;
                if (abstractViewOnTouchListenerC0980a2.f4719n) {
                    abstractViewOnTouchListenerC0980a2.f4719n = false;
                    abstractViewOnTouchListenerC0980a2.m4319c();
                }
                aVar.m4334a();
                AbstractViewOnTouchListenerC0980a.this.mo4320j(aVar.m4335b(), aVar.m4336c());
                AbstractC0268W.m759a0(AbstractViewOnTouchListenerC0980a.this.f4708c, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0980a(View view) {
        this.f4708c = view;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = (int) ((1575.0f * f3) + 0.5f);
        m4325o(f4, f4);
        float f5 = (int) ((f3 * 315.0f) + 0.5f);
        m4326p(f5, f5);
        m4322l(1);
        m4324n(Float.MAX_VALUE, Float.MAX_VALUE);
        m4329s(0.2f, 0.2f);
        m4330t(1.0f, 1.0f);
        m4321k(f4705r);
        m4328r(500);
        m4327q(500);
    }

    /* JADX INFO: renamed from: d */
    private float m4310d(int i3, float f3, float f4, float f5) {
        float fM4314h = m4314h(this.f4710e[i3], f4, this.f4711f[i3], f3);
        if (fM4314h == 0.0f) {
            return 0.0f;
        }
        float f6 = this.f4714i[i3];
        float f7 = this.f4715j[i3];
        float f8 = this.f4716k[i3];
        float f9 = f6 * f5;
        return fM4314h > 0.0f ? m4311e(fM4314h * f9, f7, f8) : -m4311e((-fM4314h) * f9, f7, f8);
    }

    /* JADX INFO: renamed from: e */
    static float m4311e(float f3, float f4, float f5) {
        return f3 > f5 ? f5 : f3 < f4 ? f4 : f3;
    }

    /* JADX INFO: renamed from: f */
    static int m4312f(int i3, int i4, int i5) {
        return i3 > i5 ? i5 : i3 < i4 ? i4 : i3;
    }

    /* JADX INFO: renamed from: g */
    private float m4313g(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i3 = this.f4712g;
        if (i3 == 0 || i3 == 1) {
            if (f3 < f4) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f4);
                }
                if (this.f4720o && i3 == 1) {
                    return 1.0f;
                }
            }
        } else if (i3 == 2 && f3 < 0.0f) {
            return f3 / (-f4);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    private float m4314h(float f3, float f4, float f5, float f6) {
        float interpolation;
        float fM4311e = m4311e(f3 * f4, 0.0f, f5);
        float fM4313g = m4313g(f4 - f6, fM4311e) - m4313g(f6, fM4311e);
        if (fM4313g < 0.0f) {
            interpolation = -this.f4707b.getInterpolation(-fM4313g);
        } else {
            if (fM4313g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f4707b.getInterpolation(fM4313g);
        }
        return m4311e(interpolation, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: i */
    private void m4315i() {
        if (this.f4718m) {
            this.f4720o = false;
        } else {
            this.f4706a.m4340i();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m4316v() {
        int i3;
        if (this.f4709d == null) {
            this.f4709d = new b();
        }
        this.f4720o = true;
        this.f4718m = true;
        if (this.f4717l || (i3 = this.f4713h) <= 0) {
            this.f4709d.run();
        } else {
            AbstractC0268W.m761b0(this.f4708c, this.f4709d, i3);
        }
        this.f4717l = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo4317a(int i3);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo4318b(int i3);

    /* JADX INFO: renamed from: c */
    void m4319c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f4708c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo4320j(int i3, int i4);

    /* JADX INFO: renamed from: k */
    public AbstractViewOnTouchListenerC0980a m4321k(int i3) {
        this.f4713h = i3;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public AbstractViewOnTouchListenerC0980a m4322l(int i3) {
        this.f4712g = i3;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public AbstractViewOnTouchListenerC0980a m4323m(boolean z2) {
        if (this.f4721p && !z2) {
            m4315i();
        }
        this.f4721p = z2;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public AbstractViewOnTouchListenerC0980a m4324n(float f3, float f4) {
        float[] fArr = this.f4711f;
        fArr[0] = f3;
        fArr[1] = f4;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public AbstractViewOnTouchListenerC0980a m4325o(float f3, float f4) {
        float[] fArr = this.f4716k;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f4721p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m4315i()
            goto L58
        L1a:
            r5.f4719n = r2
            r5.f4717l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4708c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m4310d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4708c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m4310d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f4706a
            r7.m4343l(r0, r6)
            boolean r6 = r5.f4720o
            if (r6 != 0) goto L58
            boolean r6 = r5.m4331u()
            if (r6 == 0) goto L58
            r5.m4316v()
        L58:
            boolean r6 = r5.f4722q
            if (r6 == 0) goto L61
            boolean r6 = r5.f4720o
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC0980a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    public AbstractViewOnTouchListenerC0980a m4326p(float f3, float f4) {
        float[] fArr = this.f4715j;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public AbstractViewOnTouchListenerC0980a m4327q(int i3) {
        this.f4706a.m4341j(i3);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public AbstractViewOnTouchListenerC0980a m4328r(int i3) {
        this.f4706a.m4342k(i3);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public AbstractViewOnTouchListenerC0980a m4329s(float f3, float f4) {
        float[] fArr = this.f4710e;
        fArr[0] = f3;
        fArr[1] = f4;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public AbstractViewOnTouchListenerC0980a m4330t(float f3, float f4) {
        float[] fArr = this.f4714i;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: u */
    boolean m4331u() {
        a aVar = this.f4706a;
        int iM4338f = aVar.m4338f();
        int iM4337d = aVar.m4337d();
        if (iM4338f == 0 || !mo4318b(iM4338f)) {
            return iM4337d != 0 && mo4317a(iM4337d);
        }
        return true;
    }
}
