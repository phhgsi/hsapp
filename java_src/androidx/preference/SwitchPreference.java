package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import p075Z.AbstractC0625c;
import p075Z.AbstractC0629g;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: L */
    private final C1156a f5472L;

    /* JADX INFO: renamed from: M */
    private CharSequence f5473M;

    /* JADX INFO: renamed from: N */
    private CharSequence f5474N;

    /* JADX INFO: renamed from: androidx.preference.SwitchPreference$a */
    private class C1156a implements CompoundButton.OnCheckedChangeListener {
        C1156a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (SwitchPreference.this.m5228a(Boolean.valueOf(z2))) {
                SwitchPreference.this.m5266G(z2);
            } else {
                compoundButton.setChecked(!z2);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f5472L = new C1156a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2071J0, i3, i4);
        m5269J(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2087R0, AbstractC0629g.f2073K0));
        m5268I(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2085Q0, AbstractC0629g.f2075L0));
        m5260M(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2091T0, AbstractC0629g.f2079N0));
        m5259L(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2089S0, AbstractC0629g.f2081O0));
        m5267H(AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, AbstractC0629g.f2083P0, AbstractC0629g.f2077M0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    private void m5257N(View view) {
        boolean z2 = view instanceof Switch;
        if (z2) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5480G);
        }
        if (z2) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f5473M);
            r4.setTextOff(this.f5474N);
            r4.setOnCheckedChangeListener(this.f5472L);
        }
    }

    /* JADX INFO: renamed from: O */
    private void m5258O(View view) {
        if (((AccessibilityManager) m5230c().getSystemService("accessibility")).isEnabled()) {
            m5257N(view.findViewById(R.id.switch_widget));
            m5270K(view.findViewById(R.id.summary));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m5259L(CharSequence charSequence) {
        this.f5474N = charSequence;
        mo5207r();
    }

    /* JADX INFO: renamed from: M */
    public void m5260M(CharSequence charSequence) {
        this.f5473M = charSequence;
        mo5207r();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: y */
    protected void mo5203y(View view) {
        super.mo5203y(view);
        m5258O(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2541n.m12162a(context, AbstractC0625c.f2048j, R.attr.switchPreferenceStyle));
    }
}
