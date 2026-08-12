package p117j1;

import java.util.Arrays;
import p113i1.AbstractC2033f;

/* JADX INFO: renamed from: j1.j */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2076j {
    /* JADX INFO: renamed from: a */
    static Object m10388a(int i3) {
        if (i3 >= 2 && i3 <= 1073741824 && Integer.highestOneBit(i3) == i3) {
            return i3 <= 256 ? new byte[i3] : i3 <= 65536 ? new short[i3] : new int[i3];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    static int m10389b(int i3, int i4) {
        return i3 & (~i4);
    }

    /* JADX INFO: renamed from: c */
    static int m10390c(int i3, int i4) {
        return i3 & i4;
    }

    /* JADX INFO: renamed from: d */
    static int m10391d(int i3, int i4, int i5) {
        return (i3 & (~i5)) | (i4 & i5);
    }

    /* JADX INFO: renamed from: e */
    static int m10392e(int i3) {
        return (i3 < 32 ? 4 : 2) * (i3 + 1);
    }

    /* JADX INFO: renamed from: f */
    static int m10393f(Object obj, Object obj2, int i3, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i4;
        int i5;
        int iM10400c = AbstractC2079m.m10400c(obj);
        int i6 = iM10400c & i3;
        int iM10395h = m10395h(obj3, i6);
        if (iM10395h == 0) {
            return -1;
        }
        int iM10389b = m10389b(iM10400c, i3);
        int i7 = -1;
        while (true) {
            i4 = iM10395h - 1;
            i5 = iArr[i4];
            if (m10389b(i5, i3) == iM10389b && AbstractC2033f.m10228a(obj, objArr[i4]) && (objArr2 == null || AbstractC2033f.m10228a(obj2, objArr2[i4]))) {
                break;
            }
            int iM10390c = m10390c(i5, i3);
            if (iM10390c == 0) {
                return -1;
            }
            i7 = i4;
            iM10395h = iM10390c;
        }
        int iM10390c2 = m10390c(i5, i3);
        if (i7 == -1) {
            m10396i(obj3, i6, iM10390c2);
            return i4;
        }
        iArr[i7] = m10391d(iArr[i7], iM10390c2, i3);
        return i4;
    }

    /* JADX INFO: renamed from: g */
    static void m10394g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    static int m10395h(Object obj, int i3) {
        return obj instanceof byte[] ? ((byte[]) obj)[i3] & 255 : obj instanceof short[] ? ((short[]) obj)[i3] & 65535 : ((int[]) obj)[i3];
    }

    /* JADX INFO: renamed from: i */
    static void m10396i(Object obj, int i3, int i4) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i4;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i4;
        } else {
            ((int[]) obj)[i3] = i4;
        }
    }

    /* JADX INFO: renamed from: j */
    static int m10397j(int i3) {
        return Math.max(4, AbstractC2079m.m10398a(i3 + 1, 1.0d));
    }
}
