package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1035C;
import androidx.fragment.app.Fragment;
import androidx.transition.AbstractC1266k;
import java.util.ArrayList;
import java.util.List;
import p012E.C0108e;

/* JADX INFO: renamed from: androidx.transition.e */
/* JADX INFO: loaded from: classes.dex */
public class C1260e extends AbstractC1035C {

    /* JADX INFO: renamed from: androidx.transition.e$a */
    class a extends AbstractC1266k.f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Rect f6122a;

        a(Rect rect) {
            this.f6122a = rect;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$b */
    class b implements AbstractC1266k.g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f6124a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f6125b;

        b(View view, ArrayList arrayList) {
            this.f6124a = view;
            this.f6125b = arrayList;
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: a */
        public void mo6352a(AbstractC1266k abstractC1266k) {
            abstractC1266k.mo6410U(this);
            abstractC1266k.mo6415a(this);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: b */
        public void mo6353b(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void mo6354c(AbstractC1266k abstractC1266k, boolean z2) {
            AbstractC1267l.m6445b(this, abstractC1266k, z2);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: d */
        public void mo6355d(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: e */
        public void mo6356e(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void mo6357f(AbstractC1266k abstractC1266k, boolean z2) {
            AbstractC1267l.m6444a(this, abstractC1266k, z2);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: g */
        public void mo6358g(AbstractC1266k abstractC1266k) {
            abstractC1266k.mo6410U(this);
            this.f6124a.setVisibility(8);
            int size = this.f6125b.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((View) this.f6125b.get(i3)).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$c */
    class c extends AbstractC1274s {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f6127a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f6128b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f6129c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f6130d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f6131e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ ArrayList f6132f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6127a = obj;
            this.f6128b = arrayList;
            this.f6129c = obj2;
            this.f6130d = arrayList2;
            this.f6131e = obj3;
            this.f6132f = arrayList3;
        }

        @Override // androidx.transition.AbstractC1274s, androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: a */
        public void mo6352a(AbstractC1266k abstractC1266k) {
            Object obj = this.f6127a;
            if (obj != null) {
                C1260e.this.m6379x(obj, this.f6128b, null);
            }
            Object obj2 = this.f6129c;
            if (obj2 != null) {
                C1260e.this.m6379x(obj2, this.f6130d, null);
            }
            Object obj3 = this.f6131e;
            if (obj3 != null) {
                C1260e.this.m6379x(obj3, this.f6132f, null);
            }
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: g */
        public void mo6358g(AbstractC1266k abstractC1266k) {
            abstractC1266k.mo6410U(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$d */
    class d implements AbstractC1266k.g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f6134a;

        d(Runnable runnable) {
            this.f6134a = runnable;
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: a */
        public void mo6352a(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: b */
        public void mo6353b(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void mo6354c(AbstractC1266k abstractC1266k, boolean z2) {
            AbstractC1267l.m6445b(this, abstractC1266k, z2);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: d */
        public void mo6355d(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: e */
        public void mo6356e(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void mo6357f(AbstractC1266k abstractC1266k, boolean z2) {
            AbstractC1267l.m6444a(this, abstractC1266k, z2);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: g */
        public void mo6358g(AbstractC1266k abstractC1266k) {
            this.f6134a.run();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e */
    class e extends AbstractC1266k.f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Rect f6136a;

        e(Rect rect) {
            this.f6136a = rect;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m6377v(Runnable runnable, AbstractC1266k abstractC1266k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC1266k.mo6423f();
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: w */
    private static boolean m6378w(AbstractC1266k abstractC1266k) {
        return (AbstractC1035C.m4679i(abstractC1266k.m6401C()) && AbstractC1035C.m4679i(abstractC1266k.m6402D()) && AbstractC1035C.m4679i(abstractC1266k.m6403E())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: a */
    public void mo4653a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1266k) obj).mo6417b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: b */
    public void mo4654b(Object obj, ArrayList arrayList) {
        AbstractC1266k abstractC1266k = (AbstractC1266k) obj;
        if (abstractC1266k == null) {
            return;
        }
        int i3 = 0;
        if (abstractC1266k instanceof C1277v) {
            C1277v c1277v = (C1277v) abstractC1266k;
            int iM6460m0 = c1277v.m6460m0();
            while (i3 < iM6460m0) {
                mo4654b(c1277v.m6459l0(i3), arrayList);
                i3++;
            }
            return;
        }
        if (m6378w(abstractC1266k) || !AbstractC1035C.m4679i(abstractC1266k.m6404F())) {
            return;
        }
        int size = arrayList.size();
        while (i3 < size) {
            abstractC1266k.mo6417b((View) arrayList.get(i3));
            i3++;
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: c */
    public void mo4655c(ViewGroup viewGroup, Object obj) {
        AbstractC1275t.m6449a(viewGroup, (AbstractC1266k) obj);
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: e */
    public boolean mo4656e(Object obj) {
        return obj instanceof AbstractC1266k;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: f */
    public Object mo4657f(Object obj) {
        if (obj != null) {
            return ((AbstractC1266k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: j */
    public Object mo4658j(Object obj, Object obj2, Object obj3) {
        AbstractC1266k abstractC1266kM6465r0 = (AbstractC1266k) obj;
        AbstractC1266k abstractC1266k = (AbstractC1266k) obj2;
        AbstractC1266k abstractC1266k2 = (AbstractC1266k) obj3;
        if (abstractC1266kM6465r0 != null && abstractC1266k != null) {
            abstractC1266kM6465r0 = new C1277v().m6458j0(abstractC1266kM6465r0).m6458j0(abstractC1266k).m6465r0(1);
        } else if (abstractC1266kM6465r0 == null) {
            abstractC1266kM6465r0 = abstractC1266k != null ? abstractC1266k : null;
        }
        if (abstractC1266k2 == null) {
            return abstractC1266kM6465r0;
        }
        C1277v c1277v = new C1277v();
        if (abstractC1266kM6465r0 != null) {
            c1277v.m6458j0(abstractC1266kM6465r0);
        }
        c1277v.m6458j0(abstractC1266k2);
        return c1277v;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: k */
    public Object mo4659k(Object obj, Object obj2, Object obj3) {
        C1277v c1277v = new C1277v();
        if (obj != null) {
            c1277v.m6458j0((AbstractC1266k) obj);
        }
        if (obj2 != null) {
            c1277v.m6458j0((AbstractC1266k) obj2);
        }
        if (obj3 != null) {
            c1277v.m6458j0((AbstractC1266k) obj3);
        }
        return c1277v;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: m */
    public void mo4660m(Object obj, View view, ArrayList arrayList) {
        ((AbstractC1266k) obj).mo6415a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: n */
    public void mo4661n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC1266k) obj).mo6415a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: o */
    public void mo4662o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1266k) obj).mo6416a0(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: p */
    public void mo4663p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m4680h(view, rect);
            ((AbstractC1266k) obj).mo6416a0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: q */
    public void mo4664q(Fragment fragment, Object obj, C0108e c0108e, Runnable runnable) {
        m6380y(fragment, obj, c0108e, null, runnable);
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: s */
    public void mo4665s(Object obj, View view, ArrayList arrayList) {
        C1277v c1277v = (C1277v) obj;
        List listM6404F = c1277v.m6404F();
        listM6404F.clear();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1035C.m4677d(listM6404F, (View) arrayList.get(i3));
        }
        listM6404F.add(view);
        arrayList.add(view);
        mo4654b(c1277v, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: t */
    public void mo4666t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C1277v c1277v = (C1277v) obj;
        if (c1277v != null) {
            c1277v.m6404F().clear();
            c1277v.m6404F().addAll(arrayList2);
            m6379x(c1277v, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: u */
    public Object mo4667u(Object obj) {
        if (obj == null) {
            return null;
        }
        C1277v c1277v = new C1277v();
        c1277v.m6458j0((AbstractC1266k) obj);
        return c1277v;
    }

    /* JADX INFO: renamed from: x */
    public void m6379x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC1266k abstractC1266k = (AbstractC1266k) obj;
        int i3 = 0;
        if (abstractC1266k instanceof C1277v) {
            C1277v c1277v = (C1277v) abstractC1266k;
            int iM6460m0 = c1277v.m6460m0();
            while (i3 < iM6460m0) {
                m6379x(c1277v.m6459l0(i3), arrayList, arrayList2);
                i3++;
            }
            return;
        }
        if (m6378w(abstractC1266k)) {
            return;
        }
        List listM6404F = abstractC1266k.m6404F();
        if (listM6404F.size() == arrayList.size() && listM6404F.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i3 < size) {
                abstractC1266k.mo6417b((View) arrayList2.get(i3));
                i3++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC1266k.mo6411V((View) arrayList.get(size2));
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m6380y(Fragment fragment, Object obj, C0108e c0108e, final Runnable runnable, final Runnable runnable2) {
        final AbstractC1266k abstractC1266k = (AbstractC1266k) obj;
        c0108e.m329b(new C0108e.a() { // from class: androidx.transition.d
            @Override // p012E.C0108e.a
            /* JADX INFO: renamed from: a */
            public final void mo330a() {
                C1260e.m6377v(runnable, abstractC1266k, runnable2);
            }
        });
        abstractC1266k.mo6415a(new d(runnable2));
    }
}
