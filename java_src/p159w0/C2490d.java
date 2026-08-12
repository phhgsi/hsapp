package p159w0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: w0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2490d {

    /* JADX INFO: renamed from: c */
    private static final C2490d f11629c = new a().m11843a();

    /* JADX INFO: renamed from: a */
    private final String f11630a;

    /* JADX INFO: renamed from: b */
    private final List f11631b;

    /* JADX INFO: renamed from: w0.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private String f11632a = "";

        /* JADX INFO: renamed from: b */
        private List f11633b = new ArrayList();

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C2490d m11843a() {
            return new C2490d(this.f11632a, Collections.unmodifiableList(this.f11633b));
        }

        /* JADX INFO: renamed from: b */
        public a m11844b(List list) {
            this.f11633b = list;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m11845c(String str) {
            this.f11632a = str;
            return this;
        }
    }

    C2490d(String str, List list) {
        this.f11630a = str;
        this.f11631b = list;
    }

    /* JADX INFO: renamed from: c */
    public static a m11840c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public List m11841a() {
        return this.f11631b;
    }

    /* JADX INFO: renamed from: b */
    public String m11842b() {
        return this.f11630a;
    }
}
