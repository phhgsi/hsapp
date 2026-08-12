package p110h2;

import com.google.android.gms.common.api.Api;
import p098e2.AbstractC1868d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: h2.B */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1988B {
    /* JADX INFO: renamed from: a */
    public static final int m10096a(String str, int i3, int i4, int i5) {
        return (int) AbstractC2019z.m10192c(str, i3, i4, i5);
    }

    /* JADX INFO: renamed from: b */
    public static final long m10097b(String str, long j3, long j4, long j5) {
        String strM10193d = AbstractC2019z.m10193d(str);
        if (strM10193d == null) {
            return j3;
        }
        Long lB = AbstractC1868d.m9665b(strM10193d);
        if (lB == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM10193d + '\'').toString());
        }
        long jLongValue = lB.longValue();
        if (j4 <= jLongValue && jLongValue <= j5) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j5 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: c */
    public static final String m10098c(String str, String str2) {
        String strM10193d = AbstractC2019z.m10193d(str);
        return strM10193d == null ? str2 : strM10193d;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m10099d(String str, boolean z2) {
        String strM10193d = AbstractC2019z.m10193d(str);
        return strM10193d != null ? Boolean.parseBoolean(strM10193d) : z2;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m10100e(String str, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return AbstractC2019z.m10191b(str, i3, i4, i5);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ long m10101f(String str, long j3, long j4, long j5, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j4 = 1;
        }
        long j6 = j4;
        if ((i3 & 8) != 0) {
            j5 = Long.MAX_VALUE;
        }
        return AbstractC2019z.m10192c(str, j3, j6, j5);
    }
}
