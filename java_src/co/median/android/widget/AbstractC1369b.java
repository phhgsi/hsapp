package co.median.android.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.content.AbstractC0966b;
import androidx.core.widget.AbstractC0986g;
import p027J.AbstractC0268W;
import p027J.C0227B;
import p027J.C0233E;
import p027J.InterfaceC0225A;
import p108h0.C1985a;

/* JADX INFO: renamed from: co.median.android.widget.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1369b extends ViewGroup implements InterfaceC0225A {

    /* JADX INFO: renamed from: P */
    private static final String f6771P = "b";

    /* JADX INFO: renamed from: Q */
    private static final int[] f6772Q = {R.attr.enabled};

    /* JADX INFO: renamed from: A */
    int f6773A;

    /* JADX INFO: renamed from: B */
    int f6774B;

    /* JADX INFO: renamed from: C */
    C1985a f6775C;

    /* JADX INFO: renamed from: D */
    private Animation f6776D;

    /* JADX INFO: renamed from: E */
    private Animation f6777E;

    /* JADX INFO: renamed from: F */
    private Animation f6778F;

    /* JADX INFO: renamed from: G */
    private Animation f6779G;

    /* JADX INFO: renamed from: H */
    private Animation f6780H;

    /* JADX INFO: renamed from: I */
    boolean f6781I;

    /* JADX INFO: renamed from: J */
    private int f6782J;

    /* JADX INFO: renamed from: K */
    boolean f6783K;

    /* JADX INFO: renamed from: L */
    boolean f6784L;

    /* JADX INFO: renamed from: M */
    private Animation.AnimationListener f6785M;

    /* JADX INFO: renamed from: N */
    private final Animation f6786N;

    /* JADX INFO: renamed from: O */
    private final Animation f6787O;

    /* JADX INFO: renamed from: a */
    private View f6788a;

    /* JADX INFO: renamed from: b */
    j f6789b;

    /* JADX INFO: renamed from: c */
    boolean f6790c;

    /* JADX INFO: renamed from: d */
    private int f6791d;

    /* JADX INFO: renamed from: e */
    private float f6792e;

    /* JADX INFO: renamed from: f */
    private float f6793f;

    /* JADX INFO: renamed from: g */
    private final C0233E f6794g;

    /* JADX INFO: renamed from: h */
    private final C0227B f6795h;

    /* JADX INFO: renamed from: i */
    private final int[] f6796i;

    /* JADX INFO: renamed from: j */
    private final int[] f6797j;

    /* JADX INFO: renamed from: k */
    private boolean f6798k;

    /* JADX INFO: renamed from: l */
    private int f6799l;

    /* JADX INFO: renamed from: m */
    int f6800m;

    /* JADX INFO: renamed from: n */
    private float f6801n;

    /* JADX INFO: renamed from: o */
    private float f6802o;

    /* JADX INFO: renamed from: p */
    private float f6803p;

    /* JADX INFO: renamed from: q */
    private boolean f6804q;

    /* JADX INFO: renamed from: r */
    private int f6805r;

    /* JADX INFO: renamed from: s */
    boolean f6806s;

    /* JADX INFO: renamed from: t */
    private boolean f6807t;

    /* JADX INFO: renamed from: u */
    private final DecelerateInterpolator f6808u;

    /* JADX INFO: renamed from: v */
    C1368a f6809v;

    /* JADX INFO: renamed from: w */
    private int f6810w;

    /* JADX INFO: renamed from: x */
    protected int f6811x;

    /* JADX INFO: renamed from: y */
    float f6812y;

    /* JADX INFO: renamed from: z */
    protected int f6813z;

    /* JADX INFO: renamed from: co.median.android.widget.b$a */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            AbstractC1369b abstractC1369b = AbstractC1369b.this;
            if (!abstractC1369b.f6790c) {
                abstractC1369b.m7146k();
                return;
            }
            abstractC1369b.f6775C.setAlpha(255);
            AbstractC1369b.this.f6775C.start();
            AbstractC1369b abstractC1369b2 = AbstractC1369b.this;
            if (abstractC1369b2.f6781I && (jVar = abstractC1369b2.f6789b) != null) {
                jVar.mo6935m();
            }
            AbstractC1369b abstractC1369b3 = AbstractC1369b.this;
            abstractC1369b3.f6800m = abstractC1369b3.f6809v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: co.median.android.widget.b$b */
    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f3, Transformation transformation) {
            AbstractC1369b.this.setAnimationProgress(f3);
        }
    }

    /* JADX INFO: renamed from: co.median.android.widget.b$c */
    class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f3, Transformation transformation) {
            AbstractC1369b.this.setAnimationProgress(1.0f - f3);
        }
    }

    /* JADX INFO: renamed from: co.median.android.widget.b$d */
    class d extends Animation {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f6817d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f6818e;

        d(int i3, int i4) {
            this.f6817d = i3;
            this.f6818e = i4;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f3, Transformation transformation) {
            AbstractC1369b.this.f6775C.setAlpha((int) (this.f6817d + ((this.f6818e - r0) * f3)));
        }
    }

    /* JADX INFO: renamed from: co.median.android.widget.b$e */
    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC1369b abstractC1369b = AbstractC1369b.this;
            if (abstractC1369b.f6806s) {
                return;
            }
            abstractC1369b.m7147q(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: co.median.android.widget.b$f */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f3, Transformation transformation) {
            AbstractC1369b abstractC1369b = AbstractC1369b.this;
            int iAbs = !abstractC1369b.f6783K ? abstractC1369b.f6773A - Math.abs(abstractC1369b.f6813z) : abstractC1369b.f6773A;
            AbstractC1369b abstractC1369b2 = AbstractC1369b.this;
            AbstractC1369b.this.setTargetOffsetTopAndBottom((abstractC1369b2.f6811x + ((int) ((iAbs - r1) * f3))) - abstractC1369b2.f6809v.getTop());
            AbstractC1369b.this.f6775C.m10059e(1.0f - f3);
        }
    }

    /* JADX INFO: renamed from: co.median.android.widget.b$g */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f3, Transformation transformation) {
            AbstractC1369b.this.m7145i(f3);
        }
    }

    /* JADX INFO: renamed from: co.median.android.widget.b$h */
    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f3, Transformation transformation) {
            AbstractC1369b abstractC1369b = AbstractC1369b.this;
            float f4 = abstractC1369b.f6812y;
            abstractC1369b.setAnimationProgress(f4 + ((-f4) * f3));
            AbstractC1369b.this.m7145i(f3);
        }
    }

    /* JADX INFO: renamed from: co.median.android.widget.b$i */
    public interface i {
    }

    /* JADX INFO: renamed from: co.median.android.widget.b$j */
    public interface j {
        /* JADX INFO: renamed from: m */
        void mo6935m();
    }

    public AbstractC1369b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6790c = false;
        this.f6792e = -1.0f;
        this.f6796i = new int[2];
        this.f6797j = new int[2];
        this.f6805r = -1;
        this.f6810w = -1;
        this.f6784L = false;
        this.f6785M = new a();
        this.f6786N = new f();
        this.f6787O = new g();
        this.f6791d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f6799l = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f6808u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f6782J = (int) (displayMetrics.density * 40.0f);
        m7132d();
        setChildrenDrawingOrderEnabled(true);
        int i3 = (int) (displayMetrics.density * 64.0f);
        this.f6773A = i3;
        this.f6792e = i3;
        this.f6794g = new C0233E(this);
        this.f6795h = new C0227B(this);
        setNestedScrollingEnabled(true);
        int i4 = -this.f6782J;
        this.f6800m = i4;
        this.f6813z = i4;
        m7145i(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6772Q);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m7130a(int i3, Animation.AnimationListener animationListener) {
        this.f6811x = i3;
        this.f6786N.reset();
        this.f6786N.setDuration(200L);
        this.f6786N.setInterpolator(this.f6808u);
        if (animationListener != null) {
            this.f6809v.m7128d(animationListener);
        }
        this.f6809v.clearAnimation();
        this.f6809v.startAnimation(this.f6786N);
    }

    /* JADX INFO: renamed from: b */
    private void m7131b(int i3, Animation.AnimationListener animationListener) {
        if (this.f6806s) {
            m7143r(i3, animationListener);
            return;
        }
        this.f6811x = i3;
        this.f6787O.reset();
        this.f6787O.setDuration(200L);
        this.f6787O.setInterpolator(this.f6808u);
        if (animationListener != null) {
            this.f6809v.m7128d(animationListener);
        }
        this.f6809v.clearAnimation();
        this.f6809v.startAnimation(this.f6787O);
    }

    /* JADX INFO: renamed from: d */
    private void m7132d() {
        this.f6809v = new C1368a(getContext(), -328966);
        C1985a c1985a = new C1985a(getContext());
        this.f6775C = c1985a;
        c1985a.m10064l(1);
        this.f6809v.setImageDrawable(this.f6775C);
        this.f6809v.setVisibility(8);
        addView(this.f6809v);
    }

    /* JADX INFO: renamed from: e */
    private void m7133e() {
        if (this.f6788a == null) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (!childAt.equals(this.f6809v)) {
                    this.f6788a = childAt;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m7134f(float f3) {
        if (f3 > this.f6792e) {
            m7138l(true, true);
            return;
        }
        this.f6790c = false;
        this.f6775C.m10062j(0.0f, 0.0f);
        m7131b(this.f6800m, !this.f6806s ? new e() : null);
        this.f6775C.m10058d(false);
    }

    /* JADX INFO: renamed from: g */
    private boolean m7135g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    private void m7136h(float f3) {
        this.f6775C.m10058d(true);
        float fMin = Math.min(1.0f, Math.abs(f3 / this.f6792e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f3) - this.f6792e;
        int i3 = this.f6774B;
        if (i3 <= 0) {
            i3 = this.f6783K ? this.f6773A - this.f6813z : this.f6773A;
        }
        float f4 = i3;
        double dMax = Math.max(0.0f, Math.min(fAbs, f4 * 2.0f) / f4) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i4 = this.f6813z + ((int) ((f4 * fMin) + (f4 * fPow * 2.0f)));
        if (this.f6809v.getVisibility() != 0) {
            this.f6809v.setVisibility(0);
        }
        if (!this.f6806s) {
            this.f6809v.setScaleX(1.0f);
            this.f6809v.setScaleY(1.0f);
        }
        if (this.f6806s) {
            setAnimationProgress(Math.min(1.0f, f3 / this.f6792e));
        }
        if (f3 < this.f6792e) {
            if (this.f6775C.getAlpha() > 76 && !m7135g(this.f6778F)) {
                m7142p();
            }
        } else if (this.f6775C.getAlpha() < 255 && !m7135g(this.f6779G)) {
            m7141o();
        }
        this.f6775C.m10062j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f6775C.m10059e(Math.min(1.0f, fMax));
        this.f6775C.m10061g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i4 - this.f6800m);
    }

    /* JADX INFO: renamed from: j */
    private void m7137j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6805r) {
            this.f6805r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m7138l(boolean z2, boolean z3) {
        if (this.f6790c != z2) {
            this.f6781I = z3;
            m7133e();
            this.f6790c = z2;
            if (z2) {
                m7130a(this.f6800m, this.f6785M);
            } else {
                m7147q(this.f6785M);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private Animation m7139m(int i3, int i4) {
        d dVar = new d(i3, i4);
        dVar.setDuration(300L);
        this.f6809v.m7128d(null);
        this.f6809v.clearAnimation();
        this.f6809v.startAnimation(dVar);
        return dVar;
    }

    /* JADX INFO: renamed from: n */
    private void m7140n(float f3) {
        float f4 = this.f6802o;
        float f5 = f3 - f4;
        int i3 = this.f6791d;
        if (f5 <= i3 || this.f6804q) {
            return;
        }
        this.f6801n = f4 + i3;
        this.f6804q = true;
        this.f6775C.setAlpha(76);
    }

    /* JADX INFO: renamed from: o */
    private void m7141o() {
        this.f6779G = m7139m(this.f6775C.getAlpha(), 255);
    }

    /* JADX INFO: renamed from: p */
    private void m7142p() {
        this.f6778F = m7139m(this.f6775C.getAlpha(), 76);
    }

    /* JADX INFO: renamed from: r */
    private void m7143r(int i3, Animation.AnimationListener animationListener) {
        this.f6811x = i3;
        this.f6812y = this.f6809v.getScaleX();
        h hVar = new h();
        this.f6780H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f6809v.m7128d(animationListener);
        }
        this.f6809v.clearAnimation();
        this.f6809v.startAnimation(this.f6780H);
    }

    /* JADX INFO: renamed from: s */
    private void m7144s(Animation.AnimationListener animationListener) {
        this.f6809v.setVisibility(0);
        this.f6775C.setAlpha(255);
        b bVar = new b();
        this.f6776D = bVar;
        bVar.setDuration(this.f6799l);
        if (animationListener != null) {
            this.f6809v.m7128d(animationListener);
        }
        this.f6809v.clearAnimation();
        this.f6809v.startAnimation(this.f6776D);
    }

    private void setColorViewAlpha(int i3) {
        this.f6809v.getBackground().setAlpha(i3);
        this.f6775C.setAlpha(i3);
    }

    /* JADX INFO: renamed from: c */
    public boolean mo6977c() {
        View view = this.f6788a;
        return view instanceof ListView ? AbstractC0986g.m4376a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return this.f6795h.m633a(f3, f4, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f6795h.m634b(f3, f4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.f6795h.m635c(i3, i4, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f6795h.m638f(i3, i4, i5, i6, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i3, int i4) {
        int i5 = this.f6810w;
        return i5 < 0 ? i4 : i4 == i3 + (-1) ? i5 : i4 >= i5 ? i4 + 1 : i4;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f6794g.m656a();
    }

    public int getProgressCircleDiameter() {
        return this.f6782J;
    }

    public int getProgressViewEndOffset() {
        return this.f6773A;
    }

    public int getProgressViewStartOffset() {
        return this.f6813z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f6795h.m639j();
    }

    /* JADX INFO: renamed from: i */
    void m7145i(float f3) {
        setTargetOffsetTopAndBottom((this.f6811x + ((int) ((this.f6813z - r0) * f3))) - this.f6809v.getTop());
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f6795h.m641l();
    }

    /* JADX INFO: renamed from: k */
    void m7146k() {
        this.f6809v.clearAnimation();
        this.f6775C.stop();
        this.f6809v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f6806s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f6813z - this.f6800m);
        }
        this.f6800m = this.f6809v.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7146k();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r6.m7133e()
            int r0 = r7.getActionMasked()
            boolean r1 = r6.f6807t
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r6.f6807t = r2
        L10:
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto Lc2
            boolean r1 = r6.f6807t
            if (r1 != 0) goto Lc2
            boolean r1 = r6.f6790c
            if (r1 != 0) goto Lc2
            boolean r1 = r6.f6798k
            if (r1 != 0) goto Lc2
            int r1 = r7.getPointerCount()
            r3 = 1
            if (r1 <= r3) goto L2b
            goto Lc2
        L2b:
            if (r0 == 0) goto L91
            r1 = -1
            if (r0 == r3) goto L8a
            r4 = 2
            if (r0 == r4) goto L40
            r3 = 3
            if (r0 == r3) goto L8a
            r1 = 6
            if (r0 == r1) goto L3b
            goto Lbf
        L3b:
            r6.m7137j(r7)
            goto Lbf
        L40:
            boolean r0 = r6.mo6977c()
            if (r0 != 0) goto L89
            boolean r0 = r6.f6784L
            if (r0 == 0) goto L4b
            goto L89
        L4b:
            int r0 = r6.f6805r
            if (r0 != r1) goto L57
            java.lang.String r7 = co.median.android.widget.AbstractC1369b.f6771P
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.w(r7, r0)
            return r2
        L57:
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L5e
            return r2
        L5e:
            float r1 = r7.getX()
            float r4 = r6.f6803p
            float r1 = r1 - r4
            float r4 = r7.getY()
            float r5 = r6.f6802o
            float r4 = r4 - r5
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L74
            r6.f6784L = r3
            return r2
        L74:
            float r2 = java.lang.Math.abs(r4)
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L81
            goto Lbf
        L81:
            float r7 = r7.getY(r0)
            r6.m7140n(r7)
            goto Lbf
        L89:
            return r2
        L8a:
            r6.f6784L = r2
            r6.f6804q = r2
            r6.f6805r = r1
            goto Lbf
        L91:
            boolean r0 = r6.mo6977c()
            if (r0 == 0) goto L98
            return r2
        L98:
            int r0 = r6.f6813z
            co.median.android.widget.a r1 = r6.f6809v
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r6.setTargetOffsetTopAndBottom(r0)
            int r0 = r7.getPointerId(r2)
            r6.f6805r = r0
            r6.f6804q = r2
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto Lb3
            return r2
        Lb3:
            float r1 = r7.getY(r0)
            r6.f6802o = r1
            float r7 = r7.getX(r0)
            r6.f6803p = r7
        Lbf:
            boolean r7 = r6.f6804q
            return r7
        Lc2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co.median.android.widget.AbstractC1369b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f6788a == null) {
            m7133e();
        }
        View view = this.f6788a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f6809v.getMeasuredWidth();
        int measuredHeight2 = this.f6809v.getMeasuredHeight();
        int i7 = measuredWidth / 2;
        int i8 = measuredWidth2 / 2;
        int i9 = this.f6800m;
        this.f6809v.layout(i7 - i8, i9, i7 + i8, measuredHeight2 + i9);
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f6788a == null) {
            m7133e();
        }
        View view = this.f6788a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f6809v.measure(View.MeasureSpec.makeMeasureSpec(this.f6782J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f6782J, 1073741824));
        this.f6810w = -1;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) == this.f6809v) {
                this.f6810w = i5;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        return dispatchNestedFling(f3, f4, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return dispatchNestedPreFling(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        if (i4 > 0) {
            float f3 = this.f6793f;
            if (f3 > 0.0f) {
                float f4 = i4;
                if (f4 > f3) {
                    iArr[1] = i4 - ((int) f3);
                    this.f6793f = 0.0f;
                } else {
                    this.f6793f = f3 - f4;
                    iArr[1] = i4;
                }
                m7136h(this.f6793f);
            }
        }
        if (this.f6783K && i4 > 0 && this.f6793f == 0.0f && Math.abs(i4 - iArr[1]) > 0) {
            this.f6809v.setVisibility(8);
        }
        int[] iArr2 = this.f6796i;
        if (dispatchNestedPreScroll(i3 - iArr[0], i4 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        dispatchNestedScroll(i3, i4, i5, i6, this.f6797j);
        if (i6 + this.f6797j[1] >= 0 || mo6977c()) {
            return;
        }
        float fAbs = this.f6793f + Math.abs(r11);
        this.f6793f = fAbs;
        m7136h(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f6794g.m657b(view, view2, i3);
        startNestedScroll(i3 & 2);
        this.f6793f = 0.0f;
        this.f6798k = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i3) {
        return (!isEnabled() || this.f6807t || this.f6790c || (i3 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f6794g.m659d(view);
        this.f6798k = false;
        float f3 = this.f6793f;
        if (f3 > 0.0f) {
            m7134f(f3);
            this.f6793f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6807t && actionMasked == 0) {
            this.f6807t = false;
        }
        if (!isEnabled() || this.f6807t || mo6977c() || this.f6790c || this.f6798k) {
            return false;
        }
        if (actionMasked == 0) {
            this.f6805r = motionEvent.getPointerId(0);
            this.f6804q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f6805r);
                if (iFindPointerIndex < 0) {
                    Log.w(f6771P, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f6804q) {
                    float y2 = (motionEvent.getY(iFindPointerIndex) - this.f6801n) * 0.5f;
                    this.f6804q = false;
                    m7134f(y2);
                }
                this.f6805r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f6805r);
                if (iFindPointerIndex2 < 0) {
                    Log.w(f6771P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                if (Math.abs(motionEvent.getY() - this.f6802o) >= Math.abs(motionEvent.getX() - this.f6803p)) {
                    float y3 = motionEvent.getY(iFindPointerIndex2);
                    m7140n(y3);
                    if (this.f6804q) {
                        float f3 = (y3 - this.f6801n) * 0.5f;
                        if (f3 <= 0.0f) {
                            return false;
                        }
                        m7136h(f3);
                    }
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.w(f6771P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f6805r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m7137j(motionEvent);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    void m7147q(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f6777E = cVar;
        cVar.setDuration(150L);
        this.f6809v.m7128d(animationListener);
        this.f6809v.clearAnimation();
        this.f6809v.startAnimation(this.f6777E);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        View view = this.f6788a;
        if (view == null || AbstractC0268W.m747P(view)) {
            super.requestDisallowInterceptTouchEvent(z2);
        }
    }

    void setAnimationProgress(float f3) {
        this.f6809v.setScaleX(f3);
        this.f6809v.setScaleY(f3);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m7133e();
        this.f6775C.m10060f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr2[i3] = AbstractC0966b.getColor(context, iArr[i3]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i3) {
        this.f6792e = i3;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (z2) {
            return;
        }
        m7146k();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        this.f6795h.m642m(z2);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f6789b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i3) {
        setProgressBackgroundColorSchemeResource(i3);
    }

    public void setProgressBackgroundColorSchemeColor(int i3) {
        this.f6809v.setBackgroundColor(i3);
    }

    public void setProgressBackgroundColorSchemeResource(int i3) {
        setProgressBackgroundColorSchemeColor(AbstractC0966b.getColor(getContext(), i3));
    }

    public void setRefreshing(boolean z2) {
        if (!z2 || this.f6790c == z2) {
            m7138l(z2, false);
            return;
        }
        this.f6790c = z2;
        setTargetOffsetTopAndBottom((!this.f6783K ? this.f6773A + this.f6813z : this.f6773A) - this.f6800m);
        this.f6781I = false;
        m7144s(this.f6785M);
    }

    public void setSize(int i3) {
        if (i3 == 0 || i3 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i3 == 0) {
                this.f6782J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f6782J = (int) (displayMetrics.density * 40.0f);
            }
            this.f6809v.setImageDrawable(null);
            this.f6775C.m10064l(i3);
            this.f6809v.setImageDrawable(this.f6775C);
        }
    }

    public void setSlingshotDistance(int i3) {
        this.f6774B = i3;
    }

    void setTargetOffsetTopAndBottom(int i3) {
        this.f6809v.bringToFront();
        AbstractC0268W.m751T(this.f6809v, i3);
        this.f6800m = this.f6809v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i3) {
        return this.f6795h.m643o(i3);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f6795h.m645q();
    }
}
