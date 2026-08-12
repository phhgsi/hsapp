package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.internal.AbstractC1549t;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0150k;
import p043O0.AbstractC0450a;
import p045P.C0466l;
import p067W0.AbstractC0557c;
import p070X0.AbstractC0595a;
import p076Z0.C0637h;
import p076Z0.C0641l;
import p076Z0.C0649t;
import p076Z0.InterfaceC0644o;

/* JADX INFO: renamed from: com.google.android.material.button.e */
/* JADX INFO: loaded from: classes.dex */
class C1471e {

    /* JADX INFO: renamed from: a */
    private final MaterialButton f7244a;

    /* JADX INFO: renamed from: b */
    private C0641l f7245b;

    /* JADX INFO: renamed from: c */
    private C0649t f7246c;

    /* JADX INFO: renamed from: d */
    private C0466l f7247d;

    /* JADX INFO: renamed from: e */
    private C0637h.d f7248e;

    /* JADX INFO: renamed from: f */
    private int f7249f;

    /* JADX INFO: renamed from: g */
    private int f7250g;

    /* JADX INFO: renamed from: h */
    private int f7251h;

    /* JADX INFO: renamed from: i */
    private int f7252i;

    /* JADX INFO: renamed from: j */
    private int f7253j;

    /* JADX INFO: renamed from: k */
    private int f7254k;

    /* JADX INFO: renamed from: l */
    private PorterDuff.Mode f7255l;

    /* JADX INFO: renamed from: m */
    private ColorStateList f7256m;

    /* JADX INFO: renamed from: n */
    private ColorStateList f7257n;

    /* JADX INFO: renamed from: o */
    private ColorStateList f7258o;

    /* JADX INFO: renamed from: p */
    private Drawable f7259p;

    /* JADX INFO: renamed from: t */
    private boolean f7263t;

    /* JADX INFO: renamed from: v */
    private LayerDrawable f7265v;

    /* JADX INFO: renamed from: w */
    private int f7266w;

    /* JADX INFO: renamed from: q */
    private boolean f7260q = false;

    /* JADX INFO: renamed from: r */
    private boolean f7261r = false;

    /* JADX INFO: renamed from: s */
    private boolean f7262s = false;

    /* JADX INFO: renamed from: u */
    private boolean f7264u = true;

    C1471e(MaterialButton materialButton, C0641l c0641l) {
        this.f7244a = materialButton;
        this.f7245b = c0641l;
    }

    /* JADX INFO: renamed from: L */
    private void m7728L(int i3, int i4) {
        int paddingStart = this.f7244a.getPaddingStart();
        int paddingTop = this.f7244a.getPaddingTop();
        int paddingEnd = this.f7244a.getPaddingEnd();
        int paddingBottom = this.f7244a.getPaddingBottom();
        int i5 = this.f7251h;
        int i6 = this.f7252i;
        this.f7252i = i4;
        this.f7251h = i3;
        if (!this.f7261r) {
            m7729M();
        }
        this.f7244a.setPaddingRelative(paddingStart, (paddingTop + i3) - i5, paddingEnd, (paddingBottom + i4) - i6);
    }

