package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1266k;

/* JADX INFO: renamed from: androidx.transition.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1255N extends AbstractC1266k {

    /* JADX INFO: renamed from: Q */
    private static final String[] f6065Q = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: P */
    private int f6066P = 3;

    /* JADX INFO: renamed from: androidx.transition.N$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC1266k.g {

        /* JADX INFO: renamed from: a */
        private final View f6067a;

        /* JADX INFO: renamed from: b */
        private final int f6068b;

        /* JADX INFO: renamed from: c */
        private final ViewGroup f6069c;

        /* JADX INFO: renamed from: d */
        private final boolean f6070d;

        /* JADX INFO: renamed from: e */
        private boolean f6071e;

        /* JADX INFO: renamed from: f */
        boolean f6072f = false;

        a(View view, int i3, boolean z2) {
            this.f6067a = view;
            this.f6068b = i3;
            this.f6069c = (ViewGroup) view.getParent();
            this.f6070d = z2;
            m6351i(true);
        }

        /* JADX INFO: renamed from: h */
        private void m6350h() {
            if (!this.f6072f) {
                AbstractC1242A.m6309f(this.f6067a, this.f6068b);
                ViewGroup viewGroup = this.f6069c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m6351i(false);
        }

        /* JADX INFO: renamed from: i */
        private void m6351i(boolean z2) {
            ViewGroup viewGroup;
            if (!this.f6070d || this.f6071e == z2 || (viewGroup = this.f6069c) == null) {
                return;
            }
            this.f6071e = z2;
            AbstractC1281z.m6472b(viewGroup, z2);
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
            m6351i(false);
            if (this.f6072f) {
                return;
            }
            AbstractC1242A.m6309f(this.f6067a, this.f6068b);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: e */
        public void mo6356e(AbstractC1266k abstractC1266k) {
            m6351i(true);
            if (this.f6072f) {
                return;
            }
            AbstractC1242A.m6309f(this.f6067a, 0);
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
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6072f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m6350h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            m6350h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                AbstractC1242A.m6309f(this.f6067a, 0);
                ViewGroup viewGroup = this.f6069c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.N$b */
    private class b extends AnimatorListenerAdapter implements AbstractC1266k.g {

        /* JADX INFO: renamed from: a */
        private final ViewGroup f6073a;

        /* JADX INFO: renamed from: b */
        private final View f6074b;

        /* JADX INFO: renamed from: c */
        private final View f6075c;

        /* JADX INFO: renamed from: d */
        private boolean f6076d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f6073a = viewGroup;
            this.f6074b = view;
            this.f6075c = view2;
        }

        /* JADX INFO: renamed from: h */
        private void m6359h() {
            this.f6075c.setTag(AbstractC1263h.f6138a, null);
            this.f6073a.getOverlay().remove(this.f6074b);
            this.f6076d = false;
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: a */
        public void mo6352a(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: b */
        public void mo6353b(AbstractC1266k abstractC1266k) {
            if (this.f6076d) {
                m6359h();
            }
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
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m6359h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f6073a.getOverlay().remove(this.f6074b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f6074b.getParent() == null) {
                this.f6073a.getOverlay().add(this.f6074b);
            } else {
                AbstractC1255N.this.mo6423f();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                this.f6075c.setTag(AbstractC1263h.f6138a, this.f6074b);
                this.f6073a.getOverlay().add(this.f6074b);
                this.f6076d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            m6359h();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.N$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        boolean f6078a;

        /* JADX INFO: renamed from: b */
        boolean f6079b;

        /* JADX INFO: renamed from: c */
        int f6080c;

        /* JADX INFO: renamed from: d */
        int f6081d;

        /* JADX INFO: renamed from: e */
        ViewGroup f6082e;

        /* JADX INFO: renamed from: f */
        ViewGroup f6083f;

        c() {
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m6338h0(C1279x c1279x) {
        c1279x.f6211a.put("android:visibility:visibility", Integer.valueOf(c1279x.f6212b.getVisibility()));
        c1279x.f6211a.put("android:visibility:parent", c1279x.f6212b.getParent());
        int[] iArr = new int[2];
        c1279x.f6212b.getLocationOnScreen(iArr);
        c1279x.f6211a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: i0 */
    private c m6339i0(C1279x c1279x, C1279x c1279x2) {
        c cVar = new c();
        cVar.f6078a = false;
        cVar.f6079b = false;
        if (c1279x == null || !c1279x.f6211a.containsKey("android:visibility:visibility")) {
            cVar.f6080c = -1;
            cVar.f6082e = null;
        } else {
            cVar.f6080c = ((Integer) c1279x.f6211a.get("android:visibility:visibility")).intValue();
            cVar.f6082e = (ViewGroup) c1279x.f6211a.get("android:visibility:parent");
        }
        if (c1279x2 == null || !c1279x2.f6211a.containsKey("android:visibility:visibility")) {
            cVar.f6081d = -1;
            cVar.f6083f = null;
        } else {
            cVar.f6081d = ((Integer) c1279x2.f6211a.get("android:visibility:visibility")).intValue();
            cVar.f6083f = (ViewGroup) c1279x2.f6211a.get("android:visibility:parent");
        }
        if (c1279x != null && c1279x2 != null) {
            int i3 = cVar.f6080c;
            int i4 = cVar.f6081d;
            if (i3 != i4 || cVar.f6082e != cVar.f6083f) {
                if (i3 != i4) {
                    if (i3 == 0) {
                        cVar.f6079b = false;
                        cVar.f6078a = true;
                        return cVar;
                    }
                    if (i4 == 0) {
                        cVar.f6079b = true;
                        cVar.f6078a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f6083f == null) {
                        cVar.f6079b = false;
                        cVar.f6078a = true;
                        return cVar;
                    }
                    if (cVar.f6082e == null) {
                        cVar.f6079b = true;
                        cVar.f6078a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (c1279x == null && cVar.f6081d == 0) {
                cVar.f6079b = true;
                cVar.f6078a = true;
                return cVar;
            }
            if (c1279x2 == null && cVar.f6080c == 0) {
                cVar.f6079b = false;
                cVar.f6078a = true;
            }
        }
        return cVar;
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: G */
    public String[] mo6340G() {
        return f6065Q;
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: I */
    public boolean mo6341I(C1279x c1279x, C1279x c1279x2) {
        if (c1279x == null && c1279x2 == null) {
            return false;
        }
        if (c1279x != null && c1279x2 != null && c1279x2.f6211a.containsKey("android:visibility:visibility") != c1279x.f6211a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarM6339i0 = m6339i0(c1279x, c1279x2);
        return cVarM6339i0.f6078a && (cVarM6339i0.f6080c == 0 || cVarM6339i0.f6081d == 0);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: g */
    public void mo6342g(C1279x c1279x) {
        m6338h0(c1279x);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: j */
    public void mo6343j(C1279x c1279x) {
        m6338h0(c1279x);
    }

    /* JADX INFO: renamed from: j0 */
    public abstract Animator mo6344j0(ViewGroup viewGroup, View view, C1279x c1279x, C1279x c1279x2);

    /* JADX INFO: renamed from: k0 */
    public Animator m6345k0(ViewGroup viewGroup, C1279x c1279x, int i3, C1279x c1279x2, int i4) {
        if ((this.f6066P & 1) != 1 || c1279x2 == null) {
            return null;
        }
        if (c1279x == null) {
            View view = (View) c1279x2.f6212b.getParent();
            if (m6339i0(m6436v(view, false), m6405H(view, false)).f6078a) {
                return null;
            }
        }
        return mo6344j0(viewGroup, c1279x2.f6212b, c1279x, c1279x2);
    }

    /* JADX INFO: renamed from: l0 */
    public abstract Animator mo6346l0(ViewGroup viewGroup, View view, C1279x c1279x, C1279x c1279x2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
  0x0069: PHI (r2v3 android.view.View) = 
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v6 android.view.View)
 binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator m6347m0(android.view.ViewGroup r11, androidx.transition.C1279x r12, int r13, androidx.transition.C1279x r14, int r15) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC1255N.m6347m0(android.view.ViewGroup, androidx.transition.x, int, androidx.transition.x, int):android.animation.Animator");
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: n */
    public Animator mo6348n(ViewGroup viewGroup, C1279x c1279x, C1279x c1279x2) {
        c cVarM6339i0 = m6339i0(c1279x, c1279x2);
        if (!cVarM6339i0.f6078a) {
            return null;
        }
        if (cVarM6339i0.f6082e == null && cVarM6339i0.f6083f == null) {
            return null;
        }
        return cVarM6339i0.f6079b ? m6345k0(viewGroup, c1279x, cVarM6339i0.f6080c, c1279x2, cVarM6339i0.f6081d) : m6347m0(viewGroup, c1279x, cVarM6339i0.f6080c, c1279x2, cVarM6339i0.f6081d);
    }

    /* JADX INFO: renamed from: n0 */
    public void m6349n0(int i3) {
        if ((i3 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f6066P = i3;
    }
}
