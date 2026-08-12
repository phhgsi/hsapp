package p071X1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p035L1.AbstractC0385q;
import p038M1.AbstractC0397C;
import p038M1.AbstractC0419m;
import p065V1.AbstractC0553a;
import p068W1.InterfaceC0566a;
import p068W1.InterfaceC0567b;
import p068W1.InterfaceC0568c;
import p068W1.InterfaceC0569d;
import p068W1.InterfaceC0570e;
import p068W1.InterfaceC0571f;
import p068W1.InterfaceC0572g;
import p068W1.InterfaceC0573h;
import p068W1.InterfaceC0574i;
import p068W1.InterfaceC0575j;
import p068W1.InterfaceC0576k;
import p068W1.InterfaceC0577l;
import p068W1.InterfaceC0578m;
import p068W1.InterfaceC0579n;
import p068W1.InterfaceC0580o;
import p068W1.InterfaceC0581p;
import p068W1.InterfaceC0582q;
import p068W1.InterfaceC0583r;
import p068W1.InterfaceC0584s;
import p068W1.InterfaceC0585t;
import p068W1.InterfaceC0586u;
import p068W1.InterfaceC0587v;
import p068W1.InterfaceC0588w;
import p090c2.InterfaceC1315b;

/* JADX INFO: renamed from: X1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0600e implements InterfaceC1315b, InterfaceC0599d {

    /* JADX INFO: renamed from: b */
    public static final a f2001b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Map f2002c;

    /* JADX INFO: renamed from: a */
    private final Class f2003a;

    /* JADX INFO: renamed from: X1.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    static {
        int i3 = 0;
        List listH = AbstractC0419m.m1461h(InterfaceC0566a.class, InterfaceC0577l.class, InterfaceC0581p.class, InterfaceC0582q.class, InterfaceC0583r.class, InterfaceC0584s.class, InterfaceC0585t.class, InterfaceC0586u.class, InterfaceC0587v.class, InterfaceC0588w.class, InterfaceC0567b.class, InterfaceC0568c.class, InterfaceC0569d.class, InterfaceC0570e.class, InterfaceC0571f.class, InterfaceC0572g.class, InterfaceC0573h.class, InterfaceC0574i.class, InterfaceC0575j.class, InterfaceC0576k.class, InterfaceC0578m.class, InterfaceC0579n.class, InterfaceC0580o.class);
        ArrayList arrayList = new ArrayList(AbstractC0419m.m1463j(listH, 10));
        for (Object obj : listH) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0419m.m1462i();
            }
            arrayList.add(AbstractC0385q.m1378a((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f2002c = AbstractC0397C.m1401g(arrayList);
    }

    public C0600e(Class cls) {
        AbstractC0606k.m2145e(cls, "jClass");
        this.f2003a = cls;
    }

    @Override // p071X1.InterfaceC0599d
    /* JADX INFO: renamed from: a */
    public Class mo2138a() {
        return this.f2003a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0600e) && AbstractC0606k.m2141a(AbstractC0553a.m2063b(this), AbstractC0553a.m2063b((InterfaceC1315b) obj));
    }

    public int hashCode() {
        return AbstractC0553a.m2063b(this).hashCode();
    }

    public String toString() {
        return mo2138a() + " (Kotlin reflection is not available)";
    }
}
