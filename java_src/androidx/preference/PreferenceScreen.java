package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import p075Z.AbstractC0625c;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: O */
    private boolean f5457O;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC2541n.m12162a(context, AbstractC0625c.f2044f, R.attr.preferenceScreenStyle));
        this.f5457O = true;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: t */
    protected void mo5204t() {
        if (m5233f() == null && m5232e() == null && m5250G() != 0) {
            m5238k();
            throw null;
        }
    }
}
