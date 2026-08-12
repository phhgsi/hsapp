package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0786e;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.m */
/* JADX INFO: loaded from: classes.dex */
public class SubMenuC0794m extends C0786e implements SubMenu {

    /* JADX INFO: renamed from: B */
    private C0786e f3085B;

    /* JADX INFO: renamed from: C */
    private C0788g f3086C;

    public SubMenuC0794m(Context context, C0786e c0786e, C0788g c0788g) {
        super(context);
        this.f3085B = c0786e;
        this.f3086C = c0788g;
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: F */
    public C0786e mo3127F() {
        return this.f3085B.mo3127F();
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: I */
    public boolean mo3130I() {
        return this.f3085B.mo3130I();
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: J */
    public boolean mo3131J() {
        return this.f3085B.mo3131J();
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: K */
    public boolean mo3132K() {
        return this.f3085B.mo3132K();
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: W */
    public void mo3143W(C0786e.a aVar) {
        this.f3085B.mo3143W(aVar);
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: f */
    public boolean mo3156f(C0788g c0788g) {
        return this.f3085B.mo3156f(c0788g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f3086C;
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: h */
    boolean mo3158h(C0786e c0786e, MenuItem menuItem) {
        return super.mo3158h(c0786e, menuItem) || this.f3085B.mo3158h(c0786e, menuItem);
    }

    /* JADX INFO: renamed from: j0 */
    public Menu m3222j0() {
        return this.f3085B;
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: m */
    public boolean mo3161m(C0788g c0788g) {
        return this.f3085B.mo3161m(c0788g);
    }

    @Override // androidx.appcompat.view.menu.C0786e, android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3085B.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m3148a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m3153d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m3155e0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f3086C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0786e, android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f3085B.setQwertyMode(z2);
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: v */
    public String mo3169v() {
        C0788g c0788g = this.f3086C;
        int itemId = c0788g != null ? c0788g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo3169v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i3) {
        return (SubMenu) super.m3146Z(i3);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i3) {
        return (SubMenu) super.m3151c0(i3);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i3) {
        this.f3086C.setIcon(i3);
        return this;
    }
}
