package p102f2;

import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0581p;

/* JADX INFO: renamed from: f2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1920a extends C1945m0 implements InterfaceC1931f0, InterfaceC0442e, InterfaceC1970z {

    /* JADX INFO: renamed from: f */
    private final InterfaceC0446i f9429f;

    public AbstractC1920a(InterfaceC0446i interfaceC0446i, boolean z2, boolean z3) {
        super(z3);
        if (z2) {
            m9968Y((InterfaceC1931f0) interfaceC0446i.mo1603b(InterfaceC1931f0.f9437c));
        }
        this.f9429f = interfaceC0446i.mo1605p(this);
    }

    /* JADX INFO: renamed from: A0 */
    protected void mo9798A0(Object obj) {
        mo9800t(obj);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m9850D0(EnumC1895B enumC1895B, Object obj, InterfaceC0581p interfaceC0581p) throws Throwable {
        enumC1895B.m9779b(interfaceC0581p, obj, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p102f2.C1945m0
    /* JADX INFO: renamed from: F */
    public String mo9851F() {
        return AbstractC1898D.m9781a(this) + " was cancelled";
    }

    @Override // p102f2.C1945m0
    /* JADX INFO: renamed from: X */
    public final void mo9852X(Throwable th) {
        AbstractC1968y.m10038a(this.f9429f, th);
    }

    @Override // p102f2.C1945m0, p102f2.InterfaceC1931f0
    /* JADX INFO: renamed from: a */
    public boolean mo9853a() {
        return super.mo9853a();
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: c */
    public final InterfaceC0446i mo1615c() {
        return this.f9429f;
    }

    @Override // p102f2.InterfaceC1970z
    /* JADX INFO: renamed from: f */
    public InterfaceC0446i mo5096f() {
        return this.f9429f;
    }

    @Override // p102f2.C1945m0
    /* JADX INFO: renamed from: f0 */
    public String mo9854f0() {
        String strM10020b = AbstractC1962v.m10020b(this.f9429f);
        if (strM10020b == null) {
            return super.mo9854f0();
        }
        return '\"' + strM10020b + "\":" + super.mo9854f0();
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: j */
    public final void mo1616j(Object obj) {
        Object objM9972d0 = m9972d0(AbstractC1960u.m10018d(obj, null, 1, null));
        if (objM9972d0 == AbstractC1947n0.f9463b) {
            return;
        }
        mo9798A0(objM9972d0);
    }

    @Override // p102f2.C1945m0
    /* JADX INFO: renamed from: k0 */
    protected final void mo9855k0(Object obj) {
        if (!(obj instanceof C1954r)) {
            m9849C0(obj);
        } else {
            C1954r c1954r = (C1954r) obj;
            m9848B0(c1954r.f9476a, c1954r.m10013a());
        }
    }

    /* JADX INFO: renamed from: C0 */
    protected void m9849C0(Object obj) {
    }

    /* JADX INFO: renamed from: B0 */
    protected void m9848B0(Throwable th, boolean z2) {
    }
}
