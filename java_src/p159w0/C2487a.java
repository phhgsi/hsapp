package p159w0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p150t0.AbstractC2436l;

/* JADX INFO: renamed from: w0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2487a {

    /* JADX INFO: renamed from: e */
    private static final C2487a f11603e = new a().m11826b();

    /* JADX INFO: renamed from: a */
    private final C2492f f11604a;

    /* JADX INFO: renamed from: b */
    private final List f11605b;

    /* JADX INFO: renamed from: c */
    private final C2488b f11606c;

    /* JADX INFO: renamed from: d */
    private final String f11607d;

    /* JADX INFO: renamed from: w0.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C2492f f11608a = null;

        /* JADX INFO: renamed from: b */
        private List f11609b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private C2488b f11610c = null;

        /* JADX INFO: renamed from: d */
        private String f11611d = "";

        a() {
        }

        /* JADX INFO: renamed from: a */
        public a m11825a(C2490d c2490d) {
            this.f11609b.add(c2490d);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C2487a m11826b() {
            return new C2487a(this.f11608a, Collections.unmodifiableList(this.f11609b), this.f11610c, this.f11611d);
        }

        /* JADX INFO: renamed from: c */
        public a m11827c(String str) {
            this.f11611d = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m11828d(C2488b c2488b) {
            this.f11610c = c2488b;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m11829e(C2492f c2492f) {
            this.f11608a = c2492f;
            return this;
        }
    }

    C2487a(C2492f c2492f, List list, C2488b c2488b, String str) {
        this.f11604a = c2492f;
        this.f11605b = list;
        this.f11606c = c2488b;
        this.f11607d = str;
    }

    /* JADX INFO: renamed from: e */
    public static a m11819e() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public String m11820a() {
        return this.f11607d;
    }

    /* JADX INFO: renamed from: b */
    public C2488b m11821b() {
        return this.f11606c;
    }

    /* JADX INFO: renamed from: c */
    public List m11822c() {
        return this.f11605b;
    }

    /* JADX INFO: renamed from: d */
    public C2492f m11823d() {
        return this.f11604a;
    }

    /* JADX INFO: renamed from: f */
    public byte[] m11824f() {
        return AbstractC2436l.m11723a(this);
    }
}
