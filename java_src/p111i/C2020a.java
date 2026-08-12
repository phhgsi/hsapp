package p111i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.AbstractC0966b;
import p000A.AbstractC0000a;
import p003B.InterfaceMenuItemC0029b;
import p027J.AbstractC0275b;

/* JADX INFO: renamed from: i.a */
/* JADX INFO: loaded from: classes.dex */
public class C2020a implements InterfaceMenuItemC0029b {

    /* JADX INFO: renamed from: a */
    private final int f9607a;

    /* JADX INFO: renamed from: b */
    private final int f9608b;

    /* JADX INFO: renamed from: c */
    private final int f9609c;

    /* JADX INFO: renamed from: d */
    private CharSequence f9610d;

    /* JADX INFO: renamed from: e */
    private CharSequence f9611e;

    /* JADX INFO: renamed from: f */
    private Intent f9612f;

    /* JADX INFO: renamed from: g */
    private char f9613g;

    /* JADX INFO: renamed from: i */
    private char f9615i;

    /* JADX INFO: renamed from: k */
    private Drawable f9617k;

    /* JADX INFO: renamed from: l */
    private Context f9618l;

    /* JADX INFO: renamed from: m */
    private MenuItem.OnMenuItemClickListener f9619m;

    /* JADX INFO: renamed from: n */
    private CharSequence f9620n;

    /* JADX INFO: renamed from: o */
    private CharSequence f9621o;

    /* JADX INFO: renamed from: h */
    private int f9614h = 4096;

    /* JADX INFO: renamed from: j */
    private int f9616j = 4096;

    /* JADX INFO: renamed from: p */
    private ColorStateList f9622p = null;

    /* JADX INFO: renamed from: q */
    private PorterDuff.Mode f9623q = null;

    /* JADX INFO: renamed from: r */
    private boolean f9624r = false;

    /* JADX INFO: renamed from: s */
    private boolean f9625s = false;

    /* JADX INFO: renamed from: t */
    private int f9626t = 16;

    public C2020a(Context context, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.f9618l = context;
        this.f9607a = i4;
        this.f9608b = i3;
        this.f9609c = i6;
        this.f9610d = charSequence;
    }

    /* JADX INFO: renamed from: c */
    private void m10198c() {
        Drawable drawable = this.f9617k;
        if (drawable != null) {
            if (this.f9624r || this.f9625s) {
                Drawable drawableM17r = AbstractC0000a.m17r(drawable);
                this.f9617k = drawableM17r;
                Drawable drawableMutate = drawableM17r.mutate();
                this.f9617k = drawableMutate;
                if (this.f9624r) {
                    AbstractC0000a.m14o(drawableMutate, this.f9622p);
                }
                if (this.f9625s) {
                    AbstractC0000a.m15p(this.f9617k, this.f9623q);
                }
            }
        }
    }

    @Override // p003B.InterfaceMenuItemC0029b
    /* JADX INFO: renamed from: a */
    public AbstractC0275b mo80a() {
        return null;
    }

    @Override // p003B.InterfaceMenuItemC0029b
    /* JADX INFO: renamed from: b */
    public InterfaceMenuItemC0029b mo81b(AbstractC0275b abstractC0275b) {
        throw new UnsupportedOperationException();
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0029b setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0029b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0029b setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f9616j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f9615i;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f9620n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f9608b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f9617k;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f9622p;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f9623q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f9612f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f9607a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f9614h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f9613g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f9609c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f9610d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9611e;
        return charSequence != null ? charSequence : this.f9610d;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f9621o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f9626t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f9626t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f9626t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f9626t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3) {
        this.f9615i = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f9626t = (z2 ? 1 : 0) | (this.f9626t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f9626t = (z2 ? 2 : 0) | (this.f9626t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f9626t = (z2 ? 16 : 0) | (this.f9626t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f9617k = drawable;
        m10198c();
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9622p = colorStateList;
        this.f9624r = true;
        m10198c();
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9623q = mode;
        this.f9625s = true;
        m10198c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f9612f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3) {
        this.f9613g = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9619m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4) {
        this.f9613g = c3;
        this.f9615i = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9610d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9611e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        this.f9626t = (this.f9626t & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3, int i3) {
        this.f9615i = Character.toLowerCase(c3);
        this.f9616j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0029b setContentDescription(CharSequence charSequence) {
        this.f9620n = charSequence;
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c3, int i3) {
        this.f9613g = c3;
        this.f9614h = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i3) {
        this.f9610d = this.f9618l.getResources().getString(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0029b setTooltipText(CharSequence charSequence) {
        this.f9621o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i3) {
        this.f9617k = AbstractC0966b.getDrawable(this.f9618l, i3);
        m10198c();
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f9613g = c3;
        this.f9614h = KeyEvent.normalizeMetaState(i3);
        this.f9615i = Character.toLowerCase(c4);
        this.f9616j = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // p003B.InterfaceMenuItemC0029b, android.view.MenuItem
    public void setShowAsAction(int i3) {
    }
}
