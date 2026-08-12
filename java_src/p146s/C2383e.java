package p146s;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p137p.C2305c;
import p137p.C2306d;
import p143r.C2363a;
import p146s.C2382d;
import p149t.AbstractC2424p;
import p149t.C2411c;
import p149t.C2414f;
import p149t.C2420l;
import p149t.C2422n;

/* JADX INFO: renamed from: s.e */
/* JADX INFO: loaded from: classes.dex */
public class C2383e {

    /* JADX INFO: renamed from: I0 */
    public static float f10897I0 = 0.5f;

    /* JADX INFO: renamed from: A0 */
    boolean f10899A0;

    /* JADX INFO: renamed from: B0 */
    public float[] f10901B0;

    /* JADX INFO: renamed from: C0 */
    protected C2383e[] f10903C0;

    /* JADX INFO: renamed from: D0 */
    protected C2383e[] f10905D0;

    /* JADX INFO: renamed from: E0 */
    C2383e f10907E0;

    /* JADX INFO: renamed from: F0 */
    C2383e f10909F0;

    /* JADX INFO: renamed from: G0 */
    public int f10911G0;

    /* JADX INFO: renamed from: H0 */
    public int f10913H0;

    /* JADX INFO: renamed from: J */
    private boolean f10915J;

    /* JADX INFO: renamed from: U */
    public C2382d f10926U;

    /* JADX INFO: renamed from: V */
    public C2382d[] f10927V;

    /* JADX INFO: renamed from: W */
    protected ArrayList f10928W;

    /* JADX INFO: renamed from: X */
    private boolean[] f10929X;

    /* JADX INFO: renamed from: Y */
    public b[] f10930Y;

    /* JADX INFO: renamed from: Z */
    public C2383e f10931Z;

    /* JADX INFO: renamed from: a0 */
    int f10933a0;

    /* JADX INFO: renamed from: b0 */
    int f10935b0;

    /* JADX INFO: renamed from: c */
    public C2411c f10936c;

    /* JADX INFO: renamed from: c0 */
    public float f10937c0;

    /* JADX INFO: renamed from: d */
    public C2411c f10938d;

    /* JADX INFO: renamed from: d0 */
    protected int f10939d0;

    /* JADX INFO: renamed from: e0 */
    protected int f10941e0;

    /* JADX INFO: renamed from: f0 */
    protected int f10943f0;

    /* JADX INFO: renamed from: g0 */
    int f10945g0;

    /* JADX INFO: renamed from: h0 */
    int f10947h0;

    /* JADX INFO: renamed from: i0 */
    protected int f10949i0;

    /* JADX INFO: renamed from: j0 */
    protected int f10951j0;

    /* JADX INFO: renamed from: k0 */
    int f10953k0;

    /* JADX INFO: renamed from: l0 */
    protected int f10955l0;

    /* JADX INFO: renamed from: m0 */
    protected int f10957m0;

    /* JADX INFO: renamed from: n0 */
    float f10959n0;

    /* JADX INFO: renamed from: o0 */
    float f10961o0;

    /* JADX INFO: renamed from: p0 */
    private Object f10963p0;

    /* JADX INFO: renamed from: q0 */
    private int f10965q0;

    /* JADX INFO: renamed from: r0 */
    private int f10967r0;

    /* JADX INFO: renamed from: s0 */
    private String f10969s0;

    /* JADX INFO: renamed from: t0 */
    private String f10971t0;

    /* JADX INFO: renamed from: u0 */
    boolean f10973u0;

    /* JADX INFO: renamed from: v0 */
    boolean f10975v0;

    /* JADX INFO: renamed from: w0 */
    boolean f10977w0;

    /* JADX INFO: renamed from: x0 */
    int f10979x0;

    /* JADX INFO: renamed from: y0 */
    int f10981y0;

    /* JADX INFO: renamed from: z0 */
    boolean f10983z0;

    /* JADX INFO: renamed from: a */
    public boolean f10932a = false;

    /* JADX INFO: renamed from: b */
    public AbstractC2424p[] f10934b = new AbstractC2424p[2];

    /* JADX INFO: renamed from: e */
    public C2420l f10940e = null;

    /* JADX INFO: renamed from: f */
    public C2422n f10942f = null;

    /* JADX INFO: renamed from: g */
    public boolean[] f10944g = {true, true};

    /* JADX INFO: renamed from: h */
    boolean f10946h = false;

    /* JADX INFO: renamed from: i */
    private boolean f10948i = true;

    /* JADX INFO: renamed from: j */
    private boolean f10950j = false;

    /* JADX INFO: renamed from: k */
    private boolean f10952k = true;

    /* JADX INFO: renamed from: l */
    private int f10954l = -1;

    /* JADX INFO: renamed from: m */
    private int f10956m = -1;

    /* JADX INFO: renamed from: n */
    public C2363a f10958n = new C2363a(this);

    /* JADX INFO: renamed from: o */
    private boolean f10960o = false;

    /* JADX INFO: renamed from: p */
    private boolean f10962p = false;

    /* JADX INFO: renamed from: q */
    private boolean f10964q = false;

    /* JADX INFO: renamed from: r */
    private boolean f10966r = false;

    /* JADX INFO: renamed from: s */
    public int f10968s = -1;

    /* JADX INFO: renamed from: t */
    public int f10970t = -1;

    /* JADX INFO: renamed from: u */
    private int f10972u = 0;

    /* JADX INFO: renamed from: v */
    public int f10974v = 0;

    /* JADX INFO: renamed from: w */
    public int f10976w = 0;

    /* JADX INFO: renamed from: x */
    public int[] f10978x = new int[2];

    /* JADX INFO: renamed from: y */
    public int f10980y = 0;

    /* JADX INFO: renamed from: z */
    public int f10982z = 0;

    /* JADX INFO: renamed from: A */
    public float f10898A = 1.0f;

    /* JADX INFO: renamed from: B */
    public int f10900B = 0;

    /* JADX INFO: renamed from: C */
    public int f10902C = 0;

    /* JADX INFO: renamed from: D */
    public float f10904D = 1.0f;

    /* JADX INFO: renamed from: E */
    int f10906E = -1;

