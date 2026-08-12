package p061U0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import p009D.AbstractC0091a;
import p043O0.AbstractC0450a;
import p055S0.AbstractC0505a;
import p061U0.AbstractC0546m;

/* JADX INFO: renamed from: U0.d */
/* JADX INFO: loaded from: classes.dex */
final class C0537d extends AbstractC0546m {

    /* JADX INFO: renamed from: f */
    private float f1840f;

    /* JADX INFO: renamed from: g */
    private float f1841g;

    /* JADX INFO: renamed from: h */
    private float f1842h;

    /* JADX INFO: renamed from: i */
    private float f1843i;

    /* JADX INFO: renamed from: j */
    private float f1844j;

    /* JADX INFO: renamed from: k */
    private float f1845k;

    /* JADX INFO: renamed from: l */
    private int f1846l;

    /* JADX INFO: renamed from: m */
    private float f1847m;

    /* JADX INFO: renamed from: n */
    private boolean f1848n;

    /* JADX INFO: renamed from: o */
    private float f1849o;

    /* JADX INFO: renamed from: p */
    private final RectF f1850p;

    /* JADX INFO: renamed from: q */
    private final Pair f1851q;

    C0537d(C0541h c0541h) {
        super(c0541h);
        this.f1850p = new RectF();
        this.f1851q = new Pair(new AbstractC0546m.b(), new AbstractC0546m.b());
    }

    /* JADX INFO: renamed from: j */
    private void m1942j(Path path, AbstractC0546m.b bVar, AbstractC0546m.b bVar2) {
        float f3 = (this.f1844j / 2.0f) * 0.48f;
        AbstractC0546m.b bVar3 = new AbstractC0546m.b(this, bVar);
        AbstractC0546m.b bVar4 = new AbstractC0546m.b(this, bVar2);
        bVar3.m2047b(f3);
        bVar4.m2047b(-f3);
        float[] fArr = bVar3.f1935a;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float[] fArr2 = bVar4.f1935a;
        float f6 = fArr2[0];
        float f7 = fArr2[1];
        float[] fArr3 = bVar2.f1935a;
        path.cubicTo(f4, f5, f6, f7, fArr3[0], fArr3[1]);
    }

    /* JADX INFO: renamed from: k */
    private void m1943k(PathMeasure pathMeasure, Path path, Pair pair, float f3, float f4, float f5, float f6) {
        float f7 = this.f1842h * f5;
        int i3 = this.f1848n ? ((C0541h) this.f1922a).f1835j : ((C0541h) this.f1922a).f1836k;
        float f8 = this.f1843i;
        if (f8 != this.f1847m || (pathMeasure == this.f1925d && (f7 != this.f1845k || i3 != this.f1846l))) {
            this.f1845k = f7;
            this.f1846l = i3;
            this.f1847m = f8;
            mo1955g();
        }
        path.rewind();
        float f9 = 0.0f;
        float fM257a = AbstractC0091a.m257a(f4, 0.0f, 1.0f);
        if (((C0541h) this.f1922a).m1937b(this.f1848n)) {
            float f10 = f6 / ((float) ((((double) this.f1843i) * 6.283185307179586d) / ((double) this.f1844j)));
            f3 += f10;
            f9 = 0.0f - (f10 * 360.0f);
        }
        float f11 = f3 % 1.0f;
        float length = (pathMeasure.getLength() * f11) / 2.0f;
        float length2 = ((f11 + fM257a) * pathMeasure.getLength()) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        AbstractC0546m.b bVar = (AbstractC0546m.b) pair.first;
        bVar.m2048c();
        pathMeasure.getPosTan(length, bVar.f1935a, bVar.f1936b);
        AbstractC0546m.b bVar2 = (AbstractC0546m.b) pair.second;
        bVar2.m2048c();
        pathMeasure.getPosTan(length2, bVar2.f1935a, bVar2.f1936b);
        this.f1926e.reset();
        this.f1926e.setRotate(f9);
        bVar.m2049d(f9);
        bVar2.m2049d(f9);
        path.transform(this.f1926e);
    }

