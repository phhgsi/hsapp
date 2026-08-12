package p076Z0;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: Z0.q */
/* JADX INFO: loaded from: classes.dex */
class C0646q extends AbstractC0645p {

    /* JADX INFO: renamed from: f */
    private boolean f2305f = false;

    /* JADX INFO: renamed from: g */
    private float f2306g = 0.0f;

    /* JADX INFO: renamed from: Z0.q$a */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C0646q c0646q = C0646q.this;
            if (c0646q.f2302c == null || c0646q.f2303d.isEmpty()) {
                return;
            }
            C0646q c0646q2 = C0646q.this;
            RectF rectF = c0646q2.f2303d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c0646q2.f2306g);
        }
    }

    C0646q(View view) {
        m2440m(view);
    }

    /* JADX INFO: renamed from: l */
    private float m2439l() {
        RectF rectF;
        C0641l c0641l = this.f2302c;
        if (c0641l == null || (rectF = this.f2303d) == null) {
            return 0.0f;
        }
        return c0641l.f2235f.mo2214a(rectF);
    }

    /* JADX INFO: renamed from: m */
    private void m2440m(View view) {
        view.setOutlineProvider(new a());
    }

    /* JADX INFO: renamed from: n */
    private boolean m2441n() {
        C0641l c0641l;
        if (this.f2303d.isEmpty() || (c0641l = this.f2302c) == null) {
            return false;
        }
        return c0641l.m2325v(this.f2303d);
    }

    /* JADX INFO: renamed from: o */
    private boolean m2442o() {
        C0641l c0641l;
        if (!this.f2303d.isEmpty() && (c0641l = this.f2302c) != null && this.f2301b && !c0641l.m2325v(this.f2303d) && m2443p(this.f2302c)) {
            float fMo2214a = this.f2302c.m2321r().mo2214a(this.f2303d);
            float fMo2214a2 = this.f2302c.m2323t().mo2214a(this.f2303d);
            float fMo2214a3 = this.f2302c.m2314j().mo2214a(this.f2303d);
            float fMo2214a4 = this.f2302c.m2316l().mo2214a(this.f2303d);
            if (fMo2214a == 0.0f && fMo2214a3 == 0.0f && fMo2214a2 == fMo2214a4) {
                RectF rectF = this.f2303d;
                rectF.set(rectF.left - fMo2214a2, rectF.top, rectF.right, rectF.bottom);
                this.f2306g = fMo2214a2;
                return true;
            }
            if (fMo2214a == 0.0f && fMo2214a2 == 0.0f && fMo2214a3 == fMo2214a4) {
                RectF rectF2 = this.f2303d;
                rectF2.set(rectF2.left, rectF2.top - fMo2214a3, rectF2.right, rectF2.bottom);
                this.f2306g = fMo2214a3;
                return true;
            }
            if (fMo2214a2 == 0.0f && fMo2214a4 == 0.0f && fMo2214a == fMo2214a3) {
                RectF rectF3 = this.f2303d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fMo2214a, rectF3.bottom);
                this.f2306g = fMo2214a;
                return true;
            }
            if (fMo2214a3 == 0.0f && fMo2214a4 == 0.0f && fMo2214a == fMo2214a2) {
                RectF rectF4 = this.f2303d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fMo2214a);
                this.f2306g = fMo2214a;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private static boolean m2443p(C0641l c0641l) {
        return (c0641l.m2320q() instanceof C0640k) && (c0641l.m2322s() instanceof C0640k) && (c0641l.m2313i() instanceof C0640k) && (c0641l.m2315k() instanceof C0640k);
    }

    @Override // p076Z0.AbstractC0645p
    /* JADX INFO: renamed from: b */
    void mo2431b(View view) {
        this.f2306g = m2439l();
        this.f2305f = m2441n() || m2442o();
        view.setClipToOutline(!mo2437i());
        if (mo2437i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // p076Z0.AbstractC0645p
    /* JADX INFO: renamed from: i */
    boolean mo2437i() {
        return !this.f2305f || this.f2300a;
    }
}
