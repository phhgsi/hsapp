package p149t;

import java.util.ArrayList;
import p137p.C2306d;
import p146s.AbstractC2389k;
import p146s.AbstractC2390l;
import p146s.C2382d;
import p146s.C2383e;
import p146s.C2384f;
import p146s.C2386h;
import p146s.InterfaceC2387i;

/* JADX INFO: renamed from: t.b */
/* JADX INFO: loaded from: classes.dex */
public class C2410b {

    /* JADX INFO: renamed from: a */
    private final ArrayList f11248a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private a f11249b = new a();

    /* JADX INFO: renamed from: c */
    private C2384f f11250c;

    /* JADX INFO: renamed from: t.b$a */
    public static class a {

        /* JADX INFO: renamed from: k */
        public static int f11251k = 0;

        /* JADX INFO: renamed from: l */
        public static int f11252l = 1;

        /* JADX INFO: renamed from: m */
        public static int f11253m = 2;

        /* JADX INFO: renamed from: a */
        public C2383e.b f11254a;

        /* JADX INFO: renamed from: b */
        public C2383e.b f11255b;

        /* JADX INFO: renamed from: c */
        public int f11256c;

        /* JADX INFO: renamed from: d */
        public int f11257d;

        /* JADX INFO: renamed from: e */
        public int f11258e;

        /* JADX INFO: renamed from: f */
        public int f11259f;

        /* JADX INFO: renamed from: g */
        public int f11260g;

        /* JADX INFO: renamed from: h */
        public boolean f11261h;

        /* JADX INFO: renamed from: i */
        public boolean f11262i;

        /* JADX INFO: renamed from: j */
        public int f11263j;
    }

