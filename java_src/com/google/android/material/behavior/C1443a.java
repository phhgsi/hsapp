package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: com.google.android.material.behavior.a */
/* JADX INFO: loaded from: classes.dex */
final class C1443a extends AbstractC1446d {
    C1443a() {
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: a */
    int mo7571a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: b */
    int mo7572b() {
        return 0;
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: c */
    int mo7573c() {
        return 1;
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: d */
    ViewPropertyAnimator mo7574d(View view, int i3) {
        return view.animate().translationY(i3);
    }

    @Override // com.google.android.material.behavior.AbstractC1446d
    /* JADX INFO: renamed from: e */
    void mo7575e(View view, int i3) {
        view.setTranslationY(i3);
    }
}
