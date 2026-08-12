package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import p019G0.AbstractC0176a;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: com.google.android.material.navigation.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1566c {

    /* JADX INFO: renamed from: a */
    private static final int f7850a = Color.alpha(-1728053248);

    /* JADX INFO: renamed from: com.google.android.material.navigation.c$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ DrawerLayout f7851a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f7852b;

        a(DrawerLayout drawerLayout, View view) {
            this.f7851a = drawerLayout;
            this.f7852b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7851a.m4461i(this.f7852b, false);
            this.f7851a.setScrimColor(-1728053248);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Animator.AnimatorListener m8552b(DrawerLayout drawerLayout, View view) {
        return new a(drawerLayout, view);
    }

    /* JADX INFO: renamed from: c */
    public static ValueAnimator.AnimatorUpdateListener m8553c(final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(AbstractC2571d.m12269k(-1728053248, AbstractC0176a.m484c(AbstractC1566c.f7850a, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }
}
