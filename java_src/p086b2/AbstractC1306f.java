package p086b2;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: b2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1306f extends AbstractC1305e {
    /* JADX INFO: renamed from: a */
    public static int m6631a(int i3, int i4) {
        return i3 < i4 ? i4 : i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m6632b(int i3, int i4) {
        return i3 > i4 ? i4 : i3;
    }

    /* JADX INFO: renamed from: c */
    public static long m6633c(long j3, long j4) {
        return j3 > j4 ? j4 : j3;
    }

    /* JADX INFO: renamed from: d */
    public static int m6634d(int i3, int i4, int i5) {
        if (i4 <= i5) {
            return i3 < i4 ? i4 : i3 > i5 ? i5 : i3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i5 + " is less than minimum " + i4 + '.');
    }

    /* JADX INFO: renamed from: e */
    public static C1301a m6635e(int i3, int i4) {
        return C1301a.f6361g.m6626a(i3, i4, -1);
    }

    /* JADX INFO: renamed from: f */
    public static C1303c m6636f(int i3, int i4) {
        return i4 <= Integer.MIN_VALUE ? C1303c.f6369h.m6630a() : new C1303c(i3, i4 - 1);
    }
}
