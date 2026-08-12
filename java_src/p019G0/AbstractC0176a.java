package p019G0;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p060U.C0530a;
import p060U.C0531b;
import p060U.C0532c;

/* JADX INFO: renamed from: G0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0176a {

    /* JADX INFO: renamed from: a */
    public static final TimeInterpolator f1125a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final TimeInterpolator f1126b = new C0531b();

    /* JADX INFO: renamed from: c */
    public static final TimeInterpolator f1127c = new C0530a();

    /* JADX INFO: renamed from: d */
    public static final TimeInterpolator f1128d = new C0532c();

    /* JADX INFO: renamed from: e */
    public static final TimeInterpolator f1129e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m482a(float f3, float f4, float f5) {
        return f3 + (f5 * (f4 - f3));
    }

    /* JADX INFO: renamed from: b */
    public static float m483b(float f3, float f4, float f5, float f6, float f7) {
        return f7 <= f5 ? f3 : f7 >= f6 ? f4 : m482a(f3, f4, (f7 - f5) / (f6 - f5));
    }

    /* JADX INFO: renamed from: c */
    public static int m484c(int i3, int i4, float f3) {
        return i3 + Math.round(f3 * (i4 - i3));
    }
}
