package p111i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.C0929i;
import p003B.InterfaceMenuItemC0029b;

/* JADX INFO: renamed from: i.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2021b {

    /* JADX INFO: renamed from: a */
    final Context f9627a;

    /* JADX INFO: renamed from: b */
    private C0929i f9628b;

    /* JADX INFO: renamed from: c */
    private C0929i f9629c;

    AbstractC2021b(Context context) {
        this.f9627a = context;
    }

    /* JADX INFO: renamed from: c */
    final MenuItem m10202c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0029b)) {
            return menuItem;
        }
        InterfaceMenuItemC0029b interfaceMenuItemC0029b = (InterfaceMenuItemC0029b) menuItem;
        if (this.f9628b == null) {
            this.f9628b = new C0929i();
        }
        MenuItem menuItem2 = (MenuItem) this.f9628b.get(interfaceMenuItemC0029b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC2022c menuItemC2022c = new MenuItemC2022c(this.f9627a, interfaceMenuItemC0029b);
        this.f9628b.put(interfaceMenuItemC0029b, menuItemC2022c);
        return menuItemC2022c;
    }

    /* JADX INFO: renamed from: e */
    final void m10204e() {
        C0929i c0929i = this.f9628b;
        if (c0929i != null) {
            c0929i.clear();
        }
        C0929i c0929i2 = this.f9629c;
        if (c0929i2 != null) {
            c0929i2.clear();
        }
    }

    /* JADX INFO: renamed from: f */
    final void m10205f(int i3) {
        if (this.f9628b == null) {
            return;
        }
        int i4 = 0;
        while (i4 < this.f9628b.size()) {
            if (((InterfaceMenuItemC0029b) this.f9628b.m3944f(i4)).getGroupId() == i3) {
                this.f9628b.m3946h(i4);
                i4--;
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: g */
    final void m10206g(int i3) {
        if (this.f9628b == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f9628b.size(); i4++) {
            if (((InterfaceMenuItemC0029b) this.f9628b.m3944f(i4)).getItemId() == i3) {
                this.f9628b.m3946h(i4);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    final SubMenu m10203d(SubMenu subMenu) {
        return subMenu;
    }
}
