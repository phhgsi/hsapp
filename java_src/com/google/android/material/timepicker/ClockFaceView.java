package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0141b;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p030K.C0356y;
import p067W0.AbstractC0557c;
import p095e.AbstractC1832a;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC1653e implements ClockHandView.InterfaceC1642b {

    /* JADX INFO: renamed from: B */
    private final ClockHandView f8285B;

    /* JADX INFO: renamed from: C */
    private final Rect f8286C;

    /* JADX INFO: renamed from: D */
    private final RectF f8287D;

    /* JADX INFO: renamed from: E */
    private final Rect f8288E;

    /* JADX INFO: renamed from: F */
    private final SparseArray f8289F;

    /* JADX INFO: renamed from: G */
    private final C0273a f8290G;

    /* JADX INFO: renamed from: H */
    private final int[] f8291H;

    /* JADX INFO: renamed from: I */
    private final float[] f8292I;

    /* JADX INFO: renamed from: J */
    private final int f8293J;

    /* JADX INFO: renamed from: K */
    private final int f8294K;

    /* JADX INFO: renamed from: L */
    private final int f8295L;

    /* JADX INFO: renamed from: M */
    private final int f8296M;

    /* JADX INFO: renamed from: N */
    private String[] f8297N;

    /* JADX INFO: renamed from: O */
    private float f8298O;

    /* JADX INFO: renamed from: P */
    private final ColorStateList f8299P;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    class ViewTreeObserverOnPreDrawListenerC1639a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC1639a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo9062F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f8285B.m9078i()) - ClockFaceView.this.f8293J);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    class C1640b extends C0273a {
        C1640b() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            int iIntValue = ((Integer) view.getTag(AbstractC0144e.f496p)).intValue();
            if (iIntValue > 0) {
                c0356y.m1251S0((View) ClockFaceView.this.f8289F.get(iIntValue - 1));
            }
            c0356y.m1292v0(C0356y.g.m1319a(0, 1, iIntValue, 1, false, view.isSelected()));
            c0356y.m1288t0(true);
            c0356y.m1263b(C0356y.a.f1452i);
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: j */
        public boolean mo908j(View view, int i3, Bundle bundle) {
            if (i3 != 16) {
                return super.mo908j(view, i3, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f8286C);
            float fCenterX = ClockFaceView.this.f8286C.centerX();
            float fCenterY = ClockFaceView.this.f8286C.centerY();
            ClockFaceView.this.f8285B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f8285B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f352t);
    }

    /* JADX INFO: renamed from: N */
    private void m9057N() {
        RectF rectFM9076e = this.f8285B.m9076e();
        TextView textViewM9059P = m9059P(rectFM9076e);
        for (int i3 = 0; i3 < this.f8289F.size(); i3++) {
            TextView textView = (TextView) this.f8289F.get(i3);
            if (textView != null) {
                textView.setSelected(textView == textViewM9059P);
                textView.getPaint().setShader(m9058O(rectFM9076e, textView));
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    private RadialGradient m9058O(RectF rectF, TextView textView) {
        textView.getHitRect(this.f8286C);
        this.f8287D.set(this.f8286C);
        textView.getLineBounds(0, this.f8288E);
        RectF rectF2 = this.f8287D;
        Rect rect = this.f8288E;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f8287D)) {
            return new RadialGradient(rectF.centerX() - this.f8287D.left, rectF.centerY() - this.f8287D.top, rectF.width() * 0.5f, this.f8291H, this.f8292I, Shader.TileMode.CLAMP);
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    private TextView m9059P(RectF rectF) {
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i3 = 0; i3 < this.f8289F.size(); i3++) {
            TextView textView2 = (TextView) this.f8289F.get(i3);
            if (textView2 != null) {
                textView2.getHitRect(this.f8286C);
                this.f8287D.set(this.f8286C);
                this.f8287D.union(rectF);
                float fWidth = this.f8287D.width() * this.f8287D.height();
                if (fWidth < f3) {
                    textView = textView2;
                    f3 = fWidth;
                }
            }
        }
        return textView;
    }

    /* JADX INFO: renamed from: Q */
    private static float m9060Q(float f3, float f4, float f5) {
        return Math.max(Math.max(f3, f4), f5);
    }

    /* JADX INFO: renamed from: S */
    private void m9061S(int i3) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f8289F.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < Math.max(this.f8297N.length, size); i4++) {
            TextView textView = (TextView) this.f8289F.get(i4);
            if (i4 >= this.f8297N.length) {
                removeView(textView);
                this.f8289F.remove(i4);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(AbstractC0146g.f521l, (ViewGroup) this, false);
                    this.f8289F.put(i4, textView);
                    addView(textView);
                }
                textView.setText(this.f8297N[i4]);
                textView.setTag(AbstractC0144e.f496p, Integer.valueOf(i4));
                int i5 = (i4 / 12) + 1;
                textView.setTag(AbstractC0144e.f491k, Integer.valueOf(i5));
                if (i5 > 1) {
                    z2 = true;
                }
                AbstractC0268W.m775i0(textView, this.f8290G);
                textView.setTextColor(this.f8299P);
                if (i3 != 0) {
                    textView.setContentDescription(getResources().getString(i3, this.f8297N[i4]));
                }
            }
        }
        this.f8285B.m9082q(z2);
    }

    @Override // com.google.android.material.timepicker.AbstractC1653e
    /* JADX INFO: renamed from: F */
    public void mo9062F(int i3) {
        if (i3 != m9099E()) {
            super.mo9062F(i3);
            this.f8285B.m9079m(m9099E());
        }
    }

    @Override // com.google.android.material.timepicker.AbstractC1653e
    /* JADX INFO: renamed from: H */
    protected void mo9063H() {
        super.mo9063H();
        for (int i3 = 0; i3 < this.f8289F.size(); i3++) {
            ((TextView) this.f8289F.get(i3)).setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m9064R(String[] strArr, int i3) {
        this.f8297N = strArr;
        m9061S(i3);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC1642b
    /* JADX INFO: renamed from: a */
    public void mo9065a(float f3, boolean z2) {
        if (Math.abs(this.f8298O - f3) > 0.001f) {
            this.f8298O = f3;
            m9057N();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0356y.m1204V0(accessibilityNodeInfo).m1290u0(C0356y.f.m1318b(1, this.f8297N.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        m9057N();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM9060Q = (int) (this.f8296M / m9060Q(this.f8294K / displayMetrics.heightPixels, this.f8295L / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM9060Q, 1073741824);
        setMeasuredDimension(iM9060Q, iM9060Q);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f8286C = new Rect();
        this.f8287D = new RectF();
        this.f8288E = new Rect();
        this.f8289F = new SparseArray();
        this.f8292I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f677J1, i3, AbstractC0149j.f593z);
        Resources resources = getResources();
        ColorStateList colorStateListM2077a = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC0150k.f695L1);
        this.f8299P = colorStateListM2077a;
        LayoutInflater.from(context).inflate(AbstractC0146g.f522m, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(AbstractC0144e.f490j);
        this.f8285B = clockHandView;
        this.f8293J = resources.getDimensionPixelSize(AbstractC0142c.f373G);
        int colorForState = colorStateListM2077a.getColorForState(new int[]{R.attr.state_selected}, colorStateListM2077a.getDefaultColor());
        this.f8291H = new int[]{colorForState, colorForState, colorStateListM2077a.getDefaultColor()};
        clockHandView.m9075b(this);
        int defaultColor = AbstractC1832a.m9608a(context, AbstractC0141b.f360b).getDefaultColor();
        ColorStateList colorStateListM2077a2 = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC0150k.f686K1);
        setBackgroundColor(colorStateListM2077a2 != null ? colorStateListM2077a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1639a());
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f8290G = new C1640b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m9064R(strArr, 0);
        this.f8294K = resources.getDimensionPixelSize(AbstractC0142c.f387U);
        this.f8295L = resources.getDimensionPixelSize(AbstractC0142c.f388V);
        this.f8296M = resources.getDimensionPixelSize(AbstractC0142c.f375I);
    }
}
