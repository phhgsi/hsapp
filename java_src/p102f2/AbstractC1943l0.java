package p102f2;

import p071X1.AbstractC0606k;
import p110h2.C2007n;

/* JADX INFO: renamed from: f2.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1943l0 extends C2007n implements InterfaceC1925c0, InterfaceC1908N, InterfaceC1921a0 {

    /* JADX INFO: renamed from: d */
    public C1945m0 f9448d;

    @Override // p102f2.InterfaceC1921a0
    /* JADX INFO: renamed from: a */
    public boolean mo9816a() {
        return true;
    }

    @Override // p102f2.InterfaceC1908N
    /* JADX INFO: renamed from: b */
    public void mo9815b() {
        m9928w().m9975o0(this);
    }

    @Override // p102f2.InterfaceC1921a0
    /* JADX INFO: renamed from: e */
    public C1955r0 mo9817e() {
        return null;
    }

    @Override // p110h2.C2007n
    public String toString() {
        return AbstractC1898D.m9781a(this) + '@' + AbstractC1898D.m9782b(this) + "[job@" + AbstractC1898D.m9782b(m9928w()) + ']';
    }

    /* JADX INFO: renamed from: w */
    public final C1945m0 m9928w() {
        C1945m0 c1945m0 = this.f9448d;
        if (c1945m0 != null) {
            return c1945m0;
        }
        AbstractC0606k.m2154n("job");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m9929x(C1945m0 c1945m0) {
        this.f9448d = c1945m0;
    }
}
