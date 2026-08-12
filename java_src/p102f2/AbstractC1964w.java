package p102f2;

import p041N1.AbstractC0438a;
import p041N1.AbstractC0439b;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0443f;
import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;
import p110h2.AbstractC2004k;
import p110h2.C2001h;
import p110h2.C2003j;

/* JADX INFO: renamed from: f2.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1964w extends AbstractC0438a implements InterfaceC0443f {

    /* JADX INFO: renamed from: e */
    public static final a f9484e = new a(null);

    /* JADX INFO: renamed from: f2.w$a */
    public static final class a extends AbstractC0439b {

        /* JADX INFO: renamed from: f2.w$a$a, reason: collision with other inner class name */
        static final class C2628a extends AbstractC0607l implements InterfaceC0577l {

            /* JADX INFO: renamed from: e */
            public static final C2628a f9485e = new C2628a();

            C2628a() {
                super(1);
            }

            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final AbstractC1964w mo1406f(InterfaceC0446i.b bVar) {
                if (bVar instanceof AbstractC1964w) {
                    return (AbstractC1964w) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
            super(InterfaceC0443f.f1591a, C2628a.f9485e);
        }
    }

    public AbstractC1964w() {
        super(InterfaceC0443f.f1591a);
    }

    /* JADX INFO: renamed from: D */
    public abstract void mo9836D(InterfaceC0446i interfaceC0446i, Runnable runnable);

    /* JADX INFO: renamed from: E */
    public boolean mo10029E(InterfaceC0446i interfaceC0446i) {
        return true;
    }

    /* JADX INFO: renamed from: F */
    public AbstractC1964w mo10030F(int i3) {
        AbstractC2004k.m10138a(i3);
        return new C2003j(this, i3);
    }

    @Override // p041N1.AbstractC0438a, p041N1.InterfaceC0446i.b, p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: b */
    public InterfaceC0446i.b mo1603b(InterfaceC0446i.c cVar) {
        return InterfaceC0443f.a.m1619a(this, cVar);
    }

    @Override // p041N1.InterfaceC0443f
    /* JADX INFO: renamed from: l */
    public final InterfaceC0442e mo1617l(InterfaceC0442e interfaceC0442e) {
        return new C2001h(this, interfaceC0442e);
    }

    @Override // p041N1.InterfaceC0443f
    /* JADX INFO: renamed from: q */
    public final void mo1618q(InterfaceC0442e interfaceC0442e) {
        AbstractC0606k.m2143c(interfaceC0442e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C2001h) interfaceC0442e).m10128o();
    }

    @Override // p041N1.AbstractC0438a, p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: r */
    public InterfaceC0446i mo1606r(InterfaceC0446i.c cVar) {
        return InterfaceC0443f.a.m1620b(this, cVar);
    }

    public String toString() {
        return AbstractC1898D.m9781a(this) + '@' + AbstractC1898D.m9782b(this);
    }
}
