package p098e2;

import p071X1.AbstractC0606k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: e2.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1876l extends AbstractC1875k {
    /* JADX INFO: renamed from: b */
    public static Long m9665b(String str) {
        AbstractC0606k.m2145e(str, "<this>");
        return m9666c(str, 10);
    }

    /* JADX INFO: renamed from: c */
    public static final Long m9666c(String str, int i3) {
        boolean z2;
        AbstractC0606k.m2145e(str, "<this>");
        AbstractC1865a.m9654a(i3);
        int length = str.length();
        Long l3 = null;
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        long j3 = -9223372036854775807L;
        if (AbstractC0606k.m2146f(cCharAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
                i4 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j3 = Long.MIN_VALUE;
                i4 = 1;
            }
        } else {
            z2 = false;
        }
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i4 < length) {
            int iM9655b = AbstractC1865a.m9655b(str.charAt(i4), i3);
            if (iM9655b < 0) {
                return l3;
            }
            if (j4 < j5) {
                if (j5 != -256204778801521550L) {
                    return l3;
                }
                j5 = j3 / ((long) i3);
                if (j4 < j5) {
                    return l3;
                }
            }
            Long l4 = l3;
            int i5 = i4;
            long j6 = j4 * ((long) i3);
            long j7 = iM9655b;
            if (j6 < j3 + j7) {
                return l4;
            }
            j4 = j6 - j7;
            i4 = i5 + 1;
            l3 = l4;
        }
        return z2 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }
}
