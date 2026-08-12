package p049Q0;

import android.content.Context;
import android.graphics.Color;
import p016F0.AbstractC0140a;
import p043O0.AbstractC0450a;
import p067W0.AbstractC0556b;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: Q0.a */
/* JADX INFO: loaded from: classes.dex */
public class C0486a {

    /* JADX INFO: renamed from: f */
    private static final int f1695f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    private final boolean f1696a;

    /* JADX INFO: renamed from: b */
    private final int f1697b;

    /* JADX INFO: renamed from: c */
    private final int f1698c;

    /* JADX INFO: renamed from: d */
    private final int f1699d;

    /* JADX INFO: renamed from: e */
    private final float f1700e;

    public C0486a(Context context) {
        this(AbstractC0556b.m2070b(context, AbstractC0140a.f345m, false), AbstractC0450a.m1630b(context, AbstractC0140a.f344l, 0), AbstractC0450a.m1630b(context, AbstractC0140a.f343k, 0), AbstractC0450a.m1630b(context, AbstractC0140a.f341i, 0), context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: e */
    private boolean m1794e(int i3) {
        return AbstractC2571d.m12269k(i3, 255) == this.f1699d;
    }

    /* JADX INFO: renamed from: a */
    public float m1795a(float f3) {
        if (this.f1700e <= 0.0f || f3 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f3 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public int m1796b(int i3, float f3) {
        int i4;
        float fM1795a = m1795a(f3);
        int iAlpha = Color.alpha(i3);
        int iM1638j = AbstractC0450a.m1638j(AbstractC2571d.m12269k(i3, 255), this.f1697b, fM1795a);
        if (fM1795a > 0.0f && (i4 = this.f1698c) != 0) {
            iM1638j = AbstractC0450a.m1637i(iM1638j, AbstractC2571d.m12269k(i4, f1695f));
        }
        return AbstractC2571d.m12269k(iM1638j, iAlpha);
    }

    /* JADX INFO: renamed from: c */
    public int m1797c(int i3, float f3) {
        return (this.f1696a && m1794e(i3)) ? m1796b(i3, f3) : i3;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1798d() {
        return this.f1696a;
    }

    public C0486a(boolean z2, int i3, int i4, int i5, float f3) {
        this.f1696a = z2;
        this.f1697b = i3;
        this.f1698c = i4;
        this.f1699d = i5;
        this.f1700e = f3;
    }
}
