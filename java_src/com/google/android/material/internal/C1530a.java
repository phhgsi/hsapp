package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import p009D.AbstractC0091a;
import p019G0.AbstractC0176a;
import p021H.AbstractC0197o;
import p024I.AbstractC0211h;
import p043O0.AbstractC0450a;
import p067W0.AbstractC0565k;
import p067W0.C0555a;
import p067W0.C0559e;

/* JADX INFO: renamed from: com.google.android.material.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1530a {

    /* JADX INFO: renamed from: A */
    private Typeface f7641A;

    /* JADX INFO: renamed from: B */
    private Typeface f7642B;

    /* JADX INFO: renamed from: C */
    private Typeface f7643C;

    /* JADX INFO: renamed from: D */
    private Typeface f7644D;

    /* JADX INFO: renamed from: E */
    private C0555a f7645E;

    /* JADX INFO: renamed from: F */
    private C0555a f7646F;

    /* JADX INFO: renamed from: H */
    private CharSequence f7648H;

    /* JADX INFO: renamed from: I */
    private CharSequence f7649I;

    /* JADX INFO: renamed from: J */
    private boolean f7650J;

    /* JADX INFO: renamed from: L */
    private float f7652L;

    /* JADX INFO: renamed from: M */
    private float f7653M;

    /* JADX INFO: renamed from: N */
    private float f7654N;

    /* JADX INFO: renamed from: O */
    private float f7655O;

    /* JADX INFO: renamed from: P */
    private float f7656P;

    /* JADX INFO: renamed from: Q */
    private int f7657Q;

    /* JADX INFO: renamed from: R */
    private int f7658R;

    /* JADX INFO: renamed from: S */
    private int[] f7659S;

    /* JADX INFO: renamed from: T */
    private boolean f7660T;

    /* JADX INFO: renamed from: U */
    private final TextPaint f7661U;

    /* JADX INFO: renamed from: V */
    private final TextPaint f7662V;

    /* JADX INFO: renamed from: W */
    private TimeInterpolator f7663W;

    /* JADX INFO: renamed from: X */
    private TimeInterpolator f7664X;

    /* JADX INFO: renamed from: Y */
    private float f7665Y;

    /* JADX INFO: renamed from: Z */
    private float f7666Z;

    /* JADX INFO: renamed from: a */
    private final View f7667a;

    /* JADX INFO: renamed from: a0 */
    private float f7668a0;

    /* JADX INFO: renamed from: b */
    private float f7669b;

    /* JADX INFO: renamed from: b0 */
    private ColorStateList f7670b0;

    /* JADX INFO: renamed from: c */
    private boolean f7671c;

    /* JADX INFO: renamed from: c0 */
    private float f7672c0;

    /* JADX INFO: renamed from: d */
    private float f7673d;

    /* JADX INFO: renamed from: d0 */
    private float f7674d0;

    /* JADX INFO: renamed from: e */
    private float f7675e;

    /* JADX INFO: renamed from: e0 */
    private float f7676e0;

    /* JADX INFO: renamed from: f */
    private int f7677f;

    /* JADX INFO: renamed from: f0 */
    private ColorStateList f7678f0;

    /* JADX INFO: renamed from: g */
    private final Rect f7679g;

    /* JADX INFO: renamed from: g0 */
    private float f7680g0;

    /* JADX INFO: renamed from: h */
    private final Rect f7681h;

    /* JADX INFO: renamed from: h0 */
    private float f7682h0;

    /* JADX INFO: renamed from: i */
    private Rect f7683i;

    /* JADX INFO: renamed from: i0 */
    private float f7684i0;

    /* JADX INFO: renamed from: j */
    private final RectF f7685j;

    /* JADX INFO: renamed from: j0 */
    private StaticLayout f7686j0;

    /* JADX INFO: renamed from: k0 */
    private float f7688k0;

    /* JADX INFO: renamed from: l0 */
    private float f7690l0;

    /* JADX INFO: renamed from: m0 */
    private float f7692m0;

    /* JADX INFO: renamed from: n0 */
    private CharSequence f7694n0;

    /* JADX INFO: renamed from: o */
    private ColorStateList f7695o;

    /* JADX INFO: renamed from: p */
    private ColorStateList f7697p;

    /* JADX INFO: renamed from: q */
    private int f7699q;

    /* JADX INFO: renamed from: r */
    private float f7701r;

    /* JADX INFO: renamed from: s */
    private float f7703s;

    /* JADX INFO: renamed from: t */
    private float f7705t;

    /* JADX INFO: renamed from: t0 */
    private InterfaceC1542m f7706t0;

    /* JADX INFO: renamed from: u */
    private float f7707u;

    /* JADX INFO: renamed from: v */
    private float f7709v;

    /* JADX INFO: renamed from: w */
    private float f7711w;

    /* JADX INFO: renamed from: w0 */
    private boolean f7712w0;

    /* JADX INFO: renamed from: x */
    private Typeface f7713x;

    /* JADX INFO: renamed from: y */
    private Typeface f7714y;

    /* JADX INFO: renamed from: z */
    private Typeface f7715z;

    /* JADX INFO: renamed from: k */
    private int f7687k = 16;

    /* JADX INFO: renamed from: l */
    private int f7689l = 16;

    /* JADX INFO: renamed from: m */
    private float f7691m = 15.0f;

    /* JADX INFO: renamed from: n */
    private float f7693n = 15.0f;

    /* JADX INFO: renamed from: G */
    private TextUtils.TruncateAt f7647G = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: K */
    private boolean f7651K = true;

    /* JADX INFO: renamed from: o0 */
    private int f7696o0 = 1;

    /* JADX INFO: renamed from: p0 */
    private int f7698p0 = 1;

    /* JADX INFO: renamed from: q0 */
    private float f7700q0 = 0.0f;

    /* JADX INFO: renamed from: r0 */
    private float f7702r0 = 1.0f;

    /* JADX INFO: renamed from: s0 */
    private int f7704s0 = C1541l.f7776o;

    /* JADX INFO: renamed from: u0 */
    private int f7708u0 = -1;

    /* JADX INFO: renamed from: v0 */
    private int f7710v0 = -1;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a */
    class a implements C0555a.a {
        a() {
        }

        @Override // p067W0.C0555a.a
        /* JADX INFO: renamed from: a */
        public void mo2068a(Typeface typeface) {
            C1530a.this.m8346Y(typeface);
        }
    }

    public C1530a(View view) {
        this.f7667a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f7661U = textPaint;
        this.f7662V = new TextPaint(textPaint);
        this.f7681h = new Rect();
        this.f7679g = new Rect();
        this.f7685j = new RectF();
        this.f7675e = m8317e();
        m8336L(view.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: C */
    private Layout.Alignment m8301C() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f7687k, this.f7650J ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.f7650J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f7650J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: renamed from: D */
    private void m8302D(TextPaint textPaint) {
        textPaint.setTextSize(this.f7693n);
        textPaint.setTypeface(this.f7713x);
        textPaint.setLetterSpacing(this.f7680g0);
    }

    /* JADX INFO: renamed from: E */
    private void m8303E(TextPaint textPaint) {
        textPaint.setTextSize(this.f7691m);
        textPaint.setTypeface(this.f7641A);
        textPaint.setLetterSpacing(this.f7682h0);
    }

    /* JADX INFO: renamed from: F */
    private void m8304F(float f3) {
        if (this.f7671c) {
            this.f7685j.set(f3 < this.f7675e ? this.f7679g : this.f7681h);
            return;
        }
        this.f7685j.left = m8308K(this.f7679g.left, this.f7681h.left, f3, this.f7663W);
        this.f7685j.top = m8308K(this.f7701r, this.f7703s, f3, this.f7663W);
        this.f7685j.right = m8308K(this.f7679g.right, this.f7681h.right, f3, this.f7663W);
        this.f7685j.bottom = m8308K(this.f7679g.bottom, this.f7681h.bottom, f3, this.f7663W);
    }

    /* JADX INFO: renamed from: G */
    private static boolean m8305G(float f3, float f4) {
        return Math.abs(f3 - f4) < 1.0E-5f;
    }

    /* JADX INFO: renamed from: H */
    private boolean m8306H() {
        return this.f7667a.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: J */
    private boolean m8307J(CharSequence charSequence, boolean z2) {
        return (z2 ? AbstractC0197o.f1218d : AbstractC0197o.f1217c).mo582a(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: K */
    private static float m8308K(float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return AbstractC0176a.m482a(f3, f4, f5);
    }

    /* JADX INFO: renamed from: M */
    private float m8309M(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: P */
    private static boolean m8310P(Rect rect, int i3, int i4, int i5, int i6) {
        return rect.left == i3 && rect.top == i4 && rect.right == i5 && rect.bottom == i6;
    }

    /* JADX INFO: renamed from: V */
    private void m8311V(float f3) {
        this.f7690l0 = f3;
        this.f7667a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: Z */
    private boolean m8312Z(Typeface typeface) {
        C0555a c0555a = this.f7646F;
        if (c0555a != null) {
            c0555a.m2067c();
        }
        if (this.f7715z == typeface) {
            return false;
        }
        this.f7715z = typeface;
        Typeface typefaceM2115b = AbstractC0565k.m2115b(this.f7667a.getContext().getResources().getConfiguration(), typeface);
        this.f7714y = typefaceM2115b;
        if (typefaceM2115b == null) {
            typefaceM2115b = this.f7715z;
        }
        this.f7713x = typefaceM2115b;
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static int m8313a(int i3, int i4, float f3) {
        float f4 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i3) * f4) + (Color.alpha(i4) * f3)), Math.round((Color.red(i3) * f4) + (Color.red(i4) * f3)), Math.round((Color.green(i3) * f4) + (Color.green(i4) * f3)), Math.round((Color.blue(i3) * f4) + (Color.blue(i4) * f3)));
    }

    /* JADX INFO: renamed from: b */
    private void m8314b(boolean z2) {
        float fM8309M;
        m8322i(1.0f, z2);
        if (this.f7649I != null && this.f7686j0 != null) {
            this.f7694n0 = m8329r0() ? TextUtils.ellipsize(this.f7649I, this.f7661U, this.f7686j0.getWidth(), this.f7647G) : this.f7649I;
        }
        CharSequence charSequence = this.f7694n0;
        if (charSequence != null) {
            this.f7688k0 = m8309M(this.f7661U, charSequence);
        } else {
            this.f7688k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f7689l, this.f7650J ? 1 : 0);
        Rect rect = this.f7683i;
        if (rect == null) {
            rect = this.f7681h;
        }
        int i3 = absoluteGravity & 112;
        if (i3 == 48) {
            this.f7703s = rect.top;
        } else if (i3 != 80) {
            this.f7703s = rect.centerY() - ((this.f7661U.descent() - this.f7661U.ascent()) / 2.0f);
        } else {
            this.f7703s = rect.bottom + this.f7661U.ascent();
        }
        int i4 = absoluteGravity & 8388615;
        if (i4 == 1) {
            this.f7707u = rect.centerX() - (this.f7688k0 / 2.0f);
        } else if (i4 != 5) {
            this.f7707u = rect.left;
        } else {
            this.f7707u = rect.right - this.f7688k0;
        }
        if (this.f7688k0 <= this.f7681h.width()) {
            float f3 = this.f7707u;
            float fMax = f3 + Math.max(0.0f, this.f7681h.left - f3);
            this.f7707u = fMax;
            this.f7707u = fMax + Math.min(0.0f, this.f7681h.right - (this.f7688k0 + fMax));
        }
        if (m8357m() <= this.f7681h.height()) {
            float f4 = this.f7703s;
            float fMax2 = f4 + Math.max(0.0f, this.f7681h.top - f4);
            this.f7703s = fMax2;
            this.f7703s = fMax2 + Math.min(0.0f, this.f7681h.bottom - (m8365q() + fMax2));
        }
        m8322i(0.0f, z2);
        float height = this.f7686j0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f7686j0;
        if (staticLayout == null || this.f7696o0 <= 1) {
            CharSequence charSequence2 = this.f7649I;
            fM8309M = charSequence2 != null ? m8309M(this.f7661U, charSequence2) : 0.0f;
        } else {
            fM8309M = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f7686j0;
        this.f7699q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f7687k, this.f7650J ? 1 : 0);
        int i5 = absoluteGravity2 & 112;
        if (i5 == 48) {
            this.f7701r = this.f7679g.top;
        } else if (i5 != 80) {
            this.f7701r = this.f7679g.centerY() - (height / 2.0f);
        } else {
            this.f7701r = (this.f7679g.bottom - height) + (this.f7712w0 ? this.f7661U.descent() : 0.0f);
        }
        int i6 = absoluteGravity2 & 8388615;
        if (i6 == 1) {
            this.f7705t = this.f7679g.centerX() - (fM8309M / 2.0f);
        } else if (i6 != 5) {
            this.f7705t = this.f7679g.left;
        } else {
            this.f7705t = this.f7679g.right - fM8309M;
        }
        m8325k0(this.f7669b);
    }

    /* JADX INFO: renamed from: c */
    private void m8315c() {
        m8320g(this.f7669b);
    }

    /* JADX INFO: renamed from: d */
    private float m8316d(float f3) {
        float f4 = this.f7675e;
        return f3 <= f4 ? AbstractC0176a.m483b(1.0f, 0.0f, this.f7673d, f4, f3) : AbstractC0176a.m483b(0.0f, 1.0f, f4, 1.0f, f3);
    }

    /* JADX INFO: renamed from: e */
    private float m8317e() {
        float f3 = this.f7673d;
        return f3 + ((1.0f - f3) * 0.5f);
    }

    /* JADX INFO: renamed from: f */
    private boolean m8318f(CharSequence charSequence) {
        boolean zM8306H = m8306H();
        return this.f7651K ? m8307J(charSequence, zM8306H) : zM8306H;
    }

    /* JADX INFO: renamed from: f0 */
    private void m8319f0(float f3) {
        this.f7692m0 = f3;
        this.f7667a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: g */
    private void m8320g(float f3) {
        float f4;
        m8304F(f3);
        if (!this.f7671c) {
            this.f7709v = m8308K(this.f7705t, this.f7707u, f3, this.f7663W);
            this.f7711w = m8308K(this.f7701r, this.f7703s, f3, this.f7663W);
            m8325k0(f3);
            f4 = f3;
        } else if (f3 < this.f7675e) {
            this.f7709v = this.f7705t;
            this.f7711w = this.f7701r;
            m8325k0(0.0f);
            f4 = 0.0f;
        } else {
            this.f7709v = this.f7707u;
            this.f7711w = this.f7703s - Math.max(0, this.f7677f);
            m8325k0(1.0f);
            f4 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AbstractC0176a.f1126b;
        m8311V(1.0f - m8308K(0.0f, 1.0f, 1.0f - f3, timeInterpolator));
        m8319f0(m8308K(1.0f, 0.0f, f3, timeInterpolator));
        if (this.f7697p != this.f7695o) {
            this.f7661U.setColor(m8313a(m8332v(), m8367t(), f4));
        } else {
            this.f7661U.setColor(m8367t());
        }
        float f5 = this.f7680g0;
        float f6 = this.f7682h0;
        if (f5 != f6) {
            this.f7661U.setLetterSpacing(m8308K(f6, f5, f3, timeInterpolator));
        } else {
            this.f7661U.setLetterSpacing(f5);
        }
        this.f7654N = m8308K(this.f7672c0, this.f7665Y, f3, null);
        this.f7655O = m8308K(this.f7674d0, this.f7666Z, f3, null);
        this.f7656P = m8308K(this.f7676e0, this.f7668a0, f3, null);
        int iM8313a = m8313a(m8331u(this.f7678f0), m8331u(this.f7670b0), f3);
        this.f7657Q = iM8313a;
        this.f7661U.setShadowLayer(this.f7654N, this.f7655O, this.f7656P, iM8313a);
        if (this.f7671c) {
            this.f7661U.setAlpha((int) (m8316d(f3) * this.f7661U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f7661U;
                textPaint.setShadowLayer(this.f7654N, this.f7655O, this.f7656P, AbstractC0450a.m1629a(this.f7657Q, textPaint.getAlpha()));
            }
        }
        this.f7667a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: h */
    private void m8321h(float f3) {
        m8322i(f3, false);
    }

    /* JADX INFO: renamed from: i */
    private void m8322i(float f3, boolean z2) {
        Typeface typeface;
        float f4;
        float f5;
        if (this.f7648H == null) {
            return;
        }
        float fWidth = this.f7681h.width();
        float fWidth2 = this.f7679g.width();
        if (m8305G(f3, 1.0f)) {
            f4 = m8329r0() ? this.f7693n : this.f7691m;
            f5 = m8329r0() ? this.f7680g0 : this.f7682h0;
            this.f7652L = m8329r0() ? 1.0f : m8308K(this.f7691m, this.f7693n, f3, this.f7664X) / this.f7691m;
            if (!m8329r0()) {
                fWidth = fWidth2;
            }
            typeface = this.f7713x;
            fWidth2 = fWidth;
        } else {
            float f6 = this.f7691m;
            float f7 = this.f7682h0;
            typeface = this.f7641A;
            if (m8305G(f3, 0.0f)) {
                this.f7652L = 1.0f;
            } else {
                this.f7652L = m8308K(this.f7691m, this.f7693n, f3, this.f7664X) / this.f7691m;
            }
            float f8 = this.f7693n / this.f7691m;
            float f9 = fWidth2 * f8;
            if (!z2 && !this.f7671c && f9 > fWidth && m8329r0()) {
                fWidth2 = Math.min(fWidth / f8, fWidth2);
            }
            f4 = f6;
            f5 = f7;
        }
        int i3 = f3 < 0.5f ? this.f7696o0 : this.f7698p0;
        if (fWidth2 > 0.0f) {
            boolean z3 = this.f7653M != f4;
            boolean z4 = this.f7684i0 != f5;
            boolean z5 = this.f7644D != typeface;
            StaticLayout staticLayout = this.f7686j0;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || (this.f7658R != i3) || this.f7660T;
            this.f7653M = f4;
            this.f7684i0 = f5;
            this.f7644D = typeface;
            this.f7660T = false;
            this.f7658R = i3;
            this.f7661U.setLinearText(this.f7652L != 1.0f);
            z = z6;
        }
        if (this.f7649I == null || z) {
            this.f7661U.setTextSize(this.f7653M);
            this.f7661U.setTypeface(this.f7644D);
            this.f7661U.setLetterSpacing(this.f7684i0);
            this.f7650J = m8318f(this.f7648H);
            StaticLayout staticLayoutM8324j = m8324j(m8327q0() ? i3 : 1, this.f7661U, this.f7648H, fWidth2 * (m8329r0() ? 1.0f : this.f7652L), this.f7650J);
            this.f7686j0 = staticLayoutM8324j;
            this.f7649I = staticLayoutM8324j.getText();
        }
    }

    /* JADX INFO: renamed from: i0 */
    private boolean m8323i0(Typeface typeface) {
        C0555a c0555a = this.f7645E;
        if (c0555a != null) {
            c0555a.m2067c();
        }
        if (this.f7643C == typeface) {
            return false;
        }
        this.f7643C = typeface;
        Typeface typefaceM2115b = AbstractC0565k.m2115b(this.f7667a.getContext().getResources().getConfiguration(), typeface);
        this.f7642B = typefaceM2115b;
        if (typefaceM2115b == null) {
            typefaceM2115b = this.f7643C;
        }
        this.f7641A = typefaceM2115b;
        return true;
    }

    /* JADX INFO: renamed from: j */
    private StaticLayout m8324j(int i3, TextPaint textPaint, CharSequence charSequence, float f3, boolean z2) {
        return (StaticLayout) AbstractC0211h.m610g(C1541l.m8454b(charSequence, textPaint, (int) f3).m8457d(this.f7647G).m8460g(z2).m8456c(i3 == 1 ? Layout.Alignment.ALIGN_NORMAL : m8301C()).m8459f(false).m8462i(i3).m8461h(this.f7700q0, this.f7702r0).m8458e(this.f7704s0).m8463j(this.f7706t0).m8455a());
    }

    /* JADX INFO: renamed from: k0 */
    private void m8325k0(float f3) {
        m8321h(f3);
        this.f7667a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: l */
    private void m8326l(Canvas canvas, float f3, float f4) {
        int alpha = this.f7661U.getAlpha();
        canvas.translate(f3, f4);
        if (!this.f7671c) {
            this.f7661U.setAlpha((int) (this.f7692m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f7661U;
                textPaint.setShadowLayer(this.f7654N, this.f7655O, this.f7656P, AbstractC0450a.m1629a(this.f7657Q, textPaint.getAlpha()));
            }
            this.f7686j0.draw(canvas);
        }
        if (!this.f7671c) {
            this.f7661U.setAlpha((int) (this.f7690l0 * alpha));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            TextPaint textPaint2 = this.f7661U;
            textPaint2.setShadowLayer(this.f7654N, this.f7655O, this.f7656P, AbstractC0450a.m1629a(this.f7657Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f7686j0.getLineBaseline(0);
        CharSequence charSequence = this.f7694n0;
        float f5 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.f7661U);
        if (i3 >= 31) {
            this.f7661U.setShadowLayer(this.f7654N, this.f7655O, this.f7656P, this.f7657Q);
        }
        if (this.f7671c) {
            return;
        }
        String strTrim = this.f7694n0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f7661U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f7686j0.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.f7661U);
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m8327q0() {
        if (this.f7696o0 > 1 || this.f7698p0 > 1) {
            return !this.f7650J || this.f7671c;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    private float m8328r(int i3, int i4) {
        return (i4 == 17 || (i4 & 7) == 1) ? (i3 / 2.0f) - (this.f7688k0 / 2.0f) : ((i4 & 8388613) == 8388613 || (i4 & 5) == 5) ? this.f7650J ? this.f7681h.left : this.f7681h.right - this.f7688k0 : this.f7650J ? this.f7681h.right - this.f7688k0 : this.f7681h.left;
    }

    /* JADX INFO: renamed from: r0 */
    private boolean m8329r0() {
        return this.f7698p0 == 1;
    }

    /* JADX INFO: renamed from: s */
    private float m8330s(RectF rectF, int i3, int i4) {
        return (i4 == 17 || (i4 & 7) == 1) ? (i3 / 2.0f) + (this.f7688k0 / 2.0f) : ((i4 & 8388613) == 8388613 || (i4 & 5) == 5) ? this.f7650J ? rectF.left + this.f7688k0 : this.f7681h.right : this.f7650J ? this.f7681h.right : rectF.left + this.f7688k0;
    }

    /* JADX INFO: renamed from: u */
    private int m8331u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f7659S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: v */
    private int m8332v() {
        return m8331u(this.f7695o);
    }

    /* JADX INFO: renamed from: A */
    public float m8333A() {
        m8303E(this.f7662V);
        return -this.f7662V.ascent();
    }

    /* JADX INFO: renamed from: B */
    public float m8334B() {
        return this.f7669b;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m8335I() {
        ColorStateList colorStateList = this.f7697p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f7695o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    /* JADX INFO: renamed from: L */
    public void m8336L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f7715z;
            if (typeface != null) {
                this.f7714y = AbstractC0565k.m2115b(configuration, typeface);
            }
            Typeface typeface2 = this.f7643C;
            if (typeface2 != null) {
                this.f7642B = AbstractC0565k.m2115b(configuration, typeface2);
            }
            Typeface typeface3 = this.f7714y;
            if (typeface3 == null) {
                typeface3 = this.f7715z;
            }
            this.f7713x = typeface3;
            Typeface typeface4 = this.f7642B;
            if (typeface4 == null) {
                typeface4 = this.f7643C;
            }
            this.f7641A = typeface4;
            m8338O(true);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m8337N() {
        m8338O(false);
    }

    /* JADX INFO: renamed from: O */
    public void m8338O(boolean z2) {
        if ((this.f7667a.getHeight() <= 0 || this.f7667a.getWidth() <= 0) && !z2) {
            return;
        }
        m8314b(z2);
        m8315c();
    }

    /* JADX INFO: renamed from: Q */
    public void m8339Q(ColorStateList colorStateList) {
        if (this.f7697p == colorStateList && this.f7695o == colorStateList) {
            return;
        }
        this.f7697p = colorStateList;
        this.f7695o = colorStateList;
        m8337N();
    }

    /* JADX INFO: renamed from: R */
    public void m8340R(int i3, int i4, int i5, int i6) {
        if (m8310P(this.f7681h, i3, i4, i5, i6)) {
            return;
        }
        this.f7681h.set(i3, i4, i5, i6);
        this.f7660T = true;
    }

    /* JADX INFO: renamed from: S */
    public void m8341S(Rect rect) {
        m8340R(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: T */
    public void m8342T(int i3) {
        if (i3 != this.f7698p0) {
            this.f7698p0 = i3;
            m8337N();
        }
    }

    /* JADX INFO: renamed from: U */
    public void m8343U(int i3) {
        C0559e c0559e = new C0559e(this.f7667a.getContext(), i3);
        if (c0559e.m2101j() != null) {
            this.f7697p = c0559e.m2101j();
        }
        if (c0559e.m2102k() != 0.0f) {
            this.f7693n = c0559e.m2102k();
        }
        ColorStateList colorStateList = c0559e.f1954c;
        if (colorStateList != null) {
            this.f7670b0 = colorStateList;
        }
        this.f7666Z = c0559e.f1960i;
        this.f7668a0 = c0559e.f1961j;
        this.f7665Y = c0559e.f1962k;
        this.f7680g0 = c0559e.f1964m;
        C0555a c0555a = this.f7646F;
        if (c0555a != null) {
            c0555a.m2067c();
        }
        this.f7646F = new C0555a(new a(), c0559e.m2097e());
        c0559e.m2099g(this.f7667a.getContext(), this.f7646F);
        m8337N();
    }

    /* JADX INFO: renamed from: W */
    public void m8344W(ColorStateList colorStateList) {
        if (this.f7697p != colorStateList) {
            this.f7697p = colorStateList;
            m8337N();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m8345X(int i3) {
        if (this.f7689l != i3) {
            this.f7689l = i3;
            m8337N();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m8346Y(Typeface typeface) {
        if (m8312Z(typeface)) {
            m8337N();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m8347a0(int i3, int i4, int i5, int i6) {
        m8348b0(i3, i4, i5, i6, true);
    }

    /* JADX INFO: renamed from: b0 */
    public void m8348b0(int i3, int i4, int i5, int i6, boolean z2) {
        if (m8310P(this.f7679g, i3, i4, i5, i6) && z2 == this.f7712w0) {
            return;
        }
        this.f7679g.set(i3, i4, i5, i6);
        this.f7660T = true;
        this.f7712w0 = z2;
    }

    /* JADX INFO: renamed from: c0 */
    public void m8349c0(Rect rect) {
        m8347a0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: d0 */
    public void m8350d0(float f3) {
        if (this.f7682h0 != f3) {
            this.f7682h0 = f3;
            m8337N();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m8351e0(int i3) {
        if (i3 != this.f7696o0) {
            this.f7696o0 = i3;
            m8337N();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m8352g0(int i3) {
        if (this.f7687k != i3) {
            this.f7687k = i3;
            m8337N();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m8353h0(float f3) {
        if (this.f7691m != f3) {
            this.f7691m = f3;
            m8337N();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m8354j0(float f3) {
        float fM257a = AbstractC0091a.m257a(f3, 0.0f, 1.0f);
        if (fM257a != this.f7669b) {
            this.f7669b = fM257a;
            m8315c();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m8355k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f7649I == null || this.f7685j.width() <= 0.0f || this.f7685j.height() <= 0.0f) {
            return;
        }
        this.f7661U.setTextSize(this.f7653M);
        float f3 = this.f7709v;
        float f4 = this.f7711w;
        float f5 = this.f7652L;
        if (f5 != 1.0f && !this.f7671c) {
            canvas.scale(f5, f5, f3, f4);
        }
        if (m8327q0() && m8329r0() && (!this.f7671c || this.f7669b > this.f7675e)) {
            m8326l(canvas, this.f7709v - this.f7686j0.getLineStart(0), f4);
        } else {
            canvas.translate(f3, f4);
            this.f7686j0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: l0 */
    public void m8356l0(TimeInterpolator timeInterpolator) {
        this.f7663W = timeInterpolator;
        m8337N();
    }

    /* JADX INFO: renamed from: m */
    public float m8357m() {
        m8302D(this.f7662V);
        return (-this.f7662V.ascent()) + this.f7662V.descent();
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m8358m0(int[] iArr) {
        this.f7659S = iArr;
        if (!m8335I()) {
            return false;
        }
        m8337N();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public float m8359n() {
        m8302D(this.f7662V);
        return -this.f7662V.ascent();
    }

    /* JADX INFO: renamed from: n0 */
    public void m8360n0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f7648H, charSequence)) {
            this.f7648H = charSequence;
            this.f7649I = null;
            m8337N();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m8361o(RectF rectF, int i3, int i4) {
        this.f7650J = m8318f(this.f7648H);
        rectF.left = Math.max(m8328r(i3, i4), this.f7681h.left);
        rectF.top = this.f7681h.top;
        rectF.right = Math.min(m8330s(rectF, i3, i4), this.f7681h.right);
        rectF.bottom = this.f7681h.top + m8365q();
        if (this.f7686j0 == null || m8329r0()) {
            return;
        }
        float lineWidth = this.f7686j0.getLineWidth(r4.getLineCount() - 1) * (this.f7693n / this.f7691m);
        if (this.f7650J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m8362o0(TimeInterpolator timeInterpolator) {
        this.f7664X = timeInterpolator;
        m8337N();
    }

    /* JADX INFO: renamed from: p */
    public ColorStateList m8363p() {
        return this.f7697p;
    }

    /* JADX INFO: renamed from: p0 */
    public void m8364p0(Typeface typeface) {
        boolean zM8312Z = m8312Z(typeface);
        boolean zM8323i0 = m8323i0(typeface);
        if (zM8312Z || zM8323i0) {
            m8337N();
        }
    }

    /* JADX INFO: renamed from: q */
    public float m8365q() {
        int i3 = this.f7708u0;
        return i3 != -1 ? i3 : m8359n();
    }

    /* JADX INFO: renamed from: s0 */
    public void m8366s0(int i3) {
        m8302D(this.f7662V);
        float f3 = i3;
        this.f7708u0 = m8324j(this.f7698p0, this.f7662V, this.f7648H, f3 * (this.f7693n / this.f7691m), this.f7650J).getHeight();
        m8303E(this.f7662V);
        this.f7710v0 = m8324j(this.f7696o0, this.f7662V, this.f7648H, f3, this.f7650J).getHeight();
    }

    /* JADX INFO: renamed from: t */
    public int m8367t() {
        return m8331u(this.f7697p);
    }

    /* JADX INFO: renamed from: w */
    public int m8368w() {
        return this.f7699q;
    }

    /* JADX INFO: renamed from: x */
    public int m8369x() {
        return this.f7696o0;
    }

    /* JADX INFO: renamed from: y */
    public float m8370y() {
        m8303E(this.f7662V);
        return (-this.f7662V.ascent()) + this.f7662V.descent();
    }

    /* JADX INFO: renamed from: z */
    public float m8371z() {
        int i3 = this.f7710v0;
        return i3 != -1 ? i3 : m8333A();
    }
}
