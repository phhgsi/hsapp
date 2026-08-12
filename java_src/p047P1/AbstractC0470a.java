package p047P1;

import java.io.Serializable;
import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p041N1.InterfaceC0442e;
import p044O1.AbstractC0452b;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: P1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0470a implements InterfaceC0442e, InterfaceC0473d, Serializable {

    /* JADX INFO: renamed from: d */
    private final InterfaceC0442e f1678d;

    public AbstractC0470a(InterfaceC0442e interfaceC0442e) {
        this.f1678d = interfaceC0442e;
    }

    @Override // p047P1.InterfaceC0473d
    /* JADX INFO: renamed from: e */
    public InterfaceC0473d mo1750e() {
        InterfaceC0442e interfaceC0442e = this.f1678d;
        if (interfaceC0442e instanceof InterfaceC0473d) {
            return (InterfaceC0473d) interfaceC0442e;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
        AbstractC0606k.m2145e(interfaceC0442e, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0442e m1752h() {
        return this.f1678d;
    }

    /* JADX INFO: renamed from: i */
    public StackTraceElement m1753i() {
        return AbstractC0475f.m1764d(this);
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: j */
    public final void mo1616j(Object obj) {
        Object objMo1646k;
        InterfaceC0442e interfaceC0442e = this;
        while (true) {
            AbstractC0476g.m1766b(interfaceC0442e);
            AbstractC0470a abstractC0470a = (AbstractC0470a) interfaceC0442e;
            InterfaceC0442e interfaceC0442e2 = abstractC0470a.f1678d;
            AbstractC0606k.m2142b(interfaceC0442e2);
            try {
                objMo1646k = abstractC0470a.mo1646k(obj);
            } catch (Throwable th) {
                AbstractC0381m.a aVar = AbstractC0381m.f1498d;
                obj = AbstractC0381m.m1369a(AbstractC0382n.m1372a(th));
            }
            if (objMo1646k == AbstractC0452b.m1647e()) {
                return;
            }
            obj = AbstractC0381m.m1369a(objMo1646k);
            abstractC0470a.mo1754l();
            if (!(interfaceC0442e2 instanceof AbstractC0470a)) {
                interfaceC0442e2.mo1616j(obj);
                return;
            }
            interfaceC0442e = interfaceC0442e2;
        }
    }

    /* JADX INFO: renamed from: k */
    protected abstract Object mo1646k(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object objM1753i = m1753i();
        if (objM1753i == null) {
            objM1753i = getClass().getName();
        }
        sb.append(objM1753i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    protected void mo1754l() {
    }
}
