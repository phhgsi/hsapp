package p147s0;

/* JADX INFO: renamed from: s0.h */
/* JADX INFO: loaded from: classes.dex */
final class C2399h extends AbstractC2405n {

    /* JADX INFO: renamed from: a */
    private final long f11184a;

    C2399h(long j3) {
        this.f11184a = j3;
    }

    @Override // p147s0.AbstractC2405n
    /* JADX INFO: renamed from: c */
    public long mo11566c() {
        return this.f11184a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC2405n) && this.f11184a == ((AbstractC2405n) obj).mo11566c();
    }

    public int hashCode() {
        long j3 = this.f11184a;
        return ((int) (j3 ^ (j3 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f11184a + "}";
    }
}
