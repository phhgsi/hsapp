package p099f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p000A.AbstractC0000a;

/* JADX INFO: renamed from: f.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1884c extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    private Drawable f9374a;

    public AbstractC1884c(Drawable drawable) {
        m9757a(drawable);
    }

    /* JADX INFO: renamed from: a */
    public void m9757a(Drawable drawable) {
        Drawable drawable2 = this.f9374a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9374a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f9374a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f9374a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f9374a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9374a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9374a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f9374a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f9374a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f9374a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f9374a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f9374a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f9374a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return AbstractC0000a.m7h(this.f9374a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f9374a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f9374a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f9374a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i3) {
        return this.f9374a.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        this.f9374a.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        AbstractC0000a.m9j(this.f9374a, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i3) {
        this.f9374a.setChangingConfigurations(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9374a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f9374a.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f9374a.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f3, float f4) {
        AbstractC0000a.m10k(this.f9374a, f3, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i3, int i4, int i5, int i6) {
        AbstractC0000a.m11l(this.f9374a, i3, i4, i5, i6);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f9374a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i3) {
        AbstractC0000a.m13n(this.f9374a, i3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC0000a.m14o(this.f9374a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC0000a.m15p(this.f9374a, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f9374a.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
