package p011D1;

import p011D1.AbstractC0103f;

/* JADX INFO: renamed from: D1.b */
/* JADX INFO: loaded from: classes.dex */
final class C0099b extends AbstractC0103f {

    /* JADX INFO: renamed from: a */
    private final String f197a;

    /* JADX INFO: renamed from: b */
    private final long f198b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0103f.b f199c;

    /* JADX INFO: renamed from: D1.b$b */
    static final class b extends AbstractC0103f.a {

        /* JADX INFO: renamed from: a */
        private String f200a;

        /* JADX INFO: renamed from: b */
        private Long f201b;

        /* JADX INFO: renamed from: c */
        private AbstractC0103f.b f202c;

        b() {
        }

        @Override // p011D1.AbstractC0103f.a
        /* JADX INFO: renamed from: a */
        public AbstractC0103f mo284a() {
            String str = "";
            if (this.f201b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C0099b(this.f200a, this.f201b.longValue(), this.f202c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p011D1.AbstractC0103f.a
        /* JADX INFO: renamed from: b */
        public AbstractC0103f.a mo285b(AbstractC0103f.b bVar) {
            this.f202c = bVar;
            return this;
        }

        @Override // p011D1.AbstractC0103f.a
        /* JADX INFO: renamed from: c */
        public AbstractC0103f.a mo286c(String str) {
            this.f200a = str;
            return this;
        }

        @Override // p011D1.AbstractC0103f.a
        /* JADX INFO: renamed from: d */
        public AbstractC0103f.a mo287d(long j3) {
            this.f201b = Long.valueOf(j3);
            return this;
        }
    }

    @Override // p011D1.AbstractC0103f
    /* JADX INFO: renamed from: b */
    public AbstractC0103f.b mo281b() {
        return this.f199c;
    }

    @Override // p011D1.AbstractC0103f
    /* JADX INFO: renamed from: c */
    public String mo282c() {
        return this.f197a;
    }

    @Override // p011D1.AbstractC0103f
    /* JADX INFO: renamed from: d */
    public long mo283d() {
        return this.f198b;
    }

    public boolean equals(Object obj) {
        AbstractC0103f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0103f) {
            AbstractC0103f abstractC0103f = (AbstractC0103f) obj;
            String str = this.f197a;
            if (str != null ? str.equals(abstractC0103f.mo282c()) : abstractC0103f.mo282c() == null) {
                if (this.f198b == abstractC0103f.mo283d() && ((bVar = this.f199c) != null ? bVar.equals(abstractC0103f.mo281b()) : abstractC0103f.mo281b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f197a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j3 = this.f198b;
        int i3 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC0103f.b bVar = this.f199c;
        return i3 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f197a + ", tokenExpirationTimestamp=" + this.f198b + ", responseCode=" + this.f199c + "}";
    }

    private C0099b(String str, long j3, AbstractC0103f.b bVar) {
        this.f197a = str;
        this.f198b = j3;
        this.f199c = bVar;
    }
}
