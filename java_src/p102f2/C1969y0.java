package p102f2;

import androidx.appcompat.app.AbstractC0740E;
import p041N1.InterfaceC0446i;

/* JADX INFO: renamed from: f2.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1969y0 extends AbstractC1964w {

    /* JADX INFO: renamed from: f */
    public static final C1969y0 f9490f = new C1969y0();

    private C1969y0() {
    }

    @Override // p102f2.AbstractC1964w
    /* JADX INFO: renamed from: D */
    public void mo9836D(InterfaceC0446i interfaceC0446i, Runnable runnable) {
        AbstractC0740E.m2693a(interfaceC0446i.mo1603b(AbstractC1896B0.f9405e));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // p102f2.AbstractC1964w
    /* JADX INFO: renamed from: E */
    public boolean mo10029E(InterfaceC0446i interfaceC0446i) {
        return false;
    }

    @Override // p102f2.AbstractC1964w
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
