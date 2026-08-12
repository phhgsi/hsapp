package p146s;

import java.util.ArrayList;
import p137p.C2305c;

/* JADX INFO: renamed from: s.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2391m extends C2383e {

    /* JADX INFO: renamed from: J0 */
    public ArrayList f11088J0 = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m11494a(C2383e c2383e) {
        this.f11088J0.add(c2383e);
        if (c2383e.m11282K() != null) {
            ((AbstractC2391m) c2383e.m11282K()).m11496n1(c2383e);
        }
        c2383e.m11307W0(this);
    }

    /* JADX INFO: renamed from: l1 */
    public ArrayList m11495l1() {
        return this.f11088J0;
    }

    /* JADX INFO: renamed from: m1 */
    public abstract void mo11392m1();

    /* JADX INFO: renamed from: n1 */
    public void m11496n1(C2383e c2383e) {
        this.f11088J0.remove(c2383e);
        c2383e.mo11348q0();
    }

    /* JADX INFO: renamed from: o1 */
    public void m11497o1() {
        this.f11088J0.clear();
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: q0 */
    public void mo11348q0() {
        this.f11088J0.clear();
        super.mo11348q0();
    }

    @Override // p146s.C2383e
    /* JADX INFO: renamed from: t0 */
    public void mo11354t0(C2305c c2305c) {
        super.mo11354t0(c2305c);
        int size = this.f11088J0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C2383e) this.f11088J0.get(i3)).mo11354t0(c2305c);
        }
    }
}
