package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1229h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p024I.C0209f;
import p024I.InterfaceC0208e;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes.dex */
final class C1222a implements C1229h.a {

    /* JADX INFO: renamed from: a */
    private InterfaceC0208e f5874a;

    /* JADX INFO: renamed from: b */
    final ArrayList f5875b;

    /* JADX INFO: renamed from: c */
    final ArrayList f5876c;

    /* JADX INFO: renamed from: d */
    final a f5877d;

    /* JADX INFO: renamed from: e */
    Runnable f5878e;

    /* JADX INFO: renamed from: f */
    final boolean f5879f;

    /* JADX INFO: renamed from: g */
    final C1229h f5880g;

    /* JADX INFO: renamed from: h */
    private int f5881h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo5703a(int i3, int i4);

        /* JADX INFO: renamed from: b */
        void mo5704b(b bVar);

        /* JADX INFO: renamed from: c */
        RecyclerView.AbstractC1188C mo5705c(int i3);

        /* JADX INFO: renamed from: d */
        void mo5706d(int i3, int i4);

        /* JADX INFO: renamed from: e */
        void mo5707e(int i3, int i4);

        /* JADX INFO: renamed from: f */
        void mo5708f(int i3, int i4);

        /* JADX INFO: renamed from: g */
        void mo5709g(b bVar);

        /* JADX INFO: renamed from: h */
        void mo5710h(int i3, int i4, Object obj);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        int f5882a;

        /* JADX INFO: renamed from: b */
        int f5883b;

        /* JADX INFO: renamed from: c */
        Object f5884c;

        /* JADX INFO: renamed from: d */
        int f5885d;

        b(int i3, int i4, int i5, Object obj) {
            this.f5882a = i3;
            this.f5883b = i4;
            this.f5885d = i5;
            this.f5884c = obj;
        }

