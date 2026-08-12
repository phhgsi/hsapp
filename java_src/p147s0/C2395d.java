package p147s0;

import java.util.List;

/* JADX INFO: renamed from: s0.d */
/* JADX INFO: loaded from: classes.dex */
final class C2395d extends AbstractC2401j {

    /* JADX INFO: renamed from: a */
    private final List f11151a;

    C2395d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f11151a = list;
    }

    @Override // p147s0.AbstractC2401j
    /* JADX INFO: renamed from: c */
    public List mo11530c() {
        return this.f11151a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2401j) {
            return this.f11151a.equals(((AbstractC2401j) obj).mo11530c());
        }
        return false;
    }

    public int hashCode() {
        return this.f11151a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f11151a + "}";
    }
}
