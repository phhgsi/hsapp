package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p027J.AbstractC0268W;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c */
/* JADX INFO: loaded from: classes.dex */
public class C1224c extends AbstractC1234m {

    /* JADX INFO: renamed from: s */
    private static TimeInterpolator f5891s;

    /* JADX INFO: renamed from: h */
    private ArrayList f5892h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private ArrayList f5893i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private ArrayList f5894j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private ArrayList f5895k = new ArrayList();

    /* JADX INFO: renamed from: l */
    ArrayList f5896l = new ArrayList();

    /* JADX INFO: renamed from: m */
    ArrayList f5897m = new ArrayList();

    /* JADX INFO: renamed from: n */
    ArrayList f5898n = new ArrayList();

    /* JADX INFO: renamed from: o */
    ArrayList f5899o = new ArrayList();

    /* JADX INFO: renamed from: p */
    ArrayList f5900p = new ArrayList();

    /* JADX INFO: renamed from: q */
    ArrayList f5901q = new ArrayList();

    /* JADX INFO: renamed from: r */
    ArrayList f5902r = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f5903d;

        a(ArrayList arrayList) {
            this.f5903d = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f5903d;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                j jVar = (j) obj;
                C1224c.this.m6139S(jVar.f5937a, jVar.f5938b, jVar.f5939c, jVar.f5940d, jVar.f5941e);
            }
            this.f5903d.clear();
            C1224c.this.f5897m.remove(this.f5903d);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f5905d;

        b(ArrayList arrayList) {
            this.f5905d = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f5905d;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                C1224c.this.m6138R((i) obj);
            }
            this.f5905d.clear();
            C1224c.this.f5898n.remove(this.f5905d);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f5907d;

        c(ArrayList arrayList) {
            this.f5907d = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f5907d;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                C1224c.this.m6137Q((RecyclerView.AbstractC1188C) obj);
            }
            this.f5907d.clear();
            C1224c.this.f5896l.remove(this.f5907d);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$d */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1188C f5909a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f5910b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f5911c;

