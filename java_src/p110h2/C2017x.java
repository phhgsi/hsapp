package p110h2;

import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p044O1.AbstractC0452b;
import p047P1.InterfaceC0473d;
import p102f2.AbstractC1920a;
import p102f2.AbstractC1960u;

/* JADX INFO: renamed from: h2.x */
/* JADX INFO: loaded from: classes.dex */
public class C2017x extends AbstractC1920a implements InterfaceC0473d {

    /* JADX INFO: renamed from: g */
    public final InterfaceC0442e f9605g;

    public C2017x(InterfaceC0446i interfaceC0446i, InterfaceC0442e interfaceC0442e) {
        super(interfaceC0446i, true, true);
        this.f9605g = interfaceC0442e;
    }

    @Override // p102f2.AbstractC1920a
    /* JADX INFO: renamed from: A0 */
    protected void mo9798A0(Object obj) {
        InterfaceC0442e interfaceC0442e = this.f9605g;
        interfaceC0442e.mo1616j(AbstractC1960u.m10015a(obj, interfaceC0442e));
    }

    @Override // p102f2.C1945m0
    /* JADX INFO: renamed from: b0 */
    protected final boolean mo9971b0() {
        return true;
    }

    @Override // p047P1.InterfaceC0473d
    /* JADX INFO: renamed from: e */
    public final InterfaceC0473d mo1750e() {
        InterfaceC0442e interfaceC0442e = this.f9605g;
        if (interfaceC0442e instanceof InterfaceC0473d) {
            return (InterfaceC0473d) interfaceC0442e;
        }
        return null;
    }

    @Override // p102f2.C1945m0
    /* JADX INFO: renamed from: t */
    protected void mo9800t(Object obj) {
        AbstractC2002i.m10132c(AbstractC0452b.m1644c(this.f9605g), AbstractC1960u.m10015a(obj, this.f9605g), null, 2, null);
    }
}
