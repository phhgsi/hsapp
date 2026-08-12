package p150t0;

import java.util.Set;
import p144r0.C2366c;
import p144r0.InterfaceC2370g;
import p144r0.InterfaceC2371h;
import p144r0.InterfaceC2372i;

/* JADX INFO: renamed from: t0.p */
/* JADX INFO: loaded from: classes.dex */
final class C2440p implements InterfaceC2372i {

    /* JADX INFO: renamed from: a */
    private final Set f11414a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2439o f11415b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2443s f11416c;

    C2440p(Set set, AbstractC2439o abstractC2439o, InterfaceC2443s interfaceC2443s) {
        this.f11414a = set;
        this.f11415b = abstractC2439o;
        this.f11416c = interfaceC2443s;
    }

    @Override // p144r0.InterfaceC2372i
    /* JADX INFO: renamed from: a */
    public InterfaceC2371h mo11218a(String str, Class cls, C2366c c2366c, InterfaceC2370g interfaceC2370g) {
        if (this.f11414a.contains(c2366c)) {
            return new C2442r(this.f11415b, str, c2366c, interfaceC2370g, this.f11416c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c2366c, this.f11414a));
    }
}
