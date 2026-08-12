package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.AbstractC0984e;
import p027J.AbstractC0268W;
import p091d.AbstractC1769j;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: androidx.appcompat.widget.p */
/* JADX INFO: loaded from: classes.dex */
public class C0909p {

    /* JADX INFO: renamed from: a */
    private final ImageView f3748a;

    /* JADX INFO: renamed from: b */
    private C0884c0 f3749b;

    /* JADX INFO: renamed from: c */
    private C0884c0 f3750c;

    /* JADX INFO: renamed from: d */
    private C0884c0 f3751d;

    /* JADX INFO: renamed from: e */
    private int f3752e = 0;

    public C0909p(ImageView imageView) {
        this.f3748a = imageView;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3865a(Drawable drawable) {
        if (this.f3751d == null) {
            this.f3751d = new C0884c0();
        }
        C0884c0 c0884c0 = this.f3751d;
        c0884c0.m3751a();
        ColorStateList colorStateListM4368a = AbstractC0984e.m4368a(this.f3748a);
        if (colorStateListM4368a != null) {
            c0884c0.f3643d = true;
            c0884c0.f3640a = colorStateListM4368a;
        }
        PorterDuff.Mode modeM4369b = AbstractC0984e.m4369b(this.f3748a);
        if (modeM4369b != null) {
            c0884c0.f3642c = true;
            c0884c0.f3641b = modeM4369b;
        }
        if (!c0884c0.f3643d && !c0884c0.f3642c) {
            return false;
        }
        C0897j.m3816i(drawable, c0884c0, this.f3748a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: l */
    private boolean m3866l() {
        return this.f3749b != null;
    }

    /* JADX INFO: renamed from: b */
    void m3867b() {
        if (this.f3748a.getDrawable() != null) {
            this.f3748a.getDrawable().setLevel(this.f3752e);
        }
    }

    /* JADX INFO: renamed from: c */
    void m3868c() {
        Drawable drawable = this.f3748a.getDrawable();
        if (drawable != null) {
            AbstractC0836M.m3451b(drawable);
        }
        if (drawable != null) {
            if (m3866l() && m3865a(drawable)) {
                return;
            }
            C0884c0 c0884c0 = this.f3750c;
            if (c0884c0 != null) {
                C0897j.m3816i(drawable, c0884c0, this.f3748a.getDrawableState());
                return;
            }
            C0884c0 c0884c02 = this.f3749b;
            if (c0884c02 != null) {
                C0897j.m3816i(drawable, c0884c02, this.f3748a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    ColorStateList m3869d() {
        C0884c0 c0884c0 = this.f3750c;
        if (c0884c0 != null) {
            return c0884c0.f3640a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    PorterDuff.Mode m3870e() {
        C0884c0 c0884c0 = this.f3750c;
        if (c0884c0 != null) {
            return c0884c0.f3641b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    boolean m3871f() {
        return !(this.f3748a.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: g */
    public void m3872g(AttributeSet attributeSet, int i3) {
        int iM3779n;
        Context context = this.f3748a.getContext();
        int[] iArr = AbstractC1769j.f8951P;
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, iArr, i3, 0);
        ImageView imageView = this.f3748a;
        AbstractC0268W.m771g0(imageView, imageView.getContext(), iArr, attributeSet, c0888e0M3765v.m3783r(), i3, 0);
        try {
            Drawable drawable = this.f3748a.getDrawable();
            if (drawable == null && (iM3779n = c0888e0M3765v.m3779n(AbstractC1769j.f8956Q, -1)) != -1 && (drawable = AbstractC1832a.m9609b(this.f3748a.getContext(), iM3779n)) != null) {
                this.f3748a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0836M.m3451b(drawable);
            }
            int i4 = AbstractC1769j.f8961R;
            if (c0888e0M3765v.m3784s(i4)) {
                AbstractC0984e.m4370c(this.f3748a, c0888e0M3765v.m3768c(i4));
            }
            int i5 = AbstractC1769j.f8966S;
            if (c0888e0M3765v.m3784s(i5)) {
                AbstractC0984e.m4371d(this.f3748a, AbstractC0836M.m3454e(c0888e0M3765v.m3776k(i5, -1), null));
            }
            c0888e0M3765v.m3786x();
        } catch (Throwable th) {
            c0888e0M3765v.m3786x();
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    void m3873h(Drawable drawable) {
        this.f3752e = drawable.getLevel();
    }

    /* JADX INFO: renamed from: i */
    public void m3874i(int i3) {
        if (i3 != 0) {
            Drawable drawableM9609b = AbstractC1832a.m9609b(this.f3748a.getContext(), i3);
            if (drawableM9609b != null) {
                AbstractC0836M.m3451b(drawableM9609b);
            }
            this.f3748a.setImageDrawable(drawableM9609b);
        } else {
            this.f3748a.setImageDrawable(null);
        }
        m3868c();
    }

    /* JADX INFO: renamed from: j */
    void m3875j(ColorStateList colorStateList) {
        if (this.f3750c == null) {
            this.f3750c = new C0884c0();
        }
        C0884c0 c0884c0 = this.f3750c;
        c0884c0.f3640a = colorStateList;
        c0884c0.f3643d = true;
        m3868c();
    }

    /* JADX INFO: renamed from: k */
    void m3876k(PorterDuff.Mode mode) {
        if (this.f3750c == null) {
            this.f3750c = new C0884c0();
        }
        C0884c0 c0884c0 = this.f3750c;
        c0884c0.f3641b = mode;
        c0884c0.f3642c = true;
        m3868c();
    }
}