    /* JADX INFO: renamed from: l */
    private void m1944l(PathMeasure pathMeasure, Path path, float f3) {
        path.rewind();
        float length = pathMeasure.getLength();
        int iMax = Math.max(3, (int) ((length / (this.f1848n ? ((C0541h) this.f1922a).f1835j : ((C0541h) this.f1922a).f1836k)) / 2.0f)) * 2;
        this.f1844j = length / iMax;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < iMax; i3++) {
            AbstractC0546m.b bVar = new AbstractC0546m.b();
            float f4 = i3;
            pathMeasure.getPosTan(this.f1844j * f4, bVar.f1935a, bVar.f1936b);
            AbstractC0546m.b bVar2 = new AbstractC0546m.b();
            float f5 = this.f1844j;
            pathMeasure.getPosTan((f4 * f5) + (f5 / 2.0f), bVar2.f1935a, bVar2.f1936b);
            arrayList.add(bVar);
            bVar2.m2046a(f3 * 2.0f);
            arrayList.add(bVar2);
        }
        arrayList.add((AbstractC0546m.b) arrayList.get(0));
        AbstractC0546m.b bVar3 = (AbstractC0546m.b) arrayList.get(0);
        float[] fArr = bVar3.f1935a;
        int i4 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i4 < arrayList.size()) {
            AbstractC0546m.b bVar4 = (AbstractC0546m.b) arrayList.get(i4);
            m1942j(path, bVar3, bVar4);
            i4++;
            bVar3 = bVar4;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m1945m(Canvas canvas, Paint paint, float f3, float f4, int i3, int i4, int i5, float f5, float f6, boolean z2) {
        float f7 = f4 >= f3 ? f4 - f3 : (f4 + 1.0f) - f3;
        float f8 = f3 % 1.0f;
        if (f8 < 0.0f) {
            f8 += 1.0f;
        }
        if (this.f1849o < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                m1945m(canvas, paint, f8, 1.0f, i3, i4, 0, f5, f6, z2);
                m1945m(canvas, paint, 1.0f, f9, i3, 0, i5, f5, f6, z2);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f1841g / this.f1843i);
        float f10 = f7 - 0.99f;
        if (f10 >= 0.0f) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f7 += f11;
            if (!z2) {
                f8 -= f11 / 2.0f;
            }
        }
        float fM1849c = AbstractC0505a.m1849c(1.0f - this.f1849o, 1.0f, f8);
        float fM1849c2 = AbstractC0505a.m1849c(0.0f, this.f1849o, f7);
        float degrees2 = (float) Math.toDegrees(i4 / this.f1843i);
        float degrees3 = ((fM1849c2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i5 / this.f1843i));
        float f12 = (fM1849c * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z3 = ((C0541h) this.f1922a).m1937b(this.f1848n) && z2 && f5 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i3);
        paint.setStrokeWidth(this.f1840f);
        float f13 = this.f1841g * 2.0f;
        float f14 = degrees * 2.0f;
        if (degrees3 < f14) {
            float f15 = degrees3 / f14;
            float f16 = f12 + (degrees * f15);
            AbstractC0546m.b bVar = new AbstractC0546m.b();
            if (z3) {
                float length = ((f16 / 360.0f) * this.f1925d.getLength()) / 2.0f;
                float f17 = this.f1842h * f5;
                float f18 = this.f1843i;
                if (f18 != this.f1847m || f17 != this.f1845k) {
                    this.f1845k = f17;
                    this.f1847m = f18;
                    mo1955g();
                }
                this.f1925d.getPosTan(length, bVar.f1935a, bVar.f1936b);
            } else {
                bVar.m2049d(f16 + 90.0f);
                bVar.m2046a(-this.f1843i);
            }
            paint.setStyle(Paint.Style.FILL);
            m1947o(canvas, paint, bVar, f13, this.f1840f, f15);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(((C0541h) this.f1922a).m1940g() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f12 + degrees;
        float f20 = degrees3 - f14;
        ((AbstractC0546m.b) this.f1851q.first).m2048c();
        ((AbstractC0546m.b) this.f1851q.second).m2048c();
        if (z3) {
            m1943k(this.f1925d, this.f1924c, this.f1851q, f19 / 360.0f, f20 / 360.0f, f5, f6);
            canvas.drawPath(this.f1924c, paint);
        } else {
            ((AbstractC0546m.b) this.f1851q.first).m2049d(f19 + 90.0f);
            ((AbstractC0546m.b) this.f1851q.first).m2046a(-this.f1843i);
            ((AbstractC0546m.b) this.f1851q.second).m2049d(f19 + f20 + 90.0f);
            ((AbstractC0546m.b) this.f1851q.second).m2046a(-this.f1843i);
            RectF rectF = this.f1850p;
            float f21 = this.f1843i;
            rectF.set(-f21, -f21, f21, f21);
            canvas.drawArc(this.f1850p, f19, f20, false, paint);
        }
        if (((C0541h) this.f1922a).m1940g() || this.f1841g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m1946n(canvas, paint, (AbstractC0546m.b) this.f1851q.first, f13, this.f1840f);
        m1946n(canvas, paint, (AbstractC0546m.b) this.f1851q.second, f13, this.f1840f);
    }

    /* JADX INFO: renamed from: n */
    private void m1946n(Canvas canvas, Paint paint, AbstractC0546m.b bVar, float f3, float f4) {
        m1947o(canvas, paint, bVar, f3, f4, 1.0f);
    }

    /* JADX INFO: renamed from: o */
    private void m1947o(Canvas canvas, Paint paint, AbstractC0546m.b bVar, float f3, float f4, float f5) {
        float fMin = Math.min(f4, this.f1840f);
        float f6 = f3 / 2.0f;
        float fMin2 = Math.min(f6, (this.f1841g * fMin) / this.f1840f);
        RectF rectF = new RectF((-f3) / 2.0f, (-fMin) / 2.0f, f6, fMin / 2.0f);
        canvas.save();
        float[] fArr = bVar.f1935a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(m2045i(bVar.f1936b));
        canvas.scale(f5, f5);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: p */
    private int m1948p() {
        AbstractC0536c abstractC0536c = this.f1922a;
        return ((C0541h) abstractC0536c).f1884p + (((C0541h) abstractC0536c).f1885q * 2);
    }

    @Override // p061U0.AbstractC0546m
    /* JADX INFO: renamed from: a */
    void mo1949a(Canvas canvas, Rect rect, float f3, boolean z2, boolean z3) {
        float fWidth = rect.width() / mo1954f();
        float fHeight = rect.height() / mo1953e();
        AbstractC0536c abstractC0536c = this.f1922a;
        float f4 = (((C0541h) abstractC0536c).f1884p / 2.0f) + ((C0541h) abstractC0536c).f1885q;
        canvas.translate((f4 * fWidth) + rect.left, (f4 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((C0541h) this.f1922a).f1886r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f5 = -f4;
        canvas.clipRect(f5, f5, f4, f4);
        AbstractC0536c abstractC0536c2 = this.f1922a;
        this.f1840f = ((C0541h) abstractC0536c2).f1826a * f3;
        this.f1841g = Math.min(((C0541h) abstractC0536c2).f1826a / 2, ((C0541h) abstractC0536c2).m1936a()) * f3;
        AbstractC0536c abstractC0536c3 = this.f1922a;
        this.f1842h = ((C0541h) abstractC0536c3).f1837l * f3;
        float f6 = (((C0541h) abstractC0536c3).f1884p - ((C0541h) abstractC0536c3).f1826a) / 2.0f;
        this.f1843i = f6;
        if (z2 || z3) {
            float f7 = ((1.0f - f3) * ((C0541h) abstractC0536c3).f1826a) / 2.0f;
            if ((z2 && ((C0541h) abstractC0536c3).f1832g == 2) || (z3 && ((C0541h) abstractC0536c3).f1833h == 1)) {
                this.f1843i = f6 + f7;
            } else if ((z2 && ((C0541h) abstractC0536c3).f1832g == 1) || (z3 && ((C0541h) abstractC0536c3).f1833h == 2)) {
                this.f1843i = f6 - f7;
            }
        }
        if (z3 && ((C0541h) abstractC0536c3).f1833h == 3) {
            this.f1849o = f3;
        } else {
            this.f1849o = 1.0f;
        }
    }

    @Override // p061U0.AbstractC0546m
    /* JADX INFO: renamed from: c */
    void mo1951c(Canvas canvas, Paint paint, AbstractC0546m.a aVar, int i3) {
        int iM1629a = AbstractC0450a.m1629a(aVar.f1929c, i3);
        canvas.save();
        canvas.rotate(aVar.f1933g);
        this.f1848n = aVar.f1934h;
        float f3 = aVar.f1927a;
        float f4 = aVar.f1928b;
        int i4 = aVar.f1930d;
        m1945m(canvas, paint, f3, f4, iM1629a, i4, i4, aVar.f1931e, aVar.f1932f, true);
        canvas.restore();
    }

    @Override // p061U0.AbstractC0546m
    /* JADX INFO: renamed from: d */
    void mo1952d(Canvas canvas, Paint paint, float f3, float f4, int i3, int i4, int i5) {
        int iM1629a = AbstractC0450a.m1629a(i3, i4);
        this.f1848n = false;
        m1945m(canvas, paint, f3, f4, iM1629a, i5, i5, 0.0f, 0.0f, false);
    }

    @Override // p061U0.AbstractC0546m
    /* JADX INFO: renamed from: e */
    int mo1953e() {
        return m1948p();
    }

    @Override // p061U0.AbstractC0546m
    /* JADX INFO: renamed from: f */
    int mo1954f() {
        return m1948p();
    }

    @Override // p061U0.AbstractC0546m
    /* JADX INFO: renamed from: g */
    void mo1955g() {
        this.f1923b.rewind();
        this.f1923b.moveTo(1.0f, 0.0f);
        for (int i3 = 0; i3 < 2; i3++) {
            this.f1923b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            this.f1923b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            this.f1923b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.f1923b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.f1926e.reset();
        Matrix matrix = this.f1926e;
        float f3 = this.f1843i;
        matrix.setScale(f3, f3);
        this.f1923b.transform(this.f1926e);
        if (((C0541h) this.f1922a).m1937b(this.f1848n)) {
            this.f1925d.setPath(this.f1923b, false);
            m1944l(this.f1925d, this.f1923b, this.f1845k);
        }
        this.f1925d.setPath(this.f1923b, false);
    }

    @Override // p061U0.AbstractC0546m
    /* JADX INFO: renamed from: b */
    void mo1950b(Canvas canvas, Paint paint, int i3, int i4) {
    }
}
