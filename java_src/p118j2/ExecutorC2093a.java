package p118j2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p035L1.C0388t;
import p050Q1.AbstractC0488b;
import p050Q1.InterfaceC0487a;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p071X1.C0613r;
import p086b2.AbstractC1304d;
import p102f2.AbstractC1898D;
import p102f2.AbstractC1924c;
import p110h2.C2016w;
import p110h2.C2018y;

/* JADX INFO: renamed from: j2.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2093a implements Executor, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: k */
    public static final a f9776k = new a(null);

    /* JADX INFO: renamed from: l */
    private static final /* synthetic */ AtomicLongFieldUpdater f9777l = AtomicLongFieldUpdater.newUpdater(ExecutorC2093a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: m */
    private static final /* synthetic */ AtomicLongFieldUpdater f9778m = AtomicLongFieldUpdater.newUpdater(ExecutorC2093a.class, "controlState$volatile");

    /* JADX INFO: renamed from: n */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9779n = AtomicIntegerFieldUpdater.newUpdater(ExecutorC2093a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: o */
    public static final C2018y f9780o = new C2018y("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final int f9781d;

    /* JADX INFO: renamed from: e */
    public final int f9782e;

    /* JADX INFO: renamed from: f */
    public final long f9783f;

    /* JADX INFO: renamed from: g */
    public final String f9784g;

    /* JADX INFO: renamed from: h */
    public final C2096d f9785h;

    /* JADX INFO: renamed from: i */
    public final C2096d f9786i;

    /* JADX INFO: renamed from: j */
    public final C2016w f9787j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: j2.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: j2.a$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9788a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f9800f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f9799e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f9798d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f9801g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f9802h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f9788a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: j2.a$d */
    public static final class d {

        /* JADX INFO: renamed from: d */
        public static final d f9798d = new d("CPU_ACQUIRED", 0);

        /* JADX INFO: renamed from: e */
        public static final d f9799e = new d("BLOCKING", 1);

        /* JADX INFO: renamed from: f */
        public static final d f9800f = new d("PARKING", 2);

        /* JADX INFO: renamed from: g */
        public static final d f9801g = new d("DORMANT", 3);

        /* JADX INFO: renamed from: h */
        public static final d f9802h = new d("TERMINATED", 4);

        /* JADX INFO: renamed from: i */
        private static final /* synthetic */ d[] f9803i;

        /* JADX INFO: renamed from: j */
        private static final /* synthetic */ InterfaceC0487a f9804j;

        static {
            d[] dVarArrM10525a = m10525a();
            f9803i = dVarArrM10525a;
            f9804j = AbstractC0488b.m1799a(dVarArrM10525a);
        }

        private d(String str, int i3) {
        }

        /* JADX INFO: renamed from: a */
        private static final /* synthetic */ d[] m10525a() {
            return new d[]{f9798d, f9799e, f9800f, f9801g, f9802h};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f9803i.clone();
        }
    }

    public ExecutorC2093a(int i3, int i4, long j3, String str) {
        this.f9781d = i3;
        this.f9782e = i4;
        this.f9783f = j3;
        this.f9784g = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i3 + " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should be greater than or equals to core pool size " + i3).toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f9785h = new C2096d();
        this.f9786i = new C2096d();
        this.f9787j = new C2016w((i3 + 1) * 2);
        this.controlState$volatile = ((long) i3) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: renamed from: A */
    private final void m10480A(long j3, boolean z2) {
        if (z2 || m10484G() || m10482E(j3)) {
            return;
        }
        m10484G();
    }

    /* JADX INFO: renamed from: D */
    private final AbstractRunnableC2100h m10481D(c cVar, AbstractRunnableC2100h abstractRunnableC2100h, boolean z2) {
        if (cVar == null || cVar.f9792f == d.f9802h) {
            return abstractRunnableC2100h;
        }
        if (abstractRunnableC2100h.f9815e.mo10530b() == 0 && cVar.f9792f == d.f9799e) {
            return abstractRunnableC2100h;
        }
        cVar.f9796j = true;
        return cVar.f9790d.m10545a(abstractRunnableC2100h, z2);
    }

    /* JADX INFO: renamed from: E */
    private final boolean m10482E(long j3) {
        if (AbstractC1304d.m6631a(((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21)), 0) < this.f9781d) {
            int iM10487d = m10487d();
            if (iM10487d == 1 && this.f9781d > 1) {
                m10487d();
            }
            if (iM10487d > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    static /* synthetic */ boolean m10483F(ExecutorC2093a executorC2093a, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j3 = f9778m.get(executorC2093a);
        }
        return executorC2093a.m10482E(j3);
    }

    /* JADX INFO: renamed from: G */
    private final boolean m10484G() {
        c cVarM10494u;
        do {
            cVarM10494u = m10494u();
            if (cVarM10494u == null) {
                return false;
            }
        } while (!c.f9789l.compareAndSet(cVarM10494u, -1, 0));
        LockSupport.unpark(cVarM10494u);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m10486b(AbstractRunnableC2100h abstractRunnableC2100h) {
        return abstractRunnableC2100h.f9815e.mo10530b() == 1 ? this.f9786i.m10159a(abstractRunnableC2100h) : this.f9785h.m10159a(abstractRunnableC2100h);
    }

    /* JADX INFO: renamed from: d */
    private final int m10487d() {
        synchronized (this.f9787j) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j3 = f9778m.get(this);
                int i3 = (int) (j3 & 2097151);
                int iA = AbstractC1304d.m6631a(i3 - ((int) ((j3 & 4398044413952L) >> 21)), 0);
                if (iA >= this.f9781d) {
                    return 0;
                }
                if (i3 >= this.f9782e) {
                    return 0;
                }
                int i4 = ((int) (m10490p().get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f9787j.m10188b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i4);
                this.f9787j.m10189c(i4, cVar);
                if (i4 != ((int) (2097151 & f9778m.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = iA + 1;
                cVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private final c m10488h() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !AbstractC0606k.m2141a(ExecutorC2093a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m10489l(ExecutorC2093a executorC2093a, Runnable runnable, InterfaceC2101i interfaceC2101i, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            interfaceC2101i = AbstractC2104l.f9824g;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        executorC2093a.m10497i(runnable, interfaceC2101i, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicLongFieldUpdater m10490p() {
        return f9778m;
    }

    /* JADX INFO: renamed from: s */
    private final int m10493s(c cVar) {
        Object objM10520i = cVar.m10520i();
        while (objM10520i != f9780o) {
            if (objM10520i == null) {
                return 0;
            }
            c cVar2 = (c) objM10520i;
            int iM10519h = cVar2.m10519h();
            if (iM10519h != 0) {
                return iM10519h;
            }
            objM10520i = cVar2.m10520i();
        }
        return -1;
    }

    /* JADX INFO: renamed from: u */
    private final c m10494u() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9777l;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f9787j.m10188b((int) (2097151 & j3));
            if (cVar == null) {
                return null;
            }
            long j4 = (2097152 + j3) & (-2097152);
            int iM10493s = m10493s(cVar);
            if (iM10493s >= 0 && f9777l.compareAndSet(this, j3, ((long) iM10493s) | j4)) {
                cVar.m10523r(f9780o);
                return cVar;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m10495C() {
        if (m10484G() || m10483F(this, 0L, 1, null)) {
            return;
        }
        m10484G();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m10501y(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m10489l(this, runnable, null, false, 6, null);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractRunnableC2100h m10496g(Runnable runnable, InterfaceC2101i interfaceC2101i) {
        long jMo10526a = AbstractC2104l.f9823f.mo10526a();
        if (!(runnable instanceof AbstractRunnableC2100h)) {
            return new C2103k(runnable, jMo10526a, interfaceC2101i);
        }
        AbstractRunnableC2100h abstractRunnableC2100h = (AbstractRunnableC2100h) runnable;
        abstractRunnableC2100h.f9814d = jMo10526a;
        abstractRunnableC2100h.f9815e = interfaceC2101i;
        return abstractRunnableC2100h;
    }

    /* JADX INFO: renamed from: i */
    public final void m10497i(Runnable runnable, InterfaceC2101i interfaceC2101i, boolean z2) {
        AbstractC1924c.m9856a();
        AbstractRunnableC2100h abstractRunnableC2100hM10496g = m10496g(runnable, interfaceC2101i);
        boolean z3 = false;
        boolean z4 = abstractRunnableC2100hM10496g.f9815e.mo10530b() == 1;
        long jAddAndGet = z4 ? f9778m.addAndGet(this, 2097152L) : 0L;
        c cVarM10488h = m10488h();
        AbstractRunnableC2100h abstractRunnableC2100hM10481D = m10481D(cVarM10488h, abstractRunnableC2100hM10496g, z2);
        if (abstractRunnableC2100hM10481D != null && !m10486b(abstractRunnableC2100hM10481D)) {
            throw new RejectedExecutionException(this.f9784g + " was terminated");
        }
        if (z2 && cVarM10488h != null) {
            z3 = true;
        }
        if (z4) {
            m10480A(jAddAndGet, z3);
        } else {
            if (z3) {
                return;
            }
            m10495C();
        }
    }

    public final boolean isTerminated() {
        return f9779n.get(this) != 0;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM10187a = this.f9787j.m10187a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < iM10187a; i8++) {
            c cVar = (c) this.f9787j.m10188b(i8);
            if (cVar != null) {
                int iM10546i = cVar.f9790d.m10546i();
                int i9 = b.f9788a[cVar.f9792f.ordinal()];
                if (i9 == 1) {
                    i5++;
                } else if (i9 == 2) {
                    i4++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM10546i);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i9 == 3) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM10546i);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i9 == 4) {
                    i6++;
                    if (iM10546i > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM10546i);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i9 == 5) {
                    i7++;
                }
            }
        }
        long j3 = f9778m.get(this);
        return this.f9784g + '@' + AbstractC1898D.m9782b(this) + "[Pool Size {core = " + this.f9781d + ", max = " + this.f9782e + "}, Worker States {CPU = " + i3 + ", blocking = " + i4 + ", parked = " + i5 + ", dormant = " + i6 + ", terminated = " + i7 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f9785h.m10161c() + ", global blocking queue size = " + this.f9786i.m10161c() + ", Control State {created workers= " + ((int) (2097151 & j3)) + ", blocking tasks = " + ((int) ((4398044413952L & j3) >> 21)) + ", CPUs acquired = " + (this.f9781d - ((int) ((9223367638808264704L & j3) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10498v(c cVar) {
        long j3;
        int iM10519h;
        if (cVar.m10520i() != f9780o) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9777l;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            iM10519h = cVar.m10519h();
            cVar.m10523r(this.f9787j.m10188b((int) (2097151 & j3)));
        } while (!f9777l.compareAndSet(this, j3, ((2097152 + j3) & (-2097152)) | ((long) iM10519h)));
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m10499w(c cVar, int i3, int i4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9777l;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            int iM10493s = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (iM10493s == i3) {
                iM10493s = i4 == 0 ? m10493s(cVar) : i4;
            }
            if (iM10493s >= 0) {
                if (f9777l.compareAndSet(this, j3, j4 | ((long) iM10493s))) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m10500x(AbstractRunnableC2100h abstractRunnableC2100h) {
        try {
            abstractRunnableC2100h.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC1924c.m9856a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10501y(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = m10492r()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            j2.a$c r0 = r7.m10488h()
            h2.w r1 = r7.f9787j
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = m10485a()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            h2.w r4 = r7.f9787j
            java.lang.Object r4 = r4.m10188b(r1)
            p071X1.AbstractC0606k.m2142b(r4)
            j2.a$c r4 = (p118j2.ExecutorC2093a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            j2.o r4 = r4.f9790d
            j2.d r5 = r7.f9786i
            r4.m10547j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            j2.d r8 = r7.f9786i
            r8.m10160b()
            j2.d r8 = r7.f9785h
            r8.m10160b()
        L57:
            if (r0 == 0) goto L5f
            j2.h r8 = r0.m10518g(r2)
            if (r8 != 0) goto L8b
        L5f:
            j2.d r8 = r7.f9785h
            java.lang.Object r8 = r8.m10162e()
            j2.h r8 = (p118j2.AbstractRunnableC2100h) r8
            if (r8 != 0) goto L8b
            j2.d r8 = r7.f9786i
            java.lang.Object r8 = r8.m10162e()
            j2.h r8 = (p118j2.AbstractRunnableC2100h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            j2.a$d r8 = p118j2.ExecutorC2093a.d.f9802h
            r0.m10524u(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m10491q()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m10490p()
            r8.set(r7, r0)
            return
        L8b:
            r7.m10500x(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p118j2.ExecutorC2093a.m10501y(long):void");
    }

    /* JADX INFO: renamed from: j2.a$c */
    public final class c extends Thread {

        /* JADX INFO: renamed from: l */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f9789l = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: d */
        public final C2107o f9790d;

        /* JADX INFO: renamed from: e */
        private final C0613r f9791e;

        /* JADX INFO: renamed from: f */
        public d f9792f;

        /* JADX INFO: renamed from: g */
        private long f9793g;

        /* JADX INFO: renamed from: h */
        private long f9794h;

        /* JADX INFO: renamed from: i */
        private int f9795i;
        private volatile int indexInArray;

        /* JADX INFO: renamed from: j */
        public boolean f9796j;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(ExecutorC2093a.this.getClass().getClassLoader());
            this.f9790d = new C2107o();
            this.f9791e = new C0613r();
            this.f9792f = d.f9801g;
            this.nextParkedWorker = ExecutorC2093a.f9780o;
            int iNanoTime = (int) System.nanoTime();
            this.f9795i = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* JADX INFO: renamed from: b */
        private final void m10503b(int i3) {
            if (i3 == 0) {
                return;
            }
            ExecutorC2093a.m10490p().addAndGet(ExecutorC2093a.this, -2097152L);
            if (this.f9792f != d.f9802h) {
                this.f9792f = d.f9801g;
            }
        }

        /* JADX INFO: renamed from: c */
        private final void m10504c(int i3) {
            if (i3 != 0 && m10524u(d.f9799e)) {
                ExecutorC2093a.this.m10495C();
            }
        }

        /* JADX INFO: renamed from: d */
        private final void m10505d(AbstractRunnableC2100h abstractRunnableC2100h) {
            int iMo10530b = abstractRunnableC2100h.f9815e.mo10530b();
            m10509k(iMo10530b);
            m10504c(iMo10530b);
            ExecutorC2093a.this.m10500x(abstractRunnableC2100h);
            m10503b(iMo10530b);
        }

        /* JADX INFO: renamed from: e */
        private final AbstractRunnableC2100h m10506e(boolean z2) {
            AbstractRunnableC2100h abstractRunnableC2100hM10512o;
            AbstractRunnableC2100h abstractRunnableC2100hM10512o2;
            if (z2) {
                boolean z3 = m10521m(ExecutorC2093a.this.f9781d * 2) == 0;
                if (z3 && (abstractRunnableC2100hM10512o2 = m10512o()) != null) {
                    return abstractRunnableC2100hM10512o2;
                }
                AbstractRunnableC2100h abstractRunnableC2100hM10548k = this.f9790d.m10548k();
                if (abstractRunnableC2100hM10548k != null) {
                    return abstractRunnableC2100hM10548k;
                }
                if (!z3 && (abstractRunnableC2100hM10512o = m10512o()) != null) {
                    return abstractRunnableC2100hM10512o;
                }
            } else {
                AbstractRunnableC2100h abstractRunnableC2100hM10512o3 = m10512o();
                if (abstractRunnableC2100hM10512o3 != null) {
                    return abstractRunnableC2100hM10512o3;
                }
            }
            return m10516v(3);
        }

        /* JADX INFO: renamed from: f */
        private final AbstractRunnableC2100h m10507f() {
            AbstractRunnableC2100h abstractRunnableC2100hM10549l = this.f9790d.m10549l();
            if (abstractRunnableC2100hM10549l != null) {
                return abstractRunnableC2100hM10549l;
            }
            AbstractRunnableC2100h abstractRunnableC2100h = (AbstractRunnableC2100h) ExecutorC2093a.this.f9786i.m10162e();
            return abstractRunnableC2100h == null ? m10516v(1) : abstractRunnableC2100h;
        }

        /* JADX INFO: renamed from: k */
        private final void m10509k(int i3) {
            this.f9793g = 0L;
            if (this.f9792f == d.f9800f) {
                this.f9792f = d.f9799e;
            }
        }

        /* JADX INFO: renamed from: l */
        private final boolean m10510l() {
            return this.nextParkedWorker != ExecutorC2093a.f9780o;
        }

        /* JADX INFO: renamed from: n */
        private final void m10511n() {
            if (this.f9793g == 0) {
                this.f9793g = System.nanoTime() + ExecutorC2093a.this.f9783f;
            }
            LockSupport.parkNanos(ExecutorC2093a.this.f9783f);
            if (System.nanoTime() - this.f9793g >= 0) {
                this.f9793g = 0L;
                m10517w();
            }
        }

        /* JADX INFO: renamed from: o */
        private final AbstractRunnableC2100h m10512o() {
            if (m10521m(2) == 0) {
                AbstractRunnableC2100h abstractRunnableC2100h = (AbstractRunnableC2100h) ExecutorC2093a.this.f9785h.m10162e();
                return abstractRunnableC2100h != null ? abstractRunnableC2100h : (AbstractRunnableC2100h) ExecutorC2093a.this.f9786i.m10162e();
            }
            AbstractRunnableC2100h abstractRunnableC2100h2 = (AbstractRunnableC2100h) ExecutorC2093a.this.f9786i.m10162e();
            return abstractRunnableC2100h2 != null ? abstractRunnableC2100h2 : (AbstractRunnableC2100h) ExecutorC2093a.this.f9785h.m10162e();
        }

        /* JADX INFO: renamed from: p */
        private final void m10513p() {
            loop0: while (true) {
                boolean z2 = false;
                while (!ExecutorC2093a.this.isTerminated() && this.f9792f != d.f9802h) {
                    AbstractRunnableC2100h abstractRunnableC2100hM10518g = m10518g(this.f9796j);
                    if (abstractRunnableC2100hM10518g != null) {
                        this.f9794h = 0L;
                        m10505d(abstractRunnableC2100hM10518g);
                    } else {
                        this.f9796j = false;
                        if (this.f9794h == 0) {
                            m10515t();
                        } else if (z2) {
                            m10524u(d.f9800f);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f9794h);
                            this.f9794h = 0L;
                        } else {
                            z2 = true;
                        }
                    }
                }
                break loop0;
            }
            m10524u(d.f9802h);
        }

        /* JADX INFO: renamed from: s */
        private final boolean m10514s() {
            long j3;
            if (this.f9792f == d.f9798d) {
                return true;
            }
            ExecutorC2093a executorC2093a = ExecutorC2093a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM10490p = ExecutorC2093a.m10490p();
            do {
                j3 = atomicLongFieldUpdaterM10490p.get(executorC2093a);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC2093a.m10490p().compareAndSet(executorC2093a, j3, j3 - 4398046511104L));
            this.f9792f = d.f9798d;
            return true;
        }

        /* JADX INFO: renamed from: t */
        private final void m10515t() {
            if (!m10510l()) {
                ExecutorC2093a.this.m10498v(this);
                return;
            }
            f9789l.set(this, -1);
            while (m10510l() && f9789l.get(this) == -1 && !ExecutorC2093a.this.isTerminated() && this.f9792f != d.f9802h) {
                m10524u(d.f9800f);
                Thread.interrupted();
                m10511n();
            }
        }

        /* JADX INFO: renamed from: v */
        private final AbstractRunnableC2100h m10516v(int i3) {
            int i4 = (int) (ExecutorC2093a.m10490p().get(ExecutorC2093a.this) & 2097151);
            if (i4 < 2) {
                return null;
            }
            int iM10521m = m10521m(i4);
            ExecutorC2093a executorC2093a = ExecutorC2093a.this;
            long jMin = Long.MAX_VALUE;
            for (int i5 = 0; i5 < i4; i5++) {
                iM10521m++;
                if (iM10521m > i4) {
                    iM10521m = 1;
                }
                c cVar = (c) executorC2093a.f9787j.m10188b(iM10521m);
                if (cVar != null && cVar != this) {
                    long jM10550r = cVar.f9790d.m10550r(i3, this.f9791e);
                    if (jM10550r == -1) {
                        C0613r c0613r = this.f9791e;
                        AbstractRunnableC2100h abstractRunnableC2100h = (AbstractRunnableC2100h) c0613r.f2012d;
                        c0613r.f2012d = null;
                        return abstractRunnableC2100h;
                    }
                    if (jM10550r > 0) {
                        jMin = Math.min(jMin, jM10550r);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f9794h = jMin;
            return null;
        }

        /* JADX INFO: renamed from: w */
        private final void m10517w() {
            ExecutorC2093a executorC2093a = ExecutorC2093a.this;
            synchronized (executorC2093a.f9787j) {
                try {
                    if (executorC2093a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC2093a.m10490p().get(executorC2093a) & 2097151)) <= executorC2093a.f9781d) {
                        return;
                    }
                    if (f9789l.compareAndSet(this, -1, 1)) {
                        int i3 = this.indexInArray;
                        m10522q(0);
                        executorC2093a.m10499w(this, i3, 0);
                        int andDecrement = (int) (2097151 & ExecutorC2093a.m10490p().getAndDecrement(executorC2093a));
                        if (andDecrement != i3) {
                            Object objM10188b = executorC2093a.f9787j.m10188b(andDecrement);
                            AbstractC0606k.m2142b(objM10188b);
                            c cVar = (c) objM10188b;
                            executorC2093a.f9787j.m10189c(i3, cVar);
                            cVar.m10522q(i3);
                            executorC2093a.m10499w(cVar, andDecrement, i3);
                        }
                        executorC2093a.f9787j.m10189c(andDecrement, null);
                        C0388t c0388t = C0388t.f1507a;
                        this.f9792f = d.f9802h;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public final AbstractRunnableC2100h m10518g(boolean z2) {
            return m10514s() ? m10506e(z2) : m10507f();
        }

        /* JADX INFO: renamed from: h */
        public final int m10519h() {
            return this.indexInArray;
        }

        /* JADX INFO: renamed from: i */
        public final Object m10520i() {
            return this.nextParkedWorker;
        }

        /* JADX INFO: renamed from: m */
        public final int m10521m(int i3) {
            int i4 = this.f9795i;
            int i5 = i4 ^ (i4 << 13);
            int i6 = i5 ^ (i5 >> 17);
            int i7 = i6 ^ (i6 << 5);
            this.f9795i = i7;
            int i8 = i3 - 1;
            return (i8 & i3) == 0 ? i7 & i8 : (i7 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i3;
        }

        /* JADX INFO: renamed from: q */
        public final void m10522q(int i3) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC2093a.this.f9784g);
            sb.append("-worker-");
            sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
            setName(sb.toString());
            this.indexInArray = i3;
        }

        /* JADX INFO: renamed from: r */
        public final void m10523r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m10513p();
        }

        /* JADX INFO: renamed from: u */
        public final boolean m10524u(d dVar) {
            d dVar2 = this.f9792f;
            boolean z2 = dVar2 == d.f9798d;
            if (z2) {
                ExecutorC2093a.m10490p().addAndGet(ExecutorC2093a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f9792f = dVar;
            }
            return z2;
        }

        public c(ExecutorC2093a executorC2093a, int i3) {
            this();
            m10522q(i3);
        }
    }
}
