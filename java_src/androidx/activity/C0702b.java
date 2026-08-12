package androidx.activity;

import android.window.BackEvent;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.activity.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0702b {

    /* JADX INFO: renamed from: e */
    public static final a f2443e = new a(null);

    /* JADX INFO: renamed from: a */
    private final float f2444a;

    /* JADX INFO: renamed from: b */
    private final float f2445b;

    /* JADX INFO: renamed from: c */
    private final float f2446c;

    /* JADX INFO: renamed from: d */
    private final int f2447d;

    /* JADX INFO: renamed from: androidx.activity.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    public C0702b(float f3, float f4, float f5, int i3) {
        this.f2444a = f3;
        this.f2445b = f4;
        this.f2446c = f5;
        this.f2447d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final float m2627a() {
        return this.f2446c;
    }

    /* JADX INFO: renamed from: b */
    public final int m2628b() {
        return this.f2447d;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f2444a + ", touchY=" + this.f2445b + ", progress=" + this.f2446c + ", swipeEdge=" + this.f2447d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0702b(BackEvent backEvent) {
        AbstractC0606k.m2145e(backEvent, "backEvent");
        C0701a c0701a = C0701a.f2442a;
        this(c0701a.m2625d(backEvent), c0701a.m2626e(backEvent), c0701a.m2623b(backEvent), c0701a.m2624c(backEvent));
    }
}
