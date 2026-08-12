package p102f2;

import androidx.concurrent.futures.AbstractC0933b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p035L1.AbstractC0369a;
import p035L1.C0388t;
import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0577l;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;
import p071X1.C0613r;
import p102f2.InterfaceC1925c0;
import p102f2.InterfaceC1931f0;
import p110h2.AbstractC2006m;
import p110h2.AbstractC2014u;
import p110h2.C2007n;

/* JADX INFO: renamed from: f2.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C1945m0 implements InterfaceC1931f0, InterfaceC1948o, InterfaceC1961u0 {

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9449d = AtomicReferenceFieldUpdater.newUpdater(C1945m0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9450e = AtomicReferenceFieldUpdater.newUpdater(C1945m0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: f2.m0$a */
    private static final class a extends AbstractC1943l0 {

        /* JADX INFO: renamed from: e */
        private final C1945m0 f9451e;

        /* JADX INFO: renamed from: f */
        private final b f9452f;

        /* JADX INFO: renamed from: g */
        private final C1946n f9453g;

        /* JADX INFO: renamed from: h */
        private final Object f9454h;

        public a(C1945m0 c1945m0, b bVar, C1946n c1946n, Object obj) {
            this.f9451e = c1945m0;
            this.f9452f = bVar;
            this.f9453g = c1946n;
            this.f9454h = obj;
        }

        @Override // p102f2.InterfaceC1925c0
        /* JADX INFO: renamed from: d */
        public void mo9857d(Throwable th) {
            this.f9451e.m9934I(this.f9452f, this.f9453g, this.f9454h);
        }
    }

    /* JADX INFO: renamed from: f2.m0$b */
    private static final class b implements InterfaceC1921a0 {

        /* JADX INFO: renamed from: b */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f9455b = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f9456c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f9457d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a */
        private final C1955r0 f9458a;

        public b(C1955r0 c1955r0, boolean z2, Throwable th) {
            this.f9458a = c1955r0;
            this._isCompleting$volatile = z2 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        /* JADX INFO: renamed from: c */
        private final ArrayList m9982c() {
            return new ArrayList(4);
        }

        /* JADX INFO: renamed from: d */
        private final Object m9983d() {
            return f9457d.get(this);
        }

        /* JADX INFO: renamed from: o */
        private final void m9987o(Object obj) {
            f9457d.set(this, obj);
        }

        @Override // p102f2.InterfaceC1921a0
        /* JADX INFO: renamed from: a */
        public boolean mo9816a() {
            return m9989f() == null;
        }

        /* JADX INFO: renamed from: b */
        public final void m9988b(Throwable th) {
            Throwable thM9989f = m9989f();
            if (thM9989f == null) {
                m9995p(th);
                return;
            }
            if (th == thM9989f) {
                return;
            }
            Object objM9983d = m9983d();
            if (objM9983d == null) {
                m9987o(th);
                return;
            }
            if (objM9983d instanceof Throwable) {
                if (th == objM9983d) {
                    return;
                }
                ArrayList arrayListM9982c = m9982c();
                arrayListM9982c.add(objM9983d);
                arrayListM9982c.add(th);
                m9987o(arrayListM9982c);
                return;
            }
            if (objM9983d instanceof ArrayList) {
                ((ArrayList) objM9983d).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objM9983d).toString());
        }

        @Override // p102f2.InterfaceC1921a0
        /* JADX INFO: renamed from: e */
        public C1955r0 mo9817e() {
            return this.f9458a;
        }

        /* JADX INFO: renamed from: f */
        public final Throwable m9989f() {
            return (Throwable) f9456c.get(this);
        }

        /* JADX INFO: renamed from: j */
        public final boolean m9990j() {
            return m9989f() != null;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m9991k() {
            return f9455b.get(this) != 0;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m9992l() {
            return m9983d() == AbstractC1947n0.f9466e;
        }

        /* JADX INFO: renamed from: m */
        public final List m9993m(Throwable th) {
            ArrayList arrayListM9982c;
            Object objM9983d = m9983d();
            if (objM9983d == null) {
                arrayListM9982c = m9982c();
            } else if (objM9983d instanceof Throwable) {
                ArrayList arrayListM9982c2 = m9982c();
                arrayListM9982c2.add(objM9983d);
                arrayListM9982c = arrayListM9982c2;
            } else {
                if (!(objM9983d instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objM9983d).toString());
                }
                arrayListM9982c = (ArrayList) objM9983d;
            }
            Throwable thM9989f = m9989f();
            if (thM9989f != null) {
                arrayListM9982c.add(0, thM9989f);
            }
            if (th != null && !AbstractC0606k.m2141a(th, thM9989f)) {
                arrayListM9982c.add(th);
            }
            m9987o(AbstractC1947n0.f9466e);
            return arrayListM9982c;
        }

        /* JADX INFO: renamed from: n */
        public final void m9994n(boolean z2) {
            f9455b.set(this, z2 ? 1 : 0);
        }

        /* JADX INFO: renamed from: p */
        public final void m9995p(Throwable th) {
            f9456c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + m9990j() + ", completing=" + m9991k() + ", rootCause=" + m9989f() + ", exceptions=" + m9983d() + ", list=" + mo9817e() + ']';
        }
    }

    /* JADX INFO: renamed from: f2.m0$c */
    public static final class c extends C2007n.a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C1945m0 f9459d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f9460e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2007n c2007n, C1945m0 c1945m0, Object obj) {
            super(c2007n);
            this.f9459d = c1945m0;
            this.f9460e = obj;
        }

        @Override // p110h2.AbstractC1995b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object mo9996e(C2007n c2007n) {
            if (this.f9459d.m9966T() == this.f9460e) {
                return null;
            }
            return AbstractC2006m.m10140a();
        }
    }

    public C1945m0(boolean z2) {
        this._state$volatile = z2 ? AbstractC1947n0.f9468g : AbstractC1947n0.f9467f;
    }

    /* JADX INFO: renamed from: D */
    private final Object m9931D(Object obj) {
        Object objM9959x0;
        do {
            Object objM9966T = m9966T();
            if (!(objM9966T instanceof InterfaceC1921a0) || ((objM9966T instanceof b) && ((b) objM9966T).m9991k())) {
                return AbstractC1947n0.f9462a;
            }
            objM9959x0 = m9959x0(objM9966T, new C1954r(m9935J(obj), false, 2, null));
        } while (objM9959x0 == AbstractC1947n0.f9464c);
        return objM9959x0;
    }

    /* JADX INFO: renamed from: E */
    private final boolean m9932E(Throwable th) {
        if (mo9971b0()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC1944m interfaceC1944mM9965S = m9965S();
        return (interfaceC1944mM9965S == null || interfaceC1944mM9965S == C1957s0.f9479a) ? z2 : interfaceC1944mM9965S.mo9930c(th) || z2;
    }

    /* JADX INFO: renamed from: H */
    private final void m9933H(InterfaceC1921a0 interfaceC1921a0, Object obj) throws Throwable {
        InterfaceC1944m interfaceC1944mM9965S = m9965S();
        if (interfaceC1944mM9965S != null) {
            interfaceC1944mM9965S.mo9815b();
            m9976p0(C1957s0.f9479a);
        }
        C1954r c1954r = obj instanceof C1954r ? (C1954r) obj : null;
        Throwable th = c1954r != null ? c1954r.f9476a : null;
        if (!(interfaceC1921a0 instanceof AbstractC1943l0)) {
            C1955r0 c1955r0Mo9817e = interfaceC1921a0.mo9817e();
            if (c1955r0Mo9817e != null) {
                m9947i0(c1955r0Mo9817e, th);
                return;
            }
            return;
        }
        try {
            ((AbstractC1943l0) interfaceC1921a0).mo9857d(th);
        } catch (Throwable th2) {
            mo9852X(new C1958t("Exception in completion handler " + interfaceC1921a0 + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m9934I(b bVar, C1946n c1946n, Object obj) {
        C1946n c1946nM9945g0 = m9945g0(c1946n);
        if (c1946nM9945g0 == null || !m9961z0(bVar, c1946nM9945g0, obj)) {
            mo9800t(m9936K(bVar, obj));
        }
    }

    /* JADX INFO: renamed from: J */
    private final Throwable m9935J(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C1933g0(mo9851F(), null, this) : th;
        }
        AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC1961u0) obj).mo9977s();
    }

    /* JADX INFO: renamed from: K */
    private final Object m9936K(b bVar, Object obj) throws Throwable {
        boolean zM9990j;
        Throwable thM9939O;
        C1954r c1954r = obj instanceof C1954r ? (C1954r) obj : null;
        Throwable th = c1954r != null ? c1954r.f9476a : null;
        synchronized (bVar) {
            zM9990j = bVar.m9990j();
            List listM9993m = bVar.m9993m(th);
            thM9939O = m9939O(bVar, listM9993m);
            if (thM9939O != null) {
                m9953o(thM9939O, listM9993m);
            }
        }
        if (thM9939O != null && thM9939O != th) {
            obj = new C1954r(thM9939O, false, 2, null);
        }
        if (thM9939O != null && (m9932E(thM9939O) || mo9967W(thM9939O))) {
            AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C1954r) obj).m10014c();
        }
        if (!zM9990j) {
            m9973j0(thM9939O);
        }
        mo9855k0(obj);
        AbstractC0933b.m3989a(f9449d, this, bVar, AbstractC1947n0.m10004g(obj));
        m9933H(bVar, obj);
        return obj;
    }

    /* JADX INFO: renamed from: L */
    private final C1946n m9937L(InterfaceC1921a0 interfaceC1921a0) {
        C1946n c1946n = interfaceC1921a0 instanceof C1946n ? (C1946n) interfaceC1921a0 : null;
        if (c1946n != null) {
            return c1946n;
        }
        C1955r0 c1955r0Mo9817e = interfaceC1921a0.mo9817e();
        if (c1955r0Mo9817e != null) {
            return m9945g0(c1955r0Mo9817e);
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    private final Throwable m9938N(Object obj) {
        C1954r c1954r = obj instanceof C1954r ? (C1954r) obj : null;
        if (c1954r != null) {
            return c1954r.f9476a;
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    private final Throwable m9939O(b bVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.m9990j()) {
                return new C1933g0(mo9851F(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : (Throwable) list.get(0);
    }

    /* JADX INFO: renamed from: R */
    private final C1955r0 m9940R(InterfaceC1921a0 interfaceC1921a0) {
        C1955r0 c1955r0Mo9817e = interfaceC1921a0.mo9817e();
        if (c1955r0Mo9817e != null) {
            return c1955r0Mo9817e;
        }
        if (interfaceC1921a0 instanceof C1909O) {
            return new C1955r0();
        }
        if (interfaceC1921a0 instanceof AbstractC1943l0) {
            m9952n0((AbstractC1943l0) interfaceC1921a0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1921a0).toString());
    }

    /* JADX INFO: renamed from: c0 */
    private final Object m9943c0(Object obj) throws Throwable {
        Throwable thM9935J = null;
        while (true) {
            Object objM9966T = m9966T();
            if (objM9966T instanceof b) {
                synchronized (objM9966T) {
                    if (((b) objM9966T).m9992l()) {
                        return AbstractC1947n0.f9465d;
                    }
                    boolean zM9990j = ((b) objM9966T).m9990j();
                    if (obj != null || !zM9990j) {
                        if (thM9935J == null) {
                            thM9935J = m9935J(obj);
                        }
                        ((b) objM9966T).m9988b(thM9935J);
                    }
                    Throwable thM9989f = zM9990j ? null : ((b) objM9966T).m9989f();
                    if (thM9989f != null) {
                        m9946h0(((b) objM9966T).mo9817e(), thM9989f);
                    }
                    return AbstractC1947n0.f9462a;
                }
            }
            if (!(objM9966T instanceof InterfaceC1921a0)) {
                return AbstractC1947n0.f9465d;
            }
            if (thM9935J == null) {
                thM9935J = m9935J(obj);
            }
            InterfaceC1921a0 interfaceC1921a0 = (InterfaceC1921a0) objM9966T;
            if (!interfaceC1921a0.mo9816a()) {
                Object objM9959x0 = m9959x0(objM9966T, new C1954r(thM9935J, false, 2, null));
                if (objM9959x0 == AbstractC1947n0.f9462a) {
                    throw new IllegalStateException(("Cannot happen in " + objM9966T).toString());
                }
                if (objM9959x0 != AbstractC1947n0.f9464c) {
                    return objM9959x0;
                }
            } else if (m9958w0(interfaceC1921a0, thM9935J)) {
                return AbstractC1947n0.f9462a;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private final AbstractC1943l0 m9944e0(InterfaceC1925c0 interfaceC1925c0, boolean z2) {
        AbstractC1943l0 c1929e0;
        if (z2) {
            c1929e0 = interfaceC1925c0 instanceof AbstractC1935h0 ? (AbstractC1935h0) interfaceC1925c0 : null;
            if (c1929e0 == null) {
                c1929e0 = new C1927d0(interfaceC1925c0);
            }
        } else {
            c1929e0 = interfaceC1925c0 instanceof AbstractC1943l0 ? (AbstractC1943l0) interfaceC1925c0 : null;
            if (c1929e0 == null) {
                c1929e0 = new C1929e0(interfaceC1925c0);
            }
        }
        c1929e0.m9929x(this);
        return c1929e0;
    }

    /* JADX INFO: renamed from: g0 */
    private final C1946n m9945g0(C2007n c2007n) {
        while (c2007n.mo10139r()) {
            c2007n = c2007n.m10153n();
        }
        while (true) {
            c2007n = c2007n.m10152m();
            if (!c2007n.mo10139r()) {
                if (c2007n instanceof C1946n) {
                    return (C1946n) c2007n;
                }
                if (c2007n instanceof C1955r0) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    private final void m9946h0(C1955r0 c1955r0, Throwable th) throws Throwable {
        m9973j0(th);
        Object objM10151l = c1955r0.m10151l();
        AbstractC0606k.m2143c(objM10151l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C1958t c1958t = null;
        for (C2007n c2007nM10152m = (C2007n) objM10151l; !AbstractC0606k.m2141a(c2007nM10152m, c1955r0); c2007nM10152m = c2007nM10152m.m10152m()) {
            if (c2007nM10152m instanceof AbstractC1935h0) {
                AbstractC1943l0 abstractC1943l0 = (AbstractC1943l0) c2007nM10152m;
                try {
                    abstractC1943l0.mo9857d(th);
                } catch (Throwable th2) {
                    if (c1958t != null) {
                        AbstractC0369a.m1360a(c1958t, th2);
                    } else {
                        c1958t = new C1958t("Exception in completion handler " + abstractC1943l0 + " for " + this, th2);
                        C0388t c0388t = C0388t.f1507a;
                    }
                }
            }
        }
        if (c1958t != null) {
            mo9852X(c1958t);
        }
        m9932E(th);
    }

    /* JADX INFO: renamed from: i0 */
    private final void m9947i0(C1955r0 c1955r0, Throwable th) throws Throwable {
        Object objM10151l = c1955r0.m10151l();
        AbstractC0606k.m2143c(objM10151l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C1958t c1958t = null;
        for (C2007n c2007nM10152m = (C2007n) objM10151l; !AbstractC0606k.m2141a(c2007nM10152m, c1955r0); c2007nM10152m = c2007nM10152m.m10152m()) {
            if (c2007nM10152m instanceof AbstractC1943l0) {
                AbstractC1943l0 abstractC1943l0 = (AbstractC1943l0) c2007nM10152m;
                try {
                    abstractC1943l0.mo9857d(th);
                } catch (Throwable th2) {
                    if (c1958t != null) {
                        AbstractC0369a.m1360a(c1958t, th2);
                    } else {
                        c1958t = new C1958t("Exception in completion handler " + abstractC1943l0 + " for " + this, th2);
                        C0388t c0388t = C0388t.f1507a;
                    }
                }
            }
        }
        if (c1958t != null) {
            mo9852X(c1958t);
        }
    }

    /* JADX INFO: renamed from: m0 */
    private final void m9950m0(C1909O c1909o) {
        C1955r0 c1955r0 = new C1955r0();
        Object c1919z = c1955r0;
        if (!c1909o.mo9816a()) {
            c1919z = new C1919Z(c1955r0);
        }
        AbstractC0933b.m3989a(f9449d, this, c1909o, c1919z);
    }

    /* JADX INFO: renamed from: n */
    private final boolean m9951n(Object obj, C1955r0 c1955r0, AbstractC1943l0 abstractC1943l0) {
        int iM10156v;
        c cVar = new c(abstractC1943l0, this, obj);
        do {
            iM10156v = c1955r0.m10153n().m10156v(abstractC1943l0, c1955r0, cVar);
            if (iM10156v == 1) {
                return true;
            }
        } while (iM10156v != 2);
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    private final void m9952n0(AbstractC1943l0 abstractC1943l0) {
        abstractC1943l0.m10150h(new C1955r0());
        AbstractC0933b.m3989a(f9449d, this, abstractC1943l0, abstractC1943l0.m10152m());
    }

    /* JADX INFO: renamed from: o */
    private final void m9953o(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC0369a.m1360a(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final int m9954q0(Object obj) {
        if (obj instanceof C1909O) {
            if (((C1909O) obj).mo9816a()) {
                return 0;
            }
            if (!AbstractC0933b.m3989a(f9449d, this, obj, AbstractC1947n0.f9468g)) {
                return -1;
            }
            mo9974l0();
            return 1;
        }
        if (!(obj instanceof C1919Z)) {
            return 0;
        }
        if (!AbstractC0933b.m3989a(f9449d, this, obj, ((C1919Z) obj).mo9817e())) {
            return -1;
        }
        mo9974l0();
        return 1;
    }

    /* JADX INFO: renamed from: r0 */
    private final String m9955r0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof InterfaceC1921a0 ? ((InterfaceC1921a0) obj).mo9816a() ? "Active" : "New" : obj instanceof C1954r ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.m9990j() ? "Cancelling" : bVar.m9991k() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ CancellationException m9956t0(C1945m0 c1945m0, Throwable th, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i3 & 1) != 0) {
            str = null;
        }
        return c1945m0.m9978s0(th, str);
    }

    /* JADX INFO: renamed from: v0 */
    private final boolean m9957v0(InterfaceC1921a0 interfaceC1921a0, Object obj) throws Throwable {
        if (!AbstractC0933b.m3989a(f9449d, this, interfaceC1921a0, AbstractC1947n0.m10004g(obj))) {
            return false;
        }
        m9973j0(null);
        mo9855k0(obj);
        m9933H(interfaceC1921a0, obj);
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    private final boolean m9958w0(InterfaceC1921a0 interfaceC1921a0, Throwable th) throws Throwable {
        C1955r0 c1955r0M9940R = m9940R(interfaceC1921a0);
        if (c1955r0M9940R == null) {
            return false;
        }
        if (!AbstractC0933b.m3989a(f9449d, this, interfaceC1921a0, new b(c1955r0M9940R, false, th))) {
            return false;
        }
        m9946h0(c1955r0M9940R, th);
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    private final Object m9959x0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC1921a0) ? AbstractC1947n0.f9462a : ((!(obj instanceof C1909O) && !(obj instanceof AbstractC1943l0)) || (obj instanceof C1946n) || (obj2 instanceof C1954r)) ? m9960y0((InterfaceC1921a0) obj, obj2) : m9957v0((InterfaceC1921a0) obj, obj2) ? obj2 : AbstractC1947n0.f9464c;
    }

    /* JADX INFO: renamed from: y0 */
    private final Object m9960y0(InterfaceC1921a0 interfaceC1921a0, Object obj) throws Throwable {
        C1955r0 c1955r0M9940R = m9940R(interfaceC1921a0);
        if (c1955r0M9940R == null) {
            return AbstractC1947n0.f9464c;
        }
        b bVar = interfaceC1921a0 instanceof b ? (b) interfaceC1921a0 : null;
        if (bVar == null) {
            bVar = new b(c1955r0M9940R, false, null);
        }
        C0613r c0613r = new C0613r();
        synchronized (bVar) {
            if (bVar.m9991k()) {
                return AbstractC1947n0.f9462a;
            }
            bVar.m9994n(true);
            if (bVar != interfaceC1921a0 && !AbstractC0933b.m3989a(f9449d, this, interfaceC1921a0, bVar)) {
                return AbstractC1947n0.f9464c;
            }
            boolean zM9990j = bVar.m9990j();
            C1954r c1954r = obj instanceof C1954r ? (C1954r) obj : null;
            if (c1954r != null) {
                bVar.m9988b(c1954r.f9476a);
            }
            Throwable thM9989f = zM9990j ? null : bVar.m9989f();
            c0613r.f2012d = thM9989f;
            C0388t c0388t = C0388t.f1507a;
            if (thM9989f != null) {
                m9946h0(c1955r0M9940R, thM9989f);
            }
            C1946n c1946nM9937L = m9937L(interfaceC1921a0);
            return (c1946nM9937L == null || !m9961z0(bVar, c1946nM9937L, obj)) ? m9936K(bVar, obj) : AbstractC1947n0.f9463b;
        }
    }

    /* JADX INFO: renamed from: z0 */
    private final boolean m9961z0(b bVar, C1946n c1946n, Object obj) {
        while (AbstractC1941k0.m9926h(c1946n.f9461e, false, false, new a(this, bVar, c1946n, obj), 1, null) == C1957s0.f9479a) {
            c1946n = m9945g0(c1946n);
            if (c1946n == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p102f2.InterfaceC1931f0
    /* JADX INFO: renamed from: A */
    public void mo9864A(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new C1933g0(mo9851F(), null, this);
        }
        m9962B(cancellationException);
    }

    /* JADX INFO: renamed from: B */
    public void m9962B(Throwable th) throws Throwable {
        m9981z(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: F */
    public String mo9851F() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: G */
    public boolean m9963G(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m9981z(th) && mo9880P();
    }

    /* JADX INFO: renamed from: M */
    public final Object m9964M() throws Throwable {
        Object objM9966T = m9966T();
        if (objM9966T instanceof InterfaceC1921a0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objM9966T instanceof C1954r) {
            throw ((C1954r) objM9966T).f9476a;
        }
        return AbstractC1947n0.m10005h(objM9966T);
    }

    /* JADX INFO: renamed from: P */
    public boolean mo9880P() {
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public boolean mo9881Q() {
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final InterfaceC1944m m9965S() {
        return (InterfaceC1944m) f9450e.get(this);
    }

    /* JADX INFO: renamed from: T */
    public final Object m9966T() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9449d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2014u)) {
                return obj;
            }
            ((AbstractC2014u) obj).mo10117a(this);
        }
    }

    /* JADX INFO: renamed from: W */
    protected boolean mo9967W(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: Y */
    protected final void m9968Y(InterfaceC1931f0 interfaceC1931f0) {
        if (interfaceC1931f0 == null) {
            m9976p0(C1957s0.f9479a);
            return;
        }
        interfaceC1931f0.start();
        InterfaceC1944m interfaceC1944mMo9866h = interfaceC1931f0.mo9866h(this);
        m9976p0(interfaceC1944mMo9866h);
        if (m9970a0()) {
            interfaceC1944mMo9866h.mo9815b();
            m9976p0(C1957s0.f9479a);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1908N m9969Z(boolean z2, boolean z3, InterfaceC1925c0 interfaceC1925c0) {
        AbstractC1943l0 abstractC1943l0M9944e0 = m9944e0(interfaceC1925c0, z2);
        while (true) {
            Object objM9966T = m9966T();
            if (objM9966T instanceof C1909O) {
                C1909O c1909o = (C1909O) objM9966T;
                if (!c1909o.mo9816a()) {
                    m9950m0(c1909o);
                } else if (AbstractC0933b.m3989a(f9449d, this, objM9966T, abstractC1943l0M9944e0)) {
                    break;
                }
            } else {
                if (!(objM9966T instanceof InterfaceC1921a0)) {
                    if (z3) {
                        C1954r c1954r = objM9966T instanceof C1954r ? (C1954r) objM9966T : null;
                        interfaceC1925c0.mo9857d(c1954r != null ? c1954r.f9476a : null);
                    }
                    return C1957s0.f9479a;
                }
                C1955r0 c1955r0Mo9817e = ((InterfaceC1921a0) objM9966T).mo9817e();
                if (c1955r0Mo9817e == null) {
                    AbstractC0606k.m2143c(objM9966T, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m9952n0((AbstractC1943l0) objM9966T);
                } else {
                    InterfaceC1908N interfaceC1908N = C1957s0.f9479a;
                    if (z2 && (objM9966T instanceof b)) {
                        synchronized (objM9966T) {
                            try {
                                thM9989f = ((b) objM9966T).m9989f();
                                if (thM9989f == null || ((interfaceC1925c0 instanceof C1946n) && !((b) objM9966T).m9991k())) {
                                    if (m9951n(objM9966T, c1955r0Mo9817e, abstractC1943l0M9944e0)) {
                                        if (thM9989f == null) {
                                            return abstractC1943l0M9944e0;
                                        }
                                        interfaceC1908N = abstractC1943l0M9944e0;
                                    }
                                }
                                C0388t c0388t = C0388t.f1507a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thM9989f != null) {
                        if (z3) {
                            interfaceC1925c0.mo9857d(thM9989f);
                        }
                        return interfaceC1908N;
                    }
                    if (m9951n(objM9966T, c1955r0Mo9817e, abstractC1943l0M9944e0)) {
                        break;
                    }
                }
            }
        }
        return abstractC1943l0M9944e0;
    }

    @Override // p102f2.InterfaceC1931f0
    /* JADX INFO: renamed from: a */
    public boolean mo9853a() {
        Object objM9966T = m9966T();
        return (objM9966T instanceof InterfaceC1921a0) && ((InterfaceC1921a0) objM9966T).mo9816a();
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m9970a0() {
        return !(m9966T() instanceof InterfaceC1921a0);
    }

    @Override // p041N1.InterfaceC0446i.b, p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: b */
    public InterfaceC0446i.b mo1603b(InterfaceC0446i.c cVar) {
        return InterfaceC1931f0.a.m9871c(this, cVar);
    }

    /* JADX INFO: renamed from: b0 */
    protected boolean mo9971b0() {
        return false;
    }

    @Override // p102f2.InterfaceC1931f0
    /* JADX INFO: renamed from: d */
    public final InterfaceC1908N mo9865d(boolean z2, boolean z3, InterfaceC0577l interfaceC0577l) {
        return m9969Z(z2, z3, new InterfaceC1925c0.a(interfaceC0577l));
    }

    /* JADX INFO: renamed from: d0 */
    public final Object m9972d0(Object obj) {
        Object objM9959x0;
        do {
            objM9959x0 = m9959x0(m9966T(), obj);
            if (objM9959x0 == AbstractC1947n0.f9462a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m9938N(obj));
            }
        } while (objM9959x0 == AbstractC1947n0.f9464c);
        return objM9959x0;
    }

    /* JADX INFO: renamed from: f0 */
    public String mo9854f0() {
        return AbstractC1898D.m9781a(this);
    }

    @Override // p041N1.InterfaceC0446i.b
    public final InterfaceC0446i.c getKey() {
        return InterfaceC1931f0.f9437c;
    }

    @Override // p102f2.InterfaceC1931f0
    /* JADX INFO: renamed from: h */
    public final InterfaceC1944m mo9866h(InterfaceC1948o interfaceC1948o) {
        InterfaceC1908N interfaceC1908NM9926h = AbstractC1941k0.m9926h(this, true, false, new C1946n(interfaceC1948o), 2, null);
        AbstractC0606k.m2143c(interfaceC1908NM9926h, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC1944m) interfaceC1908NM9926h;
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: i */
    public Object mo1604i(Object obj, InterfaceC0581p interfaceC0581p) {
        return InterfaceC1931f0.a.m9870b(this, obj, interfaceC0581p);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m9975o0(AbstractC1943l0 abstractC1943l0) {
        Object objM9966T;
        do {
            objM9966T = m9966T();
            if (!(objM9966T instanceof AbstractC1943l0)) {
                if (!(objM9966T instanceof InterfaceC1921a0) || ((InterfaceC1921a0) objM9966T).mo9817e() == null) {
                    return;
                }
                abstractC1943l0.m10154s();
                return;
            }
            if (objM9966T != abstractC1943l0) {
                return;
            }
        } while (!AbstractC0933b.m3989a(f9449d, this, objM9966T, AbstractC1947n0.f9468g));
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: p */
    public InterfaceC0446i mo1605p(InterfaceC0446i interfaceC0446i) {
        return InterfaceC1931f0.a.m9873e(this, interfaceC0446i);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m9976p0(InterfaceC1944m interfaceC1944m) {
        f9450e.set(this, interfaceC1944m);
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: r */
    public InterfaceC0446i mo1606r(InterfaceC0446i.c cVar) {
        return InterfaceC1931f0.a.m9872d(this, cVar);
    }

    @Override // p102f2.InterfaceC1961u0
    /* JADX INFO: renamed from: s */
    public CancellationException mo9977s() {
        Throwable thM9989f;
        Object objM9966T = m9966T();
        if (objM9966T instanceof b) {
            thM9989f = ((b) objM9966T).m9989f();
        } else if (objM9966T instanceof C1954r) {
            thM9989f = ((C1954r) objM9966T).f9476a;
        } else {
            if (objM9966T instanceof InterfaceC1921a0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM9966T).toString());
            }
            thM9989f = null;
        }
        CancellationException cancellationException = thM9989f instanceof CancellationException ? (CancellationException) thM9989f : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C1933g0("Parent job is " + m9955r0(objM9966T), thM9989f, this);
    }

    /* JADX INFO: renamed from: s0 */
    protected final CancellationException m9978s0(Throwable th, String str) {
        CancellationException c1933g0 = th instanceof CancellationException ? (CancellationException) th : null;
        if (c1933g0 == null) {
            if (str == null) {
                str = mo9851F();
            }
            c1933g0 = new C1933g0(str, th, this);
        }
        return c1933g0;
    }

    @Override // p102f2.InterfaceC1931f0
    public final boolean start() {
        int iM9954q0;
        do {
            iM9954q0 = m9954q0(m9966T());
            if (iM9954q0 == 0) {
                return false;
            }
        } while (iM9954q0 != 1);
        return true;
    }

    public String toString() {
        return m9979u0() + '@' + AbstractC1898D.m9782b(this);
    }

    @Override // p102f2.InterfaceC1931f0
    /* JADX INFO: renamed from: u */
    public final InterfaceC1908N mo9867u(InterfaceC0577l interfaceC0577l) {
        return m9969Z(false, true, new InterfaceC1925c0.a(interfaceC0577l));
    }

    /* JADX INFO: renamed from: u0 */
    public final String m9979u0() {
        return mo9854f0() + '{' + m9955r0(m9966T()) + '}';
    }

    @Override // p102f2.InterfaceC1931f0
    /* JADX INFO: renamed from: v */
    public final CancellationException mo9868v() {
        Object objM9966T = m9966T();
        if (!(objM9966T instanceof b)) {
            if (objM9966T instanceof InterfaceC1921a0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objM9966T instanceof C1954r) {
                return m9956t0(this, ((C1954r) objM9966T).f9476a, null, 1, null);
            }
            return new C1933g0(AbstractC1898D.m9781a(this) + " has completed normally", null, this);
        }
        Throwable thM9989f = ((b) objM9966T).m9989f();
        if (thM9989f != null) {
            CancellationException cancellationExceptionM9978s0 = m9978s0(thM9989f, AbstractC1898D.m9781a(this) + " is cancelling");
            if (cancellationExceptionM9978s0 != null) {
                return cancellationExceptionM9978s0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // p102f2.InterfaceC1948o
    /* JADX INFO: renamed from: y */
    public final void mo9980y(InterfaceC1961u0 interfaceC1961u0) throws Throwable {
        m9981z(interfaceC1961u0);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m9981z(Object obj) throws Throwable {
        Object objM9943c0 = AbstractC1947n0.f9462a;
        if (mo9881Q() && (objM9943c0 = m9931D(obj)) == AbstractC1947n0.f9463b) {
            return true;
        }
        if (objM9943c0 == AbstractC1947n0.f9462a) {
            objM9943c0 = m9943c0(obj);
        }
        if (objM9943c0 == AbstractC1947n0.f9462a || objM9943c0 == AbstractC1947n0.f9463b) {
            return true;
        }
        if (objM9943c0 == AbstractC1947n0.f9465d) {
            return false;
        }
        mo9800t(objM9943c0);
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    protected void mo9974l0() {
    }

    /* JADX INFO: renamed from: X */
    public void mo9852X(Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: j0 */
    protected void m9973j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    protected void mo9855k0(Object obj) {
    }

    /* JADX INFO: renamed from: t */
    protected void mo9800t(Object obj) {
    }
}
