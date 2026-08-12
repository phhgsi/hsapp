package p118j2;

import java.util.concurrent.TimeUnit;
import p086b2.AbstractC1304d;
import p110h2.AbstractC1988B;
import p110h2.AbstractC2019z;

/* JADX INFO: renamed from: j2.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2104l {

    /* JADX INFO: renamed from: a */
    public static final String f9818a = AbstractC2019z.m10194e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b */
    public static final long f9819b = AbstractC1988B.m10101f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    public static final int f9820c = AbstractC1988B.m10100e("kotlinx.coroutines.scheduler.core.pool.size", AbstractC1304d.m6631a(AbstractC2019z.m10190a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d */
    public static final int f9821d = AbstractC1988B.m10100e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e */
    public static final long f9822e = TimeUnit.SECONDS.toNanos(AbstractC1988B.m10101f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f */
    public static AbstractC2099g f9823f = C2097e.f9808a;

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2101i f9824g = new C2102j(0);

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2101i f9825h = new C2102j(1);
}
