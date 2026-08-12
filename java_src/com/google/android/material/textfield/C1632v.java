package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0824B;
import androidx.core.widget.AbstractC0988i;
import java.util.ArrayList;
import java.util.List;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0144e;
import p019G0.AbstractC0176a;
import p019G0.AbstractC0177b;
import p058T0.AbstractC0528h;
import p067W0.AbstractC0557c;

/* JADX INFO: renamed from: com.google.android.material.textfield.v */
/* JADX INFO: loaded from: classes.dex */
final class C1632v {

    /* JADX INFO: renamed from: A */
    private ColorStateList f8229A;

    /* JADX INFO: renamed from: B */
    private Typeface f8230B;

    /* JADX INFO: renamed from: a */
    private final int f8231a;

    /* JADX INFO: renamed from: b */
    private final int f8232b;

    /* JADX INFO: renamed from: c */
    private final int f8233c;

    /* JADX INFO: renamed from: d */
    private final TimeInterpolator f8234d;

    /* JADX INFO: renamed from: e */
    private final TimeInterpolator f8235e;

    /* JADX INFO: renamed from: f */
    private final TimeInterpolator f8236f;

    /* JADX INFO: renamed from: g */
    private final Context f8237g;

    /* JADX INFO: renamed from: h */
    private final TextInputLayout f8238h;

    /* JADX INFO: renamed from: i */
    private LinearLayout f8239i;

    /* JADX INFO: renamed from: j */
    private int f8240j;

    /* JADX INFO: renamed from: k */
    private FrameLayout f8241k;

    /* JADX INFO: renamed from: l */
    private Animator f8242l;

    /* JADX INFO: renamed from: m */
    private final float f8243m;

    /* JADX INFO: renamed from: n */
    private int f8244n;

    /* JADX INFO: renamed from: o */
    private int f8245o;

    /* JADX INFO: renamed from: p */
    private CharSequence f8246p;

    /* JADX INFO: renamed from: q */
    private boolean f8247q;

    /* JADX INFO: renamed from: r */
    private TextView f8248r;

    /* JADX INFO: renamed from: s */
    private CharSequence f8249s;

    /* JADX INFO: renamed from: t */
    private int f8250t;

    /* JADX INFO: renamed from: u */
    private int f8251u;

    /* JADX INFO: renamed from: v */
    private ColorStateList f8252v;

    /* JADX INFO: renamed from: w */
    private CharSequence f8253w;

    /* JADX INFO: renamed from: x */
    private boolean f8254x;

    /* JADX INFO: renamed from: y */
    private TextView f8255y;

    /* JADX INFO: renamed from: z */
    private int f8256z;

