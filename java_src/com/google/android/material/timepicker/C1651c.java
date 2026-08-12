package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes.dex */
class C1651c implements InputFilter {

    /* JADX INFO: renamed from: a */
    private int f8341a;

    public C1651c(int i3) {
        this.f8341a = i3;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i5, i6, charSequence.subSequence(i3, i4).toString());
            if (Integer.parseInt(sb.toString()) <= this.f8341a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
