package com.google.android.material.carousel;

import com.google.android.material.carousel.AbstractC1478c;
import com.google.android.material.carousel.C1480e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p009D.AbstractC0091a;
import p019G0.AbstractC0176a;
import p034L0.InterfaceC0366a;

/* JADX INFO: renamed from: com.google.android.material.carousel.f */
/* JADX INFO: loaded from: classes.dex */
public class C1481f {

    /* JADX INFO: renamed from: a */
    private final C1480e f7330a;

    /* JADX INFO: renamed from: b */
    private final List f7331b;

    /* JADX INFO: renamed from: c */
    private final List f7332c;

    /* JADX INFO: renamed from: d */
    private final float[] f7333d;

    /* JADX INFO: renamed from: e */
    private final float[] f7334e;

    /* JADX INFO: renamed from: f */
    private final float f7335f;

    /* JADX INFO: renamed from: g */
    private final float f7336g;

    /* JADX INFO: renamed from: com.google.android.material.carousel.f$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f7337a;

        static {
            int[] iArr = new int[AbstractC1478c.a.values().length];
            f7337a = iArr;
            try {
                iArr[AbstractC1478c.a.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private C1481f(C1480e c1480e, List list, List list2) {
        this.f7330a = c1480e;
        this.f7331b = Collections.unmodifiableList(list);
        this.f7332c = Collections.unmodifiableList(list2);
        float f3 = ((C1480e) list.get(list.size() - 1)).m7874d().f7322a - c1480e.m7874d().f7322a;
        this.f7335f = f3;
        float f4 = c1480e.m7881k().f7322a - ((C1480e) list2.get(list2.size() - 1)).m7881k().f7322a;
        this.f7336g = f4;
        this.f7333d = m7902m(f3, list, true);
        this.f7334e = m7902m(f4, list2, false);
    }

    /* JADX INFO: renamed from: a */
    private C1480e m7896a(List list, float f3, float[] fArr) {
        float[] fArrM7904o = m7904o(list, f3, fArr);
        return fArrM7904o[0] >= 0.5f ? (C1480e) list.get((int) fArrM7904o[2]) : (C1480e) list.get((int) fArrM7904o[1]);
    }

    /* JADX INFO: renamed from: b */
    private static int m7897b(C1480e c1480e, float f3) {
        for (int iM7880j = c1480e.m7880j(); iM7880j < c1480e.m7878h().size(); iM7880j++) {
            if (f3 == ((C1480e.c) c1480e.m7878h().get(iM7880j)).f7324c) {
                return iM7880j;
            }
        }
        return c1480e.m7878h().size() - 1;
    }

