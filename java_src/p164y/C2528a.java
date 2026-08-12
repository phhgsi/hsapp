package p164y;

import p167z.AbstractC2571d;

/* JADX INFO: renamed from: y.a */
/* JADX INFO: loaded from: classes.dex */
public class C2528a {

    /* JADX INFO: renamed from: a */
    private final float f11789a;

    /* JADX INFO: renamed from: b */
    private final float f11790b;

    /* JADX INFO: renamed from: c */
    private final float f11791c;

    /* JADX INFO: renamed from: d */
    private final float f11792d;

    /* JADX INFO: renamed from: e */
    private final float f11793e;

    /* JADX INFO: renamed from: f */
    private final float f11794f;

    /* JADX INFO: renamed from: g */
    private final float f11795g;

    /* JADX INFO: renamed from: h */
    private final float f11796h;

    /* JADX INFO: renamed from: i */
    private final float f11797i;

    C2528a(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f11789a = f3;
        this.f11790b = f4;
        this.f11791c = f5;
        this.f11792d = f6;
        this.f11793e = f7;
        this.f11794f = f8;
        this.f11795g = f9;
        this.f11796h = f10;
        this.f11797i = f11;
    }

    /* JADX INFO: renamed from: b */
    private static C2528a m12060b(float f3, float f4, float f5) {
        float f6 = 100.0f;
        float f7 = 1000.0f;
        float f8 = 0.0f;
        C2528a c2528a = null;
        float f9 = 1000.0f;
        while (Math.abs(f8 - f6) > 0.01f) {
            float f10 = ((f6 - f8) / 2.0f) + f8;
            int iM12075p = m12063e(f10, f4, f3).m12075p();
            float fM12077b = AbstractC2529b.m12077b(iM12075p);
            float fAbs = Math.abs(f5 - fM12077b);
            if (fAbs < 0.2f) {
                C2528a c2528aM12061c = m12061c(iM12075p);
                float fM12067a = c2528aM12061c.m12067a(m12063e(c2528aM12061c.m12072k(), c2528aM12061c.m12070i(), f3));
                if (fM12067a <= 1.0f) {
                    c2528a = c2528aM12061c;
                    f7 = fAbs;
                    f9 = fM12067a;
                }
            }
            if (f7 == 0.0f && f9 == 0.0f) {
                return c2528a;
            }
            if (fM12077b < f5) {
                f8 = f10;
            } else {
                f6 = f10;
            }
        }
        return c2528a;
    }

