package p147s0;

import p147s0.AbstractC2406o;

/* JADX INFO: renamed from: s0.i */
/* JADX INFO: loaded from: classes.dex */
final class C2400i extends AbstractC2406o {

    /* JADX INFO: renamed from: a */
    private final AbstractC2406o.c f11185a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2406o.b f11186b;

    /* JADX INFO: renamed from: s0.i$b */
    static final class b extends AbstractC2406o.a {

        /* JADX INFO: renamed from: a */
        private AbstractC2406o.c f11187a;

        /* JADX INFO: renamed from: b */
        private AbstractC2406o.b f11188b;

        b() {
        }

        @Override // p147s0.AbstractC2406o.a
        /* JADX INFO: renamed from: a */
        public AbstractC2406o mo11569a() {
            return new C2400i(this.f11187a, this.f11188b);
        }

        @Override // p147s0.AbstractC2406o.a
        /* JADX INFO: renamed from: b */
        public AbstractC2406o.a mo11570b(AbstractC2406o.b bVar) {
            this.f11188b = bVar;
            return this;
        }

        @Override // p147s0.AbstractC2406o.a
        /* JADX INFO: renamed from: c */
        public AbstractC2406o.a mo11571c(AbstractC2406o.c cVar) {
            this.f11187a = cVar;
            return this;
        }
    }

    @Override // p147s0.AbstractC2406o
    /* JADX INFO: renamed from: b */
    public AbstractC2406o.b mo11567b() {
        return this.f11186b;
    }

    @Override // p147s0.AbstractC2406o
    /* JADX INFO: renamed from: c */
    public AbstractC2406o.c mo11568c() {
        return this.f11185a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2406o) {
            AbstractC2406o abstractC2406o = (AbstractC2406o) obj;
            AbstractC2406o.c cVar = this.f11185a;
            if (cVar != null ? cVar.equals(abstractC2406o.mo11568c()) : abstractC2406o.mo11568c() == null) {
                AbstractC2406o.b bVar = this.f11186b;
                if (bVar != null ? bVar.equals(abstractC2406o.mo11567b()) : abstractC2406o.mo11567b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC2406o.c cVar = this.f11185a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2406o.b bVar = this.f11186b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f11185a + ", mobileSubtype=" + this.f11186b + "}";
    }

    private C2400i(AbstractC2406o.c cVar, AbstractC2406o.b bVar) {
        this.f11185a = cVar;
        this.f11186b = bVar;
    }
}
