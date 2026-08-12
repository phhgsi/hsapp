package p047P1;

import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0443f;
import p041N1.InterfaceC0446i;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: P1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0472c extends AbstractC0470a {

    /* JADX INFO: renamed from: e */
    private final InterfaceC0446i f1680e;

    /* JADX INFO: renamed from: f */
    private transient InterfaceC0442e f1681f;

    public AbstractC0472c(InterfaceC0442e interfaceC0442e, InterfaceC0446i interfaceC0446i) {
        super(interfaceC0442e);
        this.f1680e = interfaceC0446i;
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: c */
    public InterfaceC0446i mo1615c() {
        InterfaceC0446i interfaceC0446i = this.f1680e;
        AbstractC0606k.m2142b(interfaceC0446i);
        return interfaceC0446i;
    }

    @Override // p047P1.AbstractC0470a
    /* JADX INFO: renamed from: l */
    protected void mo1754l() {
        InterfaceC0442e interfaceC0442e = this.f1681f;
        if (interfaceC0442e != null && interfaceC0442e != this) {
            InterfaceC0446i.b bVarMo1603b = mo1615c().mo1603b(InterfaceC0443f.f1591a);
            AbstractC0606k.m2142b(bVarMo1603b);
            ((InterfaceC0443f) bVarMo1603b).mo1618q(interfaceC0442e);
        }
        this.f1681f = C0471b.f1679d;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC0442e m1755m() {
        InterfaceC0442e interfaceC0442eMo1617l = this.f1681f;
        if (interfaceC0442eMo1617l == null) {
            InterfaceC0443f interfaceC0443f = (InterfaceC0443f) mo1615c().mo1603b(InterfaceC0443f.f1591a);
            if (interfaceC0443f == null || (interfaceC0442eMo1617l = interfaceC0443f.mo1617l(this)) == null) {
                interfaceC0442eMo1617l = this;
            }
            this.f1681f = interfaceC0442eMo1617l;
        }
        return interfaceC0442eMo1617l;
    }

    public AbstractC0472c(InterfaceC0442e interfaceC0442e) {
        this(interfaceC0442e, interfaceC0442e != null ? interfaceC0442e.mo1615c() : null);
    }
}
