package p149t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p146s.AbstractC2388j;
import p146s.C2382d;
import p146s.C2383e;
import p146s.C2384f;
import p146s.C2386h;
import p149t.C2410b;

/* JADX INFO: renamed from: t.e */
/* JADX INFO: loaded from: classes.dex */
public class C2413e {

    /* JADX INFO: renamed from: a */
    private C2384f f11266a;

    /* JADX INFO: renamed from: d */
    private C2384f f11269d;

    /* JADX INFO: renamed from: b */
    private boolean f11267b = true;

    /* JADX INFO: renamed from: c */
    private boolean f11268c = true;

    /* JADX INFO: renamed from: e */
    private ArrayList f11270e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private ArrayList f11271f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private C2410b.b f11272g = null;

    /* JADX INFO: renamed from: h */
    private C2410b.a f11273h = new C2410b.a();

    /* JADX INFO: renamed from: i */
    ArrayList f11274i = new ArrayList();

    public C2413e(C2384f c2384f) {
        this.f11266a = c2384f;
        this.f11269d = c2384f;
    }

    /* JADX INFO: renamed from: a */
    private void m11602a(C2414f c2414f, int i3, int i4, C2414f c2414f2, ArrayList arrayList, C2421m c2421m) {
        int i5;
        C2414f c2414f3;
        ArrayList arrayList2;
        AbstractC2424p abstractC2424p = c2414f.f11278d;
        if (abstractC2424p.f11330c == null) {
            C2384f c2384f = this.f11266a;
            if (abstractC2424p == c2384f.f10940e || abstractC2424p == c2384f.f10942f) {
                return;
            }
            if (c2421m == null) {
                c2421m = new C2421m(abstractC2424p, i4);
                arrayList.add(c2421m);
            }
            C2421m c2421m2 = c2421m;
            abstractC2424p.f11330c = c2421m2;
            c2421m2.m11638a(abstractC2424p);
            for (InterfaceC2412d interfaceC2412d : abstractC2424p.f11335h.f11285k) {
                if (interfaceC2412d instanceof C2414f) {
                    i5 = i3;
                    c2414f3 = c2414f2;
                    arrayList2 = arrayList;
                    m11602a((C2414f) interfaceC2412d, i5, 0, c2414f3, arrayList2, c2421m2);
                } else {
                    i5 = i3;
                    c2414f3 = c2414f2;
                    arrayList2 = arrayList;
                }
                i3 = i5;
                c2414f2 = c2414f3;
                arrayList = arrayList2;
            }
            int i6 = i3;
            C2414f c2414f4 = c2414f2;
            ArrayList arrayList3 = arrayList;
            for (InterfaceC2412d interfaceC2412d2 : abstractC2424p.f11336i.f11285k) {
                if (interfaceC2412d2 instanceof C2414f) {
                    m11602a((C2414f) interfaceC2412d2, i6, 1, c2414f4, arrayList3, c2421m2);
                }
            }
            if (i6 == 1 && (abstractC2424p instanceof C2422n)) {
                for (InterfaceC2412d interfaceC2412d3 : ((C2422n) abstractC2424p).f11310k.f11285k) {
                    if (interfaceC2412d3 instanceof C2414f) {
                        m11602a((C2414f) interfaceC2412d3, i6, 2, c2414f4, arrayList3, c2421m2);
                    }
                }
            }
            for (C2414f c2414f5 : abstractC2424p.f11335h.f11286l) {
                if (c2414f5 == c2414f4) {
                    c2421m2.f11304b = true;
                }
                m11602a(c2414f5, i6, 0, c2414f4, arrayList3, c2421m2);
            }
            for (C2414f c2414f6 : abstractC2424p.f11336i.f11286l) {
                if (c2414f6 == c2414f4) {
                    c2421m2.f11304b = true;
                }
                m11602a(c2414f6, i6, 1, c2414f4, arrayList3, c2421m2);
            }
            if (i6 == 1 && (abstractC2424p instanceof C2422n)) {
                Iterator it = ((C2422n) abstractC2424p).f11310k.f11286l.iterator();
                while (it.hasNext()) {
                    m11602a((C2414f) it.next(), i6, 2, c2414f4, arrayList3, c2421m2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private boolean m11603b(C2384f c2384f) {
        C2383e.b bVar;
        int i3;
        C2383e.b bVar2;
        float f3;
        float f4;
        C2383e.b bVar3;
        C2383e.b bVar4;
        C2383e.b bVar5;
        ArrayList arrayList = c2384f.f11088J0;
        int size = arrayList.size();
        char c3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C2383e c2383e = (C2383e) obj;
            C2383e.b[] bVarArr = c2383e.f10930Y;
            C2383e.b bVar6 = bVarArr[c3];
            C2383e.b bVar7 = bVarArr[1];
            if (c2383e.m11298S() == 8) {
                c2383e.f10932a = true;
            } else {
                if (c2383e.f10898A < 1.0f && bVar6 == C2383e.b.MATCH_CONSTRAINT) {
                    c2383e.f10974v = 2;
                }
                if (c2383e.f10904D < 1.0f && bVar7 == C2383e.b.MATCH_CONSTRAINT) {
                    c2383e.f10976w = 2;
                }
                if (c2383e.m11357v() > 0.0f) {
                    C2383e.b bVar8 = C2383e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == C2383e.b.WRAP_CONTENT || bVar7 == C2383e.b.FIXED)) {
                        c2383e.f10974v = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == C2383e.b.WRAP_CONTENT || bVar6 == C2383e.b.FIXED)) {
                        c2383e.f10976w = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (c2383e.f10974v == 0) {
                            c2383e.f10974v = 3;
                        }
                        if (c2383e.f10976w == 0) {
                            c2383e.f10976w = 3;
                        }
                    }
                }
                C2383e.b bVar9 = C2383e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && c2383e.f10974v == 1 && (c2383e.f10919N.f10882f == null || c2383e.f10921P.f10882f == null)) {
                    bVar6 = C2383e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && c2383e.f10976w == 1 && (c2383e.f10920O.f10882f == null || c2383e.f10922Q.f10882f == null)) {
                    bVar7 = C2383e.b.WRAP_CONTENT;
                }
                C2420l c2420l = c2383e.f10940e;
                c2420l.f11331d = bVar6;
                int i5 = c2383e.f10974v;
                c2420l.f11328a = i5;
                C2422n c2422n = c2383e.f10942f;
                c2422n.f11331d = bVar7;
                int i6 = c2383e.f10976w;
                c2422n.f11328a = i6;
                C2383e.b bVar10 = C2383e.b.MATCH_PARENT;
                char c4 = c3;
                if ((bVar6 == bVar10 || bVar6 == C2383e.b.FIXED || bVar6 == C2383e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == C2383e.b.FIXED || bVar7 == C2383e.b.WRAP_CONTENT)) {
                    C2383e.b bVar11 = bVar7;
                    C2383e.b bVar12 = bVar6;
                    int iM11300T = c2383e.m11300T();
                    if (bVar12 == bVar10) {
                        iM11300T = (c2384f.m11300T() - c2383e.f10919N.f10883g) - c2383e.f10921P.f10883g;
                        bVar12 = C2383e.b.FIXED;
                    }
                    int i7 = iM11300T;
                    int iM11361x = c2383e.m11361x();
                    if (bVar11 == bVar10) {
                        iM11361x = (c2384f.m11361x() - c2383e.f10920O.f10883g) - c2383e.f10922Q.f10883g;
                        bVar11 = C2383e.b.FIXED;
                    }
                    m11606l(c2383e, bVar12, i7, bVar11, iM11361x);
                    c2383e.f10940e.f11332e.mo11618d(c2383e.m11300T());
                    c2383e.f10942f.f11332e.mo11618d(c2383e.m11361x());
                    c2383e.f10932a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        f4 = 0.5f;
                        C2383e.b bVar13 = C2383e.b.WRAP_CONTENT;
                        f3 = 1.0f;
                        if (bVar7 != bVar13 && bVar7 != C2383e.b.FIXED) {
                            bVar = bVar7;
                            i3 = 3;
                        } else if (i5 == 3) {
                            if (bVar7 == bVar13) {
                                m11606l(c2383e, bVar13, 0, bVar13, 0);
                            }
                            int iM11361x2 = c2383e.m11361x();
                            int i8 = (int) ((iM11361x2 * c2383e.f10937c0) + 0.5f);
                            C2383e.b bVar14 = C2383e.b.FIXED;
                            m11606l(c2383e, bVar14, i8, bVar14, iM11361x2);
                            c2383e.f10940e.f11332e.mo11618d(c2383e.m11300T());
                            c2383e.f10942f.f11332e.mo11618d(c2383e.m11361x());
                            c2383e.f10932a = true;
                        } else if (i5 == 1) {
                            m11606l(c2383e, bVar13, 0, bVar7, 0);
                            c2383e.f10940e.f11332e.f11296m = c2383e.m11300T();
                        } else {
                            bVar = bVar7;
                            i3 = 3;
                            if (i5 == 2) {
                                C2383e.b bVar15 = c2384f.f10930Y[c4];
                                C2383e.b bVar16 = C2383e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    m11606l(c2383e, bVar16, (int) ((c2383e.f10898A * c2384f.m11300T()) + 0.5f), bVar, c2383e.m11361x());
                                    c2383e.f10940e.f11332e.mo11618d(c2383e.m11300T());
                                    c2383e.f10942f.f11332e.mo11618d(c2383e.m11361x());
                                    c2383e.f10932a = true;
                                }
                            } else {
                                C2382d[] c2382dArr = c2383e.f10927V;
                                if (c2382dArr[c4].f10882f == null || c2382dArr[1].f10882f == null) {
                                    m11606l(c2383e, bVar13, 0, bVar, 0);
                                    c2383e.f10940e.f11332e.mo11618d(c2383e.m11300T());
                                    c2383e.f10942f.f11332e.mo11618d(c2383e.m11361x());
                                    c2383e.f10932a = true;
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i3 = 3;
                        bVar2 = bVar9;
                        f3 = 1.0f;
                        f4 = 0.5f;
                    }
                    if (bVar != bVar2 || (bVar6 != (bVar4 = C2383e.b.WRAP_CONTENT) && bVar6 != C2383e.b.FIXED)) {
                        bVar3 = bVar6;
                    } else if (i6 == i3) {
                        if (bVar6 == bVar4) {
                            m11606l(c2383e, bVar4, 0, bVar4, 0);
                        }
                        int iM11300T2 = c2383e.m11300T();
                        float f5 = c2383e.f10937c0;
                        if (c2383e.m11359w() == -1) {
                            f5 = f3 / f5;
                        }
                        C2383e.b bVar17 = C2383e.b.FIXED;
                        m11606l(c2383e, bVar17, iM11300T2, bVar17, (int) ((iM11300T2 * f5) + f4));
                        c2383e.f10940e.f11332e.mo11618d(c2383e.m11300T());
                        c2383e.f10942f.f11332e.mo11618d(c2383e.m11361x());
                        c2383e.f10932a = true;
                    } else if (i6 == 1) {
                        m11606l(c2383e, bVar6, 0, bVar4, 0);
                        c2383e.f10942f.f11332e.f11296m = c2383e.m11361x();
                    } else {
                        bVar3 = bVar6;
                        if (i6 == 2) {
                            C2383e.b bVar18 = c2384f.f10930Y[1];
                            bVar5 = bVar;
                            C2383e.b bVar19 = C2383e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar10) {
                                m11606l(c2383e, bVar3, c2383e.m11300T(), bVar19, (int) ((c2383e.f10904D * c2384f.m11361x()) + f4));
                                c2383e.f10940e.f11332e.mo11618d(c2383e.m11300T());
                                c2383e.f10942f.f11332e.mo11618d(c2383e.m11361x());
                                c2383e.f10932a = true;
                            }
                            bVar = bVar5;
                        } else {
                            bVar5 = bVar;
                            C2382d[] c2382dArr2 = c2383e.f10927V;
                            if (c2382dArr2[2].f10882f == null || c2382dArr2[i3].f10882f == null) {
                                m11606l(c2383e, bVar4, 0, bVar5, 0);
                                c2383e.f10940e.f11332e.mo11618d(c2383e.m11300T());
                                c2383e.f10942f.f11332e.mo11618d(c2383e.m11361x());
                                c2383e.f10932a = true;
                            }
                            bVar = bVar5;
                        }
                    }
                    if (bVar3 == bVar2 && bVar == bVar2) {
                        if (i5 == 1 || i6 == 1) {
                            C2383e.b bVar20 = C2383e.b.WRAP_CONTENT;
                            m11606l(c2383e, bVar20, 0, bVar20, 0);
                            c2383e.f10940e.f11332e.f11296m = c2383e.m11300T();
                            c2383e.f10942f.f11332e.f11296m = c2383e.m11361x();
                        } else if (i6 == 2 && i5 == 2) {
                            C2383e.b[] bVarArr2 = c2384f.f10930Y;
                            C2383e.b bVar21 = bVarArr2[c4];
                            C2383e.b bVar22 = C2383e.b.FIXED;
                            if (bVar21 == bVar22 && bVarArr2[1] == bVar22) {
                                m11606l(c2383e, bVar22, (int) ((c2383e.f10898A * c2384f.m11300T()) + f4), bVar22, (int) ((c2383e.f10904D * c2384f.m11361x()) + f4));
                                c2383e.f10940e.f11332e.mo11618d(c2383e.m11300T());
                                c2383e.f10942f.f11332e.mo11618d(c2383e.m11361x());
                                c2383e.f10932a = true;
                            }
                        }
                    }
                }
                c3 = c4;
            }
        }
        return c3;
    }

