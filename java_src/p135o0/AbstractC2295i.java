package p135o0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: o0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2295i {
    /* JADX INFO: renamed from: a */
    public static void m10962a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10963b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i3);
            }
        }
    }
}
