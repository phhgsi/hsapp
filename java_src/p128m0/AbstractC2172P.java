package p128m0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p135o0.C2292f;

/* JADX INFO: renamed from: m0.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2172P {

    /* JADX INFO: renamed from: a */
    private static final String f10028a = "m0.P";

    /* JADX INFO: renamed from: a */
    public static void m10664a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e3) {
            C2292f.m10956b().m10960f(f10028a, e3.toString(), e3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10665b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i3);
            }
        }
    }
}