    /* JADX INFO: renamed from: e */
    private int m11604e(C2384f c2384f, int i3) {
        int size = this.f11274i.size();
        long jMax = 0;
        for (int i4 = 0; i4 < size; i4++) {
            jMax = Math.max(jMax, ((C2421m) this.f11274i.get(i4)).m11639b(c2384f, i3));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: i */
    private void m11605i(AbstractC2424p abstractC2424p, int i3, ArrayList arrayList) {
        for (InterfaceC2412d interfaceC2412d : abstractC2424p.f11335h.f11285k) {
            if (interfaceC2412d instanceof C2414f) {
                m11602a((C2414f) interfaceC2412d, i3, 0, abstractC2424p.f11336i, arrayList, null);
            } else if (interfaceC2412d instanceof AbstractC2424p) {
                m11602a(((AbstractC2424p) interfaceC2412d).f11335h, i3, 0, abstractC2424p.f11336i, arrayList, null);
            }
        }
        for (InterfaceC2412d interfaceC2412d2 : abstractC2424p.f11336i.f11285k) {
            if (interfaceC2412d2 instanceof C2414f) {
                m11602a((C2414f) interfaceC2412d2, i3, 1, abstractC2424p.f11335h, arrayList, null);
            } else if (interfaceC2412d2 instanceof AbstractC2424p) {
                m11602a(((AbstractC2424p) interfaceC2412d2).f11336i, i3, 1, abstractC2424p.f11335h, arrayList, null);
            }
        }
        int i4 = i3;
        if (i4 == 1) {
            for (InterfaceC2412d interfaceC2412d3 : ((C2422n) abstractC2424p).f11310k.f11285k) {
                if (interfaceC2412d3 instanceof C2414f) {
                    m11602a((C2414f) interfaceC2412d3, i4, 2, null, arrayList, null);
                }
                i4 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m11606l(C2383e c2383e, C2383e.b bVar, int i3, C2383e.b bVar2, int i4) {
        C2410b.a aVar = this.f11273h;
        aVar.f11254a = bVar;
        aVar.f11255b = bVar2;
        aVar.f11256c = i3;
        aVar.f11257d = i4;
        this.f11272g.mo4027b(c2383e, aVar);
        c2383e.m11323e1(this.f11273h.f11258e);
        c2383e.m11273F0(this.f11273h.f11259f);
        c2383e.m11271E0(this.f11273h.f11261h);
        c2383e.m11356u0(this.f11273h.f11260g);
    }

    /* JADX INFO: renamed from: c */
    public void m11607c() {
        m11608d(this.f11270e);
        this.f11274i.clear();
        C2421m.f11302h = 0;
        m11605i(this.f11266a.f10940e, 0, this.f11274i);
        m11605i(this.f11266a.f10942f, 1, this.f11274i);
        this.f11267b = false;
    }

    /* JADX INFO: renamed from: d */
    public void m11608d(ArrayList arrayList) {
        arrayList.clear();
        this.f11269d.f10940e.mo11599f();
        this.f11269d.f10942f.mo11599f();
        arrayList.add(this.f11269d.f10940e);
        arrayList.add(this.f11269d.f10942f);
        ArrayList arrayList2 = this.f11269d.f11088J0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            C2383e c2383e = (C2383e) obj;
            if (c2383e instanceof C2386h) {
                arrayList.add(new C2418j(c2383e));
            } else {
                if (c2383e.m11325f0()) {
                    if (c2383e.f10936c == null) {
                        c2383e.f10936c = new C2411c(c2383e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2383e.f10936c);
                } else {
                    arrayList.add(c2383e.f10940e);
                }
                if (c2383e.m11329h0()) {
                    if (c2383e.f10938d == null) {
                        c2383e.f10938d = new C2411c(c2383e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2383e.f10938d);
                } else {
                    arrayList.add(c2383e.f10942f);
                }
                if (c2383e instanceof AbstractC2388j) {
                    arrayList.add(new C2419k(c2383e));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            ((AbstractC2424p) obj2).mo11599f();
        }
        int size3 = arrayList.size();
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            AbstractC2424p abstractC2424p = (AbstractC2424p) obj3;
            if (abstractC2424p.f11329b != this.f11269d) {
                abstractC2424p.mo11597d();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m11609f(boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (this.f11267b || this.f11268c) {
            ArrayList arrayList = this.f11266a.f11088J0;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                C2383e c2383e = (C2383e) obj;
                c2383e.m11341n();
                c2383e.f10932a = false;
                c2383e.f10940e.m11635r();
                c2383e.f10942f.m11640q();
            }
            this.f11266a.m11341n();
            C2384f c2384f = this.f11266a;
            c2384f.f10932a = false;
            c2384f.f10940e.m11635r();
            this.f11266a.f10942f.m11640q();
            this.f11268c = false;
        }
        if (m11603b(this.f11269d)) {
            return false;
        }
        this.f11266a.m11328g1(0);
        this.f11266a.m11330h1(0);
        C2383e.b bVarM11355u = this.f11266a.m11355u(0);
        C2383e.b bVarM11355u2 = this.f11266a.m11355u(1);
        if (this.f11267b) {
            m11607c();
        }
        int iM11302U = this.f11266a.m11302U();
        int iM11304V = this.f11266a.m11304V();
        this.f11266a.f10940e.f11335h.mo11618d(iM11302U);
        this.f11266a.f10942f.f11335h.mo11618d(iM11304V);
        m11614m();
        C2383e.b bVar = C2383e.b.WRAP_CONTENT;
        if (bVarM11355u == bVar || bVarM11355u2 == bVar) {
            if (z2) {
                ArrayList arrayList2 = this.f11270e;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    if (!((AbstractC2424p) obj2).mo11601m()) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2 && bVarM11355u == C2383e.b.WRAP_CONTENT) {
                this.f11266a.m11281J0(C2383e.b.FIXED);
                C2384f c2384f2 = this.f11266a;
                c2384f2.m11323e1(m11604e(c2384f2, 0));
                C2384f c2384f3 = this.f11266a;
                c2384f3.f10940e.f11332e.mo11618d(c2384f3.m11300T());
            }
            if (z2 && bVarM11355u2 == C2383e.b.WRAP_CONTENT) {
                this.f11266a.m11315a1(C2383e.b.FIXED);
                C2384f c2384f4 = this.f11266a;
                c2384f4.m11273F0(m11604e(c2384f4, 1));
                C2384f c2384f5 = this.f11266a;
                c2384f5.f10942f.f11332e.mo11618d(c2384f5.m11361x());
            }
        }
        C2384f c2384f6 = this.f11266a;
        C2383e.b bVar2 = c2384f6.f10930Y[0];
        C2383e.b bVar3 = C2383e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C2383e.b.MATCH_PARENT) {
            int iM11300T = c2384f6.m11300T() + iM11302U;
            this.f11266a.f10940e.f11336i.mo11618d(iM11300T);
            this.f11266a.f10940e.f11332e.mo11618d(iM11300T - iM11302U);
            m11614m();
            C2384f c2384f7 = this.f11266a;
            C2383e.b bVar4 = c2384f7.f10930Y[1];
            if (bVar4 == bVar3 || bVar4 == C2383e.b.MATCH_PARENT) {
                int iM11361x = c2384f7.m11361x() + iM11304V;
                this.f11266a.f10942f.f11336i.mo11618d(iM11361x);
                this.f11266a.f10942f.f11332e.mo11618d(iM11361x - iM11304V);
            }
            m11614m();
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList3 = this.f11270e;
        int size3 = arrayList3.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList3.get(i5);
            i5++;
            AbstractC2424p abstractC2424p = (AbstractC2424p) obj3;
            if (abstractC2424p.f11329b != this.f11266a || abstractC2424p.f11334g) {
                abstractC2424p.mo11598e();
            }
        }
        ArrayList arrayList4 = this.f11270e;
        int size4 = arrayList4.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                z4 = true;
                break;
            }
            Object obj4 = arrayList4.get(i6);
            i6++;
            AbstractC2424p abstractC2424p2 = (AbstractC2424p) obj4;
            if (z3 || abstractC2424p2.f11329b != this.f11266a) {
                if (!abstractC2424p2.f11335h.f11284j || ((!abstractC2424p2.f11336i.f11284j && !(abstractC2424p2 instanceof C2418j)) || (!abstractC2424p2.f11332e.f11284j && !(abstractC2424p2 instanceof C2411c) && !(abstractC2424p2 instanceof C2418j)))) {
                    break;
                }
            }
        }
        this.f11266a.m11281J0(bVarM11355u);
        this.f11266a.m11315a1(bVarM11355u2);
        return z4;
    }

    /* JADX INFO: renamed from: g */
    public boolean m11610g(boolean z2) {
        if (this.f11267b) {
            ArrayList arrayList = this.f11266a.f11088J0;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                C2383e c2383e = (C2383e) obj;
                c2383e.m11341n();
                c2383e.f10932a = false;
                C2420l c2420l = c2383e.f10940e;
                c2420l.f11332e.f11284j = false;
                c2420l.f11334g = false;
                c2420l.m11635r();
                C2422n c2422n = c2383e.f10942f;
                c2422n.f11332e.f11284j = false;
                c2422n.f11334g = false;
                c2422n.m11640q();
            }
            this.f11266a.m11341n();
            C2384f c2384f = this.f11266a;
            c2384f.f10932a = false;
            C2420l c2420l2 = c2384f.f10940e;
            c2420l2.f11332e.f11284j = false;
            c2420l2.f11334g = false;
            c2420l2.m11635r();
            C2422n c2422n2 = this.f11266a.f10942f;
            c2422n2.f11332e.f11284j = false;
            c2422n2.f11334g = false;
            c2422n2.m11640q();
            m11607c();
        }
        if (m11603b(this.f11269d)) {
            return false;
        }
        this.f11266a.m11328g1(0);
        this.f11266a.m11330h1(0);
        this.f11266a.f10940e.f11335h.mo11618d(0);
        this.f11266a.f10942f.f11335h.mo11618d(0);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m11611h(boolean z2, int i3) {
        boolean z3;
        C2383e.b bVar;
        boolean z4 = false;
        C2383e.b bVarM11355u = this.f11266a.m11355u(0);
        C2383e.b bVarM11355u2 = this.f11266a.m11355u(1);
        int iM11302U = this.f11266a.m11302U();
        int iM11304V = this.f11266a.m11304V();
        if (z2 && (bVarM11355u == (bVar = C2383e.b.WRAP_CONTENT) || bVarM11355u2 == bVar)) {
            ArrayList arrayList = this.f11270e;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                AbstractC2424p abstractC2424p = (AbstractC2424p) obj;
                if (abstractC2424p.f11333f == i3 && !abstractC2424p.mo11601m()) {
                    z2 = false;
                    break;
                }
            }
            if (i3 == 0) {
                if (z2 && bVarM11355u == C2383e.b.WRAP_CONTENT) {
                    this.f11266a.m11281J0(C2383e.b.FIXED);
                    C2384f c2384f = this.f11266a;
                    c2384f.m11323e1(m11604e(c2384f, 0));
                    C2384f c2384f2 = this.f11266a;
                    c2384f2.f10940e.f11332e.mo11618d(c2384f2.m11300T());
                }
            } else if (z2 && bVarM11355u2 == C2383e.b.WRAP_CONTENT) {
                this.f11266a.m11315a1(C2383e.b.FIXED);
                C2384f c2384f3 = this.f11266a;
                c2384f3.m11273F0(m11604e(c2384f3, 1));
                C2384f c2384f4 = this.f11266a;
                c2384f4.f10942f.f11332e.mo11618d(c2384f4.m11361x());
            }
        }
        if (i3 == 0) {
            C2384f c2384f5 = this.f11266a;
            C2383e.b bVar2 = c2384f5.f10930Y[0];
            if (bVar2 == C2383e.b.FIXED || bVar2 == C2383e.b.MATCH_PARENT) {
                int iM11300T = c2384f5.m11300T() + iM11302U;
                this.f11266a.f10940e.f11336i.mo11618d(iM11300T);
                this.f11266a.f10940e.f11332e.mo11618d(iM11300T - iM11302U);
                z3 = true;
            }
            z3 = false;
        } else {
            C2384f c2384f6 = this.f11266a;
            C2383e.b bVar3 = c2384f6.f10930Y[1];
            if (bVar3 == C2383e.b.FIXED || bVar3 == C2383e.b.MATCH_PARENT) {
                int iM11361x = c2384f6.m11361x() + iM11304V;
                this.f11266a.f10942f.f11336i.mo11618d(iM11361x);
                this.f11266a.f10942f.f11332e.mo11618d(iM11361x - iM11304V);
                z3 = true;
            }
            z3 = false;
        }
        m11614m();
        ArrayList arrayList2 = this.f11270e;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            AbstractC2424p abstractC2424p2 = (AbstractC2424p) obj2;
            if (abstractC2424p2.f11333f == i3 && (abstractC2424p2.f11329b != this.f11266a || abstractC2424p2.f11334g)) {
                abstractC2424p2.mo11598e();
            }
        }
        ArrayList arrayList3 = this.f11270e;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z4 = true;
                break;
            }
            Object obj3 = arrayList3.get(i6);
            i6++;
            AbstractC2424p abstractC2424p3 = (AbstractC2424p) obj3;
            if (abstractC2424p3.f11333f == i3 && (z3 || abstractC2424p3.f11329b != this.f11266a)) {
                if (!abstractC2424p3.f11335h.f11284j || !abstractC2424p3.f11336i.f11284j || (!(abstractC2424p3 instanceof C2411c) && !abstractC2424p3.f11332e.f11284j)) {
                    break;
                }
            }
        }
        this.f11266a.m11281J0(bVarM11355u);
        this.f11266a.m11315a1(bVarM11355u2);
        return z4;
    }

    /* JADX INFO: renamed from: j */
    public void m11612j() {
        this.f11267b = true;
    }

    /* JADX INFO: renamed from: k */
    public void m11613k() {
        this.f11268c = true;
    }

    /* JADX INFO: renamed from: m */
    public void m11614m() {
        C2415g c2415g;
        ArrayList arrayList = this.f11266a.f11088J0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C2383e c2383e = (C2383e) obj;
            if (!c2383e.f10932a) {
                C2383e.b[] bVarArr = c2383e.f10930Y;
                C2383e.b bVar = bVarArr[0];
                C2383e.b bVar2 = bVarArr[1];
                int i4 = c2383e.f10974v;
                int i5 = c2383e.f10976w;
                C2383e.b bVar3 = C2383e.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == C2383e.b.MATCH_CONSTRAINT && i4 == 1);
                boolean z3 = bVar2 == bVar3 || (bVar2 == C2383e.b.MATCH_CONSTRAINT && i5 == 1);
                C2415g c2415g2 = c2383e.f10940e.f11332e;
                boolean z4 = c2415g2.f11284j;
                C2415g c2415g3 = c2383e.f10942f.f11332e;
                boolean z5 = c2415g3.f11284j;
                if (z4 && z5) {
                    C2383e.b bVar4 = C2383e.b.FIXED;
                    m11606l(c2383e, bVar4, c2415g2.f11281g, bVar4, c2415g3.f11281g);
                    c2383e.f10932a = true;
                } else if (z4 && z3) {
                    m11606l(c2383e, C2383e.b.FIXED, c2415g2.f11281g, bVar3, c2415g3.f11281g);
                    if (bVar2 == C2383e.b.MATCH_CONSTRAINT) {
                        c2383e.f10942f.f11332e.f11296m = c2383e.m11361x();
                    } else {
                        c2383e.f10942f.f11332e.mo11618d(c2383e.m11361x());
                        c2383e.f10932a = true;
                    }
                } else if (z5 && z2) {
                    m11606l(c2383e, bVar3, c2415g2.f11281g, C2383e.b.FIXED, c2415g3.f11281g);
                    if (bVar == C2383e.b.MATCH_CONSTRAINT) {
                        c2383e.f10940e.f11332e.f11296m = c2383e.m11300T();
                    } else {
                        c2383e.f10940e.f11332e.mo11618d(c2383e.m11300T());
                        c2383e.f10932a = true;
                    }
                }
                if (c2383e.f10932a && (c2415g = c2383e.f10942f.f11311l) != null) {
                    c2415g.mo11618d(c2383e.m11345p());
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11615n(C2410b.b bVar) {
        this.f11272g = bVar;
    }
}
