package p139p1;

import java.util.Set;
import p002A1.InterfaceC0027b;

/* JADX INFO: renamed from: p1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2323d {
    /* JADX INFO: renamed from: a */
    public static Object m11121a(InterfaceC2324e interfaceC2324e, Class cls) {
        return interfaceC2324e.mo11091f(C2318E.m11085b(cls));
    }

    /* JADX INFO: renamed from: b */
    public static Object m11122b(InterfaceC2324e interfaceC2324e, C2318E c2318e) {
        InterfaceC0027b interfaceC0027bMo11090e = interfaceC2324e.mo11090e(c2318e);
        if (interfaceC0027bMo11090e == null) {
            return null;
        }
        return interfaceC0027bMo11090e.get();
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0027b m11123c(InterfaceC2324e interfaceC2324e, Class cls) {
        return interfaceC2324e.mo11090e(C2318E.m11085b(cls));
    }

    /* JADX INFO: renamed from: d */
    public static Set m11124d(InterfaceC2324e interfaceC2324e, Class cls) {
        return interfaceC2324e.mo11087b(C2318E.m11085b(cls));
    }

    /* JADX INFO: renamed from: e */
    public static Set m11125e(InterfaceC2324e interfaceC2324e, C2318E c2318e) {
        return (Set) interfaceC2324e.mo11092g(c2318e).get();
    }
}
