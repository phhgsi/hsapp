package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import p075Z.AbstractC0625c;
import p075Z.AbstractC0629g;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: M */
    private CharSequence[] f5415M;

    /* JADX INFO: renamed from: N */
    private CharSequence[] f5416N;

    /* JADX INFO: renamed from: O */
    private Set f5417O;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f5417O = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2058D, i3, i4);
        this.f5415M = AbstractC2541n.m12178q(typedArrayObtainStyledAttributes, AbstractC0629g.f2064G, AbstractC0629g.f2060E);
        this.f5416N = AbstractC2541n.m12178q(typedArrayObtainStyledAttributes, AbstractC0629g.f2066H, AbstractC0629g.f2062F);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: v */
    protected Object mo5210v(TypedArray typedArray, int i3) {
        CharSequence[] textArray = typedArray.getTextArray(i3);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2541n.m12162a(context, AbstractC0625c.f2040b, R.attr.dialogPreferenceStyle));
    }
}
