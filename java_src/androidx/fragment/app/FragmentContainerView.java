package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p027J.AbstractC0268W;
import p027J.C0318w0;
import p054S.AbstractC0504c;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final List f5021a;

    /* JADX INFO: renamed from: b */
    private final List f5022b;

    /* JADX INFO: renamed from: c */
    private View.OnApplyWindowInsetsListener f5023c;

    /* JADX INFO: renamed from: d */
    private boolean f5024d;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentContainerView$a */
    public static final class C1054a {

        /* JADX INFO: renamed from: a */
        public static final C1054a f5025a = new C1054a();

        private C1054a() {
        }

        /* JADX INFO: renamed from: a */
        public final WindowInsets m4742a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            AbstractC0606k.m2145e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            AbstractC0606k.m2145e(view, "v");
            AbstractC0606k.m2145e(windowInsets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            AbstractC0606k.m2144d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC0606k.m2145e(context, "context");
    }

    /* JADX INFO: renamed from: a */
    private final void m4741a(View view) {
        if (this.f5022b.contains(view)) {
            this.f5021a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        AbstractC0606k.m2145e(view, "child");
        if (FragmentManager.m4743B0(view) != null) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0318w0 c0318w0M752U;
        AbstractC0606k.m2145e(windowInsets, "insets");
        C0318w0 c0318w0M1075y = C0318w0.m1075y(windowInsets);
        AbstractC0606k.m2144d(c0318w0M1075y, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5023c;
        if (onApplyWindowInsetsListener != null) {
            C1054a c1054a = C1054a.f5025a;
            AbstractC0606k.m2142b(onApplyWindowInsetsListener);
            c0318w0M752U = C0318w0.m1075y(c1054a.m4742a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            c0318w0M752U = AbstractC0268W.m752U(this, c0318w0M1075y);
        }
        AbstractC0606k.m2144d(c0318w0M752U, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c0318w0M752U.m1092q()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                AbstractC0268W.m770g(getChildAt(i3), c0318w0M752U);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC0606k.m2145e(canvas, "canvas");
        if (this.f5024d) {
            Iterator it = this.f5021a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j3) {
        AbstractC0606k.m2145e(canvas, "canvas");
        AbstractC0606k.m2145e(view, "child");
        if (this.f5024d && !this.f5021a.isEmpty() && this.f5021a.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        AbstractC0606k.m2145e(view, "view");
        this.f5022b.remove(view);
        if (this.f5021a.remove(view)) {
            this.f5024d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.m4767k0(this).m4832h0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC0606k.m2145e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC0606k.m2144d(childAt, "view");
                m4741a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        AbstractC0606k.m2145e(view, "view");
        m4741a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i3) {
        View childAt = getChildAt(i3);
        AbstractC0606k.m2144d(childAt, "view");
        m4741a(childAt);
        super.removeViewAt(i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        AbstractC0606k.m2145e(view, "view");
        m4741a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            AbstractC0606k.m2144d(childAt, "view");
            m4741a(childAt);
        }
        super.removeViews(i3, i4);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            AbstractC0606k.m2144d(childAt, "view");
            m4741a(childAt);
        }
        super.removeViewsInLayout(i3, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f5024d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC0606k.m2145e(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f5023c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        AbstractC0606k.m2145e(view, "view");
        if (view.getParent() == this) {
            this.f5022b.add(view);
        }
        super.startViewTransition(view);
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i3, int i4, AbstractC0602g abstractC0602g) {
        this(context, attributeSet, (i4 & 4) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i3) {
        String str;
        super(context, attributeSet, i3);
        AbstractC0606k.m2145e(context, "context");
        this.f5021a = new ArrayList();
        this.f5022b = new ArrayList();
        this.f5024d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = AbstractC0504c.f1748e;
            AbstractC0606k.m2144d(iArr, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(AbstractC0504c.f1749f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        String str;
        super(context, attributeSet);
        AbstractC0606k.m2145e(context, "context");
        AbstractC0606k.m2145e(attributeSet, "attrs");
        AbstractC0606k.m2145e(fragmentManager, "fm");
        this.f5021a = new ArrayList();
        this.f5022b = new ArrayList();
        this.f5024d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = AbstractC0504c.f1748e;
        AbstractC0606k.m2144d(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(AbstractC0504c.f1749f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(AbstractC0504c.f1750g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentM4832h0 = fragmentManager.m4832h0(id);
        if (classAttribute != null && fragmentM4832h0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentMo4868a = fragmentManager.m4852s0().mo4868a(context.getClassLoader(), classAttribute);
            AbstractC0606k.m2144d(fragmentMo4868a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentMo4868a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.m4849p().m5053o(true).m5047c(this, fragmentMo4868a, string).mo4886i();
        }
        fragmentManager.m4817U0(this);
    }
}
