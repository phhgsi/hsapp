package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: androidx.profileinstaller.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1167f {
    /* JADX INFO: renamed from: a */
    static int m5302a(int i3) {
        return ((i3 + 7) & (-8)) / 8;
    }

    /* JADX INFO: renamed from: b */
    static byte[] m5303b(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    static RuntimeException m5304c(String str) {
        return new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: d */
    static byte[] m5305d(InputStream inputStream, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = inputStream.read(bArr, i4, i3 - i4);
            if (i5 < 0) {
                throw m5304c("Not enough bytes to read: " + i3);
            }
            i4 += i5;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    static byte[] m5306e(InputStream inputStream, int i3, int i4) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[2048];
            int i5 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i5 < i3) {
                int i6 = inputStream.read(bArr2);
                if (i6 < 0) {
                    throw m5304c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, i6);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i4 - iInflate);
                    i5 += i6;
                } catch (DataFormatException e3) {
                    throw m5304c(e3.getMessage());
                }
            }
            if (i5 == i3) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw m5304c("Inflater did not finish");
            }
            throw m5304c("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i5);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: f */
    static String m5307f(InputStream inputStream, int i3) {
        return new String(m5305d(inputStream, i3), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: g */
    static long m5308g(InputStream inputStream, int i3) throws IOException {
        byte[] bArrM5305d = m5305d(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += ((long) (bArrM5305d[i4] & 255)) << (i4 * 8);
        }
        return j3;
    }

    /* JADX INFO: renamed from: h */
    static int m5309h(InputStream inputStream) {
        return (int) m5308g(inputStream, 2);
    }

    /* JADX INFO: renamed from: i */
    static long m5310i(InputStream inputStream) {
        return m5308g(inputStream, 4);
    }

    /* JADX INFO: renamed from: j */
    static int m5311j(InputStream inputStream) {
        return (int) m5308g(inputStream, 1);
    }

    /* JADX INFO: renamed from: k */
    static int m5312k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: renamed from: l */
    static void m5313l(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i3);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    static void m5314m(OutputStream outputStream, byte[] bArr) throws IOException {
        m5318q(outputStream, bArr.length);
        byte[] bArrM5303b = m5303b(bArr);
        m5318q(outputStream, bArrM5303b.length);
        outputStream.write(bArrM5303b);
    }

    /* JADX INFO: renamed from: n */
    static void m5315n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: o */
    static void m5316o(OutputStream outputStream, long j3, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((j3 >> (i4 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: p */
    static void m5317p(OutputStream outputStream, int i3) throws IOException {
        m5316o(outputStream, i3, 2);
    }

    /* JADX INFO: renamed from: q */
    static void m5318q(OutputStream outputStream, long j3) throws IOException {
        m5316o(outputStream, j3, 4);
    }

    /* JADX INFO: renamed from: r */
    static void m5319r(OutputStream outputStream, int i3) throws IOException {
        m5316o(outputStream, i3, 1);
    }
}
