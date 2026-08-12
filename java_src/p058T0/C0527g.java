package p058T0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0702b;
import p016F0.AbstractC0142c;
import p019G0.AbstractC0176a;
import p060U.C0531b;

/* JADX INFO: renamed from: T0.g */
/* JADX INFO: loaded from: classes.dex */
public class C0527g extends AbstractC0521a {

    /* JADX INFO: renamed from: g */
    private final float f1793g;

    /* JADX INFO: renamed from: h */
    private final float f1794h;

    /* JADX INFO: renamed from: i */
    private final float f1795i;

    /* JADX INFO: renamed from: T0.g$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f1796a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f1797b;

        a(boolean z2, int i3) {
            this.f1796a = z2;
            this.f1797b = i3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0527g.this.f1778b.setTranslationX(0.0f);
            C0527g.this.m1903k(0.0f, this.f1796a, this.f1797b);
        }
    }

    public C0527g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f1793g = resources.getDimension(AbstractC0142c.f427r);
        this.f1794h = resources.getDimension(AbstractC0142c.f425q);
        this.f1795i = resources.getDimension(AbstractC0142c.f429s);
    }

    /* JADX INFO: renamed from: g */
    private boolean m1898g(int i3, int i4) {
        return (Gravity.getAbsoluteGravity(i3, this.f1778b.getLayoutDirection()) & i4) == i4;
    }

    /* JADX INFO: renamed from: i */
    private int m1899i(boolean z2) {
        ViewGroup.LayoutParams layoutParams = this.f1778b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    /* JADX INFO: renamed from: f */
    public void m1900f() {
        if (super.m1873b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f1778b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f1778b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f1778b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i3), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f1781e);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: h */
    public void m1901h(C0702b c0702b, int i3, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z2 = c0702b.m2628b() == 0;
        boolean zM1898g = m1898g(i3, 3);
        float width = (this.f1778b.getWidth() * this.f1778b.getScaleX()) + m1899i(zM1898g);
        View view = this.f1778b;
        Property property = View.TRANSLATION_X;
        if (zM1898g) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C0531b());
        objectAnimatorOfFloat.setDuration(AbstractC0176a.m484c(this.f1779c, this.f1780d, c0702b.m2627a()));
        objectAnimatorOfFloat.addListener(new a(z2, i3));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: j */
    public void m1902j(C0702b c0702b) {
        super.m1875d(c0702b);
    }

    /* JADX INFO: renamed from: k */
    public void m1903k(float f3, boolean z2, int i3) {
        float fM1872a = m1872a(f3);
        boolean zM1898g = m1898g(i3, 3);
        boolean z3 = z2 == zM1898g;
        int width = this.f1778b.getWidth();
        int height = this.f1778b.getHeight();
        float f4 = width;
        if (f4 > 0.0f) {
            float f5 = height;
            if (f5 <= 0.0f) {
                return;
            }
            float f6 = this.f1793g / f4;
            float f7 = this.f1794h / f4;
            float f8 = this.f1795i / f5;
            View view = this.f1778b;
            if (zM1898g) {
                f4 = 0.0f;
            }
            view.setPivotX(f4);
            if (!z3) {
                f7 = -f6;
            }
            float fM482a = AbstractC0176a.m482a(0.0f, f7, fM1872a);
            float f9 = fM482a + 1.0f;
            float fM482a2 = 1.0f - AbstractC0176a.m482a(0.0f, f8, fM1872a);
            if (Float.isNaN(f9) || Float.isNaN(fM482a2)) {
                return;
            }
            this.f1778b.setScaleX(f9);
            this.f1778b.setScaleY(fM482a2);
            View view2 = this.f1778b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    childAt.setPivotX(zM1898g ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f10 = z3 ? 1.0f - fM482a : 1.0f;
                    float f11 = fM482a2 != 0.0f ? (f9 / fM482a2) * f10 : 1.0f;
                    if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f11);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1904l(C0702b c0702b, int i3) {
        if (super.m1876e(c0702b) == null) {
            return;
        }
        m1903k(c0702b.m2627a(), c0702b.m2628b() == 0, i3);
    }
}
