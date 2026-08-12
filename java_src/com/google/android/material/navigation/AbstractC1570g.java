package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.widget.AbstractC0898j0;
import androidx.core.widget.AbstractC0988i;
import com.google.android.material.badge.AbstractC1435b;
import com.google.android.material.badge.C1434a;
import com.google.android.material.internal.BaselineLayout;
import p000A.AbstractC0000a;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0143d;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0145f;
import p016F0.AbstractC0148i;
import p019G0.AbstractC0176a;
import p030K.C0356y;
import p058T0.AbstractC0528h;
import p067W0.AbstractC0557c;
import p070X0.AbstractC0595a;

/* JADX INFO: renamed from: com.google.android.material.navigation.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1570g extends FrameLayout implements InterfaceC1573j {

    /* JADX INFO: renamed from: j0 */
    private static final int[] f7857j0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: k0 */
    private static final c f7858k0;

    /* JADX INFO: renamed from: l0 */
    private static final c f7859l0;

    /* JADX INFO: renamed from: A */
    private BaselineLayout f7860A;

    /* JADX INFO: renamed from: B */
    private int f7861B;

    /* JADX INFO: renamed from: C */
    private int f7862C;

    /* JADX INFO: renamed from: D */
    private int f7863D;

    /* JADX INFO: renamed from: E */
    private int f7864E;

    /* JADX INFO: renamed from: F */
    private int f7865F;

    /* JADX INFO: renamed from: G */
    private ColorStateList f7866G;

    /* JADX INFO: renamed from: H */
    private boolean f7867H;

    /* JADX INFO: renamed from: I */
    private C0788g f7868I;

    /* JADX INFO: renamed from: J */
    private ColorStateList f7869J;

    /* JADX INFO: renamed from: K */
    private Drawable f7870K;

    /* JADX INFO: renamed from: L */
    private Drawable f7871L;

    /* JADX INFO: renamed from: M */
    private ValueAnimator f7872M;

    /* JADX INFO: renamed from: N */
    private c f7873N;

    /* JADX INFO: renamed from: O */
    private float f7874O;

    /* JADX INFO: renamed from: P */
    private boolean f7875P;

    /* JADX INFO: renamed from: Q */
    private int f7876Q;

    /* JADX INFO: renamed from: R */
    private int f7877R;

    /* JADX INFO: renamed from: S */
    private int f7878S;

    /* JADX INFO: renamed from: T */
    private int f7879T;

    /* JADX INFO: renamed from: U */
    private boolean f7880U;

    /* JADX INFO: renamed from: V */
    private int f7881V;

    /* JADX INFO: renamed from: W */
    private int f7882W;

    /* JADX INFO: renamed from: a */
    private boolean f7883a;

    /* JADX INFO: renamed from: a0 */
    private C1434a f7884a0;

    /* JADX INFO: renamed from: b */
    private ColorStateList f7885b;

    /* JADX INFO: renamed from: b0 */
    private int f7886b0;

    /* JADX INFO: renamed from: c */
    Drawable f7887c;

    /* JADX INFO: renamed from: c0 */
    private int f7888c0;

    /* JADX INFO: renamed from: d */
    private int f7889d;

    /* JADX INFO: renamed from: d0 */
    private int f7890d0;

    /* JADX INFO: renamed from: e */
    private int f7891e;

    /* JADX INFO: renamed from: e0 */
    private boolean f7892e0;

    /* JADX INFO: renamed from: f */
    private int f7893f;

    /* JADX INFO: renamed from: f0 */
    private boolean f7894f0;

    /* JADX INFO: renamed from: g */
    private int f7895g;

    /* JADX INFO: renamed from: g0 */
    private boolean f7896g0;

    /* JADX INFO: renamed from: h */
    private float f7897h;

    /* JADX INFO: renamed from: h0 */
    private boolean f7898h0;

    /* JADX INFO: renamed from: i */
    private float f7899i;

    /* JADX INFO: renamed from: i0 */
    private Rect f7900i0;

    /* JADX INFO: renamed from: j */
    private float f7901j;

    /* JADX INFO: renamed from: k */
    private float f7902k;

    /* JADX INFO: renamed from: l */
    private float f7903l;

    /* JADX INFO: renamed from: m */
    private float f7904m;

    /* JADX INFO: renamed from: n */
    private int f7905n;

    /* JADX INFO: renamed from: o */
    private boolean f7906o;

    /* JADX INFO: renamed from: p */
    private final LinearLayout f7907p;

    /* JADX INFO: renamed from: q */
    private final LinearLayout f7908q;

    /* JADX INFO: renamed from: r */
    private final View f7909r;

    /* JADX INFO: renamed from: s */
    private final FrameLayout f7910s;

    /* JADX INFO: renamed from: t */
    private final ImageView f7911t;

    /* JADX INFO: renamed from: u */
    private final BaselineLayout f7912u;

    /* JADX INFO: renamed from: v */
    private final TextView f7913v;

    /* JADX INFO: renamed from: w */
    private final TextView f7914w;

    /* JADX INFO: renamed from: x */
    private BaselineLayout f7915x;

    /* JADX INFO: renamed from: y */
    private TextView f7916y;

    /* JADX INFO: renamed from: z */
    private TextView f7917z;

    /* JADX INFO: renamed from: com.google.android.material.navigation.g$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f7918d;

        a(int i3) {
            this.f7918d = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1570g.this.m8585A(this.f7918d);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.g$b */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f7920a;

        b(float f3) {
            this.f7920a = f3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC1570g.this.m8574p(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f7920a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.g$c */
    private static class c {
        private c() {
        }

        /* JADX INFO: renamed from: a */
        protected float m8588a(float f3, float f4) {
            return AbstractC0176a.m483b(0.0f, 1.0f, f4 == 0.0f ? 0.8f : 0.0f, f4 == 0.0f ? 1.0f : 0.2f, f3);
        }

        /* JADX INFO: renamed from: b */
        protected float m8589b(float f3) {
            return AbstractC0176a.m482a(0.4f, 1.0f, f3);
        }

        /* JADX INFO: renamed from: c */
        protected float mo8590c(float f3) {
            return 1.0f;
        }

        /* JADX INFO: renamed from: d */
        public void m8591d(float f3, float f4, View view) {
            view.setScaleX(m8589b(f3));
            view.setScaleY(mo8590c(f3));
            view.setAlpha(m8588a(f3, f4));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.g$d */
    private static class d extends c {
        private d() {
            super(null);
        }

        @Override // com.google.android.material.navigation.AbstractC1570g.c
        /* JADX INFO: renamed from: c */
        protected float mo8590c(float f3) {
            return m8589b(f3);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f7858k0 = new c(aVar);
        f7859l0 = new d(aVar);
    }

    public AbstractC1570g(Context context) {
        super(context);
        this.f7883a = false;
        this.f7861B = -1;
        this.f7862C = 0;
        this.f7863D = 0;
        this.f7864E = 0;
        this.f7865F = 0;
        this.f7867H = false;
        this.f7873N = f7858k0;
        this.f7874O = 0.0f;
        this.f7875P = false;
        this.f7876Q = 0;
        this.f7877R = 0;
        this.f7878S = -2;
        this.f7879T = 0;
        this.f7880U = false;
        this.f7881V = 0;
        this.f7882W = 0;
        this.f7888c0 = 0;
        this.f7890d0 = 49;
        this.f7892e0 = false;
        this.f7894f0 = false;
        this.f7896g0 = false;
        this.f7898h0 = false;
        this.f7900i0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f7907p = (LinearLayout) findViewById(AbstractC0144e.f461F);
        LinearLayout linearLayout = (LinearLayout) findViewById(AbstractC0144e.f464I);
        this.f7908q = linearLayout;
        this.f7909r = findViewById(AbstractC0144e.f460E);
        this.f7910s = (FrameLayout) findViewById(AbstractC0144e.f462G);
        this.f7911t = (ImageView) findViewById(AbstractC0144e.f463H);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(AbstractC0144e.f465J);
        this.f7912u = baselineLayout;
        TextView textView = (TextView) findViewById(AbstractC0144e.f467L);
        this.f7913v = textView;
        TextView textView2 = (TextView) findViewById(AbstractC0144e.f466K);
        this.f7914w = textView2;
        m8569j();
        this.f7860A = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f7889d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f7891e = baselineLayout.getPaddingBottom();
        this.f7893f = 0;
        this.f7895g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.f7916y.setImportantForAccessibility(2);
        this.f7917z.setImportantForAccessibility(2);
        setFocusable(true);
        m8566f();
        this.f7879T = getResources().getDimensionPixelSize(AbstractC0142c.f370D);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.f
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                AbstractC1570g.m8563a(this.f7856a, view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    private void m8556B() {
        if (m8570k()) {
            this.f7873N = f7859l0;
        } else {
            this.f7873N = f7858k0;
        }
    }

    /* JADX INFO: renamed from: C */
    private void m8557C() {
        TextView textView = this.f7914w;
        textView.setTypeface(textView.getTypeface(), this.f7867H ? 1 : 0);
        TextView textView2 = this.f7917z;
        textView2.setTypeface(textView2.getTypeface(), this.f7867H ? 1 : 0);
    }

    /* JADX INFO: renamed from: D */
    private void m8558D(TextView textView, int i3) {
        if (textView == null) {
            return;
        }
        m8578t(textView, i3);
        m8566f();
        textView.setMinimumHeight(AbstractC0557c.m2085i(textView.getContext(), i3, 0));
        ColorStateList colorStateList = this.f7866G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        m8557C();
    }

    /* JADX INFO: renamed from: E */
    private void m8559E(TextView textView, int i3) {
        if (textView == null) {
            return;
        }
        m8578t(textView, i3);
        m8566f();
        textView.setMinimumHeight(AbstractC0557c.m2085i(textView.getContext(), i3, 0));
        ColorStateList colorStateList = this.f7866G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: F */
    private void m8560F() {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.f7888c0 = 0;
        this.f7860A = this.f7912u;
        int i9 = 8;
        if (this.f7886b0 == 1) {
            if (this.f7915x.getParent() == null) {
                m8565c();
            }
            Rect rect = this.f7900i0;
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = rect.top;
            i3 = rect.bottom;
            this.f7888c0 = 1;
            int i13 = this.f7882W;
            this.f7860A = this.f7915x;
            i7 = i12;
            i6 = i11;
            i5 = i10;
            i4 = i13;
            i8 = 0;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 8;
            i9 = 0;
        }
        this.f7912u.setVisibility(i9);
        this.f7915x.setVisibility(i8);
        ((FrameLayout.LayoutParams) this.f7907p.getLayoutParams()).gravity = this.f7890d0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7908q.getLayoutParams();
        layoutParams.leftMargin = i5;
        layoutParams.rightMargin = i6;
        layoutParams.topMargin = i7;
        layoutParams.bottomMargin = i3;
        setPadding(i4, 0, i4, 0);
        m8585A(getWidth());
    }

    /* JADX INFO: renamed from: G */
    private static void m8561G(View view, int i3) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i3);
    }

    /* JADX INFO: renamed from: H */
    private void m8562H() {
        C0788g c0788g = this.f7868I;
        if (c0788g != null) {
            setVisibility((!c0788g.isVisible() || (!this.f7892e0 && this.f7894f0)) ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8563a(AbstractC1570g abstractC1570g, View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean z2;
        if (abstractC1570g.f7911t.getVisibility() == 0) {
            abstractC1570g.m8584z(abstractC1570g.f7911t);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) abstractC1570g.f7908q.getLayoutParams();
        int i11 = (i5 - i3) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i12 = (i6 - i4) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z3 = true;
        if (abstractC1570g.f7886b0 == 1 && abstractC1570g.f7878S == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) abstractC1570g.f7909r.getLayoutParams();
            if (abstractC1570g.f7878S != -2 || abstractC1570g.f7909r.getMeasuredWidth() == i11) {
                z2 = false;
            } else {
                layoutParams2.width = Math.max(i11, Math.min(abstractC1570g.f7876Q, abstractC1570g.getMeasuredWidth() - (abstractC1570g.f7881V * 2)));
                z2 = true;
            }
            if (abstractC1570g.f7909r.getMeasuredHeight() < i12) {
                layoutParams2.height = i12;
            } else {
                z3 = z2;
            }
            if (z3) {
                abstractC1570g.f7909r.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m8565c() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f7908q.addView(this.f7915x, layoutParams);
        m8575q();
    }

    /* JADX INFO: renamed from: f */
    private void m8566f() {
        float textSize = this.f7913v.getTextSize();
        float textSize2 = this.f7914w.getTextSize();
        this.f7897h = textSize - textSize2;
        this.f7899i = (textSize2 * 1.0f) / textSize;
        this.f7901j = (textSize * 1.0f) / textSize2;
        float textSize3 = this.f7916y.getTextSize();
        float textSize4 = this.f7917z.getTextSize();
        this.f7902k = textSize3 - textSize4;
        this.f7903l = (textSize4 * 1.0f) / textSize3;
        this.f7904m = (textSize3 * 1.0f) / textSize4;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i3 = 0;
        for (int i4 = 0; i4 < iIndexOfChild; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof AbstractC1570g) && childAt.getVisibility() == 0) {
                i3++;
            }
        }
        return i3;
    }

    private int getSuggestedIconWidth() {
        C1434a c1434a = this.f7884a0;
        int minimumWidth = c1434a == null ? 0 : c1434a.getMinimumWidth() - this.f7884a0.m7515l();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7910s.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f7911t.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    /* JADX INFO: renamed from: h */
    private static Drawable m8567h(ColorStateList colorStateList) {
        return new RippleDrawable(AbstractC0595a.m2125a(colorStateList), null, null);
    }

    /* JADX INFO: renamed from: i */
    private boolean m8568i() {
        return this.f7884a0 != null;
    }

    /* JADX INFO: renamed from: j */
    private void m8569j() {
        float dimension = getResources().getDimension(AbstractC0142c.f395b);
        float dimension2 = getResources().getDimension(AbstractC0142c.f393a);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.f7915x = baselineLayout;
        baselineLayout.setVisibility(8);
        this.f7915x.setDuplicateParentStateEnabled(true);
        this.f7915x.setMeasurePaddingFromBaseline(this.f7896g0);
        TextView textView = new TextView(getContext());
        this.f7916y = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.f7916y;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f7916y.setDuplicateParentStateEnabled(true);
        this.f7916y.setIncludeFontPadding(false);
        this.f7916y.setGravity(16);
        this.f7916y.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.f7917z = textView3;
        textView3.setMaxLines(1);
        this.f7917z.setEllipsize(truncateAt);
        this.f7917z.setDuplicateParentStateEnabled(true);
        this.f7917z.setVisibility(4);
        this.f7917z.setIncludeFontPadding(false);
        this.f7917z.setGravity(16);
        this.f7917z.setTextSize(dimension2);
        this.f7915x.addView(this.f7916y);
        this.f7915x.addView(this.f7917z);
    }

    /* JADX INFO: renamed from: k */
    private boolean m8570k() {
        return this.f7880U && this.f7905n == 2;
    }

    /* JADX INFO: renamed from: l */
    private void m8571l(float f3) {
        if (!this.f7875P || !this.f7883a || !isAttachedToWindow()) {
            m8574p(f3, f3);
            return;
        }
        ValueAnimator valueAnimator = this.f7872M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7872M = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f7874O, f3);
        this.f7872M = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new b(f3));
        this.f7872M.setInterpolator(AbstractC0528h.m1911g(getContext(), AbstractC0140a.f314G, AbstractC0176a.f1126b));
        this.f7872M.setDuration(AbstractC0528h.m1910f(getContext(), AbstractC0140a.f357y, getResources().getInteger(AbstractC0145f.f508b)));
        this.f7872M.start();
    }

    /* JADX INFO: renamed from: m */
    private void m8572m() {
        C0788g c0788g = this.f7868I;
        if (c0788g != null) {
            setChecked(c0788g.isChecked());
        }
    }

    /* JADX INFO: renamed from: n */
    private void m8573n() {
        Drawable drawableM8567h = this.f7887c;
        RippleDrawable rippleDrawable = null;
        boolean z2 = true;
        if (this.f7885b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f7875P && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(AbstractC0595a.m2128d(this.f7885b), null, activeIndicatorDrawable);
                z2 = false;
            } else if (drawableM8567h == null) {
                drawableM8567h = m8567h(this.f7885b);
            }
        }
        this.f7910s.setPadding(0, 0, 0, 0);
        this.f7910s.setForeground(rippleDrawable);
        setBackground(drawableM8567h);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m8574p(float f3, float f4) {
        this.f7873N.m8591d(f3, f4, this.f7909r);
        this.f7874O = f3;
    }

    /* JADX INFO: renamed from: q */
    private void m8575q() {
        int i3 = this.f7911t.getLayoutParams().width > 0 ? this.f7895g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7915x.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i3 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i3 : 0;
        }
    }

    /* JADX INFO: renamed from: r */
    private void m8576r(View view, View view2, float f3, float f4) {
        m8580v(this.f7907p, this.f7886b0 == 0 ? (int) (this.f7889d + f4) : 0, 0, this.f7890d0);
        LinearLayout linearLayout = this.f7908q;
        int i3 = this.f7886b0;
        m8580v(linearLayout, i3 == 0 ? 0 : this.f7900i0.top, i3 == 0 ? 0 : this.f7900i0.bottom, i3 == 0 ? 17 : 8388627);
        m8561G(this.f7912u, this.f7891e);
        this.f7860A.setVisibility(0);
        m8581w(view, 1.0f, 1.0f, 0);
        m8581w(view2, f3, f3, 4);
    }

    /* JADX INFO: renamed from: s */
    private void m8577s() {
        LinearLayout linearLayout = this.f7907p;
        int i3 = this.f7889d;
        m8580v(linearLayout, i3, i3, this.f7886b0 == 0 ? 17 : this.f7890d0);
        m8580v(this.f7908q, 0, 0, 17);
        m8561G(this.f7912u, 0);
        this.f7860A.setVisibility(8);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    /* JADX INFO: renamed from: t */
    private void m8578t(TextView textView, int i3) {
        if (this.f7898h0) {
            AbstractC0988i.m4394m(textView, i3);
        } else {
            m8579u(textView, i3);
        }
    }

    /* JADX INFO: renamed from: u */
    private static void m8579u(TextView textView, int i3) {
        AbstractC0988i.m4394m(textView, i3);
        int iM2086j = AbstractC0557c.m2086j(textView.getContext(), i3, 0);
        if (iM2086j != 0) {
            textView.setTextSize(0, iM2086j);
        }
    }

    /* JADX INFO: renamed from: v */
    private static void m8580v(View view, int i3, int i4, int i5) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i3;
        layoutParams.bottomMargin = i4;
        layoutParams.gravity = i5;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: w */
    private static void m8581w(View view, float f3, float f4, int i3) {
        view.setScaleX(f3);
        view.setScaleY(f4);
        view.setVisibility(i3);
    }

    /* JADX INFO: renamed from: x */
    private void m8582x(View view) {
        if (m8568i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            AbstractC1435b.m7521a(this.f7884a0, view);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m8583y(View view) {
        if (m8568i()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                AbstractC1435b.m7525e(this.f7884a0, view);
            }
            this.f7884a0 = null;
        }
    }

    /* JADX INFO: renamed from: z */
    private void m8584z(View view) {
        if (m8568i()) {
            AbstractC1435b.m7526f(this.f7884a0, view, null);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m8585A(int i3) {
        if (i3 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.f7876Q, i3 - (this.f7881V * 2));
            int iMax = this.f7877R;
            if (this.f7886b0 == 1) {
                int measuredWidth = i3 - (this.f7882W * 2);
                int i4 = this.f7878S;
                if (i4 != -1) {
                    measuredWidth = i4 == -2 ? this.f7907p.getMeasuredWidth() : Math.min(i4, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f7879T, this.f7908q.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7909r.getLayoutParams();
            if (m8570k()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            this.f7909r.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: d */
    public boolean mo3047d() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7875P) {
            this.f7910s.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: e */
    public void mo3048e(C0788g c0788g, int i3) {
        this.f7868I = c0788g;
        setCheckable(c0788g.isCheckable());
        setChecked(c0788g.isChecked());
        setEnabled(c0788g.isEnabled());
        setIcon(c0788g.getIcon());
        setTitle(c0788g.getTitle());
        setId(c0788g.getItemId());
        if (!TextUtils.isEmpty(c0788g.getContentDescription())) {
            setContentDescription(c0788g.getContentDescription());
        }
        CharSequence tooltipText = !TextUtils.isEmpty(c0788g.getTooltipText()) ? c0788g.getTooltipText() : c0788g.getTitle();
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC0898j0.m3829a(this, tooltipText);
        }
        m8562H();
        this.f7883a = true;
    }

    /* JADX INFO: renamed from: g */
    void m8586g() {
        m8587o();
        this.f7868I = null;
        this.f7874O = 0.0f;
        this.f7883a = false;
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f7909r.getBackground();
    }

    public C1434a getBadge() {
        return this.f7884a0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.f7915x;
    }

    protected int getItemBackgroundResId() {
        return AbstractC0143d.f454j;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    public C0788g getItemData() {
        return this.f7868I;
    }

    protected int getItemDefaultMarginResId() {
        return AbstractC0142c.f430s0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f7861B;
    }

    public BaselineLayout getLabelGroup() {
        return this.f7912u;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7907p.getLayoutParams();
        return this.f7907p.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        if (this.f7886b0 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7908q.getLayoutParams();
            return this.f7908q.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7912u.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.f7912u.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    /* JADX INFO: renamed from: o */
    void m8587o() {
        m8583y(this.f7911t);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i3) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        C0788g c0788g = this.f7868I;
        if (c0788g != null && c0788g.isCheckable() && this.f7868I.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7857j0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1434a c1434a = this.f7884a0;
        if (c1434a != null && c1434a.isVisible()) {
            CharSequence title = this.f7868I.getTitle();
            if (!TextUtils.isEmpty(this.f7868I.getContentDescription())) {
                title = this.f7868I.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f7884a0.m7513i()));
        }
        C0356y c0356yM1204V0 = C0356y.m1204V0(accessibilityNodeInfo);
        c0356yM1204V0.m1292v0(C0356y.g.m1319a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            c0356yM1204V0.m1288t0(false);
            c0356yM1204V0.m1275k0(C0356y.a.f1452i);
        }
        c0356yM1204V0.m1235J0(getResources().getString(AbstractC0148i.f548h));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        post(new a(i3));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f7909r.setBackground(drawable);
        m8573n();
    }

    public void setActiveIndicatorEnabled(boolean z2) {
        this.f7875P = z2;
        m8573n();
        this.f7909r.setVisibility(z2 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i3) {
        this.f7879T = i3;
        m8585A(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i3) {
        this.f7882W = i3;
        if (this.f7886b0 == 1) {
            setPadding(i3, 0, i3, 0);
        }
        m8585A(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.f7900i0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i3) {
        this.f7878S = i3;
        m8585A(getWidth());
    }

    public void setActiveIndicatorHeight(int i3) {
        this.f7877R = i3;
        m8585A(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i3) {
        if (this.f7893f != i3) {
            this.f7893f = i3;
            ((LinearLayout.LayoutParams) this.f7912u.getLayoutParams()).topMargin = i3;
            if (this.f7915x.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7915x.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i3 : 0;
                if (getLayoutDirection() == 1) {
                    i3 = 0;
                }
                layoutParams.leftMargin = i3;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i3) {
        this.f7881V = i3;
        m8585A(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z2) {
        this.f7880U = z2;
    }

    public void setActiveIndicatorWidth(int i3) {
        this.f7876Q = i3;
        m8585A(getWidth());
    }

    void setBadge(C1434a c1434a) {
        if (this.f7884a0 == c1434a) {
            return;
        }
        if (m8568i() && this.f7911t != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            m8583y(this.f7911t);
        }
        this.f7884a0 = c1434a;
        c1434a.m7510N(this.f7888c0);
        ImageView imageView = this.f7911t;
        if (imageView != null) {
            m8582x(imageView);
        }
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
    }

    public void setChecked(boolean z2) {
        setLabelPivots(this.f7914w);
        setLabelPivots(this.f7913v);
        setLabelPivots(this.f7917z);
        setLabelPivots(this.f7916y);
        m8571l(z2 ? 1.0f : 0.0f);
        TextView textView = this.f7914w;
        TextView textView2 = this.f7913v;
        float f3 = this.f7897h;
        float f4 = this.f7899i;
        float f5 = this.f7901j;
        if (this.f7886b0 == 1) {
            textView = this.f7917z;
            textView2 = this.f7916y;
            f3 = this.f7902k;
            f4 = this.f7903l;
            f5 = this.f7904m;
        }
        int i3 = this.f7905n;
        if (i3 != -1) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        m8577s();
                    }
                } else if (z2) {
                    m8576r(textView, textView2, f4, f3);
                } else {
                    m8576r(textView2, textView, f5, 0.0f);
                }
            } else if (z2) {
                m8576r(textView, textView2, f4, 0.0f);
            } else {
                m8577s();
            }
        } else if (this.f7906o) {
            if (z2) {
                m8576r(textView, textView2, f4, 0.0f);
            } else {
                m8577s();
            }
        } else if (z2) {
            m8576r(textView, textView2, f4, f3);
        } else {
            m8576r(textView2, textView, f5, 0.0f);
        }
        refreshDrawableState();
        setSelected(z2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.f7913v.setEnabled(z2);
        this.f7914w.setEnabled(z2);
        this.f7916y.setEnabled(z2);
        this.f7917z.setEnabled(z2);
        this.f7911t.setEnabled(z2);
    }

    @Override // com.google.android.material.navigation.InterfaceC1573j
    public void setExpanded(boolean z2) {
        this.f7892e0 = z2;
        m8562H();
    }

    public void setHorizontalTextAppearanceActive(int i3) {
        this.f7864E = i3;
        TextView textView = this.f7917z;
        if (i3 == 0) {
            i3 = this.f7862C;
        }
        m8558D(textView, i3);
    }

    public void setHorizontalTextAppearanceInactive(int i3) {
        this.f7865F = i3;
        TextView textView = this.f7916y;
        if (i3 == 0) {
            i3 = this.f7863D;
        }
        m8559E(textView, i3);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f7870K) {
            return;
        }
        this.f7870K = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = AbstractC0000a.m17r(drawable).mutate();
            this.f7871L = drawable;
            ColorStateList colorStateList = this.f7869J;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f7911t.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i3) {
        if (this.f7895g != i3) {
            this.f7895g = i3;
            m8575q();
            requestLayout();
        }
    }

    public void setIconSize(int i3) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7911t.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i3;
        this.f7911t.setLayoutParams(layoutParams);
        m8575q();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f7869J = colorStateList;
        if (this.f7868I == null || (drawable = this.f7871L) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f7871L.invalidateSelf();
    }

    public void setItemBackground(int i3) {
        setItemBackground(i3 == 0 ? null : getContext().getDrawable(i3));
    }

    public void setItemGravity(int i3) {
        this.f7890d0 = i3;
        requestLayout();
    }

    public void setItemIconGravity(int i3) {
        if (this.f7886b0 != i3) {
            this.f7886b0 = i3;
            m8560F();
            m8573n();
        }
    }

    public void setItemPaddingBottom(int i3) {
        if (this.f7891e != i3) {
            this.f7891e = i3;
            m8572m();
        }
    }

    public void setItemPaddingTop(int i3) {
        if (this.f7889d != i3) {
            this.f7889d = i3;
            m8572m();
        }
    }

    public void setItemPosition(int i3) {
        this.f7861B = i3;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f7885b = colorStateList;
        m8573n();
    }

    public void setLabelFontScalingEnabled(boolean z2) {
        this.f7898h0 = z2;
        setTextAppearanceActive(this.f7862C);
        setTextAppearanceInactive(this.f7863D);
        setHorizontalTextAppearanceActive(this.f7864E);
        setHorizontalTextAppearanceInactive(this.f7865F);
    }

    public void setLabelMaxLines(int i3) {
        this.f7913v.setMaxLines(i3);
        this.f7914w.setMaxLines(i3);
        this.f7916y.setMaxLines(i3);
        this.f7917z.setMaxLines(i3);
        if (Build.VERSION.SDK_INT > 34) {
            this.f7913v.setGravity(17);
            this.f7914w.setGravity(17);
        } else if (i3 > 1) {
            this.f7913v.setEllipsize(null);
            this.f7914w.setEllipsize(null);
            this.f7913v.setGravity(17);
            this.f7914w.setGravity(17);
        } else {
            this.f7913v.setGravity(16);
            this.f7914w.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i3) {
        if (this.f7905n != i3) {
            this.f7905n = i3;
            m8556B();
            m8585A(getWidth());
            m8572m();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z2) {
        this.f7896g0 = z2;
        this.f7912u.setMeasurePaddingFromBaseline(z2);
        this.f7913v.setIncludeFontPadding(z2);
        this.f7914w.setIncludeFontPadding(z2);
        this.f7915x.setMeasurePaddingFromBaseline(z2);
        this.f7916y.setIncludeFontPadding(z2);
        this.f7917z.setIncludeFontPadding(z2);
        requestLayout();
    }

    @Override // com.google.android.material.navigation.InterfaceC1573j
    public void setOnlyShowWhenExpanded(boolean z2) {
        this.f7894f0 = z2;
        m8562H();
    }

    public void setShifting(boolean z2) {
        if (this.f7906o != z2) {
            this.f7906o = z2;
            m8572m();
        }
    }

    public void setTextAppearanceActive(int i3) {
        this.f7862C = i3;
        m8558D(this.f7914w, i3);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z2) {
        this.f7867H = z2;
        setTextAppearanceActive(this.f7862C);
        setHorizontalTextAppearanceActive(this.f7864E);
        m8557C();
    }

    public void setTextAppearanceInactive(int i3) {
        this.f7863D = i3;
        m8559E(this.f7913v, i3);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7866G = colorStateList;
        if (colorStateList != null) {
            this.f7913v.setTextColor(colorStateList);
            this.f7914w.setTextColor(colorStateList);
            this.f7916y.setTextColor(colorStateList);
            this.f7917z.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f7913v.setText(charSequence);
        this.f7914w.setText(charSequence);
        this.f7916y.setText(charSequence);
        this.f7917z.setText(charSequence);
        C0788g c0788g = this.f7868I;
        if (c0788g == null || TextUtils.isEmpty(c0788g.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0788g c0788g2 = this.f7868I;
        if (c0788g2 != null && !TextUtils.isEmpty(c0788g2.getTooltipText())) {
            charSequence = this.f7868I.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC0898j0.m3829a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f7887c = drawable;
        m8573n();
    }
}
