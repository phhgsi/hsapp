package p102f2;

import p110h2.AbstractC2012s;
import p110h2.AbstractC2019z;

/* JADX INFO: renamed from: f2.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1900F {

    /* JADX INFO: renamed from: a */
    private static final boolean f9408a = AbstractC2019z.m10195f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1903I f9409b = m9793b();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1903I m9792a() {
        return f9409b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private static final InterfaceC1903I m9793b() {
        if (!f9408a) {
            return RunnableC1899E.f9406l;
        }
        AbstractC1953q0 abstractC1953q0M9814c = C1907M.m9814c();
        return (AbstractC2012s.m10184c(abstractC1953q0M9814c) || !(abstractC1953q0M9814c instanceof InterfaceC1903I)) ? RunnableC1899E.f9406l : (InterfaceC1903I) abstractC1953q0M9814c;
    }
}
