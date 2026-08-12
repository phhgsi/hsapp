package p008C1;

import p008C1.AbstractC0090d;
import p008C1.C0089c;

/* JADX INFO: renamed from: C1.a */
/* JADX INFO: loaded from: classes.dex */
final class C0087a extends AbstractC0090d {

    /* JADX INFO: renamed from: b */
    private final String f159b;

    /* JADX INFO: renamed from: c */
    private final C0089c.a f160c;

    /* JADX INFO: renamed from: d */
    private final String f161d;

    /* JADX INFO: renamed from: e */
    private final String f162e;

    /* JADX INFO: renamed from: f */
    private final long f163f;

    /* JADX INFO: renamed from: g */
    private final long f164g;

    /* JADX INFO: renamed from: h */
    private final String f165h;

    /* JADX INFO: renamed from: C1.a$b */
    static final class b extends AbstractC0090d.a {

        /* JADX INFO: renamed from: a */
        private String f166a;

        /* JADX INFO: renamed from: b */
        private C0089c.a f167b;

        /* JADX INFO: renamed from: c */
        private String f168c;

        /* JADX INFO: renamed from: d */
        private String f169d;

        /* JADX INFO: renamed from: e */
        private Long f170e;

        /* JADX INFO: renamed from: f */
        private Long f171f;

        /* JADX INFO: renamed from: g */
        private String f172g;

        @Override // p008C1.AbstractC0090d.a
        /* JADX INFO: renamed from: a */
        public AbstractC0090d mo223a() {
            String str = "";
            if (this.f167b == null) {
                str = " registrationStatus";
            }
            if (this.f170e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f171f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C0087a(this.f166a, this.f167b, this.f168c, this.f169d, this.f170e.longValue(), this.f171f.longValue(), this.f172g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p008C1.AbstractC0090d.a
        /* JADX INFO: renamed from: b */
        public AbstractC0090d.a mo224b(String str) {
            this.f168c = str;
            return this;
        }

        @Override // p008C1.AbstractC0090d.a
        /* JADX INFO: renamed from: c */
        public AbstractC0090d.a mo225c(long j3) {
            this.f170e = Long.valueOf(j3);
            return this;
        }

        @Override // p008C1.AbstractC0090d.a
        /* JADX INFO: renamed from: d */
        public AbstractC0090d.a mo226d(String str) {
            this.f166a = str;
            return this;
        }

        @Override // p008C1.AbstractC0090d.a
        /* JADX INFO: renamed from: e */
        public AbstractC0090d.a mo227e(String str) {
            this.f172g = str;
            return this;
        }

        @Override // p008C1.AbstractC0090d.a
        /* JADX INFO: renamed from: f */
        public AbstractC0090d.a mo228f(String str) {
            this.f169d = str;
            return this;
        }

        @Override // p008C1.AbstractC0090d.a
        /* JADX INFO: renamed from: g */
        public AbstractC0090d.a mo229g(C0089c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f167b = aVar;
            return this;
        }

        @Override // p008C1.AbstractC0090d.a
        /* JADX INFO: renamed from: h */
        public AbstractC0090d.a mo230h(long j3) {
            this.f171f = Long.valueOf(j3);
            return this;
        }

        b() {
        }

        private b(AbstractC0090d abstractC0090d) {
            this.f166a = abstractC0090d.mo217d();
            this.f167b = abstractC0090d.mo220g();
            this.f168c = abstractC0090d.mo215b();
            this.f169d = abstractC0090d.mo219f();
            this.f170e = Long.valueOf(abstractC0090d.mo216c());
            this.f171f = Long.valueOf(abstractC0090d.mo221h());
            this.f172g = abstractC0090d.mo218e();
        }
    }

    @Override // p008C1.AbstractC0090d
    /* JADX INFO: renamed from: b */
    public String mo215b() {
        return this.f161d;
    }

    @Override // p008C1.AbstractC0090d
    /* JADX INFO: renamed from: c */
    public long mo216c() {
        return this.f163f;
    }

    @Override // p008C1.AbstractC0090d
    /* JADX INFO: renamed from: d */
    public String mo217d() {
        return this.f159b;
    }

    @Override // p008C1.AbstractC0090d
    /* JADX INFO: renamed from: e */
    public String mo218e() {
        return this.f165h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0090d) {
            AbstractC0090d abstractC0090d = (AbstractC0090d) obj;
            String str4 = this.f159b;
            if (str4 != null ? str4.equals(abstractC0090d.mo217d()) : abstractC0090d.mo217d() == null) {
                if (this.f160c.equals(abstractC0090d.mo220g()) && ((str = this.f161d) != null ? str.equals(abstractC0090d.mo215b()) : abstractC0090d.mo215b() == null) && ((str2 = this.f162e) != null ? str2.equals(abstractC0090d.mo219f()) : abstractC0090d.mo219f() == null) && this.f163f == abstractC0090d.mo216c() && this.f164g == abstractC0090d.mo221h() && ((str3 = this.f165h) != null ? str3.equals(abstractC0090d.mo218e()) : abstractC0090d.mo218e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p008C1.AbstractC0090d
    /* JADX INFO: renamed from: f */
    public String mo219f() {
        return this.f162e;
    }

    @Override // p008C1.AbstractC0090d
    /* JADX INFO: renamed from: g */
    public C0089c.a mo220g() {
        return this.f160c;
    }

    @Override // p008C1.AbstractC0090d
    /* JADX INFO: renamed from: h */
    public long mo221h() {
        return this.f164g;
    }

    public int hashCode() {
        String str = this.f159b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f160c.hashCode()) * 1000003;
        String str2 = this.f161d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f162e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j3 = this.f163f;
        int i3 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.f164g;
        int i4 = (i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str4 = this.f165h;
        return i4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // p008C1.AbstractC0090d
    /* JADX INFO: renamed from: n */
    public AbstractC0090d.a mo222n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f159b + ", registrationStatus=" + this.f160c + ", authToken=" + this.f161d + ", refreshToken=" + this.f162e + ", expiresInSecs=" + this.f163f + ", tokenCreationEpochInSecs=" + this.f164g + ", fisError=" + this.f165h + "}";
    }

    private C0087a(String str, C0089c.a aVar, String str2, String str3, long j3, long j4, String str4) {
        this.f159b = str;
        this.f160c = aVar;
        this.f161d = str2;
        this.f162e = str3;
        this.f163f = j3;
        this.f164g = j4;
        this.f165h = str4;
    }
}
