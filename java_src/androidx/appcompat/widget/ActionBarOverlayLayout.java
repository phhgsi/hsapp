package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC0791j;
import com.google.android.gms.common.api.Api;
import p027J.AbstractC0268W;
import p027J.C0233E;
import p027J.C0318w0;
import p027J.InterfaceC0229C;
import p027J.InterfaceC0231D;
import p091d.AbstractC1760a;
import p091d.AbstractC1765f;
import p167z.C2572e;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0830G, InterfaceC0229C, InterfaceC0231D {

    /* JADX INFO: renamed from: G */
    static final int[] f3132G = {AbstractC1760a.f8701b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: H */
    private static final C0318w0 f3133H = new C0318w0.a().m1103d(C2572e.m12271b(0, 1, 0, 1)).m1100a();

    /* JADX INFO: renamed from: I */
    private static final Rect f3134I = new Rect();

    /* JADX INFO: renamed from: A */
    ViewPropertyAnimator f3135A;

    /* JADX INFO: renamed from: B */
    final AnimatorListenerAdapter f3136B;

    /* JADX INFO: renamed from: C */
    private final Runnable f3137C;

    /* JADX INFO: renamed from: D */
    private final Runnable f3138D;

    /* JADX INFO: renamed from: E */
    private final C0233E f3139E;

    /* JADX INFO: renamed from: F */
    private final C0803f f3140F;

    /* JADX INFO: renamed from: a */
    private int f3141a;

    /* JADX INFO: renamed from: b */
    private int f3142b;

    /* JADX INFO: renamed from: c */
    private ContentFrameLayout f3143c;

    /* JADX INFO: renamed from: d */
    ActionBarContainer f3144d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0831H f3145e;

    /* JADX INFO: renamed from: f */
    private Drawable f3146f;

    /* JADX INFO: renamed from: g */
    private boolean f3147g;

    /* JADX INFO: renamed from: h */
    private boolean f3148h;

    /* JADX INFO: renamed from: i */
    private boolean f3149i;

    /* JADX INFO: renamed from: j */
    boolean f3150j;

    /* JADX INFO: renamed from: k */
    private int f3151k;

    /* JADX INFO: renamed from: l */
    private int f3152l;

    /* JADX INFO: renamed from: m */
    private final Rect f3153m;

    /* JADX INFO: renamed from: n */
    private final Rect f3154n;

    /* JADX INFO: renamed from: o */
    private final Rect f3155o;

    /* JADX INFO: renamed from: p */
    private final Rect f3156p;

    /* JADX INFO: renamed from: q */
    private final Rect f3157q;

    /* JADX INFO: renamed from: r */
    private final Rect f3158r;

    /* JADX INFO: renamed from: s */
    private final Rect f3159s;

    /* JADX INFO: renamed from: t */
    private final Rect f3160t;

    /* JADX INFO: renamed from: u */
    private C0318w0 f3161u;

    /* JADX INFO: renamed from: v */
    private C0318w0 f3162v;

    /* JADX INFO: renamed from: w */
    private C0318w0 f3163w;

    /* JADX INFO: renamed from: x */
    private C0318w0 f3164x;

    /* JADX INFO: renamed from: y */
    private InterfaceC0801d f3165y;

    /* JADX INFO: renamed from: z */
    private OverScroller f3166z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0798a extends AnimatorListenerAdapter {
        C0798a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3135A = null;
            actionBarOverlayLayout.f3150j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3135A = null;
            actionBarOverlayLayout.f3150j = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class RunnableC0799b implements Runnable {
        RunnableC0799b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m3291v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3135A = actionBarOverlayLayout.f3144d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f3136B);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class RunnableC0800c implements Runnable {
        RunnableC0800c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m3291v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3135A = actionBarOverlayLayout.f3144d.animate().translationY(-ActionBarOverlayLayout.this.f3144d.getHeight()).setListener(ActionBarOverlayLayout.this.f3136B);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0801d {
        /* JADX INFO: renamed from: a */
        void mo2748a();

        /* JADX INFO: renamed from: b */
        void mo2749b();

        /* JADX INFO: renamed from: c */
        void mo2750c(int i3);

        /* JADX INFO: renamed from: d */
        void mo2751d();

        /* JADX INFO: renamed from: e */
        void mo2752e(boolean z2);

        /* JADX INFO: renamed from: f */
        void mo2753f();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0802e extends ViewGroup.MarginLayoutParams {
        public C0802e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0802e(int i3, int i4) {
            super(i3, i4);
        }

        public C0802e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$f */
    private static final class C0803f extends View {
        C0803f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3142b = 0;
        this.f3153m = new Rect();
        this.f3154n = new Rect();
        this.f3155o = new Rect();
        this.f3156p = new Rect();
        this.f3157q = new Rect();
        this.f3158r = new Rect();
        this.f3159s = new Rect();
        this.f3160t = new Rect();
        C0318w0 c0318w0 = C0318w0.f1386b;
        this.f3161u = c0318w0;
        this.f3162v = c0318w0;
        this.f3163w = c0318w0;
        this.f3164x = c0318w0;
        this.f3136B = new C0798a();
        this.f3137C = new RunnableC0799b();
        this.f3138D = new RunnableC0800c();
        m3276w(context);
        this.f3139E = new C0233E(this);
        C0803f c0803f = new C0803f(context);
        this.f3140F = c0803f;
        addView(c0803f);
    }

    /* JADX INFO: renamed from: B */
    private void m3270B() {
        m3291v();
        this.f3137C.run();
    }

    /* JADX INFO: renamed from: C */
    private boolean m3271C(float f3) {
        this.f3166z.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this.f3166z.getFinalY() > this.f3144d.getHeight();
    }

    /* JADX INFO: renamed from: p */
    private void m3272p() {
        m3291v();
        this.f3138D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m3273q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0802e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m3273q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX INFO: renamed from: r */
    private boolean m3274r() {
        AbstractC0268W.m768f(this.f3140F, f3133H, this.f3156p);
        return !this.f3156p.equals(f3134I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    private InterfaceC0831H m3275u(View view) {
        if (view instanceof InterfaceC0831H) {
            return (InterfaceC0831H) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: w */
    private void m3276w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3132G);
        this.f3141a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f3146f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f3166z = new OverScroller(context);
    }

    /* JADX INFO: renamed from: y */
    private void m3277y() {
        m3291v();
        postDelayed(this.f3138D, 600L);
    }

    /* JADX INFO: renamed from: z */
    private void m3278z() {
        m3291v();
        postDelayed(this.f3137C, 600L);
    }

    /* JADX INFO: renamed from: A */
    void m3279A() {
        if (this.f3143c == null) {
            this.f3143c = (ContentFrameLayout) findViewById(AbstractC1765f.f8810b);
            this.f3144d = (ActionBarContainer) findViewById(AbstractC1765f.f8811c);
            this.f3145e = m3275u(findViewById(AbstractC1765f.f8809a));
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    /* JADX INFO: renamed from: a */
    public void mo3280a(Menu menu, InterfaceC0791j.a aVar) {
        m3279A();
        this.f3145e.mo3420a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    /* JADX INFO: renamed from: b */
    public boolean mo3281b() {
        m3279A();
        return this.f3145e.mo3421b();
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: c */
    public void mo648c(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0802e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    /* JADX INFO: renamed from: d */
    public void mo3282d() {
        m3279A();
        this.f3145e.mo3423d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3146f != null) {
            int bottom = this.f3144d.getVisibility() == 0 ? (int) (this.f3144d.getBottom() + this.f3144d.getTranslationY() + 0.5f) : 0;
            this.f3146f.setBounds(0, bottom, getWidth(), this.f3146f.getIntrinsicHeight() + bottom);
            this.f3146f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    /* JADX INFO: renamed from: e */
    public boolean mo3283e() {
        m3279A();
        return this.f3145e.mo3424e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    /* JADX INFO: renamed from: f */
    public boolean mo3284f() {
        m3279A();
        return this.f3145e.mo3425f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    /* JADX INFO: renamed from: g */
    public boolean mo3285g() {
        m3279A();
        return this.f3145e.mo3426g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3144d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3139E.m656a();
    }

    public CharSequence getTitle() {
        m3279A();
        return this.f3145e.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    /* JADX INFO: renamed from: h */
    public boolean mo3286h() {
        m3279A();
        return this.f3145e.mo3427h();
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: i */
    public void mo649i(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: j */
    public void mo650j(View view, int i3, int i4, int[] iArr, int i5) {
        if (i5 == 0) {
            onNestedPreScroll(view, i3, i4, iArr);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    /* JADX INFO: renamed from: k */
    public void mo3287k(int i3) {
        m3279A();
        if (i3 == 2) {
            this.f3145e.mo3442w();
        } else if (i3 == 5) {
            this.f3145e.mo3443x();
        } else {
            if (i3 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    /* JADX INFO: renamed from: l */
    public void mo3288l() {
        m3279A();
        this.f3145e.mo3428i();
    }

    @Override // p027J.InterfaceC0231D
    /* JADX INFO: renamed from: m */
    public void mo654m(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        mo651n(view, i3, i4, i5, i6, i7);
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: n */
    public void mo651n(View view, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(view, i3, i4, i5, i6);
        }
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: o */
    public boolean mo652o(View view, View view2, int i3, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m3279A();
        C0318w0 c0318w0M1076z = C0318w0.m1076z(windowInsets, this);
        boolean zM3273q = m3273q(this.f3144d, new Rect(c0318w0M1076z.m1086j(), c0318w0M1076z.m1088l(), c0318w0M1076z.m1087k(), c0318w0M1076z.m1085i()), true, true, false, true);
        AbstractC0268W.m768f(this, c0318w0M1076z, this.f3153m);
        Rect rect = this.f3153m;
        C0318w0 c0318w0M1091o = c0318w0M1076z.m1091o(rect.left, rect.top, rect.right, rect.bottom);
        this.f3161u = c0318w0M1091o;
        boolean z2 = true;
        if (!this.f3162v.equals(c0318w0M1091o)) {
            this.f3162v = this.f3161u;
            zM3273q = true;
        }
        if (this.f3154n.equals(this.f3153m)) {
            z2 = zM3273q;
        } else {
            this.f3154n.set(this.f3153m);
        }
        if (z2) {
            requestLayout();
        }
        return c0318w0M1076z.m1077a().m1079c().m1078b().m1099x();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3276w(getContext());
        AbstractC0268W.m769f0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3291v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0802e c0802e = (C0802e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c0802e).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c0802e).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        int measuredHeight;
        m3279A();
        measureChildWithMargins(this.f3144d, i3, 0, i4, 0);
        C0802e c0802e = (C0802e) this.f3144d.getLayoutParams();
        int iMax = Math.max(0, this.f3144d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0802e).leftMargin + ((ViewGroup.MarginLayoutParams) c0802e).rightMargin);
        int iMax2 = Math.max(0, this.f3144d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0802e).topMargin + ((ViewGroup.MarginLayoutParams) c0802e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3144d.getMeasuredState());
        boolean z2 = (AbstractC0268W.m740I(this) & 256) != 0;
        if (z2) {
            measuredHeight = this.f3141a;
            if (this.f3148h && this.f3144d.getTabContainer() != null) {
                measuredHeight += this.f3141a;
            }
        } else {
            measuredHeight = this.f3144d.getVisibility() != 8 ? this.f3144d.getMeasuredHeight() : 0;
        }
        this.f3155o.set(this.f3153m);
        this.f3163w = this.f3161u;
        if (this.f3147g || z2 || !m3274r()) {
            this.f3163w = new C0318w0.a(this.f3163w).m1103d(C2572e.m12271b(this.f3163w.m1086j(), this.f3163w.m1088l() + measuredHeight, this.f3163w.m1087k(), this.f3163w.m1085i())).m1100a();
        } else {
            Rect rect = this.f3155o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f3163w = this.f3163w.m1091o(0, measuredHeight, 0, 0);
        }
        m3273q(this.f3143c, this.f3155o, true, true, true, true);
        if (!this.f3164x.equals(this.f3163w)) {
            C0318w0 c0318w0 = this.f3163w;
            this.f3164x = c0318w0;
            AbstractC0268W.m770g(this.f3143c, c0318w0);
        }
        measureChildWithMargins(this.f3143c, i3, 0, i4, 0);
        C0802e c0802e2 = (C0802e) this.f3143c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f3143c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0802e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0802e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f3143c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0802e2).topMargin + ((ViewGroup.MarginLayoutParams) c0802e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3143c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i3, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        if (!this.f3149i || !z2) {
            return false;
        }
        if (m3271C(f4)) {
            m3272p();
        } else {
            m3270B();
        }
        this.f3150j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f3151k + i4;
        this.f3151k = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f3139E.m657b(view, view2, i3);
        this.f3151k = getActionBarHideOffset();
        m3291v();
        InterfaceC0801d interfaceC0801d = this.f3165y;
        if (interfaceC0801d != null) {
            interfaceC0801d.mo2749b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f3144d.getVisibility() != 0) {
            return false;
        }
        return this.f3149i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f3149i && !this.f3150j) {
            if (this.f3151k <= this.f3144d.getHeight()) {
                m3278z();
            } else {
                m3277y();
            }
        }
        InterfaceC0801d interfaceC0801d = this.f3165y;
        if (interfaceC0801d != null) {
            interfaceC0801d.mo2751d();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        m3279A();
        int i4 = this.f3152l ^ i3;
        this.f3152l = i3;
        boolean z2 = (i3 & 4) == 0;
        boolean z3 = (i3 & 256) != 0;
        InterfaceC0801d interfaceC0801d = this.f3165y;
        if (interfaceC0801d != null) {
            interfaceC0801d.mo2752e(!z3);
            if (z2 || !z3) {
                this.f3165y.mo2748a();
            } else {
                this.f3165y.mo2753f();
            }
        }
        if ((i4 & 256) == 0 || this.f3165y == null) {
            return;
        }
        AbstractC0268W.m769f0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        this.f3142b = i3;
        InterfaceC0801d interfaceC0801d = this.f3165y;
        if (interfaceC0801d != null) {
            interfaceC0801d.mo2750c(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0802e generateDefaultLayoutParams() {
        return new C0802e(-1, -1);
    }

    public void setActionBarHideOffset(int i3) {
        m3291v();
        this.f3144d.setTranslationY(-Math.max(0, Math.min(i3, this.f3144d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0801d interfaceC0801d) {
        this.f3165y = interfaceC0801d;
        if (getWindowToken() != null) {
            this.f3165y.mo2750c(this.f3142b);
            int i3 = this.f3152l;
            if (i3 != 0) {
                onWindowSystemUiVisibilityChanged(i3);
                AbstractC0268W.m769f0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f3148h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f3149i) {
            this.f3149i = z2;
            if (z2) {
                return;
            }
            m3291v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        m3279A();
        this.f3145e.setIcon(i3);
    }

    public void setLogo(int i3) {
        m3279A();
        this.f3145e.mo3438s(i3);
    }

    public void setOverlayMode(boolean z2) {
        this.f3147g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i3) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    public void setWindowCallback(Window.Callback callback) {
        m3279A();
        this.f3145e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0830G
    public void setWindowTitle(CharSequence charSequence) {
        m3279A();
        this.f3145e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C0802e generateLayoutParams(AttributeSet attributeSet) {
        return new C0802e(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: v */
    void m3291v() {
        removeCallbacks(this.f3137C);
        removeCallbacks(this.f3138D);
        ViewPropertyAnimator viewPropertyAnimator = this.f3135A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m3292x() {
        return this.f3147g;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0802e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m3279A();
        this.f3145e.setIcon(drawable);
    }
}
