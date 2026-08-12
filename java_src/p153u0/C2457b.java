package p153u0;

import p153u0.AbstractC2462g;

/* JADX INFO: renamed from: u0.b */
/* JADX INFO: loaded from: classes.dex */
final class C2457b extends AbstractC2462g {

    /* JADX INFO: renamed from: a */
    private final AbstractC2462g.a f11441a;

    /* JADX INFO: renamed from: b */
    private final long f11442b;

    C2457b(AbstractC2462g.a aVar, long j3) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f11441a = aVar;
        this.f11442b = j3;
    }

    @Override // p153u0.AbstractC2462g
    /* JADX INFO: renamed from: b */
    public long mo11760b() {
        return this.f11442b;
    }

    @Override // p153u0.AbstractC2462g
    /* JADX INFO: renamed from: c */
    public AbstractC2462g.a mo11761c() {
        return this.f11441a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2462g) {
            AbstractC2462g abstractC2462g = (AbstractC2462g) obj;
            if (this.f11441a.equals(abstractC2462g.mo11761c()) && this.f11442b == abstractC2462g.mo11760b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f11441a.hashCode() ^ 1000003) * 1000003;
        long j3 = this.f11442b;
        return iHashCode ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f11441a + ", nextRequestWaitMillis=" + this.f11442b + "}";
    }
}
