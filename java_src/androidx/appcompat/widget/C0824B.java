package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0740E;
import androidx.core.widget.AbstractC0988i;
import androidx.core.widget.InterfaceC0991l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p021H.AbstractC0195m;
import p095e.AbstractC1832a;
import p167z.AbstractC2589v;

/* JADX INFO: renamed from: androidx.appcompat.widget.B */
/* JADX INFO: loaded from: classes.dex */
public class C0824B extends TextView implements InterfaceC0991l {

    /* JADX INFO: renamed from: a */
    private final C0885d f3249a;

    /* JADX INFO: renamed from: b */
    private final C0795A f3250b;

    /* JADX INFO: renamed from: c */
    private final C0920z f3251c;

    /* JADX INFO: renamed from: d */
    private C0903m f3252d;

    /* JADX INFO: renamed from: e */
    private boolean f3253e;

    /* JADX INFO: renamed from: f */
    private a f3254f;

    /* JADX INFO: renamed from: g */
    private Future f3255g;

    /* JADX INFO: renamed from: androidx.appcompat.widget.B$a */
    private interface a {
        /* JADX INFO: renamed from: a */
        void mo3373a(int[] iArr, int i3);

        /* JADX INFO: renamed from: b */
        void mo3374b(TextClassifier textClassifier);

        /* JADX INFO: renamed from: c */
        int[] mo3375c();

        /* JADX INFO: renamed from: d */
        void mo3376d(int i3);

        /* JADX INFO: renamed from: e */
        TextClassifier mo3377e();

        /* JADX INFO: renamed from: f */
        int mo3378f();

        /* JADX INFO: renamed from: g */
        void mo3379g(int i3, int i4, int i5, int i6);

        /* JADX INFO: renamed from: h */
        int mo3380h();

        /* JADX INFO: renamed from: i */
        int mo3381i();

        /* JADX INFO: renamed from: j */
        void mo3382j(int i3);

        /* JADX INFO: renamed from: k */
        int mo3383k();

        /* JADX INFO: renamed from: l */
        void mo3384l(int i3);

