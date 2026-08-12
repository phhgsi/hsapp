package p062U1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: U1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0549a {
    /* JADX INFO: renamed from: a */
    public static final long m2059a(InputStream inputStream, OutputStream outputStream, int i3) throws IOException {
        AbstractC0606k.m2145e(inputStream, "<this>");
        AbstractC0606k.m2145e(outputStream, "out");
        byte[] bArr = new byte[i3];
        int i4 = inputStream.read(bArr);
        long j3 = 0;
        while (i4 >= 0) {
            outputStream.write(bArr, 0, i4);
            j3 += (long) i4;
            i4 = inputStream.read(bArr);
        }
        return j3;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m2060b(InputStream inputStream, OutputStream outputStream, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 8192;
        }
        return m2059a(inputStream, outputStream, i3);
    }
}
