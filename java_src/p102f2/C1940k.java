package p102f2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p041N1.InterfaceC0442e;

/* JADX INFO: renamed from: f2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1940k extends C1954r {

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9446c = AtomicIntegerFieldUpdater.newUpdater(C1940k.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C1940k(InterfaceC0442e interfaceC0442e, Throwable th, boolean z2) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC0442e + " was cancelled normally");
        }
        super(th, z2);
        this._resumed$volatile = 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9918e() {
        return f9446c.compareAndSet(this, 0, 1);
    }
}
