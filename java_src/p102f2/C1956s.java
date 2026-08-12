package p102f2;

import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: f2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1956s {

    /* JADX INFO: renamed from: a */
    public final Object f9477a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0577l f9478b;

    public C1956s(Object obj, InterfaceC0577l interfaceC0577l) {
        this.f9477a = obj;
        this.f9478b = interfaceC0577l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1956s)) {
            return false;
        }
        C1956s c1956s = (C1956s) obj;
        return AbstractC0606k.m2141a(this.f9477a, c1956s.f9477a) && AbstractC0606k.m2141a(this.f9478b, c1956s.f9478b);
    }

    public int hashCode() {
        Object obj = this.f9477a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f9478b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f9477a + ", onCancellation=" + this.f9478b + ')';
    }
}
