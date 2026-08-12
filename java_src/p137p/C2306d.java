package p137p;

import java.util.Arrays;
import java.util.HashMap;
import p137p.C2311i;
import p146s.C2382d;
import p146s.C2383e;

/* JADX INFO: renamed from: p.d */
/* JADX INFO: loaded from: classes.dex */
public class C2306d {

    /* JADX INFO: renamed from: r */
    public static boolean f10632r = false;

    /* JADX INFO: renamed from: s */
    public static boolean f10633s = true;

    /* JADX INFO: renamed from: t */
    public static boolean f10634t = true;

    /* JADX INFO: renamed from: u */
    public static boolean f10635u = true;

    /* JADX INFO: renamed from: v */
    public static boolean f10636v = false;

    /* JADX INFO: renamed from: w */
    private static int f10637w = 1000;

    /* JADX INFO: renamed from: x */
    public static long f10638x;

    /* JADX INFO: renamed from: y */
    public static long f10639y;

    /* JADX INFO: renamed from: d */
    private a f10643d;

    /* JADX INFO: renamed from: g */
    C2304b[] f10646g;

    /* JADX INFO: renamed from: n */
    final C2305c f10653n;

    /* JADX INFO: renamed from: q */
    private a f10656q;

    /* JADX INFO: renamed from: a */
    public boolean f10640a = false;

    /* JADX INFO: renamed from: b */
    int f10641b = 0;

    /* JADX INFO: renamed from: c */
    private HashMap f10642c = null;

    /* JADX INFO: renamed from: e */
    private int f10644e = 32;

    /* JADX INFO: renamed from: f */
    private int f10645f = 32;

    /* JADX INFO: renamed from: h */
    public boolean f10647h = false;

    /* JADX INFO: renamed from: i */
    public boolean f10648i = false;

    /* JADX INFO: renamed from: j */
    private boolean[] f10649j = new boolean[32];

    /* JADX INFO: renamed from: k */
    int f10650k = 1;

    /* JADX INFO: renamed from: l */
    int f10651l = 0;

    /* JADX INFO: renamed from: m */
    private int f10652m = 32;

    /* JADX INFO: renamed from: o */
    private C2311i[] f10654o = new C2311i[f10637w];

    /* JADX INFO: renamed from: p */
    private int f10655p = 0;

    /* JADX INFO: renamed from: p.d$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo10995a(C2311i c2311i);

        /* JADX INFO: renamed from: b */
        void mo10996b(a aVar);

        /* JADX INFO: renamed from: c */
        C2311i mo10997c(C2306d c2306d, boolean[] zArr);

        void clear();

        C2311i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: renamed from: p.d$b */
    class b extends C2304b {
        public b(C2305c c2305c) {
            this.f10626e = new C2312j(this, c2305c);
        }
    }

    public C2306d() {
        this.f10646g = null;
        this.f10646g = new C2304b[32];
        m11020C();
        C2305c c2305c = new C2305c();
        this.f10653n = c2305c;
        this.f10643d = new C2310h(c2305c);
        if (f10636v) {
            this.f10656q = new b(c2305c);
        } else {
            this.f10656q = new C2304b(c2305c);
        }
    }

