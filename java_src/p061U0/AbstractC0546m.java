package p061U0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: renamed from: U0.m */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0546m {

    /* JADX INFO: renamed from: a */
    AbstractC0536c f1922a;

    /* JADX INFO: renamed from: b */
    final Path f1923b;

    /* JADX INFO: renamed from: c */
    final Path f1924c;

    /* JADX INFO: renamed from: d */
    final PathMeasure f1925d;

    /* JADX INFO: renamed from: e */
    final Matrix f1926e;

    /* JADX INFO: renamed from: U0.m$a */
    protected static class a {

        /* JADX INFO: renamed from: a */
        float f1927a;

        /* JADX INFO: renamed from: b */
        float f1928b;

        /* JADX INFO: renamed from: c */
        int f1929c;

        /* JADX INFO: renamed from: d */
        int f1930d;

        /* JADX INFO: renamed from: e */
        float f1931e = 1.0f;

        /* JADX INFO: renamed from: f */
        float f1932f;

        /* JADX INFO: renamed from: g */
        float f1933g;

        /* JADX INFO: renamed from: h */
        boolean f1934h;

        protected a() {
        }
    }

    public AbstractC0546m(AbstractC0536c abstractC0536c) {
        Path path = new Path();
        this.f1923b = path;
        this.f1924c = new Path();
        this.f1925d = new PathMeasure(path, false);
        this.f1922a = abstractC0536c;
        this.f1926e = new Matrix();
    }

    /* JADX INFO: renamed from: a */
    abstract void mo1949a(Canvas canvas, Rect rect, float f3, boolean z2, boolean z3);

    /* JADX INFO: renamed from: b */
    abstract void mo1950b(Canvas canvas, Paint paint, int i3, int i4);

    /* JADX INFO: renamed from: c */
    abstract void mo1951c(Canvas canvas, Paint paint, a aVar, int i3);

    /* JADX INFO: renamed from: d */
    abstract void mo1952d(Canvas canvas, Paint paint, float f3, float f4, int i3, int i4, int i5);

    /* JADX INFO: renamed from: e */
    abstract int mo1953e();

    /* JADX INFO: renamed from: f */
    abstract int mo1954f();

    /* JADX INFO: renamed from: g */
    abstract void mo1955g();

    /* JADX INFO: renamed from: h */
    void m2044h(Canvas canvas, Rect rect, float f3, boolean z2, boolean z3) {
        this.f1922a.m1941h();
        mo1949a(canvas, rect, f3, z2, z3);
    }

    /* JADX INFO: renamed from: i */
    float m2045i(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    /* JADX INFO: renamed from: U0.m$b */
    protected class b {

        /* JADX INFO: renamed from: a */
        float[] f1935a;

        /* JADX INFO: renamed from: b */
        float[] f1936b;

        /* JADX INFO: renamed from: c */
        final Matrix f1937c;

        public b() {
            this.f1935a = new float[2];
            this.f1936b = new float[]{1.0f, 0.0f};
            this.f1937c = new Matrix();
        }

        /* JADX INFO: renamed from: a */
        void m2046a(float f3) {
            float[] fArr = this.f1936b;
            float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            float[] fArr2 = this.f1935a;
            double d3 = f3;
            double d4 = fAtan2;
            fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d4) * d3));
            float[] fArr3 = this.f1935a;
            fArr3[1] = (float) (((double) fArr3[1]) + (d3 * Math.sin(d4)));
        }

        /* JADX INFO: renamed from: b */
        void m2047b(float f3) {
            float[] fArr = this.f1936b;
            float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
            float[] fArr2 = this.f1935a;
            double d3 = f3;
            double d4 = fAtan2;
            fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d4) * d3));
            float[] fArr3 = this.f1935a;
            fArr3[1] = (float) (((double) fArr3[1]) + (d3 * Math.sin(d4)));
        }

        /* JADX INFO: renamed from: c */
        public void m2048c() {
            Arrays.fill(this.f1935a, 0.0f);
            Arrays.fill(this.f1936b, 0.0f);
            this.f1936b[0] = 1.0f;
            this.f1937c.reset();
        }

        /* JADX INFO: renamed from: d */
        public void m2049d(float f3) {
            this.f1937c.reset();
            this.f1937c.setRotate(f3);
            this.f1937c.mapPoints(this.f1935a);
            this.f1937c.mapPoints(this.f1936b);
        }

        public b(AbstractC0546m abstractC0546m, b bVar) {
            this(bVar.f1935a, bVar.f1936b);
        }

        public b(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.f1935a = fArr3;
            this.f1936b = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.f1936b, 0, 2);
            this.f1937c = new Matrix();
        }
    }
}
