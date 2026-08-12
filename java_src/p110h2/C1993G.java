package p110h2;

import p041N1.InterfaceC0446i;
import p071X1.AbstractC0606k;
import p102f2.InterfaceC1965w0;

/* JADX INFO: renamed from: h2.G */
/* JADX INFO: loaded from: classes.dex */
final class C1993G {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0446i f9561a;

    /* JADX INFO: renamed from: b */
    private final Object[] f9562b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1965w0[] f9563c;

    /* JADX INFO: renamed from: d */
    private int f9564d;

    public C1993G(InterfaceC0446i interfaceC0446i, int i3) {
        this.f9561a = interfaceC0446i;
        this.f9562b = new Object[i3];
        this.f9563c = new InterfaceC1965w0[i3];
    }

    /* JADX INFO: renamed from: a */
    public final void m10113a(InterfaceC1965w0 interfaceC1965w0, Object obj) {
        Object[] objArr = this.f9562b;
        int i3 = this.f9564d;
        objArr[i3] = obj;
        InterfaceC1965w0[] interfaceC1965w0Arr = this.f9563c;
        this.f9564d = i3 + 1;
        AbstractC0606k.m2143c(interfaceC1965w0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC1965w0Arr[i3] = interfaceC1965w0;
    }

    /* JADX INFO: renamed from: b */
    public final void m10114b(InterfaceC0446i interfaceC0446i) {
        int length = this.f9563c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            InterfaceC1965w0 interfaceC1965w0 = this.f9563c[length];
            AbstractC0606k.m2142b(interfaceC1965w0);
            interfaceC1965w0.m10032w(interfaceC0446i, this.f9562b[length]);
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }
}
