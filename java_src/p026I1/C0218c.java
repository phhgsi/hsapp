package p026I1;

import java.util.Iterator;
import java.util.Set;
import p139p1.C2322c;
import p139p1.C2337r;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;

/* JADX INFO: renamed from: I1.c */
/* JADX INFO: loaded from: classes.dex */
public class C0218c implements InterfaceC0224i {

    /* JADX INFO: renamed from: a */
    private final String f1243a;

    /* JADX INFO: renamed from: b */
    private final C0219d f1244b;

    C0218c(Set set, C0219d c0219d) {
        this.f1243a = m618d(set);
        this.f1244b = c0219d;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC0224i m616b(InterfaceC2324e interfaceC2324e) {
        return new C0218c(interfaceC2324e.mo11088c(AbstractC0221f.class), C0219d.m620a());
    }

    /* JADX INFO: renamed from: c */
    public static C2322c m617c() {
        return C2322c.m11095c(InterfaceC0224i.class).m11115b(C2337r.m11169m(AbstractC0221f.class)).m11119f(new InterfaceC2327h() { // from class: I1.b
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return C0218c.m616b(interfaceC2324e);
            }
        }).m11117d();
    }

    /* JADX INFO: renamed from: d */
    private static String m618d(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC0221f abstractC0221f = (AbstractC0221f) it.next();
            sb.append(abstractC0221f.mo614b());
            sb.append('/');
            sb.append(abstractC0221f.mo615c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // p026I1.InterfaceC0224i
    /* JADX INFO: renamed from: a */
    public String mo619a() {
        if (this.f1244b.m621b().isEmpty()) {
            return this.f1243a;
        }
        return this.f1243a + ' ' + m618d(this.f1244b.m621b());
    }
}
