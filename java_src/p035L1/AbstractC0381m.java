package p035L1;

import java.io.Serializable;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: L1.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0381m implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final a f1498d = new a(null);

    /* JADX INFO: renamed from: L1.m$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: L1.m$b */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: d */
        public final Throwable f1499d;

        public b(Throwable th) {
            AbstractC0606k.m2145e(th, "exception");
            this.f1499d = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && AbstractC0606k.m2141a(this.f1499d, ((b) obj).f1499d);
        }

        public int hashCode() {
            return this.f1499d.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f1499d + ')';
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Throwable m1370b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f1499d;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1371c(Object obj) {
        return obj instanceof b;
    }

    /* JADX INFO: renamed from: a */
    public static Object m1369a(Object obj) {
        return obj;
    }
}
