package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.widget.AbstractC0981b;
import p000A.AbstractC0000a;
import p027J.AbstractC0268W;
import p091d.AbstractC1769j;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: androidx.appcompat.widget.h */
/* JADX INFO: loaded from: classes.dex */
class C0893h {

    /* JADX INFO: renamed from: a */
    private final CheckedTextView f3667a;

    /* JADX INFO: renamed from: b */
    private ColorStateList f3668b = null;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f3669c = null;

    /* JADX INFO: renamed from: d */
    private boolean f3670d = false;

    /* JADX INFO: renamed from: e */
    private boolean f3671e = false;

    /* JADX INFO: renamed from: f */
    private boolean f3672f;

    C0893h(CheckedTextView checkedTextView) {
        this.f3667a = checkedTextView;
    }

    /* JADX INFO: renamed from: a */
    void m3787a() {
        Drawable drawableM4345a = AbstractC0981b.m4345a(this.f3667a);
        if (drawableM4345a != null) {
            if (this.f3670d || this.f3671e) {
                Drawable drawableMutate = AbstractC0000a.m17r(drawableM4345a).mutate();
                if (this.f3670d) {
                    AbstractC0000a.m14o(drawableMutate, this.f3668b);
                }
                if (this.f3671e) {
                    AbstractC0000a.m15p(drawableMutate, this.f3669c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f3667a.getDrawableState());
                }
                this.f3667a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    ColorStateList m3788b() {
        return this.f3668b;
    }

    /* JADX INFO: renamed from: c */
    PorterDuff.Mode m3789c() {
        return this.f3669c;
    }

    /* JADX INFO: renamed from: d */
    void m3790d(AttributeSet attributeSet, int i3) {
        int i4;
        int iM3779n;
        int iM3779n2;
        Context context = this.f3667a.getContext();
        int[] iArr = AbstractC1769j.f8952P0;
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, iArr, i3, 0);
        CheckedTextView checkedTextView = this.f3667a;
        AbstractC0268W.m771g0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, c0888e0M3765v.m3783r(), i3, 0);
        try {
            int i5 = AbstractC1769j.f8962R0;
            if (!c0888e0M3765v.m3784s(i5) || (iM3779n2 = c0888e0M3765v.m3779n(i5, 0)) == 0) {
                i4 = AbstractC1769j.f8957Q0;
                if (c0888e0M3765v.m3784s(i4) && (iM3779n = c0888e0M3765v.m3779n(i4, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f3667a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC1832a.m9609b(checkedTextView2.getContext(), iM3779n));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f3667a;
                    checkedTextView3.setCheckMarkDrawable(AbstractC1832a.m9609b(checkedTextView3.getContext(), iM3779n2));
                } catch (Resources.NotFoundException unused) {
                    i4 = AbstractC1769j.f8957Q0;
                    if (c0888e0M3765v.m3784s(i4)) {
                        CheckedTextView checkedTextView22 = this.f3667a;
                        checkedTextView22.setCheckMarkDrawable(AbstractC1832a.m9609b(checkedTextView22.getContext(), iM3779n));
                    }
                }
            }
            int i6 = AbstractC1769j.f8967S0;
            if (c0888e0M3765v.m3784s(i6)) {
                AbstractC0981b.m4346b(this.f3667a, c0888e0M3765v.m3768c(i6));
            }
            int i7 = AbstractC1769j.f8972T0;
            if (c0888e0M3765v.m3784s(i7)) {
                AbstractC0981b.m4347c(this.f3667a, AbstractC0836M.m3454e(c0888e0M3765v.m3776k(i7, -1), null));
            }
            c0888e0M3765v.m3786x();
        } catch (Throwable th) {
            c0888e0M3765v.m3786x();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    void m3791e() {
        if (this.f3672f) {
            this.f3672f = false;
        } else {
            this.f3672f = true;
            m3787a();
        }
    }

    /* JADX INFO: renamed from: f */
    void m3792f(ColorStateList colorStateList) {
        this.f3668b = colorStateList;
        this.f3670d = true;
        m3787a();
    }

    /* JADX INFO: renamed from: g */
    void m3793g(PorterDuff.Mode mode) {
        this.f3669c = mode;
        this.f3671e = true;
        m3787a();
    }
}
