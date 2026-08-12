package p069X;

import p069X.AbstractC0589a;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: X.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0592d extends AbstractC0589a {
    /* JADX WARN: Multi-variable type inference failed */
    public C0592d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p069X.AbstractC0589a
    /* JADX INFO: renamed from: a */
    public Object mo2116a(AbstractC0589a.b bVar) {
        AbstractC0606k.m2145e(bVar, "key");
        return m2117b().get(bVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m2122c(AbstractC0589a.b bVar, Object obj) {
        AbstractC0606k.m2145e(bVar, "key");
        m2117b().put(bVar, obj);
    }

    public C0592d(AbstractC0589a abstractC0589a) {
        AbstractC0606k.m2145e(abstractC0589a, "initialExtras");
        m2117b().putAll(abstractC0589a.m2117b());
    }

    public /* synthetic */ C0592d(AbstractC0589a abstractC0589a, int i3, AbstractC0602g abstractC0602g) {
        this((i3 & 1) != 0 ? AbstractC0589a.a.f1979b : abstractC0589a);
    }
}
