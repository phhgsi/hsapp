package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.C0894h0;
import androidx.core.content.AbstractC0966b;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p000A.AbstractC0000a;
import p027J.AbstractC0268W;
import p027J.AbstractC0309s;
import p027J.C0273a;
import p027J.C0318w0;
import p027J.InterfaceC0235F;
import p030K.C0356y;
import p030K.InterfaceC0331B;
import p039N.C0435c;
import p042O.AbstractC0448a;
import p042O.AbstractC0449b;
import p167z.C2572e;

/* JADX INFO: loaded from: classes.dex */
public abstract class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: N */
    private static final int[] f4744N = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: O */
    static final int[] f4745O = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: P */
    static final boolean f4746P;

    /* JADX INFO: renamed from: Q */
    private static final boolean f4747Q;

    /* JADX INFO: renamed from: R */
    private static final boolean f4748R;

    /* JADX INFO: renamed from: A */
    private Drawable f4749A;

    /* JADX INFO: renamed from: B */
    private CharSequence f4750B;

    /* JADX INFO: renamed from: C */
    private CharSequence f4751C;

    /* JADX INFO: renamed from: D */
    private C0318w0 f4752D;

    /* JADX INFO: renamed from: E */
    private boolean f4753E;

    /* JADX INFO: renamed from: F */
    private Drawable f4754F;

    /* JADX INFO: renamed from: G */
    private Drawable f4755G;

    /* JADX INFO: renamed from: H */
    private Drawable f4756H;

    /* JADX INFO: renamed from: I */
    private Drawable f4757I;

    /* JADX INFO: renamed from: J */
    private final ArrayList f4758J;

    /* JADX INFO: renamed from: K */
    private Rect f4759K;

    /* JADX INFO: renamed from: L */
    private Matrix f4760L;

    /* JADX INFO: renamed from: M */
    private final InterfaceC0331B f4761M;

    /* JADX INFO: renamed from: a */
    private final C0997c f4762a;

    /* JADX INFO: renamed from: b */
    private float f4763b;

    /* JADX INFO: renamed from: c */
    private final int f4764c;

    /* JADX INFO: renamed from: d */
    private int f4765d;

    /* JADX INFO: renamed from: e */
    private float f4766e;

    /* JADX INFO: renamed from: f */
    private final Paint f4767f;

    /* JADX INFO: renamed from: g */
    private final C0435c f4768g;

    /* JADX INFO: renamed from: h */
    private final C0435c f4769h;

    /* JADX INFO: renamed from: i */
    private final C1001g f4770i;

    /* JADX INFO: renamed from: j */
    private final C1001g f4771j;

    /* JADX INFO: renamed from: k */
    private int f4772k;

    /* JADX INFO: renamed from: l */
    private boolean f4773l;

    /* JADX INFO: renamed from: m */
    private boolean f4774m;

    /* JADX INFO: renamed from: n */
    private OnBackInvokedCallback f4775n;

    /* JADX INFO: renamed from: o */
    private OnBackInvokedDispatcher f4776o;

    /* JADX INFO: renamed from: p */
    private int f4777p;

    /* JADX INFO: renamed from: q */
    private int f4778q;

    /* JADX INFO: renamed from: r */
    private int f4779r;

    /* JADX INFO: renamed from: s */
    private int f4780s;

    /* JADX INFO: renamed from: t */
    private boolean f4781t;

    /* JADX INFO: renamed from: u */
    private InterfaceC0998d f4782u;

    /* JADX INFO: renamed from: v */
    private List f4783v;

    /* JADX INFO: renamed from: w */
    private float f4784w;

    /* JADX INFO: renamed from: x */
    private float f4785x;

    /* JADX INFO: renamed from: y */
    private Drawable f4786y;

    /* JADX INFO: renamed from: z */
    private Drawable f4787z;

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class C0995a extends C0273a {

        /* JADX INFO: renamed from: d */
        private final Rect f4793d = new Rect();

        C0995a() {
        }

        /* JADX INFO: renamed from: n */
        private void m4478n(C0356y c0356y, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (DrawerLayout.m4424C(childAt)) {
                    c0356y.m1265c(childAt);
                }
            }
        }

        /* JADX INFO: renamed from: o */
        private void m4479o(C0356y c0356y, C0356y c0356y2) {
            Rect rect = this.f4793d;
            c0356y2.m1278n(rect);
            c0356y.m1282p0(rect);
            c0356y.m1253T0(c0356y2.m1269e0());
            c0356y.m1227F0(c0356y2.m1221C());
            c0356y.m1287s0(c0356y2.m1286s());
            c0356y.m1294w0(c0356y2.m1291v());
            c0356y.m1296x0(c0356y2.m1250S());
            c0356y.m1219A0(c0356y2.m1256V());
            c0356y.m1277m0(c0356y2.m1240N());
            c0356y.m1239M0(c0356y2.m1264b0());
            c0356y.m1261a(c0356y2.m1274k());
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: a */
        public boolean mo901a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo901a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewM4469r = DrawerLayout.this.m4469r();
            if (viewM4469r == null) {
                return true;
            }
            CharSequence charSequenceM4472u = DrawerLayout.this.m4472u(DrawerLayout.this.m4473v(viewM4469r));
            if (charSequenceM4472u == null) {
                return true;
            }
            text.add(charSequenceM4472u);
            return true;
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: f */
        public void mo904f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo904f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            if (DrawerLayout.f4746P) {
                super.mo905g(view, c0356y);
            } else {
                C0356y c0356yM1208g0 = C0356y.m1208g0(c0356y);
                super.mo905g(view, c0356yM1208g0);
                c0356y.m1243O0(view);
                Object objM734C = AbstractC0268W.m734C(view);
                if (objM734C instanceof View) {
                    c0356y.m1231H0((View) objM734C);
                }
                m4479o(c0356y, c0356yM1208g0);
                c0356yM1208g0.m1273j0();
                m4478n(c0356y, (ViewGroup) view);
            }
            c0356y.m1287s0("androidx.drawerlayout.widget.DrawerLayout");
            c0356y.m1299z0(false);
            c0356y.m1219A0(false);
            c0356y.m1275k0(C0356y.a.f1448e);
            c0356y.m1275k0(C0356y.a.f1449f);
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: i */
        public boolean mo907i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f4746P || DrawerLayout.m4424C(view)) {
                return super.mo907i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    static class C0996b {
        /* JADX INFO: renamed from: a */
        static OnBackInvokedDispatcher m4480a(DrawerLayout drawerLayout) {
            return drawerLayout.findOnBackInvokedDispatcher();
        }

        /* JADX INFO: renamed from: b */
        static OnBackInvokedCallback m4481b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0894h0(runnable);
        }

        /* JADX INFO: renamed from: c */
        static void m4482c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        /* JADX INFO: renamed from: d */
        static void m4483d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    static final class C0997c extends C0273a {
        C0997c() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            if (DrawerLayout.m4424C(view)) {
                return;
            }
            c0356y.m1231H0(null);
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface InterfaceC0998d {
        /* JADX INFO: renamed from: a */
        void mo2770a(int i3);

        /* JADX INFO: renamed from: b */
        void mo2771b(View view, float f3);

        /* JADX INFO: renamed from: c */
        void mo4484c(View view);

        /* JADX INFO: renamed from: d */
        void mo4485d(View view);
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public static abstract class AbstractC1000f implements InterfaceC0998d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0998d
        /* JADX INFO: renamed from: a */
        public void mo2770a(int i3) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0998d
        /* JADX INFO: renamed from: b */
        public void mo2771b(View view, float f3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    class C1001g extends C0435c.c {

        /* JADX INFO: renamed from: a */
        private final int f4799a;

        /* JADX INFO: renamed from: b */
        private C0435c f4800b;

        /* JADX INFO: renamed from: c */
        private final Runnable f4801c = new Runnable() { // from class: androidx.drawerlayout.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f4805d.m4487o();
            }
        };

        C1001g(int i3) {
            this.f4799a = i3;
        }

        /* JADX INFO: renamed from: n */
        private void m4486n() {
            View viewM4467p = DrawerLayout.this.m4467p(this.f4799a == 3 ? 5 : 3);
            if (viewM4467p != null) {
                DrawerLayout.this.m4460h(viewM4467p);
            }
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: a */
        public int mo1589a(View view, int i3, int i4) {
            if (DrawerLayout.this.m4457e(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i3, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i3, width));
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: b */
        public int mo1590b(View view, int i3, int i4) {
            return view.getTop();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: d */
        public int mo1592d(View view) {
            if (DrawerLayout.this.m4441G(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: f */
        public void mo1594f(int i3, int i4) {
            View viewM4467p = (i3 & 1) == 1 ? DrawerLayout.this.m4467p(3) : DrawerLayout.this.m4467p(5);
            if (viewM4467p == null || DrawerLayout.this.m4471t(viewM4467p) != 0) {
                return;
            }
            this.f4800b.m1580b(viewM4467p, i4);
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: g */
        public boolean mo1595g(int i3) {
            return false;
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: h */
        public void mo1596h(int i3, int i4) {
            DrawerLayout.this.postDelayed(this.f4801c, 160L);
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: i */
        public void mo1597i(View view, int i3) {
            ((C0999e) view.getLayoutParams()).f4797c = false;
            m4486n();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: j */
        public void mo1598j(int i3) {
            DrawerLayout.this.m4454a0(i3, this.f4800b.m1585v());
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: k */
        public void mo1599k(View view, int i3, int i4, int i5, int i6) {
            float width = (DrawerLayout.this.m4457e(view, 3) ? i3 + r3 : DrawerLayout.this.getWidth() - i3) / view.getWidth();
            DrawerLayout.this.m4452W(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: l */
        public void mo1600l(View view, float f3, float f4) {
            int i3;
            float fM4474w = DrawerLayout.this.m4474w(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m4457e(view, 3)) {
                i3 = (f3 > 0.0f || (f3 == 0.0f && fM4474w > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f3 < 0.0f || (f3 == 0.0f && fM4474w > 0.5f)) {
                    width2 -= width;
                }
                i3 = width2;
            }
            this.f4800b.m1575O(i3, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: m */
        public boolean mo1601m(View view, int i3) {
            return DrawerLayout.this.m4441G(view) && DrawerLayout.this.m4457e(view, this.f4799a) && DrawerLayout.this.m4471t(view) == 0;
        }

        /* JADX INFO: renamed from: o */
        void m4487o() {
            View viewM4467p;
            int width;
            int iM1587x = this.f4800b.m1587x();
            boolean z2 = this.f4799a == 3;
            if (z2) {
                viewM4467p = DrawerLayout.this.m4467p(3);
                width = (viewM4467p != null ? -viewM4467p.getWidth() : 0) + iM1587x;
            } else {
                viewM4467p = DrawerLayout.this.m4467p(5);
                width = DrawerLayout.this.getWidth() - iM1587x;
            }
            if (viewM4467p != null) {
                if (((!z2 || viewM4467p.getLeft() >= width) && (z2 || viewM4467p.getLeft() <= width)) || DrawerLayout.this.m4471t(viewM4467p) != 0) {
                    return;
                }
                C0999e c0999e = (C0999e) viewM4467p.getLayoutParams();
                this.f4800b.m1577Q(viewM4467p, width, viewM4467p.getTop());
                c0999e.f4797c = true;
                DrawerLayout.this.invalidate();
                m4486n();
                DrawerLayout.this.m4456d();
            }
        }

        /* JADX INFO: renamed from: p */
        public void m4488p() {
            DrawerLayout.this.removeCallbacks(this.f4801c);
        }

        /* JADX INFO: renamed from: q */
        public void m4489q(C0435c c0435c) {
            this.f4800b = c0435c;
        }
    }

    static {
        int i3 = Build.VERSION.SDK_INT;
        f4746P = true;
        f4747Q = true;
        f4748R = i3 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f4762a = new C0997c();
        this.f4765d = -1728053248;
        this.f4767f = new Paint();
        this.f4774m = true;
        this.f4777p = 3;
        this.f4778q = 3;
        this.f4779r = 3;
        this.f4780s = 3;
        this.f4754F = null;
        this.f4755G = null;
        this.f4756H = null;
        this.f4757I = null;
        this.f4761M = new InterfaceC0331B() { // from class: androidx.drawerlayout.widget.b
            @Override // p030K.InterfaceC0331B
            /* JADX INFO: renamed from: a */
            public final boolean mo1175a(View view, InterfaceC0331B.a aVar) {
                return DrawerLayout.m4433b(this.f4804a, view, aVar);
            }
        };
        setDescendantFocusability(262144);
        float f3 = getResources().getDisplayMetrics().density;
        this.f4764c = (int) ((64.0f * f3) + 0.5f);
        float f4 = f3 * 400.0f;
        C1001g c1001g = new C1001g(3);
        this.f4770i = c1001g;
        C1001g c1001g2 = new C1001g(5);
        this.f4771j = c1001g2;
        C0435c c0435cM1558n = C0435c.m1558n(this, 1.0f, c1001g);
        this.f4768g = c0435cM1558n;
        c0435cM1558n.m1573M(1);
        c0435cM1558n.m1574N(f4);
        c1001g.m4489q(c0435cM1558n);
        C0435c c0435cM1558n2 = C0435c.m1558n(this, 1.0f, c1001g2);
        this.f4769h = c0435cM1558n2;
        c0435cM1558n2.m1573M(2);
        c0435cM1558n2.m1574N(f4);
        c1001g2.m4489q(c0435cM1558n2);
        setFocusableInTouchMode(true);
        AbstractC0268W.m789p0(this, 1);
        AbstractC0268W.m775i0(this, new C0995a());
        setMotionEventSplittingEnabled(false);
        if (AbstractC0268W.m800v(this)) {
            AbstractC0268W.m795s0(this, new InterfaceC0235F() { // from class: androidx.drawerlayout.widget.c
                @Override // p027J.InterfaceC0235F
                /* JADX INFO: renamed from: a */
                public final C0318w0 mo662a(View view, C0318w0 c0318w0) {
                    return DrawerLayout.m4432a(view, c0318w0);
                }
            });
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f4744N);
            try {
                this.f4786y = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0449b.f1595a, i3, 0);
        try {
            int i4 = AbstractC0449b.f1596b;
            if (typedArrayObtainStyledAttributes2.hasValue(i4)) {
                this.f4763b = typedArrayObtainStyledAttributes2.getDimension(i4, 0.0f);
            } else {
                this.f4763b = getResources().getDimension(AbstractC0448a.f1594a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f4758J = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m4422A() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (((C0999e) getChildAt(i3).getLayoutParams()).f4797c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    private boolean m4423B() {
        return m4469r() != null;
    }

    /* JADX INFO: renamed from: C */
    static boolean m4424C(View view) {
        return (AbstractC0268W.m802w(view) == 4 || AbstractC0268W.m802w(view) == 2) ? false : true;
    }

    /* JADX INFO: renamed from: J */
    private boolean m4425J(float f3, float f4, View view) {
        if (this.f4759K == null) {
            this.f4759K = new Rect();
        }
        view.getHitRect(this.f4759K);
        return this.f4759K.contains((int) f3, (int) f4);
    }

    /* JADX INFO: renamed from: K */
    private void m4426K(Drawable drawable, int i3) {
        if (drawable == null || !AbstractC0000a.m7h(drawable)) {
            return;
        }
        AbstractC0000a.m12m(drawable, i3);
    }

    /* JADX INFO: renamed from: R */
    private Drawable m4427R() {
        int iM806y = AbstractC0268W.m806y(this);
        if (iM806y == 0) {
            Drawable drawable = this.f4754F;
            if (drawable != null) {
                m4426K(drawable, iM806y);
                return this.f4754F;
            }
        } else {
            Drawable drawable2 = this.f4755G;
            if (drawable2 != null) {
                m4426K(drawable2, iM806y);
                return this.f4755G;
            }
        }
        return this.f4756H;
    }

    /* JADX INFO: renamed from: S */
    private Drawable m4428S() {
        int iM806y = AbstractC0268W.m806y(this);
        if (iM806y == 0) {
            Drawable drawable = this.f4755G;
            if (drawable != null) {
                m4426K(drawable, iM806y);
                return this.f4755G;
            }
        } else {
            Drawable drawable2 = this.f4754F;
            if (drawable2 != null) {
                m4426K(drawable2, iM806y);
                return this.f4754F;
            }
        }
        return this.f4757I;
    }

    /* JADX INFO: renamed from: T */
    private void m4429T() {
        if (f4747Q) {
            return;
        }
        this.f4787z = m4427R();
        this.f4749A = m4428S();
    }

    /* JADX INFO: renamed from: Y */
    private void m4430Y(View view) {
        C0356y.a aVar = C0356y.a.f1468y;
        AbstractC0268W.m763c0(view, aVar.m1301b());
        if (!m4440F(view) || m4471t(view) == 2) {
            return;
        }
        AbstractC0268W.m767e0(view, aVar, null, this.f4761M);
    }

    /* JADX INFO: renamed from: Z */
    private void m4431Z(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((z2 || m4441G(childAt)) && !(z2 && childAt == view)) {
                AbstractC0268W.m789p0(childAt, 4);
            } else {
                AbstractC0268W.m789p0(childAt, 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C0318w0 m4432a(View view, C0318w0 c0318w0) {
        ((DrawerLayout) view).m4450U(c0318w0, c0318w0.m1089m().f11900b > 0);
        return c0318w0.m1079c();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m4433b(DrawerLayout drawerLayout, View view, InterfaceC0331B.a aVar) {
        if (!drawerLayout.m4440F(view) || drawerLayout.m4471t(view) == 2) {
            return false;
        }
        drawerLayout.m4460h(view);
        return true;
    }

    /* JADX INFO: renamed from: o */
    private boolean m4434o(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventM4435x = m4435x(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventM4435x);
            motionEventM4435x.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    /* JADX INFO: renamed from: x */
    private MotionEvent m4435x(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f4760L == null) {
                this.f4760L = new Matrix();
            }
            matrix.invert(this.f4760L);
            motionEventObtain.transform(this.f4760L);
        }
        return motionEventObtain;
    }

    /* JADX INFO: renamed from: y */
    static String m4436y(int i3) {
        return (i3 & 3) == 3 ? "LEFT" : (i3 & 5) == 5 ? "RIGHT" : Integer.toHexString(i3);
    }

    /* JADX INFO: renamed from: z */
    private static boolean m4437z(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* JADX INFO: renamed from: D */
    boolean m4438D(View view) {
        return ((C0999e) view.getLayoutParams()).f4795a == 0;
    }

    /* JADX INFO: renamed from: E */
    public boolean m4439E(int i3) {
        View viewM4467p = m4467p(i3);
        if (viewM4467p != null) {
            return m4440F(viewM4467p);
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public boolean m4440F(View view) {
        if (m4441G(view)) {
            return (((C0999e) view.getLayoutParams()).f4798d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: G */
    boolean m4441G(View view) {
        int iM1053b = AbstractC0309s.m1053b(((C0999e) view.getLayoutParams()).f4795a, AbstractC0268W.m806y(view));
        return ((iM1053b & 3) == 0 && (iM1053b & 5) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public boolean m4442H(int i3) {
        View viewM4467p = m4467p(i3);
        if (viewM4467p != null) {
            return m4443I(viewM4467p);
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public boolean m4443I(View view) {
        if (m4441G(view)) {
            return ((C0999e) view.getLayoutParams()).f4796b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: L */
    void m4444L(View view, float f3) {
        float fM4474w = m4474w(view);
        float width = view.getWidth();
        int i3 = ((int) (width * f3)) - ((int) (fM4474w * width));
        if (!m4457e(view, 3)) {
            i3 = -i3;
        }
        view.offsetLeftAndRight(i3);
        m4452W(view, f3);
    }

    /* JADX INFO: renamed from: M */
    public void m4445M(int i3) {
        m4446N(i3, true);
    }

    /* JADX INFO: renamed from: N */
    public void m4446N(int i3, boolean z2) {
        View viewM4467p = m4467p(i3);
        if (viewM4467p != null) {
            m4448P(viewM4467p, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m4436y(i3));
    }

    /* JADX INFO: renamed from: O */
    public void m4447O(View view) {
        m4448P(view, true);
    }

    /* JADX INFO: renamed from: P */
    public void m4448P(View view, boolean z2) {
        if (!m4441G(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0999e c0999e = (C0999e) view.getLayoutParams();
        if (this.f4774m) {
            c0999e.f4796b = 1.0f;
            c0999e.f4798d = 1;
            m4431Z(view, true);
            m4430Y(view);
            m4453X();
        } else if (z2) {
            c0999e.f4798d |= 2;
            if (m4457e(view, 3)) {
                this.f4768g.m1577Q(view, 0, view.getTop());
            } else {
                this.f4769h.m1577Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m4444L(view, 1.0f);
            m4454a0(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: Q */
    public void m4449Q(InterfaceC0998d interfaceC0998d) {
        List list = this.f4783v;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0998d);
    }

    /* JADX INFO: renamed from: U */
    public void m4450U(C0318w0 c0318w0, boolean z2) {
        this.f4752D = c0318w0;
        this.f4753E = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    /* JADX INFO: renamed from: V */
    public void m4451V(int i3, int i4) {
        View viewM4467p;
        int iM1053b = AbstractC0309s.m1053b(i4, AbstractC0268W.m806y(this));
        if (i4 == 3) {
            this.f4777p = i3;
        } else if (i4 == 5) {
            this.f4778q = i3;
        } else if (i4 == 8388611) {
            this.f4779r = i3;
        } else if (i4 == 8388613) {
            this.f4780s = i3;
        }
        if (i3 != 0) {
            (iM1053b == 3 ? this.f4768g : this.f4769h).m1579a();
        }
        if (i3 != 1) {
            if (i3 == 2 && (viewM4467p = m4467p(iM1053b)) != null) {
                m4447O(viewM4467p);
                return;
            }
            return;
        }
        View viewM4467p2 = m4467p(iM1053b);
        if (viewM4467p2 != null) {
            m4460h(viewM4467p2);
        }
    }

    /* JADX INFO: renamed from: W */
    void m4452W(View view, float f3) {
        C0999e c0999e = (C0999e) view.getLayoutParams();
        if (f3 == c0999e.f4796b) {
            return;
        }
        c0999e.f4796b = f3;
        m4466n(view, f3);
    }

    /* JADX INFO: renamed from: X */
    void m4453X() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            View viewM4469r = m4469r();
            OnBackInvokedDispatcher onBackInvokedDispatcherM4480a = C0996b.m4480a(this);
            boolean z2 = viewM4469r != null && onBackInvokedDispatcherM4480a != null && m4471t(viewM4469r) == 0 && AbstractC0268W.m745N(this);
            if (z2 && this.f4776o == null) {
                if (this.f4775n == null) {
                    this.f4775n = C0996b.m4481b(new Runnable() { // from class: androidx.drawerlayout.widget.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4803d.m4462j();
                        }
                    });
                }
                C0996b.m4482c(onBackInvokedDispatcherM4480a, this.f4775n);
                this.f4776o = onBackInvokedDispatcherM4480a;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f4776o) == null) {
                return;
            }
            C0996b.m4483d(onBackInvokedDispatcher, this.f4775n);
            this.f4776o = null;
        }
    }

    /* JADX INFO: renamed from: a0 */
    void m4454a0(int i3, View view) {
        int i4;
        int iM1566A = this.f4768g.m1566A();
        int iM1566A2 = this.f4769h.m1566A();
        if (iM1566A == 1 || iM1566A2 == 1) {
            i4 = 1;
        } else {
            i4 = 2;
            if (iM1566A != 2 && iM1566A2 != 2) {
                i4 = 0;
            }
        }
        if (view != null && i3 == 0) {
            float f3 = ((C0999e) view.getLayoutParams()).f4796b;
            if (f3 == 0.0f) {
                m4464l(view);
            } else if (f3 == 1.0f) {
                m4465m(view);
            }
        }
        if (i4 != this.f4772k) {
            this.f4772k = i4;
            List list = this.f4783v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((InterfaceC0998d) this.f4783v.get(size)).mo2770a(i4);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i3, int i4) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!m4441G(childAt)) {
                this.f4758J.add(childAt);
            } else if (m4440F(childAt)) {
                childAt.addFocusables(arrayList, i3, i4);
                z2 = true;
            }
        }
        if (!z2) {
            int size = this.f4758J.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = (View) this.f4758J.get(i6);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i3, i4);
                }
            }
        }
        this.f4758J.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        if (m4468q() != null || m4441G(view)) {
            AbstractC0268W.m789p0(view, 4);
        } else {
            AbstractC0268W.m789p0(view, 1);
        }
        if (f4746P) {
            return;
        }
        AbstractC0268W.m775i0(view, this.f4762a);
    }

    /* JADX INFO: renamed from: c */
    public void m4455c(InterfaceC0998d interfaceC0998d) {
        if (this.f4783v == null) {
            this.f4783v = new ArrayList();
        }
        this.f4783v.add(interfaceC0998d);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0999e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            fMax = Math.max(fMax, ((C0999e) getChildAt(i3).getLayoutParams()).f4796b);
        }
        this.f4766e = fMax;
        boolean zM1583m = this.f4768g.m1583m(true);
        boolean zM1583m2 = this.f4769h.m1583m(true);
        if (zM1583m || zM1583m2) {
            AbstractC0268W.m757Z(this);
        }
    }

    /* JADX INFO: renamed from: d */
    void m4456d() {
        if (this.f4781t) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f4781t = true;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f4766e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt = getChildAt(i3);
            if (m4425J(x2, y2, childAt) && !m4438D(childAt) && m4434o(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j3) {
        int height = getHeight();
        boolean zM4438D = m4438D(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i3 = 0;
        if (zM4438D) {
            int childCount = getChildCount();
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != view && childAt.getVisibility() == 0 && m4437z(childAt) && m4441G(childAt) && childAt.getHeight() >= height) {
                    if (m4457e(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i4) {
                            i4 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i4, 0, width, getHeight());
            i3 = i4;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(iSave);
        float f3 = this.f4766e;
        if (f3 > 0.0f && zM4438D) {
            this.f4767f.setColor((this.f4765d & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f3)) << 24));
            canvas.drawRect(i3, 0.0f, width, getHeight(), this.f4767f);
            return zDrawChild;
        }
        if (this.f4787z != null && m4457e(view, 3)) {
            int intrinsicWidth = this.f4787z.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f4768g.m1587x(), 1.0f));
            this.f4787z.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f4787z.setAlpha((int) (fMax * 255.0f));
            this.f4787z.draw(canvas);
            return zDrawChild;
        }
        if (this.f4749A != null && m4457e(view, 5)) {
            int intrinsicWidth2 = this.f4749A.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f4769h.m1587x(), 1.0f));
            this.f4749A.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f4749A.setAlpha((int) (fMax2 * 255.0f));
            this.f4749A.draw(canvas);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: e */
    boolean m4457e(View view, int i3) {
        return (m4473v(view) & i3) == i3;
    }

    /* JADX INFO: renamed from: f */
    public void m4458f(int i3) {
        m4459g(i3, true);
    }

    /* JADX INFO: renamed from: g */
    public void m4459g(int i3, boolean z2) {
        View viewM4467p = m4467p(i3);
        if (viewM4467p != null) {
            m4461i(viewM4467p, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m4436y(i3));
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0999e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0999e ? new C0999e((C0999e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0999e((ViewGroup.MarginLayoutParams) layoutParams) : new C0999e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f4747Q) {
            return this.f4763b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f4786y;
    }

    /* JADX INFO: renamed from: h */
    public void m4460h(View view) {
        m4461i(view, true);
    }

    /* JADX INFO: renamed from: i */
    public void m4461i(View view, boolean z2) {
        if (!m4441G(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0999e c0999e = (C0999e) view.getLayoutParams();
        if (this.f4774m) {
            c0999e.f4796b = 0.0f;
            c0999e.f4798d = 0;
        } else if (z2) {
            c0999e.f4798d |= 4;
            if (m4457e(view, 3)) {
                this.f4768g.m1577Q(view, -view.getWidth(), view.getTop());
            } else {
                this.f4769h.m1577Q(view, getWidth(), view.getTop());
            }
        } else {
            m4444L(view, 0.0f);
            m4454a0(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m4462j() {
        m4463k(false);
    }

    /* JADX INFO: renamed from: k */
    void m4463k(boolean z2) {
        int childCount = getChildCount();
        boolean zM1577Q = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0999e c0999e = (C0999e) childAt.getLayoutParams();
            if (m4441G(childAt) && (!z2 || c0999e.f4797c)) {
                zM1577Q |= m4457e(childAt, 3) ? this.f4768g.m1577Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f4769h.m1577Q(childAt, getWidth(), childAt.getTop());
                c0999e.f4797c = false;
            }
        }
        this.f4770i.m4488p();
        this.f4771j.m4488p();
        if (zM1577Q) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: l */
    void m4464l(View view) {
        View rootView;
        C0999e c0999e = (C0999e) view.getLayoutParams();
        if ((c0999e.f4798d & 1) == 1) {
            c0999e.f4798d = 0;
            List list = this.f4783v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((InterfaceC0998d) this.f4783v.get(size)).mo4485d(view);
                }
            }
            m4431Z(view, false);
            m4430Y(view);
            m4453X();
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* JADX INFO: renamed from: m */
    void m4465m(View view) {
        C0999e c0999e = (C0999e) view.getLayoutParams();
        if ((c0999e.f4798d & 1) == 0) {
            c0999e.f4798d = 1;
            List list = this.f4783v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((InterfaceC0998d) this.f4783v.get(size)).mo4484c(view);
                }
            }
            m4431Z(view, true);
            m4430Y(view);
            m4453X();
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    void m4466n(View view, float f3) {
        List list = this.f4783v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC0998d) this.f4783v.get(size)).mo2771b(view, f3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4774m = true;
        m4453X();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4774m = true;
        m4453X();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4753E || this.f4786y == null) {
            return;
        }
        C0318w0 c0318w0 = this.f4752D;
        int iM1088l = c0318w0 != null ? c0318w0.m1088l() : 0;
        if (iM1088l > 0) {
            this.f4786y.setBounds(0, 0, getWidth(), iM1088l);
            this.f4786y.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            N.c r1 = r6.f4768g
            boolean r1 = r1.m1576P(r7)
            N.c r2 = r6.f4769h
            boolean r2 = r2.m1576P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            N.c r7 = r6.f4768g
            boolean r7 = r7.m1581d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f4770i
            r7.m4488p()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f4771j
            r7.m4488p()
            goto L36
        L31:
            r6.m4463k(r2)
            r6.f4781t = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f4784w = r0
            r6.f4785x = r7
            float r4 = r6.f4766e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            N.c r4 = r6.f4768g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.m1584t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.m4438D(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f4781t = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.m4422A()
            if (r7 != 0) goto L70
            boolean r7 = r6.f4781t
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 != 4 || !m4423B()) {
            return super.onKeyDown(i3, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (i3 != 4) {
            return super.onKeyUp(i3, keyEvent);
        }
        View viewM4469r = m4469r();
        if (viewM4469r != null && m4471t(viewM4469r) == 0) {
            m4462j();
        }
        return viewM4469r != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        C0318w0 c0318w0M735D;
        float f3;
        int i7;
        boolean z3 = true;
        this.f4773l = true;
        int i8 = i5 - i3;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0999e c0999e = (C0999e) childAt.getLayoutParams();
                if (m4438D(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) c0999e).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) c0999e).topMargin, childAt.getMeasuredWidth() + i10, ((ViewGroup.MarginLayoutParams) c0999e).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m4457e(childAt, 3)) {
                        float f4 = measuredWidth;
                        i7 = (-measuredWidth) + ((int) (c0999e.f4796b * f4));
                        f3 = (measuredWidth + i7) / f4;
                    } else {
                        float f5 = measuredWidth;
                        f3 = (i8 - r11) / f5;
                        i7 = i8 - ((int) (c0999e.f4796b * f5));
                    }
                    boolean z4 = f3 != c0999e.f4796b ? z3 : false;
                    int i11 = c0999e.f4795a & 112;
                    if (i11 == 16) {
                        int i12 = i6 - i4;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = ((ViewGroup.MarginLayoutParams) c0999e).topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = ((ViewGroup.MarginLayoutParams) c0999e).bottomMargin;
                            if (i15 > i12 - i16) {
                                i13 = (i12 - i16) - measuredHeight;
                            }
                        }
                        childAt.layout(i7, i13, measuredWidth + i7, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = ((ViewGroup.MarginLayoutParams) c0999e).topMargin;
                        childAt.layout(i7, i17, measuredWidth + i7, measuredHeight + i17);
                    } else {
                        int i18 = i6 - i4;
                        childAt.layout(i7, (i18 - ((ViewGroup.MarginLayoutParams) c0999e).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i18 - ((ViewGroup.MarginLayoutParams) c0999e).bottomMargin);
                    }
                    if (z4) {
                        m4452W(childAt, f3);
                    }
                    int i19 = c0999e.f4796b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
            i9++;
            z3 = true;
        }
        if (f4748R && (c0318w0M735D = AbstractC0268W.m735D(this)) != null) {
            C2572e c2572eM1084h = c0318w0M735D.m1084h();
            C0435c c0435c = this.f4768g;
            c0435c.m1572L(Math.max(c0435c.m1586w(), c2572eM1084h.f11899a));
            C0435c c0435c2 = this.f4769h;
            c0435c2.m1572L(Math.max(c0435c2.m1586w(), c2572eM1084h.f11901c));
        }
        this.f4773l = false;
        this.f4774m = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z2 = this.f4752D != null && AbstractC0268W.m800v(this);
        int iM806y = AbstractC0268W.m806y(this);
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0999e c0999e = (C0999e) childAt.getLayoutParams();
                if (z2) {
                    int iM1053b = AbstractC0309s.m1053b(c0999e.f4795a, iM806y);
                    if (AbstractC0268W.m800v(childAt)) {
                        C0318w0 c0318w0M1093r = this.f4752D;
                        if (iM1053b == 3) {
                            c0318w0M1093r = c0318w0M1093r.m1093r(c0318w0M1093r.m1086j(), c0318w0M1093r.m1088l(), 0, c0318w0M1093r.m1085i());
                        } else if (iM1053b == 5) {
                            c0318w0M1093r = c0318w0M1093r.m1093r(0, c0318w0M1093r.m1088l(), c0318w0M1093r.m1087k(), c0318w0M1093r.m1085i());
                        }
                        AbstractC0268W.m770g(childAt, c0318w0M1093r);
                    } else {
                        C0318w0 c0318w0M1093r2 = this.f4752D;
                        if (iM1053b == 3) {
                            c0318w0M1093r2 = c0318w0M1093r2.m1093r(c0318w0M1093r2.m1086j(), c0318w0M1093r2.m1088l(), 0, c0318w0M1093r2.m1085i());
                        } else if (iM1053b == 5) {
                            c0318w0M1093r2 = c0318w0M1093r2.m1093r(0, c0318w0M1093r2.m1088l(), c0318w0M1093r2.m1087k(), c0318w0M1093r2.m1085i());
                        }
                        ((ViewGroup.MarginLayoutParams) c0999e).leftMargin = c0318w0M1093r2.m1086j();
                        ((ViewGroup.MarginLayoutParams) c0999e).topMargin = c0318w0M1093r2.m1088l();
                        ((ViewGroup.MarginLayoutParams) c0999e).rightMargin = c0318w0M1093r2.m1087k();
                        ((ViewGroup.MarginLayoutParams) c0999e).bottomMargin = c0318w0M1093r2.m1085i();
                    }
                }
                if (m4438D(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c0999e).leftMargin) - ((ViewGroup.MarginLayoutParams) c0999e).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c0999e).topMargin) - ((ViewGroup.MarginLayoutParams) c0999e).bottomMargin, 1073741824));
                } else {
                    if (!m4441G(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f4747Q) {
                        float fM796t = AbstractC0268W.m796t(childAt);
                        float f3 = this.f4763b;
                        if (fM796t != f3) {
                            AbstractC0268W.m787o0(childAt, f3);
                        }
                    }
                    int iM4473v = m4473v(childAt) & 7;
                    boolean z5 = iM4473v == 3;
                    if ((z5 && z3) || (!z5 && z4)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m4436y(iM4473v) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z5) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i3, this.f4764c + ((ViewGroup.MarginLayoutParams) c0999e).leftMargin + ((ViewGroup.MarginLayoutParams) c0999e).rightMargin, ((ViewGroup.MarginLayoutParams) c0999e).width), ViewGroup.getChildMeasureSpec(i4, ((ViewGroup.MarginLayoutParams) c0999e).topMargin + ((ViewGroup.MarginLayoutParams) c0999e).bottomMargin, ((ViewGroup.MarginLayoutParams) c0999e).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewM4467p;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m4418a());
        int i3 = savedState.f4788f;
        if (i3 != 0 && (viewM4467p = m4467p(i3)) != null) {
            m4447O(viewM4467p);
        }
        int i4 = savedState.f4789g;
        if (i4 != 3) {
            m4451V(i4, 3);
        }
        int i5 = savedState.f4790h;
        if (i5 != 3) {
            m4451V(i5, 5);
        }
        int i6 = savedState.f4791i;
        if (i6 != 3) {
            m4451V(i6, 8388611);
        }
        int i7 = savedState.f4792j;
        if (i7 != 3) {
            m4451V(i7, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i3) {
        m4429T();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C0999e c0999e = (C0999e) getChildAt(i3).getLayoutParams();
            int i4 = c0999e.f4798d;
            boolean z2 = i4 == 1;
            boolean z3 = i4 == 2;
            if (z2 || z3) {
                savedState.f4788f = c0999e.f4795a;
                break;
            }
        }
        savedState.f4789g = this.f4777p;
        savedState.f4790h = this.f4778q;
        savedState.f4791i = this.f4779r;
        savedState.f4792j = this.f4780s;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            N.c r0 = r6.f4768g
            r0.m1570F(r7)
            N.c r0 = r6.f4769h
            r0.m1570F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.m4463k(r2)
            r6.f4781t = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            N.c r3 = r6.f4768g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.m1584t(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.m4438D(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f4784w
            float r0 = r0 - r3
            float r3 = r6.f4785x
            float r7 = r7 - r3
            N.c r3 = r6.f4768g
            int r3 = r3.m1588z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.m4468q()
            if (r7 == 0) goto L5a
            int r7 = r6.m4471t(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.m4463k(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f4784w = r0
            r6.f4785x = r7
            r6.f4781t = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    View m4467p(int i3) {
        int iM1053b = AbstractC0309s.m1053b(i3, AbstractC0268W.m806y(this)) & 7;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((m4473v(childAt) & 7) == iM1053b) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    View m4468q() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((((C0999e) childAt.getLayoutParams()).f4798d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    View m4469r() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (m4441G(childAt) && m4443I(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            m4463k(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4773l) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public int m4470s(int i3) {
        int iM806y = AbstractC0268W.m806y(this);
        if (i3 == 3) {
            int i4 = this.f4777p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iM806y == 0 ? this.f4779r : this.f4780s;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i3 == 5) {
            int i6 = this.f4778q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iM806y == 0 ? this.f4780s : this.f4779r;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i3 == 8388611) {
            int i8 = this.f4779r;
            if (i8 != 3) {
                return i8;
            }
            int i9 = iM806y == 0 ? this.f4777p : this.f4778q;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
        if (i3 != 8388613) {
            return 0;
        }
        int i10 = this.f4780s;
        if (i10 != 3) {
            return i10;
        }
        int i11 = iM806y == 0 ? this.f4778q : this.f4777p;
        if (i11 != 3) {
            return i11;
        }
        return 0;
    }

    public void setDrawerElevation(float f3) {
        this.f4763b = f3;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (m4441G(childAt)) {
                AbstractC0268W.m787o0(childAt, this.f4763b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0998d interfaceC0998d) {
        InterfaceC0998d interfaceC0998d2 = this.f4782u;
        if (interfaceC0998d2 != null) {
            m4449Q(interfaceC0998d2);
        }
        if (interfaceC0998d != null) {
            m4455c(interfaceC0998d);
        }
        this.f4782u = interfaceC0998d;
    }

    public void setDrawerLockMode(int i3) {
        m4451V(i3, 3);
        m4451V(i3, 5);
    }

    public void setScrimColor(int i3) {
        this.f4765d = i3;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f4786y = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i3) {
        this.f4786y = new ColorDrawable(i3);
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public int m4471t(View view) {
        if (m4441G(view)) {
            return m4470s(((C0999e) view.getLayoutParams()).f4795a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: u */
    public CharSequence m4472u(int i3) {
        int iM1053b = AbstractC0309s.m1053b(i3, AbstractC0268W.m806y(this));
        if (iM1053b == 3) {
            return this.f4750B;
        }
        if (iM1053b == 5) {
            return this.f4751C;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    int m4473v(View view) {
        return AbstractC0309s.m1053b(((C0999e) view.getLayoutParams()).f4795a, AbstractC0268W.m806y(this));
    }

    /* JADX INFO: renamed from: w */
    float m4474w(View view) {
        return ((C0999e) view.getLayoutParams()).f4796b;
    }

    public void setStatusBarBackground(int i3) {
        this.f4786y = i3 != 0 ? AbstractC0966b.getDrawable(getContext(), i3) : null;
        invalidate();
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public static class C0999e extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f4795a;

        /* JADX INFO: renamed from: b */
        float f4796b;

        /* JADX INFO: renamed from: c */
        boolean f4797c;

        /* JADX INFO: renamed from: d */
        int f4798d;

        public C0999e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4795a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f4745O);
            this.f4795a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0999e(int i3, int i4) {
            super(i3, i4);
            this.f4795a = 0;
        }

        public C0999e(C0999e c0999e) {
            super((ViewGroup.MarginLayoutParams) c0999e);
            this.f4795a = 0;
            this.f4795a = c0999e.f4795a;
        }

        public C0999e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4795a = 0;
        }

        public C0999e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4795a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0999e(getContext(), attributeSet);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0994a();

        /* JADX INFO: renamed from: f */
        int f4788f;

        /* JADX INFO: renamed from: g */
        int f4789g;

        /* JADX INFO: renamed from: h */
        int f4790h;

        /* JADX INFO: renamed from: i */
        int f4791i;

        /* JADX INFO: renamed from: j */
        int f4792j;

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        class C0994a implements Parcelable.ClassLoaderCreator {
            C0994a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4788f = 0;
            this.f4788f = parcel.readInt();
            this.f4789g = parcel.readInt();
            this.f4790h = parcel.readInt();
            this.f4791i = parcel.readInt();
            this.f4792j = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f4788f);
            parcel.writeInt(this.f4789g);
            parcel.writeInt(this.f4790h);
            parcel.writeInt(this.f4791i);
            parcel.writeInt(this.f4792j);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f4788f = 0;
        }
    }
}
