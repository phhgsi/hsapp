package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;

/* JADX INFO: renamed from: com.google.android.material.navigation.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1571h extends C0786e {

    /* JADX INFO: renamed from: B */
    private final Class f7922B;

    /* JADX INFO: renamed from: C */
    private final int f7923C;

    /* JADX INFO: renamed from: D */
    private final boolean f7924D;

    public C1571h(Context context, Class cls, int i3, boolean z2) {
        super(context);
        this.f7922B = cls;
        this.f7923C = i3;
        this.f7924D = z2;
    }

    @Override // androidx.appcompat.view.menu.C0786e
    /* JADX INFO: renamed from: a */
    protected MenuItem mo3147a(int i3, int i4, int i5, CharSequence charSequence) {
        if (size() + 1 <= this.f7923C) {
            m3160i0();
            MenuItem menuItemMo3147a = super.mo3147a(i3, i4, i5, charSequence);
            m3159h0();
            return menuItemMo3147a;
        }
        String simpleName = this.f7922B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f7923C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.C0786e, android.view.Menu
    public SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        if (this.f7924D) {
            C0788g c0788g = (C0788g) mo3147a(i3, i4, i5, charSequence);
            C1575l c1575l = new C1575l(m3170w(), this, c0788g);
            c0788g.m3199x(c1575l);
            return c1575l;
        }
        throw new UnsupportedOperationException(this.f7922B.getSimpleName() + " does not support submenus");
    }
}
