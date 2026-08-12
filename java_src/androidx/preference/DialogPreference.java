package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p075Z.AbstractC0625c;
import p075Z.AbstractC0629g;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: G */
    private CharSequence f5396G;

    /* JADX INFO: renamed from: H */
    private CharSequence f5397H;

    /* JADX INFO: renamed from: I */
    private Drawable f5398I;

    /* JADX INFO: renamed from: J */
    private CharSequence f5399J;

    /* JADX INFO: renamed from: K */
    private CharSequence f5400K;

    /* JADX INFO: renamed from: L */
    private int f5401L;

    public DialogPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2125i, i3, i4);
        String strM12176o = AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2145s, AbstractC0629g.f2127j);
        this.f5396G = strM12176o;
        if (strM12176o == null) {
            this.f5396G = m5240n();
        }
        this.f5397H = AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2143r, AbstractC0629g.f2129k);
        this.f5398I = AbstractC2541n.m12164c(typedArrayObtainStyledAttributes, AbstractC0629g.f2139p, AbstractC0629g.f2131l);
        this.f5399J = AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2149u, AbstractC0629g.f2133m);
        this.f5400K = AbstractC2541n.m12176o(typedArrayObtainStyledAttributes, AbstractC0629g.f2147t, AbstractC0629g.f2135n);
        this.f5401L = AbstractC2541n.m12175n(typedArrayObtainStyledAttributes, AbstractC0629g.f2141q, AbstractC0629g.f2137o, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: t */
    protected void mo5204t() {
        m5238k();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2541n.m12162a(context, AbstractC0625c.f2040b, R.attr.dialogPreferenceStyle));
    }
}
