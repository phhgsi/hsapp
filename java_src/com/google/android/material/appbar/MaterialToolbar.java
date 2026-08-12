package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.drawable.AbstractC1519d;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.AbstractC1547r;
import p000A.AbstractC0000a;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p076Z0.AbstractC0638i;
import p076Z0.C0637h;
import p089c1.AbstractC1313a;
import p091d.AbstractC1760a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: c0 */
    private static final int f6934c0 = AbstractC0149j.f567A;

    /* JADX INFO: renamed from: d0 */
    private static final ImageView.ScaleType[] f6935d0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: U */
    private Integer f6936U;

    /* JADX INFO: renamed from: V */
    private boolean f6937V;

    /* JADX INFO: renamed from: W */
    private boolean f6938W;

    /* JADX INFO: renamed from: a0 */
    private ImageView.ScaleType f6939a0;

    /* JADX INFO: renamed from: b0 */
    private Boolean f6940b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8699Q);
    }

    /* JADX INFO: renamed from: U */
    private Pair m7354U(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i3 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i3 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i3 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* JADX INFO: renamed from: V */
    private void m7355V(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC1519d.m8253f(background);
        if (colorStateListValueOf != null) {
            C0637h c0637h = new C0637h();
            c0637h.m2274c0(colorStateListValueOf);
            c0637h.m2266Q(context);
            c0637h.m2273b0(getElevation());
            setBackground(c0637h);
        }
    }

    /* JADX INFO: renamed from: W */
    private void m7356W(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i3 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i4 = measuredWidth2 + i3;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i3, 0), Math.max(i4 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i3 += iMax;
            i4 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i4 - i3, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i3, view.getTop(), i4, view.getBottom());
    }

    /* JADX INFO: renamed from: X */
    private void m7357X() {
        if (this.f6937V || this.f6938W) {
            TextView textViewM8494e = AbstractC1547r.m8494e(this);
            TextView textViewM8492c = AbstractC1547r.m8492c(this);
            if (textViewM8494e == null && textViewM8492c == null) {
                return;
            }
            Pair pairM7354U = m7354U(textViewM8494e, textViewM8492c);
            if (this.f6937V && textViewM8494e != null) {
                m7356W(textViewM8494e, pairM7354U);
            }
            if (!this.f6938W || textViewM8492c == null) {
                return;
            }
            m7356W(textViewM8492c, pairM7354U);
        }
    }

    /* JADX INFO: renamed from: Y */
    private Drawable m7358Y(Drawable drawable) {
        if (drawable == null || this.f6936U == null) {
            return drawable;
        }
        Drawable drawableM17r = AbstractC0000a.m17r(drawable.mutate());
        drawableM17r.setTint(this.f6936U.intValue());
        return drawableM17r;
    }

    /* JADX INFO: renamed from: Z */
    private void m7359Z() {
        ImageView imageViewM8491b = AbstractC1547r.m8491b(this);
        if (imageViewM8491b != null) {
            Boolean bool = this.f6940b0;
            if (bool != null) {
                imageViewM8491b.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f6939a0;
            if (scaleType != null) {
                imageViewM8491b.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f6939a0;
    }

    public Integer getNavigationIconTint() {
        return this.f6936U;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0638i.m2300e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        m7357X();
        m7359Z();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        AbstractC0638i.m2299d(this, f3);
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f6940b0;
        if (bool == null || bool.booleanValue() != z2) {
            this.f6940b0 = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f6939a0 != scaleType) {
            this.f6939a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m7358Y(drawable));
    }

    public void setNavigationIconTint(int i3) {
        this.f6936U = Integer.valueOf(i3);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f6938W != z2) {
            this.f6938W = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f6937V != z2) {
            this.f6937V = z2;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f6934c0;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i4), attributeSet, i3);
        Context context2 = getContext();
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context2, attributeSet, AbstractC0150k.f992q4, i3, i4, new int[0]);
        int i5 = AbstractC0150k.f1019t4;
        if (typedArrayM8488i.hasValue(i5)) {
            setNavigationIconTint(typedArrayM8488i.getColor(i5, -1));
        }
        this.f6937V = typedArrayM8488i.getBoolean(AbstractC0150k.f1037v4, false);
        this.f6938W = typedArrayM8488i.getBoolean(AbstractC0150k.f1028u4, false);
        int i6 = typedArrayM8488i.getInt(AbstractC0150k.f1010s4, -1);
        if (i6 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f6935d0;
            if (i6 < scaleTypeArr.length) {
                this.f6939a0 = scaleTypeArr[i6];
            }
        }
        int i7 = AbstractC0150k.f1001r4;
        if (typedArrayM8488i.hasValue(i7)) {
            this.f6940b0 = Boolean.valueOf(typedArrayM8488i.getBoolean(i7, false));
        }
        typedArrayM8488i.recycle();
        m7355V(context2);
    }
}
