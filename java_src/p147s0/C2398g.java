package p147s0;

import java.util.List;
import p147s0.AbstractC2404m;

/* JADX INFO: renamed from: s0.g */
/* JADX INFO: loaded from: classes.dex */
final class C2398g extends AbstractC2404m {

    /* JADX INFO: renamed from: a */
    private final long f11170a;

    /* JADX INFO: renamed from: b */
    private final long f11171b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2402k f11172c;

    /* JADX INFO: renamed from: d */
    private final Integer f11173d;

    /* JADX INFO: renamed from: e */
    private final String f11174e;

    /* JADX INFO: renamed from: f */
    private final List f11175f;

    /* JADX INFO: renamed from: g */
    private final EnumC2407p f11176g;

    /* JADX INFO: renamed from: s0.g$b */
    static final class b extends AbstractC2404m.a {

        /* JADX INFO: renamed from: a */
        private Long f11177a;

        /* JADX INFO: renamed from: b */
        private Long f11178b;

        /* JADX INFO: renamed from: c */
        private AbstractC2402k f11179c;

        /* JADX INFO: renamed from: d */
        private Integer f11180d;

        /* JADX INFO: renamed from: e */
        private String f11181e;

        /* JADX INFO: renamed from: f */
        private List f11182f;

        /* JADX INFO: renamed from: g */
        private EnumC2407p f11183g;

        b() {
        }

        @Override // p147s0.AbstractC2404m.a
        /* JADX INFO: renamed from: a */
        public AbstractC2404m mo11558a() {
            String str = "";
            if (this.f11177a == null) {
                str = " requestTimeMs";
            }
            if (this.f11178b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C2398g(this.f11177a.longValue(), this.f11178b.longValue(), this.f11179c, this.f11180d, this.f11181e, this.f11182f, this.f11183g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p147s0.AbstractC2404m.a
        /* JADX INFO: renamed from: b */
        public AbstractC2404m.a mo11559b(AbstractC2402k abstractC2402k) {
            this.f11179c = abstractC2402k;
            return this;
        }

        @Override // p147s0.AbstractC2404m.a
        /* JADX INFO: renamed from: c */
        public AbstractC2404m.a mo11560c(List list) {
            this.f11182f = list;
            return this;
        }

        @Override // p147s0.AbstractC2404m.a
        /* JADX INFO: renamed from: d */
        AbstractC2404m.a mo11561d(Integer num) {
            this.f11180d = num;
            return this;
        }

        @Override // p147s0.AbstractC2404m.a
        /* JADX INFO: renamed from: e */
        AbstractC2404m.a mo11562e(String str) {
            this.f11181e = str;
            return this;
        }

        @Override // p147s0.AbstractC2404m.a
        /* JADX INFO: renamed from: f */
        public AbstractC2404m.a mo11563f(EnumC2407p enumC2407p) {
            this.f11183g = enumC2407p;
            return this;
        }

        @Override // p147s0.AbstractC2404m.a
        /* JADX INFO: renamed from: g */
        public AbstractC2404m.a mo11564g(long j3) {
            this.f11177a = Long.valueOf(j3);
            return this;
        }

        @Override // p147s0.AbstractC2404m.a
        /* JADX INFO: renamed from: h */
        public AbstractC2404m.a mo11565h(long j3) {
            this.f11178b = Long.valueOf(j3);
            return this;
        }
    }

    @Override // p147s0.AbstractC2404m
    /* JADX INFO: renamed from: b */
    public AbstractC2402k mo11551b() {
        return this.f11172c;
    }

    @Override // p147s0.AbstractC2404m
    /* JADX INFO: renamed from: c */
    public List mo11552c() {
        return this.f11175f;
    }

    @Override // p147s0.AbstractC2404m
    /* JADX INFO: renamed from: d */
    public Integer mo11553d() {
        return this.f11173d;
    }

    @Override // p147s0.AbstractC2404m
    /* JADX INFO: renamed from: e */
    public String mo11554e() {
        return this.f11174e;
    }

    public boolean equals(Object obj) {
        AbstractC2402k abstractC2402k;
        Integer num;
        String str;
        List list;
        EnumC2407p enumC2407p;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2404m) {
            AbstractC2404m abstractC2404m = (AbstractC2404m) obj;
            if (this.f11170a == abstractC2404m.mo11556g() && this.f11171b == abstractC2404m.mo11557h() && ((abstractC2402k = this.f11172c) != null ? abstractC2402k.equals(abstractC2404m.mo11551b()) : abstractC2404m.mo11551b() == null) && ((num = this.f11173d) != null ? num.equals(abstractC2404m.mo11553d()) : abstractC2404m.mo11553d() == null) && ((str = this.f11174e) != null ? str.equals(abstractC2404m.mo11554e()) : abstractC2404m.mo11554e() == null) && ((list = this.f11175f) != null ? list.equals(abstractC2404m.mo11552c()) : abstractC2404m.mo11552c() == null) && ((enumC2407p = this.f11176g) != null ? enumC2407p.equals(abstractC2404m.mo11555f()) : abstractC2404m.mo11555f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p147s0.AbstractC2404m
    /* JADX INFO: renamed from: f */
    public EnumC2407p mo11555f() {
        return this.f11176g;
    }

    @Override // p147s0.AbstractC2404m
    /* JADX INFO: renamed from: g */
    public long mo11556g() {
        return this.f11170a;
    }

    @Override // p147s0.AbstractC2404m
    /* JADX INFO: renamed from: h */
    public long mo11557h() {
        return this.f11171b;
    }

    public int hashCode() {
        long j3 = this.f11170a;
        long j4 = this.f11171b;
        int i3 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        AbstractC2402k abstractC2402k = this.f11172c;
        int iHashCode = (i3 ^ (abstractC2402k == null ? 0 : abstractC2402k.hashCode())) * 1000003;
        Integer num = this.f11173d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f11174e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f11175f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC2407p enumC2407p = this.f11176g;
        return iHashCode4 ^ (enumC2407p != null ? enumC2407p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f11170a + ", requestUptimeMs=" + this.f11171b + ", clientInfo=" + this.f11172c + ", logSource=" + this.f11173d + ", logSourceName=" + this.f11174e + ", logEvents=" + this.f11175f + ", qosTier=" + this.f11176g + "}";
    }

    private C2398g(long j3, long j4, AbstractC2402k abstractC2402k, Integer num, String str, List list, EnumC2407p enumC2407p) {
        this.f11170a = j3;
        this.f11171b = j4;
        this.f11172c = abstractC2402k;
        this.f11173d = num;
        this.f11174e = str;
        this.f11175f = list;
        this.f11176g = enumC2407p;
    }
}
