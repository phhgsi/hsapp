package p076Z0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: Z0.m */
/* JADX INFO: loaded from: classes.dex */
public class C0642m {

    /* JADX INFO: renamed from: a */
    private final C0643n[] f2254a = new C0643n[4];

    /* JADX INFO: renamed from: b */
    private final Matrix[] f2255b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    private final Matrix[] f2256c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    private final PointF f2257d = new PointF();

    /* JADX INFO: renamed from: e */
    private final Path f2258e = new Path();

    /* JADX INFO: renamed from: f */
    private final Path f2259f = new Path();

    /* JADX INFO: renamed from: g */
    private final C0643n f2260g = new C0643n();

    /* JADX INFO: renamed from: h */
    private final float[] f2261h = new float[2];

    /* JADX INFO: renamed from: i */
    private final float[] f2262i = new float[2];

    /* JADX INFO: renamed from: j */
    private final Path f2263j = new Path();

    /* JADX INFO: renamed from: k */
    private final Path f2264k = new Path();

    /* JADX INFO: renamed from: l */
    private boolean f2265l = true;

    /* JADX INFO: renamed from: Z0.m$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static final C0642m f2266a = new C0642m();
    }

    /* JADX INFO: renamed from: Z0.m$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2291a(C0643n c0643n, Matrix matrix, int i3);

        /* JADX INFO: renamed from: b */
        void mo2292b(C0643n c0643n, Matrix matrix, int i3);
    }

    /* JADX INFO: renamed from: Z0.m$c */
    static final class c {

        /* JADX INFO: renamed from: a */
        public final C0641l f2267a;

        /* JADX INFO: renamed from: b */
        public final Path f2268b;

        /* JADX INFO: renamed from: c */
        public final RectF f2269c;

        /* JADX INFO: renamed from: d */
        public final b f2270d;

        /* JADX INFO: renamed from: e */
        public final float f2271e;

        c(C0641l c0641l, float f3, RectF rectF, b bVar, Path path) {
            this.f2270d = bVar;
            this.f2267a = c0641l;
            this.f2271e = f3;
            this.f2269c = rectF;
            this.f2268b = path;
        }
    }

    public C0642m() {
        for (int i3 = 0; i3 < 4; i3++) {
            this.f2254a[i3] = new C0643n();
            this.f2255b[i3] = new Matrix();
            this.f2256c[i3] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: a */
    private float m2364a(int i3) {
        return ((i3 + 1) % 4) * 90;
    }

    /* JADX INFO: renamed from: b */
    private void m2365b(c cVar, int i3) {
        this.f2261h[0] = this.f2254a[i3].m2395k();
        this.f2261h[1] = this.f2254a[i3].m2396l();
        this.f2255b[i3].mapPoints(this.f2261h);
        if (i3 == 0) {
            Path path = cVar.f2268b;
            float[] fArr = this.f2261h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f2268b;
            float[] fArr2 = this.f2261h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f2254a[i3].m2390d(this.f2255b[i3], cVar.f2268b);
        b bVar = cVar.f2270d;
        if (bVar != null) {
            bVar.mo2292b(this.f2254a[i3], this.f2255b[i3], i3);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2366c(c cVar, int i3) {
        int i4 = (i3 + 1) % 4;
        this.f2261h[0] = this.f2254a[i3].m2393i();
        this.f2261h[1] = this.f2254a[i3].m2394j();
        this.f2255b[i3].mapPoints(this.f2261h);
        this.f2262i[0] = this.f2254a[i4].m2395k();
        this.f2262i[1] = this.f2254a[i4].m2396l();
        this.f2255b[i4].mapPoints(this.f2262i);
        float f3 = this.f2261h[0];
        float[] fArr = this.f2262i;
        float fMax = Math.max(((float) Math.hypot(f3 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fM2369j = m2369j(cVar.f2269c, i3);
        this.f2260g.m2398n(0.0f, 0.0f);
        C0636g c0636gM2370k = m2370k(i3, cVar.f2267a);
        c0636gM2370k.m2220b(fMax, fM2369j, cVar.f2271e, this.f2260g);
        this.f2263j.reset();
        this.f2260g.m2390d(this.f2256c[i3], this.f2263j);
        if (this.f2265l && (c0636gM2370k.m2219a() || m2372m(this.f2263j, i3) || m2372m(this.f2263j, i4))) {
            Path path = this.f2263j;
            path.op(path, this.f2259f, Path.Op.DIFFERENCE);
            this.f2261h[0] = this.f2260g.m2395k();
            this.f2261h[1] = this.f2260g.m2396l();
            this.f2256c[i3].mapPoints(this.f2261h);
            Path path2 = this.f2258e;
            float[] fArr2 = this.f2261h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f2260g.m2390d(this.f2256c[i3], this.f2258e);
        } else {
            this.f2260g.m2390d(this.f2256c[i3], cVar.f2268b);
        }
        b bVar = cVar.f2270d;
        if (bVar != null) {
            bVar.mo2291a(this.f2260g, this.f2256c[i3], i3);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2367g(int i3, RectF rectF, PointF pointF) {
        if (i3 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i3 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i3 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* JADX INFO: renamed from: i */
    private AbstractC0634e m2368i(int i3, C0641l c0641l) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? c0641l.m2322s() : c0641l.m2320q() : c0641l.m2313i() : c0641l.m2315k();
    }

    /* JADX INFO: renamed from: j */
    private float m2369j(RectF rectF, int i3) {
        float[] fArr = this.f2261h;
        C0643n c0643n = this.f2254a[i3];
        fArr[0] = c0643n.f2274c;
        fArr[1] = c0643n.f2275d;
        this.f2255b[i3].mapPoints(fArr);
        return (i3 == 1 || i3 == 3) ? Math.abs(rectF.centerX() - this.f2261h[0]) : Math.abs(rectF.centerY() - this.f2261h[1]);
    }

    /* JADX INFO: renamed from: k */
    private C0636g m2370k(int i3, C0641l c0641l) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? c0641l.m2318o() : c0641l.m2319p() : c0641l.m2317n() : c0641l.m2312h();
    }

    /* JADX INFO: renamed from: l */
    public static C0642m m2371l() {
        return a.f2266a;
    }

    /* JADX INFO: renamed from: m */
    private boolean m2372m(Path path, int i3) {
        this.f2264k.reset();
        this.f2254a[i3].m2390d(this.f2255b[i3], this.f2264k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f2264k.computeBounds(rectF, true);
        path.op(this.f2264k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX INFO: renamed from: n */
    private void m2373n(c cVar, int i3, float[] fArr) {
        m2368i(i3, cVar.f2267a).m2218b(this.f2254a[i3], 90.0f, cVar.f2271e, cVar.f2269c, fArr == null ? m2378h(i3, cVar.f2267a) : new C0632c(fArr[i3]));
        float fM2364a = m2364a(i3);
        this.f2255b[i3].reset();
        m2367g(i3, cVar.f2269c, this.f2257d);
        Matrix matrix = this.f2255b[i3];
        PointF pointF = this.f2257d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f2255b[i3].preRotate(fM2364a);
    }

    /* JADX INFO: renamed from: o */
    private void m2374o(int i3) {
        this.f2261h[0] = this.f2254a[i3].m2393i();
        this.f2261h[1] = this.f2254a[i3].m2394j();
        this.f2255b[i3].mapPoints(this.f2261h);
        float fM2364a = m2364a(i3);
        this.f2256c[i3].reset();
        Matrix matrix = this.f2256c[i3];
        float[] fArr = this.f2261h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f2256c[i3].preRotate(fM2364a);
    }

    /* JADX INFO: renamed from: d */
    public void m2375d(C0641l c0641l, float f3, RectF rectF, b bVar, Path path) {
        m2377f(c0641l, null, f3, rectF, bVar, path);
    }

    /* JADX INFO: renamed from: e */
    public void m2376e(C0641l c0641l, float f3, RectF rectF, Path path) {
        m2375d(c0641l, f3, rectF, null, path);
    }

    /* JADX INFO: renamed from: f */
    public void m2377f(C0641l c0641l, float[] fArr, float f3, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f2258e.rewind();
        this.f2259f.rewind();
        this.f2259f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c0641l, f3, rectF, bVar, path);
        for (int i3 = 0; i3 < 4; i3++) {
            m2373n(cVar, i3, fArr);
            m2374o(i3);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            m2365b(cVar, i4);
            m2366c(cVar, i4);
        }
        path.close();
        this.f2258e.close();
        if (this.f2258e.isEmpty()) {
            return;
        }
        path.op(this.f2258e, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: h */
    InterfaceC0633d m2378h(int i3, C0641l c0641l) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? c0641l.m2323t() : c0641l.m2321r() : c0641l.m2314j() : c0641l.m2316l();
    }
}
