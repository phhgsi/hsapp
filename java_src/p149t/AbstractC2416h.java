package p149t;

import java.util.ArrayList;
import p146s.C2379a;
import p146s.C2382d;
import p146s.C2383e;
import p146s.C2384f;
import p146s.C2386h;
import p149t.C2410b;

/* JADX INFO: renamed from: t.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2416h {

    /* JADX INFO: renamed from: a */
    private static C2410b.a f11297a = new C2410b.a();

    /* JADX INFO: renamed from: b */
    private static int f11298b = 0;

    /* JADX INFO: renamed from: c */
    private static int f11299c = 0;

    /* JADX INFO: renamed from: a */
    private static boolean m11619a(int i3, C2383e c2383e) {
        C2383e.b bVar;
        C2383e.b bVar2;
        C2383e.b bVarM11262A = c2383e.m11262A();
        C2383e.b bVarM11294Q = c2383e.m11294Q();
        C2384f c2384f = c2383e.m11282K() != null ? (C2384f) c2383e.m11282K() : null;
        if (c2384f != null) {
            c2384f.m11262A();
            C2383e.b bVar3 = C2383e.b.FIXED;
        }
        if (c2384f != null) {
            c2384f.m11294Q();
            C2383e.b bVar4 = C2383e.b.FIXED;
        }
        C2383e.b bVar5 = C2383e.b.FIXED;
        boolean z2 = bVarM11262A == bVar5 || c2383e.mo11222k0() || bVarM11262A == C2383e.b.WRAP_CONTENT || (bVarM11262A == (bVar2 = C2383e.b.MATCH_CONSTRAINT) && c2383e.f10974v == 0 && c2383e.f10937c0 == 0.0f && c2383e.m11308X(0)) || (bVarM11262A == bVar2 && c2383e.f10974v == 1 && c2383e.m11314a0(0, c2383e.m11300T()));
        boolean z3 = bVarM11294Q == bVar5 || c2383e.mo11223l0() || bVarM11294Q == C2383e.b.WRAP_CONTENT || (bVarM11294Q == (bVar = C2383e.b.MATCH_CONSTRAINT) && c2383e.f10976w == 0 && c2383e.f10937c0 == 0.0f && c2383e.m11308X(1)) || (bVarM11262A == bVar && c2383e.f10976w == 1 && c2383e.m11314a0(1, c2383e.m11361x()));
        if (c2383e.f10937c0 <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static void m11620b(int i3, C2383e c2383e, C2410b.b bVar, boolean z2) {
        C2382d c2382d;
        C2382d c2382d2;
        C2382d c2382d3;
        C2382d c2382d4;
        C2382d c2382d5;
        if (c2383e.m11319d0()) {
            return;
        }
        f11298b++;
        if (!(c2383e instanceof C2384f) && c2383e.m11334j0()) {
            int i4 = i3 + 1;
            if (m11619a(i4, c2383e)) {
                C2384f.m11367M1(i4, c2383e, bVar, new C2410b.a(), C2410b.a.f11251k);
            }
        }
        C2382d c2382dMo11343o = c2383e.mo11343o(C2382d.b.LEFT);
        C2382d c2382dMo11343o2 = c2383e.mo11343o(C2382d.b.RIGHT);
        int iM11242e = c2382dMo11343o.m11242e();
        int iM11242e2 = c2382dMo11343o2.m11242e();
        if (c2382dMo11343o.m11241d() != null && c2382dMo11343o.m11251n()) {
            for (C2382d c2382d6 : c2382dMo11343o.m11241d()) {
                C2383e c2383e2 = c2382d6.f10880d;
                int i5 = i3 + 1;
                boolean zM11619a = m11619a(i5, c2383e2);
                if (c2383e2.m11334j0() && zM11619a) {
                    C2384f.m11367M1(i5, c2383e2, bVar, new C2410b.a(), C2410b.a.f11251k);
                }
                C2383e.b bVarM11262A = c2383e2.m11262A();
                C2383e.b bVar2 = C2383e.b.MATCH_CONSTRAINT;
                if (bVarM11262A != bVar2 || zM11619a) {
                    if (!c2383e2.m11334j0()) {
                        C2382d c2382d7 = c2383e2.f10919N;
                        if (c2382d6 == c2382d7 && c2383e2.f10921P.f10882f == null) {
                            int iM11243f = c2382d7.m11243f() + iM11242e;
                            c2383e2.m11366z0(iM11243f, c2383e2.m11300T() + iM11243f);
                            m11620b(i5, c2383e2, bVar, z2);
                        } else {
                            C2382d c2382d8 = c2383e2.f10921P;
                            if (c2382d6 == c2382d8 && c2382d7.f10882f == null) {
                                int iM11243f2 = iM11242e - c2382d8.m11243f();
                                c2383e2.m11366z0(iM11243f2 - c2383e2.m11300T(), iM11243f2);
                                m11620b(i5, c2383e2, bVar, z2);
                            } else if (c2382d6 == c2382d7 && (c2382d3 = c2382d8.f10882f) != null && c2382d3.m11251n() && !c2383e2.m11325f0()) {
                                m11622d(i5, bVar, c2383e2, z2);
                            }
                        }
                    }
                } else if (c2383e2.m11262A() == bVar2 && c2383e2.f10982z >= 0 && c2383e2.f10980y >= 0 && (c2383e2.m11298S() == 8 || (c2383e2.f10974v == 0 && c2383e2.m11357v() == 0.0f))) {
                    if (!c2383e2.m11325f0() && !c2383e2.m11331i0() && ((c2382d6 == c2383e2.f10919N && (c2382d5 = c2383e2.f10921P.f10882f) != null && c2382d5.m11251n()) || (c2382d6 == c2383e2.f10921P && (c2382d4 = c2383e2.f10919N.f10882f) != null && c2382d4.m11251n()))) {
                        if (!c2383e2.m11325f0()) {
                            m11623e(i5, c2383e, bVar, c2383e2, z2);
                        }
                    }
                }
            }
        }
        if (c2383e instanceof C2386h) {
            return;
        }
        if (c2382dMo11343o2.m11241d() != null && c2382dMo11343o2.m11251n()) {
            for (C2382d c2382d9 : c2382dMo11343o2.m11241d()) {
                C2383e c2383e3 = c2382d9.f10880d;
                int i6 = i3 + 1;
                boolean zM11619a2 = m11619a(i6, c2383e3);
                if (c2383e3.m11334j0() && zM11619a2) {
                    C2384f.m11367M1(i6, c2383e3, bVar, new C2410b.a(), C2410b.a.f11251k);
                }
                boolean z3 = (c2382d9 == c2383e3.f10919N && (c2382d2 = c2383e3.f10921P.f10882f) != null && c2382d2.m11251n()) || (c2382d9 == c2383e3.f10921P && (c2382d = c2383e3.f10919N.f10882f) != null && c2382d.m11251n());
                C2383e.b bVarM11262A2 = c2383e3.m11262A();
                C2383e.b bVar3 = C2383e.b.MATCH_CONSTRAINT;
                if (bVarM11262A2 != bVar3 || zM11619a2) {
                    if (!c2383e3.m11334j0()) {
                        C2382d c2382d10 = c2383e3.f10919N;
                        if (c2382d9 == c2382d10 && c2383e3.f10921P.f10882f == null) {
                            int iM11243f3 = c2382d10.m11243f() + iM11242e2;
                            c2383e3.m11366z0(iM11243f3, c2383e3.m11300T() + iM11243f3);
                            m11620b(i6, c2383e3, bVar, z2);
                        } else {
                            C2382d c2382d11 = c2383e3.f10921P;
                            if (c2382d9 == c2382d11 && c2382d10.f10882f == null) {
                                int iM11243f4 = iM11242e2 - c2382d11.m11243f();
                                c2383e3.m11366z0(iM11243f4 - c2383e3.m11300T(), iM11243f4);
                                m11620b(i6, c2383e3, bVar, z2);
                            } else if (z3 && !c2383e3.m11325f0()) {
                                m11622d(i6, bVar, c2383e3, z2);
                            }
                        }
                    }
                } else if (c2383e3.m11262A() == bVar3 && c2383e3.f10982z >= 0 && c2383e3.f10980y >= 0 && (c2383e3.m11298S() == 8 || (c2383e3.f10974v == 0 && c2383e3.m11357v() == 0.0f))) {
                    if (!c2383e3.m11325f0() && !c2383e3.m11331i0() && z3 && !c2383e3.m11325f0()) {
                        m11623e(i6, c2383e, bVar, c2383e3, z2);
                    }
                }
            }
        }
        c2383e.m11342n0();
    }

    /* JADX INFO: renamed from: c */
    private static void m11621c(int i3, C2379a c2379a, C2410b.b bVar, int i4, boolean z2) {
        if (c2379a.m11224n1()) {
            if (i4 == 0) {
                m11620b(i3 + 1, c2379a, bVar, z2);
            } else {
                m11627i(i3 + 1, c2379a, bVar);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m11622d(int i3, C2410b.b bVar, C2383e c2383e, boolean z2) {
        float fM11363y = c2383e.m11363y();
        int iM11242e = c2383e.f10919N.f10882f.m11242e();
        int iM11242e2 = c2383e.f10921P.f10882f.m11242e();
        int iM11243f = c2383e.f10919N.m11243f() + iM11242e;
        int iM11243f2 = iM11242e2 - c2383e.f10921P.m11243f();
        if (iM11242e == iM11242e2) {
            fM11363y = 0.5f;
        } else {
            iM11242e = iM11243f;
            iM11242e2 = iM11243f2;
        }
        int iM11300T = c2383e.m11300T();
        int i4 = (iM11242e2 - iM11242e) - iM11300T;
        if (iM11242e > iM11242e2) {
            i4 = (iM11242e - iM11242e2) - iM11300T;
        }
        int i5 = ((int) (i4 > 0 ? (fM11363y * i4) + 0.5f : fM11363y * i4)) + iM11242e;
        int i6 = i5 + iM11300T;
        if (iM11242e > iM11242e2) {
            i6 = i5 - iM11300T;
        }
        c2383e.m11366z0(i5, i6);
        m11620b(i3 + 1, c2383e, bVar, z2);
    }

    /* JADX INFO: renamed from: e */
    private static void m11623e(int i3, C2383e c2383e, C2410b.b bVar, C2383e c2383e2, boolean z2) {
        float fM11363y = c2383e2.m11363y();
        int iM11242e = c2383e2.f10919N.f10882f.m11242e() + c2383e2.f10919N.m11243f();
        int iM11242e2 = c2383e2.f10921P.f10882f.m11242e() - c2383e2.f10921P.m11243f();
        if (iM11242e2 >= iM11242e) {
            int iM11300T = c2383e2.m11300T();
            if (c2383e2.m11298S() != 8) {
                int i4 = c2383e2.f10974v;
                if (i4 == 2) {
                    iM11300T = (int) (c2383e2.m11363y() * 0.5f * (c2383e instanceof C2384f ? c2383e.m11300T() : c2383e.m11282K().m11300T()));
                } else if (i4 == 0) {
                    iM11300T = iM11242e2 - iM11242e;
                }
                iM11300T = Math.max(c2383e2.f10980y, iM11300T);
                int i5 = c2383e2.f10982z;
                if (i5 > 0) {
                    iM11300T = Math.min(i5, iM11300T);
                }
            }
            int i6 = iM11242e + ((int) ((fM11363y * ((iM11242e2 - iM11242e) - iM11300T)) + 0.5f));
            c2383e2.m11366z0(i6, iM11300T + i6);
            m11620b(i3 + 1, c2383e2, bVar, z2);
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m11624f(int i3, C2410b.b bVar, C2383e c2383e) {
        float fM11290O = c2383e.m11290O();
        int iM11242e = c2383e.f10920O.f10882f.m11242e();
        int iM11242e2 = c2383e.f10922Q.f10882f.m11242e();
        int iM11243f = c2383e.f10920O.m11243f() + iM11242e;
        int iM11243f2 = iM11242e2 - c2383e.f10922Q.m11243f();
        if (iM11242e == iM11242e2) {
            fM11290O = 0.5f;
        } else {
            iM11242e = iM11243f;
            iM11242e2 = iM11243f2;
        }
        int iM11361x = c2383e.m11361x();
        int i4 = (iM11242e2 - iM11242e) - iM11361x;
        if (iM11242e > iM11242e2) {
            i4 = (iM11242e - iM11242e2) - iM11361x;
        }
        int i5 = (int) (i4 > 0 ? (fM11290O * i4) + 0.5f : fM11290O * i4);
        int i6 = iM11242e + i5;
        int i7 = i6 + iM11361x;
        if (iM11242e > iM11242e2) {
            i6 = iM11242e - i5;
            i7 = i6 - iM11361x;
        }
        c2383e.m11267C0(i6, i7);
        m11627i(i3 + 1, c2383e, bVar);
    }

    /* JADX INFO: renamed from: g */
    private static void m11625g(int i3, C2383e c2383e, C2410b.b bVar, C2383e c2383e2) {
        float fM11290O = c2383e2.m11290O();
        int iM11242e = c2383e2.f10920O.f10882f.m11242e() + c2383e2.f10920O.m11243f();
        int iM11242e2 = c2383e2.f10922Q.f10882f.m11242e() - c2383e2.f10922Q.m11243f();
        if (iM11242e2 >= iM11242e) {
            int iM11361x = c2383e2.m11361x();
            if (c2383e2.m11298S() != 8) {
                int i4 = c2383e2.f10976w;
                if (i4 == 2) {
                    iM11361x = (int) (fM11290O * 0.5f * (c2383e instanceof C2384f ? c2383e.m11361x() : c2383e.m11282K().m11361x()));
                } else if (i4 == 0) {
                    iM11361x = iM11242e2 - iM11242e;
                }
                iM11361x = Math.max(c2383e2.f10900B, iM11361x);
                int i5 = c2383e2.f10902C;
                if (i5 > 0) {
                    iM11361x = Math.min(i5, iM11361x);
                }
            }
            int i6 = iM11242e + ((int) ((fM11290O * ((iM11242e2 - iM11242e) - iM11361x)) + 0.5f));
            c2383e2.m11267C0(i6, iM11361x + i6);
            m11627i(i3 + 1, c2383e2, bVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m11626h(C2384f c2384f, C2410b.b bVar) {
        C2383e.b bVarM11262A = c2384f.m11262A();
        C2383e.b bVarM11294Q = c2384f.m11294Q();
        f11298b = 0;
        f11299c = 0;
        c2384f.m11352s0();
        ArrayList arrayListM11495l1 = c2384f.m11495l1();
        int size = arrayListM11495l1.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C2383e) arrayListM11495l1.get(i3)).m11352s0();
        }
        boolean zM11382J1 = c2384f.m11382J1();
        if (bVarM11262A == C2383e.b.FIXED) {
            c2384f.m11366z0(0, c2384f.m11300T());
        } else {
            c2384f.m11263A0(0);
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C2383e c2383e = (C2383e) arrayListM11495l1.get(i4);
            if (c2383e instanceof C2386h) {
                C2386h c2386h = (C2386h) c2383e;
                if (c2386h.m11457m1() == 1) {
                    if (c2386h.m11458n1() != -1) {
                        c2386h.m11461q1(c2386h.m11458n1());
                    } else if (c2386h.m11459o1() != -1 && c2384f.mo11222k0()) {
                        c2386h.m11461q1(c2384f.m11300T() - c2386h.m11459o1());
                    } else if (c2384f.mo11222k0()) {
                        c2386h.m11461q1((int) ((c2386h.m11460p1() * c2384f.m11300T()) + 0.5f));
                    }
                    z2 = true;
                }
            } else if ((c2383e instanceof C2379a) && ((C2379a) c2383e).m11228r1() == 0) {
                z3 = true;
            }
        }
        if (z2) {
            for (int i5 = 0; i5 < size; i5++) {
                C2383e c2383e2 = (C2383e) arrayListM11495l1.get(i5);
                if (c2383e2 instanceof C2386h) {
                    C2386h c2386h2 = (C2386h) c2383e2;
                    if (c2386h2.m11457m1() == 1) {
                        m11620b(0, c2386h2, bVar, zM11382J1);
                    }
                }
            }
        }
        m11620b(0, c2384f, bVar, zM11382J1);
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C2383e c2383e3 = (C2383e) arrayListM11495l1.get(i6);
                if (c2383e3 instanceof C2379a) {
                    C2379a c2379a = (C2379a) c2383e3;
                    if (c2379a.m11228r1() == 0) {
                        m11621c(0, c2379a, bVar, 0, zM11382J1);
                    }
                }
            }
        }
        if (bVarM11294Q == C2383e.b.FIXED) {
            c2384f.m11267C0(0, c2384f.m11361x());
        } else {
            c2384f.m11265B0(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C2383e c2383e4 = (C2383e) arrayListM11495l1.get(i7);
            if (c2383e4 instanceof C2386h) {
                C2386h c2386h3 = (C2386h) c2383e4;
                if (c2386h3.m11457m1() == 0) {
                    if (c2386h3.m11458n1() != -1) {
                        c2386h3.m11461q1(c2386h3.m11458n1());
                    } else if (c2386h3.m11459o1() != -1 && c2384f.mo11223l0()) {
                        c2386h3.m11461q1(c2384f.m11361x() - c2386h3.m11459o1());
                    } else if (c2384f.mo11223l0()) {
                        c2386h3.m11461q1((int) ((c2386h3.m11460p1() * c2384f.m11361x()) + 0.5f));
                    }
                    z4 = true;
                }
            } else if ((c2383e4 instanceof C2379a) && ((C2379a) c2383e4).m11228r1() == 1) {
                z5 = true;
            }
        }
        if (z4) {
            for (int i8 = 0; i8 < size; i8++) {
                C2383e c2383e5 = (C2383e) arrayListM11495l1.get(i8);
                if (c2383e5 instanceof C2386h) {
                    C2386h c2386h4 = (C2386h) c2383e5;
                    if (c2386h4.m11457m1() == 0) {
                        m11627i(1, c2386h4, bVar);
                    }
                }
            }
        }
        m11627i(0, c2384f, bVar);
        if (z5) {
            for (int i9 = 0; i9 < size; i9++) {
                C2383e c2383e6 = (C2383e) arrayListM11495l1.get(i9);
                if (c2383e6 instanceof C2379a) {
                    C2379a c2379a2 = (C2379a) c2383e6;
                    if (c2379a2.m11228r1() == 1) {
                        m11621c(0, c2379a2, bVar, 1, zM11382J1);
                    }
                }
            }
        }
        for (int i10 = 0; i10 < size; i10++) {
            C2383e c2383e7 = (C2383e) arrayListM11495l1.get(i10);
            if (c2383e7.m11334j0() && m11619a(0, c2383e7)) {
                C2384f.m11367M1(0, c2383e7, bVar, f11297a, C2410b.a.f11251k);
                if (!(c2383e7 instanceof C2386h)) {
                    m11620b(0, c2383e7, bVar, zM11382J1);
                    m11627i(0, c2383e7, bVar);
                } else if (((C2386h) c2383e7).m11457m1() == 0) {
                    m11627i(0, c2383e7, bVar);
                } else {
                    m11620b(0, c2383e7, bVar, zM11382J1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m11627i(int i3, C2383e c2383e, C2410b.b bVar) {
        C2382d c2382d;
        C2382d c2382d2;
        C2382d c2382d3;
        C2382d c2382d4;
        C2382d c2382d5;
        if (c2383e.m11340m0()) {
            return;
        }
        f11299c++;
        if (!(c2383e instanceof C2384f) && c2383e.m11334j0()) {
            int i4 = i3 + 1;
            if (m11619a(i4, c2383e)) {
                C2384f.m11367M1(i4, c2383e, bVar, new C2410b.a(), C2410b.a.f11251k);
            }
        }
        C2382d c2382dMo11343o = c2383e.mo11343o(C2382d.b.TOP);
        C2382d c2382dMo11343o2 = c2383e.mo11343o(C2382d.b.BOTTOM);
        int iM11242e = c2382dMo11343o.m11242e();
        int iM11242e2 = c2382dMo11343o2.m11242e();
        if (c2382dMo11343o.m11241d() != null && c2382dMo11343o.m11251n()) {
            for (C2382d c2382d6 : c2382dMo11343o.m11241d()) {
                C2383e c2383e2 = c2382d6.f10880d;
                int i5 = i3 + 1;
                boolean zM11619a = m11619a(i5, c2383e2);
                if (c2383e2.m11334j0() && zM11619a) {
                    C2384f.m11367M1(i5, c2383e2, bVar, new C2410b.a(), C2410b.a.f11251k);
                }
                C2383e.b bVarM11294Q = c2383e2.m11294Q();
                C2383e.b bVar2 = C2383e.b.MATCH_CONSTRAINT;
                if (bVarM11294Q != bVar2 || zM11619a) {
                    if (!c2383e2.m11334j0()) {
                        C2382d c2382d7 = c2383e2.f10920O;
                        if (c2382d6 == c2382d7 && c2383e2.f10922Q.f10882f == null) {
                            int iM11243f = c2382d7.m11243f() + iM11242e;
                            c2383e2.m11267C0(iM11243f, c2383e2.m11361x() + iM11243f);
                            m11627i(i5, c2383e2, bVar);
                        } else {
                            C2382d c2382d8 = c2383e2.f10922Q;
                            if (c2382d6 == c2382d8 && c2382d8.f10882f == null) {
                                int iM11243f2 = iM11242e - c2382d8.m11243f();
                                c2383e2.m11267C0(iM11243f2 - c2383e2.m11361x(), iM11243f2);
                                m11627i(i5, c2383e2, bVar);
                            } else if (c2382d6 == c2382d7 && (c2382d3 = c2382d8.f10882f) != null && c2382d3.m11251n()) {
                                m11624f(i5, bVar, c2383e2);
                            }
                        }
                    }
                } else if (c2383e2.m11294Q() == bVar2 && c2383e2.f10902C >= 0 && c2383e2.f10900B >= 0 && (c2383e2.m11298S() == 8 || (c2383e2.f10976w == 0 && c2383e2.m11357v() == 0.0f))) {
                    if (!c2383e2.m11329h0() && !c2383e2.m11331i0() && ((c2382d6 == c2383e2.f10920O && (c2382d5 = c2383e2.f10922Q.f10882f) != null && c2382d5.m11251n()) || (c2382d6 == c2383e2.f10922Q && (c2382d4 = c2383e2.f10920O.f10882f) != null && c2382d4.m11251n()))) {
                        if (!c2383e2.m11329h0()) {
                            m11625g(i5, c2383e, bVar, c2383e2);
                        }
                    }
                }
            }
        }
        if (c2383e instanceof C2386h) {
            return;
        }
        if (c2382dMo11343o2.m11241d() != null && c2382dMo11343o2.m11251n()) {
            for (C2382d c2382d9 : c2382dMo11343o2.m11241d()) {
                C2383e c2383e3 = c2382d9.f10880d;
                int i6 = i3 + 1;
                boolean zM11619a2 = m11619a(i6, c2383e3);
                if (c2383e3.m11334j0() && zM11619a2) {
                    C2384f.m11367M1(i6, c2383e3, bVar, new C2410b.a(), C2410b.a.f11251k);
                }
                boolean z2 = (c2382d9 == c2383e3.f10920O && (c2382d2 = c2383e3.f10922Q.f10882f) != null && c2382d2.m11251n()) || (c2382d9 == c2383e3.f10922Q && (c2382d = c2383e3.f10920O.f10882f) != null && c2382d.m11251n());
                C2383e.b bVarM11294Q2 = c2383e3.m11294Q();
                C2383e.b bVar3 = C2383e.b.MATCH_CONSTRAINT;
                if (bVarM11294Q2 != bVar3 || zM11619a2) {
                    if (!c2383e3.m11334j0()) {
                        C2382d c2382d10 = c2383e3.f10920O;
                        if (c2382d9 == c2382d10 && c2383e3.f10922Q.f10882f == null) {
                            int iM11243f3 = c2382d10.m11243f() + iM11242e2;
                            c2383e3.m11267C0(iM11243f3, c2383e3.m11361x() + iM11243f3);
                            m11627i(i6, c2383e3, bVar);
                        } else {
                            C2382d c2382d11 = c2383e3.f10922Q;
                            if (c2382d9 == c2382d11 && c2382d10.f10882f == null) {
                                int iM11243f4 = iM11242e2 - c2382d11.m11243f();
                                c2383e3.m11267C0(iM11243f4 - c2383e3.m11361x(), iM11243f4);
                                m11627i(i6, c2383e3, bVar);
                            } else if (z2 && !c2383e3.m11329h0()) {
                                m11624f(i6, bVar, c2383e3);
                            }
                        }
                    }
                } else if (c2383e3.m11294Q() == bVar3 && c2383e3.f10902C >= 0 && c2383e3.f10900B >= 0 && (c2383e3.m11298S() == 8 || (c2383e3.f10976w == 0 && c2383e3.m11357v() == 0.0f))) {
                    if (!c2383e3.m11329h0() && !c2383e3.m11331i0() && z2 && !c2383e3.m11329h0()) {
                        m11625g(i6, c2383e, bVar, c2383e3);
                    }
                }
            }
        }
        C2382d c2382dMo11343o3 = c2383e.mo11343o(C2382d.b.BASELINE);
        if (c2382dMo11343o3.m11241d() != null && c2382dMo11343o3.m11251n()) {
            int iM11242e3 = c2382dMo11343o3.m11242e();
            for (C2382d c2382d12 : c2382dMo11343o3.m11241d()) {
                C2383e c2383e4 = c2382d12.f10880d;
                int i7 = i3 + 1;
                boolean zM11619a3 = m11619a(i7, c2383e4);
                if (c2383e4.m11334j0() && zM11619a3) {
                    C2384f.m11367M1(i7, c2383e4, bVar, new C2410b.a(), C2410b.a.f11251k);
                }
                if (c2383e4.m11294Q() != C2383e.b.MATCH_CONSTRAINT || zM11619a3) {
                    if (!c2383e4.m11334j0() && c2382d12 == c2383e4.f10923R) {
                        c2383e4.m11364y0(c2382d12.m11243f() + iM11242e3);
                        m11627i(i7, c2383e4, bVar);
                    }
                }
            }
        }
        c2383e.m11344o0();
    }
}
