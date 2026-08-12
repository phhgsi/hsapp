package p118j2;

import androidx.concurrent.futures.AbstractC0933b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p071X1.C0613r;

/* JADX INFO: renamed from: j2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2107o {

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9827b = AtomicReferenceFieldUpdater.newUpdater(C2107o.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9828c = AtomicIntegerFieldUpdater.newUpdater(C2107o.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9829d = AtomicIntegerFieldUpdater.newUpdater(C2107o.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9830e = AtomicIntegerFieldUpdater.newUpdater(C2107o.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    private final AtomicReferenceArray f9831a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: b */
    private final AbstractRunnableC2100h m10532b(AbstractRunnableC2100h abstractRunnableC2100h) {
        if (m10535e() == 127) {
            return abstractRunnableC2100h;
        }
        if (abstractRunnableC2100h.f9815e.mo10530b() == 1) {
            f9830e.incrementAndGet(this);
        }
        int i3 = f9828c.get(this) & ModuleDescriptor.MODULE_VERSION;
        while (this.f9831a.get(i3) != null) {
            Thread.yield();
        }
        this.f9831a.lazySet(i3, abstractRunnableC2100h);
        f9828c.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final void m10533c(AbstractRunnableC2100h abstractRunnableC2100h) {
        if (abstractRunnableC2100h == null || abstractRunnableC2100h.f9815e.mo10530b() != 1) {
            return;
        }
        f9830e.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: e */
    private final int m10535e() {
        return f9828c.get(this) - f9829d.get(this);
    }

    /* JADX INFO: renamed from: m */
    private final AbstractRunnableC2100h m10539m() {
        AbstractRunnableC2100h abstractRunnableC2100h;
        while (true) {
            int i3 = f9829d.get(this);
            if (i3 - f9828c.get(this) == 0) {
                return null;
            }
            int i4 = i3 & ModuleDescriptor.MODULE_VERSION;
            if (f9829d.compareAndSet(this, i3, i3 + 1) && (abstractRunnableC2100h = (AbstractRunnableC2100h) this.f9831a.getAndSet(i4, null)) != null) {
                m10533c(abstractRunnableC2100h);
                return abstractRunnableC2100h;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private final boolean m10540n(C2096d c2096d) {
        AbstractRunnableC2100h abstractRunnableC2100hM10539m = m10539m();
        if (abstractRunnableC2100hM10539m == null) {
            return false;
        }
        c2096d.m10159a(abstractRunnableC2100hM10539m);
        return true;
    }

    /* JADX INFO: renamed from: o */
    private final AbstractRunnableC2100h m10541o(boolean z2) {
        AbstractRunnableC2100h abstractRunnableC2100h;
        do {
            abstractRunnableC2100h = (AbstractRunnableC2100h) f9827b.get(this);
            if (abstractRunnableC2100h != null) {
                if ((abstractRunnableC2100h.f9815e.mo10530b() == 1) == z2) {
                }
            }
            int i3 = f9829d.get(this);
            int i4 = f9828c.get(this);
            while (i3 != i4) {
                if (z2 && f9830e.get(this) == 0) {
                    return null;
                }
                i4--;
                AbstractRunnableC2100h abstractRunnableC2100hM10543q = m10543q(i4, z2);
                if (abstractRunnableC2100hM10543q != null) {
                    return abstractRunnableC2100hM10543q;
                }
            }
            return null;
        } while (!AbstractC0933b.m3989a(f9827b, this, abstractRunnableC2100h, null));
        return abstractRunnableC2100h;
    }

    /* JADX INFO: renamed from: p */
    private final AbstractRunnableC2100h m10542p(int i3) {
        int i4 = f9829d.get(this);
        int i5 = f9828c.get(this);
        boolean z2 = i3 == 1;
        while (i4 != i5) {
            if (z2 && f9830e.get(this) == 0) {
                return null;
            }
            int i6 = i4 + 1;
            AbstractRunnableC2100h abstractRunnableC2100hM10543q = m10543q(i4, z2);
            if (abstractRunnableC2100hM10543q != null) {
                return abstractRunnableC2100hM10543q;
            }
            i4 = i6;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private final AbstractRunnableC2100h m10543q(int i3, boolean z2) {
        int i4 = i3 & ModuleDescriptor.MODULE_VERSION;
        AbstractRunnableC2100h abstractRunnableC2100h = (AbstractRunnableC2100h) this.f9831a.get(i4);
        if (abstractRunnableC2100h != null) {
            if ((abstractRunnableC2100h.f9815e.mo10530b() == 1) == z2 && AbstractC2106n.m10531a(this.f9831a, i4, abstractRunnableC2100h, null)) {
                if (z2) {
                    f9830e.decrementAndGet(this);
                }
                return abstractRunnableC2100h;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private final long m10544s(int i3, C0613r c0613r) {
        AbstractRunnableC2100h abstractRunnableC2100h;
        do {
            abstractRunnableC2100h = (AbstractRunnableC2100h) f9827b.get(this);
            if (abstractRunnableC2100h == null) {
                return -2L;
            }
            if (((abstractRunnableC2100h.f9815e.mo10530b() != 1 ? 2 : 1) & i3) == 0) {
                return -2L;
            }
            long jMo10526a = AbstractC2104l.f9823f.mo10526a() - abstractRunnableC2100h.f9814d;
            long j3 = AbstractC2104l.f9819b;
            if (jMo10526a < j3) {
                return j3 - jMo10526a;
            }
        } while (!AbstractC0933b.m3989a(f9827b, this, abstractRunnableC2100h, null));
        c0613r.f2012d = abstractRunnableC2100h;
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC2100h m10545a(AbstractRunnableC2100h abstractRunnableC2100h, boolean z2) {
        if (z2) {
            return m10532b(abstractRunnableC2100h);
        }
        AbstractRunnableC2100h abstractRunnableC2100h2 = (AbstractRunnableC2100h) f9827b.getAndSet(this, abstractRunnableC2100h);
        if (abstractRunnableC2100h2 == null) {
            return null;
        }
        return m10532b(abstractRunnableC2100h2);
    }

    /* JADX INFO: renamed from: i */
    public final int m10546i() {
        return f9827b.get(this) != null ? m10535e() + 1 : m10535e();
    }

    /* JADX INFO: renamed from: j */
    public final void m10547j(C2096d c2096d) {
        AbstractRunnableC2100h abstractRunnableC2100h = (AbstractRunnableC2100h) f9827b.getAndSet(this, null);
        if (abstractRunnableC2100h != null) {
            c2096d.m10159a(abstractRunnableC2100h);
        }
        while (m10540n(c2096d)) {
        }
    }

    /* JADX INFO: renamed from: k */
    public final AbstractRunnableC2100h m10548k() {
        AbstractRunnableC2100h abstractRunnableC2100h = (AbstractRunnableC2100h) f9827b.getAndSet(this, null);
        return abstractRunnableC2100h == null ? m10539m() : abstractRunnableC2100h;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractRunnableC2100h m10549l() {
        return m10541o(true);
    }

    /* JADX INFO: renamed from: r */
    public final long m10550r(int i3, C0613r c0613r) {
        AbstractRunnableC2100h abstractRunnableC2100hM10539m = i3 == 3 ? m10539m() : m10542p(i3);
        if (abstractRunnableC2100hM10539m == null) {
            return m10544s(i3, c0613r);
        }
        c0613r.f2012d = abstractRunnableC2100hM10539m;
        return -1L;
    }
}
