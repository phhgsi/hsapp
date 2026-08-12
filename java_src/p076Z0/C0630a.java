package p076Z0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: Z0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0630a implements InterfaceC0633d {

    /* JADX INFO: renamed from: a */
    private final float f2161a;

    public C0630a(float f3) {
        this.f2161a = f3;
    }

    @Override // p076Z0.InterfaceC0633d
    /* JADX INFO: renamed from: a */
    public float mo2214a(RectF rectF) {
        return this.f2161a;
    }

    /* JADX INFO: renamed from: b */
    public float m2215b() {
        return this.f2161a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0630a) && this.f2161a == ((C0630a) obj).f2161a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2161a)});
    }

    public String toString() {
        return m2215b() + "px";
    }
}
