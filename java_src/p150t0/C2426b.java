package p150t0;

import java.util.Map;
import p150t0.AbstractC2433i;

/* JADX INFO: renamed from: t0.b */
/* JADX INFO: loaded from: classes.dex */
final class C2426b extends AbstractC2433i {

    /* JADX INFO: renamed from: a */
    private final String f11366a;

    /* JADX INFO: renamed from: b */
    private final Integer f11367b;

    /* JADX INFO: renamed from: c */
    private final C2432h f11368c;

    /* JADX INFO: renamed from: d */
    private final long f11369d;

    /* JADX INFO: renamed from: e */
    private final long f11370e;

    /* JADX INFO: renamed from: f */
    private final Map f11371f;

    /* JADX INFO: renamed from: t0.b$b */
    static final class b extends AbstractC2433i.a {

        /* JADX INFO: renamed from: a */
        private String f11372a;

        /* JADX INFO: renamed from: b */
        private Integer f11373b;

        /* JADX INFO: renamed from: c */
        private C2432h f11374c;

        /* JADX INFO: renamed from: d */
        private Long f11375d;

        /* JADX INFO: renamed from: e */
        private Long f11376e;

        /* JADX INFO: renamed from: f */
        private Map f11377f;

        b() {
        }

        @Override // p150t0.AbstractC2433i.a
        /* JADX INFO: renamed from: d */
        public AbstractC2433i mo11674d() {
            String str = "";
            if (this.f11372a == null) {
                str = " transportName";
            }
            if (this.f11374c == null) {
                str = str + " encodedPayload";
            }
            if (this.f11375d == null) {
                str = str + " eventMillis";
            }
            if (this.f11376e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f11377f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C2426b(this.f11372a, this.f11373b, this.f11374c, this.f11375d.longValue(), this.f11376e.longValue(), this.f11377f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p150t0.AbstractC2433i.a
        /* JADX INFO: renamed from: e */
        protected Map mo11675e() {
            Map map = this.f11377f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p150t0.AbstractC2433i.a
        /* JADX INFO: renamed from: f */
        protected AbstractC2433i.a mo11676f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f11377f = map;
            return this;
        }

        @Override // p150t0.AbstractC2433i.a
        /* JADX INFO: renamed from: g */
        public AbstractC2433i.a mo11677g(Integer num) {
            this.f11373b = num;
            return this;
        }

        @Override // p150t0.AbstractC2433i.a
        /* JADX INFO: renamed from: h */
        public AbstractC2433i.a mo11678h(C2432h c2432h) {
            if (c2432h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f11374c = c2432h;
            return this;
        }

        @Override // p150t0.AbstractC2433i.a
        /* JADX INFO: renamed from: i */
        public AbstractC2433i.a mo11679i(long j3) {
            this.f11375d = Long.valueOf(j3);
            return this;
        }

        @Override // p150t0.AbstractC2433i.a
        /* JADX INFO: renamed from: j */
        public AbstractC2433i.a mo11680j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f11372a = str;
            return this;
        }

        @Override // p150t0.AbstractC2433i.a
        /* JADX INFO: renamed from: k */
        public AbstractC2433i.a mo11681k(long j3) {
            this.f11376e = Long.valueOf(j3);
            return this;
        }
    }

    @Override // p150t0.AbstractC2433i
    /* JADX INFO: renamed from: c */
    protected Map mo11668c() {
        return this.f11371f;
    }

    @Override // p150t0.AbstractC2433i
    /* JADX INFO: renamed from: d */
    public Integer mo11669d() {
        return this.f11367b;
    }

    @Override // p150t0.AbstractC2433i
    /* JADX INFO: renamed from: e */
    public C2432h mo11670e() {
        return this.f11368c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2433i) {
            AbstractC2433i abstractC2433i = (AbstractC2433i) obj;
            if (this.f11366a.equals(abstractC2433i.mo11672j()) && ((num = this.f11367b) != null ? num.equals(abstractC2433i.mo11669d()) : abstractC2433i.mo11669d() == null) && this.f11368c.equals(abstractC2433i.mo11670e()) && this.f11369d == abstractC2433i.mo11671f() && this.f11370e == abstractC2433i.mo11673k() && this.f11371f.equals(abstractC2433i.mo11668c())) {
                return true;
            }
        }
        return false;
    }

    @Override // p150t0.AbstractC2433i
    /* JADX INFO: renamed from: f */
    public long mo11671f() {
        return this.f11369d;
    }

    public int hashCode() {
        int iHashCode = (this.f11366a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f11367b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f11368c.hashCode()) * 1000003;
        long j3 = this.f11369d;
        int i3 = (iHashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.f11370e;
        return ((i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f11371f.hashCode();
    }

    @Override // p150t0.AbstractC2433i
    /* JADX INFO: renamed from: j */
    public String mo11672j() {
        return this.f11366a;
    }

    @Override // p150t0.AbstractC2433i
    /* JADX INFO: renamed from: k */
    public long mo11673k() {
        return this.f11370e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f11366a + ", code=" + this.f11367b + ", encodedPayload=" + this.f11368c + ", eventMillis=" + this.f11369d + ", uptimeMillis=" + this.f11370e + ", autoMetadata=" + this.f11371f + "}";
    }

    private C2426b(String str, Integer num, C2432h c2432h, long j3, long j4, Map map) {
        this.f11366a = str;
        this.f11367b = num;
        this.f11368c = c2432h;
        this.f11369d = j3;
        this.f11370e = j4;
        this.f11371f = map;
    }
}
