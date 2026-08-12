package p110h2;

import androidx.concurrent.futures.AbstractC0933b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p035L1.C0388t;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p047P1.InterfaceC0473d;
import p071X1.AbstractC0606k;
import p102f2.AbstractC1898D;
import p102f2.AbstractC1905K;
import p102f2.AbstractC1910P;
import p102f2.AbstractC1960u;
import p102f2.AbstractC1964w;
import p102f2.C1938j;
import p102f2.C1956s;
import p102f2.C1967x0;
import p102f2.InterfaceC1936i;

/* JADX INFO: renamed from: h2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2001h extends AbstractC1905K implements InterfaceC0473d, InterfaceC0442e {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9571k = AtomicReferenceFieldUpdater.newUpdater(C2001h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: g */
    public final AbstractC1964w f9572g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0442e f9573h;

    /* JADX INFO: renamed from: i */
    public Object f9574i;

    /* JADX INFO: renamed from: j */
    public final Object f9575j;

    public C2001h(AbstractC1964w abstractC1964w, InterfaceC0442e interfaceC0442e) {
        super(-1);
        this.f9572g = abstractC1964w;
        this.f9573h = interfaceC0442e;
        this.f9574i = AbstractC2002i.f9576a;
        this.f9575j = AbstractC1989C.m10103b(mo1615c());
    }

    /* JADX INFO: renamed from: k */
    private final C1938j m10123k() {
        Object obj = f9571k.get(this);
        if (obj instanceof C1938j) {
            return (C1938j) obj;
        }
        return null;
    }

    @Override // p102f2.AbstractC1905K
    /* JADX INFO: renamed from: a */
    public void mo9801a(Object obj, Throwable th) {
        if (obj instanceof C1956s) {
            ((C1956s) obj).f9478b.mo1406f(th);
        }
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: c */
    public InterfaceC0446i mo1615c() {
        return this.f9573h.mo1615c();
    }

    @Override // p047P1.InterfaceC0473d
    /* JADX INFO: renamed from: e */
    public InterfaceC0473d mo1750e() {
        InterfaceC0442e interfaceC0442e = this.f9573h;
        if (interfaceC0442e instanceof InterfaceC0473d) {
            return (InterfaceC0473d) interfaceC0442e;
        }
        return null;
    }

    @Override // p102f2.AbstractC1905K
    /* JADX INFO: renamed from: h */
    public Object mo9806h() {
        Object obj = this.f9574i;
        this.f9574i = AbstractC2002i.f9576a;
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public final void m10125i() {
        while (f9571k.get(this) == AbstractC2002i.f9577b) {
        }
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: j */
    public void mo1616j(Object obj) {
        InterfaceC0446i interfaceC0446iMo1615c = this.f9573h.mo1615c();
        Object objM10018d = AbstractC1960u.m10018d(obj, null, 1, null);
        if (this.f9572g.mo10029E(interfaceC0446iMo1615c)) {
            this.f9574i = objM10018d;
            this.f9411f = 0;
            this.f9572g.mo9836D(interfaceC0446iMo1615c, this);
            return;
        }
        AbstractC1910P abstractC1910PM10035a = C1967x0.f9488a.m10035a();
        if (abstractC1910PM10035a.m9824M()) {
            this.f9574i = objM10018d;
            this.f9411f = 0;
            abstractC1910PM10035a.m9821I(this);
            return;
        }
        abstractC1910PM10035a.m9823K(true);
        try {
            InterfaceC0446i interfaceC0446iMo1615c2 = mo1615c();
            Object objM10104c = AbstractC1989C.m10104c(interfaceC0446iMo1615c2, this.f9575j);
            try {
                this.f9573h.mo1616j(obj);
                C0388t c0388t = C0388t.f1507a;
                while (abstractC1910PM10035a.m9826O()) {
                }
            } finally {
                AbstractC1989C.m10102a(interfaceC0446iMo1615c2, objM10104c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m10126m() {
        return f9571k.get(this) != null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m10127n(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9571k;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2018y c2018y = AbstractC2002i.f9577b;
            if (AbstractC0606k.m2141a(obj, c2018y)) {
                if (AbstractC0933b.m3989a(f9571k, this, c2018y, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC0933b.m3989a(f9571k, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m10128o() {
        m10125i();
        C1938j c1938jM10123k = m10123k();
        if (c1938jM10123k != null) {
            c1938jM10123k.m9904n();
        }
    }

    /* JADX INFO: renamed from: p */
    public final Throwable m10129p(InterfaceC1936i interfaceC1936i) {
        C2018y c2018y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9571k;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c2018y = AbstractC2002i.f9577b;
            if (obj != c2018y) {
                if (obj instanceof Throwable) {
                    if (AbstractC0933b.m3989a(f9571k, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC0933b.m3989a(f9571k, this, c2018y, interfaceC1936i));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f9572g + ", " + AbstractC1898D.m9783c(this.f9573h) + ']';
    }

    @Override // p102f2.AbstractC1905K
    /* JADX INFO: renamed from: b */
    public InterfaceC0442e mo9802b() {
        return this;
    }
}
