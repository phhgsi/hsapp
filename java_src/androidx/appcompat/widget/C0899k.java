package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.AbstractC0988i;
import androidx.core.widget.C0989j;
import androidx.core.widget.InterfaceC0991l;
import p027J.AbstractC0268W;
import p027J.C0279d;
import p027J.InterfaceC0239H;
import p033L.AbstractC0362c;
import p033L.AbstractC0364e;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: androidx.appcompat.widget.k */
/* JADX INFO: loaded from: classes.dex */
public class C0899k extends EditText implements InterfaceC0239H, InterfaceC0991l {

    /* JADX INFO: renamed from: a */
    private final C0885d f3711a;

    /* JADX INFO: renamed from: b */
    private final C0795A f3712b;

    /* JADX INFO: renamed from: c */
    private final C0920z f3713c;

    /* JADX INFO: renamed from: d */
    private final C0989j f3714d;

    /* JADX INFO: renamed from: e */
    private final C0901l f3715e;

    /* JADX INFO: renamed from: f */
    private a f3716f;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$a */
    class a {
        a() {
        }

        /* JADX INFO: renamed from: a */
        public TextClassifier m3834a() {
            return C0899k.super.getTextClassifier();
        }

        /* JADX INFO: renamed from: b */
        public void m3835b(TextClassifier textClassifier) {
            C0899k.super.setTextClassifier(textClassifier);
        }
    }

    public C0899k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8684B);
    }

    private a getSuperCaller() {
        if (this.f3716f == null) {
            this.f3716f = new a();
        }
        return this.f3716f;
    }

    @Override // p027J.InterfaceC0239H
    /* JADX INFO: renamed from: a */
    public C0279d mo666a(C0279d c0279d) {
        return this.f3714d.mo664a(this, c0279d);
    }

    /* JADX INFO: renamed from: d */
    void m3833d(C0901l c0901l) {
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
        C0885d c0885d = this.f3711a;
        if (c0885d != null) {
            c0885d.m3754b();
        }
        C0795A c0795a = this.f3712b;
        if (c0795a != null) {
            c0795a.m3230b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0988i.m4396o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0885d c0885d = this.f3711a;
        if (c0885d != null) {
            return c0885d.m3755c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885d c0885d = this.f3711a;
        if (c0885d != null) {
            return c0885d.m3756d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3712b.m3237j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3712b.m3238k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0920z c0920z;
        return (Build.VERSION.SDK_INT >= 28 || (c0920z = this.f3713c) == null) ? getSuperCaller().m3834a() : c0920z.m3900a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM732B;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3712b.m3245r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionM3856a = AbstractC0905n.m3856a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionM3856a != null && Build.VERSION.SDK_INT <= 30 && (strArrM732B = AbstractC0268W.m732B(this)) != null) {
            AbstractC0362c.m1333d(editorInfo, strArrM732B);
            inputConnectionM3856a = AbstractC0364e.m1342c(this, inputConnectionM3856a, editorInfo);
        }
        return this.f3715e.m3839d(inputConnectionM3856a, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC0917w.m3890a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i3) {
        if (AbstractC0917w.m3891b(this, i3)) {
            return true;
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885d c0885d = this.f3711a;
        if (c0885d != null) {
            c0885d.m3758f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0885d c0885d = this.f3711a;
        if (c0885d != null) {
            c0885d.m3759g(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3712b;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3712b;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0988i.m4397p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3715e.m3840e(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3715e.m3836a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0885d c0885d = this.f3711a;
        if (c0885d != null) {
            c0885d.m3761i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0885d c0885d = this.f3711a;
        if (c0885d != null) {
            c0885d.m3762j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3712b.m3250w(colorStateList);
        this.f3712b.m3230b();
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3712b.m3251x(mode);
        this.f3712b.m3230b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0795A c0795a = this.f3712b;
        if (c0795a != null) {
            c0795a.m3244q(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0920z c0920z;
        if (Build.VERSION.SDK_INT >= 28 || (c0920z = this.f3713c) == null) {
            getSuperCaller().m3835b(textClassifier);
        } else {
            c0920z.m3901b(textClassifier);
        }
    }

    public C0899k(Context context, AttributeSet attributeSet, int i3) {
        super(C0882b0.m3749b(context), attributeSet, i3);
        AbstractC0880a0.m3741a(this, getContext());
        C0885d c0885d = new C0885d(this);
        this.f3711a = c0885d;
        c0885d.m3757e(attributeSet, i3);
        C0795A c0795a = new C0795A(this);
        this.f3712b = c0795a;
        c0795a.m3240m(attributeSet, i3);
        c0795a.m3230b();
        this.f3713c = new C0920z(this);
        this.f3714d = new C0989j();
        C0901l c0901l = new C0901l(this);
        this.f3715e = c0901l;
        c0901l.m3838c(attributeSet, i3);
        m3833d(c0901l);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
