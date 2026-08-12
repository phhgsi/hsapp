package p111i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.InterfaceC0773c;
import java.lang.reflect.Method;
import p003B.InterfaceMenuItemC0029b;
import p027J.AbstractC0275b;

/* JADX INFO: renamed from: i.c */
/* JADX INFO: loaded from: classes.dex */
public class MenuItemC2022c extends AbstractC2021b implements MenuItem {

    /* JADX INFO: renamed from: d */
    private final InterfaceMenuItemC0029b f9630d;

    /* JADX INFO: renamed from: e */
    private Method f9631e;

    /* JADX INFO: renamed from: i.c$a */
    private class a extends AbstractC0275b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d */
        private AbstractC0275b.b f9632d;

        /* JADX INFO: renamed from: e */
        private final ActionProvider f9633e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f9633e = actionProvider;
        }

        @Override // p027J.AbstractC0275b
        /* JADX INFO: renamed from: a */
        public boolean mo911a() {
            return this.f9633e.hasSubMenu();
        }

        @Override // p027J.AbstractC0275b
        /* JADX INFO: renamed from: b */
        public boolean mo912b() {
            return this.f9633e.isVisible();
        }

        @Override // p027J.AbstractC0275b
        /* JADX INFO: renamed from: c */
        public View mo913c(MenuItem menuItem) {
            return this.f9633e.onCreateActionView(menuItem);
        }

        @Override // p027J.AbstractC0275b
        /* JADX INFO: renamed from: d */
        public boolean mo914d() {
            return this.f9633e.onPerformDefaultAction();
        }

        @Override // p027J.AbstractC0275b
        /* JADX INFO: renamed from: e */
        public void mo915e(SubMenu subMenu) {
            this.f9633e.onPrepareSubMenu(MenuItemC2022c.this.m10203d(subMenu));
        }

        @Override // p027J.AbstractC0275b
        /* JADX INFO: renamed from: f */
        public boolean mo916f() {
            return this.f9633e.overridesItemVisibility();
        }

        @Override // p027J.AbstractC0275b
        /* JADX INFO: renamed from: i */
        public void mo919i(AbstractC0275b.b bVar) {
            this.f9632d = bVar;
            this.f9633e.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z2) {
            AbstractC0275b.b bVar = this.f9632d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z2);
            }
        }
    }

    /* JADX INFO: renamed from: i.c$b */
    static class b extends FrameLayout implements InterfaceC0773c {

        /* JADX INFO: renamed from: a */
        final CollapsibleActionView f9635a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f9635a = (CollapsibleActionView) view;
            addView(view);
        }

        /* JADX INFO: renamed from: a */
        View m10209a() {
            return (View) this.f9635a;
        }

        @Override // androidx.appcompat.view.InterfaceC0773c
        /* JADX INFO: renamed from: c */
        public void mo3007c() {
            this.f9635a.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.InterfaceC0773c
        /* JADX INFO: renamed from: f */
        public void mo3008f() {
            this.f9635a.onActionViewCollapsed();
        }
    }

    /* JADX INFO: renamed from: i.c$c */
    private class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        private final MenuItem.OnActionExpandListener f9636a;

        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f9636a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f9636a.onMenuItemActionCollapse(MenuItemC2022c.this.m10202c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f9636a.onMenuItemActionExpand(MenuItemC2022c.this.m10202c(menuItem));
        }
    }

    /* JADX INFO: renamed from: i.c$d */
    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        private final MenuItem.OnMenuItemClickListener f9638a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f9638a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f9638a.onMenuItemClick(MenuItemC2022c.this.m10202c(menuItem));
        }
    }

    public MenuItemC2022c(Context context, InterfaceMenuItemC0029b interfaceMenuItemC0029b) {
        super(context);
        if (interfaceMenuItemC0029b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f9630d = interfaceMenuItemC0029b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f9630d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f9630d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0275b abstractC0275bMo80a = this.f9630d.mo80a();
        if (abstractC0275bMo80a instanceof a) {
            return ((a) abstractC0275bMo80a).f9633e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f9630d.getActionView();
        return actionView instanceof b ? ((b) actionView).m10209a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f9630d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f9630d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f9630d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f9630d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f9630d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f9630d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f9630d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f9630d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f9630d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f9630d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f9630d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f9630d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f9630d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m10203d(this.f9630d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f9630d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f9630d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f9630d.getTooltipText();
    }

    /* JADX INFO: renamed from: h */
    public void m10207h(boolean z2) {
        try {
            if (this.f9631e == null) {
                this.f9631e = this.f9630d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f9631e.invoke(this.f9630d, Boolean.valueOf(z2));
        } catch (Exception e3) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f9630d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f9630d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f9630d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f9630d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f9630d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f9630d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f9627a, actionProvider);
        InterfaceMenuItemC0029b interfaceMenuItemC0029b = this.f9630d;
        if (actionProvider == null) {
            aVar = null;
        }
        interfaceMenuItemC0029b.mo81b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f9630d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3) {
        this.f9630d.setAlphabeticShortcut(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f9630d.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f9630d.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f9630d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f9630d.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f9630d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9630d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9630d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f9630d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3) {
        this.f9630d.setNumericShortcut(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9630d.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9630d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4) {
        this.f9630d.setShortcut(c3, c4);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i3) {
        this.f9630d.setShowAsAction(i3);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i3) {
        this.f9630d.setShowAsActionFlags(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9630d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9630d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f9630d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        return this.f9630d.setVisible(z2);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3, int i3) {
        this.f9630d.setAlphabeticShortcut(c3, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i3) {
        this.f9630d.setIcon(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3, int i3) {
        this.f9630d.setNumericShortcut(c3, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f9630d.setShortcut(c3, c4, i3, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i3) {
        this.f9630d.setTitle(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i3) {
        this.f9630d.setActionView(i3);
        View actionView = this.f9630d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f9630d.setActionView(new b(actionView));
        }
        return this;
    }
}
