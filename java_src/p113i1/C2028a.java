package p113i1;

/* JADX INFO: renamed from: i1.a */
/* JADX INFO: loaded from: classes.dex */
final class C2028a extends AbstractC2034g {

    /* JADX INFO: renamed from: d */
    static final C2028a f9643d = new C2028a();

    private C2028a() {
    }

    /* JADX INFO: renamed from: e */
    static AbstractC2034g m10219e() {
        return f9643d;
    }

    @Override // p113i1.AbstractC2034g
    /* JADX INFO: renamed from: b */
    public Object mo10220b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p113i1.AbstractC2034g
    /* JADX INFO: renamed from: c */
    public boolean mo10221c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
