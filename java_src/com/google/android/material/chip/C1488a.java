package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.drawable.AbstractC1519d;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.AbstractC1549t;
import com.google.android.material.internal.C1543n;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000A.AbstractC0000a;
import p016F0.AbstractC0150k;
import p019G0.C0179d;
import p021H.C0183a;
import p031K0.AbstractC0358a;
import p043O0.AbstractC0450a;
import p067W0.AbstractC0557c;
import p067W0.C0559e;
import p070X0.AbstractC0595a;
import p076Z0.C0637h;
import p095e.AbstractC1832a;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: com.google.android.material.chip.a */
/* JADX INFO: loaded from: classes.dex */
public class C1488a extends C0637h implements Drawable.Callback, C1543n.b {

    /* JADX INFO: renamed from: T0 */
    private static final int[] f7393T0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: U0 */
    private static final ShapeDrawable f7394U0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0 */
    private int f7395A0;

    /* JADX INFO: renamed from: B0 */
    private int f7396B0;

    /* JADX INFO: renamed from: C0 */
    private int f7397C0;

    /* JADX INFO: renamed from: D0 */
    private int f7398D0;

    /* JADX INFO: renamed from: E0 */
    private boolean f7399E0;

    /* JADX INFO: renamed from: F0 */
    private int f7400F0;

    /* JADX INFO: renamed from: G0 */
    private int f7401G0;

    /* JADX INFO: renamed from: H0 */
    private ColorFilter f7402H0;

    /* JADX INFO: renamed from: I0 */
    private PorterDuffColorFilter f7403I0;

    /* JADX INFO: renamed from: J */
    private ColorStateList f7404J;

    /* JADX INFO: renamed from: J0 */
    private ColorStateList f7405J0;

    /* JADX INFO: renamed from: K */
    private ColorStateList f7406K;

    /* JADX INFO: renamed from: K0 */
    private PorterDuff.Mode f7407K0;

    /* JADX INFO: renamed from: L */
    private float f7408L;

    /* JADX INFO: renamed from: L0 */
    private int[] f7409L0;

    /* JADX INFO: renamed from: M */
    private float f7410M;

    /* JADX INFO: renamed from: M0 */
    private boolean f7411M0;

    /* JADX INFO: renamed from: N */
    private ColorStateList f7412N;

    /* JADX INFO: renamed from: N0 */
    private ColorStateList f7413N0;

    /* JADX INFO: renamed from: O */
    private float f7414O;

    /* JADX INFO: renamed from: O0 */
    private WeakReference f7415O0;

    /* JADX INFO: renamed from: P */
    private ColorStateList f7416P;

    /* JADX INFO: renamed from: P0 */
    private TextUtils.TruncateAt f7417P0;

    /* JADX INFO: renamed from: Q */
    private CharSequence f7418Q;

    /* JADX INFO: renamed from: Q0 */
    private boolean f7419Q0;

    /* JADX INFO: renamed from: R */
    private boolean f7420R;

    /* JADX INFO: renamed from: R0 */
    private int f7421R0;

    /* JADX INFO: renamed from: S */
    private Drawable f7422S;

    /* JADX INFO: renamed from: S0 */
    private boolean f7423S0;

    /* JADX INFO: renamed from: T */
    private ColorStateList f7424T;

    /* JADX INFO: renamed from: U */
    private float f7425U;

    /* JADX INFO: renamed from: V */
    private boolean f7426V;

    /* JADX INFO: renamed from: W */
    private boolean f7427W;

    /* JADX INFO: renamed from: X */
    private Drawable f7428X;

    /* JADX INFO: renamed from: Y */
    private Drawable f7429Y;

    /* JADX INFO: renamed from: Z */
    private ColorStateList f7430Z;

    /* JADX INFO: renamed from: a0 */
    private float f7431a0;

    /* JADX INFO: renamed from: b0 */
    private CharSequence f7432b0;

    /* JADX INFO: renamed from: c0 */
    private boolean f7433c0;

    /* JADX INFO: renamed from: d0 */
    private boolean f7434d0;

    /* JADX INFO: renamed from: e0 */
    private Drawable f7435e0;

    /* JADX INFO: renamed from: f0 */
    private ColorStateList f7436f0;

    /* JADX INFO: renamed from: g0 */
    private C0179d f7437g0;

    /* JADX INFO: renamed from: h0 */
    private C0179d f7438h0;

    /* JADX INFO: renamed from: i0 */
    private float f7439i0;

    /* JADX INFO: renamed from: j0 */
    private float f7440j0;

    /* JADX INFO: renamed from: k0 */
    private float f7441k0;

    /* JADX INFO: renamed from: l0 */
    private float f7442l0;

    /* JADX INFO: renamed from: m0 */
    private float f7443m0;

    /* JADX INFO: renamed from: n0 */
    private float f7444n0;

    /* JADX INFO: renamed from: o0 */
    private float f7445o0;

    /* JADX INFO: renamed from: p0 */
    private float f7446p0;

    /* JADX INFO: renamed from: q0 */
    private final Context f7447q0;

    /* JADX INFO: renamed from: r0 */
    private final Paint f7448r0;

    /* JADX INFO: renamed from: s0 */
    private final Paint f7449s0;

    /* JADX INFO: renamed from: t0 */
    private final Paint.FontMetrics f7450t0;

    /* JADX INFO: renamed from: u0 */
    private final RectF f7451u0;

    /* JADX INFO: renamed from: v0 */
    private final PointF f7452v0;

    /* JADX INFO: renamed from: w0 */
    private final Path f7453w0;

    /* JADX INFO: renamed from: x0 */
    private final C1543n f7454x0;

    /* JADX INFO: renamed from: y0 */
    private int f7455y0;

