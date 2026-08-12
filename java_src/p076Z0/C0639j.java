package p076Z0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: Z0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0639j implements InterfaceC0633d {

    /* JADX INFO: renamed from: a */
    private final float f2227a;

    public C0639j(float f3) {
        this.f2227a = f3;
    }

    /* JADX INFO: renamed from: b */
    private static float m2302b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // p076Z0.InterfaceC0633d
    /* JADX INFO: renamed from: a */
    public float mo2214a(RectF rectF) {
        return this.f2227a * m2302b(rectF);
    }

    /* JADX INFO: renamed from: c */
    public float m2303c() {
        return this.f2227a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0639j) && this.f2227a == ((C0639j) obj).f2227a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2227a)});
    }

    public String toString() {
        return ((int) (m2303c() * 100.0f)) + "%";
    }
}
