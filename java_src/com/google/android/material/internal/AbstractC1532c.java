package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.google.android.material.internal.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1532c {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f7717a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f7718b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m8373a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m8375c(viewGroup, view, rect);
    }

    /* JADX INFO: renamed from: b */
    private static void m8374b(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m8374b(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* JADX INFO: renamed from: c */
    public static void m8375c(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal threadLocal = f7717a;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m8374b(viewGroup, view, matrix);
        ThreadLocal threadLocal2 = f7718b;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
