package p055S0;

/* JADX INFO: renamed from: S0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0505a {
    /* JADX INFO: renamed from: a */
    public static boolean m1847a(float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f3 = fArr[0];
        for (int i3 = 1; i3 < fArr.length; i3++) {
            if (fArr[i3] != f3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static float m1848b(float f3, float f4, float f5, float f6) {
        return (float) Math.hypot(f5 - f3, f6 - f4);
    }

    /* JADX INFO: renamed from: c */
    public static float m1849c(float f3, float f4, float f5) {
        return ((1.0f - f5) * f3) + (f5 * f4);
    }
}
