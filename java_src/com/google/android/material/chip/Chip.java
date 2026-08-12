package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0889f;
import com.google.android.material.chip.C1488a;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.InterfaceC1536g;
import java.util.List;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0148i;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p019G0.C0179d;
import p027J.AbstractC0268W;
import p030K.C0356y;
import p039N.AbstractC0433a;
import p067W0.AbstractC0556b;
import p067W0.AbstractC0561g;
import p067W0.C0559e;
import p070X0.AbstractC0595a;
import p076Z0.AbstractC0638i;
import p076Z0.C0641l;
import p076Z0.InterfaceC0644o;
import p089c1.AbstractC1313a;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0889f implements C1488a.a, InterfaceC0644o, Checkable {

    /* JADX INFO: renamed from: w */
    private static final int f7368w = AbstractC0149j.f584q;

    /* JADX INFO: renamed from: x */
    private static final Rect f7369x = new Rect();

    /* JADX INFO: renamed from: y */
    private static final int[] f7370y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z */
    private static final int[] f7371z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    private C1488a f7372e;

    /* JADX INFO: renamed from: f */
    private InsetDrawable f7373f;

    /* JADX INFO: renamed from: g */
    private RippleDrawable f7374g;

    /* JADX INFO: renamed from: h */
    private View.OnClickListener f7375h;

    /* JADX INFO: renamed from: i */
    private CompoundButton.OnCheckedChangeListener f7376i;

    /* JADX INFO: renamed from: j */
    private boolean f7377j;

    /* JADX INFO: renamed from: k */
    private boolean f7378k;

    /* JADX INFO: renamed from: l */
    private boolean f7379l;

    /* JADX INFO: renamed from: m */
    private boolean f7380m;

    /* JADX INFO: renamed from: n */
    private boolean f7381n;

    /* JADX INFO: renamed from: o */
    private int f7382o;

    /* JADX INFO: renamed from: p */
    private int f7383p;

    /* JADX INFO: renamed from: q */
    private CharSequence f7384q;

    /* JADX INFO: renamed from: r */
    private final C1487c f7385r;

    /* JADX INFO: renamed from: s */
    private boolean f7386s;

    /* JADX INFO: renamed from: t */
    private final Rect f7387t;

    /* JADX INFO: renamed from: u */
    private final RectF f7388u;

    /* JADX INFO: renamed from: v */
    private final AbstractC0561g f7389v;

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$a */
    class C1485a extends AbstractC0561g {
        C1485a() {
        }

        @Override // p067W0.AbstractC0561g
        /* JADX INFO: renamed from: a */
        public void mo2065a(int i3) {
        }

        @Override // p067W0.AbstractC0561g
        /* JADX INFO: renamed from: b */
        public void mo2066b(Typeface typeface, boolean z2) {
            Chip chip = Chip.this;
            chip.setText(chip.f7372e.m8043V2() ? Chip.this.f7372e.m8079p1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$b */
    class C1486b extends ViewOutlineProvider {
        C1486b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f7372e != null) {
                Chip.this.f7372e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$c */
    private class C1487c extends AbstractC0433a {
        C1487c(Chip chip) {
            super(chip);
        }

        @Override // p039N.AbstractC0433a
        /* JADX INFO: renamed from: B */
        protected int mo1507B(float f3, float f4) {
            return (Chip.this.m7945n() && Chip.this.getCloseIconTouchBounds().contains(f3, f4)) ? 1 : 0;
        }

        @Override // p039N.AbstractC0433a
        /* JADX INFO: renamed from: C */
        protected void mo1508C(List list) {
            list.add(0);
            if (Chip.this.m7945n() && Chip.this.m7957s() && Chip.this.f7375h != null) {
                list.add(1);
            }
        }

        @Override // p039N.AbstractC0433a
        /* JADX INFO: renamed from: J */
        protected boolean mo1511J(int i3, int i4, Bundle bundle) {
            if (i4 != 16) {
                return false;
            }
            if (i3 == 0) {
                return Chip.this.performClick();
            }
            if (i3 == 1) {
                return Chip.this.m7958t();
            }
            return false;
        }

        @Override // p039N.AbstractC0433a
        /* JADX INFO: renamed from: M */
        protected void mo1514M(C0356y c0356y) {
            c0356y.m1283q0(Chip.this.m7956r());
            c0356y.m1288t0(Chip.this.isClickable());
            c0356y.m1287s0(Chip.this.getAccessibilityClassName());
            c0356y.m1249R0(Chip.this.getText());
        }

        @Override // p039N.AbstractC0433a
        /* JADX INFO: renamed from: N */
        protected void mo1515N(int i3, C0356y c0356y) {
            if (i3 != 1) {
                c0356y.m1294w0("");
                c0356y.m1280o0(Chip.f7369x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c0356y.m1294w0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                c0356y.m1294w0(Chip.this.getContext().getString(AbstractC0148i.f554n, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            c0356y.m1280o0(Chip.this.getCloseIconTouchBoundsInt());
            c0356y.m1263b(C0356y.a.f1452i);
            c0356y.m1296x0(Chip.this.isEnabled());
            c0356y.m1287s0(Button.class.getName());
        }

        @Override // p039N.AbstractC0433a
        /* JADX INFO: renamed from: O */
        protected void mo1516O(int i3, boolean z2) {
            if (i3 == 1) {
                Chip.this.f7380m = z2;
            }
            if (Chip.this.f7372e.m8001F1(Chip.this.f7380m)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f337e);
    }

    /* JADX INFO: renamed from: A */
    private void m7931A() {
        C1488a c1488a;
        if (TextUtils.isEmpty(getText()) || (c1488a = this.f7372e) == null) {
            return;
        }
        int iM8029R0 = (int) (c1488a.m8029R0() + this.f7372e.m8083r1() + this.f7372e.m8096y0());
        int iM8044W0 = (int) (this.f7372e.m8044W0() + this.f7372e.m8085s1() + this.f7372e.m8088u0());
        if (this.f7373f != null) {
            Rect rect = new Rect();
            this.f7373f.getPadding(rect);
            iM8044W0 += rect.left;
            iM8029R0 += rect.right;
        }
        setPaddingRelative(iM8044W0, getPaddingTop(), iM8029R0, getPaddingBottom());
    }

    /* JADX INFO: renamed from: B */
    private void m7932B() {
        TextPaint paint = getPaint();
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            paint.drawableState = c1488a.getState();
        }
        C0559e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m2105p(getContext(), paint, this.f7389v);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m7933C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7934b(Chip chip, CompoundButton compoundButton, boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f7376i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f7388u.setEmpty();
        if (m7945n() && this.f7375h != null) {
            this.f7372e.m8064g1(this.f7388u);
        }
        return this.f7388u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f7387t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f7387t;
    }

    private C0559e getTextAppearance() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8081q1();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private void m7943k(C1488a c1488a) {
        c1488a.m8098y2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: l */
    private int[] m7944l() {
        ?? IsEnabled = isEnabled();
        int i3 = IsEnabled;
        if (this.f7380m) {
            i3 = IsEnabled + 1;
        }
        int i4 = i3;
        if (this.f7379l) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (this.f7378k) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (isChecked()) {
            i6 = i5 + 1;
        }
        int[] iArr = new int[i6];
        int i7 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i7 = 1;
        }
        if (this.f7380m) {
            iArr[i7] = 16842908;
            i7++;
        }
        if (this.f7379l) {
            iArr[i7] = 16843623;
            i7++;
        }
        if (this.f7378k) {
            iArr[i7] = 16842919;
            i7++;
        }
        if (isChecked()) {
            iArr[i7] = 16842913;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public boolean m7945n() {
        C1488a c1488a = this.f7372e;
        return (c1488a == null || c1488a.m8050Z0() == null) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    private void m7946o(Context context, AttributeSet attributeSet, int i3) {
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context, attributeSet, AbstractC0150k.f712N0, i3, f7368w, new int[0]);
        this.f7381n = typedArrayM8488i.getBoolean(AbstractC0150k.f1016t1, false);
        this.f7383p = (int) Math.ceil(typedArrayM8488i.getDimension(AbstractC0150k.f900h1, AbstractC0556b.m2073e(context)));
        typedArrayM8488i.recycle();
    }

    /* JADX INFO: renamed from: p */
    private void m7947p() {
        setOutlineProvider(new C1486b());
    }

    /* JADX INFO: renamed from: q */
    private void m7948q(int i3, int i4, int i5, int i6) {
        this.f7373f = new InsetDrawable((Drawable) this.f7372e, i3, i4, i5, i6);
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f7379l != z2) {
            this.f7379l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f7378k != z2) {
            this.f7378k = z2;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: u */
    private void m7949u() {
        if (this.f7373f != null) {
            this.f7373f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m7952y();
        }
    }

    /* JADX INFO: renamed from: w */
    private void m7950w(C1488a c1488a) {
        if (c1488a != null) {
            c1488a.m8098y2(null);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m7951x() {
        if (m7945n() && m7957s() && this.f7375h != null) {
            AbstractC0268W.m775i0(this, this.f7385r);
            this.f7386s = true;
        } else {
            AbstractC0268W.m775i0(this, null);
            this.f7386s = false;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m7952y() {
        m7953z();
    }

    /* JADX INFO: renamed from: z */
    private void m7953z() {
        this.f7374g = new RippleDrawable(AbstractC0595a.m2128d(this.f7372e.m8075n1()), getBackgroundDrawable(), null);
        this.f7372e.m8040U2(false);
        setBackground(this.f7374g);
        m7931A();
    }

    @Override // com.google.android.material.chip.C1488a.a
    /* JADX INFO: renamed from: a */
    public void mo7954a() {
        m7955m(this.f7383p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f7386s ? super.dispatchHoverEvent(motionEvent) : this.f7385r.m1521v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f7386s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f7385r.m1522w(keyEvent) || this.f7385r.m1506A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C0889f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1488a c1488a = this.f7372e;
        if ((c1488a == null || !c1488a.m8094x1()) ? false : this.f7372e.m8090u2(m7944l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f7384q)) {
            return this.f7384q;
        }
        if (!m7956r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f7373f;
        return insetDrawable == null ? this.f7372e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8017N0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8020O0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8023P0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return Math.max(0.0f, c1488a.m8026Q0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f7372e;
    }

    public float getChipEndPadding() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8029R0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8032S0();
        }
        return null;
    }

    public float getChipIconSize() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8035T0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8038U0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8041V0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8044W0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8046X0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8048Y0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8050Z0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8052a1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8054b1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8056c1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8058d1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8062f1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8068j1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f7386s && (this.f7385r.m1506A() == 1 || this.f7385r.m1523x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C0179d getHideMotionSpec() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8070k1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8071l1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8073m1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8075n1();
        }
        return null;
    }

    public C0641l getShapeAppearanceModel() {
        return this.f7372e.m2261H();
    }

    public C0179d getShowMotionSpec() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8077o1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8083r1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            return c1488a.m8085s1();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m7955m(int i3) {
        this.f7383p = i3;
        if (!m7959v()) {
            if (this.f7373f != null) {
                m7949u();
            } else {
                m7952y();
            }
            return false;
        }
        int iMax = Math.max(0, i3 - this.f7372e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i3 - this.f7372e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f7373f != null) {
                m7949u();
            } else {
                m7952y();
            }
            return false;
        }
        int i4 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i5 = iMax > 0 ? iMax / 2 : 0;
        if (this.f7373f != null) {
            Rect rect = new Rect();
            this.f7373f.getPadding(rect);
            if (rect.top == i5 && rect.bottom == i5 && rect.left == i4 && rect.right == i4) {
                m7952y();
                return true;
            }
        }
        if (getMinHeight() != i3) {
            setMinHeight(i3);
        }
        if (getMinWidth() != i3) {
            setMinWidth(i3);
        }
        m7948q(i4, i5, i4, i5);
        m7952y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0638i.m2301f(this, this.f7372e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i3) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7370y);
        }
        if (m7956r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7371z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z2, int i3, Rect rect) {
        super.onFocusChanged(z2, i3, rect);
        if (this.f7386s) {
            this.f7385r.m1510I(z2, i3, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m7956r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i3) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i3);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        if (this.f7382o != i3) {
            this.f7382o = i3;
            m7931A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f7378k
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f7378k
            if (r0 == 0) goto L35
            r5.m7958t()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: r */
    public boolean m7956r() {
        C1488a c1488a = this.f7372e;
        return c1488a != null && c1488a.m8092w1();
    }

    /* JADX INFO: renamed from: s */
    public boolean m7957s() {
        C1488a c1488a = this.f7372e;
        return c1488a != null && c1488a.m8097y1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f7384q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7374g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0889f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7374g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0889f, android.view.View
    public void setBackgroundResource(int i3) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8003G1(z2);
        }
    }

    public void setCheckableResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8005H1(i3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C1488a c1488a = this.f7372e;
        if (c1488a == null) {
            this.f7377j = z2;
        } else if (c1488a.m8092w1()) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8007I1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i3) {
        setCheckedIconVisible(i3);
    }

    public void setCheckedIconResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8009J1(i3);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8011K1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8013L1(i3);
        }
    }

    public void setCheckedIconVisible(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8015M1(i3);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8021O1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8024P1(i3);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8027Q1(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8030R1(i3);
        }
    }

    public void setChipDrawable(C1488a c1488a) {
        C1488a c1488a2 = this.f7372e;
        if (c1488a2 != c1488a) {
            m7950w(c1488a2);
            this.f7372e = c1488a;
            c1488a.m8010J2(false);
            m7943k(this.f7372e);
            m7955m(this.f7383p);
        }
    }

    public void setChipEndPadding(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8033S1(f3);
        }
    }

    public void setChipEndPaddingResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8036T1(i3);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8039U1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i3) {
        setChipIconVisible(i3);
    }

    public void setChipIconResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8042V1(i3);
        }
    }

    public void setChipIconSize(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8045W1(f3);
        }
    }

    public void setChipIconSizeResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8047X1(i3);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8049Y1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8051Z1(i3);
        }
    }

    public void setChipIconVisible(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8053a2(i3);
        }
    }

    public void setChipMinHeight(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8057c2(f3);
        }
    }

    public void setChipMinHeightResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8059d2(i3);
        }
    }

    public void setChipStartPadding(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8061e2(f3);
        }
    }

    public void setChipStartPaddingResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8063f2(i3);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8065g2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8066h2(i3);
        }
    }

    public void setChipStrokeWidth(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8067i2(f3);
        }
    }

    public void setChipStrokeWidthResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8069j2(i3);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i3) {
        setText(getResources().getString(i3));
    }

    public void setCloseIcon(Drawable drawable) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8072l2(drawable);
        }
        m7951x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8074m2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i3) {
        setCloseIconVisible(i3);
    }

    public void setCloseIconEndPadding(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8076n2(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8078o2(i3);
        }
    }

    public void setCloseIconResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8080p2(i3);
        }
        m7951x();
    }

    public void setCloseIconSize(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8082q2(f3);
        }
    }

    public void setCloseIconSizeResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8084r2(i3);
        }
    }

    public void setCloseIconStartPadding(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8086s2(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8087t2(i3);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8091v2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8093w2(i3);
        }
    }

    public void setCloseIconVisible(int i3) {
        setCloseIconVisible(getResources().getBoolean(i3));
    }

    @Override // androidx.appcompat.widget.C0889f, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C0889f, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, i4, i5, i6);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m2273b0(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f7372e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8099z2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f7381n = z2;
        m7955m(this.f7383p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i3) {
        if (i3 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i3);
        }
    }

    public void setHideMotionSpec(C0179d c0179d) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m7994A2(c0179d);
        }
    }

    public void setHideMotionSpecResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m7996B2(i3);
        }
    }

    public void setIconEndPadding(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m7997C2(f3);
        }
    }

    public void setIconEndPaddingResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m7999D2(i3);
        }
    }

    public void setIconStartPadding(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8000E2(f3);
        }
    }

    public void setIconStartPaddingResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8002F2(i3);
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC1536g interfaceC1536g) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i3) {
        if (this.f7372e == null) {
            return;
        }
        super.setLayoutDirection(i3);
    }

    @Override // android.widget.TextView
    public void setLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i3) {
        super.setMaxWidth(i3);
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8004G2(i3);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i3);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7376i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f7375h = onClickListener;
        m7951x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8006H2(colorStateList);
        }
        if (this.f7372e.m8089u1()) {
            return;
        }
        m7953z();
    }

    public void setRippleColorResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8008I2(i3);
            if (this.f7372e.m8089u1()) {
                return;
            }
            m7953z();
        }
    }

    @Override // p076Z0.InterfaceC0644o
    public void setShapeAppearanceModel(C0641l c0641l) {
        this.f7372e.setShapeAppearanceModel(c0641l);
    }

    public void setShowMotionSpec(C0179d c0179d) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8012K2(c0179d);
        }
    }

    public void setShowMotionSpecResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8014L2(i3);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1488a c1488a = this.f7372e;
        if (c1488a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1488a.m8043V2() ? null : charSequence, bufferType);
        C1488a c1488a2 = this.f7372e;
        if (c1488a2 != null) {
            c1488a2.m8016M2(charSequence);
        }
    }

    public void setTextAppearance(C0559e c0559e) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8019N2(c0559e);
        }
        m7932B();
    }

    public void setTextAppearanceResource(int i3) {
        setTextAppearance(getContext(), i3);
    }

    public void setTextEndPadding(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8025P2(f3);
        }
    }

    public void setTextEndPaddingResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8028Q2(i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i3, float f3) {
        super.setTextSize(i3, f3);
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8031R2(TypedValue.applyDimension(i3, f3, getResources().getDisplayMetrics()));
        }
        m7932B();
    }

    public void setTextStartPadding(float f3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8034S2(f3);
        }
    }

    public void setTextStartPaddingResource(int i3) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8037T2(i3);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m7958t() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f7375h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        if (this.f7386s) {
            this.f7385r.m1519U(1, 1);
        }
        return z2;
    }

    /* JADX INFO: renamed from: v */
    public boolean m7959v() {
        return this.f7381n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f7368w;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i4), attributeSet, i3);
        this.f7387t = new Rect();
        this.f7388u = new RectF();
        this.f7389v = new C1485a();
        Context context2 = getContext();
        m7933C(attributeSet);
        C1488a c1488aM7965D0 = C1488a.m7965D0(context2, attributeSet, i3, i4);
        m7946o(context2, attributeSet, i3);
        setChipDrawable(c1488aM7965D0);
        c1488aM7965D0.m2273b0(getElevation());
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context2, attributeSet, AbstractC0150k.f712N0, i3, i4, new int[0]);
        boolean zHasValue = typedArrayM8488i.hasValue(AbstractC0150k.f1061y1);
        typedArrayM8488i.recycle();
        this.f7385r = new C1487c(this);
        m7951x();
        if (!zHasValue) {
            m7947p();
        }
        setChecked(this.f7377j);
        setText(c1488aM7965D0.m8079p1());
        setEllipsize(c1488aM7965D0.m8068j1());
        m7932B();
        if (!this.f7372e.m8043V2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m7931A();
        if (m7959v()) {
            setMinHeight(this.f7383p);
        }
        this.f7382o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: N0.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                Chip.m7934b(this.f1585a, compoundButton, z2);
            }
        });
    }

    public void setCloseIconVisible(boolean z2) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8095x2(z2);
        }
        m7951x();
    }

    public void setCheckedIconVisible(boolean z2) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8018N1(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8055b2(z2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8022O2(i3);
        }
        m7932B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i3) {
        super.setTextAppearance(i3);
        C1488a c1488a = this.f7372e;
        if (c1488a != null) {
            c1488a.m8022O2(i3);
        }
        m7932B();
    }
}
