package p146s;

import java.util.HashSet;
import p146s.C2383e;
import p149t.C2410b;

/* JADX INFO: renamed from: s.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2390l extends AbstractC2388j {

    /* JADX INFO: renamed from: L0 */
    private int f11075L0 = 0;

    /* JADX INFO: renamed from: M0 */
    private int f11076M0 = 0;

    /* JADX INFO: renamed from: N0 */
    private int f11077N0 = 0;

    /* JADX INFO: renamed from: O0 */
    private int f11078O0 = 0;

    /* JADX INFO: renamed from: P0 */
    private int f11079P0 = 0;

    /* JADX INFO: renamed from: Q0 */
    private int f11080Q0 = 0;

    /* JADX INFO: renamed from: R0 */
    private int f11081R0 = 0;

    /* JADX INFO: renamed from: S0 */
    private int f11082S0 = 0;

    /* JADX INFO: renamed from: T0 */
    private boolean f11083T0 = false;

    /* JADX INFO: renamed from: U0 */
    private int f11084U0 = 0;

    /* JADX INFO: renamed from: V0 */
    private int f11085V0 = 0;

    /* JADX INFO: renamed from: W0 */
    protected C2410b.a f11086W0 = new C2410b.a();

    /* JADX INFO: renamed from: X0 */
    C2410b.b f11087X0 = null;

    /* JADX INFO: renamed from: A1 */
    protected void m11473A1(boolean z2) {
        this.f11083T0 = z2;
    }

    /* JADX INFO: renamed from: B1 */
    public void m11474B1(int i3, int i4) {
        this.f11084U0 = i3;
        this.f11085V0 = i4;
    }

    /* JADX INFO: renamed from: C1 */
    public void m11475C1(int i3) {
        this.f11077N0 = i3;
        this.f11075L0 = i3;
        this.f11078O0 = i3;
        this.f11076M0 = i3;
        this.f11079P0 = i3;
        this.f11080Q0 = i3;
    }

    /* JADX INFO: renamed from: D1 */
    public void m11476D1(int i3) {
        this.f11076M0 = i3;
    }

    /* JADX INFO: renamed from: E1 */
    public void m11477E1(int i3) {
        this.f11080Q0 = i3;
    }

    /* JADX INFO: renamed from: F1 */
    public void m11478F1(int i3) {
        this.f11077N0 = i3;
        this.f11081R0 = i3;
    }

    /* JADX INFO: renamed from: G1 */
    public void m11479G1(int i3) {
        this.f11078O0 = i3;
        this.f11082S0 = i3;
    }

    /* JADX INFO: renamed from: H1 */
    public void m11480H1(int i3) {
        this.f11079P0 = i3;
        this.f11081R0 = i3;
        this.f11082S0 = i3;
    }

    /* JADX INFO: renamed from: I1 */
    public void m11481I1(int i3) {
        this.f11075L0 = i3;
    }

    @Override // p146s.AbstractC2388j, p146s.InterfaceC2387i
    /* JADX INFO: renamed from: b */
    public void mo11467b(C2384f c2384f) {
        m11483o1();
    }

    /* JADX INFO: renamed from: n1 */
    public void m11482n1(boolean z2) {
        int i3 = this.f11079P0;
        if (i3 > 0 || this.f11080Q0 > 0) {
            if (z2) {
                this.f11081R0 = this.f11080Q0;
                this.f11082S0 = i3;
            } else {
                this.f11081R0 = i3;
                this.f11082S0 = this.f11080Q0;
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m11483o1() {
        for (int i3 = 0; i3 < this.f11073K0; i3++) {
            C2383e c2383e = this.f11072J0[i3];
            if (c2383e != null) {
                c2383e.m11291O0(true);
            }
        }
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m11484p1(HashSet hashSet) {
        for (int i3 = 0; i3 < this.f11073K0; i3++) {
            if (hashSet.contains(this.f11072J0[i3])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q1 */
    public int m11485q1() {
        return this.f11085V0;
    }

    /* JADX INFO: renamed from: r1 */
    public int m11486r1() {
        return this.f11084U0;
    }

    /* JADX INFO: renamed from: s1 */
    public int m11487s1() {
        return this.f11076M0;
    }

    /* JADX INFO: renamed from: t1 */
    public int m11488t1() {
        return this.f11081R0;
    }

    /* JADX INFO: renamed from: u1 */
    public int m11489u1() {
        return this.f11082S0;
    }

    /* JADX INFO: renamed from: v1 */
    public int m11490v1() {
        return this.f11075L0;
    }

    /* JADX INFO: renamed from: w1 */
    public abstract void mo11441w1(int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: x1 */
    protected void m11491x1(C2383e c2383e, C2383e.b bVar, int i3, C2383e.b bVar2, int i4) {
        while (this.f11087X0 == null && m11282K() != null) {
            this.f11087X0 = ((C2384f) m11282K()).m11375C1();
        }
        C2410b.a aVar = this.f11086W0;
        aVar.f11254a = bVar;
        aVar.f11255b = bVar2;
        aVar.f11256c = i3;
        aVar.f11257d = i4;
        this.f11087X0.mo4027b(c2383e, aVar);
        c2383e.m11323e1(this.f11086W0.f11258e);
        c2383e.m11273F0(this.f11086W0.f11259f);
        c2383e.m11271E0(this.f11086W0.f11261h);
        c2383e.m11356u0(this.f11086W0.f11260g);
    }

    /* JADX INFO: renamed from: y1 */
    protected boolean m11492y1() {
        C2383e c2383e = this.f10931Z;
        C2410b.b bVarM11375C1 = c2383e != null ? ((C2384f) c2383e).m11375C1() : null;
        if (bVarM11375C1 == null) {
            return false;
        }
        for (int i3 = 0; i3 < this.f11073K0; i3++) {
            C2383e c2383e2 = this.f11072J0[i3];
            if (c2383e2 != null && !(c2383e2 instanceof C2386h)) {
                C2383e.b bVarM11355u = c2383e2.m11355u(0);
                C2383e.b bVarM11355u2 = c2383e2.m11355u(1);
                C2383e.b bVar = C2383e.b.MATCH_CONSTRAINT;
                if (bVarM11355u != bVar || c2383e2.f10974v == 1 || bVarM11355u2 != bVar || c2383e2.f10976w == 1) {
                    if (bVarM11355u == bVar) {
                        bVarM11355u = C2383e.b.WRAP_CONTENT;
                    }
                    if (bVarM11355u2 == bVar) {
                        bVarM11355u2 = C2383e.b.WRAP_CONTENT;
                    }
                    C2410b.a aVar = this.f11086W0;
                    aVar.f11254a = bVarM11355u;
                    aVar.f11255b = bVarM11355u2;
                    aVar.f11256c = c2383e2.m11300T();
                    this.f11086W0.f11257d = c2383e2.m11361x();
                    bVarM11375C1.mo4027b(c2383e2, this.f11086W0);
                    c2383e2.m11323e1(this.f11086W0.f11258e);
                    c2383e2.m11273F0(this.f11086W0.f11259f);
                    c2383e2.m11356u0(this.f11086W0.f11260g);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z1 */
    public boolean m11493z1() {
        return this.f11083T0;
    }
}