    /* JADX INFO: renamed from: F */
    float f10908F = 1.0f;

    /* JADX INFO: renamed from: G */
    private int[] f10910G = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: H */
    private float f10912H = 0.0f;

    /* JADX INFO: renamed from: I */
    private boolean f10914I = false;

    /* JADX INFO: renamed from: K */
    private boolean f10916K = false;

    /* JADX INFO: renamed from: L */
    private int f10917L = 0;

    /* JADX INFO: renamed from: M */
    private int f10918M = 0;

    /* JADX INFO: renamed from: N */
    public C2382d f10919N = new C2382d(this, C2382d.b.LEFT);

    /* JADX INFO: renamed from: O */
    public C2382d f10920O = new C2382d(this, C2382d.b.TOP);

    /* JADX INFO: renamed from: P */
    public C2382d f10921P = new C2382d(this, C2382d.b.RIGHT);

    /* JADX INFO: renamed from: Q */
    public C2382d f10922Q = new C2382d(this, C2382d.b.BOTTOM);

    /* JADX INFO: renamed from: R */
    public C2382d f10923R = new C2382d(this, C2382d.b.BASELINE);

    /* JADX INFO: renamed from: S */
    C2382d f10924S = new C2382d(this, C2382d.b.CENTER_X);

    /* JADX INFO: renamed from: T */
    C2382d f10925T = new C2382d(this, C2382d.b.CENTER_Y);

    /* JADX INFO: renamed from: s.e$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f10984a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f10985b;

        static {
            int[] iArr = new int[b.values().length];
            f10985b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10985b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10985b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10985b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C2382d.b.values().length];
            f10984a = iArr2;
            try {
                iArr2[C2382d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10984a[C2382d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10984a[C2382d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10984a[C2382d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10984a[C2382d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10984a[C2382d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10984a[C2382d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10984a[C2382d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10984a[C2382d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX INFO: renamed from: s.e$b */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C2383e() {
        C2382d c2382d = new C2382d(this, C2382d.b.CENTER);
        this.f10926U = c2382d;
        this.f10927V = new C2382d[]{this.f10919N, this.f10921P, this.f10920O, this.f10922Q, this.f10923R, c2382d};
        this.f10928W = new ArrayList();
        this.f10929X = new boolean[2];
        b bVar = b.FIXED;
        this.f10930Y = new b[]{bVar, bVar};
        this.f10931Z = null;
        this.f10933a0 = 0;
        this.f10935b0 = 0;
        this.f10937c0 = 0.0f;
        this.f10939d0 = -1;
        this.f10941e0 = 0;
        this.f10943f0 = 0;
        this.f10945g0 = 0;
        this.f10947h0 = 0;
        this.f10949i0 = 0;
        this.f10951j0 = 0;
        this.f10953k0 = 0;
        float f3 = f10897I0;
        this.f10959n0 = f3;
        this.f10961o0 = f3;
        this.f10965q0 = 0;
        this.f10967r0 = 0;
        this.f10969s0 = null;
        this.f10971t0 = null;
        this.f10977w0 = false;
        this.f10979x0 = 0;
        this.f10981y0 = 0;
        this.f10901B0 = new float[]{-1.0f, -1.0f};
        this.f10903C0 = new C2383e[]{null, null};
        this.f10905D0 = new C2383e[]{null, null};
        this.f10907E0 = null;
        this.f10909F0 = null;
        this.f10911G0 = -1;
        this.f10913H0 = -1;
        m11260d();
    }

