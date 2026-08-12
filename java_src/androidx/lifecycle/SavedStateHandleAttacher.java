package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import p071X1.AbstractC0606k;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1130l {

    /* JADX INFO: renamed from: d */
    private final C1100B f5325d;

    public SavedStateHandleAttacher(C1100B c1100b) {
        AbstractC0606k.m2145e(c1100b, "provider");
        this.f5325d = c1100b;
    }

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(interfaceC1132n, "source");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar == AbstractC1126h.a.ON_CREATE) {
            interfaceC1132n.getLifecycle().mo5134c(this);
            this.f5325d.m5062d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
