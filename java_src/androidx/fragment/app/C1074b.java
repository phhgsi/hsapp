package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.C0921a;
import androidx.fragment.app.AbstractC1038F;
import androidx.fragment.app.AbstractC1081i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p012E.C0108e;
import p024I.AbstractC0211h;
import p027J.AbstractC0268W;
import p027J.AbstractC0276b0;
import p027J.ViewTreeObserverOnPreDrawListenerC0241I;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
class C1074b extends AbstractC1038F {

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5115a;

        static {
            int[] iArr = new int[AbstractC1038F.e.c.values().length];
            f5115a = iArr;
            try {
                iArr[AbstractC1038F.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5115a[AbstractC1038F.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5115a[AbstractC1038F.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5115a[AbstractC1038F.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f5116d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ AbstractC1038F.e f5117e;

        b(List list, AbstractC1038F.e eVar) {
            this.f5116d = list;
            this.f5117e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5116d.contains(this.f5117e)) {
                this.f5116d.remove(this.f5117e);
                C1074b.this.m4902s(this.f5117e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$c */
    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ViewGroup f5119a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f5120b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f5121c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC1038F.e f5122d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ k f5123e;

        c(ViewGroup viewGroup, View view, boolean z2, AbstractC1038F.e eVar, k kVar) {
            this.f5119a = viewGroup;
            this.f5120b = view;
            this.f5121c = z2;
            this.f5122d = eVar;
            this.f5123e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5119a.endViewTransition(this.f5120b);
            if (this.f5121c) {
                this.f5122d.m4713e().m4722a(this.f5120b);
            }
            this.f5123e.m4907a();
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f5122d + " has ended.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$d */
    class d implements C0108e.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Animator f5125a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC1038F.e f5126b;

        d(Animator animator, AbstractC1038F.e eVar) {
            this.f5125a = animator;
            this.f5126b = eVar;
        }

        @Override // p012E.C0108e.a
        /* JADX INFO: renamed from: a */
        public void mo330a() {
            this.f5125a.end();
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f5126b + " has been canceled.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$e */
    class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC1038F.e f5128a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewGroup f5129b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f5130c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ k f5131d;

        /* JADX INFO: renamed from: androidx.fragment.app.b$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f5129b.endViewTransition(eVar.f5130c);
                e.this.f5131d.m4907a();
            }
        }

        e(AbstractC1038F.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f5128a = eVar;
            this.f5129b = viewGroup;
            this.f5130c = view;
            this.f5131d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f5129b.post(new a());
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f5128a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f5128a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$f */
    class f implements C0108e.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f5134a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewGroup f5135b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ k f5136c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC1038F.e f5137d;

        f(View view, ViewGroup viewGroup, k kVar, AbstractC1038F.e eVar) {
            this.f5134a = view;
            this.f5135b = viewGroup;
            this.f5136c = kVar;
            this.f5137d = eVar;
        }

        @Override // p012E.C0108e.a
        /* JADX INFO: renamed from: a */
        public void mo330a() {
            this.f5134a.clearAnimation();
            this.f5135b.endViewTransition(this.f5134a);
            this.f5136c.m4907a();
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f5137d + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC1038F.e f5139d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ AbstractC1038F.e f5140e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f5141f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C0921a f5142g;

        g(AbstractC1038F.e eVar, AbstractC1038F.e eVar2, boolean z2, C0921a c0921a) {
            this.f5139d = eVar;
            this.f5140e = eVar2;
            this.f5141f = z2;
            this.f5142g = c0921a;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1031A.m4648a(this.f5139d.m4714f(), this.f5140e.m4714f(), this.f5141f, this.f5142g, false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC1035C f5144d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ View f5145e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Rect f5146f;

        h(AbstractC1035C abstractC1035C, View view, Rect rect) {
            this.f5144d = abstractC1035C;
            this.f5145e = view;
            this.f5146f = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5144d.m4680h(this.f5145e, this.f5146f);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f5148d;

        i(ArrayList arrayList) {
            this.f5148d = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1031A.m4651d(this.f5148d, 4);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ m f5150d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ AbstractC1038F.e f5151e;

        j(m mVar, AbstractC1038F.e eVar) {
            this.f5150d = mVar;
            this.f5151e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5150d.m4907a();
            if (FragmentManager.m4744H0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f5151e + "has completed");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$k */
    private static class k extends l {

        /* JADX INFO: renamed from: c */
        private boolean f5153c;

        /* JADX INFO: renamed from: d */
        private boolean f5154d;

        /* JADX INFO: renamed from: e */
        private AbstractC1081i.a f5155e;

        k(AbstractC1038F.e eVar, C0108e c0108e, boolean z2) {
            super(eVar, c0108e);
            this.f5154d = false;
            this.f5153c = z2;
        }

        /* JADX INFO: renamed from: e */
        AbstractC1081i.a m4906e(Context context) {
            if (this.f5154d) {
                return this.f5155e;
            }
            AbstractC1081i.a aVarM4941b = AbstractC1081i.m4941b(context, m4908b().m4714f(), m4908b().m4713e() == AbstractC1038F.e.c.VISIBLE, this.f5153c);
            this.f5155e = aVarM4941b;
            this.f5154d = true;
            return aVarM4941b;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$l */
    private static class l {

        /* JADX INFO: renamed from: a */
        private final AbstractC1038F.e f5156a;

        /* JADX INFO: renamed from: b */
        private final C0108e f5157b;

        l(AbstractC1038F.e eVar, C0108e c0108e) {
            this.f5156a = eVar;
            this.f5157b = c0108e;
        }

        /* JADX INFO: renamed from: a */
        void m4907a() {
            this.f5156a.m4712d(this.f5157b);
        }

        /* JADX INFO: renamed from: b */
        AbstractC1038F.e m4908b() {
            return this.f5156a;
        }

        /* JADX INFO: renamed from: c */
        C0108e m4909c() {
            return this.f5157b;
        }

        /* JADX INFO: renamed from: d */
        boolean m4910d() {
            AbstractC1038F.e.c cVarM4721c = AbstractC1038F.e.c.m4721c(this.f5156a.m4714f().mView);
            AbstractC1038F.e.c cVarM4713e = this.f5156a.m4713e();
            if (cVarM4721c == cVarM4713e) {
                return true;
            }
            AbstractC1038F.e.c cVar = AbstractC1038F.e.c.VISIBLE;
            return (cVarM4721c == cVar || cVarM4713e == cVar) ? false : true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$m */
    private static class m extends l {

        /* JADX INFO: renamed from: c */
        private final Object f5158c;

        /* JADX INFO: renamed from: d */
        private final boolean f5159d;

        /* JADX INFO: renamed from: e */
        private final Object f5160e;

        m(AbstractC1038F.e eVar, C0108e c0108e, boolean z2, boolean z3) {
            super(eVar, c0108e);
            if (eVar.m4713e() == AbstractC1038F.e.c.VISIBLE) {
                this.f5158c = z2 ? eVar.m4714f().getReenterTransition() : eVar.m4714f().getEnterTransition();
                this.f5159d = z2 ? eVar.m4714f().getAllowReturnTransitionOverlap() : eVar.m4714f().getAllowEnterTransitionOverlap();
            } else {
                this.f5158c = z2 ? eVar.m4714f().getReturnTransition() : eVar.m4714f().getExitTransition();
                this.f5159d = true;
            }
            if (!z3) {
                this.f5160e = null;
            } else if (z2) {
                this.f5160e = eVar.m4714f().getSharedElementReturnTransition();
            } else {
                this.f5160e = eVar.m4714f().getSharedElementEnterTransition();
            }
        }

        /* JADX INFO: renamed from: f */
        private AbstractC1035C m4911f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC1035C abstractC1035C = AbstractC1031A.f4907a;
            if (abstractC1035C != null && abstractC1035C.mo4656e(obj)) {
                return abstractC1035C;
            }
            AbstractC1035C abstractC1035C2 = AbstractC1031A.f4908b;
            if (abstractC1035C2 != null && abstractC1035C2.mo4656e(obj)) {
                return abstractC1035C2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m4908b().m4714f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* JADX INFO: renamed from: e */
        AbstractC1035C m4912e() {
            AbstractC1035C abstractC1035CM4911f = m4911f(this.f5158c);
            AbstractC1035C abstractC1035CM4911f2 = m4911f(this.f5160e);
            if (abstractC1035CM4911f == null || abstractC1035CM4911f2 == null || abstractC1035CM4911f == abstractC1035CM4911f2) {
                return abstractC1035CM4911f != null ? abstractC1035CM4911f : abstractC1035CM4911f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m4908b().m4714f() + " returned Transition " + this.f5158c + " which uses a different Transition  type than its shared element transition " + this.f5160e);
        }

        /* JADX INFO: renamed from: g */
        public Object m4913g() {
            return this.f5160e;
        }

        /* JADX INFO: renamed from: h */
        Object m4914h() {
            return this.f5158c;
        }

        /* JADX INFO: renamed from: i */
        public boolean m4915i() {
            return this.f5160e != null;
        }

        /* JADX INFO: renamed from: j */
        boolean m4916j() {
            return this.f5159d;
        }
    }

    C1074b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX INFO: renamed from: w */
    private void m4899w(List list, List list2, boolean z2, Map map) {
        AbstractC1038F.e eVar;
        k kVar;
        View view;
        ViewGroup viewGroupM4705m = m4705m();
        Context context = viewGroupM4705m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i3 = 0;
        boolean z3 = false;
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            if (kVar2.m4910d()) {
                kVar2.m4907a();
            } else {
                AbstractC1081i.a aVarM4906e = kVar2.m4906e(context);
                if (aVarM4906e == null) {
                    kVar2.m4907a();
                } else {
                    Animator animator = aVarM4906e.f5178b;
                    if (animator == null) {
                        arrayList.add(kVar2);
                    } else {
                        AbstractC1038F.e eVarM4908b = kVar2.m4908b();
                        Fragment fragmentM4714f = eVarM4908b.m4714f();
                        if (Boolean.TRUE.equals(map.get(eVarM4908b))) {
                            if (FragmentManager.m4744H0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragmentM4714f + " as this Fragment was involved in a Transition.");
                            }
                            kVar2.m4907a();
                        } else {
                            boolean z4 = eVarM4908b.m4713e() == AbstractC1038F.e.c.GONE;
                            if (z4) {
                                list2.remove(eVarM4908b);
                            }
                            View view2 = fragmentM4714f.mView;
                            viewGroupM4705m.startViewTransition(view2);
                            ViewGroup viewGroup = viewGroupM4705m;
                            viewGroupM4705m = viewGroup;
                            animator.addListener(new c(viewGroup, view2, z4, eVarM4908b, kVar2));
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.m4744H0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + eVarM4908b + " has started.");
                            }
                            kVar2.m4909c().m329b(new d(animator, eVarM4908b));
                            z3 = true;
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            k kVar3 = (k) obj;
            AbstractC1038F.e eVarM4908b2 = kVar3.m4908b();
            Fragment fragmentM4714f2 = eVarM4908b2.m4714f();
            if (z2) {
                if (FragmentManager.m4744H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM4714f2 + " as Animations cannot run alongside Transitions.");
                }
                kVar3.m4907a();
            } else if (z3) {
                if (FragmentManager.m4744H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM4714f2 + " as Animations cannot run alongside Animators.");
                }
                kVar3.m4907a();
            } else {
                View view3 = fragmentM4714f2.mView;
                Animation animation = (Animation) AbstractC0211h.m610g(((AbstractC1081i.a) AbstractC0211h.m610g(kVar3.m4906e(context))).f5177a);
                if (eVarM4908b2.m4713e() != AbstractC1038F.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar3.m4907a();
                    eVar = eVarM4908b2;
                    kVar = kVar3;
                    view = view3;
                } else {
                    viewGroupM4705m.startViewTransition(view3);
                    AbstractC1081i.b bVar = new AbstractC1081i.b(animation, viewGroupM4705m, view3);
                    eVar = eVarM4908b2;
                    kVar = kVar3;
                    view = view3;
                    bVar.setAnimationListener(new e(eVar, viewGroupM4705m, view, kVar));
                    view.startAnimation(bVar);
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + eVar + " has started.");
                    }
                }
                kVar.m4909c().m329b(new f(view, viewGroupM4705m, kVar, eVar));
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private Map m4900x(List list, List list2, boolean z2, AbstractC1038F.e eVar, AbstractC1038F.e eVar2) {
        String str;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj;
        Rect rect;
        String str3;
        View view;
        View view2;
        Object objMo4659k;
        Object objMo4659k2;
        AbstractC1038F.e eVar3;
        View view3;
        Rect rect2;
        ArrayList arrayList5;
        C0921a c0921a;
        View view4;
        ArrayList arrayList6;
        int i3;
        View view5;
        boolean z3 = z2;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        AbstractC1035C abstractC1035C = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.m4910d()) {
                AbstractC1035C abstractC1035CM4912e = mVar.m4912e();
                if (abstractC1035C == null) {
                    abstractC1035C = abstractC1035CM4912e;
                } else if (abstractC1035CM4912e != null && abstractC1035C != abstractC1035CM4912e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m4908b().m4714f() + " returned Transition " + mVar.m4914h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC1035C == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                map.put(mVar2.m4908b(), Boolean.FALSE);
                mVar2.m4907a();
            }
        } else {
            View view6 = new View(m4705m().getContext());
            Rect rect3 = new Rect();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            C0921a c0921a2 = new C0921a();
            Iterator it3 = list.iterator();
            Object obj2 = null;
            View view7 = null;
            boolean z4 = false;
            while (true) {
                str = "FragmentManager";
                if (!it3.hasNext()) {
                    break;
                }
                m mVar3 = (m) it3.next();
                if (!mVar3.m4915i() || eVar == null || eVar2 == null) {
                    view3 = view6;
                    rect2 = rect3;
                    arrayList5 = arrayList7;
                    c0921a = c0921a2;
                    view4 = view7;
                    arrayList6 = arrayList8;
                } else {
                    Object objMo4667u = abstractC1035C.mo4667u(abstractC1035C.mo4657f(mVar3.m4913g()));
                    ArrayList<String> sharedElementSourceNames = eVar2.m4714f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementSourceNames2 = eVar.m4714f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementTargetNames = eVar.m4714f().getSharedElementTargetNames();
                    int i4 = 0;
                    while (i4 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                        ArrayList<String> arrayList9 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i4));
                        }
                        i4++;
                        sharedElementTargetNames = arrayList9;
                    }
                    ArrayList<String> sharedElementTargetNames2 = eVar2.m4714f().getSharedElementTargetNames();
                    if (z3) {
                        eVar.m4714f().getEnterTransitionCallback();
                        eVar2.m4714f().getExitTransitionCallback();
                    } else {
                        eVar.m4714f().getExitTransitionCallback();
                        eVar2.m4714f().getEnterTransitionCallback();
                    }
                    int i5 = 0;
                    for (int size = sharedElementSourceNames.size(); i5 < size; size = size) {
                        c0921a2.put(sharedElementSourceNames.get(i5), sharedElementTargetNames2.get(i5));
                        i5++;
                    }
                    if (FragmentManager.m4744H0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        int i6 = 0;
                        for (int size2 = sharedElementTargetNames2.size(); i6 < size2; size2 = size2) {
                            String str4 = sharedElementTargetNames2.get(i6);
                            Log.v("FragmentManager", "Name: " + str4);
                            i6++;
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        int i7 = 0;
                        for (int size3 = sharedElementSourceNames.size(); i7 < size3; size3 = size3) {
                            String str5 = sharedElementSourceNames.get(i7);
                            Log.v("FragmentManager", "Name: " + str5);
                            i7++;
                        }
                    }
                    C0921a c0921a3 = new C0921a();
                    m4904u(c0921a3, eVar.m4714f().mView);
                    c0921a3.m3906n(sharedElementSourceNames);
                    c0921a2.m3906n(c0921a3.keySet());
                    C0921a c0921a4 = new C0921a();
                    m4904u(c0921a4, eVar2.m4714f().mView);
                    c0921a4.m3906n(sharedElementTargetNames2);
                    c0921a4.m3906n(c0921a2.values());
                    AbstractC1031A.m4650c(c0921a2, c0921a4);
                    m4905v(c0921a3, c0921a2.keySet());
                    m4905v(c0921a4, c0921a2.values());
                    if (c0921a2.isEmpty()) {
                        arrayList7.clear();
                        arrayList8.clear();
                        view3 = view6;
                        rect2 = rect3;
                        arrayList5 = arrayList7;
                        c0921a = c0921a2;
                        arrayList6 = arrayList8;
                        obj2 = null;
                        z3 = z2;
                        arrayList7 = arrayList5;
                        arrayList8 = arrayList6;
                        c0921a2 = c0921a;
                        rect3 = rect2;
                        view6 = view3;
                    } else {
                        c0921a = c0921a2;
                        AbstractC1031A.m4648a(eVar2.m4714f(), eVar.m4714f(), z3, c0921a3, true);
                        view4 = view7;
                        ViewTreeObserverOnPreDrawListenerC0241I.m668a(m4705m(), new g(eVar2, eVar, z3, c0921a4));
                        arrayList7.addAll(c0921a3.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            View view8 = (View) c0921a3.get((String) sharedElementSourceNames.get(0));
                            abstractC1035C.mo4663p(objMo4667u, view8);
                            view4 = view8;
                        }
                        arrayList8.addAll(c0921a4.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view5 = (View) c0921a4.get((String) sharedElementTargetNames2.get(i3))) != null) {
                            ViewTreeObserverOnPreDrawListenerC0241I.m668a(m4705m(), new h(abstractC1035C, view5, rect3));
                            z4 = true;
                        }
                        abstractC1035C.mo4665s(objMo4667u, view6, arrayList7);
                        rect2 = rect3;
                        ArrayList arrayList10 = arrayList7;
                        view3 = view6;
                        abstractC1035C.mo4661n(objMo4667u, null, null, null, null, objMo4667u, arrayList8);
                        arrayList6 = arrayList8;
                        Boolean bool = Boolean.TRUE;
                        map.put(eVar, bool);
                        map.put(eVar2, bool);
                        arrayList5 = arrayList10;
                        obj2 = objMo4667u;
                    }
                }
                view7 = view4;
                z3 = z2;
                arrayList7 = arrayList5;
                arrayList8 = arrayList6;
                c0921a2 = c0921a;
                rect3 = rect2;
                view6 = view3;
            }
            AbstractC1038F.e eVar4 = eVar;
            AbstractC1038F.e eVar5 = eVar2;
            View view9 = view6;
            ArrayList arrayList11 = arrayList7;
            C0921a c0921a5 = c0921a2;
            View view10 = view7;
            Rect rect4 = rect3;
            ArrayList arrayList12 = arrayList8;
            ArrayList arrayList13 = new ArrayList();
            Iterator it4 = list.iterator();
            Object obj3 = null;
            Object obj4 = null;
            while (it4.hasNext()) {
                m mVar4 = (m) it4.next();
                if (mVar4.m4910d()) {
                    map.put(mVar4.m4908b(), Boolean.FALSE);
                    mVar4.m4907a();
                } else {
                    Object objMo4657f = abstractC1035C.mo4657f(mVar4.m4914h());
                    AbstractC1038F.e eVarM4908b = mVar4.m4908b();
                    boolean z5 = obj2 != null && (eVarM4908b == eVar4 || eVarM4908b == eVar5);
                    if (objMo4657f == null) {
                        if (!z5) {
                            map.put(eVarM4908b, Boolean.FALSE);
                            mVar4.m4907a();
                        }
                        str3 = str;
                        view = view9;
                        arrayList4 = arrayList11;
                        arrayList2 = arrayList12;
                        rect = rect4;
                        arrayList3 = arrayList13;
                        view2 = view10;
                    } else {
                        Rect rect5 = rect4;
                        ArrayList arrayList14 = new ArrayList();
                        ArrayList arrayList15 = arrayList13;
                        m4903t(arrayList14, eVarM4908b.m4714f().mView);
                        if (z5) {
                            if (eVarM4908b == eVar4) {
                                arrayList14.removeAll(arrayList11);
                            } else {
                                arrayList14.removeAll(arrayList12);
                            }
                        }
                        if (arrayList14.isEmpty()) {
                            abstractC1035C.mo4653a(objMo4657f, view9);
                            str3 = str;
                            view = view9;
                            arrayList2 = arrayList12;
                            objMo4659k2 = obj3;
                            objMo4659k = obj4;
                            eVar3 = eVarM4908b;
                            view2 = view10;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList11;
                            obj = objMo4657f;
                            rect = rect5;
                        } else {
                            abstractC1035C.mo4654b(objMo4657f, arrayList14);
                            arrayList2 = arrayList12;
                            String str6 = str;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList11;
                            obj = objMo4657f;
                            rect = rect5;
                            str3 = str6;
                            view = view9;
                            view2 = view10;
                            objMo4659k = obj4;
                            objMo4659k2 = obj3;
                            abstractC1035C.mo4661n(obj, objMo4657f, arrayList14, null, null, null, null);
                            if (eVarM4908b.m4713e() == AbstractC1038F.e.c.GONE) {
                                eVar3 = eVarM4908b;
                                list2.remove(eVar3);
                                ArrayList arrayList16 = new ArrayList(arrayList14);
                                arrayList16.remove(eVar3.m4714f().mView);
                                abstractC1035C.mo4660m(obj, eVar3.m4714f().mView, arrayList16);
                                ViewTreeObserverOnPreDrawListenerC0241I.m668a(m4705m(), new i(arrayList14));
                            } else {
                                eVar3 = eVarM4908b;
                            }
                        }
                        if (eVar3.m4713e() == AbstractC1038F.e.c.VISIBLE) {
                            arrayList3.addAll(arrayList14);
                            if (z4) {
                                abstractC1035C.mo4662o(obj, rect);
                            }
                        } else {
                            abstractC1035C.mo4663p(obj, view2);
                        }
                        map.put(eVar3, Boolean.TRUE);
                        if (mVar4.m4916j()) {
                            objMo4659k2 = abstractC1035C.mo4659k(objMo4659k2, obj, null);
                        } else {
                            objMo4659k = abstractC1035C.mo4659k(objMo4659k, obj, null);
                        }
                        obj3 = objMo4659k2;
                        obj4 = objMo4659k;
                    }
                    arrayList11 = arrayList4;
                    eVar4 = eVar;
                    eVar5 = eVar2;
                    rect4 = rect;
                    arrayList13 = arrayList3;
                    view10 = view2;
                    view9 = view;
                    str = str3;
                    arrayList12 = arrayList2;
                }
            }
            String str7 = str;
            ArrayList arrayList17 = arrayList11;
            ArrayList arrayList18 = arrayList12;
            ArrayList arrayList19 = arrayList13;
            Object objMo4658j = abstractC1035C.mo4658j(obj3, obj4, obj2);
            if (objMo4658j != null) {
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    m mVar5 = (m) it5.next();
                    if (!mVar5.m4910d()) {
                        Object objM4914h = mVar5.m4914h();
                        AbstractC1038F.e eVarM4908b2 = mVar5.m4908b();
                        boolean z6 = obj2 != null && (eVarM4908b2 == eVar || eVarM4908b2 == eVar2);
                        if (objM4914h == null && !z6) {
                            str2 = str7;
                        } else if (AbstractC0268W.m746O(m4705m())) {
                            str2 = str7;
                            abstractC1035C.mo4664q(mVar5.m4908b().m4714f(), objMo4658j, mVar5.m4909c(), new j(mVar5, eVarM4908b2));
                        } else {
                            if (FragmentManager.m4744H0(2)) {
                                str2 = str7;
                                Log.v(str2, "SpecialEffectsController: Container " + m4705m() + " has not been laid out. Completing operation " + eVarM4908b2);
                            } else {
                                str2 = str7;
                            }
                            mVar5.m4907a();
                        }
                        str7 = str2;
                    }
                }
                String str8 = str7;
                if (AbstractC0268W.m746O(m4705m())) {
                    AbstractC1031A.m4651d(arrayList19, 4);
                    ArrayList arrayListM4681l = abstractC1035C.m4681l(arrayList18);
                    if (FragmentManager.m4744H0(2)) {
                        Log.v(str8, ">>>>> Beginning transition <<<<<");
                        Log.v(str8, ">>>>> SharedElementFirstOutViews <<<<<");
                        int size4 = arrayList17.size();
                        int i8 = 0;
                        while (i8 < size4) {
                            Object obj5 = arrayList17.get(i8);
                            i8++;
                            View view11 = (View) obj5;
                            Log.v(str8, "View: " + view11 + " Name: " + AbstractC0268W.m737F(view11));
                        }
                        arrayList = arrayList17;
                        Log.v(str8, ">>>>> SharedElementLastInViews <<<<<");
                        int size5 = arrayList18.size();
                        int i9 = 0;
                        while (i9 < size5) {
                            Object obj6 = arrayList18.get(i9);
                            i9++;
                            View view12 = (View) obj6;
                            Log.v(str8, "View: " + view12 + " Name: " + AbstractC0268W.m737F(view12));
                        }
                    } else {
                        arrayList = arrayList17;
                    }
                    abstractC1035C.mo4655c(m4705m(), objMo4658j);
                    ArrayList arrayList20 = arrayList;
                    abstractC1035C.m4682r(m4705m(), arrayList20, arrayList18, arrayListM4681l, c0921a5);
                    AbstractC1031A.m4651d(arrayList19, 0);
                    abstractC1035C.mo4666t(obj2, arrayList20, arrayList18);
                    return map;
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: y */
    private void m4901y(List list) {
        Fragment fragmentM4714f = ((AbstractC1038F.e) list.get(list.size() - 1)).m4714f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1038F.e eVar = (AbstractC1038F.e) it.next();
            eVar.m4714f().mAnimationInfo.f5003c = fragmentM4714f.mAnimationInfo.f5003c;
            eVar.m4714f().mAnimationInfo.f5004d = fragmentM4714f.mAnimationInfo.f5004d;
            eVar.m4714f().mAnimationInfo.f5005e = fragmentM4714f.mAnimationInfo.f5005e;
            eVar.m4714f().mAnimationInfo.f5006f = fragmentM4714f.mAnimationInfo.f5006f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    @Override // androidx.fragment.app.AbstractC1038F
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mo4700f(java.util.List r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1074b.mo4700f(java.util.List, boolean):void");
    }

    /* JADX INFO: renamed from: s */
    void m4902s(AbstractC1038F.e eVar) {
        eVar.m4713e().m4722a(eVar.m4714f().mView);
    }

    /* JADX INFO: renamed from: t */
    void m4903t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC0276b0.m922c(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                m4903t(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    void m4904u(Map map, View view) {
        String strM737F = AbstractC0268W.m737F(view);
        if (strM737F != null) {
            map.put(strM737F, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    m4904u(map, childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    void m4905v(C0921a c0921a, Collection collection) {
        Iterator it = c0921a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(AbstractC0268W.m737F((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
