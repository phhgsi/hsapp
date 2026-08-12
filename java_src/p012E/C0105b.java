package p012E;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* JADX INFO: renamed from: E.b */
/* JADX INFO: loaded from: classes.dex */
final class C0105b {

    /* JADX INFO: renamed from: a */
    public static final C0105b f226a = new C0105b();

    private C0105b() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m322a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    /* JADX INFO: renamed from: b */
    public static final void m323b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
