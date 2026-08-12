package p102f2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: f2.d0 */
/* JADX INFO: loaded from: classes.dex */
final class C1927d0 extends AbstractC1935h0 {

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9433f = AtomicIntegerFieldUpdater.newUpdater(C1927d0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1925c0 f9434e;

    public C1927d0(InterfaceC1925c0 interfaceC1925c0) {
        this.f9434e = interfaceC1925c0;
    }

    @Override // p102f2.InterfaceC1925c0
    /* JADX INFO: renamed from: d */
    public void mo9857d(Throwable th) {
        if (f9433f.compareAndSet(this, 0, 1)) {
            this.f9434e.mo9857d(th);
        }
    }
}
