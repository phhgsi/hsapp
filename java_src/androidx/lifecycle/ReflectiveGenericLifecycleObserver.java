package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.C1120b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC1130l {

    /* JADX INFO: renamed from: d */
    private final Object f5310d;

    /* JADX INFO: renamed from: e */
    private final C1120b.a f5311e;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f5310d = obj;
        this.f5311e = C1120b.f5333c.m5122c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        this.f5311e.m5125a(interfaceC1132n, aVar, this.f5310d);
    }
}
