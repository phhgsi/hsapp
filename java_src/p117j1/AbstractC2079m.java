package p117j1;

/* JADX INFO: renamed from: j1.m */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2079m {
    /* JADX INFO: renamed from: a */
    static int m10398a(int i3, double d3) {
        int iMax = Math.max(i3, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d3 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i4 = iHighestOneBit << 1;
        if (i4 > 0) {
            return i4;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: b */
    static int m10399b(int i3) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i3) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: c */
    static int m10400c(Object obj) {
        return m10399b(obj == null ? 0 : obj.hashCode());
    }
}
