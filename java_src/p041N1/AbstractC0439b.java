package p041N1;

import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: N1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0439b implements InterfaceC0446i.c {

    /* JADX INFO: renamed from: d */
    private final InterfaceC0577l f1587d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0446i.c f1588e;

    public AbstractC0439b(InterfaceC0446i.c cVar, InterfaceC0577l interfaceC0577l) {
        AbstractC0606k.m2145e(cVar, "baseKey");
        AbstractC0606k.m2145e(interfaceC0577l, "safeCast");
        this.f1587d = interfaceC0577l;
        this.f1588e = cVar instanceof AbstractC0439b ? ((AbstractC0439b) cVar).f1588e : cVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1607a(InterfaceC0446i.c cVar) {
        AbstractC0606k.m2145e(cVar, "key");
        return cVar == this || this.f1588e == cVar;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0446i.b m1608b(InterfaceC0446i.b bVar) {
        AbstractC0606k.m2145e(bVar, "element");
        return (InterfaceC0446i.b) this.f1587d.mo1406f(bVar);
    }
}
