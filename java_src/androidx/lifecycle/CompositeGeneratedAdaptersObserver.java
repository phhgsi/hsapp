package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import p071X1.AbstractC0606k;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements InterfaceC1130l {

    /* JADX INFO: renamed from: d */
    private final InterfaceC1124f[] f5259d;

    public CompositeGeneratedAdaptersObserver(InterfaceC1124f[] interfaceC1124fArr) {
        AbstractC0606k.m2145e(interfaceC1124fArr, "generatedAdapters");
        this.f5259d = interfaceC1124fArr;
    }

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(interfaceC1132n, "source");
        AbstractC0606k.m2145e(aVar, "event");
        new C1135q();
        InterfaceC1124f[] interfaceC1124fArr = this.f5259d;
        if (interfaceC1124fArr.length > 0) {
            InterfaceC1124f interfaceC1124f = interfaceC1124fArr[0];
            throw null;
        }
        if (interfaceC1124fArr.length <= 0) {
            return;
        }
        InterfaceC1124f interfaceC1124f2 = interfaceC1124fArr[0];
        throw null;
    }
}
