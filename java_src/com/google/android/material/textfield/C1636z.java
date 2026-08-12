package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import p016F0.AbstractC0143d;
import p016F0.AbstractC0148i;

/* JADX INFO: renamed from: com.google.android.material.textfield.z */
/* JADX INFO: loaded from: classes.dex */
class C1636z extends AbstractC1630t {

    /* JADX INFO: renamed from: e */
    private int f8276e;

    /* JADX INFO: renamed from: f */
    private EditText f8277f;

    /* JADX INFO: renamed from: g */
    private final View.OnClickListener f8278g;

    C1636z(C1629s c1629s, int i3) {
        super(c1629s);
        this.f8276e = AbstractC0143d.f445a;
        this.f8278g = new View.OnClickListener() { // from class: com.google.android.material.textfield.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1636z.m9046v(this.f8275a, view);
            }
        };
        if (i3 != 0) {
            this.f8276e = i3;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m9046v(C1636z c1636z, View view) {
        EditText editText = c1636z.f8277f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (c1636z.m9047w()) {
            c1636z.f8277f.setTransformationMethod(null);
        } else {
            c1636z.f8277f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            c1636z.f8277f.setSelection(selectionEnd);
        }
        c1636z.m8974r();
    }

    /* JADX INFO: renamed from: w */
    private boolean m9047w() {
        EditText editText = this.f8277f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* JADX INFO: renamed from: x */
    private static boolean m9048x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: b */
    void mo8973b(CharSequence charSequence, int i3, int i4, int i5) {
        m8974r();
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: c */
    int mo8849c() {
        return AbstractC0148i.f539C;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: d */
    int mo8850d() {
        return this.f8276e;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: f */
    View.OnClickListener mo8852f() {
        return this.f8278g;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: l */
    boolean mo8887l() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: m */
    boolean mo8888m() {
        return !m9047w();
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: n */
    void mo8854n(EditText editText) {
        this.f8277f = editText;
        m8974r();
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: s */
    void mo8856s() {
        if (m9048x(this.f8277f)) {
            this.f8277f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.AbstractC1630t
    /* JADX INFO: renamed from: u */
    void mo8857u() {
        EditText editText = this.f8277f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
