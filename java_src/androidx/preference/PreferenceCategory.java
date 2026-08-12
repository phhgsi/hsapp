package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import p075Z.AbstractC0625c;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: D */
    public boolean mo5208D() {
        return !super.mo5242p();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: p */
    public boolean mo5242p() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2541n.m12162a(context, AbstractC0625c.f2043e, R.attr.preferenceCategoryStyle));
    }
}
