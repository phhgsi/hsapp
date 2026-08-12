package p035L1;

import p035L1.AbstractC0381m;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: L1.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0382n {
    /* JADX INFO: renamed from: a */
    public static final Object m1372a(Throwable th) {
        AbstractC0606k.m2145e(th, "exception");
        return new AbstractC0381m.b(th);
    }

    /* JADX INFO: renamed from: b */
    public static final void m1373b(Object obj) {
        if (obj instanceof AbstractC0381m.b) {
            throw ((AbstractC0381m.b) obj).f1499d;
        }
    }
}
