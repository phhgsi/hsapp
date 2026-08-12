package p137p;

import java.util.ArrayList;
import p137p.C2306d;
import p137p.C2311i;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
public class C2304b implements C2306d.a {

    /* JADX INFO: renamed from: e */
    public a f10626e;

    /* JADX INFO: renamed from: a */
    C2311i f10622a = null;

    /* JADX INFO: renamed from: b */
    float f10623b = 0.0f;

    /* JADX INFO: renamed from: c */
    boolean f10624c = false;

    /* JADX INFO: renamed from: d */
    ArrayList f10625d = new ArrayList();

    /* JADX INFO: renamed from: f */
    boolean f10627f = false;

    /* JADX INFO: renamed from: p.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        float mo10978a(int i3);

        /* JADX INFO: renamed from: b */
        float mo10979b(C2304b c2304b, boolean z2);

        /* JADX INFO: renamed from: c */
        float mo10980c(C2311i c2311i, boolean z2);

        void clear();

        /* JADX INFO: renamed from: d */
        void mo10981d(C2311i c2311i, float f3);

        /* JADX INFO: renamed from: e */
        boolean mo10982e(C2311i c2311i);

        /* JADX INFO: renamed from: f */
        void mo10983f(C2311i c2311i, float f3, boolean z2);

        /* JADX INFO: renamed from: g */
        int mo10984g();

        /* JADX INFO: renamed from: h */
        C2311i mo10985h(int i3);

        /* JADX INFO: renamed from: i */
        float mo10986i(C2311i c2311i);

        /* JADX INFO: renamed from: j */
        void mo10987j(float f3);