    /* JADX INFO: renamed from: z0 */
    private int f7456z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7954a();
    }

    private C1488a(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f7410M = -1.0f;
        this.f7448r0 = new Paint(1);
        this.f7450t0 = new Paint.FontMetrics();
        this.f7451u0 = new RectF();
        this.f7452v0 = new PointF();
        this.f7453w0 = new Path();
        this.f7401G0 = 255;
        this.f7407K0 = PorterDuff.Mode.SRC_IN;
        this.f7415O0 = new WeakReference(null);
        m2266Q(context);
        this.f7447q0 = context;
        C1543n c1543n = new C1543n(this);
        this.f7454x0 = c1543n;
        this.f7418Q = "";
        c1543n.m8472g().density = context.getResources().getDisplayMetrics().density;
        this.f7449s0 = null;
        int[] iArr = f7393T0;
        setState(iArr);
        m8090u2(iArr);
        this.f7419Q0 = true;
        f7394U0.setTint(-1);
    }

    /* JADX INFO: renamed from: A0 */
    private float m7960A0() {
        this.f7454x0.m8472g().getFontMetrics(this.f7450t0);
        Paint.FontMetrics fontMetrics = this.f7450t0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX INFO: renamed from: A1 */
    private static boolean m7961A1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: B1 */
    private static boolean m7962B1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: C0 */
    private boolean m7963C0() {
        return this.f7434d0 && this.f7435e0 != null && this.f7433c0;
    }

    /* JADX INFO: renamed from: C1 */
    private void m7964C1(AttributeSet attributeSet, int i3, int i4) {
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(this.f7447q0, attributeSet, AbstractC0150k.f712N0, i3, i4, new int[0]);
        this.f7423S0 = typedArrayM8488i.hasValue(AbstractC0150k.f1061y1);
        m7984k2(AbstractC0557c.m2077a(this.f7447q0, typedArrayM8488i, AbstractC0150k.f940l1));
        m8021O1(AbstractC0557c.m2077a(this.f7447q0, typedArrayM8488i, AbstractC0150k.f811Y0));
        m8057c2(typedArrayM8488i.getDimension(AbstractC0150k.f890g1, 0.0f));
        int i5 = AbstractC0150k.f820Z0;
        if (typedArrayM8488i.hasValue(i5)) {
            m8027Q1(typedArrayM8488i.getDimension(i5, 0.0f));
        }
        m8065g2(AbstractC0557c.m2077a(this.f7447q0, typedArrayM8488i, AbstractC0150k.f920j1));
        m8067i2(typedArrayM8488i.getDimension(AbstractC0150k.f930k1, 0.0f));
        m8006H2(AbstractC0557c.m2077a(this.f7447q0, typedArrayM8488i, AbstractC0150k.f1052x1));
        m8016M2(typedArrayM8488i.getText(AbstractC0150k.f757S0));
        C0559e c0559eM2084h = AbstractC0557c.m2084h(this.f7447q0, typedArrayM8488i, AbstractC0150k.f721O0);
        c0559eM2084h.m2104o(typedArrayM8488i.getDimension(AbstractC0150k.f730P0, c0559eM2084h.m2102k()));
        m8019N2(c0559eM2084h);
        int i6 = typedArrayM8488i.getInt(AbstractC0150k.f739Q0, 0);
        if (i6 == 1) {
            m8099z2(TextUtils.TruncateAt.START);
        } else if (i6 == 2) {
            m8099z2(TextUtils.TruncateAt.MIDDLE);
        } else if (i6 == 3) {
            m8099z2(TextUtils.TruncateAt.END);
        }
        m8055b2(typedArrayM8488i.getBoolean(AbstractC0150k.f880f1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m8055b2(typedArrayM8488i.getBoolean(AbstractC0150k.f850c1, false));
        }
        m8039U1(AbstractC0557c.m2081e(this.f7447q0, typedArrayM8488i, AbstractC0150k.f840b1));
        int i7 = AbstractC0150k.f870e1;
        if (typedArrayM8488i.hasValue(i7)) {
            m8049Y1(AbstractC0557c.m2077a(this.f7447q0, typedArrayM8488i, i7));
        }
        m8045W1(typedArrayM8488i.getDimension(AbstractC0150k.f860d1, -1.0f));
        m8095x2(typedArrayM8488i.getBoolean(AbstractC0150k.f1007s1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m8095x2(typedArrayM8488i.getBoolean(AbstractC0150k.f960n1, false));
        }
        m8072l2(AbstractC0557c.m2081e(this.f7447q0, typedArrayM8488i, AbstractC0150k.f950m1));
        m8091v2(AbstractC0557c.m2077a(this.f7447q0, typedArrayM8488i, AbstractC0150k.f998r1));
        m8082q2(typedArrayM8488i.getDimension(AbstractC0150k.f980p1, 0.0f));
        m8003G1(typedArrayM8488i.getBoolean(AbstractC0150k.f766T0, false));
        m8018N1(typedArrayM8488i.getBoolean(AbstractC0150k.f802X0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m8018N1(typedArrayM8488i.getBoolean(AbstractC0150k.f784V0, false));
        }
        m8007I1(AbstractC0557c.m2081e(this.f7447q0, typedArrayM8488i, AbstractC0150k.f775U0));
        int i8 = AbstractC0150k.f793W0;
        if (typedArrayM8488i.hasValue(i8)) {
            m8011K1(AbstractC0557c.m2077a(this.f7447q0, typedArrayM8488i, i8));
        }
        m8012K2(C0179d.m489b(this.f7447q0, typedArrayM8488i, AbstractC0150k.f1070z1));
        m7994A2(C0179d.m489b(this.f7447q0, typedArrayM8488i, AbstractC0150k.f1025u1));
        m8061e2(typedArrayM8488i.getDimension(AbstractC0150k.f910i1, 0.0f));
        m8000E2(typedArrayM8488i.getDimension(AbstractC0150k.f1043w1, 0.0f));
        m7997C2(typedArrayM8488i.getDimension(AbstractC0150k.f1034v1, 0.0f));
        m8034S2(typedArrayM8488i.getDimension(AbstractC0150k.f605B1, 0.0f));
        m8025P2(typedArrayM8488i.getDimension(AbstractC0150k.f596A1, 0.0f));
        m8086s2(typedArrayM8488i.getDimension(AbstractC0150k.f989q1, 0.0f));
        m8076n2(typedArrayM8488i.getDimension(AbstractC0150k.f970o1, 0.0f));
        m8033S1(typedArrayM8488i.getDimension(AbstractC0150k.f830a1, 0.0f));
        m8004G2(typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f748R0, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        typedArrayM8488i.recycle();
    }

    /* JADX INFO: renamed from: D0 */
    public static C1488a m7965D0(Context context, AttributeSet attributeSet, int i3, int i4) {
        C1488a c1488a = new C1488a(context, attributeSet, i3, i4);
        c1488a.m7964C1(attributeSet, i3, i4);
        return c1488a;
    }

    /* JADX INFO: renamed from: E0 */
    private void m7966E0(Canvas canvas, Rect rect) {
        if (m7976W2()) {
            m7986t0(rect, this.f7451u0);
            RectF rectF = this.f7451u0;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.f7435e0.setBounds(0, 0, (int) this.f7451u0.width(), (int) this.f7451u0.height());
            this.f7435e0.draw(canvas);
            canvas.translate(-f3, -f4);
        }
    }

    /* JADX INFO: renamed from: E1 */
    private boolean m7967E1(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f7404J;
        int iM2285q = m2285q(colorStateList != null ? colorStateList.getColorForState(iArr, this.f7455y0) : 0);
        boolean state = true;
        if (this.f7455y0 != iM2285q) {
            this.f7455y0 = iM2285q;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f7406K;
        int iM2285q2 = m2285q(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f7456z0) : 0);
        if (this.f7456z0 != iM2285q2) {
            this.f7456z0 = iM2285q2;
            zOnStateChange = true;
        }
        int iM1637i = AbstractC0450a.m1637i(iM2285q, iM2285q2);
        if ((this.f7395A0 != iM1637i) | (m2255B() == null)) {
            this.f7395A0 = iM1637i;
            m2274c0(ColorStateList.valueOf(iM1637i));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f7412N;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f7396B0) : 0;
        if (this.f7396B0 != colorForState) {
            this.f7396B0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f7413N0 == null || !AbstractC0595a.m2129e(iArr)) ? 0 : this.f7413N0.getColorForState(iArr, this.f7397C0);
        if (this.f7397C0 != colorForState2) {
            this.f7397C0 = colorForState2;
            if (this.f7411M0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f7454x0.m8470e() == null || this.f7454x0.m8470e().m2101j() == null) ? 0 : this.f7454x0.m8470e().m2101j().getColorForState(iArr, this.f7398D0);
        if (this.f7398D0 != colorForState3) {
            this.f7398D0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z3 = m7989v1(getState(), R.attr.state_checked) && this.f7433c0;
        if (this.f7399E0 == z3 || this.f7435e0 == null) {
            z2 = false;
        } else {
            float fM8088u0 = m8088u0();
            this.f7399E0 = z3;
            if (fM8088u0 != m8088u0()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f7405J0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f7400F0) : 0;
        if (this.f7400F0 != colorForState4) {
            this.f7400F0 = colorForState4;
            this.f7403I0 = AbstractC1519d.m8258k(this, this.f7405J0, this.f7407K0);
        } else {
            state = zOnStateChange;
        }
        if (m7962B1(this.f7422S)) {
            state |= this.f7422S.setState(iArr);
        }
        if (m7962B1(this.f7435e0)) {
            state |= this.f7435e0.setState(iArr);
        }
        if (m7962B1(this.f7428X)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f7428X.setState(iArr3);
        }
        if (m7962B1(this.f7429Y)) {
            state |= this.f7429Y.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m7998D1();
        }
        return state;
    }

    /* JADX INFO: renamed from: F0 */
    private void m7968F0(Canvas canvas, Rect rect) {
        if (this.f7423S0) {
            return;
        }
        this.f7448r0.setColor(this.f7456z0);
        this.f7448r0.setStyle(Paint.Style.FILL);
        this.f7448r0.setColorFilter(m7987t1());
        this.f7451u0.set(rect);
        canvas.drawRoundRect(this.f7451u0, m8026Q0(), m8026Q0(), this.f7448r0);
    }

    /* JADX INFO: renamed from: G0 */
    private void m7969G0(Canvas canvas, Rect rect) {
        if (m7977X2()) {
            m7986t0(rect, this.f7451u0);
            RectF rectF = this.f7451u0;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.f7422S.setBounds(0, 0, (int) this.f7451u0.width(), (int) this.f7451u0.height());
            this.f7422S.draw(canvas);
            canvas.translate(-f3, -f4);
        }
    }

    /* JADX INFO: renamed from: H0 */
    private void m7970H0(Canvas canvas, Rect rect) {
        if (this.f7414O <= 0.0f || this.f7423S0) {
            return;
        }
        this.f7448r0.setColor(this.f7396B0);
        this.f7448r0.setStyle(Paint.Style.STROKE);
        if (!this.f7423S0) {
            this.f7448r0.setColorFilter(m7987t1());
        }
        RectF rectF = this.f7451u0;
        float f3 = rect.left;
        float f4 = this.f7414O;
        rectF.set(f3 + (f4 / 2.0f), rect.top + (f4 / 2.0f), rect.right - (f4 / 2.0f), rect.bottom - (f4 / 2.0f));
        float f5 = this.f7410M - (this.f7414O / 2.0f);
        canvas.drawRoundRect(this.f7451u0, f5, f5, this.f7448r0);
    }

    /* JADX INFO: renamed from: I0 */
    private void m7971I0(Canvas canvas, Rect rect) {
        if (this.f7423S0) {
            return;
        }
        this.f7448r0.setColor(this.f7455y0);
        this.f7448r0.setStyle(Paint.Style.FILL);
        this.f7451u0.set(rect);
        canvas.drawRoundRect(this.f7451u0, m8026Q0(), m8026Q0(), this.f7448r0);
    }

    /* JADX INFO: renamed from: J0 */
    private void m7972J0(Canvas canvas, Rect rect) {
        if (m7978Y2()) {
            m7990w0(rect, this.f7451u0);
            RectF rectF = this.f7451u0;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.f7428X.setBounds(0, 0, (int) this.f7451u0.width(), (int) this.f7451u0.height());
            this.f7429Y.setBounds(this.f7428X.getBounds());
            this.f7429Y.jumpToCurrentState();
            this.f7429Y.draw(canvas);
            canvas.translate(-f3, -f4);
        }
    }

    /* JADX INFO: renamed from: K0 */
    private void m7973K0(Canvas canvas, Rect rect) {
        this.f7448r0.setColor(this.f7397C0);
        this.f7448r0.setStyle(Paint.Style.FILL);
        this.f7451u0.set(rect);
        if (!this.f7423S0) {
            canvas.drawRoundRect(this.f7451u0, m8026Q0(), m8026Q0(), this.f7448r0);
        } else {
            m2283l(new RectF(rect), this.f7453w0);
            super.m2286v(canvas, this.f7448r0, this.f7453w0, m2288x());
        }
    }

    /* JADX INFO: renamed from: L0 */
    private void m7974L0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f7449s0;
        if (paint != null) {
            paint.setColor(AbstractC2571d.m12269k(-16777216, ModuleDescriptor.MODULE_VERSION));
            canvas.drawRect(rect, this.f7449s0);
            if (m7977X2() || m7976W2()) {
                m7986t0(rect, this.f7451u0);
                canvas.drawRect(this.f7451u0, this.f7449s0);
            }
            if (this.f7418Q != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f7449s0);
            } else {
                canvas2 = canvas;
            }
            if (m7978Y2()) {
                m7990w0(rect, this.f7451u0);
                canvas2.drawRect(this.f7451u0, this.f7449s0);
            }
            this.f7449s0.setColor(AbstractC2571d.m12269k(-65536, ModuleDescriptor.MODULE_VERSION));
            m7988v0(rect, this.f7451u0);
            canvas2.drawRect(this.f7451u0, this.f7449s0);
            this.f7449s0.setColor(AbstractC2571d.m12269k(-16711936, ModuleDescriptor.MODULE_VERSION));
            m7991x0(rect, this.f7451u0);
            canvas2.drawRect(this.f7451u0, this.f7449s0);
        }
    }

    /* JADX INFO: renamed from: M0 */
    private void m7975M0(Canvas canvas, Rect rect) {
        if (this.f7418Q != null) {
            Paint.Align alignM7995B0 = m7995B0(rect, this.f7452v0);
            m7992z0(rect, this.f7451u0);
            if (this.f7454x0.m8470e() != null) {
                this.f7454x0.m8472g().drawableState = getState();
                this.f7454x0.m8478n(this.f7447q0);
            }
            this.f7454x0.m8472g().setTextAlign(alignM7995B0);
            int iSave = 0;
            boolean z2 = Math.round(this.f7454x0.m8473h(m8079p1().toString())) > Math.round(this.f7451u0.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(this.f7451u0);
            }
            CharSequence charSequenceEllipsize = this.f7418Q;
            if (z2 && this.f7417P0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f7454x0.m8472g(), this.f7451u0.width(), this.f7417P0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f7452v0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f7454x0.m8472g());
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: W2 */
    private boolean m7976W2() {
        return this.f7434d0 && this.f7435e0 != null && this.f7399E0;
    }

    /* JADX INFO: renamed from: X2 */
    private boolean m7977X2() {
        return this.f7420R && this.f7422S != null;
    }

    /* JADX INFO: renamed from: Y2 */
    private boolean m7978Y2() {
        return this.f7427W && this.f7428X != null;
    }

    /* JADX INFO: renamed from: Z2 */
    private void m7979Z2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: a3 */
    private void m7980a3() {
        this.f7413N0 = this.f7411M0 ? AbstractC0595a.m2128d(this.f7416P) : null;
    }

    /* JADX INFO: renamed from: b3 */
    private void m7981b3() {
        this.f7429Y = new RippleDrawable(AbstractC0595a.m2128d(m8075n1()), this.f7428X, f7394U0);
    }

    /* JADX INFO: renamed from: h1 */
    private float m7982h1() {
        Drawable drawable = this.f7399E0 ? this.f7435e0 : this.f7422S;
        float fCeil = this.f7425U;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(AbstractC1549t.m8498c(this.f7447q0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    /* JADX INFO: renamed from: i1 */
    private float m7983i1() {
        Drawable drawable = this.f7399E0 ? this.f7435e0 : this.f7422S;
        float f3 = this.f7425U;
        return (f3 > 0.0f || drawable == null) ? f3 : drawable.getIntrinsicWidth();
    }

    /* JADX INFO: renamed from: k2 */
    private void m7984k2(ColorStateList colorStateList) {
        if (this.f7404J != colorStateList) {
            this.f7404J = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m7985s0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0000a.m12m(drawable, AbstractC0000a.m5f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f7428X) {
            if (drawable.isStateful()) {
                drawable.setState(m8060e1());
            }
            drawable.setTintList(this.f7430Z);
            return;
        }
        Drawable drawable2 = this.f7422S;
        if (drawable == drawable2 && this.f7426V) {
            drawable2.setTintList(this.f7424T);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: t0 */
    private void m7986t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m7977X2() || m7976W2()) {
            float f3 = this.f7439i0 + this.f7440j0;
            float fM7983i1 = m7983i1();
            if (AbstractC0000a.m5f(this) == 0) {
                float f4 = rect.left + f3;
                rectF.left = f4;
                rectF.right = f4 + fM7983i1;
            } else {
                float f5 = rect.right - f3;
                rectF.right = f5;
                rectF.left = f5 - fM7983i1;
            }
            float fM7982h1 = m7982h1();
            float fExactCenterY = rect.exactCenterY() - (fM7982h1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fM7982h1;
        }
    }

    /* JADX INFO: renamed from: t1 */
    private ColorFilter m7987t1() {
        ColorFilter colorFilter = this.f7402H0;
        return colorFilter != null ? colorFilter : this.f7403I0;
    }

    /* JADX INFO: renamed from: v0 */
    private void m7988v0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m7978Y2()) {
            float f3 = this.f7446p0 + this.f7445o0 + this.f7431a0 + this.f7444n0 + this.f7443m0;
            if (AbstractC0000a.m5f(this) == 0) {
                rectF.right = rect.right - f3;
            } else {
                rectF.left = rect.left + f3;
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    private static boolean m7989v1(int[] iArr, int i3) {
        if (iArr == null) {
            return false;
        }
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w0 */
    private void m7990w0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m7978Y2()) {
            float f3 = this.f7446p0 + this.f7445o0;
            if (AbstractC0000a.m5f(this) == 0) {
                float f4 = rect.right - f3;
                rectF.right = f4;
                rectF.left = f4 - this.f7431a0;
            } else {
                float f5 = rect.left + f3;
                rectF.left = f5;
                rectF.right = f5 + this.f7431a0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f6 = this.f7431a0;
            float f7 = fExactCenterY - (f6 / 2.0f);
            rectF.top = f7;
            rectF.bottom = f7 + f6;
        }
    }

    /* JADX INFO: renamed from: x0 */
    private void m7991x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m7978Y2()) {
            float f3 = this.f7446p0 + this.f7445o0 + this.f7431a0 + this.f7444n0 + this.f7443m0;
            if (AbstractC0000a.m5f(this) == 0) {
                float f4 = rect.right;
                rectF.right = f4;
                rectF.left = f4 - f3;
            } else {
                int i3 = rect.left;
                rectF.left = i3;
                rectF.right = i3 + f3;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* JADX INFO: renamed from: z0 */
    private void m7992z0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f7418Q != null) {
            float fM8088u0 = this.f7439i0 + m8088u0() + this.f7442l0;
            float fM8096y0 = this.f7446p0 + m8096y0() + this.f7443m0;
            if (AbstractC0000a.m5f(this) == 0) {
                rectF.left = rect.left + fM8088u0;
                rectF.right = rect.right - fM8096y0;
            } else {
                rectF.left = rect.left + fM8096y0;
                rectF.right = rect.right - fM8088u0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* JADX INFO: renamed from: z1 */
    private static boolean m7993z1(C0559e c0559e) {
        return (c0559e == null || c0559e.m2101j() == null || !c0559e.m2101j().isStateful()) ? false : true;
    }

    /* JADX INFO: renamed from: A2 */
    public void m7994A2(C0179d c0179d) {
        this.f7438h0 = c0179d;
    }

    /* JADX INFO: renamed from: B0 */
    Paint.Align m7995B0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f7418Q != null) {
            float fM8088u0 = this.f7439i0 + m8088u0() + this.f7442l0;
            if (AbstractC0000a.m5f(this) == 0) {
                pointF.x = rect.left + fM8088u0;
            } else {
                pointF.x = rect.right - fM8088u0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m7960A0();
        }
        return align;
    }

    /* JADX INFO: renamed from: B2 */
    public void m7996B2(int i3) {
        m7994A2(C0179d.m490c(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: C2 */
    public void m7997C2(float f3) {
        if (this.f7441k0 != f3) {
            float fM8088u0 = m8088u0();
            this.f7441k0 = f3;
            float fM8088u02 = m8088u0();
            invalidateSelf();
            if (fM8088u0 != fM8088u02) {
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: D1 */
    protected void m7998D1() {
        a aVar = (a) this.f7415O0.get();
        if (aVar != null) {
            aVar.mo7954a();
        }
    }

    /* JADX INFO: renamed from: D2 */
    public void m7999D2(int i3) {
        m7997C2(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: E2 */
    public void m8000E2(float f3) {
        if (this.f7440j0 != f3) {
            float fM8088u0 = m8088u0();
            this.f7440j0 = f3;
            float fM8088u02 = m8088u0();
            invalidateSelf();
            if (fM8088u0 != fM8088u02) {
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: F1 */
    boolean m8001F1(boolean z2) {
        if (this.f7428X != null) {
            return m8090u2(z2 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f7393T0);
        }
        return false;
    }

    /* JADX INFO: renamed from: F2 */
    public void m8002F2(int i3) {
        m8000E2(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: G1 */
    public void m8003G1(boolean z2) {
        if (this.f7433c0 != z2) {
            this.f7433c0 = z2;
            float fM8088u0 = m8088u0();
            if (!z2 && this.f7399E0) {
                this.f7399E0 = false;
            }
            float fM8088u02 = m8088u0();
            invalidateSelf();
            if (fM8088u0 != fM8088u02) {
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: G2 */
    public void m8004G2(int i3) {
        this.f7421R0 = i3;
    }

    /* JADX INFO: renamed from: H1 */
    public void m8005H1(int i3) {
        m8003G1(this.f7447q0.getResources().getBoolean(i3));
    }

    /* JADX INFO: renamed from: H2 */
    public void m8006H2(ColorStateList colorStateList) {
        if (this.f7416P != colorStateList) {
            this.f7416P = colorStateList;
            m7980a3();
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m8007I1(Drawable drawable) {
        if (this.f7435e0 != drawable) {
            float fM8088u0 = m8088u0();
            this.f7435e0 = drawable;
            float fM8088u02 = m8088u0();
            m7979Z2(this.f7435e0);
            m7985s0(this.f7435e0);
            invalidateSelf();
            if (fM8088u0 != fM8088u02) {
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: I2 */
    public void m8008I2(int i3) {
        m8006H2(AbstractC1832a.m9608a(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: J1 */
    public void m8009J1(int i3) {
        m8007I1(AbstractC1832a.m9609b(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: J2 */
    void m8010J2(boolean z2) {
        this.f7419Q0 = z2;
    }

    /* JADX INFO: renamed from: K1 */
    public void m8011K1(ColorStateList colorStateList) {
        if (this.f7436f0 != colorStateList) {
            this.f7436f0 = colorStateList;
            if (m7963C0()) {
                this.f7435e0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: K2 */
    public void m8012K2(C0179d c0179d) {
        this.f7437g0 = c0179d;
    }

    /* JADX INFO: renamed from: L1 */
    public void m8013L1(int i3) {
        m8011K1(AbstractC1832a.m9608a(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: L2 */
    public void m8014L2(int i3) {
        m8012K2(C0179d.m490c(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: M1 */
    public void m8015M1(int i3) {
        m8018N1(this.f7447q0.getResources().getBoolean(i3));
    }

    /* JADX INFO: renamed from: M2 */
    public void m8016M2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f7418Q, charSequence)) {
            return;
        }
        this.f7418Q = charSequence;
        this.f7454x0.m8477m(true);
        invalidateSelf();
        m7998D1();
    }

    /* JADX INFO: renamed from: N0 */
    public Drawable m8017N0() {
        return this.f7435e0;
    }

    /* JADX INFO: renamed from: N1 */
    public void m8018N1(boolean z2) {
        if (this.f7434d0 != z2) {
            boolean zM7976W2 = m7976W2();
            this.f7434d0 = z2;
            boolean zM7976W22 = m7976W2();
            if (zM7976W2 != zM7976W22) {
                if (zM7976W22) {
                    m7985s0(this.f7435e0);
                } else {
                    m7979Z2(this.f7435e0);
                }
                invalidateSelf();
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: N2 */
    public void m8019N2(C0559e c0559e) {
        this.f7454x0.m8475k(c0559e, this.f7447q0);
    }

    /* JADX INFO: renamed from: O0 */
    public ColorStateList m8020O0() {
        return this.f7436f0;
    }

    /* JADX INFO: renamed from: O1 */
    public void m8021O1(ColorStateList colorStateList) {
        if (this.f7406K != colorStateList) {
            this.f7406K = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: O2 */
    public void m8022O2(int i3) {
        m8019N2(new C0559e(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: P0 */
    public ColorStateList m8023P0() {
        return this.f7406K;
    }

    /* JADX INFO: renamed from: P1 */
    public void m8024P1(int i3) {
        m8021O1(AbstractC1832a.m9608a(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: P2 */
    public void m8025P2(float f3) {
        if (this.f7443m0 != f3) {
            this.f7443m0 = f3;
            invalidateSelf();
            m7998D1();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public float m8026Q0() {
        return this.f7423S0 ? m2262J() : this.f7410M;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m8027Q1(float f3) {
        if (this.f7410M != f3) {
            this.f7410M = f3;
            setShapeAppearanceModel(m2261H().m2327x(f3));
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void m8028Q2(int i3) {
        m8025P2(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: R0 */
    public float m8029R0() {
        return this.f7446p0;
    }

    /* JADX INFO: renamed from: R1 */
    public void m8030R1(int i3) {
        m8027Q1(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: R2 */
    public void m8031R2(float f3) {
        C0559e c0559eM8081q1 = m8081q1();
        if (c0559eM8081q1 != null) {
            c0559eM8081q1.m2104o(f3);
            this.f7454x0.m8472g().setTextSize(f3);
            mo7512a();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public Drawable m8032S0() {
        Drawable drawable = this.f7422S;
        if (drawable != null) {
            return AbstractC0000a.m16q(drawable);
        }
        return null;
    }

    /* JADX INFO: renamed from: S1 */
    public void m8033S1(float f3) {
        if (this.f7446p0 != f3) {
            this.f7446p0 = f3;
            invalidateSelf();
            m7998D1();
        }
    }

    /* JADX INFO: renamed from: S2 */
    public void m8034S2(float f3) {
        if (this.f7442l0 != f3) {
            this.f7442l0 = f3;
            invalidateSelf();
            m7998D1();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public float m8035T0() {
        return this.f7425U;
    }

    /* JADX INFO: renamed from: T1 */
    public void m8036T1(int i3) {
        m8033S1(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: T2 */
    public void m8037T2(int i3) {
        m8034S2(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: U0 */
    public ColorStateList m8038U0() {
        return this.f7424T;
    }

    /* JADX INFO: renamed from: U1 */
    public void m8039U1(Drawable drawable) {
        Drawable drawableM8032S0 = m8032S0();
        if (drawableM8032S0 != drawable) {
            float fM8088u0 = m8088u0();
            this.f7422S = drawable != null ? AbstractC0000a.m17r(drawable).mutate() : null;
            float fM8088u02 = m8088u0();
            m7979Z2(drawableM8032S0);
            if (m7977X2()) {
                m7985s0(this.f7422S);
            }
            invalidateSelf();
            if (fM8088u0 != fM8088u02) {
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: U2 */
    public void m8040U2(boolean z2) {
        if (this.f7411M0 != z2) {
            this.f7411M0 = z2;
            m7980a3();
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: V0 */
    public float m8041V0() {
        return this.f7408L;
    }

    /* JADX INFO: renamed from: V1 */
    public void m8042V1(int i3) {
        m8039U1(AbstractC1832a.m9609b(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: V2 */
    boolean m8043V2() {
        return this.f7419Q0;
    }

    /* JADX INFO: renamed from: W0 */
    public float m8044W0() {
        return this.f7439i0;
    }

    /* JADX INFO: renamed from: W1 */
    public void m8045W1(float f3) {
        if (this.f7425U != f3) {
            float fM8088u0 = m8088u0();
            this.f7425U = f3;
            float fM8088u02 = m8088u0();
            invalidateSelf();
            if (fM8088u0 != fM8088u02) {
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public ColorStateList m8046X0() {
        return this.f7412N;
    }

    /* JADX INFO: renamed from: X1 */
    public void m8047X1(int i3) {
        m8045W1(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: Y0 */
    public float m8048Y0() {
        return this.f7414O;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m8049Y1(ColorStateList colorStateList) {
        this.f7426V = true;
        if (this.f7424T != colorStateList) {
            this.f7424T = colorStateList;
            if (m7977X2()) {
                this.f7422S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public Drawable m8050Z0() {
        Drawable drawable = this.f7428X;
        if (drawable != null) {
            return AbstractC0000a.m16q(drawable);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m8051Z1(int i3) {
        m8049Y1(AbstractC1832a.m9608a(this.f7447q0, i3));
    }

    @Override // com.google.android.material.internal.C1543n.b
    /* JADX INFO: renamed from: a */
    public void mo7512a() {
        m7998D1();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a1 */
    public CharSequence m8052a1() {
        return this.f7432b0;
    }

    /* JADX INFO: renamed from: a2 */
    public void m8053a2(int i3) {
        m8055b2(this.f7447q0.getResources().getBoolean(i3));
    }

    /* JADX INFO: renamed from: b1 */
    public float m8054b1() {
        return this.f7445o0;
    }

    /* JADX INFO: renamed from: b2 */
    public void m8055b2(boolean z2) {
        if (this.f7420R != z2) {
            boolean zM7977X2 = m7977X2();
            this.f7420R = z2;
            boolean zM7977X22 = m7977X2();
            if (zM7977X2 != zM7977X22) {
                if (zM7977X22) {
                    m7985s0(this.f7422S);
                } else {
                    m7979Z2(this.f7422S);
                }
                invalidateSelf();
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public float m8056c1() {
        return this.f7431a0;
    }

    /* JADX INFO: renamed from: c2 */
    public void m8057c2(float f3) {
        if (this.f7408L != f3) {
            this.f7408L = f3;
            invalidateSelf();
            m7998D1();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public float m8058d1() {
        return this.f7444n0;
    }

    /* JADX INFO: renamed from: d2 */
    public void m8059d2(int i3) {
        m8057c2(this.f7447q0.getResources().getDimension(i3));
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iM1326a;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i3 = this.f7401G0;
        if (i3 < 255) {
            canvas2 = canvas;
            iM1326a = AbstractC0358a.m1326a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i3);
        } else {
            canvas2 = canvas;
            iM1326a = 0;
        }
        m7971I0(canvas2, bounds);
        m7968F0(canvas2, bounds);
        if (this.f7423S0) {
            super.draw(canvas2);
        }
        m7970H0(canvas2, bounds);
        m7973K0(canvas2, bounds);
        m7969G0(canvas2, bounds);
        m7966E0(canvas2, bounds);
        if (this.f7419Q0) {
            m7975M0(canvas2, bounds);
        }
        m7972J0(canvas2, bounds);
        m7974L0(canvas2, bounds);
        if (this.f7401G0 < 255) {
            canvas2.restoreToCount(iM1326a);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public int[] m8060e1() {
        return this.f7409L0;
    }

    /* JADX INFO: renamed from: e2 */
    public void m8061e2(float f3) {
        if (this.f7439i0 != f3) {
            this.f7439i0 = f3;
            invalidateSelf();
            m7998D1();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public ColorStateList m8062f1() {
        return this.f7430Z;
    }

    /* JADX INFO: renamed from: f2 */
    public void m8063f2(int i3) {
        m8061e2(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: g1 */
    public void m8064g1(RectF rectF) {
        m7991x0(getBounds(), rectF);
    }

    /* JADX INFO: renamed from: g2 */
    public void m8065g2(ColorStateList colorStateList) {
        if (this.f7412N != colorStateList) {
            this.f7412N = colorStateList;
            if (this.f7423S0) {
                m2282k0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7401G0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f7402H0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f7408L;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f7439i0 + m8088u0() + this.f7442l0 + this.f7454x0.m8473h(m8079p1().toString()) + this.f7443m0 + m8096y0() + this.f7446p0), this.f7421R0);
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f7423S0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f7410M);
        } else {
            outline.setRoundRect(bounds, this.f7410M);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    /* JADX INFO: renamed from: h2 */
    public void m8066h2(int i3) {
        m8065g2(AbstractC1832a.m9608a(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: i2 */
    public void m8067i2(float f3) {
        if (this.f7414O != f3) {
            this.f7414O = f3;
            this.f7448r0.setStrokeWidth(f3);
            if (this.f7423S0) {
                super.m2284l0(f3);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (m7961A1(this.f7404J) || m7961A1(this.f7406K) || m7961A1(this.f7412N)) {
            return true;
        }
        return (this.f7411M0 && m7961A1(this.f7413N0)) || m7993z1(this.f7454x0.m8470e()) || m7963C0() || m7962B1(this.f7422S) || m7962B1(this.f7435e0) || m7961A1(this.f7405J0);
    }

    /* JADX INFO: renamed from: j1 */
    public TextUtils.TruncateAt m8068j1() {
        return this.f7417P0;
    }

    /* JADX INFO: renamed from: j2 */
    public void m8069j2(int i3) {
        m8067i2(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: k1 */
    public C0179d m8070k1() {
        return this.f7438h0;
    }

    /* JADX INFO: renamed from: l1 */
    public float m8071l1() {
        return this.f7441k0;
    }

    /* JADX INFO: renamed from: l2 */
    public void m8072l2(Drawable drawable) {
        Drawable drawableM8050Z0 = m8050Z0();
        if (drawableM8050Z0 != drawable) {
            float fM8096y0 = m8096y0();
            this.f7428X = drawable != null ? AbstractC0000a.m17r(drawable).mutate() : null;
            m7981b3();
            float fM8096y02 = m8096y0();
            m7979Z2(drawableM8050Z0);
            if (m7978Y2()) {
                m7985s0(this.f7428X);
            }
            invalidateSelf();
            if (fM8096y0 != fM8096y02) {
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public float m8073m1() {
        return this.f7440j0;
    }

    /* JADX INFO: renamed from: m2 */
    public void m8074m2(CharSequence charSequence) {
        if (this.f7432b0 != charSequence) {
            this.f7432b0 = C0183a.m541c().m546h(charSequence);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public ColorStateList m8075n1() {
        return this.f7416P;
    }

    /* JADX INFO: renamed from: n2 */
    public void m8076n2(float f3) {
        if (this.f7445o0 != f3) {
            this.f7445o0 = f3;
            invalidateSelf();
            if (m7978Y2()) {
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    public C0179d m8077o1() {
        return this.f7437g0;
    }

    /* JADX INFO: renamed from: o2 */
    public void m8078o2(int i3) {
        m8076n2(this.f7447q0.getResources().getDimension(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i3) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i3);
        if (m7977X2()) {
            zOnLayoutDirectionChanged |= AbstractC0000a.m12m(this.f7422S, i3);
        }
        if (m7976W2()) {
            zOnLayoutDirectionChanged |= AbstractC0000a.m12m(this.f7435e0, i3);
        }
        if (m7978Y2()) {
            zOnLayoutDirectionChanged |= AbstractC0000a.m12m(this.f7428X, i3);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i3) {
        boolean zOnLevelChange = super.onLevelChange(i3);
        if (m7977X2()) {
            zOnLevelChange |= this.f7422S.setLevel(i3);
        }
        if (m7976W2()) {
            zOnLevelChange |= this.f7435e0.setLevel(i3);
        }
        if (m7978Y2()) {
            zOnLevelChange |= this.f7428X.setLevel(i3);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f7423S0) {
            super.onStateChange(iArr);
        }
        return m7967E1(iArr, m8060e1());
    }

    /* JADX INFO: renamed from: p1 */
    public CharSequence m8079p1() {
        return this.f7418Q;
    }

    /* JADX INFO: renamed from: p2 */
    public void m8080p2(int i3) {
        m8072l2(AbstractC1832a.m9609b(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: q1 */
    public C0559e m8081q1() {
        return this.f7454x0.m8470e();
    }

    /* JADX INFO: renamed from: q2 */
    public void m8082q2(float f3) {
        if (this.f7431a0 != f3) {
            this.f7431a0 = f3;
            invalidateSelf();
            if (m7978Y2()) {
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public float m8083r1() {
        return this.f7443m0;
    }

    /* JADX INFO: renamed from: r2 */
    public void m8084r2(int i3) {
        m8082q2(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: s1 */
    public float m8085s1() {
        return this.f7442l0;
    }

    /* JADX INFO: renamed from: s2 */
    public void m8086s2(float f3) {
        if (this.f7444n0 != f3) {
            this.f7444n0 = f3;
            invalidateSelf();
            if (m7978Y2()) {
                m7998D1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j3);
        }
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        if (this.f7401G0 != i3) {
            this.f7401G0 = i3;
            invalidateSelf();
        }
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7402H0 != colorFilter) {
            this.f7402H0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f7405J0 != colorStateList) {
            this.f7405J0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f7407K0 != mode) {
            this.f7407K0 = mode;
            this.f7403I0 = AbstractC1519d.m8258k(this, this.f7405J0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (m7977X2()) {
            visible |= this.f7422S.setVisible(z2, z3);
        }
        if (m7976W2()) {
            visible |= this.f7435e0.setVisible(z2, z3);
        }
        if (m7978Y2()) {
            visible |= this.f7428X.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: t2 */
    public void m8087t2(int i3) {
        m8086s2(this.f7447q0.getResources().getDimension(i3));
    }

    /* JADX INFO: renamed from: u0 */
    float m8088u0() {
        if (m7977X2() || m7976W2()) {
            return this.f7440j0 + m7983i1() + this.f7441k0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: u1 */
    public boolean m8089u1() {
        return this.f7411M0;
    }

    /* JADX INFO: renamed from: u2 */
    public boolean m8090u2(int[] iArr) {
        if (Arrays.equals(this.f7409L0, iArr)) {
            return false;
        }
        this.f7409L0 = iArr;
        if (m7978Y2()) {
            return m7967E1(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: v2 */
    public void m8091v2(ColorStateList colorStateList) {
        if (this.f7430Z != colorStateList) {
            this.f7430Z = colorStateList;
            if (m7978Y2()) {
                this.f7428X.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: w1 */
    public boolean m8092w1() {
        return this.f7433c0;
    }

    /* JADX INFO: renamed from: w2 */
    public void m8093w2(int i3) {
        m8091v2(AbstractC1832a.m9608a(this.f7447q0, i3));
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m8094x1() {
        return m7962B1(this.f7428X);
    }

    /* JADX INFO: renamed from: x2 */
    public void m8095x2(boolean z2) {
        if (this.f7427W != z2) {
            boolean zM7978Y2 = m7978Y2();
            this.f7427W = z2;
            boolean zM7978Y22 = m7978Y2();
            if (zM7978Y2 != zM7978Y22) {
                if (zM7978Y22) {
                    m7985s0(this.f7428X);
                } else {
                    m7979Z2(this.f7428X);
                }
                invalidateSelf();
                m7998D1();
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    float m8096y0() {
        if (m7978Y2()) {
            return this.f7444n0 + this.f7431a0 + this.f7445o0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: y1 */
    public boolean m8097y1() {
        return this.f7427W;
    }

    /* JADX INFO: renamed from: y2 */
    public void m8098y2(a aVar) {
        this.f7415O0 = new WeakReference(aVar);
    }

    /* JADX INFO: renamed from: z2 */
    public void m8099z2(TextUtils.TruncateAt truncateAt) {
        this.f7417P0 = truncateAt;
    }
}
