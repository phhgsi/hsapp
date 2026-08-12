package p111i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p003B.InterfaceMenuC0028a;

/* JADX INFO: renamed from: i.d */
/* JADX INFO: loaded from: classes.dex */
public class MenuC2023d extends AbstractC2021b implements Menu {

    /* JADX INFO: renamed from: d */
    private final InterfaceMenuC0028a f9640d;

    public MenuC2023d(Context context, InterfaceMenuC0028a interfaceMenuC0028a) {
        super(context);
        if (interfaceMenuC0028a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f9640d = interfaceMenuC0028a;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m10202c(this.f9640d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f9640d.addIntentOptions(i3, i4, i5, componentName, intentArr, intent, i6, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                menuItemArr[i7] = m10202c(menuItemArr2[i7]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m10203d(this.f9640d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m10204e();
        this.f9640d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f9640d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i3) {
        return m10202c(this.f9640d.findItem(i3));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i3) {
        return m10202c(this.f9640d.getItem(i3));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f9640d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return this.f9640d.isShortcutKey(i3, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i3, int i4) {
        return this.f9640d.performIdentifierAction(i3, i4);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        return this.f9640d.performShortcut(i3, keyEvent, i4);
    }

    @Override // android.view.Menu
    public void removeGroup(int i3) {
        m10205f(i3);
        this.f9640d.removeGroup(i3);
    }

    @Override // android.view.Menu
    public void removeItem(int i3) {
        m10206g(i3);
        this.f9640d.removeItem(i3);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i3, boolean z2, boolean z3) {
        this.f9640d.setGroupCheckable(i3, z2, z3);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i3, boolean z2) {
        this.f9640d.setGroupEnabled(i3, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i3, boolean z2) {
        this.f9640d.setGroupVisible(i3, z2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f9640d.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f9640d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i3) {
        return m10202c(this.f9640d.add(i3));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i3) {
        return m10203d(this.f9640d.addSubMenu(i3));
    }

    @Override // android.view.Menu
    public MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return m10202c(this.f9640d.add(i3, i4, i5, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        return m10203d(this.f9640d.addSubMenu(i3, i4, i5, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i3, int i4, int i5, int i6) {
        return m10202c(this.f9640d.add(i3, i4, i5, i6));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return m10203d(this.f9640d.addSubMenu(i3, i4, i5, i6));
    }
}
