package p076Z0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.material.drawable.AbstractC1519d;
import java.util.BitSet;
import p016F0.AbstractC0140a;
import p024I.AbstractC0206c;
import p043O0.AbstractC0450a;
import p045P.AbstractC0463i;
import p045P.C0465k;
import p045P.C0466l;
import p049Q0.C0486a;
import p055S0.AbstractC0505a;
import p073Y0.C0621a;
import p076Z0.C0641l;
import p076Z0.C0642m;
import p076Z0.C0643n;

/* JADX INFO: renamed from: Z0.h */
/* JADX INFO: loaded from: classes.dex */
public class C0637h extends Drawable implements InterfaceC0644o {

    /* JADX INFO: renamed from: F */
    private static final String f2166F = "h";

    /* JADX INFO: renamed from: G */
    static final C0641l f2167G = C0641l.m2304a().m2354q(0, 0.0f).m2351m();

    /* JADX INFO: renamed from: H */
    private static final Paint f2168H;

    /* JADX INFO: renamed from: I */
    private static final e[] f2169I;

    /* JADX INFO: renamed from: A */
    private C0466l f2170A;

    /* JADX INFO: renamed from: B */
    C0465k[] f2171B;

    /* JADX INFO: renamed from: C */
    private float[] f2172C;

    /* JADX INFO: renamed from: D */
    private float[] f2173D;

    /* JADX INFO: renamed from: E */
    private d f2174E;

    /* JADX INFO: renamed from: a */
    private final C0641l.c f2175a;

    /* JADX INFO: renamed from: b */
    private c f2176b;

    /* JADX INFO: renamed from: c */
    private final C0643n.g[] f2177c;

    /* JADX INFO: renamed from: d */
    private final C0643n.g[] f2178d;

    /* JADX INFO: renamed from: e */
    private final BitSet f2179e;

    /* JADX INFO: renamed from: f */
    private boolean f2180f;

    /* JADX INFO: renamed from: g */
    private boolean f2181g;

    /* JADX INFO: renamed from: h */
    private final Matrix f2182h;

    /* JADX INFO: renamed from: i */
    private final Path f2183i;

    /* JADX INFO: renamed from: j */
    private final Path f2184j;

    /* JADX INFO: renamed from: k */
    private final RectF f2185k;

    /* JADX INFO: renamed from: l */
    private final RectF f2186l;

    /* JADX INFO: renamed from: m */
    private final Region f2187m;

    /* JADX INFO: renamed from: n */
    private final Region f2188n;

    /* JADX INFO: renamed from: o */
    private final Paint f2189o;

    /* JADX INFO: renamed from: p */
    private final Paint f2190p;

    /* JADX INFO: renamed from: q */
    private final C0621a f2191q;

    /* JADX INFO: renamed from: r */
    private final C0642m.b f2192r;

    /* JADX INFO: renamed from: s */
    private final C0642m f2193s;

    /* JADX INFO: renamed from: t */
    private PorterDuffColorFilter f2194t;

    /* JADX INFO: renamed from: u */
    private PorterDuffColorFilter f2195u;

    /* JADX INFO: renamed from: v */
    private int f2196v;

    /* JADX INFO: renamed from: w */
    private final RectF f2197w;

    /* JADX INFO: renamed from: x */
    private boolean f2198x;

    /* JADX INFO: renamed from: y */
    private boolean f2199y;

    /* JADX INFO: renamed from: z */
    private C0641l f2200z;

    /* JADX INFO: renamed from: Z0.h$a */
    class a implements C0641l.c {
        a() {
        }

        @Override // p076Z0.C0641l.c
        /* JADX INFO: renamed from: a */
        public InterfaceC0633d mo2290a(InterfaceC0633d interfaceC0633d) {
            return interfaceC0633d instanceof C0639j ? interfaceC0633d : new C0631b(-C0637h.this.m2221I(), interfaceC0633d);
        }
    }

    /* JADX INFO: renamed from: Z0.h$b */
    class b implements C0642m.b {
        b() {
        }

        @Override // p076Z0.C0642m.b
        /* JADX INFO: renamed from: a */
        public void mo2291a(C0643n c0643n, Matrix matrix, int i3) {
            C0637h.this.f2179e.set(i3 + 4, c0643n.m2391e());
            C0637h.this.f2178d[i3] = c0643n.m2392f(matrix);
        }

