package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p012E.C0108e;
import p027J.AbstractC0268W;
import p054S.AbstractC0503b;

/* JADX INFO: renamed from: androidx.fragment.app.F */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1038F {

    /* JADX INFO: renamed from: a */
    private final ViewGroup f4953a;

    /* JADX INFO: renamed from: b */
    final ArrayList f4954b = new ArrayList();

    /* JADX INFO: renamed from: c */
    final ArrayList f4955c = new ArrayList();

    /* JADX INFO: renamed from: d */
    boolean f4956d = false;

    /* JADX INFO: renamed from: e */
    boolean f4957e = false;

    /* JADX INFO: renamed from: androidx.fragment.app.F$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ d f4958d;

        a(d dVar) {
            this.f4958d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC1038F.this.f4954b.contains(this.f4958d)) {
                this.f4958d.m4713e().m4722a(this.f4958d.m4714f().mView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.F$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ d f4960d;

        b(d dVar) {
            this.f4960d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1038F.this.f4954b.remove(this.f4960d);
            AbstractC1038F.this.f4955c.remove(this.f4960d);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.F$c */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4962a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f4963b;

        static {
            int[] iArr = new int[e.b.values().length];
            f4963b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4963b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4963b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f4962a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4962a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4962a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4962a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.F$d */
    private static class d extends e {

        /* JADX INFO: renamed from: h */
        private final C1096x f4964h;

        d(e.c cVar, e.b bVar, C1096x c1096x, C0108e c0108e) {
            super(cVar, bVar, c1096x.m5008k(), c0108e);
            this.f4964h = c1096x;
        }

        @Override // androidx.fragment.app.AbstractC1038F.e
        /* JADX INFO: renamed from: c */
        public void mo4708c() {
            super.mo4708c();
            this.f4964h.m5009m();
        }

        @Override // androidx.fragment.app.AbstractC1038F.e
        /* JADX INFO: renamed from: l */
        void mo4709l() {
            if (m4715g() != e.b.ADDING) {
                if (m4715g() == e.b.REMOVING) {
                    Fragment fragmentM5008k = this.f4964h.m5008k();
                    View viewRequireView = fragmentM5008k.requireView();
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentM5008k);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentM5008k2 = this.f4964h.m5008k();
            View viewFindFocus = fragmentM5008k2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentM5008k2.setFocusedView(viewFindFocus);
                if (FragmentManager.m4744H0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentM5008k2);
                }
            }
            View viewRequireView2 = m4714f().requireView();
            if (viewRequireView2.getParent() == null) {
                this.f4964h.m4999b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentM5008k2.getPostOnViewCreatedAlpha());
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.F$e */
    static class e {

        /* JADX INFO: renamed from: a */
        private c f4965a;

        /* JADX INFO: renamed from: b */
        private b f4966b;

        /* JADX INFO: renamed from: c */
        private final Fragment f4967c;

        /* JADX INFO: renamed from: d */
        private final List f4968d = new ArrayList();

        /* JADX INFO: renamed from: e */
        private final HashSet f4969e = new HashSet();

        /* JADX INFO: renamed from: f */
        private boolean f4970f = false;

        /* JADX INFO: renamed from: g */
        private boolean f4971g = false;

        /* JADX INFO: renamed from: androidx.fragment.app.F$e$a */
        class a implements C0108e.a {
            a() {
            }

            @Override // p012E.C0108e.a
            /* JADX INFO: renamed from: a */
            public void mo330a() {
                e.this.m4711b();
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.F$e$b */
        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: renamed from: androidx.fragment.app.F$e$c */
        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: renamed from: b */
            static c m4720b(int i3) {
                if (i3 == 0) {
                    return VISIBLE;
                }
                if (i3 == 4) {
                    return INVISIBLE;
                }
                if (i3 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i3);
            }

            /* JADX INFO: renamed from: c */
            static c m4721c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m4720b(view.getVisibility());
            }

            /* JADX INFO: renamed from: a */
            void m4722a(View view) {
                int i3 = c.f4962a[ordinal()];
                if (i3 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m4744H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i3 == 2) {
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i3 == 3) {
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i3 != 4) {
                    return;
                }
                if (FragmentManager.m4744H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, C0108e c0108e) {
            this.f4965a = cVar;
            this.f4966b = bVar;
            this.f4967c = fragment;
            c0108e.m329b(new a());
        }

        /* JADX INFO: renamed from: a */
        final void m4710a(Runnable runnable) {
            this.f4968d.add(runnable);
        }

        /* JADX INFO: renamed from: b */
        final void m4711b() {
            if (m4716h()) {
                return;
            }
            this.f4970f = true;
            if (this.f4969e.isEmpty()) {
                mo4708c();
                return;
            }
            ArrayList arrayList = new ArrayList(this.f4969e);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((C0108e) obj).m328a();
            }
        }

        /* JADX INFO: renamed from: c */
        public void mo4708c() {
            if (this.f4971g) {
                return;
            }
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4971g = true;
            Iterator it = this.f4968d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m4712d(C0108e c0108e) {
            if (this.f4969e.remove(c0108e) && this.f4969e.isEmpty()) {
                mo4708c();
            }
        }

        /* JADX INFO: renamed from: e */
        public c m4713e() {
            return this.f4965a;
        }

        /* JADX INFO: renamed from: f */
        public final Fragment m4714f() {
            return this.f4967c;
        }

        /* JADX INFO: renamed from: g */
        b m4715g() {
            return this.f4966b;
        }

        /* JADX INFO: renamed from: h */
        final boolean m4716h() {
            return this.f4970f;
        }

        /* JADX INFO: renamed from: i */
        final boolean m4717i() {
            return this.f4971g;
        }

        /* JADX INFO: renamed from: j */
        public final void m4718j(C0108e c0108e) {
            mo4709l();
            this.f4969e.add(c0108e);
        }

        /* JADX INFO: renamed from: k */
        final void m4719k(c cVar, b bVar) {
            int i3 = c.f4963b[bVar.ordinal()];
            if (i3 == 1) {
                if (this.f4965a == c.REMOVED) {
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4967c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4966b + " to ADDING.");
                    }
                    this.f4965a = c.VISIBLE;
                    this.f4966b = b.ADDING;
                    return;
                }
                return;
            }
            if (i3 == 2) {
                if (FragmentManager.m4744H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4967c + " mFinalState = " + this.f4965a + " -> REMOVED. mLifecycleImpact  = " + this.f4966b + " to REMOVING.");
                }
                this.f4965a = c.REMOVED;
                this.f4966b = b.REMOVING;
                return;
            }
            if (i3 == 3 && this.f4965a != c.REMOVED) {
                if (FragmentManager.m4744H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4967c + " mFinalState = " + this.f4965a + " -> " + cVar + ". ");
                }
                this.f4965a = cVar;
            }
        }

        /* JADX INFO: renamed from: l */
        abstract void mo4709l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4965a + "} {mLifecycleImpact = " + this.f4966b + "} {mFragment = " + this.f4967c + "}";
        }
    }

    AbstractC1038F(ViewGroup viewGroup) {
        this.f4953a = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    private void m4690a(e.c cVar, e.b bVar, C1096x c1096x) {
        synchronized (this.f4954b) {
            try {
                C0108e c0108e = new C0108e();
                e eVarM4691h = m4691h(c1096x.m5008k());
                if (eVarM4691h != null) {
                    eVarM4691h.m4719k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, c1096x, c0108e);
                this.f4954b.add(dVar);
                dVar.m4710a(new a(dVar));
                dVar.m4710a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private e m4691h(Fragment fragment) {
        ArrayList arrayList = this.f4954b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            e eVar = (e) obj;
            if (eVar.m4714f().equals(fragment) && !eVar.m4716h()) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    private e m4692i(Fragment fragment) {
        ArrayList arrayList = this.f4955c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            e eVar = (e) obj;
            if (eVar.m4714f().equals(fragment) && !eVar.m4716h()) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    static AbstractC1038F m4693n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m4694o(viewGroup, fragmentManager.m4863z0());
    }

    /* JADX INFO: renamed from: o */
    static AbstractC1038F m4694o(ViewGroup viewGroup, InterfaceC1071G interfaceC1071G) {
        int i3 = AbstractC0503b.f1742b;
        Object tag = viewGroup.getTag(i3);
        if (tag instanceof AbstractC1038F) {
            return (AbstractC1038F) tag;
        }
        AbstractC1038F abstractC1038FMo4869a = interfaceC1071G.mo4869a(viewGroup);
        viewGroup.setTag(i3, abstractC1038FMo4869a);
        return abstractC1038FMo4869a;
    }

    /* JADX INFO: renamed from: q */
    private void m4695q() {
        ArrayList arrayList = this.f4954b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            e eVar = (e) obj;
            if (eVar.m4715g() == e.b.ADDING) {
                eVar.m4719k(e.c.m4720b(eVar.m4714f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    void m4696b(e.c cVar, C1096x c1096x) {
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c1096x.m5008k());
        }
        m4690a(cVar, e.b.ADDING, c1096x);
    }

    /* JADX INFO: renamed from: c */
    void m4697c(C1096x c1096x) {
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c1096x.m5008k());
        }
        m4690a(e.c.GONE, e.b.NONE, c1096x);
    }

    /* JADX INFO: renamed from: d */
    void m4698d(C1096x c1096x) {
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c1096x.m5008k());
        }
        m4690a(e.c.REMOVED, e.b.REMOVING, c1096x);
    }

    /* JADX INFO: renamed from: e */
    void m4699e(C1096x c1096x) {
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c1096x.m5008k());
        }
        m4690a(e.c.VISIBLE, e.b.NONE, c1096x);
    }

    /* JADX INFO: renamed from: f */
    abstract void mo4700f(List list, boolean z2);

    /* JADX INFO: renamed from: g */
    void m4701g() {
        if (this.f4957e) {
            return;
        }
        if (!AbstractC0268W.m745N(this.f4953a)) {
            m4702j();
            this.f4956d = false;
            return;
        }
        synchronized (this.f4954b) {
            try {
                if (!this.f4954b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f4955c);
                    this.f4955c.clear();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        e eVar = (e) obj;
                        if (FragmentManager.m4744H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.m4711b();
                        if (!eVar.m4717i()) {
                            this.f4955c.add(eVar);
                        }
                    }
                    m4695q();
                    ArrayList arrayList2 = new ArrayList(this.f4954b);
                    this.f4954b.clear();
                    this.f4955c.addAll(arrayList2);
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        ((e) obj2).mo4709l();
                    }
                    mo4700f(arrayList2, this.f4956d);
                    this.f4956d = false;
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    void m4702j() {
        String str;
        String str2;
        if (FragmentManager.m4744H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zM745N = AbstractC0268W.m745N(this.f4953a);
        synchronized (this.f4954b) {
            try {
                m4695q();
                ArrayList arrayList = this.f4954b;
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((e) obj).mo4709l();
                }
                ArrayList arrayList2 = new ArrayList(this.f4955c);
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    e eVar = (e) obj2;
                    if (FragmentManager.m4744H0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zM745N) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f4953a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.m4711b();
                }
                ArrayList arrayList3 = new ArrayList(this.f4954b);
                int size3 = arrayList3.size();
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    e eVar2 = (e) obj3;
                    if (FragmentManager.m4744H0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zM745N) {
                            str = "";
                        } else {
                            str = "Container " + this.f4953a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.m4711b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    void m4703k() {
        if (this.f4957e) {
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f4957e = false;
            m4701g();
        }
    }

    /* JADX INFO: renamed from: l */
    e.b m4704l(C1096x c1096x) {
        e eVarM4691h = m4691h(c1096x.m5008k());
        e.b bVarM4715g = eVarM4691h != null ? eVarM4691h.m4715g() : null;
        e eVarM4692i = m4692i(c1096x.m5008k());
        return (eVarM4692i == null || !(bVarM4715g == null || bVarM4715g == e.b.NONE)) ? bVarM4715g : eVarM4692i.m4715g();
    }

    /* JADX INFO: renamed from: m */
    public ViewGroup m4705m() {
        return this.f4953a;
    }

    /* JADX INFO: renamed from: p */
    void m4706p() {
        synchronized (this.f4954b) {
            try {
                m4695q();
                this.f4957e = false;
                int size = this.f4954b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) this.f4954b.get(size);
                    e.c cVarM4721c = e.c.m4721c(eVar.m4714f().mView);
                    e.c cVarM4713e = eVar.m4713e();
                    e.c cVar = e.c.VISIBLE;
                    if (cVarM4713e == cVar && cVarM4721c != cVar) {
                        this.f4957e = eVar.m4714f().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    void m4707r(boolean z2) {
        this.f4956d = z2;
    }
}
