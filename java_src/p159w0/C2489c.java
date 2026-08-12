package p159w0;

import p160w1.InterfaceC2495c;

/* JADX INFO: renamed from: w0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2489c {

    /* JADX INFO: renamed from: c */
    private static final C2489c f11615c = new a().m11837a();

    /* JADX INFO: renamed from: a */
    private final long f11616a;

    /* JADX INFO: renamed from: b */
    private final b f11617b;

    /* JADX INFO: renamed from: w0.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private long f11618a = 0;

        /* JADX INFO: renamed from: b */
        private b f11619b = b.REASON_UNKNOWN;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C2489c m11837a() {
            return new C2489c(this.f11618a, this.f11619b);
        }

        /* JADX INFO: renamed from: b */
        public a m11838b(long j3) {
            this.f11618a = j3;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m11839c(b bVar) {
            this.f11619b = bVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: w0.c$b */
    public enum b implements InterfaceC2495c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: d */
        private final int f11628d;

        b(int i3) {
            this.f11628d = i3;
        }

        @Override // p160w1.InterfaceC2495c
        /* JADX INFO: renamed from: a */
        public int mo531a() {
            return this.f11628d;
        }
    }

    C2489c(long j3, b bVar) {
        this.f11616a = j3;
        this.f11617b = bVar;
    }

    /* JADX INFO: renamed from: c */
    public static a m11834c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public long m11835a() {
        return this.f11616a;
    }

    /* JADX INFO: renamed from: b */
    public b m11836b() {
        return this.f11617b;
    }
}
