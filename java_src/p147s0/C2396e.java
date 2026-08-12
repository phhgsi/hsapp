package p147s0;

import p147s0.AbstractC2402k;

/* JADX INFO: renamed from: s0.e */
/* JADX INFO: loaded from: classes.dex */
final class C2396e extends AbstractC2402k {

    /* JADX INFO: renamed from: a */
    private final AbstractC2402k.b f11152a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2392a f11153b;

    /* JADX INFO: renamed from: s0.e$b */
    static final class b extends AbstractC2402k.a {

        /* JADX INFO: renamed from: a */
        private AbstractC2402k.b f11154a;

        /* JADX INFO: renamed from: b */
        private AbstractC2392a f11155b;

        b() {
        }

        @Override // p147s0.AbstractC2402k.a
        /* JADX INFO: renamed from: a */
        public AbstractC2402k mo11533a() {
            return new C2396e(this.f11154a, this.f11155b);
        }

        @Override // p147s0.AbstractC2402k.a
        /* JADX INFO: renamed from: b */
        public AbstractC2402k.a mo11534b(AbstractC2392a abstractC2392a) {
            this.f11155b = abstractC2392a;
            return this;
        }

        @Override // p147s0.AbstractC2402k.a
        /* JADX INFO: renamed from: c */
        public AbstractC2402k.a mo11535c(AbstractC2402k.b bVar) {
            this.f11154a = bVar;
            return this;
        }
    }

    @Override // p147s0.AbstractC2402k
    /* JADX INFO: renamed from: b */
    public AbstractC2392a mo11531b() {
        return this.f11153b;
    }

    @Override // p147s0.AbstractC2402k
    /* JADX INFO: renamed from: c */
    public AbstractC2402k.b mo11532c() {
        return this.f11152a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2402k) {
            AbstractC2402k abstractC2402k = (AbstractC2402k) obj;
            AbstractC2402k.b bVar = this.f11152a;
            if (bVar != null ? bVar.equals(abstractC2402k.mo11532c()) : abstractC2402k.mo11532c() == null) {
                AbstractC2392a abstractC2392a = this.f11153b;
                if (abstractC2392a != null ? abstractC2392a.equals(abstractC2402k.mo11531b()) : abstractC2402k.mo11531b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC2402k.b bVar = this.f11152a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2392a abstractC2392a = this.f11153b;
        return iHashCode ^ (abstractC2392a != null ? abstractC2392a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f11152a + ", androidClientInfo=" + this.f11153b + "}";
    }

    private C2396e(AbstractC2402k.b bVar, AbstractC2392a abstractC2392a) {
        this.f11152a = bVar;
        this.f11153b = abstractC2392a;
    }
}
