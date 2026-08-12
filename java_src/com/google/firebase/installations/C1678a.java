package com.google.firebase.installations;

import com.google.firebase.installations.AbstractC1684g;

/* JADX INFO: renamed from: com.google.firebase.installations.a */
/* JADX INFO: loaded from: classes.dex */
final class C1678a extends AbstractC1684g {

    /* JADX INFO: renamed from: a */
    private final String f8421a;

    /* JADX INFO: renamed from: b */
    private final long f8422b;

    /* JADX INFO: renamed from: c */
    private final long f8423c;

    /* JADX INFO: renamed from: com.google.firebase.installations.a$b */
    static final class b extends AbstractC1684g.a {

        /* JADX INFO: renamed from: a */
        private String f8424a;

        /* JADX INFO: renamed from: b */
        private Long f8425b;

        /* JADX INFO: renamed from: c */
        private Long f8426c;

        b() {
        }

        @Override // com.google.firebase.installations.AbstractC1684g.a
        /* JADX INFO: renamed from: a */
        public AbstractC1684g mo9155a() {
            String str = "";
            if (this.f8424a == null) {
                str = " token";
            }
            if (this.f8425b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f8426c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C1678a(this.f8424a, this.f8425b.longValue(), this.f8426c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.AbstractC1684g.a
        /* JADX INFO: renamed from: b */
        public AbstractC1684g.a mo9156b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f8424a = str;
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC1684g.a
        /* JADX INFO: renamed from: c */
        public AbstractC1684g.a mo9157c(long j3) {
            this.f8426c = Long.valueOf(j3);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC1684g.a
        /* JADX INFO: renamed from: d */
        public AbstractC1684g.a mo9158d(long j3) {
            this.f8425b = Long.valueOf(j3);
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC1684g
    /* JADX INFO: renamed from: b */
    public String mo9152b() {
        return this.f8421a;
    }

    @Override // com.google.firebase.installations.AbstractC1684g
    /* JADX INFO: renamed from: c */
    public long mo9153c() {
        return this.f8423c;
    }

    @Override // com.google.firebase.installations.AbstractC1684g
    /* JADX INFO: renamed from: d */
    public long mo9154d() {
        return this.f8422b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1684g) {
            AbstractC1684g abstractC1684g = (AbstractC1684g) obj;
            if (this.f8421a.equals(abstractC1684g.mo9152b()) && this.f8422b == abstractC1684g.mo9154d() && this.f8423c == abstractC1684g.mo9153c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f8421a.hashCode() ^ 1000003) * 1000003;
        long j3 = this.f8422b;
        long j4 = this.f8423c;
        return ((iHashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f8421a + ", tokenExpirationTimestamp=" + this.f8422b + ", tokenCreationTimestamp=" + this.f8423c + "}";
    }

    private C1678a(String str, long j3, long j4) {
        this.f8421a = str;
        this.f8422b = j3;
        this.f8423c = j4;
    }
}
