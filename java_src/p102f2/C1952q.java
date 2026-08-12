package p102f2;

import p068W1.InterfaceC0577l;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: f2.q */
/* JADX INFO: loaded from: classes.dex */
final class C1952q {

    /* JADX INFO: renamed from: a */
    public final Object f9471a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0577l f9472b;

    /* JADX INFO: renamed from: c */
    public final Object f9473c;

    /* JADX INFO: renamed from: d */
    public final Throwable f9474d;

    public C1952q(Object obj, InterfaceC1934h interfaceC1934h, InterfaceC0577l interfaceC0577l, Object obj2, Throwable th) {
        this.f9471a = obj;
        this.f9472b = interfaceC0577l;
        this.f9473c = obj2;
        this.f9474d = th;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C1952q m10006b(C1952q c1952q, Object obj, InterfaceC1934h interfaceC1934h, InterfaceC0577l interfaceC0577l, Object obj2, Throwable th, int i3, Object obj3) {
        if ((i3 & 1) != 0) {
            obj = c1952q.f9471a;
        }
        if ((i3 & 2) != 0) {
            c1952q.getClass();
            interfaceC1934h = null;
        }
        if ((i3 & 4) != 0) {
            interfaceC0577l = c1952q.f9472b;
        }
        if ((i3 & 8) != 0) {
            obj2 = c1952q.f9473c;
        }
        if ((i3 & 16) != 0) {
            th = c1952q.f9474d;
        }
        Throwable th2 = th;
        InterfaceC0577l interfaceC0577l2 = interfaceC0577l;
        return c1952q.m10007a(obj, interfaceC1934h, interfaceC0577l2, obj2, th2);
    }

    /* JADX INFO: renamed from: a */
    public final C1952q m10007a(Object obj, InterfaceC1934h interfaceC1934h, InterfaceC0577l interfaceC0577l, Object obj2, Throwable th) {
        return new C1952q(obj, interfaceC1934h, interfaceC0577l, obj2, th);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10008c() {
        return this.f9474d != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m10009d(C1938j c1938j, Throwable th) {
        InterfaceC0577l interfaceC0577l = this.f9472b;
        if (interfaceC0577l != null) {
            c1938j.m9902k(interfaceC0577l, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1952q)) {
            return false;
        }
        C1952q c1952q = (C1952q) obj;
        return AbstractC0606k.m2141a(this.f9471a, c1952q.f9471a) && AbstractC0606k.m2141a(null, null) && AbstractC0606k.m2141a(this.f9472b, c1952q.f9472b) && AbstractC0606k.m2141a(this.f9473c, c1952q.f9473c) && AbstractC0606k.m2141a(this.f9474d, c1952q.f9474d);
    }

    public int hashCode() {
        Object obj = this.f9471a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        InterfaceC0577l interfaceC0577l = this.f9472b;
        int iHashCode2 = (iHashCode + (interfaceC0577l == null ? 0 : interfaceC0577l.hashCode())) * 31;
        Object obj2 = this.f9473c;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f9474d;
        return iHashCode3 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f9471a + ", cancelHandler=" + ((Object) null) + ", onCancellation=" + this.f9472b + ", idempotentResume=" + this.f9473c + ", cancelCause=" + this.f9474d + ')';
    }

    public /* synthetic */ C1952q(Object obj, InterfaceC1934h interfaceC1934h, InterfaceC0577l interfaceC0577l, Object obj2, Throwable th, int i3, AbstractC0602g abstractC0602g) {
        this(obj, (i3 & 2) != 0 ? null : interfaceC1934h, (i3 & 4) != 0 ? null : interfaceC0577l, (i3 & 8) != 0 ? null : obj2, (i3 & 16) != 0 ? null : th);
    }
}
