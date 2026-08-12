package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p075Z.AbstractC0625c;
import p075Z.AbstractC0626d;
import p075Z.AbstractC0629g;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: L */
    private final C1157a f5476L;

    /* JADX INFO: renamed from: M */
    private CharSequence f5477M;

    /* JADX INFO: renamed from: N */
    private CharSequence f5478N;

    /* JADX INFO: renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C1157a implements CompoundButton.OnCheckedChangeListener {
        C1157a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (SwitchPreferenceCompat.this.m5228a(Boolean.valueOf(z2))) {
                SwitchPreferenceCompat.this.m5266G(z2);
            } else {
                compoundButton.setChecked(!z2);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f5476L = new C1157a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2093U0, i3, i4);
        m5269J(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2112c1, AbstractC0629g.f2095V0));
        m5268I(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2109b1, AbstractC0629g.f2097W0));
        m5264M(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2118e1, AbstractC0629g.f2101Y0));
        m5263L(AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2115d1, AbstractC0629g.f2103Z0));
        m5267H(AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, AbstractC0629g.f2106a1, AbstractC0629g.f2099X0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    private void m5261N(View view) {
        boolean z2 = view instanceof SwitchCompat;
        if (z2) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5480G);
        }
        if (z2) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f5477M);
            switchCompat.setTextOff(this.f5478N);
            switchCompat.setOnCheckedChangeListener(this.f5476L);
        }
    }

    /* JADX INFO: renamed from: O */
    private void m5262O(View view) {
        if (((AccessibilityManager) m5230c().getSystemService("accessibility")).isEnabled()) {
            m5261N(view.findViewById(AbstractC0626d.f2049a));
            m5270K(view.findViewById(R.id.summary));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m5263L(CharSequence charSequence) {
        this.f5478N = charSequence;
        mo5207r();
    }

    /* JADX INFO: renamed from: M */
    public void m5264M(CharSequence charSequence) {
        this.f5477M = charSequence;
        mo5207r();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: y */
    protected void mo5203y(View view) {
        super.mo5203y(view);
        m5262O(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0625c.f2047i);
    }
}
