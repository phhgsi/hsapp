package co.median.android.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import co.median.android.jrejze.R;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p128m0.AbstractC2182U0;
import p164y.AbstractC2538k;

/* JADX INFO: loaded from: classes.dex */
public final class SwipeHistoryNavigationLayout extends FrameLayout {

    /* JADX INFO: renamed from: A */
    private float f6732A;

    /* JADX INFO: renamed from: B */
    private boolean f6733B;

    /* JADX INFO: renamed from: C */
    private float f6734C;

    /* JADX INFO: renamed from: D */
    private float f6735D;

    /* JADX INFO: renamed from: E */
    private boolean f6736E;

    /* JADX INFO: renamed from: F */
    private InterfaceC1366a f6737F;

    /* JADX INFO: renamed from: a */
    private final C1374g f6738a;

    /* JADX INFO: renamed from: b */
    private final C1374g f6739b;

    /* JADX INFO: renamed from: c */
    private final EdgeEffect f6740c;

    /* JADX INFO: renamed from: d */
    private final float f6741d;

    /* JADX INFO: renamed from: e */
    private final float f6742e;

    /* JADX INFO: renamed from: f */
    private final Drawable f6743f;

    /* JADX INFO: renamed from: g */
    private final Drawable f6744g;

    /* JADX INFO: renamed from: h */
    private final Drawable f6745h;

    /* JADX INFO: renamed from: i */
    private final String f6746i;

    /* JADX INFO: renamed from: j */
    private final int f6747j;

    /* JADX INFO: renamed from: k */
    private int f6748k;

    /* JADX INFO: renamed from: l */
    private float f6749l;

    /* JADX INFO: renamed from: m */
    private float f6750m;

    /* JADX INFO: renamed from: n */
    private float f6751n;

    /* JADX INFO: renamed from: o */
    private float f6752o;

    /* JADX INFO: renamed from: p */
    private float f6753p;

    /* JADX INFO: renamed from: q */
    private float f6754q;

    /* JADX INFO: renamed from: r */
    private float f6755r;

    /* JADX INFO: renamed from: s */
    private float f6756s;

    /* JADX INFO: renamed from: t */
    private float f6757t;

    /* JADX INFO: renamed from: u */
    private int f6758u;

    /* JADX INFO: renamed from: v */
    private boolean f6759v;

    /* JADX INFO: renamed from: w */
    private boolean f6760w;

    /* JADX INFO: renamed from: x */
    private boolean f6761x;

    /* JADX INFO: renamed from: y */
    private float f6762y;

    /* JADX INFO: renamed from: z */
    private float f6763z;

    /* JADX INFO: renamed from: co.median.android.widget.SwipeHistoryNavigationLayout$a */
    public interface InterfaceC1366a {
        /* JADX INFO: renamed from: a */
        boolean mo6956a();

        /* JADX INFO: renamed from: b */
        boolean mo6957b();

        /* JADX INFO: renamed from: c */
        boolean mo6958c();

        /* JADX INFO: renamed from: d */
        void mo6959d();

        /* JADX INFO: renamed from: e */
        void mo6960e();

        /* JADX INFO: renamed from: f */
        String mo6961f();

        /* JADX INFO: renamed from: g */
        boolean mo6962g();

        /* JADX INFO: renamed from: h */
        boolean mo6963h();
    }

