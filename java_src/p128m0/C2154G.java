package p128m0;

import android.net.Uri;
import java.util.Arrays;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: m0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2154G {

    /* JADX INFO: renamed from: a */
    private final boolean f9971a;

    /* JADX INFO: renamed from: b */
    private final Uri[] f9972b;

    /* JADX INFO: renamed from: c */
    private final boolean f9973c;

    public C2154G(boolean z2, Uri[] uriArr, boolean z3) {
        this.f9971a = z2;
        this.f9972b = uriArr;
        this.f9973c = z3;
    }

    /* JADX INFO: renamed from: a */
    public final Uri[] m10643a() {
        return this.f9972b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10644b() {
        return this.f9973c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10645c() {
        return this.f9971a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2154G)) {
            return false;
        }
        C2154G c2154g = (C2154G) obj;
        return this.f9971a == c2154g.f9971a && AbstractC0606k.m2141a(this.f9972b, c2154g.f9972b) && this.f9973c == c2154g.f9973c;
    }

    public int hashCode() {
        int iM10626a = AbstractC2144B.m10626a(this.f9971a) * 31;
        Uri[] uriArr = this.f9972b;
        return ((iM10626a + (uriArr == null ? 0 : Arrays.hashCode(uriArr))) * 31) + AbstractC2144B.m10626a(this.f9973c);
    }

    public String toString() {
        return "FileUploadResult(success=" + this.f9971a + ", result=" + Arrays.toString(this.f9972b) + ", shouldResizeCameraImage=" + this.f9973c + ")";
    }

    public /* synthetic */ C2154G(boolean z2, Uri[] uriArr, boolean z3, int i3, AbstractC0602g abstractC0602g) {
        this(z2, uriArr, (i3 & 4) != 0 ? false : z3);
    }
}
