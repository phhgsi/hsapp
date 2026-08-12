package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import androidx.savedstate.C1240a;
import p071X1.AbstractC0606k;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC1130l {

    /* JADX INFO: renamed from: d */
    private final String f5326d;

    /* JADX INFO: renamed from: e */
    private final C1144z f5327e;

    /* JADX INFO: renamed from: f */
    private boolean f5328f;

    public SavedStateHandleController(String str, C1144z c1144z) {
        AbstractC0606k.m2145e(str, "key");
        AbstractC0606k.m2145e(c1144z, "handle");
        this.f5326d = str;
        this.f5327e = c1144z;
    }

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(interfaceC1132n, "source");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar == AbstractC1126h.a.ON_DESTROY) {
            this.f5328f = false;
            interfaceC1132n.getLifecycle().mo5134c(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5116f(C1240a c1240a, AbstractC1126h abstractC1126h) {
        AbstractC0606k.m2145e(c1240a, "registry");
        AbstractC0606k.m2145e(abstractC1126h, "lifecycle");
        if (this.f5328f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f5328f = true;
        abstractC1126h.mo5132a(this);
        c1240a.m6295h(this.f5326d, this.f5327e.m5191c());
    }

    /* JADX INFO: renamed from: i */
    public final C1144z m5117i() {
        return this.f5327e;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5118j() {
        return this.f5328f;
    }
}
