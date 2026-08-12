package p011D1;

import p011D1.C0099b;

/* JADX INFO: renamed from: D1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0103f {

    /* JADX INFO: renamed from: D1.f$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC0103f mo284a();

        /* JADX INFO: renamed from: b */
        public abstract a mo285b(b bVar);

        /* JADX INFO: renamed from: c */
        public abstract a mo286c(String str);

        /* JADX INFO: renamed from: d */
        public abstract a mo287d(long j3);
    }

    /* JADX INFO: renamed from: D1.f$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* JADX INFO: renamed from: a */
    public static a m315a() {
        return new C0099b.b().mo287d(0L);
    }

    /* JADX INFO: renamed from: b */
    public abstract b mo281b();

    /* JADX INFO: renamed from: c */
    public abstract String mo282c();

    /* JADX INFO: renamed from: d */
    public abstract long mo283d();
}
