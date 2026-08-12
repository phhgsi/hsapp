package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0740E;
import androidx.appcompat.widget.C0824B;
import androidx.appcompat.widget.C0888e0;
import androidx.core.widget.AbstractC0988i;
import com.google.android.material.internal.AbstractC1545p;
import com.google.android.material.internal.AbstractC1549t;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0000a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;
import p016F0.AbstractC0148i;
import p016F0.AbstractC0150k;
import p067W0.AbstractC0557c;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: com.google.android.material.textfield.s */
/* JADX INFO: loaded from: classes.dex */
class C1629s extends LinearLayout {

    /* JADX INFO: renamed from: a */
    final TextInputLayout f8195a;

    /* JADX INFO: renamed from: b */
    private final FrameLayout f8196b;

    /* JADX INFO: renamed from: c */
    private final CheckableImageButton f8197c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f8198d;

    /* JADX INFO: renamed from: e */
    private PorterDuff.Mode f8199e;

    /* JADX INFO: renamed from: f */
    private View.OnLongClickListener f8200f;

    /* JADX INFO: renamed from: g */
    private final CheckableImageButton f8201g;

    /* JADX INFO: renamed from: h */
    private final d f8202h;

    /* JADX INFO: renamed from: i */
    private int f8203i;

    /* JADX INFO: renamed from: j */
    private final LinkedHashSet f8204j;

    /* JADX INFO: renamed from: k */
    private ColorStateList f8205k;

    /* JADX INFO: renamed from: l */
    private PorterDuff.Mode f8206l;

    /* JADX INFO: renamed from: m */
    private int f8207m;

    /* JADX INFO: renamed from: n */
    private ImageView.ScaleType f8208n;

    /* JADX INFO: renamed from: o */
    private View.OnLongClickListener f8209o;

    /* JADX INFO: renamed from: p */
    private CharSequence f8210p;

    /* JADX INFO: renamed from: q */
    private final TextView f8211q;

    /* JADX INFO: renamed from: r */
    private boolean f8212r;

    /* JADX INFO: renamed from: s */
    private EditText f8213s;

    /* JADX INFO: renamed from: t */
    private final AccessibilityManager f8214t;

    /* JADX INFO: renamed from: u */
    private AccessibilityManager.TouchExplorationStateChangeListener f8215u;

    /* JADX INFO: renamed from: v */
    private final TextWatcher f8216v;

    /* JADX INFO: renamed from: w */
    private final TextInputLayout.InterfaceC1610g f8217w;

    /* JADX INFO: renamed from: com.google.android.material.textfield.s$a */
    class a extends AbstractC1545p {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C1629s.this.m8950m().mo8848a(editable);
        }

