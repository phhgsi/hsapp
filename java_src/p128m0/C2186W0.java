package p128m0;

import android.content.res.Configuration;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0745a;
import androidx.appcompat.app.AbstractC0746b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.AbstractC0966b;
import co.median.android.MainActivity;
import co.median.android.jrejze.R;
import co.median.android.widget.GoNativeDrawerLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.navigation.NavigationView;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import p035L1.C0388t;
import p071X1.AbstractC0606k;
import p098e2.AbstractC1868d;
import p132n0.C2279a;
import p135o0.C2287a;
import p135o0.C2290d;

/* JADX INFO: renamed from: m0.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2186W0 {

    /* JADX INFO: renamed from: a */
    private final MainActivity f10244a;

    /* JADX INFO: renamed from: b */
    private final GoNativeDrawerLayout f10245b;

    /* JADX INFO: renamed from: c */
    private AbstractC0746b f10246c;

    /* JADX INFO: renamed from: d */
    private final NavigationView f10247d;

    /* JADX INFO: renamed from: e */
    private final RelativeLayout f10248e;

    /* JADX INFO: renamed from: f */
    private final ExpandableListView f10249f;

    /* JADX INFO: renamed from: g */
    private final C2183V f10250g;

    /* JADX INFO: renamed from: h */
    private final Map f10251h;

    /* JADX INFO: renamed from: i */
    private boolean f10252i;

    /* JADX INFO: renamed from: j */
    private boolean f10253j;

    /* JADX INFO: renamed from: k */
    private String f10254k;

    /* JADX INFO: renamed from: m0.W0$a */
    public static final class a extends C2290d.a {
        a() {
        }
    }

    /* JADX INFO: renamed from: m0.W0$b */
    public static final class b extends AbstractC0746b {

        /* JADX INFO: renamed from: m */
        final /* synthetic */ C2287a f10257m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2287a c2287a, MainActivity mainActivity, GoNativeDrawerLayout goNativeDrawerLayout) {
            super(mainActivity, goNativeDrawerLayout, R.string.drawer_open, R.string.drawer_close);
            this.f10257m = c2287a;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0998d
        /* JADX INFO: renamed from: c */
        public void mo4484c(View view) {
            AbstractC0606k.m2145e(view, "drawerView");
            C2186W0.this.f10245b.setDisableTouch(false);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0998d
        /* JADX INFO: renamed from: d */
        public void mo4485d(View view) {
            AbstractC0606k.m2145e(view, "view");
            C2186W0.this.f10245b.setDisableTouch(this.f10257m.f10533f0 && C2186W0.this.m10702f().m6936m1());
        }
    }

    public C2186W0(MainActivity mainActivity) {
        AbstractC0606k.m2145e(mainActivity, "main");
        this.f10244a = mainActivity;
        View viewFindViewById = mainActivity.findViewById(R.id.drawer_layout);
        AbstractC0606k.m2144d(viewFindViewById, "findViewById(...)");
        this.f10245b = (GoNativeDrawerLayout) viewFindViewById;
        View viewFindViewById2 = mainActivity.findViewById(R.id.nav_menu);
        AbstractC0606k.m2144d(viewFindViewById2, "findViewById(...)");
        NavigationView navigationView = (NavigationView) viewFindViewById2;
        this.f10247d = navigationView;
        this.f10248e = (RelativeLayout) navigationView.findViewById(R.id.header_layout);
        ExpandableListView expandableListView = (ExpandableListView) navigationView.findViewById(R.id.drawer_list);
        this.f10249f = expandableListView;
        this.f10250g = new C2183V(mainActivity, expandableListView);
        this.f10251h = new LinkedHashMap();
        this.f10252i = true;
        this.f10253j = true;
        this.f10254k = "default";
        C2287a.m10903f(mainActivity).m10914a(new a());
    }

    /* JADX INFO: renamed from: g */
    private final boolean m10695g(MenuItem menuItem) {
        String str = (String) this.f10251h.get(menuItem);
        if (str == null) {
            return false;
        }
        this.f10244a.m6915W1().m6674d(str, true);
        return true;
    }

    /* JADX INFO: renamed from: k */
    private final void m10696k(boolean z2) {
        Toolbar toolbar;
        if (this.f10252i) {
            C2287a c2287aM10903f = C2287a.m10903f(this.f10244a);
            if (c2287aM10903f.f10509W) {
                this.f10245b.setDrawerLockMode(!z2 ? 1 : 0);
                if ((this.f10253j || c2287aM10903f.f10581x0) && z2 && (toolbar = (Toolbar) this.f10244a.findViewById(R.id.toolbar)) != null) {
                    toolbar.setVisibility(0);
                }
                AbstractC0745a abstractC0745aM2799k0 = this.f10244a.m2799k0();
                if (abstractC0745aM2799k0 != null) {
                    abstractC0745aM2799k0.mo2710t(z2);
                    String str = c2287aM10903f.f10496P0;
                    if (str == null || AbstractC1868d.m9686s(str)) {
                        return;
                    }
                    abstractC0745aM2799k0.mo2713w(new C2279a(this.f10244a, c2287aM10903f.f10496P0, this.f10244a.getResources().getDimensionPixelSize(R.dimen.action_menu_icon_size), AbstractC0966b.getColor(this.f10244a, R.color.titleTextColor)).m10885a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m10697l() {
        ImageView imageView;
        C2287a c2287aM10903f = C2287a.m10903f(this.f10244a);
        if (!c2287aM10903f.f10484J0 && !c2287aM10903f.f10486K0) {
            this.f10248e.setVisibility(8);
        }
        if (!c2287aM10903f.f10484J0 && (imageView = (ImageView) this.f10248e.findViewById(R.id.app_logo)) != null) {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) this.f10248e.findViewById(R.id.app_name);
        if (textView != null) {
            if (c2287aM10903f.f10486K0) {
                textView.setText(c2287aM10903f.f10529e);
            } else {
                textView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final boolean m10698n(C2186W0 c2186w0, MenuItem menuItem) {
        AbstractC0606k.m2145e(menuItem, "item");
        c2186w0.m10701e();
        return c2186w0.m10695g(menuItem);
    }

    /* JADX INFO: renamed from: c */
    public final void m10699c(String str) {
        AbstractC0606k.m2145e(str, ImagesContract.URL);
        this.f10250g.m10690a(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m10700d(String str) {
        AbstractC0606k.m2145e(str, ImagesContract.URL);
        C2287a c2287aM10903f = C2287a.m10903f(this.f10244a);
        m10696k(c2287aM10903f.m10921u(str));
        if (this.f10245b.m4470s(8388611) != 1) {
            this.f10245b.setDisableTouch(c2287aM10903f.f10533f0 && this.f10244a.m6936m1());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10701e() {
        this.f10245b.m4462j();
    }

    /* JADX INFO: renamed from: f */
    public final MainActivity m10702f() {
        return this.f10244a;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10703h() {
        return this.f10245b.m4440F(this.f10247d);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10704i(MenuItem menuItem) {
        AbstractC0606k.m2145e(menuItem, "menuItem");
        AbstractC0746b abstractC0746b = this.f10246c;
        return abstractC0746b != null && abstractC0746b.m2775h(menuItem);
    }

    /* JADX INFO: renamed from: j */
    public final void m10705j() {
        this.f10247d.setBackgroundColor(this.f10244a.getResources().getColor(R.color.sidebarBackground, this.f10244a.getTheme()));
        this.f10250g.m10691m();
    }

    /* JADX INFO: renamed from: m */
    public final void m10706m(boolean z2) {
        this.f10252i = z2;
        C2287a c2287aM10903f = C2287a.m10903f(this.f10244a);
        if (z2) {
            b bVar = new b(c2287aM10903f, this.f10244a, this.f10245b);
            bVar.m2777j(true);
            bVar.m2772e().m9760c(AbstractC0966b.getColor(this.f10244a, R.color.titleTextColor));
            this.f10246c = bVar;
        }
        this.f10247d.setNavigationItemSelectedListener(new NavigationView.InterfaceC1563d() { // from class: m0.V0
            @Override // com.google.android.material.navigation.NavigationView.InterfaceC1563d
            /* JADX INFO: renamed from: a */
            public final boolean mo8550a(MenuItem menuItem) {
                return C2186W0.m10698n(this.f10242a, menuItem);
            }
        });
        m10697l();
        m10710r(this.f10254k);
    }

    /* JADX INFO: renamed from: o */
    public final void m10707o(boolean z2) {
        if (z2) {
            GoNativeDrawerLayout goNativeDrawerLayout = this.f10245b;
            goNativeDrawerLayout.setDrawerLockMode(0);
            AbstractC0746b abstractC0746b = this.f10246c;
            if (abstractC0746b != null) {
                goNativeDrawerLayout.m4455c(abstractC0746b);
                return;
            }
            return;
        }
        GoNativeDrawerLayout goNativeDrawerLayout2 = this.f10245b;
        goNativeDrawerLayout2.setDrawerLockMode(1);
        AbstractC0746b abstractC0746b2 = this.f10246c;
        if (abstractC0746b2 != null) {
            goNativeDrawerLayout2.m4449Q(abstractC0746b2);
        }
    }

    /* JADX INFO: renamed from: p */
    public final C0388t m10708p(Configuration configuration) {
        AbstractC0606k.m2145e(configuration, "newConfig");
        AbstractC0746b abstractC0746b = this.f10246c;
        if (abstractC0746b == null) {
            return null;
        }
        abstractC0746b.m2774g(configuration);
        return C0388t.f1507a;
    }

    /* JADX INFO: renamed from: q */
    public final C0388t m10709q() {
        AbstractC0746b abstractC0746b = this.f10246c;
        if (abstractC0746b == null) {
            return null;
        }
        abstractC0746b.m2778l();
        return C0388t.f1507a;
    }

    /* JADX INFO: renamed from: r */
    public final void m10710r(String str) {
        AbstractC0606k.m2145e(str, "status");
        this.f10254k = str;
        this.f10250g.m10692n((JSONArray) C2287a.m10903f(this.f10244a).f10511X.get(str));
    }
}
