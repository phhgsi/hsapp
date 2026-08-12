package p011D1;

import p011D1.AbstractC0101d;

/* JADX INFO: renamed from: D1.a */
/* JADX INFO: loaded from: classes.dex */
final class C0098a extends AbstractC0101d {

    /* JADX INFO: renamed from: a */
    private final String f187a;

    /* JADX INFO: renamed from: b */
    private final String f188b;

    /* JADX INFO: renamed from: c */
    private final String f189c;

    /* JADX INFO: renamed from: d */
    private final AbstractC0103f f190d;

    /* JADX INFO: renamed from: e */
    private final AbstractC0101d.b f191e;

    /* JADX INFO: renamed from: D1.a$b */
    static final class b extends AbstractC0101d.a {

        /* JADX INFO: renamed from: a */
        private String f192a;

        /* JADX INFO: renamed from: b */
        private String f193b;

        /* JADX INFO: renamed from: c */
        private String f194c;

        /* JADX INFO: renamed from: d */
        private AbstractC0103f f195d;

        /* JADX INFO: renamed from: e */
        private AbstractC0101d.b f196e;

        b() {
        }

        @Override // p011D1.AbstractC0101d.a
        /* JADX INFO: renamed from: a */
        public AbstractC0101d mo275a() {
            return new C0098a(this.f192a, this.f193b, this.f194c, this.f195d, this.f196e);
        }

        @Override // p011D1.AbstractC0101d.a
        /* JADX INFO: renamed from: b */
        public AbstractC0101d.a mo276b(AbstractC0103f abstractC0103f) {
            this.f195d = abstractC0103f;
            return this;
        }

        @Override // p011D1.AbstractC0101d.a
        /* JADX INFO: renamed from: c */
        public AbstractC0101d.a mo277c(String str) {
            this.f193b = str;
            return this;
        }

        @Override // p011D1.AbstractC0101d.a
        /* JADX INFO: renamed from: d */
        public AbstractC0101d.a mo278d(String str) {
            this.f194c = str;
            return this;
        }

        @Override // p011D1.AbstractC0101d.a
        /* JADX INFO: renamed from: e */
        public AbstractC0101d.a mo279e(AbstractC0101d.b bVar) {
            this.f196e = bVar;
            return this;
        }

        @Override // p011D1.AbstractC0101d.a
        /* JADX INFO: renamed from: f */
        public AbstractC0101d.a mo280f(String str) {
            this.f192a = str;
            return this;
        }
    }

    @Override // p011D1.AbstractC0101d
    /* JADX INFO: renamed from: b */
    public AbstractC0103f mo270b() {
        return this.f190d;
    }

    @Override // p011D1.AbstractC0101d
    /* JADX INFO: renamed from: c */
    public String mo271c() {
        return this.f188b;
    }

    @Override // p011D1.AbstractC0101d
    /* JADX INFO: renamed from: d */
    public String mo272d() {
        return this.f189c;
    }

    @Override // p011D1.AbstractC0101d
    /* JADX INFO: renamed from: e */
    public AbstractC0101d.b mo273e() {
        return this.f191e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0101d) {
            AbstractC0101d abstractC0101d = (AbstractC0101d) obj;
            String str = this.f187a;
            if (str != null ? str.equals(abstractC0101d.mo274f()) : abstractC0101d.mo274f() == null) {
                String str2 = this.f188b;
                if (str2 != null ? str2.equals(abstractC0101d.mo271c()) : abstractC0101d.mo271c() == null) {
                    String str3 = this.f189c;
                    if (str3 != null ? str3.equals(abstractC0101d.mo272d()) : abstractC0101d.mo272d() == null) {
                        AbstractC0103f abstractC0103f = this.f190d;
                        if (abstractC0103f != null ? abstractC0103f.equals(abstractC0101d.mo270b()) : abstractC0101d.mo270b() == null) {
                            AbstractC0101d.b bVar = this.f191e;
                            if (bVar != null ? bVar.equals(abstractC0101d.mo273e()) : abstractC0101d.mo273e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p011D1.AbstractC0101d
    /* JADX INFO: renamed from: f */
    public String mo274f() {
        return this.f187a;
    }

    public int hashCode() {
        String str = this.f187a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f188b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f189c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC0103f abstractC0103f = this.f190d;
        int iHashCode4 = (iHashCode3 ^ (abstractC0103f == null ? 0 : abstractC0103f.hashCode())) * 1000003;
        AbstractC0101d.b bVar = this.f191e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f187a + ", fid=" + this.f188b + ", refreshToken=" + this.f189c + ", authToken=" + this.f190d + ", responseCode=" + this.f191e + "}";
    }

    private C0098a(String str, String str2, String str3, AbstractC0103f abstractC0103f, AbstractC0101d.b bVar) {
        this.f187a = str;
        this.f188b = str2;
        this.f189c = str3;
        this.f190d = abstractC0103f;
        this.f191e = bVar;
    }
}
