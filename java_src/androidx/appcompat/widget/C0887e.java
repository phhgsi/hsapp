package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.AbstractC0988i;
import androidx.core.widget.InterfaceC0991l;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: androidx.appcompat.widget.e */
/* JADX INFO: loaded from: classes.dex */
public class C0887e extends Button implements InterfaceC0991l {

    /* JADX INFO: renamed from: a */
    private final C0885d f3651a;

    /* JADX INFO: renamed from: b */
    private final C0795A f3652b;

    /* JADX INFO: renamed from: c */
    private C0903m f3653c;

    public C0887e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8713n);
    }

    private C0903m getEmojiTextViewHelper() {
        if (this.f3653c == null) {
            this.f3653c = new C0903m(this);
        }
        return this.f3653c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0885d c0885d = this.f3651a;
        if (c0885d != null) {
            c0885d.m3754b();
        }
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            c0795a.m3230b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0910p0.f3755c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            return c0795a.m3232e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0910p0.f3755c) {
            return super.getAutoSizeMinTextSize();
        }
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            return c0795a.m3233f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0910p0.f3755c) {
            return super.getAutoSizeStepGranularity();
        }
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            return c0795a.m3234g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0910p0.f3755c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0795A c0795a = this.f3652b;
        return c0795a != null ? c0795a.m3235h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC0910p0.f3755c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            return c0795a.m3236i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0988i.m4396o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0885d c0885d = this.f3651a;
        if (c0885d != null) {
            return c0885d.m3755c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885d c0885d = this.f3651a;
        if (c0885d != null) {
            return c0885d.m3756d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3652b.m3237j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3652b.m3238k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            c0795a.m3242o(z2, i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C0795A c0795a = this.f3652b;
        if (c0795a == null || AbstractC0910p0.f3755c || !c0795a.m3239l()) {
            return;
        }
        this.f3652b.m3231c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m3844d(z2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (AbstractC0910p0.f3755c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            c0795a.m3247t(i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (AbstractC0910p0.f3755c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            c0795a.m3248u(iArr, i3);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (AbstractC0910p0.f3755c) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            c0795a.m3249v(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885d c0885d = this.f3651a;
        if (c0885d != null) {
            c0885d.m3758f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0885d c0885d = this.f3651a;
        if (c0885d != null) {
            c0885d.m3759g(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0988i.m4397p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m3845e(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m3841a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            c0795a.m3246s(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0885d c0885d = this.f3651a;
        if (c0885d != null) {
            c0885d.m3761i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0885d c0885d = this.f3651a;
        if (c0885d != null) {
            c0885d.m3762j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3652b.m3250w(colorStateList);
        this.f3652b.m3230b();
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3652b.m3251x(mode);
        this.f3652b.m3230b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            c0795a.m3244q(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i3, float f3) {
        if (AbstractC0910p0.f3755c) {
            super.setTextSize(i3, f3);
            return;
        }
        C0795A c0795a = this.f3652b;
        if (c0795a != null) {
            c0795a.m3229A(i3, f3);
        }
    }

    public C0887e(Context context, AttributeSet attributeSet, int i3) {
        super(C0882b0.m3749b(context), attributeSet, i3);
        AbstractC0880a0.m3741a(this, getContext());
        C0885d c0885d = new C0885d(this);
        this.f3651a = c0885d;
        c0885d.m3757e(attributeSet, i3);
        C0795A c0795a = new C0795A(this);
        this.f3652b = c0795a;
        c0795a.m3240m(attributeSet, i3);
        c0795a.m3230b();
        getEmojiTextViewHelper().m3843c(attributeSet, i3);
    }
}
