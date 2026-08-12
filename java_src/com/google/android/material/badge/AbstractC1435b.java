package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: renamed from: com.google.android.material.badge.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1435b {
    /* JADX INFO: renamed from: a */
    public static void m7521a(C1434a c1434a, View view) {
        m7522b(c1434a, view, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m7522b(C1434a c1434a, View view, FrameLayout frameLayout) {
        m7526f(c1434a, view, frameLayout);
        if (c1434a.m7514j() != null) {
            c1434a.m7514j().setForeground(c1434a);
        } else {
            view.getOverlay().add(c1434a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static SparseArray m7523c(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
        for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
            int iKeyAt = parcelableSparseArray.keyAt(i3);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i3);
            sparseArray.put(iKeyAt, state != null ? C1434a.m7494e(context, state) : null);
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: d */
    public static ParcelableSparseArray m7524d(SparseArray sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            C1434a c1434a = (C1434a) sparseArray.valueAt(i3);
            parcelableSparseArray.put(iKeyAt, c1434a != null ? c1434a.m7519t() : null);
        }
        return parcelableSparseArray;
    }

    /* JADX INFO: renamed from: e */
    public static void m7525e(C1434a c1434a, View view) {
        if (c1434a == null) {
            return;
        }
        if (c1434a.m7514j() != null) {
            c1434a.m7514j().setForeground(null);
        } else {
            view.getOverlay().remove(c1434a);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7526f(C1434a c1434a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c1434a.setBounds(rect);
        c1434a.m7511P(view, frameLayout);
    }

    /* JADX INFO: renamed from: g */
    public static void m7527g(Rect rect, float f3, float f4, float f5, float f6) {
        rect.set((int) (f3 - f5), (int) (f4 - f6), (int) (f3 + f5), (int) (f4 + f6));
    }
}
