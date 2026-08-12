package p041N1;

import androidx.activity.AbstractC0679G;
import p041N1.InterfaceC0446i;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: N1.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0443f extends InterfaceC0446i.b {

    /* JADX INFO: renamed from: a */
    public static final b f1591a = b.f1592d;

    /* JADX INFO: renamed from: N1.f$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static InterfaceC0446i.b m1619a(InterfaceC0443f interfaceC0443f, InterfaceC0446i.c cVar) {
            AbstractC0606k.m2145e(cVar, "key");
            if (!(cVar instanceof AbstractC0439b)) {
                if (InterfaceC0443f.f1591a != cVar) {
                    return null;
                }
                AbstractC0606k.m2143c(interfaceC0443f, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC0443f;
            }
            AbstractC0439b abstractC0439b = (AbstractC0439b) cVar;
            if (abstractC0439b.m1607a(interfaceC0443f.getKey())) {
                InterfaceC0446i.b bVarM1608b = abstractC0439b.m1608b(interfaceC0443f);
                if (AbstractC0679G.m2574a(bVarM1608b)) {
                    return bVarM1608b;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC0446i m1620b(InterfaceC0443f interfaceC0443f, InterfaceC0446i.c cVar) {
            AbstractC0606k.m2145e(cVar, "key");
            if (!(cVar instanceof AbstractC0439b)) {
                return InterfaceC0443f.f1591a == cVar ? C0447j.f1593d : interfaceC0443f;
            }
            AbstractC0439b abstractC0439b = (AbstractC0439b) cVar;
            return (!abstractC0439b.m1607a(interfaceC0443f.getKey()) || abstractC0439b.m1608b(interfaceC0443f) == null) ? interfaceC0443f : C0447j.f1593d;
        }
    }

    /* JADX INFO: renamed from: N1.f$b */
    public static final class b implements InterfaceC0446i.c {

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ b f1592d = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: l */
    InterfaceC0442e mo1617l(InterfaceC0442e interfaceC0442e);

    /* JADX INFO: renamed from: q */
    void mo1618q(InterfaceC0442e interfaceC0442e);
}
