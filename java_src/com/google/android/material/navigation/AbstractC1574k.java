package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.transition.AbstractC1275t;
import androidx.transition.C1256a;
import androidx.transition.C1277v;
import com.google.android.material.badge.C1434a;
import com.google.android.material.internal.C1544o;
import java.util.HashSet;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0145f;
import p019G0.AbstractC0176a;
import p024I.C0210g;
import p024I.InterfaceC0208e;
import p030K.C0356y;
import p058T0.AbstractC0528h;
import p076Z0.C0637h;
import p076Z0.C0641l;
import p091d.AbstractC1760a;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: com.google.android.material.navigation.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1574k extends ViewGroup implements InterfaceC0792k {

    /* JADX INFO: renamed from: W */
    private static final int[] f7930W = {R.attr.state_checked};

    /* JADX INFO: renamed from: a0 */
    private static final int[] f7931a0 = {-16842910};

    /* JADX INFO: renamed from: A */
    private boolean f7932A;

    /* JADX INFO: renamed from: B */
    private int f7933B;

    /* JADX INFO: renamed from: C */
    private int f7934C;

    /* JADX INFO: renamed from: D */
    private int f7935D;

    /* JADX INFO: renamed from: E */
    private int f7936E;

    /* JADX INFO: renamed from: F */
    private int f7937F;

    /* JADX INFO: renamed from: G */
    private int f7938G;

    /* JADX INFO: renamed from: H */
    private int f7939H;

    /* JADX INFO: renamed from: I */
    private C0641l f7940I;

    /* JADX INFO: renamed from: J */
    private boolean f7941J;

    /* JADX INFO: renamed from: K */
    private ColorStateList f7942K;

    /* JADX INFO: renamed from: L */
    private NavigationBarPresenter f7943L;

    /* JADX INFO: renamed from: M */
    private C1572i f7944M;

    /* JADX INFO: renamed from: N */
    private boolean f7945N;

    /* JADX INFO: renamed from: O */
    private boolean f7946O;

    /* JADX INFO: renamed from: P */
    private int f7947P;

    /* JADX INFO: renamed from: Q */
    private int f7948Q;

    /* JADX INFO: renamed from: R */
    private boolean f7949R;

    /* JADX INFO: renamed from: S */
    private MenuItem f7950S;

    /* JADX INFO: renamed from: T */
    private int f7951T;

    /* JADX INFO: renamed from: U */
    private boolean f7952U;

    /* JADX INFO: renamed from: V */
    private final Rect f7953V;

    /* JADX INFO: renamed from: a */
    private final C1277v f7954a;

    /* JADX INFO: renamed from: b */
    private final View.OnClickListener f7955b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0208e f7956c;

    /* JADX INFO: renamed from: d */
    private final SparseArray f7957d;

    /* JADX INFO: renamed from: e */
    private int f7958e;

    /* JADX INFO: renamed from: f */
    private int f7959f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1573j[] f7960g;

    /* JADX INFO: renamed from: h */
    private int f7961h;

    /* JADX INFO: renamed from: i */
    private int f7962i;

    /* JADX INFO: renamed from: j */
    private ColorStateList f7963j;

    /* JADX INFO: renamed from: k */
    private int f7964k;

    /* JADX INFO: renamed from: l */
    private ColorStateList f7965l;

    /* JADX INFO: renamed from: m */
    private final ColorStateList f7966m;

    /* JADX INFO: renamed from: n */
    private int f7967n;

    /* JADX INFO: renamed from: o */
    private int f7968o;

    /* JADX INFO: renamed from: p */
    private int f7969p;

    /* JADX INFO: renamed from: q */
    private int f7970q;

    /* JADX INFO: renamed from: r */
    private boolean f7971r;

    /* JADX INFO: renamed from: s */
    private Drawable f7972s;

    /* JADX INFO: renamed from: t */
    private ColorStateList f7973t;

    /* JADX INFO: renamed from: u */
    private int f7974u;

    /* JADX INFO: renamed from: v */
    private final SparseArray f7975v;

    /* JADX INFO: renamed from: w */
    private int f7976w;

    /* JADX INFO: renamed from: x */
    private int f7977x;

    /* JADX INFO: renamed from: y */
    private int f7978y;

    /* JADX INFO: renamed from: z */
    private int f7979z;

    /* JADX INFO: renamed from: com.google.android.material.navigation.k$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0788g itemData = ((AbstractC1570g) view).getItemData();
            boolean zM8596e = AbstractC1574k.this.f7944M.m8596e(itemData, AbstractC1574k.this.f7943L, 0);
            if (itemData == null || !itemData.isCheckable()) {
                return;
            }
            if (!zM8596e || itemData.isChecked()) {
                AbstractC1574k.this.setCheckedItem(itemData);
            }
        }
    }

    public AbstractC1574k(Context context) {
        super(context);
        this.f7957d = new SparseArray();
        this.f7961h = -1;
        this.f7962i = -1;
        this.f7975v = new SparseArray();
        this.f7976w = -1;
        this.f7977x = -1;
        this.f7978y = -1;
        this.f7979z = -1;
        this.f7939H = 49;
        this.f7941J = false;
        this.f7947P = 1;
        this.f7948Q = 0;
        this.f7950S = null;
        this.f7951T = 7;
        this.f7952U = false;
        this.f7953V = new Rect();
        this.f7966m = m8608e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f7954a = null;
        } else {
            C1256a c1256a = new C1256a();
            this.f7954a = c1256a;
            c1256a.m6465r0(0);
            c1256a.mo6432q(TextView.class, true);
            c1256a.mo6414Z(AbstractC0528h.m1910f(getContext(), AbstractC0140a.f308A, getResources().getInteger(AbstractC0145f.f508b)));
            c1256a.mo6418b0(AbstractC0528h.m1911g(getContext(), AbstractC0140a.f316I, AbstractC0176a.f1126b));
            c1256a.m6458j0(new C1544o());
        }
        this.f7955b = new a();
        setImportantForAccessibility(1);
    }

    /* JADX INFO: renamed from: f */
    private Drawable m8601f() {
        if (this.f7940I == null || this.f7942K == null) {
            return null;
        }
        C0637h c0637h = new C0637h(this.f7940I);
        c0637h.m2274c0(this.f7942K);
        return c0637h;
    }

    /* JADX INFO: renamed from: g */
    private AbstractC1570g m8602g(int i3, C0788g c0788g, boolean z2, boolean z3) {
        this.f7943L.m8515g(true);
        c0788g.setCheckable(true);
        this.f7943L.m8515g(false);
        AbstractC1570g newItem = getNewItem();
        newItem.setShifting(z2);
        newItem.setLabelMaxLines(this.f7947P);
        newItem.setIconTintList(this.f7963j);
        newItem.setIconSize(this.f7964k);
        newItem.setTextColor(this.f7966m);
        newItem.setTextAppearanceInactive(this.f7967n);
        newItem.setTextAppearanceActive(this.f7968o);
        newItem.setHorizontalTextAppearanceInactive(this.f7969p);
        newItem.setHorizontalTextAppearanceActive(this.f7970q);
        newItem.setTextAppearanceActiveBoldEnabled(this.f7971r);
        newItem.setTextColor(this.f7965l);
        int i4 = this.f7976w;
        if (i4 != -1) {
            newItem.setItemPaddingTop(i4);
        }
        int i5 = this.f7977x;
        if (i5 != -1) {
            newItem.setItemPaddingBottom(i5);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f7945N);
        newItem.setLabelFontScalingEnabled(this.f7946O);
        int i6 = this.f7978y;
        if (i6 != -1) {
            newItem.setActiveIndicatorLabelPadding(i6);
        }
        int i7 = this.f7979z;
        if (i7 != -1) {
            newItem.setIconLabelHorizontalSpacing(i7);
        }
        newItem.setActiveIndicatorWidth(this.f7933B);
        newItem.setActiveIndicatorHeight(this.f7934C);
        newItem.setActiveIndicatorExpandedWidth(this.f7935D);
        newItem.setActiveIndicatorExpandedHeight(this.f7936E);
        newItem.setActiveIndicatorMarginHorizontal(this.f7937F);
        newItem.setItemGravity(this.f7939H);
        newItem.setActiveIndicatorExpandedPadding(this.f7953V);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.f7938G);
        newItem.setActiveIndicatorDrawable(m8601f());
        newItem.setActiveIndicatorResizeable(this.f7941J);
        newItem.setActiveIndicatorEnabled(this.f7932A);
        Drawable drawable = this.f7972s;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f7974u);
        }
        newItem.setItemRippleColor(this.f7973t);
        newItem.setLabelVisibilityMode(this.f7958e);
        newItem.setItemIconGravity(this.f7959f);
        newItem.setOnlyShowWhenExpanded(z3);
        newItem.setExpanded(this.f7949R);
        newItem.mo3048e(c0788g, 0);
        newItem.setItemPosition(i3);
        int itemId = c0788g.getItemId();
        newItem.setOnTouchListener((View.OnTouchListener) this.f7957d.get(itemId));
        newItem.setOnClickListener(this.f7955b);
        int i8 = this.f7961h;
        if (i8 != 0 && itemId == i8) {
            this.f7962i = i3;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f7951T, this.f7944M.m8595d());
    }

    private AbstractC1570g getNewItem() {
        InterfaceC0208e interfaceC0208e = this.f7956c;
        AbstractC1570g abstractC1570g = interfaceC0208e != null ? (AbstractC1570g) interfaceC0208e.mo602b() : null;
        return abstractC1570g == null ? mo7587h(getContext()) : abstractC1570g;
    }

    /* JADX INFO: renamed from: i */
    private boolean m8603i() {
        C1572i c1572i;
        if (this.f7960g == null || (c1572i = this.f7944M) == null || c1572i.m8598g() != this.f7960g.length) {
            return false;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f7960g.length) {
                return true;
            }
            if ((this.f7944M.m8593b(i3) instanceof MenuItemC1564a) && !(this.f7960g[i3] instanceof C1567d)) {
                return false;
            }
            boolean z2 = this.f7944M.m8593b(i3).hasSubMenu() && !(this.f7960g[i3] instanceof C1576m);
            boolean z3 = (this.f7944M.m8593b(i3).hasSubMenu() || (this.f7960g[i3] instanceof AbstractC1570g)) ? false : true;
            if (!(this.f7944M.m8593b(i3) instanceof MenuItemC1564a) && (z2 || z3)) {
                break;
            }
            i3++;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private boolean m8604k(int i3) {
        return i3 != -1;
    }

    /* JADX INFO: renamed from: l */
    private void m8605l() {
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr == null || this.f7956c == null) {
            return;
        }
        for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
            if (interfaceC1573j instanceof AbstractC1570g) {
                AbstractC1570g abstractC1570g = (AbstractC1570g) interfaceC1573j;
                this.f7956c.mo601a(abstractC1570g);
                abstractC1570g.m8586g();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private void m8606m() {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < this.f7944M.m8598g(); i3++) {
            hashSet.add(Integer.valueOf(this.f7944M.m8593b(i3).getItemId()));
        }
        for (int i4 = 0; i4 < this.f7975v.size(); i4++) {
            int iKeyAt = this.f7975v.keyAt(i4);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f7975v.delete(iKeyAt);
            }
        }
    }

    private void setBadgeIfNeeded(AbstractC1570g abstractC1570g) {
        C1434a c1434a;
        int id = abstractC1570g.getId();
        if (m8604k(id) && (c1434a = (C1434a) this.f7975v.get(id)) != null) {
            abstractC1570g.setBadge(c1434a);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k
    /* JADX INFO: renamed from: b */
    public void mo3054b(C0786e c0786e) {
        this.f7944M = new C1572i(c0786e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public void m8607d() {
        View viewM8602g;
        removeAllViews();
        m8605l();
        this.f7943L.m8515g(true);
        this.f7944M.m8597f();
        this.f7943L.m8515g(false);
        int iM8592a = this.f7944M.m8592a();
        if (iM8592a == 0) {
            this.f7961h = 0;
            this.f7962i = 0;
            this.f7960g = null;
            this.f7956c = null;
            return;
        }
        if (this.f7956c == null || this.f7948Q != iM8592a) {
            this.f7948Q = iM8592a;
            this.f7956c = new C0210g(iM8592a);
        }
        m8606m();
        int iM8598g = this.f7944M.m8598g();
        this.f7960g = new InterfaceC1573j[iM8598g];
        boolean zM8609j = m8609j(this.f7958e, getCurrentVisibleContentItemCount());
        int size = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iM8598g; i4++) {
            MenuItem menuItemM8593b = this.f7944M.m8593b(i4);
            boolean z2 = menuItemM8593b instanceof MenuItemC1564a;
            if (z2) {
                C1567d c1567d = new C1567d(getContext());
                c1567d.setOnlyShowWhenExpanded(true);
                c1567d.setDividersEnabled(this.f7952U);
                viewM8602g = c1567d;
            } else if (menuItemM8593b.hasSubMenu()) {
                if (size > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                C1576m c1576m = new C1576m(getContext());
                int i5 = this.f7970q;
                if (i5 == 0) {
                    i5 = this.f7968o;
                }
                c1576m.setTextAppearance(i5);
                c1576m.setTextColor(this.f7965l);
                c1576m.setOnlyShowWhenExpanded(true);
                c1576m.mo3048e((C0788g) menuItemM8593b, 0);
                size = menuItemM8593b.getSubMenu().size();
                viewM8602g = c1576m;
            } else if (size > 0) {
                size--;
                viewM8602g = m8602g(i4, (C0788g) menuItemM8593b, zM8609j, true);
            } else {
                C0788g c0788g = (C0788g) menuItemM8593b;
                boolean z3 = i3 >= this.f7951T;
                i3++;
                viewM8602g = m8602g(i4, c0788g, zM8609j, z3);
            }
            if (!z2 && menuItemM8593b.isCheckable() && this.f7962i == -1) {
                this.f7962i = i4;
            }
            this.f7960g[i4] = viewM8602g;
            addView(viewM8602g);
        }
        int iMin = Math.min(iM8598g - 1, this.f7962i);
        this.f7962i = iMin;
        setCheckedItem(this.f7960g[iMin].getItemData());
    }

    /* JADX INFO: renamed from: e */
    public ColorStateList m8608e(int i3) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i3, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM9608a = AbstractC1832a.m9608a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(AbstractC1760a.f8722w, typedValue, true)) {
            return null;
        }
        int i4 = typedValue.data;
        int defaultColor = colorStateListM9608a.getDefaultColor();
        int[] iArr = f7931a0;
        return new ColorStateList(new int[][]{iArr, f7930W, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListM9608a.getColorForState(iArr, defaultColor), i4, defaultColor});
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f7978y;
    }

    SparseArray<C1434a> getBadgeDrawables() {
        return this.f7975v;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f7949R ? this.f7944M.m8594c() : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f7970q;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f7969p;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f7979z;
    }

    public ColorStateList getIconTintList() {
        return this.f7963j;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f7942K;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f7932A;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f7936E;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f7938G;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f7935D;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f7934C;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f7937F;
    }

    public C0641l getItemActiveIndicatorShapeAppearance() {
        return this.f7940I;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f7933B;
    }

    public Drawable getItemBackground() {
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null && interfaceC1573jArr.length > 0) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    return ((AbstractC1570g) interfaceC1573j).getBackground();
                }
            }
        }
        return this.f7972s;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f7974u;
    }

    public int getItemGravity() {
        return this.f7939H;
    }

    public int getItemIconGravity() {
        return this.f7959f;
    }

    public int getItemIconSize() {
        return this.f7964k;
    }

    public int getItemPaddingBottom() {
        return this.f7977x;
    }

    public int getItemPaddingTop() {
        return this.f7976w;
    }

    public ColorStateList getItemRippleColor() {
        return this.f7973t;
    }

    public int getItemTextAppearanceActive() {
        return this.f7968o;
    }

    public int getItemTextAppearanceInactive() {
        return this.f7967n;
    }

    public ColorStateList getItemTextColor() {
        return this.f7965l;
    }

    public int getLabelMaxLines() {
        return this.f7947P;
    }

    public int getLabelVisibilityMode() {
        return this.f7958e;
    }

    protected C1572i getMenu() {
        return this.f7944M;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f7946O;
    }

    public int getSelectedItemId() {
        return this.f7961h;
    }

    protected int getSelectedItemPosition() {
        return this.f7962i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    protected abstract AbstractC1570g mo7587h(Context context);

    /* JADX INFO: renamed from: j */
    protected boolean m8609j(int i3, int i4) {
        return i3 == -1 ? i4 > 3 : i3 == 0;
    }

    /* JADX INFO: renamed from: n */
    void m8610n(SparseArray sparseArray) {
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            if (this.f7975v.indexOfKey(iKeyAt) < 0) {
                this.f7975v.append(iKeyAt, (C1434a) sparseArray.get(iKeyAt));
            }
        }
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    AbstractC1570g abstractC1570g = (AbstractC1570g) interfaceC1573j;
                    C1434a c1434a = (C1434a) this.f7975v.get(abstractC1570g.getId());
                    if (c1434a != null) {
                        abstractC1570g.setBadge(c1434a);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m8611o(int i3, int i4, int i5, int i6) {
        Rect rect = this.f7953V;
        rect.left = i3;
        rect.top = i4;
        rect.right = i5;
        rect.bottom = i6;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorExpandedPadding(this.f7953V);
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0356y.m1204V0(accessibilityNodeInfo).m1290u0(C0356y.f.m1318b(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    /* JADX INFO: renamed from: p */
    void m8612p(int i3) {
        int iM8598g = this.f7944M.m8598g();
        for (int i4 = 0; i4 < iM8598g; i4++) {
            MenuItem menuItemM8593b = this.f7944M.m8593b(i4);
            if (i3 == menuItemM8593b.getItemId()) {
                this.f7961h = i3;
                this.f7962i = i4;
                setCheckedItem(menuItemM8593b);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m8613q() {
        C1277v c1277v;
        if (this.f7944M == null || this.f7960g == null) {
            return;
        }
        this.f7943L.m8515g(true);
        this.f7944M.m8597f();
        this.f7943L.m8515g(false);
        if (!m8603i()) {
            m8607d();
            return;
        }
        int i3 = this.f7961h;
        int iM8598g = this.f7944M.m8598g();
        for (int i4 = 0; i4 < iM8598g; i4++) {
            MenuItem menuItemM8593b = this.f7944M.m8593b(i4);
            if (menuItemM8593b.isChecked()) {
                setCheckedItem(menuItemM8593b);
                this.f7961h = menuItemM8593b.getItemId();
                this.f7962i = i4;
            }
        }
        if (i3 != this.f7961h && (c1277v = this.f7954a) != null) {
            AbstractC1275t.m6449a(this, c1277v);
        }
        boolean zM8609j = m8609j(this.f7958e, getCurrentVisibleContentItemCount());
        for (int i5 = 0; i5 < iM8598g; i5++) {
            this.f7943L.m8515g(true);
            this.f7960g[i5].setExpanded(this.f7949R);
            InterfaceC1573j interfaceC1573j = this.f7960g[i5];
            if (interfaceC1573j instanceof AbstractC1570g) {
                AbstractC1570g abstractC1570g = (AbstractC1570g) interfaceC1573j;
                abstractC1570g.setLabelVisibilityMode(this.f7958e);
                abstractC1570g.setItemIconGravity(this.f7959f);
                abstractC1570g.setItemGravity(this.f7939H);
                abstractC1570g.setShifting(zM8609j);
            }
            if (this.f7944M.m8593b(i5) instanceof C0788g) {
                this.f7960g[i5].mo3048e((C0788g) this.f7944M.m8593b(i5), 0);
            }
            this.f7943L.m8515g(false);
        }
    }

    public void setActiveIndicatorLabelPadding(int i3) {
        this.f7978y = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorLabelPadding(i3);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f7950S == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f7950S;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f7950S.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f7950S = menuItem;
    }

    public void setCollapsedMaxItemCount(int i3) {
        this.f7951T = i3;
    }

    public void setExpanded(boolean z2) {
        this.f7949R = z2;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                interfaceC1573j.setExpanded(z2);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i3) {
        this.f7970q = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setHorizontalTextAppearanceActive(i3);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i3) {
        this.f7969p = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setHorizontalTextAppearanceInactive(i3);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i3) {
        this.f7979z = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setIconLabelHorizontalSpacing(i3);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f7963j = colorStateList;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f7942K = colorStateList;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorDrawable(m8601f());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        this.f7932A = z2;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorEnabled(z2);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i3) {
        this.f7936E = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorExpandedHeight(i3);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i3) {
        this.f7938G = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorExpandedMarginHorizontal(i3);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i3) {
        this.f7935D = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorExpandedWidth(i3);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i3) {
        this.f7934C = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorHeight(i3);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i3) {
        this.f7937F = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorMarginHorizontal(i3);
                }
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z2) {
        this.f7941J = z2;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorResizeable(z2);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C0641l c0641l) {
        this.f7940I = c0641l;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorDrawable(m8601f());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i3) {
        this.f7933B = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setActiveIndicatorWidth(i3);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f7972s = drawable;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i3) {
        this.f7974u = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setItemBackground(i3);
                }
            }
        }
    }

    public void setItemGravity(int i3) {
        this.f7939H = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setItemGravity(i3);
                }
            }
        }
    }

    public void setItemIconGravity(int i3) {
        this.f7959f = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setItemIconGravity(i3);
                }
            }
        }
    }

    public void setItemIconSize(int i3) {
        this.f7964k = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setIconSize(i3);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i3) {
        this.f7977x = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setItemPaddingBottom(this.f7977x);
                }
            }
        }
    }

    public void setItemPaddingTop(int i3) {
        this.f7976w = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setItemPaddingTop(i3);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f7973t = colorStateList;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i3) {
        this.f7968o = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setTextAppearanceActive(i3);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        this.f7971r = z2;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setTextAppearanceActiveBoldEnabled(z2);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i3) {
        this.f7967n = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setTextAppearanceInactive(i3);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7965l = colorStateList;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z2) {
        this.f7946O = z2;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setLabelFontScalingEnabled(z2);
                }
            }
        }
    }

    public void setLabelMaxLines(int i3) {
        this.f7947P = i3;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setLabelMaxLines(i3);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i3) {
        this.f7958e = i3;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z2) {
        this.f7945N = z2;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof AbstractC1570g) {
                    ((AbstractC1570g) interfaceC1573j).setMeasureBottomPaddingFromLabelBaseline(z2);
                }
            }
        }
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f7943L = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z2) {
        if (this.f7952U == z2) {
            return;
        }
        this.f7952U = z2;
        InterfaceC1573j[] interfaceC1573jArr = this.f7960g;
        if (interfaceC1573jArr != null) {
            for (InterfaceC1573j interfaceC1573j : interfaceC1573jArr) {
                if (interfaceC1573j instanceof C1567d) {
                    ((C1567d) interfaceC1573j).setDividersEnabled(z2);
                }
            }
        }
    }
}
