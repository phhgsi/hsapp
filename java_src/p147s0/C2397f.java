package p147s0;

import java.util.Arrays;
import p147s0.AbstractC2403l;

/* JADX INFO: renamed from: s0.f */
/* JADX INFO: loaded from: classes.dex */
final class C2397f extends AbstractC2403l {

    /* JADX INFO: renamed from: a */
    private final long f11156a;

    /* JADX INFO: renamed from: b */
    private final Integer f11157b;

    /* JADX INFO: renamed from: c */
    private final long f11158c;

    /* JADX INFO: renamed from: d */
    private final byte[] f11159d;

    /* JADX INFO: renamed from: e */
    private final String f11160e;

    /* JADX INFO: renamed from: f */
    private final long f11161f;

    /* JADX INFO: renamed from: g */
    private final AbstractC2406o f11162g;

    /* JADX INFO: renamed from: s0.f$b */
    static final class b extends AbstractC2403l.a {

        /* JADX INFO: renamed from: a */
        private Long f11163a;

        /* JADX INFO: renamed from: b */
        private Integer f11164b;

        /* JADX INFO: renamed from: c */
        private Long f11165c;

        /* JADX INFO: renamed from: d */
        private byte[] f11166d;

        /* JADX INFO: renamed from: e */
        private String f11167e;

        /* JADX INFO: renamed from: f */
        private Long f11168f;

        /* JADX INFO: renamed from: g */
        private AbstractC2406o f11169g;

        b() {
        }

        @Override // p147s0.AbstractC2403l.a
        /* JADX INFO: renamed from: a */
        public AbstractC2403l mo11543a() {
            String str = "";
            if (this.f11163a == null) {
                str = " eventTimeMs";
            }
            if (this.f11165c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f11168f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C2397f(this.f11163a.longValue(), this.f11164b, this.f11165c.longValue(), this.f11166d, this.f11167e, this.f11168f.longValue(), this.f11169g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p147s0.AbstractC2403l.a
        /* JADX INFO: renamed from: b */
        public AbstractC2403l.a mo11544b(Integer num) {
            this.f11164b = num;
            return this;
        }

        @Override // p147s0.AbstractC2403l.a
        /* JADX INFO: renamed from: c */
        public AbstractC2403l.a mo11545c(long j3) {
            this.f11163a = Long.valueOf(j3);
            return this;
        }

        @Override // p147s0.AbstractC2403l.a
        /* JADX INFO: renamed from: d */
        public AbstractC2403l.a mo11546d(long j3) {
            this.f11165c = Long.valueOf(j3);
            return this;
        }

        @Override // p147s0.AbstractC2403l.a
        /* JADX INFO: renamed from: e */
        public AbstractC2403l.a mo11547e(AbstractC2406o abstractC2406o) {
            this.f11169g = abstractC2406o;
            return this;
        }

        @Override // p147s0.AbstractC2403l.a
        /* JADX INFO: renamed from: f */
        AbstractC2403l.a mo11548f(byte[] bArr) {
            this.f11166d = bArr;
            return this;
        }

        @Override // p147s0.AbstractC2403l.a
        /* JADX INFO: renamed from: g */
        AbstractC2403l.a mo11549g(String str) {
            this.f11167e = str;
            return this;
        }

        @Override // p147s0.AbstractC2403l.a
        /* JADX INFO: renamed from: h */
        public AbstractC2403l.a mo11550h(long j3) {
            this.f11168f = Long.valueOf(j3);
            return this;
        }
    }

    @Override // p147s0.AbstractC2403l
    /* JADX INFO: renamed from: b */
    public Integer mo11536b() {
        return this.f11157b;
    }

    @Override // p147s0.AbstractC2403l
    /* JADX INFO: renamed from: c */
    public long mo11537c() {
        return this.f11156a;
    }

    @Override // p147s0.AbstractC2403l
    /* JADX INFO: renamed from: d */
    public long mo11538d() {
        return this.f11158c;
    }

    @Override // p147s0.AbstractC2403l
    /* JADX INFO: renamed from: e */
    public AbstractC2406o mo11539e() {
        return this.f11162g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        AbstractC2406o abstractC2406o;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2403l) {
            AbstractC2403l abstractC2403l = (AbstractC2403l) obj;
            if (this.f11156a == abstractC2403l.mo11537c() && ((num = this.f11157b) != null ? num.equals(abstractC2403l.mo11536b()) : abstractC2403l.mo11536b() == null) && this.f11158c == abstractC2403l.mo11538d()) {
                if (Arrays.equals(this.f11159d, abstractC2403l instanceof C2397f ? ((C2397f) abstractC2403l).f11159d : abstractC2403l.mo11540f()) && ((str = this.f11160e) != null ? str.equals(abstractC2403l.mo11541g()) : abstractC2403l.mo11541g() == null) && this.f11161f == abstractC2403l.mo11542h() && ((abstractC2406o = this.f11162g) != null ? abstractC2406o.equals(abstractC2403l.mo11539e()) : abstractC2403l.mo11539e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p147s0.AbstractC2403l
    /* JADX INFO: renamed from: f */
    public byte[] mo11540f() {
        return this.f11159d;
    }

    @Override // p147s0.AbstractC2403l
    /* JADX INFO: renamed from: g */
    public String mo11541g() {
        return this.f11160e;
    }

    @Override // p147s0.AbstractC2403l
    /* JADX INFO: renamed from: h */
    public long mo11542h() {
        return this.f11161f;
    }

    public int hashCode() {
        long j3 = this.f11156a;
        int i3 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f11157b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j4 = this.f11158c;
        int iHashCode2 = (((((i3 ^ iHashCode) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f11159d)) * 1000003;
        String str = this.f11160e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j5 = this.f11161f;
        int i4 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003;
        AbstractC2406o abstractC2406o = this.f11162g;
        return i4 ^ (abstractC2406o != null ? abstractC2406o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f11156a + ", eventCode=" + this.f11157b + ", eventUptimeMs=" + this.f11158c + ", sourceExtension=" + Arrays.toString(this.f11159d) + ", sourceExtensionJsonProto3=" + this.f11160e + ", timezoneOffsetSeconds=" + this.f11161f + ", networkConnectionInfo=" + this.f11162g + "}";
    }

    private C2397f(long j3, Integer num, long j4, byte[] bArr, String str, long j5, AbstractC2406o abstractC2406o) {
        this.f11156a = j3;
        this.f11157b = num;
        this.f11158c = j4;
        this.f11159d = bArr;
        this.f11160e = str;
        this.f11161f = j5;
        this.f11162g = abstractC2406o;
    }
}
