package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.coordinatorlayout.widget.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0961c {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f4642a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f4643b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m4194a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m4196c(viewGroup, view, rect);
    }

    /* JADX INFO: renamed from: b */
    private static void m4195b(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m4195b(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* JADX INFO: renamed from: c */
    static void m4196c(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal threadLocal = f4642a;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m4195b(viewGroup, view, matrix);
        ThreadLocal threadLocal2 = f4643b;
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
