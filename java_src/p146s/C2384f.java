package p146s;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p137p.C2306d;
import p137p.C2311i;
import p146s.C2383e;
import p149t.C2410b;
import p149t.C2413e;

/* JADX INFO: renamed from: s.f */
/* JADX INFO: loaded from: classes.dex */
public class C2384f extends AbstractC2391m {

    /* JADX INFO: renamed from: M0 */
    private int f10993M0;

    /* JADX INFO: renamed from: Q0 */
    int f10997Q0;

    /* JADX INFO: renamed from: R0 */
    int f10998R0;

    /* JADX INFO: renamed from: S0 */
    int f10999S0;

    /* JADX INFO: renamed from: T0 */
    int f11000T0;

    /* JADX INFO: renamed from: K0 */
    C2410b f10991K0 = new C2410b(this);

    /* JADX INFO: renamed from: L0 */
    public C2413e f10992L0 = new C2413e(this);

    /* JADX INFO: renamed from: N0 */
    protected C2410b.b f10994N0 = null;

    /* JADX INFO: renamed from: O0 */
    private boolean f10995O0 = false;

    /* JADX INFO: renamed from: P0 */
    protected C2306d f10996P0 = new C2306d();

    /* JADX INFO: renamed from: U0 */
    public int f11001U0 = 0;

    /* JADX INFO: renamed from: V0 */
    public int f11002V0 = 0;

    /* JADX INFO: renamed from: W0 */
    C2381c[] f11003W0 = new C2381c[4];

    /* JADX INFO: renamed from: X0 */
    C2381c[] f11004X0 = new C2381c[4];

    /* JADX INFO: renamed from: Y0 */
    public boolean f11005Y0 = false;

    /* JADX INFO: renamed from: Z0 */
    public boolean f11006Z0 = false;

    /* JADX INFO: renamed from: a1 */
    public boolean f11007a1 = false;

    /* JADX INFO: renamed from: b1 */
    public int f11008b1 = 0;

    /* JADX INFO: renamed from: c1 */
    public int f11009c1 = 0;

    /* JADX INFO: renamed from: d1 */
    private int f11010d1 = 257;

    /* JADX INFO: renamed from: e1 */
    public boolean f11011e1 = false;

    /* JADX INFO: renamed from: f1 */
    private boolean f11012f1 = false;

    /* JADX INFO: renamed from: g1 */
    private boolean f11013g1 = false;

    /* JADX INFO: renamed from: h1 */
    int f11014h1 = 0;

    /* JADX INFO: renamed from: i1 */
    private WeakReference f11015i1 = null;

    /* JADX INFO: renamed from: j1 */
    private WeakReference f11016j1 = null;

    /* JADX INFO: renamed from: k1 */
    private WeakReference f11017k1 = null;

    /* JADX INFO: renamed from: l1 */
    private WeakReference f11018l1 = null;

    /* JADX INFO: renamed from: m1 */
    HashSet f11019m1 = new HashSet();

    /* JADX INFO: renamed from: n1 */
    public C2410b.a f11020n1 = new C2410b.a();