    /* JADX INFO: renamed from: M */
    private void m7729M() {
        this.f7244a.setInternalBackground(m7733a());
        C0637h c0637hM7752g = m7752g();
        if (c0637hM7752g != null) {
            c0637hM7752g.m2273b0(this.f7266w);
            c0637hM7752g.setState(this.f7244a.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: N */
    private void m7730N() {
        C0637h c0637hM7752g = m7752g();
        if (c0637hM7752g != null) {
            C0649t c0649t = this.f7246c;
            if (c0649t != null) {
                c0637hM7752g.m2279h0(c0649t);
            } else {
                c0637hM7752g.setShapeAppearanceModel(this.f7245b);
            }
            C0466l c0466l = this.f7247d;
            if (c0466l != null) {
                c0637hM7752g.m2272a0(c0466l);
            }
        }
        C0637h c0637hM7735p = m7735p();
        if (c0637hM7735p != null) {
            C0649t c0649t2 = this.f7246c;
            if (c0649t2 != null) {
                c0637hM7735p.m2279h0(c0649t2);
            } else {
                c0637hM7735p.setShapeAppearanceModel(this.f7245b);
            }
            C0466l c0466l2 = this.f7247d;
            if (c0466l2 != null) {
                c0637hM7735p.m2272a0(c0466l2);
            }
        }
        InterfaceC0644o interfaceC0644oM7751f = m7751f();
        if (interfaceC0644oM7751f != null) {
            interfaceC0644oM7751f.setShapeAppearanceModel(this.f7245b);
            if (interfaceC0644oM7751f instanceof C0637h) {
                C0637h c0637h = (C0637h) interfaceC0644oM7751f;
                C0649t c0649t3 = this.f7246c;
                if (c0649t3 != null) {
                    c0637h.m2279h0(c0649t3);
                }
                C0466l c0466l3 = this.f7247d;
                if (c0466l3 != null) {
                    c0637h.m2272a0(c0466l3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    private void m7731O() {
        C0637h c0637hM7752g = m7752g();
        C0637h c0637hM7735p = m7735p();
        if (c0637hM7752g != null) {
            c0637hM7752g.m2281j0(this.f7254k, this.f7257n);
            if (c0637hM7735p != null) {
                c0637hM7735p.m2280i0(this.f7254k, this.f7260q ? AbstractC0450a.m1632d(this.f7244a, AbstractC0140a.f341i) : 0);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    private InsetDrawable m7732P(Drawable drawable) {
        return new InsetDrawable(drawable, this.f7249f, this.f7251h, this.f7250g, this.f7252i);
    }

    /* JADX INFO: renamed from: a */
    private Drawable m7733a() {
        C0637h c0637h = new C0637h(this.f7245b);
        C0649t c0649t = this.f7246c;
        if (c0649t != null) {
            c0637h.m2279h0(c0649t);
        }
        C0466l c0466l = this.f7247d;
        if (c0466l != null) {
            c0637h.m2272a0(c0466l);
        }
        C0637h.d dVar = this.f7248e;
        if (dVar != null) {
            c0637h.m2276e0(dVar);
        }
        c0637h.m2266Q(this.f7244a.getContext());
        c0637h.setTintList(this.f7256m);
        PorterDuff.Mode mode = this.f7255l;
        if (mode != null) {
            c0637h.setTintMode(mode);
        }
        c0637h.m2281j0(this.f7254k, this.f7257n);
        C0637h c0637h2 = new C0637h(this.f7245b);
        C0649t c0649t2 = this.f7246c;
        if (c0649t2 != null) {
            c0637h2.m2279h0(c0649t2);
        }
        C0466l c0466l2 = this.f7247d;
        if (c0466l2 != null) {
            c0637h2.m2272a0(c0466l2);
        }
        c0637h2.setTint(0);
        c0637h2.m2280i0(this.f7254k, this.f7260q ? AbstractC0450a.m1632d(this.f7244a, AbstractC0140a.f341i) : 0);
        C0637h c0637h3 = new C0637h(this.f7245b);
        this.f7259p = c0637h3;
        C0649t c0649t3 = this.f7246c;
        if (c0649t3 != null) {
            c0637h3.m2279h0(c0649t3);
        }
        C0466l c0466l3 = this.f7247d;
        if (c0466l3 != null) {
            ((C0637h) this.f7259p).m2272a0(c0466l3);
        }
        this.f7259p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0595a.m2128d(this.f7258o), m7732P(new LayerDrawable(new Drawable[]{c0637h2, c0637h})), this.f7259p);
        this.f7265v = rippleDrawable;
        return rippleDrawable;
    }

    /* JADX INFO: renamed from: h */
    private C0637h m7734h(boolean z2) {
        LayerDrawable layerDrawable = this.f7265v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0637h) ((LayerDrawable) ((InsetDrawable) this.f7265v.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    /* JADX INFO: renamed from: p */
    private C0637h m7735p() {
        return m7734h(true);
    }

    /* JADX INFO: renamed from: A */
    public void m7736A(int i3) {
        m7728L(this.f7251h, i3);
    }

    /* JADX INFO: renamed from: B */
    public void m7737B(int i3) {
        m7728L(i3, this.f7252i);
    }

    /* JADX INFO: renamed from: C */
    void m7738C(ColorStateList colorStateList) {
        if (this.f7258o != colorStateList) {
            this.f7258o = colorStateList;
            if (this.f7244a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f7244a.getBackground()).setColor(AbstractC0595a.m2128d(colorStateList));
            }
        }
    }

    /* JADX INFO: renamed from: D */
    void m7739D(C0641l c0641l) {
        this.f7245b = c0641l;
        this.f7246c = null;
        m7730N();
    }

    /* JADX INFO: renamed from: E */
    void m7740E(boolean z2) {
        this.f7260q = z2;
        m7731O();
    }

    /* JADX INFO: renamed from: F */
    void m7741F(C0649t c0649t) {
        this.f7246c = c0649t;
        m7730N();
    }

    /* JADX INFO: renamed from: G */
    void m7742G(ColorStateList colorStateList) {
        if (this.f7257n != colorStateList) {
            this.f7257n = colorStateList;
            m7731O();
        }
    }

    /* JADX INFO: renamed from: H */
    void m7743H(int i3) {
        if (this.f7254k != i3) {
            this.f7254k = i3;
            m7731O();
        }
    }

    /* JADX INFO: renamed from: I */
    void m7744I(ColorStateList colorStateList) {
        if (this.f7256m != colorStateList) {
            this.f7256m = colorStateList;
            if (m7752g() != null) {
                m7752g().setTintList(this.f7256m);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    void m7745J(PorterDuff.Mode mode) {
        if (this.f7255l != mode) {
            this.f7255l = mode;
            if (m7752g() == null || this.f7255l == null) {
                return;
            }
            m7752g().setTintMode(this.f7255l);
        }
    }

    /* JADX INFO: renamed from: K */
    void m7746K(boolean z2) {
        this.f7264u = z2;
    }

    /* JADX INFO: renamed from: b */
    int m7747b() {
        return this.f7253j;
    }

    /* JADX INFO: renamed from: c */
    C0466l m7748c() {
        return this.f7247d;
    }

    /* JADX INFO: renamed from: d */
    public int m7749d() {
        return this.f7252i;
    }

    /* JADX INFO: renamed from: e */
    public int m7750e() {
        return this.f7251h;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0644o m7751f() {
        LayerDrawable layerDrawable = this.f7265v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f7265v.getNumberOfLayers() > 2 ? (InterfaceC0644o) this.f7265v.getDrawable(2) : (InterfaceC0644o) this.f7265v.getDrawable(1);
    }

    /* JADX INFO: renamed from: g */
    C0637h m7752g() {
        return m7734h(false);
    }

    /* JADX INFO: renamed from: i */
    ColorStateList m7753i() {
        return this.f7258o;
    }

    /* JADX INFO: renamed from: j */
    C0641l m7754j() {
        return this.f7245b;
    }

    /* JADX INFO: renamed from: k */
    C0649t m7755k() {
        return this.f7246c;
    }

    /* JADX INFO: renamed from: l */
    ColorStateList m7756l() {
        return this.f7257n;
    }

    /* JADX INFO: renamed from: m */
    int m7757m() {
        return this.f7254k;
    }

    /* JADX INFO: renamed from: n */
    ColorStateList m7758n() {
        return this.f7256m;
    }

    /* JADX INFO: renamed from: o */
    PorterDuff.Mode m7759o() {
        return this.f7255l;
    }

    /* JADX INFO: renamed from: q */
    boolean m7760q() {
        return this.f7261r;
    }

    /* JADX INFO: renamed from: r */
    boolean m7761r() {
        return this.f7263t;
    }

    /* JADX INFO: renamed from: s */
    boolean m7762s() {
        return this.f7264u;
    }

    /* JADX INFO: renamed from: t */
    void m7763t(TypedArray typedArray) {
        this.f7249f = typedArray.getDimensionPixelOffset(AbstractC0150k.f606B2, 0);
        this.f7250g = typedArray.getDimensionPixelOffset(AbstractC0150k.f615C2, 0);
        this.f7251h = typedArray.getDimensionPixelOffset(AbstractC0150k.f624D2, 0);
        this.f7252i = typedArray.getDimensionPixelOffset(AbstractC0150k.f633E2, 0);
        int i3 = AbstractC0150k.f669I2;
        if (typedArray.hasValue(i3)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i3, -1);
            this.f7253j = dimensionPixelSize;
            m7739D(this.f7245b.m2327x(dimensionPixelSize));
            this.f7262s = true;
        }
        this.f7254k = typedArray.getDimensionPixelSize(AbstractC0150k.f777U2, 0);
        this.f7255l = AbstractC1549t.m8503h(typedArray.getInt(AbstractC0150k.f660H2, -1), PorterDuff.Mode.SRC_IN);
        this.f7256m = AbstractC0557c.m2077a(this.f7244a.getContext(), typedArray, AbstractC0150k.f651G2);
        this.f7257n = AbstractC0557c.m2077a(this.f7244a.getContext(), typedArray, AbstractC0150k.f768T2);
        this.f7258o = AbstractC0557c.m2077a(this.f7244a.getContext(), typedArray, AbstractC0150k.f750R2);
        this.f7263t = typedArray.getBoolean(AbstractC0150k.f642F2, false);
        this.f7266w = typedArray.getDimensionPixelSize(AbstractC0150k.f678J2, 0);
        this.f7264u = typedArray.getBoolean(AbstractC0150k.f786V2, true);
        int paddingStart = this.f7244a.getPaddingStart();
        int paddingTop = this.f7244a.getPaddingTop();
        int paddingEnd = this.f7244a.getPaddingEnd();
        int paddingBottom = this.f7244a.getPaddingBottom();
        if (typedArray.hasValue(AbstractC0150k.f1071z2)) {
            m7765v();
        } else {
            m7729M();
        }
        this.f7244a.setPaddingRelative(paddingStart + this.f7249f, paddingTop + this.f7251h, paddingEnd + this.f7250g, paddingBottom + this.f7252i);
    }

    /* JADX INFO: renamed from: u */
    void m7764u(int i3) {
        if (m7752g() != null) {
            m7752g().setTint(i3);
        }
    }

    /* JADX INFO: renamed from: v */
    void m7765v() {
        this.f7261r = true;
        this.f7244a.setSupportBackgroundTintList(this.f7256m);
        this.f7244a.setSupportBackgroundTintMode(this.f7255l);
    }

    /* JADX INFO: renamed from: w */
    void m7766w(boolean z2) {
        this.f7263t = z2;
    }

    /* JADX INFO: renamed from: x */
    void m7767x(int i3) {
        if (this.f7262s && this.f7253j == i3) {
            return;
        }
        this.f7253j = i3;
        this.f7262s = true;
        m7739D(this.f7245b.m2327x(i3));
    }

    /* JADX INFO: renamed from: y */
    void m7768y(C0637h.d dVar) {
        this.f7248e = dVar;
        C0637h c0637hM7752g = m7752g();
        if (c0637hM7752g != null) {
            c0637hM7752g.m2276e0(dVar);
        }
    }

    /* JADX INFO: renamed from: z */
    void m7769z(C0466l c0466l) {
        this.f7247d = c0466l;
        if (this.f7246c != null) {
            m7730N();
        }
    }
}
