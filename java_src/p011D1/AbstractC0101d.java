package p011D1;

import p011D1.C0098a;

/* JADX INFO: renamed from: D1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0101d {

    /* JADX INFO: renamed from: D1.d$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC0101d mo275a();

        /* JADX INFO: renamed from: b */
        public abstract a mo276b(AbstractC0103f abstractC0103f);

        /* JADX INFO: renamed from: c */
        public abstract a mo277c(String str);

        /* JADX INFO: renamed from: d */
        public abstract a mo278d(String str);

        /* JADX INFO: renamed from: e */
        public abstract a mo279e(b bVar);

        /* JADX INFO: renamed from: f */
        public abstract a mo280f(String str);
    }

    /* JADX INFO: renamed from: D1.d$b */
    public enum b {
        OK,
        BAD_CONFIG
    }

    /* JADX INFO: renamed from: a */
    public static a m307a() {
        return new C0098a.b();
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0103f mo270b();

    /* JADX INFO: renamed from: c */
    public abstract String mo271c();

    /* JADX INFO: renamed from: d */
    public abstract String mo272d();

    /* JADX INFO: renamed from: e */
    public abstract b mo273e();

    /* JADX INFO: renamed from: f */
    public abstract String mo274f();
}
