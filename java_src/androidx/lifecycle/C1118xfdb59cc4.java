package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p068W1.InterfaceC0566a;
import p071X1.AbstractC0606k;
import p102f2.InterfaceC1936i;

/* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1118xfdb59cc4 implements InterfaceC1130l {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AbstractC1126h.b f5329d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ AbstractC1126h f5330e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ InterfaceC1936i f5331f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ InterfaceC0566a f5332g;

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        Object objM1369a;
        AbstractC0606k.m2145e(interfaceC1132n, "source");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar != AbstractC1126h.a.Companion.m5139c(this.f5329d)) {
            if (aVar == AbstractC1126h.a.ON_DESTROY) {
                this.f5330e.mo5134c(this);
                InterfaceC1936i interfaceC1936i = this.f5331f;
                AbstractC0381m.a aVar2 = AbstractC0381m.f1498d;
                interfaceC1936i.mo1616j(AbstractC0381m.m1369a(AbstractC0382n.m1372a(new C1128j())));
                return;
            }
            return;
        }
        this.f5330e.mo5134c(this);
        InterfaceC1936i interfaceC1936i2 = this.f5331f;
        InterfaceC0566a interfaceC0566a = this.f5332g;
        try {
            AbstractC0381m.a aVar3 = AbstractC0381m.f1498d;
            objM1369a = AbstractC0381m.m1369a(interfaceC0566a.mo464a());
        } catch (Throwable th) {
            AbstractC0381m.a aVar4 = AbstractC0381m.f1498d;
            objM1369a = AbstractC0381m.m1369a(AbstractC0382n.m1372a(th));
        }
        interfaceC1936i2.mo1616j(objM1369a);
    }
}