    /* JADX INFO: renamed from: c0 */
    private boolean m11259c0(int i3) {
        C2382d c2382d;
        C2382d c2382d2;
        int i4 = i3 * 2;
        C2382d[] c2382dArr = this.f10927V;
        C2382d c2382d3 = c2382dArr[i4];
        C2382d c2382d4 = c2382d3.f10882f;
        return (c2382d4 == null || c2382d4.f10882f == c2382d3 || (c2382d2 = (c2382d = c2382dArr[i4 + 1]).f10882f) == null || c2382d2.f10882f != c2382d) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    private void m11260d() {
        this.f10928W.add(this.f10919N);
        this.f10928W.add(this.f10920O);
        this.f10928W.add(this.f10921P);
        this.f10928W.add(this.f10922Q);
        this.f10928W.add(this.f10924S);
        this.f10928W.add(this.f10925T);
        this.f10928W.add(this.f10926U);
        this.f10928W.add(this.f10923R);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x056f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:381:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m11261i(p137p.C2306d r34, boolean r35, boolean r36, boolean r37, boolean r38, p137p.C2311i r39, p137p.C2311i r40, p146s.C2383e.b r41, boolean r42, p146s.C2382d r43, p146s.C2382d r44, int r45, int r46, int r47, int r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, int r55, int r56, int r57, int r58, float r59, boolean r60) {
        /*
            Method dump skipped, instruction units count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p146s.C2383e.m11261i(p.d, boolean, boolean, boolean, boolean, p.i, p.i, s.e$b, boolean, s.d, s.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX INFO: renamed from: A */
    public b m11262A() {
        return this.f10930Y[0];
    }

    /* JADX INFO: renamed from: A0 */
    public void m11263A0(int i3) {
        this.f10919N.m11257t(i3);
        this.f10941e0 = i3;
    }

    /* JADX INFO: renamed from: B */
    public int m11264B() {
        C2382d c2382d = this.f10919N;
        int i3 = c2382d != null ? c2382d.f10883g : 0;
        C2382d c2382d2 = this.f10921P;
        return c2382d2 != null ? i3 + c2382d2.f10883g : i3;
    }

    /* JADX INFO: renamed from: B0 */
    public void m11265B0(int i3) {
        this.f10920O.m11257t(i3);
        this.f10943f0 = i3;
    }

    /* JADX INFO: renamed from: C */
    public int m11266C() {
        return this.f10917L;
    }

    /* JADX INFO: renamed from: C0 */
    public void m11267C0(int i3, int i4) {
        if (this.f10962p) {
            return;
        }
        this.f10920O.m11257t(i3);
        this.f10922Q.m11257t(i4);
        this.f10943f0 = i3;
        this.f10935b0 = i4 - i3;
        if (this.f10914I) {
            this.f10923R.m11257t(i3 + this.f10953k0);
        }
        this.f10962p = true;
    }

    /* JADX INFO: renamed from: D */
    public int m11268D() {
        return this.f10918M;
    }

    /* JADX INFO: renamed from: D0 */
    public void m11269D0(int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i5 - i3;
        int i10 = i6 - i4;
        this.f10941e0 = i3;
        this.f10943f0 = i4;
        if (this.f10967r0 == 8) {
            this.f10933a0 = 0;
            this.f10935b0 = 0;
            return;
        }
        b[] bVarArr = this.f10930Y;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i9 < (i8 = this.f10933a0)) {
            i9 = i8;
        }
        if (bVarArr[1] == bVar2 && i10 < (i7 = this.f10935b0)) {
            i10 = i7;
        }
        this.f10933a0 = i9;
        this.f10935b0 = i10;
        int i11 = this.f10957m0;
        if (i10 < i11) {
            this.f10935b0 = i11;
        }
        int i12 = this.f10955l0;
        if (i9 < i12) {
            this.f10933a0 = i12;
        }
        int i13 = this.f10982z;
        if (i13 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f10933a0 = Math.min(this.f10933a0, i13);
        }
        int i14 = this.f10902C;
        if (i14 > 0 && this.f10930Y[1] == b.MATCH_CONSTRAINT) {
            this.f10935b0 = Math.min(this.f10935b0, i14);
        }
        int i15 = this.f10933a0;
        if (i9 != i15) {
            this.f10954l = i15;
        }
        int i16 = this.f10935b0;
        if (i10 != i16) {
            this.f10956m = i16;
        }
    }

    /* JADX INFO: renamed from: E */
    public int m11270E(int i3) {
        if (i3 == 0) {
            return m11300T();
        }
        if (i3 == 1) {
            return m11361x();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E0 */
    public void m11271E0(boolean z2) {
        this.f10914I = z2;
    }

    /* JADX INFO: renamed from: F */
    public int m11272F() {
        return this.f10910G[1];
    }

    /* JADX INFO: renamed from: F0 */
    public void m11273F0(int i3) {
        this.f10935b0 = i3;
        int i4 = this.f10957m0;
        if (i3 < i4) {
            this.f10935b0 = i4;
        }
    }

    /* JADX INFO: renamed from: G */
    public int m11274G() {
        return this.f10910G[0];
    }

    /* JADX INFO: renamed from: G0 */
    public void m11275G0(float f3) {
        this.f10959n0 = f3;
    }

    /* JADX INFO: renamed from: H */
    public int m11276H() {
        return this.f10957m0;
    }

    /* JADX INFO: renamed from: H0 */
    public void m11277H0(int i3) {
        this.f10979x0 = i3;
    }

    /* JADX INFO: renamed from: I */
    public int m11278I() {
        return this.f10955l0;
    }

    /* JADX INFO: renamed from: I0 */
    public void m11279I0(int i3, int i4) {
        this.f10941e0 = i3;
        int i5 = i4 - i3;
        this.f10933a0 = i5;
        int i6 = this.f10955l0;
        if (i5 < i6) {
            this.f10933a0 = i6;
        }
    }

    /* JADX INFO: renamed from: J */
    public C2383e m11280J(int i3) {
        C2382d c2382d;
        C2382d c2382d2;
        if (i3 != 0) {
            if (i3 == 1 && (c2382d2 = (c2382d = this.f10922Q).f10882f) != null && c2382d2.f10882f == c2382d) {
                return c2382d2.f10880d;
            }
            return null;
        }
        C2382d c2382d3 = this.f10921P;
        C2382d c2382d4 = c2382d3.f10882f;
        if (c2382d4 == null || c2382d4.f10882f != c2382d3) {
            return null;
        }
        return c2382d4.f10880d;
    }

    /* JADX INFO: renamed from: J0 */
    public void m11281J0(b bVar) {
        this.f10930Y[0] = bVar;
    }

    /* JADX INFO: renamed from: K */
    public C2383e m11282K() {
        return this.f10931Z;
    }

    /* JADX INFO: renamed from: K0 */
    public void m11283K0(int i3, int i4, int i5, float f3) {
        this.f10974v = i3;
        this.f10980y = i4;
        if (i5 == Integer.MAX_VALUE) {
            i5 = 0;
        }
        this.f10982z = i5;
        this.f10898A = f3;
        if (f3 <= 0.0f || f3 >= 1.0f || i3 != 0) {
            return;
        }
        this.f10974v = 2;
    }

    /* JADX INFO: renamed from: L */
    public C2383e m11284L(int i3) {
        C2382d c2382d;
        C2382d c2382d2;
        if (i3 != 0) {
            if (i3 == 1 && (c2382d2 = (c2382d = this.f10920O).f10882f) != null && c2382d2.f10882f == c2382d) {
                return c2382d2.f10880d;
            }
            return null;
        }
        C2382d c2382d3 = this.f10919N;
        C2382d c2382d4 = c2382d3.f10882f;
        if (c2382d4 == null || c2382d4.f10882f != c2382d3) {
            return null;
        }
        return c2382d4.f10880d;
    }

    /* JADX INFO: renamed from: L0 */
    public void m11285L0(float f3) {
        this.f10901B0[0] = f3;
    }

    /* JADX INFO: renamed from: M */
    public int m11286M() {
        return m11302U() + this.f10933a0;
    }

    /* JADX INFO: renamed from: M0 */
    protected void m11287M0(int i3, boolean z2) {
        this.f10929X[i3] = z2;
    }

    /* JADX INFO: renamed from: N */
    public AbstractC2424p m11288N(int i3) {
        if (i3 == 0) {
            return this.f10940e;
        }
        if (i3 == 1) {
            return this.f10942f;
        }
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public void m11289N0(boolean z2) {
        this.f10915J = z2;
    }

    /* JADX INFO: renamed from: O */
    public float m11290O() {
        return this.f10961o0;
    }

    /* JADX INFO: renamed from: O0 */
    public void m11291O0(boolean z2) {
        this.f10916K = z2;
    }

    /* JADX INFO: renamed from: P */
    public int m11292P() {
        return this.f10981y0;
    }

    /* JADX INFO: renamed from: P0 */
    public void m11293P0(int i3, int i4) {
        this.f10917L = i3;
        this.f10918M = i4;
        m11299S0(false);
    }

    /* JADX INFO: renamed from: Q */
    public b m11294Q() {
        return this.f10930Y[1];
    }

    /* JADX INFO: renamed from: Q0 */
    public void m11295Q0(int i3) {
        this.f10910G[1] = i3;
    }

    /* JADX INFO: renamed from: R */
    public int m11296R() {
        int i3 = this.f10919N != null ? this.f10920O.f10883g : 0;
        return this.f10921P != null ? i3 + this.f10922Q.f10883g : i3;
    }

    /* JADX INFO: renamed from: R0 */
    public void m11297R0(int i3) {
        this.f10910G[0] = i3;
    }

    /* JADX INFO: renamed from: S */
    public int m11298S() {
        return this.f10967r0;
    }

    /* JADX INFO: renamed from: S0 */
    public void m11299S0(boolean z2) {
        this.f10948i = z2;
    }

    /* JADX INFO: renamed from: T */
    public int m11300T() {
        if (this.f10967r0 == 8) {
            return 0;
        }
        return this.f10933a0;
    }

    /* JADX INFO: renamed from: T0 */
    public void m11301T0(int i3) {
        if (i3 < 0) {
            this.f10957m0 = 0;
        } else {
            this.f10957m0 = i3;
        }
    }

    /* JADX INFO: renamed from: U */
    public int m11302U() {
        C2383e c2383e = this.f10931Z;
        return (c2383e == null || !(c2383e instanceof C2384f)) ? this.f10941e0 : ((C2384f) c2383e).f10997Q0 + this.f10941e0;
    }

    /* JADX INFO: renamed from: U0 */
    public void m11303U0(int i3) {
        if (i3 < 0) {
            this.f10955l0 = 0;
        } else {
            this.f10955l0 = i3;
        }
    }

    /* JADX INFO: renamed from: V */
    public int m11304V() {
        C2383e c2383e = this.f10931Z;
        return (c2383e == null || !(c2383e instanceof C2384f)) ? this.f10943f0 : ((C2384f) c2383e).f10998R0 + this.f10943f0;
    }

    /* JADX INFO: renamed from: V0 */
    public void m11305V0(int i3, int i4) {
        this.f10941e0 = i3;
        this.f10943f0 = i4;
    }

    /* JADX INFO: renamed from: W */
    public boolean m11306W() {
        return this.f10914I;
    }

    /* JADX INFO: renamed from: W0 */
    public void m11307W0(C2383e c2383e) {
        this.f10931Z = c2383e;
    }

    /* JADX INFO: renamed from: X */
    public boolean m11308X(int i3) {
        if (i3 == 0) {
            return (this.f10919N.f10882f != null ? 1 : 0) + (this.f10921P.f10882f != null ? 1 : 0) < 2;
        }
        return ((this.f10920O.f10882f != null ? 1 : 0) + (this.f10922Q.f10882f != null ? 1 : 0)) + (this.f10923R.f10882f != null ? 1 : 0) < 2;
    }

    /* JADX INFO: renamed from: X0 */
    public void m11309X0(float f3) {
        this.f10961o0 = f3;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m11310Y() {
        int size = this.f10928W.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C2382d) this.f10928W.get(i3)).m11250m()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m11311Y0(int i3) {
        this.f10981y0 = i3;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m11312Z() {
        return (this.f10954l == -1 && this.f10956m == -1) ? false : true;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m11313Z0(int i3, int i4) {
        this.f10943f0 = i3;
        int i5 = i4 - i3;
        this.f10935b0 = i5;
        int i6 = this.f10957m0;
        if (i5 < i6) {
            this.f10935b0 = i6;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m11314a0(int i3, int i4) {
        C2382d c2382d;
        C2382d c2382d2;
        if (i3 == 0) {
            C2382d c2382d3 = this.f10919N.f10882f;
            return c2382d3 != null && c2382d3.m11251n() && (c2382d2 = this.f10921P.f10882f) != null && c2382d2.m11251n() && (this.f10921P.f10882f.m11242e() - this.f10921P.m11243f()) - (this.f10919N.f10882f.m11242e() + this.f10919N.m11243f()) >= i4;
        }
        C2382d c2382d4 = this.f10920O.f10882f;
        if (c2382d4 != null && c2382d4.m11251n() && (c2382d = this.f10922Q.f10882f) != null && c2382d.m11251n() && (this.f10922Q.f10882f.m11242e() - this.f10922Q.m11243f()) - (this.f10920O.f10882f.m11242e() + this.f10920O.m11243f()) >= i4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a1 */
    public void m11315a1(b bVar) {
        this.f10930Y[1] = bVar;
    }

    /* JADX INFO: renamed from: b0 */
    public void m11316b0(C2382d.b bVar, C2383e c2383e, C2382d.b bVar2, int i3, int i4) {
        mo11343o(bVar).m11239b(c2383e.mo11343o(bVar2), i3, i4, true);
    }

    /* JADX INFO: renamed from: b1 */
    public void m11317b1(int i3, int i4, int i5, float f3) {
        this.f10976w = i3;
        this.f10900B = i4;
        if (i5 == Integer.MAX_VALUE) {
            i5 = 0;
        }
        this.f10902C = i5;
        this.f10904D = f3;
        if (f3 <= 0.0f || f3 >= 1.0f || i3 != 0) {
            return;
        }
        this.f10976w = 2;
    }

    /* JADX INFO: renamed from: c1 */
    public void m11318c1(float f3) {
        this.f10901B0[1] = f3;
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m11319d0() {
        return this.f10964q;
    }

    /* JADX INFO: renamed from: d1 */
    public void m11320d1(int i3) {
        this.f10967r0 = i3;
    }

    /* JADX INFO: renamed from: e */
    public void m11321e(C2384f c2384f, C2306d c2306d, HashSet hashSet, int i3, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            AbstractC2389k.m11471a(c2384f, c2306d, this);
            hashSet.remove(this);
            mo11220g(c2306d, c2384f.m11385N1(64));
        }
        if (i3 == 0) {
            HashSet hashSetM11241d = this.f10919N.m11241d();
            if (hashSetM11241d != null) {
                Iterator it = hashSetM11241d.iterator();
                while (it.hasNext()) {
                    ((C2382d) it.next()).f10880d.m11321e(c2384f, c2306d, hashSet, i3, true);
                }
            }
            HashSet hashSetM11241d2 = this.f10921P.m11241d();
            if (hashSetM11241d2 != null) {
                Iterator it2 = hashSetM11241d2.iterator();
                while (it2.hasNext()) {
                    ((C2382d) it2.next()).f10880d.m11321e(c2384f, c2306d, hashSet, i3, true);
                }
                return;
            }
            return;
        }
        HashSet hashSetM11241d3 = this.f10920O.m11241d();
        if (hashSetM11241d3 != null) {
            Iterator it3 = hashSetM11241d3.iterator();
            while (it3.hasNext()) {
                ((C2382d) it3.next()).f10880d.m11321e(c2384f, c2306d, hashSet, i3, true);
            }
        }
        HashSet hashSetM11241d4 = this.f10922Q.m11241d();
        if (hashSetM11241d4 != null) {
            Iterator it4 = hashSetM11241d4.iterator();
            while (it4.hasNext()) {
                ((C2382d) it4.next()).f10880d.m11321e(c2384f, c2306d, hashSet, i3, true);
            }
        }
        HashSet hashSetM11241d5 = this.f10923R.m11241d();
        if (hashSetM11241d5 != null) {
            Iterator it5 = hashSetM11241d5.iterator();
            while (it5.hasNext()) {
                ((C2382d) it5.next()).f10880d.m11321e(c2384f, c2306d, hashSet, i3, true);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m11322e0(int i3) {
        return this.f10929X[i3];
    }

    /* JADX INFO: renamed from: e1 */
    public void m11323e1(int i3) {
        this.f10933a0 = i3;
        int i4 = this.f10955l0;
        if (i3 < i4) {
            this.f10933a0 = i4;
        }
    }

    /* JADX INFO: renamed from: f */
    boolean m11324f() {
        return (this instanceof AbstractC2390l) || (this instanceof C2386h);
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m11325f0() {
        C2382d c2382d = this.f10919N;
        C2382d c2382d2 = c2382d.f10882f;
        if (c2382d2 != null && c2382d2.f10882f == c2382d) {
            return true;
        }
        C2382d c2382d3 = this.f10921P;
        C2382d c2382d4 = c2382d3.f10882f;
        return c2382d4 != null && c2382d4.f10882f == c2382d3;
    }

    /* JADX INFO: renamed from: f1 */
    public void m11326f1(int i3) {
        if (i3 < 0 || i3 > 3) {
            return;
        }
        this.f10972u = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x056b  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo11220g(p137p.C2306d r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 1423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p146s.C2383e.mo11220g(p.d, boolean):void");
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m11327g0() {
        return this.f10915J;
    }

    /* JADX INFO: renamed from: g1 */
    public void m11328g1(int i3) {
        this.f10941e0 = i3;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo11221h() {
        return this.f10967r0 != 8;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m11329h0() {
        C2382d c2382d = this.f10920O;
        C2382d c2382d2 = c2382d.f10882f;
        if (c2382d2 != null && c2382d2.f10882f == c2382d) {
            return true;
        }
        C2382d c2382d3 = this.f10922Q;
        C2382d c2382d4 = c2382d3.f10882f;
        return c2382d4 != null && c2382d4.f10882f == c2382d3;
    }

    /* JADX INFO: renamed from: h1 */
    public void m11330h1(int i3) {
        this.f10943f0 = i3;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m11331i0() {
        return this.f10916K;
    }

    /* JADX INFO: renamed from: i1 */
    public void m11332i1(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.f10906E == -1) {
            if (z4 && !z5) {
                this.f10906E = 0;
            } else if (!z4 && z5) {
                this.f10906E = 1;
                if (this.f10939d0 == -1) {
                    this.f10908F = 1.0f / this.f10908F;
                }
            }
        }
        if (this.f10906E == 0 && (!this.f10920O.m11252o() || !this.f10922Q.m11252o())) {
            this.f10906E = 1;
        } else if (this.f10906E == 1 && (!this.f10919N.m11252o() || !this.f10921P.m11252o())) {
            this.f10906E = 0;
        }
        if (this.f10906E == -1 && (!this.f10920O.m11252o() || !this.f10922Q.m11252o() || !this.f10919N.m11252o() || !this.f10921P.m11252o())) {
            if (this.f10920O.m11252o() && this.f10922Q.m11252o()) {
                this.f10906E = 0;
            } else if (this.f10919N.m11252o() && this.f10921P.m11252o()) {
                this.f10908F = 1.0f / this.f10908F;
                this.f10906E = 1;
            }
        }
        if (this.f10906E == -1) {
            int i3 = this.f10980y;
            if (i3 > 0 && this.f10900B == 0) {
                this.f10906E = 0;
            } else {
                if (i3 != 0 || this.f10900B <= 0) {
                    return;
                }
                this.f10908F = 1.0f / this.f10908F;
                this.f10906E = 1;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m11333j(C2382d.b bVar, C2383e c2383e, C2382d.b bVar2, int i3) {
        C2382d.b bVar3;
        C2382d.b bVar4;
        boolean z2;
        C2382d.b bVar5 = C2382d.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 != bVar5) {
                C2382d.b bVar6 = C2382d.b.LEFT;
                if (bVar2 == bVar6 || bVar2 == C2382d.b.RIGHT) {
                    m11333j(bVar6, c2383e, bVar2, 0);
                    m11333j(C2382d.b.RIGHT, c2383e, bVar2, 0);
                    mo11343o(bVar5).m11238a(c2383e.mo11343o(bVar2), 0);
                    return;
                }
                C2382d.b bVar7 = C2382d.b.TOP;
                if (bVar2 == bVar7 || bVar2 == C2382d.b.BOTTOM) {
                    m11333j(bVar7, c2383e, bVar2, 0);
                    m11333j(C2382d.b.BOTTOM, c2383e, bVar2, 0);
                    mo11343o(bVar5).m11238a(c2383e.mo11343o(bVar2), 0);
                    return;
                }
                return;
            }
            C2382d.b bVar8 = C2382d.b.LEFT;
            C2382d c2382dMo11343o = mo11343o(bVar8);
            C2382d.b bVar9 = C2382d.b.RIGHT;
            C2382d c2382dMo11343o2 = mo11343o(bVar9);
            C2382d.b bVar10 = C2382d.b.TOP;
            C2382d c2382dMo11343o3 = mo11343o(bVar10);
            C2382d.b bVar11 = C2382d.b.BOTTOM;
            C2382d c2382dMo11343o4 = mo11343o(bVar11);
            boolean z3 = true;
            if ((c2382dMo11343o == null || !c2382dMo11343o.m11252o()) && (c2382dMo11343o2 == null || !c2382dMo11343o2.m11252o())) {
                m11333j(bVar8, c2383e, bVar8, 0);
                m11333j(bVar9, c2383e, bVar9, 0);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((c2382dMo11343o3 == null || !c2382dMo11343o3.m11252o()) && (c2382dMo11343o4 == null || !c2382dMo11343o4.m11252o())) {
                m11333j(bVar10, c2383e, bVar10, 0);
                m11333j(bVar11, c2383e, bVar11, 0);
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                mo11343o(bVar5).m11238a(c2383e.mo11343o(bVar5), 0);
                return;
            }
            if (z2) {
                C2382d.b bVar12 = C2382d.b.CENTER_X;
                mo11343o(bVar12).m11238a(c2383e.mo11343o(bVar12), 0);
                return;
            } else {
                if (z3) {
                    C2382d.b bVar13 = C2382d.b.CENTER_Y;
                    mo11343o(bVar13).m11238a(c2383e.mo11343o(bVar13), 0);
                    return;
                }
                return;
            }
        }
        C2382d.b bVar14 = C2382d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = C2382d.b.LEFT) || bVar2 == C2382d.b.RIGHT)) {
            C2382d c2382dMo11343o5 = mo11343o(bVar4);
            C2382d c2382dMo11343o6 = c2383e.mo11343o(bVar2);
            C2382d c2382dMo11343o7 = mo11343o(C2382d.b.RIGHT);
            c2382dMo11343o5.m11238a(c2382dMo11343o6, 0);
            c2382dMo11343o7.m11238a(c2382dMo11343o6, 0);
            mo11343o(bVar14).m11238a(c2382dMo11343o6, 0);
            return;
        }
        C2382d.b bVar15 = C2382d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = C2382d.b.TOP) || bVar2 == C2382d.b.BOTTOM)) {
            C2382d c2382dMo11343o8 = c2383e.mo11343o(bVar2);
            mo11343o(bVar3).m11238a(c2382dMo11343o8, 0);
            mo11343o(C2382d.b.BOTTOM).m11238a(c2382dMo11343o8, 0);
            mo11343o(bVar15).m11238a(c2382dMo11343o8, 0);
            return;
        }
        if (bVar == bVar14 && bVar2 == bVar14) {
            C2382d.b bVar16 = C2382d.b.LEFT;
            mo11343o(bVar16).m11238a(c2383e.mo11343o(bVar16), 0);
            C2382d.b bVar17 = C2382d.b.RIGHT;
            mo11343o(bVar17).m11238a(c2383e.mo11343o(bVar17), 0);
            mo11343o(bVar14).m11238a(c2383e.mo11343o(bVar2), 0);
            return;
        }
        if (bVar == bVar15 && bVar2 == bVar15) {
            C2382d.b bVar18 = C2382d.b.TOP;
            mo11343o(bVar18).m11238a(c2383e.mo11343o(bVar18), 0);
            C2382d.b bVar19 = C2382d.b.BOTTOM;
            mo11343o(bVar19).m11238a(c2383e.mo11343o(bVar19), 0);
            mo11343o(bVar15).m11238a(c2383e.mo11343o(bVar2), 0);
            return;
        }
        C2382d c2382dMo11343o9 = mo11343o(bVar);
        C2382d c2382dMo11343o10 = c2383e.mo11343o(bVar2);
        if (c2382dMo11343o9.m11253p(c2382dMo11343o10)) {
            C2382d.b bVar20 = C2382d.b.BASELINE;
            if (bVar == bVar20) {
                C2382d c2382dMo11343o11 = mo11343o(C2382d.b.TOP);
                C2382d c2382dMo11343o12 = mo11343o(C2382d.b.BOTTOM);
                if (c2382dMo11343o11 != null) {
                    c2382dMo11343o11.m11254q();
                }
                if (c2382dMo11343o12 != null) {
                    c2382dMo11343o12.m11254q();
                }
            } else if (bVar == C2382d.b.TOP || bVar == C2382d.b.BOTTOM) {
                C2382d c2382dMo11343o13 = mo11343o(bVar20);
                if (c2382dMo11343o13 != null) {
                    c2382dMo11343o13.m11254q();
                }
                C2382d c2382dMo11343o14 = mo11343o(bVar5);
                if (c2382dMo11343o14.m11247j() != c2382dMo11343o10) {
                    c2382dMo11343o14.m11254q();
                }
                C2382d c2382dM11244g = mo11343o(bVar).m11244g();
                C2382d c2382dMo11343o15 = mo11343o(bVar15);
                if (c2382dMo11343o15.m11252o()) {
                    c2382dM11244g.m11254q();
                    c2382dMo11343o15.m11254q();
                }
            } else if (bVar == C2382d.b.LEFT || bVar == C2382d.b.RIGHT) {
                C2382d c2382dMo11343o16 = mo11343o(bVar5);
                if (c2382dMo11343o16.m11247j() != c2382dMo11343o10) {
                    c2382dMo11343o16.m11254q();
                }
                C2382d c2382dM11244g2 = mo11343o(bVar).m11244g();
                C2382d c2382dMo11343o17 = mo11343o(bVar14);
                if (c2382dMo11343o17.m11252o()) {
                    c2382dM11244g2.m11254q();
                    c2382dMo11343o17.m11254q();
                }
            }
            c2382dMo11343o9.m11238a(c2382dMo11343o10, i3);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m11334j0() {
        return this.f10948i && this.f10967r0 != 8;
    }

    /* JADX INFO: renamed from: j1 */
    public void mo11335j1(boolean z2, boolean z3) {
        int i3;
        int i4;
        boolean zM11657k = z2 & this.f10940e.m11657k();
        boolean zM11657k2 = z3 & this.f10942f.m11657k();
        C2420l c2420l = this.f10940e;
        int i5 = c2420l.f11335h.f11281g;
        C2422n c2422n = this.f10942f;
        int i6 = c2422n.f11335h.f11281g;
        int i7 = c2420l.f11336i.f11281g;
        int i8 = c2422n.f11336i.f11281g;
        int i9 = i8 - i6;
        if (i7 - i5 < 0 || i9 < 0 || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE) {
            i7 = 0;
            i5 = 0;
            i8 = 0;
            i6 = 0;
        }
        int i10 = i7 - i5;
        int i11 = i8 - i6;
        if (zM11657k) {
            this.f10941e0 = i5;
        }
        if (zM11657k2) {
            this.f10943f0 = i6;
        }
        if (this.f10967r0 == 8) {
            this.f10933a0 = 0;
            this.f10935b0 = 0;
            return;
        }
        if (zM11657k) {
            if (this.f10930Y[0] == b.FIXED && i10 < (i4 = this.f10933a0)) {
                i10 = i4;
            }
            this.f10933a0 = i10;
            int i12 = this.f10955l0;
            if (i10 < i12) {
                this.f10933a0 = i12;
            }
        }
        if (zM11657k2) {
            if (this.f10930Y[1] == b.FIXED && i11 < (i3 = this.f10935b0)) {
                i11 = i3;
            }
            this.f10935b0 = i11;
            int i13 = this.f10957m0;
            if (i11 < i13) {
                this.f10935b0 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m11336k(C2382d c2382d, C2382d c2382d2, int i3) {
        if (c2382d.m11245h() == this) {
            m11333j(c2382d.m11248k(), c2382d2.m11245h(), c2382d2.m11248k(), i3);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public boolean mo11222k0() {
        if (this.f10960o) {
            return true;
        }
        return this.f10919N.m11251n() && this.f10921P.m11251n();
    }

    /* JADX INFO: renamed from: k1 */
    public void mo11337k1(C2306d c2306d, boolean z2) {
        C2422n c2422n;
        C2420l c2420l;
        int iM11047x = c2306d.m11047x(this.f10919N);
        int iM11047x2 = c2306d.m11047x(this.f10920O);
        int iM11047x3 = c2306d.m11047x(this.f10921P);
        int iM11047x4 = c2306d.m11047x(this.f10922Q);
        if (z2 && (c2420l = this.f10940e) != null) {
            C2414f c2414f = c2420l.f11335h;
            if (c2414f.f11284j) {
                C2414f c2414f2 = c2420l.f11336i;
                if (c2414f2.f11284j) {
                    iM11047x = c2414f.f11281g;
                    iM11047x3 = c2414f2.f11281g;
                }
            }
        }
        if (z2 && (c2422n = this.f10942f) != null) {
            C2414f c2414f3 = c2422n.f11335h;
            if (c2414f3.f11284j) {
                C2414f c2414f4 = c2422n.f11336i;
                if (c2414f4.f11284j) {
                    iM11047x2 = c2414f3.f11281g;
                    iM11047x4 = c2414f4.f11281g;
                }
            }
        }
        int i3 = iM11047x4 - iM11047x2;
        if (iM11047x3 - iM11047x < 0 || i3 < 0 || iM11047x == Integer.MIN_VALUE || iM11047x == Integer.MAX_VALUE || iM11047x2 == Integer.MIN_VALUE || iM11047x2 == Integer.MAX_VALUE || iM11047x3 == Integer.MIN_VALUE || iM11047x3 == Integer.MAX_VALUE || iM11047x4 == Integer.MIN_VALUE || iM11047x4 == Integer.MAX_VALUE) {
            iM11047x = 0;
            iM11047x4 = 0;
            iM11047x2 = 0;
            iM11047x3 = 0;
        }
        m11269D0(iM11047x, iM11047x2, iM11047x3, iM11047x4);
    }

    /* JADX INFO: renamed from: l */
    public void m11338l(C2383e c2383e, float f3, int i3) {
        C2382d.b bVar = C2382d.b.CENTER;
        m11316b0(bVar, c2383e, bVar, i3, 0);
        this.f10912H = f3;
    }

    /* JADX INFO: renamed from: l0 */
    public boolean mo11223l0() {
        if (this.f10962p) {
            return true;
        }
        return this.f10920O.m11251n() && this.f10922Q.m11251n();
    }

    /* JADX INFO: renamed from: m */
    public void m11339m(C2306d c2306d) {
        c2306d.m11043q(this.f10919N);
        c2306d.m11043q(this.f10920O);
        c2306d.m11043q(this.f10921P);
        c2306d.m11043q(this.f10922Q);
        if (this.f10953k0 > 0) {
            c2306d.m11043q(this.f10923R);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m11340m0() {
        return this.f10966r;
    }

    /* JADX INFO: renamed from: n */
    public void m11341n() {
        if (this.f10940e == null) {
            this.f10940e = new C2420l(this);
        }
        if (this.f10942f == null) {
            this.f10942f = new C2422n(this);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m11342n0() {
        this.f10964q = true;
    }

    /* JADX INFO: renamed from: o */
    public C2382d mo11343o(C2382d.b bVar) {
        switch (a.f10984a[bVar.ordinal()]) {
            case 1:
                return this.f10919N;
            case 2:
                return this.f10920O;
            case 3:
                return this.f10921P;
            case 4:
                return this.f10922Q;
            case 5:
                return this.f10923R;
            case 6:
                return this.f10926U;
            case 7:
                return this.f10924S;
            case 8:
                return this.f10925T;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m11344o0() {
        this.f10966r = true;
    }

    /* JADX INFO: renamed from: p */
    public int m11345p() {
        return this.f10953k0;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m11346p0() {
        b[] bVarArr = this.f10930Y;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    /* JADX INFO: renamed from: q */
    public float m11347q(int i3) {
        if (i3 == 0) {
            return this.f10959n0;
        }
        if (i3 == 1) {
            return this.f10961o0;
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: q0 */
    public void mo11348q0() {
        this.f10919N.m11254q();
        this.f10920O.m11254q();
        this.f10921P.m11254q();
        this.f10922Q.m11254q();
        this.f10923R.m11254q();
        this.f10924S.m11254q();
        this.f10925T.m11254q();
        this.f10926U.m11254q();
        this.f10931Z = null;
        this.f10912H = 0.0f;
        this.f10933a0 = 0;
        this.f10935b0 = 0;
        this.f10937c0 = 0.0f;
        this.f10939d0 = -1;
        this.f10941e0 = 0;
        this.f10943f0 = 0;
        this.f10949i0 = 0;
        this.f10951j0 = 0;
        this.f10953k0 = 0;
        this.f10955l0 = 0;
        this.f10957m0 = 0;
        float f3 = f10897I0;
        this.f10959n0 = f3;
        this.f10961o0 = f3;
        b[] bVarArr = this.f10930Y;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f10963p0 = null;
        this.f10965q0 = 0;
        this.f10967r0 = 0;
        this.f10971t0 = null;
        this.f10973u0 = false;
        this.f10975v0 = false;
        this.f10979x0 = 0;
        this.f10981y0 = 0;
        this.f10983z0 = false;
        this.f10899A0 = false;
        float[] fArr = this.f10901B0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f10968s = -1;
        this.f10970t = -1;
        int[] iArr = this.f10910G;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f10974v = 0;
        this.f10976w = 0;
        this.f10898A = 1.0f;
        this.f10904D = 1.0f;
        this.f10982z = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f10902C = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f10980y = 0;
        this.f10900B = 0;
        this.f10946h = false;
        this.f10906E = -1;
        this.f10908F = 1.0f;
        this.f10977w0 = false;
        boolean[] zArr = this.f10944g;
        zArr[0] = true;
        zArr[1] = true;
        this.f10916K = false;
        boolean[] zArr2 = this.f10929X;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f10948i = true;
        int[] iArr2 = this.f10978x;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f10954l = -1;
        this.f10956m = -1;
    }

    /* JADX INFO: renamed from: r */
    public int m11349r() {
        return m11304V() + this.f10935b0;
    }

    /* JADX INFO: renamed from: r0 */
    public void m11350r0() {
        C2383e c2383eM11282K = m11282K();
        if (c2383eM11282K != null && (c2383eM11282K instanceof C2384f) && ((C2384f) m11282K()).m11378F1()) {
            return;
        }
        int size = this.f10928W.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C2382d) this.f10928W.get(i3)).m11254q();
        }
    }

    /* JADX INFO: renamed from: s */
    public Object m11351s() {
        return this.f10963p0;
    }

    /* JADX INFO: renamed from: s0 */
    public void m11352s0() {
        this.f10960o = false;
        this.f10962p = false;
        this.f10964q = false;
        this.f10966r = false;
        int size = this.f10928W.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C2382d) this.f10928W.get(i3)).m11255r();
        }
    }

    /* JADX INFO: renamed from: t */
    public String m11353t() {
        return this.f10969s0;
    }

    /* JADX INFO: renamed from: t0 */
    public void mo11354t0(C2305c c2305c) {
        this.f10919N.m11256s(c2305c);
        this.f10920O.m11256s(c2305c);
        this.f10921P.m11256s(c2305c);
        this.f10922Q.m11256s(c2305c);
        this.f10923R.m11256s(c2305c);
        this.f10926U.m11256s(c2305c);
        this.f10924S.m11256s(c2305c);
        this.f10925T.m11256s(c2305c);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f10971t0 != null) {
            str = "type: " + this.f10971t0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f10969s0 != null) {
            str2 = "id: " + this.f10969s0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f10941e0);
        sb.append(", ");
        sb.append(this.f10943f0);
        sb.append(") - (");
        sb.append(this.f10933a0);
        sb.append(" x ");
        sb.append(this.f10935b0);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public b m11355u(int i3) {
        if (i3 == 0) {
            return m11262A();
        }
        if (i3 == 1) {
            return m11294Q();
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public void m11356u0(int i3) {
        this.f10953k0 = i3;
        this.f10914I = i3 > 0;
    }

    /* JADX INFO: renamed from: v */
    public float m11357v() {
        return this.f10937c0;
    }

    /* JADX INFO: renamed from: v0 */
    public void m11358v0(Object obj) {
        this.f10963p0 = obj;
    }

    /* JADX INFO: renamed from: w */
    public int m11359w() {
        return this.f10939d0;
    }

    /* JADX INFO: renamed from: w0 */
    public void m11360w0(String str) {
        this.f10969s0 = str;
    }

    /* JADX INFO: renamed from: x */
    public int m11361x() {
        if (this.f10967r0 == 8) {
            return 0;
        }
        return this.f10935b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
  0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11362x0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L90
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L90
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L86
            int r2 = r9.length()
            if (r2 <= 0) goto L86
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L86:
            r9 = r0
        L87:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r8.f10937c0 = r9
            r8.f10939d0 = r5
        L8f:
            return
        L90:
            r8.f10937c0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p146s.C2383e.m11362x0(java.lang.String):void");
    }

    /* JADX INFO: renamed from: y */
    public float m11363y() {
        return this.f10959n0;
    }

    /* JADX INFO: renamed from: y0 */
    public void m11364y0(int i3) {
        if (this.f10914I) {
            int i4 = i3 - this.f10953k0;
            int i5 = this.f10935b0 + i4;
            this.f10943f0 = i4;
            this.f10920O.m11257t(i4);
            this.f10922Q.m11257t(i5);
            this.f10923R.m11257t(i3);
            this.f10962p = true;
        }
    }

    /* JADX INFO: renamed from: z */
    public int m11365z() {
        return this.f10979x0;
    }

    /* JADX INFO: renamed from: z0 */
    public void m11366z0(int i3, int i4) {
        if (this.f10960o) {
            return;
        }
        this.f10919N.m11257t(i3);
        this.f10921P.m11257t(i4);
        this.f10941e0 = i3;
        this.f10933a0 = i4 - i3;
        this.f10960o = true;
    }
}
