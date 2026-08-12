package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import p075Z.AbstractC0625c;
import p075Z.AbstractC0629g;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: L */
    private final C1147a f5394L;

    /* JADX INFO: renamed from: androidx.preference.CheckBoxPreference$a */
    private class C1147a implements CompoundButton.OnCheckedChangeListener {
        C1147a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (CheckBoxPreference.this.m5228a(Boolean.valueOf(z2))) {
                CheckBoxPreference.this.m5266G(z2);
            } else {
                compoundButton.setChecked(!z2);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    private void m5201L(View view) {
        boolean z2 = view instanceof CompoundButton;
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5480G);
        }
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f5394L);
        }
    }

    /* JADX INFO: renamed from: M */
    private void m5202M(View view) {
        if (((AccessibilityManager) m5230c().getSystemService("accessibility")).isEnabled()) {
            m5201L(view.findViewById(R.id.checkbox));
            m5270K(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: y */
    protected void mo5203y(View view) {
        super.mo5203y(view);
        m5202M(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f5394L = new C1147a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2107b, i3, i4);
        m5269J(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2123h, AbstractC0629g.f2110c));
        m5268I(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2121g, AbstractC0629g.f2113d));
        m5267H(AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, AbstractC0629g.f2119f, AbstractC0629g.f2116e, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2541n.m12162a(context, AbstractC0625c.f2039a, R.attr.checkBoxPreferenceStyle));
    }
}
