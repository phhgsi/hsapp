package p076Z0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: Z0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0631b implements InterfaceC0633d {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0633d f2162a;

    /* JADX INFO: renamed from: b */
    private final float f2163b;

    public C0631b(float f3, InterfaceC0633d interfaceC0633d) {
        while (interfaceC0633d instanceof C0631b) {
            interfaceC0633d = ((C0631b) interfaceC0633d).f2162a;
            f3 += ((C0631b) interfaceC0633d).f2163b;
        }
        this.f2162a = interfaceC0633d;
        this.f2163b = f3;
    }

    @Override // p076Z0.InterfaceC0633d
    /* JADX INFO: renamed from: a */
    public float mo2214a(RectF rectF) {
        return Math.max(0.0f, this.f2162a.mo2214a(rectF) + this.f2163b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0631b)) {
            return false;
        }
        C0631b c0631b = (C0631b) obj;
        return this.f2162a.equals(c0631b.f2162a) && this.f2163b == c0631b.f2163b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2162a, Float.valueOf(this.f2163b)});
    }
}
