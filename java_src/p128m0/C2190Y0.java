package p128m0;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0718r;
import androidx.activity.C0688K;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.median.android.MainActivity;
import co.median.android.jrejze.R;
import p027J.AbstractC0268W;
import p027J.AbstractC0290i0;
import p027J.C0265U0;
import p027J.C0318w0;
import p027J.InterfaceC0235F;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p098e2.AbstractC1868d;
import p135o0.C2287a;
import p135o0.C2292f;
import p167z.C2572e;

/* JADX INFO: renamed from: m0.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2190Y0 {

    /* JADX INFO: renamed from: k */
    public static final a f10269k = new a(null);

    /* JADX INFO: renamed from: a */
    private final MainActivity f10270a;

    /* JADX INFO: renamed from: b */
    private final boolean f10271b;

    /* JADX INFO: renamed from: c */
    private C0265U0 f10272c;

    /* JADX INFO: renamed from: d */
    private C0688K f10273d;

    /* JADX INFO: renamed from: e */
    private C0688K f10274e;

    /* JADX INFO: renamed from: f */
    private View f10275f;

    /* JADX INFO: renamed from: g */
    private View f10276g;

    /* JADX INFO: renamed from: h */
    private CoordinatorLayout f10277h;

    /* JADX INFO: renamed from: i */
    private String f10278i;

    /* JADX INFO: renamed from: j */
    private String f10279j;

    /* JADX INFO: renamed from: m0.Y0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    public C2190Y0(MainActivity mainActivity) {
        AbstractC0606k.m2145e(mainActivity, "mainActivity");
        this.f10270a = mainActivity;
        this.f10271b = Build.VERSION.SDK_INT >= 35;
        this.f10278i = C2287a.m10903f(mainActivity).f10476F0;
        this.f10279j = C2287a.m10903f(mainActivity).f10478G0;
    }

    /* JADX INFO: renamed from: c */
    private final C0688K m10716c(String str, int i3) {
        return m10717e(str) ? C0688K.f2410e.m2587b(i3, i3) : C0688K.f2410e.m2586a(i3);
    }

    /* JADX INFO: renamed from: e */
    private final boolean m10717e(String str) {
        int i3;
        if (!TextUtils.isEmpty(str)) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3005871) {
                if (iHashCode != 3075958) {
                    if (iHashCode == 102970646) {
                        str.equals("light");
                    }
                } else if (str.equals("dark")) {
                    return false;
                }
            } else if (str.equals("auto") && (i3 = this.f10270a.getResources().getConfiguration().uiMode & 48) != 16) {
                if (i3 == 32) {
                    return false;
                }
                C2292f.m10956b().m10959e("SystemBarManager", "isLightMode: Current mode is undefined");
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C0318w0 m10718j(C2190Y0 c2190y0, View view, C0318w0 c0318w0) {
        AbstractC0606k.m2145e(view, "v");
        AbstractC0606k.m2145e(c0318w0, "insets");
        C2287a c2287aM10903f = C2287a.m10903f(c2190y0.f10270a);
        C2572e c2572eM1082f = c0318w0.m1082f(C0318w0.p.m1142d());
        AbstractC0606k.m2144d(c2572eM1082f, "getInsets(...)");
        int i3 = c2287aM10903f.f10480H0 ? 0 : c2572eM1082f.f11900b;
        int i4 = c0318w0.m1082f(C0318w0.p.m1139a()).f11902d;
        if (i4 <= 0) {
            i4 = c2572eM1082f.f11902d;
        }
        if (c2287aM10903f.f10482I0) {
            i4 = 0;
        }
        if (c2190y0.f10271b) {
            view.setPadding(c2572eM1082f.f11899a, 0, c2572eM1082f.f11901c, 0);
            CoordinatorLayout coordinatorLayout = c2190y0.f10277h;
            View view2 = null;
            if (coordinatorLayout == null) {
                AbstractC0606k.m2154n("mainLayout");
                coordinatorLayout = null;
            }
            coordinatorLayout.setPadding(0, i3, 0, i4);
            View view3 = c2190y0.f10275f;
            if (view3 == null) {
                AbstractC0606k.m2154n("statusBarBackgroundView");
                view3 = null;
            }
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            layoutParams.height = c2572eM1082f.f11900b;
            View view4 = c2190y0.f10275f;
            if (view4 == null) {
                AbstractC0606k.m2154n("statusBarBackgroundView");
                view4 = null;
            }
            view4.setLayoutParams(layoutParams);
            View view5 = c2190y0.f10276g;
            if (view5 == null) {
                AbstractC0606k.m2154n("systemNavBarBackgroundView");
                view5 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
            layoutParams2.height = c2572eM1082f.f11902d;
            View view6 = c2190y0.f10276g;
            if (view6 == null) {
                AbstractC0606k.m2154n("systemNavBarBackgroundView");
            } else {
                view2 = view6;
            }
            view2.setLayoutParams(layoutParams2);
        } else {
            view.setPadding(c2572eM1082f.f11899a, i3, c2572eM1082f.f11901c, i4);
        }
        return C0318w0.f1386b;
    }

    /* JADX INFO: renamed from: b */
    public final void m10719b() {
        C0688K c0688k = null;
        int color = this.f10270a.getResources().getColor(R.color.statusBarBackground, null);
        String str = this.f10278i;
        AbstractC0606k.m2144d(str, "currentStatusBarStyle");
        this.f10273d = m10716c(str, color);
        int color2 = this.f10270a.getResources().getColor(R.color.systemNavBarBackground, null);
        String str2 = this.f10279j;
        AbstractC0606k.m2144d(str2, "currentSystemNavBarStyle");
        this.f10274e = m10716c(str2, color2);
        MainActivity mainActivity = this.f10270a;
        C0688K c0688k2 = this.f10273d;
        if (c0688k2 == null) {
            AbstractC0606k.m2154n("statusBarStyle");
            c0688k2 = null;
        }
        C0688K c0688k3 = this.f10274e;
        if (c0688k3 == null) {
            AbstractC0606k.m2154n("systemNavBarStyle");
        } else {
            c0688k = c0688k3;
        }
        AbstractC0718r.m2635a(mainActivity, c0688k2, c0688k);
    }

    /* JADX INFO: renamed from: d */
    public final void m10720d(boolean z2) {
        C0265U0 c0265u0 = null;
        if (z2) {
            C0265U0 c0265u02 = this.f10272c;
            if (c0265u02 == null) {
                AbstractC0606k.m2154n("insetsController");
            } else {
                c0265u0 = c0265u02;
            }
            c0265u0.m711a(C0318w0.p.m1142d());
            c0265u0.m714d(2);
            return;
        }
        C0265U0 c0265u03 = this.f10272c;
        if (c0265u03 == null) {
            AbstractC0606k.m2154n("insetsController");
        } else {
            c0265u0 = c0265u03;
        }
        c0265u0.m715e(C0318w0.p.m1142d());
        c0265u0.m714d(1);
    }

    /* JADX INFO: renamed from: f */
    public final void m10721f(String str) {
        AbstractC0606k.m2145e(str, "style");
        Resources.Theme theme = this.f10270a.getTheme();
        m10722g(this.f10270a.getResources().getColor(R.color.statusBarBackground, theme));
        m10723h(this.f10270a.getResources().getColor(R.color.systemNavBarBackground, theme));
        m10725k(str);
        m10726l(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m10722g(int i3) {
        C0688K c0688k = null;
        View view = null;
        if (this.f10271b) {
            View view2 = this.f10275f;
            if (view2 == null) {
                AbstractC0606k.m2154n("statusBarBackgroundView");
            } else {
                view = view2;
            }
            view.setBackgroundColor(i3);
            return;
        }
        String str = this.f10278i;
        AbstractC0606k.m2144d(str, "currentStatusBarStyle");
        C0688K c0688kM10716c = m10716c(str, i3);
        this.f10273d = c0688kM10716c;
        MainActivity mainActivity = this.f10270a;
        if (c0688kM10716c == null) {
            AbstractC0606k.m2154n("statusBarStyle");
            c0688kM10716c = null;
        }
        C0688K c0688k2 = this.f10274e;
        if (c0688k2 == null) {
            AbstractC0606k.m2154n("systemNavBarStyle");
        } else {
            c0688k = c0688k2;
        }
        AbstractC0718r.m2635a(mainActivity, c0688kM10716c, c0688k);
    }

    /* JADX INFO: renamed from: h */
    public final void m10723h(int i3) {
        C0688K c0688k = null;
        View view = null;
        if (this.f10271b) {
            View view2 = this.f10276g;
            if (view2 == null) {
                AbstractC0606k.m2154n("systemNavBarBackgroundView");
            } else {
                view = view2;
            }
            view.setBackgroundColor(i3);
            return;
        }
        String str = this.f10279j;
        AbstractC0606k.m2144d(str, "currentSystemNavBarStyle");
        this.f10274e = m10716c(str, i3);
        MainActivity mainActivity = this.f10270a;
        C0688K c0688k2 = this.f10273d;
        if (c0688k2 == null) {
            AbstractC0606k.m2154n("statusBarStyle");
            c0688k2 = null;
        }
        C0688K c0688k3 = this.f10274e;
        if (c0688k3 == null) {
            AbstractC0606k.m2154n("systemNavBarStyle");
        } else {
            c0688k = c0688k3;
        }
        AbstractC0718r.m2635a(mainActivity, c0688k2, c0688k);
    }

    /* JADX INFO: renamed from: i */
    public final void m10724i(ViewGroup viewGroup) {
        AbstractC0606k.m2145e(viewGroup, "view");
        View viewFindViewById = viewGroup.findViewById(R.id.main_layout);
        AbstractC0606k.m2144d(viewFindViewById, "findViewById(...)");
        this.f10277h = (CoordinatorLayout) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.status_bar_background);
        AbstractC0606k.m2144d(viewFindViewById2, "findViewById(...)");
        this.f10275f = viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.system_nav_bar_background);
        AbstractC0606k.m2144d(viewFindViewById3, "findViewById(...)");
        this.f10276g = viewFindViewById3;
        if (!this.f10271b) {
            View view = this.f10275f;
            View view2 = null;
            if (view == null) {
                AbstractC0606k.m2154n("statusBarBackgroundView");
                view = null;
            }
            view.setVisibility(8);
            View view3 = this.f10276g;
            if (view3 == null) {
                AbstractC0606k.m2154n("systemNavBarBackgroundView");
            } else {
                view2 = view3;
            }
            view2.setVisibility(8);
        }
        AbstractC0268W.m795s0(viewGroup, new InterfaceC0235F() { // from class: m0.X0
            @Override // p027J.InterfaceC0235F
            /* JADX INFO: renamed from: a */
            public final C0318w0 mo662a(View view4, C0318w0 c0318w0) {
                return C2190Y0.m10718j(this.f10267a, view4, c0318w0);
            }
        });
        C0265U0 c0265u0M978a = AbstractC0290i0.m978a(this.f10270a.getWindow(), this.f10270a.getWindow().getDecorView());
        AbstractC0606k.m2144d(c0265u0M978a, "getInsetsController(...)");
        this.f10272c = c0265u0M978a;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10270a.getWindow().setNavigationBarContrastEnforced(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10725k(String str) {
        if (str == null || AbstractC1868d.m9686s(str)) {
            return;
        }
        this.f10278i = str;
        C0265U0 c0265u0 = this.f10272c;
        if (c0265u0 == null) {
            AbstractC0606k.m2154n("insetsController");
            c0265u0 = null;
        }
        c0265u0.m713c(m10717e(str));
    }

    /* JADX INFO: renamed from: l */
    public final void m10726l(String str) {
        if (str == null || AbstractC1868d.m9686s(str)) {
            return;
        }
        this.f10279j = str;
        C0265U0 c0265u0 = this.f10272c;
        if (c0265u0 == null) {
            AbstractC0606k.m2154n("insetsController");
            c0265u0 = null;
        }
        c0265u0.m712b(m10717e(str));
    }
}
