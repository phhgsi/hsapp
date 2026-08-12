package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.InterfaceC0791j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.navigation.i */
/* JADX INFO: loaded from: classes.dex */
public class C1572i {

    /* JADX INFO: renamed from: a */
    private final C0786e f7925a;

    /* JADX INFO: renamed from: c */
    private int f7927c = 0;

    /* JADX INFO: renamed from: d */
    private int f7928d = 0;

    /* JADX INFO: renamed from: e */
    private int f7929e = 0;

    /* JADX INFO: renamed from: b */
    private final List f7926b = new ArrayList();

    C1572i(C0786e c0786e) {
        this.f7925a = c0786e;
        m8597f();
    }

    /* JADX INFO: renamed from: a */
    public int m8592a() {
        return this.f7927c;
    }

    /* JADX INFO: renamed from: b */
    public MenuItem m8593b(int i3) {
        return (MenuItem) this.f7926b.get(i3);
    }

    /* JADX INFO: renamed from: c */
    public int m8594c() {
        return this.f7928d;
    }

    /* JADX INFO: renamed from: d */
    public int m8595d() {
        return this.f7929e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m8596e(MenuItem menuItem, InterfaceC0791j interfaceC0791j, int i3) {
        return this.f7925a.m3137P(menuItem, interfaceC0791j, i3);
    }

    /* JADX INFO: renamed from: f */
    public void m8597f() {
        this.f7926b.clear();
        this.f7927c = 0;
        this.f7928d = 0;
        this.f7929e = 0;
        for (int i3 = 0; i3 < this.f7925a.size(); i3++) {
            MenuItem item = this.f7925a.getItem(i3);
            if (item.hasSubMenu()) {
                if (!this.f7926b.isEmpty()) {
                    if (!(this.f7926b.get(r3.size() - 1) instanceof MenuItemC1564a) && item.isVisible()) {
                        this.f7926b.add(new MenuItemC1564a());
                    }
                }
                this.f7926b.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i4 = 0; i4 < subMenu.size(); i4++) {
                    MenuItem item2 = subMenu.getItem(i4);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.f7926b.add(item2);
                    this.f7927c++;
                    if (item2.isVisible()) {
                        this.f7928d++;
                    }
                }
                this.f7926b.add(new MenuItemC1564a());
            } else {
                this.f7926b.add(item);
                this.f7927c++;
                if (item.isVisible()) {
                    this.f7928d++;
                    this.f7929e++;
                }
            }
        }
        if (this.f7926b.isEmpty()) {
            return;
        }
        if (this.f7926b.get(r0.size() - 1) instanceof MenuItemC1564a) {
            this.f7926b.remove(r0.size() - 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public int m8598g() {
        return this.f7926b.size();
    }
}