    /* JADX INFO: renamed from: co.median.android.widget.SwipeHistoryNavigationLayout$b */
    public static final class C1367b implements InterfaceC1366a {
        C1367b() {
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: a */
        public boolean mo6956a() {
            return true;
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: b */
        public boolean mo6957b() {
            return true;
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: c */
        public boolean mo6958c() {
            return true;
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: d */
        public void mo6959d() {
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: e */
        public void mo6960e() {
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: f */
        public String mo6961f() {
            return "";
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: g */
        public boolean mo6962g() {
            return true;
        }

        @Override // co.median.android.widget.SwipeHistoryNavigationLayout.InterfaceC1366a
        /* JADX INFO: renamed from: h */
        public boolean mo6963h() {
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeHistoryNavigationLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC0606k.m2145e(context, "context");
    }

    /* JADX INFO: renamed from: a */
    private final boolean m7116a(float f3) {
        return f3 <= this.f6751n;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m7117b(float f3) {
        return f3 >= this.f6752o;
    }

    /* JADX INFO: renamed from: c */
    private final void m7118c() {
        if (this.f6759v) {
            this.f6738a.m7158i();
            this.f6738a.m7157g();
        } else if (this.f6760w) {
            this.f6739b.m7158i();
            this.f6739b.m7157g();
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m7119d() {
        this.f6738a.setText(this.f6737F.mo6961f());
    }

    /* JADX INFO: renamed from: e */
    private final void m7120e() {
        C1374g c1374g = this.f6738a;
        float f3 = (this.f6732A - this.f6757t) - this.f6758u;
        float f4 = this.f6741d;
        c1374g.setTranslationX(Math.min(f3 - f4, this.f6753p - f4));
    }

    /* JADX INFO: renamed from: f */
    private final void m7121f() {
        this.f6739b.setTranslationX(Math.max((this.f6758u - (this.f6732A - this.f6757t)) + (this.f6741d / 2), getWidth() - this.f6753p));
    }

    /* JADX INFO: renamed from: g */
    private final boolean m7122g() {
        this.f6740c.onRelease();
        boolean z2 = this.f6759v;
        Property property = View.TRANSLATION_X;
        if (z2) {
            if (this.f6733B) {
                m7118c();
                this.f6737F.mo6957b();
            }
            C1374g c1374g = this.f6738a;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1374g, (Property<C1374g, Float>) property, c1374g.getTranslationX(), this.f6749l);
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.start();
        } else if (this.f6760w) {
            if (this.f6733B) {
                m7118c();
                this.f6737F.mo6962g();
            }
            C1374g c1374g2 = this.f6739b;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1374g2, (Property<C1374g, Float>) property, c1374g2.getTranslationX(), this.f6750m);
            objectAnimatorOfFloat2.setDuration(400L);
            objectAnimatorOfFloat2.start();
        }
        this.f6759v = false;
        this.f6760w = false;
        this.f6733B = false;
        this.f6761x = false;
        return this.f6740c.isFinished();
    }

    /* JADX INFO: renamed from: h */
    private final void m7123h() {
    }

    /* JADX INFO: renamed from: i */
    private final void m7124i() {
        if (this.f6759v && this.f6737F.mo6963h()) {
            this.f6737F.mo6960e();
            this.f6738a.m7156e();
            this.f6738a.m7159k();
        } else if (this.f6760w && this.f6737F.mo6956a()) {
            this.f6737F.mo6959d();
            this.f6739b.m7156e();
            this.f6739b.m7159k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            java.lang.String r0 = "canvas"
            p071X1.AbstractC0606k.m2145e(r6, r0)
            super.draw(r6)
            int r0 = r5.getOverScrollMode()
            if (r0 == 0) goto L1c
            int r0 = r5.getOverScrollMode()
            r1 = 1
            if (r0 != r1) goto L16
            goto L1c
        L16:
            android.widget.EdgeEffect r6 = r5.f6740c
            r6.finish()
            goto L58
        L1c:
            android.widget.EdgeEffect r0 = r5.f6740c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L58
            int r0 = r6.save()
            int r1 = r5.getWidth()
            int r2 = r5.getHeight()
            int r3 = r5.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            r3 = 1119092736(0x42b40000, float:90.0)
            r6.rotate(r3)
            int r3 = r5.getPaddingTop()
            float r3 = (float) r3
            float r4 = (float) r1
            float r4 = -r4
            r6.translate(r3, r4)
            android.widget.EdgeEffect r3 = r5.f6740c
            r3.setSize(r2, r1)
            android.widget.EdgeEffect r1 = r5.f6740c
            boolean r1 = r1.draw(r6)
            r6.restoreToCount(r0)
            goto L59
        L58:
            r1 = 0
        L59:
            if (r1 == 0) goto L5e
            p027J.AbstractC0268W.m757Z(r5)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.median.android.widget.SwipeHistoryNavigationLayout.draw(android.graphics.Canvas):void");
    }

    public final InterfaceC1366a getSwipeNavListener() {
        return this.f6737F;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        addView(this.f6738a, new FrameLayout.LayoutParams(-2, -2, 19));
        addView(this.f6739b, new FrameLayout.LayoutParams(-2, -2, 16));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f6737F.mo6958c()) {
            return false;
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.f6736E = false;
            this.f6734C = motionEvent.getX();
            this.f6735D = motionEvent.getY();
            if (m7116a(motionEvent.getX()) && this.f6737F.mo6963h()) {
                this.f6759v = true;
                this.f6758u = (int) motionEvent.getX();
                m7119d();
            } else if (m7117b(motionEvent.getX()) && this.f6737F.mo6956a()) {
                this.f6760w = true;
                this.f6758u = getWidth();
                m7123h();
            }
        } else {
            if (numValueOf != null && numValueOf.intValue() == 2) {
                float fAbs = Math.abs(this.f6734C - motionEvent.getX());
                float fAbs2 = Math.abs(this.f6735D - motionEvent.getY());
                if (this.f6761x) {
                    return true;
                }
                if (this.f6759v || this.f6760w) {
                    float f3 = this.f6757t;
                    if ((fAbs > f3 || fAbs2 > f3) && !this.f6736E) {
                        this.f6736E = true;
                        if (((float) Math.atan2(fAbs2, fAbs)) > 0.5235987755982988d) {
                            return false;
                        }
                        this.f6761x = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
                return false;
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                this.f6734C = 0.0f;
                this.f6735D = 0.0f;
                this.f6759v = false;
                this.f6760w = false;
                if (this.f6761x) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        if (z2) {
            C1374g c1374g = this.f6738a;
            float f3 = -this.f6741d;
            this.f6749l = f3;
            c1374g.setTranslationX(f3);
            C1374g c1374g2 = this.f6739b;
            float width = getWidth() + this.f6741d;
            this.f6750m = width;
            c1374g2.setTranslationX(width);
            this.f6751n = getWidth() * this.f6754q;
            this.f6752o = getWidth() - this.f6751n;
            this.f6753p = getWidth() * this.f6755r;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            if (r7 == 0) goto Lb
            int r0 = r7.getAction()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            goto La3
        L12:
            int r3 = r0.intValue()
            r4 = 2
            if (r3 != r4) goto La3
            float r0 = r7.getX()
            r6.f6762y = r0
            float r3 = r6.f6732A
            r6.f6763z = r3
            int r3 = r6.f6758u
            float r3 = (float) r3
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            r6.f6732A = r0
            boolean r0 = r6.f6759v
            if (r0 == 0) goto L45
            co.median.android.widget.SwipeHistoryNavigationLayout$a r0 = r6.f6737F
            boolean r0 = r0.mo6958c()
            if (r0 == 0) goto L45
            float r0 = r6.f6732A
            float r3 = r6.f6757t
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L45
            r6.m7120e()
            goto L7f
        L45:
            boolean r0 = r6.f6760w
            if (r0 == 0) goto L7f
            co.median.android.widget.SwipeHistoryNavigationLayout$a r0 = r6.f6737F
            boolean r0 = r0.mo6958c()
            if (r0 == 0) goto L7f
            float r0 = r6.f6732A
            float r3 = r6.f6757t
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L7f
            co.median.android.widget.SwipeHistoryNavigationLayout$a r0 = r6.f6737F
            boolean r0 = r0.mo6956a()
            if (r0 == 0) goto L65
            r6.m7121f()
            goto L7f
        L65:
            float r0 = r6.f6732A
            float r3 = r6.f6763z
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L7f
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            android.widget.EdgeEffect r3 = r6.f6740c
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r0 = r0 / r4
            r3.onPull(r0)
            r0 = r1
            goto L80
        L7f:
            r0 = r2
        L80:
            float r3 = r6.f6732A
            float r4 = r6.f6753p
            float r5 = r6.f6756s
            float r4 = r4 + r5
            float r5 = r6.f6742e
            float r4 = r4 + r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L98
            boolean r2 = r6.f6733B
            if (r2 != 0) goto La1
            r6.f6733B = r1
            r6.m7124i()
            goto La1
        L98:
            boolean r1 = r6.f6733B
            if (r1 == 0) goto La1
            r6.f6733B = r2
            r6.m7118c()
        La1:
            r2 = r0
            goto Lb8
        La3:
            if (r0 != 0) goto La6
            goto Lb8
        La6:
            int r0 = r0.intValue()
            if (r0 != r1) goto Lb8
            boolean r0 = r6.m7122g()
            android.view.ViewParent r1 = r6.getParent()
            r1.requestDisallowInterceptTouchEvent(r2)
            goto La1
        Lb8:
            if (r2 == 0) goto Lbd
            p027J.AbstractC0268W.m757Z(r6)
        Lbd:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.median.android.widget.SwipeHistoryNavigationLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setActiveColor(int i3) {
        this.f6748k = i3;
        this.f6739b.setActiveColor(i3);
        this.f6738a.setActiveColor(i3);
    }

    public final void setSwipeNavListener(InterfaceC1366a interfaceC1366a) {
        AbstractC0606k.m2145e(interfaceC1366a, "<set-?>");
        this.f6737F = interfaceC1366a;
    }

    public /* synthetic */ SwipeHistoryNavigationLayout(Context context, AttributeSet attributeSet, int i3, int i4, AbstractC0602g abstractC0602g) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeHistoryNavigationLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        AbstractC0606k.m2145e(context, "context");
        float dimension = getResources().getDimension(R.dimen.handle_icon_size);
        this.f6741d = dimension;
        this.f6742e = dimension / (getContext().getResources().getDisplayMetrics().densityDpi / 160);
        this.f6749l = Float.NaN;
        this.f6750m = Float.NaN;
        this.f6751n = Float.NaN;
        this.f6752o = Float.NaN;
        this.f6753p = Float.NaN;
        this.f6754q = 0.05f;
        this.f6755r = 0.16f;
        this.f6756s = 80.0f;
        this.f6757t = 30.0f;
        this.f6758u = Integer.MIN_VALUE;
        this.f6762y = Float.NaN;
        this.f6763z = Float.NaN;
        this.f6732A = Float.NaN;
        this.f6737F = new C1367b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2182U0.f10153g2, 0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f6743f = drawable;
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        Drawable drawableM12140f = drawable2 == null ? AbstractC2538k.m12140f(typedArrayObtainStyledAttributes.getResources(), R.drawable.ic_baseline_arrow_back_24, context.getTheme()) : drawable2;
        this.f6744g = drawableM12140f;
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(5);
        drawable3 = drawable3 == null ? AbstractC2538k.m12140f(typedArrayObtainStyledAttributes.getResources(), R.drawable.ic_baseline_arrow_forward_24, context.getTheme()) : drawable3;
        this.f6745h = drawable3;
        String string = typedArrayObtainStyledAttributes.getString(4);
        String str = string == null ? "" : string;
        this.f6746i = str;
        int color = typedArrayObtainStyledAttributes.getColor(2, AbstractC2538k.m12138d(typedArrayObtainStyledAttributes.getResources(), R.color.swipe_nav_inactive, context.getTheme()));
        this.f6747j = color;
        this.f6748k = typedArrayObtainStyledAttributes.getColor(0, AbstractC2538k.m12138d(typedArrayObtainStyledAttributes.getResources(), R.color.swipe_nav_active, context.getTheme()));
        this.f6738a = new C1374g(context, drawable, drawableM12140f, str, color, this.f6748k);
        this.f6739b = new C1374g(context, drawable, drawable3, "", color, this.f6748k);
        this.f6740c = new EdgeEffect(context);
        setWillNotDraw(false);
    }
}
