package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import p030K.C0356y;

/* JADX INFO: renamed from: com.google.android.material.textfield.t */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1630t {

    /* JADX INFO: renamed from: a */
    final TextInputLayout f8225a;

    /* JADX INFO: renamed from: b */
    final C1629s f8226b;

    /* JADX INFO: renamed from: c */
    final Context f8227c;

    /* JADX INFO: renamed from: d */
    final CheckableImageButton f8228d;

    AbstractC1630t(C1629s c1629s) {
        this.f8225a = c1629s.f8195a;
        this.f8226b = c1629s;
        this.f8227c = c1629s.getContext();
        this.f8228d = c1629s.m8960r();
    }

    /* JADX INFO: renamed from: a */
    void mo8848a(Editable editable) {
    }

    /* JADX INFO: renamed from: b */
    void mo8973b(CharSequence charSequence, int i3, int i4, int i5) {
    }

    /* JADX INFO: renamed from: c */
    int mo8849c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    int mo8850d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    View.OnFocusChangeListener mo8851e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    View.OnClickListener mo8852f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    View.OnFocusChangeListener mo8853g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    AccessibilityManager.TouchExplorationStateChangeListener mo8883h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    boolean mo8884i(int i3) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    boolean mo8885j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    boolean mo8886k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    boolean mo8887l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    boolean mo8888m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    void mo8854n(EditText editText) {
    }

    /* JADX INFO: renamed from: p */
    void mo8890p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: q */
    void mo8855q(boolean z2) {
    }

    /* JADX INFO: renamed from: r */
    final void m8974r() {
        this.f8226b.m8922L(false);
    }

    /* JADX INFO: renamed from: s */
    void mo8856s() {
    }

    /* JADX INFO: renamed from: t */
    boolean mo8891t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    void mo8857u() {
    }

    /* JADX INFO: renamed from: o */
    void mo8889o(View view, C0356y c0356y) {
    }
}
