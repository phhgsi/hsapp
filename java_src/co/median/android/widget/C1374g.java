package co.median.android.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.median.android.jrejze.R;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: co.median.android.widget.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1374g extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private final ImageView f6828a;

    /* JADX INFO: renamed from: b */
    private final TextView f6829b;

    /* JADX INFO: renamed from: c */
    private int f6830c;

    /* JADX INFO: renamed from: d */
    private int f6831d;

    /* JADX INFO: renamed from: e */
    private int f6832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374g(Context context, Drawable drawable, Drawable drawable2, String str, int i3, int i4) {
        super(context, null, 0);
        AbstractC0606k.m2145e(context, "context");
        View.inflate(getContext(), R.layout.view_handle, this);
        View viewFindViewById = findViewById(R.id.icon);
        AbstractC0606k.m2144d(viewFindViewById, "findViewById(...)");
        this.f6828a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.text);
        AbstractC0606k.m2144d(viewFindViewById2, "findViewById(...)");
        this.f6829b = (TextView) viewFindViewById2;
        this.f6830c = Integer.MIN_VALUE;
        this.f6831d = -1;
        this.f6832e = -1;
        m7160m(drawable, drawable2, str, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m7152f(C1374g c1374g, ValueAnimator valueAnimator) {
        AbstractC0606k.m2145e(valueAnimator, "anim");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC0606k.m2143c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        c1374g.f6829b.setTextColor(iIntValue);
        c1374g.f6828a.setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m7153h(C1374g c1374g, ValueAnimator valueAnimator) {
        AbstractC0606k.m2145e(valueAnimator, "anim");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC0606k.m2143c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = c1374g.f6829b.getLayoutParams();
        layoutParams.width = iIntValue;
        c1374g.f6829b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m7154j(C1374g c1374g, ValueAnimator valueAnimator) {
        AbstractC0606k.m2145e(valueAnimator, "anim");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC0606k.m2143c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        c1374g.f6829b.setTextColor(iIntValue);
        c1374g.f6828a.setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m7155l(C1374g c1374g, ValueAnimator valueAnimator) {
        AbstractC0606k.m2145e(valueAnimator, "anim");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC0606k.m2143c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = c1374g.f6829b.getLayoutParams();
        layoutParams.width = iIntValue;
        c1374g.f6829b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public final void m7156e() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f6831d), Integer.valueOf(this.f6832e));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: co.median.android.widget.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1374g.m7152f(this.f6824a, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(100L);
        valueAnimatorOfObject.start();
    }

    /* JADX INFO: renamed from: g */
    public final void m7157g() {
        CharSequence text = this.f6829b.getText();
        AbstractC0606k.m2144d(text, "getText(...)");
        if (text.length() == 0) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f6830c, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: co.median.android.widget.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1374g.m7153h(this.f6825a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    public final int getActiveColor() {
        return this.f6832e;
    }

    public final int getInactiveColor() {
        return this.f6831d;
    }

    public final int getMaxTextWidth() {
        return this.f6830c;
    }

    /* JADX INFO: renamed from: i */
    public final void m7158i() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f6832e), Integer.valueOf(this.f6831d));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: co.median.android.widget.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1374g.m7154j(this.f6827a, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(200L);
        valueAnimatorOfObject.start();
    }

    /* JADX INFO: renamed from: k */
    public final void m7159k() {
        CharSequence text = this.f6829b.getText();
        AbstractC0606k.m2144d(text, "getText(...)");
        if (text.length() == 0) {
            return;
        }
        if (this.f6829b.getLayoutParams().width != 0) {
            ViewGroup.LayoutParams layoutParams = this.f6829b.getLayoutParams();
            layoutParams.width = 0;
            this.f6829b.setLayoutParams(layoutParams);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f6830c);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: co.median.android.widget.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1374g.m7155l(this.f6826a, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: m */
    public final void m7160m(Drawable drawable, Drawable drawable2, String str, int i3, int i4) {
        setBackground(drawable);
        this.f6828a.setImageDrawable(drawable2);
        setText(str);
        ViewGroup.LayoutParams layoutParams = this.f6829b.getLayoutParams();
        layoutParams.width = 0;
        this.f6829b.setLayoutParams(layoutParams);
        this.f6831d = i3;
        this.f6832e = i4;
        this.f6828a.setColorFilter(i3);
    }

    public final void setActiveColor(int i3) {
        this.f6832e = i3;
    }

    public final void setInactiveColor(int i3) {
        this.f6831d = i3;
    }

    public final void setMaxTextWidth(int i3) {
        this.f6830c = i3;
    }

    public final void setText(String str) {
        this.f6829b.getLayoutParams().width = -2;
        this.f6829b.setText(str);
        this.f6829b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f6830c = this.f6829b.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = this.f6829b.getLayoutParams();
        layoutParams.width = 0;
        this.f6829b.setLayoutParams(layoutParams);
    }
}
