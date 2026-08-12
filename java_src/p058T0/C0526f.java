package p058T0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0702b;
import p016F0.AbstractC0142c;
import p019G0.AbstractC0176a;
import p060U.C0531b;

/* JADX INFO: renamed from: T0.f */
/* JADX INFO: loaded from: classes.dex */
public class C0526f extends AbstractC0521a {

    /* JADX INFO: renamed from: g */
    private final float f1790g;

    /* JADX INFO: renamed from: h */
    private final float f1791h;

    /* JADX INFO: renamed from: T0.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0526f.this.f1778b.setTranslationY(0.0f);
            C0526f.this.m1896k(0.0f);
        }
    }

    public C0526f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f1790g = resources.getDimension(AbstractC0142c.f421o);
        this.f1791h = resources.getDimension(AbstractC0142c.f423p);
    }

    /* JADX INFO: renamed from: g */
    private Animator m1891g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f1778b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f1778b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f1778b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i3), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C0531b());
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public void m1892f() {
        if (super.m1873b() == null) {
            return;
        }
        Animator animatorM1891g = m1891g();
        animatorM1891g.setDuration(this.f1781e);
        animatorM1891g.start();
    }

    /* JADX INFO: renamed from: h */
    public void m1893h(C0702b c0702b, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1778b, (Property<View, Float>) View.TRANSLATION_Y, this.f1778b.getHeight() * this.f1778b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new C0531b());
        objectAnimatorOfFloat.setDuration(AbstractC0176a.m484c(this.f1779c, this.f1780d, c0702b.m2627a()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: i */
    public void m1894i(C0702b c0702b, Animator.AnimatorListener animatorListener) {
        Animator animatorM1891g = m1891g();
        animatorM1891g.setDuration(AbstractC0176a.m484c(this.f1779c, this.f1780d, c0702b.m2627a()));
        if (animatorListener != null) {
            animatorM1891g.addListener(animatorListener);
        }
        animatorM1891g.start();
    }

    /* JADX INFO: renamed from: j */
    public void m1895j(C0702b c0702b) {
        super.m1875d(c0702b);
    }

    /* JADX INFO: renamed from: k */
    public void m1896k(float f3) {
        float fM1872a = m1872a(f3);
        float width = this.f1778b.getWidth();
        float height = this.f1778b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f4 = this.f1790g / width;
        float f5 = this.f1791h / height;
        float fM482a = 1.0f - AbstractC0176a.m482a(0.0f, f4, fM1872a);
        float fM482a2 = 1.0f - AbstractC0176a.m482a(0.0f, f5, fM1872a);
        if (Float.isNaN(fM482a) || Float.isNaN(fM482a2)) {
            return;
        }
        this.f1778b.setScaleX(fM482a);
        this.f1778b.setPivotY(height);
        this.f1778b.setScaleY(fM482a2);
        View view = this.f1778b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fM482a2 != 0.0f ? fM482a / fM482a2 : 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1897l(C0702b c0702b) {
        if (super.m1876e(c0702b) == null) {
            return;
        }
        m1896k(c0702b.m2627a());
    }
}
