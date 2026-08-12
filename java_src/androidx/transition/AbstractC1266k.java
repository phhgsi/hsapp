package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.collection.C0921a;
import androidx.collection.C0926f;
import androidx.transition.AbstractC1266k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p027J.AbstractC0268W;

/* JADX INFO: renamed from: androidx.transition.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1266k implements Cloneable {

    /* JADX INFO: renamed from: L */
    private static final Animator[] f6143L = new Animator[0];

    /* JADX INFO: renamed from: M */
    private static final int[] f6144M = {2, 1, 3, 4};

    /* JADX INFO: renamed from: N */
    private static final AbstractC1262g f6145N = new a();

    /* JADX INFO: renamed from: O */
    private static ThreadLocal f6146O = new ThreadLocal();

    /* JADX INFO: renamed from: I */
    private f f6155I;

    /* JADX INFO: renamed from: J */
    private C0921a f6156J;

    /* JADX INFO: renamed from: w */
    private ArrayList f6177w;

    /* JADX INFO: renamed from: x */
    private ArrayList f6178x;

    /* JADX INFO: renamed from: y */
    private g[] f6179y;

    /* JADX INFO: renamed from: d */
    private String f6158d = getClass().getName();

    /* JADX INFO: renamed from: e */
    private long f6159e = -1;

    /* JADX INFO: renamed from: f */
    long f6160f = -1;

    /* JADX INFO: renamed from: g */
    private TimeInterpolator f6161g = null;

    /* JADX INFO: renamed from: h */
    ArrayList f6162h = new ArrayList();

    /* JADX INFO: renamed from: i */
    ArrayList f6163i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private ArrayList f6164j = null;

    /* JADX INFO: renamed from: k */
    private ArrayList f6165k = null;

    /* JADX INFO: renamed from: l */
    private ArrayList f6166l = null;

    /* JADX INFO: renamed from: m */
    private ArrayList f6167m = null;

    /* JADX INFO: renamed from: n */
    private ArrayList f6168n = null;

    /* JADX INFO: renamed from: o */
    private ArrayList f6169o = null;

    /* JADX INFO: renamed from: p */
    private ArrayList f6170p = null;

    /* JADX INFO: renamed from: q */
    private ArrayList f6171q = null;

    /* JADX INFO: renamed from: r */
    private ArrayList f6172r = null;

    /* JADX INFO: renamed from: s */
    private C1280y f6173s = new C1280y();

    /* JADX INFO: renamed from: t */
    private C1280y f6174t = new C1280y();

    /* JADX INFO: renamed from: u */
    C1277v f6175u = null;

    /* JADX INFO: renamed from: v */
    private int[] f6176v = f6144M;

    /* JADX INFO: renamed from: z */
    boolean f6180z = false;

    /* JADX INFO: renamed from: A */
    ArrayList f6147A = new ArrayList();

    /* JADX INFO: renamed from: B */
    private Animator[] f6148B = f6143L;

    /* JADX INFO: renamed from: C */
    int f6149C = 0;

    /* JADX INFO: renamed from: D */
    private boolean f6150D = false;

    /* JADX INFO: renamed from: E */
    boolean f6151E = false;

    /* JADX INFO: renamed from: F */
    private AbstractC1266k f6152F = null;

    /* JADX INFO: renamed from: G */
    private ArrayList f6153G = null;

    /* JADX INFO: renamed from: H */
    ArrayList f6154H = new ArrayList();

    /* JADX INFO: renamed from: K */
    private AbstractC1262g f6157K = f6145N;

    /* JADX INFO: renamed from: androidx.transition.k$a */
    class a extends AbstractC1262g {
        a() {
        }

        @Override // androidx.transition.AbstractC1262g
        /* JADX INFO: renamed from: a */
        public Path mo6383a(float f3, float f4, float f5, float f6) {
            Path path = new Path();
            path.moveTo(f3, f4);
            path.lineTo(f5, f6);
            return path;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0921a f6181a;

        b(C0921a c0921a) {
            this.f6181a = c0921a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6181a.remove(animator);
            AbstractC1266k.this.f6147A.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC1266k.this.f6147A.add(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC1266k.this.m6431p();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        View f6184a;

        /* JADX INFO: renamed from: b */
        String f6185b;

        /* JADX INFO: renamed from: c */
        C1279x f6186c;

        /* JADX INFO: renamed from: d */
        WindowId f6187d;

        /* JADX INFO: renamed from: e */
        AbstractC1266k f6188e;

        /* JADX INFO: renamed from: f */
        Animator f6189f;

        d(View view, String str, AbstractC1266k abstractC1266k, WindowId windowId, C1279x c1279x, Animator animator) {
            this.f6184a = view;
            this.f6185b = str;
            this.f6186c = c1279x;
            this.f6187d = windowId;
            this.f6188e = abstractC1266k;
            this.f6189f = animator;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$e */
    private static class e {
        /* JADX INFO: renamed from: a */
        static ArrayList m6441a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        static ArrayList m6442b(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$f */
    public static abstract class f {
    }

    /* JADX INFO: renamed from: androidx.transition.k$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo6352a(AbstractC1266k abstractC1266k);

        /* JADX INFO: renamed from: b */
        void mo6353b(AbstractC1266k abstractC1266k);

        /* JADX INFO: renamed from: c */
        void mo6354c(AbstractC1266k abstractC1266k, boolean z2);

        /* JADX INFO: renamed from: d */
        void mo6355d(AbstractC1266k abstractC1266k);

        /* JADX INFO: renamed from: e */
        void mo6356e(AbstractC1266k abstractC1266k);

        /* JADX INFO: renamed from: f */
        void mo6357f(AbstractC1266k abstractC1266k, boolean z2);

        /* JADX INFO: renamed from: g */
        void mo6358g(AbstractC1266k abstractC1266k);
    }

    /* JADX INFO: renamed from: androidx.transition.k$h */
    interface h {

        /* JADX INFO: renamed from: a */
        public static final h f6190a = new h() { // from class: androidx.transition.m
            @Override // androidx.transition.AbstractC1266k.h
            /* JADX INFO: renamed from: a */
            public final void mo6443a(AbstractC1266k.g gVar, AbstractC1266k abstractC1266k, boolean z2) {
                gVar.mo6354c(abstractC1266k, z2);
            }
        };

        /* JADX INFO: renamed from: b */
        public static final h f6191b = new h() { // from class: androidx.transition.n
            @Override // androidx.transition.AbstractC1266k.h
            /* JADX INFO: renamed from: a */
            public final void mo6443a(AbstractC1266k.g gVar, AbstractC1266k abstractC1266k, boolean z2) {
                gVar.mo6357f(abstractC1266k, z2);
            }
        };

        /* JADX INFO: renamed from: c */
        public static final h f6192c = new h() { // from class: androidx.transition.o
            @Override // androidx.transition.AbstractC1266k.h
            /* JADX INFO: renamed from: a */
            public final void mo6443a(AbstractC1266k.g gVar, AbstractC1266k abstractC1266k, boolean z2) {
                gVar.mo6353b(abstractC1266k);
            }
        };

        /* JADX INFO: renamed from: d */
        public static final h f6193d = new h() { // from class: androidx.transition.p
            @Override // androidx.transition.AbstractC1266k.h
            /* JADX INFO: renamed from: a */
            public final void mo6443a(AbstractC1266k.g gVar, AbstractC1266k abstractC1266k, boolean z2) {
                gVar.mo6355d(abstractC1266k);
            }
        };

        /* JADX INFO: renamed from: e */
        public static final h f6194e = new h() { // from class: androidx.transition.q
            @Override // androidx.transition.AbstractC1266k.h
            /* JADX INFO: renamed from: a */
            public final void mo6443a(AbstractC1266k.g gVar, AbstractC1266k abstractC1266k, boolean z2) {
                gVar.mo6356e(abstractC1266k);
            }
        };

        /* JADX INFO: renamed from: a */
        void mo6443a(g gVar, AbstractC1266k abstractC1266k, boolean z2);
    }

    /* JADX INFO: renamed from: A */
    private static C0921a m6387A() {
        C0921a c0921a = (C0921a) f6146O.get();
        if (c0921a != null) {
            return c0921a;
        }
        C0921a c0921a2 = new C0921a();
        f6146O.set(c0921a2);
        return c0921a2;
    }

    /* JADX INFO: renamed from: K */
    private static boolean m6388K(C1279x c1279x, C1279x c1279x2, String str) {
        Object obj = c1279x.f6211a.get(str);
        Object obj2 = c1279x2.f6211a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: L */
    private void m6389L(C0921a c0921a, C0921a c0921a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) sparseArray.valueAt(i3);
            if (view2 != null && m6406J(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i3))) != null && m6406J(view)) {
                C1279x c1279x = (C1279x) c0921a.get(view2);
                C1279x c1279x2 = (C1279x) c0921a2.get(view);
                if (c1279x != null && c1279x2 != null) {
                    this.f6177w.add(c1279x);
                    this.f6178x.add(c1279x2);
                    c0921a.remove(view2);
                    c0921a2.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private void m6390M(C0921a c0921a, C0921a c0921a2) {
        C1279x c1279x;
        for (int size = c0921a.size() - 1; size >= 0; size--) {
            View view = (View) c0921a.m3944f(size);
            if (view != null && m6406J(view) && (c1279x = (C1279x) c0921a2.remove(view)) != null && m6406J(c1279x.f6212b)) {
                this.f6177w.add((C1279x) c0921a.m3946h(size));
                this.f6178x.add(c1279x);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    private void m6391N(C0921a c0921a, C0921a c0921a2, C0926f c0926f, C0926f c0926f2) {
        View view;
        int iM3935k = c0926f.m3935k();
        for (int i3 = 0; i3 < iM3935k; i3++) {
            View view2 = (View) c0926f.m3936l(i3);
            if (view2 != null && m6406J(view2) && (view = (View) c0926f2.m3928d(c0926f.m3931g(i3))) != null && m6406J(view)) {
                C1279x c1279x = (C1279x) c0921a.get(view2);
                C1279x c1279x2 = (C1279x) c0921a2.get(view);
                if (c1279x != null && c1279x2 != null) {
                    this.f6177w.add(c1279x);
                    this.f6178x.add(c1279x2);
                    c0921a.remove(view2);
                    c0921a2.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    private void m6392O(C0921a c0921a, C0921a c0921a2, C0921a c0921a3, C0921a c0921a4) {
        View view;
        int size = c0921a3.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) c0921a3.m3948j(i3);
            if (view2 != null && m6406J(view2) && (view = (View) c0921a4.get(c0921a3.m3944f(i3))) != null && m6406J(view)) {
                C1279x c1279x = (C1279x) c0921a.get(view2);
                C1279x c1279x2 = (C1279x) c0921a2.get(view);
                if (c1279x != null && c1279x2 != null) {
                    this.f6177w.add(c1279x);
                    this.f6178x.add(c1279x2);
                    c0921a.remove(view2);
                    c0921a2.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    private void m6393P(C1280y c1280y, C1280y c1280y2) {
        C0921a c0921a = new C0921a(c1280y.f6214a);
        C0921a c0921a2 = new C0921a(c1280y2.f6214a);
        int i3 = 0;
        while (true) {
            int[] iArr = this.f6176v;
            if (i3 >= iArr.length) {
                m6396c(c0921a, c0921a2);
                return;
            }
            int i4 = iArr[i3];
            if (i4 == 1) {
                m6390M(c0921a, c0921a2);
            } else if (i4 == 2) {
                m6392O(c0921a, c0921a2, c1280y.f6217d, c1280y2.f6217d);
            } else if (i4 == 3) {
                m6389L(c0921a, c0921a2, c1280y.f6215b, c1280y2.f6215b);
            } else if (i4 == 4) {
                m6391N(c0921a, c0921a2, c1280y.f6216c, c1280y2.f6216c);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m6394Q(AbstractC1266k abstractC1266k, h hVar, boolean z2) {
        AbstractC1266k abstractC1266k2 = this.f6152F;
        if (abstractC1266k2 != null) {
            abstractC1266k2.m6394Q(abstractC1266k, hVar, z2);
        }
        ArrayList arrayList = this.f6153G;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f6153G.size();
        g[] gVarArr = this.f6179y;
        if (gVarArr == null) {
            gVarArr = new g[size];
        }
        this.f6179y = null;
        g[] gVarArr2 = (g[]) this.f6153G.toArray(gVarArr);
        for (int i3 = 0; i3 < size; i3++) {
            hVar.mo6443a(gVarArr2[i3], abstractC1266k, z2);
            gVarArr2[i3] = null;
        }
        this.f6179y = gVarArr2;
    }

    /* JADX INFO: renamed from: X */
    private void m6395X(Animator animator, C0921a c0921a) {
        if (animator != null) {
            animator.addListener(new b(c0921a));
            m6421e(animator);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m6396c(C0921a c0921a, C0921a c0921a2) {
        for (int i3 = 0; i3 < c0921a.size(); i3++) {
            C1279x c1279x = (C1279x) c0921a.m3948j(i3);
            if (m6406J(c1279x.f6212b)) {
                this.f6177w.add(c1279x);
                this.f6178x.add(null);
            }
        }
        for (int i4 = 0; i4 < c0921a2.size(); i4++) {
            C1279x c1279x2 = (C1279x) c0921a2.m3948j(i4);
            if (m6406J(c1279x2.f6212b)) {
                this.f6178x.add(c1279x2);
                this.f6177w.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m6397d(C1280y c1280y, View view, C1279x c1279x) {
        c1280y.f6214a.put(view, c1279x);
        int id = view.getId();
        if (id >= 0) {
            if (c1280y.f6215b.indexOfKey(id) >= 0) {
                c1280y.f6215b.put(id, null);
            } else {
                c1280y.f6215b.put(id, view);
            }
        }
        String strM737F = AbstractC0268W.m737F(view);
        if (strM737F != null) {
            if (c1280y.f6217d.containsKey(strM737F)) {
                c1280y.f6217d.put(strM737F, null);
            } else {
                c1280y.f6217d.put(strM737F, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1280y.f6216c.m3930f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1280y.f6216c.m3932h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1280y.f6216c.m3928d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1280y.f6216c.m3932h(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m6398h(View view, boolean z2) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f6166l;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f6167m;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f6168n;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((Class) this.f6168n.get(i3)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C1279x c1279x = new C1279x(view);
                    if (z2) {
                        mo6343j(c1279x);
                    } else {
                        mo6342g(c1279x);
                    }
                    c1279x.f6213c.add(this);
                    mo6426i(c1279x);
                    if (z2) {
                        m6397d(this.f6173s, view, c1279x);
                    } else {
                        m6397d(this.f6174t, view, c1279x);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f6170p;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f6171q;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f6172r;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    if (((Class) this.f6172r.get(i4)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                                m6398h(viewGroup.getChildAt(i5), z2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private ArrayList m6399r(ArrayList arrayList, Class cls, boolean z2) {
        return cls != null ? z2 ? e.m6441a(arrayList, cls) : e.m6442b(arrayList, cls) : arrayList;
    }

    /* JADX INFO: renamed from: B */
    public long m6400B() {
        return this.f6159e;
    }

    /* JADX INFO: renamed from: C */
    public List m6401C() {
        return this.f6162h;
    }

    /* JADX INFO: renamed from: D */
    public List m6402D() {
        return this.f6164j;
    }

    /* JADX INFO: renamed from: E */
    public List m6403E() {
        return this.f6165k;
    }

    /* JADX INFO: renamed from: F */
    public List m6404F() {
        return this.f6163i;
    }

    /* JADX INFO: renamed from: G */
    public String[] mo6340G() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public C1279x m6405H(View view, boolean z2) {
        C1277v c1277v = this.f6175u;
        if (c1277v != null) {
            return c1277v.m6405H(view, z2);
        }
        return (C1279x) (z2 ? this.f6173s : this.f6174t).f6214a.get(view);
    }

    /* JADX INFO: renamed from: I */
    public boolean mo6341I(C1279x c1279x, C1279x c1279x2) {
        if (c1279x != null && c1279x2 != null) {
            String[] strArrMo6340G = mo6340G();
            if (strArrMo6340G != null) {
                for (String str : strArrMo6340G) {
                    if (m6388K(c1279x, c1279x2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c1279x.f6211a.keySet().iterator();
                while (it.hasNext()) {
                    if (m6388K(c1279x, c1279x2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    boolean m6406J(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f6166l;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f6167m;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f6168n;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((Class) this.f6168n.get(i3)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6169o != null && AbstractC0268W.m737F(view) != null && this.f6169o.contains(AbstractC0268W.m737F(view))) {
            return false;
        }
        if ((this.f6162h.size() == 0 && this.f6163i.size() == 0 && (((arrayList = this.f6165k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6164j) == null || arrayList2.isEmpty()))) || this.f6162h.contains(Integer.valueOf(id)) || this.f6163i.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f6164j;
        if (arrayList6 != null && arrayList6.contains(AbstractC0268W.m737F(view))) {
            return true;
        }
        if (this.f6165k != null) {
            for (int i4 = 0; i4 < this.f6165k.size(); i4++) {
                if (((Class) this.f6165k.get(i4)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    void m6407R(h hVar, boolean z2) {
        m6394Q(this, hVar, z2);
    }

    /* JADX INFO: renamed from: S */
    public void mo6408S(View view) {
        if (this.f6151E) {
            return;
        }
        int size = this.f6147A.size();
        Animator[] animatorArr = (Animator[]) this.f6147A.toArray(this.f6148B);
        this.f6148B = f6143L;
        for (int i3 = size - 1; i3 >= 0; i3--) {
            Animator animator = animatorArr[i3];
            animatorArr[i3] = null;
            animator.pause();
        }
        this.f6148B = animatorArr;
        m6407R(h.f6193d, false);
        this.f6150D = true;
    }

    /* JADX INFO: renamed from: T */
    void m6409T(ViewGroup viewGroup) {
        d dVar;
        this.f6177w = new ArrayList();
        this.f6178x = new ArrayList();
        m6393P(this.f6173s, this.f6174t);
        C0921a c0921aM6387A = m6387A();
        int size = c0921aM6387A.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i3 = size - 1; i3 >= 0; i3--) {
            Animator animator = (Animator) c0921aM6387A.m3944f(i3);
            if (animator != null && (dVar = (d) c0921aM6387A.get(animator)) != null && dVar.f6184a != null && windowId.equals(dVar.f6187d)) {
                C1279x c1279x = dVar.f6186c;
                View view = dVar.f6184a;
                C1279x c1279xM6405H = m6405H(view, true);
                C1279x c1279xM6436v = m6436v(view, true);
                if (c1279xM6405H == null && c1279xM6436v == null) {
                    c1279xM6436v = (C1279x) this.f6174t.f6214a.get(view);
                }
                if ((c1279xM6405H != null || c1279xM6436v != null) && dVar.f6188e.mo6341I(c1279x, c1279xM6436v)) {
                    dVar.f6188e.m6440z().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c0921aM6387A.remove(animator);
                    }
                }
            }
        }
        mo6430o(viewGroup, this.f6173s, this.f6174t, this.f6177w, this.f6178x);
        mo6413Y();
    }

    /* JADX INFO: renamed from: U */
    public AbstractC1266k mo6410U(g gVar) {
        AbstractC1266k abstractC1266k;
        ArrayList arrayList = this.f6153G;
        if (arrayList != null) {
            if (!arrayList.remove(gVar) && (abstractC1266k = this.f6152F) != null) {
                abstractC1266k.mo6410U(gVar);
            }
            if (this.f6153G.size() == 0) {
                this.f6153G = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: V */
    public AbstractC1266k mo6411V(View view) {
        this.f6163i.remove(view);
        return this;
    }

    /* JADX INFO: renamed from: W */
    public void mo6412W(View view) {
        if (this.f6150D) {
            if (!this.f6151E) {
                int size = this.f6147A.size();
                Animator[] animatorArr = (Animator[]) this.f6147A.toArray(this.f6148B);
                this.f6148B = f6143L;
                for (int i3 = size - 1; i3 >= 0; i3--) {
                    Animator animator = animatorArr[i3];
                    animatorArr[i3] = null;
                    animator.resume();
                }
                this.f6148B = animatorArr;
                m6407R(h.f6194e, false);
            }
            this.f6150D = false;
        }
    }

    /* JADX INFO: renamed from: Y */
    protected void mo6413Y() {
        m6424f0();
        C0921a c0921aM6387A = m6387A();
        ArrayList arrayList = this.f6154H;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Animator animator = (Animator) obj;
            if (c0921aM6387A.containsKey(animator)) {
                m6424f0();
                m6395X(animator, c0921aM6387A);
            }
        }
        this.f6154H.clear();
        m6431p();
    }

    /* JADX INFO: renamed from: Z */
    public AbstractC1266k mo6414Z(long j3) {
        this.f6160f = j3;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1266k mo6415a(g gVar) {
        if (this.f6153G == null) {
            this.f6153G = new ArrayList();
        }
        this.f6153G.add(gVar);
        return this;
    }

    /* JADX INFO: renamed from: a0 */
    public void mo6416a0(f fVar) {
        this.f6155I = fVar;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1266k mo6417b(View view) {
        this.f6163i.add(view);
        return this;
    }

    /* JADX INFO: renamed from: b0 */
    public AbstractC1266k mo6418b0(TimeInterpolator timeInterpolator) {
        this.f6161g = timeInterpolator;
        return this;
    }

    /* JADX INFO: renamed from: c0 */
    public void mo6419c0(AbstractC1262g abstractC1262g) {
        if (abstractC1262g == null) {
            this.f6157K = f6145N;
        } else {
            this.f6157K = abstractC1262g;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void mo6420d0(AbstractC1276u abstractC1276u) {
    }

    /* JADX INFO: renamed from: e */
    protected void m6421e(Animator animator) {
        if (animator == null) {
            m6431p();
            return;
        }
        if (m6433s() >= 0) {
            animator.setDuration(m6433s());
        }
        if (m6400B() >= 0) {
            animator.setStartDelay(m6400B() + animator.getStartDelay());
        }
        if (m6435u() != null) {
            animator.setInterpolator(m6435u());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: renamed from: e0 */
    public AbstractC1266k mo6422e0(long j3) {
        this.f6159e = j3;
        return this;
    }

    /* JADX INFO: renamed from: f */
    protected void mo6423f() {
        int size = this.f6147A.size();
        Animator[] animatorArr = (Animator[]) this.f6147A.toArray(this.f6148B);
        this.f6148B = f6143L;
        for (int i3 = size - 1; i3 >= 0; i3--) {
            Animator animator = animatorArr[i3];
            animatorArr[i3] = null;
            animator.cancel();
        }
        this.f6148B = animatorArr;
        m6407R(h.f6192c, false);
    }

    /* JADX INFO: renamed from: f0 */
    protected void m6424f0() {
        if (this.f6149C == 0) {
            m6407R(h.f6190a, false);
            this.f6151E = false;
        }
        this.f6149C++;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo6342g(C1279x c1279x);

    /* JADX INFO: renamed from: g0 */
    String mo6425g0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f6160f != -1) {
            sb.append("dur(");
            sb.append(this.f6160f);
            sb.append(") ");
        }
        if (this.f6159e != -1) {
            sb.append("dly(");
            sb.append(this.f6159e);
            sb.append(") ");
        }
        if (this.f6161g != null) {
            sb.append("interp(");
            sb.append(this.f6161g);
            sb.append(") ");
        }
        if (this.f6162h.size() > 0 || this.f6163i.size() > 0) {
            sb.append("tgts(");
            if (this.f6162h.size() > 0) {
                for (int i3 = 0; i3 < this.f6162h.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f6162h.get(i3));
                }
            }
            if (this.f6163i.size() > 0) {
                for (int i4 = 0; i4 < this.f6163i.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f6163i.get(i4));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    void mo6426i(C1279x c1279x) {
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo6343j(C1279x c1279x);

    /* JADX INFO: renamed from: k */
    void m6427k(ViewGroup viewGroup, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0921a c0921a;
        m6428l(z2);
        if ((this.f6162h.size() > 0 || this.f6163i.size() > 0) && (((arrayList = this.f6164j) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6165k) == null || arrayList2.isEmpty()))) {
            for (int i3 = 0; i3 < this.f6162h.size(); i3++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f6162h.get(i3)).intValue());
                if (viewFindViewById != null) {
                    C1279x c1279x = new C1279x(viewFindViewById);
                    if (z2) {
                        mo6343j(c1279x);
                    } else {
                        mo6342g(c1279x);
                    }
                    c1279x.f6213c.add(this);
                    mo6426i(c1279x);
                    if (z2) {
                        m6397d(this.f6173s, viewFindViewById, c1279x);
                    } else {
                        m6397d(this.f6174t, viewFindViewById, c1279x);
                    }
                }
            }
            for (int i4 = 0; i4 < this.f6163i.size(); i4++) {
                View view = (View) this.f6163i.get(i4);
                C1279x c1279x2 = new C1279x(view);
                if (z2) {
                    mo6343j(c1279x2);
                } else {
                    mo6342g(c1279x2);
                }
                c1279x2.f6213c.add(this);
                mo6426i(c1279x2);
                if (z2) {
                    m6397d(this.f6173s, view, c1279x2);
                } else {
                    m6397d(this.f6174t, view, c1279x2);
                }
            }
        } else {
            m6398h(viewGroup, z2);
        }
        if (z2 || (c0921a = this.f6156J) == null) {
            return;
        }
        int size = c0921a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList3.add((View) this.f6173s.f6217d.remove((String) this.f6156J.m3944f(i5)));
        }
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) arrayList3.get(i6);
            if (view2 != null) {
                this.f6173s.f6217d.put((String) this.f6156J.m3948j(i6), view2);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    void m6428l(boolean z2) {
        if (z2) {
            this.f6173s.f6214a.clear();
            this.f6173s.f6215b.clear();
            this.f6173s.f6216c.m3926b();
        } else {
            this.f6174t.f6214a.clear();
            this.f6174t.f6215b.clear();
            this.f6174t.f6216c.m3926b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: m */
    public AbstractC1266k clone() {
        try {
            AbstractC1266k abstractC1266k = (AbstractC1266k) super.clone();
            abstractC1266k.f6154H = new ArrayList();
            abstractC1266k.f6173s = new C1280y();
            abstractC1266k.f6174t = new C1280y();
            abstractC1266k.f6177w = null;
            abstractC1266k.f6178x = null;
            abstractC1266k.f6152F = this;
            abstractC1266k.f6153G = null;
            return abstractC1266k;
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: n */
    public Animator mo6348n(ViewGroup viewGroup, C1279x c1279x, C1279x c1279x2) {
        return null;
    }

    /* JADX INFO: renamed from: o */
    void mo6430o(ViewGroup viewGroup, C1280y c1280y, C1280y c1280y2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        C1279x c1279x;
        View view2;
        Animator animator2;
        C0921a c0921aM6387A = m6387A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m6440z().getClass();
        for (int i3 = 0; i3 < size; i3++) {
            C1279x c1279x2 = (C1279x) arrayList.get(i3);
            C1279x c1279x3 = (C1279x) arrayList2.get(i3);
            if (c1279x2 != null && !c1279x2.f6213c.contains(this)) {
                c1279x2 = null;
            }
            if (c1279x3 != null && !c1279x3.f6213c.contains(this)) {
                c1279x3 = null;
            }
            if ((c1279x2 != null || c1279x3 != null) && (c1279x2 == null || c1279x3 == null || mo6341I(c1279x2, c1279x3))) {
                Animator animatorMo6348n = mo6348n(viewGroup, c1279x2, c1279x3);
                if (animatorMo6348n != null) {
                    if (c1279x3 != null) {
                        View view3 = c1279x3.f6212b;
                        String[] strArrMo6340G = mo6340G();
                        if (strArrMo6340G != null && strArrMo6340G.length > 0) {
                            c1279x = new C1279x(view3);
                            C1279x c1279x4 = (C1279x) c1280y2.f6214a.get(view3);
                            if (c1279x4 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo6340G.length) {
                                    Map map = c1279x.f6211a;
                                    String[] strArr = strArrMo6340G;
                                    String str = strArr[i4];
                                    map.put(str, c1279x4.f6211a.get(str));
                                    i4++;
                                    strArrMo6340G = strArr;
                                }
                            }
                            int size2 = c0921aM6387A.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    view2 = view3;
                                    animator2 = animatorMo6348n;
                                    break;
                                }
                                d dVar = (d) c0921aM6387A.get((Animator) c0921aM6387A.m3944f(i5));
                                if (dVar.f6186c != null && dVar.f6184a == view3) {
                                    view2 = view3;
                                    if (dVar.f6185b.equals(m6437w()) && dVar.f6186c.equals(c1279x)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i5++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = animatorMo6348n;
                            c1279x = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = c1279x2.f6212b;
                        animator = animatorMo6348n;
                        c1279x = null;
                    }
                    if (animator != null) {
                        c0921aM6387A.put(animator, new d(view, m6437w(), this, viewGroup.getWindowId(), c1279x, animator));
                        this.f6154H.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                d dVar2 = (d) c0921aM6387A.get((Animator) this.f6154H.get(sparseIntArray.keyAt(i6)));
                dVar2.f6189f.setStartDelay((((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE) + dVar2.f6189f.getStartDelay());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    protected void m6431p() {
        int i3 = this.f6149C - 1;
        this.f6149C = i3;
        if (i3 == 0) {
            m6407R(h.f6191b, false);
            for (int i4 = 0; i4 < this.f6173s.f6216c.m3935k(); i4++) {
                View view = (View) this.f6173s.f6216c.m3936l(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < this.f6174t.f6216c.m3935k(); i5++) {
                View view2 = (View) this.f6174t.f6216c.m3936l(i5);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f6151E = true;
        }
    }

    /* JADX INFO: renamed from: q */
    public AbstractC1266k mo6432q(Class cls, boolean z2) {
        this.f6168n = m6399r(this.f6168n, cls, z2);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public long m6433s() {
        return this.f6160f;
    }

    /* JADX INFO: renamed from: t */
    public f m6434t() {
        return this.f6155I;
    }

    public String toString() {
        return mo6425g0("");
    }

    /* JADX INFO: renamed from: u */
    public TimeInterpolator m6435u() {
        return this.f6161g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f6178x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f6177w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (androidx.transition.C1279x) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.transition.C1279x m6436v(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.v r0 = r5.f6175u
            if (r0 == 0) goto L9
            androidx.transition.x r6 = r0.m6436v(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f6177w
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f6178x
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.x r4 = (androidx.transition.C1279x) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f6212b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f6178x
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f6177w
        L36:
            java.lang.Object r6 = r6.get(r3)
            androidx.transition.x r6 = (androidx.transition.C1279x) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC1266k.m6436v(android.view.View, boolean):androidx.transition.x");
    }

    /* JADX INFO: renamed from: w */
    public String m6437w() {
        return this.f6158d;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC1262g m6438x() {
        return this.f6157K;
    }

    /* JADX INFO: renamed from: y */
    public AbstractC1276u m6439y() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final AbstractC1266k m6440z() {
        C1277v c1277v = this.f6175u;
        return c1277v != null ? c1277v.m6440z() : this;
    }
}