    /* JADX INFO: renamed from: c */
    static C2528a m12061c(int i3) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m12062d(i3, C2542o.f11834k, fArr, fArr2);
        return new C2528a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* JADX INFO: renamed from: d */
    static void m12062d(int i3, C2542o c2542o, float[] fArr, float[] fArr2) {
        AbstractC2529b.m12081f(i3, fArr2);
        float[][] fArr3 = AbstractC2529b.f11798a;
        float f3 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f4 = fArr4[0] * f3;
        float f5 = fArr2[1];
        float f6 = f4 + (fArr4[1] * f5);
        float f7 = fArr2[2];
        float f8 = f6 + (fArr4[2] * f7);
        float[] fArr5 = fArr3[1];
        float f9 = (fArr5[0] * f3) + (fArr5[1] * f5) + (fArr5[2] * f7);
        float[] fArr6 = fArr3[2];
        float f10 = (f3 * fArr6[0]) + (f5 * fArr6[1]) + (f7 * fArr6[2]);
        float f11 = c2542o.m12191i()[0] * f8;
        float f12 = c2542o.m12191i()[1] * f9;
        float f13 = c2542o.m12191i()[2] * f10;
        float fPow = (float) Math.pow(((double) (c2542o.m12185c() * Math.abs(f11))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (c2542o.m12185c() * Math.abs(f12))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (c2542o.m12185c() * Math.abs(f13))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f11) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f12) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f13) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d3 = fSignum3;
        float f14 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d3)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d3 * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = (((fSignum * 20.0f) + f16) + (21.0f * fSignum3)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * c2542o.m12188f()) / c2542o.m12183a(), c2542o.m12184b() * c2542o.m12192j())) * 100.0f;
        float fM12184b = (4.0f / c2542o.m12184b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (c2542o.m12183a() + 4.0f) * c2542o.m12186d();
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, c2542o.m12187e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c2542o.m12189g()) * c2542o.m12190h()) * ((float) Math.sqrt((f14 * f14) + (f15 * f15)))) / (f17 + 0.305f), 0.9d));
        float fM12186d = c2542o.m12186d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r4 * c2542o.m12184b()) / (c2542o.m12183a() + 4.0f))) * 50.0f;
        float f20 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM12186d) + 1.0f)) * 43.85965f;
        double d4 = f19;
        float fCos = ((float) Math.cos(d4)) * fLog;
        float fSin = fLog * ((float) Math.sin(d4));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fM12184b;
            fArr[2] = fM12186d;
            fArr[3] = fSqrt2;
            fArr[4] = f20;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    /* JADX INFO: renamed from: e */
    private static C2528a m12063e(float f3, float f4, float f5) {
        return m12064f(f3, f4, f5, C2542o.f11834k);
    }

    /* JADX INFO: renamed from: f */
    private static C2528a m12064f(float f3, float f4, float f5, C2542o c2542o) {
        float fM12184b = (4.0f / c2542o.m12184b()) * ((float) Math.sqrt(((double) f3) / 100.0d)) * (c2542o.m12183a() + 4.0f) * c2542o.m12186d();
        float fM12186d = c2542o.m12186d() * f4;
        float fSqrt = ((float) Math.sqrt(((f4 / ((float) Math.sqrt(r4))) * c2542o.m12184b()) / (c2542o.m12183a() + 4.0f))) * 50.0f;
        float f6 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float fLog = ((float) Math.log((((double) fM12186d) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f5) / 180.0f;
        return new C2528a(f5, f4, f3, fM12184b, fM12186d, fSqrt, f6, ((float) Math.cos(d3)) * fLog, fLog * ((float) Math.sin(d3)));
    }

    /* JADX INFO: renamed from: m */
    public static int m12065m(float f3, float f4, float f5) {
        return m12066n(f3, f4, f5, C2542o.f11834k);
    }

    /* JADX INFO: renamed from: n */
    static int m12066n(float f3, float f4, float f5, C2542o c2542o) {
        if (f4 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
            return AbstractC2529b.m12076a(f5);
        }
        float fMin = f3 < 0.0f ? 0.0f : Math.min(360.0f, f3);
        C2528a c2528a = null;
        boolean z2 = true;
        float f6 = 0.0f;
        float f7 = f4;
        while (Math.abs(f6 - f4) >= 0.4f) {
            C2528a c2528aM12060b = m12060b(fMin, f7, f5);
            if (!z2) {
                if (c2528aM12060b == null) {
                    f4 = f7;
                } else {
                    f6 = f7;
                    c2528a = c2528aM12060b;
                }
                f7 = ((f4 - f6) / 2.0f) + f6;
            } else {
                if (c2528aM12060b != null) {
                    return c2528aM12060b.m12074o(c2542o);
                }
                f7 = ((f4 - f6) / 2.0f) + f6;
                z2 = false;
            }
        }
        return c2528a == null ? AbstractC2529b.m12076a(f5) : c2528a.m12074o(c2542o);
    }

    /* JADX INFO: renamed from: a */
    float m12067a(C2528a c2528a) {
        float fM12073l = m12073l() - c2528a.m12073l();
        float fM12068g = m12068g() - c2528a.m12068g();
        float fM12069h = m12069h() - c2528a.m12069h();
        return (float) (Math.pow(Math.sqrt((fM12073l * fM12073l) + (fM12068g * fM12068g) + (fM12069h * fM12069h)), 0.63d) * 1.41d);
    }

    /* JADX INFO: renamed from: g */
    float m12068g() {
        return this.f11796h;
    }

    /* JADX INFO: renamed from: h */
    float m12069h() {
        return this.f11797i;
    }

    /* JADX INFO: renamed from: i */
    float m12070i() {
        return this.f11790b;
    }

    /* JADX INFO: renamed from: j */
    float m12071j() {
        return this.f11789a;
    }

    /* JADX INFO: renamed from: k */
    float m12072k() {
        return this.f11791c;
    }

    /* JADX INFO: renamed from: l */
    float m12073l() {
        return this.f11795g;
    }

    /* JADX INFO: renamed from: o */
    int m12074o(C2542o c2542o) {
        float fPow = (float) Math.pow(((double) ((((double) m12070i()) == 0.0d || ((double) m12072k()) == 0.0d) ? 0.0f : m12070i() / ((float) Math.sqrt(((double) m12072k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, c2542o.m12187e()), 0.73d), 1.1111111111111112d);
        double dM12071j = (m12071j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM12071j) + 3.8d)) * 0.25f;
        float fM12183a = c2542o.m12183a() * ((float) Math.pow(((double) m12072k()) / 100.0d, (1.0d / ((double) c2542o.m12184b())) / ((double) c2542o.m12192j())));
        float fM12189g = fCos * 3846.1538f * c2542o.m12189g() * c2542o.m12190h();
        float fM12188f = fM12183a / c2542o.m12188f();
        float fSin = (float) Math.sin(dM12071j);
        float fCos2 = (float) Math.cos(dM12071j);
        float f3 = (((0.305f + fM12188f) * 23.0f) * fPow) / (((fM12189g * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f4 = fCos2 * f3;
        float f5 = f3 * fSin;
        float f6 = fM12188f * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float fSignum = Math.signum(f7) * (100.0f / c2542o.m12185c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f8) * (100.0f / c2542o.m12185c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / c2542o.m12185c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f9 = fSignum / c2542o.m12191i()[0];
        float f10 = fSignum2 / c2542o.m12191i()[1];
        float f11 = fSignum3 / c2542o.m12191i()[2];
        float[][] fArr = AbstractC2529b.f11799b;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11);
        float[] fArr4 = fArr[2];
        return AbstractC2571d.m12260b(f12, f13, (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    /* JADX INFO: renamed from: p */
    int m12075p() {
        return m12074o(C2542o.f11834k);
    }
}
