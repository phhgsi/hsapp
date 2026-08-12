package p018G;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: G.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0152a extends Drawable {

    /* JADX INFO: renamed from: a */
    private final Drawable f1081a;

    /* JADX INFO: renamed from: b */
    private final float f1082b;

    /* JADX INFO: renamed from: c */
    private final Path f1083c;

    public C0152a(Drawable drawable, float f3) {
        AbstractC0606k.m2145e(drawable, "drawable");
        this.f1081a = drawable;
        this.f1082b = f3;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f3 / 2.0f, Path.Direction.CW);
        this.f1083c = path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC0606k.m2145e(canvas, "canvas");
        canvas.clipPath(this.f1083c);
        this.f1081a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1081a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        AbstractC0606k.m2145e(rect, "bounds");
        super.onBoundsChange(rect);
        this.f1081a.setBounds(rect);
        this.f1083c.offset(rect.exactCenterX(), rect.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        this.f1081a.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1081a.setColorFilter(colorFilter);
    }
}