    /* JADX INFO: renamed from: com.google.android.material.textfield.v$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f8257a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f8258b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f8259c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ TextView f8260d;

        a(int i3, TextView textView, int i4, TextView textView2) {
            this.f8257a = i3;
            this.f8258b = textView;
            this.f8259c = i4;
            this.f8260d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1632v.this.f8244n = this.f8257a;
            C1632v.this.f8242l = null;
            TextView textView = this.f8258b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f8259c == 1 && C1632v.this.f8248r != null) {
                    C1632v.this.f8248r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f8260d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f8260d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f8260d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f8260d.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.v$b */
    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C1632v.this.f8238h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C1632v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f8237g = context;
        this.f8238h = textInputLayout;
        this.f8243m = context.getResources().getDimensionPixelSize(AbstractC0142c.f419n);
        int i3 = AbstractC0140a.f311D;
        this.f8231a = AbstractC0528h.m1910f(context, i3, 217);
        this.f8232b = AbstractC0528h.m1910f(context, AbstractC0140a.f308A, 167);
        this.f8233c = AbstractC0528h.m1910f(context, i3, 167);
        int i4 = AbstractC0140a.f313F;
        this.f8234d = AbstractC0528h.m1911g(context, i4, AbstractC0176a.f1128d);
        TimeInterpolator timeInterpolator = AbstractC0176a.f1125a;
        this.f8235e = AbstractC0528h.m1911g(context, i4, timeInterpolator);
        this.f8236f = AbstractC0528h.m1911g(context, AbstractC0140a.f315H, timeInterpolator);
    }

    /* JADX INFO: renamed from: D */
    private void m8985D(int i3, int i4) {
        TextView textViewM8998m;
        TextView textViewM8998m2;
        if (i3 == i4) {
            return;
        }
        if (i4 != 0 && (textViewM8998m2 = m8998m(i4)) != null) {
            textViewM8998m2.setVisibility(0);
            textViewM8998m2.setAlpha(1.0f);
        }
        if (i3 != 0 && (textViewM8998m = m8998m(i3)) != null) {
            textViewM8998m.setVisibility(4);
            if (i3 == 1) {
                textViewM8998m.setText((CharSequence) null);
            }
        }
        this.f8244n = i4;
    }

    /* JADX INFO: renamed from: M */
    private void m8986M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* JADX INFO: renamed from: O */
    private void m8987O(ViewGroup viewGroup, int i3) {
        if (i3 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: P */
    private boolean m8988P(TextView textView, CharSequence charSequence) {
        if (this.f8238h.isLaidOut() && this.f8238h.isEnabled()) {
            return (this.f8245o == this.f8244n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    private void m8989S(int i3, int i4, boolean z2) {
        C1632v c1632v;
        if (i3 == i4) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f8242l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c1632v = this;
            c1632v.m8995i(arrayList, this.f8254x, this.f8255y, 2, i3, i4);
            c1632v.m8995i(arrayList, c1632v.f8247q, c1632v.f8248r, 1, i3, i4);
            AbstractC0177b.m485a(animatorSet, arrayList);
            animatorSet.addListener(c1632v.new a(i4, m8998m(i3), i3, m8998m(i4)));
            animatorSet.start();
        } else {
            c1632v = this;
            m8985D(i3, i4);
        }
        c1632v.f8238h.m8831q0();
        c1632v.f8238h.m8833w0(z2);
        c1632v.f8238h.m8818C0();
    }

    /* JADX INFO: renamed from: g */
    private boolean m8994g() {
        return (this.f8239i == null || this.f8238h.getEditText() == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    private void m8995i(List list, boolean z2, TextView textView, int i3, int i4, int i5) {
        if (textView == null || !z2) {
            return;
        }
        if (i3 == i5 || i3 == i4) {
            ObjectAnimator objectAnimatorM8996j = m8996j(textView, i5 == i3);
            if (i3 == i5 && i4 != 0) {
                objectAnimatorM8996j.setStartDelay(this.f8233c);
            }
            list.add(objectAnimatorM8996j);
            if (i5 != i3 || i4 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorM8997k = m8997k(textView);
            objectAnimatorM8997k.setStartDelay(this.f8233c);
            list.add(objectAnimatorM8997k);
        }
    }

    /* JADX INFO: renamed from: j */
    private ObjectAnimator m8996j(TextView textView, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z2 ? this.f8232b : this.f8233c);
        objectAnimatorOfFloat.setInterpolator(z2 ? this.f8235e : this.f8236f);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: k */
    private ObjectAnimator m8997k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f8243m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f8231a);
        objectAnimatorOfFloat.setInterpolator(this.f8234d);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: m */
    private TextView m8998m(int i3) {
        if (i3 == 1) {
            return this.f8248r;
        }
        if (i3 != 2) {
            return null;
        }
        return this.f8255y;
    }

    /* JADX INFO: renamed from: v */
    private int m8999v(boolean z2, int i3, int i4) {
        return z2 ? this.f8237g.getResources().getDimensionPixelSize(i3) : i4;
    }

    /* JADX INFO: renamed from: y */
    private boolean m9000y(int i3) {
        return (i3 != 1 || this.f8248r == null || TextUtils.isEmpty(this.f8246p)) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    boolean m9001A() {
        return this.f8247q;
    }

    /* JADX INFO: renamed from: B */
    boolean m9002B() {
        return this.f8254x;
    }

    /* JADX INFO: renamed from: C */
    void m9003C(TextView textView, int i3) {
        FrameLayout frameLayout;
        if (this.f8239i == null) {
            return;
        }
        if (!m9029z(i3) || (frameLayout = this.f8241k) == null) {
            this.f8239i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i4 = this.f8240j - 1;
        this.f8240j = i4;
        m8987O(this.f8239i, i4);
    }

    /* JADX INFO: renamed from: E */
    void m9004E(int i3) {
        this.f8250t = i3;
        TextView textView = this.f8248r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i3);
        }
    }

    /* JADX INFO: renamed from: F */
    void m9005F(CharSequence charSequence) {
        this.f8249s = charSequence;
        TextView textView = this.f8248r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: G */
    void m9006G(boolean z2) {
        if (this.f8247q == z2) {
            return;
        }
        m9017h();
        if (z2) {
            C0824B c0824b = new C0824B(this.f8237g);
            this.f8248r = c0824b;
            c0824b.setId(AbstractC0144e.f475T);
            this.f8248r.setTextAlignment(5);
            Typeface typeface = this.f8230B;
            if (typeface != null) {
                this.f8248r.setTypeface(typeface);
            }
            m9007H(this.f8251u);
            m9008I(this.f8252v);
            m9005F(this.f8249s);
            m9004E(this.f8250t);
            this.f8248r.setVisibility(4);
            m9015e(this.f8248r, 0);
        } else {
            m9027w();
            m9003C(this.f8248r, 0);
            this.f8248r = null;
            this.f8238h.m8831q0();
            this.f8238h.m8818C0();
        }
        this.f8247q = z2;
    }

    /* JADX INFO: renamed from: H */
    void m9007H(int i3) {
        this.f8251u = i3;
        TextView textView = this.f8248r;
        if (textView != null) {
            this.f8238h.m8825c0(textView, i3);
        }
    }

    /* JADX INFO: renamed from: I */
    void m9008I(ColorStateList colorStateList) {
        this.f8252v = colorStateList;
        TextView textView = this.f8248r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: J */
    void m9009J(int i3) {
        this.f8256z = i3;
        TextView textView = this.f8255y;
        if (textView != null) {
            AbstractC0988i.m4394m(textView, i3);
        }
    }

    /* JADX INFO: renamed from: K */
    void m9010K(boolean z2) {
        if (this.f8254x == z2) {
            return;
        }
        m9017h();
        if (z2) {
            C0824B c0824b = new C0824B(this.f8237g);
            this.f8255y = c0824b;
            c0824b.setId(AbstractC0144e.f476U);
            this.f8255y.setTextAlignment(5);
            Typeface typeface = this.f8230B;
            if (typeface != null) {
                this.f8255y.setTypeface(typeface);
            }
            this.f8255y.setVisibility(4);
            this.f8255y.setAccessibilityLiveRegion(1);
            m9009J(this.f8256z);
            m9011L(this.f8229A);
            m9015e(this.f8255y, 1);
            this.f8255y.setAccessibilityDelegate(new b());
        } else {
            m9028x();
            m9003C(this.f8255y, 1);
            this.f8255y = null;
            this.f8238h.m8831q0();
            this.f8238h.m8818C0();
        }
        this.f8254x = z2;
    }

    /* JADX INFO: renamed from: L */
    void m9011L(ColorStateList colorStateList) {
        this.f8229A = colorStateList;
        TextView textView = this.f8255y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: N */
    void m9012N(Typeface typeface) {
        if (typeface != this.f8230B) {
            this.f8230B = typeface;
            m8986M(this.f8248r, typeface);
            m8986M(this.f8255y, typeface);
        }
    }

    /* JADX INFO: renamed from: Q */
    void m9013Q(CharSequence charSequence) {
        m9017h();
        this.f8246p = charSequence;
        this.f8248r.setText(charSequence);
        int i3 = this.f8244n;
        if (i3 != 1) {
            this.f8245o = 1;
        }
        m8989S(i3, this.f8245o, m8988P(this.f8248r, charSequence));
    }

    /* JADX INFO: renamed from: R */
    void m9014R(CharSequence charSequence) {
        m9017h();
        this.f8253w = charSequence;
        this.f8255y.setText(charSequence);
        int i3 = this.f8244n;
        if (i3 != 2) {
            this.f8245o = 2;
        }
        m8989S(i3, this.f8245o, m8988P(this.f8255y, charSequence));
    }

    /* JADX INFO: renamed from: e */
    void m9015e(TextView textView, int i3) {
        if (this.f8239i == null && this.f8241k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f8237g);
            this.f8239i = linearLayout;
            linearLayout.setOrientation(0);
            this.f8238h.addView(this.f8239i, -1, -2);
            this.f8241k = new FrameLayout(this.f8237g);
            this.f8239i.addView(this.f8241k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f8238h.getEditText() != null) {
                m9016f();
            }
        }
        if (m9029z(i3)) {
            this.f8241k.setVisibility(0);
            this.f8241k.addView(textView);
        } else {
            this.f8239i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f8239i.setVisibility(0);
        this.f8240j++;
    }

    /* JADX INFO: renamed from: f */
    void m9016f() {
        if (m8994g()) {
            EditText editText = this.f8238h.getEditText();
            boolean zM2087k = AbstractC0557c.m2087k(this.f8237g);
            LinearLayout linearLayout = this.f8239i;
            int i3 = AbstractC0142c.f384R;
            linearLayout.setPaddingRelative(m8999v(zM2087k, i3, editText.getPaddingStart()), m8999v(zM2087k, AbstractC0142c.f385S, this.f8237g.getResources().getDimensionPixelSize(AbstractC0142c.f383Q)), m8999v(zM2087k, i3, editText.getPaddingEnd()), 0);
        }
    }

    /* JADX INFO: renamed from: h */
    void m9017h() {
        Animator animator = this.f8242l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: l */
    boolean m9018l() {
        return m9000y(this.f8245o);
    }

    /* JADX INFO: renamed from: n */
    int m9019n() {
        return this.f8250t;
    }

    /* JADX INFO: renamed from: o */
    CharSequence m9020o() {
        return this.f8249s;
    }

    /* JADX INFO: renamed from: p */
    CharSequence m9021p() {
        return this.f8246p;
    }

    /* JADX INFO: renamed from: q */
    int m9022q() {
        TextView textView = this.f8248r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    ColorStateList m9023r() {
        TextView textView = this.f8248r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    CharSequence m9024s() {
        return this.f8253w;
    }

    /* JADX INFO: renamed from: t */
    View m9025t() {
        return this.f8255y;
    }

    /* JADX INFO: renamed from: u */
    int m9026u() {
        TextView textView = this.f8255y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    void m9027w() {
        this.f8246p = null;
        m9017h();
        if (this.f8244n == 1) {
            if (!this.f8254x || TextUtils.isEmpty(this.f8253w)) {
                this.f8245o = 0;
            } else {
                this.f8245o = 2;
            }
        }
        m8989S(this.f8244n, this.f8245o, m8988P(this.f8248r, ""));
    }

    /* JADX INFO: renamed from: x */
    void m9028x() {
        m9017h();
        int i3 = this.f8244n;
        if (i3 == 2) {
            this.f8245o = 0;
        }
        m8989S(i3, this.f8245o, m8988P(this.f8255y, ""));
    }

    /* JADX INFO: renamed from: z */
    boolean m9029z(int i3) {
        return i3 == 0 || i3 == 1;
    }
}
