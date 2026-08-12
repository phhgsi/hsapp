package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: G */
    protected boolean f5480G;

    /* JADX INFO: renamed from: H */
    private CharSequence f5481H;

    /* JADX INFO: renamed from: I */
    private CharSequence f5482I;

    /* JADX INFO: renamed from: J */
    private boolean f5483J;

    /* JADX INFO: renamed from: K */
    private boolean f5484K;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: D */
    public boolean mo5208D() {
        return (this.f5484K ? this.f5480G : !this.f5480G) || super.mo5208D();
    }

    /* JADX INFO: renamed from: F */
    public boolean m5265F() {
        return this.f5480G;
    }

    /* JADX INFO: renamed from: G */
    public void m5266G(boolean z2) {
        boolean z3 = this.f5480G != z2;
        if (z3 || !this.f5483J) {
            this.f5480G = z2;
            this.f5483J = true;
            m5248z(z2);
            if (z3) {
                mo5244s(mo5208D());
                mo5207r();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m5267H(boolean z2) {
        this.f5484K = z2;
    }

    /* JADX INFO: renamed from: I */
    public void m5268I(CharSequence charSequence) {
        this.f5482I = charSequence;
        if (m5265F()) {
            return;
        }
        mo5207r();
    }

    /* JADX INFO: renamed from: J */
    public void m5269J(CharSequence charSequence) {
        this.f5481H = charSequence;
        if (m5265F()) {
            mo5207r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m5270K(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f5480G
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f5481H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f5481H
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f5480G
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f5482I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f5482I
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.mo5221l()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.m5270K(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: t */
    protected void mo5204t() {
        super.mo5204t();
        boolean z2 = !m5265F();
        if (m5228a(Boolean.valueOf(z2))) {
            m5266G(z2);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: v */
    protected Object mo5210v(TypedArray typedArray, int i3) {
        return Boolean.valueOf(typedArray.getBoolean(i3, false));
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