    /* JADX INFO: renamed from: c */
    private static int m7898c(C1480e c1480e) {
        for (int i3 = 0; i3 < c1480e.m7878h().size(); i3++) {
            if (!((C1480e.c) c1480e.m7878h().get(i3)).f7326e) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    private static int m7899d(C1480e c1480e, float f3) {
        for (int iM7873c = c1480e.m7873c() - 1; iM7873c >= 0; iM7873c--) {
            if (f3 == ((C1480e.c) c1480e.m7878h().get(iM7873c)).f7324c) {
                return iM7873c;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    private static int m7900e(C1480e c1480e) {
        for (int size = c1480e.m7878h().size() - 1; size >= 0; size--) {
            if (!((C1480e.c) c1480e.m7878h().get(size)).f7326e) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    static C1481f m7901f(InterfaceC0366a interfaceC0366a, C1480e c1480e, float f3, float f4, float f5, AbstractC1478c.a aVar) {
        return new C1481f(c1480e, m7905p(interfaceC0366a, c1480e, f3, f4, aVar), m7903n(interfaceC0366a, c1480e, f3, f5, aVar));
    }

    /* JADX INFO: renamed from: m */
    private static float[] m7902m(float f3, List list, boolean z2) {
        int size = list.size();
        float[] fArr = new float[size];
        int i3 = 1;
        while (i3 < size) {
            int i4 = i3 - 1;
            C1480e c1480e = (C1480e) list.get(i4);
            C1480e c1480e2 = (C1480e) list.get(i3);
            fArr[i3] = i3 == size + (-1) ? 1.0f : fArr[i4] + ((z2 ? c1480e2.m7874d().f7322a - c1480e.m7874d().f7322a : c1480e.m7881k().f7322a - c1480e2.m7881k().f7322a) / f3);
            i3++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: n */
    private static List m7903n(InterfaceC0366a interfaceC0366a, C1480e c1480e, float f3, float f4, AbstractC1478c.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1480e);
        int iM7900e = m7900e(c1480e);
        int iMo1355a = interfaceC0366a.mo1359f() ? interfaceC0366a.mo1355a() : interfaceC0366a.mo1357c();
        if (!m7907r(interfaceC0366a, c1480e) && iM7900e != -1) {
            int iM7880j = iM7900e - c1480e.m7880j();
            float f5 = c1480e.m7874d().f7323b - (c1480e.m7874d().f7325d / 2.0f);
            if (iM7880j <= 0 && c1480e.m7879i().f7327f > 0.0f) {
                arrayList.add(m7913x(c1480e, (f5 - c1480e.m7879i().f7327f) - f4, iMo1355a));
                return arrayList;
            }
            float f6 = 0.0f;
            int i3 = 0;
            while (i3 < iM7880j) {
                C1480e c1480e2 = (C1480e) arrayList.get(arrayList.size() - 1);
                int i4 = iM7900e - i3;
                float f7 = f6 + ((C1480e.c) c1480e.m7878h().get(i4)).f7327f;
                int i5 = i4 + 1;
                int i6 = iMo1355a;
                C1480e c1480eM7909t = m7909t(c1480e2, iM7900e, i5 < c1480e.m7878h().size() ? m7899d(c1480e2, ((C1480e.c) c1480e.m7878h().get(i5)).f7324c) + 1 : 0, f5 - f7, c1480e.m7873c() + i3 + 1, c1480e.m7880j() + i3 + 1, i6);
                if (i3 == iM7880j - 1 && f4 > 0.0f) {
                    c1480eM7909t = m7910u(c1480eM7909t, f4, i6, false, f3, aVar);
                    i6 = i6;
                }
                arrayList.add(c1480eM7909t);
                i3++;
                iMo1355a = i6;
                f6 = f7;
            }
        } else if (f4 > 0.0f) {
            arrayList.add(m7910u(c1480e, f4, iMo1355a, false, f3, aVar));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private static float[] m7904o(List list, float f3, float[] fArr) {
        int size = list.size();
        float f4 = fArr[0];
        int i3 = 1;
        while (i3 < size) {
            float f5 = fArr[i3];
            if (f3 <= f5) {
                return new float[]{AbstractC0176a.m483b(0.0f, 1.0f, f4, f5, f3), i3 - 1, i3};
            }
            i3++;
            f4 = f5;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    /* JADX INFO: renamed from: p */
    private static List m7905p(InterfaceC0366a interfaceC0366a, C1480e c1480e, float f3, float f4, AbstractC1478c.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1480e);
        int iM7898c = m7898c(c1480e);
        int iMo1355a = interfaceC0366a.mo1359f() ? interfaceC0366a.mo1355a() : interfaceC0366a.mo1357c();
        if (!m7906q(c1480e) && iM7898c != -1) {
            int iM7873c = c1480e.m7873c() - iM7898c;
            float f5 = c1480e.m7874d().f7323b - (c1480e.m7874d().f7325d / 2.0f);
            if (iM7873c <= 0 && c1480e.m7872b().f7327f > 0.0f) {
                arrayList.add(m7913x(c1480e, f5 + c1480e.m7872b().f7327f + f4, iMo1355a));
                return arrayList;
            }
            float f6 = 0.0f;
            for (int i3 = 0; i3 < iM7873c; i3++) {
                C1480e c1480e2 = (C1480e) arrayList.get(arrayList.size() - 1);
                int i4 = iM7898c + i3;
                int size = c1480e.m7878h().size() - 1;
                f6 += ((C1480e.c) c1480e.m7878h().get(i4)).f7327f;
                int i5 = i4 - 1;
                if (i5 >= 0) {
                    size = m7897b(c1480e2, ((C1480e.c) c1480e.m7878h().get(i5)).f7324c) - 1;
                }
                int i6 = iMo1355a;
                C1480e c1480eM7909t = m7909t(c1480e2, iM7898c, size, f5 + f6, (c1480e.m7873c() - i3) - 1, (c1480e.m7880j() - i3) - 1, i6);
                iMo1355a = i6;
                if (i3 == iM7873c - 1 && f4 > 0.0f) {
                    c1480eM7909t = m7910u(c1480eM7909t, f4, iMo1355a, true, f3, aVar);
                }
                arrayList.add(c1480eM7909t);
            }
        } else if (f4 > 0.0f) {
            arrayList.add(m7910u(c1480e, f4, iMo1355a, true, f3, aVar));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    private static boolean m7906q(C1480e c1480e) {
        return c1480e.m7872b().f7323b - (c1480e.m7872b().f7325d / 2.0f) >= 0.0f && c1480e.m7872b() == c1480e.m7875e();
    }

    /* JADX INFO: renamed from: r */
    private static boolean m7907r(InterfaceC0366a interfaceC0366a, C1480e c1480e) {
        int iMo1357c = interfaceC0366a.mo1357c();
        if (interfaceC0366a.mo1359f()) {
            iMo1357c = interfaceC0366a.mo1355a();
        }
        return c1480e.m7879i().f7323b + (c1480e.m7879i().f7325d / 2.0f) <= ((float) iMo1357c) && c1480e.m7879i() == c1480e.m7882l();
    }

    /* JADX INFO: renamed from: s */
    private static C1480e m7908s(List list, float f3, float[] fArr) {
        float[] fArrM7904o = m7904o(list, f3, fArr);
        return C1480e.m7869o((C1480e) list.get((int) fArrM7904o[1]), (C1480e) list.get((int) fArrM7904o[2]), fArrM7904o[0]);
    }

    /* JADX INFO: renamed from: t */
    private static C1480e m7909t(C1480e c1480e, int i3, int i4, float f3, int i5, int i6, int i7) {
        ArrayList arrayList = new ArrayList(c1480e.m7878h());
        arrayList.add(i4, (C1480e.c) arrayList.remove(i3));
        C1480e.b bVar = new C1480e.b(c1480e.m7877g(), i7);
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C1480e.c cVar = (C1480e.c) arrayList.get(i8);
            float f4 = cVar.f7325d;
            bVar.m7890e(f3 + (f4 / 2.0f), cVar.f7324c, f4, i8 >= i5 && i8 <= i6, cVar.f7326e, cVar.f7327f);
            f3 += cVar.f7325d;
            i8++;
        }
        return bVar.m7894i();
    }

    /* JADX INFO: renamed from: u */
    private static C1480e m7910u(C1480e c1480e, float f3, int i3, boolean z2, float f4, AbstractC1478c.a aVar) {
        return a.f7337a[aVar.ordinal()] != 1 ? m7912w(c1480e, f3, i3, z2) : m7911v(c1480e, f3, i3, z2, f4);
    }

    /* JADX INFO: renamed from: v */
    private static C1480e m7911v(C1480e c1480e, float f3, int i3, boolean z2, float f4) {
        ArrayList arrayList = new ArrayList(c1480e.m7878h());
        C1480e.b bVar = new C1480e.b(c1480e.m7877g(), i3);
        float fM7883m = f3 / c1480e.m7883m();
        float f5 = z2 ? f3 : 0.0f;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            C1480e.c cVar = (C1480e.c) arrayList.get(i4);
            if (cVar.f7326e) {
                bVar.m7890e(cVar.f7323b, cVar.f7324c, cVar.f7325d, false, true, cVar.f7327f);
            } else {
                boolean z3 = i4 >= c1480e.m7873c() && i4 <= c1480e.m7880j();
                float f6 = cVar.f7325d - fM7883m;
                float fM7851b = AbstractC1478c.m7851b(f6, c1480e.m7877g(), f4);
                float f7 = (f6 / 2.0f) + f5;
                float fAbs = Math.abs(f7 - cVar.f7323b);
                bVar.m7891f(f7, fM7851b, f6, z3, false, cVar.f7327f, z2 ? fAbs : 0.0f, z2 ? 0.0f : fAbs);
                f5 += f6;
            }
            i4++;
        }
        return bVar.m7894i();
    }

    /* JADX INFO: renamed from: w */
    private static C1480e m7912w(C1480e c1480e, float f3, int i3, boolean z2) {
        ArrayList arrayList = new ArrayList(c1480e.m7878h());
        C1480e.b bVar = new C1480e.b(c1480e.m7877g(), i3);
        boolean z3 = true;
        int size = z2 ? 0 : arrayList.size() - 1;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            C1480e.c cVar = (C1480e.c) arrayList.get(i4);
            if (cVar.f7326e && i4 == size) {
                bVar.m7890e(cVar.f7323b, cVar.f7324c, cVar.f7325d, false, true, cVar.f7327f);
            } else {
                float f4 = cVar.f7323b;
                float f5 = z2 ? f4 + f3 : f4 - f3;
                float f6 = z2 ? f3 : 0.0f;
                float f7 = z2 ? 0.0f : f3;
                boolean z4 = (i4 < c1480e.m7873c() || i4 > c1480e.m7880j()) ? false : z3;
                float f8 = f5;
                float f9 = cVar.f7324c;
                float f10 = cVar.f7325d;
                bVar.m7891f(f8, f9, f10, z4, cVar.f7326e, Math.abs(z2 ? Math.max(0.0f, ((f10 / 2.0f) + f8) - i3) : Math.min(0.0f, f8 - (f10 / 2.0f))), f6, f7);
            }
            i4++;
            z3 = true;
        }
        return bVar.m7894i();
    }

    /* JADX INFO: renamed from: x */
    private static C1480e m7913x(C1480e c1480e, float f3, int i3) {
        return m7909t(c1480e, 0, 0, f3, c1480e.m7873c(), c1480e.m7880j(), i3);
    }

    /* JADX INFO: renamed from: g */
    C1480e m7914g() {
        return this.f7330a;
    }

    /* JADX INFO: renamed from: h */
    C1480e m7915h() {
        return (C1480e) this.f7332c.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: i */
    Map m7916i(int i3, int i4, int i5, boolean z2) {
        float fM7877g = this.f7330a.m7877g();
        HashMap map = new HashMap();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= i3) {
                break;
            }
            int i8 = z2 ? (i3 - i6) - 1 : i6;
            if (i8 * fM7877g * (z2 ? -1 : 1) > i5 - this.f7336g || i6 >= i3 - this.f7332c.size()) {
                Integer numValueOf = Integer.valueOf(i8);
                List list = this.f7332c;
                map.put(numValueOf, (C1480e) list.get(AbstractC0091a.m258b(i7, 0, list.size() - 1)));
                i7++;
            }
            i6++;
        }
        int i9 = 0;
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            int i11 = z2 ? (i3 - i10) - 1 : i10;
            if (i11 * fM7877g * (z2 ? -1 : 1) < i4 + this.f7335f || i10 < this.f7331b.size()) {
                Integer numValueOf2 = Integer.valueOf(i11);
                List list2 = this.f7331b;
                map.put(numValueOf2, (C1480e) list2.get(AbstractC0091a.m258b(i9, 0, list2.size() - 1)));
                i9++;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: j */
    public C1480e m7917j(float f3, float f4, float f5) {
        return m7918k(f3, f4, f5, false);
    }

    /* JADX INFO: renamed from: k */
    C1480e m7918k(float f3, float f4, float f5, boolean z2) {
        float fM483b;
        List list;
        float[] fArr;
        float f6 = this.f7335f + f4;
        float f7 = f5 - this.f7336g;
        float f8 = m7919l().m7872b().f7328g;
        float f9 = m7915h().m7872b().f7329h;
        if (this.f7335f == f8) {
            f6 += f8;
        }
        if (this.f7336g == f9) {
            f7 -= f9;
        }
        if (f3 < f6) {
            fM483b = AbstractC0176a.m483b(1.0f, 0.0f, f4, f6, f3);
            list = this.f7331b;
            fArr = this.f7333d;
        } else {
            if (f3 <= f7) {
                return this.f7330a;
            }
            fM483b = AbstractC0176a.m483b(0.0f, 1.0f, f7, f5, f3);
            list = this.f7332c;
            fArr = this.f7334e;
        }
        return z2 ? m7896a(list, fM483b, fArr) : m7908s(list, fM483b, fArr);
    }

    /* JADX INFO: renamed from: l */
    C1480e m7919l() {
        return (C1480e) this.f7331b.get(r0.size() - 1);
    }
}
