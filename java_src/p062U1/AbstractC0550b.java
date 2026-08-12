package p062U1;

import java.io.Closeable;
import java.io.IOException;
import p035L1.AbstractC0369a;

/* JADX INFO: renamed from: U1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0550b {
    /* JADX INFO: renamed from: a */
    public static final void m2061a(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0369a.m1360a(th, th2);
            }
        }
    }
}