    /* JADX INFO: renamed from: M1 */
    public static boolean m11367M1(int i3, C2383e c2383e, C2410b.b bVar, C2410b.a aVar, int i4) {
        int i5;
        int i6;
        if (bVar == null) {
            return false;
        }
        if (c2383e.m11298S() == 8 || (c2383e instanceof C2386h) || (c2383e instanceof C2379a)) {
            aVar.f11258e = 0;
            aVar.f11259f = 0;
            return false;
        }
        aVar.f11254a = c2383e.m11262A();
        aVar.f11255b = c2383e.m11294Q();
        aVar.f11256c = c2383e.m11300T();
        aVar.f11257d = c2383e.m11361x();
        aVar.f11262i = false;
        aVar.f11263j = i4;
        C2383e.b bVar2 = aVar.f11254a;
        C2383e.b bVar3 = C2383e.b.MATCH_CONSTRAINT;
        boolean z2 = bVar2 == bVar3;
        boolean z3 = aVar.f11255b == bVar3;
        boolean z4 = z2 && c2383e.f10937c0 > 0.0f;
        boolean z5 = z3 && c2383e.f10937c0 > 0.0f;
        if (z2 && c2383e.m11308X(0) && c2383e.f10974v == 0 && !z4) {
            aVar.f11254a = C2383e.b.WRAP_CONTENT;
            if (z3 && c2383e.f10976w == 0) {
                aVar.f11254a = C2383e.b.FIXED;
            }
            z2 = false;
        }
        if (z3 && c2383e.m11308X(1) && c2383e.f10976w == 0 && !z5) {
            aVar.f11255b = C2383e.b.WRAP_CONTENT;
            if (z2 && c2383e.f10974v == 0) {
                aVar.f11255b = C2383e.b.FIXED;
            }
            z3 = false;
        }
        if (c2383e.mo11222k0()) {
            aVar.f11254a = C2383e.b.FIXED;
            z2 = false;
        }
        if (c2383e.mo11223l0()) {
            aVar.f11255b = C2383e.b.FIXED;
            z3 = false;
        }
        if (z4) {
            if (c2383e.f10978x[0] == 4) {
                aVar.f11254a = C2383e.b.FIXED;
            } else if (!z3) {
                C2383e.b bVar4 = aVar.f11255b;
                C2383e.b bVar5 = C2383e.b.FIXED;
                if (bVar4 == bVar5) {
                    i6 = aVar.f11257d;
                } else {
                    aVar.f11254a = C2383e.b.WRAP_CONTENT;
                    bVar.mo4027b(c2383e, aVar);
                    i6 = aVar.f11259f;
                }
                aVar.f11254a = bVar5;
                aVar.f11256c = (int) (c2383e.m11357v() * i6);
            }
        }
        if (z5) {
            if (c2383e.f10978x[1] == 4) {
                aVar.f11255b = C2383e.b.FIXED;
            } else if (!z2) {
                C2383e.b bVar6 = aVar.f11254a;
                C2383e.b bVar7 = C2383e.b.FIXED;
                if (bVar6 == bVar7) {
                    i5 = aVar.f11256c;
                } else {
                    aVar.f11255b = C2383e.b.WRAP_CONTENT;
                    bVar.mo4027b(c2383e, aVar);
                    i5 = aVar.f11258e;
                }
                aVar.f11255b = bVar7;
                if (c2383e.m11359w() == -1) {
                    aVar.f11257d = (int) (i5 / c2383e.m11357v());
                } else {
                    aVar.f11257d = (int) (c2383e.m11357v() * i5);
                }
            }
        }
        bVar.mo4027b(c2383e, aVar);
        c2383e.m11323e1(aVar.f11258e);
        c2383e.m11273F0(aVar.f11259f);
        c2383e.m11271E0(aVar.f11261h);
        c2383e.m11356u0(aVar.f11260g);
        aVar.f11263j = C2410b.a.f11251k;
        return aVar.f11262i;
    }

    /* JADX INFO: renamed from: O1 */
    private void m11368O1() {
        this.f11001U0 = 0;
        this.f11002V0 = 0;
    }

    /* JADX INFO: renamed from: r1 */
    private void m11369r1(C2383e c2383e) {
        int i3 = this.f11001U0 + 1;
        C2381c[] c2381cArr = this.f11004X0;
        if (i3 >= c2381cArr.length) {
            this.f11004X0 = (C2381c[]) Arrays.copyOf(c2381cArr, c2381cArr.length * 2);
        }
        this.f11004X0[this.f11001U0] = new C2381c(c2383e, 0, m11382J1());
        this.f11001U0++;
    }

    /* JADX INFO: renamed from: u1 */
    private void m11370u1(C2382d c2382d, C2311i c2311i) {
        this.f10996P0.m11036h(c2311i, this.f10996P0.m11043q(c2382d), 0, 5);
    }

    /* JADX INFO: renamed from: v1 */
    private void m11371v1(C2382d c2382d, C2311i c2311i) {
        this.f10996P0.m11036h(this.f10996P0.m11043q(c2382d), c2311i, 0, 5);
    }

