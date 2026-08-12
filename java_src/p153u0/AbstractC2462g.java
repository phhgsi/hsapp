package p153u0;

/* JADX INFO: renamed from: u0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2462g {

    /* JADX INFO: renamed from: u0.g$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2462g m11768a() {
        return new C2457b(a.FATAL_ERROR, -1L);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC2462g m11769d() {
        return new C2457b(a.INVALID_PAYLOAD, -1L);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC2462g m11770e(long j3) {
        return new C2457b(a.OK, j3);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC2462g m11771f() {
        return new C2457b(a.TRANSIENT_ERROR, -1L);
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo11760b();

    /* JADX INFO: renamed from: c */
    public abstract a mo11761c();
}
