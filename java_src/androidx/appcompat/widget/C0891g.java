package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.AbstractC0988i;
import androidx.core.widget.InterfaceC0991l;
import p091d.AbstractC1760a;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: androidx.appcompat.widget.g */
/* JADX INFO: loaded from: classes.dex */
public class C0891g extends CheckedTextView implements InterfaceC0991l {

    /* JADX INFO: renamed from: a */
    private final C0893h f3662a;

    /* JADX INFO: renamed from: b */
    private final C0885d f3663b;

    /* JADX INFO: renamed from: c */
    private final C0795A f3664c;

    /* JADX INFO: renamed from: d */
    private C0903m f3665d;

    public C0891g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8715p);
    }

    private C0903m getEmojiTextViewHelper() {
        if (this.f3665d == null) {
            this.f3665d = new C0903m(this);
        }
        return this.f3665d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0795A c0795a = this.f3664c;
        if (c0795a != null) {
            c0795a.m3230b();
        }
        C0885d c0885d = this.f3663b;
        if (c0885d != null) {
            c0885d.m3754b();
        }
        C0893h c0893h = this.f3662a;
        if (c0893h != null) {
            c0893h.m3787a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0988i.m4396o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0885d c0885d = this.f3663b;
        if (c0885d != null) {
            return c0885d.m3755c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885d c0885d = this.f3663b;
        if (c0885d != null) {
            return c0885d.m3756d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0893h c0893h = this.f3662a;
        if (c0893h != null) {
            return c0893h.m3788b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0893h c0893h = this.f3662a;
        if (c0893h != null) {
            return c0893h.m3789c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3664c.m3237j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3664c.m3238k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC0905n.m3856a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m3844d(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885d c0885d = this.f3663b;
        if (c0885d != null) {
            c0885d.m3758f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0885d c0885d = this.f3663b;
        if (c0885d != null) {
            c0885d.m3759g(i3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0893h c0893h = this.f3662a;
        if (c0893h != null) {
            c0893h.m3791e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3664c;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3664c;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0988i.m4397p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m3845e(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0885d c0885d = this.f3663b;
        if (c0885d != null) {
            c0885d.m3761i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0885d c0885d = this.f3663b;
        if (c0885d != null) {
            c0885d.m3762j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0893h c0893h = this.f3662a;
        if (c0893h != null) {
            c0893h.m3792f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0893h c0893h = this.f3662a;
        if (c0893h != null) {
            c0893h.m3793g(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3664c.m3250w(colorStateList);
        this.f3664c.m3230b();
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3664c.m3251x(mode);
        this.f3664c.m3230b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0795A c0795a = this.f3664c;
        if (c0795a != null) {
            c0795a.m3244q(context, i3);
        }
    }

    public C0891g(Context context, AttributeSet attributeSet, int i3) {
        super(C0882b0.m3749b(context), attributeSet, i3);
        AbstractC0880a0.m3741a(this, getContext());
        C0795A c0795a = new C0795A(this);
        this.f3664c = c0795a;
        c0795a.m3240m(attributeSet, i3);
        c0795a.m3230b();
        C0885d c0885d = new C0885d(this);
        this.f3663b = c0885d;
        c0885d.m3757e(attributeSet, i3);
        C0893h c0893h = new C0893h(this);
        this.f3662a = c0893h;
        c0893h.m3790d(attributeSet, i3);
        getEmojiTextViewHelper().m3843c(attributeSet, i3);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i3) {
        setCheckMarkDrawable(AbstractC1832a.m9609b(getContext(), i3));
    }
}
