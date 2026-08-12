package p102f2;

/* JADX INFO: renamed from: f2.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1953q0 extends AbstractC1964w {
    /* JADX INFO: renamed from: G */
    public abstract AbstractC1953q0 mo10010G();

    /* JADX INFO: renamed from: H */
    protected final String m10011H() {
        AbstractC1953q0 abstractC1953q0Mo10010G;
        AbstractC1953q0 abstractC1953q0M9814c = C1907M.m9814c();
        if (this == abstractC1953q0M9814c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC1953q0Mo10010G = abstractC1953q0M9814c.mo10010G();
        } catch (UnsupportedOperationException unused) {
            abstractC1953q0Mo10010G = null;
        }
        if (this == abstractC1953q0Mo10010G) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