        /* JADX INFO: renamed from: k */
        void mo10988k();
    }

    public C2304b() {
    }

    /* JADX INFO: renamed from: u */
    private boolean m10989u(C2311i c2311i, C2306d c2306d) {
        return c2311i.f10683p <= 1;
    }

    /* JADX INFO: renamed from: w */
    private C2311i m10990w(boolean[] zArr, C2311i c2311i) {
        C2311i.a aVar;
        int iMo10984g = this.f10626e.mo10984g();
        C2311i c2311i2 = null;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < iMo10984g; i3++) {
            float fMo10978a = this.f10626e.mo10978a(i3);
            if (fMo10978a < 0.0f) {
                C2311i c2311iMo10985h = this.f10626e.mo10985h(i3);
                if ((zArr == null || !zArr[c2311iMo10985h.f10673f]) && c2311iMo10985h != c2311i && (((aVar = c2311iMo10985h.f10680m) == C2311i.a.SLACK || aVar == C2311i.a.ERROR) && fMo10978a < f3)) {
                    f3 = fMo10978a;
                    c2311i2 = c2311iMo10985h;
                }
            }
        }
        return c2311i2;
    }

    /* JADX INFO: renamed from: A */
    public void m10991A(C2306d c2306d, C2311i c2311i, boolean z2) {
        if (c2311i == null || !c2311i.f10677j) {
            return;
        }
        this.f10623b += c2311i.f10676i * this.f10626e.mo10986i(c2311i);
        this.f10626e.mo10980c(c2311i, z2);
        if (z2) {
            c2311i.m11064d(this);
        }
        if (C2306d.f10634t && this.f10626e.mo10984g() == 0) {
            this.f10627f = true;
            c2306d.f10640a = true;
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo10992B(C2306d c2306d, C2304b c2304b, boolean z2) {
        this.f10623b += c2304b.f10623b * this.f10626e.mo10979b(c2304b, z2);
        if (z2) {
            c2304b.f10622a.m11064d(this);
        }
        if (C2306d.f10634t && this.f10622a != null && this.f10626e.mo10984g() == 0) {
            this.f10627f = true;
            c2306d.f10640a = true;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m10993C(C2306d c2306d, C2311i c2311i, boolean z2) {
        if (c2311i == null || !c2311i.f10684q) {
            return;
        }
        float fMo10986i = this.f10626e.mo10986i(c2311i);
        this.f10623b += c2311i.f10686s * fMo10986i;
        this.f10626e.mo10980c(c2311i, z2);
        if (z2) {
            c2311i.m11064d(this);
        }
        this.f10626e.mo10983f(c2306d.f10653n.f10631d[c2311i.f10685r], fMo10986i, z2);
        if (C2306d.f10634t && this.f10626e.mo10984g() == 0) {
            this.f10627f = true;
            c2306d.f10640a = true;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m10994D(C2306d c2306d) {
        if (c2306d.f10646g.length == 0) {
            return;
        }
        boolean z2 = false;
        while (!z2) {
            int iMo10984g = this.f10626e.mo10984g();
            for (int i3 = 0; i3 < iMo10984g; i3++) {
                C2311i c2311iMo10985h = this.f10626e.mo10985h(i3);
                if (c2311iMo10985h.f10674g != -1 || c2311iMo10985h.f10677j || c2311iMo10985h.f10684q) {
                    this.f10625d.add(c2311iMo10985h);
                }
            }
            int size = this.f10625d.size();
            if (size > 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    C2311i c2311i = (C2311i) this.f10625d.get(i4);
                    if (c2311i.f10677j) {
                        m10991A(c2306d, c2311i, true);
                    } else if (c2311i.f10684q) {
                        m10993C(c2306d, c2311i, true);
                    } else {
                        mo10992B(c2306d, c2306d.f10646g[c2311i.f10674g], true);
                    }
                }
                this.f10625d.clear();
            } else {
                z2 = true;
            }
        }
        if (C2306d.f10634t && this.f10622a != null && this.f10626e.mo10984g() == 0) {
            this.f10627f = true;
            c2306d.f10640a = true;
        }
    }

    @Override // p137p.C2306d.a
    /* JADX INFO: renamed from: a */
    public void mo10995a(C2311i c2311i) {
        int i3 = c2311i.f10675h;
        float f3 = 1.0f;
        if (i3 != 1) {
            if (i3 == 2) {
                f3 = 1000.0f;
            } else if (i3 == 3) {
                f3 = 1000000.0f;
            } else if (i3 == 4) {
                f3 = 1.0E9f;
            } else if (i3 == 5) {
                f3 = 1.0E12f;
            }
        }
        this.f10626e.mo10981d(c2311i, f3);
    }

    @Override // p137p.C2306d.a
    /* JADX INFO: renamed from: b */
    public void mo10996b(C2306d.a aVar) {
        if (aVar instanceof C2304b) {
            C2304b c2304b = (C2304b) aVar;
            this.f10622a = null;
            this.f10626e.clear();
            for (int i3 = 0; i3 < c2304b.f10626e.mo10984g(); i3++) {
                this.f10626e.mo10983f(c2304b.f10626e.mo10985h(i3), c2304b.f10626e.mo10978a(i3), true);
            }
        }
    }

    @Override // p137p.C2306d.a
    /* JADX INFO: renamed from: c */
    public C2311i mo10997c(C2306d c2306d, boolean[] zArr) {
        return m10990w(zArr, null);
    }

    @Override // p137p.C2306d.a
    public void clear() {
        this.f10626e.clear();
        this.f10622a = null;
        this.f10623b = 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public C2304b m10998d(C2306d c2306d, int i3) {
        this.f10626e.mo10981d(c2306d.m11041o(i3, "ep"), 1.0f);
        this.f10626e.mo10981d(c2306d.m11041o(i3, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: e */
    C2304b m10999e(C2311i c2311i, int i3) {
        this.f10626e.mo10981d(c2311i, i3);
        return this;
    }

    /* JADX INFO: renamed from: f */
    boolean m11000f(C2306d c2306d) {
        boolean z2;
        C2311i c2311iM11001g = m11001g(c2306d);
        if (c2311iM11001g == null) {
            z2 = true;
        } else {
            m11016x(c2311iM11001g);
            z2 = false;
        }
        if (this.f10626e.mo10984g() == 0) {
            this.f10627f = true;
        }
        return z2;
    }

    /* JADX INFO: renamed from: g */
    C2311i m11001g(C2306d c2306d) {
        int iMo10984g = this.f10626e.mo10984g();
        C2311i c2311i = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        C2311i c2311i2 = null;
        for (int i3 = 0; i3 < iMo10984g; i3++) {
            float fMo10978a = this.f10626e.mo10978a(i3);
            C2311i c2311iMo10985h = this.f10626e.mo10985h(i3);
            if (c2311iMo10985h.f10680m == C2311i.a.UNRESTRICTED) {
                if (c2311i == null || f3 > fMo10978a) {
                    boolean zM10989u = m10989u(c2311iMo10985h, c2306d);
                    z2 = zM10989u;
                    f3 = fMo10978a;
                    c2311i = c2311iMo10985h;
                } else if (!z2 && m10989u(c2311iMo10985h, c2306d)) {
                    f3 = fMo10978a;
                    c2311i = c2311iMo10985h;
                    z2 = true;
                }
            } else if (c2311i == null && fMo10978a < 0.0f) {
                if (c2311i2 == null || f4 > fMo10978a) {
                    boolean zM10989u2 = m10989u(c2311iMo10985h, c2306d);
                    z3 = zM10989u2;
                    f4 = fMo10978a;
                    c2311i2 = c2311iMo10985h;
                } else if (!z3 && m10989u(c2311iMo10985h, c2306d)) {
                    f4 = fMo10978a;
                    c2311i2 = c2311iMo10985h;
                    z3 = true;
                }
            }
        }
        return c2311i != null ? c2311i : c2311i2;
    }

    @Override // p137p.C2306d.a
    public C2311i getKey() {
        return this.f10622a;
    }

    /* JADX INFO: renamed from: h */
    C2304b m11002h(C2311i c2311i, C2311i c2311i2, int i3, float f3, C2311i c2311i3, C2311i c2311i4, int i4) {
        if (c2311i2 == c2311i3) {
            this.f10626e.mo10981d(c2311i, 1.0f);
            this.f10626e.mo10981d(c2311i4, 1.0f);
            this.f10626e.mo10981d(c2311i2, -2.0f);
            return this;
        }
        if (f3 == 0.5f) {
            this.f10626e.mo10981d(c2311i, 1.0f);
            this.f10626e.mo10981d(c2311i2, -1.0f);
            this.f10626e.mo10981d(c2311i3, -1.0f);
            this.f10626e.mo10981d(c2311i4, 1.0f);
            if (i3 > 0 || i4 > 0) {
                this.f10623b = (-i3) + i4;
                return this;
            }
        } else {
            if (f3 <= 0.0f) {
                this.f10626e.mo10981d(c2311i, -1.0f);
                this.f10626e.mo10981d(c2311i2, 1.0f);
                this.f10623b = i3;
                return this;
            }
            if (f3 >= 1.0f) {
                this.f10626e.mo10981d(c2311i4, -1.0f);
                this.f10626e.mo10981d(c2311i3, 1.0f);
                this.f10623b = -i4;
                return this;
            }
            float f4 = 1.0f - f3;
            this.f10626e.mo10981d(c2311i, f4 * 1.0f);
            this.f10626e.mo10981d(c2311i2, f4 * (-1.0f));
            this.f10626e.mo10981d(c2311i3, (-1.0f) * f3);
            this.f10626e.mo10981d(c2311i4, 1.0f * f3);
            if (i3 > 0 || i4 > 0) {
                this.f10623b = ((-i3) * f4) + (i4 * f3);
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    C2304b m11003i(C2311i c2311i, int i3) {
        this.f10622a = c2311i;
        float f3 = i3;
        c2311i.f10676i = f3;
        this.f10623b = f3;
        this.f10627f = true;
        return this;
    }

    @Override // p137p.C2306d.a
    public boolean isEmpty() {
        return this.f10622a == null && this.f10623b == 0.0f && this.f10626e.mo10984g() == 0;
    }

    /* JADX INFO: renamed from: j */
    C2304b m11004j(C2311i c2311i, C2311i c2311i2, float f3) {
        this.f10626e.mo10981d(c2311i, -1.0f);
        this.f10626e.mo10981d(c2311i2, f3);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C2304b m11005k(C2311i c2311i, C2311i c2311i2, C2311i c2311i3, C2311i c2311i4, float f3) {
        this.f10626e.mo10981d(c2311i, -1.0f);
        this.f10626e.mo10981d(c2311i2, 1.0f);
        this.f10626e.mo10981d(c2311i3, f3);
        this.f10626e.mo10981d(c2311i4, -f3);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C2304b m11006l(float f3, float f4, float f5, C2311i c2311i, C2311i c2311i2, C2311i c2311i3, C2311i c2311i4) {
        this.f10623b = 0.0f;
        if (f4 == 0.0f || f3 == f5) {
            this.f10626e.mo10981d(c2311i, 1.0f);
            this.f10626e.mo10981d(c2311i2, -1.0f);
            this.f10626e.mo10981d(c2311i4, 1.0f);
            this.f10626e.mo10981d(c2311i3, -1.0f);
            return this;
        }
        if (f3 == 0.0f) {
            this.f10626e.mo10981d(c2311i, 1.0f);
            this.f10626e.mo10981d(c2311i2, -1.0f);
            return this;
        }
        if (f5 == 0.0f) {
            this.f10626e.mo10981d(c2311i3, 1.0f);
            this.f10626e.mo10981d(c2311i4, -1.0f);
            return this;
        }
        float f6 = (f3 / f4) / (f5 / f4);
        this.f10626e.mo10981d(c2311i, 1.0f);
        this.f10626e.mo10981d(c2311i2, -1.0f);
        this.f10626e.mo10981d(c2311i4, f6);
        this.f10626e.mo10981d(c2311i3, -f6);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C2304b m11007m(C2311i c2311i, int i3) {
        if (i3 < 0) {
            this.f10623b = i3 * (-1);
            this.f10626e.mo10981d(c2311i, 1.0f);
            return this;
        }
        this.f10623b = i3;
        this.f10626e.mo10981d(c2311i, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C2304b m11008n(C2311i c2311i, C2311i c2311i2, int i3) {
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z2 = true;
            }
            this.f10623b = i3;
        }
        if (z2) {
            this.f10626e.mo10981d(c2311i, 1.0f);
            this.f10626e.mo10981d(c2311i2, -1.0f);
            return this;
        }
        this.f10626e.mo10981d(c2311i, -1.0f);
        this.f10626e.mo10981d(c2311i2, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C2304b m11009o(C2311i c2311i, C2311i c2311i2, C2311i c2311i3, int i3) {
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z2 = true;
            }
            this.f10623b = i3;
        }
        if (z2) {
            this.f10626e.mo10981d(c2311i, 1.0f);
            this.f10626e.mo10981d(c2311i2, -1.0f);
            this.f10626e.mo10981d(c2311i3, -1.0f);
            return this;
        }
        this.f10626e.mo10981d(c2311i, -1.0f);
        this.f10626e.mo10981d(c2311i2, 1.0f);
        this.f10626e.mo10981d(c2311i3, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C2304b m11010p(C2311i c2311i, C2311i c2311i2, C2311i c2311i3, int i3) {
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z2 = true;
            }
            this.f10623b = i3;
        }
        if (z2) {
            this.f10626e.mo10981d(c2311i, 1.0f);
            this.f10626e.mo10981d(c2311i2, -1.0f);
            this.f10626e.mo10981d(c2311i3, 1.0f);
            return this;
        }
        this.f10626e.mo10981d(c2311i, -1.0f);
        this.f10626e.mo10981d(c2311i2, 1.0f);
        this.f10626e.mo10981d(c2311i3, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C2304b m11011q(C2311i c2311i, C2311i c2311i2, C2311i c2311i3, C2311i c2311i4, float f3) {
        this.f10626e.mo10981d(c2311i3, 0.5f);
        this.f10626e.mo10981d(c2311i4, 0.5f);
        this.f10626e.mo10981d(c2311i, -0.5f);
        this.f10626e.mo10981d(c2311i2, -0.5f);
        this.f10623b = -f3;
        return this;
    }

    /* JADX INFO: renamed from: r */
    void m11012r() {
        float f3 = this.f10623b;
        if (f3 < 0.0f) {
            this.f10623b = f3 * (-1.0f);
            this.f10626e.mo10988k();
        }
    }

    /* JADX INFO: renamed from: s */
    boolean m11013s() {
        C2311i c2311i = this.f10622a;
        if (c2311i != null) {
            return c2311i.f10680m == C2311i.a.UNRESTRICTED || this.f10623b >= 0.0f;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    boolean m11014t(C2311i c2311i) {
        return this.f10626e.mo10982e(c2311i);
    }

    public String toString() {
        return m11018z();
    }

    /* JADX INFO: renamed from: v */
    public C2311i m11015v(C2311i c2311i) {
        return m10990w(null, c2311i);
    }

    /* JADX INFO: renamed from: x */
    void m11016x(C2311i c2311i) {
        C2311i c2311i2 = this.f10622a;
        if (c2311i2 != null) {
            this.f10626e.mo10981d(c2311i2, -1.0f);
            this.f10622a.f10674g = -1;
            this.f10622a = null;
        }
        float fMo10980c = this.f10626e.mo10980c(c2311i, true) * (-1.0f);
        this.f10622a = c2311i;
        if (fMo10980c == 1.0f) {
            return;
        }
        this.f10623b /= fMo10980c;
        this.f10626e.mo10987j(fMo10980c);
    }

    /* JADX INFO: renamed from: y */
    public void m11017y() {
        this.f10622a = null;
        this.f10626e.clear();
        this.f10623b = 0.0f;
        this.f10627f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String m11018z() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p137p.C2304b.m11018z():java.lang.String");
    }

    public C2304b(C2305c c2305c) {
        this.f10626e = new C2303a(this, c2305c);
    }
}
