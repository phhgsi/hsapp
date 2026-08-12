package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.AbstractC0772b;
import androidx.appcompat.view.C0771a;
import androidx.appcompat.view.C0777g;
import androidx.appcompat.view.C0778h;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.InterfaceC0831H;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p027J.AbstractC0268W;
import p027J.AbstractC0286g0;
import p027J.C0282e0;
import p027J.InterfaceC0284f0;
import p027J.InterfaceC0288h0;
import p091d.AbstractC1760a;
import p091d.AbstractC1765f;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.app.I */
/* JADX INFO: loaded from: classes.dex */
public class C0744I extends AbstractC0745a implements ActionBarOverlayLayout.InterfaceC0801d {

    /* JADX INFO: renamed from: D */
    private static final Interpolator f2620D = new AccelerateInterpolator();

    /* JADX INFO: renamed from: E */
    private static final Interpolator f2621E = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    Context f2625a;

    /* JADX INFO: renamed from: b */
    private Context f2626b;

    /* JADX INFO: renamed from: c */
    private Activity f2627c;

    /* JADX INFO: renamed from: d */
    ActionBarOverlayLayout f2628d;

    /* JADX INFO: renamed from: e */
    ActionBarContainer f2629e;

    /* JADX INFO: renamed from: f */
    InterfaceC0831H f2630f;

    /* JADX INFO: renamed from: g */
    ActionBarContextView f2631g;

    /* JADX INFO: renamed from: h */
    View f2632h;

    /* JADX INFO: renamed from: k */
    private boolean f2635k;

    /* JADX INFO: renamed from: l */
    d f2636l;

    /* JADX INFO: renamed from: m */
    AbstractC0772b f2637m;

    /* JADX INFO: renamed from: n */
    AbstractC0772b.a f2638n;

    /* JADX INFO: renamed from: o */
    private boolean f2639o;

    /* JADX INFO: renamed from: q */
    private boolean f2641q;

    /* JADX INFO: renamed from: t */
    boolean f2644t;

    /* JADX INFO: renamed from: u */
    boolean f2645u;

    /* JADX INFO: renamed from: v */
    private boolean f2646v;

    /* JADX INFO: renamed from: x */
    C0778h f2648x;

    /* JADX INFO: renamed from: y */
    private boolean f2649y;

    /* JADX INFO: renamed from: z */
    boolean f2650z;

    /* JADX INFO: renamed from: i */
    private ArrayList f2633i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private int f2634j = -1;

    /* JADX INFO: renamed from: p */
    private ArrayList f2640p = new ArrayList();

    /* JADX INFO: renamed from: r */
    private int f2642r = 0;

    /* JADX INFO: renamed from: s */
    boolean f2643s = true;

    /* JADX INFO: renamed from: w */
    private boolean f2647w = true;

    /* JADX INFO: renamed from: A */
    final InterfaceC0284f0 f2622A = new a();

    /* JADX INFO: renamed from: B */
    final InterfaceC0284f0 f2623B = new b();

    /* JADX INFO: renamed from: C */
    final InterfaceC0288h0 f2624C = new c();

    /* JADX INFO: renamed from: androidx.appcompat.app.I$a */
    class a extends AbstractC0286g0 {
        a() {
        }

