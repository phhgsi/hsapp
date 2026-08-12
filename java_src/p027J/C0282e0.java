package p027J;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: J.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0282e0 {

    /* JADX INFO: renamed from: a */
    private final WeakReference f1329a;

    /* JADX INFO: renamed from: J.e0$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC0284f0 f1330a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f1331b;

        a(InterfaceC0284f0 interfaceC0284f0, View view) {
            this.f1330a = interfaceC0284f0;
            this.f1331b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1330a.mo971a(this.f1331b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1330a.mo972b(this.f1331b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1330a.mo973c(this.f1331b);
        }
    }

    C0282e0(View view) {
        this.f1329a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: h */
    private void m959h(View view, InterfaceC0284f0 interfaceC0284f0) {
        if (interfaceC0284f0 != null) {
            view.animate().setListener(new a(interfaceC0284f0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public C0282e0 m960b(float f3) {
        View view = (View) this.f1329a.get();
        if (view != null) {
            view.animate().alpha(f3);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m961c() {
        View view = (View) this.f1329a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public long m962d() {
        View view = (View) this.f1329a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public C0282e0 m963e(long j3) {
        View view = (View) this.f1329a.get();
        if (view != null) {
            view.animate().setDuration(j3);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C0282e0 m964f(Interpolator interpolator) {
        View view = (View) this.f1329a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C0282e0 m965g(InterfaceC0284f0 interfaceC0284f0) {
        View view = (View) this.f1329a.get();
        if (view != null) {
            m959h(view, interfaceC0284f0);
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C0282e0 m966i(long j3) {
        View view = (View) this.f1329a.get();
        if (view != null) {
            view.animate().setStartDelay(j3);
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C0282e0 m967j(final InterfaceC0288h0 interfaceC0288h0) {
        final View view = (View) this.f1329a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC0288h0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: J.d0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC0288h0.mo976a(view);
                }
            } : null);
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m968k() {
        View view = (View) this.f1329a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* JADX INFO: renamed from: l */
    public C0282e0 m969l(float f3) {
        View view = (View) this.f1329a.get();
        if (view != null) {
            view.animate().translationY(f3);
        }
        return this;
    }
}
