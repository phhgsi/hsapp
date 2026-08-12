package p084b0;

import androidx.concurrent.futures.AbstractC0934c;
import java.util.concurrent.CancellationException;
import p035L1.C0388t;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;
import p102f2.InterfaceC1901G;
import p125l1.InterfaceFutureC2137d;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1299b {

    /* JADX INFO: renamed from: b0.b$a */
    static final class a extends AbstractC0607l implements InterfaceC0577l {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ AbstractC0934c.a f6359e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC1901G f6360f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC0934c.a aVar, InterfaceC1901G interfaceC1901G) {
            super(1);
            this.f6359e = aVar;
            this.f6360f = interfaceC1901G;
        }

        /* JADX INFO: renamed from: c */
        public final void m6615c(Throwable th) {
            if (th == null) {
                this.f6359e.m3993b(this.f6360f.mo9794g());
            } else if (th instanceof CancellationException) {
                this.f6359e.m3994c();
            } else {
                this.f6359e.m3995e(th);
            }
        }

        @Override // p068W1.InterfaceC0577l
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ Object mo1406f(Object obj) {
            m6615c((Throwable) obj);
            return C0388t.f1507a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceFutureC2137d m6612b(final InterfaceC1901G interfaceC1901G, final Object obj) {
        AbstractC0606k.m2145e(interfaceC1901G, "<this>");
        InterfaceFutureC2137d interfaceFutureC2137dM3990a = AbstractC0934c.m3990a(new AbstractC0934c.c() { // from class: b0.a
            @Override // androidx.concurrent.futures.AbstractC0934c.c
            /* JADX INFO: renamed from: a */
            public final Object mo3996a(AbstractC0934c.a aVar) {
                return AbstractC1299b.m6614d(interfaceC1901G, obj, aVar);
            }
        });
        AbstractC0606k.m2144d(interfaceFutureC2137dM3990a, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return interfaceFutureC2137dM3990a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceFutureC2137d m6613c(InterfaceC1901G interfaceC1901G, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return m6612b(interfaceC1901G, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Object m6614d(InterfaceC1901G interfaceC1901G, Object obj, AbstractC0934c.a aVar) {
        AbstractC0606k.m2145e(interfaceC1901G, "$this_asListenableFuture");
        AbstractC0606k.m2145e(aVar, "completer");
        interfaceC1901G.mo9867u(new a(aVar, interfaceC1901G));
        return obj;
    }
}