        d(RecyclerView.AbstractC1188C abstractC1188C, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5909a = abstractC1188C;
            this.f5910b = viewPropertyAnimator;
            this.f5911c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5910b.setListener(null);
            this.f5911c.setAlpha(1.0f);
            C1224c.this.m6244G(this.f5909a);
            C1224c.this.f5901q.remove(this.f5909a);
            C1224c.this.m6141V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1224c.this.m6245H(this.f5909a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$e */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1188C f5913a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f5914b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f5915c;

        e(RecyclerView.AbstractC1188C abstractC1188C, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5913a = abstractC1188C;
            this.f5914b = view;
            this.f5915c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5914b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5915c.setListener(null);
            C1224c.this.m6238A(this.f5913a);
            C1224c.this.f5899o.remove(this.f5913a);
            C1224c.this.m6141V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1224c.this.m6239B(this.f5913a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$f */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1188C f5917a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f5918b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f5919c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f5920d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f5921e;

        f(RecyclerView.AbstractC1188C abstractC1188C, int i3, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5917a = abstractC1188C;
            this.f5918b = i3;
            this.f5919c = view;
            this.f5920d = i4;
            this.f5921e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f5918b != 0) {
                this.f5919c.setTranslationX(0.0f);
            }
            if (this.f5920d != 0) {
                this.f5919c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5921e.setListener(null);
            C1224c.this.m6242E(this.f5917a);
            C1224c.this.f5900p.remove(this.f5917a);
            C1224c.this.m6141V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1224c.this.m6243F(this.f5917a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$g */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i f5923a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f5924b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f5925c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5923a = iVar;
            this.f5924b = viewPropertyAnimator;
            this.f5925c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5924b.setListener(null);
            this.f5925c.setAlpha(1.0f);
            this.f5925c.setTranslationX(0.0f);
            this.f5925c.setTranslationY(0.0f);
            C1224c.this.m6240C(this.f5923a.f5931a, true);
            C1224c.this.f5902r.remove(this.f5923a.f5931a);
            C1224c.this.m6141V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1224c.this.m6241D(this.f5923a.f5931a, true);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$h */
    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i f5927a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f5928b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f5929c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5927a = iVar;
            this.f5928b = viewPropertyAnimator;
            this.f5929c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5928b.setListener(null);
            this.f5929c.setAlpha(1.0f);
            this.f5929c.setTranslationX(0.0f);
            this.f5929c.setTranslationY(0.0f);
            C1224c.this.m6240C(this.f5927a.f5932b, false);
            C1224c.this.f5902r.remove(this.f5927a.f5932b);
            C1224c.this.m6141V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1224c.this.m6241D(this.f5927a.f5932b, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$j */
    private static class j {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC1188C f5937a;

        /* JADX INFO: renamed from: b */
        public int f5938b;

        /* JADX INFO: renamed from: c */
        public int f5939c;

        /* JADX INFO: renamed from: d */
        public int f5940d;

        /* JADX INFO: renamed from: e */
        public int f5941e;

        j(RecyclerView.AbstractC1188C abstractC1188C, int i3, int i4, int i5, int i6) {
            this.f5937a = abstractC1188C;
            this.f5938b = i3;
            this.f5939c = i4;
            this.f5940d = i5;
            this.f5941e = i6;
        }
    }

    /* JADX INFO: renamed from: T */
    private void m6132T(RecyclerView.AbstractC1188C abstractC1188C) {
        View view = abstractC1188C.f5699a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f5901q.add(abstractC1188C);
        viewPropertyAnimatorAnimate.setDuration(m5756o()).alpha(0.0f).setListener(new d(abstractC1188C, viewPropertyAnimatorAnimate, view)).start();
    }

    /* JADX INFO: renamed from: W */
    private void m6133W(List list, RecyclerView.AbstractC1188C abstractC1188C) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (m6135Y(iVar, abstractC1188C) && iVar.f5931a == null && iVar.f5932b == null) {
                list.remove(iVar);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    private void m6134X(i iVar) {
        RecyclerView.AbstractC1188C abstractC1188C = iVar.f5931a;
        if (abstractC1188C != null) {
            m6135Y(iVar, abstractC1188C);
        }
        RecyclerView.AbstractC1188C abstractC1188C2 = iVar.f5932b;
        if (abstractC1188C2 != null) {
            m6135Y(iVar, abstractC1188C2);
        }
    }

    /* JADX INFO: renamed from: Y */
    private boolean m6135Y(i iVar, RecyclerView.AbstractC1188C abstractC1188C) {
        boolean z2 = false;
        if (iVar.f5932b == abstractC1188C) {
            iVar.f5932b = null;
        } else {
            if (iVar.f5931a != abstractC1188C) {
                return false;
            }
            iVar.f5931a = null;
            z2 = true;
        }
        abstractC1188C.f5699a.setAlpha(1.0f);
        abstractC1188C.f5699a.setTranslationX(0.0f);
        abstractC1188C.f5699a.setTranslationY(0.0f);
        m6240C(abstractC1188C, z2);
        return true;
    }

    /* JADX INFO: renamed from: Z */
    private void m6136Z(RecyclerView.AbstractC1188C abstractC1188C) {
        if (f5891s == null) {
            f5891s = new ValueAnimator().getInterpolator();
        }
        abstractC1188C.f5699a.animate().setInterpolator(f5891s);
        mo5751j(abstractC1188C);
    }

    /* JADX INFO: renamed from: Q */
    void m6137Q(RecyclerView.AbstractC1188C abstractC1188C) {
        View view = abstractC1188C.f5699a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f5899o.add(abstractC1188C);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m5753l()).setListener(new e(abstractC1188C, view, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: R */
    void m6138R(i iVar) {
        RecyclerView.AbstractC1188C abstractC1188C = iVar.f5931a;
        View view = abstractC1188C == null ? null : abstractC1188C.f5699a;
        RecyclerView.AbstractC1188C abstractC1188C2 = iVar.f5932b;
        View view2 = abstractC1188C2 != null ? abstractC1188C2.f5699a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m5754m());
            this.f5902r.add(iVar.f5931a);
            duration.translationX(iVar.f5935e - iVar.f5933c);
            duration.translationY(iVar.f5936f - iVar.f5934d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f5902r.add(iVar.f5932b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m5754m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    /* JADX INFO: renamed from: S */
    void m6139S(RecyclerView.AbstractC1188C abstractC1188C, int i3, int i4, int i5, int i6) {
        View view = abstractC1188C.f5699a;
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        if (i7 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i8 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f5900p.add(abstractC1188C);
        viewPropertyAnimatorAnimate.setDuration(m5755n()).setListener(new f(abstractC1188C, i7, view, i8, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: U */
    void m6140U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.AbstractC1188C) list.get(size)).f5699a.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: V */
    void m6141V() {
        if (mo5757p()) {
            return;
        }
        m5750i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: g */
    public boolean mo5748g(RecyclerView.AbstractC1188C abstractC1188C, List list) {
        return !list.isEmpty() || super.mo5748g(abstractC1188C, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: j */
    public void mo5751j(RecyclerView.AbstractC1188C abstractC1188C) {
        View view = abstractC1188C.f5699a;
        view.animate().cancel();
        int size = this.f5894j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f5894j.get(size)).f5937a == abstractC1188C) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m6242E(abstractC1188C);
                this.f5894j.remove(size);
            }
        }
        m6133W(this.f5895k, abstractC1188C);
        if (this.f5892h.remove(abstractC1188C)) {
            view.setAlpha(1.0f);
            m6244G(abstractC1188C);
        }
        if (this.f5893i.remove(abstractC1188C)) {
            view.setAlpha(1.0f);
            m6238A(abstractC1188C);
        }
        for (int size2 = this.f5898n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f5898n.get(size2);
            m6133W(arrayList, abstractC1188C);
            if (arrayList.isEmpty()) {
                this.f5898n.remove(size2);
            }
        }
        for (int size3 = this.f5897m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f5897m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f5937a == abstractC1188C) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m6242E(abstractC1188C);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5897m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f5896l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f5896l.get(size5);
            if (arrayList3.remove(abstractC1188C)) {
                view.setAlpha(1.0f);
                m6238A(abstractC1188C);
                if (arrayList3.isEmpty()) {
                    this.f5896l.remove(size5);
                }
            }
        }
        this.f5901q.remove(abstractC1188C);
        this.f5899o.remove(abstractC1188C);
        this.f5902r.remove(abstractC1188C);
        this.f5900p.remove(abstractC1188C);
        m6141V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: k */
    public void mo5752k() {
        int size = this.f5894j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f5894j.get(size);
            View view = jVar.f5937a.f5699a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m6242E(jVar.f5937a);
            this.f5894j.remove(size);
        }
        for (int size2 = this.f5892h.size() - 1; size2 >= 0; size2--) {
            m6244G((RecyclerView.AbstractC1188C) this.f5892h.get(size2));
            this.f5892h.remove(size2);
        }
        int size3 = this.f5893i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC1188C abstractC1188C = (RecyclerView.AbstractC1188C) this.f5893i.get(size3);
            abstractC1188C.f5699a.setAlpha(1.0f);
            m6238A(abstractC1188C);
            this.f5893i.remove(size3);
        }
        for (int size4 = this.f5895k.size() - 1; size4 >= 0; size4--) {
            m6134X((i) this.f5895k.get(size4));
        }
        this.f5895k.clear();
        if (mo5757p()) {
            for (int size5 = this.f5897m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f5897m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f5937a.f5699a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m6242E(jVar2.f5937a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5897m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f5896l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f5896l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC1188C abstractC1188C2 = (RecyclerView.AbstractC1188C) arrayList2.get(size8);
                    abstractC1188C2.f5699a.setAlpha(1.0f);
                    m6238A(abstractC1188C2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5896l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f5898n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f5898n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m6134X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5898n.remove(arrayList3);
                    }
                }
            }
            m6140U(this.f5901q);
            m6140U(this.f5900p);
            m6140U(this.f5899o);
            m6140U(this.f5902r);
            m5750i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: p */
    public boolean mo5757p() {
        return (this.f5893i.isEmpty() && this.f5895k.isEmpty() && this.f5894j.isEmpty() && this.f5892h.isEmpty() && this.f5900p.isEmpty() && this.f5901q.isEmpty() && this.f5899o.isEmpty() && this.f5902r.isEmpty() && this.f5897m.isEmpty() && this.f5896l.isEmpty() && this.f5898n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: u */
    public void mo5762u() {
        boolean zIsEmpty = this.f5892h.isEmpty();
        boolean zIsEmpty2 = this.f5894j.isEmpty();
        boolean zIsEmpty3 = this.f5895k.isEmpty();
        boolean zIsEmpty4 = this.f5893i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        ArrayList arrayList = this.f5892h;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            m6132T((RecyclerView.AbstractC1188C) obj);
        }
        this.f5892h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f5894j);
            this.f5897m.add(arrayList2);
            this.f5894j.clear();
            a aVar = new a(arrayList2);
            if (zIsEmpty) {
                aVar.run();
            } else {
                AbstractC0268W.m761b0(((j) arrayList2.get(0)).f5937a.f5699a, aVar, m5756o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f5895k);
            this.f5898n.add(arrayList3);
            this.f5895k.clear();
            b bVar = new b(arrayList3);
            if (zIsEmpty) {
                bVar.run();
            } else {
                AbstractC0268W.m761b0(((i) arrayList3.get(0)).f5931a.f5699a, bVar, m5756o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.f5893i);
        this.f5896l.add(arrayList4);
        this.f5893i.clear();
        c cVar = new c(arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            AbstractC0268W.m761b0(((RecyclerView.AbstractC1188C) arrayList4.get(0)).f5699a, cVar, (!zIsEmpty ? m5756o() : 0L) + Math.max(!zIsEmpty2 ? m5755n() : 0L, zIsEmpty3 ? 0L : m5754m()));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1234m
    /* JADX INFO: renamed from: w */
    public boolean mo6142w(RecyclerView.AbstractC1188C abstractC1188C) {
        m6136Z(abstractC1188C);
        abstractC1188C.f5699a.setAlpha(0.0f);
        this.f5893i.add(abstractC1188C);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1234m
    /* JADX INFO: renamed from: x */
    public boolean mo6143x(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1188C abstractC1188C2, int i3, int i4, int i5, int i6) {
        if (abstractC1188C == abstractC1188C2) {
            return mo6144y(abstractC1188C, i3, i4, i5, i6);
        }
        float translationX = abstractC1188C.f5699a.getTranslationX();
        float translationY = abstractC1188C.f5699a.getTranslationY();
        float alpha = abstractC1188C.f5699a.getAlpha();
        m6136Z(abstractC1188C);
        int i7 = (int) ((i5 - i3) - translationX);
        int i8 = (int) ((i6 - i4) - translationY);
        abstractC1188C.f5699a.setTranslationX(translationX);
        abstractC1188C.f5699a.setTranslationY(translationY);
        abstractC1188C.f5699a.setAlpha(alpha);
        if (abstractC1188C2 != null) {
            m6136Z(abstractC1188C2);
            abstractC1188C2.f5699a.setTranslationX(-i7);
            abstractC1188C2.f5699a.setTranslationY(-i8);
            abstractC1188C2.f5699a.setAlpha(0.0f);
        }
        this.f5895k.add(new i(abstractC1188C, abstractC1188C2, i3, i4, i5, i6));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1234m
    /* JADX INFO: renamed from: y */
    public boolean mo6144y(RecyclerView.AbstractC1188C abstractC1188C, int i3, int i4, int i5, int i6) {
        View view = abstractC1188C.f5699a;
        int translationX = i3 + ((int) view.getTranslationX());
        int translationY = i4 + ((int) abstractC1188C.f5699a.getTranslationY());
        m6136Z(abstractC1188C);
        int i7 = i5 - translationX;
        int i8 = i6 - translationY;
        if (i7 == 0 && i8 == 0) {
            m6242E(abstractC1188C);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.f5894j.add(new j(abstractC1188C, translationX, translationY, i5, i6));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1234m
    /* JADX INFO: renamed from: z */
    public boolean mo6145z(RecyclerView.AbstractC1188C abstractC1188C) {
        m6136Z(abstractC1188C);
        this.f5892h.add(abstractC1188C);
        return true;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$i */
    private static class i {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC1188C f5931a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC1188C f5932b;

        /* JADX INFO: renamed from: c */
        public int f5933c;

        /* JADX INFO: renamed from: d */
        public int f5934d;

        /* JADX INFO: renamed from: e */
        public int f5935e;

        /* JADX INFO: renamed from: f */
        public int f5936f;

        private i(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1188C abstractC1188C2) {
            this.f5931a = abstractC1188C;
            this.f5932b = abstractC1188C2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f5931a + ", newHolder=" + this.f5932b + ", fromX=" + this.f5933c + ", fromY=" + this.f5934d + ", toX=" + this.f5935e + ", toY=" + this.f5936f + '}';
        }

        i(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1188C abstractC1188C2, int i3, int i4, int i5, int i6) {
            this(abstractC1188C, abstractC1188C2);
            this.f5933c = i3;
            this.f5934d = i4;
            this.f5935e = i5;
            this.f5936f = i6;
        }
    }
}
