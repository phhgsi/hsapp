package p041N1;

import p041N1.InterfaceC0443f;
import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: N1.i */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0446i {

    /* JADX INFO: renamed from: N1.i$a */
    public static final class a {
        /* JADX INFO: renamed from: b */
        public static InterfaceC0446i m1623b(InterfaceC0446i interfaceC0446i, InterfaceC0446i interfaceC0446i2) {
            AbstractC0606k.m2145e(interfaceC0446i2, "context");
            return interfaceC0446i2 == C0447j.f1593d ? interfaceC0446i : (InterfaceC0446i) interfaceC0446i2.mo1604i(interfaceC0446i, new InterfaceC0581p() { // from class: N1.h
                @Override // p068W1.InterfaceC0581p
                /* JADX INFO: renamed from: d */
                public final Object mo1609d(Object obj, Object obj2) {
                    return InterfaceC0446i.a.m1624c((InterfaceC0446i) obj, (InterfaceC0446i.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static InterfaceC0446i m1624c(InterfaceC0446i interfaceC0446i, b bVar) {
            AbstractC0606k.m2145e(interfaceC0446i, "acc");
            AbstractC0606k.m2145e(bVar, "element");
            InterfaceC0446i interfaceC0446iMo1606r = interfaceC0446i.mo1606r(bVar.getKey());
            C0447j c0447j = C0447j.f1593d;
            if (interfaceC0446iMo1606r == c0447j) {
                return bVar;
            }
            InterfaceC0443f.b bVar2 = InterfaceC0443f.f1591a;
            InterfaceC0443f interfaceC0443f = (InterfaceC0443f) interfaceC0446iMo1606r.mo1603b(bVar2);
            if (interfaceC0443f == null) {
                return new C0441d(interfaceC0446iMo1606r, bVar);
            }
            InterfaceC0446i interfaceC0446iMo1606r2 = interfaceC0446iMo1606r.mo1606r(bVar2);
            return interfaceC0446iMo1606r2 == c0447j ? new C0441d(bVar, interfaceC0443f) : new C0441d(new C0441d(interfaceC0446iMo1606r2, bVar), interfaceC0443f);
        }
    }

    /* JADX INFO: renamed from: N1.i$b */
    public interface b extends InterfaceC0446i {

        /* JADX INFO: renamed from: N1.i$b$a */
        public static final class a {
            /* JADX INFO: renamed from: a */
            public static Object m1625a(b bVar, Object obj, InterfaceC0581p interfaceC0581p) {
                AbstractC0606k.m2145e(interfaceC0581p, "operation");
                return interfaceC0581p.mo1609d(obj, bVar);
            }

            /* JADX INFO: renamed from: b */
            public static b m1626b(b bVar, c cVar) {
                AbstractC0606k.m2145e(cVar, "key");
                if (!AbstractC0606k.m2141a(bVar.getKey(), cVar)) {
                    return null;
                }
                AbstractC0606k.m2143c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* JADX INFO: renamed from: c */
            public static InterfaceC0446i m1627c(b bVar, c cVar) {
                AbstractC0606k.m2145e(cVar, "key");
                return AbstractC0606k.m2141a(bVar.getKey(), cVar) ? C0447j.f1593d : bVar;
            }

            /* JADX INFO: renamed from: d */
            public static InterfaceC0446i m1628d(b bVar, InterfaceC0446i interfaceC0446i) {
                AbstractC0606k.m2145e(interfaceC0446i, "context");
                return a.m1623b(bVar, interfaceC0446i);
            }
        }

        @Override // p041N1.InterfaceC0446i
        /* JADX INFO: renamed from: b */
        b mo1603b(c cVar);

        c getKey();
    }

    /* JADX INFO: renamed from: N1.i$c */
    public interface c {
    }

    /* JADX INFO: renamed from: b */
    b mo1603b(c cVar);

    /* JADX INFO: renamed from: i */
    Object mo1604i(Object obj, InterfaceC0581p interfaceC0581p);

    /* JADX INFO: renamed from: p */
    InterfaceC0446i mo1605p(InterfaceC0446i interfaceC0446i);

    /* JADX INFO: renamed from: r */
    InterfaceC0446i mo1606r(c cVar);
}
