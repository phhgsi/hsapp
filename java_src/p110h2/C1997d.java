package p110h2;

import p041N1.InterfaceC0446i;
import p102f2.InterfaceC1970z;

/* JADX INFO: renamed from: h2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1997d implements InterfaceC1970z {

    /* JADX INFO: renamed from: d */
    private final InterfaceC0446i f9568d;

    public C1997d(InterfaceC0446i interfaceC0446i) {
        this.f9568d = interfaceC0446i;
    }

    @Override // p102f2.InterfaceC1970z
    /* JADX INFO: renamed from: f */
    public InterfaceC0446i mo5096f() {
        return this.f9568d;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo5096f() + ')';
    }
}
