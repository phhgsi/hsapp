package p053R1;

/* JADX INFO: renamed from: R1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0501c {
    /* JADX INFO: renamed from: a */
    private static final int m1844a(int i3, int i4, int i5) {
        return m1846c(m1846c(i3, i5) - m1846c(i4, i5), i5);
    }

    /* JADX INFO: renamed from: b */
    public static final int m1845b(int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i3 < i4) {
                return i4 - m1844a(i4, i3, i5);
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i3 > i4) {
                return i4 + m1844a(i3, i4, -i5);
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: c */
    private static final int m1846c(int i3, int i4) {
        int i5 = i3 % i4;
        return i5 >= 0 ? i5 : i5 + i4;
    }
}
