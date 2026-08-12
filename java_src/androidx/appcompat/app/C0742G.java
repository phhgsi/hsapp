package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.G */
/* JADX INFO: loaded from: classes.dex */
class C0742G {

    /* JADX INFO: renamed from: d */
    private static C0742G f2610d;

    /* JADX INFO: renamed from: a */
    public long f2611a;

    /* JADX INFO: renamed from: b */
    public long f2612b;

    /* JADX INFO: renamed from: c */
    public int f2613c;

    C0742G() {
    }

    /* JADX INFO: renamed from: b */
    static C0742G m2722b() {
        if (f2610d == null) {
            f2610d = new C0742G();
        }
        return f2610d;
    }

    /* JADX INFO: renamed from: a */
    public void m2723a(long j3, double d3, double d4) {
        double d5 = (0.01720197f * ((j3 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d5) * 0.03341960161924362d) + d5 + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d4) / 360.0d) + (Math.sin(d5) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d3;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(dAsin))) / (Math.cos(d6) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f2613c = 1;
            this.f2611a = -1L;
            this.f2612b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f2613c = 0;
                this.f2611a = -1L;
                this.f2612b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f2611a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f2612b = jRound;
            if (jRound >= j3 || this.f2611a <= j3) {
                this.f2613c = 1;
            } else {
                this.f2613c = 0;
            }
        }
    }
}
