package p110h2;

import androidx.concurrent.futures.AbstractC0933b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0610o;
import p102f2.AbstractC1898D;

/* JADX INFO: renamed from: h2.n */
/* JADX INFO: loaded from: classes.dex */
public class C2007n {

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9587a = AtomicReferenceFieldUpdater.newUpdater(C2007n.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9588b = AtomicReferenceFieldUpdater.newUpdater(C2007n.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9589c = AtomicReferenceFieldUpdater.newUpdater(C2007n.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: h2.n$a */
    public static abstract class a extends AbstractC1995b {

        /* JADX INFO: renamed from: b */
        public final C2007n f9590b;

        /* JADX INFO: renamed from: c */
        public C2007n f9591c;

        public a(C2007n c2007n) {
            this.f9590b = c2007n;
        }

        @Override // p110h2.AbstractC1995b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo10118b(C2007n c2007n, Object obj) {
            boolean z2 = obj == null;
            C2007n c2007n2 = z2 ? this.f9590b : this.f9591c;
            if (c2007n2 != null && AbstractC0933b.m3989a(C2007n.m10146o(), c2007n, this, c2007n2) && z2) {
                C2007n c2007n3 = this.f9590b;
                C2007n c2007n4 = this.f9591c;
                AbstractC0606k.m2142b(c2007n4);
                c2007n3.m10145k(c2007n4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (androidx.concurrent.futures.AbstractC0933b.m3989a(p110h2.C2007n.f9587a, r3, r2, ((p110h2.C2015v) r4).f9604a) != false) goto L25;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final p110h2.C2007n m10143i(p110h2.AbstractC2014u r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m10147p()
            java.lang.Object r0 = r0.get(r7)
            h2.n r0 = (p110h2.C2007n) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m10146o()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L25
            if (r0 != r2) goto L1a
            goto L2e
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m10147p()
            boolean r0 = androidx.concurrent.futures.AbstractC0933b.m3989a(r1, r7, r0, r2)
            if (r0 != 0) goto L2e
            goto L0
        L25:
            boolean r5 = r7.mo10139r()
            if (r5 == 0) goto L2c
            return r1
        L2c:
            if (r4 != r8) goto L2f
        L2e:
            return r2
        L2f:
            boolean r5 = r4 instanceof p110h2.AbstractC2014u
            if (r5 == 0) goto L39
            h2.u r4 = (p110h2.AbstractC2014u) r4
            r4.mo10117a(r2)
            goto L0
        L39:
            boolean r5 = r4 instanceof p110h2.C2015v
            if (r5 == 0) goto L5b
            if (r3 == 0) goto L50
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m10146o()
            h2.v r4 = (p110h2.C2015v) r4
            h2.n r4 = r4.f9604a
            boolean r2 = androidx.concurrent.futures.AbstractC0933b.m3989a(r5, r3, r2, r4)
            if (r2 != 0) goto L4e
            goto L0
        L4e:
            r2 = r3
            goto Lc
        L50:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m10147p()
            java.lang.Object r2 = r4.get(r2)
            h2.n r2 = (p110h2.C2007n) r2
            goto Ld
        L5b:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            p071X1.AbstractC0606k.m2143c(r4, r3)
            r3 = r4
            h2.n r3 = (p110h2.C2007n) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: p110h2.C2007n.m10143i(h2.u):h2.n");
    }

    /* JADX INFO: renamed from: j */
    private final C2007n m10144j(C2007n c2007n) {
        while (c2007n.mo10139r()) {
            c2007n = (C2007n) f9588b.get(c2007n);
        }
        return c2007n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m10145k(C2007n c2007n) {
        C2007n c2007n2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9588b;
        do {
            c2007n2 = (C2007n) atomicReferenceFieldUpdater.get(c2007n);
            if (m10151l() != c2007n) {
                return;
            }
        } while (!AbstractC0933b.m3989a(f9588b, c2007n, c2007n2, this));
        if (mo10139r()) {
            c2007n.m10143i(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m10146o() {
        return f9587a;
    }

    /* JADX INFO: renamed from: u */
    private final C2015v m10149u() {
        C2015v c2015v = (C2015v) f9589c.get(this);
        if (c2015v != null) {
            return c2015v;
        }
        C2015v c2015v2 = new C2015v(this);
        f9589c.set(this, c2015v2);
        return c2015v2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10150h(C2007n c2007n) {
        f9588b.set(c2007n, this);
        f9587a.set(c2007n, this);
        while (m10151l() == this) {
            if (AbstractC0933b.m3989a(f9587a, this, this, c2007n)) {
                c2007n.m10145k(this);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final Object m10151l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9587a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2014u)) {
                return obj;
            }
            ((AbstractC2014u) obj).mo10117a(this);
        }
    }

    /* JADX INFO: renamed from: m */
    public final C2007n m10152m() {
        C2007n c2007n;
        Object objM10151l = m10151l();
        C2015v c2015v = objM10151l instanceof C2015v ? (C2015v) objM10151l : null;
        if (c2015v != null && (c2007n = c2015v.f9604a) != null) {
            return c2007n;
        }
        AbstractC0606k.m2143c(objM10151l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C2007n) objM10151l;
    }

    /* JADX INFO: renamed from: n */
    public final C2007n m10153n() {
        C2007n c2007nM10143i = m10143i(null);
        return c2007nM10143i == null ? m10144j((C2007n) f9588b.get(this)) : c2007nM10143i;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo10139r() {
        return m10151l() instanceof C2015v;
    }

    /* JADX INFO: renamed from: s */
    public boolean m10154s() {
        return m10155t() == null;
    }

    /* JADX INFO: renamed from: t */
    public final C2007n m10155t() {
        Object objM10151l;
        C2007n c2007n;
        do {
            objM10151l = m10151l();
            if (objM10151l instanceof C2015v) {
                return ((C2015v) objM10151l).f9604a;
            }
            if (objM10151l == this) {
                return (C2007n) objM10151l;
            }
            AbstractC0606k.m2143c(objM10151l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c2007n = (C2007n) objM10151l;
        } while (!AbstractC0933b.m3989a(f9587a, this, objM10151l, c2007n.m10149u()));
        c2007n.m10143i(null);
        return null;
    }

    public String toString() {
        return new AbstractC0610o(this) { // from class: h2.n.b
            @Override // p090c2.InterfaceC1318e
            public Object get() {
                return AbstractC1898D.m9781a(this.f1995e);
            }
        } + '@' + AbstractC1898D.m9782b(this);
    }

    /* JADX INFO: renamed from: v */
    public final int m10156v(C2007n c2007n, C2007n c2007n2, a aVar) {
        f9588b.set(c2007n, this);
        f9587a.set(c2007n, c2007n2);
        aVar.f9591c = c2007n2;
        if (AbstractC0933b.m3989a(f9587a, this, c2007n2, aVar)) {
            return aVar.mo10117a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
