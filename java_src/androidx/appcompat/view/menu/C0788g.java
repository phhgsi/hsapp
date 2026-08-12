package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC0792k;
import p000A.AbstractC0000a;
import p003B.InterfaceMenuItemC0029b;
import p027J.AbstractC0275b;
import p091d.AbstractC1767h;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0788g implements InterfaceMenuItemC0029b {

    /* JADX INFO: renamed from: A */
    private View f3016A;

    /* JADX INFO: renamed from: B */
    private AbstractC0275b f3017B;

    /* JADX INFO: renamed from: C */
    private MenuItem.OnActionExpandListener f3018C;

    /* JADX INFO: renamed from: E */
    private ContextMenu.ContextMenuInfo f3020E;

    /* JADX INFO: renamed from: a */
    private final int f3021a;

    /* JADX INFO: renamed from: b */
    private final int f3022b;

    /* JADX INFO: renamed from: c */
    private final int f3023c;

    /* JADX INFO: renamed from: d */
    private final int f3024d;

    /* JADX INFO: renamed from: e */
    private CharSequence f3025e;

    /* JADX INFO: renamed from: f */
    private CharSequence f3026f;

    /* JADX INFO: renamed from: g */
    private Intent f3027g;

    /* JADX INFO: renamed from: h */
    private char f3028h;

    /* JADX INFO: renamed from: j */
    private char f3030j;

    /* JADX INFO: renamed from: l */
    private Drawable f3032l;

    /* JADX INFO: renamed from: n */
    C0786e f3034n;

    /* JADX INFO: renamed from: o */
    private SubMenuC0794m f3035o;

    /* JADX INFO: renamed from: p */
    private Runnable f3036p;

    /* JADX INFO: renamed from: q */
    private MenuItem.OnMenuItemClickListener f3037q;

    /* JADX INFO: renamed from: r */
    private CharSequence f3038r;

    /* JADX INFO: renamed from: s */
    private CharSequence f3039s;

    /* JADX INFO: renamed from: z */
    private int f3046z;

    /* JADX INFO: renamed from: i */
    private int f3029i = 4096;

    /* JADX INFO: renamed from: k */
    private int f3031k = 4096;

    /* JADX INFO: renamed from: m */
    private int f3033m = 0;

    /* JADX INFO: renamed from: t */
    private ColorStateList f3040t = null;

    /* JADX INFO: renamed from: u */
    private PorterDuff.Mode f3041u = null;

    /* JADX INFO: renamed from: v */
    private boolean f3042v = false;

    /* JADX INFO: renamed from: w */
    private boolean f3043w = false;

    /* JADX INFO: renamed from: x */
    private boolean f3044x = false;

    /* JADX INFO: renamed from: y */
    private int f3045y = 16;

    /* JADX INFO: renamed from: D */
    private boolean f3019D = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.g$a */
    class a implements AbstractC0275b.b {
        a() {
        }

        @Override // p027J.AbstractC0275b.b
        public void onActionProviderVisibilityChanged(boolean z2) {
            C0788g c0788g = C0788g.this;
            c0788g.f3034n.m3134M(c0788g);
        }
    }

    C0788g(C0786e c0786e, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        this.f3034n = c0786e;
        this.f3021a = i4;
        this.f3022b = i3;
        this.f3023c = i5;
        this.f3024d = i6;
        this.f3025e = charSequence;
        this.f3046z = i7;
    }

    /* JADX INFO: renamed from: d */
    private static void m3176d(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    /* JADX INFO: renamed from: e */
    private Drawable m3177e(Drawable drawable) {
        if (drawable != null && this.f3044x && (this.f3042v || this.f3043w)) {
            drawable = AbstractC0000a.m17r(drawable).mutate();
            if (this.f3042v) {
                AbstractC0000a.m14o(drawable, this.f3040t);
            }
            if (this.f3043w) {
                AbstractC0000a.m15p(drawable, this.f3041u);
            }
            this.f3044x = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: A */
    boolean m3178A() {
        return this.f3034n.mo3132K() && m3182g() != 0;
    }

    /* JADX INFO: renamed from: B */
    public boolean m3179B() {
        return (this.f3046z & 4) == 4;
    }

    @Override // p003B.InterfaceMenuItemC0029b
    /* JADX INFO: renamed from: a */
    public AbstractC0275b mo80a() {
        return this.f3017B;
    }

    @Override // p003B.InterfaceMenuItemC0029b
    /* JADX INFO: renamed from: b */
    public InterfaceMenuItemC0029b mo81b(AbstractC0275b abstractC0275b) {
        AbstractC0275b abstractC0275b2 = this.f3017B;
        if (abstractC0275b2 != null) {
            abstractC0275b2.m917g();
        }
        this.f3016A = null;
        this.f3017B = abstractC0275b;
        this.f3034n.mo3135N(true);
        AbstractC0275b abstractC0275b3 = this.f3017B;
        if (abstractC0275b3 != null) {
            abstractC0275b3.mo919i(new a());
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m3180c() {
        this.f3034n.m3133L(this);
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f3046z & 8) == 0) {
            return false;
        }
        if (this.f3016A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3018C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3034n.mo3156f(this);
        }
        return false;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m3185j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3018C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3034n.mo3161m(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m3181f() {
        return this.f3024d;
    }

    /* JADX INFO: renamed from: g */
    char m3182g() {
        return this.f3034n.mo3131J() ? this.f3030j : this.f3028h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public View getActionView() {
        View view = this.f3016A;
        if (view != null) {
            return view;
        }
        AbstractC0275b abstractC0275b = this.f3017B;
        if (abstractC0275b == null) {
            return null;
        }
        View viewMo913c = abstractC0275b.mo913c(this);
        this.f3016A = viewMo913c;
        return viewMo913c;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f3031k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f3030j;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f3038r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f3022b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f3032l;
        if (drawable != null) {
            return m3177e(drawable);
        }
        if (this.f3033m == 0) {
            return null;
        }
        Drawable drawableM9609b = AbstractC1832a.m9609b(this.f3034n.m3170w(), this.f3033m);
        this.f3033m = 0;
        this.f3032l = drawableM9609b;
        return m3177e(drawableM9609b);
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f3040t;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f3041u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f3027g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f3021a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f3020E;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f3029i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f3028h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f3023c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f3035o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f3025e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3026f;
        return charSequence != null ? charSequence : this.f3025e;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f3039s;
    }

    /* JADX INFO: renamed from: h */
    String m3183h() {
        char cM3182g = m3182g();
        if (cM3182g == 0) {
            return "";
        }
        Resources resources = this.f3034n.m3170w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f3034n.m3170w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC1767h.f8867m));
        }
        int i3 = this.f3034n.mo3131J() ? this.f3031k : this.f3029i;
        m3176d(sb, i3, 65536, resources.getString(AbstractC1767h.f8863i));
        m3176d(sb, i3, 4096, resources.getString(AbstractC1767h.f8859e));
        m3176d(sb, i3, 2, resources.getString(AbstractC1767h.f8858d));
        m3176d(sb, i3, 1, resources.getString(AbstractC1767h.f8864j));
        m3176d(sb, i3, 4, resources.getString(AbstractC1767h.f8866l));
        m3176d(sb, i3, 8, resources.getString(AbstractC1767h.f8862h));
        if (cM3182g == '\b') {
            sb.append(resources.getString(AbstractC1767h.f8860f));
        } else if (cM3182g == '\n') {
            sb.append(resources.getString(AbstractC1767h.f8861g));
        } else if (cM3182g != ' ') {
            sb.append(cM3182g);
        } else {
            sb.append(resources.getString(AbstractC1767h.f8865k));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f3035o != null;
    }

    /* JADX INFO: renamed from: i */
    CharSequence m3184i(InterfaceC0792k.a aVar) {
        return (aVar == null || !aVar.mo3047d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f3019D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f3045y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f3045y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f3045y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0275b abstractC0275b = this.f3017B;
        return (abstractC0275b == null || !abstractC0275b.mo916f()) ? (this.f3045y & 8) == 0 : (this.f3045y & 8) == 0 && this.f3017B.mo912b();
    }

    /* JADX INFO: renamed from: j */
    public boolean m3185j() {
        AbstractC0275b abstractC0275b;
        if ((this.f3046z & 8) != 0) {
            if (this.f3016A == null && (abstractC0275b = this.f3017B) != null) {
                this.f3016A = abstractC0275b.mo913c(this);
            }
            if (this.f3016A != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m3186k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f3037q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0786e c0786e = this.f3034n;
        if (c0786e.mo3158h(c0786e, this)) {
            return true;
        }
        Runnable runnable = this.f3036p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f3027g != null) {
            try {
                this.f3034n.m3170w().startActivity(this.f3027g);
                return true;
            } catch (ActivityNotFoundException e3) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
            }
        }
        AbstractC0275b abstractC0275b = this.f3017B;
        return abstractC0275b != null && abstractC0275b.mo914d();
    }

    /* JADX INFO: renamed from: l */
    public boolean m3187l() {
        return (this.f3045y & 32) == 32;
    }

    /* JADX INFO: renamed from: m */
    public boolean m3188m() {
        return (this.f3045y & 4) != 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m3189n() {
        return (this.f3046z & 1) == 1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m3190o() {
        return (this.f3046z & 2) == 2;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0029b setActionView(int i3) {
        Context contextM3170w = this.f3034n.m3170w();
        setActionView(LayoutInflater.from(contextM3170w).inflate(i3, (ViewGroup) new LinearLayout(contextM3170w), false));
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0029b setActionView(View view) {
        int i3;
        this.f3016A = view;
        this.f3017B = null;
        if (view != null && view.getId() == -1 && (i3 = this.f3021a) > 0) {
            view.setId(i3);
        }
        this.f3034n.m3133L(this);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m3193r(boolean z2) {
        this.f3019D = z2;
        this.f3034n.mo3135N(false);
    }

    /* JADX INFO: renamed from: s */
    void m3194s(boolean z2) {
        int i3 = this.f3045y;
        int i4 = (z2 ? 2 : 0) | (i3 & (-3));
        this.f3045y = i4;
        if (i3 != i4) {
            this.f3034n.mo3135N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3) {
        if (this.f3030j == c3) {
            return this;
        }
        this.f3030j = Character.toLowerCase(c3);
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i3 = this.f3045y;
        int i4 = (z2 ? 1 : 0) | (i3 & (-2));
        this.f3045y = i4;
        if (i3 != i4) {
            this.f3034n.mo3135N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.f3045y & 4) != 0) {
            this.f3034n.m3145Y(this);
            return this;
        }
        m3194s(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f3045y |= 16;
        } else {
            this.f3045y &= -17;
        }
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f3033m = 0;
        this.f3032l = drawable;
        this.f3044x = true;
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3040t = colorStateList;
        this.f3042v = true;
        this.f3044x = true;
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3041u = mode;
        this.f3043w = true;
        this.f3044x = true;
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f3027g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3) {
        if (this.f3028h == c3) {
            return this;
        }
        this.f3028h = c3;
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3018C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3037q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4) {
        this.f3028h = c3;
        this.f3030j = Character.toLowerCase(c4);
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3046z = i3;
        this.f3034n.m3133L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f3025e = charSequence;
        this.f3034n.mo3135N(false);
        SubMenuC0794m subMenuC0794m = this.f3035o;
        if (subMenuC0794m != null) {
            subMenuC0794m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3026f = charSequence;
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (m3200y(z2)) {
            this.f3034n.m3134M(this);
        }
        return this;
    }

    /* JADX INFO: renamed from: t */
    public void m3195t(boolean z2) {
        this.f3045y = (z2 ? 4 : 0) | (this.f3045y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f3025e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public void m3196u(boolean z2) {
        if (z2) {
            this.f3045y |= 32;
        } else {
            this.f3045y &= -33;
        }
    }

    /* JADX INFO: renamed from: v */
    void m3197v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f3020E = contextMenuInfo;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0029b setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public void m3199x(SubMenuC0794m subMenuC0794m) {
        this.f3035o = subMenuC0794m;
        subMenuC0794m.setHeaderTitle(getTitle());
    }

    /* JADX INFO: renamed from: y */
    boolean m3200y(boolean z2) {
        int i3 = this.f3045y;
        int i4 = (z2 ? 0 : 8) | (i3 & (-9));
        this.f3045y = i4;
        return i3 != i4;
    }

    /* JADX INFO: renamed from: z */
    public boolean m3201z() {
        return this.f3034n.m3125C();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0029b setContentDescription(CharSequence charSequence) {
        this.f3038r = charSequence;
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0029b setTooltipText(CharSequence charSequence) {
        this.f3039s = charSequence;
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f3030j == c3 && this.f3031k == i3) {
            return this;
        }
        this.f3030j = Character.toLowerCase(c3);
        this.f3031k = KeyEvent.normalizeMetaState(i3);
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c3, int i3) {
        if (this.f3028h == c3 && this.f3029i == i3) {
            return this;
        }
        this.f3028h = c3;
        this.f3029i = KeyEvent.normalizeMetaState(i3);
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f3028h = c3;
        this.f3029i = KeyEvent.normalizeMetaState(i3);
        this.f3030j = Character.toLowerCase(c4);
        this.f3031k = KeyEvent.normalizeMetaState(i4);
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i3) {
        this.f3032l = null;
        this.f3033m = i3;
        this.f3044x = true;
        this.f3034n.mo3135N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i3) {
        return setTitle(this.f3034n.m3170w().getString(i3));
    }
}
