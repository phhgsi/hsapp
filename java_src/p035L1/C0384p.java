package p035L1;

import java.io.Serializable;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: L1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0384p implements Serializable {

    /* JADX INFO: renamed from: d */
    private final Object f1503d;

    /* JADX INFO: renamed from: e */
    private final Object f1504e;

    /* JADX INFO: renamed from: f */
    private final Object f1505f;

    public C0384p(Object obj, Object obj2, Object obj3) {
        this.f1503d = obj;
        this.f1504e = obj2;
        this.f1505f = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1375a() {
        return this.f1503d;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1376b() {
        return this.f1504e;
    }

    /* JADX INFO: renamed from: c */
    public final Object m1377c() {
        return this.f1505f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0384p)) {
            return false;
        }
        C0384p c0384p = (C0384p) obj;
        return AbstractC0606k.m2141a(this.f1503d, c0384p.f1503d) && AbstractC0606k.m2141a(this.f1504e, c0384p.f1504e) && AbstractC0606k.m2141a(this.f1505f, c0384p.f1505f);
    }

    public int hashCode() {
        Object obj = this.f1503d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1504e;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f1505f;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f1503d + ", " + this.f1504e + ", " + this.f1505f + ')';
    }
}
