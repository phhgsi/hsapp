package p018G;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p018G.C0158g;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: G.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0158g {

    /* JADX INFO: renamed from: b */
    public static final a f1093b = new a(null);

    /* JADX INFO: renamed from: a */
    private final b f1094a;

    /* JADX INFO: renamed from: G.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0158g m433a(Activity activity) {
            AbstractC0606k.m2145e(activity, "<this>");
            C0158g c0158g = new C0158g(activity, null);
            c0158g.m429b();
            return c0158g;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G.g$b */
    static class b {

        /* JADX INFO: renamed from: a */
        private final Activity f1095a;

        /* JADX INFO: renamed from: b */
        private int f1096b;

        /* JADX INFO: renamed from: c */
        private Integer f1097c;

        /* JADX INFO: renamed from: d */
        private Integer f1098d;

        /* JADX INFO: renamed from: e */
        private Drawable f1099e;

        /* JADX INFO: renamed from: f */
        private boolean f1100f;

        /* JADX INFO: renamed from: g */
        private d f1101g;

        /* JADX INFO: renamed from: h */
        private e f1102h;

        /* JADX INFO: renamed from: i */
        private C0172u f1103i;

        /* JADX INFO: renamed from: G.g$b$a */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f1105b;

            a(View view) {
                this.f1105b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (b.this.m443i().mo454a()) {
                    return false;
                }
                this.f1105b.getViewTreeObserver().removeOnPreDrawListener(this);
                C0172u c0172u = b.this.f1103i;
                if (c0172u == null) {
                    return true;
                }
                b.this.m441e(c0172u);
                return true;
            }
        }

        /* JADX INFO: renamed from: G.g$b$b, reason: collision with other inner class name */
        public static final class ViewOnLayoutChangeListenerC2605b implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C0172u f1107b;

            ViewOnLayoutChangeListenerC2605b(C0172u c0172u) {
                this.f1107b = c0172u;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                AbstractC0606k.m2145e(view, "view");
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    if (!b.this.m443i().mo454a()) {
                        b.this.m441e(this.f1107b);
                    } else {
                        b.this.f1103i = this.f1107b;
                    }
                }
            }
        }

        public b(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            this.f1095a = activity;
            this.f1101g = new d() { // from class: G.h
                @Override // p018G.C0158g.d
                /* JADX INFO: renamed from: a */
                public final boolean mo454a() {
                    return C0158g.b.m440o();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final void m438f(C0172u c0172u, e eVar) {
            c0172u.m466a().bringToFront();
            eVar.mo455a(c0172u);
        }

        /* JADX INFO: renamed from: g */
        private final void m439g(View view, Drawable drawable) {
            float dimension;
            ImageView imageView = (ImageView) view.findViewById(AbstractC0156e.f1091a);
            if (this.f1100f) {
                Drawable drawableM9609b = AbstractC1832a.m9609b(imageView.getContext(), AbstractC0155d.f1090a);
                dimension = imageView.getResources().getDimension(AbstractC0154c.f1089b) * 0.6666667f;
                if (drawableM9609b != null) {
                    imageView.setBackground(new C0152a(drawableM9609b, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(AbstractC0154c.f1088a) * 0.6666667f;
            }
            imageView.setImageDrawable(new C0152a(drawable, dimension));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public static final boolean m440o() {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public final void m441e(final C0172u c0172u) {
            AbstractC0606k.m2145e(c0172u, "splashScreenViewProvider");
            final e eVar = this.f1102h;
            if (eVar == null) {
                return;
            }
            this.f1102h = null;
            c0172u.m466a().postOnAnimation(new Runnable() { // from class: G.i
                @Override // java.lang.Runnable
                public final void run() {
                    C0158g.b.m438f(c0172u, eVar);
                }
            });
        }

        /* JADX INFO: renamed from: h */
        public final Activity m442h() {
            return this.f1095a;
        }

        /* JADX INFO: renamed from: i */
        public final d m443i() {
            return this.f1101g;
        }

        /* JADX INFO: renamed from: j */
        public void mo444j() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f1095a.getTheme();
            if (theme.resolveAttribute(AbstractC0153b.f1087d, typedValue, true)) {
                this.f1097c = Integer.valueOf(typedValue.resourceId);
                this.f1098d = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(AbstractC0153b.f1086c, typedValue, true)) {
                this.f1099e = AbstractC1832a.m9609b(this.f1095a, typedValue.resourceId);
            }
            if (theme.resolveAttribute(AbstractC0153b.f1085b, typedValue, true)) {
                this.f1100f = typedValue.resourceId == AbstractC0154c.f1089b;
            }
            AbstractC0606k.m2142b(theme);
            m447m(theme, typedValue);
        }

        /* JADX INFO: renamed from: k */
        public void mo445k(d dVar) {
            AbstractC0606k.m2145e(dVar, "keepOnScreenCondition");
            this.f1101g = dVar;
            View viewFindViewById = this.f1095a.findViewById(R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new a(viewFindViewById));
        }

        /* JADX INFO: renamed from: l */
        public void mo446l(e eVar) {
            AbstractC0606k.m2145e(eVar, "exitAnimationListener");
            this.f1102h = eVar;
            C0172u c0172u = new C0172u(this.f1095a);
            Integer num = this.f1097c;
            Integer num2 = this.f1098d;
            View viewM466a = c0172u.m466a();
            if (num != null && num.intValue() != 0) {
                viewM466a.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                viewM466a.setBackgroundColor(num2.intValue());
            } else {
                viewM466a.setBackground(this.f1095a.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f1099e;
            if (drawable != null) {
                m439g(viewM466a, drawable);
            }
            viewM466a.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2605b(c0172u));
        }

        /* JADX INFO: renamed from: m */
        protected final void m447m(Resources.Theme theme, TypedValue typedValue) {
            AbstractC0606k.m2145e(theme, "currentTheme");
            AbstractC0606k.m2145e(typedValue, "typedValue");
            if (theme.resolveAttribute(AbstractC0153b.f1084a, typedValue, true)) {
                int i3 = typedValue.resourceId;
                this.f1096b = i3;
                if (i3 != 0) {
                    this.f1095a.setTheme(i3);
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public final void m448n(d dVar) {
            AbstractC0606k.m2145e(dVar, "<set-?>");
            this.f1101g = dVar;
        }
    }

    /* JADX INFO: renamed from: G.g$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        boolean mo454a();
    }

    /* JADX INFO: renamed from: G.g$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo455a(C0172u c0172u);
    }

    public /* synthetic */ C0158g(Activity activity, AbstractC0602g abstractC0602g) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m429b() {
        this.f1094a.mo444j();
    }

    /* JADX INFO: renamed from: c */
    public static final C0158g m430c(Activity activity) {
        return f1093b.m433a(activity);
    }

    /* JADX INFO: renamed from: d */
    public final void m431d(d dVar) {
        AbstractC0606k.m2145e(dVar, "condition");
        this.f1094a.mo445k(dVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m432e(e eVar) {
        AbstractC0606k.m2145e(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f1094a.mo446l(eVar);
    }

    private C0158g(Activity activity) {
        this.f1094a = Build.VERSION.SDK_INT >= 31 ? new c(activity) : new b(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G.g$c */
    static final class c extends b {

        /* JADX INFO: renamed from: j */
        private ViewTreeObserver.OnPreDrawListener f1108j;

        /* JADX INFO: renamed from: k */
        private boolean f1109k;

        /* JADX INFO: renamed from: l */
        private final ViewGroup.OnHierarchyChangeListener f1110l;

        /* JADX INFO: renamed from: G.g$c$b */
        public static final class b implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f1114b;

            b(View view) {
                this.f1114b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (c.this.m443i().mo454a()) {
                    return false;
                }
                this.f1114b.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity);
            AbstractC0606k.m2145e(activity, "activity");
            this.f1109k = true;
            this.f1110l = new a(activity);
        }

        /* JADX INFO: renamed from: q */
        private final void m450q() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = m442h().getTheme();
            Window window = m442h().getWindow();
            if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            View decorView = window.getDecorView();
            AbstractC0606k.m2143c(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            AbstractC0606k.m2142b(theme);
            C0175x.m480a(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(this.f1109k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public static final void m451t(c cVar, e eVar, SplashScreenView splashScreenView) {
            AbstractC0606k.m2145e(splashScreenView, "splashScreenView");
            if (Build.VERSION.SDK_INT < 33) {
                cVar.m450q();
            }
            eVar.mo455a(new C0172u(splashScreenView, cVar.m442h()));
        }

        @Override // p018G.C0158g.b
        /* JADX INFO: renamed from: j */
        public void mo444j() {
            Resources.Theme theme = m442h().getTheme();
            AbstractC0606k.m2144d(theme, "getTheme(...)");
            m447m(theme, new TypedValue());
            if (Build.VERSION.SDK_INT < 33) {
                View decorView = m442h().getWindow().getDecorView();
                AbstractC0606k.m2143c(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f1110l);
            }
        }

        @Override // p018G.C0158g.b
        /* JADX INFO: renamed from: k */
        public void mo445k(d dVar) {
            AbstractC0606k.m2145e(dVar, "keepOnScreenCondition");
            m448n(dVar);
            View viewFindViewById = m442h().findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.f1108j != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f1108j);
            }
            b bVar = new b(viewFindViewById);
            this.f1108j = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }

        @Override // p018G.C0158g.b
        /* JADX INFO: renamed from: l */
        public void mo446l(final e eVar) {
            AbstractC0606k.m2145e(eVar, "exitAnimationListener");
            m442h().getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: G.p
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    C0158g.c.m451t(this.f1117a, eVar, splashScreenView);
                }
            });
        }

        /* JADX INFO: renamed from: r */
        public final boolean m452r(SplashScreenView splashScreenView) {
            AbstractC0606k.m2145e(splashScreenView, "child");
            WindowInsets windowInsetsBuild = AbstractC0161j.m456a().build();
            AbstractC0606k.m2144d(windowInsetsBuild, "build(...)");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return (windowInsetsBuild == splashScreenView.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        /* JADX INFO: renamed from: s */
        public final void m453s(boolean z2) {
            this.f1109k = z2;
        }

        /* JADX INFO: renamed from: G.g$c$a */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Activity f1112b;

            a(Activity activity) {
                this.f1112b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (AbstractC0168q.m462a(view2)) {
                    c cVar = c.this;
                    cVar.m453s(cVar.m452r(AbstractC0169r.m463a(view2)));
                    View decorView = this.f1112b.getWindow().getDecorView();
                    AbstractC0606k.m2143c(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }
    }
}
