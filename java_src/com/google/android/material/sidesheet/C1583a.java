package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.google.android.material.sidesheet.a */
/* JADX INFO: loaded from: classes.dex */
final class C1583a extends AbstractC1585c {

    /* JADX INFO: renamed from: a */
    final SideSheetBehavior f8023a;

    C1583a(SideSheetBehavior sideSheetBehavior) {
        this.f8023a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: a */
    int mo8682a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: b */
    float mo8683b(int i3) {
        float fMo8686e = mo8686e();
        return (i3 - fMo8686e) / (mo8685d() - fMo8686e);
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: c */
    int mo8684c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: d */
    int mo8685d() {
        return Math.max(0, this.f8023a.m8673m0() + this.f8023a.m8671k0());
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: e */
    int mo8686e() {
        return (-this.f8023a.m8666d0()) - this.f8023a.m8671k0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: f */
    int mo8687f() {
        return this.f8023a.m8671k0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: g */
    int mo8688g() {
        return -this.f8023a.m8666d0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: h */
    int mo8689h(View view) {
        return view.getRight() + this.f8023a.m8671k0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: i */
    public int mo8690i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: j */
    int mo8691j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: k */
    boolean mo8692k(float f3) {
        return f3 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: l */
    boolean mo8693l(View view) {
        return view.getRight() < (mo8685d() - mo8686e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: m */
    boolean mo8694m(float f3, float f4) {
        return AbstractC1586d.m8698a(f3, f4) && Math.abs(f3) > ((float) this.f8023a.m8675o0());
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: n */
    boolean mo8695n(View view, float f3) {
        return Math.abs(((float) view.getLeft()) + (f3 * this.f8023a.m8669i0())) > this.f8023a.m8670j0();
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: o */
    void mo8696o(ViewGroup.MarginLayoutParams marginLayoutParams, int i3) {
        marginLayoutParams.leftMargin = i3;
    }

    @Override // com.google.android.material.sidesheet.AbstractC1585c
    /* JADX INFO: renamed from: p */
    void mo8697p(ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4) {
        if (i3 <= this.f8023a.m8674n0()) {
            marginLayoutParams.leftMargin = i4;
        }
    }
}
