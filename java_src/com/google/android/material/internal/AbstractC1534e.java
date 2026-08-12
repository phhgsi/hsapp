package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.AbstractC0840Q;
import p016F0.AbstractC0150k;

/* JADX INFO: renamed from: com.google.android.material.internal.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1534e extends AbstractC0840Q {

    /* JADX INFO: renamed from: p */
    private Drawable f7719p;

    /* JADX INFO: renamed from: q */
    private final Rect f7720q;

    /* JADX INFO: renamed from: r */
    private final Rect f7721r;

    /* JADX INFO: renamed from: s */
    private int f7722s;

    /* JADX INFO: renamed from: t */
    protected boolean f7723t;

    /* JADX INFO: renamed from: u */
    boolean f7724u;

    public AbstractC1534e(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f7720q = new Rect();
        this.f7721r = new Rect();
        this.f7722s = 119;
        this.f7723t = true;
        this.f7724u = false;
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context, attributeSet, AbstractC0150k.f851c2, i3, 0, new int[0]);
        this.f7722s = typedArrayM8488i.getInt(AbstractC0150k.f871e2, this.f7722s);
        Drawable drawable = typedArrayM8488i.getDrawable(AbstractC0150k.f861d2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f7723t = typedArrayM8488i.getBoolean(AbstractC0150k.f881f2, true);
        typedArrayM8488i.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f7719p;
        if (drawable != null) {
            if (this.f7724u) {
                this.f7724u = false;
                Rect rect = this.f7720q;
                Rect rect2 = this.f7721r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f7723t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f7722s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f7719p;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7719p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f7719p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f7719p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f7722s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7719p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0840Q, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        this.f7724u = z2 | this.f7724u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        this.f7724u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f7719p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f7719p);
            }
            this.f7719p = drawable;
            this.f7724u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f7722s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i3) {
        if (this.f7722s != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f7722s = i3;
            if (i3 == 119 && this.f7719p != null) {
                this.f7719p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7719p;
    }
}
