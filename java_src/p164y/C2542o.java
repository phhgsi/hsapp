package p164y;

/* JADX INFO: renamed from: y.o */
/* JADX INFO: loaded from: classes.dex */
final class C2542o {

    /* JADX INFO: renamed from: k */
    static final C2542o f11834k = m12182k(AbstractC2529b.f11800c, (float) ((((double) AbstractC2529b.m12083h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a */
    private final float f11835a;

    /* JADX INFO: renamed from: b */
    private final float f11836b;

    /* JADX INFO: renamed from: c */
    private final float f11837c;

    /* JADX INFO: renamed from: d */
    private final float f11838d;

    /* JADX INFO: renamed from: e */
    private final float f11839e;

    /* JADX INFO: renamed from: f */
    private final float f11840f;

    /* JADX INFO: renamed from: g */
    private final float[] f11841g;

    /* JADX INFO: renamed from: h */
    private final float f11842h;

    /* JADX INFO: renamed from: i */
    private final float f11843i;

    /* JADX INFO: renamed from: j */
    private final float f11844j;

    private C2542o(float f3, float f4, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.f11840f = f3;
        this.f11835a = f4;
        this.f11836b = f5;
        this.f11837c = f6;
        this.f11838d = f7;
        this.f11839e = f8;
        this.f11841g = fArr;
        this.f11842h = f9;
        this.f11843i = f10;
        this.f11844j = f11;
    }

    /* JADX INFO: renamed from: k */
    static C2542o m12182k(float[] fArr, float f3, float f4, float f5, boolean z2) {
        float[][] fArr2 = AbstractC2529b.f11798a;
        float f6 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f7 = fArr3[0] * f6;
        float f8 = fArr[1];
        float f9 = f7 + (fArr3[1] * f8);
        float f10 = fArr[2];
        float f11 = f9 + (fArr3[2] * f10);
        float[] fArr4 = fArr2[1];
        float f12 = (fArr4[0] * f6) + (fArr4[1] * f8) + (fArr4[2] * f10);
        float[] fArr5 = fArr2[2];
        float f13 = (f6 * fArr5[0]) + (f8 * fArr5[1]) + (f10 * fArr5[2]);
        float f14 = (f5 / 10.0f) + 0.8f;
        float fM12079d = ((double) f14) >= 0.9d ? AbstractC2529b.m12079d(0.59f, 0.69f, (f14 - 0.9f) * 10.0f) : AbstractC2529b.m12079d(0.525f, 0.59f, (f14 - 0.8f) * 10.0f);
        float fExp = z2 ? 1.0f : (1.0f - (((float) Math.exp(((-f3) - 42.0f) / 92.0f)) * 0.2777778f)) * f14;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f12) * fExp) + 1.0f) - fExp, (((100.0f / f13) * fExp) + 1.0f) - fExp};
        float f15 = 1.0f / ((5.0f * f3) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float fCbrt = (f16 * f3) + (0.1f * f17 * f17 * ((float) Math.cbrt(((double) f3) * 5.0d)));
        float fM12083h = AbstractC2529b.m12083h(f4) / fArr[1];
        double d4 = fM12083h;
        float fSqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d4, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f11)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f12)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f13)) / 100.0d, 0.42d)};
        float f18 = fArr7[0];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[1];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[2];
        float[] fArr8 = {f19, f21, (400.0f * f22) / (f22 + 27.13f)};
        return new C2542o(fM12083h, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fM12079d, f14, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* JADX INFO: renamed from: a */
    float m12183a() {
        return this.f11835a;
    }

    /* JADX INFO: renamed from: b */
    float m12184b() {
        return this.f11838d;
    }

    /* JADX INFO: renamed from: c */
    float m12185c() {
        return this.f11842h;
    }

    /* JADX INFO: renamed from: d */
    float m12186d() {
        return this.f11843i;
    }

    /* JADX INFO: renamed from: e */
    float m12187e() {
        return this.f11840f;
    }

    /* JADX INFO: renamed from: f */
    float m12188f() {
        return this.f11836b;
    }

    /* JADX INFO: renamed from: g */
    float m12189g() {
        return this.f11839e;
    }

    /* JADX INFO: renamed from: h */
    float m12190h() {
        return this.f11837c;
    }

    /* JADX INFO: renamed from: i */
    float[] m12191i() {
        return this.f11841g;
    }

    /* JADX INFO: renamed from: j */
    float m12192j() {
        return this.f11844j;
    }
}