    /* JADX INFO: renamed from: B */
    private final int m11019B(a aVar, boolean z2) {
        for (int i3 = 0; i3 < this.f10650k; i3++) {
            this.f10649j[i3] = false;
        }
        boolean z3 = false;
        int i4 = 0;
        while (!z3) {
            i4++;
            if (i4 < this.f10650k * 2) {
                if (aVar.getKey() != null) {
                    this.f10649j[aVar.getKey().f10673f] = true;
                }
                C2311i c2311iMo10997c = aVar.mo10997c(this, this.f10649j);
                if (c2311iMo10997c != null) {
                    boolean[] zArr = this.f10649j;
                    int i5 = c2311iMo10997c.f10673f;
                    if (!zArr[i5]) {
                        zArr[i5] = true;
                    }
                }
                if (c2311iMo10997c != null) {
                    float f3 = Float.MAX_VALUE;
                    int i6 = -1;
                    for (int i7 = 0; i7 < this.f10651l; i7++) {
                        C2304b c2304b = this.f10646g[i7];
                        if (c2304b.f10622a.f10680m != C2311i.a.UNRESTRICTED && !c2304b.f10627f && c2304b.m11014t(c2311iMo10997c)) {
                            float fMo10986i = c2304b.f10626e.mo10986i(c2311iMo10997c);
                            if (fMo10986i < 0.0f) {
                                float f4 = (-c2304b.f10623b) / fMo10986i;
                                if (f4 < f3) {
                                    i6 = i7;
                                    f3 = f4;
                                }
                            }
                        }
                    }
                    if (i6 > -1) {
                        C2304b c2304b2 = this.f10646g[i6];
                        c2304b2.f10622a.f10674g = -1;
                        c2304b2.m11016x(c2311iMo10997c);
                        C2311i c2311i = c2304b2.f10622a;
                        c2311i.f10674g = i6;
                        c2311i.m11068h(this, c2304b2);
                    }
                } else {
                    z3 = true;
                }
            }
            return i4;
        }
        return i4;
    }