        @Override // p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: b */
        public void mo972b(View view) {
            View view2;
            C0744I c0744i = C0744I.this;
            if (c0744i.f2643s && (view2 = c0744i.f2632h) != null) {
                view2.setTranslationY(0.0f);
                C0744I.this.f2629e.setTranslationY(0.0f);
            }
            C0744I.this.f2629e.setVisibility(8);
            C0744I.this.f2629e.setTransitioning(false);
            C0744I c0744i2 = C0744I.this;
            c0744i2.f2648x = null;
            c0744i2.m2740D();
            ActionBarOverlayLayout actionBarOverlayLayout = C0744I.this.f2628d;
            if (actionBarOverlayLayout != null) {
                AbstractC0268W.m769f0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.I$b */
    class b extends AbstractC0286g0 {
        b() {
        }

        @Override // p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: b */
        public void mo972b(View view) {
            C0744I c0744i = C0744I.this;
            c0744i.f2648x = null;
            c0744i.f2629e.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.I$c */
    class c implements InterfaceC0288h0 {
        c() {
        }

        @Override // p027J.InterfaceC0288h0
        /* JADX INFO: renamed from: a */
        public void mo976a(View view) {
            ((View) C0744I.this.f2629e.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.I$d */
    public class d extends AbstractC0772b implements C0786e.a {

        /* JADX INFO: renamed from: c */
        private final Context f2654c;

        /* JADX INFO: renamed from: d */
        private final C0786e f2655d;

        /* JADX INFO: renamed from: e */
        private AbstractC0772b.a f2656e;

        /* JADX INFO: renamed from: f */
        private WeakReference f2657f;

        public d(Context context, AbstractC0772b.a aVar) {
            this.f2654c = context;
            this.f2656e = aVar;
            C0786e c0786eM3144X = new C0786e(context).m3144X(1);
            this.f2655d = c0786eM3144X;
            c0786eM3144X.mo3143W(this);
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: a */
        public boolean mo2719a(C0786e c0786e, MenuItem menuItem) {
            AbstractC0772b.a aVar = this.f2656e;
            if (aVar != null) {
                return aVar.mo2931c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: b */
        public void mo2720b(C0786e c0786e) {
            if (this.f2656e == null) {
                return;
            }
            mo2760k();
            C0744I.this.f2631g.m3269l();
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: c */
        public void mo2754c() {
            C0744I c0744i = C0744I.this;
            if (c0744i.f2636l != this) {
                return;
            }
            if (C0744I.m2730C(c0744i.f2644t, c0744i.f2645u, false)) {
                this.f2656e.mo2930b(this);
            } else {
                C0744I c0744i2 = C0744I.this;
                c0744i2.f2637m = this;
                c0744i2.f2638n = this.f2656e;
            }
            this.f2656e = null;
            C0744I.this.m2739B(false);
            C0744I.this.f2631g.m3265g();
            C0744I c0744i3 = C0744I.this;
            c0744i3.f2628d.setHideOnContentScrollEnabled(c0744i3.f2650z);
            C0744I.this.f2636l = null;
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: d */
        public View mo2755d() {
            WeakReference weakReference = this.f2657f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: e */
        public Menu mo2756e() {
            return this.f2655d;
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: f */
        public MenuInflater mo2757f() {
            return new C0777g(this.f2654c);
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: g */
        public CharSequence mo2758g() {
            return C0744I.this.f2631g.getSubtitle();
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: i */
        public CharSequence mo2759i() {
            return C0744I.this.f2631g.getTitle();
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: k */
        public void mo2760k() {
            if (C0744I.this.f2636l != this) {
                return;
            }
            this.f2655d.m3160i0();
            try {
                this.f2656e.mo2929a(this, this.f2655d);
            } finally {
                this.f2655d.m3159h0();
            }
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: l */
        public boolean mo2761l() {
            return C0744I.this.f2631g.m3267j();
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: m */
        public void mo2762m(View view) {
            C0744I.this.f2631g.setCustomView(view);
            this.f2657f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: n */
        public void mo2763n(int i3) {
            mo2764o(C0744I.this.f2625a.getResources().getString(i3));
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: o */
        public void mo2764o(CharSequence charSequence) {
            C0744I.this.f2631g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: q */
        public void mo2765q(int i3) {
            mo2766r(C0744I.this.f2625a.getResources().getString(i3));
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: r */
        public void mo2766r(CharSequence charSequence) {
            C0744I.this.f2631g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0772b
        /* JADX INFO: renamed from: s */
        public void mo2767s(boolean z2) {
            super.mo2767s(z2);
            C0744I.this.f2631g.setTitleOptional(z2);
        }

        /* JADX INFO: renamed from: t */
        public boolean m2768t() {
            this.f2655d.m3160i0();
            try {
                return this.f2656e.mo2932d(this, this.f2655d);
            } finally {
                this.f2655d.m3159h0();
            }
        }
    }

    public C0744I(Activity activity, boolean z2) {
        this.f2627c = activity;
        View decorView = activity.getWindow().getDecorView();
        m2733J(decorView);
        if (z2) {
            return;
        }
        this.f2632h = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: C */
    static boolean m2730C(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return (z2 || z3) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private InterfaceC0831H m2731G(View view) {
        if (view instanceof InterfaceC0831H) {
            return (InterfaceC0831H) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: I */
    private void m2732I() {
        if (this.f2646v) {
            this.f2646v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2628d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m2737R(false);
        }
    }

    /* JADX INFO: renamed from: J */
    private void m2733J(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC1765f.f8824p);
        this.f2628d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f2630f = m2731G(view.findViewById(AbstractC1765f.f8809a));
        this.f2631g = (ActionBarContextView) view.findViewById(AbstractC1765f.f8814f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC1765f.f8811c);
        this.f2629e = actionBarContainer;
        InterfaceC0831H interfaceC0831H = this.f2630f;
        if (interfaceC0831H == null || this.f2631g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2625a = interfaceC0831H.mo3422c();
        boolean z2 = (this.f2630f.mo3436q() & 4) != 0;
        if (z2) {
            this.f2635k = true;
        }
        C0771a c0771aM2998b = C0771a.m2998b(this.f2625a);
        m2747O(c0771aM2998b.m2999a() || z2);
        m2734M(c0771aM2998b.m3002e());
        TypedArray typedArrayObtainStyledAttributes = this.f2625a.obtainStyledAttributes(null, AbstractC1769j.f9006a, AbstractC1760a.f8702c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f9062k, false)) {
            m2746N(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1769j.f9052i, 0);
        if (dimensionPixelSize != 0) {
            m2745L(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: M */
    private void m2734M(boolean z2) {
        this.f2641q = z2;
        if (z2) {
            this.f2629e.setTabContainer(null);
            this.f2630f.mo3431l(null);
        } else {
            this.f2630f.mo3431l(null);
            this.f2629e.setTabContainer(null);
        }
        boolean z3 = false;
        boolean z4 = m2743H() == 2;
        this.f2630f.mo3445z(!this.f2641q && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2628d;
        if (!this.f2641q && z4) {
            z3 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    /* JADX INFO: renamed from: P */
    private boolean m2735P() {
        return this.f2629e.isLaidOut();
    }

    /* JADX INFO: renamed from: Q */
    private void m2736Q() {
        if (this.f2646v) {
            return;
        }
        this.f2646v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2628d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m2737R(false);
    }

    /* JADX INFO: renamed from: R */
    private void m2737R(boolean z2) {
        if (m2730C(this.f2644t, this.f2645u, this.f2646v)) {
            if (this.f2647w) {
                return;
            }
            this.f2647w = true;
            m2742F(z2);
            return;
        }
        if (this.f2647w) {
            this.f2647w = false;
            m2741E(z2);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: A */
    public AbstractC0772b mo2738A(AbstractC0772b.a aVar) {
        d dVar = this.f2636l;
        if (dVar != null) {
            dVar.mo2754c();
        }
        this.f2628d.setHideOnContentScrollEnabled(false);
        this.f2631g.m3268k();
        d dVar2 = new d(this.f2631g.getContext(), aVar);
        if (!dVar2.m2768t()) {
            return null;
        }
        this.f2636l = dVar2;
        dVar2.mo2760k();
        this.f2631g.m3266h(dVar2);
        m2739B(true);
        return dVar2;
    }

    /* JADX INFO: renamed from: B */
    public void m2739B(boolean z2) {
        C0282e0 c0282e0Mo3441v;
        C0282e0 c0282e0Mo3264f;
        if (z2) {
            m2736Q();
        } else {
            m2732I();
        }
        if (!m2735P()) {
            if (z2) {
                this.f2630f.mo3430k(4);
                this.f2631g.setVisibility(0);
                return;
            } else {
                this.f2630f.mo3430k(0);
                this.f2631g.setVisibility(8);
                return;
            }
        }
        if (z2) {
            c0282e0Mo3264f = this.f2630f.mo3441v(4, 100L);
            c0282e0Mo3441v = this.f2631g.mo3264f(0, 200L);
        } else {
            c0282e0Mo3441v = this.f2630f.mo3441v(0, 200L);
            c0282e0Mo3264f = this.f2631g.mo3264f(8, 100L);
        }
        C0778h c0778h = new C0778h();
        c0778h.m3032d(c0282e0Mo3264f, c0282e0Mo3441v);
        c0778h.m3036h();
    }

    /* JADX INFO: renamed from: D */
    void m2740D() {
        AbstractC0772b.a aVar = this.f2638n;
        if (aVar != null) {
            aVar.mo2930b(this.f2637m);
            this.f2637m = null;
            this.f2638n = null;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m2741E(boolean z2) {
        View view;
        C0778h c0778h = this.f2648x;
        if (c0778h != null) {
            c0778h.m3029a();
        }
        if (this.f2642r != 0 || (!this.f2649y && !z2)) {
            this.f2622A.mo972b(null);
            return;
        }
        this.f2629e.setAlpha(1.0f);
        this.f2629e.setTransitioning(true);
        C0778h c0778h2 = new C0778h();
        float f3 = -this.f2629e.getHeight();
        if (z2) {
            this.f2629e.getLocationInWindow(new int[]{0, 0});
            f3 -= r5[1];
        }
        C0282e0 c0282e0M969l = AbstractC0268W.m766e(this.f2629e).m969l(f3);
        c0282e0M969l.m967j(this.f2624C);
        c0778h2.m3031c(c0282e0M969l);
        if (this.f2643s && (view = this.f2632h) != null) {
            c0778h2.m3031c(AbstractC0268W.m766e(view).m969l(f3));
        }
        c0778h2.m3034f(f2620D);
        c0778h2.m3033e(250L);
        c0778h2.m3035g(this.f2622A);
        this.f2648x = c0778h2;
        c0778h2.m3036h();
    }

    /* JADX INFO: renamed from: F */
    public void m2742F(boolean z2) {
        View view;
        View view2;
        C0778h c0778h = this.f2648x;
        if (c0778h != null) {
            c0778h.m3029a();
        }
        this.f2629e.setVisibility(0);
        if (this.f2642r == 0 && (this.f2649y || z2)) {
            this.f2629e.setTranslationY(0.0f);
            float f3 = -this.f2629e.getHeight();
            if (z2) {
                this.f2629e.getLocationInWindow(new int[]{0, 0});
                f3 -= r5[1];
            }
            this.f2629e.setTranslationY(f3);
            C0778h c0778h2 = new C0778h();
            C0282e0 c0282e0M969l = AbstractC0268W.m766e(this.f2629e).m969l(0.0f);
            c0282e0M969l.m967j(this.f2624C);
            c0778h2.m3031c(c0282e0M969l);
            if (this.f2643s && (view2 = this.f2632h) != null) {
                view2.setTranslationY(f3);
                c0778h2.m3031c(AbstractC0268W.m766e(this.f2632h).m969l(0.0f));
            }
            c0778h2.m3034f(f2621E);
            c0778h2.m3033e(250L);
            c0778h2.m3035g(this.f2623B);
            this.f2648x = c0778h2;
            c0778h2.m3036h();
        } else {
            this.f2629e.setAlpha(1.0f);
            this.f2629e.setTranslationY(0.0f);
            if (this.f2643s && (view = this.f2632h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f2623B.mo972b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2628d;
        if (actionBarOverlayLayout != null) {
            AbstractC0268W.m769f0(actionBarOverlayLayout);
        }
    }

    /* JADX INFO: renamed from: H */
    public int m2743H() {
        return this.f2630f.mo3440u();
    }

    /* JADX INFO: renamed from: K */
    public void m2744K(int i3, int i4) {
        int iMo3436q = this.f2630f.mo3436q();
        if ((i4 & 4) != 0) {
            this.f2635k = true;
        }
        this.f2630f.mo3435p((i3 & i4) | ((~i4) & iMo3436q));
    }

    /* JADX INFO: renamed from: L */
    public void m2745L(float f3) {
        AbstractC0268W.m787o0(this.f2629e, f3);
    }

    /* JADX INFO: renamed from: N */
    public void m2746N(boolean z2) {
        if (z2 && !this.f2628d.m3292x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f2650z = z2;
        this.f2628d.setHideOnContentScrollEnabled(z2);
    }

    /* JADX INFO: renamed from: O */
    public void m2747O(boolean z2) {
        this.f2630f.mo3433n(z2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0801d
    /* JADX INFO: renamed from: a */
    public void mo2748a() {
        if (this.f2645u) {
            this.f2645u = false;
            m2737R(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0801d
    /* JADX INFO: renamed from: b */
    public void mo2749b() {
        C0778h c0778h = this.f2648x;
        if (c0778h != null) {
            c0778h.m3029a();
            this.f2648x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0801d
    /* JADX INFO: renamed from: c */
    public void mo2750c(int i3) {
        this.f2642r = i3;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0801d
    /* JADX INFO: renamed from: d */
    public void mo2751d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0801d
    /* JADX INFO: renamed from: e */
    public void mo2752e(boolean z2) {
        this.f2643s = z2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0801d
    /* JADX INFO: renamed from: f */
    public void mo2753f() {
        if (this.f2645u) {
            return;
        }
        this.f2645u = true;
        m2737R(true);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: h */
    public boolean mo2698h() {
        InterfaceC0831H interfaceC0831H = this.f2630f;
        if (interfaceC0831H == null || !interfaceC0831H.mo3434o()) {
            return false;
        }
        this.f2630f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: i */
    public void mo2699i(boolean z2) {
        if (z2 == this.f2639o) {
            return;
        }
        this.f2639o = z2;
        if (this.f2640p.size() <= 0) {
            return;
        }
        AbstractC0740E.m2693a(this.f2640p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: j */
    public int mo2700j() {
        return this.f2630f.mo3436q();
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: k */
    public Context mo2701k() {
        if (this.f2626b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2625a.getTheme().resolveAttribute(AbstractC1760a.f8704e, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                this.f2626b = new ContextThemeWrapper(this.f2625a, i3);
            } else {
                this.f2626b = this.f2625a;
            }
        }
        return this.f2626b;
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: l */
    public void mo2702l() {
        if (this.f2644t) {
            return;
        }
        this.f2644t = true;
        m2737R(false);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: n */
    public void mo2704n(Configuration configuration) {
        m2734M(C0771a.m2998b(this.f2625a).m3002e());
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: p */
    public boolean mo2706p(int i3, KeyEvent keyEvent) {
        Menu menuMo2756e;
        d dVar = this.f2636l;
        if (dVar == null || (menuMo2756e = dVar.mo2756e()) == null) {
            return false;
        }
        menuMo2756e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo2756e.performShortcut(i3, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: s */
    public void mo2709s(boolean z2) {
        if (this.f2635k) {
            return;
        }
        mo2710t(z2);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: t */
    public void mo2710t(boolean z2) {
        m2744K(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: u */
    public void mo2711u(boolean z2) {
        m2744K(z2 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: v */
    public void mo2712v(int i3) {
        this.f2630f.mo3439t(i3);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: w */
    public void mo2713w(Drawable drawable) {
        this.f2630f.mo3444y(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: x */
    public void mo2714x(boolean z2) {
        C0778h c0778h;
        this.f2649y = z2;
        if (z2 || (c0778h = this.f2648x) == null) {
            return;
        }
        c0778h.m3029a();
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: y */
    public void mo2715y(CharSequence charSequence) {
        this.f2630f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: z */
    public void mo2716z() {
        if (this.f2644t) {
            this.f2644t = false;
            m2737R(false);
        }
    }

    public C0744I(Dialog dialog) {
        m2733J(dialog.getWindow().getDecorView());
    }
}
