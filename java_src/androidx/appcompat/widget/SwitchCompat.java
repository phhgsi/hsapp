package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.AbstractC0988i;
import androidx.emoji2.text.C1015f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p000A.AbstractC0000a;
import p027J.AbstractC0268W;
import p091d.AbstractC1760a;
import p091d.AbstractC1767h;
import p091d.AbstractC1769j;
import p095e.AbstractC1832a;
import p107h.C1984a;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: S */
    private static final Property f3459S = new C0860a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: T */
    private static final int[] f3460T = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    private int f3461A;

    /* JADX INFO: renamed from: B */
    private int f3462B;

    /* JADX INFO: renamed from: C */
    private int f3463C;

    /* JADX INFO: renamed from: D */
    private int f3464D;

    /* JADX INFO: renamed from: E */
    private int f3465E;

    /* JADX INFO: renamed from: F */
    private int f3466F;

    /* JADX INFO: renamed from: G */
    private int f3467G;

    /* JADX INFO: renamed from: H */
    private boolean f3468H;

    /* JADX INFO: renamed from: I */
    private final TextPaint f3469I;

    /* JADX INFO: renamed from: J */
    private ColorStateList f3470J;

    /* JADX INFO: renamed from: K */
    private Layout f3471K;

    /* JADX INFO: renamed from: L */
    private Layout f3472L;

    /* JADX INFO: renamed from: M */
    private TransformationMethod f3473M;

    /* JADX INFO: renamed from: N */
    ObjectAnimator f3474N;

    /* JADX INFO: renamed from: O */
    private final C0795A f3475O;

    /* JADX INFO: renamed from: P */
    private C0903m f3476P;

    /* JADX INFO: renamed from: Q */
    private C0861b f3477Q;

    /* JADX INFO: renamed from: R */
    private final Rect f3478R;

    /* JADX INFO: renamed from: a */
    private Drawable f3479a;

    /* JADX INFO: renamed from: b */
    private ColorStateList f3480b;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f3481c;

    /* JADX INFO: renamed from: d */
    private boolean f3482d;

    /* JADX INFO: renamed from: e */
    private boolean f3483e;

    /* JADX INFO: renamed from: f */
    private Drawable f3484f;

    /* JADX INFO: renamed from: g */
    private ColorStateList f3485g;

    /* JADX INFO: renamed from: h */
    private PorterDuff.Mode f3486h;

    /* JADX INFO: renamed from: i */
    private boolean f3487i;

    /* JADX INFO: renamed from: j */
    private boolean f3488j;

    /* JADX INFO: renamed from: k */
    private int f3489k;

    /* JADX INFO: renamed from: l */
    private int f3490l;

    /* JADX INFO: renamed from: m */
    private int f3491m;

    /* JADX INFO: renamed from: n */
    private boolean f3492n;

    /* JADX INFO: renamed from: o */
    private CharSequence f3493o;

    /* JADX INFO: renamed from: p */
    private CharSequence f3494p;

    /* JADX INFO: renamed from: q */
    private CharSequence f3495q;

    /* JADX INFO: renamed from: r */
    private CharSequence f3496r;

    /* JADX INFO: renamed from: s */
    private boolean f3497s;

    /* JADX INFO: renamed from: t */
    private int f3498t;

    /* JADX INFO: renamed from: u */
    private int f3499u;

    /* JADX INFO: renamed from: v */
    private float f3500v;

    /* JADX INFO: renamed from: w */
    private float f3501w;

    /* JADX INFO: renamed from: x */
    private VelocityTracker f3502x;

    /* JADX INFO: renamed from: y */
    private int f3503y;

    /* JADX INFO: renamed from: z */
    float f3504z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$a */
    class C0860a extends Property {
        C0860a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f3504z);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f3) {
            switchCompat.setThumbPosition(f3.floatValue());
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$b */
    static class C0861b extends C1015f.f {

        /* JADX INFO: renamed from: a */
        private final Reference f3505a;

        C0861b(SwitchCompat switchCompat) {
            this.f3505a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C1015f.f
        /* JADX INFO: renamed from: a */
        public void mo3615a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f3505a.get();
            if (switchCompat != null) {
                switchCompat.m3610j();
            }
        }

        @Override // androidx.emoji2.text.C1015f.f
        /* JADX INFO: renamed from: b */
        public void mo1816b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f3505a.get();
            if (switchCompat != null) {
                switchCompat.m3610j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8695M);
    }

    /* JADX INFO: renamed from: a */
    private void m3596a(boolean z2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f3459S, z2 ? 1.0f : 0.0f);
        this.f3474N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f3474N.setAutoCancel(true);
        this.f3474N.start();
    }

    /* JADX INFO: renamed from: b */
    private void m3597b() {
        Drawable drawable = this.f3479a;
        if (drawable != null) {
            if (this.f3482d || this.f3483e) {
                Drawable drawableMutate = AbstractC0000a.m17r(drawable).mutate();
                this.f3479a = drawableMutate;
                if (this.f3482d) {
                    AbstractC0000a.m14o(drawableMutate, this.f3480b);
                }
                if (this.f3483e) {
                    AbstractC0000a.m15p(this.f3479a, this.f3481c);
                }
                if (this.f3479a.isStateful()) {
                    this.f3479a.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3598c() {
        Drawable drawable = this.f3484f;
        if (drawable != null) {
            if (this.f3487i || this.f3488j) {
                Drawable drawableMutate = AbstractC0000a.m17r(drawable).mutate();
                this.f3484f = drawableMutate;
                if (this.f3487i) {
                    AbstractC0000a.m14o(drawableMutate, this.f3485g);
                }
                if (this.f3488j) {
                    AbstractC0000a.m15p(this.f3484f, this.f3486h);
                }
                if (this.f3484f.isStateful()) {
                    this.f3484f.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m3599d() {
        ObjectAnimator objectAnimator = this.f3474N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m3600e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: f */
    private static float m3601f(float f3, float f4, float f5) {
        return f3 < f4 ? f4 : f3 > f5 ? f5 : f3;
    }

    /* JADX INFO: renamed from: g */
    private CharSequence m3602g(CharSequence charSequence) {
        TransformationMethod transformationMethodM3846f = getEmojiTextViewHelper().m3846f(this.f3473M);
        return transformationMethodM3846f != null ? transformationMethodM3846f.getTransformation(charSequence, this) : charSequence;
    }

    private C0903m getEmojiTextViewHelper() {
        if (this.f3476P == null) {
            this.f3476P = new C0903m(this);
        }
        return this.f3476P;
    }

    private boolean getTargetCheckedState() {
        return this.f3504z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((AbstractC0910p0.m3878b(this) ? 1.0f - this.f3504z : this.f3504z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3484f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3478R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3479a;
        Rect rectM3453d = drawable2 != null ? AbstractC0836M.m3453d(drawable2) : AbstractC0836M.f3290c;
        return ((((this.f3461A - this.f3463C) - rect.left) - rect.right) - rectM3453d.left) - rectM3453d.right;
    }

    /* JADX INFO: renamed from: h */
    private boolean m3603h(float f3, float f4) {
        if (this.f3479a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f3479a.getPadding(this.f3478R);
        int i3 = this.f3465E;
        int i4 = this.f3499u;
        int i5 = i3 - i4;
        int i6 = (this.f3464D + thumbOffset) - i4;
        int i7 = this.f3463C + i6;
        Rect rect = this.f3478R;
        return f3 > ((float) i6) && f3 < ((float) (((i7 + rect.left) + rect.right) + i4)) && f4 > ((float) i5) && f4 < ((float) (this.f3467G + i4));
    }

    /* JADX INFO: renamed from: i */
    private Layout m3604i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f3469I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX INFO: renamed from: k */
    private void m3605k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f3495q;
            if (string == null) {
                string = getResources().getString(AbstractC1767h.f8856b);
            }
            AbstractC0268W.m801v0(this, string);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m3606l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f3493o;
            if (string == null) {
                string = getResources().getString(AbstractC1767h.f8857c);
            }
            AbstractC0268W.m801v0(this, string);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m3607o(int i3, int i4) {
        m3612n(i3 != 1 ? i3 != 2 ? i3 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i4);
    }

    /* JADX INFO: renamed from: p */
    private void m3608p() {
        if (this.f3477Q == null && this.f3476P.m3842b() && C1015f.m4531i()) {
            C1015f c1015fM4527c = C1015f.m4527c();
            int iM4535e = c1015fM4527c.m4535e();
            if (iM4535e == 3 || iM4535e == 0) {
                C0861b c0861b = new C0861b(this);
                this.f3477Q = c0861b;
                c1015fM4527c.m4544t(c0861b);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m3609q(MotionEvent motionEvent) {
        this.f3498t = 0;
        boolean targetCheckedState = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z2) {
            this.f3502x.computeCurrentVelocity(1000);
            float xVelocity = this.f3502x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f3503y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!AbstractC0910p0.m3878b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        m3600e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3495q = charSequence;
        this.f3496r = m3602g(charSequence);
        this.f3472L = null;
        if (this.f3497s) {
            m3608p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3493o = charSequence;
        this.f3494p = m3602g(charSequence);
        this.f3471K = null;
        if (this.f3497s) {
            m3608p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i3;
        int i4;
        Rect rect = this.f3478R;
        int i5 = this.f3464D;
        int i6 = this.f3465E;
        int i7 = this.f3466F;
        int i8 = this.f3467G;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f3479a;
        Rect rectM3453d = drawable != null ? AbstractC0836M.m3453d(drawable) : AbstractC0836M.f3290c;
        Drawable drawable2 = this.f3484f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i9 = rect.left;
            thumbOffset += i9;
            if (rectM3453d != null) {
                int i10 = rectM3453d.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = rectM3453d.top;
                int i12 = rect.top;
                i3 = i11 > i12 ? (i11 - i12) + i6 : i6;
                int i13 = rectM3453d.right;
                int i14 = rect.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = rectM3453d.bottom;
                int i16 = rect.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                }
                this.f3484f.setBounds(i5, i3, i7, i4);
            } else {
                i3 = i6;
            }
            i4 = i8;
            this.f3484f.setBounds(i5, i3, i7, i4);
        }
        Drawable drawable3 = this.f3479a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i17 = thumbOffset - rect.left;
            int i18 = thumbOffset + this.f3463C + rect.right;
            this.f3479a.setBounds(i17, i6, i18, i8);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0000a.m11l(background, i17, i6, i18, i8);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f3479a;
        if (drawable != null) {
            AbstractC0000a.m10k(drawable, f3, f4);
        }
        Drawable drawable2 = this.f3484f;
        if (drawable2 != null) {
            AbstractC0000a.m10k(drawable2, f3, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3479a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3484f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!AbstractC0910p0.m3878b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3461A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3491m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (AbstractC0910p0.m3878b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3461A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3491m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0988i.m4396o(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f3497s;
    }

    public boolean getSplitTrack() {
        return this.f3492n;
    }

    public int getSwitchMinWidth() {
        return this.f3490l;
    }

    public int getSwitchPadding() {
        return this.f3491m;
    }

    public CharSequence getTextOff() {
        return this.f3495q;
    }

    public CharSequence getTextOn() {
        return this.f3493o;
    }

    public Drawable getThumbDrawable() {
        return this.f3479a;
    }

    protected final float getThumbPosition() {
        return this.f3504z;
    }

    public int getThumbTextPadding() {
        return this.f3489k;
    }

    public ColorStateList getThumbTintList() {
        return this.f3480b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3481c;
    }

    public Drawable getTrackDrawable() {
        return this.f3484f;
    }

    public ColorStateList getTrackTintList() {
        return this.f3485g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3486h;
    }

    /* JADX INFO: renamed from: j */
    void m3610j() {
        setTextOnInternal(this.f3493o);
        setTextOffInternal(this.f3495q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3479a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3484f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3474N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3474N.end();
        this.f3474N = null;
    }

    /* JADX INFO: renamed from: m */
    public void m3611m(Context context, int i3) {
        C0888e0 c0888e0M3763t = C0888e0.m3763t(context, i3, AbstractC1769j.f9010a3);
        ColorStateList colorStateListM3768c = c0888e0M3763t.m3768c(AbstractC1769j.f9034e3);
        if (colorStateListM3768c != null) {
            this.f3470J = colorStateListM3768c;
        } else {
            this.f3470J = getTextColors();
        }
        int iM3771f = c0888e0M3763t.m3771f(AbstractC1769j.f9016b3, 0);
        if (iM3771f != 0) {
            float f3 = iM3771f;
            if (f3 != this.f3469I.getTextSize()) {
                this.f3469I.setTextSize(f3);
                requestLayout();
            }
        }
        m3607o(c0888e0M3763t.m3776k(AbstractC1769j.f9022c3, -1), c0888e0M3763t.m3776k(AbstractC1769j.f9028d3, -1));
        if (c0888e0M3763t.m3766a(AbstractC1769j.f9091p3, false)) {
            this.f3473M = new C1984a(getContext());
        } else {
            this.f3473M = null;
        }
        setTextOnInternal(this.f3493o);
        setTextOffInternal(this.f3495q);
        c0888e0M3763t.m3786x();
    }

    /* JADX INFO: renamed from: n */
    public void m3612n(Typeface typeface, int i3) {
        if (i3 <= 0) {
            this.f3469I.setFakeBoldText(false);
            this.f3469I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
            this.f3469I.setFakeBoldText((i4 & 1) != 0);
            this.f3469I.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i3) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3460T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f3478R;
        Drawable drawable = this.f3484f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.f3465E;
        int i4 = this.f3467G;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f3479a;
        if (drawable != null) {
            if (!this.f3492n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM3453d = AbstractC0836M.m3453d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM3453d.left;
                rect.right -= rectM3453d.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f3471K : this.f3472L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3470J;
            if (colorStateList != null) {
                this.f3469I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f3469I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i5 + i6) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3493o : this.f3495q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int iMax;
        int width;
        int paddingLeft;
        int i7;
        int paddingTop;
        int height;
        super.onLayout(z2, i3, i4, i5, i6);
        int iMax2 = 0;
        if (this.f3479a != null) {
            Rect rect = this.f3478R;
            Drawable drawable = this.f3484f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM3453d = AbstractC0836M.m3453d(this.f3479a);
            iMax = Math.max(0, rectM3453d.left - rect.left);
            iMax2 = Math.max(0, rectM3453d.right - rect.right);
        } else {
            iMax = 0;
        }
        if (AbstractC0910p0.m3878b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f3461A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f3461A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i7 = this.f3462B;
            paddingTop = paddingTop2 - (i7 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f3462B;
                this.f3464D = paddingLeft;
                this.f3465E = paddingTop;
                this.f3467G = height;
                this.f3466F = width;
            }
            paddingTop = getPaddingTop();
            i7 = this.f3462B;
        }
        height = i7 + paddingTop;
        this.f3464D = paddingLeft;
        this.f3465E = paddingTop;
        this.f3467G = height;
        this.f3466F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f3497s) {
            if (this.f3471K == null) {
                this.f3471K = m3604i(this.f3494p);
            }
            if (this.f3472L == null) {
                this.f3472L = m3604i(this.f3496r);
            }
        }
        Rect rect = this.f3478R;
        Drawable drawable = this.f3479a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f3479a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3479a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f3463C = Math.max(this.f3497s ? Math.max(this.f3471K.getWidth(), this.f3472L.getWidth()) + (this.f3489k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f3484f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f3484f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f3479a;
        if (drawable3 != null) {
            Rect rectM3453d = AbstractC0836M.m3453d(drawable3);
            iMax = Math.max(iMax, rectM3453d.left);
            iMax2 = Math.max(iMax2, rectM3453d.right);
        }
        int iMax3 = this.f3468H ? Math.max(this.f3490l, (this.f3463C * 2) + iMax + iMax2) : this.f3490l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f3461A = iMax3;
        this.f3462B = iMax4;
        super.onMeasure(i3, i4);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3493o : this.f3495q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f3502x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f3498t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f3500v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.AbstractC0910p0.m3878b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f3504z
            float r0 = r0 + r2
            float r0 = m3601f(r0, r4, r3)
            float r2 = r6.f3504z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f3500v = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f3500v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f3499u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f3501w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f3499u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f3498t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f3500v = r0
            r6.f3501w = r3
            return r1
        L89:
            int r0 = r6.f3498t
            if (r0 != r2) goto L94
            r6.m3609q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f3498t = r0
            android.view.VelocityTracker r0 = r6.f3502x
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.m3603h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f3498t = r1
            r6.f3500v = r0
            r6.f3501w = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m3844d(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            m3606l();
        } else {
            m3605k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            m3596a(zIsChecked);
        } else {
            m3599d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0988i.m4397p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m3845e(z2);
        setTextOnInternal(this.f3493o);
        setTextOffInternal(this.f3495q);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z2) {
        this.f3468H = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m3841a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f3497s != z2) {
            this.f3497s = z2;
            requestLayout();
            if (z2) {
                m3608p();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f3492n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i3) {
        this.f3490l = i3;
        requestLayout();
    }

    public void setSwitchPadding(int i3) {
        this.f3491m = i3;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f3469I.getTypeface() == null || this.f3469I.getTypeface().equals(typeface)) && (this.f3469I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f3469I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m3605k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m3606l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3479a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3479a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f3) {
        this.f3504z = f3;
        invalidate();
    }

    public void setThumbResource(int i3) {
        setThumbDrawable(AbstractC1832a.m9609b(getContext(), i3));
    }

    public void setThumbTextPadding(int i3) {
        this.f3489k = i3;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3480b = colorStateList;
        this.f3482d = true;
        m3597b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3481c = mode;
        this.f3483e = true;
        m3597b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3484f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3484f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i3) {
        setTrackDrawable(AbstractC1832a.m9609b(getContext(), i3));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3485g = colorStateList;
        this.f3487i = true;
        m3598c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3486h = mode;
        this.f3488j = true;
        m3598c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3479a || drawable == this.f3484f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3480b = null;
        this.f3481c = null;
        this.f3482d = false;
        this.f3483e = false;
        this.f3485g = null;
        this.f3486h = null;
        this.f3487i = false;
        this.f3488j = false;
        this.f3502x = VelocityTracker.obtain();
        this.f3468H = true;
        this.f3478R = new Rect();
        AbstractC0880a0.m3741a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3469I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC1769j.f8934L2;
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, iArr, i3, 0);
        AbstractC0268W.m771g0(this, context, iArr, attributeSet, c0888e0M3765v.m3783r(), i3, 0);
        Drawable drawableM3772g = c0888e0M3765v.m3772g(AbstractC1769j.f8949O2);
        this.f3479a = drawableM3772g;
        if (drawableM3772g != null) {
            drawableM3772g.setCallback(this);
        }
        Drawable drawableM3772g2 = c0888e0M3765v.m3772g(AbstractC1769j.f8994X2);
        this.f3484f = drawableM3772g2;
        if (drawableM3772g2 != null) {
            drawableM3772g2.setCallback(this);
        }
        setTextOnInternal(c0888e0M3765v.m3781p(AbstractC1769j.f8939M2));
        setTextOffInternal(c0888e0M3765v.m3781p(AbstractC1769j.f8944N2));
        this.f3497s = c0888e0M3765v.m3766a(AbstractC1769j.f8954P2, true);
        this.f3489k = c0888e0M3765v.m3771f(AbstractC1769j.f8979U2, 0);
        this.f3490l = c0888e0M3765v.m3771f(AbstractC1769j.f8964R2, 0);
        this.f3491m = c0888e0M3765v.m3771f(AbstractC1769j.f8969S2, 0);
        this.f3492n = c0888e0M3765v.m3766a(AbstractC1769j.f8959Q2, false);
        ColorStateList colorStateListM3768c = c0888e0M3765v.m3768c(AbstractC1769j.f8984V2);
        if (colorStateListM3768c != null) {
            this.f3480b = colorStateListM3768c;
            this.f3482d = true;
        }
        PorterDuff.Mode modeM3454e = AbstractC0836M.m3454e(c0888e0M3765v.m3776k(AbstractC1769j.f8989W2, -1), null);
        if (this.f3481c != modeM3454e) {
            this.f3481c = modeM3454e;
            this.f3483e = true;
        }
        if (this.f3482d || this.f3483e) {
            m3597b();
        }
        ColorStateList colorStateListM3768c2 = c0888e0M3765v.m3768c(AbstractC1769j.f8999Y2);
        if (colorStateListM3768c2 != null) {
            this.f3485g = colorStateListM3768c2;
            this.f3487i = true;
        }
        PorterDuff.Mode modeM3454e2 = AbstractC0836M.m3454e(c0888e0M3765v.m3776k(AbstractC1769j.f9004Z2, -1), null);
        if (this.f3486h != modeM3454e2) {
            this.f3486h = modeM3454e2;
            this.f3488j = true;
        }
        if (this.f3487i || this.f3488j) {
            m3598c();
        }
        int iM3779n = c0888e0M3765v.m3779n(AbstractC1769j.f8974T2, 0);
        if (iM3779n != 0) {
            m3611m(context, iM3779n);
        }
        C0795A c0795a = new C0795A(this);
        this.f3475O = c0795a;
        c0795a.m3240m(attributeSet, i3);
        c0888e0M3765v.m3786x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3499u = viewConfiguration.getScaledTouchSlop();
        this.f3503y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m3843c(attributeSet, i3);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
