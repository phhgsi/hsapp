package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p027J.AbstractC0268W;
import p030K.C0356y;
import p030K.InterfaceC0331B;
import p039N.C0435c;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0953c {

    /* JADX INFO: renamed from: a */
    C0435c f7066a;

    /* JADX INFO: renamed from: b */
    private boolean f7067b;

    /* JADX INFO: renamed from: c */
    private boolean f7068c;

    /* JADX INFO: renamed from: e */
    private boolean f7070e;

    /* JADX INFO: renamed from: d */
    private float f7069d = 0.0f;

    /* JADX INFO: renamed from: f */
    int f7071f = 2;

    /* JADX INFO: renamed from: g */
    float f7072g = 0.5f;

    /* JADX INFO: renamed from: h */
    float f7073h = 0.0f;

    /* JADX INFO: renamed from: i */
    float f7074i = 0.5f;

    /* JADX INFO: renamed from: j */
    private final C0435c.c f7075j = new C1440a();

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C1440a extends C0435c.c {

        /* JADX INFO: renamed from: a */
        private int f7076a;

        /* JADX INFO: renamed from: b */
        private int f7077b = -1;

        C1440a() {
        }

        /* JADX INFO: renamed from: n */
        private boolean m7570n(View view, float f3) {
            if (f3 == 0.0f) {
                return Math.abs(view.getLeft() - this.f7076a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f7072g);
            }
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.f7071f;
            if (i3 == 2) {
                return true;
            }
            if (i3 == 0) {
                return z2 ? f3 < 0.0f : f3 > 0.0f;
            }
            if (i3 == 1) {
                if (z2) {
                    return f3 > 0.0f;
                }
                if (f3 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: a */
        public int mo1589a(View view, int i3, int i4) {
            int width;
            int width2;
            int width3;
            boolean z2 = view.getLayoutDirection() == 1;
            int i5 = SwipeDismissBehavior.this.f7071f;
            if (i5 == 0) {
                if (z2) {
                    width = this.f7076a - view.getWidth();
                    width2 = this.f7076a;
                } else {
                    width = this.f7076a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i5 != 1) {
                width = this.f7076a - view.getWidth();
                width2 = view.getWidth() + this.f7076a;
            } else if (z2) {
                width = this.f7076a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f7076a - view.getWidth();
                width2 = this.f7076a;
            }
            return SwipeDismissBehavior.m7562L(width, i3, width2);
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: b */
        public int mo1590b(View view, int i3, int i4) {
            return view.getTop();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: d */
        public int mo1592d(View view) {
            return view.getWidth();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: i */
        public void mo1597i(View view, int i3) {
            this.f7077b = i3;
            this.f7076a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f7068c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f7068c = false;
            }
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: j */
        public void mo1598j(int i3) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: k */
        public void mo1599k(View view, int i3, int i4, int i5, int i6) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f7073h;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f7074i;
            float fAbs = Math.abs(i3 - this.f7076a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m7561K(0.0f, 1.0f - SwipeDismissBehavior.m7564N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo1600l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f7077b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.m7570n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f7076a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f7076a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f7076a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                N.c r5 = r5.f7066a
                int r1 = r3.getTop()
                boolean r5 = r5.m1575O(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$c r5 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                r3.postOnAnimation(r5)
                return
            L3f:
                if (r4 == 0) goto L46
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r3.getClass()
            L46:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C1440a.mo1600l(android.view.View, float, float):void");
        }

        @Override // p039N.C0435c.c
        /* JADX INFO: renamed from: m */
        public boolean mo1601m(View view, int i3) {
            int i4 = this.f7077b;
            return (i4 == -1 || i4 == i3) && SwipeDismissBehavior.this.mo7566J(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C1441b implements InterfaceC0331B {
        C1441b() {
        }

        @Override // p030K.InterfaceC0331B
        /* JADX INFO: renamed from: a */
        public boolean mo1175a(View view, InterfaceC0331B.a aVar) {
            if (!SwipeDismissBehavior.this.mo7566J(view)) {
                return false;
            }
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.f7071f;
            AbstractC0268W.m750S(view, (!(i3 == 0 && z2) && (i3 != 1 || z2)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    private class RunnableC1442c implements Runnable {

        /* JADX INFO: renamed from: d */
        private final View f7080d;

        /* JADX INFO: renamed from: e */
        private final boolean f7081e;

        RunnableC1442c(View view, boolean z2) {
            this.f7080d = view;
            this.f7081e = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0435c c0435c = SwipeDismissBehavior.this.f7066a;
            if (c0435c != null && c0435c.m1583m(true)) {
                this.f7080d.postOnAnimation(this);
            } else if (this.f7081e) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    static float m7561K(float f3, float f4, float f5) {
        return Math.min(Math.max(f3, f4), f5);
    }

    /* JADX INFO: renamed from: L */
    static int m7562L(int i3, int i4, int i5) {
        return Math.min(Math.max(i3, i4), i5);
    }

    /* JADX INFO: renamed from: M */
    private void m7563M(ViewGroup viewGroup) {
        if (this.f7066a == null) {
            this.f7066a = this.f7070e ? C0435c.m1558n(viewGroup, this.f7069d, this.f7075j) : C0435c.m1559o(viewGroup, this.f7075j);
        }
    }

    /* JADX INFO: renamed from: N */
    static float m7564N(float f3, float f4, float f5) {
        return (f5 - f3) / (f4 - f3);
    }

    /* JADX INFO: renamed from: R */
    private void m7565R(View view) {
        AbstractC0268W.m763c0(view, 1048576);
        if (mo7566J(view)) {
            AbstractC0268W.m767e0(view, C0356y.a.f1468y, null, new C1441b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: H */
    public boolean mo4139H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f7066a == null) {
            return false;
        }
        if (this.f7068c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f7066a.m1570F(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean mo7566J(View view) {
        return true;
    }

    /* JADX INFO: renamed from: O */
    public void m7567O(float f3) {
        this.f7074i = m7561K(0.0f, f3, 1.0f);
    }

    /* JADX INFO: renamed from: P */
    public void m7568P(float f3) {
        this.f7073h = m7561K(0.0f, f3, 1.0f);
    }

    /* JADX INFO: renamed from: Q */
    public void m7569Q(int i3) {
        this.f7071f = i3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: o */
    public boolean mo4150o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM4108B = this.f7067b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM4108B = coordinatorLayout.m4108B(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f7067b = zM4108B;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7067b = false;
        }
        if (zM4108B) {
            m7563M(coordinatorLayout);
            if (!this.f7068c && this.f7066a.m1576P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
    /* JADX INFO: renamed from: p */
    public boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
        boolean zMo4151p = super.mo4151p(coordinatorLayout, view, i3);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            m7565R(view);
        }
        return zMo4151p;
    }
}
