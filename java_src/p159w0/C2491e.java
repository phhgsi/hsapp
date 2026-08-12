package p159w0;

/* JADX INFO: renamed from: w0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2491e {

    /* JADX INFO: renamed from: c */
    private static final C2491e f11634c = new a().m11849a();

    /* JADX INFO: renamed from: a */
    private final long f11635a;

    /* JADX INFO: renamed from: b */
    private final long f11636b;

    /* JADX INFO: renamed from: w0.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private long f11637a = 0;

        /* JADX INFO: renamed from: b */
        private long f11638b = 0;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C2491e m11849a() {
            return new C2491e(this.f11637a, this.f11638b);
        }

        /* JADX INFO: renamed from: b */
        public a m11850b(long j3) {
            this.f11637a = j3;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m11851c(long j3) {
            this.f11638b = j3;
            return this;
        }
    }

    C2491e(long j3, long j4) {
        this.f11635a = j3;
        this.f11636b = j4;
    }

    /* JADX INFO: renamed from: c */
    public static a m11846c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public long m11847a() {
        return this.f11635a;
    }

    /* JADX INFO: renamed from: b */
    public long m11848b() {
        return this.f11636b;
    }
}
