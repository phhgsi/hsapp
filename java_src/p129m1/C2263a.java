package p129m1;

/* JADX INFO: renamed from: m1.a */
/* JADX INFO: loaded from: classes.dex */
final class C2263a extends AbstractC2275m {

    /* JADX INFO: renamed from: a */
    private final long f10404a;

    /* JADX INFO: renamed from: b */
    private final long f10405b;

    /* JADX INFO: renamed from: c */
    private final long f10406c;

    C2263a(long j3, long j4, long j5) {
        this.f10404a = j3;
        this.f10405b = j4;
        this.f10406c = j5;
    }

    @Override // p129m1.AbstractC2275m
    /* JADX INFO: renamed from: b */
    public long mo10829b() {
        return this.f10405b;
    }

    @Override // p129m1.AbstractC2275m
    /* JADX INFO: renamed from: c */
    public long mo10830c() {
        return this.f10404a;
    }

    @Override // p129m1.AbstractC2275m
    /* JADX INFO: renamed from: d */
    public long mo10831d() {
        return this.f10406c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2275m) {
            AbstractC2275m abstractC2275m = (AbstractC2275m) obj;
            if (this.f10404a == abstractC2275m.mo10830c() && this.f10405b == abstractC2275m.mo10829b() && this.f10406c == abstractC2275m.mo10831d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j3 = this.f10404a;
        long j4 = this.f10405b;
        int i3 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f10406c;
        return i3 ^ ((int) ((j5 >>> 32) ^ j5));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f10404a + ", elapsedRealtime=" + this.f10405b + ", uptimeMillis=" + this.f10406c + "}";
    }
}
