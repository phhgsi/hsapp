package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1266k;

/* JADX INFO: renamed from: androidx.transition.c */
/* JADX INFO: loaded from: classes.dex */
public class C1258c extends AbstractC1255N {

    /* JADX INFO: renamed from: androidx.transition.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC1266k.g {

        /* JADX INFO: renamed from: a */
        private final View f6117a;

        /* JADX INFO: renamed from: b */
        private boolean f6118b = false;

        a(View view) {
            this.f6117a = view;
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: a */
        public void mo6352a(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: b */
        public void mo6353b(AbstractC1266k abstractC1266k) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: c */
        public void mo6354c(AbstractC1266k abstractC1266k, boolean z2) {
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: d */
        public void mo6355d(AbstractC1266k abstractC1266k) {
            this.f6117a.setTag(AbstractC1263h.f6141d, Float.valueOf(this.f6117a.getVisibility() == 0 ? AbstractC1242A.m6305b(this.f6117a) : 0.0f));
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: e */
        public void mo6356e(AbstractC1266k abstractC1266k) {
            this.f6117a.setTag(AbstractC1263h.f6141d, null);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void mo6357f(AbstractC1266k abstractC1266k, boolean z2) {
            AbstractC1267l.m6444a(this, abstractC1266k, z2);
        }

        @Override // androidx.transition.AbstractC1266k.g
        /* JADX INFO: renamed from: g */
        public void mo6358g(AbstractC1266k abstractC1266k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC1242A.m6308e(this.f6117a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f6117a.hasOverlappingRendering() && this.f6117a.getLayerType() == 0) {
                this.f6118b = true;
                this.f6117a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (this.f6118b) {
                this.f6117a.setLayerType(0, null);
            }
            if (z2) {
                return;
            }
            AbstractC1242A.m6308e(this.f6117a, 1.0f);
            AbstractC1242A.m6304a(this.f6117a);
        }
    }

    public C1258c(int i3) {
        m6349n0(i3);
    }

    /* JADX INFO: renamed from: o0 */
    private Animator m6375o0(View view, float f3, float f4) {
        if (f3 == f4) {
            return null;
        }
        AbstractC1242A.m6308e(view, f3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC1242A.f6056b, f4);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        m6440z().mo6415a(aVar);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: p0 */
    private static float m6376p0(C1279x c1279x, float f3) {
        Float f4;
        return (c1279x == null || (f4 = (Float) c1279x.f6211a.get("android:fade:transitionAlpha")) == null) ? f3 : f4.floatValue();
    }

    @Override // androidx.transition.AbstractC1255N, androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: j */
    public void mo6343j(C1279x c1279x) {
        super.mo6343j(c1279x);
        Float fValueOf = (Float) c1279x.f6212b.getTag(AbstractC1263h.f6141d);
        if (fValueOf == null) {
            fValueOf = c1279x.f6212b.getVisibility() == 0 ? Float.valueOf(AbstractC1242A.m6305b(c1279x.f6212b)) : Float.valueOf(0.0f);
        }
        c1279x.f6211a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.AbstractC1255N
    /* JADX INFO: renamed from: j0 */
    public Animator mo6344j0(ViewGroup viewGroup, View view, C1279x c1279x, C1279x c1279x2) {
        AbstractC1242A.m6306c(view);
        return m6375o0(view, m6376p0(c1279x, 0.0f), 1.0f);
    }

    @Override // androidx.transition.AbstractC1255N
    /* JADX INFO: renamed from: l0 */
    public Animator mo6346l0(ViewGroup viewGroup, View view, C1279x c1279x, C1279x c1279x2) {
        AbstractC1242A.m6306c(view);
        Animator animatorM6375o0 = m6375o0(view, m6376p0(c1279x, 1.0f), 0.0f);
        if (animatorM6375o0 == null) {
            AbstractC1242A.m6308e(view, m6376p0(c1279x2, 1.0f));
        }
        return animatorM6375o0;
    }

    public C1258c() {
    }
}
