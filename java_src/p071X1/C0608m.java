package p071X1;

/* JADX INFO: renamed from: X1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0608m implements InterfaceC0599d {

    /* JADX INFO: renamed from: a */
    private final Class f2008a;

    /* JADX INFO: renamed from: b */
    private final String f2009b;

    public C0608m(Class cls, String str) {
        AbstractC0606k.m2145e(cls, "jClass");
        AbstractC0606k.m2145e(str, "moduleName");
        this.f2008a = cls;
        this.f2009b = str;
    }

    @Override // p071X1.InterfaceC0599d
    /* JADX INFO: renamed from: a */
    public Class mo2138a() {
        return this.f2008a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0608m) && AbstractC0606k.m2141a(mo2138a(), ((C0608m) obj).mo2138a());
    }

    public int hashCode() {
        return mo2138a().hashCode();
    }

    public String toString() {
        return mo2138a() + " (Kotlin reflection is not available)";
    }
}
