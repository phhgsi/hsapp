package p102f2;

/* JADX INFO: renamed from: f2.O */
/* JADX INFO: loaded from: classes.dex */
final class C1909O implements InterfaceC1921a0 {

    /* JADX INFO: renamed from: a */
    private final boolean f9416a;

    public C1909O(boolean z2) {
        this.f9416a = z2;
    }

    @Override // p102f2.InterfaceC1921a0
    /* JADX INFO: renamed from: a */
    public boolean mo9816a() {
        return this.f9416a;
    }

    @Override // p102f2.InterfaceC1921a0
    /* JADX INFO: renamed from: e */
    public C1955r0 mo9817e() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo9816a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
