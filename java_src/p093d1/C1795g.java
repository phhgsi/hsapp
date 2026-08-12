package p093d1;

/* JADX INFO: renamed from: d1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1795g {

    /* JADX INFO: renamed from: a */
    private C1802n f9169a;

    /* synthetic */ C1795g(AbstractC1794f abstractC1794f) {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1793e m9552a() {
        C1802n c1802n = this.f9169a;
        if (c1802n != null) {
            return new C1788C(c1802n, null);
        }
        throw new IllegalStateException(String.valueOf(C1802n.class.getCanonicalName()).concat(" must be set"));
    }

    /* JADX INFO: renamed from: b */
    public final C1795g m9553b(C1802n c1802n) {
        this.f9169a = c1802n;
        return this;
    }
}
