package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p019G0.AbstractC0176a;

/* JADX INFO: renamed from: com.google.android.material.carousel.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1480e {

    /* JADX INFO: renamed from: a */
    private final float f7307a;

    /* JADX INFO: renamed from: b */
    private int f7308b;

    /* JADX INFO: renamed from: c */
    private final List f7309c;

    /* JADX INFO: renamed from: d */
    private final int f7310d;

    /* JADX INFO: renamed from: e */
    private final int f7311e;

    /* JADX INFO: renamed from: f */
    private final int f7312f;

    /* JADX INFO: renamed from: com.google.android.material.carousel.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final float f7313a;

        /* JADX INFO: renamed from: b */
        private final int f7314b;

        /* JADX INFO: renamed from: d */
        private c f7316d;

        /* JADX INFO: renamed from: e */
        private c f7317e;

        /* JADX INFO: renamed from: c */
        private final List f7315c = new ArrayList();

        /* JADX INFO: renamed from: f */
        private int f7318f = -1;

        /* JADX INFO: renamed from: g */
        private int f7319g = -1;

        /* JADX INFO: renamed from: h */
        private float f7320h = 0.0f;

        /* JADX INFO: renamed from: i */
        private int f7321i = -1;

        public b(float f3, int i3) {
            this.f7313a = f3;
            this.f7314b = i3;
        }

        /* JADX INFO: renamed from: j */
        private static float m7885j(float f3, float f4, int i3, int i4) {
            return (f3 - (i3 * f4)) + (i4 * f4);
        }

        /* JADX INFO: renamed from: a */
        public b m7886a(float f3, float f4, float f5) {
            return m7889d(f3, f4, f5, false, true);
        }

        /* JADX INFO: renamed from: b */
        public b m7887b(float f3, float f4, float f5) {
            return m7888c(f3, f4, f5, false);
        }

        /* JADX INFO: renamed from: c */
        public b m7888c(float f3, float f4, float f5, boolean z2) {
            return m7889d(f3, f4, f5, z2, false);
        }

        /* JADX INFO: renamed from: d */
        public b m7889d(float f3, float f4, float f5, boolean z2, boolean z3) {
            float fAbs;
            float f6 = f5 / 2.0f;
            float f7 = f3 - f6;
            float f8 = f6 + f3;
            int i3 = this.f7314b;
            if (f8 > i3) {
                fAbs = Math.abs(f8 - Math.max(f8 - f5, i3));
            } else {
                fAbs = 0.0f;
                if (f7 < 0.0f) {
                    fAbs = Math.abs(f7 - Math.min(f7 + f5, 0.0f));
                }
            }
            return m7890e(f3, f4, f5, z2, z3, fAbs);
        }

        /* JADX INFO: renamed from: e */
        public b m7890e(float f3, float f4, float f5, boolean z2, boolean z3, float f6) {
            return m7891f(f3, f4, f5, z2, z3, f6, 0.0f, 0.0f);
        }

        /* JADX INFO: renamed from: f */
        public b m7891f(float f3, float f4, float f5, boolean z2, boolean z3, float f6, float f7, float f8) {
            if (f5 <= 0.0f) {
                return this;
            }
            if (z3) {
                if (z2) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i3 = this.f7321i;
                if (i3 != -1 && i3 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f7321i = this.f7315c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f3, f4, f5, z3, f6, f7, f8);
            if (z2) {
                if (this.f7316d == null) {
                    this.f7316d = cVar;
                    this.f7318f = this.f7315c.size();
                }
                if (this.f7319g != -1 && this.f7315c.size() - this.f7319g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f5 != this.f7316d.f7325d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f7317e = cVar;
                this.f7319g = this.f7315c.size();
            } else {
                if (this.f7316d == null && cVar.f7325d < this.f7320h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f7317e != null && cVar.f7325d > this.f7320h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f7320h = cVar.f7325d;
            this.f7315c.add(cVar);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m7892g(float f3, float f4, float f5, int i3) {
            return m7893h(f3, f4, f5, i3, false);
        }

        /* JADX INFO: renamed from: h */
        public b m7893h(float f3, float f4, float f5, int i3, boolean z2) {
            if (i3 > 0 && f5 > 0.0f) {
                for (int i4 = 0; i4 < i3; i4++) {
                    m7888c((i4 * f5) + f3, f4, f5, z2);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C1480e m7894i() {
            if (this.f7316d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < this.f7315c.size(); i3++) {
                c cVar = (c) this.f7315c.get(i3);
                arrayList.add(new c(m7885j(this.f7316d.f7323b, this.f7313a, this.f7318f, i3), cVar.f7323b, cVar.f7324c, cVar.f7325d, cVar.f7326e, cVar.f7327f, cVar.f7328g, cVar.f7329h));
            }
            return new C1480e(this.f7313a, arrayList, this.f7318f, this.f7319g, this.f7314b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.e$c */
    static final class c {

        /* JADX INFO: renamed from: a */
        final float f7322a;

        /* JADX INFO: renamed from: b */
        final float f7323b;

        /* JADX INFO: renamed from: c */
        final float f7324c;

        /* JADX INFO: renamed from: d */
        final float f7325d;

        /* JADX INFO: renamed from: e */
        final boolean f7326e;

        /* JADX INFO: renamed from: f */
        final float f7327f;

        /* JADX INFO: renamed from: g */
        final float f7328g;

        /* JADX INFO: renamed from: h */
        final float f7329h;

        c(float f3, float f4, float f5, float f6) {
            this(f3, f4, f5, f6, false, 0.0f, 0.0f, 0.0f);
        }

        /* JADX INFO: renamed from: a */
        static c m7895a(c cVar, c cVar2, float f3) {
            return new c(AbstractC0176a.m482a(cVar.f7322a, cVar2.f7322a, f3), AbstractC0176a.m482a(cVar.f7323b, cVar2.f7323b, f3), AbstractC0176a.m482a(cVar.f7324c, cVar2.f7324c, f3), AbstractC0176a.m482a(cVar.f7325d, cVar2.f7325d, f3));
        }

        c(float f3, float f4, float f5, float f6, boolean z2, float f7, float f8, float f9) {
            this.f7322a = f3;
            this.f7323b = f4;
            this.f7324c = f5;
            this.f7325d = f6;
            this.f7326e = z2;
            this.f7327f = f7;
            this.f7328g = f8;
            this.f7329h = f9;
        }
    }

    /* JADX INFO: renamed from: o */
    static C1480e m7869o(C1480e c1480e, C1480e c1480e2, float f3) {
        if (c1480e.m7877g() != c1480e2.m7877g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listM7878h = c1480e.m7878h();
        List listM7878h2 = c1480e2.m7878h();
        if (listM7878h.size() != listM7878h2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < c1480e.m7878h().size(); i3++) {
            arrayList.add(c.m7895a((c) listM7878h.get(i3), (c) listM7878h2.get(i3), f3));
        }
        return new C1480e(c1480e.m7877g(), arrayList, AbstractC0176a.m484c(c1480e.m7873c(), c1480e2.m7873c(), f3), AbstractC0176a.m484c(c1480e.m7880j(), c1480e2.m7880j(), f3), c1480e.f7312f);
    }

    /* JADX INFO: renamed from: p */
    static C1480e m7870p(C1480e c1480e, int i3) {
        b bVar = new b(c1480e.m7877g(), i3);
        float f3 = (i3 - c1480e.m7881k().f7323b) - (c1480e.m7881k().f7325d / 2.0f);
        int size = c1480e.m7878h().size() - 1;
        while (size >= 0) {
            c cVar = (c) c1480e.m7878h().get(size);
            bVar.m7889d((cVar.f7325d / 2.0f) + f3, cVar.f7324c, cVar.f7325d, size >= c1480e.m7873c() && size <= c1480e.m7880j(), cVar.f7326e);
            f3 += cVar.f7325d;
            size--;
        }
        return bVar.m7894i();
    }

    /* JADX INFO: renamed from: a */
    int m7871a() {
        return this.f7312f;
    }

    /* JADX INFO: renamed from: b */
    c m7872b() {
        return (c) this.f7309c.get(this.f7310d);
    }

    /* JADX INFO: renamed from: c */
    int m7873c() {
        return this.f7310d;
    }

    /* JADX INFO: renamed from: d */
    c m7874d() {
        return (c) this.f7309c.get(0);
    }

    /* JADX INFO: renamed from: e */
    c m7875e() {
        for (int i3 = 0; i3 < this.f7309c.size(); i3++) {
            c cVar = (c) this.f7309c.get(i3);
            if (!cVar.f7326e) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    List m7876f() {
        return this.f7309c.subList(this.f7310d, this.f7311e + 1);
    }

    /* JADX INFO: renamed from: g */
    float m7877g() {
        return this.f7307a;
    }

    /* JADX INFO: renamed from: h */
    List m7878h() {
        return this.f7309c;
    }

    /* JADX INFO: renamed from: i */
    c m7879i() {
        return (c) this.f7309c.get(this.f7311e);
    }

    /* JADX INFO: renamed from: j */
    int m7880j() {
        return this.f7311e;
    }

    /* JADX INFO: renamed from: k */
    c m7881k() {
        return (c) this.f7309c.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: l */
    c m7882l() {
        for (int size = this.f7309c.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f7309c.get(size);
            if (!cVar.f7326e) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    int m7883m() {
        Iterator it = this.f7309c.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f7326e) {
                i3++;
            }
        }
        return this.f7309c.size() - i3;
    }

    /* JADX INFO: renamed from: n */
    int m7884n() {
        return this.f7308b;
    }

    private C1480e(float f3, List list, int i3, int i4, int i5) {
        this.f7307a = f3;
        this.f7309c = Collections.unmodifiableList(list);
        this.f7310d = i3;
        this.f7311e = i4;
        while (i3 <= i4) {
            if (((c) list.get(i3)).f7327f == 0.0f) {
                this.f7308b++;
            }
            i3++;
        }
        this.f7312f = i5;
    }
}
