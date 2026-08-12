package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.app.AbstractC0740E;
import androidx.appcompat.widget.C0888e0;
import androidx.appcompat.widget.C0889f;
import androidx.core.widget.AbstractC0982c;
import androidx.vectordrawable.graphics.drawable.AbstractC1283b;
import androidx.vectordrawable.graphics.drawable.C1284c;
import com.google.android.material.drawable.AbstractC1519d;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.AbstractC1549t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0143d;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0148i;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p037M0.AbstractC0392a;
import p037M0.AbstractC0393b;
import p043O0.AbstractC0450a;
import p067W0.AbstractC0557c;
import p089c1.AbstractC1313a;
import p091d.AbstractC1760a;
import p095e.AbstractC1832a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends C0889f {

    /* JADX INFO: renamed from: A */
    private static final int[] f7341A;

    /* JADX INFO: renamed from: B */
    private static final int[][] f7342B;

    /* JADX INFO: renamed from: C */
    private static final int f7343C;

    /* JADX INFO: renamed from: y */
    private static final int f7344y = AbstractC0149j.f586s;

    /* JADX INFO: renamed from: z */
    private static final int[] f7345z = {AbstractC0140a.f327T};

    /* JADX INFO: renamed from: e */
    private final LinkedHashSet f7346e;

    /* JADX INFO: renamed from: f */
    private final LinkedHashSet f7347f;

    /* JADX INFO: renamed from: g */
    private ColorStateList f7348g;

    /* JADX INFO: renamed from: h */
    private boolean f7349h;

    /* JADX INFO: renamed from: i */
    private boolean f7350i;

    /* JADX INFO: renamed from: j */
    private boolean f7351j;

    /* JADX INFO: renamed from: k */
    private CharSequence f7352k;

    /* JADX INFO: renamed from: l */
    private Drawable f7353l;

    /* JADX INFO: renamed from: m */
    private Drawable f7354m;

    /* JADX INFO: renamed from: n */
    private boolean f7355n;

    /* JADX INFO: renamed from: o */
    ColorStateList f7356o;

    /* JADX INFO: renamed from: p */
    ColorStateList f7357p;

    /* JADX INFO: renamed from: q */
    private PorterDuff.Mode f7358q;

    /* JADX INFO: renamed from: r */
    private int f7359r;

    /* JADX INFO: renamed from: s */
    private int[] f7360s;

    /* JADX INFO: renamed from: t */
    private boolean f7361t;

    /* JADX INFO: renamed from: u */
    private CharSequence f7362u;

    /* JADX INFO: renamed from: v */
    private CompoundButton.OnCheckedChangeListener f7363v;

    /* JADX INFO: renamed from: w */
    private final C1284c f7364w;

    /* JADX INFO: renamed from: x */
    private final AbstractC1283b f7365x;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1483a();

        /* JADX INFO: renamed from: d */
        int f7366d;

        /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$SavedState$a */
        class C1483a implements Parcelable.Creator {
            C1483a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C1484a c1484a) {
            this(parcel);
        }

        /* JADX INFO: renamed from: a */
        private String m7928a() {
            int i3 = this.f7366d;
            return i3 != 1 ? i3 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + m7928a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeValue(Integer.valueOf(this.f7366d));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f7366d = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$a */
    class C1484a extends AbstractC1283b {
        C1484a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1283b
        /* JADX INFO: renamed from: b */
        public void mo1933b(Drawable drawable) {
            super.mo1933b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f7356o;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1283b
        /* JADX INFO: renamed from: c */
        public void mo6476c(Drawable drawable) {
            super.mo6476c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f7356o;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.f7360s, MaterialCheckBox.this.f7356o.getDefaultColor()));
            }
        }
    }

    static {
        int i3 = AbstractC0140a.f326S;
        f7341A = new int[]{i3};
        f7342B = new int[][]{new int[]{R.attr.state_enabled, i3}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f7343C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8714o);
    }

    /* JADX INFO: renamed from: c */
    private boolean m7922c(C0888e0 c0888e0) {
        return c0888e0.m3779n(AbstractC0150k.f643F3, 0) == f7343C && c0888e0.m3779n(AbstractC0150k.f652G3, 0) == 0;
    }

    /* JADX INFO: renamed from: e */
    private void m7923e() {
        this.f7353l = AbstractC1519d.m8250c(this.f7353l, this.f7356o, AbstractC0982c.m4352c(this));
        this.f7354m = AbstractC1519d.m8250c(this.f7354m, this.f7357p, this.f7358q);
        m7925g();
        m7926h();
        super.setButtonDrawable(AbstractC1519d.m8248a(this.f7353l, this.f7354m));
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: f */
    private void m7924f() {
        if (Build.VERSION.SDK_INT < 30 || this.f7362u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    /* JADX INFO: renamed from: g */
    private void m7925g() {
        C1284c c1284c;
        if (this.f7355n) {
            C1284c c1284c2 = this.f7364w;
            if (c1284c2 != null) {
                c1284c2.m6484g(this.f7365x);
                this.f7364w.m6483c(this.f7365x);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f7353l;
                if (!(drawable instanceof AnimatedStateListDrawable) || (c1284c = this.f7364w) == null) {
                    return;
                }
                int i3 = AbstractC0144e.f482b;
                int i4 = AbstractC0144e.f480Y;
                ((AnimatedStateListDrawable) drawable).addTransition(i3, i4, c1284c, false);
                ((AnimatedStateListDrawable) this.f7353l).addTransition(AbstractC0144e.f488h, i4, this.f7364w, false);
            }
        }
    }

    private String getButtonStateDescription() {
        int i3 = this.f7359r;
        return i3 == 1 ? getResources().getString(AbstractC0148i.f551k) : i3 == 0 ? getResources().getString(AbstractC0148i.f553m) : getResources().getString(AbstractC0148i.f552l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7348g == null) {
            int[][] iArr = f7342B;
            int[] iArr2 = new int[iArr.length];
            int iM1632d = AbstractC0450a.m1632d(this, AbstractC1760a.f8718s);
            int iM1632d2 = AbstractC0450a.m1632d(this, AbstractC1760a.f8721v);
            int iM1632d3 = AbstractC0450a.m1632d(this, AbstractC0140a.f341i);
            int iM1632d4 = AbstractC0450a.m1632d(this, AbstractC0140a.f339g);
            iArr2[0] = AbstractC0450a.m1638j(iM1632d3, iM1632d2, 1.0f);
            iArr2[1] = AbstractC0450a.m1638j(iM1632d3, iM1632d, 1.0f);
            iArr2[2] = AbstractC0450a.m1638j(iM1632d3, iM1632d4, 0.54f);
            iArr2[3] = AbstractC0450a.m1638j(iM1632d3, iM1632d4, 0.38f);
            iArr2[4] = AbstractC0450a.m1638j(iM1632d3, iM1632d4, 0.38f);
            this.f7348g = new ColorStateList(iArr, iArr2);
        }
        return this.f7348g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f7356o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: h */
    private void m7926h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f7353l;
        if (drawable != null && (colorStateList2 = this.f7356o) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f7354m;
        if (drawable2 == null || (colorStateList = this.f7357p) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public boolean m7927d() {
        return this.f7351j;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f7353l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f7354m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f7357p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f7358q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f7356o;
    }

    public int getCheckedState() {
        return this.f7359r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f7352k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f7359r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7349h && this.f7356o == null && this.f7357p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i3) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7345z);
        }
        if (m7927d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7341A);
        }
        this.f7360s = AbstractC1519d.m8252e(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableM4350a;
        if (!this.f7350i || !TextUtils.isEmpty(getText()) || (drawableM4350a = AbstractC0982c.m4350a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM4350a.getIntrinsicWidth()) / 2) * (AbstractC1549t.m8502g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM4350a.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && m7927d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f7352k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f7366d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7366d = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.C0889f, android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(AbstractC1832a.m9609b(getContext(), i3));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f7354m = drawable;
        m7923e();
    }

    public void setButtonIconDrawableResource(int i3) {
        setButtonIconDrawable(AbstractC1832a.m9609b(getContext(), i3));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f7357p == colorStateList) {
            return;
        }
        this.f7357p = colorStateList;
        m7923e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f7358q == mode) {
            return;
        }
        this.f7358q = mode;
        m7923e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f7356o == colorStateList) {
            return;
        }
        this.f7356o = colorStateList;
        m7923e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m7923e();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f7350i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i3) {
        AutofillManager autofillManagerM1390a;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f7359r != i3) {
            this.f7359r = i3;
            super.setChecked(i3 == 1);
            refreshDrawableState();
            m7924f();
            if (this.f7361t) {
                return;
            }
            this.f7361t = true;
            LinkedHashSet linkedHashSet = this.f7347f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC0740E.m2693a(it.next());
                    throw null;
                }
            }
            if (this.f7359r != 2 && (onCheckedChangeListener = this.f7363v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerM1390a = AbstractC0393b.m1390a(getContext().getSystemService(AbstractC0392a.m1389a()))) != null) {
                autofillManagerM1390a.notifyValueChanged(this);
            }
            this.f7361t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f7352k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i3) {
        setErrorAccessibilityLabel(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f7351j == z2) {
            return;
        }
        this.f7351j = z2;
        refreshDrawableState();
        Iterator it = this.f7346e.iterator();
        if (it.hasNext()) {
            AbstractC0740E.m2693a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7363v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f7362u = charSequence;
        if (charSequence == null) {
            m7924f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f7349h = z2;
        if (z2) {
            AbstractC0982c.m4353d(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0982c.m4353d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f7344y;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i4), attributeSet, i3);
        this.f7346e = new LinkedHashSet();
        this.f7347f = new LinkedHashSet();
        this.f7364w = C1284c.m6477a(getContext(), AbstractC0143d.f450f);
        this.f7365x = new C1484a();
        Context context2 = getContext();
        this.f7353l = AbstractC0982c.m4350a(this);
        this.f7356o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C0888e0 c0888e0M8489j = AbstractC1546q.m8489j(context2, attributeSet, AbstractC0150k.f634E3, i3, i4, new int[0]);
        this.f7354m = c0888e0M8489j.m3772g(AbstractC0150k.f661H3);
        if (this.f7353l != null && AbstractC1546q.m8486g(context2) && m7922c(c0888e0M8489j)) {
            super.setButtonDrawable((Drawable) null);
            this.f7353l = AbstractC1832a.m9609b(context2, AbstractC0143d.f449e);
            this.f7355n = true;
            if (this.f7354m == null) {
                this.f7354m = AbstractC1832a.m9609b(context2, AbstractC0143d.f451g);
            }
        }
        this.f7357p = AbstractC0557c.m2078b(context2, c0888e0M8489j, AbstractC0150k.f670I3);
        this.f7358q = AbstractC1549t.m8503h(c0888e0M8489j.m3776k(AbstractC0150k.f679J3, -1), PorterDuff.Mode.SRC_IN);
        this.f7349h = c0888e0M8489j.m3766a(AbstractC0150k.f724O3, false);
        this.f7350i = c0888e0M8489j.m3766a(AbstractC0150k.f688K3, true);
        this.f7351j = c0888e0M8489j.m3766a(AbstractC0150k.f715N3, false);
        this.f7352k = c0888e0M8489j.m3781p(AbstractC0150k.f706M3);
        int i5 = AbstractC0150k.f697L3;
        if (c0888e0M8489j.m3784s(i5)) {
            setCheckedState(c0888e0M8489j.m3776k(i5, 0));
        }
        c0888e0M8489j.m3786x();
        m7923e();
    }

    @Override // androidx.appcompat.widget.C0889f, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f7353l = drawable;
        this.f7355n = false;
        m7923e();
    }
}
