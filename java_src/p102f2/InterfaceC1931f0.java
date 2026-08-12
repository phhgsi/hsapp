package p102f2;

import java.util.concurrent.CancellationException;
import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0577l;
import p068W1.InterfaceC0581p;

/* JADX INFO: renamed from: f2.f0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1931f0 extends InterfaceC0446i.b {

    /* JADX INFO: renamed from: c */
    public static final b f9437c = b.f9438d;

    /* JADX INFO: renamed from: f2.f0$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m9869a(InterfaceC1931f0 interfaceC1931f0, CancellationException cancellationException, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i3 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC1931f0.mo9864A(cancellationException);
        }

        /* JADX INFO: renamed from: b */
        public static Object m9870b(InterfaceC1931f0 interfaceC1931f0, Object obj, InterfaceC0581p interfaceC0581p) {
            return InterfaceC0446i.b.a.m1625a(interfaceC1931f0, obj, interfaceC0581p);
        }

        /* JADX INFO: renamed from: c */
        public static InterfaceC0446i.b m9871c(InterfaceC1931f0 interfaceC1931f0, InterfaceC0446i.c cVar) {
            return InterfaceC0446i.b.a.m1626b(interfaceC1931f0, cVar);
        }

        /* JADX INFO: renamed from: d */
        public static InterfaceC0446i m9872d(InterfaceC1931f0 interfaceC1931f0, InterfaceC0446i.c cVar) {
            return InterfaceC0446i.b.a.m1627c(interfaceC1931f0, cVar);
        }

        /* JADX INFO: renamed from: e */
        public static InterfaceC0446i m9873e(InterfaceC1931f0 interfaceC1931f0, InterfaceC0446i interfaceC0446i) {
            return InterfaceC0446i.b.a.m1628d(interfaceC1931f0, interfaceC0446i);
        }
    }

    /* JADX INFO: renamed from: f2.f0$b */
    public static final class b implements InterfaceC0446i.c {

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ b f9438d = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: A */
    void mo9864A(CancellationException cancellationException);

    /* JADX INFO: renamed from: a */
    boolean mo9853a();

    /* JADX INFO: renamed from: d */
    InterfaceC1908N mo9865d(boolean z2, boolean z3, InterfaceC0577l interfaceC0577l);

    /* JADX INFO: renamed from: h */
    InterfaceC1944m mo9866h(InterfaceC1948o interfaceC1948o);

    boolean start();

    /* JADX INFO: renamed from: u */
    InterfaceC1908N mo9867u(InterfaceC0577l interfaceC0577l);

    /* JADX INFO: renamed from: v */
    CancellationException mo9868v();
}
