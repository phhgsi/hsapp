package p004B0;

import p004B0.AbstractC0055e;

/* JADX INFO: renamed from: B0.a */
/* JADX INFO: loaded from: classes.dex */
final class C0051a extends AbstractC0055e {

    /* JADX INFO: renamed from: b */
    private final long f111b;

    /* JADX INFO: renamed from: c */
    private final int f112c;

    /* JADX INFO: renamed from: d */
    private final int f113d;

    /* JADX INFO: renamed from: e */
    private final long f114e;

    /* JADX INFO: renamed from: f */
    private final int f115f;

    /* JADX INFO: renamed from: B0.a$b */
    static final class b extends AbstractC0055e.a {

        /* JADX INFO: renamed from: a */
        private Long f116a;

        /* JADX INFO: renamed from: b */
        private Integer f117b;

        /* JADX INFO: renamed from: c */
        private Integer f118c;

        /* JADX INFO: renamed from: d */
        private Long f119d;

        /* JADX INFO: renamed from: e */
        private Integer f120e;

        b() {
        }

        @Override // p004B0.AbstractC0055e.a
        /* JADX INFO: renamed from: a */
        AbstractC0055e mo163a() {
            String str = "";
            if (this.f116a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f117b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f118c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f119d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f120e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0051a(this.f116a.longValue(), this.f117b.intValue(), this.f118c.intValue(), this.f119d.longValue(), this.f120e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p004B0.AbstractC0055e.a
        /* JADX INFO: renamed from: b */
        AbstractC0055e.a mo164b(int i3) {
            this.f118c = Integer.valueOf(i3);
            return this;
        }

        @Override // p004B0.AbstractC0055e.a
        /* JADX INFO: renamed from: c */
        AbstractC0055e.a mo165c(long j3) {
            this.f119d = Long.valueOf(j3);
            return this;
        }

        @Override // p004B0.AbstractC0055e.a
        /* JADX INFO: renamed from: d */
        AbstractC0055e.a mo166d(int i3) {
            this.f117b = Integer.valueOf(i3);
            return this;
        }

        @Override // p004B0.AbstractC0055e.a
        /* JADX INFO: renamed from: e */
        AbstractC0055e.a mo167e(int i3) {
            this.f120e = Integer.valueOf(i3);
            return this;
        }

        @Override // p004B0.AbstractC0055e.a
        /* JADX INFO: renamed from: f */
        AbstractC0055e.a mo168f(long j3) {
            this.f116a = Long.valueOf(j3);
            return this;
        }
    }

    @Override // p004B0.AbstractC0055e
    /* JADX INFO: renamed from: b */
    int mo158b() {
        return this.f113d;
    }

    @Override // p004B0.AbstractC0055e
    /* JADX INFO: renamed from: c */
    long mo159c() {
        return this.f114e;
    }

    @Override // p004B0.AbstractC0055e
    /* JADX INFO: renamed from: d */
    int mo160d() {
        return this.f112c;
    }

    @Override // p004B0.AbstractC0055e
    /* JADX INFO: renamed from: e */
    int mo161e() {
        return this.f115f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0055e) {
            AbstractC0055e abstractC0055e = (AbstractC0055e) obj;
            if (this.f111b == abstractC0055e.mo162f() && this.f112c == abstractC0055e.mo160d() && this.f113d == abstractC0055e.mo158b() && this.f114e == abstractC0055e.mo159c() && this.f115f == abstractC0055e.mo161e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p004B0.AbstractC0055e
    /* JADX INFO: renamed from: f */
    long mo162f() {
        return this.f111b;
    }

    public int hashCode() {
        long j3 = this.f111b;
        int i3 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f112c) * 1000003) ^ this.f113d) * 1000003;
        long j4 = this.f114e;
        return ((i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f115f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f111b + ", loadBatchSize=" + this.f112c + ", criticalSectionEnterTimeoutMs=" + this.f113d + ", eventCleanUpAge=" + this.f114e + ", maxBlobByteSizePerRow=" + this.f115f + "}";
    }

    private C0051a(long j3, int i3, int i4, long j4, int i5) {
        this.f111b = j3;
        this.f112c = i3;
        this.f113d = i4;
        this.f114e = j4;
        this.f115f = i5;
    }
}
