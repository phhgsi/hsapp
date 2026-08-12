package p150t0;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p004B0.InterfaceC0054d;

/* JADX INFO: renamed from: t0.u */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2445u implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: t0.u$a */
    interface a {
        /* JADX INFO: renamed from: a */
        AbstractC2445u mo11704a();

        /* JADX INFO: renamed from: b */
        a mo11705b(Context context);
    }

    AbstractC2445u() {
    }

    /* JADX INFO: renamed from: a */
    abstract InterfaceC0054d mo11702a();

    /* JADX INFO: renamed from: b */
    abstract C2444t mo11703b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo11702a().close();
    }
}
