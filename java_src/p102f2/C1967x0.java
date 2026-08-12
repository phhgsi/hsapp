package p102f2;

import p110h2.AbstractC1990D;
import p110h2.C2018y;

/* JADX INFO: renamed from: f2.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1967x0 {

    /* JADX INFO: renamed from: a */
    public static final C1967x0 f9488a = new C1967x0();

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f9489b = AbstractC1990D.m10108a(new C2018y("ThreadLocalEventLoop"));

    private C1967x0() {
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1910P m10035a() {
        ThreadLocal threadLocal = f9489b;
        AbstractC1910P abstractC1910P = (AbstractC1910P) threadLocal.get();
        if (abstractC1910P != null) {
            return abstractC1910P;
        }
        AbstractC1910P abstractC1910PM9841a = AbstractC1913T.m9841a();
        threadLocal.set(abstractC1910PM9841a);
        return abstractC1910PM9841a;
    }

    /* JADX INFO: renamed from: b */
    public final void m10036b() {
        f9489b.set(null);
    }

    /* JADX INFO: renamed from: c */
    public final void m10037c(AbstractC1910P abstractC1910P) {
        f9489b.set(abstractC1910P);
    }
}
