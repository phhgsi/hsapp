package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.AbstractC1532c;
import java.util.List;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0952b {

    /* JADX INFO: renamed from: K */
    private static final int f7607K = AbstractC0149j.f588u;

    /* JADX INFO: renamed from: L */
    static final Property f7608L = new C1521a(Float.class, "width");

    /* JADX INFO: renamed from: M */
    static final Property f7609M = new C1522b(Float.class, "height");

    /* JADX INFO: renamed from: N */
    static final Property f7610N = new C1523c(Float.class, "paddingStart");

    /* JADX INFO: renamed from: O */
    static final Property f7611O = new C1524d(Float.class, "paddingEnd");

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C1521a extends Property {
        C1521a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f3) {
            view.getLayoutParams().width = f3.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    class C1522b extends Property {
        C1522b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f3) {
            view.getLayoutParams().height = f3.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    class C1523c extends Property {
        C1523c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f3) {
            view.setPaddingRelative(f3.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    class C1524d extends Property {
        C1524d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f3) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f3.intValue(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public static abstract class AbstractC1525e {
    }

    /* JADX INFO: renamed from: t */
    static /* synthetic */ void m8262t(ExtendedFloatingActionButton extendedFloatingActionButton, int i3, AbstractC1525e abstractC1525e) {
        throw null;
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0953c {

        /* JADX INFO: renamed from: a */
        private Rect f7612a;

        /* JADX INFO: renamed from: b */
        private boolean f7613b;

        /* JADX INFO: renamed from: c */
        private boolean f7614c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f7613b = false;
            this.f7614c = true;
        }

        /* JADX INFO: renamed from: K */
        private static boolean m8263K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0956f) {
                return ((CoordinatorLayout.C0956f) layoutParams).m4169e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX INFO: renamed from: N */
        private boolean m8264N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        /* JADX INFO: renamed from: P */
        private boolean m8265P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m8264N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f7612a == null) {
                this.f7612a = new Rect();
            }
            Rect rect = this.f7612a;
            AbstractC1532c.m8373a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m8271O(extendedFloatingActionButton);
                return true;
            }
            m8267I(extendedFloatingActionButton);
            return true;
        }

        /* JADX INFO: renamed from: Q */
        private boolean m8266Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (m8264N(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        /* JADX INFO: renamed from: I */
        protected void m8267I(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.m8262t(extendedFloatingActionButton, this.f7614c ? 3 : 0, null);
        }

        /* JADX INFO: renamed from: J */
        public boolean m8268J(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo4141f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* JADX INFO: renamed from: L */
        public boolean m8269L(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m8265P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!m8263K(view)) {
                return false;
            }
            m8266Q(view, extendedFloatingActionButton);
            return false;
        }

        /* JADX INFO: renamed from: M */
        public boolean m8270M(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i3) {
            List listM4123r = coordinatorLayout.m4123r(extendedFloatingActionButton);
            int size = listM4123r.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) listM4123r.get(i4);
                if (!(view instanceof AppBarLayout)) {
                    if (m8263K(view) && m8266Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m8265P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m4111I(extendedFloatingActionButton, i3);
            return true;
        }

        /* JADX INFO: renamed from: O */
        protected void m8271O(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.m8262t(extendedFloatingActionButton, this.f7614c ? 2 : 1, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ boolean mo4141f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            AbstractC0740E.m2693a(view);
            return m8268J(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: k */
        public void mo4146k(CoordinatorLayout.C0956f c0956f) {
            if (c0956f.f4626h == 0) {
                c0956f.f4626h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo4147l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0740E.m2693a(view);
            return m8269L(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
            AbstractC0740E.m2693a(view);
            return m8270M(coordinatorLayout, null, i3);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f776U1);
            this.f7613b = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f785V1, false);
            this.f7614c = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f794W1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
