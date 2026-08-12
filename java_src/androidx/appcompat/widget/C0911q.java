package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.appcompat.widget.q */
/* JADX INFO: loaded from: classes.dex */
public class C0911q extends ImageView {

    /* JADX INFO: renamed from: a */
    private final C0885d f3756a;

    /* JADX INFO: renamed from: b */
    private final C0909p f3757b;

    /* JADX INFO: renamed from: c */
    private boolean f3758c;

    public C0911q(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0885d c0885d = this.f3756a;
        if (c0885d != null) {
            c0885d.m3754b();
        }
        C0909p c0909p = this.f3757b;
        if (c0909p != null) {
            c0909p.m3868c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0885d c0885d = this.f3756a;
        if (c0885d != null) {
            return c0885d.m3755c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885d c0885d = this.f3756a;
        if (c0885d != null) {
            return c0885d.m3756d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0909p c0909p = this.f3757b;
        if (c0909p != null) {
            return c0909p.m3869d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0909p c0909p = this.f3757b;
        if (c0909p != null) {
            return c0909p.m3870e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f3757b.m3871f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885d c0885d = this.f3756a;
        if (c0885d != null) {
            c0885d.m3758f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0885d c0885d = this.f3756a;
        if (c0885d != null) {
            c0885d.m3759g(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0909p c0909p = this.f3757b;
        if (c0909p != null) {
            c0909p.m3868c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0909p c0909p = this.f3757b;
        if (c0909p != null && drawable != null && !this.f3758c) {
            c0909p.m3873h(drawable);
        }
        super.setImageDrawable(drawable);
        C0909p c0909p2 = this.f3757b;
        if (c0909p2 != null) {
            c0909p2.m3868c();
            if (this.f3758c) {
                return;
            }
            this.f3757b.m3867b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f3758c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        C0909p c0909p = this.f3757b;
        if (c0909p != null) {
            c0909p.m3874i(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0909p c0909p = this.f3757b;
        if (c0909p != null) {
            c0909p.m3868c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0885d c0885d = this.f3756a;
        if (c0885d != null) {
            c0885d.m3761i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0885d c0885d = this.f3756a;
        if (c0885d != null) {
            c0885d.m3762j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0909p c0909p = this.f3757b;
        if (c0909p != null) {
            c0909p.m3875j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0909p c0909p = this.f3757b;
        if (c0909p != null) {
            c0909p.m3876k(mode);
        }
    }

    public C0911q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0911q(Context context, AttributeSet attributeSet, int i3) {
        super(C0882b0.m3749b(context), attributeSet, i3);
        this.f3758c = false;
        AbstractC0880a0.m3741a(this, getContext());
        C0885d c0885d = new C0885d(this);
        this.f3756a = c0885d;
        c0885d.m3757e(attributeSet, i3);
        C0909p c0909p = new C0909p(this);
        this.f3757b = c0909p;
        c0909p.m3872g(attributeSet, i3);
    }
}
