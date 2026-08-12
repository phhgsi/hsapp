package p076Z0;

import android.graphics.RectF;
import java.util.Arrays;
import p009D.AbstractC0091a;

/* JADX INFO: renamed from: Z0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0632c implements InterfaceC0633d {

    /* JADX INFO: renamed from: a */
    private final float f2164a;

    public C0632c(float f3) {
        this.f2164a = f3;
    }

    /* JADX INFO: renamed from: b */
    private static float m2216b(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // p076Z0.InterfaceC0633d
    /* JADX INFO: renamed from: a */
    public float mo2214a(RectF rectF) {
        return AbstractC0091a.m257a(this.f2164a, 0.0f, m2216b(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0632c) && this.f2164a == ((C0632c) obj).f2164a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2164a)});
    }
}
