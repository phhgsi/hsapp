package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.AbstractC1545p;
import com.google.android.material.internal.AbstractC1549t;
import com.google.android.material.textfield.TextInputLayout;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a */
    private final Chip f8279a;

    /* JADX INFO: renamed from: b */
    private final TextInputLayout f8280b;

    /* JADX INFO: renamed from: c */
    private final EditText f8281c;

    /* JADX INFO: renamed from: d */
    private TextWatcher f8282d;

    /* JADX INFO: renamed from: e */
    private TextView f8283e;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    private class C1638b extends AbstractC1545p {
        private C1638b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f8279a.setText(ChipTextInputComboView.this.m9051c("00"));
                return;
            }
            String strM9051c = ChipTextInputComboView.this.m9051c(editable);
            Chip chip = ChipTextInputComboView.this.f8279a;
            if (TextUtils.isEmpty(strM9051c)) {
                strM9051c = ChipTextInputComboView.this.m9051c("00");
            }
            chip.setText(strM9051c);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public String m9051c(CharSequence charSequence) {
        return TimeModel.m9083a(getResources(), charSequence);
    }

    /* JADX INFO: renamed from: d */
    private void m9052d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f8281c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f8279a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9052d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        this.f8279a.setChecked(z2);
        this.f8281c.setVisibility(z2 ? 0 : 4);
        this.f8279a.setVisibility(z2 ? 8 : 0);
        if (isChecked()) {
            AbstractC1549t.m8505j(this.f8281c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8279a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i3, Object obj) {
        this.f8279a.setTag(i3, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f8279a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(AbstractC0146g.f524o, (ViewGroup) this, false);
        this.f8279a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(AbstractC0146g.f525p, (ViewGroup) this, false);
        this.f8280b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f8281c = editText;
        editText.setVisibility(4);
        C1638b c1638b = new C1638b();
        this.f8282d = c1638b;
        editText.addTextChangedListener(c1638b);
        m9052d();
        addView(chip);
        addView(textInputLayout);
        this.f8283e = (TextView) findViewById(AbstractC0144e.f494n);
        editText.setId(View.generateViewId());
        this.f8283e.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
