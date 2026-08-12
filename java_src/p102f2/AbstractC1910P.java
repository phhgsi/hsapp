package p102f2;

import p038M1.C0412f;

/* JADX INFO: renamed from: f2.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1910P extends AbstractC1964w {

    /* JADX INFO: renamed from: f */
    private long f9417f;

    /* JADX INFO: renamed from: g */
    private boolean f9418g;

    /* JADX INFO: renamed from: h */
    private C0412f f9419h;

    /* JADX INFO: renamed from: H */
    private final long m9818H(boolean z2) {
        return z2 ? 4294967296L : 1L;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m9819L(AbstractC1910P abstractC1910P, boolean z2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        abstractC1910P.m9823K(z2);
    }

    /* JADX INFO: renamed from: G */
    public final void m9820G(boolean z2) {
        long jM9818H = this.f9417f - m9818H(z2);
        this.f9417f = jM9818H;
        if (jM9818H <= 0 && this.f9418g) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m9821I(AbstractC1905K abstractC1905K) {
        C0412f c0412f = this.f9419h;
        if (c0412f == null) {
            c0412f = new C0412f();
            this.f9419h = c0412f;
        }
        c0412f.addLast(abstractC1905K);
    }

    /* JADX INFO: renamed from: J */
    protected long mo9822J() {
        C0412f c0412f = this.f9419h;
        return (c0412f == null || c0412f.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: K */
    public final void m9823K(boolean z2) {
        this.f9417f += m9818H(z2);
        if (z2) {
            return;
        }
        this.f9418g = true;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m9824M() {
        return this.f9417f >= m9818H(true);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m9825N() {
        C0412f c0412f = this.f9419h;
        if (c0412f != null) {
            return c0412f.isEmpty();
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m9826O() {
        AbstractC1905K abstractC1905K;
        C0412f c0412f = this.f9419h;
        if (c0412f == null || (abstractC1905K = (AbstractC1905K) c0412f.m1432m()) == null) {
            return false;
        }
        abstractC1905K.run();
        return true;
    }

    public abstract void shutdown();
}
