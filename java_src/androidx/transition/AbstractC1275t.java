package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C0921a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.transition.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1275t {

    /* JADX INFO: renamed from: a */
    private static AbstractC1266k f6195a = new C1256a();

    /* JADX INFO: renamed from: b */
    private static ThreadLocal f6196b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    static ArrayList f6197c = new ArrayList();

    /* JADX INFO: renamed from: androidx.transition.t$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        AbstractC1266k f6198a;

        /* JADX INFO: renamed from: b */
        ViewGroup f6199b;

        /* JADX INFO: renamed from: androidx.transition.t$a$a, reason: collision with other inner class name */
        class C2618a extends AbstractC1274s {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0921a f6200a;

            C2618a(C0921a c0921a) {
                this.f6200a = c0921a;
            }

            @Override // androidx.transition.AbstractC1266k.g
            /* JADX INFO: renamed from: g */
            public void mo6358g(AbstractC1266k abstractC1266k) {
                ((ArrayList) this.f6200a.get(a.this.f6199b)).remove(abstractC1266k);
                abstractC1266k.mo6410U(this);
            }
        }

        a(AbstractC1266k abstractC1266k, ViewGroup viewGroup) {
            this.f6198a = abstractC1266k;
            this.f6199b = viewGroup;
        }

        /* JADX INFO: renamed from: a */
        private void m6453a() {
            this.f6199b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6199b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m6453a();
            if (!AbstractC1275t.f6197c.remove(this.f6199b)) {
                return true;
            }
            C0921a c0921aM6450b = AbstractC1275t.m6450b();
            ArrayList arrayList = (ArrayList) c0921aM6450b.get(this.f6199b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c0921aM6450b.put(this.f6199b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f6198a);
            this.f6198a.mo6415a(new C2618a(c0921aM6450b));
            int i3 = 0;
            this.f6198a.m6427k(this.f6199b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    ((AbstractC1266k) obj).mo6412W(this.f6199b);
                }
            }
            this.f6198a.m6409T(this.f6199b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m6453a();
            AbstractC1275t.f6197c.remove(this.f6199b);
            ArrayList arrayList = (ArrayList) AbstractC1275t.m6450b().get(this.f6199b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((AbstractC1266k) obj).mo6412W(this.f6199b);
                }
            }
            this.f6198a.m6428l(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6449a(ViewGroup viewGroup, AbstractC1266k abstractC1266k) {
        if (f6197c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f6197c.add(viewGroup);
        if (abstractC1266k == null) {
            abstractC1266k = f6195a;
        }
        AbstractC1266k abstractC1266kClone = abstractC1266k.clone();
        m6452d(viewGroup, abstractC1266kClone);
        AbstractC1265j.m6386b(viewGroup, null);
        m6451c(viewGroup, abstractC1266kClone);
    }

    /* JADX INFO: renamed from: b */
    static C0921a m6450b() {
        C0921a c0921a;
        WeakReference weakReference = (WeakReference) f6196b.get();
        if (weakReference != null && (c0921a = (C0921a) weakReference.get()) != null) {
            return c0921a;
        }
        C0921a c0921a2 = new C0921a();
        f6196b.set(new WeakReference(c0921a2));
        return c0921a2;
    }

    /* JADX INFO: renamed from: c */
    private static void m6451c(ViewGroup viewGroup, AbstractC1266k abstractC1266k) {
        if (abstractC1266k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC1266k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* JADX INFO: renamed from: d */
    private static void m6452d(ViewGroup viewGroup, AbstractC1266k abstractC1266k) {
        ArrayList arrayList = (ArrayList) m6450b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((AbstractC1266k) obj).mo6408S(viewGroup);
            }
        }
        if (abstractC1266k != null) {
            abstractC1266k.m6427k(viewGroup, true);
        }
        AbstractC1265j.m6385a(viewGroup);
    }
}
