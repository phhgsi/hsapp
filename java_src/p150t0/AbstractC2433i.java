package p150t0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p150t0.C2426b;

/* JADX INFO: renamed from: t0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2433i {

    /* JADX INFO: renamed from: t0.i$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public final a m11715a(String str, int i3) {
            mo11675e().put(str, String.valueOf(i3));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m11716b(String str, long j3) {
            mo11675e().put(str, String.valueOf(j3));
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m11717c(String str, String str2) {
            mo11675e().put(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public abstract AbstractC2433i mo11674d();

        /* JADX INFO: renamed from: e */
        protected abstract Map mo11675e();

        /* JADX INFO: renamed from: f */
        protected abstract a mo11676f(Map map);

        /* JADX INFO: renamed from: g */
        public abstract a mo11677g(Integer num);

        /* JADX INFO: renamed from: h */
        public abstract a mo11678h(C2432h c2432h);

        /* JADX INFO: renamed from: i */
        public abstract a mo11679i(long j3);

        /* JADX INFO: renamed from: j */
        public abstract a mo11680j(String str);

        /* JADX INFO: renamed from: k */
        public abstract a mo11681k(long j3);
    }

    /* JADX INFO: renamed from: a */
    public static a m11709a() {
        return new C2426b.b().mo11676f(new HashMap());
    }

    /* JADX INFO: renamed from: b */
    public final String m11710b(String str) {
        String str2 = (String) mo11668c().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: c */
    protected abstract Map mo11668c();

    /* JADX INFO: renamed from: d */
    public abstract Integer mo11669d();

    /* JADX INFO: renamed from: e */
    public abstract C2432h mo11670e();

    /* JADX INFO: renamed from: f */
    public abstract long mo11671f();

    /* JADX INFO: renamed from: g */
    public final int m11711g(String str) {
        String str2 = (String) mo11668c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: h */
    public final long m11712h(String str) {
        String str2 = (String) mo11668c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* JADX INFO: renamed from: i */
    public final Map m11713i() {
        return Collections.unmodifiableMap(mo11668c());
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo11672j();

    /* JADX INFO: renamed from: k */
    public abstract long mo11673k();

    /* JADX INFO: renamed from: l */
    public a m11714l() {
        return new C2426b.b().mo11680j(mo11672j()).mo11677g(mo11669d()).mo11678h(mo11670e()).mo11679i(mo11671f()).mo11681k(mo11673k()).mo11676f(new HashMap(mo11668c()));
    }
}
