package p149t;

import java.util.ArrayList;
import p146s.C2382d;
import p146s.C2383e;
import p146s.C2384f;

/* JADX INFO: renamed from: t.c */
/* JADX INFO: loaded from: classes.dex */
public class C2411c extends AbstractC2424p {

    /* JADX INFO: renamed from: k */
    ArrayList f11264k;

    /* JADX INFO: renamed from: l */
    private int f11265l;

    public C2411c(C2383e c2383e, int i3) {
        super(c2383e);
        this.f11264k = new ArrayList();
        this.f11333f = i3;
        m11593q();
    }

    /* JADX INFO: renamed from: q */
    private void m11593q() {
        C2383e c2383e;
        C2383e c2383e2 = this.f11329b;
        C2383e c2383eM11284L = c2383e2.m11284L(this.f11333f);
        while (true) {
            C2383e c2383e3 = c2383eM11284L;
            c2383e = c2383e2;
            c2383e2 = c2383e3;
            if (c2383e2 == null) {
                break;
            } else {
                c2383eM11284L = c2383e2.m11284L(this.f11333f);
            }
        }
        this.f11329b = c2383e;
        this.f11264k.add(c2383e.m11288N(this.f11333f));
        C2383e c2383eM11280J = c2383e.m11280J(this.f11333f);
        while (c2383eM11280J != null) {
            this.f11264k.add(c2383eM11280J.m11288N(this.f11333f));
            c2383eM11280J = c2383eM11280J.m11280J(this.f11333f);
        }
        ArrayList arrayList = this.f11264k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            AbstractC2424p abstractC2424p = (AbstractC2424p) obj;
            int i4 = this.f11333f;
            if (i4 == 0) {
                abstractC2424p.f11329b.f10936c = this;
            } else if (i4 == 1) {
                abstractC2424p.f11329b.f10938d = this;
            }
        }
        if (this.f11333f == 0 && ((C2384f) this.f11329b.m11282K()).m11382J1() && this.f11264k.size() > 1) {
            ArrayList arrayList2 = this.f11264k;
            this.f11329b = ((AbstractC2424p) arrayList2.get(arrayList2.size() - 1)).f11329b;
        }
        this.f11265l = this.f11333f == 0 ? this.f11329b.m11365z() : this.f11329b.m11292P();
    }

    /* JADX INFO: renamed from: r */
    private C2383e m11594r() {
        for (int i3 = 0; i3 < this.f11264k.size(); i3++) {
            AbstractC2424p abstractC2424p = (AbstractC2424p) this.f11264k.get(i3);
            if (abstractC2424p.f11329b.m11298S() != 8) {
                return abstractC2424p.f11329b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private C2383e m11595s() {
        for (int size = this.f11264k.size() - 1; size >= 0; size--) {
            AbstractC2424p abstractC2424p = (AbstractC2424p) this.f11264k.get(size);
            if (abstractC2424p.f11329b.m11298S() != 8) {
                return abstractC2424p.f11329b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    @Override // p149t.AbstractC2424p, p149t.InterfaceC2412d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo11596a(p149t.InterfaceC2412d r27) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149t.C2411c.mo11596a(t.d):void");
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: d */
    void mo11597d() {
        ArrayList arrayList = this.f11264k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((AbstractC2424p) obj).mo11597d();
        }
        int size2 = this.f11264k.size();
        if (size2 < 1) {
            return;
        }
        C2383e c2383e = ((AbstractC2424p) this.f11264k.get(0)).f11329b;
        C2383e c2383e2 = ((AbstractC2424p) this.f11264k.get(size2 - 1)).f11329b;
        if (this.f11333f == 0) {
            C2382d c2382d = c2383e.f10919N;
            C2382d c2382d2 = c2383e2.f10921P;
            C2414f c2414fM11656i = m11656i(c2382d, 0);
            int iM11243f = c2382d.m11243f();
            C2383e c2383eM11594r = m11594r();
            if (c2383eM11594r != null) {
                iM11243f = c2383eM11594r.f10919N.m11243f();
            }
            if (c2414fM11656i != null) {
                m11652b(this.f11335h, c2414fM11656i, iM11243f);
            }
            C2414f c2414fM11656i2 = m11656i(c2382d2, 0);
            int iM11243f2 = c2382d2.m11243f();
            C2383e c2383eM11595s = m11595s();
            if (c2383eM11595s != null) {
                iM11243f2 = c2383eM11595s.f10921P.m11243f();
            }
            if (c2414fM11656i2 != null) {
                m11652b(this.f11336i, c2414fM11656i2, -iM11243f2);
            }
        } else {
            C2382d c2382d3 = c2383e.f10920O;
            C2382d c2382d4 = c2383e2.f10922Q;
            C2414f c2414fM11656i3 = m11656i(c2382d3, 1);
            int iM11243f3 = c2382d3.m11243f();
            C2383e c2383eM11594r2 = m11594r();
            if (c2383eM11594r2 != null) {
                iM11243f3 = c2383eM11594r2.f10920O.m11243f();
            }
            if (c2414fM11656i3 != null) {
                m11652b(this.f11335h, c2414fM11656i3, iM11243f3);
            }
            C2414f c2414fM11656i4 = m11656i(c2382d4, 1);
            int iM11243f4 = c2382d4.m11243f();
            C2383e c2383eM11595s2 = m11595s();
            if (c2383eM11595s2 != null) {
                iM11243f4 = c2383eM11595s2.f10922Q.m11243f();
            }
            if (c2414fM11656i4 != null) {
                m11652b(this.f11336i, c2414fM11656i4, -iM11243f4);
            }
        }
        this.f11335h.f11275a = this;
        this.f11336i.f11275a = this;
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: e */
    public void mo11598e() {
        for (int i3 = 0; i3 < this.f11264k.size(); i3++) {
            ((AbstractC2424p) this.f11264k.get(i3)).mo11598e();
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: f */
    void mo11599f() {
        this.f11330c = null;
        ArrayList arrayList = this.f11264k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((AbstractC2424p) obj).mo11599f();
        }
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: j */
    public long mo11600j() {
        int size = this.f11264k.size();
        long jMo11600j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC2424p abstractC2424p = (AbstractC2424p) this.f11264k.get(i3);
            jMo11600j = jMo11600j + ((long) abstractC2424p.f11335h.f11280f) + abstractC2424p.mo11600j() + ((long) abstractC2424p.f11336i.f11280f);
        }
        return jMo11600j;
    }

    @Override // p149t.AbstractC2424p
    /* JADX INFO: renamed from: m */
    boolean mo11601m() {
        int size = this.f11264k.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!((AbstractC2424p) this.f11264k.get(i3)).mo11601m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f11333f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f11264k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            sb.append("<");
            sb.append((AbstractC2424p) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
