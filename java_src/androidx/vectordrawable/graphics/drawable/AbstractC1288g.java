package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p000A.AbstractC0000a;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1288g extends Drawable {

    /* JADX INFO: renamed from: a */
    Drawable f6250a;

    AbstractC1288g() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m0a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m8i(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i3) {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.setLevel(i3) : super.onLevelChange(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i3) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i3);
        } else {
            super.setChangingConfigurations(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i3, PorterDuff.Mode mode) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.setColorFilter(i3, mode);
        } else {
            super.setColorFilter(i3, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.setFilterBitmap(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f3, float f4) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m10k(drawable, f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i3, int i4, int i5, int i6) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m11l(drawable, i3, i4, i5, i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
