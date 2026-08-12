package p102f2;

import androidx.concurrent.futures.AbstractC0933b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p041N1.InterfaceC0446i;
import p071X1.AbstractC0606k;
import p110h2.AbstractC1991E;
import p110h2.C2009p;

/* JADX INFO: renamed from: f2.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1911Q extends AbstractC1912S implements InterfaceC1903I {

    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9420i = AtomicReferenceFieldUpdater.newUpdater(AbstractC1911Q.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: j */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9421j = AtomicReferenceFieldUpdater.newUpdater(AbstractC1911Q.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9422k = AtomicIntegerFieldUpdater.newUpdater(AbstractC1911Q.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: f2.Q$a */
    public static final class a extends AbstractC1991E {
    }

    /* JADX INFO: renamed from: R */
    private final void m9827R() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9420i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (AbstractC0933b.m3989a(f9420i, this, null, AbstractC1914U.f9424b)) {
                    return;
                }
            } else if (obj instanceof C2009p) {
                ((C2009p) obj).m10172d();
                return;
            } else {
                if (obj == AbstractC1914U.f9424b) {
                    return;
                }
                C2009p c2009p = new C2009p(8, true);
                AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c2009p.m10171a((Runnable) obj);
                if (AbstractC0933b.m3989a(f9420i, this, obj, c2009p)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    private final Runnable m9828S() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9420i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C2009p) {
                AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C2009p c2009p = (C2009p) obj;
                Object objM10176m = c2009p.m10176m();
                if (objM10176m != C2009p.f9596h) {
                    return (Runnable) objM10176m;
                }
                AbstractC0933b.m3989a(f9420i, this, obj, c2009p.m10175l());
            } else {
                if (obj == AbstractC1914U.f9424b) {
                    return null;
                }
                if (AbstractC0933b.m3989a(f9420i, this, obj, null)) {
                    AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: U */
    private final boolean m9829U(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9420i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m9833Y()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC0933b.m3989a(f9420i, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C2009p) {
                AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C2009p c2009p = (C2009p) obj;
                int iM10171a = c2009p.m10171a(runnable);
                if (iM10171a == 0) {
                    return true;
                }
                if (iM10171a == 1) {
                    AbstractC0933b.m3989a(f9420i, this, obj, c2009p.m10175l());
                } else if (iM10171a == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC1914U.f9424b) {
                    return false;
                }
                C2009p c2009p2 = new C2009p(8, true);
                AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c2009p2.m10171a((Runnable) obj);
                c2009p2.m10171a(runnable);
                if (AbstractC0933b.m3989a(f9420i, this, obj, c2009p2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    private final boolean m9833Y() {
        return f9422k.get(this) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m9834b0() {
        AbstractC1924c.m9856a();
        System.nanoTime();
    }

    /* JADX INFO: renamed from: d0 */
    private final void m9835d0(boolean z2) {
        f9422k.set(this, z2 ? 1 : 0);
    }

    @Override // p102f2.AbstractC1964w
    /* JADX INFO: renamed from: D */
    public final void mo9836D(InterfaceC0446i interfaceC0446i, Runnable runnable) {
        mo9791T(runnable);
    }

    @Override // p102f2.AbstractC1910P
    /* JADX INFO: renamed from: J */
    protected long mo9822J() {
        if (super.mo9822J() == 0) {
            return 0L;
        }
        Object obj = f9420i.get(this);
        if (obj != null) {
            if (!(obj instanceof C2009p)) {
                return obj == AbstractC1914U.f9424b ? Long.MAX_VALUE : 0L;
            }
            if (!((C2009p) obj).m10174j()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: T */
    public void mo9791T(Runnable runnable) {
        if (m9829U(runnable)) {
            m9840Q();
        } else {
            RunnableC1899E.f9406l.mo9791T(runnable);
        }
    }

    /* JADX INFO: renamed from: Z */
    protected boolean m9837Z() {
        if (!m9825N()) {
            return false;
        }
        Object obj = f9420i.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof C2009p ? ((C2009p) obj).m10174j() : obj == AbstractC1914U.f9424b;
    }

    /* JADX INFO: renamed from: a0 */
    public long m9838a0() {
        if (m9826O()) {
            return 0L;
        }
        Runnable runnableM9828S = m9828S();
        if (runnableM9828S == null) {
            return mo9822J();
        }
        runnableM9828S.run();
        return 0L;
    }

    /* JADX INFO: renamed from: c0 */
    protected final void m9839c0() {
        f9420i.set(this, null);
        f9421j.set(this, null);
    }

    @Override // p102f2.AbstractC1910P
    public void shutdown() {
        C1967x0.f9488a.m10036b();
        m9835d0(true);
        m9827R();
        while (m9838a0() <= 0) {
        }
        m9834b0();
    }
}
