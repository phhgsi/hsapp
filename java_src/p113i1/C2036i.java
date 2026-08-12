package p113i1;

/* JADX INFO: renamed from: i1.i */
/* JADX INFO: loaded from: classes.dex */
final class C2036i extends AbstractC2034g {

    /* JADX INFO: renamed from: d */
    private final Object f9652d;

    C2036i(Object obj) {
        this.f9652d = obj;
    }

    @Override // p113i1.AbstractC2034g
    /* JADX INFO: renamed from: b */
    public Object mo10220b() {
        return this.f9652d;
    }

    @Override // p113i1.AbstractC2034g
    /* JADX INFO: renamed from: c */
    public boolean mo10221c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2036i) {
            return this.f9652d.equals(((C2036i) obj).f9652d);
        }
        return false;
    }

    public int hashCode() {
        return this.f9652d.hashCode() + 1502476572;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f9652d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
