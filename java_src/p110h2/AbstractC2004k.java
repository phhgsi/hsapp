package p110h2;

/* JADX INFO: renamed from: h2.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2004k {
    /* JADX INFO: renamed from: a */
    public static final void m10138a(int i3) {
        if (i3 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i3).toString());
    }
}
