package p129m1;

import android.os.SystemClock;

/* JADX INFO: renamed from: m1.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2275m {
    /* JADX INFO: renamed from: a */
    public static AbstractC2275m m10865a(long j3, long j4, long j5) {
        return new C2263a(j3, j4, j5);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC2275m m10866e() {
        return m10865a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo10829b();

    /* JADX INFO: renamed from: c */
    public abstract long mo10830c();

    /* JADX INFO: renamed from: d */
    public abstract long mo10831d();
}
