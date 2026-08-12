package p047P1;

import p041N1.C0447j;
import p041N1.InterfaceC0442e;
import p041N1.InterfaceC0446i;

/* JADX INFO: renamed from: P1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0478i extends AbstractC0470a {
    public AbstractC0478i(InterfaceC0442e interfaceC0442e) {
        super(interfaceC0442e);
        if (interfaceC0442e != null && interfaceC0442e.mo1615c() != C0447j.f1593d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p041N1.InterfaceC0442e
    /* JADX INFO: renamed from: c */
    public InterfaceC0446i mo1615c() {
        return C0447j.f1593d;
    }
}
