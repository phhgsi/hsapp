package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;

/* JADX INFO: renamed from: com.google.android.material.internal.h */
/* JADX INFO: loaded from: classes.dex */
public class C1537h extends C0786e {
    public C1537h(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0786e, android.view.Menu
    public SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        C0788g c0788g = (C0788g) mo3147a(i3, i4, i5, charSequence);
        C1539j c1539j = new C1539j(m3170w(), this, c0788g);
        c0788g.m3199x(c1539j);
        return c1539j;
    }
}
