package p102f2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;
import p044O1.AbstractC0452b;
import p110h2.AbstractC2002i;
import p110h2.C2017x;

/* JADX INFO: renamed from: f2.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1904J extends C2017x {

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9410h = AtomicIntegerFieldUpdater.newUpdater(C1904J.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C1904J(InterfaceC0446i interfaceC0446i, InterfaceC0442e interfaceC0442e) {
        super(interfaceC0446i, interfaceC0442e);
    }

    /* JADX INFO: renamed from: G0 */
    private final boolean m9796G0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9410h;
        do {
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f9410h.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: renamed from: H0 */
    private final boolean m9797H0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9410h;
        do {
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f9410h.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p110h2.C2017x, p102f2.AbstractC1920a
    /* JADX INFO: renamed from: A0 */
    protected void mo9798A0(Object obj) {
        if (m9796G0()) {
            return;
        }
        AbstractC2002i.m10132c(AbstractC0452b.m1644c(this.f9605g), AbstractC1960u.m10015a(obj, this.f9605g), null, 2, null);
    }

    /* JADX INFO: renamed from: E0 */
    public final Object m9799E0() {
        if (m9797H0()) {
            return AbstractC0452b.m1647e();
        }
        Object objM10005h = AbstractC1947n0.m10005h(m9966T());
        if (objM10005h instanceof C1954r) {
            throw ((C1954r) objM10005h).f9476a;
        }
        return objM10005h;
    }

    @Override // p110h2.C2017x, p102f2.C1945m0
    /* JADX INFO: renamed from: t */
    protected void mo9800t(Object obj) {
        mo9798A0(obj);
    }
}
