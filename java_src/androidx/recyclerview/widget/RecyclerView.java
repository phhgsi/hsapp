package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.app.AbstractC0740E;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C1222a;
import androidx.recyclerview.widget.C1223b;
import androidx.recyclerview.widget.C1232k;
import androidx.recyclerview.widget.C1236o;
import androidx.recyclerview.widget.C1237p;
import androidx.recyclerview.widget.RunnableC1226e;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p012E.AbstractC0124u;
import p024I.AbstractC0211h;
import p027J.AbstractC0268W;
import p027J.AbstractC0272Z;
import p027J.AbstractC0323z;
import p027J.C0227B;
import p027J.C0273a;
import p027J.InterfaceC0225A;
import p030K.AbstractC0333b;
import p030K.C0356y;
import p096e0.AbstractC1833a;
import p096e0.AbstractC1834b;
import p096e0.AbstractC1835c;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0225A {

    /* JADX INFO: renamed from: A0 */
    private static final int[] f5607A0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: B0 */
    static final boolean f5608B0 = false;

    /* JADX INFO: renamed from: C0 */
    static final boolean f5609C0 = true;

    /* JADX INFO: renamed from: D0 */
    static final boolean f5610D0 = true;

    /* JADX INFO: renamed from: E0 */
    static final boolean f5611E0 = true;

    /* JADX INFO: renamed from: F0 */
    private static final boolean f5612F0 = false;

    /* JADX INFO: renamed from: G0 */
    private static final boolean f5613G0 = false;

    /* JADX INFO: renamed from: H0 */
    private static final Class[] f5614H0;

    /* JADX INFO: renamed from: I0 */
    static final Interpolator f5615I0;

    /* JADX INFO: renamed from: A */
    boolean f5616A;

    /* JADX INFO: renamed from: B */
    private final AccessibilityManager f5617B;

    /* JADX INFO: renamed from: C */
    private List f5618C;

    /* JADX INFO: renamed from: D */
    boolean f5619D;

    /* JADX INFO: renamed from: E */
    boolean f5620E;

    /* JADX INFO: renamed from: F */
    private int f5621F;

    /* JADX INFO: renamed from: G */
    private int f5622G;

    /* JADX INFO: renamed from: H */
    private C1201l f5623H;

    /* JADX INFO: renamed from: I */
    private EdgeEffect f5624I;

    /* JADX INFO: renamed from: J */
    private EdgeEffect f5625J;

    /* JADX INFO: renamed from: K */
    private EdgeEffect f5626K;

    /* JADX INFO: renamed from: L */
    private EdgeEffect f5627L;

    /* JADX INFO: renamed from: M */
    AbstractC1202m f5628M;

    /* JADX INFO: renamed from: N */
    private int f5629N;

    /* JADX INFO: renamed from: O */
    private int f5630O;

    /* JADX INFO: renamed from: P */
    private VelocityTracker f5631P;

    /* JADX INFO: renamed from: Q */
    private int f5632Q;

    /* JADX INFO: renamed from: R */
    private int f5633R;

    /* JADX INFO: renamed from: S */
    private int f5634S;

    /* JADX INFO: renamed from: T */
    private int f5635T;

    /* JADX INFO: renamed from: U */
    private int f5636U;

    /* JADX INFO: renamed from: V */
    private AbstractC1207r f5637V;

    /* JADX INFO: renamed from: W */
    private final int f5638W;

    /* JADX INFO: renamed from: a */
    private final C1213x f5639a;

    /* JADX INFO: renamed from: a0 */
    private final int f5640a0;

    /* JADX INFO: renamed from: b */
    final C1211v f5641b;

    /* JADX INFO: renamed from: b0 */
    private float f5642b0;

    /* JADX INFO: renamed from: c */
    SavedState f5643c;

    /* JADX INFO: renamed from: c0 */
    private float f5644c0;

    /* JADX INFO: renamed from: d */
    C1222a f5645d;

    /* JADX INFO: renamed from: d0 */
    private boolean f5646d0;

    /* JADX INFO: renamed from: e */
    C1223b f5647e;

    /* JADX INFO: renamed from: e0 */
    final RunnableC1187B f5648e0;

    /* JADX INFO: renamed from: f */
    final C1237p f5649f;

    /* JADX INFO: renamed from: f0 */
    RunnableC1226e f5650f0;

    /* JADX INFO: renamed from: g */
    boolean f5651g;

    /* JADX INFO: renamed from: g0 */
    RunnableC1226e.b f5652g0;

    /* JADX INFO: renamed from: h */
    final Runnable f5653h;

    /* JADX INFO: renamed from: h0 */
    final C1215z f5654h0;

    /* JADX INFO: renamed from: i */
    final Rect f5655i;

    /* JADX INFO: renamed from: i0 */
    private AbstractC1209t f5656i0;

    /* JADX INFO: renamed from: j */
    private final Rect f5657j;

    /* JADX INFO: renamed from: j0 */
    private List f5658j0;

    /* JADX INFO: renamed from: k */
    final RectF f5659k;

    /* JADX INFO: renamed from: k0 */
    boolean f5660k0;

    /* JADX INFO: renamed from: l */
    AbstractC1197h f5661l;

    /* JADX INFO: renamed from: l0 */
    boolean f5662l0;

    /* JADX INFO: renamed from: m */
    AbstractC1205p f5663m;

    /* JADX INFO: renamed from: m0 */
    private AbstractC1202m.a f5664m0;

    /* JADX INFO: renamed from: n */
    final List f5665n;

    /* JADX INFO: renamed from: n0 */
    boolean f5666n0;

    /* JADX INFO: renamed from: o */
    final ArrayList f5667o;

    /* JADX INFO: renamed from: o0 */
    C1232k f5668o0;

    /* JADX INFO: renamed from: p */
    private final ArrayList f5669p;

    /* JADX INFO: renamed from: p0 */
    private final int[] f5670p0;

    /* JADX INFO: renamed from: q */
    private InterfaceC1208s f5671q;

    /* JADX INFO: renamed from: q0 */
    private C0227B f5672q0;

    /* JADX INFO: renamed from: r */
    boolean f5673r;

    /* JADX INFO: renamed from: r0 */
    private final int[] f5674r0;

    /* JADX INFO: renamed from: s */
    boolean f5675s;

    /* JADX INFO: renamed from: s0 */
    private final int[] f5676s0;

    /* JADX INFO: renamed from: t */
    boolean f5677t;

    /* JADX INFO: renamed from: t0 */
    final int[] f5678t0;

    /* JADX INFO: renamed from: u */
    boolean f5679u;

    /* JADX INFO: renamed from: u0 */
    final List f5680u0;

    /* JADX INFO: renamed from: v */
    private int f5681v;

    /* JADX INFO: renamed from: v0 */
    private Runnable f5682v0;

    /* JADX INFO: renamed from: w */
    boolean f5683w;

    /* JADX INFO: renamed from: w0 */
    private boolean f5684w0;

    /* JADX INFO: renamed from: x */
    boolean f5685x;

    /* JADX INFO: renamed from: x0 */
    private int f5686x0;

    /* JADX INFO: renamed from: y */
    private boolean f5687y;

    /* JADX INFO: renamed from: y0 */
    private int f5688y0;

    /* JADX INFO: renamed from: z */
    private int f5689z;

    /* JADX INFO: renamed from: z0 */
    private final C1237p.b f5690z0;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$A */
    public static abstract class AbstractC1186A {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$B */
    class RunnableC1187B implements Runnable {

        /* JADX INFO: renamed from: d */
        private int f5691d;

        /* JADX INFO: renamed from: e */
        private int f5692e;

        /* JADX INFO: renamed from: f */
        OverScroller f5693f;

        /* JADX INFO: renamed from: g */
        Interpolator f5694g;

        /* JADX INFO: renamed from: h */
        private boolean f5695h;

        /* JADX INFO: renamed from: i */
        private boolean f5696i;

        RunnableC1187B() {
            Interpolator interpolator = RecyclerView.f5615I0;
            this.f5694g = interpolator;
            this.f5695h = false;
            this.f5696i = false;
            this.f5693f = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* JADX INFO: renamed from: a */
        private int m5640a(int i3, int i4) {
            int iAbs = Math.abs(i3);
            int iAbs2 = Math.abs(i4);
            boolean z2 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z2) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        /* JADX INFO: renamed from: c */
        private void m5641c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC0268W.m759a0(RecyclerView.this, this);
        }

        /* JADX INFO: renamed from: b */
        public void m5642b(int i3, int i4) {
            RecyclerView.this.setScrollState(2);
            this.f5692e = 0;
            this.f5691d = 0;
            Interpolator interpolator = this.f5694g;
            Interpolator interpolator2 = RecyclerView.f5615I0;
            if (interpolator != interpolator2) {
                this.f5694g = interpolator2;
                this.f5693f = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f5693f.fling(0, 0, i3, i4, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            m5643d();
        }

        /* JADX INFO: renamed from: d */
        void m5643d() {
            if (this.f5695h) {
                this.f5696i = true;
            } else {
                m5641c();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m5644e(int i3, int i4, int i5, Interpolator interpolator) {
            if (i5 == Integer.MIN_VALUE) {
                i5 = m5640a(i3, i4);
            }
            int i6 = i5;
            if (interpolator == null) {
                interpolator = RecyclerView.f5615I0;
            }
            if (this.f5694g != interpolator) {
                this.f5694g = interpolator;
                this.f5693f = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f5692e = 0;
            this.f5691d = 0;
            RecyclerView.this.setScrollState(2);
            this.f5693f.startScroll(0, 0, i3, i4, i6);
            m5643d();
        }

        /* JADX INFO: renamed from: f */
        public void m5645f() {
            RecyclerView.this.removeCallbacks(this);
            this.f5693f.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5663m == null) {
                m5645f();
                return;
            }
            this.f5696i = false;
            this.f5695h = true;
            recyclerView.m5630u();
            OverScroller overScroller = this.f5693f;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.f5691d;
                int i6 = currY - this.f5692e;
                this.f5691d = currX;
                this.f5692e = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f5678t0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m5561F(i5, i6, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f5678t0;
                    i5 -= iArr2[0];
                    i6 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m5627t(i5, i6);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f5661l != null) {
                    int[] iArr3 = recyclerView3.f5678t0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m5600g1(i5, i6, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f5678t0;
                    int i7 = iArr4[0];
                    int i8 = iArr4[1];
                    i5 -= i7;
                    i6 -= i8;
                    AbstractC1214y abstractC1214y = recyclerView4.f5663m.f5749g;
                    if (abstractC1214y != null && !abstractC1214y.m5949g() && abstractC1214y.m5950h()) {
                        int iM5967b = RecyclerView.this.f5654h0.m5967b();
                        if (iM5967b == 0) {
                            abstractC1214y.m5960r();
                        } else if (abstractC1214y.m5948f() >= iM5967b) {
                            abstractC1214y.m5958p(iM5967b - 1);
                            abstractC1214y.m5952j(i7, i8);
                        } else {
                            abstractC1214y.m5952j(i7, i8);
                        }
                    }
                    i4 = i8;
                    i3 = i7;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i9 = i5;
                int i10 = i6;
                if (!RecyclerView.this.f5667o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f5678t0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m5563G(i3, i4, i9, i10, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f5678t0;
                int i11 = i9 - iArr6[0];
                int i12 = i10 - iArr6[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView6.m5567I(i3, i4);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                AbstractC1214y abstractC1214y2 = RecyclerView.this.f5663m.f5749g;
                if ((abstractC1214y2 == null || !abstractC1214y2.m5949g()) && z2) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.m5592a(i13, currVelocity);
                    }
                    if (RecyclerView.f5611E0) {
                        RecyclerView.this.f5652g0.m6177b();
                    }
                } else {
                    m5643d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC1226e runnableC1226e = recyclerView7.f5650f0;
                    if (runnableC1226e != null) {
                        runnableC1226e.m6173f(recyclerView7, i3, i4);
                    }
                }
            }
            AbstractC1214y abstractC1214y3 = RecyclerView.this.f5663m.f5749g;
            if (abstractC1214y3 != null && abstractC1214y3.m5949g()) {
                abstractC1214y3.m5952j(0, 0);
            }
            this.f5695h = false;
            if (this.f5696i) {
                m5641c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.m5629t1(1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$C */
    public static abstract class AbstractC1188C {

        /* JADX INFO: renamed from: t */
        private static final List f5698t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a */
        public final View f5699a;

        /* JADX INFO: renamed from: b */
        WeakReference f5700b;

        /* JADX INFO: renamed from: j */
        int f5708j;

        /* JADX INFO: renamed from: r */
        RecyclerView f5716r;

        /* JADX INFO: renamed from: s */
        AbstractC1197h f5717s;

        /* JADX INFO: renamed from: c */
        int f5701c = -1;

        /* JADX INFO: renamed from: d */
        int f5702d = -1;

        /* JADX INFO: renamed from: e */
        long f5703e = -1;

        /* JADX INFO: renamed from: f */
        int f5704f = -1;

        /* JADX INFO: renamed from: g */
        int f5705g = -1;

        /* JADX INFO: renamed from: h */
        AbstractC1188C f5706h = null;

        /* JADX INFO: renamed from: i */
        AbstractC1188C f5707i = null;

        /* JADX INFO: renamed from: k */
        List f5709k = null;

        /* JADX INFO: renamed from: l */
        List f5710l = null;

        /* JADX INFO: renamed from: m */
        private int f5711m = 0;

        /* JADX INFO: renamed from: n */
        C1211v f5712n = null;

        /* JADX INFO: renamed from: o */
        boolean f5713o = false;

        /* JADX INFO: renamed from: p */
        private int f5714p = 0;

        /* JADX INFO: renamed from: q */
        int f5715q = -1;

        public AbstractC1188C(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f5699a = view;
        }

        /* JADX INFO: renamed from: g */
        private void m5646g() {
            if (this.f5709k == null) {
                ArrayList arrayList = new ArrayList();
                this.f5709k = arrayList;
                this.f5710l = Collections.unmodifiableList(arrayList);
            }
        }

        /* JADX INFO: renamed from: A */
        void m5647A(int i3, boolean z2) {
            if (this.f5702d == -1) {
                this.f5702d = this.f5701c;
            }
            if (this.f5705g == -1) {
                this.f5705g = this.f5701c;
            }
            if (z2) {
                this.f5705g += i3;
            }
            this.f5701c += i3;
            if (this.f5699a.getLayoutParams() != null) {
                ((C1206q) this.f5699a.getLayoutParams()).f5769c = true;
            }
        }

        /* JADX INFO: renamed from: B */
        void m5648B(RecyclerView recyclerView) {
            int i3 = this.f5715q;
            if (i3 != -1) {
                this.f5714p = i3;
            } else {
                this.f5714p = AbstractC0268W.m802w(this.f5699a);
            }
            recyclerView.m5606j1(this, 4);
        }

        /* JADX INFO: renamed from: C */
        void m5649C(RecyclerView recyclerView) {
            recyclerView.m5606j1(this, this.f5714p);
            this.f5714p = 0;
        }

        /* JADX INFO: renamed from: D */
        void m5650D() {
            this.f5708j = 0;
            this.f5701c = -1;
            this.f5702d = -1;
            this.f5703e = -1L;
            this.f5705g = -1;
            this.f5711m = 0;
            this.f5706h = null;
            this.f5707i = null;
            m5662d();
            this.f5714p = 0;
            this.f5715q = -1;
            RecyclerView.m5549r(this);
        }

        /* JADX INFO: renamed from: E */
        void m5651E() {
            if (this.f5702d == -1) {
                this.f5702d = this.f5701c;
            }
        }

        /* JADX INFO: renamed from: F */
        void m5652F(int i3, int i4) {
            this.f5708j = (i3 & i4) | (this.f5708j & (~i4));
        }

        /* JADX INFO: renamed from: G */
        public final void m5653G(boolean z2) {
            int i3 = this.f5711m;
            int i4 = z2 ? i3 - 1 : i3 + 1;
            this.f5711m = i4;
            if (i4 < 0) {
                this.f5711m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z2 && i4 == 1) {
                this.f5708j |= 16;
            } else if (z2 && i4 == 0) {
                this.f5708j &= -17;
            }
        }

        /* JADX INFO: renamed from: H */
        void m5654H(C1211v c1211v, boolean z2) {
            this.f5712n = c1211v;
            this.f5713o = z2;
        }

        /* JADX INFO: renamed from: I */
        boolean m5655I() {
            return (this.f5708j & 16) != 0;
        }

        /* JADX INFO: renamed from: J */
        boolean m5656J() {
            return (this.f5708j & 128) != 0;
        }

        /* JADX INFO: renamed from: K */
        void m5657K() {
            this.f5712n.m5915J(this);
        }

        /* JADX INFO: renamed from: L */
        boolean m5658L() {
            return (this.f5708j & 32) != 0;
        }

        /* JADX INFO: renamed from: a */
        void m5659a(Object obj) {
            if (obj == null) {
                m5660b(1024);
            } else if ((1024 & this.f5708j) == 0) {
                m5646g();
                this.f5709k.add(obj);
            }
        }

        /* JADX INFO: renamed from: b */
        void m5660b(int i3) {
            this.f5708j = i3 | this.f5708j;
        }

        /* JADX INFO: renamed from: c */
        void m5661c() {
            this.f5702d = -1;
            this.f5705g = -1;
        }

        /* JADX INFO: renamed from: d */
        void m5662d() {
            List list = this.f5709k;
            if (list != null) {
                list.clear();
            }
            this.f5708j &= -1025;
        }

        /* JADX INFO: renamed from: e */
        void m5663e() {
            this.f5708j &= -33;
        }

        /* JADX INFO: renamed from: f */
        void m5664f() {
            this.f5708j &= -257;
        }

        /* JADX INFO: renamed from: h */
        boolean m5665h() {
            return (this.f5708j & 16) == 0 && AbstractC0268W.m743L(this.f5699a);
        }

        /* JADX INFO: renamed from: i */
        void m5666i(int i3, int i4, boolean z2) {
            m5660b(8);
            m5647A(i4, z2);
            this.f5701c = i3;
        }

        /* JADX INFO: renamed from: j */
        public final int m5667j() {
            RecyclerView recyclerView = this.f5716r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m5594b0(this);
        }

        /* JADX INFO: renamed from: k */
        public final long m5668k() {
            return this.f5703e;
        }

        /* JADX INFO: renamed from: l */
        public final int m5669l() {
            return this.f5704f;
        }

        /* JADX INFO: renamed from: m */
        public final int m5670m() {
            int i3 = this.f5705g;
            return i3 == -1 ? this.f5701c : i3;
        }

        /* JADX INFO: renamed from: n */
        public final int m5671n() {
            return this.f5702d;
        }

        /* JADX INFO: renamed from: o */
        List m5672o() {
            if ((this.f5708j & 1024) != 0) {
                return f5698t;
            }
            List list = this.f5709k;
            return (list == null || list.size() == 0) ? f5698t : this.f5710l;
        }

        /* JADX INFO: renamed from: p */
        boolean m5673p(int i3) {
            return (i3 & this.f5708j) != 0;
        }

        /* JADX INFO: renamed from: q */
        boolean m5674q() {
            return (this.f5708j & 512) != 0 || m5677t();
        }

        /* JADX INFO: renamed from: r */
        boolean m5675r() {
            return (this.f5699a.getParent() == null || this.f5699a.getParent() == this.f5716r) ? false : true;
        }

        /* JADX INFO: renamed from: s */
        boolean m5676s() {
            return (this.f5708j & 1) != 0;
        }

        /* JADX INFO: renamed from: t */
        boolean m5677t() {
            return (this.f5708j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f5701c + " id=" + this.f5703e + ", oldPos=" + this.f5702d + ", pLpos:" + this.f5705g);
            if (m5680w()) {
                sb.append(" scrap ");
                sb.append(this.f5713o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m5677t()) {
                sb.append(" invalid");
            }
            if (!m5676s()) {
                sb.append(" unbound");
            }
            if (m5683z()) {
                sb.append(" update");
            }
            if (m5679v()) {
                sb.append(" removed");
            }
            if (m5656J()) {
                sb.append(" ignored");
            }
            if (m5681x()) {
                sb.append(" tmpDetached");
            }
            if (!m5678u()) {
                sb.append(" not recyclable(" + this.f5711m + ")");
            }
            if (m5674q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f5699a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* JADX INFO: renamed from: u */
        public final boolean m5678u() {
            return (this.f5708j & 16) == 0 && !AbstractC0268W.m743L(this.f5699a);
        }

        /* JADX INFO: renamed from: v */
        boolean m5679v() {
            return (this.f5708j & 8) != 0;
        }

        /* JADX INFO: renamed from: w */
        boolean m5680w() {
            return this.f5712n != null;
        }

        /* JADX INFO: renamed from: x */
        boolean m5681x() {
            return (this.f5708j & 256) != 0;
        }

        /* JADX INFO: renamed from: y */
        boolean m5682y() {
            return (this.f5708j & 2) != 0;
        }

        /* JADX INFO: renamed from: z */
        boolean m5683z() {
            return (this.f5708j & 2) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class RunnableC1190a implements Runnable {
        RunnableC1190a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f5679u || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f5673r) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f5685x) {
                recyclerView2.f5683w = true;
            } else {
                recyclerView2.m5630u();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class RunnableC1191b implements Runnable {
        RunnableC1191b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1202m abstractC1202m = RecyclerView.this.f5628M;
            if (abstractC1202m != null) {
                abstractC1202m.mo5762u();
            }
            RecyclerView.this.f5666n0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c */
    class InterpolatorC1192c implements Interpolator {
        InterpolatorC1192c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            float f4 = f3 - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1193d implements C1237p.b {
        C1193d() {
        }

        @Override // androidx.recyclerview.widget.C1237p.b
        /* JADX INFO: renamed from: a */
        public void mo5688a(AbstractC1188C abstractC1188C) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5663m.m5859q1(abstractC1188C.f5699a, recyclerView.f5641b);
        }

        @Override // androidx.recyclerview.widget.C1237p.b
        /* JADX INFO: renamed from: b */
        public void mo5689b(AbstractC1188C abstractC1188C, AbstractC1202m.b bVar, AbstractC1202m.b bVar2) {
            RecyclerView.this.m5609l(abstractC1188C, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.C1237p.b
        /* JADX INFO: renamed from: c */
        public void mo5690c(AbstractC1188C abstractC1188C, AbstractC1202m.b bVar, AbstractC1202m.b bVar2) {
            RecyclerView.this.f5641b.m5915J(abstractC1188C);
            RecyclerView.this.m5613n(abstractC1188C, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.C1237p.b
        /* JADX INFO: renamed from: d */
        public void mo5691d(AbstractC1188C abstractC1188C, AbstractC1202m.b bVar, AbstractC1202m.b bVar2) {
            abstractC1188C.m5653G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5619D) {
                if (recyclerView.f5628M.mo5744b(abstractC1188C, abstractC1188C, bVar, bVar2)) {
                    RecyclerView.this.m5574M0();
                }
            } else if (recyclerView.f5628M.mo5746d(abstractC1188C, bVar, bVar2)) {
                RecyclerView.this.m5574M0();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1194e implements C1223b.b {
        C1194e() {
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: a */
        public View mo5692a(int i3) {
            return RecyclerView.this.getChildAt(i3);
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: b */
        public void mo5693b(View view) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            if (abstractC1188CM5537f0 != null) {
                abstractC1188CM5537f0.m5648B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: c */
        public AbstractC1188C mo5694c(View view) {
            return RecyclerView.m5537f0(view);
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: d */
        public void mo5695d(int i3) {
            AbstractC1188C abstractC1188CM5537f0;
            View viewMo5692a = mo5692a(i3);
            if (viewMo5692a != null && (abstractC1188CM5537f0 = RecyclerView.m5537f0(viewMo5692a)) != null) {
                if (abstractC1188CM5537f0.m5681x() && !abstractC1188CM5537f0.m5656J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + abstractC1188CM5537f0 + RecyclerView.this.m5577P());
                }
                abstractC1188CM5537f0.m5660b(256);
            }
            RecyclerView.this.detachViewFromParent(i3);
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: e */
        public void mo5696e(View view) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            if (abstractC1188CM5537f0 != null) {
                abstractC1188CM5537f0.m5649C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: f */
        public void mo5697f(View view, int i3) {
            RecyclerView.this.addView(view, i3);
            RecyclerView.this.m5637y(view);
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: g */
        public int mo5698g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: h */
        public void mo5699h(int i3) {
            View childAt = RecyclerView.this.getChildAt(i3);
            if (childAt != null) {
                RecyclerView.this.m5638z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i3);
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: i */
        public void mo5700i() {
            int iMo5698g = mo5698g();
            for (int i3 = 0; i3 < iMo5698g; i3++) {
                View viewMo5692a = mo5692a(i3);
                RecyclerView.this.m5638z(viewMo5692a);
                viewMo5692a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: j */
        public void mo5701j(View view, int i3, ViewGroup.LayoutParams layoutParams) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            if (abstractC1188CM5537f0 != null) {
                if (!abstractC1188CM5537f0.m5681x() && !abstractC1188CM5537f0.m5656J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC1188CM5537f0 + RecyclerView.this.m5577P());
                }
                abstractC1188CM5537f0.m5664f();
            }
            RecyclerView.this.attachViewToParent(view, i3, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C1223b.b
        /* JADX INFO: renamed from: k */
        public int mo5702k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C1195f implements C1222a.a {
        C1195f() {
        }

        @Override // androidx.recyclerview.widget.C1222a.a
        /* JADX INFO: renamed from: a */
        public void mo5703a(int i3, int i4) {
            RecyclerView.this.m5558C0(i3, i4);
            RecyclerView.this.f5660k0 = true;
        }

        @Override // androidx.recyclerview.widget.C1222a.a
        /* JADX INFO: renamed from: b */
        public void mo5704b(C1222a.b bVar) {
            m5711i(bVar);
        }

        @Override // androidx.recyclerview.widget.C1222a.a
        /* JADX INFO: renamed from: c */
        public AbstractC1188C mo5705c(int i3) {
            AbstractC1188C abstractC1188CM5590Z = RecyclerView.this.m5590Z(i3, true);
            if (abstractC1188CM5590Z == null || RecyclerView.this.f5647e.m6118n(abstractC1188CM5590Z.f5699a)) {
                return null;
            }
            return abstractC1188CM5590Z;
        }

        @Override // androidx.recyclerview.widget.C1222a.a
        /* JADX INFO: renamed from: d */
        public void mo5706d(int i3, int i4) {
            RecyclerView.this.m5559D0(i3, i4, false);
            RecyclerView.this.f5660k0 = true;
        }

        @Override // androidx.recyclerview.widget.C1222a.a
        /* JADX INFO: renamed from: e */
        public void mo5707e(int i3, int i4) {
            RecyclerView.this.m5557B0(i3, i4);
            RecyclerView.this.f5660k0 = true;
        }

        @Override // androidx.recyclerview.widget.C1222a.a
        /* JADX INFO: renamed from: f */
        public void mo5708f(int i3, int i4) {
            RecyclerView.this.m5559D0(i3, i4, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5660k0 = true;
            recyclerView.f5654h0.f5804d += i4;
        }

        @Override // androidx.recyclerview.widget.C1222a.a
        /* JADX INFO: renamed from: g */
        public void mo5709g(C1222a.b bVar) {
            m5711i(bVar);
        }

        @Override // androidx.recyclerview.widget.C1222a.a
        /* JADX INFO: renamed from: h */
        public void mo5710h(int i3, int i4, Object obj) {
            RecyclerView.this.m5635w1(i3, i4, obj);
            RecyclerView.this.f5662l0 = true;
        }

        /* JADX INFO: renamed from: i */
        void m5711i(C1222a.b bVar) {
            int i3 = bVar.f5882a;
            if (i3 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f5663m.mo5410V0(recyclerView, bVar.f5883b, bVar.f5885d);
                return;
            }
            if (i3 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f5663m.mo5414Y0(recyclerView2, bVar.f5883b, bVar.f5885d);
            } else if (i3 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f5663m.mo5415a1(recyclerView3, bVar.f5883b, bVar.f5885d, bVar.f5884c);
            } else {
                if (i3 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f5663m.mo5413X0(recyclerView4, bVar.f5883b, bVar.f5885d, 1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$g */
    static /* synthetic */ class C1196g {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5724a;

        static {
            int[] iArr = new int[AbstractC1197h.a.values().length];
            f5724a = iArr;
            try {
                iArr[AbstractC1197h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5724a[AbstractC1197h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class AbstractC1197h {

        /* JADX INFO: renamed from: a */
        private final C1198i f5725a = new C1198i();

        /* JADX INFO: renamed from: b */
        private boolean f5726b = false;

        /* JADX INFO: renamed from: c */
        private a f5727c = a.ALLOW;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX INFO: renamed from: a */
        public final void m5712a(AbstractC1188C abstractC1188C, int i3) {
            boolean z2 = abstractC1188C.f5717s == null;
            if (z2) {
                abstractC1188C.f5701c = i3;
                if (m5719h()) {
                    abstractC1188C.f5703e = mo5716e(i3);
                }
                abstractC1188C.m5652F(1, 519);
                AbstractC0124u.m359a("RV OnBindView");
            }
            abstractC1188C.f5717s = this;
            m5725n(abstractC1188C, i3, abstractC1188C.m5672o());
            if (z2) {
                abstractC1188C.m5662d();
                ViewGroup.LayoutParams layoutParams = abstractC1188C.f5699a.getLayoutParams();
                if (layoutParams instanceof C1206q) {
                    ((C1206q) layoutParams).f5769c = true;
                }
                AbstractC0124u.m360b();
            }
        }

        /* JADX INFO: renamed from: b */
        boolean m5713b() {
            int i3 = C1196g.f5724a[this.f5727c.ordinal()];
            return i3 != 1 && (i3 != 2 || mo5715d() > 0);
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC1188C m5714c(ViewGroup viewGroup, int i3) {
            try {
                AbstractC0124u.m359a("RV CreateView");
                AbstractC1188C abstractC1188CMo5726o = mo5726o(viewGroup, i3);
                if (abstractC1188CMo5726o.f5699a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                abstractC1188CMo5726o.f5704f = i3;
                return abstractC1188CMo5726o;
            } finally {
                AbstractC0124u.m360b();
            }
        }

        /* JADX INFO: renamed from: d */
        public abstract int mo5715d();

        /* JADX INFO: renamed from: e */
        public long mo5716e(int i3) {
            return -1L;
        }

        /* JADX INFO: renamed from: f */
        public int mo5717f(int i3) {
            return 0;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m5718g() {
            return this.f5725a.m5735a();
        }

        /* JADX INFO: renamed from: h */
        public final boolean m5719h() {
            return this.f5726b;
        }

        /* JADX INFO: renamed from: i */
        public final void m5720i() {
            this.f5725a.m5736b();
        }

        /* JADX INFO: renamed from: j */
        public final void m5721j(int i3) {
            this.f5725a.m5737c(i3, 1);
        }

        /* JADX INFO: renamed from: k */
        public final void m5722k(int i3, int i4) {
            this.f5725a.m5737c(i3, i4);
        }

        /* JADX INFO: renamed from: l */
        public void m5723l(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: m */
        public abstract void mo5724m(AbstractC1188C abstractC1188C, int i3);

        /* JADX INFO: renamed from: n */
        public void m5725n(AbstractC1188C abstractC1188C, int i3, List list) {
            mo5724m(abstractC1188C, i3);
        }

        /* JADX INFO: renamed from: o */
        public abstract AbstractC1188C mo5726o(ViewGroup viewGroup, int i3);

        /* JADX INFO: renamed from: p */
        public void m5727p(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: q */
        public boolean m5728q(AbstractC1188C abstractC1188C) {
            return false;
        }

        /* JADX INFO: renamed from: r */
        public void m5729r(AbstractC1188C abstractC1188C) {
        }

        /* JADX INFO: renamed from: s */
        public void m5730s(AbstractC1188C abstractC1188C) {
        }

        /* JADX INFO: renamed from: t */
        public void mo5731t(AbstractC1188C abstractC1188C) {
        }

        /* JADX INFO: renamed from: u */
        public void m5732u(AbstractC1199j abstractC1199j) {
            this.f5725a.registerObserver(abstractC1199j);
        }

        /* JADX INFO: renamed from: v */
        public void m5733v(boolean z2) {
            if (m5718g()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f5726b = z2;
        }

        /* JADX INFO: renamed from: w */
        public void m5734w(AbstractC1199j abstractC1199j) {
            this.f5725a.unregisterObserver(abstractC1199j);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i */
    static class C1198i extends Observable {
        C1198i() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m5735a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: b */
        public void m5736b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1199j) ((Observable) this).mObservers.get(size)).mo5739a();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m5737c(int i3, int i4) {
            m5738d(i3, i4, null);
        }

        /* JADX INFO: renamed from: d */
        public void m5738d(int i3, int i4, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1199j) ((Observable) this).mObservers.get(size)).mo5740b(i3, i4, obj);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class AbstractC1199j {
        /* JADX INFO: renamed from: a */
        public abstract void mo5739a();

        /* JADX INFO: renamed from: b */
        public abstract void mo5740b(int i3, int i4, Object obj);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public interface InterfaceC1200k {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static class C1201l {
        /* JADX INFO: renamed from: a */
        protected EdgeEffect m5741a(RecyclerView recyclerView, int i3) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class AbstractC1202m {

        /* JADX INFO: renamed from: a */
        private a f5732a = null;

        /* JADX INFO: renamed from: b */
        private ArrayList f5733b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private long f5734c = 120;

        /* JADX INFO: renamed from: d */
        private long f5735d = 120;

        /* JADX INFO: renamed from: e */
        private long f5736e = 250;

        /* JADX INFO: renamed from: f */
        private long f5737f = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        interface a {
            /* JADX INFO: renamed from: a */
            void mo5764a(AbstractC1188C abstractC1188C);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public int f5738a;

            /* JADX INFO: renamed from: b */
            public int f5739b;

            /* JADX INFO: renamed from: c */
            public int f5740c;

            /* JADX INFO: renamed from: d */
            public int f5741d;

            /* JADX INFO: renamed from: a */
            public b m5765a(AbstractC1188C abstractC1188C) {
                return m5766b(abstractC1188C, 0);
            }

            /* JADX INFO: renamed from: b */
            public b m5766b(AbstractC1188C abstractC1188C, int i3) {
                View view = abstractC1188C.f5699a;
                this.f5738a = view.getLeft();
                this.f5739b = view.getTop();
                this.f5740c = view.getRight();
                this.f5741d = view.getBottom();
                return this;
            }
        }

        /* JADX INFO: renamed from: e */
        static int m5742e(AbstractC1188C abstractC1188C) {
            int i3 = abstractC1188C.f5708j;
            int i4 = i3 & 14;
            if (abstractC1188C.m5677t()) {
                return 4;
            }
            if ((i3 & 4) == 0) {
                int iM5671n = abstractC1188C.m5671n();
                int iM5667j = abstractC1188C.m5667j();
                if (iM5671n != -1 && iM5667j != -1 && iM5671n != iM5667j) {
                    return i4 | 2048;
                }
            }
            return i4;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo5743a(AbstractC1188C abstractC1188C, b bVar, b bVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo5744b(AbstractC1188C abstractC1188C, AbstractC1188C abstractC1188C2, b bVar, b bVar2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo5745c(AbstractC1188C abstractC1188C, b bVar, b bVar2);

        /* JADX INFO: renamed from: d */
        public abstract boolean mo5746d(AbstractC1188C abstractC1188C, b bVar, b bVar2);

        /* JADX INFO: renamed from: f */
        public abstract boolean mo5747f(AbstractC1188C abstractC1188C);

        /* JADX INFO: renamed from: g */
        public boolean mo5748g(AbstractC1188C abstractC1188C, List list) {
            return mo5747f(abstractC1188C);
        }

        /* JADX INFO: renamed from: h */
        public final void m5749h(AbstractC1188C abstractC1188C) {
            m5759r(abstractC1188C);
            a aVar = this.f5732a;
            if (aVar != null) {
                aVar.mo5764a(abstractC1188C);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m5750i() {
            if (this.f5733b.size() <= 0) {
                this.f5733b.clear();
            } else {
                AbstractC0740E.m2693a(this.f5733b.get(0));
                throw null;
            }
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo5751j(AbstractC1188C abstractC1188C);

        /* JADX INFO: renamed from: k */
        public abstract void mo5752k();

        /* JADX INFO: renamed from: l */
        public long m5753l() {
            return this.f5734c;
        }

        /* JADX INFO: renamed from: m */
        public long m5754m() {
            return this.f5737f;
        }

        /* JADX INFO: renamed from: n */
        public long m5755n() {
            return this.f5736e;
        }

        /* JADX INFO: renamed from: o */
        public long m5756o() {
            return this.f5735d;
        }

        /* JADX INFO: renamed from: p */
        public abstract boolean mo5757p();

        /* JADX INFO: renamed from: q */
        public b m5758q() {
            return new b();
        }

        /* JADX INFO: renamed from: r */
        public void m5759r(AbstractC1188C abstractC1188C) {
        }

        /* JADX INFO: renamed from: s */
        public b m5760s(C1215z c1215z, AbstractC1188C abstractC1188C) {
            return m5758q().m5765a(abstractC1188C);
        }

        /* JADX INFO: renamed from: t */
        public b m5761t(C1215z c1215z, AbstractC1188C abstractC1188C, int i3, List list) {
            return m5758q().m5765a(abstractC1188C);
        }

        /* JADX INFO: renamed from: u */
        public abstract void mo5762u();

        /* JADX INFO: renamed from: v */
        void m5763v(a aVar) {
            this.f5732a = aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n */
    private class C1203n implements AbstractC1202m.a {
        C1203n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m.a
        /* JADX INFO: renamed from: a */
        public void mo5764a(AbstractC1188C abstractC1188C) {
            abstractC1188C.m5653G(true);
            if (abstractC1188C.f5706h != null && abstractC1188C.f5707i == null) {
                abstractC1188C.f5706h = null;
            }
            abstractC1188C.f5707i = null;
            if (abstractC1188C.m5655I() || RecyclerView.this.m5584V0(abstractC1188C.f5699a) || !abstractC1188C.m5681x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC1188C.f5699a, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class AbstractC1204o {
        /* JADX INFO: renamed from: d */
        public void m5767d(Rect rect, int i3, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* JADX INFO: renamed from: e */
        public void m5768e(Rect rect, View view, RecyclerView recyclerView, C1215z c1215z) {
            m5767d(rect, ((C1206q) view.getLayoutParams()).m5881a(), recyclerView);
        }

        /* JADX INFO: renamed from: f */
        public void m5769f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: g */
        public void mo5770g(Canvas canvas, RecyclerView recyclerView, C1215z c1215z) {
            m5769f(canvas, recyclerView);
        }

        /* JADX INFO: renamed from: h */
        public void m5771h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: i */
        public void mo5772i(Canvas canvas, RecyclerView recyclerView, C1215z c1215z) {
            m5771h(canvas, recyclerView);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC1207r {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo5885a(int i3, int i4);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface InterfaceC1208s {
        /* JADX INFO: renamed from: a */
        boolean mo5886a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: b */
        void mo5887b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        void mo5888c(boolean z2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class AbstractC1209t {
        /* JADX INFO: renamed from: a */
        public void mo5889a(RecyclerView recyclerView, int i3) {
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo5890b(RecyclerView recyclerView, int i3, int i4);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C1210u {

        /* JADX INFO: renamed from: a */
        SparseArray f5771a = new SparseArray();

        /* JADX INFO: renamed from: b */
        private int f5772b = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class a {

            /* JADX INFO: renamed from: a */
            final ArrayList f5773a = new ArrayList();

            /* JADX INFO: renamed from: b */
            int f5774b = 5;

            /* JADX INFO: renamed from: c */
            long f5775c = 0;

            /* JADX INFO: renamed from: d */
            long f5776d = 0;

            a() {
            }
        }

        /* JADX INFO: renamed from: g */
        private a m5891g(int i3) {
            a aVar = (a) this.f5771a.get(i3);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f5771a.put(i3, aVar2);
            return aVar2;
        }

        /* JADX INFO: renamed from: a */
        void m5892a() {
            this.f5772b++;
        }

        /* JADX INFO: renamed from: b */
        public void m5893b() {
            for (int i3 = 0; i3 < this.f5771a.size(); i3++) {
                ((a) this.f5771a.valueAt(i3)).f5773a.clear();
            }
        }

        /* JADX INFO: renamed from: c */
        void m5894c() {
            this.f5772b--;
        }

        /* JADX INFO: renamed from: d */
        void m5895d(int i3, long j3) {
            a aVarM5891g = m5891g(i3);
            aVarM5891g.f5776d = m5900j(aVarM5891g.f5776d, j3);
        }

        /* JADX INFO: renamed from: e */
        void m5896e(int i3, long j3) {
            a aVarM5891g = m5891g(i3);
            aVarM5891g.f5775c = m5900j(aVarM5891g.f5775c, j3);
        }

        /* JADX INFO: renamed from: f */
        public AbstractC1188C m5897f(int i3) {
            a aVar = (a) this.f5771a.get(i3);
            if (aVar == null || aVar.f5773a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f5773a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((AbstractC1188C) arrayList.get(size)).m5675r()) {
                    return (AbstractC1188C) arrayList.remove(size);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: h */
        void m5898h(AbstractC1197h abstractC1197h, AbstractC1197h abstractC1197h2, boolean z2) {
            if (abstractC1197h != null) {
                m5894c();
            }
            if (!z2 && this.f5772b == 0) {
                m5893b();
            }
            if (abstractC1197h2 != null) {
                m5892a();
            }
        }

        /* JADX INFO: renamed from: i */
        public void m5899i(AbstractC1188C abstractC1188C) {
            int iM5669l = abstractC1188C.m5669l();
            ArrayList arrayList = m5891g(iM5669l).f5773a;
            if (((a) this.f5771a.get(iM5669l)).f5774b <= arrayList.size()) {
                return;
            }
            abstractC1188C.m5650D();
            arrayList.add(abstractC1188C);
        }

        /* JADX INFO: renamed from: j */
        long m5900j(long j3, long j4) {
            return j3 == 0 ? j4 : ((j3 / 4) * 3) + (j4 / 4);
        }

        /* JADX INFO: renamed from: k */
        boolean m5901k(int i3, long j3, long j4) {
            long j5 = m5891g(i3).f5776d;
            return j5 == 0 || j3 + j5 < j4;
        }

        /* JADX INFO: renamed from: l */
        boolean m5902l(int i3, long j3, long j4) {
            long j5 = m5891g(i3).f5775c;
            return j5 == 0 || j3 + j5 < j4;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C1211v {

        /* JADX INFO: renamed from: a */
        final ArrayList f5777a;

        /* JADX INFO: renamed from: b */
        ArrayList f5778b;

        /* JADX INFO: renamed from: c */
        final ArrayList f5779c;

        /* JADX INFO: renamed from: d */
        private final List f5780d;

        /* JADX INFO: renamed from: e */
        private int f5781e;

        /* JADX INFO: renamed from: f */
        int f5782f;

        /* JADX INFO: renamed from: g */
        C1210u f5783g;

        public C1211v() {
            ArrayList arrayList = new ArrayList();
            this.f5777a = arrayList;
            this.f5778b = null;
            this.f5779c = new ArrayList();
            this.f5780d = Collections.unmodifiableList(arrayList);
            this.f5781e = 2;
            this.f5782f = 2;
        }

        /* JADX INFO: renamed from: H */
        private boolean m5903H(AbstractC1188C abstractC1188C, int i3, int i4, long j3) {
            abstractC1188C.f5717s = null;
            abstractC1188C.f5716r = RecyclerView.this;
            int iM5669l = abstractC1188C.m5669l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j3 != Long.MAX_VALUE && !this.f5783g.m5901k(iM5669l, nanoTime, j3)) {
                return false;
            }
            RecyclerView.this.f5661l.m5712a(abstractC1188C, i3);
            this.f5783g.m5895d(abstractC1188C.m5669l(), RecyclerView.this.getNanoTime() - nanoTime);
            m5904b(abstractC1188C);
            if (!RecyclerView.this.f5654h0.m5970e()) {
                return true;
            }
            abstractC1188C.f5705g = i4;
            return true;
        }

        /* JADX INFO: renamed from: b */
        private void m5904b(AbstractC1188C abstractC1188C) {
            if (RecyclerView.this.m5625s0()) {
                View view = abstractC1188C.f5699a;
                if (AbstractC0268W.m802w(view) == 0) {
                    AbstractC0268W.m789p0(view, 1);
                }
                C1232k c1232k = RecyclerView.this.f5668o0;
                if (c1232k == null) {
                    return;
                }
                C0273a c0273aM6231n = c1232k.m6231n();
                if (c0273aM6231n instanceof C1232k.a) {
                    ((C1232k.a) c0273aM6231n).m6234o(view);
                }
                AbstractC0268W.m775i0(view, c0273aM6231n);
            }
        }

        /* JADX INFO: renamed from: q */
        private void m5905q(ViewGroup viewGroup, boolean z2) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m5905q((ViewGroup) childAt, true);
                }
            }
            if (z2) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* JADX INFO: renamed from: r */
        private void m5906r(AbstractC1188C abstractC1188C) {
            View view = abstractC1188C.f5699a;
            if (view instanceof ViewGroup) {
                m5905q((ViewGroup) view, false);
            }
        }

        /* JADX INFO: renamed from: A */
        void m5907A(int i3) {
            m5919a((AbstractC1188C) this.f5779c.get(i3), true);
            this.f5779c.remove(i3);
        }

        /* JADX INFO: renamed from: B */
        public void m5908B(View view) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            if (abstractC1188CM5537f0.m5681x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (abstractC1188CM5537f0.m5680w()) {
                abstractC1188CM5537f0.m5657K();
            } else if (abstractC1188CM5537f0.m5658L()) {
                abstractC1188CM5537f0.m5663e();
            }
            m5909C(abstractC1188CM5537f0);
            if (RecyclerView.this.f5628M == null || abstractC1188CM5537f0.m5678u()) {
                return;
            }
            RecyclerView.this.f5628M.mo5751j(abstractC1188CM5537f0);
        }

        /* JADX INFO: renamed from: C */
        void m5909C(AbstractC1188C abstractC1188C) {
            boolean z2;
            boolean z3 = true;
            if (abstractC1188C.m5680w() || abstractC1188C.f5699a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC1188C.m5680w());
                sb.append(" isAttached:");
                sb.append(abstractC1188C.f5699a.getParent() != null);
                sb.append(RecyclerView.this.m5577P());
                throw new IllegalArgumentException(sb.toString());
            }
            if (abstractC1188C.m5681x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC1188C + RecyclerView.this.m5577P());
            }
            if (abstractC1188C.m5656J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m5577P());
            }
            boolean zM5665h = abstractC1188C.m5665h();
            AbstractC1197h abstractC1197h = RecyclerView.this.f5661l;
            if ((abstractC1197h != null && zM5665h && abstractC1197h.m5728q(abstractC1188C)) || abstractC1188C.m5678u()) {
                if (this.f5782f <= 0 || abstractC1188C.m5673p(526)) {
                    z2 = false;
                } else {
                    int size = this.f5779c.size();
                    if (size >= this.f5782f && size > 0) {
                        m5907A(0);
                        size--;
                    }
                    if (RecyclerView.f5611E0 && size > 0 && !RecyclerView.this.f5652g0.m6179d(abstractC1188C.f5701c)) {
                        int i3 = size - 1;
                        while (i3 >= 0) {
                            if (!RecyclerView.this.f5652g0.m6179d(((AbstractC1188C) this.f5779c.get(i3)).f5701c)) {
                                break;
                            } else {
                                i3--;
                            }
                        }
                        size = i3 + 1;
                    }
                    this.f5779c.add(size, abstractC1188C);
                    z2 = true;
                }
                if (z2) {
                    z3 = false;
                } else {
                    m5919a(abstractC1188C, true);
                }
                z = z2;
            } else {
                z3 = false;
            }
            RecyclerView.this.f5649f.m6282q(abstractC1188C);
            if (z || z3 || !zM5665h) {
                return;
            }
            abstractC1188C.f5717s = null;
            abstractC1188C.f5716r = null;
        }

        /* JADX INFO: renamed from: D */
        void m5910D(View view) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            if (!abstractC1188CM5537f0.m5673p(12) && abstractC1188CM5537f0.m5682y() && !RecyclerView.this.m5618p(abstractC1188CM5537f0)) {
                if (this.f5778b == null) {
                    this.f5778b = new ArrayList();
                }
                abstractC1188CM5537f0.m5654H(this, true);
                this.f5778b.add(abstractC1188CM5537f0);
                return;
            }
            if (!abstractC1188CM5537f0.m5677t() || abstractC1188CM5537f0.m5679v() || RecyclerView.this.f5661l.m5719h()) {
                abstractC1188CM5537f0.m5654H(this, false);
                this.f5777a.add(abstractC1188CM5537f0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m5577P());
            }
        }

        /* JADX INFO: renamed from: E */
        void m5911E(C1210u c1210u) {
            C1210u c1210u2 = this.f5783g;
            if (c1210u2 != null) {
                c1210u2.m5894c();
            }
            this.f5783g = c1210u;
            if (c1210u == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f5783g.m5892a();
        }

        /* JADX INFO: renamed from: F */
        void m5912F(AbstractC1186A abstractC1186A) {
        }

        /* JADX INFO: renamed from: G */
        public void m5913G(int i3) {
            this.f5781e = i3;
            m5916K();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01ce  */
        /* JADX INFO: renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        androidx.recyclerview.widget.RecyclerView.AbstractC1188C m5914I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instruction units count: 522
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1211v.m5914I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$C");
        }

        /* JADX INFO: renamed from: J */
        void m5915J(AbstractC1188C abstractC1188C) {
            if (abstractC1188C.f5713o) {
                this.f5778b.remove(abstractC1188C);
            } else {
                this.f5777a.remove(abstractC1188C);
            }
            abstractC1188C.f5712n = null;
            abstractC1188C.f5713o = false;
            abstractC1188C.m5663e();
        }

        /* JADX INFO: renamed from: K */
        void m5916K() {
            AbstractC1205p abstractC1205p = RecyclerView.this.f5663m;
            this.f5782f = this.f5781e + (abstractC1205p != null ? abstractC1205p.f5755m : 0);
            for (int size = this.f5779c.size() - 1; size >= 0 && this.f5779c.size() > this.f5782f; size--) {
                m5907A(size);
            }
        }

        /* JADX INFO: renamed from: L */
        boolean m5917L(AbstractC1188C abstractC1188C) {
            if (abstractC1188C.m5679v()) {
                return RecyclerView.this.f5654h0.m5970e();
            }
            int i3 = abstractC1188C.f5701c;
            if (i3 >= 0 && i3 < RecyclerView.this.f5661l.mo5715d()) {
                if (RecyclerView.this.f5654h0.m5970e() || RecyclerView.this.f5661l.mo5717f(abstractC1188C.f5701c) == abstractC1188C.m5669l()) {
                    return !RecyclerView.this.f5661l.m5719h() || abstractC1188C.m5668k() == RecyclerView.this.f5661l.mo5716e(abstractC1188C.f5701c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC1188C + RecyclerView.this.m5577P());
        }

        /* JADX INFO: renamed from: M */
        void m5918M(int i3, int i4) {
            int i5;
            int i6 = i4 + i3;
            for (int size = this.f5779c.size() - 1; size >= 0; size--) {
                AbstractC1188C abstractC1188C = (AbstractC1188C) this.f5779c.get(size);
                if (abstractC1188C != null && (i5 = abstractC1188C.f5701c) >= i3 && i5 < i6) {
                    abstractC1188C.m5660b(2);
                    m5907A(size);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m5919a(AbstractC1188C abstractC1188C, boolean z2) {
            RecyclerView.m5549r(abstractC1188C);
            View view = abstractC1188C.f5699a;
            C1232k c1232k = RecyclerView.this.f5668o0;
            if (c1232k != null) {
                C0273a c0273aM6231n = c1232k.m6231n();
                AbstractC0268W.m775i0(view, c0273aM6231n instanceof C1232k.a ? ((C1232k.a) c0273aM6231n).m6233n(view) : null);
            }
            if (z2) {
                m5924g(abstractC1188C);
            }
            abstractC1188C.f5717s = null;
            abstractC1188C.f5716r = null;
            m5926i().m5899i(abstractC1188C);
        }

        /* JADX INFO: renamed from: c */
        public void m5920c() {
            this.f5777a.clear();
            m5941z();
        }

        /* JADX INFO: renamed from: d */
        void m5921d() {
            int size = this.f5779c.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC1188C) this.f5779c.get(i3)).m5661c();
            }
            int size2 = this.f5777a.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((AbstractC1188C) this.f5777a.get(i4)).m5661c();
            }
            ArrayList arrayList = this.f5778b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ((AbstractC1188C) this.f5778b.get(i5)).m5661c();
                }
            }
        }

        /* JADX INFO: renamed from: e */
        void m5922e() {
            this.f5777a.clear();
            ArrayList arrayList = this.f5778b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* JADX INFO: renamed from: f */
        public int m5923f(int i3) {
            if (i3 >= 0 && i3 < RecyclerView.this.f5654h0.m5967b()) {
                return !RecyclerView.this.f5654h0.m5970e() ? i3 : RecyclerView.this.f5645d.m6094m(i3);
            }
            throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + RecyclerView.this.f5654h0.m5967b() + RecyclerView.this.m5577P());
        }

        /* JADX INFO: renamed from: g */
        void m5924g(AbstractC1188C abstractC1188C) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f5665n.size() > 0) {
                AbstractC0740E.m2693a(RecyclerView.this.f5665n.get(0));
                throw null;
            }
            AbstractC1197h abstractC1197h = RecyclerView.this.f5661l;
            if (abstractC1197h != null) {
                abstractC1197h.mo5731t(abstractC1188C);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5654h0 != null) {
                recyclerView.f5649f.m6282q(abstractC1188C);
            }
        }

        /* JADX INFO: renamed from: h */
        AbstractC1188C m5925h(int i3) {
            int size;
            int iM6094m;
            ArrayList arrayList = this.f5778b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC1188C abstractC1188C = (AbstractC1188C) this.f5778b.get(i4);
                    if (!abstractC1188C.m5658L() && abstractC1188C.m5670m() == i3) {
                        abstractC1188C.m5660b(32);
                        return abstractC1188C;
                    }
                }
                if (RecyclerView.this.f5661l.m5719h() && (iM6094m = RecyclerView.this.f5645d.m6094m(i3)) > 0 && iM6094m < RecyclerView.this.f5661l.mo5715d()) {
                    long jMo5716e = RecyclerView.this.f5661l.mo5716e(iM6094m);
                    for (int i5 = 0; i5 < size; i5++) {
                        AbstractC1188C abstractC1188C2 = (AbstractC1188C) this.f5778b.get(i5);
                        if (!abstractC1188C2.m5658L() && abstractC1188C2.m5668k() == jMo5716e) {
                            abstractC1188C2.m5660b(32);
                            return abstractC1188C2;
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        C1210u m5926i() {
            if (this.f5783g == null) {
                this.f5783g = new C1210u();
            }
            return this.f5783g;
        }

        /* JADX INFO: renamed from: j */
        int m5927j() {
            return this.f5777a.size();
        }

        /* JADX INFO: renamed from: k */
        public List m5928k() {
            return this.f5780d;
        }

        /* JADX INFO: renamed from: l */
        AbstractC1188C m5929l(long j3, int i3, boolean z2) {
            for (int size = this.f5777a.size() - 1; size >= 0; size--) {
                AbstractC1188C abstractC1188C = (AbstractC1188C) this.f5777a.get(size);
                if (abstractC1188C.m5668k() == j3 && !abstractC1188C.m5658L()) {
                    if (i3 == abstractC1188C.m5669l()) {
                        abstractC1188C.m5660b(32);
                        if (abstractC1188C.m5679v() && !RecyclerView.this.f5654h0.m5970e()) {
                            abstractC1188C.m5652F(2, 14);
                        }
                        return abstractC1188C;
                    }
                    if (!z2) {
                        this.f5777a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC1188C.f5699a, false);
                        m5940y(abstractC1188C.f5699a);
                    }
                }
            }
            int size2 = this.f5779c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC1188C abstractC1188C2 = (AbstractC1188C) this.f5779c.get(size2);
                if (abstractC1188C2.m5668k() == j3 && !abstractC1188C2.m5675r()) {
                    if (i3 == abstractC1188C2.m5669l()) {
                        if (!z2) {
                            this.f5779c.remove(size2);
                        }
                        return abstractC1188C2;
                    }
                    if (!z2) {
                        m5907A(size2);
                        return null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: m */
        AbstractC1188C m5930m(int i3, boolean z2) {
            View viewM6111e;
            int size = this.f5777a.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC1188C abstractC1188C = (AbstractC1188C) this.f5777a.get(i4);
                if (!abstractC1188C.m5658L() && abstractC1188C.m5670m() == i3 && !abstractC1188C.m5677t() && (RecyclerView.this.f5654h0.f5808h || !abstractC1188C.m5679v())) {
                    abstractC1188C.m5660b(32);
                    return abstractC1188C;
                }
            }
            if (z2 || (viewM6111e = RecyclerView.this.f5647e.m6111e(i3)) == null) {
                int size2 = this.f5779c.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    AbstractC1188C abstractC1188C2 = (AbstractC1188C) this.f5779c.get(i5);
                    if (!abstractC1188C2.m5677t() && abstractC1188C2.m5670m() == i3 && !abstractC1188C2.m5675r()) {
                        if (!z2) {
                            this.f5779c.remove(i5);
                        }
                        return abstractC1188C2;
                    }
                }
                return null;
            }
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(viewM6111e);
            RecyclerView.this.f5647e.m6123s(viewM6111e);
            int iM6117m = RecyclerView.this.f5647e.m6117m(viewM6111e);
            if (iM6117m != -1) {
                RecyclerView.this.f5647e.m6110d(iM6117m);
                m5910D(viewM6111e);
                abstractC1188CM5537f0.m5660b(8224);
                return abstractC1188CM5537f0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC1188CM5537f0 + RecyclerView.this.m5577P());
        }

        /* JADX INFO: renamed from: n */
        View m5931n(int i3) {
            return ((AbstractC1188C) this.f5777a.get(i3)).f5699a;
        }

        /* JADX INFO: renamed from: o */
        public View m5932o(int i3) {
            return m5933p(i3, false);
        }

        /* JADX INFO: renamed from: p */
        View m5933p(int i3, boolean z2) {
            return m5914I(i3, z2, Long.MAX_VALUE).f5699a;
        }

        /* JADX INFO: renamed from: s */
        void m5934s() {
            int size = this.f5779c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1206q c1206q = (C1206q) ((AbstractC1188C) this.f5779c.get(i3)).f5699a.getLayoutParams();
                if (c1206q != null) {
                    c1206q.f5769c = true;
                }
            }
        }

        /* JADX INFO: renamed from: t */
        void m5935t() {
            int size = this.f5779c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC1188C abstractC1188C = (AbstractC1188C) this.f5779c.get(i3);
                if (abstractC1188C != null) {
                    abstractC1188C.m5660b(6);
                    abstractC1188C.m5659a(null);
                }
            }
            AbstractC1197h abstractC1197h = RecyclerView.this.f5661l;
            if (abstractC1197h == null || !abstractC1197h.m5719h()) {
                m5941z();
            }
        }

        /* JADX INFO: renamed from: u */
        void m5936u(int i3, int i4) {
            int size = this.f5779c.size();
            for (int i5 = 0; i5 < size; i5++) {
                AbstractC1188C abstractC1188C = (AbstractC1188C) this.f5779c.get(i5);
                if (abstractC1188C != null && abstractC1188C.f5701c >= i3) {
                    abstractC1188C.m5647A(i4, false);
                }
            }
        }

        /* JADX INFO: renamed from: v */
        void m5937v(int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            if (i3 < i4) {
                i5 = -1;
                i7 = i3;
                i6 = i4;
            } else {
                i5 = 1;
                i6 = i3;
                i7 = i4;
            }
            int size = this.f5779c.size();
            for (int i9 = 0; i9 < size; i9++) {
                AbstractC1188C abstractC1188C = (AbstractC1188C) this.f5779c.get(i9);
                if (abstractC1188C != null && (i8 = abstractC1188C.f5701c) >= i7 && i8 <= i6) {
                    if (i8 == i3) {
                        abstractC1188C.m5647A(i4 - i3, false);
                    } else {
                        abstractC1188C.m5647A(i5, false);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: w */
        void m5938w(int i3, int i4, boolean z2) {
            int i5 = i3 + i4;
            for (int size = this.f5779c.size() - 1; size >= 0; size--) {
                AbstractC1188C abstractC1188C = (AbstractC1188C) this.f5779c.get(size);
                if (abstractC1188C != null) {
                    int i6 = abstractC1188C.f5701c;
                    if (i6 >= i5) {
                        abstractC1188C.m5647A(-i4, z2);
                    } else if (i6 >= i3) {
                        abstractC1188C.m5660b(8);
                        m5907A(size);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: x */
        void m5939x(AbstractC1197h abstractC1197h, AbstractC1197h abstractC1197h2, boolean z2) {
            m5920c();
            m5926i().m5898h(abstractC1197h, abstractC1197h2, z2);
        }

        /* JADX INFO: renamed from: y */
        void m5940y(View view) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            abstractC1188CM5537f0.f5712n = null;
            abstractC1188CM5537f0.f5713o = false;
            abstractC1188CM5537f0.m5663e();
            m5909C(abstractC1188CM5537f0);
        }

        /* JADX INFO: renamed from: z */
        void m5941z() {
            for (int size = this.f5779c.size() - 1; size >= 0; size--) {
                m5907A(size);
            }
            this.f5779c.clear();
            if (RecyclerView.f5611E0) {
                RecyclerView.this.f5652g0.m6177b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface InterfaceC1212w {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C1213x extends AbstractC1199j {
        C1213x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1199j
        /* JADX INFO: renamed from: a */
        public void mo5739a() {
            RecyclerView.this.m5616o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5654h0.f5807g = true;
            recyclerView.m5578P0(true);
            if (RecyclerView.this.f5645d.m6097p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1199j
        /* JADX INFO: renamed from: b */
        public void mo5740b(int i3, int i4, Object obj) {
            RecyclerView.this.m5616o(null);
            if (RecyclerView.this.f5645d.m6099r(i3, i4, obj)) {
                m5942c();
            }
        }

        /* JADX INFO: renamed from: c */
        void m5942c() {
            if (RecyclerView.f5610D0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f5675s && recyclerView.f5673r) {
                    AbstractC0268W.m759a0(recyclerView, recyclerView.f5653h);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f5616A = true;
            recyclerView2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class AbstractC1214y {

        /* JADX INFO: renamed from: b */
        private RecyclerView f5787b;

        /* JADX INFO: renamed from: c */
        private AbstractC1205p f5788c;

        /* JADX INFO: renamed from: d */
        private boolean f5789d;

        /* JADX INFO: renamed from: e */
        private boolean f5790e;

        /* JADX INFO: renamed from: f */
        private View f5791f;

        /* JADX INFO: renamed from: h */
        private boolean f5793h;

        /* JADX INFO: renamed from: a */
        private int f5786a = -1;

        /* JADX INFO: renamed from: g */
        private final a f5792g = new a(0, 0);

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private int f5794a;

            /* JADX INFO: renamed from: b */
            private int f5795b;

            /* JADX INFO: renamed from: c */
            private int f5796c;

            /* JADX INFO: renamed from: d */
            private int f5797d;

            /* JADX INFO: renamed from: e */
            private Interpolator f5798e;

            /* JADX INFO: renamed from: f */
            private boolean f5799f;

            /* JADX INFO: renamed from: g */
            private int f5800g;

            public a(int i3, int i4) {
                this(i3, i4, Integer.MIN_VALUE, null);
            }

            /* JADX INFO: renamed from: e */
            private void m5961e() {
                if (this.f5798e != null && this.f5796c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f5796c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* JADX INFO: renamed from: a */
            boolean m5962a() {
                return this.f5797d >= 0;
            }

            /* JADX INFO: renamed from: b */
            public void m5963b(int i3) {
                this.f5797d = i3;
            }

            /* JADX INFO: renamed from: c */
            void m5964c(RecyclerView recyclerView) {
                int i3 = this.f5797d;
                if (i3 >= 0) {
                    this.f5797d = -1;
                    recyclerView.m5632v0(i3);
                    this.f5799f = false;
                } else {
                    if (!this.f5799f) {
                        this.f5800g = 0;
                        return;
                    }
                    m5961e();
                    recyclerView.f5648e0.m5644e(this.f5794a, this.f5795b, this.f5796c, this.f5798e);
                    int i4 = this.f5800g + 1;
                    this.f5800g = i4;
                    if (i4 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f5799f = false;
                }
            }

            /* JADX INFO: renamed from: d */
            public void m5965d(int i3, int i4, int i5, Interpolator interpolator) {
                this.f5794a = i3;
                this.f5795b = i4;
                this.f5796c = i5;
                this.f5798e = interpolator;
                this.f5799f = true;
            }

            public a(int i3, int i4, int i5, Interpolator interpolator) {
                this.f5797d = -1;
                this.f5799f = false;
                this.f5800g = 0;
                this.f5794a = i3;
                this.f5795b = i4;
                this.f5796c = i5;
                this.f5798e = interpolator;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y$b */
        public interface b {
            /* JADX INFO: renamed from: d */
            PointF mo5479d(int i3);
        }

        /* JADX INFO: renamed from: a */
        public PointF mo5943a(int i3) {
            Object objM5947e = m5947e();
            if (objM5947e instanceof b) {
                return ((b) objM5947e).mo5479d(i3);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* JADX INFO: renamed from: b */
        public View m5944b(int i3) {
            return this.f5787b.f5663m.mo5466H(i3);
        }

        /* JADX INFO: renamed from: c */
        public int m5945c() {
            return this.f5787b.f5663m.m5809O();
        }

        /* JADX INFO: renamed from: d */
        public int m5946d(View view) {
            return this.f5787b.m5596d0(view);
        }

        /* JADX INFO: renamed from: e */
        public AbstractC1205p m5947e() {
            return this.f5788c;
        }

        /* JADX INFO: renamed from: f */
        public int m5948f() {
            return this.f5786a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m5949g() {
            return this.f5789d;
        }

        /* JADX INFO: renamed from: h */
        public boolean m5950h() {
            return this.f5790e;
        }

        /* JADX INFO: renamed from: i */
        protected void m5951i(PointF pointF) {
            float f3 = pointF.x;
            float f4 = pointF.y;
            float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        /* JADX INFO: renamed from: j */
        void m5952j(int i3, int i4) {
            PointF pointFMo5943a;
            RecyclerView recyclerView = this.f5787b;
            if (this.f5786a == -1 || recyclerView == null) {
                m5960r();
            }
            if (this.f5789d && this.f5791f == null && this.f5788c != null && (pointFMo5943a = mo5943a(this.f5786a)) != null) {
                float f3 = pointFMo5943a.x;
                if (f3 != 0.0f || pointFMo5943a.y != 0.0f) {
                    recyclerView.m5600g1((int) Math.signum(f3), (int) Math.signum(pointFMo5943a.y), null);
                }
            }
            this.f5789d = false;
            View view = this.f5791f;
            if (view != null) {
                if (m5946d(view) == this.f5786a) {
                    mo5957o(this.f5791f, recyclerView.f5654h0, this.f5792g);
                    this.f5792g.m5964c(recyclerView);
                    m5960r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f5791f = null;
                }
            }
            if (this.f5790e) {
                mo5954l(i3, i4, recyclerView.f5654h0, this.f5792g);
                boolean zM5962a = this.f5792g.m5962a();
                this.f5792g.m5964c(recyclerView);
                if (zM5962a && this.f5790e) {
                    this.f5789d = true;
                    recyclerView.f5648e0.m5643d();
                }
            }
        }

        /* JADX INFO: renamed from: k */
        protected void m5953k(View view) {
            if (m5946d(view) == m5948f()) {
                this.f5791f = view;
            }
        }

        /* JADX INFO: renamed from: l */
        protected abstract void mo5954l(int i3, int i4, C1215z c1215z, a aVar);

        /* JADX INFO: renamed from: m */
        protected abstract void mo5955m();

        /* JADX INFO: renamed from: n */
        protected abstract void mo5956n();

        /* JADX INFO: renamed from: o */
        protected abstract void mo5957o(View view, C1215z c1215z, a aVar);

        /* JADX INFO: renamed from: p */
        public void m5958p(int i3) {
            this.f5786a = i3;
        }

        /* JADX INFO: renamed from: q */
        void m5959q(RecyclerView recyclerView, AbstractC1205p abstractC1205p) {
            recyclerView.f5648e0.m5645f();
            if (this.f5793h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f5787b = recyclerView;
            this.f5788c = abstractC1205p;
            int i3 = this.f5786a;
            if (i3 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f5654h0.f5801a = i3;
            this.f5790e = true;
            this.f5789d = true;
            this.f5791f = m5944b(m5948f());
            mo5955m();
            this.f5787b.f5648e0.m5643d();
            this.f5793h = true;
        }

        /* JADX INFO: renamed from: r */
        protected final void m5960r() {
            if (this.f5790e) {
                this.f5790e = false;
                mo5956n();
                this.f5787b.f5654h0.f5801a = -1;
                this.f5791f = null;
                this.f5786a = -1;
                this.f5789d = false;
                this.f5788c.m5844j1(this);
                this.f5788c = null;
                this.f5787b = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C1215z {

        /* JADX INFO: renamed from: b */
        private SparseArray f5802b;

        /* JADX INFO: renamed from: m */
        int f5813m;

        /* JADX INFO: renamed from: n */
        long f5814n;

        /* JADX INFO: renamed from: o */
        int f5815o;

        /* JADX INFO: renamed from: p */
        int f5816p;

        /* JADX INFO: renamed from: q */
        int f5817q;

        /* JADX INFO: renamed from: a */
        int f5801a = -1;

        /* JADX INFO: renamed from: c */
        int f5803c = 0;

        /* JADX INFO: renamed from: d */
        int f5804d = 0;

        /* JADX INFO: renamed from: e */
        int f5805e = 1;

        /* JADX INFO: renamed from: f */
        int f5806f = 0;

        /* JADX INFO: renamed from: g */
        boolean f5807g = false;

        /* JADX INFO: renamed from: h */
        boolean f5808h = false;

        /* JADX INFO: renamed from: i */
        boolean f5809i = false;

        /* JADX INFO: renamed from: j */
        boolean f5810j = false;

        /* JADX INFO: renamed from: k */
        boolean f5811k = false;

        /* JADX INFO: renamed from: l */
        boolean f5812l = false;

        /* JADX INFO: renamed from: a */
        void m5966a(int i3) {
            if ((this.f5805e & i3) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i3) + " but it is " + Integer.toBinaryString(this.f5805e));
        }

        /* JADX INFO: renamed from: b */
        public int m5967b() {
            return this.f5808h ? this.f5803c - this.f5804d : this.f5806f;
        }

        /* JADX INFO: renamed from: c */
        public int m5968c() {
            return this.f5801a;
        }

        /* JADX INFO: renamed from: d */
        public boolean m5969d() {
            return this.f5801a != -1;
        }

        /* JADX INFO: renamed from: e */
        public boolean m5970e() {
            return this.f5808h;
        }

        /* JADX INFO: renamed from: f */
        void m5971f(AbstractC1197h abstractC1197h) {
            this.f5805e = 1;
            this.f5806f = abstractC1197h.mo5715d();
            this.f5808h = false;
            this.f5809i = false;
            this.f5810j = false;
        }

        /* JADX INFO: renamed from: g */
        public boolean m5972g() {
            return this.f5812l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5801a + ", mData=" + this.f5802b + ", mItemCount=" + this.f5806f + ", mIsMeasuring=" + this.f5810j + ", mPreviousLayoutItemCount=" + this.f5803c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5804d + ", mStructureChanged=" + this.f5807g + ", mInPreLayout=" + this.f5808h + ", mRunSimpleAnimations=" + this.f5811k + ", mRunPredictiveAnimations=" + this.f5812l + '}';
        }
    }

    static {
        Class cls = Integer.TYPE;
        f5614H0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5615I0 = new InterpolatorC1192c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1833a.f9233a);
    }

    /* JADX INFO: renamed from: A */
    private void m5514A() {
        int i3 = this.f5689z;
        this.f5689z = 0;
        if (i3 == 0 || !m5625s0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC0333b.m1177b(accessibilityEventObtain, i3);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    /* JADX INFO: renamed from: C */
    private void m5515C() {
        this.f5654h0.m5966a(1);
        m5579Q(this.f5654h0);
        this.f5654h0.f5810j = false;
        m5621q1();
        this.f5649f.m6272f();
        m5564G0();
        m5521O0();
        m5534d1();
        C1215z c1215z = this.f5654h0;
        c1215z.f5809i = c1215z.f5811k && this.f5662l0;
        this.f5662l0 = false;
        this.f5660k0 = false;
        c1215z.f5808h = c1215z.f5812l;
        c1215z.f5806f = this.f5661l.mo5715d();
        m5526U(this.f5670p0);
        if (this.f5654h0.f5811k) {
            int iM6113g = this.f5647e.m6113g();
            for (int i3 = 0; i3 < iM6113g; i3++) {
                AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6112f(i3));
                if (!abstractC1188CM5537f0.m5656J() && (!abstractC1188CM5537f0.m5677t() || this.f5661l.m5719h())) {
                    this.f5649f.m6271e(abstractC1188CM5537f0, this.f5628M.m5761t(this.f5654h0, abstractC1188CM5537f0, AbstractC1202m.m5742e(abstractC1188CM5537f0), abstractC1188CM5537f0.m5672o()));
                    if (this.f5654h0.f5809i && abstractC1188CM5537f0.m5682y() && !abstractC1188CM5537f0.m5679v() && !abstractC1188CM5537f0.m5656J() && !abstractC1188CM5537f0.m5677t()) {
                        this.f5649f.m6269c(m5595c0(abstractC1188CM5537f0), abstractC1188CM5537f0);
                    }
                }
            }
        }
        if (this.f5654h0.f5812l) {
            m5598e1();
            C1215z c1215z2 = this.f5654h0;
            boolean z2 = c1215z2.f5807g;
            c1215z2.f5807g = false;
            this.f5663m.mo5416b1(this.f5641b, c1215z2);
            this.f5654h0.f5807g = z2;
            for (int i4 = 0; i4 < this.f5647e.m6113g(); i4++) {
                AbstractC1188C abstractC1188CM5537f02 = m5537f0(this.f5647e.m6112f(i4));
                if (!abstractC1188CM5537f02.m5656J() && !this.f5649f.m6275i(abstractC1188CM5537f02)) {
                    int iM5742e = AbstractC1202m.m5742e(abstractC1188CM5537f02);
                    boolean zM5673p = abstractC1188CM5537f02.m5673p(8192);
                    if (!zM5673p) {
                        iM5742e |= 4096;
                    }
                    AbstractC1202m.b bVarM5761t = this.f5628M.m5761t(this.f5654h0, abstractC1188CM5537f02, iM5742e, abstractC1188CM5537f02.m5672o());
                    if (zM5673p) {
                        m5581R0(abstractC1188CM5537f02, bVarM5761t);
                    } else {
                        this.f5649f.m6267a(abstractC1188CM5537f02, bVarM5761t);
                    }
                }
            }
            m5624s();
        } else {
            m5624s();
        }
        m5566H0();
        m5626s1(false);
        this.f5654h0.f5805e = 2;
    }

    /* JADX INFO: renamed from: D */
    private void m5516D() {
        m5621q1();
        m5564G0();
        this.f5654h0.m5966a(6);
        this.f5645d.m6092j();
        this.f5654h0.f5806f = this.f5661l.mo5715d();
        this.f5654h0.f5804d = 0;
        if (this.f5643c != null && this.f5661l.m5713b()) {
            Parcelable parcelable = this.f5643c.f5718f;
            if (parcelable != null) {
                this.f5663m.mo5482g1(parcelable);
            }
            this.f5643c = null;
        }
        C1215z c1215z = this.f5654h0;
        c1215z.f5808h = false;
        this.f5663m.mo5416b1(this.f5641b, c1215z);
        C1215z c1215z2 = this.f5654h0;
        c1215z2.f5807g = false;
        c1215z2.f5811k = c1215z2.f5811k && this.f5628M != null;
        c1215z2.f5805e = 4;
        m5566H0();
        m5626s1(false);
    }

    /* JADX INFO: renamed from: E */
    private void m5517E() {
        RecyclerView recyclerView;
        this.f5654h0.m5966a(4);
        m5621q1();
        m5564G0();
        C1215z c1215z = this.f5654h0;
        c1215z.f5805e = 1;
        if (c1215z.f5811k) {
            for (int iM6113g = this.f5647e.m6113g() - 1; iM6113g >= 0; iM6113g--) {
                AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6112f(iM6113g));
                if (!abstractC1188CM5537f0.m5656J()) {
                    long jM5595c0 = m5595c0(abstractC1188CM5537f0);
                    AbstractC1202m.b bVarM5760s = this.f5628M.m5760s(this.f5654h0, abstractC1188CM5537f0);
                    AbstractC1188C abstractC1188CM6273g = this.f5649f.m6273g(jM5595c0);
                    if (abstractC1188CM6273g == null || abstractC1188CM6273g.m5656J()) {
                        this.f5649f.m6270d(abstractC1188CM5537f0, bVarM5760s);
                    } else {
                        boolean zM6274h = this.f5649f.m6274h(abstractC1188CM6273g);
                        boolean zM6274h2 = this.f5649f.m6274h(abstractC1188CM5537f0);
                        if (zM6274h && abstractC1188CM6273g == abstractC1188CM5537f0) {
                            this.f5649f.m6270d(abstractC1188CM5537f0, bVarM5760s);
                        } else {
                            AbstractC1202m.b bVarM6279n = this.f5649f.m6279n(abstractC1188CM6273g);
                            this.f5649f.m6270d(abstractC1188CM5537f0, bVarM5760s);
                            AbstractC1202m.b bVarM6278m = this.f5649f.m6278m(abstractC1188CM5537f0);
                            if (bVarM6279n == null) {
                                m5543k0(jM5595c0, abstractC1188CM5537f0, abstractC1188CM6273g);
                            } else {
                                m5544m(abstractC1188CM6273g, abstractC1188CM5537f0, bVarM6279n, bVarM6278m, zM6274h, zM6274h2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f5649f.m6280o(recyclerView.f5690z0);
        } else {
            recyclerView = this;
        }
        recyclerView.f5663m.m5857p1(recyclerView.f5641b);
        C1215z c1215z2 = recyclerView.f5654h0;
        c1215z2.f5803c = c1215z2.f5806f;
        recyclerView.f5619D = false;
        recyclerView.f5620E = false;
        c1215z2.f5811k = false;
        c1215z2.f5812l = false;
        recyclerView.f5663m.f5750h = false;
        ArrayList arrayList = recyclerView.f5641b.f5778b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1205p abstractC1205p = recyclerView.f5663m;
        if (abstractC1205p.f5756n) {
            abstractC1205p.f5755m = 0;
            abstractC1205p.f5756n = false;
            recyclerView.f5641b.m5916K();
        }
        recyclerView.f5663m.mo5417c1(recyclerView.f5654h0);
        m5566H0();
        m5626s1(false);
        recyclerView.f5649f.m6272f();
        int[] iArr = recyclerView.f5670p0;
        if (m5553x(iArr[0], iArr[1])) {
            m5567I(0, 0);
        }
        m5523S0();
        m5530b1();
    }

    /* JADX INFO: renamed from: J0 */
    private void m5518J0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5630O) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f5630O = motionEvent.getPointerId(i3);
            int x2 = (int) (motionEvent.getX(i3) + 0.5f);
            this.f5634S = x2;
            this.f5632Q = x2;
            int y2 = (int) (motionEvent.getY(i3) + 0.5f);
            this.f5635T = y2;
            this.f5633R = y2;
        }
    }

    /* JADX INFO: renamed from: K */
    private boolean m5519K(MotionEvent motionEvent) {
        InterfaceC1208s interfaceC1208s = this.f5671q;
        if (interfaceC1208s == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m5524T(motionEvent);
        }
        interfaceC1208s.mo5887b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f5671q = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    private boolean m5520N0() {
        return this.f5628M != null && this.f5663m.mo5406P1();
    }

    /* JADX INFO: renamed from: O0 */
    private void m5521O0() {
        boolean z2;
        if (this.f5619D) {
            this.f5645d.m6102v();
            if (this.f5620E) {
                this.f5663m.mo5411W0(this);
            }
        }
        if (m5520N0()) {
            this.f5645d.m6100t();
        } else {
            this.f5645d.m6092j();
        }
        boolean z3 = this.f5660k0 || this.f5662l0;
        this.f5654h0.f5811k = this.f5679u && this.f5628M != null && ((z2 = this.f5619D) || z3 || this.f5663m.f5750h) && (!z2 || this.f5661l.m5719h());
        C1215z c1215z = this.f5654h0;
        c1215z.f5812l = c1215z.f5811k && z3 && !this.f5619D && m5520N0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX INFO: renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5522Q0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.m5573M()
            android.widget.EdgeEffect r1 = r6.f5624I
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.AbstractC0983d.m4362c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.m5575N()
            android.widget.EdgeEffect r1 = r6.f5626K
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.AbstractC0983d.m4362c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.m5576O()
            android.widget.EdgeEffect r9 = r6.f5625J
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.AbstractC0983d.m4362c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.m5571L()
            android.widget.EdgeEffect r9 = r6.f5627L
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.AbstractC0983d.m4362c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            p027J.AbstractC0268W.m757Z(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m5522Q0(float, float, float, float):void");
    }

    /* JADX INFO: renamed from: S0 */
    private void m5523S0() {
        View viewFindViewById;
        if (!this.f5646d0 || this.f5661l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f5613G0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f5647e.m6118n(focusedChild)) {
                    return;
                }
            } else if (this.f5647e.m6113g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewM5528W = null;
        AbstractC1188C abstractC1188CM5588Y = (this.f5654h0.f5814n == -1 || !this.f5661l.m5719h()) ? null : m5588Y(this.f5654h0.f5814n);
        if (abstractC1188CM5588Y != null && !this.f5647e.m6118n(abstractC1188CM5588Y.f5699a) && abstractC1188CM5588Y.f5699a.hasFocusable()) {
            viewM5528W = abstractC1188CM5588Y.f5699a;
        } else if (this.f5647e.m6113g() > 0) {
            viewM5528W = m5528W();
        }
        if (viewM5528W != null) {
            int i3 = this.f5654h0.f5815o;
            if (i3 != -1 && (viewFindViewById = viewM5528W.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                viewM5528W = viewFindViewById;
            }
            viewM5528W.requestFocus();
        }
    }

    /* JADX INFO: renamed from: T */
    private boolean m5524T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f5669p.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1208s interfaceC1208s = (InterfaceC1208s) this.f5669p.get(i3);
            if (interfaceC1208s.mo5886a(this, motionEvent) && action != 3) {
                this.f5671q = interfaceC1208s;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: T0 */
    private void m5525T0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f5624I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f5624I.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f5625J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f5625J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5626K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f5626K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5627L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f5627L.isFinished();
        }
        if (zIsFinished) {
            AbstractC0268W.m757Z(this);
        }
    }

    /* JADX INFO: renamed from: U */
    private void m5526U(int[] iArr) {
        int iM6113g = this.f5647e.m6113g();
        if (iM6113g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < iM6113g; i5++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6112f(i5));
            if (!abstractC1188CM5537f0.m5656J()) {
                int iM5670m = abstractC1188CM5537f0.m5670m();
                if (iM5670m < i3) {
                    i3 = iM5670m;
                }
                if (iM5670m > i4) {
                    i4 = iM5670m;
                }
            }
        }
        iArr[0] = i3;
        iArr[1] = i4;
    }

    /* JADX INFO: renamed from: V */
    static RecyclerView m5527V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView recyclerViewM5527V = m5527V(viewGroup.getChildAt(i3));
            if (recyclerViewM5527V != null) {
                return recyclerViewM5527V;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    private View m5528W() {
        AbstractC1188C abstractC1188CM5586X;
        C1215z c1215z = this.f5654h0;
        int i3 = c1215z.f5813m;
        if (i3 == -1) {
            i3 = 0;
        }
        int iM5967b = c1215z.m5967b();
        for (int i4 = i3; i4 < iM5967b; i4++) {
            AbstractC1188C abstractC1188CM5586X2 = m5586X(i4);
            if (abstractC1188CM5586X2 == null) {
                break;
            }
            if (abstractC1188CM5586X2.f5699a.hasFocusable()) {
                return abstractC1188CM5586X2.f5699a;
            }
        }
        int iMin = Math.min(iM5967b, i3);
        do {
            iMin--;
            if (iMin < 0 || (abstractC1188CM5586X = m5586X(iMin)) == null) {
                return null;
            }
        } while (!abstractC1188CM5586X.f5699a.hasFocusable());
        return abstractC1188CM5586X.f5699a;
    }

    /* JADX INFO: renamed from: a1 */
    private void m5529a1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f5655i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1206q) {
            C1206q c1206q = (C1206q) layoutParams;
            if (!c1206q.f5769c) {
                Rect rect = c1206q.f5768b;
                Rect rect2 = this.f5655i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f5655i);
            offsetRectIntoDescendantCoords(view, this.f5655i);
        }
        this.f5663m.mo5870w1(this, view, this.f5655i, !this.f5679u, view2 == null);
    }

    /* JADX INFO: renamed from: b1 */
    private void m5530b1() {
        C1215z c1215z = this.f5654h0;
        c1215z.f5814n = -1L;
        c1215z.f5813m = -1;
        c1215z.f5815o = -1;
    }

    /* JADX INFO: renamed from: c1 */
    private void m5532c1() {
        VelocityTracker velocityTracker = this.f5631P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m5629t1(0);
        m5525T0();
    }

    /* JADX INFO: renamed from: d1 */
    private void m5534d1() {
        View focusedChild = (this.f5646d0 && hasFocus() && this.f5661l != null) ? getFocusedChild() : null;
        AbstractC1188C abstractC1188CM5582S = focusedChild != null ? m5582S(focusedChild) : null;
        if (abstractC1188CM5582S == null) {
            m5530b1();
            return;
        }
        this.f5654h0.f5814n = this.f5661l.m5719h() ? abstractC1188CM5582S.m5668k() : -1L;
        this.f5654h0.f5813m = this.f5619D ? -1 : abstractC1188CM5582S.m5679v() ? abstractC1188CM5582S.f5702d : abstractC1188CM5582S.m5667j();
        this.f5654h0.f5815o = m5540h0(abstractC1188CM5582S.f5699a);
    }

    /* JADX INFO: renamed from: f0 */
    static AbstractC1188C m5537f0(View view) {
        if (view == null) {
            return null;
        }
        return ((C1206q) view.getLayoutParams()).f5767a;
    }

    /* JADX INFO: renamed from: g */
    private void m5538g(AbstractC1188C abstractC1188C) {
        View view = abstractC1188C.f5699a;
        boolean z2 = view.getParent() == this;
        this.f5641b.m5915J(m5597e0(view));
        if (abstractC1188C.m5681x()) {
            this.f5647e.m6109c(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            this.f5647e.m6116k(view);
        } else {
            this.f5647e.m6108b(view, true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    static void m5539g0(View view, Rect rect) {
        C1206q c1206q = (C1206q) view.getLayoutParams();
        Rect rect2 = c1206q.f5768b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1206q).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1206q).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1206q).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1206q).bottomMargin);
    }

    private C0227B getScrollingChildHelper() {
        if (this.f5672q0 == null) {
            this.f5672q0 = new C0227B(this);
        }
        return this.f5672q0;
    }

    /* JADX INFO: renamed from: h0 */
    private int m5540h0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* JADX INFO: renamed from: i0 */
    private String m5541i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    /* JADX INFO: renamed from: i1 */
    private void m5542i1(AbstractC1197h abstractC1197h, boolean z2, boolean z3) {
        AbstractC1197h abstractC1197h2 = this.f5661l;
        if (abstractC1197h2 != null) {
            abstractC1197h2.m5734w(this.f5639a);
            this.f5661l.m5727p(this);
        }
        if (!z2 || z3) {
            m5583U0();
        }
        this.f5645d.m6102v();
        AbstractC1197h abstractC1197h3 = this.f5661l;
        this.f5661l = abstractC1197h;
        if (abstractC1197h != null) {
            abstractC1197h.m5732u(this.f5639a);
            abstractC1197h.m5723l(this);
        }
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            abstractC1205p.mo5798I0(abstractC1197h3, this.f5661l);
        }
        this.f5641b.m5939x(abstractC1197h3, this.f5661l, z2);
        this.f5654h0.f5807g = true;
    }

    /* JADX INFO: renamed from: k0 */
    private void m5543k0(long j3, AbstractC1188C abstractC1188C, AbstractC1188C abstractC1188C2) {
        int iM6113g = this.f5647e.m6113g();
        for (int i3 = 0; i3 < iM6113g; i3++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6112f(i3));
            if (abstractC1188CM5537f0 != abstractC1188C && m5595c0(abstractC1188CM5537f0) == j3) {
                AbstractC1197h abstractC1197h = this.f5661l;
                if (abstractC1197h == null || !abstractC1197h.m5719h()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC1188CM5537f0 + " \n View Holder 2:" + abstractC1188C + m5577P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC1188CM5537f0 + " \n View Holder 2:" + abstractC1188C + m5577P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC1188C2 + " cannot be found but it is necessary for " + abstractC1188C + m5577P());
    }

    /* JADX INFO: renamed from: m */
    private void m5544m(AbstractC1188C abstractC1188C, AbstractC1188C abstractC1188C2, AbstractC1202m.b bVar, AbstractC1202m.b bVar2, boolean z2, boolean z3) {
        abstractC1188C.m5653G(false);
        if (z2) {
            m5538g(abstractC1188C);
        }
        if (abstractC1188C != abstractC1188C2) {
            if (z3) {
                m5538g(abstractC1188C2);
            }
            abstractC1188C.f5706h = abstractC1188C2;
            m5538g(abstractC1188C);
            this.f5641b.m5915J(abstractC1188C);
            abstractC1188C2.m5653G(false);
            abstractC1188C2.f5707i = abstractC1188C;
        }
        if (this.f5628M.mo5744b(abstractC1188C, abstractC1188C2, bVar, bVar2)) {
            m5574M0();
        }
    }

    /* JADX INFO: renamed from: m0 */
    private boolean m5545m0() {
        int iM6113g = this.f5647e.m6113g();
        for (int i3 = 0; i3 < iM6113g; i3++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6112f(i3));
            if (abstractC1188CM5537f0 != null && !abstractC1188CM5537f0.m5656J() && abstractC1188CM5537f0.m5682y()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    private void m5546o0() {
        if (AbstractC0268W.m804x(this) == 0) {
            AbstractC0268W.m793r0(this, 8);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m5547p0() {
        this.f5647e = new C1223b(new C1194e());
    }

    /* JADX INFO: renamed from: q */
    private void m5548q() {
        m5532c1();
        setScrollState(0);
    }

    /* JADX INFO: renamed from: r */
    static void m5549r(AbstractC1188C abstractC1188C) {
        WeakReference weakReference = abstractC1188C.f5700b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC1188C.f5699a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC1188C.f5700b = null;
        }
    }

    /* JADX INFO: renamed from: u0 */
    private boolean m5550u0(View view, View view2, int i3) {
        int i4;
        if (view2 == null || view2 == this || view2 == view || m5580R(view2) == null) {
            return false;
        }
        if (view == null || m5580R(view) == null) {
            return true;
        }
        this.f5655i.set(0, 0, view.getWidth(), view.getHeight());
        this.f5657j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f5655i);
        offsetDescendantRectToMyCoords(view2, this.f5657j);
        byte b3 = -1;
        int i5 = this.f5663m.m5828d0() == 1 ? -1 : 1;
        Rect rect = this.f5655i;
        int i6 = rect.left;
        Rect rect2 = this.f5657j;
        int i7 = rect2.left;
        if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
            i4 = 1;
        } else {
            int i8 = rect.right;
            int i9 = rect2.right;
            i4 = ((i8 > i9 || i6 >= i9) && i6 > i7) ? -1 : 0;
        }
        int i10 = rect.top;
        int i11 = rect2.top;
        if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
            b3 = 1;
        } else {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if ((i12 <= i13 && i10 < i13) || i10 <= i11) {
                b3 = 0;
            }
        }
        if (i3 == 1) {
            return b3 < 0 || (b3 == 0 && i4 * i5 < 0);
        }
        if (i3 == 2) {
            return b3 > 0 || (b3 == 0 && i4 * i5 > 0);
        }
        if (i3 == 17) {
            return i4 < 0;
        }
        if (i3 == 33) {
            return b3 < 0;
        }
        if (i3 == 66) {
            return i4 > 0;
        }
        if (i3 == 130) {
            return b3 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i3 + m5577P());
    }

    /* JADX INFO: renamed from: v */
    private void m5551v(Context context, String str, AttributeSet attributeSet, int i3, int i4) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM5541i0 = m5541i0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strM5541i0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1205p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f5614H0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i3), Integer.valueOf(i4)};
                } catch (NoSuchMethodException e3) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e4) {
                        e4.initCause(e3);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM5541i0, e4);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC1205p) constructor.newInstance(objArr));
            } catch (ClassCastException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM5541i0, e5);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM5541i0, e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM5541i0, e7);
            } catch (InstantiationException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM5541i0, e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM5541i0, e9);
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    private void m5552v1() {
        this.f5648e0.m5645f();
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            abstractC1205p.m5810O1();
        }
    }

    /* JADX INFO: renamed from: x */
    private boolean m5553x(int i3, int i4) {
        m5526U(this.f5670p0);
        int[] iArr = this.f5670p0;
        return (iArr[0] == i3 && iArr[1] == i4) ? false : true;
    }

    /* JADX INFO: renamed from: y0 */
    private void m5554y0(int i3, int i4, MotionEvent motionEvent, int i5) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5685x) {
            return;
        }
        int[] iArr = this.f5678t0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zMo5487p = abstractC1205p.mo5487p();
        boolean zMo5489q = this.f5663m.mo5489q();
        m5623r1(zMo5489q ? (zMo5487p ? 1 : 0) | 2 : zMo5487p ? 1 : 0, i5);
        if (m5561F(zMo5487p ? i3 : 0, zMo5489q ? i4 : 0, this.f5678t0, this.f5674r0, i5)) {
            int[] iArr2 = this.f5678t0;
            i3 -= iArr2[0];
            i4 -= iArr2[1];
        }
        m5599f1(zMo5487p ? i3 : 0, zMo5489q ? i4 : 0, motionEvent, i5);
        RunnableC1226e runnableC1226e = this.f5650f0;
        if (runnableC1226e != null && (i3 != 0 || i4 != 0)) {
            runnableC1226e.m6173f(this, i3, i4);
        }
        m5629t1(i5);
    }

    /* JADX INFO: renamed from: A0 */
    public void m5555A0(int i3) {
        int iM6113g = this.f5647e.m6113g();
        for (int i4 = 0; i4 < iM6113g; i4++) {
            this.f5647e.m6112f(i4).offsetTopAndBottom(i3);
        }
    }

    /* JADX INFO: renamed from: B */
    void m5556B() {
        if (this.f5661l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f5663m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f5654h0.f5810j = false;
        boolean z2 = this.f5684w0 && !(this.f5686x0 == getWidth() && this.f5688y0 == getHeight());
        this.f5686x0 = 0;
        this.f5688y0 = 0;
        this.f5684w0 = false;
        if (this.f5654h0.f5805e == 1) {
            m5515C();
            this.f5663m.m5787D1(this);
            m5516D();
        } else if (this.f5645d.m6098q() || z2 || this.f5663m.m5862s0() != getWidth() || this.f5663m.m5826b0() != getHeight()) {
            this.f5663m.m5787D1(this);
            m5516D();
        } else {
            this.f5663m.m5787D1(this);
        }
        m5517E();
    }

    /* JADX INFO: renamed from: B0 */
    void m5557B0(int i3, int i4) {
        int iM6115j = this.f5647e.m6115j();
        for (int i5 = 0; i5 < iM6115j; i5++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6114i(i5));
            if (abstractC1188CM5537f0 != null && !abstractC1188CM5537f0.m5656J() && abstractC1188CM5537f0.f5701c >= i3) {
                abstractC1188CM5537f0.m5647A(i4, false);
                this.f5654h0.f5807g = true;
            }
        }
        this.f5641b.m5936u(i3, i4);
        requestLayout();
    }

    /* JADX INFO: renamed from: C0 */
    void m5558C0(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int iM6115j = this.f5647e.m6115j();
        if (i3 < i4) {
            i7 = -1;
            i6 = i3;
            i5 = i4;
        } else {
            i5 = i3;
            i6 = i4;
            i7 = 1;
        }
        for (int i9 = 0; i9 < iM6115j; i9++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6114i(i9));
            if (abstractC1188CM5537f0 != null && (i8 = abstractC1188CM5537f0.f5701c) >= i6 && i8 <= i5) {
                if (i8 == i3) {
                    abstractC1188CM5537f0.m5647A(i4 - i3, false);
                } else {
                    abstractC1188CM5537f0.m5647A(i7, false);
                }
                this.f5654h0.f5807g = true;
            }
        }
        this.f5641b.m5937v(i3, i4);
        requestLayout();
    }

    /* JADX INFO: renamed from: D0 */
    void m5559D0(int i3, int i4, boolean z2) {
        int i5 = i3 + i4;
        int iM6115j = this.f5647e.m6115j();
        for (int i6 = 0; i6 < iM6115j; i6++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6114i(i6));
            if (abstractC1188CM5537f0 != null && !abstractC1188CM5537f0.m5656J()) {
                int i7 = abstractC1188CM5537f0.f5701c;
                if (i7 >= i5) {
                    abstractC1188CM5537f0.m5647A(-i4, z2);
                    this.f5654h0.f5807g = true;
                } else if (i7 >= i3) {
                    abstractC1188CM5537f0.m5666i(i3 - 1, -i4, z2);
                    this.f5654h0.f5807g = true;
                }
            }
        }
        this.f5641b.m5938w(i3, i4, z2);
        requestLayout();
    }

    /* JADX INFO: renamed from: E0 */
    public void m5560E0(View view) {
    }

    /* JADX INFO: renamed from: F */
    public boolean m5561F(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        return getScrollingChildHelper().m636d(i3, i4, iArr, iArr2, i5);
    }

    /* JADX INFO: renamed from: F0 */
    public void m5562F0(View view) {
    }

    /* JADX INFO: renamed from: G */
    public final void m5563G(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().m637e(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    /* JADX INFO: renamed from: G0 */
    void m5564G0() {
        this.f5621F++;
    }

    /* JADX INFO: renamed from: H */
    void m5565H(int i3) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            abstractC1205p.mo5841i1(i3);
        }
        m5570K0(i3);
        AbstractC1209t abstractC1209t = this.f5656i0;
        if (abstractC1209t != null) {
            abstractC1209t.mo5889a(this, i3);
        }
        List list = this.f5658j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC1209t) this.f5658j0.get(size)).mo5889a(this, i3);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    void m5566H0() {
        m5568I0(true);
    }

    /* JADX INFO: renamed from: I */
    void m5567I(int i3, int i4) {
        this.f5622G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i3, scrollY - i4);
        m5572L0(i3, i4);
        AbstractC1209t abstractC1209t = this.f5656i0;
        if (abstractC1209t != null) {
            abstractC1209t.mo5890b(this, i3, i4);
        }
        List list = this.f5658j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC1209t) this.f5658j0.get(size)).mo5890b(this, i3, i4);
            }
        }
        this.f5622G--;
    }

    /* JADX INFO: renamed from: I0 */
    void m5568I0(boolean z2) {
        int i3 = this.f5621F - 1;
        this.f5621F = i3;
        if (i3 < 1) {
            this.f5621F = 0;
            if (z2) {
                m5514A();
                m5569J();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    void m5569J() {
        int i3;
        for (int size = this.f5680u0.size() - 1; size >= 0; size--) {
            AbstractC1188C abstractC1188C = (AbstractC1188C) this.f5680u0.get(size);
            if (abstractC1188C.f5699a.getParent() == this && !abstractC1188C.m5656J() && (i3 = abstractC1188C.f5715q) != -1) {
                AbstractC0268W.m789p0(abstractC1188C.f5699a, i3);
                abstractC1188C.f5715q = -1;
            }
        }
        this.f5680u0.clear();
    }

    /* JADX INFO: renamed from: K0 */
    public void m5570K0(int i3) {
    }

    /* JADX INFO: renamed from: L */
    void m5571L() {
        if (this.f5627L != null) {
            return;
        }
        EdgeEffect edgeEffectM5741a = this.f5623H.m5741a(this, 3);
        this.f5627L = edgeEffectM5741a;
        if (this.f5651g) {
            edgeEffectM5741a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM5741a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m5572L0(int i3, int i4) {
    }

    /* JADX INFO: renamed from: M */
    void m5573M() {
        if (this.f5624I != null) {
            return;
        }
        EdgeEffect edgeEffectM5741a = this.f5623H.m5741a(this, 0);
        this.f5624I = edgeEffectM5741a;
        if (this.f5651g) {
            edgeEffectM5741a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM5741a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: M0 */
    void m5574M0() {
        if (this.f5666n0 || !this.f5673r) {
            return;
        }
        AbstractC0268W.m759a0(this, this.f5682v0);
        this.f5666n0 = true;
    }

    /* JADX INFO: renamed from: N */
    void m5575N() {
        if (this.f5626K != null) {
            return;
        }
        EdgeEffect edgeEffectM5741a = this.f5623H.m5741a(this, 2);
        this.f5626K = edgeEffectM5741a;
        if (this.f5651g) {
            edgeEffectM5741a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM5741a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: O */
    void m5576O() {
        if (this.f5625J != null) {
            return;
        }
        EdgeEffect edgeEffectM5741a = this.f5623H.m5741a(this, 1);
        this.f5625J = edgeEffectM5741a;
        if (this.f5651g) {
            edgeEffectM5741a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM5741a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: P */
    String m5577P() {
        return " " + super.toString() + ", adapter:" + this.f5661l + ", layout:" + this.f5663m + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: P0 */
    void m5578P0(boolean z2) {
        this.f5620E = z2 | this.f5620E;
        this.f5619D = true;
        m5636x0();
    }

    /* JADX INFO: renamed from: Q */
    final void m5579Q(C1215z c1215z) {
        if (getScrollState() != 2) {
            c1215z.f5816p = 0;
            c1215z.f5817q = 0;
        } else {
            OverScroller overScroller = this.f5648e0.f5693f;
            c1215z.f5816p = overScroller.getFinalX() - overScroller.getCurrX();
            c1215z.f5817q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* JADX INFO: renamed from: R */
    public View m5580R(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: R0 */
    void m5581R0(AbstractC1188C abstractC1188C, AbstractC1202m.b bVar) {
        abstractC1188C.m5652F(0, 8192);
        if (this.f5654h0.f5809i && abstractC1188C.m5682y() && !abstractC1188C.m5679v() && !abstractC1188C.m5656J()) {
            this.f5649f.m6269c(m5595c0(abstractC1188C), abstractC1188C);
        }
        this.f5649f.m6271e(abstractC1188C, bVar);
    }

    /* JADX INFO: renamed from: S */
    public AbstractC1188C m5582S(View view) {
        View viewM5580R = m5580R(view);
        if (viewM5580R == null) {
            return null;
        }
        return m5597e0(viewM5580R);
    }

    /* JADX INFO: renamed from: U0 */
    void m5583U0() {
        AbstractC1202m abstractC1202m = this.f5628M;
        if (abstractC1202m != null) {
            abstractC1202m.mo5752k();
        }
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            abstractC1205p.m5855o1(this.f5641b);
            this.f5663m.m5857p1(this.f5641b);
        }
        this.f5641b.m5920c();
    }

    /* JADX INFO: renamed from: V0 */
    boolean m5584V0(View view) {
        m5621q1();
        boolean zM6122r = this.f5647e.m6122r(view);
        if (zM6122r) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(view);
            this.f5641b.m5915J(abstractC1188CM5537f0);
            this.f5641b.m5909C(abstractC1188CM5537f0);
        }
        m5626s1(!zM6122r);
        return zM6122r;
    }

    /* JADX INFO: renamed from: W0 */
    public void m5585W0(AbstractC1204o abstractC1204o) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            abstractC1205p.mo5485l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f5667o.remove(abstractC1204o);
        if (this.f5667o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m5634w0();
        requestLayout();
    }

    /* JADX INFO: renamed from: X */
    public AbstractC1188C m5586X(int i3) {
        AbstractC1188C abstractC1188C = null;
        if (this.f5619D) {
            return null;
        }
        int iM6115j = this.f5647e.m6115j();
        for (int i4 = 0; i4 < iM6115j; i4++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6114i(i4));
            if (abstractC1188CM5537f0 != null && !abstractC1188CM5537f0.m5679v() && m5594b0(abstractC1188CM5537f0) == i3) {
                if (!this.f5647e.m6118n(abstractC1188CM5537f0.f5699a)) {
                    return abstractC1188CM5537f0;
                }
                abstractC1188C = abstractC1188CM5537f0;
            }
        }
        return abstractC1188C;
    }

    /* JADX INFO: renamed from: X0 */
    public void m5587X0(InterfaceC1208s interfaceC1208s) {
        this.f5669p.remove(interfaceC1208s);
        if (this.f5671q == interfaceC1208s) {
            this.f5671q = null;
        }
    }

    /* JADX INFO: renamed from: Y */
    public AbstractC1188C m5588Y(long j3) {
        AbstractC1197h abstractC1197h = this.f5661l;
        AbstractC1188C abstractC1188C = null;
        if (abstractC1197h != null && abstractC1197h.m5719h()) {
            int iM6115j = this.f5647e.m6115j();
            for (int i3 = 0; i3 < iM6115j; i3++) {
                AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6114i(i3));
                if (abstractC1188CM5537f0 != null && !abstractC1188CM5537f0.m5679v() && abstractC1188CM5537f0.m5668k() == j3) {
                    if (!this.f5647e.m6118n(abstractC1188CM5537f0.f5699a)) {
                        return abstractC1188CM5537f0;
                    }
                    abstractC1188C = abstractC1188CM5537f0;
                }
            }
        }
        return abstractC1188C;
    }

    /* JADX INFO: renamed from: Y0 */
    public void m5589Y0(AbstractC1209t abstractC1209t) {
        List list = this.f5658j0;
        if (list != null) {
            list.remove(abstractC1209t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.AbstractC1188C m5590Z(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f5647e
            int r0 = r0.m6115j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f5647e
            android.view.View r3 = r3.m6114i(r2)
            androidx.recyclerview.widget.RecyclerView$C r3 = m5537f0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.m5679v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f5701c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m5670m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f5647e
            android.view.View r4 = r3.f5699a
            boolean r1 = r1.m6118n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m5590Z(int, boolean):androidx.recyclerview.widget.RecyclerView$C");
    }

    /* JADX INFO: renamed from: Z0 */
    void m5591Z0() {
        AbstractC1188C abstractC1188C;
        int iM6113g = this.f5647e.m6113g();
        for (int i3 = 0; i3 < iM6113g; i3++) {
            View viewM6112f = this.f5647e.m6112f(i3);
            AbstractC1188C abstractC1188CM5597e0 = m5597e0(viewM6112f);
            if (abstractC1188CM5597e0 != null && (abstractC1188C = abstractC1188CM5597e0.f5707i) != null) {
                View view = abstractC1188C.f5699a;
                int left = viewM6112f.getLeft();
                int top = viewM6112f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m5592a(int i3, int i4) {
        if (i3 < 0) {
            m5573M();
            if (this.f5624I.isFinished()) {
                this.f5624I.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            m5575N();
            if (this.f5626K.isFinished()) {
                this.f5626K.onAbsorb(i3);
            }
        }
        if (i4 < 0) {
            m5576O();
            if (this.f5625J.isFinished()) {
                this.f5625J.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            m5571L();
            if (this.f5627L.isFinished()) {
                this.f5627L.onAbsorb(i4);
            }
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        AbstractC0268W.m757Z(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: a0 */
    public boolean m5593a0(int i3, int i4) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f5685x) {
            return false;
        }
        int iMo5487p = abstractC1205p.mo5487p();
        boolean zMo5489q = this.f5663m.mo5489q();
        if (iMo5487p == 0 || Math.abs(i3) < this.f5638W) {
            i3 = 0;
        }
        if (!zMo5489q || Math.abs(i4) < this.f5638W) {
            i4 = 0;
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        float f3 = i3;
        float f4 = i4;
        if (!dispatchNestedPreFling(f3, f4)) {
            boolean z2 = iMo5487p != 0 || zMo5489q;
            dispatchNestedFling(f3, f4, z2);
            AbstractC1207r abstractC1207r = this.f5637V;
            if (abstractC1207r != null && abstractC1207r.mo5885a(i3, i4)) {
                return true;
            }
            if (z2) {
                if (zMo5489q) {
                    iMo5487p = (iMo5487p == true ? 1 : 0) | 2;
                }
                m5623r1(iMo5487p, 1);
                int i5 = this.f5640a0;
                int iMax = Math.max(-i5, Math.min(i3, i5));
                int i6 = this.f5640a0;
                this.f5648e0.m5642b(iMax, Math.max(-i6, Math.min(i4, i6)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i3, int i4) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p == null || !abstractC1205p.m5800J0(this, arrayList, i3, i4)) {
            super.addFocusables(arrayList, i3, i4);
        }
    }

    /* JADX INFO: renamed from: b0 */
    int m5594b0(AbstractC1188C abstractC1188C) {
        if (abstractC1188C.m5673p(524) || !abstractC1188C.m5676s()) {
            return -1;
        }
        return this.f5645d.m6090e(abstractC1188C.f5701c);
    }

    /* JADX INFO: renamed from: c0 */
    long m5595c0(AbstractC1188C abstractC1188C) {
        return this.f5661l.m5719h() ? abstractC1188C.m5668k() : abstractC1188C.f5701c;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1206q) && this.f5663m.mo5421r((C1206q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null && abstractC1205p.mo5487p()) {
            return this.f5663m.mo5494v(this.f5654h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null && abstractC1205p.mo5487p()) {
            return this.f5663m.mo5424w(this.f5654h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null && abstractC1205p.mo5487p()) {
            return this.f5663m.mo5425x(this.f5654h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null && abstractC1205p.mo5489q()) {
            return this.f5663m.mo5496y(this.f5654h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null && abstractC1205p.mo5489q()) {
            return this.f5663m.mo5426z(this.f5654h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null && abstractC1205p.mo5489q()) {
            return this.f5663m.mo5397A(this.f5654h0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public int m5596d0(View view) {
        AbstractC1188C abstractC1188CM5537f0 = m5537f0(view);
        if (abstractC1188CM5537f0 != null) {
            return abstractC1188CM5537f0.m5670m();
        }
        return -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return getScrollingChildHelper().m633a(f3, f4, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().m634b(f3, f4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m635c(i3, i4, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().m638f(i3, i4, i5, i6, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.f5667o.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1204o) this.f5667o.get(i3)).mo5772i(canvas, this, this.f5654h0);
        }
        EdgeEffect edgeEffect = this.f5624I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f5651g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f5624I;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f5625J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f5651g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5625J;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f5626K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5651g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5626K;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f5627L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5651g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f5627L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f5628M == null || this.f5667o.size() <= 0 || !this.f5628M.mo5757p()) ? z2 : true) {
            AbstractC0268W.m757Z(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    /* JADX INFO: renamed from: e0 */
    public AbstractC1188C m5597e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m5537f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: e1 */
    void m5598e1() {
        int iM6115j = this.f5647e.m6115j();
        for (int i3 = 0; i3 < iM6115j; i3++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6114i(i3));
            if (!abstractC1188CM5537f0.m5656J()) {
                abstractC1188CM5537f0.m5651E();
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    boolean m5599f1(int i3, int i4, MotionEvent motionEvent, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        m5630u();
        if (this.f5661l != null) {
            int[] iArr = this.f5678t0;
            iArr[0] = 0;
            iArr[1] = 0;
            m5600g1(i3, i4, iArr);
            int[] iArr2 = this.f5678t0;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i8 = i3 - i10;
            i9 = i4 - i11;
            i7 = i11;
            i6 = i10;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.f5667o.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f5678t0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m5563G(i6, i7, i8, i9, this.f5674r0, i5, iArr3);
        int[] iArr4 = this.f5678t0;
        int i12 = iArr4[0];
        int i13 = i8 - i12;
        int i14 = iArr4[1];
        int i15 = i9 - i14;
        boolean z2 = (i12 == 0 && i14 == 0) ? false : true;
        int i16 = this.f5634S;
        int[] iArr5 = this.f5674r0;
        int i17 = iArr5[0];
        this.f5634S = i16 - i17;
        int i18 = this.f5635T;
        int i19 = iArr5[1];
        this.f5635T = i18 - i19;
        int[] iArr6 = this.f5676s0;
        iArr6[0] = iArr6[0] + i17;
        iArr6[1] = iArr6[1] + i19;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC0323z.m1164a(motionEvent, 8194)) {
                m5522Q0(motionEvent.getX(), i13, motionEvent.getY(), i15);
            }
            m5627t(i3, i4);
        }
        if (i6 != 0 || i7 != 0) {
            m5567I(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i7 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i3) {
        View viewMo5405N0;
        boolean z2;
        View viewM5818U0 = this.f5663m.m5818U0(view, i3);
        if (viewM5818U0 != null) {
            return viewM5818U0;
        }
        boolean z3 = (this.f5661l == null || this.f5663m == null || m5628t0() || this.f5685x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i3 == 2 || i3 == 1)) {
            if (this.f5663m.mo5489q()) {
                int i4 = i3 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i4) == null;
                if (f5612F0) {
                    i3 = i4;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.f5663m.mo5487p()) {
                int i5 = (this.f5663m.m5828d0() == 1) ^ (i3 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i5) == null;
                if (f5612F0) {
                    i3 = i5;
                }
                z2 = z4;
            }
            if (z2) {
                m5630u();
                if (m5580R(view) == null) {
                    return null;
                }
                m5621q1();
                this.f5663m.mo5405N0(view, i3, this.f5641b, this.f5654h0);
                m5626s1(false);
            }
            viewMo5405N0 = focusFinder.findNextFocus(this, view, i3);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i3);
            if (viewFindNextFocus == null && z3) {
                m5630u();
                if (m5580R(view) == null) {
                    return null;
                }
                m5621q1();
                viewMo5405N0 = this.f5663m.mo5405N0(view, i3, this.f5641b, this.f5654h0);
                m5626s1(false);
            } else {
                viewMo5405N0 = viewFindNextFocus;
            }
        }
        if (viewMo5405N0 == null || viewMo5405N0.hasFocusable()) {
            return m5550u0(view, viewMo5405N0, i3) ? viewMo5405N0 : super.focusSearch(view, i3);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i3);
        }
        m5529a1(viewMo5405N0, null);
        return view;
    }

    /* JADX INFO: renamed from: g1 */
    void m5600g1(int i3, int i4, int[] iArr) {
        m5621q1();
        m5564G0();
        AbstractC0124u.m359a("RV Scroll");
        m5579Q(this.f5654h0);
        int iMo5398A1 = i3 != 0 ? this.f5663m.mo5398A1(i3, this.f5641b, this.f5654h0) : 0;
        int iMo5399C1 = i4 != 0 ? this.f5663m.mo5399C1(i4, this.f5641b, this.f5654h0) : 0;
        AbstractC0124u.m360b();
        m5591Z0();
        m5566H0();
        m5626s1(false);
        if (iArr != null) {
            iArr[0] = iMo5398A1;
            iArr[1] = iMo5399C1;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            return abstractC1205p.mo5402I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m5577P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            return abstractC1205p.mo5403J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m5577P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1197h getAdapter() {
        return this.f5661l;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1205p abstractC1205p = this.f5663m;
        return abstractC1205p != null ? abstractC1205p.m5803L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5651g;
    }

    public C1232k getCompatAccessibilityDelegate() {
        return this.f5668o0;
    }

    public C1201l getEdgeEffectFactory() {
        return this.f5623H;
    }

    public AbstractC1202m getItemAnimator() {
        return this.f5628M;
    }

    public int getItemDecorationCount() {
        return this.f5667o.size();
    }

    public AbstractC1205p getLayoutManager() {
        return this.f5663m;
    }

    public int getMaxFlingVelocity() {
        return this.f5640a0;
    }

    public int getMinFlingVelocity() {
        return this.f5638W;
    }

    long getNanoTime() {
        if (f5611E0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1207r getOnFlingListener() {
        return this.f5637V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5646d0;
    }

    public C1210u getRecycledViewPool() {
        return this.f5641b.m5926i();
    }

    public int getScrollState() {
        return this.f5629N;
    }

    /* JADX INFO: renamed from: h */
    public void m5601h(AbstractC1204o abstractC1204o) {
        m5603i(abstractC1204o, -1);
    }

    /* JADX INFO: renamed from: h1 */
    public void m5602h1(int i3) {
        if (this.f5685x) {
            return;
        }
        m5631u1();
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1205p.mo5462B1(i3);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m639j();
    }

    /* JADX INFO: renamed from: i */
    public void m5603i(AbstractC1204o abstractC1204o, int i3) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            abstractC1205p.mo5485l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f5667o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i3 < 0) {
            this.f5667o.add(abstractC1204o);
        } else {
            this.f5667o.add(i3, abstractC1204o);
        }
        m5634w0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f5673r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f5685x;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m641l();
    }

    /* JADX INFO: renamed from: j */
    public void m5604j(InterfaceC1208s interfaceC1208s) {
        this.f5669p.add(interfaceC1208s);
    }

    /* JADX INFO: renamed from: j0 */
    Rect m5605j0(View view) {
        C1206q c1206q = (C1206q) view.getLayoutParams();
        if (!c1206q.f5769c) {
            return c1206q.f5768b;
        }
        if (this.f5654h0.m5970e() && (c1206q.m5882b() || c1206q.m5884d())) {
            return c1206q.f5768b;
        }
        Rect rect = c1206q.f5768b;
        rect.set(0, 0, 0, 0);
        int size = this.f5667o.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f5655i.set(0, 0, 0, 0);
            ((AbstractC1204o) this.f5667o.get(i3)).m5768e(this.f5655i, view, this, this.f5654h0);
            int i4 = rect.left;
            Rect rect2 = this.f5655i;
            rect.left = i4 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1206q.f5769c = false;
        return rect;
    }

    /* JADX INFO: renamed from: j1 */
    boolean m5606j1(AbstractC1188C abstractC1188C, int i3) {
        if (!m5628t0()) {
            AbstractC0268W.m789p0(abstractC1188C.f5699a, i3);
            return true;
        }
        abstractC1188C.f5715q = i3;
        this.f5680u0.add(abstractC1188C);
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m5607k(AbstractC1209t abstractC1209t) {
        if (this.f5658j0 == null) {
            this.f5658j0 = new ArrayList();
        }
        this.f5658j0.add(abstractC1209t);
    }

    /* JADX INFO: renamed from: k1 */
    boolean m5608k1(AccessibilityEvent accessibilityEvent) {
        if (!m5628t0()) {
            return false;
        }
        int iM1176a = accessibilityEvent != null ? AbstractC0333b.m1176a(accessibilityEvent) : 0;
        this.f5689z |= iM1176a != 0 ? iM1176a : 0;
        return true;
    }

    /* JADX INFO: renamed from: l */
    void m5609l(AbstractC1188C abstractC1188C, AbstractC1202m.b bVar, AbstractC1202m.b bVar2) {
        abstractC1188C.m5653G(false);
        if (this.f5628M.mo5743a(abstractC1188C, bVar, bVar2)) {
            m5574M0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m5610l0() {
        return !this.f5679u || this.f5619D || this.f5645d.m6097p();
    }

    /* JADX INFO: renamed from: l1 */
    public void m5611l1(int i3, int i4) {
        m5612m1(i3, i4, null);
    }

    /* JADX INFO: renamed from: m1 */
    public void m5612m1(int i3, int i4, Interpolator interpolator) {
        m5615n1(i3, i4, interpolator, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: n */
    void m5613n(AbstractC1188C abstractC1188C, AbstractC1202m.b bVar, AbstractC1202m.b bVar2) {
        m5538g(abstractC1188C);
        abstractC1188C.m5653G(false);
        if (this.f5628M.mo5745c(abstractC1188C, bVar, bVar2)) {
            m5574M0();
        }
    }

    /* JADX INFO: renamed from: n0 */
    void m5614n0() {
        this.f5645d = new C1222a(new C1195f());
    }

    /* JADX INFO: renamed from: n1 */
    public void m5615n1(int i3, int i4, Interpolator interpolator, int i5) {
        m5617o1(i3, i4, interpolator, i5, false);
    }

    /* JADX INFO: renamed from: o */
    void m5616o(String str) {
        if (m5628t0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m5577P());
        }
        if (this.f5622G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m5577P()));
        }
    }

    /* JADX INFO: renamed from: o1 */
    void m5617o1(int i3, int i4, Interpolator interpolator, int i5, boolean z2) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5685x) {
            return;
        }
        if (!abstractC1205p.mo5487p()) {
            i3 = 0;
        }
        if (!this.f5663m.mo5489q()) {
            i4 = 0;
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        if (i5 != Integer.MIN_VALUE && i5 <= 0) {
            scrollBy(i3, i4);
            return;
        }
        if (z2) {
            int i6 = i3 != 0 ? 1 : 0;
            if (i4 != 0) {
                i6 |= 2;
            }
            m5623r1(i6, 1);
        }
        this.f5648e0.m5644e(i3, i4, i5, interpolator);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f5621F = r0
            r1 = 1
            r5.f5673r = r1
            boolean r2 = r5.f5679u
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f5679u = r1
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.f5663m
            if (r1 == 0) goto L1e
            r1.m5788E(r5)
        L1e:
            r5.f5666n0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f5611E0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC1226e.f5978h
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.RunnableC1226e) r1
            r5.f5650f0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f5650f0 = r1
            android.view.Display r1 = p027J.AbstractC0268W.m794s(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f5650f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5982f = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f5650f0
            r0.m6172a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC1226e runnableC1226e;
        super.onDetachedFromWindow();
        AbstractC1202m abstractC1202m = this.f5628M;
        if (abstractC1202m != null) {
            abstractC1202m.mo5752k();
        }
        m5631u1();
        this.f5673r = false;
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            abstractC1205p.m5791F(this, this.f5641b);
        }
        this.f5680u0.clear();
        removeCallbacks(this.f5682v0);
        this.f5649f.m6276j();
        if (!f5611E0 || (runnableC1226e = this.f5650f0) == null) {
            return;
        }
        runnableC1226e.m6175j(this);
        this.f5650f0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f5667o.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1204o) this.f5667o.get(i3)).mo5770g(canvas, this, this.f5654h0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f5663m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f5685x
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f5663m
            boolean r0 = r0.mo5489q()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f5663m
            boolean r3 = r3.mo5487p()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f5663m
            boolean r3 = r3.mo5489q()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f5663m
            boolean r3 = r3.mo5487p()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f5642b0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f5644c0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.m5554y0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f5685x) {
            return false;
        }
        this.f5671q = null;
        if (m5524T(motionEvent)) {
            m5548q();
            return true;
        }
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p == null) {
            return false;
        }
        boolean zMo5487p = abstractC1205p.mo5487p();
        boolean zMo5489q = this.f5663m.mo5489q();
        if (this.f5631P == null) {
            this.f5631P = VelocityTracker.obtain();
        }
        this.f5631P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f5687y) {
                this.f5687y = false;
            }
            this.f5630O = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f5634S = x2;
            this.f5632Q = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f5635T = y2;
            this.f5633R = y2;
            if (this.f5629N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m5629t1(1);
            }
            int[] iArr = this.f5676s0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = zMo5487p;
            if (zMo5489q) {
                i3 = (zMo5487p ? 1 : 0) | 2;
            }
            m5623r1(i3, 0);
        } else if (actionMasked == 1) {
            this.f5631P.clear();
            m5629t1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f5630O);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5630O + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f5629N != 1) {
                int i4 = x3 - this.f5632Q;
                int i5 = y3 - this.f5633R;
                if (!zMo5487p || Math.abs(i4) <= this.f5636U) {
                    z2 = false;
                } else {
                    this.f5634S = x3;
                    z2 = true;
                }
                if (zMo5489q && Math.abs(i5) > this.f5636U) {
                    this.f5635T = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m5548q();
        } else if (actionMasked == 5) {
            this.f5630O = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f5634S = x4;
            this.f5632Q = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f5635T = y4;
            this.f5633R = y4;
        } else if (actionMasked == 6) {
            m5518J0(motionEvent);
        }
        return this.f5629N == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        AbstractC0124u.m359a("RV OnLayout");
        m5556B();
        AbstractC0124u.m360b();
        this.f5679u = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p == null) {
            m5633w(i3, i4);
            return;
        }
        boolean z2 = false;
        if (abstractC1205p.mo5495w0()) {
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.f5663m.m5829d1(this.f5641b, this.f5654h0, i3, i4);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.f5684w0 = z2;
            if (z2 || this.f5661l == null) {
                return;
            }
            if (this.f5654h0.f5805e == 1) {
                m5515C();
            }
            this.f5663m.m5790E1(i3, i4);
            this.f5654h0.f5810j = true;
            m5516D();
            this.f5663m.m5797H1(i3, i4);
            if (this.f5663m.mo5467K1()) {
                this.f5663m.m5790E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f5654h0.f5810j = true;
                m5516D();
                this.f5663m.m5797H1(i3, i4);
            }
            this.f5686x0 = getMeasuredWidth();
            this.f5688y0 = getMeasuredHeight();
            return;
        }
        if (this.f5675s) {
            this.f5663m.m5829d1(this.f5641b, this.f5654h0, i3, i4);
            return;
        }
        if (this.f5616A) {
            m5621q1();
            m5564G0();
            m5521O0();
            m5566H0();
            C1215z c1215z = this.f5654h0;
            if (c1215z.f5812l) {
                c1215z.f5808h = true;
            } else {
                this.f5645d.m6092j();
                this.f5654h0.f5808h = false;
            }
            this.f5616A = false;
            m5626s1(false);
        } else if (this.f5654h0.f5812l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC1197h abstractC1197h = this.f5661l;
        if (abstractC1197h != null) {
            this.f5654h0.f5806f = abstractC1197h.mo5715d();
        } else {
            this.f5654h0.f5806f = 0;
        }
        m5621q1();
        this.f5663m.m5829d1(this.f5641b, this.f5654h0, i3, i4);
        m5626s1(false);
        this.f5654h0.f5808h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (m5628t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f5643c = savedState;
        super.onRestoreInstanceState(savedState.m4418a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f5643c;
        if (savedState2 != null) {
            savedState.m5684d(savedState2);
            return savedState;
        }
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            savedState.f5718f = abstractC1205p.mo5484h1();
            return savedState;
        }
        savedState.f5718f = null;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 == i5 && i4 == i6) {
            return;
        }
        m5622r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r1
  0x00df: PHI (r1v45 int) = (r1v26 int), (r1v49 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    boolean m5618p(AbstractC1188C abstractC1188C) {
        AbstractC1202m abstractC1202m = this.f5628M;
        return abstractC1202m == null || abstractC1202m.mo5748g(abstractC1188C, abstractC1188C.m5672o());
    }

    /* JADX INFO: renamed from: p1 */
    public void m5619p1(int i3) {
        if (this.f5685x) {
            return;
        }
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1205p.mo5469M1(this, this.f5654h0, i3);
        }
    }

    /* JADX INFO: renamed from: q0 */
    void m5620q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C1225d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC1834b.f9234a), resources.getDimensionPixelSize(AbstractC1834b.f9236c), resources.getDimensionPixelOffset(AbstractC1834b.f9235b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m5577P());
        }
    }

    /* JADX INFO: renamed from: q1 */
    void m5621q1() {
        int i3 = this.f5681v + 1;
        this.f5681v = i3;
        if (i3 != 1 || this.f5685x) {
            return;
        }
        this.f5683w = false;
    }

    /* JADX INFO: renamed from: r0 */
    void m5622r0() {
        this.f5627L = null;
        this.f5625J = null;
        this.f5626K = null;
        this.f5624I = null;
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m5623r1(int i3, int i4) {
        return getScrollingChildHelper().m644p(i3, i4);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        AbstractC1188C abstractC1188CM5537f0 = m5537f0(view);
        if (abstractC1188CM5537f0 != null) {
            if (abstractC1188CM5537f0.m5681x()) {
                abstractC1188CM5537f0.m5664f();
            } else if (!abstractC1188CM5537f0.m5656J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC1188CM5537f0 + m5577P());
            }
        }
        view.clearAnimation();
        m5638z(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f5663m.m5834f1(this, this.f5654h0, view, view2) && view2 != null) {
            m5529a1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f5663m.m5869v1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.f5669p.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC1208s) this.f5669p.get(i3)).mo5888c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f5681v != 0 || this.f5685x) {
            this.f5683w = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    void m5624s() {
        int iM6115j = this.f5647e.m6115j();
        for (int i3 = 0; i3 < iM6115j; i3++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6114i(i3));
            if (!abstractC1188CM5537f0.m5656J()) {
                abstractC1188CM5537f0.m5661c();
            }
        }
        this.f5641b.m5921d();
    }

    /* JADX INFO: renamed from: s0 */
    boolean m5625s0() {
        AccessibilityManager accessibilityManager = this.f5617B;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* JADX INFO: renamed from: s1 */
    void m5626s1(boolean z2) {
        if (this.f5681v < 1) {
            this.f5681v = 1;
        }
        if (!z2 && !this.f5685x) {
            this.f5683w = false;
        }
        if (this.f5681v == 1) {
            if (z2 && this.f5683w && !this.f5685x && this.f5663m != null && this.f5661l != null) {
                m5556B();
            }
            if (!this.f5685x) {
                this.f5683w = false;
            }
        }
        this.f5681v--;
    }

    @Override // android.view.View
    public void scrollBy(int i3, int i4) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5685x) {
            return;
        }
        boolean zMo5487p = abstractC1205p.mo5487p();
        boolean zMo5489q = this.f5663m.mo5489q();
        if (zMo5487p || zMo5489q) {
            if (!zMo5487p) {
                i3 = 0;
            }
            if (!zMo5489q) {
                i4 = 0;
            }
            m5599f1(i3, i4, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m5608k1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1232k c1232k) {
        this.f5668o0 = c1232k;
        AbstractC0268W.m775i0(this, c1232k);
    }

    public void setAdapter(AbstractC1197h abstractC1197h) {
        setLayoutFrozen(false);
        m5542i1(abstractC1197h, false, true);
        m5578P0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1200k interfaceC1200k) {
        if (interfaceC1200k == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f5651g) {
            m5622r0();
        }
        this.f5651g = z2;
        super.setClipToPadding(z2);
        if (this.f5679u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1201l c1201l) {
        AbstractC0211h.m610g(c1201l);
        this.f5623H = c1201l;
        m5622r0();
    }

    public void setHasFixedSize(boolean z2) {
        this.f5675s = z2;
    }

    public void setItemAnimator(AbstractC1202m abstractC1202m) {
        AbstractC1202m abstractC1202m2 = this.f5628M;
        if (abstractC1202m2 != null) {
            abstractC1202m2.mo5752k();
            this.f5628M.m5763v(null);
        }
        this.f5628M = abstractC1202m;
        if (abstractC1202m != null) {
            abstractC1202m.m5763v(this.f5664m0);
        }
    }

    public void setItemViewCacheSize(int i3) {
        this.f5641b.m5913G(i3);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC1205p abstractC1205p) {
        if (abstractC1205p == this.f5663m) {
            return;
        }
        m5631u1();
        if (this.f5663m != null) {
            AbstractC1202m abstractC1202m = this.f5628M;
            if (abstractC1202m != null) {
                abstractC1202m.mo5752k();
            }
            this.f5663m.m5855o1(this.f5641b);
            this.f5663m.m5857p1(this.f5641b);
            this.f5641b.m5920c();
            if (this.f5673r) {
                this.f5663m.m5791F(this, this.f5641b);
            }
            this.f5663m.m5799I1(null);
            this.f5663m = null;
        } else {
            this.f5641b.m5920c();
        }
        this.f5647e.m6119o();
        this.f5663m = abstractC1205p;
        if (abstractC1205p != null) {
            if (abstractC1205p.f5744b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC1205p + " is already attached to a RecyclerView:" + abstractC1205p.f5744b.m5577P());
            }
            abstractC1205p.m5799I1(this);
            if (this.f5673r) {
                this.f5663m.m5788E(this);
            }
        }
        this.f5641b.m5916K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m642m(z2);
    }

    public void setOnFlingListener(AbstractC1207r abstractC1207r) {
        this.f5637V = abstractC1207r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1209t abstractC1209t) {
        this.f5656i0 = abstractC1209t;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f5646d0 = z2;
    }

    public void setRecycledViewPool(C1210u c1210u) {
        this.f5641b.m5911E(c1210u);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1212w interfaceC1212w) {
    }

    void setScrollState(int i3) {
        if (i3 == this.f5629N) {
            return;
        }
        this.f5629N = i3;
        if (i3 != 2) {
            m5552v1();
        }
        m5565H(i3);
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 == 1) {
                this.f5636U = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
        }
        this.f5636U = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1186A abstractC1186A) {
        this.f5641b.m5912F(abstractC1186A);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().m643o(i3);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m645q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.f5685x) {
            m5616o("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f5685x = true;
                this.f5687y = true;
                m5631u1();
                return;
            }
            this.f5685x = false;
            if (this.f5683w && this.f5663m != null && this.f5661l != null) {
                requestLayout();
            }
            this.f5683w = false;
        }
    }

    /* JADX INFO: renamed from: t */
    void m5627t(int i3, int i4) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f5624I;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            zIsFinished = false;
        } else {
            this.f5624I.onRelease();
            zIsFinished = this.f5624I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5626K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f5626K.onRelease();
            zIsFinished |= this.f5626K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5625J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f5625J.onRelease();
            zIsFinished |= this.f5625J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5627L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f5627L.onRelease();
            zIsFinished |= this.f5627L.isFinished();
        }
        if (zIsFinished) {
            AbstractC0268W.m757Z(this);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m5628t0() {
        return this.f5621F > 0;
    }

    /* JADX INFO: renamed from: t1 */
    public void m5629t1(int i3) {
        getScrollingChildHelper().m646r(i3);
    }

    /* JADX INFO: renamed from: u */
    void m5630u() {
        if (!this.f5679u || this.f5619D) {
            AbstractC0124u.m359a("RV FullInvalidate");
            m5556B();
            AbstractC0124u.m360b();
            return;
        }
        if (this.f5645d.m6097p()) {
            if (!this.f5645d.m6096o(4) || this.f5645d.m6096o(11)) {
                if (this.f5645d.m6097p()) {
                    AbstractC0124u.m359a("RV FullInvalidate");
                    m5556B();
                    AbstractC0124u.m360b();
                    return;
                }
                return;
            }
            AbstractC0124u.m359a("RV PartialInvalidate");
            m5621q1();
            m5564G0();
            this.f5645d.m6100t();
            if (!this.f5683w) {
                if (m5545m0()) {
                    m5556B();
                } else {
                    this.f5645d.m6091i();
                }
            }
            m5626s1(true);
            m5566H0();
            AbstractC0124u.m360b();
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m5631u1() {
        setScrollState(0);
        m5552v1();
    }

    /* JADX INFO: renamed from: v0 */
    void m5632v0(int i3) {
        if (this.f5663m == null) {
            return;
        }
        setScrollState(2);
        this.f5663m.mo5462B1(i3);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: w */
    void m5633w(int i3, int i4) {
        setMeasuredDimension(AbstractC1205p.m5779s(i3, getPaddingLeft() + getPaddingRight(), AbstractC0268W.m730A(this)), AbstractC1205p.m5779s(i4, getPaddingTop() + getPaddingBottom(), AbstractC0268W.m808z(this)));
    }

    /* JADX INFO: renamed from: w0 */
    void m5634w0() {
        int iM6115j = this.f5647e.m6115j();
        for (int i3 = 0; i3 < iM6115j; i3++) {
            ((C1206q) this.f5647e.m6114i(i3).getLayoutParams()).f5769c = true;
        }
        this.f5641b.m5934s();
    }

    /* JADX INFO: renamed from: w1 */
    void m5635w1(int i3, int i4, Object obj) {
        int i5;
        int iM6115j = this.f5647e.m6115j();
        int i6 = i3 + i4;
        for (int i7 = 0; i7 < iM6115j; i7++) {
            View viewM6114i = this.f5647e.m6114i(i7);
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(viewM6114i);
            if (abstractC1188CM5537f0 != null && !abstractC1188CM5537f0.m5656J() && (i5 = abstractC1188CM5537f0.f5701c) >= i3 && i5 < i6) {
                abstractC1188CM5537f0.m5660b(2);
                abstractC1188CM5537f0.m5659a(obj);
                ((C1206q) viewM6114i.getLayoutParams()).f5769c = true;
            }
        }
        this.f5641b.m5918M(i3, i4);
    }

    /* JADX INFO: renamed from: x0 */
    void m5636x0() {
        int iM6115j = this.f5647e.m6115j();
        for (int i3 = 0; i3 < iM6115j; i3++) {
            AbstractC1188C abstractC1188CM5537f0 = m5537f0(this.f5647e.m6114i(i3));
            if (abstractC1188CM5537f0 != null && !abstractC1188CM5537f0.m5656J()) {
                abstractC1188CM5537f0.m5660b(6);
            }
        }
        m5634w0();
        this.f5641b.m5935t();
    }

    /* JADX INFO: renamed from: y */
    void m5637y(View view) {
        int size;
        AbstractC1188C abstractC1188CM5537f0 = m5537f0(view);
        m5560E0(view);
        AbstractC1197h abstractC1197h = this.f5661l;
        if (abstractC1197h != null && abstractC1188CM5537f0 != null) {
            abstractC1197h.m5729r(abstractC1188CM5537f0);
        }
        if (this.f5618C == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC0740E.m2693a(this.f5618C.get(size));
        throw null;
    }

    /* JADX INFO: renamed from: z */
    void m5638z(View view) {
        int size;
        AbstractC1188C abstractC1188CM5537f0 = m5537f0(view);
        m5562F0(view);
        AbstractC1197h abstractC1197h = this.f5661l;
        if (abstractC1197h != null && abstractC1188CM5537f0 != null) {
            abstractC1197h.m5730s(abstractC1188CM5537f0);
        }
        if (this.f5618C == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC0740E.m2693a(this.f5618C.get(size));
        throw null;
    }

    /* JADX INFO: renamed from: z0 */
    public void m5639z0(int i3) {
        int iM6113g = this.f5647e.m6113g();
        for (int i4 = 0; i4 < iM6113g; i4++) {
            this.f5647e.m6112f(i4).offsetLeftAndRight(i3);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f5639a = new C1213x();
        this.f5641b = new C1211v();
        this.f5649f = new C1237p();
        this.f5653h = new RunnableC1190a();
        this.f5655i = new Rect();
        this.f5657j = new Rect();
        this.f5659k = new RectF();
        this.f5665n = new ArrayList();
        this.f5667o = new ArrayList();
        this.f5669p = new ArrayList();
        this.f5681v = 0;
        this.f5619D = false;
        this.f5620E = false;
        this.f5621F = 0;
        this.f5622G = 0;
        this.f5623H = new C1201l();
        this.f5628M = new C1224c();
        this.f5629N = 0;
        this.f5630O = -1;
        this.f5642b0 = Float.MIN_VALUE;
        this.f5644c0 = Float.MIN_VALUE;
        this.f5646d0 = true;
        this.f5648e0 = new RunnableC1187B();
        this.f5652g0 = f5611E0 ? new RunnableC1226e.b() : null;
        this.f5654h0 = new C1215z();
        this.f5660k0 = false;
        this.f5662l0 = false;
        this.f5664m0 = new C1203n();
        this.f5666n0 = false;
        this.f5670p0 = new int[2];
        this.f5674r0 = new int[2];
        this.f5676s0 = new int[2];
        this.f5678t0 = new int[2];
        this.f5680u0 = new ArrayList();
        this.f5682v0 = new RunnableC1191b();
        this.f5686x0 = 0;
        this.f5688y0 = 0;
        this.f5690z0 = new C1193d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5636U = viewConfiguration.getScaledTouchSlop();
        this.f5642b0 = AbstractC0272Z.m885f(viewConfiguration, context);
        this.f5644c0 = AbstractC0272Z.m889j(viewConfiguration, context);
        this.f5638W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5640a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5628M.m5763v(this.f5664m0);
        m5614n0();
        m5547p0();
        m5546o0();
        if (AbstractC0268W.m802w(this) == 0) {
            AbstractC0268W.m789p0(this, 1);
        }
        this.f5617B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1232k(this));
        int[] iArr = AbstractC1835c.f9242f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        AbstractC0268W.m771g0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i3, 0);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC1835c.f9251o);
        if (typedArrayObtainStyledAttributes.getInt(AbstractC1835c.f9245i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5651g = typedArrayObtainStyledAttributes.getBoolean(AbstractC1835c.f9244h, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1835c.f9246j, false);
        this.f5677t = z2;
        if (z2) {
            m5620q0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(AbstractC1835c.f9249m), typedArrayObtainStyledAttributes.getDrawable(AbstractC1835c.f9250n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(AbstractC1835c.f9247k), typedArrayObtainStyledAttributes.getDrawable(AbstractC1835c.f9248l));
        }
        typedArrayObtainStyledAttributes.recycle();
        m5551v(context, string, attributeSet, i3, 0);
        int[] iArr2 = f5607A0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        AbstractC0268W.m771g0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i3, 0);
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1189a();

        /* JADX INFO: renamed from: f */
        Parcelable f5718f;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        class C1189a implements Parcelable.ClassLoaderCreator {
            C1189a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5718f = parcel.readParcelable(classLoader == null ? AbstractC1205p.class.getClassLoader() : classLoader);
        }

        /* JADX INFO: renamed from: d */
        void m5684d(SavedState savedState) {
            this.f5718f = savedState.f5718f;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeParcelable(this.f5718f, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static class C1206q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        AbstractC1188C f5767a;

        /* JADX INFO: renamed from: b */
        final Rect f5768b;

        /* JADX INFO: renamed from: c */
        boolean f5769c;

        /* JADX INFO: renamed from: d */
        boolean f5770d;

        public C1206q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5768b = new Rect();
            this.f5769c = true;
            this.f5770d = false;
        }

        /* JADX INFO: renamed from: a */
        public int m5881a() {
            return this.f5767a.m5670m();
        }

        /* JADX INFO: renamed from: b */
        public boolean m5882b() {
            return this.f5767a.m5682y();
        }

        /* JADX INFO: renamed from: c */
        public boolean m5883c() {
            return this.f5767a.m5679v();
        }

        /* JADX INFO: renamed from: d */
        public boolean m5884d() {
            return this.f5767a.m5677t();
        }

        public C1206q(int i3, int i4) {
            super(i3, i4);
            this.f5768b = new Rect();
            this.f5769c = true;
            this.f5770d = false;
        }

        public C1206q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5768b = new Rect();
            this.f5769c = true;
            this.f5770d = false;
        }

        public C1206q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5768b = new Rect();
            this.f5769c = true;
            this.f5770d = false;
        }

        public C1206q(C1206q c1206q) {
            super((ViewGroup.LayoutParams) c1206q);
            this.f5768b = new Rect();
            this.f5769c = true;
            this.f5770d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1205p abstractC1205p = this.f5663m;
        if (abstractC1205p != null) {
            return abstractC1205p.mo5404K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m5577P());
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC1205p {

        /* JADX INFO: renamed from: a */
        C1223b f5743a;

        /* JADX INFO: renamed from: b */
        RecyclerView f5744b;

        /* JADX INFO: renamed from: c */
        private final C1236o.b f5745c;

        /* JADX INFO: renamed from: d */
        private final C1236o.b f5746d;

        /* JADX INFO: renamed from: e */
        C1236o f5747e;

        /* JADX INFO: renamed from: f */
        C1236o f5748f;

        /* JADX INFO: renamed from: g */
        AbstractC1214y f5749g;

        /* JADX INFO: renamed from: h */
        boolean f5750h;

        /* JADX INFO: renamed from: i */
        boolean f5751i;

        /* JADX INFO: renamed from: j */
        boolean f5752j;

        /* JADX INFO: renamed from: k */
        private boolean f5753k;

        /* JADX INFO: renamed from: l */
        private boolean f5754l;

        /* JADX INFO: renamed from: m */
        int f5755m;

        /* JADX INFO: renamed from: n */
        boolean f5756n;

        /* JADX INFO: renamed from: o */
        private int f5757o;

        /* JADX INFO: renamed from: p */
        private int f5758p;

        /* JADX INFO: renamed from: q */
        private int f5759q;

        /* JADX INFO: renamed from: r */
        private int f5760r;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        class a implements C1236o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: a */
            public View mo5875a(int i3) {
                return AbstractC1205p.this.m5807N(i3);
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: b */
            public int mo5876b() {
                return AbstractC1205p.this.m5862s0() - AbstractC1205p.this.m5843j0();
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: c */
            public int mo5877c(View view) {
                return AbstractC1205p.this.m5819V(view) - ((ViewGroup.MarginLayoutParams) ((C1206q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: d */
            public int mo5878d() {
                return AbstractC1205p.this.m5840i0();
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: e */
            public int mo5879e(View view) {
                return AbstractC1205p.this.m5822Y(view) + ((ViewGroup.MarginLayoutParams) ((C1206q) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        class b implements C1236o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: a */
            public View mo5875a(int i3) {
                return AbstractC1205p.this.m5807N(i3);
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: b */
            public int mo5876b() {
                return AbstractC1205p.this.m5826b0() - AbstractC1205p.this.m5838h0();
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: c */
            public int mo5877c(View view) {
                return AbstractC1205p.this.m5823Z(view) - ((ViewGroup.MarginLayoutParams) ((C1206q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: d */
            public int mo5878d() {
                return AbstractC1205p.this.m5845k0();
            }

            @Override // androidx.recyclerview.widget.C1236o.b
            /* JADX INFO: renamed from: e */
            public int mo5879e(View view) {
                return AbstractC1205p.this.m5816T(view) + ((ViewGroup.MarginLayoutParams) ((C1206q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        public interface c {
            /* JADX INFO: renamed from: a */
            void mo5880a(int i3, int i4);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        public static class d {

            /* JADX INFO: renamed from: a */
            public int f5763a;

            /* JADX INFO: renamed from: b */
            public int f5764b;

            /* JADX INFO: renamed from: c */
            public boolean f5765c;

            /* JADX INFO: renamed from: d */
            public boolean f5766d;
        }

        public AbstractC1205p() {
            a aVar = new a();
            this.f5745c = aVar;
            b bVar = new b();
            this.f5746d = bVar;
            this.f5747e = new C1236o(aVar);
            this.f5748f = new C1236o(bVar);
            this.f5750h = false;
            this.f5751i = false;
            this.f5752j = false;
            this.f5753k = true;
            this.f5754l = true;
        }

        /* JADX INFO: renamed from: A0 */
        private static boolean m5773A0(int i3, int i4, int i5) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            if (i5 > 0 && i3 != i5) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i3;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i3;
            }
            return true;
        }

        /* JADX INFO: renamed from: D */
        private void m5774D(int i3, View view) {
            this.f5743a.m6110d(i3);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /* JADX INFO: renamed from: P */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m5775P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC1205p.m5775P(int, int, int, int, boolean):int");
        }

        /* JADX INFO: renamed from: Q */
        private int[] m5776Q(View view, Rect rect) {
            int iM5840i0 = m5840i0();
            int iM5845k0 = m5845k0();
            int iM5862s0 = m5862s0() - m5843j0();
            int iM5826b0 = m5826b0() - m5838h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i3 = left - iM5840i0;
            int iMin = Math.min(0, i3);
            int i4 = top - iM5845k0;
            int iMin2 = Math.min(0, i4);
            int i5 = iWidth - iM5862s0;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, iHeight - iM5826b0);
            if (m5828d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i3, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i5);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i4, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        /* JADX INFO: renamed from: k */
        private void m5777k(View view, int i3, boolean z2) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            if (z2 || abstractC1188CM5537f0.m5679v()) {
                this.f5744b.f5649f.m6268b(abstractC1188CM5537f0);
            } else {
                this.f5744b.f5649f.m6281p(abstractC1188CM5537f0);
            }
            C1206q c1206q = (C1206q) view.getLayoutParams();
            if (abstractC1188CM5537f0.m5658L() || abstractC1188CM5537f0.m5680w()) {
                if (abstractC1188CM5537f0.m5680w()) {
                    abstractC1188CM5537f0.m5657K();
                } else {
                    abstractC1188CM5537f0.m5663e();
                }
                this.f5743a.m6109c(view, i3, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f5744b) {
                int iM6117m = this.f5743a.m6117m(view);
                if (i3 == -1) {
                    i3 = this.f5743a.m6113g();
                }
                if (iM6117m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5744b.indexOfChild(view) + this.f5744b.m5577P());
                }
                if (iM6117m != i3) {
                    this.f5744b.f5663m.m5792F0(iM6117m, i3);
                }
            } else {
                this.f5743a.m6107a(view, i3, false);
                c1206q.f5769c = true;
                AbstractC1214y abstractC1214y = this.f5749g;
                if (abstractC1214y != null && abstractC1214y.m5950h()) {
                    this.f5749g.m5953k(view);
                }
            }
            if (c1206q.f5770d) {
                abstractC1188CM5537f0.f5699a.invalidate();
                c1206q.f5770d = false;
            }
        }

        /* JADX INFO: renamed from: m0 */
        public static d m5778m0(Context context, AttributeSet attributeSet, int i3, int i4) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1835c.f9242f, i3, i4);
            dVar.f5763a = typedArrayObtainStyledAttributes.getInt(AbstractC1835c.f9243g, 1);
            dVar.f5764b = typedArrayObtainStyledAttributes.getInt(AbstractC1835c.f9253q, 1);
            dVar.f5765c = typedArrayObtainStyledAttributes.getBoolean(AbstractC1835c.f9252p, false);
            dVar.f5766d = typedArrayObtainStyledAttributes.getBoolean(AbstractC1835c.f9254r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        /* JADX INFO: renamed from: s */
        public static int m5779s(int i3, int i4, int i5) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i5) : size : Math.min(size, Math.max(i4, i5));
        }

        /* JADX INFO: renamed from: x0 */
        private boolean m5780x0(RecyclerView recyclerView, int i3, int i4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iM5840i0 = m5840i0();
            int iM5845k0 = m5845k0();
            int iM5862s0 = m5862s0() - m5843j0();
            int iM5826b0 = m5826b0() - m5838h0();
            Rect rect = this.f5744b.f5655i;
            mo5817U(focusedChild, rect);
            return rect.left - i3 < iM5862s0 && rect.right - i3 > iM5840i0 && rect.top - i4 < iM5826b0 && rect.bottom - i4 > iM5845k0;
        }

        /* JADX INFO: renamed from: z1 */
        private void m5781z1(C1211v c1211v, int i3, View view) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            if (abstractC1188CM5537f0.m5656J()) {
                return;
            }
            if (abstractC1188CM5537f0.m5677t() && !abstractC1188CM5537f0.m5679v() && !this.f5744b.f5661l.m5719h()) {
                m5867u1(i3);
                c1211v.m5909C(abstractC1188CM5537f0);
            } else {
                m5784C(i3);
                c1211v.m5910D(view);
                this.f5744b.f5649f.m6277k(abstractC1188CM5537f0);
            }
        }

        /* JADX INFO: renamed from: A */
        public abstract int mo5397A(C1215z c1215z);

        /* JADX INFO: renamed from: A1 */
        public abstract int mo5398A1(int i3, C1211v c1211v, C1215z c1215z);

        /* JADX INFO: renamed from: B */
        public void m5782B(C1211v c1211v) {
            for (int iM5809O = m5809O() - 1; iM5809O >= 0; iM5809O--) {
                m5781z1(c1211v, iM5809O, m5807N(iM5809O));
            }
        }

        /* JADX INFO: renamed from: B0 */
        public boolean m5783B0() {
            AbstractC1214y abstractC1214y = this.f5749g;
            return abstractC1214y != null && abstractC1214y.m5950h();
        }

        /* JADX INFO: renamed from: B1 */
        public abstract void mo5462B1(int i3);

        /* JADX INFO: renamed from: C */
        public void m5784C(int i3) {
            m5774D(i3, m5807N(i3));
        }

        /* JADX INFO: renamed from: C0 */
        public boolean m5785C0(View view, boolean z2, boolean z3) {
            boolean z4 = this.f5747e.m6260b(view, 24579) && this.f5748f.m6260b(view, 24579);
            return z2 ? z4 : !z4;
        }

        /* JADX INFO: renamed from: C1 */
        public abstract int mo5399C1(int i3, C1211v c1211v, C1215z c1215z);

        /* JADX INFO: renamed from: D0 */
        public void m5786D0(View view, int i3, int i4, int i5, int i6) {
            C1206q c1206q = (C1206q) view.getLayoutParams();
            Rect rect = c1206q.f5768b;
            view.layout(i3 + rect.left + ((ViewGroup.MarginLayoutParams) c1206q).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) c1206q).topMargin, (i5 - rect.right) - ((ViewGroup.MarginLayoutParams) c1206q).rightMargin, (i6 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1206q).bottomMargin);
        }

        /* JADX INFO: renamed from: D1 */
        void m5787D1(RecyclerView recyclerView) {
            m5790E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* JADX INFO: renamed from: E */
        void m5788E(RecyclerView recyclerView) {
            this.f5751i = true;
            mo5802K0(recyclerView);
        }

        /* JADX INFO: renamed from: E0 */
        public void mo5789E0(View view, int i3, int i4) {
            C1206q c1206q = (C1206q) view.getLayoutParams();
            Rect rectM5605j0 = this.f5744b.m5605j0(view);
            int i5 = i3 + rectM5605j0.left + rectM5605j0.right;
            int i6 = i4 + rectM5605j0.top + rectM5605j0.bottom;
            int iM5775P = m5775P(m5862s0(), m5864t0(), m5840i0() + m5843j0() + ((ViewGroup.MarginLayoutParams) c1206q).leftMargin + ((ViewGroup.MarginLayoutParams) c1206q).rightMargin + i5, ((ViewGroup.MarginLayoutParams) c1206q).width, mo5487p());
            int iM5775P2 = m5775P(m5826b0(), m5827c0(), m5845k0() + m5838h0() + ((ViewGroup.MarginLayoutParams) c1206q).topMargin + ((ViewGroup.MarginLayoutParams) c1206q).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) c1206q).height, mo5489q());
            if (m5801J1(view, iM5775P, iM5775P2, c1206q)) {
                view.measure(iM5775P, iM5775P2);
            }
        }

        /* JADX INFO: renamed from: E1 */
        void m5790E1(int i3, int i4) {
            this.f5759q = View.MeasureSpec.getSize(i3);
            int mode = View.MeasureSpec.getMode(i3);
            this.f5757o = mode;
            if (mode == 0 && !RecyclerView.f5609C0) {
                this.f5759q = 0;
            }
            this.f5760r = View.MeasureSpec.getSize(i4);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.f5758p = mode2;
            if (mode2 != 0 || RecyclerView.f5609C0) {
                return;
            }
            this.f5760r = 0;
        }

        /* JADX INFO: renamed from: F */
        void m5791F(RecyclerView recyclerView, C1211v c1211v) {
            this.f5751i = false;
            mo5468M0(recyclerView, c1211v);
        }

        /* JADX INFO: renamed from: F0 */
        public void m5792F0(int i3, int i4) {
            View viewM5807N = m5807N(i3);
            if (viewM5807N != null) {
                m5784C(i3);
                m5849m(viewM5807N, i4);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i3 + this.f5744b.toString());
            }
        }

        /* JADX INFO: renamed from: F1 */
        public void m5793F1(int i3, int i4) {
            this.f5744b.setMeasuredDimension(i3, i4);
        }

        /* JADX INFO: renamed from: G */
        public View m5794G(View view) {
            View viewM5580R;
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null || (viewM5580R = recyclerView.m5580R(view)) == null || this.f5743a.m6118n(viewM5580R)) {
                return null;
            }
            return viewM5580R;
        }

        /* JADX INFO: renamed from: G0 */
        public void mo5795G0(int i3) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                recyclerView.m5639z0(i3);
            }
        }

        /* JADX INFO: renamed from: G1 */
        public void mo5401G1(Rect rect, int i3, int i4) {
            m5793F1(m5779s(i3, rect.width() + m5840i0() + m5843j0(), m5836g0()), m5779s(i4, rect.height() + m5845k0() + m5838h0(), m5833f0()));
        }

        /* JADX INFO: renamed from: H */
        public View mo5466H(int i3) {
            int iM5809O = m5809O();
            for (int i4 = 0; i4 < iM5809O; i4++) {
                View viewM5807N = m5807N(i4);
                AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(viewM5807N);
                if (abstractC1188CM5537f0 != null && abstractC1188CM5537f0.m5670m() == i3 && !abstractC1188CM5537f0.m5656J() && (this.f5744b.f5654h0.m5970e() || !abstractC1188CM5537f0.m5679v())) {
                    return viewM5807N;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: H0 */
        public void mo5796H0(int i3) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                recyclerView.m5555A0(i3);
            }
        }

        /* JADX INFO: renamed from: H1 */
        void m5797H1(int i3, int i4) {
            int iM5809O = m5809O();
            if (iM5809O == 0) {
                this.f5744b.m5633w(i3, i4);
                return;
            }
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = Integer.MAX_VALUE;
            for (int i9 = 0; i9 < iM5809O; i9++) {
                View viewM5807N = m5807N(i9);
                Rect rect = this.f5744b.f5655i;
                mo5817U(viewM5807N, rect);
                int i10 = rect.left;
                if (i10 < i8) {
                    i8 = i10;
                }
                int i11 = rect.right;
                if (i11 > i5) {
                    i5 = i11;
                }
                int i12 = rect.top;
                if (i12 < i6) {
                    i6 = i12;
                }
                int i13 = rect.bottom;
                if (i13 > i7) {
                    i7 = i13;
                }
            }
            this.f5744b.f5655i.set(i8, i6, i5, i7);
            mo5401G1(this.f5744b.f5655i, i3, i4);
        }

        /* JADX INFO: renamed from: I */
        public abstract C1206q mo5402I();

        /* JADX INFO: renamed from: I0 */
        public void mo5798I0(AbstractC1197h abstractC1197h, AbstractC1197h abstractC1197h2) {
        }

        /* JADX INFO: renamed from: I1 */
        void m5799I1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f5744b = null;
                this.f5743a = null;
                this.f5759q = 0;
                this.f5760r = 0;
            } else {
                this.f5744b = recyclerView;
                this.f5743a = recyclerView.f5647e;
                this.f5759q = recyclerView.getWidth();
                this.f5760r = recyclerView.getHeight();
            }
            this.f5757o = 1073741824;
            this.f5758p = 1073741824;
        }

        /* JADX INFO: renamed from: J */
        public C1206q mo5403J(Context context, AttributeSet attributeSet) {
            return new C1206q(context, attributeSet);
        }

        /* JADX INFO: renamed from: J0 */
        public boolean m5800J0(RecyclerView recyclerView, ArrayList arrayList, int i3, int i4) {
            return false;
        }

        /* JADX INFO: renamed from: J1 */
        boolean m5801J1(View view, int i3, int i4, C1206q c1206q) {
            return (!view.isLayoutRequested() && this.f5753k && m5773A0(view.getWidth(), i3, ((ViewGroup.MarginLayoutParams) c1206q).width) && m5773A0(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) c1206q).height)) ? false : true;
        }

        /* JADX INFO: renamed from: K */
        public C1206q mo5404K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C1206q ? new C1206q((C1206q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1206q((ViewGroup.MarginLayoutParams) layoutParams) : new C1206q(layoutParams);
        }

        /* JADX INFO: renamed from: K0 */
        public void mo5802K0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: K1 */
        boolean mo5467K1() {
            return false;
        }

        /* JADX INFO: renamed from: L */
        public int m5803L() {
            return -1;
        }

        /* JADX INFO: renamed from: L0 */
        public void m5804L0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: L1 */
        boolean m5805L1(View view, int i3, int i4, C1206q c1206q) {
            return (this.f5753k && m5773A0(view.getMeasuredWidth(), i3, ((ViewGroup.MarginLayoutParams) c1206q).width) && m5773A0(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) c1206q).height)) ? false : true;
        }

        /* JADX INFO: renamed from: M */
        public int m5806M(View view) {
            return ((C1206q) view.getLayoutParams()).f5768b.bottom;
        }

        /* JADX INFO: renamed from: M0 */
        public void mo5468M0(RecyclerView recyclerView, C1211v c1211v) {
            m5804L0(recyclerView);
        }

        /* JADX INFO: renamed from: M1 */
        public abstract void mo5469M1(RecyclerView recyclerView, C1215z c1215z, int i3);

        /* JADX INFO: renamed from: N */
        public View m5807N(int i3) {
            C1223b c1223b = this.f5743a;
            if (c1223b != null) {
                return c1223b.m6112f(i3);
            }
            return null;
        }

        /* JADX INFO: renamed from: N0 */
        public abstract View mo5405N0(View view, int i3, C1211v c1211v, C1215z c1215z);

        /* JADX INFO: renamed from: N1 */
        public void m5808N1(AbstractC1214y abstractC1214y) {
            AbstractC1214y abstractC1214y2 = this.f5749g;
            if (abstractC1214y2 != null && abstractC1214y != abstractC1214y2 && abstractC1214y2.m5950h()) {
                this.f5749g.m5960r();
            }
            this.f5749g = abstractC1214y;
            abstractC1214y.m5959q(this.f5744b, this);
        }

        /* JADX INFO: renamed from: O */
        public int m5809O() {
            C1223b c1223b = this.f5743a;
            if (c1223b != null) {
                return c1223b.m6113g();
            }
            return 0;
        }

        /* JADX INFO: renamed from: O0 */
        public void mo5470O0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5744b;
            m5811P0(recyclerView.f5641b, recyclerView.f5654h0, accessibilityEvent);
        }

        /* JADX INFO: renamed from: O1 */
        void m5810O1() {
            AbstractC1214y abstractC1214y = this.f5749g;
            if (abstractC1214y != null) {
                abstractC1214y.m5960r();
            }
        }

        /* JADX INFO: renamed from: P0 */
        public void m5811P0(C1211v c1211v, C1215z c1215z, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f5744b.canScrollVertically(-1) && !this.f5744b.canScrollHorizontally(-1) && !this.f5744b.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            AbstractC1197h abstractC1197h = this.f5744b.f5661l;
            if (abstractC1197h != null) {
                accessibilityEvent.setItemCount(abstractC1197h.mo5715d());
            }
        }

        /* JADX INFO: renamed from: P1 */
        public boolean mo5406P1() {
            return false;
        }

        /* JADX INFO: renamed from: Q0 */
        void m5812Q0(C0356y c0356y) {
            RecyclerView recyclerView = this.f5744b;
            m5814R0(recyclerView.f5641b, recyclerView.f5654h0, c0356y);
        }

        /* JADX INFO: renamed from: R */
        public boolean m5813R() {
            RecyclerView recyclerView = this.f5744b;
            return recyclerView != null && recyclerView.f5651g;
        }

        /* JADX INFO: renamed from: R0 */
        public void m5814R0(C1211v c1211v, C1215z c1215z, C0356y c0356y) {
            if (this.f5744b.canScrollVertically(-1) || this.f5744b.canScrollHorizontally(-1)) {
                c0356y.m1261a(8192);
                c0356y.m1237L0(true);
            }
            if (this.f5744b.canScrollVertically(1) || this.f5744b.canScrollHorizontally(1)) {
                c0356y.m1261a(4096);
                c0356y.m1237L0(true);
            }
            c0356y.m1290u0(C0356y.f.m1318b(mo5420o0(c1211v, c1215z), mo5408S(c1211v, c1215z), m5874z0(c1211v, c1215z), m5856p0(c1211v, c1215z)));
        }

        /* JADX INFO: renamed from: S */
        public int mo5408S(C1211v c1211v, C1215z c1215z) {
            return -1;
        }

        /* JADX INFO: renamed from: S0 */
        void m5815S0(View view, C0356y c0356y) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            if (abstractC1188CM5537f0 == null || abstractC1188CM5537f0.m5679v() || this.f5743a.m6118n(abstractC1188CM5537f0.f5699a)) {
                return;
            }
            RecyclerView recyclerView = this.f5744b;
            mo5409T0(recyclerView.f5641b, recyclerView.f5654h0, view, c0356y);
        }

        /* JADX INFO: renamed from: T */
        public int m5816T(View view) {
            return view.getBottom() + m5806M(view);
        }

        /* JADX INFO: renamed from: U */
        public void mo5817U(View view, Rect rect) {
            RecyclerView.m5539g0(view, rect);
        }

        /* JADX INFO: renamed from: U0 */
        public View m5818U0(View view, int i3) {
            return null;
        }

        /* JADX INFO: renamed from: V */
        public int m5819V(View view) {
            return view.getLeft() - m5831e0(view);
        }

        /* JADX INFO: renamed from: V0 */
        public void mo5410V0(RecyclerView recyclerView, int i3, int i4) {
        }

        /* JADX INFO: renamed from: W */
        public int m5820W(View view) {
            Rect rect = ((C1206q) view.getLayoutParams()).f5768b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* JADX INFO: renamed from: W0 */
        public void mo5411W0(RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: X */
        public int m5821X(View view) {
            Rect rect = ((C1206q) view.getLayoutParams()).f5768b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* JADX INFO: renamed from: X0 */
        public void mo5413X0(RecyclerView recyclerView, int i3, int i4, int i5) {
        }

        /* JADX INFO: renamed from: Y */
        public int m5822Y(View view) {
            return view.getRight() + m5852n0(view);
        }

        /* JADX INFO: renamed from: Y0 */
        public void mo5414Y0(RecyclerView recyclerView, int i3, int i4) {
        }

        /* JADX INFO: renamed from: Z */
        public int m5823Z(View view) {
            return view.getTop() - m5858q0(view);
        }

        /* JADX INFO: renamed from: Z0 */
        public void m5824Z0(RecyclerView recyclerView, int i3, int i4) {
        }

        /* JADX INFO: renamed from: a0 */
        public View m5825a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f5743a.m6118n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX INFO: renamed from: a1 */
        public void mo5415a1(RecyclerView recyclerView, int i3, int i4, Object obj) {
            m5824Z0(recyclerView, i3, i4);
        }

        /* JADX INFO: renamed from: b0 */
        public int m5826b0() {
            return this.f5760r;
        }

        /* JADX INFO: renamed from: b1 */
        public abstract void mo5416b1(C1211v c1211v, C1215z c1215z);

        /* JADX INFO: renamed from: c0 */
        public int m5827c0() {
            return this.f5758p;
        }

        /* JADX INFO: renamed from: c1 */
        public void mo5417c1(C1215z c1215z) {
        }

        /* JADX INFO: renamed from: d0 */
        public int m5828d0() {
            return AbstractC0268W.m806y(this.f5744b);
        }

        /* JADX INFO: renamed from: d1 */
        public void m5829d1(C1211v c1211v, C1215z c1215z, int i3, int i4) {
            this.f5744b.m5633w(i3, i4);
        }

        /* JADX INFO: renamed from: e */
        public int m5830e() {
            RecyclerView recyclerView = this.f5744b;
            AbstractC1197h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo5715d();
            }
            return 0;
        }

        /* JADX INFO: renamed from: e0 */
        public int m5831e0(View view) {
            return ((C1206q) view.getLayoutParams()).f5768b.left;
        }

        /* JADX INFO: renamed from: e1 */
        public boolean m5832e1(RecyclerView recyclerView, View view, View view2) {
            return m5783B0() || recyclerView.m5628t0();
        }

        /* JADX INFO: renamed from: f0 */
        public int m5833f0() {
            return AbstractC0268W.m808z(this.f5744b);
        }

        /* JADX INFO: renamed from: f1 */
        public boolean m5834f1(RecyclerView recyclerView, C1215z c1215z, View view, View view2) {
            return m5832e1(recyclerView, view, view2);
        }

        /* JADX INFO: renamed from: g */
        public void m5835g(View view) {
            m5837h(view, -1);
        }

        /* JADX INFO: renamed from: g0 */
        public int m5836g0() {
            return AbstractC0268W.m730A(this.f5744b);
        }

        /* JADX INFO: renamed from: g1 */
        public void mo5482g1(Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: h */
        public void m5837h(View view, int i3) {
            m5777k(view, i3, true);
        }

        /* JADX INFO: renamed from: h0 */
        public int m5838h0() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* JADX INFO: renamed from: h1 */
        public Parcelable mo5484h1() {
            return null;
        }

        /* JADX INFO: renamed from: i */
        public void m5839i(View view) {
            m5842j(view, -1);
        }

        /* JADX INFO: renamed from: i0 */
        public int m5840i0() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* JADX INFO: renamed from: i1 */
        public void mo5841i1(int i3) {
        }

        /* JADX INFO: renamed from: j */
        public void m5842j(View view, int i3) {
            m5777k(view, i3, false);
        }

        /* JADX INFO: renamed from: j0 */
        public int m5843j0() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* JADX INFO: renamed from: j1 */
        void m5844j1(AbstractC1214y abstractC1214y) {
            if (this.f5749g == abstractC1214y) {
                this.f5749g = null;
            }
        }

        /* JADX INFO: renamed from: k0 */
        public int m5845k0() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: renamed from: k1 */
        boolean m5846k1(int i3, Bundle bundle) {
            RecyclerView recyclerView = this.f5744b;
            return m5848l1(recyclerView.f5641b, recyclerView.f5654h0, i3, bundle);
        }

        /* JADX INFO: renamed from: l */
        public void mo5485l(String str) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                recyclerView.m5616o(str);
            }
        }

        /* JADX INFO: renamed from: l0 */
        public int m5847l0(View view) {
            return ((C1206q) view.getLayoutParams()).m5881a();
        }

        /* JADX INFO: renamed from: l1 */
        public boolean m5848l1(C1211v c1211v, C1215z c1215z, int i3, Bundle bundle) {
            int iM5826b0;
            int iM5862s0;
            int i4;
            int i5;
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null) {
                return false;
            }
            if (i3 == 4096) {
                iM5826b0 = recyclerView.canScrollVertically(1) ? (m5826b0() - m5845k0()) - m5838h0() : 0;
                if (this.f5744b.canScrollHorizontally(1)) {
                    iM5862s0 = (m5862s0() - m5840i0()) - m5843j0();
                    i4 = iM5826b0;
                    i5 = iM5862s0;
                }
                i4 = iM5826b0;
                i5 = 0;
            } else if (i3 != 8192) {
                i5 = 0;
                i4 = 0;
            } else {
                iM5826b0 = recyclerView.canScrollVertically(-1) ? -((m5826b0() - m5845k0()) - m5838h0()) : 0;
                if (this.f5744b.canScrollHorizontally(-1)) {
                    iM5862s0 = -((m5862s0() - m5840i0()) - m5843j0());
                    i4 = iM5826b0;
                    i5 = iM5862s0;
                }
                i4 = iM5826b0;
                i5 = 0;
            }
            if (i4 == 0 && i5 == 0) {
                return false;
            }
            this.f5744b.m5617o1(i5, i4, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* JADX INFO: renamed from: m */
        public void m5849m(View view, int i3) {
            m5851n(view, i3, (C1206q) view.getLayoutParams());
        }

        /* JADX INFO: renamed from: m1 */
        boolean m5850m1(View view, int i3, Bundle bundle) {
            RecyclerView recyclerView = this.f5744b;
            return m5853n1(recyclerView.f5641b, recyclerView.f5654h0, view, i3, bundle);
        }

        /* JADX INFO: renamed from: n */
        public void m5851n(View view, int i3, C1206q c1206q) {
            AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(view);
            if (abstractC1188CM5537f0.m5679v()) {
                this.f5744b.f5649f.m6268b(abstractC1188CM5537f0);
            } else {
                this.f5744b.f5649f.m6281p(abstractC1188CM5537f0);
            }
            this.f5743a.m6109c(view, i3, c1206q, abstractC1188CM5537f0.m5679v());
        }

        /* JADX INFO: renamed from: n0 */
        public int m5852n0(View view) {
            return ((C1206q) view.getLayoutParams()).f5768b.right;
        }

        /* JADX INFO: renamed from: n1 */
        public boolean m5853n1(C1211v c1211v, C1215z c1215z, View view, int i3, Bundle bundle) {
            return false;
        }

        /* JADX INFO: renamed from: o */
        public void m5854o(View view, Rect rect) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m5605j0(view));
            }
        }

        /* JADX INFO: renamed from: o0 */
        public int mo5420o0(C1211v c1211v, C1215z c1215z) {
            return -1;
        }

        /* JADX INFO: renamed from: o1 */
        public void m5855o1(C1211v c1211v) {
            for (int iM5809O = m5809O() - 1; iM5809O >= 0; iM5809O--) {
                if (!RecyclerView.m5537f0(m5807N(iM5809O)).m5656J()) {
                    m5861r1(iM5809O, c1211v);
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public abstract boolean mo5487p();

        /* JADX INFO: renamed from: p0 */
        public int m5856p0(C1211v c1211v, C1215z c1215z) {
            return 0;
        }

        /* JADX INFO: renamed from: p1 */
        void m5857p1(C1211v c1211v) {
            int iM5927j = c1211v.m5927j();
            for (int i3 = iM5927j - 1; i3 >= 0; i3--) {
                View viewM5931n = c1211v.m5931n(i3);
                AbstractC1188C abstractC1188CM5537f0 = RecyclerView.m5537f0(viewM5931n);
                if (!abstractC1188CM5537f0.m5656J()) {
                    abstractC1188CM5537f0.m5653G(false);
                    if (abstractC1188CM5537f0.m5681x()) {
                        this.f5744b.removeDetachedView(viewM5931n, false);
                    }
                    AbstractC1202m abstractC1202m = this.f5744b.f5628M;
                    if (abstractC1202m != null) {
                        abstractC1202m.mo5751j(abstractC1188CM5537f0);
                    }
                    abstractC1188CM5537f0.m5653G(true);
                    c1211v.m5940y(viewM5931n);
                }
            }
            c1211v.m5922e();
            if (iM5927j > 0) {
                this.f5744b.invalidate();
            }
        }

        /* JADX INFO: renamed from: q */
        public abstract boolean mo5489q();

        /* JADX INFO: renamed from: q0 */
        public int m5858q0(View view) {
            return ((C1206q) view.getLayoutParams()).f5768b.top;
        }

        /* JADX INFO: renamed from: q1 */
        public void m5859q1(View view, C1211v c1211v) {
            m5865t1(view);
            c1211v.m5908B(view);
        }

        /* JADX INFO: renamed from: r */
        public boolean mo5421r(C1206q c1206q) {
            return c1206q != null;
        }

        /* JADX INFO: renamed from: r0 */
        public void m5860r0(View view, boolean z2, Rect rect) {
            Matrix matrix;
            if (z2) {
                Rect rect2 = ((C1206q) view.getLayoutParams()).f5768b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f5744b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f5744b.f5659k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX INFO: renamed from: r1 */
        public void m5861r1(int i3, C1211v c1211v) {
            View viewM5807N = m5807N(i3);
            m5867u1(i3);
            c1211v.m5908B(viewM5807N);
        }

        /* JADX INFO: renamed from: s0 */
        public int m5862s0() {
            return this.f5759q;
        }

        /* JADX INFO: renamed from: s1 */
        public boolean m5863s1(Runnable runnable) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* JADX INFO: renamed from: t */
        public void mo5492t(int i3, int i4, C1215z c1215z, c cVar) {
        }

        /* JADX INFO: renamed from: t0 */
        public int m5864t0() {
            return this.f5757o;
        }

        /* JADX INFO: renamed from: t1 */
        public void m5865t1(View view) {
            this.f5743a.m6120p(view);
        }

        /* JADX INFO: renamed from: u */
        public void mo5493u(int i3, c cVar) {
        }

        /* JADX INFO: renamed from: u0 */
        boolean m5866u0() {
            int iM5809O = m5809O();
            for (int i3 = 0; i3 < iM5809O; i3++) {
                ViewGroup.LayoutParams layoutParams = m5807N(i3).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: u1 */
        public void m5867u1(int i3) {
            if (m5807N(i3) != null) {
                this.f5743a.m6121q(i3);
            }
        }

        /* JADX INFO: renamed from: v */
        public abstract int mo5494v(C1215z c1215z);

        /* JADX INFO: renamed from: v0 */
        public boolean m5868v0() {
            return this.f5751i;
        }

        /* JADX INFO: renamed from: v1 */
        public boolean m5869v1(RecyclerView recyclerView, View view, Rect rect, boolean z2) {
            return mo5870w1(recyclerView, view, rect, z2, false);
        }

        /* JADX INFO: renamed from: w */
        public abstract int mo5424w(C1215z c1215z);

        /* JADX INFO: renamed from: w0 */
        public abstract boolean mo5495w0();

        /* JADX INFO: renamed from: w1 */
        public boolean mo5870w1(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
            int[] iArrM5776Q = m5776Q(view, rect);
            int i3 = iArrM5776Q[0];
            int i4 = iArrM5776Q[1];
            if ((z3 && !m5780x0(recyclerView, i3, i4)) || (i3 == 0 && i4 == 0)) {
                return false;
            }
            if (z2) {
                recyclerView.scrollBy(i3, i4);
            } else {
                recyclerView.m5611l1(i3, i4);
            }
            return true;
        }

        /* JADX INFO: renamed from: x */
        public abstract int mo5425x(C1215z c1215z);

        /* JADX INFO: renamed from: x1 */
        public void m5871x1() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* JADX INFO: renamed from: y */
        public abstract int mo5496y(C1215z c1215z);

        /* JADX INFO: renamed from: y0 */
        public final boolean m5872y0() {
            return this.f5754l;
        }

        /* JADX INFO: renamed from: y1 */
        public void m5873y1() {
            this.f5750h = true;
        }

        /* JADX INFO: renamed from: z */
        public abstract int mo5426z(C1215z c1215z);

        /* JADX INFO: renamed from: z0 */
        public boolean m5874z0(C1211v c1211v, C1215z c1215z) {
            return false;
        }

        /* JADX INFO: renamed from: T0 */
        public void mo5409T0(C1211v c1211v, C1215z c1215z, View view, C0356y c0356y) {
        }
    }
}
