package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import p075Z.AbstractC0625c;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: R */
    private final Context f5402R;

    /* JADX INFO: renamed from: S */
    private final ArrayAdapter f5403S;

    /* JADX INFO: renamed from: T */
    private Spinner f5404T;

    /* JADX INFO: renamed from: U */
    private final AdapterView.OnItemSelectedListener f5405U;

    /* JADX INFO: renamed from: androidx.preference.DropDownPreference$a */
    class C1148a implements AdapterView.OnItemSelectedListener {
        C1148a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
            if (i3 >= 0) {
                String string = DropDownPreference.this.m5218I()[i3].toString();
                if (string.equals(DropDownPreference.this.m5219J()) || !DropDownPreference.this.m5228a(string)) {
                    return;
                }
                DropDownPreference.this.m5220L(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0625c.f2041c);
    }

    /* JADX INFO: renamed from: N */
    private void m5205N() {
        this.f5403S.clear();
        if (m5216G() != null) {
            for (CharSequence charSequence : m5216G()) {
                this.f5403S.add(charSequence.toString());
            }
        }
    }

    /* JADX INFO: renamed from: M */
    protected ArrayAdapter m5206M() {
        return new ArrayAdapter(this.f5402R, R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: r */
    protected void mo5207r() {
        super.mo5207r();
        ArrayAdapter arrayAdapter = this.f5403S;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: t */
    protected void mo5204t() {
        this.f5404T.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f5405U = new C1148a();
        this.f5402R = context;
        this.f5403S = m5206M();
        m5205N();
    }
}
