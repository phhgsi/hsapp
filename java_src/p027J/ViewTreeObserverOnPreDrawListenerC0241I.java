package p027J;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: J.I */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0241I implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    private final View f1256a;

    /* JADX INFO: renamed from: b */
    private ViewTreeObserver f1257b;

    /* JADX INFO: renamed from: c */
    private final Runnable f1258c;

    private ViewTreeObserverOnPreDrawListenerC0241I(View view, Runnable runnable) {
        this.f1256a = view;
        this.f1257b = view.getViewTreeObserver();
        this.f1258c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0241I m668a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0241I viewTreeObserverOnPreDrawListenerC0241I = new ViewTreeObserverOnPreDrawListenerC0241I(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0241I);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0241I);
        return viewTreeObserverOnPreDrawListenerC0241I;
    }

    /* JADX INFO: renamed from: b */
    public void m669b() {
        if (this.f1257b.isAlive()) {
            this.f1257b.removeOnPreDrawListener(this);
        } else {
            this.f1256a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1256a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m669b();
        this.f1258c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1257b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m669b();
    }
}