        @Override // p076Z0.C0642m.b
        /* JADX INFO: renamed from: b */
        public void mo2292b(C0643n c0643n, Matrix matrix, int i3) {
            C0637h.this.f2179e.set(i3, c0643n.m2391e());
            C0637h.this.f2177c[i3] = c0643n.m2392f(matrix);
        }
    }

    /* JADX INFO: renamed from: Z0.h$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo2293a(float f3);
    }

    /* JADX INFO: renamed from: Z0.h$e */
    private static class e extends AbstractC0463i {

        /* JADX INFO: renamed from: b */
        private final int f2226b;

        e(int i3) {
            super("cornerSizeAtIndex" + i3);
            this.f2226b = i3;
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(C0637h c0637h) {
            if (c0637h.f2172C != null) {
                return c0637h.f2172C[this.f2226b];
            }
            return 0.0f;
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(C0637h c0637h, float f3) {
            if (c0637h.f2172C == null || c0637h.f2172C[this.f2226b] == f3) {
                return;
            }
            c0637h.f2172C[this.f2226b] = f3;
            if (c0637h.f2174E != null) {
                c0637h.f2174E.mo2293a(c0637h.m2289z());
            }
            c0637h.invalidateSelf();
        }
    }

    static {
        int i3 = 0;
        Paint paint = new Paint(1);
        f2168H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f2169I = new e[4];
        while (true) {
            e[] eVarArr = f2169I;
            if (i3 >= eVarArr.length) {
                return;
            }
            eVarArr[i3] = new e(i3);
            i3++;
        }
    }

    public C0637h() {
        this(new C0641l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public float m2221I() {
        if (m2224P()) {
            return this.f2190p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: N */
    private boolean m2222N() {
        c cVar = this.f2176b;
        int i3 = cVar.f2220r;
        if (i3 == 1 || cVar.f2221s <= 0) {
            return false;
        }
        return i3 == 2 || m2269X();
    }

    /* JADX INFO: renamed from: O */
    private boolean m2223O() {
        Paint.Style style = this.f2176b.f2225w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* JADX INFO: renamed from: P */
    private boolean m2224P() {
        Paint.Style style = this.f2176b.f2225w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2190p.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: R */
    private void m2225R() {
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: U */
    private void m2226U(Canvas canvas) {
        if (m2222N()) {
            canvas.save();
            m2228W(canvas);
            if (!this.f2198x) {
                m2250s(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f2197w.width() - getBounds().width());
            int iHeight = (int) (this.f2197w.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f2197w.width()) + (this.f2176b.f2221s * 2) + iWidth, ((int) this.f2197w.height()) + (this.f2176b.f2221s * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f3 = (getBounds().left - this.f2176b.f2221s) - iWidth;
            float f4 = (getBounds().top - this.f2176b.f2221s) - iHeight;
            canvas2.translate(-f3, -f4);
            m2250s(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: V */
    private static int m2227V(int i3, int i4) {
        return (i3 * (i4 + (i4 >>> 7))) >>> 8;
    }

    /* JADX INFO: renamed from: W */
    private void m2228W(Canvas canvas) {
        canvas.translate(m2259F(), m2260G());
    }

    /* JADX INFO: renamed from: j */
    private PorterDuffColorFilter m2237j(Paint paint, boolean z2) {
        if (!z2) {
            return null;
        }
        int color = paint.getColor();
        int iM2285q = m2285q(color);
        this.f2196v = iM2285q;
        if (iM2285q != color) {
            return new PorterDuffColorFilter(iM2285q, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private void m2238k(RectF rectF, Path path) {
        m2283l(rectF, path);
        if (this.f2176b.f2213k != 1.0f) {
            this.f2182h.reset();
            Matrix matrix = this.f2182h;
            float f3 = this.f2176b.f2213k;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f2182h);
        }
        path.computeBounds(this.f2197w, true);
    }

    /* JADX INFO: renamed from: m */
    private float m2239m(RectF rectF, C0641l c0641l, float[] fArr) {
        if (fArr == null) {
            if (c0641l.m2325v(rectF)) {
                return c0641l.m2321r().mo2214a(rectF);
            }
            return -1.0f;
        }
        if (AbstractC0505a.m1847a(fArr) && c0641l.m2324u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: m0 */
    private boolean m2240m0(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f2176b.f2207e == null || color2 == (colorForState2 = this.f2176b.f2207e.getColorForState(iArr, (color2 = this.f2189o.getColor())))) {
            z2 = false;
        } else {
            this.f2189o.setColor(colorForState2);
            z2 = true;
        }
        if (this.f2176b.f2208f == null || color == (colorForState = this.f2176b.f2208f.getColorForState(iArr, (color = this.f2190p.getColor())))) {
            return z2;
        }
        this.f2190p.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: n */
    private void m2241n() {
        m2246p0();
        this.f2193s.m2377f(this.f2200z, this.f2173D, this.f2176b.f2214l, m2253y(), null, this.f2184j);
    }

    /* JADX INFO: renamed from: n0 */
    private void m2242n0(int[] iArr) {
        m2244o0(iArr, false);
    }

    /* JADX INFO: renamed from: o */
    private PorterDuffColorFilter m2243o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z2) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = m2285q(colorForState);
        }
        this.f2196v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX INFO: renamed from: o0 */
    private void m2244o0(int[] iArr, boolean z2) {
        RectF rectFM2288x = m2288x();
        if (this.f2176b.f2204b == null || rectFM2288x.isEmpty()) {
            return;
        }
        boolean z3 = z2 | (this.f2170A == null);
        if (this.f2172C == null) {
            this.f2172C = new float[4];
        }
        C0641l c0641lM2460d = this.f2176b.f2204b.m2460d(iArr);
        for (int i3 = 0; i3 < 4; i3++) {
            float fMo2214a = this.f2193s.m2378h(i3, c0641lM2460d).mo2214a(rectFM2288x);
            if (z3) {
                this.f2172C[i3] = fMo2214a;
            }
            C0465k c0465k = this.f2171B[i3];
            if (c0465k != null) {
                c0465k.m1712m(fMo2214a);
                if (z3) {
                    this.f2171B[i3].m1716r();
                }
            }
        }
        if (z3) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: p */
    private PorterDuffColorFilter m2245p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        return (colorStateList == null || mode == null) ? m2237j(paint, z2) : m2243o(colorStateList, mode, z2);
    }

    /* JADX INFO: renamed from: p0 */
    private void m2246p0() {
        this.f2200z = m2261H().m2329z(this.f2175a);
        float[] fArr = this.f2172C;
        if (fArr == null) {
            this.f2173D = null;
            return;
        }
        if (this.f2173D == null) {
            this.f2173D = new float[fArr.length];
        }
        float fM2221I = m2221I();
        int i3 = 0;
        while (true) {
            float[] fArr2 = this.f2172C;
            if (i3 >= fArr2.length) {
                return;
            }
            this.f2173D[i3] = Math.max(0.0f, fArr2[i3] - fM2221I);
            i3++;
        }
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m2247q0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f2194t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2195u;
        c cVar = this.f2176b;
        this.f2194t = m2245p(cVar.f2210h, cVar.f2211i, this.f2189o, true);
        c cVar2 = this.f2176b;
        this.f2195u = m2245p(cVar2.f2209g, cVar2.f2211i, this.f2190p, false);
        c cVar3 = this.f2176b;
        if (cVar3.f2224v) {
            this.f2191q.m2210d(cVar3.f2210h.getColorForState(getState(), 0));
        }
        return (AbstractC0206c.m596a(porterDuffColorFilter, this.f2194t) && AbstractC0206c.m596a(porterDuffColorFilter2, this.f2195u)) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public static C0637h m2248r(Context context, float f3, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(AbstractC0450a.m1631c(context, AbstractC0140a.f341i, C0637h.class.getSimpleName()));
        }
        C0637h c0637h = new C0637h();
        c0637h.m2266Q(context);
        c0637h.m2274c0(colorStateList);
        c0637h.m2273b0(f3);
        return c0637h;
    }

    /* JADX INFO: renamed from: r0 */
    private void m2249r0() {
        float fM2265M = m2265M();
        this.f2176b.f2221s = (int) Math.ceil(0.75f * fM2265M);
        this.f2176b.f2222t = (int) Math.ceil(fM2265M * 0.25f);
        m2247q0();
        m2225R();
    }

    /* JADX INFO: renamed from: s */
    private void m2250s(Canvas canvas) {
        if (this.f2179e.cardinality() > 0) {
            Log.w(f2166F, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f2176b.f2222t != 0) {
            canvas.drawPath(this.f2183i, this.f2191q.m2209c());
        }
        for (int i3 = 0; i3 < 4; i3++) {
            this.f2177c[i3].m2427a(this.f2191q, this.f2176b.f2221s, canvas);
            this.f2178d[i3].m2427a(this.f2191q, this.f2176b.f2221s, canvas);
        }
        if (this.f2198x) {
            int iM2259F = m2259F();
            int iM2260G = m2260G();
            canvas.translate(-iM2259F, -iM2260G);
            canvas.drawPath(this.f2183i, f2168H);
            canvas.translate(iM2259F, iM2260G);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m2251t(Canvas canvas) {
        m2252u(canvas, this.f2189o, this.f2183i, this.f2176b.f2203a, this.f2172C, m2288x());
    }

    /* JADX INFO: renamed from: u */
    private void m2252u(Canvas canvas, Paint paint, Path path, C0641l c0641l, float[] fArr, RectF rectF) {
        float fM2239m = m2239m(rectF, c0641l, fArr);
        if (fM2239m < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f3 = fM2239m * this.f2176b.f2214l;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
    }

    /* JADX INFO: renamed from: y */
    private RectF m2253y() {
        this.f2186l.set(m2288x());
        float fM2221I = m2221I();
        this.f2186l.inset(fM2221I, fM2221I);
        return this.f2186l;
    }

    /* JADX INFO: renamed from: A */
    public float m2254A() {
        return this.f2176b.f2218p;
    }

    /* JADX INFO: renamed from: B */
    public ColorStateList m2255B() {
        return this.f2176b.f2207e;
    }

    /* JADX INFO: renamed from: C */
    public float m2256C() {
        return this.f2176b.f2214l;
    }

    /* JADX INFO: renamed from: D */
    public float m2257D() {
        return this.f2176b.f2217o;
    }

    /* JADX INFO: renamed from: E */
    public int m2258E() {
        return this.f2196v;
    }

    /* JADX INFO: renamed from: F */
    public int m2259F() {
        return (int) (((double) this.f2176b.f2222t) * Math.sin(Math.toRadians(r0.f2223u)));
    }

    /* JADX INFO: renamed from: G */
    public int m2260G() {
        return (int) (((double) this.f2176b.f2222t) * Math.cos(Math.toRadians(r0.f2223u)));
    }

    /* JADX INFO: renamed from: H */
    public C0641l m2261H() {
        return this.f2176b.f2203a;
    }

    /* JADX INFO: renamed from: J */
    public float m2262J() {
        float[] fArr = this.f2172C;
        return fArr != null ? fArr[3] : this.f2176b.f2203a.m2321r().mo2214a(m2288x());
    }

    /* JADX INFO: renamed from: K */
    public float m2263K() {
        float[] fArr = this.f2172C;
        return fArr != null ? fArr[0] : this.f2176b.f2203a.m2323t().mo2214a(m2288x());
    }

    /* JADX INFO: renamed from: L */
    public float m2264L() {
        return this.f2176b.f2219q;
    }

    /* JADX INFO: renamed from: M */
    public float m2265M() {
        return m2254A() + m2264L();
    }

    /* JADX INFO: renamed from: Q */
    public void m2266Q(Context context) {
        this.f2176b.f2205c = new C0486a(context);
        m2249r0();
    }

    /* JADX INFO: renamed from: S */
    public boolean m2267S() {
        C0486a c0486a = this.f2176b.f2205c;
        return c0486a != null && c0486a.m1798d();
    }

    /* JADX INFO: renamed from: T */
    public boolean m2268T() {
        if (this.f2176b.f2203a.m2325v(m2288x())) {
            return true;
        }
        float[] fArr = this.f2172C;
        return fArr != null && AbstractC0505a.m1847a(fArr) && this.f2176b.f2203a.m2324u();
    }

    /* JADX INFO: renamed from: X */
    public boolean m2269X() {
        return (m2268T() || this.f2183i.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public void m2270Y(float f3) {
        setShapeAppearanceModel(this.f2176b.f2203a.m2327x(f3));
    }

    /* JADX INFO: renamed from: Z */
    public void m2271Z(InterfaceC0633d interfaceC0633d) {
        setShapeAppearanceModel(this.f2176b.f2203a.m2328y(interfaceC0633d));
    }

    /* JADX INFO: renamed from: a0 */
    public void m2272a0(C0466l c0466l) {
        if (this.f2170A == c0466l) {
            return;
        }
        this.f2170A = c0466l;
        int i3 = 0;
        while (true) {
            C0465k[] c0465kArr = this.f2171B;
            if (i3 >= c0465kArr.length) {
                m2244o0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (c0465kArr[i3] == null) {
                    c0465kArr[i3] = new C0465k(this, f2169I[i3]);
                }
                this.f2171B[i3].m1715q(new C0466l().m1722f(c0466l.m1718a()).m1724h(c0466l.m1720c()));
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m2273b0(float f3) {
        c cVar = this.f2176b;
        if (cVar.f2218p != f3) {
            cVar.f2218p = f3;
            m2249r0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m2274c0(ColorStateList colorStateList) {
        c cVar = this.f2176b;
        if (cVar.f2207e != colorStateList) {
            cVar.f2207e = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m2275d0(float f3) {
        c cVar = this.f2176b;
        if (cVar.f2214l != f3) {
            cVar.f2214l = f3;
            this.f2180f = true;
            this.f2181g = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2189o.setColorFilter(this.f2194t);
        int alpha = this.f2189o.getAlpha();
        this.f2189o.setAlpha(m2227V(alpha, this.f2176b.f2216n));
        this.f2190p.setColorFilter(this.f2195u);
        this.f2190p.setStrokeWidth(this.f2176b.f2215m);
        int alpha2 = this.f2190p.getAlpha();
        this.f2190p.setAlpha(m2227V(alpha2, this.f2176b.f2216n));
        if (m2223O()) {
            if (this.f2180f) {
                m2238k(m2288x(), this.f2183i);
                this.f2180f = false;
            }
            m2226U(canvas);
            m2251t(canvas);
        }
        if (m2224P()) {
            if (this.f2181g) {
                m2241n();
                this.f2181g = false;
            }
            mo2287w(canvas);
        }
        this.f2189o.setAlpha(alpha);
        this.f2190p.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e0 */
    public void m2276e0(d dVar) {
        this.f2174E = dVar;
    }

    /* JADX INFO: renamed from: f0 */
    public void m2277f0(int i3, int i4, int i5, int i6) {
        c cVar = this.f2176b;
        if (cVar.f2212j == null) {
            cVar.f2212j = new Rect();
        }
        this.f2176b.f2212j.set(i3, i4, i5, i6);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g0 */
    public void m2278g0(float f3) {
        c cVar = this.f2176b;
        if (cVar.f2217o != f3) {
            cVar.f2217o = f3;
            m2249r0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2176b.f2216n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f2176b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f2176b.f2220r == 2) {
            return;
        }
        RectF rectFM2288x = m2288x();
        if (rectFM2288x.isEmpty()) {
            return;
        }
        float fM2239m = m2239m(rectFM2288x, this.f2176b.f2203a, this.f2172C);
        if (fM2239m >= 0.0f) {
            outline.setRoundRect(getBounds(), fM2239m * this.f2176b.f2214l);
            return;
        }
        if (this.f2180f) {
            m2238k(rectFM2288x, this.f2183i);
            this.f2180f = false;
        }
        AbstractC1519d.m8257j(outline, this.f2183i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f2176b.f2212j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f2187m.set(getBounds());
        m2238k(m2288x(), this.f2183i);
        this.f2188n.setPath(this.f2183i, this.f2187m);
        this.f2187m.op(this.f2188n, Region.Op.DIFFERENCE);
        return this.f2187m;
    }

    /* JADX INFO: renamed from: h0 */
    public void m2279h0(C0649t c0649t) {
        c cVar = this.f2176b;
        if (cVar.f2204b != c0649t) {
            cVar.f2204b = c0649t;
            m2244o0(getState(), true);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m2280i0(float f3, int i3) {
        m2284l0(f3);
        m2282k0(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f2180f = true;
        this.f2181g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f2176b.f2210h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f2176b.f2209g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f2176b.f2208f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f2176b.f2207e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        C0649t c0649t = this.f2176b.f2204b;
        return c0649t != null && c0649t.m2461f();
    }

    /* JADX INFO: renamed from: j0 */
    public void m2281j0(float f3, ColorStateList colorStateList) {
        m2284l0(f3);
        m2282k0(colorStateList);
    }

    /* JADX INFO: renamed from: k0 */
    public void m2282k0(ColorStateList colorStateList) {
        c cVar = this.f2176b;
        if (cVar.f2208f != colorStateList) {
            cVar.f2208f = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: l */
    protected final void m2283l(RectF rectF, Path path) {
        C0642m c0642m = this.f2193s;
        c cVar = this.f2176b;
        c0642m.m2377f(cVar.f2203a, this.f2172C, cVar.f2214l, rectF, this.f2192r, path);
    }

    /* JADX INFO: renamed from: l0 */
    public void m2284l0(float f3) {
        this.f2176b.f2215m = f3;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2176b = new c(this.f2176b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f2180f = true;
        this.f2181g = true;
        super.onBoundsChange(rect);
        if (this.f2176b.f2204b != null && !rect.isEmpty()) {
            m2244o0(getState(), this.f2199y);
        }
        this.f2199y = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f2176b.f2204b != null) {
            m2242n0(iArr);
        }
        boolean z2 = m2240m0(iArr) || m2247q0();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    /* JADX INFO: renamed from: q */
    protected int m2285q(int i3) {
        float fM2265M = m2265M() + m2257D();
        C0486a c0486a = this.f2176b.f2205c;
        return c0486a != null ? c0486a.m1797c(i3, fM2265M) : i3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        c cVar = this.f2176b;
        if (cVar.f2216n != i3) {
            cVar.f2216n = i3;
            m2225R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2176b.f2206d = colorFilter;
        m2225R();
    }

    @Override // p076Z0.InterfaceC0644o
    public void setShapeAppearanceModel(C0641l c0641l) {
        c cVar = this.f2176b;
        cVar.f2203a = c0641l;
        cVar.f2204b = null;
        this.f2172C = null;
        this.f2173D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2176b.f2210h = colorStateList;
        m2247q0();
        m2225R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2176b;
        if (cVar.f2211i != mode) {
            cVar.f2211i = mode;
            m2247q0();
            m2225R();
        }
    }

    /* JADX INFO: renamed from: v */
    protected void m2286v(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m2252u(canvas, paint, path, this.f2176b.f2203a, this.f2172C, rectF);
    }

    /* JADX INFO: renamed from: w */
    protected void mo2287w(Canvas canvas) {
        m2252u(canvas, this.f2190p, this.f2184j, this.f2200z, this.f2173D, m2253y());
    }

    /* JADX INFO: renamed from: x */
    protected RectF m2288x() {
        this.f2185k.set(getBounds());
        return this.f2185k;
    }

    /* JADX INFO: renamed from: z */
    public float m2289z() {
        float fMo2214a;
        float fMo2214a2;
        float[] fArr = this.f2172C;
        if (fArr != null) {
            fMo2214a = (fArr[3] + fArr[2]) - fArr[1];
            fMo2214a2 = fArr[0];
        } else {
            RectF rectFM2288x = m2288x();
            fMo2214a = (this.f2193s.m2378h(3, m2261H()).mo2214a(rectFM2288x) + this.f2193s.m2378h(2, m2261H()).mo2214a(rectFM2288x)) - this.f2193s.m2378h(1, m2261H()).mo2214a(rectFM2288x);
            fMo2214a2 = this.f2193s.m2378h(0, m2261H()).mo2214a(rectFM2288x);
        }
        return (fMo2214a - fMo2214a2) / 2.0f;
    }

    public C0637h(Context context, AttributeSet attributeSet, int i3, int i4) {
        this(C0641l.m2308e(context, attributeSet, i3, i4).m2351m());
    }

    public C0637h(C0641l c0641l) {
        this(new c(c0641l, null));
    }

    protected C0637h(c cVar) {
        C0642m c0642m;
        this.f2175a = new a();
        this.f2177c = new C0643n.g[4];
        this.f2178d = new C0643n.g[4];
        this.f2179e = new BitSet(8);
        this.f2182h = new Matrix();
        this.f2183i = new Path();
        this.f2184j = new Path();
        this.f2185k = new RectF();
        this.f2186l = new RectF();
        this.f2187m = new Region();
        this.f2188n = new Region();
        Paint paint = new Paint(1);
        this.f2189o = paint;
        Paint paint2 = new Paint(1);
        this.f2190p = paint2;
        this.f2191q = new C0621a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0642m = C0642m.m2371l();
        } else {
            c0642m = new C0642m();
        }
        this.f2193s = c0642m;
        this.f2197w = new RectF();
        this.f2198x = true;
        this.f2199y = true;
        this.f2171B = new C0465k[4];
        this.f2176b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m2247q0();
        m2240m0(getState());
        this.f2192r = new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: Z0.h$c */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        C0641l f2203a;

        /* JADX INFO: renamed from: b */
        C0649t f2204b;

        /* JADX INFO: renamed from: c */
        C0486a f2205c;

        /* JADX INFO: renamed from: d */
        ColorFilter f2206d;

        /* JADX INFO: renamed from: e */
        ColorStateList f2207e;

        /* JADX INFO: renamed from: f */
        ColorStateList f2208f;

        /* JADX INFO: renamed from: g */
        ColorStateList f2209g;

        /* JADX INFO: renamed from: h */
        ColorStateList f2210h;

        /* JADX INFO: renamed from: i */
        PorterDuff.Mode f2211i;

        /* JADX INFO: renamed from: j */
        Rect f2212j;

        /* JADX INFO: renamed from: k */
        float f2213k;

        /* JADX INFO: renamed from: l */
        float f2214l;

        /* JADX INFO: renamed from: m */
        float f2215m;

        /* JADX INFO: renamed from: n */
        int f2216n;

        /* JADX INFO: renamed from: o */
        float f2217o;

        /* JADX INFO: renamed from: p */
        float f2218p;

        /* JADX INFO: renamed from: q */
        float f2219q;

        /* JADX INFO: renamed from: r */
        int f2220r;

        /* JADX INFO: renamed from: s */
        int f2221s;

        /* JADX INFO: renamed from: t */
        int f2222t;

        /* JADX INFO: renamed from: u */
        int f2223u;

        /* JADX INFO: renamed from: v */
        boolean f2224v;

        /* JADX INFO: renamed from: w */
        Paint.Style f2225w;

        public c(C0641l c0641l, C0486a c0486a) {
            this.f2207e = null;
            this.f2208f = null;
            this.f2209g = null;
            this.f2210h = null;
            this.f2211i = PorterDuff.Mode.SRC_IN;
            this.f2212j = null;
            this.f2213k = 1.0f;
            this.f2214l = 1.0f;
            this.f2216n = 255;
            this.f2217o = 0.0f;
            this.f2218p = 0.0f;
            this.f2219q = 0.0f;
            this.f2220r = 0;
            this.f2221s = 0;
            this.f2222t = 0;
            this.f2223u = 0;
            this.f2224v = false;
            this.f2225w = Paint.Style.FILL_AND_STROKE;
            this.f2203a = c0641l;
            this.f2205c = c0486a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0637h c0637h = new C0637h(this);
            c0637h.f2180f = true;
            c0637h.f2181g = true;
            return c0637h;
        }

        public c(c cVar) {
            this.f2207e = null;
            this.f2208f = null;
            this.f2209g = null;
            this.f2210h = null;
            this.f2211i = PorterDuff.Mode.SRC_IN;
            this.f2212j = null;
            this.f2213k = 1.0f;
            this.f2214l = 1.0f;
            this.f2216n = 255;
            this.f2217o = 0.0f;
            this.f2218p = 0.0f;
            this.f2219q = 0.0f;
            this.f2220r = 0;
            this.f2221s = 0;
            this.f2222t = 0;
            this.f2223u = 0;
            this.f2224v = false;
            this.f2225w = Paint.Style.FILL_AND_STROKE;
            this.f2203a = cVar.f2203a;
            this.f2204b = cVar.f2204b;
            this.f2205c = cVar.f2205c;
            this.f2215m = cVar.f2215m;
            this.f2206d = cVar.f2206d;
            this.f2207e = cVar.f2207e;
            this.f2208f = cVar.f2208f;
            this.f2211i = cVar.f2211i;
            this.f2210h = cVar.f2210h;
            this.f2216n = cVar.f2216n;
            this.f2213k = cVar.f2213k;
            this.f2222t = cVar.f2222t;
            this.f2220r = cVar.f2220r;
            this.f2224v = cVar.f2224v;
            this.f2214l = cVar.f2214l;
            this.f2217o = cVar.f2217o;
            this.f2218p = cVar.f2218p;
            this.f2219q = cVar.f2219q;
            this.f2221s = cVar.f2221s;
            this.f2223u = cVar.f2223u;
            this.f2209g = cVar.f2209g;
            this.f2225w = cVar.f2225w;
            if (cVar.f2212j != null) {
                this.f2212j = new Rect(cVar.f2212j);
            }
        }
    }
}
