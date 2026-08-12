package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0788g;
import androidx.core.widget.AbstractC0988i;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;

/* JADX INFO: renamed from: com.google.android.material.navigation.m */
/* JADX INFO: loaded from: classes.dex */
public class C1576m extends FrameLayout implements InterfaceC1573j {

    /* JADX INFO: renamed from: a */
    private final TextView f7981a;

    /* JADX INFO: renamed from: b */
    private boolean f7982b;

    /* JADX INFO: renamed from: c */
    boolean f7983c;

    /* JADX INFO: renamed from: d */
    private C0788g f7984d;

    /* JADX INFO: renamed from: e */
    private ColorStateList f7985e;

    C1576m(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(AbstractC0146g.f520k, (ViewGroup) this, true);
        this.f7981a = (TextView) findViewById(AbstractC0144e.f468M);
    }

    /* JADX INFO: renamed from: a */
    private void m8614a() {
        C0788g c0788g = this.f7984d;
        if (c0788g != null) {
            setVisibility((!c0788g.isVisible() || (!this.f7982b && this.f7983c)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: d */
    public boolean mo3047d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: e */
    public void mo3048e(C0788g c0788g, int i3) {
        this.f7984d = c0788g;
        c0788g.setCheckable(false);
        this.f7981a.setText(c0788g.getTitle());
        m8614a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    public C0788g getItemData() {
        return this.f7984d;
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
    }

    @Override // com.google.android.material.navigation.InterfaceC1573j
    public void setExpanded(boolean z2) {
        this.f7982b = z2;
        m8614a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // com.google.android.material.navigation.InterfaceC1573j
    public void setOnlyShowWhenExpanded(boolean z2) {
        this.f7983c = z2;
        m8614a();
    }

    public void setTextAppearance(int i3) {
        AbstractC0988i.m4394m(this.f7981a, i3);
        ColorStateList colorStateList = this.f7985e;
        if (colorStateList != null) {
            this.f7981a.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7985e = colorStateList;
        if (colorStateList != null) {
            this.f7981a.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
    }
}
