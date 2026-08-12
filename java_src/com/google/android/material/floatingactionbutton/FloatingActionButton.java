package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.AbstractC1532c;
import com.google.android.material.internal.AbstractC1550u;
import java.util.List;
import p016F0.AbstractC0150k;
import p052R0.InterfaceC0498a;
import p076Z0.InterfaceC0644o;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatingActionButton extends AbstractC1550u implements InterfaceC0498a, InterfaceC0644o, CoordinatorLayout.InterfaceC0952b {

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo8285I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo8285I(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: M */
        public /* bridge */ /* synthetic */ boolean mo8286M(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo8286M(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: N */
        public /* bridge */ /* synthetic */ boolean mo8287N(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i3) {
            return super.mo8287N(coordinatorLayout, floatingActionButton, i3);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: k */
        public /* bridge */ /* synthetic */ void mo4146k(CoordinatorLayout.C0956f c0956f) {
            super.mo4146k(c0956f);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0953c {

        /* JADX INFO: renamed from: a */
        private Rect f7615a;

        /* JADX INFO: renamed from: b */
        private boolean f7616b;

        public BaseBehavior() {
            this.f7616b = true;
        }

        /* JADX INFO: renamed from: J */
        private boolean m8280J(View view, FloatingActionButton floatingActionButton) {
            throw null;
        }

        /* JADX INFO: renamed from: K */
        private static boolean m8281K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0956f) {
                return ((CoordinatorLayout.C0956f) layoutParams).m4169e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX INFO: renamed from: L */
        private void m8282L(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            throw null;
        }

        /* JADX INFO: renamed from: O */
        private boolean m8283O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (m8280J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f7615a == null) {
                this.f7615a = new Rect();
            }
            Rect rect = this.f7615a;
            AbstractC1532c.m8373a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                throw null;
            }
            throw null;
        }

        /* JADX INFO: renamed from: P */
        private boolean m8284P(View view, FloatingActionButton floatingActionButton) {
            if (m8280J(view, floatingActionButton)) {
                return false;
            }
            throw null;
        }

        /* JADX INFO: renamed from: I */
        public boolean mo8285I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            throw null;
        }

        /* JADX INFO: renamed from: M */
        public boolean mo8286M(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m8283O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!m8281K(view)) {
                return false;
            }
            m8284P(view, floatingActionButton);
            return false;
        }

        /* JADX INFO: renamed from: N */
        public boolean mo8287N(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i3) {
            List listM4123r = coordinatorLayout.m4123r(floatingActionButton);
            int size = listM4123r.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) listM4123r.get(i4);
                if (!(view instanceof AppBarLayout)) {
                    if (m8281K(view) && m8284P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m8283O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m4111I(floatingActionButton, i3);
            m8282L(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ boolean mo4141f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            AbstractC0740E.m2693a(view);
            return mo8285I(coordinatorLayout, null, rect);
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
            return mo8286M(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
            AbstractC0740E.m2693a(view);
            return mo8287N(coordinatorLayout, null, i3);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f812Y1);
            this.f7616b = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f821Z1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
