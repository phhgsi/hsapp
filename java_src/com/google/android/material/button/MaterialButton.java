package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.AbstractC0740E;
import androidx.appcompat.widget.C0887e;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.AbstractC1549t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0000a;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p045P.AbstractC0463i;
import p045P.C0465k;
import p045P.C0466l;
import p058T0.AbstractC0528h;
import p067W0.AbstractC0557c;
import p076Z0.AbstractC0638i;
import p076Z0.C0637h;
import p076Z0.C0641l;
import p076Z0.C0649t;
import p076Z0.C0650u;
import p076Z0.InterfaceC0644o;
import p089c1.AbstractC1313a;
import p095e.AbstractC1832a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0887e implements Checkable, InterfaceC0644o {

    /* JADX INFO: renamed from: F */
    private static final int[] f7187F = {R.attr.state_checkable};

    /* JADX INFO: renamed from: G */
    private static final int[] f7188G = {R.attr.state_checked};

    /* JADX INFO: renamed from: H */
    private static final int f7189H = AbstractC0149j.f583p;

    /* JADX INFO: renamed from: I */
    private static final int f7190I = AbstractC0140a.f354v;

    /* JADX INFO: renamed from: J */
    private static final AbstractC0463i f7191J = new C1463a("widthIncrease");

    /* JADX INFO: renamed from: A */
    C0650u f7192A;

    /* JADX INFO: renamed from: B */
    int f7193B;

    /* JADX INFO: renamed from: C */
    private float f7194C;

    /* JADX INFO: renamed from: D */
    private float f7195D;

    /* JADX INFO: renamed from: E */
    private C0465k f7196E;

    /* JADX INFO: renamed from: d */
    private final C1471e f7197d;

    /* JADX INFO: renamed from: e */
    private final LinkedHashSet f7198e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1464b f7199f;

    /* JADX INFO: renamed from: g */
    private PorterDuff.Mode f7200g;

    /* JADX INFO: renamed from: h */
    private ColorStateList f7201h;

    /* JADX INFO: renamed from: i */
    private Drawable f7202i;

    /* JADX INFO: renamed from: j */
    private String f7203j;

    /* JADX INFO: renamed from: k */
    private int f7204k;

    /* JADX INFO: renamed from: l */
    private int f7205l;

    /* JADX INFO: renamed from: m */
    private int f7206m;

    /* JADX INFO: renamed from: n */
    private int f7207n;

    /* JADX INFO: renamed from: o */
    private boolean f7208o;

    /* JADX INFO: renamed from: p */
    private boolean f7209p;

    /* JADX INFO: renamed from: q */
    private int f7210q;

    /* JADX INFO: renamed from: r */
    private int f7211r;

    /* JADX INFO: renamed from: s */
    private float f7212s;

    /* JADX INFO: renamed from: t */
    private int f7213t;

    /* JADX INFO: renamed from: u */
    private int f7214u;

    /* JADX INFO: renamed from: v */
    private LinearLayout.LayoutParams f7215v;

    /* JADX INFO: renamed from: w */
    private boolean f7216w;

    /* JADX INFO: renamed from: x */
    private int f7217x;

    /* JADX INFO: renamed from: y */
    private boolean f7218y;

    /* JADX INFO: renamed from: z */
    int f7219z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1462a();

        /* JADX INFO: renamed from: f */
        boolean f7220f;

        /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        class C1462a implements Parcelable.ClassLoaderCreator {
            C1462a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: d */
        private void m7693d(Parcel parcel) {
            this.f7220f = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f7220f ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m7693d(parcel);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$a */
    class C1463a extends AbstractC0463i {
        C1463a(String str) {
            super(str);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(MaterialButton materialButton, float f3) {
            materialButton.setDisplayedWidthIncrease(f3);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$b */
    interface InterfaceC1464b {
        /* JADX INFO: renamed from: a */
        void mo7699a(MaterialButton materialButton, boolean z2);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f349q);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7674a(MaterialButton materialButton) {
        materialButton.f7217x = materialButton.getOpticalCenterShift();
        materialButton.m7690s();
        materialButton.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7675b(MaterialButton materialButton, float f3) {
        int i3 = (int) (f3 * 0.11f);
        if (materialButton.f7217x != i3) {
            materialButton.f7217x = i3;
            materialButton.m7690s();
            materialButton.invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    private C0466l m7678e() {
        return AbstractC0528h.m1912h(getContext(), AbstractC0140a.f318K, AbstractC0149j.f569b);
    }

    /* JADX INFO: renamed from: f */
    private void m7679f() {
        C0465k c0465k = new C0465k(this, f7191J);
        this.f7196E = c0465k;
        c0465k.m1715q(m7678e());
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f7194C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        C0637h c0637hM7752g;
        if (this.f7216w && this.f7218y && (c0637hM7752g = this.f7197d.m7752g()) != null) {
            return (int) (c0637hM7752g.m2289z() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i3));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX INFO: renamed from: h */
    private boolean m7680h() {
        int i3 = this.f7210q;
        return i3 == 3 || i3 == 4;
    }

    /* JADX INFO: renamed from: i */
    private boolean m7681i() {
        int i3 = this.f7210q;
        return i3 == 1 || i3 == 2;
    }

    /* JADX INFO: renamed from: j */
    private boolean m7682j() {
        int i3 = this.f7210q;
        return i3 == 16 || i3 == 32;
    }

    /* JADX INFO: renamed from: k */
    private boolean m7683k() {
        return (getParent() instanceof AbstractC1470d) && ((AbstractC1470d) getParent()).getOrientation() == 0;
    }

    /* JADX INFO: renamed from: l */
    private boolean m7684l() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: m */
    private boolean m7685m() {
        C1471e c1471e = this.f7197d;
        return (c1471e == null || c1471e.m7760q()) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    private void m7686n(boolean z2) {
        if (this.f7192A == null) {
            return;
        }
        if (this.f7196E == null) {
            m7679f();
        }
        if (this.f7218y) {
            this.f7196E.m1712m(Math.min(this.f7193B, this.f7192A.m2484e(getDrawableState()).f2333a.m2485a(getWidth())));
            if (z2) {
                this.f7196E.m1716r();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m7687p() {
        if (m7681i()) {
            setCompoundDrawablesRelative(this.f7202i, null, null, null);
        } else if (m7680h()) {
            setCompoundDrawablesRelative(null, null, this.f7202i, null);
        } else if (m7682j()) {
            setCompoundDrawablesRelative(null, this.f7202i, null, null);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m7688q(boolean z2) {
        Drawable drawable = this.f7202i;
        if (drawable != null) {
            Drawable drawableMutate = AbstractC0000a.m17r(drawable).mutate();
            this.f7202i = drawableMutate;
            drawableMutate.setTintList(this.f7201h);
            PorterDuff.Mode mode = this.f7200g;
            if (mode != null) {
                this.f7202i.setTintMode(mode);
            }
            int intrinsicWidth = this.f7204k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f7202i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f7204k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f7202i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7202i;
            int i3 = this.f7205l;
            int i4 = this.f7206m;
            drawable2.setBounds(i3, i4, intrinsicWidth + i3, intrinsicHeight + i4);
            this.f7202i.setVisible(true, z2);
        }
        if (z2) {
            m7687p();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!m7681i() || drawable3 == this.f7202i) && ((!m7680h() || drawable5 == this.f7202i) && (!m7682j() || drawable4 == this.f7202i))) {
            return;
        }
        m7687p();
    }

    /* JADX INFO: renamed from: r */
    private void m7689r(int i3, int i4) {
        if (this.f7202i == null || getLayout() == null) {
            return;
        }
        if (!m7681i() && !m7680h()) {
            if (m7682j()) {
                this.f7205l = 0;
                if (this.f7210q == 16) {
                    this.f7206m = 0;
                    m7688q(false);
                    return;
                }
                int intrinsicHeight = this.f7204k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f7202i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f7207n) - getPaddingBottom()) / 2);
                if (this.f7206m != iMax) {
                    this.f7206m = iMax;
                    m7688q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f7206m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f7210q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f7205l = 0;
            m7688q(false);
            return;
        }
        int intrinsicWidth = this.f7204k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f7202i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i3 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f7207n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (m7684l() != (this.f7210q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f7205l != textLayoutWidth) {
            this.f7205l = textLayoutWidth;
            m7688q(false);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m7690s() {
        int i3 = (int) (this.f7194C - this.f7195D);
        int i4 = (i3 / 2) + this.f7217x;
        getLayoutParams().width = (int) (this.f7212s + i3);
        setPaddingRelative(this.f7213t + i4, getPaddingTop(), (this.f7214u + i3) - i4, getPaddingBottom());
    }

    private void setCheckedInternal(boolean z2) {
        if (!m7691g() || this.f7208o == z2) {
            return;
        }
        this.f7208o = z2;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).m7711w(this, this.f7208o);
        }
        if (this.f7209p) {
            return;
        }
        this.f7209p = true;
        Iterator it = this.f7198e.iterator();
        if (it.hasNext()) {
            AbstractC0740E.m2693a(it.next());
            throw null;
        }
        this.f7209p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f3) {
        if (this.f7194C != f3) {
            this.f7194C = f3;
            m7690s();
            invalidate();
            if (getParent() instanceof AbstractC1470d) {
                ((AbstractC1470d) getParent()).m7726k(this, (int) this.f7194C);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m7691g() {
        C1471e c1471e = this.f7197d;
        return c1471e != null && c1471e.m7761r();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f7203j)) {
            return (m7691g() ? CompoundButton.class : Button.class).getName();
        }
        return this.f7203j;
    }

    int getAllowedWidthDecrease() {
        return this.f7219z;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m7685m()) {
            return this.f7197d.m7747b();
        }
        return 0;
    }

    public C0466l getCornerSpringForce() {
        return this.f7197d.m7748c();
    }

    public Drawable getIcon() {
        return this.f7202i;
    }

    public int getIconGravity() {
        return this.f7210q;
    }

    public int getIconPadding() {
        return this.f7207n;
    }

    public int getIconSize() {
        return this.f7204k;
    }

    public ColorStateList getIconTint() {
        return this.f7201h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f7200g;
    }

    public int getInsetBottom() {
        return this.f7197d.m7749d();
    }

    public int getInsetTop() {
        return this.f7197d.m7750e();
    }

    public ColorStateList getRippleColor() {
        if (m7685m()) {
            return this.f7197d.m7753i();
        }
        return null;
    }

    public C0641l getShapeAppearanceModel() {
        if (m7685m()) {
            return this.f7197d.m7754j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public C0649t getStateListShapeAppearanceModel() {
        if (m7685m()) {
            return this.f7197d.m7755k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m7685m()) {
            return this.f7197d.m7756l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m7685m()) {
            return this.f7197d.m7757m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0887e
    public ColorStateList getSupportBackgroundTintList() {
        return m7685m() ? this.f7197d.m7758n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0887e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m7685m() ? this.f7197d.m7759o() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7208o;
    }

    /* JADX INFO: renamed from: o */
    void m7692o() {
        LinearLayout.LayoutParams layoutParams = this.f7215v;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.f7215v = null;
            this.f7212s = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m7685m()) {
            AbstractC0638i.m2301f(this, this.f7197d.m7752g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i3) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (m7691g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7187F);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7188G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0887e, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0887e, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m7691g());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0887e, android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z2, i3, i4, i5, i6);
        m7689r(getMeasuredWidth(), getMeasuredHeight());
        int i8 = getResources().getConfiguration().orientation;
        if (this.f7211r != i8) {
            this.f7211r = i8;
            this.f7212s = -1.0f;
        }
        if (this.f7212s == -1.0f) {
            this.f7212s = getMeasuredWidth();
            if (this.f7215v == null && (getParent() instanceof AbstractC1470d) && ((AbstractC1470d) getParent()).getButtonSizeChange() != null) {
                this.f7215v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f7215v);
                layoutParams.width = (int) this.f7212s;
                setLayoutParams(layoutParams);
            }
        }
        if (this.f7219z == -1) {
            if (this.f7202i == null) {
                i7 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f7204k;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f7202i.getIntrinsicWidth();
                }
                i7 = iconPadding + intrinsicWidth;
            }
            this.f7219z = (getMeasuredWidth() - getTextLayoutWidth()) - i7;
        }
        if (this.f7213t == -1) {
            this.f7213t = getPaddingStart();
        }
        if (this.f7214u == -1) {
            this.f7214u = getPaddingEnd();
        }
        this.f7218y = m7683k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m4418a());
        setChecked(savedState.f7220f);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7220f = this.f7208o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.C0887e, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        m7689r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f7197d.m7762s()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f7202i != null) {
            if (this.f7202i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f7203j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        if (m7685m()) {
            this.f7197d.m7764u(i3);
        } else {
            super.setBackgroundColor(i3);
        }
    }

    @Override // androidx.appcompat.widget.C0887e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m7685m()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f7197d.m7765v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C0887e, android.view.View
    public void setBackgroundResource(int i3) {
        setBackgroundDrawable(i3 != 0 ? AbstractC1832a.m9609b(getContext(), i3) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (m7685m()) {
            this.f7197d.m7766w(z2);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedInternal(z2);
    }

    public void setCornerRadius(int i3) {
        if (m7685m()) {
            this.f7197d.m7767x(i3);
        }
    }

    public void setCornerRadiusResource(int i3) {
        if (m7685m()) {
            setCornerRadius(getResources().getDimensionPixelSize(i3));
        }
    }

    public void setCornerSpringForce(C0466l c0466l) {
        this.f7197d.m7769z(c0466l);
    }

    void setDisplayedWidthDecrease(int i3) {
        this.f7195D = Math.min(i3, this.f7219z);
        m7690s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (m7685m()) {
            this.f7197d.m7752g().m2273b0(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f7202i != drawable) {
            this.f7202i = drawable;
            m7688q(true);
            m7689r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i3) {
        if (this.f7210q != i3) {
            this.f7210q = i3;
            m7689r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i3) {
        if (this.f7207n != i3) {
            this.f7207n = i3;
            setCompoundDrawablePadding(i3);
        }
    }

    public void setIconResource(int i3) {
        setIcon(i3 != 0 ? AbstractC1832a.m9609b(getContext(), i3) : null);
    }

    public void setIconSize(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f7204k != i3) {
            this.f7204k = i3;
            m7688q(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7201h != colorStateList) {
            this.f7201h = colorStateList;
            m7688q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f7200g != mode) {
            this.f7200g = mode;
            m7688q(false);
        }
    }

    public void setIconTintResource(int i3) {
        setIconTint(AbstractC1832a.m9608a(getContext(), i3));
    }

    public void setInsetBottom(int i3) {
        this.f7197d.m7736A(i3);
    }

    public void setInsetTop(int i3) {
        this.f7197d.m7737B(i3);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(InterfaceC1464b interfaceC1464b) {
        this.f7199f = interfaceC1464b;
    }

    public void setOpticalCenterEnabled(boolean z2) {
        if (this.f7216w != z2) {
            this.f7216w = z2;
            if (z2) {
                this.f7197d.m7768y(new C0637h.d() { // from class: com.google.android.material.button.a
                    @Override // p076Z0.C0637h.d
                    /* JADX INFO: renamed from: a */
                    public final void mo2293a(float f3) {
                        MaterialButton.m7675b(this.f7229a, f3);
                    }
                });
            } else {
                this.f7197d.m7768y(null);
            }
            post(new Runnable() { // from class: com.google.android.material.button.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.m7674a(this.f7230d);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC1464b interfaceC1464b = this.f7199f;
        if (interfaceC1464b != null) {
            interfaceC1464b.mo7699a(this, z2);
        }
        super.setPressed(z2);
        m7686n(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m7685m()) {
            this.f7197d.m7738C(colorStateList);
        }
    }

    public void setRippleColorResource(int i3) {
        if (m7685m()) {
            setRippleColor(AbstractC1832a.m9608a(getContext(), i3));
        }
    }

    @Override // p076Z0.InterfaceC0644o
    public void setShapeAppearanceModel(C0641l c0641l) {
        if (!m7685m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f7197d.m7739D(c0641l);
    }

    void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (m7685m()) {
            this.f7197d.m7740E(z2);
        }
    }

    void setSizeChange(C0650u c0650u) {
        if (this.f7192A != c0650u) {
            this.f7192A = c0650u;
            m7686n(true);
        }
    }

    public void setStateListShapeAppearanceModel(C0649t c0649t) {
        if (!m7685m()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f7197d.m7748c() == null && c0649t.m2461f()) {
            this.f7197d.m7769z(m7678e());
        }
        this.f7197d.m7741F(c0649t);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m7685m()) {
            this.f7197d.m7742G(colorStateList);
        }
    }

    public void setStrokeColorResource(int i3) {
        if (m7685m()) {
            setStrokeColor(AbstractC1832a.m9608a(getContext(), i3));
        }
    }

    public void setStrokeWidth(int i3) {
        if (m7685m()) {
            this.f7197d.m7743H(i3);
        }
    }

    public void setStrokeWidthResource(int i3) {
        if (m7685m()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // androidx.appcompat.widget.C0887e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m7685m()) {
            this.f7197d.m7744I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0887e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m7685m()) {
            this.f7197d.m7745J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i3) {
        super.setTextAlignment(i3);
        m7689r(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f7197d.m7746K(z2);
    }

    @Override // android.widget.TextView
    public void setWidth(int i3) {
        this.f7212s = -1.0f;
        super.setWidth(i3);
    }

    void setWidthChangeMax(int i3) {
        if (this.f7193B != i3) {
            this.f7193B = i3;
            m7686n(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7208o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f7189H;
        super(AbstractC1313a.m6669e(context, attributeSet, i3, i4, new int[]{f7190I}), attributeSet, i3);
        this.f7198e = new LinkedHashSet();
        this.f7208o = false;
        this.f7209p = false;
        this.f7211r = -1;
        this.f7212s = -1.0f;
        this.f7213t = -1;
        this.f7214u = -1;
        this.f7219z = -1;
        Context context2 = getContext();
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context2, attributeSet, AbstractC0150k.f1062y2, i3, i4, new int[0]);
        this.f7207n = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f705M2, 0);
        this.f7200g = AbstractC1549t.m8503h(typedArrayM8488i.getInt(AbstractC0150k.f732P2, -1), PorterDuff.Mode.SRC_IN);
        this.f7201h = AbstractC0557c.m2077a(getContext(), typedArrayM8488i, AbstractC0150k.f723O2);
        this.f7202i = AbstractC0557c.m2081e(getContext(), typedArrayM8488i, AbstractC0150k.f687K2);
        this.f7210q = typedArrayM8488i.getInteger(AbstractC0150k.f696L2, 1);
        this.f7204k = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f714N2, 0);
        C0649t c0649tM2455b = C0649t.m2455b(context2, typedArrayM8488i, AbstractC0150k.f759S2);
        C0641l c0641lM2459c = c0649tM2455b != null ? c0649tM2455b.m2459c(true) : C0641l.m2308e(context2, attributeSet, i3, i4).m2351m();
        boolean z2 = typedArrayM8488i.getBoolean(AbstractC0150k.f741Q2, false);
        C1471e c1471e = new C1471e(this, c0641lM2459c);
        this.f7197d = c1471e;
        c1471e.m7763t(typedArrayM8488i);
        setCheckedInternal(typedArrayM8488i.getBoolean(AbstractC0150k.f597A2, false));
        if (c0649tM2455b != null) {
            c1471e.m7769z(m7678e());
            c1471e.m7741F(c0649tM2455b);
        }
        setOpticalCenterEnabled(z2);
        typedArrayM8488i.recycle();
        setCompoundDrawablePadding(this.f7207n);
        m7688q(this.f7202i != null);
    }
}
