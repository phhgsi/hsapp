package p149t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p137p.C2306d;
import p146s.AbstractC2380b;
import p146s.C2383e;
import p146s.C2384f;

/* JADX INFO: renamed from: t.o */
/* JADX INFO: loaded from: classes.dex */
public class C2423o {

    /* JADX INFO: renamed from: g */
    static int f11313g;

    /* JADX INFO: renamed from: b */
    int f11315b;

    /* JADX INFO: renamed from: d */
    int f11317d;

    /* JADX INFO: renamed from: a */
    ArrayList f11314a = new ArrayList();

    /* JADX INFO: renamed from: c */
    boolean f11316c = false;

    /* JADX INFO: renamed from: e */
    ArrayList f11318e = null;

    /* JADX INFO: renamed from: f */
    private int f11319f = -1;

    /* JADX INFO: renamed from: t.o$a */
    class a {

        /* JADX INFO: renamed from: a */
        WeakReference f11320a;

        /* JADX INFO: renamed from: b */
        int f11321b;

        /* JADX INFO: renamed from: c */
        int f11322c;

        /* JADX INFO: renamed from: d */
        int f11323d;

        /* JADX INFO: renamed from: e */
        int f11324e;

        /* JADX INFO: renamed from: f */
        int f11325f;

        /* JADX INFO: renamed from: g */
        int f11326g;

        public a(C2383e c2383e, C2306d c2306d, int i3) {
            this.f11320a = new WeakReference(c2383e);
            this.f11321b = c2306d.m11047x(c2383e.f10919N);
            this.f11322c = c2306d.m11047x(c2383e.f10920O);
            this.f11323d = c2306d.m11047x(c2383e.f10921P);
            this.f11324e = c2306d.m11047x(c2383e.f10922Q);
            this.f11325f = c2306d.m11047x(c2383e.f10923R);
            this.f11326g = i3;
        }
    }

    public C2423o(int i3) {
        int i4 = f11313g;
        f11313g = i4 + 1;
        this.f11315b = i4;
        this.f11317d = i3;
    }

    /* JADX INFO: renamed from: e */
    private String m11641e() {
        int i3 = this.f11317d;
        return i3 == 0 ? "Horizontal" : i3 == 1 ? "Vertical" : i3 == 2 ? "Both" : "Unknown";
    }

    /* JADX INFO: renamed from: j */
    private int m11642j(C2306d c2306d, ArrayList arrayList, int i3) {
        int iM11047x;
        int iM11047x2;
        C2384f c2384f = (C2384f) ((C2383e) arrayList.get(0)).m11282K();
        c2306d.m11029D();
        c2384f.mo11220g(c2306d, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((C2383e) arrayList.get(i4)).mo11220g(c2306d, false);
        }
        if (i3 == 0 && c2384f.f11001U0 > 0) {
            AbstractC2380b.m11234b(c2384f, c2306d, arrayList, 0);
        }
        if (i3 == 1 && c2384f.f11002V0 > 0) {
            AbstractC2380b.m11234b(c2384f, c2306d, arrayList, 1);
        }
        try {
            c2306d.m11048z();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.f11318e = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.f11318e.add(new a((C2383e) arrayList.get(i5), c2306d, i3));
        }
        if (i3 == 0) {
            iM11047x = c2306d.m11047x(c2384f.f10919N);
            iM11047x2 = c2306d.m11047x(c2384f.f10921P);
            c2306d.m11029D();
        } else {
            iM11047x = c2306d.m11047x(c2384f.f10920O);
            iM11047x2 = c2306d.m11047x(c2384f.f10922Q);
            c2306d.m11029D();
        }
        return iM11047x2 - iM11047x;
    }

    /* JADX INFO: renamed from: a */
    public boolean m11643a(C2383e c2383e) {
        if (this.f11314a.contains(c2383e)) {
            return false;
        }
        this.f11314a.add(c2383e);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m11644b(ArrayList arrayList) {
        int size = this.f11314a.size();
        if (this.f11319f != -1 && size > 0) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                C2423o c2423o = (C2423o) arrayList.get(i3);
                if (this.f11319f == c2423o.f11315b) {
                    m11648g(this.f11317d, c2423o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m11645c() {
        return this.f11315b;
    }

    /* JADX INFO: renamed from: d */
    public int m11646d() {
        return this.f11317d;
    }

    /* JADX INFO: renamed from: f */
    public int m11647f(C2306d c2306d, int i3) {
        if (this.f11314a.size() == 0) {
            return 0;
        }
        return m11642j(c2306d, this.f11314a, i3);
    }

    /* JADX INFO: renamed from: g */
    public void m11648g(int i3, C2423o c2423o) {
        ArrayList arrayList = this.f11314a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C2383e c2383e = (C2383e) obj;
            c2423o.m11643a(c2383e);
            if (i3 == 0) {
                c2383e.f10911G0 = c2423o.m11645c();
            } else {
                c2383e.f10913H0 = c2423o.m11645c();
            }
        }
        this.f11319f = c2423o.f11315b;
    }

    /* JADX INFO: renamed from: h */
    public void m11649h(boolean z2) {
        this.f11316c = z2;
    }

    /* JADX INFO: renamed from: i */
    public void m11650i(int i3) {
        this.f11317d = i3;
    }

    public String toString() {
        String str = m11641e() + " [" + this.f11315b + "] <";
        ArrayList arrayList = this.f11314a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            str = str + " " + ((C2383e) obj).m11353t();
        }
        return str + " >";
    }
}
