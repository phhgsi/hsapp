package p102f2;

import androidx.concurrent.futures.AbstractC0933b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p035L1.C0372d;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p044O1.AbstractC0452b;
import p047P1.InterfaceC0473d;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p110h2.C2001h;

/* JADX INFO: renamed from: f2.j */
/* JADX INFO: loaded from: classes.dex */
public class C1938j extends AbstractC1905K implements InterfaceC1936i, InterfaceC0473d {

    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9441i = AtomicIntegerFieldUpdater.newUpdater(C1938j.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: j */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9442j = AtomicReferenceFieldUpdater.newUpdater(C1938j.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9443k = AtomicReferenceFieldUpdater.newUpdater(C1938j.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: g */
    private final InterfaceC0442e f9444g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC0446i f9445h;

    public C1938j(InterfaceC0442e interfaceC0442e, int i3) {
        super(i3);
        this.f9444g = interfaceC0442e;
        this.f9445h = interfaceC0442e.mo1615c();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1926d.f9432a;
    }

    /* JADX INFO: renamed from: B */
    private final boolean m9882B() {
        if (!AbstractC1906L.m9809c(this.f9411f)) {
            return false;
        }
        InterfaceC0442e interfaceC0442e = this.f9444g;
        AbstractC0606k.m2143c(interfaceC0442e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2001h) interfaceC0442e).m10126m();
    }

    /* JADX INFO: renamed from: F */
    private final void m9883F(Object obj, int i3, InterfaceC0577l interfaceC0577l) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9442j;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC1959t0)) {
                Object obj3 = obj;
                InterfaceC0577l interfaceC0577l2 = interfaceC0577l;
                if (obj2 instanceof C1940k) {
                    C1940k c1940k = (C1940k) obj2;
                    if (c1940k.m9918e()) {
                        if (interfaceC0577l2 != null) {
                            m9902k(interfaceC0577l2, c1940k.f9476a);
                            return;
                        }
                        return;
                    }
                }
                m9888i(obj3);
                throw new C0372d();
            }
            Object obj4 = obj;
            int i4 = i3;
            InterfaceC0577l interfaceC0577l3 = interfaceC0577l;
            if (AbstractC0933b.m3989a(f9442j, this, obj2, m9885H((InterfaceC1959t0) obj2, obj4, i4, interfaceC0577l3, null))) {
                m9890o();
                m9891p(i4);
                return;
            } else {
                obj = obj4;
                i3 = i4;
                interfaceC0577l = interfaceC0577l3;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    static /* synthetic */ void m9884G(C1938j c1938j, Object obj, int i3, InterfaceC0577l interfaceC0577l, int i4, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i4 & 4) != 0) {
            interfaceC0577l = null;
        }
        c1938j.m9883F(obj, i3, interfaceC0577l);
    }

    /* JADX INFO: renamed from: H */
    private final Object m9885H(InterfaceC1959t0 interfaceC1959t0, Object obj, int i3, InterfaceC0577l interfaceC0577l, Object obj2) {
        return obj instanceof C1954r ? obj : ((AbstractC1906L.m9808b(i3) || obj2 != null) && !(interfaceC0577l == null && obj2 == null)) ? new C1952q(obj, null, interfaceC0577l, obj2, null, 16, null) : obj;
    }

    /* JADX INFO: renamed from: I */
    private final boolean m9886I() {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9441i;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f9441i.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
        return true;
    }

    /* JADX INFO: renamed from: J */
    private final boolean m9887J() {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9441i;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f9441i.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        return true;
    }

    /* JADX INFO: renamed from: i */
    private final Void m9888i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* JADX INFO: renamed from: m */
    private final boolean m9889m(Throwable th) {
        if (!m9882B()) {
            return false;
        }
        InterfaceC0442e interfaceC0442e = this.f9444g;
        AbstractC0606k.m2143c(interfaceC0442e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2001h) interfaceC0442e).m10127n(th);
    }

    /* JADX INFO: renamed from: o */
    private final void m9890o() {
        if (m9882B()) {
            return;
        }
        m9904n();
    }

    /* JADX INFO: renamed from: p */
    private final void m9891p(int i3) {
        if (m9886I()) {
            return;
        }
        AbstractC1906L.m9807a(this, i3);
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC1908N m9892r() {
        return (InterfaceC1908N) f9443k.get(this);
    }

    /* JADX INFO: renamed from: u */
    private final String m9893u() {
        Object objM9907t = m9907t();
        return objM9907t instanceof InterfaceC1959t0 ? "Active" : objM9907t instanceof C1940k ? "Cancelled" : "Completed";
    }

    /* JADX INFO: renamed from: z */
    private final InterfaceC1908N m9897z() {
        InterfaceC1931f0 interfaceC1931f0 = (InterfaceC1931f0) mo1615c().mo1603b(InterfaceC1931f0.f9437c);
        if (interfaceC1931f0 == null) {
            return null;
        }
        InterfaceC1908N interfaceC1908NM9926h = AbstractC1941k0.m9926h(interfaceC1931f0, true, false, new C1942l(this), 2, null);
        AbstractC0933b.m3989a(f9443k, this, null, interfaceC1908NM9926h);
        return interfaceC1908NM9926h;
    }

    /* JADX INFO: renamed from: A */
    public boolean m9898A() {
        return !(m9907t() instanceof InterfaceC1959t0);
    }

    /* JADX INFO: renamed from: C */
    protected String m9899C() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: D */
    public final void m9900D(Throwable th) {
        if (m9889m(th)) {
            return;
        }
        m9903l(th);
        m9890o();
    }

    /* JADX INFO: renamed from: E */
    public final void m9901E() {
        Throwable thM10129p;
        InterfaceC0442e interfaceC0442e = this.f9444g;
        C2001h c2001h = interfaceC0442e instanceof C2001h ? (C2001h) interfaceC0442e : null;
        if (c2001h == null || (thM10129p = c2001h.m10129p(this)) == null) {
            return;
        }
        m9904n();
        m9903l(thM10129p);
    }

    @Override // p102f2.AbstractC1905K
    /* JADX INFO: renamed from: a */
    public void mo9801a(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9442j;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC1959t0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C1954r) {
                return;
            }
            if (obj2 instanceof C1952q) {
                C1952q c1952q = (C1952q) obj2;
                if (c1952q.m10008c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (AbstractC0933b.m3989a(f9442j, this, obj2, C1952q.m10006b(c1952q, null, null, null, null, th3, 15, null))) {
                    c1952q.m10009d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (AbstractC0933b.m3989a(f9442j, this, obj2, new C1952q(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // p102f2.AbstractC1905K
    /* JADX INFO: renamed from: b */
    public final InterfaceC0442e mo9802b() {
        return this.f9444g;
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: c */
    public InterfaceC0446i mo1615c() {
        return this.f9445h;
    }

    @Override // p102f2.AbstractC1905K
    /* JADX INFO: renamed from: d */
    public Throwable mo9803d(Object obj) {
        Throwable thMo9803d = super.mo9803d(obj);
        if (thMo9803d != null) {
            return thMo9803d;
        }
        return null;
    }

    @Override // p047P1.InterfaceC0473d
    /* JADX INFO: renamed from: e */
    public InterfaceC0473d mo1750e() {
        InterfaceC0442e interfaceC0442e = this.f9444g;
        if (interfaceC0442e instanceof InterfaceC0473d) {
            return (InterfaceC0473d) interfaceC0442e;
        }
        return null;
    }

    @Override // p102f2.AbstractC1905K
    /* JADX INFO: renamed from: f */
    public Object mo9804f(Object obj) {
        return obj instanceof C1952q ? ((C1952q) obj).f9471a : obj;
    }

    @Override // p102f2.AbstractC1905K
    /* JADX INFO: renamed from: h */
    public Object mo9806h() {
        return m9907t();
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: j */
    public void mo1616j(Object obj) {
        m9884G(this, AbstractC1960u.m10017c(obj, this), this.f9411f, null, 4, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m9902k(InterfaceC0577l interfaceC0577l, Throwable th) {
        try {
            interfaceC0577l.mo1406f(th);
        } catch (Throwable th2) {
            AbstractC1968y.m10038a(mo1615c(), new C1958t("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m9903l(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9442j;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC1959t0)) {
                return false;
            }
        } while (!AbstractC0933b.m3989a(f9442j, this, obj, new C1940k(this, th, false)));
        m9890o();
        m9891p(this.f9411f);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m9904n() {
        InterfaceC1908N interfaceC1908NM9892r = m9892r();
        if (interfaceC1908NM9892r == null) {
            return;
        }
        interfaceC1908NM9892r.mo9815b();
        f9443k.set(this, C1957s0.f9479a);
    }

    /* JADX INFO: renamed from: q */
    public Throwable m9905q(InterfaceC1931f0 interfaceC1931f0) {
        return interfaceC1931f0.mo9868v();
    }

    /* JADX INFO: renamed from: s */
    public final Object m9906s() throws Throwable {
        InterfaceC1931f0 interfaceC1931f0;
        boolean zM9882B = m9882B();
        if (m9887J()) {
            if (m9892r() == null) {
                m9897z();
            }
            if (zM9882B) {
                m9901E();
            }
            return AbstractC0452b.m1647e();
        }
        if (zM9882B) {
            m9901E();
        }
        Object objM9907t = m9907t();
        if (objM9907t instanceof C1954r) {
            throw ((C1954r) objM9907t).f9476a;
        }
        if (!AbstractC1906L.m9808b(this.f9411f) || (interfaceC1931f0 = (InterfaceC1931f0) mo1615c().mo1603b(InterfaceC1931f0.f9437c)) == null || interfaceC1931f0.mo9853a()) {
            return mo9804f(objM9907t);
        }
        CancellationException cancellationExceptionMo9868v = interfaceC1931f0.mo9868v();
        mo9801a(objM9907t, cancellationExceptionMo9868v);
        throw cancellationExceptionMo9868v;
    }

    /* JADX INFO: renamed from: t */
    public final Object m9907t() {
        return f9442j.get(this);
    }

    public String toString() {
        return m9899C() + '(' + AbstractC1898D.m9783c(this.f9444g) + "){" + m9893u() + "}@" + AbstractC1898D.m9782b(this);
    }

    /* JADX INFO: renamed from: y */
    public void m9908y() {
        InterfaceC1908N interfaceC1908NM9897z = m9897z();
        if (interfaceC1908NM9897z != null && m9898A()) {
            interfaceC1908NM9897z.mo9815b();
            f9443k.set(this, C1957s0.f9479a);
        }
    }
}
