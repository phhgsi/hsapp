package p149t;

import java.util.ArrayList;
import p146s.AbstractC2388j;
import p146s.C2383e;
import p146s.C2386h;

/* JADX INFO: renamed from: t.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2417i {
    /* JADX INFO: renamed from: a */
    public static C2423o m11628a(C2383e c2383e, int i3, ArrayList arrayList, C2423o c2423o) {
        int iM11470m1;
        int i4 = i3 == 0 ? c2383e.f10911G0 : c2383e.f10913H0;
        if (i4 != -1 && (c2423o == null || i4 != c2423o.f11315b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C2423o c2423o2 = (C2423o) arrayList.get(i5);
                if (c2423o2.m11645c() == i4) {
                    if (c2423o != null) {
                        c2423o.m11648g(i3, c2423o2);
                        arrayList.remove(c2423o);
                    }
                    c2423o = c2423o2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return c2423o;
        }
        if (c2423o == null) {
            if ((c2383e instanceof AbstractC2388j) && (iM11470m1 = ((AbstractC2388j) c2383e).m11470m1(i3)) != -1) {
                int i6 = 0;
                while (true) {
                    if (i6 >= arrayList.size()) {
                        break;
                    }
                    C2423o c2423o3 = (C2423o) arrayList.get(i6);
                    if (c2423o3.m11645c() == iM11470m1) {
                        c2423o = c2423o3;
                        break;
                    }
                    i6++;
                }
            }
            if (c2423o == null) {
                c2423o = new C2423o(i3);
            }
            arrayList.add(c2423o);
        }
        if (c2423o.m11643a(c2383e)) {
            if (c2383e instanceof C2386h) {
                C2386h c2386h = (C2386h) c2383e;
                c2386h.m11456l1().m11240c(c2386h.m11457m1() == 0 ? 1 : 0, arrayList, c2423o);
            }
            if (i3 == 0) {
                c2383e.f10911G0 = c2423o.m11645c();
                c2383e.f10919N.m11240c(i3, arrayList, c2423o);
                c2383e.f10921P.m11240c(i3, arrayList, c2423o);
            } else {
                c2383e.f10913H0 = c2423o.m11645c();
                c2383e.f10920O.m11240c(i3, arrayList, c2423o);
                c2383e.f10923R.m11240c(i3, arrayList, c2423o);
                c2383e.f10922Q.m11240c(i3, arrayList, c2423o);
            }
            c2383e.f10926U.m11240c(i3, arrayList, c2423o);
        }
        return c2423o;
    }

    /* JADX INFO: renamed from: b */
    private static C2423o m11629b(ArrayList arrayList, int i3) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2423o c2423o = (C2423o) arrayList.get(i4);
            if (i3 == c2423o.f11315b) {
                return c2423o;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0341  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m11630c(p146s.C2384f r17, p149t.C2410b.b r18) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149t.AbstractC2417i.m11630c(s.f, t.b$b):boolean");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11631d(C2383e.b bVar, C2383e.b bVar2, C2383e.b bVar3, C2383e.b bVar4) {
        C2383e.b bVar5;
        C2383e.b bVar6;
        C2383e.b bVar7 = C2383e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = C2383e.b.WRAP_CONTENT) || (bVar3 == C2383e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = C2383e.b.WRAP_CONTENT) || (bVar4 == C2383e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
