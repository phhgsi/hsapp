package p012E;

import android.p082os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p041N1.InterfaceC0442e;

/* JADX INFO: renamed from: E.g */
/* JADX INFO: loaded from: classes.dex */
final class C0110g extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: d */
    private final InterfaceC0442e f231d;

    public C0110g(InterfaceC0442e interfaceC0442e) {
        super(false);
        this.f231d = interfaceC0442e;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            InterfaceC0442e interfaceC0442e = this.f231d;
            AbstractC0381m.a aVar = AbstractC0381m.f1498d;
            interfaceC0442e.mo1616j(AbstractC0381m.m1369a(AbstractC0382n.m1372a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f231d.mo1616j(AbstractC0381m.m1369a(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
