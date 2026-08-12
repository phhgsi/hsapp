package p026I1;

/* JADX INFO: renamed from: I1.a */
/* JADX INFO: loaded from: classes.dex */
final class C0216a extends AbstractC0221f {

    /* JADX INFO: renamed from: a */
    private final String f1241a;

    /* JADX INFO: renamed from: b */
    private final String f1242b;

    C0216a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f1241a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f1242b = str2;
    }

    @Override // p026I1.AbstractC0221f
    /* JADX INFO: renamed from: b */
    public String mo614b() {
        return this.f1241a;
    }

    @Override // p026I1.AbstractC0221f
    /* JADX INFO: renamed from: c */
    public String mo615c() {
        return this.f1242b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0221f) {
            AbstractC0221f abstractC0221f = (AbstractC0221f) obj;
            if (this.f1241a.equals(abstractC0221f.mo614b()) && this.f1242b.equals(abstractC0221f.mo615c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1241a.hashCode() ^ 1000003) * 1000003) ^ this.f1242b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f1241a + ", version=" + this.f1242b + "}";
    }
}