        @Override // com.google.android.material.internal.AbstractC1545p, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            C1629s.this.m8950m().mo8973b(charSequence, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.s$b */
    class b implements TextInputLayout.InterfaceC1610g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1610g
        /* JADX INFO: renamed from: a */
        public void mo8837a(TextInputLayout textInputLayout) {
            if (C1629s.this.f8213s == textInputLayout.getEditText()) {
                return;
            }
            if (C1629s.this.f8213s != null) {
                C1629s.this.f8213s.removeTextChangedListener(C1629s.this.f8216v);
                if (C1629s.this.f8213s.getOnFocusChangeListener() == C1629s.this.m8950m().mo8851e()) {
                    C1629s.this.f8213s.setOnFocusChangeListener(null);
                }
            }
            C1629s.this.f8213s = textInputLayout.getEditText();
            if (C1629s.this.f8213s != null) {
                C1629s.this.f8213s.addTextChangedListener(C1629s.this.f8216v);
            }
            C1629s.this.m8950m().mo8854n(C1629s.this.f8213s);
            C1629s c1629s = C1629s.this;
            c1629s.m8904h0(c1629s.m8950m());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.s$c */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C1629s.this.m8903g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C1629s.this.m8896M();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.s$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        private final SparseArray f8221a = new SparseArray();

        /* JADX INFO: renamed from: b */
        private final C1629s f8222b;

        /* JADX INFO: renamed from: c */
        private final int f8223c;

        /* JADX INFO: renamed from: d */
        private final int f8224d;

        d(C1629s c1629s, C0888e0 c0888e0) {
            this.f8222b = c1629s;
            this.f8223c = c0888e0.m3779n(AbstractC0150k.f1004r7, 0);
            this.f8224d = c0888e0.m3779n(AbstractC0150k.f746Q7, 0);
        }

        /* JADX INFO: renamed from: b */
        private AbstractC1630t m8971b(int i3) {
            if (i3 == -1) {
                return new C1617g(this.f8222b);
            }
            if (i3 == 0) {
                return new C1634x(this.f8222b);
            }
            if (i3 == 1) {
                return new C1636z(this.f8222b, this.f8224d);
            }
            if (i3 == 2) {
                return new C1616f(this.f8222b);
            }
            if (i3 == 3) {
                return new C1627q(this.f8222b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i3);
        }

        /* JADX INFO: renamed from: c */
        AbstractC1630t m8972c(int i3) {
            AbstractC1630t abstractC1630t = (AbstractC1630t) this.f8221a.get(i3);
            if (abstractC1630t != null) {
                return abstractC1630t;
            }
            AbstractC1630t abstractC1630tM8971b = m8971b(i3);
            this.f8221a.append(i3, abstractC1630tM8971b);
            return abstractC1630tM8971b;
        }
    }

    C1629s(TextInputLayout textInputLayout, C0888e0 c0888e0) {
        super(textInputLayout.getContext());
        this.f8203i = 0;
        this.f8204j = new LinkedHashSet();
        this.f8216v = new a();
        b bVar = new b();
        this.f8217w = bVar;
        this.f8214t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f8195a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f8196b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM8905i = m8905i(this, layoutInflaterFrom, AbstractC0144e.f473R);
        this.f8197c = checkableImageButtonM8905i;
        CheckableImageButton checkableImageButtonM8905i2 = m8905i(frameLayout, layoutInflaterFrom, AbstractC0144e.f472Q);
        this.f8201g = checkableImageButtonM8905i2;
        this.f8202h = new d(this, c0888e0);
        C0824B c0824b = new C0824B(getContext());
        this.f8211q = c0824b;
        m8894C(c0888e0);
        m8893B(c0888e0);
        m8895D(c0888e0);
        frameLayout.addView(checkableImageButtonM8905i2);
        addView(c0824b);
        addView(frameLayout);
        addView(checkableImageButtonM8905i);
        textInputLayout.m8827j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    /* JADX INFO: renamed from: B */
    private void m8893B(C0888e0 c0888e0) {
        int i3 = AbstractC0150k.f755R7;
        if (!c0888e0.m3784s(i3)) {
            int i4 = AbstractC0150k.f1040v7;
            if (c0888e0.m3784s(i4)) {
                this.f8205k = AbstractC0557c.m2078b(getContext(), c0888e0, i4);
            }
            int i5 = AbstractC0150k.f1049w7;
            if (c0888e0.m3784s(i5)) {
                this.f8206l = AbstractC1549t.m8503h(c0888e0.m3776k(i5, -1), null);
            }
        }
        int i6 = AbstractC0150k.f1022t7;
        if (c0888e0.m3784s(i6)) {
            m8930U(c0888e0.m3776k(i6, 0));
            int i7 = AbstractC0150k.f995q7;
            if (c0888e0.m3784s(i7)) {
                m8926Q(c0888e0.m3781p(i7));
            }
            m8924O(c0888e0.m3766a(AbstractC0150k.f986p7, true));
        } else if (c0888e0.m3784s(i3)) {
            int i8 = AbstractC0150k.f764S7;
            if (c0888e0.m3784s(i8)) {
                this.f8205k = AbstractC0557c.m2078b(getContext(), c0888e0, i8);
            }
            int i9 = AbstractC0150k.f773T7;
            if (c0888e0.m3784s(i9)) {
                this.f8206l = AbstractC1549t.m8503h(c0888e0.m3776k(i9, -1), null);
            }
            m8930U(c0888e0.m3766a(i3, false) ? 1 : 0);
            m8926Q(c0888e0.m3781p(AbstractC0150k.f737P7));
        }
        m8929T(c0888e0.m3771f(AbstractC0150k.f1013s7, getResources().getDimensionPixelSize(AbstractC0142c.f426q0)));
        int i10 = AbstractC0150k.f1031u7;
        if (c0888e0.m3784s(i10)) {
            m8933X(AbstractC1631u.m8976b(c0888e0.m3776k(i10, -1)));
        }
    }

    /* JADX INFO: renamed from: C */
    private void m8894C(C0888e0 c0888e0) {
        int i3 = AbstractC0150k.f611B7;
        if (c0888e0.m3784s(i3)) {
            this.f8198d = AbstractC0557c.m2078b(getContext(), c0888e0, i3);
        }
        int i4 = AbstractC0150k.f620C7;
        if (c0888e0.m3784s(i4)) {
            this.f8199e = AbstractC1549t.m8503h(c0888e0.m3776k(i4, -1), null);
        }
        int i5 = AbstractC0150k.f602A7;
        if (c0888e0.m3784s(i5)) {
            m8938c0(c0888e0.m3772g(i5));
        }
        this.f8197c.setContentDescription(getResources().getText(AbstractC0148i.f546f));
        this.f8197c.setImportantForAccessibility(2);
        this.f8197c.setClickable(false);
        this.f8197c.setPressable(false);
        this.f8197c.setCheckable(false);
        this.f8197c.setFocusable(false);
    }

    /* JADX INFO: renamed from: D */
    private void m8895D(C0888e0 c0888e0) {
        this.f8211q.setVisibility(8);
        this.f8211q.setId(AbstractC0144e.f479X);
        this.f8211q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f8211q.setAccessibilityLiveRegion(1);
        m8959q0(c0888e0.m3779n(AbstractC0150k.f917i8, 0));
        int i3 = AbstractC0150k.f927j8;
        if (c0888e0.m3784s(i3)) {
            m8961r0(c0888e0.m3768c(i3));
        }
        m8957p0(c0888e0.m3781p(AbstractC0150k.f907h8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m8896M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f8215u;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f8214t) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m8903g() {
        if (this.f8215u == null || this.f8214t == null || !isAttachedToWindow()) {
            return;
        }
        this.f8214t.addTouchExplorationStateChangeListener(this.f8215u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m8904h0(AbstractC1630t abstractC1630t) {
        if (this.f8213s == null) {
            return;
        }
        if (abstractC1630t.mo8851e() != null) {
            this.f8213s.setOnFocusChangeListener(abstractC1630t.mo8851e());
        }
        if (abstractC1630t.mo8853g() != null) {
            this.f8201g.setOnFocusChangeListener(abstractC1630t.mo8853g());
        }
    }

    /* JADX INFO: renamed from: i */
    private CheckableImageButton m8905i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i3) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(AbstractC0146g.f517h, viewGroup, false);
        checkableImageButton.setId(i3);
        AbstractC1631u.m8979e(checkableImageButton);
        if (AbstractC0557c.m2087k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: j */
    private void m8906j(int i3) {
        Iterator it = this.f8204j.iterator();
        if (it.hasNext()) {
            AbstractC0740E.m2693a(it.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m8907s0(AbstractC1630t abstractC1630t) {
        abstractC1630t.mo8856s();
        this.f8215u = abstractC1630t.mo8883h();
        m8903g();
    }

    /* JADX INFO: renamed from: t */
    private int m8908t(AbstractC1630t abstractC1630t) {
        int i3 = this.f8202h.f8223c;
        return i3 == 0 ? abstractC1630t.mo8850d() : i3;
    }

    /* JADX INFO: renamed from: t0 */
    private void m8909t0(AbstractC1630t abstractC1630t) {
        m8896M();
        this.f8215u = null;
        abstractC1630t.mo8857u();
    }

    /* JADX INFO: renamed from: u0 */
    private void m8910u0(boolean z2) {
        if (!z2 || m8952n() == null) {
            AbstractC1631u.m8975a(this.f8195a, this.f8201g, this.f8205k, this.f8206l);
            return;
        }
        Drawable drawableMutate = AbstractC0000a.m17r(m8952n()).mutate();
        drawableMutate.setTint(this.f8195a.getErrorCurrentTextColors());
        this.f8201g.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: v0 */
    private void m8911v0() {
        this.f8196b.setVisibility((this.f8201g.getVisibility() != 0 || m8917G()) ? 8 : 0);
        setVisibility((m8916F() || m8917G() || ((this.f8210p == null || this.f8212r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: w0 */
    private void m8912w0() {
        this.f8197c.setVisibility(m8962s() != null && this.f8195a.m8820O() && this.f8195a.m8826d0() ? 0 : 8);
        m8911v0();
        m8967x0();
        if (m8914A()) {
            return;
        }
        this.f8195a.m8830p0();
    }

    /* JADX INFO: renamed from: y0 */
    private void m8913y0() {
        int visibility = this.f8211q.getVisibility();
        int i3 = (this.f8210p == null || this.f8212r) ? 8 : 0;
        if (visibility != i3) {
            m8950m().mo8855q(i3 == 0);
        }
        m8911v0();
        this.f8211q.setVisibility(i3);
        this.f8195a.m8830p0();
    }

    /* JADX INFO: renamed from: A */
    boolean m8914A() {
        return this.f8203i != 0;
    }

    /* JADX INFO: renamed from: E */
    boolean m8915E() {
        return m8914A() && this.f8201g.isChecked();
    }

    /* JADX INFO: renamed from: F */
    boolean m8916F() {
        return this.f8196b.getVisibility() == 0 && this.f8201g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: G */
    boolean m8917G() {
        return this.f8197c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: H */
    void m8918H(boolean z2) {
        this.f8212r = z2;
        m8913y0();
    }

    /* JADX INFO: renamed from: I */
    void m8919I() {
        m8912w0();
        m8921K();
        m8920J();
        if (m8950m().mo8891t()) {
            m8910u0(this.f8195a.m8826d0());
        }
    }

    /* JADX INFO: renamed from: J */
    void m8920J() {
        AbstractC1631u.m8978d(this.f8195a, this.f8201g, this.f8205k);
    }

    /* JADX INFO: renamed from: K */
    void m8921K() {
        AbstractC1631u.m8978d(this.f8195a, this.f8197c, this.f8198d);
    }

    /* JADX INFO: renamed from: L */
    void m8922L(boolean z2) {
        boolean z3;
        boolean zIsActivated;
        boolean zIsChecked;
        AbstractC1630t abstractC1630tM8950m = m8950m();
        boolean z4 = true;
        if (!abstractC1630tM8950m.mo8887l() || (zIsChecked = this.f8201g.isChecked()) == abstractC1630tM8950m.mo8888m()) {
            z3 = false;
        } else {
            this.f8201g.setChecked(!zIsChecked);
            z3 = true;
        }
        if (!abstractC1630tM8950m.mo8885j() || (zIsActivated = this.f8201g.isActivated()) == abstractC1630tM8950m.mo8886k()) {
            z4 = z3;
        } else {
            m8923N(!zIsActivated);
        }
        if (z2 || z4) {
            m8920J();
        }
    }

    /* JADX INFO: renamed from: N */
    void m8923N(boolean z2) {
        this.f8201g.setActivated(z2);
    }

    /* JADX INFO: renamed from: O */
    void m8924O(boolean z2) {
        this.f8201g.setCheckable(z2);
    }

    /* JADX INFO: renamed from: P */
    void m8925P(int i3) {
        m8926Q(i3 != 0 ? getResources().getText(i3) : null);
    }

    /* JADX INFO: renamed from: Q */
    void m8926Q(CharSequence charSequence) {
        if (m8948l() != charSequence) {
            this.f8201g.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: R */
    void m8927R(int i3) {
        m8928S(i3 != 0 ? AbstractC1832a.m9609b(getContext(), i3) : null);
    }

    /* JADX INFO: renamed from: S */
    void m8928S(Drawable drawable) {
        this.f8201g.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC1631u.m8975a(this.f8195a, this.f8201g, this.f8205k, this.f8206l);
            m8920J();
        }
    }

    /* JADX INFO: renamed from: T */
    void m8929T(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i3 != this.f8207m) {
            this.f8207m = i3;
            AbstractC1631u.m8981g(this.f8201g, i3);
            AbstractC1631u.m8981g(this.f8197c, i3);
        }
    }

    /* JADX INFO: renamed from: U */
    void m8930U(int i3) {
        if (this.f8203i == i3) {
            return;
        }
        m8909t0(m8950m());
        int i4 = this.f8203i;
        this.f8203i = i3;
        m8906j(i4);
        m8936a0(i3 != 0);
        AbstractC1630t abstractC1630tM8950m = m8950m();
        m8927R(m8908t(abstractC1630tM8950m));
        m8925P(abstractC1630tM8950m.mo8849c());
        m8924O(abstractC1630tM8950m.mo8887l());
        if (!abstractC1630tM8950m.mo8884i(this.f8195a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f8195a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i3);
        }
        m8907s0(abstractC1630tM8950m);
        m8931V(abstractC1630tM8950m.mo8852f());
        EditText editText = this.f8213s;
        if (editText != null) {
            abstractC1630tM8950m.mo8854n(editText);
            m8904h0(abstractC1630tM8950m);
        }
        AbstractC1631u.m8975a(this.f8195a, this.f8201g, this.f8205k, this.f8206l);
        m8922L(true);
    }

    /* JADX INFO: renamed from: V */
    void m8931V(View.OnClickListener onClickListener) {
        AbstractC1631u.m8982h(this.f8201g, onClickListener, this.f8209o);
    }

    /* JADX INFO: renamed from: W */
    void m8932W(View.OnLongClickListener onLongClickListener) {
        this.f8209o = onLongClickListener;
        AbstractC1631u.m8983i(this.f8201g, onLongClickListener);
    }

    /* JADX INFO: renamed from: X */
    void m8933X(ImageView.ScaleType scaleType) {
        this.f8208n = scaleType;
        AbstractC1631u.m8984j(this.f8201g, scaleType);
        AbstractC1631u.m8984j(this.f8197c, scaleType);
    }

    /* JADX INFO: renamed from: Y */
    void m8934Y(ColorStateList colorStateList) {
        if (this.f8205k != colorStateList) {
            this.f8205k = colorStateList;
            AbstractC1631u.m8975a(this.f8195a, this.f8201g, colorStateList, this.f8206l);
        }
    }

    /* JADX INFO: renamed from: Z */
    void m8935Z(PorterDuff.Mode mode) {
        if (this.f8206l != mode) {
            this.f8206l = mode;
            AbstractC1631u.m8975a(this.f8195a, this.f8201g, this.f8205k, mode);
        }
    }

    /* JADX INFO: renamed from: a0 */
    void m8936a0(boolean z2) {
        if (m8916F() != z2) {
            this.f8201g.setVisibility(z2 ? 0 : 8);
            m8911v0();
            m8967x0();
            this.f8195a.m8830p0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    void m8937b0(int i3) {
        m8938c0(i3 != 0 ? AbstractC1832a.m9609b(getContext(), i3) : null);
        m8921K();
    }

    /* JADX INFO: renamed from: c0 */
    void m8938c0(Drawable drawable) {
        this.f8197c.setImageDrawable(drawable);
        m8912w0();
        AbstractC1631u.m8975a(this.f8195a, this.f8197c, this.f8198d, this.f8199e);
    }

    /* JADX INFO: renamed from: d0 */
    void m8939d0(View.OnClickListener onClickListener) {
        AbstractC1631u.m8982h(this.f8197c, onClickListener, this.f8200f);
    }

    /* JADX INFO: renamed from: e0 */
    void m8940e0(View.OnLongClickListener onLongClickListener) {
        this.f8200f = onLongClickListener;
        AbstractC1631u.m8983i(this.f8197c, onLongClickListener);
    }

    /* JADX INFO: renamed from: f0 */
    void m8941f0(ColorStateList colorStateList) {
        if (this.f8198d != colorStateList) {
            this.f8198d = colorStateList;
            AbstractC1631u.m8975a(this.f8195a, this.f8197c, colorStateList, this.f8199e);
        }
    }

    /* JADX INFO: renamed from: g0 */
    void m8942g0(PorterDuff.Mode mode) {
        if (this.f8199e != mode) {
            this.f8199e = mode;
            AbstractC1631u.m8975a(this.f8195a, this.f8197c, this.f8198d, mode);
        }
    }

    /* JADX INFO: renamed from: h */
    void m8943h() {
        this.f8201g.performClick();
        this.f8201g.jumpDrawablesToCurrentState();
    }

    /* JADX INFO: renamed from: i0 */
    void m8944i0(int i3) {
        m8945j0(i3 != 0 ? getResources().getText(i3) : null);
    }

    /* JADX INFO: renamed from: j0 */
    void m8945j0(CharSequence charSequence) {
        this.f8201g.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: k */
    CheckableImageButton m8946k() {
        if (m8917G()) {
            return this.f8197c;
        }
        if (m8914A() && m8916F()) {
            return this.f8201g;
        }
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    void m8947k0(int i3) {
        m8949l0(i3 != 0 ? AbstractC1832a.m9609b(getContext(), i3) : null);
    }

    /* JADX INFO: renamed from: l */
    CharSequence m8948l() {
        return this.f8201g.getContentDescription();
    }

    /* JADX INFO: renamed from: l0 */
    void m8949l0(Drawable drawable) {
        this.f8201g.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: m */
    AbstractC1630t m8950m() {
        return this.f8202h.m8972c(this.f8203i);
    }

    /* JADX INFO: renamed from: m0 */
    void m8951m0(boolean z2) {
        if (z2 && this.f8203i != 1) {
            m8930U(1);
        } else {
            if (z2) {
                return;
            }
            m8930U(0);
        }
    }

    /* JADX INFO: renamed from: n */
    Drawable m8952n() {
        return this.f8201g.getDrawable();
    }

    /* JADX INFO: renamed from: n0 */
    void m8953n0(ColorStateList colorStateList) {
        this.f8205k = colorStateList;
        AbstractC1631u.m8975a(this.f8195a, this.f8201g, colorStateList, this.f8206l);
    }

    /* JADX INFO: renamed from: o */
    int m8954o() {
        return this.f8207m;
    }

    /* JADX INFO: renamed from: o0 */
    void m8955o0(PorterDuff.Mode mode) {
        this.f8206l = mode;
        AbstractC1631u.m8975a(this.f8195a, this.f8201g, this.f8205k, mode);
    }

    /* JADX INFO: renamed from: p */
    int m8956p() {
        return this.f8203i;
    }

    /* JADX INFO: renamed from: p0 */
    void m8957p0(CharSequence charSequence) {
        this.f8210p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8211q.setText(charSequence);
        m8913y0();
    }

    /* JADX INFO: renamed from: q */
    ImageView.ScaleType m8958q() {
        return this.f8208n;
    }

    /* JADX INFO: renamed from: q0 */
    void m8959q0(int i3) {
        AbstractC0988i.m4394m(this.f8211q, i3);
    }

    /* JADX INFO: renamed from: r */
    CheckableImageButton m8960r() {
        return this.f8201g;
    }

    /* JADX INFO: renamed from: r0 */
    void m8961r0(ColorStateList colorStateList) {
        this.f8211q.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: s */
    Drawable m8962s() {
        return this.f8197c.getDrawable();
    }

    /* JADX INFO: renamed from: u */
    CharSequence m8963u() {
        return this.f8201g.getContentDescription();
    }

    /* JADX INFO: renamed from: v */
    Drawable m8964v() {
        return this.f8201g.getDrawable();
    }

    /* JADX INFO: renamed from: w */
    CharSequence m8965w() {
        return this.f8210p;
    }

    /* JADX INFO: renamed from: x */
    ColorStateList m8966x() {
        return this.f8211q.getTextColors();
    }

    /* JADX INFO: renamed from: x0 */
    void m8967x0() {
        if (this.f8195a.f8102e == null) {
            return;
        }
        this.f8211q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(AbstractC0142c.f386T), this.f8195a.f8102e.getPaddingTop(), (m8916F() || m8917G()) ? 0 : this.f8195a.f8102e.getPaddingEnd(), this.f8195a.f8102e.getPaddingBottom());
    }

    /* JADX INFO: renamed from: y */
    int m8968y() {
        return getPaddingEnd() + this.f8211q.getPaddingEnd() + ((m8916F() || m8917G()) ? this.f8201g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f8201g.getLayoutParams()).getMarginStart() : 0);
    }

    /* JADX INFO: renamed from: z */
    TextView m8969z() {
        return this.f8211q;
    }
}
