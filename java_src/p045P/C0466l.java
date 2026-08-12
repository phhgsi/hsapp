package p045P;

import p045P.AbstractC0462h;

/* JADX INFO: renamed from: P.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0466l {

    /* JADX INFO: renamed from: a */
    double f1659a;

    /* JADX INFO: renamed from: b */
    double f1660b;

    /* JADX INFO: renamed from: c */
    private boolean f1661c;

    /* JADX INFO: renamed from: d */
    private double f1662d;

    /* JADX INFO: renamed from: e */
    private double f1663e;

    /* JADX INFO: renamed from: f */
    private double f1664f;

    /* JADX INFO: renamed from: g */
    private double f1665g;

    /* JADX INFO: renamed from: h */
    private double f1666h;

    /* JADX INFO: renamed from: i */
    private double f1667i;

    /* JADX INFO: renamed from: j */
    private final AbstractC0462h.o f1668j;

    public C0466l() {
        this.f1659a = Math.sqrt(1500.0d);
        this.f1660b = 0.5d;
        this.f1661c = false;
        this.f1667i = Double.MAX_VALUE;
        this.f1668j = new AbstractC0462h.o();
    }

    /* JADX INFO: renamed from: d */
    private void m1717d() {
        if (this.f1661c) {
            return;
        }
        if (this.f1667i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d3 = this.f1660b;
        if (d3 > 1.0d) {
            double d4 = this.f1659a;
            this.f1664f = ((-d3) * d4) + (d4 * Math.sqrt((d3 * d3) - 1.0d));
            double d5 = this.f1660b;
            double d6 = this.f1659a;
            this.f1665g = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
        } else if (d3 >= 0.0d && d3 < 1.0d) {
            this.f1666h = this.f1659a * Math.sqrt(1.0d - (d3 * d3));
        }
        this.f1661c = true;
    }

    /* JADX INFO: renamed from: a */
    public float m1718a() {
        return (float) this.f1660b;
    }

    /* JADX INFO: renamed from: b */
    public float m1719b() {
        return (float) this.f1667i;
    }

    /* JADX INFO: renamed from: c */
    public float m1720c() {
        double d3 = this.f1659a;
        return (float) (d3 * d3);
    }

    /* JADX INFO: renamed from: e */
    public boolean m1721e(float f3, float f4) {
        return ((double) Math.abs(f4)) < this.f1663e && ((double) Math.abs(f3 - m1719b())) < this.f1662d;
    }

    /* JADX INFO: renamed from: f */
    public C0466l m1722f(float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f1660b = f3;
        this.f1661c = false;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C0466l m1723g(float f3) {
        this.f1667i = f3;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C0466l m1724h(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f1659a = Math.sqrt(f3);
        this.f1661c = false;
        return this;
    }

    /* JADX INFO: renamed from: i */
    void m1725i(double d3) {
        double dAbs = Math.abs(d3);
        this.f1662d = dAbs;
        this.f1663e = dAbs * 62.5d;
    }

    /* JADX INFO: renamed from: j */
    AbstractC0462h.o m1726j(double d3, double d4, long j3) {
        double dPow;
        double dCos;
        m1717d();
        double d5 = j3 / 1000.0d;
        double d6 = d3 - this.f1667i;
        double d7 = this.f1660b;
        if (d7 > 1.0d) {
            double d8 = this.f1665g;
            double d9 = this.f1664f;
            double d10 = d6 - (((d8 * d6) - d4) / (d8 - d9));
            double d11 = ((d6 * d8) - d4) / (d8 - d9);
            dPow = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f1664f * d5) * d11);
            double d12 = this.f1665g;
            double dPow2 = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f1664f;
            dCos = dPow2 + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f1659a;
            double d15 = d4 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            dPow = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double dPow3 = d16 * Math.pow(2.718281828459045d, (-this.f1659a) * d5);
            double d17 = this.f1659a;
            dCos = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (dPow3 * (-d17));
        } else {
            double d18 = 1.0d / this.f1666h;
            double d19 = this.f1659a;
            double d20 = d18 * ((d7 * d19 * d6) + d4);
            dPow = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f1666h * d5) * d6) + (Math.sin(this.f1666h * d5) * d20));
            double d21 = this.f1659a;
            double d22 = this.f1660b;
            double dPow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d23 = this.f1666h;
            double dSin = (-d23) * d6 * Math.sin(d23 * d5);
            double d24 = this.f1666h;
            dCos = ((-d21) * dPow * d22) + (dPow4 * (dSin + (d20 * d24 * Math.cos(d24 * d5))));
        }
        AbstractC0462h.o oVar = this.f1668j;
        oVar.f1653a = (float) (dPow + this.f1667i);
        oVar.f1654b = (float) dCos;
        return oVar;
    }

    public C0466l(float f3) {
        this.f1659a = Math.sqrt(1500.0d);
        this.f1660b = 0.5d;
        this.f1661c = false;
        this.f1667i = Double.MAX_VALUE;
        this.f1668j = new AbstractC0462h.o();
        this.f1667i = f3;
    }
}
