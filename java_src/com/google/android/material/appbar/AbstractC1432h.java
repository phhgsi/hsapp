package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.AbstractC1546q;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0145f;

/* JADX INFO: renamed from: com.google.android.material.appbar.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1432h {

    /* JADX INFO: renamed from: a */
    private static final int[] f6971a = {R.attr.stateListAnimator};

    /* JADX INFO: renamed from: a */
    static void m7377a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: renamed from: b */
    static void m7378b(View view, float f3) {
        int integer = view.getResources().getInteger(AbstractC0145f.f507a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j3 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, AbstractC0140a.f328U, -AbstractC0140a.f329V}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j3));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f3).setDuration(j3));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: renamed from: c */
    static void m7379c(View view, AttributeSet attributeSet, int i3, int i4) {
        Context context = view.getContext();
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context, attributeSet, f6971a, i3, i4, new int[0]);
        try {
            if (typedArrayM8488i.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayM8488i.getResourceId(0, 0)));
            }
            typedArrayM8488i.recycle();
        } catch (Throwable th) {
            typedArrayM8488i.recycle();
            throw th;
        }
    }
}
