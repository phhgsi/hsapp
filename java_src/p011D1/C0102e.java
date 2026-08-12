package p011D1;

import com.google.firebase.installations.C1686i;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: D1.e */
/* JADX INFO: loaded from: classes.dex */
class C0102e {

    /* JADX INFO: renamed from: d */
    private static final long f211d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e */
    private static final long f212e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    private final C1686i f213a = C1686i.m9192c();

    /* JADX INFO: renamed from: b */
    private long f214b;

    /* JADX INFO: renamed from: c */
    private int f215c;

    C0102e() {
    }

    /* JADX INFO: renamed from: a */
    private synchronized long m309a(int i3) {
        if (m310c(i3)) {
            return (long) Math.min(Math.pow(2.0d, this.f215c) + this.f213a.m9198e(), f212e);
        }
        return f211d;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m310c(int i3) {
        if (i3 != 429) {
            return i3 >= 500 && i3 < 600;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m311d(int i3) {
        return (i3 >= 200 && i3 < 300) || i3 == 401 || i3 == 404;
    }

    /* JADX INFO: renamed from: e */
    private synchronized void m312e() {
        this.f215c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean m313b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f215c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            com.google.firebase.installations.i r0 = r4.f213a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.m9196a()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f214b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011D1.C0102e.m313b():boolean");
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m314f(int i3) {
        if (m311d(i3)) {
            m312e();
            return;
        }
        this.f215c++;
        this.f214b = this.f213a.m9196a() + m309a(i3);
    }
}
