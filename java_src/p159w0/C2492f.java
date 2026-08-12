package p159w0;

/* JADX INFO: renamed from: w0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2492f {

    /* JADX INFO: renamed from: c */
    private static final C2492f f11639c = new a().m11855a();

    /* JADX INFO: renamed from: a */
    private final long f11640a;

    /* JADX INFO: renamed from: b */
    private final long f11641b;

    /* JADX INFO: renamed from: w0.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private long f11642a = 0;

        /* JADX INFO: renamed from: b */
        private long f11643b = 0;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C2492f m11855a() {
            return new C2492f(this.f11642a, this.f11643b);
        }

        /* JADX INFO: renamed from: b */
        public a m11856b(long j3) {
            this.f11643b = j3;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m11857c(long j3) {
            this.f11642a = j3;
            return this;
        }
    }

    C2492f(long j3, long j4) {
        this.f11640a = j3;
        this.f11641b = j4;
    }

    /* JADX INFO: renamed from: c */
    public static a m11852c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public long m11853a() {
        return this.f11641b;
    }

    /* JADX INFO: renamed from: b */
    public long m11854b() {
        return this.f11640a;
    }
}
