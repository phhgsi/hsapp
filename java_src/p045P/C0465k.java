package p045P;

import android.util.AndroidRuntimeException;
import p045P.AbstractC0462h;

/* JADX INFO: renamed from: P.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0465k extends AbstractC0462h {

    /* JADX INFO: renamed from: B */
    private C0466l f1656B;

    /* JADX INFO: renamed from: C */
    private float f1657C;

    /* JADX INFO: renamed from: D */
    private boolean f1658D;

    public C0465k(Object obj, AbstractC0463i abstractC0463i) {
        super(obj, abstractC0463i);
        this.f1656B = null;
        this.f1657C = Float.MAX_VALUE;
        this.f1658D = false;
    }

    /* JADX INFO: renamed from: p */
    private void m1711p() {
        C0466l c0466l = this.f1656B;
        if (c0466l == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM1719b = c0466l.m1719b();
        if (dM1719b > this.f1646g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dM1719b < this.f1647h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // p045P.AbstractC0462h
    /* JADX INFO: renamed from: j */
    public void mo1679j() {
        m1711p();
        this.f1656B.m1725i(m1675e());
        super.mo1679j();
    }

    @Override // p045P.AbstractC0462h
    /* JADX INFO: renamed from: l */
    boolean mo1680l(long j3) {
        if (this.f1658D) {
            float f3 = this.f1657C;
            if (f3 != Float.MAX_VALUE) {
                this.f1656B.m1723g(f3);
                this.f1657C = Float.MAX_VALUE;
            }
            this.f1641b = this.f1656B.m1719b();
            this.f1640a = 0.0f;
            this.f1658D = false;
            return true;
        }
        if (this.f1657C != Float.MAX_VALUE) {
            long j4 = j3 / 2;
            AbstractC0462h.o oVarM1726j = this.f1656B.m1726j(this.f1641b, this.f1640a, j4);
            this.f1656B.m1723g(this.f1657C);
            this.f1657C = Float.MAX_VALUE;
            AbstractC0462h.o oVarM1726j2 = this.f1656B.m1726j(oVarM1726j.f1653a, oVarM1726j.f1654b, j4);
            this.f1641b = oVarM1726j2.f1653a;
            this.f1640a = oVarM1726j2.f1654b;
        } else {
            AbstractC0462h.o oVarM1726j3 = this.f1656B.m1726j(this.f1641b, this.f1640a, j3);
            this.f1641b = oVarM1726j3.f1653a;
            this.f1640a = oVarM1726j3.f1654b;
        }
        float fMax = Math.max(this.f1641b, this.f1647h);
        this.f1641b = fMax;
        float fMin = Math.min(fMax, this.f1646g);
        this.f1641b = fMin;
        if (!m1714o(fMin, this.f1640a)) {
            return false;
        }
        this.f1641b = this.f1656B.m1719b();
        this.f1640a = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m1712m(float f3) {
        if (m1676f()) {
            this.f1657C = f3;
            return;
        }
        if (this.f1656B == null) {
            this.f1656B = new C0466l(f3);
        }
        this.f1656B.m1723g(f3);
        mo1679j();
    }

    /* JADX INFO: renamed from: n */
    public boolean m1713n() {
        return this.f1656B.f1660b > 0.0d;
    }

    /* JADX INFO: renamed from: o */
    boolean m1714o(float f3, float f4) {
        return this.f1656B.m1721e(f3, f4);
    }

    /* JADX INFO: renamed from: q */
    public C0465k m1715q(C0466l c0466l) {
        this.f1656B = c0466l;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m1716r() {
        if (!m1713n()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!m1674c().m1658j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f1645f) {
            this.f1658D = true;
        }
    }
}
