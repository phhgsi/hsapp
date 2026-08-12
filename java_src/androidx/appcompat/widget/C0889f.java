package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.InterfaceC0990k;
import androidx.core.widget.InterfaceC0991l;
import p091d.AbstractC1760a;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: androidx.appcompat.widget.f */
/* JADX INFO: loaded from: classes.dex */
public class C0889f extends CheckBox implements InterfaceC0990k, InterfaceC0991l {

    /* JADX INFO: renamed from: a */
    private final C0895i f3657a;

    /* JADX INFO: renamed from: b */
    private final C0885d f3658b;

    /* JADX INFO: renamed from: c */
    private final C0795A f3659c;

    /* JADX INFO: renamed from: d */
    private C0903m f3660d;

    public C0889f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8714o);
    }

    private C0903m getEmojiTextViewHelper() {
        if (this.f3660d == null) {
            this.f3660d = new C0903m(this);
        }
        return this.f3660d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0885d c0885d = this.f3658b;
        if (c0885d != null) {
            c0885d.m3754b();
        }
        C0795A c0795a = this.f3659c;
        if (c0795a != null) {
            c0795a.m3230b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0885d c0885d = this.f3658b;
        if (c0885d != null) {
            return c0885d.m3755c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885d c0885d = this.f3658b;
        if (c0885d != null) {
            return c0885d.m3756d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0990k
    public ColorStateList getSupportButtonTintList() {
        C0895i c0895i = this.f3657a;
        if (c0895i != null) {
            return c0895i.m3795b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0895i c0895i = this.f3657a;
        if (c0895i != null) {
            return c0895i.m3796c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3659c.m3237j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3659c.m3238k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m3844d(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885d c0885d = this.f3658b;
        if (c0885d != null) {
            c0885d.m3758f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0885d c0885d = this.f3658b;
        if (c0885d != null) {
            c0885d.m3759g(i3);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0895i c0895i = this.f3657a;
        if (c0895i != null) {
            c0895i.m3798e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3659c;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3659c;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m3845e(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m3841a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0885d c0885d = this.f3658b;
        if (c0885d != null) {
            c0885d.m3761i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0885d c0885d = this.f3658b;
        if (c0885d != null) {
            c0885d.m3762j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0990k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0895i c0895i = this.f3657a;
        if (c0895i != null) {
            c0895i.m3799f(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0990k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0895i c0895i = this.f3657a;
        if (c0895i != null) {
            c0895i.m3800g(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3659c.m3250w(colorStateList);
        this.f3659c.m3230b();
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3659c.m3251x(mode);
        this.f3659c.m3230b();
    }

    public C0889f(Context context, AttributeSet attributeSet, int i3) {
        super(C0882b0.m3749b(context), attributeSet, i3);
        AbstractC0880a0.m3741a(this, getContext());
        C0895i c0895i = new C0895i(this);
        this.f3657a = c0895i;
        c0895i.m3797d(attributeSet, i3);
        C0885d c0885d = new C0885d(this);
        this.f3658b = c0885d;
        c0885d.m3757e(attributeSet, i3);
        C0795A c0795a = new C0795A(this);
        this.f3659c = c0795a;
        c0795a.m3240m(attributeSet, i3);
        getEmojiTextViewHelper().m3843c(attributeSet, i3);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(AbstractC1832a.m9609b(getContext(), i3));
    }
}
