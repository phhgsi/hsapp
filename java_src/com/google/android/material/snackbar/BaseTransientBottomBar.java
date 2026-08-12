package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AbstractC0740E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.AbstractC1549t;
import p000A.AbstractC0000a;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0150k;
import p019G0.AbstractC0176a;
import p043O0.AbstractC0450a;
import p067W0.AbstractC0557c;
import p076Z0.C0637h;
import p076Z0.C0641l;
import p089c1.AbstractC1313a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a */
    private static final TimeInterpolator f8026a = AbstractC0176a.f1126b;

    /* JADX INFO: renamed from: b */
    private static final TimeInterpolator f8027b = AbstractC0176a.f1125a;

    /* JADX INFO: renamed from: c */
    private static final TimeInterpolator f8028c = AbstractC0176a.f1128d;

    /* JADX INFO: renamed from: e */
    private static final int[] f8030e = {AbstractC0140a.f323P};

    /* JADX INFO: renamed from: f */
    private static final String f8031f = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    static final Handler f8029d = new Handler(Looper.getMainLooper(), new C1588a());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: k */
        private final C1589b f8032k = new C1589b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* JADX INFO: renamed from: J */
        public boolean mo7566J(View view) {
            return this.f8032k.m8703a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0953c
        /* JADX INFO: renamed from: o */
        public boolean mo4150o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f8032k.m8704b(coordinatorLayout, view, motionEvent);
            return super.mo4150o(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C1588a implements Handler.Callback {
        C1588a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i3 = message.what;
            if (i3 == 0) {
                AbstractC0740E.m2693a(message.obj);
                throw null;
            }
            if (i3 != 1) {
                return false;
            }
            AbstractC0740E.m2693a(message.obj);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public static class C1589b {
        public C1589b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.m7568P(0.1f);
            swipeDismissBehavior.m7567O(0.6f);
            swipeDismissBehavior.m7569Q(0);
        }

        /* JADX INFO: renamed from: a */
        public boolean m8703a(View view) {
            return view instanceof C1590c;
        }

        /* JADX INFO: renamed from: b */
        public void m8704b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.m4108B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    C1591a.m8710b().m8713e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                C1591a.m8710b().m8714f(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    protected static class C1590c extends FrameLayout {

        /* JADX INFO: renamed from: k */
        private static final View.OnTouchListener f8033k = new a();

        /* JADX INFO: renamed from: a */
        C0641l f8034a;

        /* JADX INFO: renamed from: b */
        private int f8035b;

        /* JADX INFO: renamed from: c */
        private final float f8036c;

        /* JADX INFO: renamed from: d */
        private final float f8037d;

        /* JADX INFO: renamed from: e */
        private final int f8038e;

        /* JADX INFO: renamed from: f */
        private final int f8039f;

        /* JADX INFO: renamed from: g */
        private ColorStateList f8040g;

        /* JADX INFO: renamed from: h */
        private PorterDuff.Mode f8041h;

        /* JADX INFO: renamed from: i */
        private Rect f8042i;

        /* JADX INFO: renamed from: j */
        private boolean f8043j;

        /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c$a */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C1590c(Context context, AttributeSet attributeSet) {
            super(AbstractC1313a.m6668d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0150k.f1048w6);
            if (typedArrayObtainStyledAttributes.hasValue(AbstractC0150k.f628D6)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f8035b = typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f1075z6, 0);
            if (typedArrayObtainStyledAttributes.hasValue(AbstractC0150k.f646F6) || typedArrayObtainStyledAttributes.hasValue(AbstractC0150k.f655G6)) {
                this.f8034a = C0641l.m2308e(context2, attributeSet, 0, 0).m2351m();
            }
            this.f8036c = typedArrayObtainStyledAttributes.getFloat(AbstractC0150k.f601A6, 1.0f);
            setBackgroundTintList(AbstractC0557c.m2077a(context2, typedArrayObtainStyledAttributes, AbstractC0150k.f610B6));
            setBackgroundTintMode(AbstractC1549t.m8503h(typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f619C6, -1), PorterDuff.Mode.SRC_IN));
            this.f8037d = typedArrayObtainStyledAttributes.getFloat(AbstractC0150k.f1066y6, 1.0f);
            this.f8038e = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0150k.f1057x6, -1);
            this.f8039f = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0150k.f637E6, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f8033k);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(m8705a());
            }
        }

        /* JADX INFO: renamed from: a */
        private Drawable m8705a() {
            int iM1639k = AbstractC0450a.m1639k(this, AbstractC0140a.f341i, AbstractC0140a.f339g, getBackgroundOverlayColorAlpha());
            C0641l c0641l = this.f8034a;
            Drawable drawableM8702d = c0641l != null ? BaseTransientBottomBar.m8702d(iM1639k, c0641l) : BaseTransientBottomBar.m8701c(iM1639k, getResources());
            if (this.f8040g == null) {
                return AbstractC0000a.m17r(drawableM8702d);
            }
            Drawable drawableM17r = AbstractC0000a.m17r(drawableM8702d);
            drawableM17r.setTintList(this.f8040g);
            return drawableM17r;
        }

        /* JADX INFO: renamed from: b */
        private void m8706b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f8042i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        float getActionTextColorAlpha() {
            return this.f8037d;
        }

        int getAnimationMode() {
            return this.f8035b;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f8036c;
        }

        int getMaxInlineActionWidth() {
            return this.f8039f;
        }

        int getMaxWidth() {
            return this.f8038e;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
            super.onLayout(z2, i3, i4, i5, i6);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i3, int i4) {
            super.onMeasure(i3, i4);
            if (this.f8038e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i5 = this.f8038e;
                if (measuredWidth > i5) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
                }
            }
        }

        void setAnimationMode(int i3) {
            this.f8035b = i3;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f8040g != null) {
                drawable = AbstractC0000a.m17r(drawable.mutate());
                drawable.setTintList(this.f8040g);
                drawable.setTintMode(this.f8041h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f8040g = colorStateList;
            if (getBackground() != null) {
                Drawable drawableM17r = AbstractC0000a.m17r(getBackground().mutate());
                drawableM17r.setTintList(colorStateList);
                drawableM17r.setTintMode(this.f8041h);
                if (drawableM17r != getBackground()) {
                    super.setBackgroundDrawable(drawableM17r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f8041h = mode;
            if (getBackground() != null) {
                Drawable drawableM17r = AbstractC0000a.m17r(getBackground().mutate());
                drawableM17r.setTintMode(mode);
                if (drawableM17r != getBackground()) {
                    super.setBackgroundDrawable(drawableM17r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f8043j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            m8706b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f8033k);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static GradientDrawable m8701c(int i3, Resources resources) {
        float dimension = resources.getDimension(AbstractC0142c.f440x0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static C0637h m8702d(int i3, C0641l c0641l) {
        C0637h c0637h = new C0637h(c0641l);
        c0637h.m2274c0(ColorStateList.valueOf(i3));
        return c0637h;
    }
}
