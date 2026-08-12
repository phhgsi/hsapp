package p026I1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: I1.d */
/* JADX INFO: loaded from: classes.dex */
public class C0219d {

    /* JADX INFO: renamed from: b */
    private static volatile C0219d f1245b;

    /* JADX INFO: renamed from: a */
    private final Set f1246a = new HashSet();

    C0219d() {
    }

    /* JADX INFO: renamed from: a */
    public static C0219d m620a() {
        C0219d c0219d;
        C0219d c0219d2 = f1245b;
        if (c0219d2 != null) {
            return c0219d2;
        }
        synchronized (C0219d.class) {
            try {
                c0219d = f1245b;
                if (c0219d == null) {
                    c0219d = new C0219d();
                    f1245b = c0219d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0219d;
    }

    /* JADX INFO: renamed from: b */
    Set m621b() {
        Set setUnmodifiableSet;
        synchronized (this.f1246a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f1246a);
        }
        return setUnmodifiableSet;
    }
}
