package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p012E.C0108e;

/* JADX INFO: renamed from: androidx.fragment.app.B */
/* JADX INFO: loaded from: classes.dex */
class C1032B extends AbstractC1035C {

    /* JADX INFO: renamed from: androidx.fragment.app.B$a */
    class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Rect f4909a;

        a(Rect rect) {
            this.f4909a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f4909a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.B$b */
    class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f4911a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f4912b;

        b(View view, ArrayList arrayList) {
            this.f4911a = view;
            this.f4912b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            f.m4670b(transition, this);
            this.f4911a.setVisibility(8);
            int size = this.f4912b.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((View) this.f4912b.get(i3)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            f.m4670b(transition, this);
            f.m4669a(transition, this);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.B$c */
    class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f4914a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f4915b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f4916c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f4917d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f4918e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ ArrayList f4919f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4914a = obj;
            this.f4915b = arrayList;
            this.f4916c = obj2;
            this.f4917d = arrayList2;
            this.f4918e = obj3;
            this.f4919f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            f.m4670b(transition, this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f4914a;
            if (obj != null) {
                C1032B.this.m4668w(obj, this.f4915b, null);
            }
            Object obj2 = this.f4916c;
            if (obj2 != null) {
                C1032B.this.m4668w(obj2, this.f4917d, null);
            }
            Object obj3 = this.f4918e;
            if (obj3 != null) {
                C1032B.this.m4668w(obj3, this.f4919f, null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.B$d */
    class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f4921a;

        d(Runnable runnable) {
            this.f4921a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f4921a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.B$e */
    class e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Rect f4923a;

        e(Rect rect) {
            this.f4923a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4923a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4923a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.B$f */
    static class f {
        /* JADX INFO: renamed from: a */
        static void m4669a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        /* JADX INFO: renamed from: b */
        static void m4670b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    C1032B() {
    }

    /* JADX INFO: renamed from: v */
    private static boolean m4652v(Transition transition) {
        return (AbstractC1035C.m4679i(transition.getTargetIds()) && AbstractC1035C.m4679i(transition.getTargetNames()) && AbstractC1035C.m4679i(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: a */
    public void mo4653a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: b */
    public void mo4654b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i3 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i3 < transitionCount) {
                mo4654b(transitionSet.getTransitionAt(i3), arrayList);
                i3++;
            }
            return;
        }
        if (m4652v(transition) || !AbstractC1035C.m4679i(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i3 < size) {
            transition.addTarget((View) arrayList.get(i3));
            i3++;
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: c */
    public void mo4655c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: e */
    public boolean mo4656e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: f */
    public Object mo4657f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: j */
    public Object mo4658j(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: k */
    public Object mo4659k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: m */
    public void mo4660m(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: n */
    public void mo4661n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: o */
    public void mo4662o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: p */
    public void mo4663p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m4680h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: q */
    public void mo4664q(Fragment fragment, Object obj, C0108e c0108e, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: s */
    public void mo4665s(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1035C.m4677d(targets, (View) arrayList.get(i3));
        }
        targets.add(view);
        arrayList.add(view);
        mo4654b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: t */
    public void mo4666t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m4668w(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1035C
    /* JADX INFO: renamed from: u */
    public Object mo4667u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* JADX INFO: renamed from: w */
    public void m4668w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i3 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i3 < transitionCount) {
                m4668w(transitionSet.getTransitionAt(i3), arrayList, arrayList2);
                i3++;
            }
            return;
        }
        if (m4652v(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i3 < size) {
            transition.addTarget((View) arrayList2.get(i3));
            i3++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }
}
