package p099f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p000A.AbstractC0000a;
import p091d.AbstractC1760a;
import p091d.AbstractC1768i;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: f.d */
/* JADX INFO: loaded from: classes.dex */
public class C1885d extends Drawable {

    /* JADX INFO: renamed from: m */
    private static final float f9375m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a */
    private final Paint f9376a;

    /* JADX INFO: renamed from: b */
    private float f9377b;

    /* JADX INFO: renamed from: c */
    private float f9378c;

    /* JADX INFO: renamed from: d */
    private float f9379d;

    /* JADX INFO: renamed from: e */
    private float f9380e;

    /* JADX INFO: renamed from: f */
    private boolean f9381f;

    /* JADX INFO: renamed from: g */
    private final Path f9382g;

    /* JADX INFO: renamed from: h */
    private final int f9383h;

    /* JADX INFO: renamed from: i */
    private boolean f9384i;

    /* JADX INFO: renamed from: j */
    private float f9385j;

    /* JADX INFO: renamed from: k */
    private float f9386k;

    /* JADX INFO: renamed from: l */
    private int f9387l;

    public C1885d(Context context) {
        Paint paint = new Paint();
        this.f9376a = paint;
        this.f9382g = new Path();
        this.f9384i = false;
        this.f9387l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, AbstractC1769j.f9002Z0, AbstractC1760a.f8725z, AbstractC1768i.f8870b);
        m9760c(typedArrayObtainStyledAttributes.getColor(AbstractC1769j.f9026d1, 0));
        m9759b(typedArrayObtainStyledAttributes.getDimension(AbstractC1769j.f9049h1, 0.0f));
        m9763f(typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f9044g1, true));
        m9761d(Math.round(typedArrayObtainStyledAttributes.getDimension(AbstractC1769j.f9038f1, 0.0f)));
        this.f9383h = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1769j.f9032e1, 0);
        this.f9378c = Math.round(typedArrayObtainStyledAttributes.getDimension(AbstractC1769j.f9020c1, 0.0f));
        this.f9377b = Math.round(typedArrayObtainStyledAttributes.getDimension(AbstractC1769j.f9008a1, 0.0f));
        this.f9379d = typedArrayObtainStyledAttributes.getDimension(AbstractC1769j.f9014b1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private static float m9758a(float f3, float f4, float f5) {
        return f3 + ((f4 - f3) * f5);
    }

    /* JADX INFO: renamed from: b */
    public void m9759b(float f3) {
        if (this.f9376a.getStrokeWidth() != f3) {
            this.f9376a.setStrokeWidth(f3);
            this.f9386k = (float) (((double) (f3 / 2.0f)) * Math.cos(f9375m));
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m9760c(int i3) {
        if (i3 != this.f9376a.getColor()) {
            this.f9376a.setColor(i3);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m9761d(float f3) {
        if (f3 != this.f9380e) {
            this.f9380e = f3;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i3 = this.f9387l;
        boolean z2 = false;
        if (i3 != 0 && (i3 == 1 || (i3 == 3 ? AbstractC0000a.m5f(this) == 0 : AbstractC0000a.m5f(this) == 1))) {
            z2 = true;
        }
        float f3 = this.f9377b;
        float fM9758a = m9758a(this.f9378c, (float) Math.sqrt(f3 * f3 * 2.0f), this.f9385j);
        float fM9758a2 = m9758a(this.f9378c, this.f9379d, this.f9385j);
        float fRound = Math.round(m9758a(0.0f, this.f9386k, this.f9385j));
        float fM9758a3 = m9758a(0.0f, f9375m, this.f9385j);
        float fM9758a4 = m9758a(z2 ? 0.0f : -180.0f, z2 ? 180.0f : 0.0f, this.f9385j);
        double d3 = fM9758a;
        double d4 = fM9758a3;
        boolean z3 = z2;
        float fRound2 = Math.round(Math.cos(d4) * d3);
        float fRound3 = Math.round(d3 * Math.sin(d4));
        this.f9382g.rewind();
        float fM9758a5 = m9758a(this.f9380e + this.f9376a.getStrokeWidth(), -this.f9386k, this.f9385j);
        float f4 = (-fM9758a2) / 2.0f;
        this.f9382g.moveTo(f4 + fRound, 0.0f);
        this.f9382g.rLineTo(fM9758a2 - (fRound * 2.0f), 0.0f);
        this.f9382g.moveTo(f4, fM9758a5);
        this.f9382g.rLineTo(fRound2, fRound3);
        this.f9382g.moveTo(f4, -fM9758a5);
        this.f9382g.rLineTo(fRound2, -fRound3);
        this.f9382g.close();
        canvas.save();
        float strokeWidth = this.f9376a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (r5 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.f9380e);
        if (this.f9381f) {
            canvas.rotate(fM9758a4 * (this.f9384i ^ z3 ? -1 : 1));
        } else if (z3) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f9382g, this.f9376a);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m9762e(float f3) {
        if (this.f9385j != f3) {
            this.f9385j = f3;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9763f(boolean z2) {
        if (this.f9381f != z2) {
            this.f9381f = z2;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m9764g(boolean z2) {
        if (this.f9384i != z2) {
            this.f9384i = z2;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9383h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9383h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        if (i3 != this.f9376a.getAlpha()) {
            this.f9376a.setAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9376a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
