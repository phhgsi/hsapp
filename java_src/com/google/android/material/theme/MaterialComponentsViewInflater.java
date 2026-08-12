package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0770z;
import androidx.appcompat.widget.C0824B;
import androidx.appcompat.widget.C0883c;
import androidx.appcompat.widget.C0887e;
import androidx.appcompat.widget.C0889f;
import androidx.appcompat.widget.C0915u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.C1633w;
import p064V0.C0552a;
import p085b1.C1300a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0770z {
    @Override // androidx.appcompat.app.C0770z
    /* JADX INFO: renamed from: c */
    protected C0883c mo2981c(Context context, AttributeSet attributeSet) {
        return new C1633w(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0770z
    /* JADX INFO: renamed from: d */
    protected C0887e mo2982d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0770z
    /* JADX INFO: renamed from: e */
    protected C0889f mo2983e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0770z
    /* JADX INFO: renamed from: k */
    protected C0915u mo2989k(Context context, AttributeSet attributeSet) {
        return new C0552a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0770z
    /* JADX INFO: renamed from: o */
    protected C0824B mo2993o(Context context, AttributeSet attributeSet) {
        return new C1300a(context, attributeSet);
    }
}
