package p125l1;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: l1.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2138e {
    /* JADX INFO: renamed from: a */
    public static Object m10600a(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
