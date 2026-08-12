package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p027J.AbstractC0268W;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.widget.d */
/* JADX INFO: loaded from: classes.dex */
class C0885d {

    /* JADX INFO: renamed from: a */
    private final View f3644a;

    /* JADX INFO: renamed from: d */
    private C0884c0 f3647d;

    /* JADX INFO: renamed from: e */
    private C0884c0 f3648e;

    /* JADX INFO: renamed from: f */
    private C0884c0 f3649f;

    /* JADX INFO: renamed from: c */
    private int f3646c = -1;

    /* JADX INFO: renamed from: b */
    private final C0897j f3645b = C0897j.m3813b();

    C0885d(View view) {
        this.f3644a = view;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3752a(Drawable drawable) {
        if (this.f3649f == null) {
            this.f3649f = new C0884c0();
        }
        C0884c0 c0884c0 = this.f3649f;
        c0884c0.m3751a();
        ColorStateList colorStateListM790q = AbstractC0268W.m790q(this.f3644a);
        if (colorStateListM790q != null) {
            c0884c0.f3643d = true;
            c0884c0.f3640a = colorStateListM790q;
        }
        PorterDuff.Mode modeM792r = AbstractC0268W.m792r(this.f3644a);
        if (modeM792r != null) {
            c0884c0.f3642c = true;
            c0884c0.f3641b = modeM792r;
        }
        if (!c0884c0.f3643d && !c0884c0.f3642c) {
            return false;
        }
        C0897j.m3816i(drawable, c0884c0, this.f3644a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: k */
    private boolean m3753k() {
        return this.f3647d != null;
    }

    /* JADX INFO: renamed from: b */
    void m3754b() {
        Drawable background = this.f3644a.getBackground();
        if (background != null) {
            if (m3753k() && m3752a(background)) {
                return;
            }
            C0884c0 c0884c0 = this.f3648e;
            if (c0884c0 != null) {
                C0897j.m3816i(background, c0884c0, this.f3644a.getDrawableState());
                return;
            }
            C0884c0 c0884c02 = this.f3647d;
            if (c0884c02 != null) {
                C0897j.m3816i(background, c0884c02, this.f3644a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    ColorStateList m3755c() {
        C0884c0 c0884c0 = this.f3648e;
        if (c0884c0 != null) {
            return c0884c0.f3640a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    PorterDuff.Mode m3756d() {
        C0884c0 c0884c0 = this.f3648e;
        if (c0884c0 != null) {
            return c0884c0.f3641b;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    void m3757e(AttributeSet attributeSet, int i3) {
        Context context = this.f3644a.getContext();
        int[] iArr = AbstractC1769j.f9000Y3;
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, iArr, i3, 0);
        View view = this.f3644a;
        AbstractC0268W.m771g0(view, view.getContext(), iArr, attributeSet, c0888e0M3765v.m3783r(), i3, 0);
        try {
            int i4 = AbstractC1769j.f9005Z3;
            if (c0888e0M3765v.m3784s(i4)) {
                this.f3646c = c0888e0M3765v.m3779n(i4, -1);
                ColorStateList colorStateListM3819f = this.f3645b.m3819f(this.f3644a.getContext(), this.f3646c);
                if (colorStateListM3819f != null) {
                    m3760h(colorStateListM3819f);
                }
            }
            int i5 = AbstractC1769j.f9011a4;
            if (c0888e0M3765v.m3784s(i5)) {
                AbstractC0268W.m783m0(this.f3644a, c0888e0M3765v.m3768c(i5));
            }
            int i6 = AbstractC1769j.f9017b4;
            if (c0888e0M3765v.m3784s(i6)) {
                AbstractC0268W.m785n0(this.f3644a, AbstractC0836M.m3454e(c0888e0M3765v.m3776k(i6, -1), null));
            }
            c0888e0M3765v.m3786x();
        } catch (Throwable th) {
            c0888e0M3765v.m3786x();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    void m3758f(Drawable drawable) {
        this.f3646c = -1;
        m3760h(null);
        m3754b();
    }

    /* JADX INFO: renamed from: g */
    void m3759g(int i3) {
        this.f3646c = i3;
        C0897j c0897j = this.f3645b;
        m3760h(c0897j != null ? c0897j.m3819f(this.f3644a.getContext(), i3) : null);
        m3754b();
    }

    /* JADX INFO: renamed from: h */
    void m3760h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3647d == null) {
                this.f3647d = new C0884c0();
            }
            C0884c0 c0884c0 = this.f3647d;
            c0884c0.f3640a = colorStateList;
            c0884c0.f3643d = true;
        } else {
            this.f3647d = null;
        }
        m3754b();
    }

    /* JADX INFO: renamed from: i */
    void m3761i(ColorStateList colorStateList) {
        if (this.f3648e == null) {
            this.f3648e = new C0884c0();
        }
        C0884c0 c0884c0 = this.f3648e;
        c0884c0.f3640a = colorStateList;
        c0884c0.f3643d = true;
        m3754b();
    }

    /* JADX INFO: renamed from: j */
    void m3762j(PorterDuff.Mode mode) {
        if (this.f3648e == null) {
            this.f3648e = new C0884c0();
        }
        C0884c0 c0884c0 = this.f3648e;
        c0884c0.f3641b = mode;
        c0884c0.f3642c = true;
        m3754b();
    }
}
