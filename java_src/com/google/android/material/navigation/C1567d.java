package com.google.android.material.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0788g;
import p016F0.AbstractC0146g;

/* JADX INFO: renamed from: com.google.android.material.navigation.d */
/* JADX INFO: loaded from: classes.dex */
public class C1567d extends FrameLayout implements InterfaceC1573j {

    /* JADX INFO: renamed from: a */
    private boolean f7853a;

    /* JADX INFO: renamed from: b */
    boolean f7854b;

    /* JADX INFO: renamed from: c */
    private boolean f7855c;

    C1567d(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(AbstractC0146g.f519j, (ViewGroup) this, true);
        m8554a();
    }

    /* JADX INFO: renamed from: a */
    public void m8554a() {
        setVisibility((!this.f7855c || (!this.f7853a && this.f7854b)) ? 8 : 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: d */
    public boolean mo3047d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: e */
    public void mo3048e(C0788g c0788g, int i3) {
        m8554a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    public C0788g getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setDividersEnabled(boolean z2) {
        this.f7855c = z2;
        m8554a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
    }

    @Override // com.google.android.material.navigation.InterfaceC1573j
    public void setExpanded(boolean z2) {
        this.f7853a = z2;
        m8554a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // com.google.android.material.navigation.InterfaceC1573j
    public void setOnlyShowWhenExpanded(boolean z2) {
        this.f7854b = z2;
        m8554a();
    }

    public void setTitle(CharSequence charSequence) {
    }
}
