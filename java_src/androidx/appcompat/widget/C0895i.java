package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.widget.AbstractC0982c;
import p000A.AbstractC0000a;
import p027J.AbstractC0268W;
import p091d.AbstractC1769j;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: androidx.appcompat.widget.i */
/* JADX INFO: loaded from: classes.dex */
class C0895i {

    /* JADX INFO: renamed from: a */
    private final CompoundButton f3674a;

    /* JADX INFO: renamed from: b */
    private ColorStateList f3675b = null;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f3676c = null;

    /* JADX INFO: renamed from: d */
    private boolean f3677d = false;

    /* JADX INFO: renamed from: e */
    private boolean f3678e = false;

    /* JADX INFO: renamed from: f */
    private boolean f3679f;

    C0895i(CompoundButton compoundButton) {
        this.f3674a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    void m3794a() {
        Drawable drawableM4350a = AbstractC0982c.m4350a(this.f3674a);
        if (drawableM4350a != null) {
            if (this.f3677d || this.f3678e) {
                Drawable drawableMutate = AbstractC0000a.m17r(drawableM4350a).mutate();
                if (this.f3677d) {
                    AbstractC0000a.m14o(drawableMutate, this.f3675b);
                }
                if (this.f3678e) {
                    AbstractC0000a.m15p(drawableMutate, this.f3676c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f3674a.getDrawableState());
                }
                this.f3674a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    ColorStateList m3795b() {
        return this.f3675b;
    }

    /* JADX INFO: renamed from: c */
    PorterDuff.Mode m3796c() {
        return this.f3676c;
    }

    /* JADX INFO: renamed from: d */
    void m3797d(AttributeSet attributeSet, int i3) {
        int i4;
        int iM3779n;
        int iM3779n2;
        Context context = this.f3674a.getContext();
        int[] iArr = AbstractC1769j.f8977U0;
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, iArr, i3, 0);
        CompoundButton compoundButton = this.f3674a;
        AbstractC0268W.m771g0(compoundButton, compoundButton.getContext(), iArr, attributeSet, c0888e0M3765v.m3783r(), i3, 0);
        try {
            int i5 = AbstractC1769j.f8987W0;
            if (!c0888e0M3765v.m3784s(i5) || (iM3779n2 = c0888e0M3765v.m3779n(i5, 0)) == 0) {
                i4 = AbstractC1769j.f8982V0;
                if (c0888e0M3765v.m3784s(i4) && (iM3779n = c0888e0M3765v.m3779n(i4, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f3674a;
                    compoundButton2.setButtonDrawable(AbstractC1832a.m9609b(compoundButton2.getContext(), iM3779n));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f3674a;
                    compoundButton3.setButtonDrawable(AbstractC1832a.m9609b(compoundButton3.getContext(), iM3779n2));
                } catch (Resources.NotFoundException unused) {
                    i4 = AbstractC1769j.f8982V0;
                    if (c0888e0M3765v.m3784s(i4)) {
                        CompoundButton compoundButton22 = this.f3674a;
                        compoundButton22.setButtonDrawable(AbstractC1832a.m9609b(compoundButton22.getContext(), iM3779n));
                    }
                }
            }
            int i6 = AbstractC1769j.f8992X0;
            if (c0888e0M3765v.m3784s(i6)) {
                AbstractC0982c.m4353d(this.f3674a, c0888e0M3765v.m3768c(i6));
            }
            int i7 = AbstractC1769j.f8997Y0;
            if (c0888e0M3765v.m3784s(i7)) {
                AbstractC0982c.m4354e(this.f3674a, AbstractC0836M.m3454e(c0888e0M3765v.m3776k(i7, -1), null));
            }
            c0888e0M3765v.m3786x();
        } catch (Throwable th) {
            c0888e0M3765v.m3786x();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    void m3798e() {
        if (this.f3679f) {
            this.f3679f = false;
        } else {
            this.f3679f = true;
            m3794a();
        }
    }

    /* JADX INFO: renamed from: f */
    void m3799f(ColorStateList colorStateList) {
        this.f3675b = colorStateList;
        this.f3677d = true;
        m3794a();
    }

    /* JADX INFO: renamed from: g */
    void m3800g(PorterDuff.Mode mode) {
        this.f3676c = mode;
        this.f3678e = true;
        m3794a();
    }
}
