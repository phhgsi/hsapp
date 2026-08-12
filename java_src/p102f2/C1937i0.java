package p102f2;

/* JADX INFO: renamed from: f2.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C1937i0 extends C1945m0 implements InterfaceC1950p {

    /* JADX INFO: renamed from: f */
    private final boolean f9440f;

    public C1937i0(InterfaceC1931f0 interfaceC1931f0) {
        super(true);
        m9968Y(interfaceC1931f0);
        this.f9440f = m9879A0();
    }

    /* JADX INFO: renamed from: A0 */
    private final boolean m9879A0() {
        C1945m0 c1945m0M9928w;
        InterfaceC1944m interfaceC1944mM9965S = m9965S();
        C1946n c1946n = interfaceC1944mM9965S instanceof C1946n ? (C1946n) interfaceC1944mM9965S : null;
        if (c1946n != null && (c1945m0M9928w = c1946n.m9928w()) != null) {
            while (!c1945m0M9928w.mo9880P()) {
                InterfaceC1944m interfaceC1944mM9965S2 = c1945m0M9928w.m9965S();
                C1946n c1946n2 = interfaceC1944mM9965S2 instanceof C1946n ? (C1946n) interfaceC1944mM9965S2 : null;
                if (c1946n2 == null || (c1945m0M9928w = c1946n2.m9928w()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p102f2.C1945m0
    /* JADX INFO: renamed from: P */
    public boolean mo9880P() {
        return this.f9440f;
    }

    @Override // p102f2.C1945m0
    /* JADX INFO: renamed from: Q */
    public boolean mo9881Q() {
        return true;
    }
}