    /* JADX INFO: renamed from: C */
    private void m11020C() {
        int i3 = 0;
        if (f10636v) {
            while (i3 < this.f10651l) {
                C2304b c2304b = this.f10646g[i3];
                if (c2304b != null) {
                    this.f10653n.f10628a.mo11049a(c2304b);
                }
                this.f10646g[i3] = null;
                i3++;
            }
            return;
        }
        while (i3 < this.f10651l) {
            C2304b c2304b2 = this.f10646g[i3];
            if (c2304b2 != null) {
                this.f10653n.f10629b.mo11049a(c2304b2);
            }
            this.f10646g[i3] = null;
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    private C2311i m11021a(C2311i.a aVar, String str) {
        C2311i c2311i = (C2311i) this.f10653n.f10630c.mo11050b();
        if (c2311i == null) {
            c2311i = new C2311i(aVar, str);
            c2311i.m11067g(aVar, str);
        } else {
            c2311i.m11065e();
            c2311i.m11067g(aVar, str);
        }
        int i3 = this.f10655p;
        int i4 = f10637w;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            f10637w = i5;
            this.f10654o = (C2311i[]) Arrays.copyOf(this.f10654o, i5);
        }
        C2311i[] c2311iArr = this.f10654o;
        int i6 = this.f10655p;
        this.f10655p = i6 + 1;
        c2311iArr[i6] = c2311i;
        return c2311i;
    }

    /* JADX INFO: renamed from: l */
    private final void m11022l(C2304b c2304b) {
        int i3;
        if (f10634t && c2304b.f10627f) {
            c2304b.f10622a.m11066f(this, c2304b.f10623b);
        } else {
            C2304b[] c2304bArr = this.f10646g;
            int i4 = this.f10651l;
            c2304bArr[i4] = c2304b;
            C2311i c2311i = c2304b.f10622a;
            c2311i.f10674g = i4;
            this.f10651l = i4 + 1;
            c2311i.m11068h(this, c2304b);
        }
        if (f10634t && this.f10640a) {
            int i5 = 0;
            while (i5 < this.f10651l) {
                if (this.f10646g[i5] == null) {
                    System.out.println("WTF");
                }
                C2304b c2304b2 = this.f10646g[i5];
                if (c2304b2 != null && c2304b2.f10627f) {
                    c2304b2.f10622a.m11066f(this, c2304b2.f10623b);
                    if (f10636v) {
                        this.f10653n.f10628a.mo11049a(c2304b2);
                    } else {
                        this.f10653n.f10629b.mo11049a(c2304b2);
                    }
                    this.f10646g[i5] = null;
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (true) {
                        i3 = this.f10651l;
                        if (i6 >= i3) {
                            break;
                        }
                        C2304b[] c2304bArr2 = this.f10646g;
                        int i8 = i6 - 1;
                        C2304b c2304b3 = c2304bArr2[i6];
                        c2304bArr2[i8] = c2304b3;
                        C2311i c2311i2 = c2304b3.f10622a;
                        if (c2311i2.f10674g == i6) {
                            c2311i2.f10674g = i8;
                        }
                        i7 = i6;
                        i6++;
                    }
                    if (i7 < i3) {
                        this.f10646g[i7] = null;
                    }
                    this.f10651l = i3 - 1;
                    i5--;
                }
                i5++;
            }
            this.f10640a = false;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m11023n() {
        for (int i3 = 0; i3 < this.f10651l; i3++) {
            C2304b c2304b = this.f10646g[i3];
            c2304b.f10622a.f10676i = c2304b.f10623b;
        }
    }

    /* JADX INFO: renamed from: s */
    public static C2304b m11024s(C2306d c2306d, C2311i c2311i, C2311i c2311i2, float f3) {
        return c2306d.m11044r().m11004j(c2311i, c2311i2, f3);
    }

    /* JADX INFO: renamed from: u */
    private int m11025u(a aVar) {
        float f3;
        float f4;
        for (int i3 = 0; i3 < this.f10651l; i3++) {
            C2304b c2304b = this.f10646g[i3];
            if (c2304b.f10622a.f10680m != C2311i.a.UNRESTRICTED) {
                float f5 = 0.0f;
                if (c2304b.f10623b < 0.0f) {
                    boolean z2 = false;
                    int i4 = 0;
                    while (!z2) {
                        i4++;
                        float f6 = Float.MAX_VALUE;
                        int i5 = 0;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        while (true) {
                            if (i5 >= this.f10651l) {
                                break;
                            }
                            C2304b c2304b2 = this.f10646g[i5];
                            if (c2304b2.f10622a.f10680m == C2311i.a.UNRESTRICTED || c2304b2.f10627f || c2304b2.f10623b >= f5) {
                                f3 = f5;
                            } else if (f10635u) {
                                int iMo10984g = c2304b2.f10626e.mo10984g();
                                int i9 = 0;
                                while (i9 < iMo10984g) {
                                    C2311i c2311iMo10985h = c2304b2.f10626e.mo10985h(i9);
                                    float fMo10986i = c2304b2.f10626e.mo10986i(c2311iMo10985h);
                                    if (fMo10986i <= f5) {
                                        f4 = f5;
                                    } else {
                                        f4 = f5;
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f7 = c2311iMo10985h.f10678k[i10] / fMo10986i;
                                            if ((f7 < f6 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i7 = c2311iMo10985h.f10673f;
                                                i6 = i5;
                                                f6 = f7;
                                            }
                                        }
                                    }
                                    i9++;
                                    f5 = f4;
                                }
                                f3 = f5;
                            } else {
                                f3 = f5;
                                for (int i11 = 1; i11 < this.f10650k; i11++) {
                                    C2311i c2311i = this.f10653n.f10631d[i11];
                                    float fMo10986i2 = c2304b2.f10626e.mo10986i(c2311i);
                                    if (fMo10986i2 > f3) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f8 = c2311i.f10678k[i12] / fMo10986i2;
                                            if ((f8 < f6 && i12 == i8) || i12 > i8) {
                                                i8 = i12;
                                                i6 = i5;
                                                i7 = i11;
                                                f6 = f8;
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            f5 = f3;
                        }
                        float f9 = f5;
                        if (i6 != -1) {
                            C2304b c2304b3 = this.f10646g[i6];
                            c2304b3.f10622a.f10674g = -1;
                            c2304b3.m11016x(this.f10653n.f10631d[i7]);
                            C2311i c2311i2 = c2304b3.f10622a;
                            c2311i2.f10674g = i6;
                            c2311i2.m11068h(this, c2304b3);
                        } else {
                            z2 = true;
                        }
                        if (i4 > this.f10650k / 2) {
                            z2 = true;
                        }
                        f5 = f9;
                    }
                    return i4;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public static AbstractC2307e m11026w() {
        return null;
    }

    /* JADX INFO: renamed from: y */
    private void m11027y() {
        int i3 = this.f10644e * 2;
        this.f10644e = i3;
        this.f10646g = (C2304b[]) Arrays.copyOf(this.f10646g, i3);
        C2305c c2305c = this.f10653n;
        c2305c.f10631d = (C2311i[]) Arrays.copyOf(c2305c.f10631d, this.f10644e);
        int i4 = this.f10644e;
        this.f10649j = new boolean[i4];
        this.f10645f = i4;
        this.f10652m = i4;
    }

    /* JADX INFO: renamed from: A */
    void m11028A(a aVar) {
        m11025u(aVar);
        m11019B(aVar, false);
        m11023n();
    }

    /* JADX INFO: renamed from: D */
    public void m11029D() {
        C2305c c2305c;
        int i3 = 0;
        while (true) {
            c2305c = this.f10653n;
            C2311i[] c2311iArr = c2305c.f10631d;
            if (i3 >= c2311iArr.length) {
                break;
            }
            C2311i c2311i = c2311iArr[i3];
            if (c2311i != null) {
                c2311i.m11065e();
            }
            i3++;
        }
        c2305c.f10630c.mo11051c(this.f10654o, this.f10655p);
        this.f10655p = 0;
        Arrays.fill(this.f10653n.f10631d, (Object) null);
        HashMap map = this.f10642c;
        if (map != null) {
            map.clear();
        }
        this.f10641b = 0;
        this.f10643d.clear();
        this.f10650k = 1;
        for (int i4 = 0; i4 < this.f10651l; i4++) {
            C2304b c2304b = this.f10646g[i4];
            if (c2304b != null) {
                c2304b.f10624c = false;
            }
        }
        m11020C();
        this.f10651l = 0;
        if (f10636v) {
            this.f10656q = new b(this.f10653n);
        } else {
            this.f10656q = new C2304b(this.f10653n);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11030b(C2383e c2383e, C2383e c2383e2, float f3, int i3) {
        C2382d.b bVar = C2382d.b.LEFT;
        C2311i c2311iM11043q = m11043q(c2383e.mo11343o(bVar));
        C2382d.b bVar2 = C2382d.b.TOP;
        C2311i c2311iM11043q2 = m11043q(c2383e.mo11343o(bVar2));
        C2382d.b bVar3 = C2382d.b.RIGHT;
        C2311i c2311iM11043q3 = m11043q(c2383e.mo11343o(bVar3));
        C2382d.b bVar4 = C2382d.b.BOTTOM;
        C2311i c2311iM11043q4 = m11043q(c2383e.mo11343o(bVar4));
        C2311i c2311iM11043q5 = m11043q(c2383e2.mo11343o(bVar));
        C2311i c2311iM11043q6 = m11043q(c2383e2.mo11343o(bVar2));
        C2311i c2311iM11043q7 = m11043q(c2383e2.mo11343o(bVar3));
        C2311i c2311iM11043q8 = m11043q(c2383e2.mo11343o(bVar4));
        C2304b c2304bM11044r = m11044r();
        double d3 = f3;
        double d4 = i3;
        c2304bM11044r.m11011q(c2311iM11043q2, c2311iM11043q4, c2311iM11043q6, c2311iM11043q8, (float) (Math.sin(d3) * d4));
        m11032d(c2304bM11044r);
        C2304b c2304bM11044r2 = m11044r();
        c2304bM11044r2.m11011q(c2311iM11043q, c2311iM11043q3, c2311iM11043q5, c2311iM11043q7, (float) (Math.cos(d3) * d4));
        m11032d(c2304bM11044r2);
    }

    /* JADX INFO: renamed from: c */
    public void m11031c(C2311i c2311i, C2311i c2311i2, int i3, float f3, C2311i c2311i3, C2311i c2311i4, int i4, int i5) {
        C2304b c2304bM11044r = m11044r();
        c2304bM11044r.m11002h(c2311i, c2311i2, i3, f3, c2311i3, c2311i4, i4);
        if (i5 != 8) {
            c2304bM11044r.m10998d(this, i5);
        }
        m11032d(c2304bM11044r);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11032d(p137p.C2304b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L8a
        L4:
            int r0 = r5.f10651l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f10652m
            if (r0 >= r2) goto L13
            int r0 = r5.f10650k
            int r0 = r0 + r1
            int r2 = r5.f10645f
            if (r0 < r2) goto L16
        L13:
            r5.m11027y()
        L16:
            boolean r0 = r6.f10627f
            r2 = 0
            if (r0 != 0) goto L85
            r6.m10994D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            goto L8a
        L25:
            r6.m11012r()
            boolean r0 = r6.m11000f(r5)
            if (r0 == 0) goto L7c
            p.i r0 = r5.m11042p()
            r6.f10622a = r0
            int r3 = r5.f10651l
            r5.m11022l(r6)
            int r4 = r5.f10651l
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            p.d$a r2 = r5.f10656q
            r2.mo10996b(r6)
            p.d$a r2 = r5.f10656q
            r5.m11019B(r2, r1)
            int r2 = r0.f10674g
            r3 = -1
            if (r2 != r3) goto L7d
            p.i r2 = r6.f10622a
            if (r2 != r0) goto L5a
            p.i r0 = r6.m11015v(r0)
            if (r0 == 0) goto L5a
            r6.m11016x(r0)
        L5a:
            boolean r0 = r6.f10627f
            if (r0 != 0) goto L63
            p.i r0 = r6.f10622a
            r0.m11068h(r5, r6)
        L63:
            boolean r0 = p137p.C2306d.f10636v
            if (r0 == 0) goto L6f
            p.c r0 = r5.f10653n
            p.f r0 = r0.f10628a
            r0.mo11049a(r6)
            goto L76
        L6f:
            p.c r0 = r5.f10653n
            p.f r0 = r0.f10629b
            r0.mo11049a(r6)
        L76:
            int r0 = r5.f10651l
            int r0 = r0 - r1
            r5.f10651l = r0
            goto L7d
        L7c:
            r1 = r2
        L7d:
            boolean r0 = r6.m11013s()
            if (r0 != 0) goto L84
            goto L8a
        L84:
            r2 = r1
        L85:
            if (r2 != 0) goto L8a
            r5.m11022l(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p137p.C2306d.m11032d(p.b):void");
    }

    /* JADX INFO: renamed from: e */
    public C2304b m11033e(C2311i c2311i, C2311i c2311i2, int i3, int i4) {
        if (f10633s && i4 == 8 && c2311i2.f10677j && c2311i.f10674g == -1) {
            c2311i.m11066f(this, c2311i2.f10676i + i3);
            return null;
        }
        C2304b c2304bM11044r = m11044r();
        c2304bM11044r.m11008n(c2311i, c2311i2, i3);
        if (i4 != 8) {
            c2304bM11044r.m10998d(this, i4);
        }
        m11032d(c2304bM11044r);
        return c2304bM11044r;
    }

    /* JADX INFO: renamed from: f */
    public void m11034f(C2311i c2311i, int i3) {
        if (f10633s && c2311i.f10674g == -1) {
            float f3 = i3;
            c2311i.m11066f(this, f3);
            for (int i4 = 0; i4 < this.f10641b + 1; i4++) {
                C2311i c2311i2 = this.f10653n.f10631d[i4];
                if (c2311i2 != null && c2311i2.f10684q && c2311i2.f10685r == c2311i.f10673f) {
                    c2311i2.m11066f(this, c2311i2.f10686s + f3);
                }
            }
            return;
        }
        int i5 = c2311i.f10674g;
        if (i5 == -1) {
            C2304b c2304bM11044r = m11044r();
            c2304bM11044r.m11003i(c2311i, i3);
            m11032d(c2304bM11044r);
            return;
        }
        C2304b c2304b = this.f10646g[i5];
        if (c2304b.f10627f) {
            c2304b.f10623b = i3;
            return;
        }
        if (c2304b.f10626e.mo10984g() == 0) {
            c2304b.f10627f = true;
            c2304b.f10623b = i3;
        } else {
            C2304b c2304bM11044r2 = m11044r();
            c2304bM11044r2.m11007m(c2311i, i3);
            m11032d(c2304bM11044r2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11035g(C2311i c2311i, C2311i c2311i2, int i3, boolean z2) {
        C2304b c2304bM11044r = m11044r();
        C2311i c2311iM11045t = m11045t();
        c2311iM11045t.f10675h = 0;
        c2304bM11044r.m11009o(c2311i, c2311i2, c2311iM11045t, i3);
        m11032d(c2304bM11044r);
    }

    /* JADX INFO: renamed from: h */
    public void m11036h(C2311i c2311i, C2311i c2311i2, int i3, int i4) {
        C2304b c2304bM11044r = m11044r();
        C2311i c2311iM11045t = m11045t();
        c2311iM11045t.f10675h = 0;
        c2304bM11044r.m11009o(c2311i, c2311i2, c2311iM11045t, i3);
        if (i4 != 8) {
            m11040m(c2304bM11044r, (int) (c2304bM11044r.f10626e.mo10986i(c2311iM11045t) * (-1.0f)), i4);
        }
        m11032d(c2304bM11044r);
    }

    /* JADX INFO: renamed from: i */
    public void m11037i(C2311i c2311i, C2311i c2311i2, int i3, boolean z2) {
        C2304b c2304bM11044r = m11044r();
        C2311i c2311iM11045t = m11045t();
        c2311iM11045t.f10675h = 0;
        c2304bM11044r.m11010p(c2311i, c2311i2, c2311iM11045t, i3);
        m11032d(c2304bM11044r);
    }

    /* JADX INFO: renamed from: j */
    public void m11038j(C2311i c2311i, C2311i c2311i2, int i3, int i4) {
        C2304b c2304bM11044r = m11044r();
        C2311i c2311iM11045t = m11045t();
        c2311iM11045t.f10675h = 0;
        c2304bM11044r.m11010p(c2311i, c2311i2, c2311iM11045t, i3);
        if (i4 != 8) {
            m11040m(c2304bM11044r, (int) (c2304bM11044r.f10626e.mo10986i(c2311iM11045t) * (-1.0f)), i4);
        }
        m11032d(c2304bM11044r);
    }

    /* JADX INFO: renamed from: k */
    public void m11039k(C2311i c2311i, C2311i c2311i2, C2311i c2311i3, C2311i c2311i4, float f3, int i3) {
        C2304b c2304bM11044r = m11044r();
        c2304bM11044r.m11005k(c2311i, c2311i2, c2311i3, c2311i4, f3);
        if (i3 != 8) {
            c2304bM11044r.m10998d(this, i3);
        }
        m11032d(c2304bM11044r);
    }

    /* JADX INFO: renamed from: m */
    void m11040m(C2304b c2304b, int i3, int i4) {
        c2304b.m10999e(m11041o(i4, null), i3);
    }

    /* JADX INFO: renamed from: o */
    public C2311i m11041o(int i3, String str) {
        if (this.f10650k + 1 >= this.f10645f) {
            m11027y();
        }
        C2311i c2311iM11021a = m11021a(C2311i.a.ERROR, str);
        int i4 = this.f10641b + 1;
        this.f10641b = i4;
        this.f10650k++;
        c2311iM11021a.f10673f = i4;
        c2311iM11021a.f10675h = i3;
        this.f10653n.f10631d[i4] = c2311iM11021a;
        this.f10643d.mo10995a(c2311iM11021a);
        return c2311iM11021a;
    }

    /* JADX INFO: renamed from: p */
    public C2311i m11042p() {
        if (this.f10650k + 1 >= this.f10645f) {
            m11027y();
        }
        C2311i c2311iM11021a = m11021a(C2311i.a.SLACK, null);
        int i3 = this.f10641b + 1;
        this.f10641b = i3;
        this.f10650k++;
        c2311iM11021a.f10673f = i3;
        this.f10653n.f10631d[i3] = c2311iM11021a;
        return c2311iM11021a;
    }

    /* JADX INFO: renamed from: q */
    public C2311i m11043q(Object obj) {
        C2311i c2311iM11246i = null;
        if (obj == null) {
            return null;
        }
        if (this.f10650k + 1 >= this.f10645f) {
            m11027y();
        }
        if (obj instanceof C2382d) {
            C2382d c2382d = (C2382d) obj;
            c2311iM11246i = c2382d.m11246i();
            if (c2311iM11246i == null) {
                c2382d.m11256s(this.f10653n);
                c2311iM11246i = c2382d.m11246i();
            }
            int i3 = c2311iM11246i.f10673f;
            if (i3 != -1 && i3 <= this.f10641b && this.f10653n.f10631d[i3] != null) {
                return c2311iM11246i;
            }
            if (i3 != -1) {
                c2311iM11246i.m11065e();
            }
            int i4 = this.f10641b + 1;
            this.f10641b = i4;
            this.f10650k++;
            c2311iM11246i.f10673f = i4;
            c2311iM11246i.f10680m = C2311i.a.UNRESTRICTED;
            this.f10653n.f10631d[i4] = c2311iM11246i;
        }
        return c2311iM11246i;
    }

    /* JADX INFO: renamed from: r */
    public C2304b m11044r() {
        C2304b c2304b;
        if (f10636v) {
            c2304b = (C2304b) this.f10653n.f10628a.mo11050b();
            if (c2304b == null) {
                c2304b = new b(this.f10653n);
                f10639y++;
            } else {
                c2304b.m11017y();
            }
        } else {
            c2304b = (C2304b) this.f10653n.f10629b.mo11050b();
            if (c2304b == null) {
                c2304b = new C2304b(this.f10653n);
                f10638x++;
            } else {
                c2304b.m11017y();
            }
        }
        C2311i.m11061c();
        return c2304b;
    }

    /* JADX INFO: renamed from: t */
    public C2311i m11045t() {
        if (this.f10650k + 1 >= this.f10645f) {
            m11027y();
        }
        C2311i c2311iM11021a = m11021a(C2311i.a.SLACK, null);
        int i3 = this.f10641b + 1;
        this.f10641b = i3;
        this.f10650k++;
        c2311iM11021a.f10673f = i3;
        this.f10653n.f10631d[i3] = c2311iM11021a;
        return c2311iM11021a;
    }

    /* JADX INFO: renamed from: v */
    public C2305c m11046v() {
        return this.f10653n;
    }

    /* JADX INFO: renamed from: x */
    public int m11047x(Object obj) {
        C2311i c2311iM11246i = ((C2382d) obj).m11246i();
        if (c2311iM11246i != null) {
            return (int) (c2311iM11246i.f10676i + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public void m11048z() {
        if (this.f10643d.isEmpty()) {
            m11023n();
            return;
        }
        if (!this.f10647h && !this.f10648i) {
            m11028A(this.f10643d);
            return;
        }
        for (int i3 = 0; i3 < this.f10651l; i3++) {
            if (!this.f10646g[i3].f10627f) {
                m11028A(this.f10643d);
                return;
            }
        }
        m11023n();
    }
}
