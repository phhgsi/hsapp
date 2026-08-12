package p069X;

import java.util.LinkedHashMap;
import java.util.Map;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: X.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0589a {

    /* JADX INFO: renamed from: a */
    private final Map f1978a = new LinkedHashMap();

    /* JADX INFO: renamed from: X.a$a */
    public static final class a extends AbstractC0589a {

        /* JADX INFO: renamed from: b */
        public static final a f1979b = new a();

        private a() {
        }

        @Override // p069X.AbstractC0589a
        /* JADX INFO: renamed from: a */
        public Object mo2116a(b bVar) {
            AbstractC0606k.m2145e(bVar, "key");
            return null;
        }
    }

    /* JADX INFO: renamed from: X.a$b */
    public interface b {
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo2116a(b bVar);

    /* JADX INFO: renamed from: b */
    public final Map m2117b() {
        return this.f1978a;
    }
}
