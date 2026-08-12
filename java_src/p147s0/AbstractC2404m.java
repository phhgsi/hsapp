package p147s0;

import java.util.List;
import p147s0.C2398g;

/* JADX INFO: renamed from: s0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2404m {

    /* JADX INFO: renamed from: s0.m$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC2404m mo11558a();

        /* JADX INFO: renamed from: b */
        public abstract a mo11559b(AbstractC2402k abstractC2402k);

        /* JADX INFO: renamed from: c */
        public abstract a mo11560c(List list);

        /* JADX INFO: renamed from: d */
        abstract a mo11561d(Integer num);

        /* JADX INFO: renamed from: e */
        abstract a mo11562e(String str);

        /* JADX INFO: renamed from: f */
        public abstract a mo11563f(EnumC2407p enumC2407p);

        /* JADX INFO: renamed from: g */
        public abstract a mo11564g(long j3);

        /* JADX INFO: renamed from: h */
        public abstract a mo11565h(long j3);

        /* JADX INFO: renamed from: i */
        public a m11579i(int i3) {
            return mo11561d(Integer.valueOf(i3));
        }

        /* JADX INFO: renamed from: j */
        public a m11580j(String str) {
            return mo11562e(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m11578a() {
        return new C2398g.b();
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC2402k mo11551b();

    /* JADX INFO: renamed from: c */
    public abstract List mo11552c();

    /* JADX INFO: renamed from: d */
    public abstract Integer mo11553d();

    /* JADX INFO: renamed from: e */
    public abstract String mo11554e();

    /* JADX INFO: renamed from: f */
    public abstract EnumC2407p mo11555f();

    /* JADX INFO: renamed from: g */
    public abstract long mo11556g();

    /* JADX INFO: renamed from: h */
    public abstract long mo11557h();
}
