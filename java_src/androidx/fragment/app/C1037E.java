package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.E */
/* JADX INFO: loaded from: classes.dex */
final class C1037E extends Writer implements AutoCloseable {

    /* JADX INFO: renamed from: d */
    private final String f4951d;

    /* JADX INFO: renamed from: e */
    private StringBuilder f4952e = new StringBuilder(128);

    C1037E(String str) {
        this.f4951d = str;
    }

    /* JADX INFO: renamed from: a */
    private void m4689a() {
        if (this.f4952e.length() > 0) {
            Log.d(this.f4951d, this.f4952e.toString());
            StringBuilder sb = this.f4952e;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m4689a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m4689a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c3 = cArr[i3 + i5];
            if (c3 == '\n') {
                m4689a();
            } else {
                this.f4952e.append(c3);
            }
        }
    }
}
