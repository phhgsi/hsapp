package p076Z0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p073Y0.C0621a;

/* JADX INFO: renamed from: Z0.n */
/* JADX INFO: loaded from: classes.dex */
public class C0643n {

    /* JADX INFO: renamed from: a */
    public float f2272a;

    /* JADX INFO: renamed from: b */
    public float f2273b;

    /* JADX INFO: renamed from: c */
    public float f2274c;

    /* JADX INFO: renamed from: d */
    public float f2275d;

    /* JADX INFO: renamed from: e */
    public float f2276e;

    /* JADX INFO: renamed from: f */
    public float f2277f;

    /* JADX INFO: renamed from: g */
    private final List f2278g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final List f2279h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private boolean f2280i;

    /* JADX INFO: renamed from: Z0.n$a */
    class a extends g {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f2281c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Matrix f2282d;

        a(List list, Matrix matrix) {
            this.f2281c = list;
            this.f2282d = matrix;
        }

        @Override // p076Z0.C0643n.g
        /* JADX INFO: renamed from: b */
        public void mo2400b(Matrix matrix, C0621a c0621a, int i3, Canvas canvas) {
            Iterator it = this.f2281c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).mo2400b(this.f2282d, c0621a, i3, canvas);
            }
        }
    }

    /* JADX INFO: renamed from: Z0.n$b */
    static class b extends g {

        /* JADX INFO: renamed from: c */
        private final d f2284c;

        public b(d dVar) {
            this.f2284c = dVar;
        }

        @Override // p076Z0.C0643n.g
        /* JADX INFO: renamed from: b */
        public void mo2400b(Matrix matrix, C0621a c0621a, int i3, Canvas canvas) {
            c0621a.m2207a(canvas, matrix, new RectF(this.f2284c.m2411k(), this.f2284c.m2415o(), this.f2284c.m2412l(), this.f2284c.m2410j()), i3, this.f2284c.m2413m(), this.f2284c.m2414n());
        }
    }

    /* JADX INFO: renamed from: Z0.n$c */
    static class c extends g {

        /* JADX INFO: renamed from: c */
        private final e f2285c;

        /* JADX INFO: renamed from: d */
        private final float f2286d;

        /* JADX INFO: renamed from: e */
        private final float f2287e;

        public c(e eVar, float f3, float f4) {
            this.f2285c = eVar;
            this.f2286d = f3;
            this.f2287e = f4;
        }

        @Override // p076Z0.C0643n.g
        /* JADX INFO: renamed from: b */
        public void mo2400b(Matrix matrix, C0621a c0621a, int i3, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f2285c.f2296c - this.f2287e, this.f2285c.f2295b - this.f2286d), 0.0f);
            this.f2299a.set(matrix);
            this.f2299a.preTranslate(this.f2286d, this.f2287e);
            this.f2299a.preRotate(m2401c());
            c0621a.m2208b(canvas, this.f2299a, rectF, i3);
        }

        /* JADX INFO: renamed from: c */
        float m2401c() {
            return (float) Math.toDegrees(Math.atan((this.f2285c.f2296c - this.f2287e) / (this.f2285c.f2295b - this.f2286d)));
        }
    }

    /* JADX INFO: renamed from: Z0.n$d */
    public static class d extends f {

        /* JADX INFO: renamed from: h */
        private static final RectF f2288h = new RectF();

        /* JADX INFO: renamed from: b */
        public float f2289b;

        /* JADX INFO: renamed from: c */
        public float f2290c;

        /* JADX INFO: renamed from: d */
        public float f2291d;

        /* JADX INFO: renamed from: e */
        public float f2292e;

        /* JADX INFO: renamed from: f */
        public float f2293f;

        /* JADX INFO: renamed from: g */
        public float f2294g;

        public d(float f3, float f4, float f5, float f6) {
            m2417q(f3);
            m2421u(f4);
            m2418r(f5);
            m2416p(f6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public float m2410j() {
            return this.f2292e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public float m2411k() {
            return this.f2289b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public float m2412l() {
            return this.f2291d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public float m2413m() {
            return this.f2293f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public float m2414n() {
            return this.f2294g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public float m2415o() {
            return this.f2290c;
        }

        /* JADX INFO: renamed from: p */
        private void m2416p(float f3) {
            this.f2292e = f3;
        }

        /* JADX INFO: renamed from: q */
        private void m2417q(float f3) {
            this.f2289b = f3;
        }

        /* JADX INFO: renamed from: r */
        private void m2418r(float f3) {
            this.f2291d = f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public void m2419s(float f3) {
            this.f2293f = f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public void m2420t(float f3) {
            this.f2294g = f3;
        }

        /* JADX INFO: renamed from: u */
        private void m2421u(float f3) {
            this.f2290c = f3;
        }

        @Override // p076Z0.C0643n.f
        /* JADX INFO: renamed from: a */
        public void mo2422a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2297a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f2288h;
            rectF.set(m2411k(), m2415o(), m2412l(), m2410j());
            path.arcTo(rectF, m2413m(), m2414n(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: Z0.n$e */
    public static class e extends f {

        /* JADX INFO: renamed from: b */
        private float f2295b;

        /* JADX INFO: renamed from: c */
        private float f2296c;

        @Override // p076Z0.C0643n.f
        /* JADX INFO: renamed from: a */
        public void mo2422a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2297a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f2295b, this.f2296c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: Z0.n$f */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        protected final Matrix f2297a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo2422a(Matrix matrix, Path path);
    }

    /* JADX INFO: renamed from: Z0.n$g */
    static abstract class g {

        /* JADX INFO: renamed from: b */
        static final Matrix f2298b = new Matrix();

        /* JADX INFO: renamed from: a */
        final Matrix f2299a = new Matrix();

        g() {
        }

        /* JADX INFO: renamed from: a */
        public final void m2427a(C0621a c0621a, int i3, Canvas canvas) {
            mo2400b(f2298b, c0621a, i3, canvas);
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo2400b(Matrix matrix, C0621a c0621a, int i3, Canvas canvas);
    }

    public C0643n() {
        m2398n(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    private void m2379b(float f3) {
        if (m2381g() == f3) {
            return;
        }
        float fM2381g = ((f3 - m2381g()) + 360.0f) % 360.0f;
        if (fM2381g > 180.0f) {
            return;
        }
        d dVar = new d(m2393i(), m2394j(), m2393i(), m2394j());
        dVar.m2419s(m2381g());
        dVar.m2420t(fM2381g);
        this.f2279h.add(new b(dVar));
        m2383p(f3);
    }

    /* JADX INFO: renamed from: c */
    private void m2380c(g gVar, float f3, float f4) {
        m2379b(f3);
        this.f2279h.add(gVar);
        m2383p(f4);
    }

    /* JADX INFO: renamed from: g */
    private float m2381g() {
        return this.f2276e;
    }

    /* JADX INFO: renamed from: h */
    private float m2382h() {
        return this.f2277f;
    }

    /* JADX INFO: renamed from: p */
    private void m2383p(float f3) {
        this.f2276e = f3;
    }

    /* JADX INFO: renamed from: q */
    private void m2384q(float f3) {
        this.f2277f = f3;
    }

    /* JADX INFO: renamed from: r */
    private void m2385r(float f3) {
        this.f2274c = f3;
    }

    /* JADX INFO: renamed from: s */
    private void m2386s(float f3) {
        this.f2275d = f3;
    }

    /* JADX INFO: renamed from: t */
    private void m2387t(float f3) {
        this.f2272a = f3;
    }

    /* JADX INFO: renamed from: u */
    private void m2388u(float f3) {
        this.f2273b = f3;
    }

    /* JADX INFO: renamed from: a */
    public void m2389a(float f3, float f4, float f5, float f6, float f7, float f8) {
        d dVar = new d(f3, f4, f5, f6);
        dVar.m2419s(f7);
        dVar.m2420t(f8);
        this.f2278g.add(dVar);
        b bVar = new b(dVar);
        float f9 = f7 + f8;
        boolean z2 = f8 < 0.0f;
        if (z2) {
            f7 = (f7 + 180.0f) % 360.0f;
        }
        m2380c(bVar, f7, z2 ? (180.0f + f9) % 360.0f : f9);
        double d3 = f9;
        m2385r(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.cos(Math.toRadians(d3)))));
        m2386s(((f4 + f6) * 0.5f) + (((f6 - f4) / 2.0f) * ((float) Math.sin(Math.toRadians(d3)))));
    }

    /* JADX INFO: renamed from: d */
    public void m2390d(Matrix matrix, Path path) {
        int size = this.f2278g.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((f) this.f2278g.get(i3)).mo2422a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: e */
    boolean m2391e() {
        return this.f2280i;
    }

    /* JADX INFO: renamed from: f */
    g m2392f(Matrix matrix) {
        m2379b(m2382h());
        return new a(new ArrayList(this.f2279h), new Matrix(matrix));
    }

    /* JADX INFO: renamed from: i */
    float m2393i() {
        return this.f2274c;
    }

    /* JADX INFO: renamed from: j */
    float m2394j() {
        return this.f2275d;
    }

    /* JADX INFO: renamed from: k */
    float m2395k() {
        return this.f2272a;
    }

    /* JADX INFO: renamed from: l */
    float m2396l() {
        return this.f2273b;
    }

    /* JADX INFO: renamed from: m */
    public void m2397m(float f3, float f4) {
        e eVar = new e();
        eVar.f2295b = f3;
        eVar.f2296c = f4;
        this.f2278g.add(eVar);
        c cVar = new c(eVar, m2393i(), m2394j());
        m2380c(cVar, cVar.m2401c() + 270.0f, cVar.m2401c() + 270.0f);
        m2385r(f3);
        m2386s(f4);
    }

    /* JADX INFO: renamed from: n */
    public void m2398n(float f3, float f4) {
        m2399o(f3, f4, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: o */
    public void m2399o(float f3, float f4, float f5, float f6) {
        m2387t(f3);
        m2388u(f4);
        m2385r(f3);
        m2386s(f4);
        m2383p(f5);
        m2384q((f5 + f6) % 360.0f);
        this.f2278g.clear();
        this.f2279h.clear();
        this.f2280i = false;
    }
}
