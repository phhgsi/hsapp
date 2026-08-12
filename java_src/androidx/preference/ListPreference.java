package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import p075Z.AbstractC0625c;
import p075Z.AbstractC0628f;
import p075Z.AbstractC0629g;
import p164y.AbstractC2541n;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: M */
    private CharSequence[] f5409M;

    /* JADX INFO: renamed from: N */
    private CharSequence[] f5410N;

    /* JADX INFO: renamed from: O */
    private String f5411O;

    /* JADX INFO: renamed from: P */
    private String f5412P;

    /* JADX INFO: renamed from: Q */
    private boolean f5413Q;

    /* JADX INFO: renamed from: androidx.preference.ListPreference$a */
    public static final class C1150a implements Preference.InterfaceC1152b {

        /* JADX INFO: renamed from: a */
        private static C1150a f5414a;

        private C1150a() {
        }

        /* JADX INFO: renamed from: b */
        public static C1150a m5222b() {
            if (f5414a == null) {
                f5414a = new C1150a();
            }
            return f5414a;
        }

        @Override // androidx.preference.Preference.InterfaceC1152b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo5212a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.m5217H()) ? listPreference.m5230c().getString(AbstractC0628f.f2051a) : listPreference.m5217H();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2155x, i3, i4);
        this.f5409M = AbstractC2541n.m12178q(typedArrayObtainStyledAttributes, AbstractC0629g.f2052A, AbstractC0629g.f2157y);
        this.f5410N = AbstractC2541n.m12178q(typedArrayObtainStyledAttributes, AbstractC0629g.f2054B, AbstractC0629g.f2159z);
        int i5 = AbstractC0629g.f2056C;
        if (AbstractC2541n.m12163b(typedArrayObtainStyledAttributes, i5, i5, false)) {
            m5226C(C1150a.m5222b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0629g.f2068I, i3, i4);
        this.f5412P = AbstractC2541n.m12176o(typedArrayObtainStyledAttributes2, AbstractC0629g.f2142q0, AbstractC0629g.f2084Q);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: K */
    private int m5214K() {
        return m5215F(this.f5411O);
    }

    /* JADX INFO: renamed from: F */
    public int m5215F(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f5410N) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f5410N[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public CharSequence[] m5216G() {
        return this.f5409M;
    }

    /* JADX INFO: renamed from: H */
    public CharSequence m5217H() {
        CharSequence[] charSequenceArr;
        int iM5214K = m5214K();
        if (iM5214K < 0 || (charSequenceArr = this.f5409M) == null) {
            return null;
        }
        return charSequenceArr[iM5214K];
    }

    /* JADX INFO: renamed from: I */
    public CharSequence[] m5218I() {
        return this.f5410N;
    }

    /* JADX INFO: renamed from: J */
    public String m5219J() {
        return this.f5411O;
    }

    /* JADX INFO: renamed from: L */
    public void m5220L(String str) {
        boolean zEquals = TextUtils.equals(this.f5411O, str);
        if (zEquals && this.f5413Q) {
            return;
        }
        this.f5411O = str;
        this.f5413Q = true;
        m5225B(str);
        if (zEquals) {
            return;
        }
        mo5207r();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: l */
    public CharSequence mo5221l() {
        if (m5239m() != null) {
            return m5239m().mo5212a(this);
        }
        CharSequence charSequenceM5217H = m5217H();
        CharSequence charSequenceMo5221l = super.mo5221l();
        String str = this.f5412P;
        if (str != null) {
            if (charSequenceM5217H == null) {
                charSequenceM5217H = "";
            }
            String str2 = String.format(str, charSequenceM5217H);
            if (!TextUtils.equals(str2, charSequenceMo5221l)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceMo5221l;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: v */
    protected Object mo5210v(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2541n.m12162a(context, AbstractC0625c.f2040b, R.attr.dialogPreferenceStyle));
    }
}
