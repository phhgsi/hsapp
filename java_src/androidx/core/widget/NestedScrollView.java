package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.gms.common.api.Api;
import p027J.AbstractC0268W;
import p027J.AbstractC0323z;
import p027J.C0227B;
import p027J.C0233E;
import p027J.C0243J;
import p027J.C0273a;
import p027J.C0301o;
import p027J.InterfaceC0225A;
import p027J.InterfaceC0231D;
import p027J.InterfaceC0303p;
import p030K.AbstractC0330A;
import p030K.C0356y;
import p158w.AbstractC2483a;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0231D, InterfaceC0225A {

    /* JADX INFO: renamed from: E */
    private static final float f4670E = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: F */
    private static final C0975a f4671F = new C0975a();

    /* JADX INFO: renamed from: G */
    private static final int[] f4672G = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    private float f4673A;

    /* JADX INFO: renamed from: B */
    private InterfaceC0979e f4674B;

    /* JADX INFO: renamed from: C */
    final C0978d f4675C;

    /* JADX INFO: renamed from: D */
    C0301o f4676D;

    /* JADX INFO: renamed from: a */
    private final float f4677a;

    /* JADX INFO: renamed from: b */
    private long f4678b;

    /* JADX INFO: renamed from: c */
    private final Rect f4679c;

    /* JADX INFO: renamed from: d */
    private OverScroller f4680d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f4681e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f4682f;

    /* JADX INFO: renamed from: g */
    C0243J f4683g;

    /* JADX INFO: renamed from: h */
    private int f4684h;

    /* JADX INFO: renamed from: i */
    private boolean f4685i;

    /* JADX INFO: renamed from: j */
    private boolean f4686j;

    /* JADX INFO: renamed from: k */
    private View f4687k;

    /* JADX INFO: renamed from: l */
    private boolean f4688l;

    /* JADX INFO: renamed from: m */
    private VelocityTracker f4689m;

    /* JADX INFO: renamed from: n */
    private boolean f4690n;

    /* JADX INFO: renamed from: o */
    private boolean f4691o;

    /* JADX INFO: renamed from: p */
    private int f4692p;

    /* JADX INFO: renamed from: q */
    private int f4693q;

    /* JADX INFO: renamed from: r */
    private int f4694r;

    /* JADX INFO: renamed from: s */
    private int f4695s;

    /* JADX INFO: renamed from: t */
    private final int[] f4696t;

    /* JADX INFO: renamed from: u */
    private final int[] f4697u;

    /* JADX INFO: renamed from: v */
    private int f4698v;

    /* JADX INFO: renamed from: w */
    private int f4699w;

    /* JADX INFO: renamed from: x */
    private SavedState f4700x;

    /* JADX INFO: renamed from: y */
    private final C0233E f4701y;

    /* JADX INFO: renamed from: z */
    private final C0227B f4702z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0974a();

        /* JADX INFO: renamed from: d */
        public int f4703d;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        class C0974a implements Parcelable.Creator {
            C0974a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f4703d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f4703d);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4703d = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0975a extends C0273a {
        C0975a() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: f */
        public void mo904f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo904f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AbstractC0330A.m1172a(accessibilityEvent, nestedScrollView.getScrollX());
            AbstractC0330A.m1173b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            int scrollRange;
            super.mo905g(view, c0356y);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0356y.m1287s0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0356y.m1237L0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0356y.m1263b(C0356y.a.f1461r);
                c0356y.m1263b(C0356y.a.f1428C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0356y.m1263b(C0356y.a.f1460q);
                c0356y.m1263b(C0356y.a.f1430E);
            }
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: j */
        public boolean mo908j(View view, int i3, Bundle bundle) {
            if (super.mo908j(view, i3, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i3 != 4096) {
                if (i3 == 8192 || i3 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m4293X(0, iMax, true);
                    return true;
                }
                if (i3 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m4293X(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$b */
    static class C0976b {
        /* JADX INFO: renamed from: a */
        static boolean m4307a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c */
    private static final class C0977c {
        /* JADX INFO: renamed from: a */
        public static void m4308a(View view, float f3) {
            try {
                view.setFrameContentVelocity(f3);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$d */
    class C0978d implements InterfaceC0303p {
        C0978d() {
        }

        @Override // p027J.InterfaceC0303p
        /* JADX INFO: renamed from: a */
        public boolean mo1036a(float f3) {
            if (f3 == 0.0f) {
                return false;
            }
            mo1038c();
            NestedScrollView.this.m4302v((int) f3);
            return true;
        }

        @Override // p027J.InterfaceC0303p
        /* JADX INFO: renamed from: b */
        public float mo1037b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // p027J.InterfaceC0303p
        /* JADX INFO: renamed from: c */
        public void mo1038c() {
            NestedScrollView.this.f4680d.abortAnimation();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$e */
    public interface InterfaceC0979e {
        /* JADX INFO: renamed from: a */
        void m4309a(NestedScrollView nestedScrollView, int i3, int i4, int i5, int i6);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2483a.f11507c);
    }

    /* JADX INFO: renamed from: A */
    private void m4258A() {
        VelocityTracker velocityTracker = this.f4689m;
        if (velocityTracker == null) {
            this.f4689m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* JADX INFO: renamed from: B */
    private void m4259B() {
        this.f4680d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4692p = viewConfiguration.getScaledTouchSlop();
        this.f4693q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4694r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: C */
    private void m4260C() {
        if (this.f4689m == null) {
            this.f4689m = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: D */
    private void m4261D(int i3, int i4) {
        this.f4684h = i3;
        this.f4695s = i4;
        m4294Y(2, 0);
    }

    /* JADX INFO: renamed from: E */
    private boolean m4262E(View view) {
        return !m4264G(view, 0, getHeight());
    }

    /* JADX INFO: renamed from: F */
    private static boolean m4263F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m4263F((View) parent, view2);
    }

    /* JADX INFO: renamed from: G */
    private boolean m4264G(View view, int i3, int i4) {
        view.getDrawingRect(this.f4679c);
        offsetDescendantRectToMyCoords(view, this.f4679c);
        return this.f4679c.bottom + i3 >= getScrollY() && this.f4679c.top - i3 <= getScrollY() + i4;
    }

    /* JADX INFO: renamed from: H */
    private void m4265H(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4702z.m637e(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    /* JADX INFO: renamed from: I */
    private void m4266I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4695s) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f4684h = (int) motionEvent.getY(i3);
            this.f4695s = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f4689m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private void m4267L() {
        VelocityTracker velocityTracker = this.f4689m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4689m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m4268M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f4681e
            float r0 = androidx.core.widget.AbstractC0983d.m4361b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f4681e
            float r4 = -r4
            float r4 = androidx.core.widget.AbstractC0983d.m4363d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f4681e
            float r5 = androidx.core.widget.AbstractC0983d.m4361b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f4681e
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f4682f
            float r0 = androidx.core.widget.AbstractC0983d.m4361b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f4682f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.AbstractC0983d.m4363d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f4682f
            float r5 = androidx.core.widget.AbstractC0983d.m4361b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f4682f
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m4268M(int, float):int");
    }

    /* JADX INFO: renamed from: N */
    private void m4269N(boolean z2) {
        if (z2) {
            m4294Y(2, 1);
        } else {
            m4295a0(1);
        }
        this.f4699w = getScrollY();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: O */
    private boolean m4270O(int i3, int i4, int i5) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i3 == 33;
        View viewM4285u = m4285u(z3, i4, i5);
        if (viewM4285u == null) {
            viewM4285u = this;
        }
        if (i4 < scrollY || i5 > i6) {
            m4271P(z3 ? i4 - scrollY : i5 - i6, 0, 1, true);
            z2 = true;
        }
        if (viewM4285u != findFocus()) {
            viewM4285u.requestFocus(i3);
        }
        return z2;
    }

    /* JADX INFO: renamed from: P */
    private int m4271P(int i3, int i4, int i5, boolean z2) {
        return m4290Q(i3, -1, null, i4, i5, z2);
    }

    /* JADX INFO: renamed from: R */
    private void m4272R(View view) {
        view.getDrawingRect(this.f4679c);
        offsetDescendantRectToMyCoords(view, this.f4679c);
        int iM4297h = m4297h(this.f4679c);
        if (iM4297h != 0) {
            scrollBy(0, iM4297h);
        }
    }

    /* JADX INFO: renamed from: S */
    private boolean m4273S(Rect rect, boolean z2) {
        int iM4297h = m4297h(rect);
        boolean z3 = iM4297h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iM4297h);
                return z3;
            }
            m4291U(0, iM4297h);
        }
        return z3;
    }

    /* JADX INFO: renamed from: T */
    private boolean m4274T(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        return m4286x(-i3) < AbstractC0983d.m4361b(edgeEffect) * ((float) getHeight());
    }

    /* JADX INFO: renamed from: V */
    private void m4275V(int i3, int i4, int i5, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4678b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4680d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, i5);
            m4269N(z2);
        } else {
            if (!this.f4680d.isFinished()) {
                m4277a();
            }
            scrollBy(i3, i4);
        }
        this.f4678b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: Z */
    private boolean m4276Z(MotionEvent motionEvent) {
        boolean z2;
        if (AbstractC0983d.m4361b(this.f4681e) != 0.0f) {
            AbstractC0983d.m4363d(this.f4681e, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        if (AbstractC0983d.m4361b(this.f4682f) == 0.0f) {
            return z2;
        }
        AbstractC0983d.m4363d(this.f4682f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m4277a() {
        this.f4680d.abortAnimation();
        m4295a0(1);
    }

    /* JADX INFO: renamed from: e */
    private boolean m4279e() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    /* JADX INFO: renamed from: f */
    private boolean m4280f() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    private static int m4281g(int i3, int i4, int i5) {
        if (i4 >= i5 || i3 < 0) {
            return 0;
        }
        return i4 + i3 > i5 ? i5 - i4 : i3;
    }

    private C0243J getScrollFeedbackProvider() {
        if (this.f4683g == null) {
            this.f4683g = C0243J.m671a(this);
        }
        return this.f4683g;
    }

    /* JADX INFO: renamed from: q */
    private void m4282q(int i3) {
        if (i3 != 0) {
            if (this.f4691o) {
                m4291U(0, i3);
            } else {
                scrollBy(0, i3);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private boolean m4283r(int i3) {
        if (AbstractC0983d.m4361b(this.f4681e) != 0.0f) {
            if (m4274T(this.f4681e, i3)) {
                this.f4681e.onAbsorb(i3);
                return true;
            }
            m4302v(-i3);
            return true;
        }
        if (AbstractC0983d.m4361b(this.f4682f) == 0.0f) {
            return false;
        }
        int i4 = -i3;
        if (m4274T(this.f4682f, i4)) {
            this.f4682f.onAbsorb(i4);
            return true;
        }
        m4302v(i4);
        return true;
    }

    /* JADX INFO: renamed from: s */
    private void m4284s() {
        this.f4695s = -1;
        this.f4688l = false;
        m4267L();
        m4295a0(0);
        this.f4681e.onRelease();
        this.f4682f.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View m4285u(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m4285u(boolean, int, int):android.view.View");
    }

    /* JADX INFO: renamed from: x */
    private float m4286x(int i3) {
        double dLog = Math.log((Math.abs(i3) * 0.35f) / (this.f4677a * 0.015f));
        float f3 = f4670E;
        return (float) (((double) (this.f4677a * 0.015f)) * Math.exp((((double) f3) / (((double) f3) - 1.0d)) * dLog));
    }

    /* JADX INFO: renamed from: z */
    private boolean m4287z(int i3, int i4) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i4 >= childAt.getTop() - scrollY && i4 < childAt.getBottom() - scrollY && i3 >= childAt.getLeft() && i3 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    boolean m4288J(int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z2) {
        boolean z3;
        boolean z4;
        int i11;
        int overScrollMode = getOverScrollMode();
        boolean z5 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z6 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        int i12 = i5 + i3;
        int i13 = !z7 ? 0 : i9;
        int i14 = i6 + i4;
        int i15 = !z8 ? 0 : i10;
        int i16 = -i13;
        int i17 = i13 + i7;
        int i18 = -i15;
        int i19 = i15 + i8;
        if (i12 > i17) {
            i12 = i17;
            z3 = true;
        } else if (i12 < i16) {
            z3 = true;
            i12 = i16;
        } else {
            z3 = false;
        }
        if (i14 > i19) {
            i14 = i19;
            z4 = true;
        } else if (i14 < i18) {
            z4 = true;
            i14 = i18;
        } else {
            z4 = false;
        }
        if (!z4 || m4304y(1)) {
            i11 = i12;
        } else {
            int i20 = i12;
            this.f4680d.springBack(i20, i14, 0, 0, 0, getScrollRange());
            i11 = i20;
        }
        onOverScrolled(i11, i14, z3, z4);
        return z3 || z4;
    }

    /* JADX INFO: renamed from: K */
    public boolean m4289K(int i3) {
        boolean z2 = i3 == 130;
        int height = getHeight();
        if (z2) {
            this.f4679c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f4679c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f4679c.top = getScrollY() - height;
            Rect rect2 = this.f4679c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f4679c;
        int i4 = rect3.top;
        int i5 = height + i4;
        rect3.bottom = i5;
        return m4270O(i3, i4, i5);
    }

    /* JADX INFO: renamed from: Q */
    int m4290Q(int i3, int i4, MotionEvent motionEvent, int i5, int i6, boolean z2) {
        int i7;
        int i8;
        VelocityTracker velocityTracker;
        if (i6 == 1) {
            m4294Y(2, i6);
        }
        boolean z3 = false;
        if (m4299l(0, i3, this.f4697u, this.f4696t, i6)) {
            int i9 = i3 - this.f4697u[1];
            i8 = this.f4696t[1];
            i7 = i9;
        } else {
            i7 = i3;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z4 = m4279e() && !z2;
        int i10 = i7;
        boolean z5 = m4288J(0, i7, 0, scrollY, 0, scrollRange, 0, 0, true) && !m4304y(i6);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().m673c(motionEvent.getDeviceId(), motionEvent.getSource(), i4, scrollY2);
        }
        int[] iArr = this.f4697u;
        iArr[1] = 0;
        m4300p(0, scrollY2, 0, i10 - scrollY2, this.f4696t, i6, iArr);
        int i11 = i8 + this.f4696t[1];
        int i12 = i10 - this.f4697u[1];
        int i13 = scrollY + i12;
        if (i13 < 0) {
            if (z4) {
                AbstractC0983d.m4363d(this.f4681e, (-i12) / getHeight(), i5 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().m672b(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                }
                if (!this.f4682f.isFinished()) {
                    this.f4682f.onRelease();
                }
            }
        } else if (i13 > scrollRange && z4) {
            AbstractC0983d.m4363d(this.f4682f, i12 / getHeight(), 1.0f - (i5 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().m672b(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
            }
            if (!this.f4681e.isFinished()) {
                this.f4681e.onRelease();
            }
        }
        if (this.f4681e.isFinished() && this.f4682f.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
        }
        if (z3 && i6 == 0 && (velocityTracker = this.f4689m) != null) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
            m4295a0(i6);
            this.f4681e.onRelease();
            this.f4682f.onRelease();
        }
        return i11;
    }

    /* JADX INFO: renamed from: U */
    public final void m4291U(int i3, int i4) {
        m4275V(i3, i4, 250, false);
    }

    /* JADX INFO: renamed from: W */
    void m4292W(int i3, int i4, int i5, boolean z2) {
        m4275V(i3 - getScrollX(), i4 - getScrollY(), i5, z2);
    }

    /* JADX INFO: renamed from: X */
    void m4293X(int i3, int i4, boolean z2) {
        m4292W(i3, i4, 250, z2);
    }

    /* JADX INFO: renamed from: Y */
    public boolean m4294Y(int i3, int i4) {
        return this.f4702z.m644p(i3, i4);
    }

    /* JADX INFO: renamed from: a0 */
    public void m4295a0(int i3) {
        this.f4702z.m646r(i3);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: c */
    public void mo648c(View view, View view2, int i3, int i4) {
        this.f4701y.m658c(view, view2, i3, i4);
        m4294Y(2, i4);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i3;
        if (this.f4680d.isFinished()) {
            return;
        }
        this.f4680d.computeScrollOffset();
        int currY = this.f4680d.getCurrY();
        int iM4298k = m4298k(currY - this.f4699w);
        this.f4699w = currY;
        int[] iArr = this.f4697u;
        iArr[1] = 0;
        m4299l(0, iM4298k, iArr, null, 1);
        int i4 = iM4298k - this.f4697u[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            C0977c.m4308a(this, Math.abs(this.f4680d.getCurrVelocity()));
        }
        if (i4 != 0) {
            int scrollY = getScrollY();
            m4288J(0, i4, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i3 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i5 = i4 - scrollY2;
            int[] iArr2 = this.f4697u;
            iArr2[1] = 0;
            m4300p(0, scrollY2, 0, i5, this.f4696t, 1, iArr2);
            i4 = i5 - this.f4697u[1];
        } else {
            i3 = scrollRange;
        }
        if (i4 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i3 > 0)) {
                if (i4 < 0) {
                    if (this.f4681e.isFinished()) {
                        this.f4681e.onAbsorb((int) this.f4680d.getCurrVelocity());
                    }
                } else if (this.f4682f.isFinished()) {
                    this.f4682f.onAbsorb((int) this.f4680d.getCurrVelocity());
                }
            }
            m4277a();
        }
        if (this.f4680d.isFinished()) {
            m4295a0(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    /* JADX INFO: renamed from: d */
    public boolean m4296d(int i3) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m4264G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m4271P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f4679c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f4679c);
            m4271P(m4297h(this.f4679c), 0, 1, true);
            viewFindNextFocus.requestFocus(i3);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && m4262E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m4301t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return this.f4702z.m633a(f3, f4, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f4702z.m634b(f3, f4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return m4299l(i3, i4, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f4702z.m638f(i3, i4, i5, i6, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f4681e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C0976b.m4307a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (C0976b.m4307a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f4681e.setSize(width, height);
            if (this.f4681e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f4682f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (C0976b.m4307a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (C0976b.m4307a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f4682f.setSize(width2, height2);
        if (this.f4682f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4701y.m656a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f4673A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4673A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4673A;
    }

    /* JADX INFO: renamed from: h */
    protected int m4297h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m4304y(0);
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: i */
    public void mo649i(View view, int i3) {
        this.f4701y.m660e(view, i3);
        m4295a0(i3);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f4702z.m641l();
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: j */
    public void mo650j(View view, int i3, int i4, int[] iArr, int i5) {
        m4299l(i3, i4, iArr, null, i5);
    }

    /* JADX INFO: renamed from: k */
    int m4298k(int i3) {
        int height = getHeight();
        if (i3 > 0 && AbstractC0983d.m4361b(this.f4681e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * AbstractC0983d.m4363d(this.f4681e, ((-i3) * 4.0f) / height, 0.5f));
            if (iRound != i3) {
                this.f4681e.finish();
            }
            return i3 - iRound;
        }
        if (i3 >= 0 || AbstractC0983d.m4361b(this.f4682f) == 0.0f) {
            return i3;
        }
        float f3 = height;
        int iRound2 = Math.round((f3 / 4.0f) * AbstractC0983d.m4363d(this.f4682f, (i3 * 4.0f) / f3, 0.5f));
        if (iRound2 != i3) {
            this.f4682f.finish();
        }
        return i3 - iRound2;
    }

    /* JADX INFO: renamed from: l */
    public boolean m4299l(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        return this.f4702z.m636d(i3, i4, iArr, iArr2, i5);
    }

    @Override // p027J.InterfaceC0231D
    /* JADX INFO: renamed from: m */
    public void mo654m(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        m4265H(i6, i7, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: n */
    public void mo651n(View view, int i3, int i4, int i5, int i6, int i7) {
        m4265H(i6, i7, null);
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: o */
    public boolean mo652o(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4686j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i3;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f4688l) {
            if (AbstractC0323z.m1164a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i3 = 9;
                width = (int) motionEvent.getX();
            } else if (AbstractC0323z.m1164a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i3 = 26;
                axisValue = axisValue2;
            } else {
                i3 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m4290Q(-((int) (axisValue * getVerticalScrollFactorCompat())), i3, motionEvent, width, 1, AbstractC0323z.m1164a(motionEvent, 8194));
                if (i3 == 0) {
                    return true;
                }
                this.f4676D.m1034g(motionEvent, i3);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        int measuredHeight = 0;
        this.f4685i = false;
        View view = this.f4687k;
        if (view != null && m4263F(view, this)) {
            m4272R(this.f4687k);
        }
        this.f4687k = null;
        if (!this.f4686j) {
            if (this.f4700x != null) {
                scrollTo(getScrollX(), this.f4700x.f4703d);
                this.f4700x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM4281g = m4281g(scrollY, paddingTop, measuredHeight);
            if (iM4281g != scrollY) {
                scrollTo(getScrollX(), iM4281g);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4686j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f4690n && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        m4302v((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return dispatchNestedPreFling(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        mo650j(view, i3, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        m4265H(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i3) {
        mo648c(view, view2, i3, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i3, int i4, boolean z2, boolean z3) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (viewFindNextFocus == null || m4262E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i3, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4700x = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4703d = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
        InterfaceC0979e interfaceC0979e = this.f4674B;
        if (interfaceC0979e != null) {
            interfaceC0979e.m4309a(this, i3, i4, i5, i6);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m4264G(viewFindFocus, 0, i6)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f4679c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f4679c);
        m4282q(m4297h(this.f4679c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i3) {
        return mo652o(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo649i(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        m4260C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4698v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f4698v);
        if (actionMasked == 0) {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.f4688l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.f4680d.isFinished()) {
                m4277a();
            }
            m4261D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4695s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4695s + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f4684h - y2;
                    int iM4268M = i3 - m4268M(i3, motionEvent.getX(iFindPointerIndex));
                    if (!this.f4688l && Math.abs(iM4268M) > this.f4692p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4688l = true;
                        iM4268M = iM4268M > 0 ? iM4268M - this.f4692p : iM4268M + this.f4692p;
                    }
                    int i4 = iM4268M;
                    if (this.f4688l) {
                        nestedScrollView = this;
                        int iM4290Q = nestedScrollView.m4290Q(i4, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        nestedScrollView.f4684h = y2 - iM4290Q;
                        nestedScrollView.f4698v += iM4290Q;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4688l && getChildCount() > 0 && this.f4680d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m4284s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4684h = (int) motionEvent.getY(actionIndex);
                this.f4695s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m4266I(motionEvent);
                this.f4684h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4695s));
            }
            nestedScrollView = this;
        } else {
            nestedScrollView = this;
            VelocityTracker velocityTracker = nestedScrollView.f4689m;
            velocityTracker.computeCurrentVelocity(1000, nestedScrollView.f4694r);
            int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.f4695s);
            if (Math.abs(yVelocity) >= nestedScrollView.f4693q) {
                if (!m4283r(yVelocity)) {
                    int i5 = -yVelocity;
                    float f3 = i5;
                    if (!dispatchNestedPreFling(0.0f, f3)) {
                        dispatchNestedFling(0.0f, f3, true);
                        m4302v(i5);
                    }
                }
            } else if (nestedScrollView.f4680d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m4284s();
        }
        VelocityTracker velocityTracker2 = nestedScrollView.f4689m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m4300p(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        this.f4702z.m637e(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f4685i) {
            this.f4687k = view2;
        } else {
            m4272R(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m4273S(rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            m4267L();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f4685i = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM4281g = m4281g(i3, width, width2);
            int iM4281g2 = m4281g(i4, height, height2);
            if (iM4281g == getScrollX() && iM4281g2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM4281g, iM4281g2);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f4690n) {
            this.f4690n = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        this.f4702z.m642m(z2);
    }

    public void setOnScrollChangeListener(InterfaceC0979e interfaceC0979e) {
        this.f4674B = interfaceC0979e;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f4691o = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i3) {
        return m4294Y(i3, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m4295a0(0);
    }

    /* JADX INFO: renamed from: t */
    public boolean m4301t(KeyEvent keyEvent) {
        this.f4679c.setEmpty();
        if (!m4280f()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? m4303w(33) : m4296d(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? m4303w(130) : m4296d(130);
            }
            if (keyCode == 62) {
                m4289K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return m4303w(33);
            }
            if (keyCode == 93) {
                return m4303w(130);
            }
            if (keyCode == 122) {
                m4289K(33);
                return false;
            }
            if (keyCode == 123) {
                m4289K(130);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public void m4302v(int i3) {
        if (getChildCount() > 0) {
            this.f4680d.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            m4269N(true);
            if (Build.VERSION.SDK_INT >= 35) {
                C0977c.m4308a(this, Math.abs(this.f4680d.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m4303w(int i3) {
        int childCount;
        boolean z2 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f4679c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f4679c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f4679c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f4679c;
        return m4270O(i3, rect3.top, rect3.bottom);
    }

    /* JADX INFO: renamed from: y */
    public boolean m4304y(int i3) {
        return this.f4702z.m640k(i3);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f4679c = new Rect();
        this.f4685i = true;
        this.f4686j = false;
        this.f4687k = null;
        this.f4688l = false;
        this.f4691o = true;
        this.f4695s = -1;
        this.f4696t = new int[2];
        this.f4697u = new int[2];
        C0978d c0978d = new C0978d();
        this.f4675C = c0978d;
        this.f4676D = new C0301o(getContext(), c0978d);
        this.f4681e = AbstractC0983d.m4360a(context, attributeSet);
        this.f4682f = AbstractC0983d.m4360a(context, attributeSet);
        this.f4677a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m4259B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4672G, i3, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f4701y = new C0233E(this);
        this.f4702z = new C0227B(this);
        setNestedScrollingEnabled(true);
        AbstractC0268W.m775i0(this, f4671F);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
