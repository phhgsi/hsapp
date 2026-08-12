package p035L1;

import java.io.Serializable;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: L1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0380l implements Serializable {

    /* JADX INFO: renamed from: d */
    private final Object f1496d;

    /* JADX INFO: renamed from: e */
    private final Object f1497e;

    public C0380l(Object obj, Object obj2) {
        this.f1496d = obj;
        this.f1497e = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1365a() {
        return this.f1496d;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1366b() {
        return this.f1497e;
    }

    /* JADX INFO: renamed from: c */
    public final Object m1367c() {
        return this.f1496d;
    }

    /* JADX INFO: renamed from: d */
    public final Object m1368d() {
        return this.f1497e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0380l)) {
            return false;
        }
        C0380l c0380l = (C0380l) obj;
        return AbstractC0606k.m2141a(this.f1496d, c0380l.f1496d) && AbstractC0606k.m2141a(this.f1497e, c0380l.f1497e);
    }

    public int hashCode() {
        Object obj = this.f1496d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1497e;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f1496d + ", " + this.f1497e + ')';
    }
}
