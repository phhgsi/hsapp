package p151t1;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: t1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2449c {

    /* JADX INFO: renamed from: a */
    private final String f11432a;

    /* JADX INFO: renamed from: b */
    private final Map f11433b;

    /* JADX INFO: renamed from: t1.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f11434a;

        /* JADX INFO: renamed from: b */
        private Map f11435b = null;

        b(String str) {
            this.f11434a = str;
        }

        /* JADX INFO: renamed from: a */
        public C2449c m11746a() {
            return new C2449c(this.f11434a, this.f11435b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f11435b)));
        }

        /* JADX INFO: renamed from: b */
        public b m11747b(Annotation annotation) {
            if (this.f11435b == null) {
                this.f11435b = new HashMap();
            }
            this.f11435b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m11742a(String str) {
        return new b(str);
    }

    /* JADX INFO: renamed from: d */
    public static C2449c m11743d(String str) {
        return new C2449c(str, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: b */
    public String m11744b() {
        return this.f11432a;
    }

    /* JADX INFO: renamed from: c */
    public Annotation m11745c(Class cls) {
        return (Annotation) this.f11433b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2449c)) {
            return false;
        }
        C2449c c2449c = (C2449c) obj;
        return this.f11432a.equals(c2449c.f11432a) && this.f11433b.equals(c2449c.f11433b);
    }

    public int hashCode() {
        return (this.f11432a.hashCode() * 31) + this.f11433b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f11432a + ", properties=" + this.f11433b.values() + "}";
    }

    private C2449c(String str, Map map) {
        this.f11432a = str;
        this.f11433b = map;
    }
}
