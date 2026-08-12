package p073Y0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: Y0.a */
/* JADX INFO: loaded from: classes.dex */
public class C0621a {

    /* JADX INFO: renamed from: i */
    private static final int[] f2027i = new int[3];

    /* JADX INFO: renamed from: j */
    private static final float[] f2028j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    private static final int[] f2029k = new int[4];

    /* JADX INFO: renamed from: l */
    private static final float[] f2030l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    private final Paint f2031a;

    /* JADX INFO: renamed from: b */
    private final Paint f2032b;

    /* JADX INFO: renamed from: c */
    private final Paint f2033c;

    /* JADX INFO: renamed from: d */
    private int f2034d;

    /* JADX INFO: renamed from: e */
    private int f2035e;

    /* JADX INFO: renamed from: f */
    private int f2036f;

    /* JADX INFO: renamed from: g */
    private final Path f2037g;

    /* JADX INFO: renamed from: h */
    private final Paint f2038h;

    public C0621a() {
        this(-16777216);
    }

    /* JADX INFO: renamed from: a */
    public void m2207a(Canvas canvas, Matrix matrix, RectF rectF, int i3, float f3, float f4) {
        float f5;
        boolean z2 = f4 < 0.0f;
        Path path = this.f2037g;
        if (z2) {
            int[] iArr = f2029k;
            iArr[0] = 0;
            iArr[1] = this.f2036f;
            iArr[2] = this.f2035e;
            iArr[3] = this.f2034d;
            f5 = f3;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f5 = f3;
            path.arcTo(rectF, f5, f4);
            path.close();
            float f6 = -i3;
            rectF.inset(f6, f6);
            int[] iArr2 = f2029k;
            iArr2[0] = 0;
            iArr2[1] = this.f2034d;
            iArr2[2] = this.f2035e;
            iArr2[3] = this.f2036f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f7 = 1.0f - (i3 / fWidth);
        float[] fArr = f2030l;
        fArr[1] = f7;
        fArr[2] = ((1.0f - f7) / 2.0f) + f7;
        this.f2032b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f2029k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f2038h);
        }
        canvas.drawArc(rectF, f5, f4, true, this.f2032b);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public void m2208b(Canvas canvas, Matrix matrix, RectF rectF, int i3) {
        rectF.bottom += i3;
        rectF.offset(0.0f, -i3);
        int[] iArr = f2027i;
        iArr[0] = this.f2036f;
        iArr[1] = this.f2035e;
        iArr[2] = this.f2034d;
        Paint paint = this.f2033c;
        float f3 = rectF.left;
        paint.setShader(new LinearGradient(f3, rectF.top, f3, rectF.bottom, iArr, f2028j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f2033c);
        canvas.restore();
    }

    /* JADX INFO: renamed from: c */
    public Paint m2209c() {
        return this.f2031a;
    }

    /* JADX INFO: renamed from: d */
    public void m2210d(int i3) {
        this.f2034d = AbstractC2571d.m12269k(i3, 68);
        this.f2035e = AbstractC2571d.m12269k(i3, 20);
        this.f2036f = AbstractC2571d.m12269k(i3, 0);
        this.f2031a.setColor(this.f2034d);
    }

    public C0621a(int i3) {
        this.f2037g = new Path();
        Paint paint = new Paint();
        this.f2038h = paint;
        this.f2031a = new Paint();
        m2210d(i3);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f2032b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f2033c = new Paint(paint2);
    }
}
