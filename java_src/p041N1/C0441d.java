package p041N1;

import java.io.Serializable;
import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: N1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0441d implements InterfaceC0446i, Serializable {

    /* JADX INFO: renamed from: d */
    private final InterfaceC0446i f1589d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0446i.b f1590e;

    public C0441d(InterfaceC0446i interfaceC0446i, InterfaceC0446i.b bVar) {
        AbstractC0606k.m2145e(interfaceC0446i, "left");
        AbstractC0606k.m2145e(bVar, "element");
        this.f1589d = interfaceC0446i;
        this.f1590e = bVar;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m1611e(InterfaceC0446i.b bVar) {
        return AbstractC0606k.m2141a(mo1603b(bVar.getKey()), bVar);
    }

    /* JADX INFO: renamed from: f */
    private final boolean m1612f(C0441d c0441d) {
        while (m1611e(c0441d.f1590e)) {
            InterfaceC0446i interfaceC0446i = c0441d.f1589d;
            if (!(interfaceC0446i instanceof C0441d)) {
                AbstractC0606k.m2143c(interfaceC0446i, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m1611e((InterfaceC0446i.b) interfaceC0446i);
            }
            c0441d = (C0441d) interfaceC0446i;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    private final int m1613j() {
        int i3 = 2;
        C0441d c0441d = this;
        while (true) {
            InterfaceC0446i interfaceC0446i = c0441d.f1589d;
            c0441d = interfaceC0446i instanceof C0441d ? (C0441d) interfaceC0446i : null;
            if (c0441d == null) {
                return i3;
            }
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final String m1614k(String str, InterfaceC0446i.b bVar) {
        AbstractC0606k.m2145e(str, "acc");
        AbstractC0606k.m2145e(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: b */
    public InterfaceC0446i.b mo1603b(InterfaceC0446i.c cVar) {
        AbstractC0606k.m2145e(cVar, "key");
        C0441d c0441d = this;
        while (true) {
            InterfaceC0446i.b bVarMo1603b = c0441d.f1590e.mo1603b(cVar);
            if (bVarMo1603b != null) {
                return bVarMo1603b;
            }
            InterfaceC0446i interfaceC0446i = c0441d.f1589d;
            if (!(interfaceC0446i instanceof C0441d)) {
                return interfaceC0446i.mo1603b(cVar);
            }
            c0441d = (C0441d) interfaceC0446i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0441d)) {
            return false;
        }
        C0441d c0441d = (C0441d) obj;
        return c0441d.m1613j() == m1613j() && c0441d.m1612f(this);
    }

    public int hashCode() {
        return this.f1589d.hashCode() + this.f1590e.hashCode();
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: i */
    public Object mo1604i(Object obj, InterfaceC0581p interfaceC0581p) {
        AbstractC0606k.m2145e(interfaceC0581p, "operation");
        return interfaceC0581p.mo1609d(this.f1589d.mo1604i(obj, interfaceC0581p), this.f1590e);
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: p */
    public InterfaceC0446i mo1605p(InterfaceC0446i interfaceC0446i) {
        return InterfaceC0446i.a.m1623b(this, interfaceC0446i);
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: r */
    public InterfaceC0446i mo1606r(InterfaceC0446i.c cVar) {
        AbstractC0606k.m2145e(cVar, "key");
        if (this.f1590e.mo1603b(cVar) != null) {
            return this.f1589d;
        }
        InterfaceC0446i interfaceC0446iMo1606r = this.f1589d.mo1606r(cVar);
        return interfaceC0446iMo1606r == this.f1589d ? this : interfaceC0446iMo1606r == C0447j.f1593d ? this.f1590e : new C0441d(interfaceC0446iMo1606r, this.f1590e);
    }

    public String toString() {
        return '[' + ((String) mo1604i("", new InterfaceC0581p() { // from class: N1.c
            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: d */
            public final Object mo1609d(Object obj, Object obj2) {
                return C0441d.m1614k((String) obj, (InterfaceC0446i.b) obj2);
            }
        })) + ']';
    }
}
