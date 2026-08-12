package p118j2;

import p041N1.InterfaceC0446i;
import p102f2.AbstractC1916W;

/* JADX INFO: renamed from: j2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2098f extends AbstractC1916W {

    /* JADX INFO: renamed from: g */
    private final int f9809g;

    /* JADX INFO: renamed from: h */
    private final int f9810h;

    /* JADX INFO: renamed from: i */
    private final long f9811i;

    /* JADX INFO: renamed from: j */
    private final String f9812j;

    /* JADX INFO: renamed from: k */
    private ExecutorC2093a f9813k = m10527G();

    public AbstractC2098f(int i3, int i4, long j3, String str) {
        this.f9809g = i3;
        this.f9810h = i4;
        this.f9811i = j3;
        this.f9812j = str;
    }

    /* JADX INFO: renamed from: G */
    private final ExecutorC2093a m10527G() {
        return new ExecutorC2093a(this.f9809g, this.f9810h, this.f9811i, this.f9812j);
    }

    @Override // p102f2.AbstractC1964w
    /* JADX INFO: renamed from: D */
    public void mo9836D(InterfaceC0446i interfaceC0446i, Runnable runnable) {
        ExecutorC2093a.m10489l(this.f9813k, runnable, null, false, 6, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m10528H(Runnable runnable, InterfaceC2101i interfaceC2101i, boolean z2) {
        this.f9813k.m10497i(runnable, interfaceC2101i, z2);
    }
}