    /* JADX INFO: renamed from: t.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo4026a();

        /* JADX INFO: renamed from: b */
        void mo4027b(C2383e c2383e, a aVar);
    }

    public C2410b(C2384f c2384f) {
        this.f11250c = c2384f;
    }

    /* JADX INFO: renamed from: a */
    private boolean m11588a(b bVar, C2383e c2383e, int i3) {
        this.f11249b.f11254a = c2383e.m11262A();
        this.f11249b.f11255b = c2383e.m11294Q();
        this.f11249b.f11256c = c2383e.m11300T();
        this.f11249b.f11257d = c2383e.m11361x();
        a aVar = this.f11249b;
        aVar.f11262i = false;
        aVar.f11263j = i3;
        C2383e.b bVar2 = aVar.f11254a;
        C2383e.b bVar3 = C2383e.b.MATCH_CONSTRAINT;
        boolean z2 = bVar2 == bVar3;
        boolean z3 = aVar.f11255b == bVar3;
        boolean z4 = z2 && c2383e.f10937c0 > 0.0f;
        boolean z5 = z3 && c2383e.f10937c0 > 0.0f;
        if (z4 && c2383e.f10978x[0] == 4) {
            aVar.f11254a = C2383e.b.FIXED;
        }
        if (z5 && c2383e.f10978x[1] == 4) {
            aVar.f11255b = C2383e.b.FIXED;
        }
        bVar.mo4027b(c2383e, aVar);
        c2383e.m11323e1(this.f11249b.f11258e);
        c2383e.m11273F0(this.f11249b.f11259f);
        c2383e.m11271E0(this.f11249b.f11261h);
        c2383e.m11356u0(this.f11249b.f11260g);
        a aVar2 = this.f11249b;
        aVar2.f11263j = a.f11251k;
        return aVar2.f11262i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m11589b(p146s.C2384f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.f11088J0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.m11385N1(r1)
            t.b$b r2 = r13.m11375C1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList r5 = r13.f11088J0
            java.lang.Object r5 = r5.get(r4)
            s.e r5 = (p146s.C2383e) r5
            boolean r6 = r5 instanceof p146s.C2386h
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof p146s.C2379a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.m11331i0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            t.l r6 = r5.f10940e
            if (r6 == 0) goto L47
            t.n r7 = r5.f10942f
            if (r7 == 0) goto L47
            t.g r6 = r6.f11332e
            boolean r6 = r6.f11284j
            if (r6 == 0) goto L47
            t.g r6 = r7.f11332e
            boolean r6 = r6.f11284j
            if (r6 == 0) goto L47
            goto La0
        L47:
            s.e$b r6 = r5.m11355u(r3)
            r7 = 1
            s.e$b r8 = r5.m11355u(r7)
            s.e$b r9 = p146s.C2383e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f10974v
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f10976w
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.m11385N1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof p146s.AbstractC2390l
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f10974v
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.m11325f0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f10976w
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.m11325f0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f10937c0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = p149t.C2410b.a.f11251k
            r12.m11588a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.mo4026a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p149t.C2410b.m11589b(s.f):void");
    }

    /* JADX INFO: renamed from: c */
    private void m11590c(C2384f c2384f, String str, int i3, int i4, int i5) {
        int iM11278I = c2384f.m11278I();
        int iM11276H = c2384f.m11276H();
        c2384f.m11303U0(0);
        c2384f.m11301T0(0);
        c2384f.m11323e1(i4);
        c2384f.m11273F0(i5);
        c2384f.m11303U0(iM11278I);
        c2384f.m11301T0(iM11276H);
        this.f11250c.m11388R1(i3);
        this.f11250c.mo11392m1();
    }

    /* JADX INFO: renamed from: d */
    public long m11591d(C2384f c2384f, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        boolean zM11374B1;
        int i13;
        int i14;
        int i15;
        C2384f c2384f2;
        long j3;
        boolean z2;
        int i16;
        int i17;
        int i18;
        boolean zM11374B12;
        C2410b c2410b = this;
        b bVarM11375C1 = c2384f.m11375C1();
        int size = c2384f.f11088J0.size();
        int iM11300T = c2384f.m11300T();
        int iM11361x = c2384f.m11361x();
        boolean zM11472b = AbstractC2389k.m11472b(i3, 128);
        int i19 = (zM11472b || AbstractC2389k.m11472b(i3, 64)) ? 1 : 0;
        if (i19 != 0) {
            for (int i20 = 0; i20 < size; i20++) {
                C2383e c2383e = (C2383e) c2384f.f11088J0.get(i20);
                C2383e.b bVarM11262A = c2383e.m11262A();
                C2383e.b bVar = C2383e.b.MATCH_CONSTRAINT;
                i12 = 1;
                boolean z3 = (bVarM11262A == bVar) && (c2383e.m11294Q() == bVar) && c2383e.m11357v() > 0.0f;
                if ((c2383e.m11325f0() && z3) || ((c2383e.m11329h0() && z3) || (c2383e instanceof AbstractC2390l) || c2383e.m11325f0() || c2383e.m11329h0())) {
                    i19 = 0;
                    break;
                }
            }
            i12 = 1;
        } else {
            i12 = 1;
        }
        if (i19 != 0) {
            boolean z4 = C2306d.f10632r;
        }
        int i21 = i19 & (((i6 == 1073741824 && i8 == 1073741824) || zM11472b) ? i12 : 0);
        int i22 = 2;
        if (i21 != 0) {
            int iMin = Math.min(c2384f.m11274G(), i7);
            int iMin2 = Math.min(c2384f.m11272F(), i9);
            if (i6 == 1073741824 && c2384f.m11300T() != iMin) {
                c2384f.m11323e1(iMin);
                c2384f.m11379G1();
            }
            if (i8 == 1073741824 && c2384f.m11361x() != iMin2) {
                c2384f.m11273F0(iMin2);
                c2384f.m11379G1();
            }
            if (i6 == 1073741824 && i8 == 1073741824) {
                zM11374B1 = c2384f.m11399z1(zM11472b);
                i13 = 2;
            } else {
                boolean zM11373A1 = c2384f.m11373A1(zM11472b);
                if (i6 == 1073741824) {
                    zM11374B12 = zM11373A1 & c2384f.m11374B1(zM11472b, 0);
                    i13 = i12;
                } else {
                    zM11374B12 = zM11373A1;
                    i13 = 0;
                }
                if (i8 == 1073741824) {
                    int i23 = i12;
                    zM11374B1 = c2384f.m11374B1(zM11472b, i23) & zM11374B12;
                    i13 += i23;
                } else {
                    zM11374B1 = zM11374B12;
                }
            }
            if (zM11374B1) {
                c2384f.mo11335j1(i6 == 1073741824, i8 == 1073741824);
            }
        } else {
            zM11374B1 = false;
            i13 = 0;
        }
        long j4 = 0;
        if (zM11374B1 && i13 == 2) {
            return 0L;
        }
        int iM11376D1 = c2384f.m11376D1();
        if (size > 0) {
            m11589b(c2384f);
        }
        m11592e(c2384f);
        int size2 = c2410b.f11248a.size();
        if (size > 0) {
            c2410b.m11590c(c2384f, "First pass", 0, iM11300T, iM11361x);
            i14 = iM11300T;
            i15 = iM11361x;
        } else {
            i14 = iM11300T;
            i15 = iM11361x;
        }
        if (size2 > 0) {
            C2383e.b bVarM11262A2 = c2384f.m11262A();
            C2383e.b bVar2 = C2383e.b.WRAP_CONTENT;
            boolean z5 = bVarM11262A2 == bVar2;
            boolean z6 = c2384f.m11294Q() == bVar2;
            int iMax = Math.max(c2384f.m11300T(), c2410b.f11250c.m11278I());
            int iMax2 = Math.max(c2384f.m11361x(), c2410b.f11250c.m11276H());
            int i24 = 0;
            boolean zM11493z1 = false;
            while (i24 < size2) {
                long j5 = j4;
                C2383e c2383e2 = (C2383e) c2410b.f11248a.get(i24);
                if (c2383e2 instanceof AbstractC2390l) {
                    int iM11300T2 = c2383e2.m11300T();
                    int iM11361x2 = c2383e2.m11361x();
                    boolean zM11588a = zM11493z1 | c2410b.m11588a(bVarM11375C1, c2383e2, a.f11252l);
                    i17 = i14;
                    int iM11300T3 = c2383e2.m11300T();
                    i18 = i21;
                    int iM11361x3 = c2383e2.m11361x();
                    if (iM11300T3 != iM11300T2) {
                        c2383e2.m11323e1(iM11300T3);
                        if (z5 && c2383e2.m11286M() > iMax) {
                            iMax = Math.max(iMax, c2383e2.m11286M() + c2383e2.mo11343o(C2382d.b.RIGHT).m11243f());
                        }
                        zM11588a = true;
                    }
                    if (iM11361x3 != iM11361x2) {
                        c2383e2.m11273F0(iM11361x3);
                        if (z6 && c2383e2.m11349r() > iMax2) {
                            iMax2 = Math.max(iMax2, c2383e2.m11349r() + c2383e2.mo11343o(C2382d.b.BOTTOM).m11243f());
                        }
                        zM11588a = true;
                    }
                    zM11493z1 = zM11588a | ((AbstractC2390l) c2383e2).m11493z1();
                } else {
                    i17 = i14;
                    i18 = i21;
                }
                i24++;
                i14 = i17;
                j4 = j5;
                i21 = i18;
                i22 = 2;
            }
            int i25 = i14;
            int i26 = i21;
            j3 = j4;
            int i27 = i22;
            int i28 = 0;
            while (i28 < i27) {
                int i29 = 0;
                while (i29 < size2) {
                    C2383e c2383e3 = (C2383e) c2410b.f11248a.get(i29);
                    if (((c2383e3 instanceof InterfaceC2387i) && !(c2383e3 instanceof AbstractC2390l)) || (c2383e3 instanceof C2386h) || c2383e3.m11298S() == 8 || ((i26 != 0 && c2383e3.f10940e.f11332e.f11284j && c2383e3.f10942f.f11332e.f11284j) || (c2383e3 instanceof AbstractC2390l))) {
                        i16 = 1;
                    } else {
                        int iM11300T4 = c2383e3.m11300T();
                        int iM11361x4 = c2383e3.m11361x();
                        int iM11345p = c2383e3.m11345p();
                        int i30 = a.f11252l;
                        if (i28 == 1) {
                            i30 = a.f11253m;
                        }
                        boolean zM11588a2 = zM11493z1 | c2410b.m11588a(bVarM11375C1, c2383e3, i30);
                        int iM11300T5 = c2383e3.m11300T();
                        int iM11361x5 = c2383e3.m11361x();
                        if (iM11300T5 != iM11300T4) {
                            c2383e3.m11323e1(iM11300T5);
                            if (z5 && c2383e3.m11286M() > iMax) {
                                iMax = Math.max(iMax, c2383e3.m11286M() + c2383e3.mo11343o(C2382d.b.RIGHT).m11243f());
                            }
                            z2 = true;
                        } else {
                            z2 = zM11588a2;
                        }
                        if (iM11361x5 != iM11361x4) {
                            c2383e3.m11273F0(iM11361x5);
                            if (z6 && c2383e3.m11349r() > iMax2) {
                                iMax2 = Math.max(iMax2, c2383e3.m11349r() + c2383e3.mo11343o(C2382d.b.BOTTOM).m11243f());
                            }
                            z2 = true;
                        }
                        if (!c2383e3.m11306W() || iM11345p == c2383e3.m11345p()) {
                            zM11493z1 = z2;
                            i16 = 1;
                        } else {
                            i16 = 1;
                            zM11493z1 = true;
                        }
                    }
                    i29 += i16;
                    c2410b = this;
                }
                if (!zM11493z1) {
                    break;
                }
                i28++;
                m11590c(c2384f, "intermediate pass", i28, i25, i15);
                i27 = 2;
                zM11493z1 = false;
                c2410b = this;
            }
            c2384f2 = c2384f;
        } else {
            c2384f2 = c2384f;
            j3 = 0;
        }
        c2384f2.m11387Q1(iM11376D1);
        return j3;
    }

    /* JADX INFO: renamed from: e */
    public void m11592e(C2384f c2384f) {
        this.f11248a.clear();
        int size = c2384f.f11088J0.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2383e c2383e = (C2383e) c2384f.f11088J0.get(i3);
            C2383e.b bVarM11262A = c2383e.m11262A();
            C2383e.b bVar = C2383e.b.MATCH_CONSTRAINT;
            if (bVarM11262A == bVar || c2383e.m11294Q() == bVar) {
                this.f11248a.add(c2383e);
            }
        }
        c2384f.m11379G1();
    }
}
