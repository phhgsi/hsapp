package p102f2;

import java.util.concurrent.CancellationException;
import p035L1.C0388t;
import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0605j;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: f2.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1941k0 {

    /* JADX INFO: renamed from: f2.k0$a */
    /* synthetic */ class a extends AbstractC0605j implements InterfaceC0577l {
        a(Object obj) {
            super(1, obj, InterfaceC1925c0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // p068W1.InterfaceC0577l
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ Object mo1406f(Object obj) {
            m9927k((Throwable) obj);
            return C0388t.f1507a;
        }

        /* JADX INFO: renamed from: k */
        public final void m9927k(Throwable th) {
            ((InterfaceC1925c0) this.f1995e).mo9857d(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1950p m9919a(InterfaceC1931f0 interfaceC1931f0) {
        return new C1937i0(interfaceC1931f0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC1950p m9920b(InterfaceC1931f0 interfaceC1931f0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            interfaceC1931f0 = null;
        }
        return AbstractC1939j0.m9909a(interfaceC1931f0);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9921c(InterfaceC0446i interfaceC0446i, CancellationException cancellationException) {
        InterfaceC1931f0 interfaceC1931f0 = (InterfaceC1931f0) interfaceC0446i.mo1603b(InterfaceC1931f0.f9437c);
        if (interfaceC1931f0 != null) {
            interfaceC1931f0.mo9864A(cancellationException);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9922d(InterfaceC0446i interfaceC0446i, CancellationException cancellationException, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC1939j0.m9911c(interfaceC0446i, cancellationException);
    }

    /* JADX INFO: renamed from: e */
    public static final void m9923e(InterfaceC0446i interfaceC0446i) {
        InterfaceC1931f0 interfaceC1931f0 = (InterfaceC1931f0) interfaceC0446i.mo1603b(InterfaceC1931f0.f9437c);
        if (interfaceC1931f0 != null) {
            AbstractC1939j0.m9914f(interfaceC1931f0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9924f(InterfaceC1931f0 interfaceC1931f0) {
        if (!interfaceC1931f0.mo9853a()) {
            throw interfaceC1931f0.mo9868v();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1908N m9925g(InterfaceC1931f0 interfaceC1931f0, boolean z2, boolean z3, InterfaceC1925c0 interfaceC1925c0) {
        return interfaceC1931f0 instanceof C1945m0 ? ((C1945m0) interfaceC1931f0).m9969Z(z2, z3, interfaceC1925c0) : interfaceC1931f0.mo9865d(z2, z3, new a(interfaceC1925c0));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ InterfaceC1908N m9926h(InterfaceC1931f0 interfaceC1931f0, boolean z2, boolean z3, InterfaceC1925c0 interfaceC1925c0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            z3 = true;
        }
        return AbstractC1939j0.m9915g(interfaceC1931f0, z2, z3, interfaceC1925c0);
    }
}
