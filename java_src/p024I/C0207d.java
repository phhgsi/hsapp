package p024I;

/* JADX INFO: renamed from: I.d */
/* JADX INFO: loaded from: classes.dex */
public class C0207d {

    /* JADX INFO: renamed from: a */
    public final Object f1232a;

    /* JADX INFO: renamed from: b */
    public final Object f1233b;

    public C0207d(Object obj, Object obj2) {
        this.f1232a = obj;
        this.f1233b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public static C0207d m600a(Object obj, Object obj2) {
        return new C0207d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0207d)) {
            return false;
        }
        C0207d c0207d = (C0207d) obj;
        return AbstractC0206c.m596a(c0207d.f1232a, this.f1232a) && AbstractC0206c.m596a(c0207d.f1233b, this.f1233b);
    }

    public int hashCode() {
        Object obj = this.f1232a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f1233b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f1232a + " " + this.f1233b + "}";
    }
}
