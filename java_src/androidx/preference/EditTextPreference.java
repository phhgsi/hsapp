package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import p075Z.AbstractC0625c;
import p075Z.AbstractC0628f;
import p075Z.AbstractC0629g;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: M */
    private String f5407M;

    /* JADX INFO: renamed from: androidx.preference.EditTextPreference$a */
    public static final class C1149a implements Preference.InterfaceC1152b {

        /* JADX INFO: renamed from: a */
        private static C1149a f5408a;

        private C1149a() {
        }

        /* JADX INFO: renamed from: b */
        public static C1149a m5211b() {
            if (f5408a == null) {
                f5408a = new C1149a();
            }
            return f5408a;
        }

        @Override // androidx.preference.Preference.InterfaceC1152b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo5212a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.m5209F()) ? editTextPreference.m5230c().getString(AbstractC0628f.f2051a) : editTextPreference.m5209F();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2151v, i3, i4);
        int i5 = AbstractC0629g.f2153w;
        if (AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, i5, i5, false)) {
            m5226C(C1149a.m5211b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: D */
    public boolean mo5208D() {
        return TextUtils.isEmpty(this.f5407M) || super.mo5208D();
    }

    /* JADX INFO: renamed from: F */
    public String m5209F() {
        return this.f5407M;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: v */
    protected Object mo5210v(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2541n.m12162a(context, AbstractC0625c.f2042d, R.attr.editTextPreferenceStyle));
    }
}