        /* JADX INFO: renamed from: a */
        String m6103a() {
            int i3 = this.f5882a;
            return i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i3 = this.f5882a;
            if (i3 != bVar.f5882a) {
                return false;
            }
            if (i3 == 8 && Math.abs(this.f5885d - this.f5883b) == 1 && this.f5885d == bVar.f5883b && this.f5883b == bVar.f5885d) {
                return true;
            }
            if (this.f5885d != bVar.f5885d || this.f5883b != bVar.f5883b) {
                return false;
            }
            Object obj2 = this.f5884c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f5884c)) {
                    return false;
                }
            } else if (bVar.f5884c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f5882a * 31) + this.f5883b) * 31) + this.f5885d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m6103a() + ",s:" + this.f5883b + "c:" + this.f5885d + ",p:" + this.f5884c + "]";
        }
    }

    C1222a(a aVar) {
        this(aVar, false);
    }

    /* JADX INFO: renamed from: c */
    private void m6080c(b bVar) {
        m6086s(bVar);
    }

    /* JADX INFO: renamed from: d */
    private void m6081d(b bVar) {
        m6086s(bVar);
    }

    /* JADX INFO: renamed from: f */
    private void m6082f(b bVar) {
        boolean z2;
        byte b3;
        int i3 = bVar.f5883b;
        int i4 = bVar.f5885d + i3;
        byte b4 = -1;
        int i5 = i3;
        int i6 = 0;
        while (i5 < i4) {
            if (this.f5877d.mo5705c(i5) != null || m6084h(i5)) {
                if (b4 == 0) {
                    m6085k(mo6089b(2, i3, i6, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                b3 = 1;
            } else {
                if (b4 == 1) {
                    m6086s(mo6089b(2, i3, i6, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                b3 = 0;
            }
            if (z2) {
                i5 -= i6;
                i4 -= i6;
                i6 = 1;
            } else {
                i6++;
            }
            i5++;
            b4 = b3;
        }
        if (i6 != bVar.f5885d) {
            mo6088a(bVar);
            bVar = mo6089b(2, i3, i6, null);
        }
        if (b4 == 0) {
            m6085k(bVar);
        } else {
            m6086s(bVar);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m6083g(b bVar) {
        int i3 = bVar.f5883b;
        int i4 = bVar.f5885d + i3;
        int i5 = 0;
        byte b3 = -1;
        int i6 = i3;
        while (i3 < i4) {
            if (this.f5877d.mo5705c(i3) != null || m6084h(i3)) {
                if (b3 == 0) {
                    m6085k(mo6089b(4, i6, i5, bVar.f5884c));
                    i6 = i3;
                    i5 = 0;
                }
                b3 = 1;
            } else {
                if (b3 == 1) {
                    m6086s(mo6089b(4, i6, i5, bVar.f5884c));
                    i6 = i3;
                    i5 = 0;
                }
                b3 = 0;
            }
            i5++;
            i3++;
        }
        if (i5 != bVar.f5885d) {
            Object obj = bVar.f5884c;
            mo6088a(bVar);
            bVar = mo6089b(4, i6, i5, obj);
        }
        if (b3 == 0) {
            m6085k(bVar);
        } else {
            m6086s(bVar);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m6084h(int i3) {
        int size = this.f5876c.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f5876c.get(i4);
            int i5 = bVar.f5882a;
            if (i5 == 8) {
                if (m6095n(bVar.f5885d, i4 + 1) == i3) {
                    return true;
                }
            } else if (i5 == 1) {
                int i6 = bVar.f5883b;
                int i7 = bVar.f5885d + i6;
                while (i6 < i7) {
                    if (m6095n(i6, i4 + 1) == i3) {
                        return true;
                    }
                    i6++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private void m6085k(b bVar) {
        int i3;
        int i4 = bVar.f5882a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM6087w = m6087w(bVar.f5883b, i4);
        int i5 = bVar.f5883b;
        int i6 = bVar.f5882a;
        if (i6 == 2) {
            i3 = 0;
        } else {
            if (i6 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i3 = 1;
        }
        int i7 = 1;
        for (int i8 = 1; i8 < bVar.f5885d; i8++) {
            int iM6087w2 = m6087w(bVar.f5883b + (i3 * i8), bVar.f5882a);
            int i9 = bVar.f5882a;
            if (i9 == 2 ? iM6087w2 != iM6087w : !(i9 == 4 && iM6087w2 == iM6087w + 1)) {
                b bVarMo6089b = mo6089b(i9, iM6087w, i7, bVar.f5884c);
                m6093l(bVarMo6089b, i5);
                mo6088a(bVarMo6089b);
                if (bVar.f5882a == 4) {
                    i5 += i7;
                }
                i7 = 1;
                iM6087w = iM6087w2;
            } else {
                i7++;
            }
        }
        Object obj = bVar.f5884c;
        mo6088a(bVar);
        if (i7 > 0) {
            b bVarMo6089b2 = mo6089b(bVar.f5882a, iM6087w, i7, obj);
            m6093l(bVarMo6089b2, i5);
            mo6088a(bVarMo6089b2);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m6086s(b bVar) {
        this.f5876c.add(bVar);
        int i3 = bVar.f5882a;
        if (i3 == 1) {
            this.f5877d.mo5707e(bVar.f5883b, bVar.f5885d);
            return;
        }
        if (i3 == 2) {
            this.f5877d.mo5706d(bVar.f5883b, bVar.f5885d);
            return;
        }
        if (i3 == 4) {
            this.f5877d.mo5710h(bVar.f5883b, bVar.f5885d, bVar.f5884c);
        } else {
            if (i3 == 8) {
                this.f5877d.mo5703a(bVar.f5883b, bVar.f5885d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX INFO: renamed from: w */
    private int m6087w(int i3, int i4) {
        int i5;
        int i6;
        for (int size = this.f5876c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f5876c.get(size);
            int i7 = bVar.f5882a;
            if (i7 == 8) {
                int i8 = bVar.f5883b;
                int i9 = bVar.f5885d;
                if (i8 < i9) {
                    i6 = i8;
                    i5 = i9;
                } else {
                    i5 = i8;
                    i6 = i9;
                }
                if (i3 < i6 || i3 > i5) {
                    if (i3 < i8) {
                        if (i4 == 1) {
                            bVar.f5883b = i8 + 1;
                            bVar.f5885d = i9 + 1;
                        } else if (i4 == 2) {
                            bVar.f5883b = i8 - 1;
                            bVar.f5885d = i9 - 1;
                        }
                    }
                } else if (i6 == i8) {
                    if (i4 == 1) {
                        bVar.f5885d = i9 + 1;
                    } else if (i4 == 2) {
                        bVar.f5885d = i9 - 1;
                    }
                    i3++;
                } else {
                    if (i4 == 1) {
                        bVar.f5883b = i8 + 1;
                    } else if (i4 == 2) {
                        bVar.f5883b = i8 - 1;
                    }
                    i3--;
                }
            } else {
                int i10 = bVar.f5883b;
                if (i10 <= i3) {
                    if (i7 == 1) {
                        i3 -= bVar.f5885d;
                    } else if (i7 == 2) {
                        i3 += bVar.f5885d;
                    }
                } else if (i4 == 1) {
                    bVar.f5883b = i10 + 1;
                } else if (i4 == 2) {
                    bVar.f5883b = i10 - 1;
                }
            }
        }
        for (int size2 = this.f5876c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f5876c.get(size2);
            if (bVar2.f5882a == 8) {
                int i11 = bVar2.f5885d;
                if (i11 == bVar2.f5883b || i11 < 0) {
                    this.f5876c.remove(size2);
                    mo6088a(bVar2);
                }
            } else if (bVar2.f5885d <= 0) {
                this.f5876c.remove(size2);
                mo6088a(bVar2);
            }
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.C1229h.a
    /* JADX INFO: renamed from: a */
    public void mo6088a(b bVar) {
        if (this.f5879f) {
            return;
        }
        bVar.f5884c = null;
        this.f5874a.mo601a(bVar);
    }

    @Override // androidx.recyclerview.widget.C1229h.a
    /* JADX INFO: renamed from: b */
    public b mo6089b(int i3, int i4, int i5, Object obj) {
        b bVar = (b) this.f5874a.mo602b();
        if (bVar == null) {
            return new b(i3, i4, i5, obj);
        }
        bVar.f5882a = i3;
        bVar.f5883b = i4;
        bVar.f5885d = i5;
        bVar.f5884c = obj;
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public int m6090e(int i3) {
        int size = this.f5875b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f5875b.get(i4);
            int i5 = bVar.f5882a;
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = bVar.f5883b;
                    if (i6 <= i3) {
                        int i7 = bVar.f5885d;
                        if (i6 + i7 > i3) {
                            return -1;
                        }
                        i3 -= i7;
                    } else {
                        continue;
                    }
                } else if (i5 == 8) {
                    int i8 = bVar.f5883b;
                    if (i8 == i3) {
                        i3 = bVar.f5885d;
                    } else {
                        if (i8 < i3) {
                            i3--;
                        }
                        if (bVar.f5885d <= i3) {
                            i3++;
                        }
                    }
                }
            } else if (bVar.f5883b <= i3) {
                i3 += bVar.f5885d;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: i */
    void m6091i() {
        int size = this.f5876c.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f5877d.mo5704b((b) this.f5876c.get(i3));
        }
        m6101u(this.f5876c);
        this.f5881h = 0;
    }

    /* JADX INFO: renamed from: j */
    void m6092j() {
        m6091i();
        int size = this.f5875b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = (b) this.f5875b.get(i3);
            int i4 = bVar.f5882a;
            if (i4 == 1) {
                this.f5877d.mo5704b(bVar);
                this.f5877d.mo5707e(bVar.f5883b, bVar.f5885d);
            } else if (i4 == 2) {
                this.f5877d.mo5704b(bVar);
                this.f5877d.mo5708f(bVar.f5883b, bVar.f5885d);
            } else if (i4 == 4) {
                this.f5877d.mo5704b(bVar);
                this.f5877d.mo5710h(bVar.f5883b, bVar.f5885d, bVar.f5884c);
            } else if (i4 == 8) {
                this.f5877d.mo5704b(bVar);
                this.f5877d.mo5703a(bVar.f5883b, bVar.f5885d);
            }
            Runnable runnable = this.f5878e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m6101u(this.f5875b);
        this.f5881h = 0;
    }

    /* JADX INFO: renamed from: l */
    void m6093l(b bVar, int i3) {
        this.f5877d.mo5709g(bVar);
        int i4 = bVar.f5882a;
        if (i4 == 2) {
            this.f5877d.mo5708f(i3, bVar.f5885d);
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f5877d.mo5710h(i3, bVar.f5885d, bVar.f5884c);
        }
    }

    /* JADX INFO: renamed from: m */
    int m6094m(int i3) {
        return m6095n(i3, 0);
    }

    /* JADX INFO: renamed from: n */
    int m6095n(int i3, int i4) {
        int size = this.f5876c.size();
        while (i4 < size) {
            b bVar = (b) this.f5876c.get(i4);
            int i5 = bVar.f5882a;
            if (i5 == 8) {
                int i6 = bVar.f5883b;
                if (i6 == i3) {
                    i3 = bVar.f5885d;
                } else {
                    if (i6 < i3) {
                        i3--;
                    }
                    if (bVar.f5885d <= i3) {
                        i3++;
                    }
                }
            } else {
                int i7 = bVar.f5883b;
                if (i7 > i3) {
                    continue;
                } else if (i5 == 2) {
                    int i8 = bVar.f5885d;
                    if (i3 < i7 + i8) {
                        return -1;
                    }
                    i3 -= i8;
                } else if (i5 == 1) {
                    i3 += bVar.f5885d;
                }
            }
            i4++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: o */
    boolean m6096o(int i3) {
        return (i3 & this.f5881h) != 0;
    }

    /* JADX INFO: renamed from: p */
    boolean m6097p() {
        return this.f5875b.size() > 0;
    }

    /* JADX INFO: renamed from: q */
    boolean m6098q() {
        return (this.f5876c.isEmpty() || this.f5875b.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    boolean m6099r(int i3, int i4, Object obj) {
        if (i4 < 1) {
            return false;
        }
        this.f5875b.add(mo6089b(4, i3, i4, obj));
        this.f5881h |= 4;
        return this.f5875b.size() == 1;
    }

    /* JADX INFO: renamed from: t */
    void m6100t() {
        this.f5880g.m6198b(this.f5875b);
        int size = this.f5875b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = (b) this.f5875b.get(i3);
            int i4 = bVar.f5882a;
            if (i4 == 1) {
                m6080c(bVar);
            } else if (i4 == 2) {
                m6082f(bVar);
            } else if (i4 == 4) {
                m6083g(bVar);
            } else if (i4 == 8) {
                m6081d(bVar);
            }
            Runnable runnable = this.f5878e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f5875b.clear();
    }

    /* JADX INFO: renamed from: u */
    void m6101u(List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            mo6088a((b) list.get(i3));
        }
        list.clear();
    }

    /* JADX INFO: renamed from: v */
    void m6102v() {
        m6101u(this.f5875b);
        m6101u(this.f5876c);
        this.f5881h = 0;
    }

    C1222a(a aVar, boolean z2) {
        this.f5874a = new C0209f(30);
        this.f5875b = new ArrayList();
        this.f5876c = new ArrayList();
        this.f5881h = 0;
        this.f5877d = aVar;
        this.f5879f = z2;
        this.f5880g = new C1229h(this);
    }
}
