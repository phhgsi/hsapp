package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import p041N1.InterfaceC0446i;
import p071X1.AbstractC0606k;
import p102f2.AbstractC1941k0;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC1127i implements InterfaceC1130l {

    /* JADX INFO: renamed from: d */
    private final AbstractC1126h f5289d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0446i f5290e;

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(interfaceC1132n, "source");
        AbstractC0606k.m2145e(aVar, "event");
        if (m5097i().mo5133b().compareTo(AbstractC1126h.b.DESTROYED) <= 0) {
            m5097i().mo5134c(this);
            AbstractC1941k0.m9922d(mo5096f(), null, 1, null);
        }
    }

    @Override // p102f2.InterfaceC1970z
    /* JADX INFO: renamed from: f */
    public InterfaceC0446i mo5096f() {
        return this.f5290e;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC1126h m5097i() {
        return this.f5289d;
    }
}
