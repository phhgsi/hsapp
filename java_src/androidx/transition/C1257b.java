package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1266k;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.b */
/* JADX INFO: loaded from: classes.dex */
public class C1257b extends AbstractC1266k {

    /* JADX INFO: renamed from: Q */
    private static final String[] f6084Q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: R */
    private static final Property f6085R = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: S */
    private static final Property f6086S = new b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: T */
    private static final Property f6087T = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: U */
    private static final Property f6088U = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: V */
    private static final Property f6089V = new e(PointF.class, "position");

    /* JADX INFO: renamed from: W */
    private static final C1264i f6090W = new C1264i();

    /* JADX INFO: renamed from: P */
    private boolean f6091P = false;

    /* JADX INFO: renamed from: androidx.transition.b$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.m6374c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.m6373a(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC1242A.m6307d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$d */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC1242A.m6307d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$e */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            AbstractC1242A.m6307d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$f */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i f6092a;
        private final i mViewBounds;

        f(i iVar) {
            this.f6092a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC1266k.g {

        /* JADX INFO: renamed from: a */
        private final View f6094a;

        /* JADX INFO: renamed from: b */
        private final Rect f6095b;

        /* JADX INFO: renamed from: c */
        private final boolean f6096c;

        /* JADX INFO: renamed from: d */
        private final Rect f6097d;

        /* JADX INFO: renamed from: e */
        private final boolean f6098e;

        /* JADX INFO: renamed from: f */
        private final int f6099f;

        /* JADX INFO: renamed from: g */
        private final int f6100g;

        /* JADX INFO: renamed from: h */
        private final int f6101h;

        /* JADX INFO: renamed from: i */
        private final int f6102i;

        /* JADX INFO: renamed from: j */
        private final int f6103j;

        /* JADX INFO: renamed from: k */
        private final int f6104k;

        /* JADX INFO: renamed from: l */
        private final int f6105l;

        /* JADX INFO: renamed from: m */
        private final int f6106m;

        /* JADX INFO: renamed from: n */
        private boolean f6107n;

        g(View view, Rect rect, boolean z2, Rect rect2, boolean z3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f6094a = view;
            this.f6095b = rect;
            this.f6096c = z2;
            this.f6097d = rect2;
            this.f6098e = z3;
            this.f6099f = i3;
            this.f6100g = i4;
            this.f6101h = i5;
            this.f6102i = i6;
            this.f6103j = i7;
            this.f6104k = i8;
            this.f6105l = i9;
            this.f6106m = i10;
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: a */
        public void mo6352a(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: b */
        public void mo6353b(AbstractC1266k abstractC1266k) {
            this.f6107n = true;
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void mo6354c(AbstractC1266k abstractC1266k, boolean z2) {
            AbstractC1267l.m6445b(this, abstractC1266k, z2);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: d */
        public void mo6355d(AbstractC1266k abstractC1266k) {
            this.f6094a.setTag(AbstractC1263h.f6139b, this.f6094a.getClipBounds());
            this.f6094a.setClipBounds(this.f6098e ? null : this.f6097d);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: e */
        public void mo6356e(AbstractC1266k abstractC1266k) {
            View view = this.f6094a;
            int i3 = AbstractC1263h.f6139b;
            Rect rect = (Rect) view.getTag(i3);
            this.f6094a.setTag(i3, null);
            this.f6094a.setClipBounds(rect);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void mo6357f(AbstractC1266k abstractC1266k, boolean z2) {
            AbstractC1267l.m6444a(this, abstractC1266k, z2);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: g */
        public void mo6358g(AbstractC1266k abstractC1266k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (this.f6107n) {
                return;
            }
            Rect rect = null;
            if (z2) {
                if (!this.f6096c) {
                    rect = this.f6095b;
                }
            } else if (!this.f6098e) {
                rect = this.f6097d;
            }
            this.f6094a.setClipBounds(rect);
            if (z2) {
                AbstractC1242A.m6307d(this.f6094a, this.f6099f, this.f6100g, this.f6101h, this.f6102i);
            } else {
                AbstractC1242A.m6307d(this.f6094a, this.f6103j, this.f6104k, this.f6105l, this.f6106m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z2) {
            int iMax = Math.max(this.f6101h - this.f6099f, this.f6105l - this.f6103j);
            int iMax2 = Math.max(this.f6102i - this.f6100g, this.f6106m - this.f6104k);
            int i3 = z2 ? this.f6103j : this.f6099f;
            int i4 = z2 ? this.f6104k : this.f6100g;
            AbstractC1242A.m6307d(this.f6094a, i3, i4, iMax + i3, iMax2 + i4);
            this.f6094a.setClipBounds(z2 ? this.f6097d : this.f6095b);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$h */
    private static class h extends AbstractC1274s {

        /* JADX INFO: renamed from: a */
        boolean f6108a = false;

        /* JADX INFO: renamed from: b */
        final ViewGroup f6109b;

        h(ViewGroup viewGroup) {
            this.f6109b = viewGroup;
        }

        @Override // androidx.transition.AbstractC1274s, androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: b */
        public void mo6353b(AbstractC1266k abstractC1266k) {
            AbstractC1281z.m6472b(this.f6109b, false);
            this.f6108a = true;
        }

        @Override // androidx.transition.AbstractC1274s, androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: d */
        public void mo6355d(AbstractC1266k abstractC1266k) {
            AbstractC1281z.m6472b(this.f6109b, false);
        }

        @Override // androidx.transition.AbstractC1274s, androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: e */
        public void mo6356e(AbstractC1266k abstractC1266k) {
            AbstractC1281z.m6472b(this.f6109b, true);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: g */
        public void mo6358g(AbstractC1266k abstractC1266k) {
            if (!this.f6108a) {
                AbstractC1281z.m6472b(this.f6109b, false);
            }
            abstractC1266k.mo6410U(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$i */
    private static class i {

        /* JADX INFO: renamed from: a */
        private int f6110a;

        /* JADX INFO: renamed from: b */
        private int f6111b;

        /* JADX INFO: renamed from: c */
        private int f6112c;

        /* JADX INFO: renamed from: d */
        private int f6113d;

        /* JADX INFO: renamed from: e */
        private final View f6114e;

        /* JADX INFO: renamed from: f */
        private int f6115f;

        /* JADX INFO: renamed from: g */
        private int f6116g;

        i(View view) {
            this.f6114e = view;
        }

        /* JADX INFO: renamed from: b */
        private void m6372b() {
            AbstractC1242A.m6307d(this.f6114e, this.f6110a, this.f6111b, this.f6112c, this.f6113d);
            this.f6115f = 0;
            this.f6116g = 0;
        }

        /* JADX INFO: renamed from: a */
        void m6373a(PointF pointF) {
            this.f6112c = Math.round(pointF.x);
            this.f6113d = Math.round(pointF.y);
            int i3 = this.f6116g + 1;
            this.f6116g = i3;
            if (this.f6115f == i3) {
                m6372b();
            }
        }

        /* JADX INFO: renamed from: c */
        void m6374c(PointF pointF) {
            this.f6110a = Math.round(pointF.x);
            this.f6111b = Math.round(pointF.y);
            int i3 = this.f6115f + 1;
            this.f6115f = i3;
            if (i3 == this.f6116g) {
                m6372b();
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m6361h0(C1279x c1279x) {
        View view = c1279x.f6212b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c1279x.f6211a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c1279x.f6211a.put("android:changeBounds:parent", c1279x.f6212b.getParent());
        if (this.f6091P) {
            c1279x.f6211a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: G */
    public String[] mo6340G() {
        return f6084Q;
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: g */
    public void mo6342g(C1279x c1279x) {
        m6361h0(c1279x);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: j */
    public void mo6343j(C1279x c1279x) {
        Rect rect;
        m6361h0(c1279x);
        if (!this.f6091P || (rect = (Rect) c1279x.f6212b.getTag(AbstractC1263h.f6139b)) == null) {
            return;
        }
        c1279x.f6211a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: n */
    public Animator mo6348n(ViewGroup viewGroup, C1279x c1279x, C1279x c1279x2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ObjectAnimator objectAnimatorM6381a;
        int i7;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorM6469c;
        if (c1279x == null || c1279x2 == null) {
            return null;
        }
        Map map = c1279x.f6211a;
        Map map2 = c1279x2.f6211a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c1279x2.f6212b;
        Rect rect2 = (Rect) c1279x.f6211a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c1279x2.f6211a.get("android:changeBounds:bounds");
        int i8 = rect2.left;
        int i9 = rect3.left;
        int i10 = rect2.top;
        int i11 = rect3.top;
        int i12 = rect2.right;
        int i13 = rect3.right;
        int i14 = rect2.bottom;
        int i15 = rect3.bottom;
        int i16 = i12 - i8;
        int i17 = i14 - i10;
        int i18 = i13 - i9;
        int i19 = i15 - i11;
        Rect rect4 = (Rect) c1279x.f6211a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c1279x2.f6211a.get("android:changeBounds:clip");
        if ((i16 == 0 || i17 == 0) && (i18 == 0 || i19 == 0)) {
            i3 = 0;
        } else {
            i3 = (i8 == i9 && i10 == i11) ? 0 : 1;
            if (i12 != i13 || i14 != i15) {
                i3++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i3++;
        }
        if (i3 <= 0) {
            return null;
        }
        if (this.f6091P) {
            AbstractC1242A.m6307d(view, i8, i10, Math.max(i16, i18) + i8, i10 + Math.max(i17, i19));
            if (i8 == i9 && i10 == i11) {
                objectAnimatorM6381a = null;
                i4 = i14;
                i5 = i15;
                i6 = i9;
            } else {
                i4 = i14;
                i5 = i15;
                i6 = i9;
                objectAnimatorM6381a = AbstractC1261f.m6381a(view, f6089V, m6438x().mo6383a(i8, i10, i9, i11));
            }
            boolean z2 = rect4 == null;
            if (z2) {
                i7 = 0;
                rect = new Rect(0, 0, i16, i17);
            } else {
                i7 = 0;
                rect = rect4;
            }
            boolean z3 = rect5 == null ? 1 : i7;
            Rect rect6 = z3 != 0 ? new Rect(i7, i7, i18, i19) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                C1264i c1264i = f6090W;
                Object[] objArr = new Object[2];
                objArr[i7] = rect;
                objArr[1] = rect6;
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", c1264i, objArr);
                g gVar = new g(view, rect, z2, rect6, z3, i8, i10, i12, i4, i6, i11, i13, i5);
                objectAnimatorOfObject.addListener(gVar);
                mo6415a(gVar);
            }
            animatorM6469c = AbstractC1278w.m6469c(objectAnimatorM6381a, objectAnimatorOfObject);
        } else {
            AbstractC1242A.m6307d(view, i8, i10, i12, i14);
            if (i3 != 2) {
                animatorM6469c = (i8 == i9 && i10 == i11) ? AbstractC1261f.m6381a(view, f6087T, m6438x().mo6383a(i12, i14, i13, i15)) : AbstractC1261f.m6381a(view, f6088U, m6438x().mo6383a(i8, i10, i9, i11));
            } else if (i16 == i18 && i17 == i19) {
                animatorM6469c = AbstractC1261f.m6381a(view, f6089V, m6438x().mo6383a(i8, i10, i9, i11));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorM6381a2 = AbstractC1261f.m6381a(iVar, f6085R, m6438x().mo6383a(i8, i10, i9, i11));
                ObjectAnimator objectAnimatorM6381a3 = AbstractC1261f.m6381a(iVar, f6086S, m6438x().mo6383a(i12, i14, i13, i15));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM6381a2, objectAnimatorM6381a3);
                animatorSet.addListener(new f(iVar));
                animatorM6469c = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC1281z.m6472b(viewGroup4, true);
            m6440z().mo6415a(new h(viewGroup4));
        }
        return animatorM6469c;
    }
}
