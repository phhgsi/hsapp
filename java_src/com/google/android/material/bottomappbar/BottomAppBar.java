package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0740E;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0149j;

/* JADX INFO: loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0952b {

    /* JADX INFO: renamed from: U */
    private static final int f7083U = AbstractC0149j.f582o;

    /* JADX INFO: renamed from: V */
    private static final int f7084V = AbstractC0140a.f357y;

    /* JADX INFO: renamed from: W */
    private static final int f7085W = AbstractC0140a.f314G;

    /* JADX INFO: renamed from: U */
    static /* synthetic */ void m7576U(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: renamed from: V */
    static /* synthetic */ View m7577V(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static void m7579X(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.C0956f) view.getLayoutParams()).f4622d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: p */
        private final Rect f7086p;

        /* JADX INFO: renamed from: q */
        private WeakReference f7087q;

        /* JADX INFO: renamed from: r */
        private int f7088r;

        /* JADX INFO: renamed from: s */
        private final View.OnLayoutChangeListener f7089s;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class ViewOnLayoutChangeListenerC1447a implements View.OnLayoutChangeListener {
            ViewOnLayoutChangeListenerC1447a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                AbstractC0740E.m2693a(Behavior.this.f7087q.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f7089s = new ViewOnLayoutChangeListenerC1447a();
            this.f7086p = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo4136E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
            AbstractC0740E.m2693a(view);
            return m7582Y(coordinatorLayout, null, view2, view3, i3, i4);
        }

        /* JADX INFO: renamed from: X */
        public boolean m7581X(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i3) {
            this.f7087q = new WeakReference(bottomAppBar);
            View viewM7577V = BottomAppBar.m7577V(bottomAppBar);
            if (viewM7577V != null && !viewM7577V.isLaidOut()) {
                BottomAppBar.m7579X(bottomAppBar, viewM7577V);
                this.f7088r = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0956f) viewM7577V.getLayoutParams())).bottomMargin;
                viewM7577V.addOnLayoutChangeListener(this.f7089s);
                BottomAppBar.m7576U(bottomAppBar);
            }
            coordinatorLayout.m4111I(bottomAppBar, i3);
            return super.mo4151p(coordinatorLayout, bottomAppBar, i3);
        }

        /* JADX INFO: renamed from: Y */
        public boolean m7582Y(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i3, int i4) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ boolean mo4151p(CoordinatorLayout coordinatorLayout, View view, int i3) {
            AbstractC0740E.m2693a(view);
            return m7581X(coordinatorLayout, null, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7089s = new ViewOnLayoutChangeListenerC1447a();
            this.f7086p = new Rect();
        }
    }
}
