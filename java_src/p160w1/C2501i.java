package p160w1;

import java.io.IOException;
import p151t1.C2448b;
import p151t1.C2449c;
import p151t1.InterfaceC2453g;

/* JADX INFO: renamed from: w1.i */
/* JADX INFO: loaded from: classes.dex */
class C2501i implements InterfaceC2453g {

    /* JADX INFO: renamed from: a */
    private boolean f11670a = false;

    /* JADX INFO: renamed from: b */
    private boolean f11671b = false;

    /* JADX INFO: renamed from: c */
    private C2449c f11672c;

    /* JADX INFO: renamed from: d */
    private final C2498f f11673d;

    C2501i(C2498f c2498f) {
        this.f11673d = c2498f;
    }

    /* JADX INFO: renamed from: a */
    private void m11887a() {
        if (this.f11670a) {
            throw new C2448b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f11670a = true;
    }

    @Override // p151t1.InterfaceC2453g
    /* JADX INFO: renamed from: b */
    public InterfaceC2453g mo11752b(String str) throws IOException {
        m11887a();
        this.f11673d.m11873g(this.f11672c, str, this.f11671b);
        return this;
    }

    @Override // p151t1.InterfaceC2453g
    /* JADX INFO: renamed from: c */
    public InterfaceC2453g mo11753c(boolean z2) {
        m11887a();
        this.f11673d.m11878l(this.f11672c, z2, this.f11671b);
        return this;
    }

    /* JADX INFO: renamed from: d */
    void m11888d(C2449c c2449c, boolean z2) {
        this.f11670a = false;
        this.f11672c = c2449c;
        this.f11671b = z2;
    }
}
