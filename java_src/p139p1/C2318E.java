package p139p1;

/* JADX INFO: renamed from: p1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C2318E {

    /* JADX INFO: renamed from: a */
    private final Class f10712a;

    /* JADX INFO: renamed from: b */
    private final Class f10713b;

    /* JADX INFO: renamed from: p1.E$a */
    private @interface a {
    }

    public C2318E(Class cls, Class cls2) {
        this.f10712a = cls;
        this.f10713b = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static C2318E m11084a(Class cls, Class cls2) {
        return new C2318E(cls, cls2);
    }

    /* JADX INFO: renamed from: b */
    public static C2318E m11085b(Class cls) {
        return new C2318E(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2318E.class != obj.getClass()) {
            return false;
        }
        C2318E c2318e = (C2318E) obj;
        if (this.f10713b.equals(c2318e.f10713b)) {
            return this.f10712a.equals(c2318e.f10712a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f10713b.hashCode() * 31) + this.f10712a.hashCode();
    }

    public String toString() {
        if (this.f10712a == a.class) {
            return this.f10713b.getName();
        }
        return "@" + this.f10712a.getName() + " " + this.f10713b.getName();
    }
}
