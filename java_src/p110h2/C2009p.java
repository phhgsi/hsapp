package p110h2;

import androidx.concurrent.futures.AbstractC0933b;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p071X1.AbstractC0602g;

/* JADX INFO: renamed from: h2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2009p {

    /* JADX INFO: renamed from: e */
    public static final a f9593e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9594f = AtomicReferenceFieldUpdater.newUpdater(C2009p.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f9595g = AtomicLongFieldUpdater.newUpdater(C2009p.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final C2018y f9596h = new C2018y("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    private final int f9597a;

    /* JADX INFO: renamed from: b */
    private final boolean f9598b;

    /* JADX INFO: renamed from: c */
    private final int f9599c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ AtomicReferenceArray f9600d;

    /* JADX INFO: renamed from: h2.p$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m10177a(long j3) {
            return (j3 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* JADX INFO: renamed from: b */
        public final long m10178b(long j3, int i3) {
            return m10180d(j3, 1073741823L) | ((long) i3);
        }

        /* JADX INFO: renamed from: c */
        public final long m10179c(long j3, int i3) {
            return m10180d(j3, 1152921503533105152L) | (((long) i3) << 30);
        }

        /* JADX INFO: renamed from: d */
        public final long m10180d(long j3, long j4) {
            return j3 & (~j4);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: h2.p$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f9601a;

        public b(int i3) {
            this.f9601a = i3;
        }
    }

    public C2009p(int i3, boolean z2) {
        this.f9597a = i3;
        this.f9598b = z2;
        int i4 = i3 - 1;
        this.f9599c = i4;
        this.f9600d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i3 & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: b */
    private final C2009p m10163b(long j3) {
        C2009p c2009p = new C2009p(this.f9597a * 2, this.f9598b);
        int i3 = (int) (1073741823 & j3);
        int i4 = (int) ((1152921503533105152L & j3) >> 30);
        while (true) {
            int i5 = this.f9599c;
            if ((i3 & i5) == (i5 & i4)) {
                f9595g.set(c2009p, f9593e.m10180d(j3, 1152921504606846976L));
                return c2009p;
            }
            Object bVar = m10166f().get(this.f9599c & i3);
            if (bVar == null) {
                bVar = new b(i3);
            }
            c2009p.m10166f().set(c2009p.f9599c & i3, bVar);
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    private final C2009p m10164c(long j3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9594f;
        while (true) {
            C2009p c2009p = (C2009p) atomicReferenceFieldUpdater.get(this);
            if (c2009p != null) {
                return c2009p;
            }
            AbstractC0933b.m3989a(f9594f, this, null, m10163b(j3));
        }
    }

    /* JADX INFO: renamed from: e */
    private final C2009p m10165e(int i3, Object obj) {
        Object obj2 = m10166f().get(this.f9599c & i3);
        if (!(obj2 instanceof b) || ((b) obj2).f9601a != i3) {
            return null;
        }
        m10166f().set(i3 & this.f9599c, obj);
        return this;
    }

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ AtomicReferenceArray m10166f() {
        return this.f9600d;
    }

    /* JADX INFO: renamed from: k */
    private final long m10169k() {
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9595g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                return j3;
            }
            j4 = 1152921504606846976L | j3;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j4));
        return j4;
    }

    /* JADX INFO: renamed from: n */
    private final C2009p m10170n(int i3, int i4) {
        long j3;
        int i5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9595g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            i5 = (int) (1073741823 & j3);
            if ((1152921504606846976L & j3) != 0) {
                return m10175l();
            }
        } while (!f9595g.compareAndSet(this, j3, f9593e.m10178b(j3, i4)));
        m10166f().set(this.f9599c & i5, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m10171a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = m10168i()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            h2.p$a r13 = p110h2.C2009p.f9593e
            int r13 = r13.m10177a(r3)
            return r13
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f9599c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r12.f9598b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.m10166f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L53
            int r2 = r12.f9597a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L52
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L52:
            return r6
        L53:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m10168i()
            h2.p$a r5 = p110h2.C2009p.f9593e
            long r5 = r5.m10179c(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.m10166f()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m10168i()
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L8b
            h2.p r0 = r0.m10175l()
            h2.p r0 = r0.m10165e(r9, r13)
            if (r0 != 0) goto L72
        L8b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p110h2.C2009p.m10171a(java.lang.Object):int");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10172d() {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9595g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final int m10173g() {
        long j3 = f9595g.get(this);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10174j() {
        long j3 = f9595g.get(this);
        return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: l */
    public final C2009p m10175l() {
        return m10164c(m10169k());
    }

    /* JADX INFO: renamed from: m */
    public final Object m10176m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9595g;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j3) != 0) {
                return f9596h;
            }
            int i3 = (int) (1073741823 & j3);
            int i4 = this.f9599c;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i4) == (i4 & i3)) {
                return null;
            }
            Object obj = m10166f().get(this.f9599c & i3);
            if (obj == null) {
                if (this.f9598b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i5 = (i3 + 1) & 1073741823;
                if (f9595g.compareAndSet(this, j3, f9593e.m10178b(j3, i5))) {
                    m10166f().set(this.f9599c & i3, null);
                    return obj;
                }
                if (this.f9598b) {
                    C2009p c2009pM10170n = this;
                    do {
                        c2009pM10170n = c2009pM10170n.m10170n(i3, i5);
                    } while (c2009pM10170n != null);
                    return obj;
                }
            }
        }
    }
}