    /* JADX INFO: renamed from: w1 */
    private void m11372w1(C2383e c2383e) {
        int i3 = this.f11002V0 + 1;
        C2381c[] c2381cArr = this.f11003W0;
        if (i3 >= c2381cArr.length) {
            this.f11003W0 = (C2381c[]) Arrays.copyOf(c2381cArr, c2381cArr.length * 2);
        }
        this.f11003W0[this.f11002V0] = new C2381c(c2383e, 1, m11382J1());
        this.f11002V0++;
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m11373A1(boolean z2) {
        return this.f10992L0.m11610g(z2);
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m11374B1(boolean z2, int i3) {
        return this.f10992L0.m11611h(z2, i3);
    }

    /* JADX INFO: renamed from: C1 */
    public C2410b.b m11375C1() {
        return this.f10994N0;
    }

    /* JADX INFO: renamed from: D1 */
    public int m11376D1() {
        return this.f11010d1;
    }

    /* JADX INFO: renamed from: E1 */
    public C2306d m11377E1() {
        return this.f10996P0;
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m11378F1() {
        return false;
    }

    /* JADX INFO: renamed from: G1 */
    public void m11379G1() {
        this.f10992L0.m11612j();
    }

    /* JADX INFO: renamed from: H1 */
    public void m11380H1() {
        this.f10992L0.m11613k();
    }

    /* JADX INFO: renamed from: I1 */
    public boolean m11381I1() {
        return this.f11013g1;
    }

    /* JADX INFO: renamed from: J1 */
    public boolean m11382J1() {
        return this.f10995O0;
    }

    /* JADX INFO: renamed from: K1 */
    public boolean m11383K1() {
        return this.f11012f1;
    }

    /* JADX INFO: renamed from: L1 */
    public long m11384L1(int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f10997Q0 = i10;
        this.f10998R0 = i11;
        return this.f10991K0.m11591d(this, i3, i10, i11, i4, i5, i6, i7, i8, i9);
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m11385N1(int i3) {
        return (this.f11010d1 & i3) == i3;
    }

    /* JADX INFO: renamed from: P1 */
    public void m11386P1(C2410b.b bVar) {
        this.f10994N0 = bVar;
        this.f10992L0.m11615n(bVar);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m11387Q1(int i3) {
        this.f11010d1 = i3;
        C2306d.f10632r = m11385N1(512);
    }

    /* JADX INFO: renamed from: R1 */
    public void m11388R1(int i3) {
        this.f10993M0 = i3;
    }

    /* JADX INFO: renamed from: S1 */
    public void m11389S1(boolean z2) {
        this.f10995O0 = z2;
    }

    /* JADX INFO: renamed from: T1 */
    public boolean m11390T1(C2306d c2306d, boolean[] zArr) {
        zArr[2] = false;
        boolean zM11385N1 = m11385N1(64);
        mo11337k1(c2306d, zM11385N1);
        int size = this.f11088J0.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C2383e c2383e = (C2383e) this.f11088J0.get(i3);
            c2383e.mo11337k1(c2306d, zM11385N1);
            if (c2383e.m11312Z()) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: U1 */
    public void m11391U1() {
        this.f10991K0.m11592e(this);
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: j1 */
    public void mo11335j1(boolean z2, boolean z3) {
        super.mo11335j1(z2, z3);
        int size = this.f11088J0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C2383e) this.f11088J0.get(i3)).mo11335j1(z2, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0329 A[PHI: r13 r19
  0x0329: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]
  0x0329: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0330  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // p146s.AbstractC2391m
    /* JADX INFO: renamed from: m1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo11392m1() {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p146s.C2384f.mo11392m1():void");
    }

    /* JADX INFO: renamed from: p1 */
    void m11393p1(C2383e c2383e, int i3) {
        if (i3 == 0) {
            m11369r1(c2383e);
        } else if (i3 == 1) {
            m11372w1(c2383e);
        }
    }

    @Override // p146s.AbstractC2391m, p146s.C2383e
    /* JADX INFO: renamed from: q0 */
    public void mo11348q0() {
        this.f10996P0.m11029D();
        this.f10997Q0 = 0;
        this.f10999S0 = 0;
        this.f10998R0 = 0;
        this.f11000T0 = 0;
        this.f11011e1 = false;
        super.mo11348q0();
    }

    /* JADX INFO: renamed from: q1 */
    public boolean m11394q1(C2306d c2306d) {
        C2384f c2384f;
        C2306d c2306d2;
        boolean zM11385N1 = m11385N1(64);
        mo11220g(c2306d, zM11385N1);
        int size = this.f11088J0.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C2383e c2383e = (C2383e) this.f11088J0.get(i3);
            c2383e.m11287M0(0, false);
            c2383e.m11287M0(1, false);
            if (c2383e instanceof C2379a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C2383e c2383e2 = (C2383e) this.f11088J0.get(i4);
                if (c2383e2 instanceof C2379a) {
                    ((C2379a) c2383e2).m11229s1();
                }
            }
        }
        this.f11019m1.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C2383e c2383e3 = (C2383e) this.f11088J0.get(i5);
            if (c2383e3.m11324f()) {
                if (c2383e3 instanceof AbstractC2390l) {
                    this.f11019m1.add(c2383e3);
                } else {
                    c2383e3.mo11220g(c2306d, zM11385N1);
                }
            }
        }
        while (this.f11019m1.size() > 0) {
            int size2 = this.f11019m1.size();
            Iterator it = this.f11019m1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2390l abstractC2390l = (AbstractC2390l) ((C2383e) it.next());
                if (abstractC2390l.m11484p1(this.f11019m1)) {
                    abstractC2390l.mo11220g(c2306d, zM11385N1);
                    this.f11019m1.remove(abstractC2390l);
                    break;
                }
            }
            if (size2 == this.f11019m1.size()) {
                Iterator it2 = this.f11019m1.iterator();
                while (it2.hasNext()) {
                    ((C2383e) it2.next()).mo11220g(c2306d, zM11385N1);
                }
                this.f11019m1.clear();
            }
        }
        if (C2306d.f10632r) {
            HashSet<C2383e> hashSet = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                C2383e c2383e4 = (C2383e) this.f11088J0.get(i6);
                if (!c2383e4.m11324f()) {
                    hashSet.add(c2383e4);
                }
            }
            c2384f = this;
            c2306d2 = c2306d;
            c2384f.m11321e(this, c2306d2, hashSet, m11262A() == C2383e.b.WRAP_CONTENT ? 0 : 1, false);
            for (C2383e c2383e5 : hashSet) {
                AbstractC2389k.m11471a(this, c2306d2, c2383e5);
                c2383e5.mo11220g(c2306d2, zM11385N1);
            }
        } else {
            c2384f = this;
            c2306d2 = c2306d;
            for (int i7 = 0; i7 < size; i7++) {
                C2383e c2383e6 = (C2383e) c2384f.f11088J0.get(i7);
                if (c2383e6 instanceof C2384f) {
                    C2383e.b[] bVarArr = c2383e6.f10930Y;
                    C2383e.b bVar = bVarArr[0];
                    C2383e.b bVar2 = bVarArr[1];
                    C2383e.b bVar3 = C2383e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c2383e6.m11281J0(C2383e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c2383e6.m11315a1(C2383e.b.FIXED);
                    }
                    c2383e6.mo11220g(c2306d2, zM11385N1);
                    if (bVar == bVar3) {
                        c2383e6.m11281J0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c2383e6.m11315a1(bVar2);
                    }
                } else {
                    AbstractC2389k.m11471a(this, c2306d2, c2383e6);
                    if (!c2383e6.m11324f()) {
                        c2383e6.mo11220g(c2306d2, zM11385N1);
                    }
                }
            }
        }
        if (c2384f.f11001U0 > 0) {
            AbstractC2380b.m11234b(this, c2306d2, null, 0);
        }
        if (c2384f.f11002V0 > 0) {
            AbstractC2380b.m11234b(this, c2306d2, null, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: s1 */
    public void m11395s1(C2382d c2382d) {
        WeakReference weakReference = this.f11018l1;
        if (weakReference == null || weakReference.get() == null || c2382d.m11242e() > ((C2382d) this.f11018l1.get()).m11242e()) {
            this.f11018l1 = new WeakReference(c2382d);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m11396t1(C2382d c2382d) {
        WeakReference weakReference = this.f11016j1;
        if (weakReference == null || weakReference.get() == null || c2382d.m11242e() > ((C2382d) this.f11016j1.get()).m11242e()) {
            this.f11016j1 = new WeakReference(c2382d);
        }
    }

    /* JADX INFO: renamed from: x1 */
    void m11397x1(C2382d c2382d) {
        WeakReference weakReference = this.f11017k1;
        if (weakReference == null || weakReference.get() == null || c2382d.m11242e() > ((C2382d) this.f11017k1.get()).m11242e()) {
            this.f11017k1 = new WeakReference(c2382d);
        }
    }

    /* JADX INFO: renamed from: y1 */
    void m11398y1(C2382d c2382d) {
        WeakReference weakReference = this.f11015i1;
        if (weakReference == null || weakReference.get() == null || c2382d.m11242e() > ((C2382d) this.f11015i1.get()).m11242e()) {
            this.f11015i1 = new WeakReference(c2382d);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public boolean m11399z1(boolean z2) {
        return this.f10992L0.m11609f(z2);
    }
}