        /* JADX INFO: renamed from: m */
        void mo3385m(int i3, float f3);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.B$b */
    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: a */
        public void mo3373a(int[] iArr, int i3) {
            C0824B.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: b */
        public void mo3374b(TextClassifier textClassifier) {
            C0824B.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: c */
        public int[] mo3375c() {
            return C0824B.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: d */
        public void mo3376d(int i3) {
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: e */
        public TextClassifier mo3377e() {
            return C0824B.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: f */
        public int mo3378f() {
            return C0824B.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: g */
        public void mo3379g(int i3, int i4, int i5, int i6) {
            C0824B.super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: h */
        public int mo3380h() {
            return C0824B.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: i */
        public int mo3381i() {
            return C0824B.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: j */
        public void mo3382j(int i3) {
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: k */
        public int mo3383k() {
            return C0824B.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: l */
        public void mo3384l(int i3) {
            C0824B.super.setAutoSizeTextTypeWithDefaults(i3);
        }

        @Override // androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: m */
        public void mo3385m(int i3, float f3) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.B$c */
    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.C0824B.b, androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: d */
        public void mo3376d(int i3) {
            C0824B.super.setLastBaselineToBottomHeight(i3);
        }

        @Override // androidx.appcompat.widget.C0824B.b, androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: j */
        public void mo3382j(int i3) {
            C0824B.super.setFirstBaselineToTopHeight(i3);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.B$d */
    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.C0824B.b, androidx.appcompat.widget.C0824B.a
        /* JADX INFO: renamed from: m */
        public void mo3385m(int i3, float f3) {
            C0824B.super.setLineHeight(i3, f3);
        }
    }

    public C0824B(Context context) {
        this(context, null);
    }

    private C0903m getEmojiTextViewHelper() {
        if (this.f3252d == null) {
            this.f3252d = new C0903m(this);
        }
        return this.f3252d;
    }

    /* JADX INFO: renamed from: r */
    private void m3372r() {
        Future future = this.f3255g;
        if (future != null) {
            try {
                this.f3255g = null;
                AbstractC0740E.m2693a(future.get());
                AbstractC0988i.m4393l(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0885d c0885d = this.f3249a;
        if (c0885d != null) {
            c0885d.m3754b();
        }
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3230b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0910p0.f3755c) {
            return getSuperCaller().mo3378f();
        }
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            return c0795a.m3232e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0910p0.f3755c) {
            return getSuperCaller().mo3381i();
        }
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            return c0795a.m3233f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0910p0.f3755c) {
            return getSuperCaller().mo3383k();
        }
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            return c0795a.m3234g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0910p0.f3755c) {
            return getSuperCaller().mo3375c();
        }
        C0795A c0795a = this.f3250b;
        return c0795a != null ? c0795a.m3235h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC0910p0.f3755c) {
            return getSuperCaller().mo3380h() == 1 ? 1 : 0;
        }
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            return c0795a.m3236i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0988i.m4396o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return AbstractC0988i.m4382a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return AbstractC0988i.m4383b(this);
    }

    a getSuperCaller() {
        if (this.f3254f == null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                this.f3254f = new d();
            } else if (i3 >= 28) {
                this.f3254f = new c();
            } else if (i3 >= 26) {
                this.f3254f = new b();
            }
        }
        return this.f3254f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0885d c0885d = this.f3249a;
        if (c0885d != null) {
            return c0885d.m3755c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885d c0885d = this.f3249a;
        if (c0885d != null) {
            return c0885d.m3756d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3250b.m3237j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3250b.m3238k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m3372r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0920z c0920z;
        return (Build.VERSION.SDK_INT >= 28 || (c0920z = this.f3251c) == null) ? getSuperCaller().mo3377e() : c0920z.m3900a();
    }

    public AbstractC0195m.a getTextMetricsParamsCompat() {
        return AbstractC0988i.m4386e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3250b.m3245r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC0905n.m3856a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3242o(z2, i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i3, int i4) {
        m3372r();
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C0795A c0795a = this.f3250b;
        if (c0795a == null || AbstractC0910p0.f3755c || !c0795a.m3239l()) {
            return;
        }
        this.f3250b.m3231c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m3844d(z2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (AbstractC0910p0.f3755c) {
            getSuperCaller().mo3379g(i3, i4, i5, i6);
            return;
        }
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3247t(i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (AbstractC0910p0.f3755c) {
            getSuperCaller().mo3373a(iArr, i3);
            return;
        }
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3248u(iArr, i3);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (AbstractC0910p0.f3755c) {
            getSuperCaller().mo3384l(i3);
            return;
        }
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3249v(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885d c0885d = this.f3249a;
        if (c0885d != null) {
            c0885d.m3758f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0885d c0885d = this.f3249a;
        if (c0885d != null) {
            c0885d.m3759g(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0795A c0795a = this.f3250b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m3841a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo3382j(i3);
        } else {
            AbstractC0988i.m4389h(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo3376d(i3);
        } else {
            AbstractC0988i.m4390i(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        AbstractC0988i.m4391j(this, i3);
    }

    public void setPrecomputedText(AbstractC0195m abstractC0195m) {
        AbstractC0988i.m4393l(this, abstractC0195m);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0885d c0885d = this.f3249a;
        if (c0885d != null) {
            c0885d.m3761i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0885d c0885d = this.f3249a;
        if (c0885d != null) {
            c0885d.m3762j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3250b.m3250w(colorStateList);
        this.f3250b.m3230b();
    }

    @Override // androidx.core.widget.InterfaceC0991l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3250b.m3251x(mode);
        this.f3250b.m3230b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3244q(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0920z c0920z;
        if (Build.VERSION.SDK_INT >= 28 || (c0920z = this.f3251c) == null) {
            getSuperCaller().mo3374b(textClassifier);
        } else {
            c0920z.m3901b(textClassifier);
        }
    }

    public void setTextFuture(Future<AbstractC0195m> future) {
        this.f3255g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(AbstractC0195m.a aVar) {
        AbstractC0988i.m4395n(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i3, float f3) {
        if (AbstractC0910p0.f3755c) {
            super.setTextSize(i3, f3);
            return;
        }
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3229A(i3, f3);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i3) {
        if (this.f3253e) {
            return;
        }
        Typeface typefaceM12312a = (typeface == null || i3 <= 0) ? null : AbstractC2589v.m12312a(getContext(), typeface, i3);
        this.f3253e = true;
        if (typefaceM12312a != null) {
            typeface = typefaceM12312a;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f3253e = false;
        }
    }

    public C0824B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3, float f3) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo3385m(i3, f3);
        } else {
            AbstractC0988i.m4392k(this, i3, f3);
        }
    }

    public C0824B(Context context, AttributeSet attributeSet, int i3) {
        super(C0882b0.m3749b(context), attributeSet, i3);
        this.f3253e = false;
        this.f3254f = null;
        AbstractC0880a0.m3741a(this, getContext());
        C0885d c0885d = new C0885d(this);
        this.f3249a = c0885d;
        c0885d.m3757e(attributeSet, i3);
        C0795A c0795a = new C0795A(this);
        this.f3250b = c0795a;
        c0795a.m3240m(attributeSet, i3);
        c0795a.m3230b();
        this.f3251c = new C0920z(this);
        getEmojiTextViewHelper().m3843c(attributeSet, i3);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? AbstractC1832a.m9609b(context, i3) : null, i4 != 0 ? AbstractC1832a.m9609b(context, i4) : null, i5 != 0 ? AbstractC1832a.m9609b(context, i5) : null, i6 != 0 ? AbstractC1832a.m9609b(context, i6) : null);
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? AbstractC1832a.m9609b(context, i3) : null, i4 != 0 ? AbstractC1832a.m9609b(context, i4) : null, i5 != 0 ? AbstractC1832a.m9609b(context, i5) : null, i6 != 0 ? AbstractC1832a.m9609b(context, i6) : null);
        C0795A c0795a = this.f3250b;
        if (c0795a != null) {
            c0795a.m3243p();
        }
    }
}
