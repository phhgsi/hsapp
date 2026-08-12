package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.AbstractC1266k;
import androidx.transition.C1279x;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.material.internal.o */
/* JADX INFO: loaded from: classes.dex */
public class C1544o extends AbstractC1266k {

    /* JADX INFO: renamed from: com.google.android.material.internal.o$a */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f7799a;

        a(TextView textView) {
            this.f7799a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f7799a.setScaleX(fFloatValue);
            this.f7799a.setScaleY(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m8479h0(C1279x c1279x) {
        View view = c1279x.f6212b;
        if (view instanceof TextView) {
            c1279x.f6211a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: g */
    public void mo6342g(C1279x c1279x) {
        m8479h0(c1279x);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: j */
    public void mo6343j(C1279x c1279x) {
        m8479h0(c1279x);
    }

    @Override // androidx.transition.AbstractC1266k
    /* JADX INFO: renamed from: n */
    public Animator mo6348n(ViewGroup viewGroup, C1279x c1279x, C1279x c1279x2) {
        if (c1279x == null || c1279x2 == null || !(c1279x.f6212b instanceof TextView)) {
            return null;
        }
        View view = c1279x2.f6212b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = c1279x.f6211a;
        Map map2 = c1279x2.f6211a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
