package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.widget.InterfaceC0991l;
import p091d.AbstractC1760a;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: androidx.appcompat.widget.r */
/* JADX INFO: loaded from: classes.dex */
public class C0912r extends MultiAutoCompleteTextView implements InterfaceC0991l {

    /* JADX INFO: renamed from: d */
    private static final int[] f3759d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    private final C0885d f3760a;

    /* JADX INFO: renamed from: b */
    private final C0795A f3761b;

    /* JADX INFO: renamed from: c */
    private final C0901l f3762c;

    public C0912r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8712m);
    }

    /* JADX INFO: renamed from: a */
    void m3881a(C0901l c0901l) {
        KeyListener keyListener = getKeyListener();
        if (c0901l.m3837b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM3836a = c0901l.m3836a(keyListener);
            if (keyListenerM3836a == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM3836a);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0885d c0885d = this.f3760a;
        if (c0885d != null) {
            c0885d.m3754b();
        }
        C0795A c0795a = this.f3761b;
        if (c0795a != null) {
            c0795a.m3230b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0885d c0885d = this.f3760a;
        if (c0885d != null) {
            return c0885d.m3755c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885d c0885d = this.f3760a;
        if (c0885d != null) {
            return c0885d.m3756d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3761b.m3237j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3761b.m3238k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f3762c.m3839d(AbstractC0905n.m3856a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885d c0885d = this.f3760a;
        if (c0885d != null) {
            c0885d.m3758f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0885d c0885d = this.f3760a;
        if (c0885d != null) {
            c0885d.m3759g(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3761b;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3761b;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(AbstractC1832a.m9609b(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3762c.m3840e(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3762c.m3836a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0885d c0885d = this.f3760a;
        if (c0885d != null) {
            c0885d.m3761i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0885d c0885d = this.f3760a;
        if (c0885d != null) {
            c0885d.m3762j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3761b.m3250w(colorStateList);
        this.f3761b.m3230b();
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3761b.m3251x(mode);
        this.f3761b.m3230b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0795A c0795a = this.f3761b;
        if (c0795a != null) {
            c0795a.m3244q(context, i3);
        }
    }

    public C0912r(Context context, AttributeSet attributeSet, int i3) {
        super(C0882b0.m3749b(context), attributeSet, i3);
        AbstractC0880a0.m3741a(this, getContext());
        C0888e0 c0888e0M3765v = C0888e0.m3765v(getContext(), attributeSet, f3759d, i3, 0);
        if (c0888e0M3765v.m3784s(0)) {
            setDropDownBackgroundDrawable(c0888e0M3765v.m3772g(0));
        }
        c0888e0M3765v.m3786x();
        C0885d c0885d = new C0885d(this);
        this.f3760a = c0885d;
        c0885d.m3757e(attributeSet, i3);
        C0795A c0795a = new C0795A(this);
        this.f3761b = c0795a;
        c0795a.m3240m(attributeSet, i3);
        c0795a.m3230b();
        C0901l c0901l = new C0901l(this);
        this.f3762c = c0901l;
        c0901l.m3838c(attributeSet, i3);
        m3881a(c0901l);
    }
}
