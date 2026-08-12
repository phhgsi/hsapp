package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000A.AbstractC0000a;
import p027J.AbstractC0268W;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.widget.y */
/* JADX INFO: loaded from: classes.dex */
class C0919y extends C0914t {

    /* JADX INFO: renamed from: d */
    private final SeekBar f3774d;

    /* JADX INFO: renamed from: e */
    private Drawable f3775e;

    /* JADX INFO: renamed from: f */
    private ColorStateList f3776f;

    /* JADX INFO: renamed from: g */
    private PorterDuff.Mode f3777g;

    /* JADX INFO: renamed from: h */
    private boolean f3778h;

    /* JADX INFO: renamed from: i */
    private boolean f3779i;

    C0919y(SeekBar seekBar) {
        super(seekBar);
        this.f3776f = null;
        this.f3777g = null;
        this.f3778h = false;
        this.f3779i = false;
        this.f3774d = seekBar;
    }

    /* JADX INFO: renamed from: f */
    private void m3895f() {
        Drawable drawable = this.f3775e;
        if (drawable != null) {
            if (this.f3778h || this.f3779i) {
                Drawable drawableM17r = AbstractC0000a.m17r(drawable.mutate());
                this.f3775e = drawableM17r;
                if (this.f3778h) {
                    AbstractC0000a.m14o(drawableM17r, this.f3776f);
                }
                if (this.f3779i) {
                    AbstractC0000a.m15p(this.f3775e, this.f3777g);
                }
                if (this.f3775e.isStateful()) {
                    this.f3775e.setState(this.f3774d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C0914t
    /* JADX INFO: renamed from: c */
    void mo3887c(AttributeSet attributeSet, int i3) {
        super.mo3887c(attributeSet, i3);
        Context context = this.f3774d.getContext();
        int[] iArr = AbstractC1769j.f8971T;
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, iArr, i3, 0);
        SeekBar seekBar = this.f3774d;
        AbstractC0268W.m771g0(seekBar, seekBar.getContext(), iArr, attributeSet, c0888e0M3765v.m3783r(), i3, 0);
        Drawable drawableM3773h = c0888e0M3765v.m3773h(AbstractC1769j.f8976U);
        if (drawableM3773h != null) {
            this.f3774d.setThumb(drawableM3773h);
        }
        m3899j(c0888e0M3765v.m3772g(AbstractC1769j.f8981V));
        int i4 = AbstractC1769j.f8991X;
        if (c0888e0M3765v.m3784s(i4)) {
            this.f3777g = AbstractC0836M.m3454e(c0888e0M3765v.m3776k(i4, -1), this.f3777g);
            this.f3779i = true;
        }
        int i5 = AbstractC1769j.f8986W;
        if (c0888e0M3765v.m3784s(i5)) {
            this.f3776f = c0888e0M3765v.m3768c(i5);
            this.f3778h = true;
        }
        c0888e0M3765v.m3786x();
        m3895f();
    }

    /* JADX INFO: renamed from: g */
    void m3896g(Canvas canvas) {
        if (this.f3775e != null) {
            int max = this.f3774d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3775e.getIntrinsicWidth();
                int intrinsicHeight = this.f3775e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i4 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3775e.setBounds(-i3, -i4, i3, i4);
                float width = ((this.f3774d.getWidth() - this.f3774d.getPaddingLeft()) - this.f3774d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f3774d.getPaddingLeft(), this.f3774d.getHeight() / 2);
                for (int i5 = 0; i5 <= max; i5++) {
                    this.f3775e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    void m3897h() {
        Drawable drawable = this.f3775e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3774d.getDrawableState())) {
            this.f3774d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: i */
    void m3898i() {
        Drawable drawable = this.f3775e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: j */
    void m3899j(Drawable drawable) {
        Drawable drawable2 = this.f3775e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3775e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3774d);
            AbstractC0000a.m12m(drawable, this.f3774d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f3774d.getDrawableState());
            }
            m3895f();
        }
        this.f3774d.invalidate();
    }
}
