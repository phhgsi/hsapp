package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.app.AbstractC0740E;
import androidx.recyclerview.widget.C1231j;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0145f;
import p016F0.AbstractC0146g;
import p016F0.AbstractC0148i;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p030K.C0356y;

/* JADX INFO: renamed from: com.google.android.material.datepicker.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1499f<S> extends AbstractC1506m {

    /* JADX INFO: renamed from: o */
    static final Object f7500o = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: p */
    static final Object f7501p = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: q */
    static final Object f7502q = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: r */
    static final Object f7503r = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: b */
    private int f7504b;

    /* JADX INFO: renamed from: c */
    private CalendarConstraints f7505c;

    /* JADX INFO: renamed from: d */
    private Month f7506d;

    /* JADX INFO: renamed from: e */
    private l f7507e;

    /* JADX INFO: renamed from: f */
    private C1495b f7508f;

    /* JADX INFO: renamed from: g */
    private RecyclerView f7509g;

    /* JADX INFO: renamed from: h */
    private RecyclerView f7510h;

    /* JADX INFO: renamed from: i */
    private View f7511i;

    /* JADX INFO: renamed from: j */
    private View f7512j;

    /* JADX INFO: renamed from: k */
    private View f7513k;

    /* JADX INFO: renamed from: l */
    private View f7514l;

    /* JADX INFO: renamed from: m */
    private MaterialButton f7515m;

    /* JADX INFO: renamed from: n */
    private AccessibilityManager f7516n;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$a */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1504k f7517a;

        a(C1504k c1504k) {
            this.f7517a = c1504k;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1499f.this.m8166C(this.f7517a.m8216y(C1499f.this.m8174z().m5480e2() - 1));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f7519d;

        b(int i3) {
            this.f7519d = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1499f.this.f7510h.m5619p1(this.f7519d);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$c */
    class c extends C0273a {
        c() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            c0356y.m1290u0(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$d */
    class d extends AbstractC1507n {

        /* JADX INFO: renamed from: I */
        final /* synthetic */ int f7522I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i3, boolean z2, int i4) {
            super(context, i3, z2);
            this.f7522I = i4;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: Q1 */
        protected void mo5471Q1(RecyclerView.C1215z c1215z, int[] iArr) {
            if (this.f7522I == 0) {
                iArr[0] = C1499f.this.f7510h.getWidth();
                iArr[1] = C1499f.this.f7510h.getWidth();
            } else {
                iArr[0] = C1499f.this.f7510h.getHeight();
                iArr[1] = C1499f.this.f7510h.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$e */
    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.C1499f.m
        /* JADX INFO: renamed from: a */
        public void mo8175a(long j3) {
            if (C1499f.this.f7505c.m8105h().mo8112b(j3)) {
                C1499f.m8157m(C1499f.this);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$f */
    class f extends C0273a {
        f() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            c0356y.m1237L0(false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$g */
    class g extends RecyclerView.AbstractC1204o {

        /* JADX INFO: renamed from: a */
        private final Calendar f7526a = AbstractC1514u.m8237k();

        /* JADX INFO: renamed from: b */
        private final Calendar f7527b = AbstractC1514u.m8237k();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1204o
        /* JADX INFO: renamed from: g */
        public void mo5770g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1215z c1215z) {
            if ((recyclerView.getAdapter() instanceof C1515v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C1499f.m8157m(C1499f.this);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$h */
    class h extends C0273a {
        h() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            c0356y.m1263b(new C0356y.a(16, C1499f.this.f7514l.getVisibility() == 0 ? C1499f.this.getString(AbstractC0148i.f566z) : C1499f.this.getString(AbstractC0148i.f564x)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$i */
    class i extends RecyclerView.AbstractC1209t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1504k f7530a;

        i(C1504k c1504k) {
            this.f7530a = c1504k;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1209t
        /* JADX INFO: renamed from: b */
        public void mo5890b(RecyclerView recyclerView, int i3, int i4) {
            int iM5478c2 = i3 < 0 ? C1499f.this.m8174z().m5478c2() : C1499f.this.m8174z().m5480e2();
            Month monthM8216y = this.f7530a.m8216y(iM5478c2);
            C1499f.this.f7506d = monthM8216y;
            C1499f.this.f7515m.setText(this.f7530a.m8217z(iM5478c2));
            C1499f.this.m8154G(this.f7530a.m8213A(monthM8216y));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$j */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1499f.this.m8168F();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$k */
    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1504k f7533a;

        k(C1504k c1504k) {
            this.f7533a = c1504k;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1499f.this.m8166C(this.f7533a.m8216y(C1499f.this.m8174z().m5478c2() + 1));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$l */
    enum l {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.f$m */
    interface m {
        /* JADX INFO: renamed from: a */
        void mo8175a(long j3);
    }

    /* JADX INFO: renamed from: A */
    public static C1499f m8151A(DateSelector dateSelector, int i3, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        C1499f c1499f = new C1499f();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m8109l());
        c1499f.setArguments(bundle);
        return c1499f;
    }

    /* JADX INFO: renamed from: B */
    private void m8152B(int i3) {
        this.f7510h.post(new b(i3));
    }

    /* JADX INFO: renamed from: E */
    private void m8153E() {
        AbstractC0268W.m775i0(this.f7510h, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m8154G(int i3) {
        this.f7512j.setEnabled(i3 + 1 < this.f7510h.getAdapter().mo5715d());
        this.f7511i.setEnabled(i3 - 1 >= 0);
    }

    /* JADX INFO: renamed from: m */
    static /* synthetic */ DateSelector m8157m(C1499f c1499f) {
        c1499f.getClass();
        return null;
    }

    /* JADX INFO: renamed from: r */
    private void m8162r(View view, C1504k c1504k) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(AbstractC0144e.f498r);
        this.f7515m = materialButton;
        materialButton.setTag(f7503r);
        AbstractC0268W.m775i0(this.f7515m, new h());
        View viewFindViewById = view.findViewById(AbstractC0144e.f500t);
        this.f7511i = viewFindViewById;
        viewFindViewById.setTag(f7501p);
        View viewFindViewById2 = view.findViewById(AbstractC0144e.f499s);
        this.f7512j = viewFindViewById2;
        viewFindViewById2.setTag(f7502q);
        this.f7513k = view.findViewById(AbstractC0144e.f456A);
        this.f7514l = view.findViewById(AbstractC0144e.f502v);
        m8167D(l.DAY);
        this.f7515m.setText(this.f7506d.m8130j());
        this.f7510h.m5607k(new i(c1504k));
        this.f7515m.setOnClickListener(new j());
        this.f7512j.setOnClickListener(new k(c1504k));
        this.f7511i.setOnClickListener(new a(c1504k));
        m8154G(c1504k.m8213A(this.f7506d));
    }

    /* JADX INFO: renamed from: s */
    private RecyclerView.AbstractC1204o m8163s() {
        return new g();
    }

    /* JADX INFO: renamed from: x */
    static int m8164x(Context context) {
        return context.getResources().getDimensionPixelSize(AbstractC0142c.f404f0);
    }

    /* JADX INFO: renamed from: y */
    private static int m8165y(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC0142c.f418m0) + resources.getDimensionPixelOffset(AbstractC0142c.f420n0) + resources.getDimensionPixelOffset(AbstractC0142c.f416l0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC0142c.f408h0);
        int i3 = C1503j.f7580e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(AbstractC0142c.f404f0) * i3) + ((i3 - 1) * resources.getDimensionPixelOffset(AbstractC0142c.f414k0)) + resources.getDimensionPixelOffset(AbstractC0142c.f400d0);
    }

    /* JADX INFO: renamed from: C */
    void m8166C(Month month) {
        C1504k c1504k = (C1504k) this.f7510h.getAdapter();
        int iM8213A = c1504k.m8213A(month);
        AccessibilityManager accessibilityManager = this.f7516n;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iM8213A2 = iM8213A - c1504k.m8213A(this.f7506d);
            boolean z2 = Math.abs(iM8213A2) > 3;
            boolean z3 = iM8213A2 > 0;
            this.f7506d = month;
            if (z2 && z3) {
                this.f7510h.m5602h1(iM8213A - 3);
                m8152B(iM8213A);
            } else if (z2) {
                this.f7510h.m5602h1(iM8213A + 3);
                m8152B(iM8213A);
            } else {
                m8152B(iM8213A);
            }
        } else {
            this.f7506d = month;
            this.f7510h.m5602h1(iM8213A);
        }
        m8154G(iM8213A);
    }

    /* JADX INFO: renamed from: D */
    void m8167D(l lVar) {
        this.f7507e = lVar;
        if (lVar == l.YEAR) {
            this.f7509g.getLayoutManager().mo5462B1(((C1515v) this.f7509g.getAdapter()).m8242x(this.f7506d.f7477f));
            this.f7513k.setVisibility(0);
            this.f7514l.setVisibility(8);
            this.f7511i.setVisibility(8);
            this.f7512j.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f7513k.setVisibility(8);
            this.f7514l.setVisibility(0);
            this.f7511i.setVisibility(0);
            this.f7512j.setVisibility(0);
            m8166C(this.f7506d);
        }
    }

    /* JADX INFO: renamed from: F */
    void m8168F() {
        l lVar = this.f7507e;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            m8167D(l.DAY);
            this.f7510h.announceForAccessibility(getString(AbstractC0148i.f537A));
        } else if (lVar == l.DAY) {
            m8167D(lVar2);
            this.f7509g.announceForAccessibility(getString(AbstractC0148i.f538B));
        }
    }

    @Override // com.google.android.material.datepicker.AbstractC1506m
    /* JADX INFO: renamed from: i */
    public boolean mo8169i(AbstractC1505l abstractC1505l) {
        return super.mo8169i(abstractC1505l);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f7504b = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC0740E.m2693a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f7505c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC0740E.m2693a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f7506d = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i3;
        int i4;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f7504b);
        this.f7508f = new C1495b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f7516n = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month monthM8110m = this.f7505c.m8110m();
        if (C1501h.m8188u(contextThemeWrapper)) {
            i3 = AbstractC0146g.f532w;
            i4 = 1;
        } else {
            i3 = AbstractC0146g.f530u;
            i4 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i3, viewGroup, false);
        viewInflate.setMinimumHeight(m8165y(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(AbstractC0144e.f503w);
        AbstractC0268W.m775i0(gridView, new c());
        int iM8107j = this.f7505c.m8107j();
        gridView.setAdapter((ListAdapter) (iM8107j > 0 ? new C1498e(iM8107j) : new C1498e()));
        gridView.setNumColumns(monthM8110m.f7478g);
        gridView.setEnabled(false);
        this.f7510h = (RecyclerView) viewInflate.findViewById(AbstractC0144e.f506z);
        this.f7510h.setLayoutManager(new d(getContext(), i4, false, i4));
        this.f7510h.setTag(f7500o);
        C1504k c1504k = new C1504k(contextThemeWrapper, null, this.f7505c, null, new e());
        this.f7510h.setAdapter(c1504k);
        int integer = contextThemeWrapper.getResources().getInteger(AbstractC0145f.f509c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(AbstractC0144e.f456A);
        this.f7509g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7509g.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f7509g.setAdapter(new C1515v(this));
            this.f7509g.m5601h(m8163s());
        }
        if (viewInflate.findViewById(AbstractC0144e.f498r) != null) {
            m8162r(viewInflate, c1504k);
        }
        if (!C1501h.m8188u(contextThemeWrapper)) {
            new C1231j().m6257b(this.f7510h);
        }
        this.f7510h.m5602h1(c1504k.m8213A(this.f7506d));
        m8153E();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7504b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7505c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7506d);
    }

    /* JADX INFO: renamed from: t */
    CalendarConstraints m8170t() {
        return this.f7505c;
    }

    /* JADX INFO: renamed from: u */
    C1495b m8171u() {
        return this.f7508f;
    }

    /* JADX INFO: renamed from: v */
    Month m8172v() {
        return this.f7506d;
    }

    /* JADX INFO: renamed from: w */
    public DateSelector m8173w() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    LinearLayoutManager m8174z() {
        return (LinearLayoutManager) this.f7510h.getLayoutManager();
    }
}
