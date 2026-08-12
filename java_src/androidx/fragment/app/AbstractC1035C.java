package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p012E.C0108e;
import p027J.AbstractC0268W;
import p027J.ViewTreeObserverOnPreDrawListenerC0241I;

/* JADX INFO: renamed from: androidx.fragment.app.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1035C {

    /* JADX INFO: renamed from: androidx.fragment.app.C$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f4941d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ArrayList f4942e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ ArrayList f4943f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ArrayList f4944g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ ArrayList f4945h;

        a(int i3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4941d = i3;
            this.f4942e = arrayList;
            this.f4943f = arrayList2;
            this.f4944g = arrayList3;
            this.f4945h = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i3 = 0; i3 < this.f4941d; i3++) {
                AbstractC0268W.m803w0((View) this.f4942e.get(i3), (String) this.f4943f.get(i3));
                AbstractC0268W.m803w0((View) this.f4944g.get(i3), (String) this.f4945h.get(i3));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    protected static void m4677d(List list, View view) {
        int size = list.size();
        if (m4678g(list, view, size)) {
            return;
        }
        if (AbstractC0268W.m737F(view) != null) {
            list.add(view);
        }
        for (int i3 = size; i3 < list.size(); i3++) {
            View view2 = (View) list.get(i3);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    if (!m4678g(list, childAt, size) && AbstractC0268W.m737F(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m4678g(List list, View view, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (list.get(i4) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    protected static boolean m4679i(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4653a(Object obj, View view);

    /* JADX INFO: renamed from: b */
    public abstract void mo4654b(Object obj, ArrayList arrayList);

    /* JADX INFO: renamed from: c */
    public abstract void mo4655c(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo4656e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract Object mo4657f(Object obj);

    /* JADX INFO: renamed from: h */
    protected void m4680h(View view, Rect rect) {
        if (AbstractC0268W.m745N(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo4658j(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: k */
    public abstract Object mo4659k(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: l */
    ArrayList m4681l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            arrayList2.add(AbstractC0268W.m737F(view));
            AbstractC0268W.m803w0(view, null);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo4660m(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: n */
    public abstract void mo4661n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    /* JADX INFO: renamed from: o */
    public abstract void mo4662o(Object obj, Rect rect);

    /* JADX INFO: renamed from: p */
    public abstract void mo4663p(Object obj, View view);

    /* JADX INFO: renamed from: q */
    public abstract void mo4664q(Fragment fragment, Object obj, C0108e c0108e, Runnable runnable);

    /* JADX INFO: renamed from: r */
    void m4682r(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) arrayList.get(i3);
            String strM737F = AbstractC0268W.m737F(view2);
            arrayList4.add(strM737F);
            if (strM737F != null) {
                AbstractC0268W.m803w0(view2, null);
                String str = (String) map.get(strM737F);
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i4))) {
                        AbstractC0268W.m803w0((View) arrayList2.get(i4), strM737F);
                        break;
                    }
                    i4++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0241I.m668a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo4665s(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: t */
    public abstract void mo4666t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* JADX INFO: renamed from: u */
    public abstract Object mo4667u(Object obj);
}
