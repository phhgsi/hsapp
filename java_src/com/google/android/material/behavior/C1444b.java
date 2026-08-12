package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: com.google.android.material.behavior.b */
/* JADX INFO: loaded from: classes.dex */
final class C1444b extends AbstractC1446d {
    C1444b() {
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: a */
    int mo7571a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: b */
    int mo7572b() {
        return 0;
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: c */
    int mo7573c() {
        return 2;
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: d */
    ViewPropertyAnimator mo7574d(View view, int i3) {
        return view.animate().translationX(-i3);
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: e */
    void mo7575e(View view, int i3) {
        view.setTranslationX(-i3);
    }
}
