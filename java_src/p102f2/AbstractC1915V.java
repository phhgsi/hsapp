package p102f2;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: f2.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1915V {
    /* JADX INFO: renamed from: a */
    public static final CancellationException m9843a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
