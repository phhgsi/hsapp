package p020G1;

import com.google.firebase.messaging.AbstractC1702K;

/* JADX INFO: renamed from: G1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0182b {

    /* JADX INFO: renamed from: b */
    private static final C0182b f1186b = new a().m537a();

    /* JADX INFO: renamed from: a */
    private final C0181a f1187a;

    /* JADX INFO: renamed from: G1.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C0181a f1188a = null;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C0182b m537a() {
            return new C0182b(this.f1188a);
        }

        /* JADX INFO: renamed from: b */
        public a m538b(C0181a c0181a) {
            this.f1188a = c0181a;
            return this;
        }
    }

    C0182b(C0181a c0181a) {
        this.f1187a = c0181a;
    }

    /* JADX INFO: renamed from: b */
    public static a m534b() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public C0181a m535a() {
        return this.f1187a;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m536c() {
        return AbstractC1702K.m9335a(this);
    }
}
