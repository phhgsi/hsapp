package p164y;

import android.graphics.Color;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: y.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2529b {

    /* JADX INFO: renamed from: a */
    static final float[][] f11798a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    static final float[][] f11799b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    static final float[] f11800c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    static final float[][] f11801d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: a */
    static int m12076a(float f3) {
        if (f3 < 1.0f) {
            return -16777216;
        }
        if (f3 > 99.0f) {
            return -1;
        }
        float f4 = (f3 + 16.0f) / 116.0f;
        float f5 = f3 > 8.0f ? f4 * f4 * f4 : f3 / 903.2963f;
        float f6 = f4 * f4 * f4;
        boolean z2 = f6 > 0.008856452f;
        float f7 = z2 ? f6 : ((f4 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f6 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f11800c;
        return AbstractC2571d.m12260b(f7 * fArr[0], f5 * fArr[1], f6 * fArr[2]);
    }

    /* JADX INFO: renamed from: b */
    static float m12077b(int i3) {
        return m12078c(m12082g(i3));
    }

    /* JADX INFO: renamed from: c */
    static float m12078c(float f3) {
        float f4 = f3 / 100.0f;
        return f4 <= 0.008856452f ? f4 * 903.2963f : (((float) Math.cbrt(f4)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: renamed from: d */
    static float m12079d(float f3, float f4, float f5) {
        return f3 + ((f4 - f3) * f5);
    }

    /* JADX INFO: renamed from: e */
    static float m12080e(int i3) {
        float f3 = i3 / 255.0f;
        return (f3 <= 0.04045f ? f3 / 12.92f : (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: f */
    static void m12081f(int i3, float[] fArr) {
        float fM12080e = m12080e(Color.red(i3));
        float fM12080e2 = m12080e(Color.green(i3));
        float fM12080e3 = m12080e(Color.blue(i3));
        float[][] fArr2 = f11801d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fM12080e) + (fArr3[1] * fM12080e2) + (fArr3[2] * fM12080e3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fM12080e) + (fArr4[1] * fM12080e2) + (fArr4[2] * fM12080e3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fM12080e * fArr5[0]) + (fM12080e2 * fArr5[1]) + (fM12080e3 * fArr5[2]);
    }

    /* JADX INFO: renamed from: g */
    static float m12082g(int i3) {
        float fM12080e = m12080e(Color.red(i3));
        float fM12080e2 = m12080e(Color.green(i3));
        float fM12080e3 = m12080e(Color.blue(i3));
        float[] fArr = f11801d[1];
        return (fM12080e * fArr[0]) + (fM12080e2 * fArr[1]) + (fM12080e3 * fArr[2]);
    }

    /* JADX INFO: renamed from: h */
    static float m12083h(float f3) {
        return (f3 > 8.0f ? (float) Math.pow((((double) f3) + 16.0d) / 116.0d, 3.0d) : f3 / 903.2963f) * 100.0f;
    }
}
