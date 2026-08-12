package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.profileinstaller.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1175n {

    /* JADX INFO: renamed from: a */
    static final byte[] f5528a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    static final byte[] f5529b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: A */
    private static void m5333A(InputStream inputStream) {
        AbstractC1167f.m5309h(inputStream);
        int iM5311j = AbstractC1167f.m5311j(inputStream);
        if (iM5311j == 6 || iM5311j == 7) {
            return;
        }
        while (iM5311j > 0) {
            AbstractC1167f.m5311j(inputStream);
            for (int iM5311j2 = AbstractC1167f.m5311j(inputStream); iM5311j2 > 0; iM5311j2--) {
                AbstractC1167f.m5309h(inputStream);
            }
            iM5311j--;
        }
    }

    /* JADX INFO: renamed from: B */
    static boolean m5334B(OutputStream outputStream, byte[] bArr, C1166e[] c1166eArr) throws IOException {
        if (Arrays.equals(bArr, AbstractC1177p.f5540a)) {
            m5346N(outputStream, c1166eArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC1177p.f5541b)) {
            m5345M(outputStream, c1166eArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC1177p.f5543d)) {
            m5343K(outputStream, c1166eArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC1177p.f5542c)) {
            m5344L(outputStream, c1166eArr);
            return true;
        }
        if (!Arrays.equals(bArr, AbstractC1177p.f5544e)) {
            return false;
        }
        m5342J(outputStream, c1166eArr);
        return true;
    }

    /* JADX INFO: renamed from: C */
    private static void m5335C(OutputStream outputStream, C1166e c1166e) throws IOException {
        int[] iArr = c1166e.f5509h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            AbstractC1167f.m5317p(outputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
    }

    /* JADX INFO: renamed from: D */
    private static C1178q m5336D(C1166e[] c1166eArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC1167f.m5317p(byteArrayOutputStream, c1166eArr.length);
            int i3 = 2;
            for (C1166e c1166e : c1166eArr) {
                AbstractC1167f.m5318q(byteArrayOutputStream, c1166e.f5504c);
                AbstractC1167f.m5318q(byteArrayOutputStream, c1166e.f5505d);
                AbstractC1167f.m5318q(byteArrayOutputStream, c1166e.f5508g);
                String strM5357j = m5357j(c1166e.f5502a, c1166e.f5503b, AbstractC1177p.f5540a);
                int iM5312k = AbstractC1167f.m5312k(strM5357j);
                AbstractC1167f.m5317p(byteArrayOutputStream, iM5312k);
                i3 = i3 + 14 + iM5312k;
                AbstractC1167f.m5315n(byteArrayOutputStream, strM5357j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i3 == byteArray.length) {
                C1178q c1178q = new C1178q(EnumC1168g.DEX_FILES, i3, byteArray, false);
                byteArrayOutputStream.close();
                return c1178q;
            }
            throw AbstractC1167f.m5304c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    static void m5337E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f5528a);
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: F */
    private static void m5338F(OutputStream outputStream, C1166e c1166e) throws IOException {
        m5341I(outputStream, c1166e);
        m5335C(outputStream, c1166e);
        m5340H(outputStream, c1166e);
    }

    /* JADX INFO: renamed from: G */
    private static void m5339G(OutputStream outputStream, C1166e c1166e, String str) throws IOException {
        AbstractC1167f.m5317p(outputStream, AbstractC1167f.m5312k(str));
        AbstractC1167f.m5317p(outputStream, c1166e.f5506e);
        AbstractC1167f.m5318q(outputStream, c1166e.f5507f);
        AbstractC1167f.m5318q(outputStream, c1166e.f5504c);
        AbstractC1167f.m5318q(outputStream, c1166e.f5508g);
        AbstractC1167f.m5315n(outputStream, str);
    }

    /* JADX INFO: renamed from: H */
    private static void m5340H(OutputStream outputStream, C1166e c1166e) throws IOException {
        byte[] bArr = new byte[m5358k(c1166e.f5508g)];
        for (Map.Entry entry : c1166e.f5510i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                m5373z(bArr, 2, iIntValue, c1166e);
            }
            if ((iIntValue2 & 4) != 0) {
                m5373z(bArr, 4, iIntValue, c1166e);
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: I */
    private static void m5341I(OutputStream outputStream, C1166e c1166e) throws IOException {
        int i3 = 0;
        for (Map.Entry entry : c1166e.f5510i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC1167f.m5317p(outputStream, iIntValue - i3);
                AbstractC1167f.m5317p(outputStream, 0);
                i3 = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    private static void m5342J(OutputStream outputStream, C1166e[] c1166eArr) throws IOException {
        AbstractC1167f.m5317p(outputStream, c1166eArr.length);
        for (C1166e c1166e : c1166eArr) {
            String strM5357j = m5357j(c1166e.f5502a, c1166e.f5503b, AbstractC1177p.f5544e);
            AbstractC1167f.m5317p(outputStream, AbstractC1167f.m5312k(strM5357j));
            AbstractC1167f.m5317p(outputStream, c1166e.f5510i.size());
            AbstractC1167f.m5317p(outputStream, c1166e.f5509h.length);
            AbstractC1167f.m5318q(outputStream, c1166e.f5504c);
            AbstractC1167f.m5315n(outputStream, strM5357j);
            Iterator it = c1166e.f5510i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC1167f.m5317p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i3 : c1166e.f5509h) {
                AbstractC1167f.m5317p(outputStream, i3);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    private static void m5343K(OutputStream outputStream, C1166e[] c1166eArr) throws IOException {
        AbstractC1167f.m5319r(outputStream, c1166eArr.length);
        for (C1166e c1166e : c1166eArr) {
            int size = c1166e.f5510i.size() * 4;
            String strM5357j = m5357j(c1166e.f5502a, c1166e.f5503b, AbstractC1177p.f5543d);
            AbstractC1167f.m5317p(outputStream, AbstractC1167f.m5312k(strM5357j));
            AbstractC1167f.m5317p(outputStream, c1166e.f5509h.length);
            AbstractC1167f.m5318q(outputStream, size);
            AbstractC1167f.m5318q(outputStream, c1166e.f5504c);
            AbstractC1167f.m5315n(outputStream, strM5357j);
            Iterator it = c1166e.f5510i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC1167f.m5317p(outputStream, ((Integer) it.next()).intValue());
                AbstractC1167f.m5317p(outputStream, 0);
            }
            for (int i3 : c1166e.f5509h) {
                AbstractC1167f.m5317p(outputStream, i3);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private static void m5344L(OutputStream outputStream, C1166e[] c1166eArr) throws IOException {
        byte[] bArrM5349b = m5349b(c1166eArr, AbstractC1177p.f5542c);
        AbstractC1167f.m5319r(outputStream, c1166eArr.length);
        AbstractC1167f.m5314m(outputStream, bArrM5349b);
    }

    /* JADX INFO: renamed from: M */
    private static void m5345M(OutputStream outputStream, C1166e[] c1166eArr) throws IOException {
        byte[] bArrM5349b = m5349b(c1166eArr, AbstractC1177p.f5541b);
        AbstractC1167f.m5319r(outputStream, c1166eArr.length);
        AbstractC1167f.m5314m(outputStream, bArrM5349b);
    }

    /* JADX INFO: renamed from: N */
    private static void m5346N(OutputStream outputStream, C1166e[] c1166eArr) throws IOException {
        m5347O(outputStream, c1166eArr);
    }

    /* JADX INFO: renamed from: O */
    private static void m5347O(OutputStream outputStream, C1166e[] c1166eArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m5336D(c1166eArr));
        arrayList.add(m5350c(c1166eArr));
        arrayList.add(m5351d(c1166eArr));
        long length2 = ((long) AbstractC1177p.f5540a.length) + ((long) f5528a.length) + 4 + ((long) (arrayList.size() * 16));
        AbstractC1167f.m5318q(outputStream, arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C1178q c1178q = (C1178q) arrayList.get(i3);
            AbstractC1167f.m5318q(outputStream, c1178q.f5547a.m5321b());
            AbstractC1167f.m5318q(outputStream, length2);
            if (c1178q.f5550d) {
                byte[] bArr = c1178q.f5549c;
                long length3 = bArr.length;
                byte[] bArrM5303b = AbstractC1167f.m5303b(bArr);
                arrayList2.add(bArrM5303b);
                AbstractC1167f.m5318q(outputStream, bArrM5303b.length);
                AbstractC1167f.m5318q(outputStream, length3);
                length = bArrM5303b.length;
            } else {
                arrayList2.add(c1178q.f5549c);
                AbstractC1167f.m5318q(outputStream, c1178q.f5549c.length);
                AbstractC1167f.m5318q(outputStream, 0L);
                length = c1178q.f5549c.length;
            }
            length2 += (long) length;
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            outputStream.write((byte[]) arrayList2.get(i4));
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m5348a(C1166e c1166e) {
        Iterator it = c1166e.f5510i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m5349b(C1166e[] c1166eArr, byte[] bArr) throws IOException {
        int i3 = 0;
        int iM5312k = 0;
        for (C1166e c1166e : c1166eArr) {
            iM5312k += AbstractC1167f.m5312k(m5357j(c1166e.f5502a, c1166e.f5503b, bArr)) + 16 + (c1166e.f5506e * 2) + c1166e.f5507f + m5358k(c1166e.f5508g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM5312k);
        if (Arrays.equals(bArr, AbstractC1177p.f5542c)) {
            int length = c1166eArr.length;
            while (i3 < length) {
                C1166e c1166e2 = c1166eArr[i3];
                m5339G(byteArrayOutputStream, c1166e2, m5357j(c1166e2.f5502a, c1166e2.f5503b, bArr));
                m5338F(byteArrayOutputStream, c1166e2);
                i3++;
            }
        } else {
            for (C1166e c1166e3 : c1166eArr) {
                m5339G(byteArrayOutputStream, c1166e3, m5357j(c1166e3.f5502a, c1166e3.f5503b, bArr));
            }
            int length2 = c1166eArr.length;
            while (i3 < length2) {
                m5338F(byteArrayOutputStream, c1166eArr[i3]);
                i3++;
            }
        }
        if (byteArrayOutputStream.size() == iM5312k) {
            return byteArrayOutputStream.toByteArray();
        }
        throw AbstractC1167f.m5304c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM5312k);
    }

    /* JADX INFO: renamed from: c */
    private static C1178q m5350c(C1166e[] c1166eArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        for (int i4 = 0; i4 < c1166eArr.length; i4++) {
            try {
                C1166e c1166e = c1166eArr[i4];
                AbstractC1167f.m5317p(byteArrayOutputStream, i4);
                AbstractC1167f.m5317p(byteArrayOutputStream, c1166e.f5506e);
                i3 = i3 + 4 + (c1166e.f5506e * 2);
                m5335C(byteArrayOutputStream, c1166e);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i3 == byteArray.length) {
            C1178q c1178q = new C1178q(EnumC1168g.CLASSES, i3, byteArray, true);
            byteArrayOutputStream.close();
            return c1178q;
        }
        throw AbstractC1167f.m5304c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: d */
    private static C1178q m5351d(C1166e[] c1166eArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        for (int i4 = 0; i4 < c1166eArr.length; i4++) {
            try {
                C1166e c1166e = c1166eArr[i4];
                int iM5348a = m5348a(c1166e);
                byte[] bArrM5352e = m5352e(c1166e);
                byte[] bArrM5353f = m5353f(c1166e);
                AbstractC1167f.m5317p(byteArrayOutputStream, i4);
                int length = bArrM5352e.length + 2 + bArrM5353f.length;
                AbstractC1167f.m5318q(byteArrayOutputStream, length);
                AbstractC1167f.m5317p(byteArrayOutputStream, iM5348a);
                byteArrayOutputStream.write(bArrM5352e);
                byteArrayOutputStream.write(bArrM5353f);
                i3 = i3 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i3 == byteArray.length) {
            C1178q c1178q = new C1178q(EnumC1168g.METHODS, i3, byteArray, true);
            byteArrayOutputStream.close();
            return c1178q;
        }
        throw AbstractC1167f.m5304c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m5352e(C1166e c1166e) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m5340H(byteArrayOutputStream, c1166e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    private static byte[] m5353f(C1166e c1166e) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m5341I(byteArrayOutputStream, c1166e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m5354g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    /* JADX INFO: renamed from: h */
    private static String m5355h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: i */
    private static C1166e m5356i(C1166e[] c1166eArr, String str) {
        if (c1166eArr.length <= 0) {
            return null;
        }
        String strM5355h = m5355h(str);
        for (int i3 = 0; i3 < c1166eArr.length; i3++) {
            if (c1166eArr[i3].f5503b.equals(strM5355h)) {
                return c1166eArr[i3];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private static String m5357j(String str, String str2, byte[] bArr) {
        String strM5380a = AbstractC1177p.m5380a(bArr);
        if (str.length() <= 0) {
            return m5354g(str2, strM5380a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m5354g(str2, strM5380a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + AbstractC1177p.m5380a(bArr) + str2;
    }

    /* JADX INFO: renamed from: k */
    private static int m5358k(int i3) {
        return m5372y(i3 * 2) / 8;
    }

    /* JADX INFO: renamed from: l */
    private static int m5359l(int i3, int i4, int i5) {
        if (i3 == 1) {
            throw AbstractC1167f.m5304c("HOT methods are not stored in the bitmap");
        }
        if (i3 == 2) {
            return i4;
        }
        if (i3 == 4) {
            return i4 + i5;
        }
        throw AbstractC1167f.m5304c("Unexpected flag: " + i3);
    }

    /* JADX INFO: renamed from: m */
    private static int[] m5360m(InputStream inputStream, int i3) {
        int[] iArr = new int[i3];
        int iM5309h = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iM5309h += AbstractC1167f.m5309h(inputStream);
            iArr[i4] = iM5309h;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: n */
    private static int m5361n(BitSet bitSet, int i3, int i4) {
        int i5 = bitSet.get(m5359l(2, i3, i4)) ? 2 : 0;
        return bitSet.get(m5359l(4, i3, i4)) ? i5 | 4 : i5;
    }

    /* JADX INFO: renamed from: o */
    static byte[] m5362o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, AbstractC1167f.m5305d(inputStream, bArr.length))) {
            return AbstractC1167f.m5305d(inputStream, AbstractC1177p.f5541b.length);
        }
        throw AbstractC1167f.m5304c("Invalid magic");
    }

    /* JADX INFO: renamed from: p */
    private static void m5363p(InputStream inputStream, C1166e c1166e) {
        int iAvailable = inputStream.available() - c1166e.f5507f;
        int iM5309h = 0;
        while (inputStream.available() > iAvailable) {
            iM5309h += AbstractC1167f.m5309h(inputStream);
            c1166e.f5510i.put(Integer.valueOf(iM5309h), 1);
            for (int iM5309h2 = AbstractC1167f.m5309h(inputStream); iM5309h2 > 0; iM5309h2--) {
                m5333A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw AbstractC1167f.m5304c("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: renamed from: q */
    static C1166e[] m5364q(InputStream inputStream, byte[] bArr, byte[] bArr2, C1166e[] c1166eArr) {
        if (Arrays.equals(bArr, AbstractC1177p.f5545f)) {
            if (Arrays.equals(AbstractC1177p.f5540a, bArr2)) {
                throw AbstractC1167f.m5304c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m5365r(inputStream, bArr, c1166eArr);
        }
        if (Arrays.equals(bArr, AbstractC1177p.f5546g)) {
            return m5367t(inputStream, bArr2, c1166eArr);
        }
        throw AbstractC1167f.m5304c("Unsupported meta version");
    }

    /* JADX INFO: renamed from: r */
    static C1166e[] m5365r(InputStream inputStream, byte[] bArr, C1166e[] c1166eArr) throws IOException {
        if (!Arrays.equals(bArr, AbstractC1177p.f5545f)) {
            throw AbstractC1167f.m5304c("Unsupported meta version");
        }
        int iM5311j = AbstractC1167f.m5311j(inputStream);
        byte[] bArrM5306e = AbstractC1167f.m5306e(inputStream, (int) AbstractC1167f.m5310i(inputStream), (int) AbstractC1167f.m5310i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC1167f.m5304c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5306e);
        try {
            C1166e[] c1166eArrM5366s = m5366s(byteArrayInputStream, iM5311j, c1166eArr);
            byteArrayInputStream.close();
            return c1166eArrM5366s;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    private static C1166e[] m5366s(InputStream inputStream, int i3, C1166e[] c1166eArr) {
        if (inputStream.available() == 0) {
            return new C1166e[0];
        }
        if (i3 != c1166eArr.length) {
            throw AbstractC1167f.m5304c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iM5309h = AbstractC1167f.m5309h(inputStream);
            iArr[i4] = AbstractC1167f.m5309h(inputStream);
            strArr[i4] = AbstractC1167f.m5307f(inputStream, iM5309h);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C1166e c1166e = c1166eArr[i5];
            if (!c1166e.f5503b.equals(strArr[i5])) {
                throw AbstractC1167f.m5304c("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            c1166e.f5506e = i6;
            c1166e.f5509h = m5360m(inputStream, i6);
        }
        return c1166eArr;
    }

    /* JADX INFO: renamed from: t */
    static C1166e[] m5367t(InputStream inputStream, byte[] bArr, C1166e[] c1166eArr) throws IOException {
        int iM5309h = AbstractC1167f.m5309h(inputStream);
        byte[] bArrM5306e = AbstractC1167f.m5306e(inputStream, (int) AbstractC1167f.m5310i(inputStream), (int) AbstractC1167f.m5310i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC1167f.m5304c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5306e);
        try {
            C1166e[] c1166eArrM5368u = m5368u(byteArrayInputStream, bArr, iM5309h, c1166eArr);
            byteArrayInputStream.close();
            return c1166eArrM5368u;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    private static C1166e[] m5368u(InputStream inputStream, byte[] bArr, int i3, C1166e[] c1166eArr) {
        if (inputStream.available() == 0) {
            return new C1166e[0];
        }
        if (i3 != c1166eArr.length) {
            throw AbstractC1167f.m5304c("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            AbstractC1167f.m5309h(inputStream);
            String strM5307f = AbstractC1167f.m5307f(inputStream, AbstractC1167f.m5309h(inputStream));
            long jM5310i = AbstractC1167f.m5310i(inputStream);
            int iM5309h = AbstractC1167f.m5309h(inputStream);
            C1166e c1166eM5356i = m5356i(c1166eArr, strM5307f);
            if (c1166eM5356i == null) {
                throw AbstractC1167f.m5304c("Missing profile key: " + strM5307f);
            }
            c1166eM5356i.f5505d = jM5310i;
            int[] iArrM5360m = m5360m(inputStream, iM5309h);
            if (Arrays.equals(bArr, AbstractC1177p.f5544e)) {
                c1166eM5356i.f5506e = iM5309h;
                c1166eM5356i.f5509h = iArrM5360m;
            }
        }
        return c1166eArr;
    }

    /* JADX INFO: renamed from: v */
    private static void m5369v(InputStream inputStream, C1166e c1166e) {
        BitSet bitSetValueOf = BitSet.valueOf(AbstractC1167f.m5305d(inputStream, AbstractC1167f.m5302a(c1166e.f5508g * 2)));
        int i3 = 0;
        while (true) {
            int i4 = c1166e.f5508g;
            if (i3 >= i4) {
                return;
            }
            int iM5361n = m5361n(bitSetValueOf, i3, i4);
            if (iM5361n != 0) {
                Integer num = (Integer) c1166e.f5510i.get(Integer.valueOf(i3));
                if (num == null) {
                    num = 0;
                }
                c1166e.f5510i.put(Integer.valueOf(i3), Integer.valueOf(iM5361n | num.intValue()));
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: w */
    static C1166e[] m5370w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC1177p.f5541b)) {
            throw AbstractC1167f.m5304c("Unsupported version");
        }
        int iM5311j = AbstractC1167f.m5311j(inputStream);
        byte[] bArrM5306e = AbstractC1167f.m5306e(inputStream, (int) AbstractC1167f.m5310i(inputStream), (int) AbstractC1167f.m5310i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC1167f.m5304c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5306e);
        try {
            C1166e[] c1166eArrM5371x = m5371x(byteArrayInputStream, str, iM5311j);
            byteArrayInputStream.close();
            return c1166eArrM5371x;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    private static C1166e[] m5371x(InputStream inputStream, String str, int i3) {
        if (inputStream.available() == 0) {
            return new C1166e[0];
        }
        C1166e[] c1166eArr = new C1166e[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iM5309h = AbstractC1167f.m5309h(inputStream);
            int iM5309h2 = AbstractC1167f.m5309h(inputStream);
            c1166eArr[i4] = new C1166e(str, AbstractC1167f.m5307f(inputStream, iM5309h), AbstractC1167f.m5310i(inputStream), 0L, iM5309h2, (int) AbstractC1167f.m5310i(inputStream), (int) AbstractC1167f.m5310i(inputStream), new int[iM5309h2], new TreeMap());
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C1166e c1166e = c1166eArr[i5];
            m5363p(inputStream, c1166e);
            c1166e.f5509h = m5360m(inputStream, c1166e.f5506e);
            m5369v(inputStream, c1166e);
        }
        return c1166eArr;
    }

    /* JADX INFO: renamed from: y */
    private static int m5372y(int i3) {
        return (i3 + 7) & (-8);
    }

    /* JADX INFO: renamed from: z */
    private static void m5373z(byte[] bArr, int i3, int i4, C1166e c1166e) {
        int iM5359l = m5359l(i3, i4, c1166e.f5508g);
        int i5 = iM5359l / 8;
        bArr[i5] = (byte) ((1 << (iM5359l % 8)) | bArr[i5]);
    }
}
