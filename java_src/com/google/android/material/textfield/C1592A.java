package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0824B;
import androidx.appcompat.widget.C0888e0;
import androidx.core.widget.AbstractC0988i;
import com.google.android.material.internal.AbstractC1549t;
import com.google.android.material.internal.CheckableImageButton;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;
import p016F0.AbstractC0150k;
import p030K.C0356y;
import p067W0.AbstractC0557c;

/* JADX INFO: renamed from: com.google.android.material.textfield.A */
/* JADX INFO: loaded from: classes.dex */
class C1592A extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final TextInputLayout f8052a;

    /* JADX INFO: renamed from: b */
    private final TextView f8053b;

    /* JADX INFO: renamed from: c */
    private CharSequence f8054c;

    /* JADX INFO: renamed from: d */
    private final CheckableImageButton f8055d;

    /* JADX INFO: renamed from: e */
    private ColorStateList f8056e;

    /* JADX INFO: renamed from: f */
    private PorterDuff.Mode f8057f;

    /* JADX INFO: renamed from: g */
    private int f8058g;

    /* JADX INFO: renamed from: h */
    private ImageView.ScaleType f8059h;

    /* JADX INFO: renamed from: i */
    private View.OnLongClickListener f8060i;

    /* JADX INFO: renamed from: j */
    private boolean f8061j;

    C1592A(TextInputLayout textInputLayout, C0888e0 c0888e0) {
        super(textInputLayout.getContext());
        this.f8052a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(AbstractC0146g.f518i, (ViewGroup) this, false);
        this.f8055d = checkableImageButton;
        AbstractC1631u.m8979e(checkableImageButton);
        C0824B c0824b = new C0824B(getContext());
        this.f8053b = c0824b;
        m8717j(c0888e0);
        m8716i(c0888e0);
        addView(checkableImageButton);
        addView(c0824b);
    }

    /* JADX INFO: renamed from: C */
    private void m8715C() {
        int i3 = (this.f8054c == null || this.f8061j) ? 8 : 0;
        setVisibility((this.f8055d.getVisibility() == 0 || i3 == 0) ? 0 : 8);
        this.f8053b.setVisibility(i3);
        this.f8052a.m8830p0();
    }

    /* JADX INFO: renamed from: i */
    private void m8716i(C0888e0 c0888e0) {
        this.f8053b.setVisibility(8);
        this.f8053b.setId(AbstractC0144e.f478W);
        this.f8053b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f8053b.setAccessibilityLiveRegion(1);
        m8732o(c0888e0.m3779n(AbstractC0150k.f818Y7, 0));
        int i3 = AbstractC0150k.f827Z7;
        if (c0888e0.m3784s(i3)) {
            m8733p(c0888e0.m3768c(i3));
        }
        m8731n(c0888e0.m3781p(AbstractC0150k.f809X7));
    }

    /* JADX INFO: renamed from: j */
    private void m8717j(C0888e0 c0888e0) {
        if (AbstractC0557c.m2087k(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f8055d.getLayoutParams()).setMarginEnd(0);
        }
        m8738u(null);
        m8739v(null);
        int i3 = AbstractC0150k.f887f8;
        if (c0888e0.m3784s(i3)) {
            this.f8056e = AbstractC0557c.m2078b(getContext(), c0888e0, i3);
        }
        int i4 = AbstractC0150k.f897g8;
        if (c0888e0.m3784s(i4)) {
            this.f8057f = AbstractC1549t.m8503h(c0888e0.m3776k(i4, -1), null);
        }
        int i5 = AbstractC0150k.f857c8;
        if (c0888e0.m3784s(i5)) {
            m8736s(c0888e0.m3772g(i5));
            int i6 = AbstractC0150k.f847b8;
            if (c0888e0.m3784s(i6)) {
                m8735r(c0888e0.m3781p(i6));
            }
            m8734q(c0888e0.m3766a(AbstractC0150k.f837a8, true));
        }
        m8737t(c0888e0.m3771f(AbstractC0150k.f867d8, getResources().getDimensionPixelSize(AbstractC0142c.f426q0)));
        int i7 = AbstractC0150k.f877e8;
        if (c0888e0.m3784s(i7)) {
            m8740w(AbstractC1631u.m8976b(c0888e0.m3776k(i7, -1)));
        }
    }

    /* JADX INFO: renamed from: A */
    void m8718A(C0356y c0356y) {
        if (this.f8053b.getVisibility() != 0) {
            c0356y.m1251S0(this.f8055d);
        } else {
            c0356y.m1223D0(this.f8053b);
            c0356y.m1251S0(this.f8053b);
        }
    }

    /* JADX INFO: renamed from: B */
    void m8719B() {
        EditText editText = this.f8052a.f8102e;
        if (editText == null) {
            return;
        }
        this.f8053b.setPaddingRelative(m8728k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(AbstractC0142c.f386T), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: a */
    CharSequence m8720a() {
        return this.f8054c;
    }

    /* JADX INFO: renamed from: b */
    ColorStateList m8721b() {
        return this.f8053b.getTextColors();
    }

    /* JADX INFO: renamed from: c */
    int m8722c() {
        return getPaddingStart() + this.f8053b.getPaddingStart() + (m8728k() ? this.f8055d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f8055d.getLayoutParams()).getMarginEnd() : 0);
    }

    /* JADX INFO: renamed from: d */
    TextView m8723d() {
        return this.f8053b;
    }

    /* JADX INFO: renamed from: e */
    CharSequence m8724e() {
        return this.f8055d.getContentDescription();
    }

    /* JADX INFO: renamed from: f */
    Drawable m8725f() {
        return this.f8055d.getDrawable();
    }

    /* JADX INFO: renamed from: g */
    int m8726g() {
        return this.f8058g;
    }

    /* JADX INFO: renamed from: h */
    ImageView.ScaleType m8727h() {
        return this.f8059h;
    }

    /* JADX INFO: renamed from: k */
    boolean m8728k() {
        return this.f8055d.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: l */
    void m8729l(boolean z2) {
        this.f8061j = z2;
        m8715C();
    }

    /* JADX INFO: renamed from: m */
    void m8730m() {
        AbstractC1631u.m8978d(this.f8052a, this.f8055d, this.f8056e);
    }

    /* JADX INFO: renamed from: n */
    void m8731n(CharSequence charSequence) {
        this.f8054c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8053b.setText(charSequence);
        m8715C();
    }

    /* JADX INFO: renamed from: o */
    void m8732o(int i3) {
        AbstractC0988i.m4394m(this.f8053b, i3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        m8719B();
    }

    /* JADX INFO: renamed from: p */
    void m8733p(ColorStateList colorStateList) {
        this.f8053b.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: q */
    void m8734q(boolean z2) {
        this.f8055d.setCheckable(z2);
    }

    /* JADX INFO: renamed from: r */
    void m8735r(CharSequence charSequence) {
        if (m8724e() != charSequence) {
            this.f8055d.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: s */
    void m8736s(Drawable drawable) {
        this.f8055d.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC1631u.m8975a(this.f8052a, this.f8055d, this.f8056e, this.f8057f);
            m8743z(true);
            m8730m();
        } else {
            m8743z(false);
            m8738u(null);
            m8739v(null);
            m8735r(null);
        }
    }

    /* JADX INFO: renamed from: t */
    void m8737t(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i3 != this.f8058g) {
            this.f8058g = i3;
            AbstractC1631u.m8981g(this.f8055d, i3);
        }
    }

    /* JADX INFO: renamed from: u */
    void m8738u(View.OnClickListener onClickListener) {
        AbstractC1631u.m8982h(this.f8055d, onClickListener, this.f8060i);
    }

    /* JADX INFO: renamed from: v */
    void m8739v(View.OnLongClickListener onLongClickListener) {
        this.f8060i = onLongClickListener;
        AbstractC1631u.m8983i(this.f8055d, onLongClickListener);
    }

    /* JADX INFO: renamed from: w */
    void m8740w(ImageView.ScaleType scaleType) {
        this.f8059h = scaleType;
        AbstractC1631u.m8984j(this.f8055d, scaleType);
    }

    /* JADX INFO: renamed from: x */
    void m8741x(ColorStateList colorStateList) {
        if (this.f8056e != colorStateList) {
            this.f8056e = colorStateList;
            AbstractC1631u.m8975a(this.f8052a, this.f8055d, colorStateList, this.f8057f);
        }
    }

    /* JADX INFO: renamed from: y */
    void m8742y(PorterDuff.Mode mode) {
        if (this.f8057f != mode) {
            this.f8057f = mode;
            AbstractC1631u.m8975a(this.f8052a, this.f8055d, this.f8056e, mode);
        }
    }

    /* JADX INFO: renamed from: z */
    void m8743z(boolean z2) {
        if (m8728k() != z2) {
            this.f8055d.setVisibility(z2 ? 0 : 8);
            m8719B();
            m8715C();
        }
    }
}
