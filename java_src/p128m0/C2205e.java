package p128m0;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.app.AbstractC0745a;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.AbstractC0966b;
import co.median.android.MainActivity;
import co.median.android.jrejze.R;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p071X1.C0613r;
import p095e.AbstractC1832a;
import p098e2.AbstractC1868d;
import p132n0.C2279a;
import p135o0.C2287a;
import p167z.AbstractC2568a;
import p167z.EnumC2569b;

/* JADX INFO: renamed from: m0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2205e {

    /* JADX INFO: renamed from: o */
    public static final a f10295o = new a(null);

    /* JADX INFO: renamed from: a */
    private final MainActivity f10296a;

    /* JADX INFO: renamed from: b */
    private boolean f10297b;

    /* JADX INFO: renamed from: c */
    private AbstractC0745a f10298c;

    /* JADX INFO: renamed from: d */
    private final MaterialToolbar f10299d;

    /* JADX INFO: renamed from: e */
    private final ImageView f10300e;

    /* JADX INFO: renamed from: f */
    private final HashMap f10301f;

    /* JADX INFO: renamed from: g */
    private final int f10302g;

    /* JADX INFO: renamed from: h */
    private final int f10303h;

    /* JADX INFO: renamed from: i */
    private int f10304i;

    /* JADX INFO: renamed from: j */
    private Menu f10305j;

    /* JADX INFO: renamed from: k */
    private SearchView f10306k;

    /* JADX INFO: renamed from: l */
    private String f10307l;

    /* JADX INFO: renamed from: m */
    private boolean f10308m;

    /* JADX INFO: renamed from: n */
    private PopupWindow f10309n;

    /* JADX INFO: renamed from: m0.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: m0.e$b */
    public static final class b implements SearchView.InterfaceC0856m {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f10311b;

        b(String str) {
            this.f10311b = str;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0856m
        /* JADX INFO: renamed from: a */
        public boolean mo3589a(String str) {
            AbstractC0606k.m2145e(str, "newText");
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0856m
        /* JADX INFO: renamed from: b */
        public boolean mo3590b(String str) {
            AbstractC0606k.m2145e(str, SearchIntents.EXTRA_QUERY);
            try {
                String strEncode = URLEncoder.encode(str, "UTF-8");
                C2205e.this.f10296a.m6900N2(this.f10311b + strEncode);
            } catch (UnsupportedEncodingException unused) {
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: m0.e$c */
    public static final class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MenuItem f10313b;

        c(MenuItem menuItem) {
            this.f10313b = menuItem;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            AbstractC0606k.m2145e(menuItem, "item");
            C2205e.this.m10745n();
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            AbstractC0606k.m2145e(menuItem, "item");
            C2205e.this.m10757v(false, this.f10313b);
            return true;
        }
    }

    public C2205e(MainActivity mainActivity) {
        AbstractC0606k.m2145e(mainActivity, "main");
        this.f10296a = mainActivity;
        this.f10297b = true;
        View viewFindViewById = mainActivity.findViewById(R.id.toolbar);
        AbstractC0606k.m2144d(viewFindViewById, "findViewById(...)");
        MaterialToolbar materialToolbar = (MaterialToolbar) viewFindViewById;
        this.f10299d = materialToolbar;
        this.f10300e = (ImageView) mainActivity.findViewById(R.id.title_image);
        this.f10301f = new HashMap();
        this.f10302g = mainActivity.getResources().getDimensionPixelSize(R.dimen.action_menu_icon_size);
        this.f10303h = mainActivity.getResources().getDimensionPixelSize(R.dimen.action_custom_overflow_menu_width);
        this.f10304i = AbstractC0966b.getColor(mainActivity, R.color.titleTextColor);
        mainActivity.m2808t0(materialToolbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final boolean m10730A(C2205e c2205e, MenuItem menuItem) {
        AbstractC0606k.m2142b(menuItem);
        return c2205e.m10749r(menuItem);
    }

    /* JADX INFO: renamed from: B */
    private final void m10731B(Menu menu, final List list) {
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        if (list.isEmpty()) {
            return;
        }
        Drawable overflowIcon = this.f10299d.getOverflowIcon();
        Drawable drawableMutate = (overflowIcon == null || (constantState = overflowIcon.getConstantState()) == null || (drawableNewDrawable = constantState.newDrawable()) == null) ? null : drawableNewDrawable.mutate();
        if (drawableMutate != null) {
            drawableMutate.setColorFilter(AbstractC2568a.m12254a(this.f10304i, EnumC2569b.SRC_ATOP));
        }
        boolean z2 = false;
        MenuItem showAsActionFlags = menu.add(0, 99, 0, "Overflow").setIcon(drawableMutate).setShowAsActionFlags(2);
        AbstractC0606k.m2144d(showAsActionFlags, "setShowAsActionFlags(...)");
        this.f10301f.put(showAsActionFlags, "overflow");
        View viewInflate = LayoutInflater.from(this.f10296a).inflate(R.layout.overflow_menu_list_view, (ViewGroup) null);
        ListView listView = (ListView) viewInflate.findViewById(R.id.menuListView);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String strOptString = ((JSONObject) it.next()).optString("icon");
            if (strOptString != null && !AbstractC1868d.m9686s(strOptString)) {
                z2 = true;
                break;
            }
        }
        listView.setAdapter((ListAdapter) new C2176R0(this.f10296a, list, z2));
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
        popupWindow.setWidth(this.f10303h);
        popupWindow.setElevation(10.0f);
        this.f10309n = popupWindow;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: m0.b
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
                C2205e.m10732C(list, this, adapterView, view, i3, j3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[PHI: r3
  0x0039: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v6 java.lang.String) binds: [B:19:0x0041, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10732C(java.util.List r0, p128m0.C2205e r1, android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
        /*
            java.lang.Object r0 = r0.get(r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r2 = "system"
            java.lang.String r2 = r0.optString(r2)
            java.lang.String r3 = "url"
            java.lang.String r0 = r0.optString(r3)
            if (r2 == 0) goto L1a
            boolean r3 = p098e2.AbstractC1868d.m9686s(r2)
            if (r3 == 0) goto L56
        L1a:
            if (r2 == 0) goto L56
            int r3 = r2.hashCode()
            r4 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            if (r3 == r4) goto L44
            r4 = 109400031(0x6854fdf, float:5.01464E-35)
            if (r3 == r4) goto L3b
            r4 = 1085444827(0x40b292db, float:5.5804267)
            if (r3 == r4) goto L30
            goto L56
        L30:
            java.lang.String r3 = "refresh"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L39
            goto L56
        L39:
            r0 = r3
            goto L56
        L3b:
            java.lang.String r3 = "share"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L39
            goto L56
        L44:
            java.lang.String r3 = "search"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
            goto L56
        L4d:
            java.lang.String r0 = "ActionManager"
            java.lang.String r2 = "setupOverflowMenu: The \"search\" system menu is not supported on the custom overflow menu yet."
            android.util.Log.e(r0, r2)
            java.lang.String r0 = ""
        L56:
            p071X1.AbstractC0606k.m2142b(r0)
            boolean r2 = p098e2.AbstractC1868d.m9686s(r0)
            if (r2 != 0) goto L62
            r1.m10748q(r0)
        L62:
            android.widget.PopupWindow r0 = r1.f10309n
            if (r0 == 0) goto L69
            r0.dismiss()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p128m0.C2205e.m10732C(java.util.List, m0.e, android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* JADX INFO: renamed from: D */
    private final void m10733D(boolean z2, String str) {
        if (z2) {
            this.f10300e.setVisibility(0);
            this.f10299d.setTitle("");
        } else {
            this.f10300e.setVisibility(8);
            this.f10299d.setTitle(str);
        }
    }

    /* JADX INFO: renamed from: E */
    private final void m10734E() {
        PopupWindow popupWindow = this.f10309n;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(this.f10299d, (this.f10299d.getWidth() - this.f10303h) - 15, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    private final boolean m10741h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        if (!this.f10297b) {
            return true;
        }
        final C0613r c0613r = new C0613r();
        c0613r.f2012d = jSONObject.optString(ImagesContract.URL);
        String strOptString = jSONObject.optString("icon");
        String strOptString2 = jSONObject.optString("system");
        if (strOptString2 != null && !AbstractC1868d.m9686s(strOptString2) && strOptString2 != null) {
            int iHashCode = strOptString2.hashCode();
            if (iHashCode != -906336856) {
                if (iHashCode != 109400031) {
                    if (iHashCode == 1085444827 && strOptString2.equals("refresh")) {
                        c0613r.f2012d = "refresh";
                        if (strOptString != null && !AbstractC1868d.m9686s(strOptString)) {
                            strOptString = "fa-rotate-right";
                        }
                    }
                } else if (strOptString2.equals("share")) {
                    c0613r.f2012d = "share";
                    if (strOptString != null && !AbstractC1868d.m9686s(strOptString)) {
                        strOptString = "fa fa-search";
                    }
                }
            } else if (strOptString2.equals("search")) {
                Log.e("ActionManager", "addAsLeftActionMenu: The \"search\" system menu is not supported as a left-menu yet.");
                return false;
            }
        }
        this.f10299d.setNavigationIcon(new C2279a(this.f10296a, strOptString, this.f10302g, this.f10304i).m10885a());
        this.f10299d.setNavigationIconTint(this.f10304i);
        this.f10299d.setNavigationOnClickListener(new View.OnClickListener() { // from class: m0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2205e.m10742i(c0613r, this, view);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m10742i(C0613r c0613r, C2205e c2205e, View view) {
        String str = (String) c0613r.f2012d;
        if (AbstractC0606k.m2141a(str, "share")) {
            c2205e.f10296a.m6946s3(null, null);
        } else if (AbstractC0606k.m2141a(str, "refresh")) {
            c2205e.f10296a.mo6935m();
        } else {
            c2205e.f10296a.m6915W1().m6674d((String) c0613r.f2012d, true);
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m10743j(Menu menu, int i3, JSONObject jSONObject) {
        if (jSONObject == null || m10744k(menu, jSONObject, i3)) {
            return;
        }
        String strOptString = jSONObject.optString("label");
        String strOptString2 = jSONObject.optString("icon");
        String strOptString3 = jSONObject.optString(ImagesContract.URL);
        MenuItem showAsActionFlags = menu.add(0, i3, 0, strOptString).setIcon(new C2279a(this.f10296a, strOptString2, this.f10302g, this.f10304i).m10885a()).setShowAsActionFlags(2);
        AbstractC0606k.m2144d(showAsActionFlags, "setShowAsActionFlags(...)");
        this.f10301f.put(showAsActionFlags, strOptString3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m10744k(android.view.Menu r10, org.json.JSONObject r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "system"
            java.lang.String r0 = r11.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            java.lang.String r1 = "label"
            java.lang.String r1 = r11.optString(r1)
            java.lang.String r3 = "icon"
            java.lang.String r3 = r11.optString(r3)
            java.lang.String r4 = "url"
            java.lang.String r11 = r11.optString(r4)
            if (r0 == 0) goto Lc3
            int r4 = r0.hashCode()
            r5 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            java.lang.String r6 = "search"
            if (r4 == r5) goto L60
            r5 = 109400031(0x6854fdf, float:5.01464E-35)
            if (r4 == r5) goto L4d
            r5 = 1085444827(0x40b292db, float:5.5804267)
            if (r4 == r5) goto L39
            goto Lc3
        L39:
            java.lang.String r4 = "refresh"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L43
            goto Lc3
        L43:
            L1.p r0 = new L1.p
            java.lang.String r5 = "fa-rotate-right"
            java.lang.String r7 = "Refresh"
            r0.<init>(r4, r5, r7)
            goto L70
        L4d:
            java.lang.String r4 = "share"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L56
            goto Lc3
        L56:
            L1.p r0 = new L1.p
            java.lang.String r5 = "fa-share"
            java.lang.String r7 = "Share"
            r0.<init>(r4, r5, r7)
            goto L70
        L60:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L67
            goto Lc3
        L67:
            L1.p r0 = new L1.p
            java.lang.String r4 = "fa fa-search"
            java.lang.String r5 = "Search"
            r0.<init>(r6, r4, r5)
        L70:
            java.lang.Object r4 = r0.m1375a()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.m1376b()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.m1377c()
            java.lang.String r0 = (java.lang.String) r0
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L89
            r1 = r0
        L89:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L90
            r3 = r5
        L90:
            n0.a r0 = new n0.a
            co.median.android.MainActivity r5 = r9.f10296a
            int r7 = r9.f10302g
            int r8 = r9.f10304i
            r0.<init>(r5, r3, r7, r8)
            android.graphics.drawable.Drawable r0 = r0.m10885a()
            android.view.MenuItem r10 = r10.add(r2, r12, r2, r1)
            android.view.MenuItem r10 = r10.setIcon(r0)
            r12 = 1
            android.view.MenuItem r10 = r10.setShowAsActionFlags(r12)
            java.lang.String r1 = "setShowAsActionFlags(...)"
            p071X1.AbstractC0606k.m2144d(r10, r1)
            boolean r1 = p071X1.AbstractC0606k.m2141a(r4, r6)
            if (r1 == 0) goto Lbd
            p071X1.AbstractC0606k.m2142b(r11)
            r9.m10746o(r10, r11, r0)
        Lbd:
            java.util.HashMap r11 = r9.f10301f
            r11.put(r10, r4)
            return r12
        Lc3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p128m0.C2205e.m10744k(android.view.Menu, org.json.JSONObject, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m10745n() {
        SearchView searchView = this.f10306k;
        if (searchView != null) {
            searchView.setIconified(true);
        }
        this.f10296a.invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: o */
    private final void m10746o(MenuItem menuItem, String str, Drawable drawable) {
        final SearchView searchView = new SearchView(this.f10296a);
        searchView.setLayoutParams(new Toolbar.C0870g(-1, -2));
        searchView.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        searchView.setOnQueryTextListener(new b(str));
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: m0.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                C2205e.m10747p(searchView, this, view, z2);
            }
        });
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) searchView.findViewById(R.id.search_src_text);
        if (searchAutoComplete != null) {
            searchAutoComplete.setTextColor(this.f10304i);
            int i3 = this.f10304i;
            searchAutoComplete.setHintTextColor(Color.argb(192, Color.red(i3), Color.green(i3), Color.blue(i3)));
        }
        ImageView imageView = (ImageView) searchView.findViewById(R.id.search_close_btn);
        if (imageView != null) {
            imageView.setColorFilter(this.f10304i);
        }
        this.f10306k = searchView;
        menuItem.setActionView(searchView);
        menuItem.setShowAsActionFlags(9);
        menuItem.setOnActionExpandListener(new c(menuItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m10747p(SearchView searchView, C2205e c2205e, View view, boolean z2) {
        if (z2 || searchView.m3567L()) {
            return;
        }
        c2205e.m10745n();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m10748q(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L48
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -906336856: goto L36;
                case 109400031: goto L27;
                case 529642498: goto L1a;
                case 1085444827: goto Lb;
                default: goto La;
            }
        La:
            goto L3e
        Lb:
            java.lang.String r0 = "refresh"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L14
            goto L3e
        L14:
            co.median.android.MainActivity r3 = r2.f10296a
            r3.mo6935m()
            goto L47
        L1a:
            java.lang.String r0 = "overflow"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L23
            goto L3e
        L23:
            r2.m10734E()
            goto L47
        L27:
            java.lang.String r0 = "share"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3e
            co.median.android.MainActivity r3 = r2.f10296a
            r0 = 0
            r3.m6946s3(r0, r0)
            goto L47
        L36:
            java.lang.String r0 = "search"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L47
        L3e:
            co.median.android.MainActivity r0 = r2.f10296a
            co.median.android.A r0 = r0.m6915W1()
            r0.m6674d(r3, r1)
        L47:
            return r1
        L48:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p128m0.C2205e.m10748q(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: r */
    private final boolean m10749r(MenuItem menuItem) {
        return m10748q((String) this.f10301f.get(menuItem));
    }

    /* JADX INFO: renamed from: t */
    private final void m10750t() {
        MaterialToolbar materialToolbar = this.f10299d;
        materialToolbar.setNavigationIcon((Drawable) null);
        materialToolbar.setNavigationOnClickListener(null);
        this.f10308m = false;
    }

    /* JADX INFO: renamed from: u */
    private final void m10751u(String str) {
        String str2 = this.f10307l;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (AbstractC0606k.m2141a(str2, str)) {
            return;
        }
        this.f10307l = str;
        this.f10296a.invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m10752y(C2205e c2205e, String str, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        c2205e.m10759x(str, z2);
    }

    /* JADX INFO: renamed from: g */
    public final void m10753g(Menu menu) {
        String str;
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        AbstractC0606k.m2145e(menu, "menu");
        this.f10305j = menu;
        this.f10301f.clear();
        if (this.f10308m) {
            m10750t();
        }
        C2287a c2287aM10903f = C2287a.m10903f(this.f10296a);
        Map map = c2287aM10903f.f10579w0;
        if (map == null || (str = this.f10307l) == null || (jSONObject = (JSONObject) map.get(str)) == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("items")) == null || jSONArrayOptJSONArray.length() == 0) {
            return;
        }
        boolean zOptBoolean = jSONObject.optBoolean("allowLeftMenu");
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        boolean z2 = false;
        for (int i3 = 0; i3 < length; i3++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
            int length2 = jSONArrayOptJSONArray.length() - i3;
            if (!z2 && menu.size() == 1 && length2 > 1) {
                z2 = true;
            }
            if (z2) {
                AbstractC0606k.m2142b(jSONObject2);
                arrayList.add(jSONObject2);
            } else if (i3 == 0 && zOptBoolean && !this.f10308m && !c2287aM10903f.f10509W && m10741h(jSONObject2)) {
                this.f10308m = true;
            } else {
                m10743j(menu, i3, jSONObject2);
            }
        }
        m10731B(menu, arrayList);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m10754l() {
        SearchView searchView = this.f10306k;
        if (searchView == null || !searchView.hasFocus()) {
            return false;
        }
        m10745n();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m10755m(String str) {
        if (str == null || AbstractC1868d.m9686s(str)) {
            return;
        }
        m10752y(this, str, false, 2, null);
        C2287a c2287aM10903f = C2287a.m10903f(this.f10296a);
        ArrayList arrayList = c2287aM10903f.f10575u0;
        ArrayList arrayList2 = c2287aM10903f.f10577v0;
        if (arrayList == null || arrayList2 == null) {
            m10751u(null);
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((Pattern) arrayList.get(i3)).matcher(str).matches()) {
                m10751u((String) arrayList2.get(i3));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m10756s() {
        Resources.Theme theme = this.f10296a.getTheme();
        this.f10304i = AbstractC0966b.getColor(this.f10296a, R.color.titleTextColor);
        MaterialToolbar materialToolbar = this.f10299d;
        materialToolbar.setBackgroundColor(this.f10296a.getResources().getColor(R.color.colorPrimary, theme));
        Drawable navigationIcon = materialToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setColorFilter(AbstractC2568a.m12254a(this.f10304i, EnumC2569b.SRC_ATOP));
        }
        this.f10300e.setImageDrawable(AbstractC1832a.m9609b(this.f10296a, 2131230879));
        this.f10296a.invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: v */
    public final void m10757v(boolean z2, MenuItem menuItem) {
        AbstractC0606k.m2145e(menuItem, "exception");
        Menu menu = this.f10305j;
        if (menu == null || menu == null) {
            return;
        }
        int size = menu.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = menu.getItem(i3);
            AbstractC0606k.m2144d(item, "getItem(...)");
            if (item != menuItem) {
                item.setVisible(z2);
                item.setEnabled(z2);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10758w(CharSequence charSequence) {
        AbstractC0606k.m2145e(charSequence, "title");
        if (AbstractC1868d.m9686s(charSequence)) {
            return;
        }
        this.f10300e.setVisibility(8);
        this.f10299d.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: x */
    public final void m10759x(String str, boolean z2) {
        String string;
        String str2;
        if (this.f10298c == null || str == null || AbstractC1868d.m9686s(str)) {
            return;
        }
        C2287a c2287aM10903f = C2287a.m10903f(this.f10296a);
        HashMap mapM10917g = c2287aM10903f.m10917g(str);
        boolean z3 = true;
        boolean z4 = mapM10917g != null;
        ArrayList arrayList = c2287aM10903f.f10575u0;
        ArrayList arrayList2 = c2287aM10903f.f10577v0;
        if (arrayList == null || arrayList2 == null) {
            z3 = false;
        } else {
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                AbstractC0606k.m2144d(obj, "get(...)");
                if (((Pattern) obj).matcher(str).matches()) {
                    JSONObject jSONObject = (JSONObject) c2287aM10903f.f10579w0.get(arrayList2.get(i3));
                    JSONArray jSONArrayOptJSONArray = jSONObject != null ? jSONObject.optJSONArray("items") : null;
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        break;
                    }
                } else {
                    i3++;
                }
            }
            z3 = false;
        }
        if (!c2287aM10903f.f10581x0 && !c2287aM10903f.f10509W && !z4 && !z3) {
            AbstractC0745a abstractC0745a = this.f10298c;
            if (abstractC0745a != null) {
                abstractC0745a.mo2702l();
                return;
            }
            return;
        }
        if (this.f10296a.m6916X1().getTitle() != null) {
            string = this.f10296a.m6916X1().getTitle();
            str2 = "getTitle(...)";
        } else {
            string = this.f10296a.getString(R.string.app_name);
            str2 = "getString(...)";
        }
        AbstractC0606k.m2144d(string, str2);
        if (z4) {
            Object obj2 = mapM10917g != null ? mapM10917g.get("title") : null;
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() == 0 && !z2) {
                return;
            }
            if (str3.length() != 0) {
                string = str3;
            }
            this.f10296a.setTitle(string);
            Object obj3 = mapM10917g != null ? mapM10917g.get("showImage") : null;
            Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            m10733D(bool != null ? bool.booleanValue() : false, string);
        } else {
            m10733D(c2287aM10903f.m10920t(str), string);
        }
        AbstractC0745a abstractC0745a2 = this.f10298c;
        if (abstractC0745a2 != null) {
            abstractC0745a2.mo2716z();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m10760z(boolean z2) {
        this.f10297b = z2;
        AbstractC0745a abstractC0745aM2799k0 = this.f10296a.m2799k0();
        if (abstractC0745aM2799k0 == null) {
            return;
        }
        this.f10298c = abstractC0745aM2799k0;
        C2287a c2287aM10903f = C2287a.m10903f(this.f10296a);
        AbstractC0745a abstractC0745a = this.f10298c;
        if (abstractC0745a != null) {
            if (!z2) {
                abstractC0745a.mo2710t(true);
                abstractC0745a.mo2711u(true);
            } else if (!c2287aM10903f.f10509W) {
                abstractC0745a.mo2710t(false);
            }
        }
        MaterialToolbar materialToolbar = this.f10299d;
        materialToolbar.setOnMenuItemClickListener(new Toolbar.InterfaceC0871h() { // from class: m0.c
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0871h
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return C2205e.m10730A(this.f10291a, menuItem);
            }
        });
        Drawable navigationIcon = materialToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setColorFilter(AbstractC2568a.m12254a(this.f10304i, EnumC2569b.SRC_ATOP));
        }
    }
}
