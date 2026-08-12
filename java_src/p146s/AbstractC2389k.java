package p146s;

import p137p.C2306d;
import p146s.C2383e;

/* JADX INFO: renamed from: s.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2389k {

    /* JADX INFO: renamed from: a */
    static boolean[] f11074a = new boolean[3];

    /* JADX INFO: renamed from: a */
    static void m11471a(C2384f c2384f, C2306d c2306d, C2383e c2383e) {
        c2383e.f10968s = -1;
        c2383e.f10970t = -1;
        C2383e.b bVar = c2384f.f10930Y[0];
        C2383e.b bVar2 = C2383e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c2383e.f10930Y[0] == C2383e.b.MATCH_PARENT) {
            int i3 = c2383e.f10919N.f10883g;
            int iM11300T = c2384f.m11300T() - c2383e.f10921P.f10883g;
            C2382d c2382d = c2383e.f10919N;
            c2382d.f10885i = c2306d.m11043q(c2382d);
            C2382d c2382d2 = c2383e.f10921P;
            c2382d2.f10885i = c2306d.m11043q(c2382d2);
            c2306d.m11034f(c2383e.f10919N.f10885i, i3);
            c2306d.m11034f(c2383e.f10921P.f10885i, iM11300T);
            c2383e.f10968s = 2;
            c2383e.m11279I0(i3, iM11300T);
        }
        if (c2384f.f10930Y[1] == bVar2 || c2383e.f10930Y[1] != C2383e.b.MATCH_PARENT) {
            return;
        }
        int i4 = c2383e.f10920O.f10883g;
        int iM11361x = c2384f.m11361x() - c2383e.f10922Q.f10883g;
        C2382d c2382d3 = c2383e.f10920O;
        c2382d3.f10885i = c2306d.m11043q(c2382d3);
        C2382d c2382d4 = c2383e.f10922Q;
        c2382d4.f10885i = c2306d.m11043q(c2382d4);
        c2306d.m11034f(c2383e.f10920O.f10885i, i4);
        c2306d.m11034f(c2383e.f10922Q.f10885i, iM11361x);
        if (c2383e.f10953k0 > 0 || c2383e.m11298S() == 8) {
            C2382d c2382d5 = c2383e.f10923R;
            c2382d5.f10885i = c2306d.m11043q(c2382d5);
            c2306d.m11034f(c2383e.f10923R.f10885i, c2383e.f10953k0 + i4);
        }
        c2383e.f10970t = 2;
        c2383e.m11313Z0(i4, iM11361x);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m11472b(int i3, int i4) {
        return (i3 & i4) == i4;
    }
}
