package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.AbstractC0966b;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000A.AbstractC0000a;
import p024I.AbstractC0206c;
import p024I.C0210g;
import p024I.InterfaceC0208e;
import p027J.AbstractC0268W;
import p027J.AbstractC0309s;
import p027J.C0233E;
import p027J.C0318w0;
import p027J.InterfaceC0229C;
import p027J.InterfaceC0231D;
import p027J.InterfaceC0235F;
import p155v.AbstractC2471a;
import p155v.AbstractC2472b;
import p155v.AbstractC2473c;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0229C, InterfaceC0231D {

    /* JADX INFO: renamed from: u */
    static final String f4591u;

    /* JADX INFO: renamed from: v */
    static final Class[] f4592v;

    /* JADX INFO: renamed from: w */
    static final ThreadLocal f4593w;

    /* JADX INFO: renamed from: x */
    static final Comparator f4594x;

    /* JADX INFO: renamed from: y */
    private static final InterfaceC0208e f4595y;

    /* JADX INFO: renamed from: a */
    private final List f4596a;

    /* JADX INFO: renamed from: b */
    private final C0960b f4597b;

    /* JADX INFO: renamed from: c */
    private final List f4598c;

    /* JADX INFO: renamed from: d */
    private final List f4599d;

    /* JADX INFO: renamed from: e */
    private Paint f4600e;

    /* JADX INFO: renamed from: f */
    private final int[] f4601f;

    /* JADX INFO: renamed from: g */
    private final int[] f4602g;

    /* JADX INFO: renamed from: h */
    private boolean f4603h;

    /* JADX INFO: renamed from: i */
    private boolean f4604i;

    /* JADX INFO: renamed from: j */
    private int[] f4605j;

    /* JADX INFO: renamed from: k */
    private View f4606k;

    /* JADX INFO: renamed from: l */
    private View f4607l;

    /* JADX INFO: renamed from: m */
    private ViewTreeObserverOnPreDrawListenerC0957g f4608m;

    /* JADX INFO: renamed from: n */
    private boolean f4609n;

    /* JADX INFO: renamed from: o */
    private C0318w0 f4610o;

    /* JADX INFO: renamed from: p */
    private boolean f4611p;

    /* JADX INFO: renamed from: q */
    private Drawable f4612q;

    /* JADX INFO: renamed from: r */
    ViewGroup.OnHierarchyChangeListener f4613r;

    /* JADX INFO: renamed from: s */
    private InterfaceC0235F f4614s;

    /* JADX INFO: renamed from: t */
    private final C0233E f4615t;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0951a implements InterfaceC0235F {
        C0951a() {
        }

        @Override // p027J.InterfaceC0235F
        /* JADX INFO: renamed from: a */
        public C0318w0 mo662a(View view, C0318w0 c0318w0) {
            return CoordinatorLayout.this.m4115W(c0318w0);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0952b {
        AbstractC0953c getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0953c {
        public AbstractC0953c() {
        }

        /* JADX INFO: renamed from: A */
        public boolean mo4132A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
            return false;
        }

        /* JADX INFO: renamed from: B */
        public void mo4133B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: C */
        public Parcelable mo4134C(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* JADX INFO: renamed from: D */
        public boolean m4135D(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3) {
            return false;
        }

        /* JADX INFO: renamed from: E */
        public boolean mo4136E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
            if (i4 == 0) {
                return m4135D(coordinatorLayout, view, view2, view3, i3);
            }
            return false;
        }

        /* JADX INFO: renamed from: F */
        public void m4137F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* JADX INFO: renamed from: G */
        public void mo4138G(CoordinatorLayout coordinatorLayout, View view, View view2, int i3) {
            if (i3 == 0) {
                m4137F(coordinatorLayout, view, view2);
            }
        }

        /* JADX INFO: renamed from: H */
        public boolean mo4139H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public boolean m4140e(CoordinatorLayout coordinatorLayout, View view) {
            return m4143h(coordinatorLayout, view) > 0.0f;
        }

        /* JADX INFO: renamed from: f */
        public boolean mo4141f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m4142g(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        /* JADX INFO: renamed from: h */
        public float m4143h(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        /* JADX INFO: renamed from: i */
        public boolean mo4144i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* JADX INFO: renamed from: k */
        public void mo4146k(C0956f c0956f) {
        }

        /* JADX INFO: renamed from: l */
        public boolean mo4147l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        /* JADX INFO: renamed from: m */
        public void mo4148m(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        /* JADX INFO: renamed from: n */
        public void mo4149n() {
        }

        /* JADX INFO: renamed from: o */
        public boolean mo4150o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: p */
        public boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public boolean mo4152q(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
            return false;
        }

        /* JADX INFO: renamed from: r */
        public boolean m4153r(CoordinatorLayout coordinatorLayout, View view, View view2, float f3, float f4, boolean z2) {
            return false;
        }

        /* JADX INFO: renamed from: s */
        public boolean mo4154s(CoordinatorLayout coordinatorLayout, View view, View view2, float f3, float f4) {
            return false;
        }

        /* JADX INFO: renamed from: t */
        public void m4155t(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr) {
        }

        /* JADX INFO: renamed from: u */
        public void mo4156u(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
            if (i5 == 0) {
                m4155t(coordinatorLayout, view, view2, i3, i4, iArr);
            }
        }

        /* JADX INFO: renamed from: v */
        public void m4157v(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6) {
        }

        /* JADX INFO: renamed from: w */
        public void m4158w(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7) {
            if (i7 == 0) {
                m4157v(coordinatorLayout, view, view2, i3, i4, i5, i6);
            }
        }

        /* JADX INFO: renamed from: x */
        public void mo4159x(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
            iArr[0] = iArr[0] + i5;
            iArr[1] = iArr[1] + i6;
            m4158w(coordinatorLayout, view, view2, i3, i4, i5, i6, i7);
        }

        /* JADX INFO: renamed from: y */
        public void m4160y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3) {
        }

        /* JADX INFO: renamed from: z */
        public void m4161z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
            if (i4 == 0) {
                m4160y(coordinatorLayout, view, view2, view3, i3);
            }
        }

        public AbstractC0953c(Context context, AttributeSet attributeSet) {
        }

        /* JADX INFO: renamed from: j */
        public C0318w0 m4145j(CoordinatorLayout coordinatorLayout, View view, C0318w0 c0318w0) {
            return c0318w0;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC0954d {
        Class value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class ViewGroupOnHierarchyChangeListenerC0955e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC0955e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4613r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m4110H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4613r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class ViewTreeObserverOnPreDrawListenerC0957g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC0957g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m4110H(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    static class C0958h implements Comparator {
        C0958h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM741J = AbstractC0268W.m741J(view);
            float fM741J2 = AbstractC0268W.m741J(view2);
            if (fM741J > fM741J2) {
                return -1;
            }
            return fM741J < fM741J2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f4591u = r02 != null ? r02.getName() : null;
        f4594x = new C0958h();
        f4592v = new Class[]{Context.class, AttributeSet.class};
        f4593w = new ThreadLocal();
        f4595y = new C0210g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2471a.f11465a);
    }

    /* JADX INFO: renamed from: A */
    private boolean m4085A(View view) {
        return this.f4597b.m4193j(view);
    }

    /* JADX INFO: renamed from: C */
    private void m4086C(View view, int i3) {
        C0956f c0956f = (C0956f) view.getLayoutParams();
        Rect rectM4101a = m4101a();
        rectM4101a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0956f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0956f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0956f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0956f).bottomMargin);
        if (this.f4610o != null && AbstractC0268W.m800v(this) && !AbstractC0268W.m800v(view)) {
            rectM4101a.left += this.f4610o.m1086j();
            rectM4101a.top += this.f4610o.m1088l();
            rectM4101a.right -= this.f4610o.m1087k();
            rectM4101a.bottom -= this.f4610o.m1085i();
        }
        Rect rectM4101a2 = m4101a();
        AbstractC0309s.m1052a(m4096S(c0956f.f4621c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM4101a, rectM4101a2, i3);
        view.layout(rectM4101a2.left, rectM4101a2.top, rectM4101a2.right, rectM4101a2.bottom);
        m4093O(rectM4101a);
        m4093O(rectM4101a2);
    }

    /* JADX INFO: renamed from: D */
    private void m4087D(View view, View view2, int i3) {
        Rect rectM4101a = m4101a();
        Rect rectM4101a2 = m4101a();
        try {
            m4125t(view2, rectM4101a);
            m4126u(view, i3, rectM4101a, rectM4101a2);
            view.layout(rectM4101a2.left, rectM4101a2.top, rectM4101a2.right, rectM4101a2.bottom);
        } finally {
            m4093O(rectM4101a);
            m4093O(rectM4101a2);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m4088E(View view, int i3, int i4) {
        C0956f c0956f = (C0956f) view.getLayoutParams();
        int iM1053b = AbstractC0309s.m1053b(m4097T(c0956f.f4621c), i4);
        int i5 = iM1053b & 7;
        int i6 = iM1053b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i4 == 1) {
            i3 = width - i3;
        }
        int iM4106w = m4106w(i3) - measuredWidth;
        if (i5 == 1) {
            iM4106w += measuredWidth / 2;
        } else if (i5 == 5) {
            iM4106w += measuredWidth;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0956f).leftMargin, Math.min(iM4106w, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0956f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0956f).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0956f).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX INFO: renamed from: F */
    private void m4089F(View view, Rect rect, int i3) {
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        if (AbstractC0268W.m746O(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0956f c0956f = (C0956f) view.getLayoutParams();
            AbstractC0953c abstractC0953cM4169e = c0956f.m4169e();
            Rect rectM4101a = m4101a();
            Rect rectM4101a2 = m4101a();
            rectM4101a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC0953cM4169e == null || !abstractC0953cM4169e.mo4141f(this, view, rectM4101a)) {
                rectM4101a.set(rectM4101a2);
            } else if (!rectM4101a2.contains(rectM4101a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM4101a.toShortString() + " | Bounds:" + rectM4101a2.toShortString());
            }
            m4093O(rectM4101a2);
            if (rectM4101a.isEmpty()) {
                m4093O(rectM4101a);
                return;
            }
            int iM1053b = AbstractC0309s.m1053b(c0956f.f4626h, i3);
            boolean z4 = true;
            if ((iM1053b & 48) != 48 || (i8 = (rectM4101a.top - ((ViewGroup.MarginLayoutParams) c0956f).topMargin) - c0956f.f4628j) >= (i9 = rect.top)) {
                z2 = false;
            } else {
                m4099V(view, i9 - i8);
                z2 = true;
            }
            if ((iM1053b & 80) == 80 && (height = ((getHeight() - rectM4101a.bottom) - ((ViewGroup.MarginLayoutParams) c0956f).bottomMargin) + c0956f.f4628j) < (i7 = rect.bottom)) {
                m4099V(view, height - i7);
                z2 = true;
            }
            if (!z2) {
                m4099V(view, 0);
            }
            if ((iM1053b & 3) != 3 || (i5 = (rectM4101a.left - ((ViewGroup.MarginLayoutParams) c0956f).leftMargin) - c0956f.f4627i) >= (i6 = rect.left)) {
                z3 = false;
            } else {
                m4098U(view, i6 - i5);
                z3 = true;
            }
            if ((iM1053b & 5) != 5 || (width = ((getWidth() - rectM4101a.right) - ((ViewGroup.MarginLayoutParams) c0956f).rightMargin) + c0956f.f4627i) >= (i4 = rect.right)) {
                z4 = z3;
            } else {
                m4098U(view, width - i4);
            }
            if (!z4) {
                m4098U(view, 0);
            }
            m4093O(rectM4101a);
        }
    }

    /* JADX INFO: renamed from: K */
    static AbstractC0953c m4090K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f4591u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f4593w;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f4592v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (AbstractC0953c) constructor.newInstance(context, attributeSet);
        } catch (Exception e3) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e3);
        }
    }

    /* JADX INFO: renamed from: L */
    private boolean m4091L(MotionEvent motionEvent, int i3) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f4598c;
        m4107z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zMo4150o = false;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            C0956f c0956f = (C0956f) view.getLayoutParams();
            AbstractC0953c abstractC0953cM4169e = c0956f.m4169e();
            if (!(zMo4150o || z2) || actionMasked == 0) {
                if (!zMo4150o && abstractC0953cM4169e != null) {
                    if (i3 == 0) {
                        zMo4150o = abstractC0953cM4169e.mo4150o(this, view, motionEvent);
                    } else if (i3 == 1) {
                        zMo4150o = abstractC0953cM4169e.mo4139H(this, view, motionEvent);
                    }
                    if (zMo4150o) {
                        this.f4606k = view;
                    }
                }
                boolean zM4167c = c0956f.m4167c();
                boolean zM4172h = c0956f.m4172h(this, view);
                z2 = zM4172h && !zM4167c;
                if (zM4172h && !z2) {
                    break;
                }
            } else if (abstractC0953cM4169e != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i3 == 0) {
                    abstractC0953cM4169e.mo4150o(this, view, motionEventObtain);
                } else if (i3 == 1) {
                    abstractC0953cM4169e.mo4139H(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zMo4150o;
    }

    /* JADX INFO: renamed from: M */
    private void m4092M() {
        this.f4596a.clear();
        this.f4597b.m4188c();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0956f c0956fM4128y = m4128y(childAt);
            c0956fM4128y.m4168d(this, childAt);
            this.f4597b.m4187b(childAt);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3) {
                    View childAt2 = getChildAt(i4);
                    if (c0956fM4128y.m4166b(this, childAt, childAt2)) {
                        if (!this.f4597b.m4189d(childAt2)) {
                            this.f4597b.m4187b(childAt2);
                        }
                        this.f4597b.m4186a(childAt2, childAt);
                    }
                }
            }
        }
        this.f4596a.addAll(this.f4597b.m4192i());
        Collections.reverse(this.f4596a);
    }

    /* JADX INFO: renamed from: O */
    private static void m4093O(Rect rect) {
        rect.setEmpty();
        f4595y.mo601a(rect);
    }

    /* JADX INFO: renamed from: Q */
    private void m4094Q(boolean z2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            AbstractC0953c abstractC0953cM4169e = ((C0956f) childAt.getLayoutParams()).m4169e();
            if (abstractC0953cM4169e != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC0953cM4169e.mo4150o(this, childAt, motionEventObtain);
                } else {
                    abstractC0953cM4169e.mo4139H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((C0956f) getChildAt(i4).getLayoutParams()).m4176l();
        }
        this.f4606k = null;
        this.f4603h = false;
    }

    /* JADX INFO: renamed from: R */
    private static int m4095R(int i3) {
        if (i3 == 0) {
            return 17;
        }
        return i3;
    }

    /* JADX INFO: renamed from: S */
    private static int m4096S(int i3) {
        if ((i3 & 7) == 0) {
            i3 |= 8388611;
        }
        return (i3 & 112) == 0 ? i3 | 48 : i3;
    }

    /* JADX INFO: renamed from: T */
    private static int m4097T(int i3) {
        if (i3 == 0) {
            return 8388661;
        }
        return i3;
    }

    /* JADX INFO: renamed from: U */
    private void m4098U(View view, int i3) {
        C0956f c0956f = (C0956f) view.getLayoutParams();
        int i4 = c0956f.f4627i;
        if (i4 != i3) {
            AbstractC0268W.m750S(view, i3 - i4);
            c0956f.f4627i = i3;
        }
    }

    /* JADX INFO: renamed from: V */
    private void m4099V(View view, int i3) {
        C0956f c0956f = (C0956f) view.getLayoutParams();
        int i4 = c0956f.f4628j;
        if (i4 != i3) {
            AbstractC0268W.m751T(view, i3 - i4);
            c0956f.f4628j = i3;
        }
    }

    /* JADX INFO: renamed from: X */
    private void m4100X() {
        if (!AbstractC0268W.m800v(this)) {
            AbstractC0268W.m795s0(this, null);
            return;
        }
        if (this.f4614s == null) {
            this.f4614s = new C0951a();
        }
        AbstractC0268W.m795s0(this, this.f4614s);
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: a */
    private static Rect m4101a() {
        Rect rect = (Rect) f4595y.mo602b();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: d */
    private static int m4102d(int i3, int i4, int i5) {
        return i3 < i4 ? i4 : i3 > i5 ? i5 : i3;
    }

    /* JADX INFO: renamed from: e */
    private void m4103e(C0956f c0956f, Rect rect, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0956f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i3) - ((ViewGroup.MarginLayoutParams) c0956f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0956f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) c0956f).bottomMargin));
        rect.set(iMax, iMax2, i3 + iMax, i4 + iMax2);
    }

    /* JADX INFO: renamed from: f */
    private C0318w0 m4104f(C0318w0 c0318w0) {
        AbstractC0953c abstractC0953cM4169e;
        if (c0318w0.m1092q()) {
            return c0318w0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (AbstractC0268W.m800v(childAt) && (abstractC0953cM4169e = ((C0956f) childAt.getLayoutParams()).m4169e()) != null) {
                c0318w0 = abstractC0953cM4169e.m4145j(this, childAt, c0318w0);
                if (c0318w0.m1092q()) {
                    return c0318w0;
                }
            }
        }
        return c0318w0;
    }

    /* JADX INFO: renamed from: v */
    private void m4105v(View view, int i3, Rect rect, Rect rect2, C0956f c0956f, int i4, int i5) {
        int iM1053b = AbstractC0309s.m1053b(m4095R(c0956f.f4621c), i3);
        int iM1053b2 = AbstractC0309s.m1053b(m4096S(c0956f.f4622d), i3);
        int i6 = iM1053b & 7;
        int i7 = iM1053b & 112;
        int i8 = iM1053b2 & 7;
        int i9 = iM1053b2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i4 / 2;
        } else if (i6 != 5) {
            iWidth -= i4;
        }
        if (i7 == 16) {
            iHeight -= i5 / 2;
        } else if (i7 != 80) {
            iHeight -= i5;
        }
        rect2.set(iWidth, iHeight, i4 + iWidth, i5 + iHeight);
    }

    /* JADX INFO: renamed from: w */
    private int m4106w(int i3) {
        int[] iArr = this.f4605j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i3);
            return 0;
        }
        if (i3 >= 0 && i3 < iArr.length) {
            return iArr[i3];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i3 + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: z */
    private void m4107z(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = f4594x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m4108B(View view, int i3, int i4) {
        Rect rectM4101a = m4101a();
        m4125t(view, rectM4101a);
        try {
            return rectM4101a.contains(i3, i4);
        } finally {
            m4093O(rectM4101a);
        }
    }

    /* JADX INFO: renamed from: G */
    void m4109G(View view, int i3) {
        AbstractC0953c abstractC0953cM4169e;
        C0956f c0956f = (C0956f) view.getLayoutParams();
        if (c0956f.f4629k != null) {
            Rect rectM4101a = m4101a();
            Rect rectM4101a2 = m4101a();
            Rect rectM4101a3 = m4101a();
            m4125t(c0956f.f4629k, rectM4101a);
            m4122q(view, false, rectM4101a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m4105v(view, i3, rectM4101a, rectM4101a3, c0956f, measuredWidth, measuredHeight);
            boolean z2 = (rectM4101a3.left == rectM4101a2.left && rectM4101a3.top == rectM4101a2.top) ? false : true;
            m4103e(c0956f, rectM4101a3, measuredWidth, measuredHeight);
            int i4 = rectM4101a3.left - rectM4101a2.left;
            int i5 = rectM4101a3.top - rectM4101a2.top;
            if (i4 != 0) {
                AbstractC0268W.m750S(view, i4);
            }
            if (i5 != 0) {
                AbstractC0268W.m751T(view, i5);
            }
            if (z2 && (abstractC0953cM4169e = c0956f.m4169e()) != null) {
                abstractC0953cM4169e.mo4147l(this, view, c0956f.f4629k);
            }
            m4093O(rectM4101a);
            m4093O(rectM4101a2);
            m4093O(rectM4101a3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m4110H(int r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m4110H(int):void");
    }

    /* JADX INFO: renamed from: I */
    public void m4111I(View view, int i3) {
        C0956f c0956f = (C0956f) view.getLayoutParams();
        if (c0956f.m4165a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c0956f.f4629k;
        if (view2 != null) {
            m4087D(view, view2, i3);
            return;
        }
        int i4 = c0956f.f4623e;
        if (i4 >= 0) {
            m4088E(view, i4, i3);
        } else {
            m4086C(view, i3);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m4112J(View view, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: N */
    void m4113N(View view, Rect rect) {
        ((C0956f) view.getLayoutParams()).m4179p(rect);
    }

    /* JADX INFO: renamed from: P */
    void m4114P() {
        if (this.f4604i && this.f4608m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4608m);
        }
        this.f4609n = false;
    }

    /* JADX INFO: renamed from: W */
    final C0318w0 m4115W(C0318w0 c0318w0) {
        if (AbstractC0206c.m596a(this.f4610o, c0318w0)) {
            return c0318w0;
        }
        this.f4610o = c0318w0;
        boolean z2 = false;
        boolean z3 = c0318w0 != null && c0318w0.m1088l() > 0;
        this.f4611p = z3;
        if (!z3 && getBackground() == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        C0318w0 c0318w0M4104f = m4104f(c0318w0);
        requestLayout();
        return c0318w0M4104f;
    }

    /* JADX INFO: renamed from: b */
    void m4116b() {
        if (this.f4604i) {
            if (this.f4608m == null) {
                this.f4608m = new ViewTreeObserverOnPreDrawListenerC0957g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4608m);
        }
        this.f4609n = true;
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: c */
    public void mo648c(View view, View view2, int i3, int i4) {
        AbstractC0953c abstractC0953cM4169e;
        View view3;
        View view4;
        int i5;
        int i6;
        this.f4615t.m658c(view, view2, i3, i4);
        this.f4607l = view2;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            C0956f c0956f = (C0956f) childAt.getLayoutParams();
            if (c0956f.m4173i(i4) && (abstractC0953cM4169e = c0956f.m4169e()) != null) {
                view3 = view;
                view4 = view2;
                i5 = i3;
                i6 = i4;
                abstractC0953cM4169e.m4161z(this, childAt, view3, view4, i5, i6);
            } else {
                view3 = view;
                view4 = view2;
                i5 = i3;
                i6 = i4;
            }
            i7++;
            view = view3;
            view2 = view4;
            i3 = i5;
            i4 = i6;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0956f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0956f) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r2.f4619a
            if (r3 == 0) goto L8f
            float r3 = r3.m4143h(r0, r1)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8f
            android.graphics.Paint r4 = r0.f4600e
            if (r4 != 0) goto L22
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.f4600e = r4
        L22:
            android.graphics.Paint r4 = r0.f4600e
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.f4619a
            int r2 = r2.m4142g(r0, r1)
            r4.setColor(r2)
            android.graphics.Paint r2 = r0.f4600e
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            int r3 = m4102d(r3, r4, r5)
            r2.setAlpha(r3)
            int r2 = r17.save()
            boolean r3 = r1.isOpaque()
            if (r3 == 0) goto L65
            int r3 = r1.getLeft()
            float r5 = (float) r3
            int r3 = r1.getTop()
            float r6 = (float) r3
            int r3 = r1.getRight()
            float r7 = (float) r3
            int r3 = r1.getBottom()
            float r8 = (float) r3
            android.graphics.Region$Op r9 = android.graphics.Region.Op.DIFFERENCE
            r4 = r17
            r4.clipRect(r5, r6, r7, r8, r9)
        L65:
            int r3 = r0.getPaddingLeft()
            float r11 = (float) r3
            int r3 = r0.getPaddingTop()
            float r12 = (float) r3
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            float r13 = (float) r3
            int r3 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r3 = r3 - r4
            float r14 = (float) r3
            android.graphics.Paint r15 = r0.f4600e
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            r4 = r10
            r4.restoreToCount(r2)
            goto L91
        L8f:
            r4 = r17
        L91:
            boolean r1 = super.drawChild(r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4612q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4117g(View view) {
        List listM4190g = this.f4597b.m4190g(view);
        if (listM4190g == null || listM4190g.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < listM4190g.size(); i3++) {
            View view2 = (View) listM4190g.get(i3);
            AbstractC0953c abstractC0953cM4169e = ((C0956f) view2.getLayoutParams()).m4169e();
            if (abstractC0953cM4169e != null) {
                abstractC0953cM4169e.mo4147l(this, view2, view);
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        m4092M();
        return Collections.unmodifiableList(this.f4596a);
    }

    public final C0318w0 getLastWindowInsets() {
        return this.f4610o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4615t.m656a();
    }

    public Drawable getStatusBarBackground() {
        return this.f4612q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: renamed from: h */
    void m4118h() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            if (m4085A(getChildAt(i3))) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2 != this.f4609n) {
            if (z2) {
                m4116b();
            } else {
                m4114P();
            }
        }
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: i */
    public void mo649i(View view, int i3) {
        this.f4615t.m660e(view, i3);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C0956f c0956f = (C0956f) childAt.getLayoutParams();
            if (c0956f.m4173i(i3)) {
                AbstractC0953c abstractC0953cM4169e = c0956f.m4169e();
                if (abstractC0953cM4169e != null) {
                    abstractC0953cM4169e.mo4138G(this, childAt, view, i3);
                }
                c0956f.m4175k(i3);
                c0956f.m4174j();
            }
        }
        this.f4607l = null;
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: j */
    public void mo650j(View view, int i3, int i4, int[] iArr, int i5) {
        AbstractC0953c abstractC0953cM4169e;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0956f c0956f = (C0956f) childAt.getLayoutParams();
                if (c0956f.m4173i(i5) && (abstractC0953cM4169e = c0956f.m4169e()) != null) {
                    int[] iArr2 = this.f4601f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0953cM4169e.mo4156u(this, childAt, view, i3, i4, iArr2, i5);
                    int[] iArr3 = this.f4601f;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f4601f;
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            m4110H(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0956f generateDefaultLayoutParams() {
        return new C0956f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0956f generateLayoutParams(AttributeSet attributeSet) {
        return new C0956f(getContext(), attributeSet);
    }

    @Override // p027J.InterfaceC0231D
    /* JADX INFO: renamed from: m */
    public void mo654m(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        AbstractC0953c abstractC0953cM4169e;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0956f c0956f = (C0956f) childAt.getLayoutParams();
                if (c0956f.m4173i(i7) && (abstractC0953cM4169e = c0956f.m4169e()) != null) {
                    int[] iArr2 = this.f4601f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0953cM4169e.mo4159x(this, childAt, view, i3, i4, i5, i6, i7, iArr2);
                    int[] iArr3 = this.f4601f;
                    iMax = i5 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f4601f;
                    iMax2 = i6 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            m4110H(1);
        }
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: n */
    public void mo651n(View view, int i3, int i4, int i5, int i6, int i7) {
        mo654m(view, i3, i4, i5, i6, 0, this.f4602g);
    }

    @Override // p027J.InterfaceC0229C
    /* JADX INFO: renamed from: o */
    public boolean mo652o(View view, View view2, int i3, int i4) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0956f c0956f = (C0956f) childAt.getLayoutParams();
                AbstractC0953c abstractC0953cM4169e = c0956f.m4169e();
                if (abstractC0953cM4169e != null) {
                    boolean zMo4136E = abstractC0953cM4169e.mo4136E(this, childAt, view, view2, i3, i4);
                    z2 |= zMo4136E;
                    c0956f.m4180q(i4, zMo4136E);
                } else {
                    c0956f.m4180q(i4, false);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4094Q(false);
        if (this.f4609n) {
            if (this.f4608m == null) {
                this.f4608m = new ViewTreeObserverOnPreDrawListenerC0957g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4608m);
        }
        if (this.f4610o == null && AbstractC0268W.m800v(this)) {
            AbstractC0268W.m769f0(this);
        }
        this.f4604i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4094Q(false);
        if (this.f4609n && this.f4608m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4608m);
        }
        View view = this.f4607l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f4604i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4611p || this.f4612q == null) {
            return;
        }
        C0318w0 c0318w0 = this.f4610o;
        int iM1088l = c0318w0 != null ? c0318w0.m1088l() : 0;
        if (iM1088l > 0) {
            this.f4612q.setBounds(0, 0, getWidth(), iM1088l);
            this.f4612q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m4094Q(true);
        }
        boolean zM4091L = m4091L(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM4091L;
        }
        m4094Q(true);
        return zM4091L;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        AbstractC0953c abstractC0953cM4169e;
        int iM806y = AbstractC0268W.m806y(this);
        int size = this.f4596a.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) this.f4596a.get(i7);
            if (view.getVisibility() != 8 && ((abstractC0953cM4169e = ((C0956f) view.getLayoutParams()).m4169e()) == null || !abstractC0953cM4169e.mo4151p(this, view, iM806y))) {
                m4111I(view, iM806y);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
        /*
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3f
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1b
        L15:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            goto L38
        L1b:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0956f) r4
            boolean r5 = r4.m4173i(r1)
            if (r5 != 0) goto L28
            goto L15
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.m4169e()
            if (r4 == 0) goto L15
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r12 = r4.m4153r(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r12
        L38:
            int r2 = r2 + 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            goto L7
        L3f:
            r5 = r11
            if (r3 == 0) goto L46
            r12 = 1
            r11.m4110H(r12)
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedFling(android.view.View, float, float, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
        /*
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3b
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L19
        L15:
            r7 = r11
            r8 = r12
            r9 = r13
            goto L35
        L19:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0956f) r4
            boolean r5 = r4.m4173i(r1)
            if (r5 != 0) goto L26
            goto L15
        L26:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.m4169e()
            if (r4 == 0) goto L15
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r11 = r4.mo4154s(r5, r6, r7, r8, r9)
            r3 = r3 | r11
        L35:
            int r2 = r2 + 1
            r11 = r7
            r12 = r8
            r13 = r9
            goto L7
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedPreFling(android.view.View, float, float):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        mo650j(view, i3, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        mo651n(view, i3, i4, i5, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i3) {
        mo648c(view, view2, i3, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m4418a());
        SparseArray sparseArray = savedState.f4616f;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            AbstractC0953c abstractC0953cM4169e = m4128y(childAt).m4169e();
            if (id != -1 && abstractC0953cM4169e != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0953cM4169e.mo4133B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableMo4134C;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            AbstractC0953c abstractC0953cM4169e = ((C0956f) childAt.getLayoutParams()).m4169e();
            if (id != -1 && abstractC0953cM4169e != null && (parcelableMo4134C = abstractC0953cM4169e.mo4134C(this, childAt)) != null) {
                sparseArray.append(id, parcelableMo4134C);
            }
        }
        savedState.f4616f = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i3) {
        return mo652o(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo649i(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f4606k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m4091L(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f4606k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0956f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m4169e()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f4606k
            boolean r6 = r6.mo4139H(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f4606k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L56
            r1 = 3
            if (r2 != r1) goto L55
            goto L56
        L55:
            return r6
        L56:
            r0.m4094Q(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0956f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0956f ? new C0956f((C0956f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0956f((ViewGroup.MarginLayoutParams) layoutParams) : new C0956f(layoutParams);
    }

    /* JADX INFO: renamed from: q */
    void m4122q(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            m4125t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: r */
    public List m4123r(View view) {
        List listM4191h = this.f4597b.m4191h(view);
        this.f4599d.clear();
        if (listM4191h != null) {
            this.f4599d.addAll(listM4191h);
        }
        return this.f4599d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC0953c abstractC0953cM4169e = ((C0956f) view.getLayoutParams()).m4169e();
        if (abstractC0953cM4169e == null || !abstractC0953cM4169e.mo4132A(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f4603h) {
            return;
        }
        m4094Q(false);
        this.f4603h = true;
    }

    /* JADX INFO: renamed from: s */
    public List m4124s(View view) {
        List listM4190g = this.f4597b.m4190g(view);
        this.f4599d.clear();
        if (listM4190g != null) {
            this.f4599d.addAll(listM4190g);
        }
        return this.f4599d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m4100X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4613r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f4612q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f4612q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f4612q.setState(getDrawableState());
                }
                AbstractC0000a.m12m(this.f4612q, AbstractC0268W.m806y(this));
                this.f4612q.setVisible(getVisibility() == 0, false);
                this.f4612q.setCallback(this);
            }
            AbstractC0268W.m757Z(this);
        }
    }

    public void setStatusBarBackgroundColor(int i3) {
        setStatusBarBackground(new ColorDrawable(i3));
    }

    public void setStatusBarBackgroundResource(int i3) {
        setStatusBarBackground(i3 != 0 ? AbstractC0966b.getDrawable(getContext(), i3) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z2 = i3 == 0;
        Drawable drawable = this.f4612q;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f4612q.setVisible(z2, false);
    }

    /* JADX INFO: renamed from: t */
    void m4125t(View view, Rect rect) {
        AbstractC0961c.m4194a(this, view, rect);
    }

    /* JADX INFO: renamed from: u */
    void m4126u(View view, int i3, Rect rect, Rect rect2) {
        C0956f c0956f = (C0956f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m4105v(view, i3, rect, rect2, c0956f, measuredWidth, measuredHeight);
        m4103e(c0956f, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4612q;
    }

    /* JADX INFO: renamed from: x */
    void m4127x(View view, Rect rect) {
        rect.set(((C0956f) view.getLayoutParams()).m4171g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    C0956f m4128y(View view) {
        C0956f c0956f = (C0956f) view.getLayoutParams();
        if (!c0956f.f4620b) {
            if (view instanceof InterfaceC0952b) {
                AbstractC0953c behavior = ((InterfaceC0952b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0956f.m4177n(behavior);
                c0956f.f4620b = true;
                return c0956f;
            }
            InterfaceC0954d interfaceC0954d = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0954d = (InterfaceC0954d) superclass.getAnnotation(InterfaceC0954d.class);
                if (interfaceC0954d != null) {
                    break;
                }
            }
            if (interfaceC0954d != null) {
                try {
                    c0956f.m4177n((AbstractC0953c) interfaceC0954d.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e3) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0954d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e3);
                }
            }
            c0956f.f4620b = true;
        }
        return c0956f;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i3) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i3);
        this.f4596a = new ArrayList();
        this.f4597b = new C0960b();
        this.f4598c = new ArrayList();
        this.f4599d = new ArrayList();
        this.f4601f = new int[2];
        this.f4602g = new int[2];
        this.f4615t = new C0233E(this);
        TypedArray typedArrayObtainStyledAttributes = i3 == 0 ? context.obtainStyledAttributes(attributeSet, AbstractC2473c.f11468b, 0, AbstractC2472b.f11466a) : context.obtainStyledAttributes(attributeSet, AbstractC2473c.f11468b, i3, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i3 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, AbstractC2473c.f11468b, attributeSet, typedArrayObtainStyledAttributes, 0, AbstractC2472b.f11466a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, AbstractC2473c.f11468b, attributeSet, typedArrayObtainStyledAttributes, i3, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC2473c.f11469c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f4605j = resources.getIntArray(resourceId);
            float f3 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f4605j.length;
            for (int i4 = 0; i4 < length; i4++) {
                coordinatorLayout.f4605j[i4] = (int) (r12[i4] * f3);
            }
        }
        coordinatorLayout.f4612q = typedArrayObtainStyledAttributes.getDrawable(AbstractC2473c.f11470d);
        typedArrayObtainStyledAttributes.recycle();
        m4100X();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0955e());
        if (AbstractC0268W.m802w(this) == 0) {
            AbstractC0268W.m789p0(this, 1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0950a();

        /* JADX INFO: renamed from: f */
        SparseArray f4616f;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        static class C0950a implements Parcelable.ClassLoaderCreator {
            C0950a() {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i3 = parcel.readInt();
            int[] iArr = new int[i3];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f4616f = new SparseArray(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                this.f4616f.append(iArr[i4], parcelableArray[i4]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            SparseArray sparseArray = this.f4616f;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i4 = 0; i4 < size; i4++) {
                iArr[i4] = this.f4616f.keyAt(i4);
                parcelableArr[i4] = (Parcelable) this.f4616f.valueAt(i4);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i3);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0956f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        AbstractC0953c f4619a;

        /* JADX INFO: renamed from: b */
        boolean f4620b;

        /* JADX INFO: renamed from: c */
        public int f4621c;

        /* JADX INFO: renamed from: d */
        public int f4622d;

        /* JADX INFO: renamed from: e */
        public int f4623e;

        /* JADX INFO: renamed from: f */
        int f4624f;

        /* JADX INFO: renamed from: g */
        public int f4625g;

        /* JADX INFO: renamed from: h */
        public int f4626h;

        /* JADX INFO: renamed from: i */
        int f4627i;

        /* JADX INFO: renamed from: j */
        int f4628j;

        /* JADX INFO: renamed from: k */
        View f4629k;

        /* JADX INFO: renamed from: l */
        View f4630l;

        /* JADX INFO: renamed from: m */
        private boolean f4631m;

        /* JADX INFO: renamed from: n */
        private boolean f4632n;

        /* JADX INFO: renamed from: o */
        private boolean f4633o;

        /* JADX INFO: renamed from: p */
        private boolean f4634p;

        /* JADX INFO: renamed from: q */
        final Rect f4635q;

        /* JADX INFO: renamed from: r */
        Object f4636r;

        public C0956f(int i3, int i4) {
            super(i3, i4);
            this.f4620b = false;
            this.f4621c = 0;
            this.f4622d = 0;
            this.f4623e = -1;
            this.f4624f = -1;
            this.f4625g = 0;
            this.f4626h = 0;
            this.f4635q = new Rect();
        }

        /* JADX INFO: renamed from: m */
        private void m4162m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f4624f);
            this.f4629k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f4630l = null;
                    this.f4629k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f4624f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f4630l = null;
                this.f4629k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f4630l = null;
                    this.f4629k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f4630l = viewFindViewById;
        }

        /* JADX INFO: renamed from: r */
        private boolean m4163r(View view, int i3) {
            int iM1053b = AbstractC0309s.m1053b(((C0956f) view.getLayoutParams()).f4625g, i3);
            return iM1053b != 0 && (AbstractC0309s.m1053b(this.f4626h, i3) & iM1053b) == iM1053b;
        }

        /* JADX INFO: renamed from: s */
        private boolean m4164s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f4629k.getId() != this.f4624f) {
                return false;
            }
            View view2 = this.f4629k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f4630l = null;
                    this.f4629k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f4630l = view2;
            return true;
        }

        /* JADX INFO: renamed from: a */
        boolean m4165a() {
            return this.f4629k == null && this.f4624f != -1;
        }

        /* JADX INFO: renamed from: b */
        boolean m4166b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f4630l || m4163r(view2, AbstractC0268W.m806y(coordinatorLayout))) {
                return true;
            }
            AbstractC0953c abstractC0953c = this.f4619a;
            return abstractC0953c != null && abstractC0953c.mo4144i(coordinatorLayout, view, view2);
        }

        /* JADX INFO: renamed from: c */
        boolean m4167c() {
            if (this.f4619a == null) {
                this.f4631m = false;
            }
            return this.f4631m;
        }

        /* JADX INFO: renamed from: d */
        View m4168d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f4624f == -1) {
                this.f4630l = null;
                this.f4629k = null;
                return null;
            }
            if (this.f4629k == null || !m4164s(view, coordinatorLayout)) {
                m4162m(view, coordinatorLayout);
            }
            return this.f4629k;
        }

        /* JADX INFO: renamed from: e */
        public AbstractC0953c m4169e() {
            return this.f4619a;
        }

        /* JADX INFO: renamed from: f */
        boolean m4170f() {
            return this.f4634p;
        }

        /* JADX INFO: renamed from: g */
        Rect m4171g() {
            return this.f4635q;
        }

        /* JADX INFO: renamed from: h */
        boolean m4172h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z2 = this.f4631m;
            if (z2) {
                return true;
            }
            AbstractC0953c abstractC0953c = this.f4619a;
            boolean zM4140e = (abstractC0953c != null ? abstractC0953c.m4140e(coordinatorLayout, view) : false) | z2;
            this.f4631m = zM4140e;
            return zM4140e;
        }

        /* JADX INFO: renamed from: i */
        boolean m4173i(int i3) {
            if (i3 == 0) {
                return this.f4632n;
            }
            if (i3 != 1) {
                return false;
            }
            return this.f4633o;
        }

        /* JADX INFO: renamed from: j */
        void m4174j() {
            this.f4634p = false;
        }

        /* JADX INFO: renamed from: k */
        void m4175k(int i3) {
            m4180q(i3, false);
        }

        /* JADX INFO: renamed from: l */
        void m4176l() {
            this.f4631m = false;
        }

        /* JADX INFO: renamed from: n */
        public void m4177n(AbstractC0953c abstractC0953c) {
            AbstractC0953c abstractC0953c2 = this.f4619a;
            if (abstractC0953c2 != abstractC0953c) {
                if (abstractC0953c2 != null) {
                    abstractC0953c2.mo4149n();
                }
                this.f4619a = abstractC0953c;
                this.f4636r = null;
                this.f4620b = true;
                if (abstractC0953c != null) {
                    abstractC0953c.mo4146k(this);
                }
            }
        }

        /* JADX INFO: renamed from: o */
        void m4178o(boolean z2) {
            this.f4634p = z2;
        }

        /* JADX INFO: renamed from: p */
        void m4179p(Rect rect) {
            this.f4635q.set(rect);
        }

        /* JADX INFO: renamed from: q */
        void m4180q(int i3, boolean z2) {
            if (i3 == 0) {
                this.f4632n = z2;
            } else {
                if (i3 != 1) {
                    return;
                }
                this.f4633o = z2;
            }
        }

        C0956f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4620b = false;
            this.f4621c = 0;
            this.f4622d = 0;
            this.f4623e = -1;
            this.f4624f = -1;
            this.f4625g = 0;
            this.f4626h = 0;
            this.f4635q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2473c.f11471e);
            this.f4621c = typedArrayObtainStyledAttributes.getInteger(AbstractC2473c.f11472f, 0);
            this.f4624f = typedArrayObtainStyledAttributes.getResourceId(AbstractC2473c.f11473g, -1);
            this.f4622d = typedArrayObtainStyledAttributes.getInteger(AbstractC2473c.f11474h, 0);
            this.f4623e = typedArrayObtainStyledAttributes.getInteger(AbstractC2473c.f11478l, -1);
            this.f4625g = typedArrayObtainStyledAttributes.getInt(AbstractC2473c.f11477k, 0);
            this.f4626h = typedArrayObtainStyledAttributes.getInt(AbstractC2473c.f11476j, 0);
            int i3 = AbstractC2473c.f11475i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
            this.f4620b = zHasValue;
            if (zHasValue) {
                this.f4619a = CoordinatorLayout.m4090K(context, attributeSet, typedArrayObtainStyledAttributes.getString(i3));
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC0953c abstractC0953c = this.f4619a;
            if (abstractC0953c != null) {
                abstractC0953c.mo4146k(this);
            }
        }

        public C0956f(C0956f c0956f) {
            super((ViewGroup.MarginLayoutParams) c0956f);
            this.f4620b = false;
            this.f4621c = 0;
            this.f4622d = 0;
            this.f4623e = -1;
            this.f4624f = -1;
            this.f4625g = 0;
            this.f4626h = 0;
            this.f4635q = new Rect();
        }

        public C0956f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4620b = false;
            this.f4621c = 0;
            this.f4622d = 0;
            this.f4623e = -1;
            this.f4624f = -1;
            this.f4625g = 0;
            this.f4626h = 0;
            this.f4635q = new Rect();
        }

        public C0956f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4620b = false;
            this.f4621c = 0;
            this.f4622d = 0;
            this.f4623e = -1;
            this.f4624f = -1;
            this.f4625g = 0;
            this.f4626h = 0;
            this.f4635q = new Rect();
        }
    }
}
