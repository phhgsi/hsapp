package p149t;

import java.util.ArrayList;
import p146s.C2384f;

/* JADX INFO: renamed from: t.m */
/* JADX INFO: loaded from: classes.dex */
class C2421m {

    /* JADX INFO: renamed from: h */
    public static int f11302h;

    /* JADX INFO: renamed from: c */
    AbstractC2424p f11305c;

    /* JADX INFO: renamed from: d */
    AbstractC2424p f11306d;

    /* JADX INFO: renamed from: f */
    int f11308f;

    /* JADX INFO: renamed from: g */
    int f11309g;

    /* JADX INFO: renamed from: a */
    public int f11303a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f11304b = false;

    /* JADX INFO: renamed from: e */
    ArrayList f11307e = new ArrayList();

    public C2421m(AbstractC2424p abstractC2424p, int i3) {
        this.f11305c = null;
        this.f11306d = null;
        int i4 = f11302h;
        this.f11308f = i4;
        f11302h = i4 + 1;
        this.f11305c = abstractC2424p;
        this.f11306d = abstractC2424p;
        this.f11309g = i3;
    }

    /* JADX INFO: renamed from: c */
    private long m11636c(C2414f c2414f, long j3) {
        AbstractC2424p abstractC2424p = c2414f.f11278d;
        if (abstractC2424p instanceof C2419k) {
            return j3;
        }
        int size = c2414f.f11285k.size();
        long jMin = j3;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC2412d interfaceC2412d = (InterfaceC2412d) c2414f.f11285k.get(i3);
            if (interfaceC2412d instanceof C2414f) {
                C2414f c2414f2 = (C2414f) interfaceC2412d;
                if (c2414f2.f11278d != abstractC2424p) {
                    jMin = Math.min(jMin, m11636c(c2414f2, ((long) c2414f2.f11280f) + j3));
                }
            }
        }
        if (c2414f != abstractC2424p.f11336i) {
            return jMin;
        }
        long jMo11600j = j3 - abstractC2424p.mo11600j();
        return Math.min(Math.min(jMin, m11636c(abstractC2424p.f11335h, jMo11600j)), jMo11600j - ((long) abstractC2424p.f11335h.f11280f));
    }

    /* JADX INFO: renamed from: d */
    private long m11637d(C2414f c2414f, long j3) {
        AbstractC2424p abstractC2424p = c2414f.f11278d;
        if (abstractC2424p instanceof C2419k) {
            return j3;
        }
        int size = c2414f.f11285k.size();
        long jMax = j3;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC2412d interfaceC2412d = (InterfaceC2412d) c2414f.f11285k.get(i3);
            if (interfaceC2412d instanceof C2414f) {
                C2414f c2414f2 = (C2414f) interfaceC2412d;
                if (c2414f2.f11278d != abstractC2424p) {
                    jMax = Math.max(jMax, m11637d(c2414f2, ((long) c2414f2.f11280f) + j3));
                }
            }
        }
        if (c2414f != abstractC2424p.f11335h) {
            return jMax;
        }
        long jMo11600j = j3 + abstractC2424p.mo11600j();
        return Math.max(Math.max(jMax, m11637d(abstractC2424p.f11336i, jMo11600j)), jMo11600j - ((long) abstractC2424p.f11336i.f11280f));
    }

    /* JADX INFO: renamed from: a */
    public void m11638a(AbstractC2424p abstractC2424p) {
        this.f11307e.add(abstractC2424p);
        this.f11306d = abstractC2424p;
    }

    /* JADX INFO: renamed from: b */
    public long m11639b(C2384f c2384f, int i3) {
        long jMo11600j;
        int i4;
        AbstractC2424p abstractC2424p = this.f11305c;
        if (abstractC2424p instanceof C2411c) {
            if (((C2411c) abstractC2424p).f11333f != i3) {
                return 0L;
            }
        } else if (i3 == 0) {
            if (!(abstractC2424p instanceof C2420l)) {
                return 0L;
            }
        } else if (!(abstractC2424p instanceof C2422n)) {
            return 0L;
        }
        C2414f c2414f = (i3 == 0 ? c2384f.f10940e : c2384f.f10942f).f11335h;
        C2414f c2414f2 = (i3 == 0 ? c2384f.f10940e : c2384f.f10942f).f11336i;
        boolean zContains = abstractC2424p.f11335h.f11286l.contains(c2414f);
        boolean zContains2 = this.f11305c.f11336i.f11286l.contains(c2414f2);
        long jMo11600j2 = this.f11305c.mo11600j();
        if (zContains && zContains2) {
            long jM11637d = m11637d(this.f11305c.f11335h, 0L);
            long jM11636c = m11636c(this.f11305c.f11336i, 0L);
            long j3 = jM11637d - jMo11600j2;
            AbstractC2424p abstractC2424p2 = this.f11305c;
            int i5 = abstractC2424p2.f11336i.f11280f;
            if (j3 >= (-i5)) {
                j3 += (long) i5;
            }
            int i6 = abstractC2424p2.f11335h.f11280f;
            long j4 = ((-jM11636c) - jMo11600j2) - ((long) i6);
            if (j4 >= i6) {
                j4 -= (long) i6;
            }
            float fM11347q = abstractC2424p2.f11329b.m11347q(i3);
            float f3 = fM11347q > 0.0f ? (long) ((j4 / fM11347q) + (j3 / (1.0f - fM11347q))) : 0L;
            long j5 = ((long) ((f3 * fM11347q) + 0.5f)) + jMo11600j2 + ((long) ((f3 * (1.0f - fM11347q)) + 0.5f));
            AbstractC2424p abstractC2424p3 = this.f11305c;
            jMo11600j = ((long) abstractC2424p3.f11335h.f11280f) + j5;
            i4 = abstractC2424p3.f11336i.f11280f;
        } else {
            if (zContains) {
                return Math.max(m11637d(this.f11305c.f11335h, r12.f11280f), ((long) this.f11305c.f11335h.f11280f) + jMo11600j2);
            }
            if (zContains2) {
                return Math.max(-m11636c(this.f11305c.f11336i, r12.f11280f), ((long) (-this.f11305c.f11336i.f11280f)) + jMo11600j2);
            }
            AbstractC2424p abstractC2424p4 = this.f11305c;
            jMo11600j = ((long) abstractC2424p4.f11335h.f11280f) + abstractC2424p4.mo11600j();
            i4 = this.f11305c.f11336i.f11280f;
        }
        return jMo11600j - ((long) i4);
    }
}
