package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p058T0.InterfaceC0522b;

/* JADX INFO: loaded from: classes.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC0952b, InterfaceC0522b {

    public static class Behavior extends CoordinatorLayout.AbstractC0953c {
        public Behavior() {
        }

        /* JADX INFO: renamed from: I */
        public boolean m8616I(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo4147l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0740E.m2693a(view);
            return m8616I(coordinatorLayout, null, view2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
