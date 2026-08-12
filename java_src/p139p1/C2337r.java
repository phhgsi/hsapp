package p139p1;

/* JADX INFO: renamed from: p1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2337r {

    /* JADX INFO: renamed from: a */
    private final C2318E f10769a;

    /* JADX INFO: renamed from: b */
    private final int f10770b;

    /* JADX INFO: renamed from: c */
    private final int f10771c;

    private C2337r(Class cls, int i3, int i4) {
        this(C2318E.m11085b(cls), i3, i4);
    }

    /* JADX INFO: renamed from: a */
    private static String m11162a(int i3) {
        if (i3 == 0) {
            return "direct";
        }
        if (i3 == 1) {
            return "provider";
        }
        if (i3 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i3);
    }

    /* JADX INFO: renamed from: g */
    public static C2337r m11163g(Class cls) {
        return new C2337r(cls, 0, 0);
    }

    /* JADX INFO: renamed from: h */
    public static C2337r m11164h(Class cls) {
        return new C2337r(cls, 0, 1);
    }

    /* JADX INFO: renamed from: i */
    public static C2337r m11165i(C2318E c2318e) {
        return new C2337r(c2318e, 0, 1);
    }

    /* JADX INFO: renamed from: j */
    public static C2337r m11166j(Class cls) {
        return new C2337r(cls, 1, 0);
    }

    /* JADX INFO: renamed from: k */
    public static C2337r m11167k(C2318E c2318e) {
        return new C2337r(c2318e, 1, 0);
    }

    /* JADX INFO: renamed from: l */
    public static C2337r m11168l(Class cls) {
        return new C2337r(cls, 1, 1);
    }

    /* JADX INFO: renamed from: m */
    public static C2337r m11169m(Class cls) {
        return new C2337r(cls, 2, 0);
    }

    /* JADX INFO: renamed from: b */
    public C2318E m11170b() {
        return this.f10769a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m11171c() {
        return this.f10771c == 2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m11172d() {
        return this.f10771c == 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m11173e() {
        return this.f10770b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2337r) {
            C2337r c2337r = (C2337r) obj;
            if (this.f10769a.equals(c2337r.f10769a) && this.f10770b == c2337r.f10770b && this.f10771c == c2337r.f10771c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m11174f() {
        return this.f10770b == 2;
    }

    public int hashCode() {
        return ((((this.f10769a.hashCode() ^ 1000003) * 1000003) ^ this.f10770b) * 1000003) ^ this.f10771c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f10769a);
        sb.append(", type=");
        int i3 = this.f10770b;
        sb.append(i3 == 1 ? "required" : i3 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m11162a(this.f10771c));
        sb.append("}");
        return sb.toString();
    }

    private C2337r(C2318E c2318e, int i3, int i4) {
        this.f10769a = (C2318E) AbstractC2317D.m11082c(c2318e, "Null dependency anInterface.");
        this.f10770b = i3;
        this.f10771c = i4;
    }
}
