package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC0836M;
import androidx.appcompat.widget.C0824B;
import androidx.appcompat.widget.C0888e0;
import androidx.appcompat.widget.C0897j;
import androidx.core.content.AbstractC0966b;
import androidx.core.widget.AbstractC0988i;
import androidx.customview.view.AbsSavedState;
import androidx.transition.AbstractC1275t;
import androidx.transition.C1258c;
import com.google.android.material.internal.AbstractC1532c;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.AbstractC1549t;
import com.google.android.material.internal.C1530a;
import com.google.android.material.internal.C1541l;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.InterfaceC1542m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0000a;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0141b;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0148i;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p019G0.AbstractC0176a;
import p021H.C0183a;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p030K.C0356y;
import p043O0.AbstractC0450a;
import p058T0.AbstractC0528h;
import p067W0.AbstractC0557c;
import p076Z0.C0637h;
import p076Z0.C0641l;
import p089c1.AbstractC1313a;
import p091d.AbstractC1760a;
import p091d.AbstractC1768i;
import p095e.AbstractC1832a;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: D0 */
    private static final int f8066D0 = AbstractC0149j.f578k;

    /* JADX INFO: renamed from: E0 */
    private static final int[][] f8067E0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A */
    private ColorStateList f8068A;

    /* JADX INFO: renamed from: A0 */
    private boolean f8069A0;

    /* JADX INFO: renamed from: B */
    private ColorStateList f8070B;

    /* JADX INFO: renamed from: B0 */
    private boolean f8071B0;

    /* JADX INFO: renamed from: C */
    private ColorStateList f8072C;

    /* JADX INFO: renamed from: C0 */
    private boolean f8073C0;

    /* JADX INFO: renamed from: D */
    private boolean f8074D;

    /* JADX INFO: renamed from: E */
    private CharSequence f8075E;

    /* JADX INFO: renamed from: F */
    private boolean f8076F;

    /* JADX INFO: renamed from: G */
    private C0637h f8077G;

    /* JADX INFO: renamed from: H */
    private C0637h f8078H;

    /* JADX INFO: renamed from: I */
    private StateListDrawable f8079I;

    /* JADX INFO: renamed from: J */
    private boolean f8080J;

    /* JADX INFO: renamed from: K */
    private C0637h f8081K;

    /* JADX INFO: renamed from: L */
    private C0637h f8082L;

    /* JADX INFO: renamed from: M */
    private C0641l f8083M;

    /* JADX INFO: renamed from: N */
    private boolean f8084N;

    /* JADX INFO: renamed from: O */
    private final int f8085O;

    /* JADX INFO: renamed from: P */
    private int f8086P;

    /* JADX INFO: renamed from: Q */
    private int f8087Q;

    /* JADX INFO: renamed from: R */
    private int f8088R;

    /* JADX INFO: renamed from: S */
    private int f8089S;

    /* JADX INFO: renamed from: T */
    private int f8090T;

    /* JADX INFO: renamed from: U */
    private int f8091U;

    /* JADX INFO: renamed from: V */
    private int f8092V;

    /* JADX INFO: renamed from: W */
    private final Rect f8093W;

    /* JADX INFO: renamed from: a */
    private final FrameLayout f8094a;

    /* JADX INFO: renamed from: a0 */
    private final Rect f8095a0;

    /* JADX INFO: renamed from: b */
    private final C1592A f8096b;

    /* JADX INFO: renamed from: b0 */
    private final RectF f8097b0;

    /* JADX INFO: renamed from: c */
    private final C1629s f8098c;

    /* JADX INFO: renamed from: c0 */
    private Typeface f8099c0;

    /* JADX INFO: renamed from: d */
    private final int f8100d;

    /* JADX INFO: renamed from: d0 */
    private Drawable f8101d0;

    /* JADX INFO: renamed from: e */
    EditText f8102e;

    /* JADX INFO: renamed from: e0 */
    private int f8103e0;

    /* JADX INFO: renamed from: f */
    private CharSequence f8104f;

    /* JADX INFO: renamed from: f0 */
    private final LinkedHashSet f8105f0;

    /* JADX INFO: renamed from: g */
    private int f8106g;

    /* JADX INFO: renamed from: g0 */
    private Drawable f8107g0;

    /* JADX INFO: renamed from: h */
    private int f8108h;

    /* JADX INFO: renamed from: h0 */
    private int f8109h0;

    /* JADX INFO: renamed from: i */
    private int f8110i;

    /* JADX INFO: renamed from: i0 */
    private Drawable f8111i0;

    /* JADX INFO: renamed from: j */
    private int f8112j;

    /* JADX INFO: renamed from: j0 */
    private ColorStateList f8113j0;

    /* JADX INFO: renamed from: k */
    private final C1632v f8114k;

    /* JADX INFO: renamed from: k0 */
    private ColorStateList f8115k0;

    /* JADX INFO: renamed from: l */
    boolean f8116l;

    /* JADX INFO: renamed from: l0 */
    private int f8117l0;

    /* JADX INFO: renamed from: m */
    private int f8118m;

    /* JADX INFO: renamed from: m0 */
    private int f8119m0;

    /* JADX INFO: renamed from: n */
    private boolean f8120n;

    /* JADX INFO: renamed from: n0 */
    private int f8121n0;

    /* JADX INFO: renamed from: o */
    private InterfaceC1609f f8122o;

    /* JADX INFO: renamed from: o0 */
    private ColorStateList f8123o0;

    /* JADX INFO: renamed from: p */
    private TextView f8124p;

    /* JADX INFO: renamed from: p0 */
    private int f8125p0;

    /* JADX INFO: renamed from: q */
    private int f8126q;

    /* JADX INFO: renamed from: q0 */
    private int f8127q0;

    /* JADX INFO: renamed from: r */
    private int f8128r;

    /* JADX INFO: renamed from: r0 */
    private int f8129r0;

    /* JADX INFO: renamed from: s */
    private CharSequence f8130s;

    /* JADX INFO: renamed from: s0 */
    private int f8131s0;

    /* JADX INFO: renamed from: t */
    private boolean f8132t;

    /* JADX INFO: renamed from: t0 */
    private int f8133t0;

    /* JADX INFO: renamed from: u */
    private TextView f8134u;

    /* JADX INFO: renamed from: u0 */
    int f8135u0;

    /* JADX INFO: renamed from: v */
    private ColorStateList f8136v;

    /* JADX INFO: renamed from: v0 */
    private boolean f8137v0;

    /* JADX INFO: renamed from: w */
    private int f8138w;

    /* JADX INFO: renamed from: w0 */
    final C1530a f8139w0;

    /* JADX INFO: renamed from: x */
    private C1258c f8140x;

    /* JADX INFO: renamed from: x0 */
    private boolean f8141x0;

    /* JADX INFO: renamed from: y */
    private C1258c f8142y;

    /* JADX INFO: renamed from: y0 */
    private boolean f8143y0;

    /* JADX INFO: renamed from: z */
    private ColorStateList f8144z;

    /* JADX INFO: renamed from: z0 */
    private ValueAnimator f8145z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1603a();

        /* JADX INFO: renamed from: f */
        CharSequence f8146f;

        /* JADX INFO: renamed from: g */
        boolean f8147g;

        /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        class C1603a implements Parcelable.ClassLoaderCreator {
            C1603a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f8146f) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            TextUtils.writeToParcel(this.f8146f, parcel, i3);
            parcel.writeInt(this.f8147g ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8146f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8147g = parcel.readInt() == 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C1604a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        int f8148a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ EditText f8149b;

        C1604a(EditText editText) {
            this.f8149b = editText;
            this.f8148a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.m8833w0(!r0.f8071B0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f8116l) {
                textInputLayout.m8828l0(editable);
            }
            if (TextInputLayout.this.f8132t) {
                TextInputLayout.this.m8754A0(editable);
            }
            int lineCount = this.f8149b.getLineCount();
            int i3 = this.f8148a;
            if (lineCount != i3) {
                if (lineCount < i3) {
                    int minimumHeight = this.f8149b.getMinimumHeight();
                    int i4 = TextInputLayout.this.f8135u0;
                    if (minimumHeight != i4) {
                        this.f8149b.setMinimumHeight(i4);
                    }
                }
                this.f8148a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C1605b extends C0273a {
        C1605b() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            c0356y.m1253T0(false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class RunnableC1606c implements Runnable {
        RunnableC1606c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f8098c.m8943h();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C1607d implements ValueAnimator.AnimatorUpdateListener {
        C1607d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f8139w0.m8354j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C1608e extends C0273a {

        /* JADX INFO: renamed from: d */
        private final TextInputLayout f8154d;

        public C1608e(TextInputLayout textInputLayout) {
            this.f8154d = textInputLayout;
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            EditText editText = this.f8154d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8154d.getHint();
            CharSequence error = this.f8154d.getError();
            CharSequence placeholderText = this.f8154d.getPlaceholderText();
            int counterMaxLength = this.f8154d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f8154d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zM8822Q = this.f8154d.m8822Q();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f8154d.f8096b.m8718A(c0356y);
            if (!zIsEmpty) {
                c0356y.m1249R0(text);
            } else if (!TextUtils.isEmpty(string)) {
                c0356y.m1249R0(string);
                if (!zM8822Q && placeholderText != null) {
                    c0356y.m1249R0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c0356y.m1249R0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c0356y.m1222C0(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    c0356y.m1249R0(string);
                }
                c0356y.m1241N0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c0356y.m1225E0(counterMaxLength);
            if (z2) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                c0356y.m1297y0(error);
            }
            View viewM9025t = this.f8154d.f8114k.m9025t();
            if (viewM9025t != null) {
                c0356y.m1223D0(viewM9025t);
            }
            this.f8154d.f8098c.m8950m().mo8889o(view, c0356y);
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: h */
        public void mo906h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo906h(view, accessibilityEvent);
            this.f8154d.f8098c.m8950m().mo8890p(view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC1609f {
        /* JADX INFO: renamed from: a */
        int mo8751a(Editable editable);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC1610g {
        /* JADX INFO: renamed from: a */
        void mo8837a(TextInputLayout textInputLayout);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f331X);
    }

    /* JADX INFO: renamed from: A */
    private void m8753A(boolean z2) {
        ValueAnimator valueAnimator = this.f8145z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8145z0.cancel();
        }
        if (z2 && this.f8143y0) {
            m8829m(1.0f);
        } else {
            this.f8139w0.m8354j0(1.0f);
        }
        this.f8137v0 = false;
        if (m8757C()) {
            m8772W();
        }
        m8817z0();
        this.f8096b.m8729l(false);
        this.f8098c.m8918H(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m8754A0(Editable editable) {
        if (this.f8122o.mo8751a(editable) != 0 || this.f8137v0) {
            m8767M();
        } else {
            m8786g0();
        }
    }

    /* JADX INFO: renamed from: B */
    private C1258c m8755B() {
        C1258c c1258c = new C1258c();
        c1258c.mo6414Z(AbstractC0528h.m1910f(getContext(), AbstractC0140a.f309B, 87));
        c1258c.mo6418b0(AbstractC0528h.m1911g(getContext(), AbstractC0140a.f315H, AbstractC0176a.f1125a));
        return c1258c;
    }

    /* JADX INFO: renamed from: B0 */
    private void m8756B0(boolean z2, boolean z3) {
        int defaultColor = this.f8123o0.getDefaultColor();
        int colorForState = this.f8123o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f8123o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f8091U = colorForState2;
        } else if (z3) {
            this.f8091U = colorForState;
        } else {
            this.f8091U = defaultColor;
        }
    }

    /* JADX INFO: renamed from: C */
    private boolean m8757C() {
        return this.f8074D && !TextUtils.isEmpty(this.f8075E) && (this.f8077G instanceof AbstractC1618h);
    }

    /* JADX INFO: renamed from: D */
    private void m8758D() {
        Iterator it = this.f8105f0.iterator();
        while (it.hasNext()) {
            ((InterfaceC1610g) it.next()).mo8837a(this);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m8759E(Canvas canvas) {
        C0637h c0637h;
        if (this.f8082L == null || (c0637h = this.f8081K) == null) {
            return;
        }
        c0637h.draw(canvas);
        if (this.f8102e.isFocused()) {
            Rect bounds = this.f8082L.getBounds();
            Rect bounds2 = this.f8081K.getBounds();
            float fM8334B = this.f8139w0.m8334B();
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0176a.m484c(iCenterX, bounds2.left, fM8334B);
            bounds.right = AbstractC0176a.m484c(iCenterX, bounds2.right, fM8334B);
            this.f8082L.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: F */
    private void m8760F(Canvas canvas) {
        if (this.f8074D) {
            this.f8139w0.m8355k(canvas);
        }
    }

    /* JADX INFO: renamed from: G */
    private void m8761G(boolean z2) {
        ValueAnimator valueAnimator = this.f8145z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8145z0.cancel();
        }
        if (z2 && this.f8143y0) {
            m8829m(0.0f);
        } else {
            this.f8139w0.m8354j0(0.0f);
        }
        if (m8757C() && ((AbstractC1618h) this.f8077G).m8861v0()) {
            m8816z();
        }
        this.f8137v0 = true;
        m8767M();
        this.f8096b.m8729l(true);
        this.f8098c.m8918H(true);
    }

    /* JADX INFO: renamed from: H */
    private C0637h m8762H(boolean z2) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(AbstractC0142c.f438w0);
        float f3 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f8102e;
        float popupElevation = editText instanceof C1633w ? ((C1633w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(AbstractC0142c.f365A);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(AbstractC0142c.f424p0);
        C0641l c0641lM2351m = C0641l.m2304a().m2345C(f3).m2349G(f3).m2358u(dimensionPixelOffset).m2362y(dimensionPixelOffset).m2351m();
        EditText editText2 = this.f8102e;
        C0637h c0637hM2248r = C0637h.m2248r(getContext(), popupElevation, editText2 instanceof C1633w ? ((C1633w) editText2).getDropDownBackgroundTintList() : null);
        c0637hM2248r.setShapeAppearanceModel(c0641lM2351m);
        c0637hM2248r.m2277f0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return c0637hM2248r;
    }

    /* JADX INFO: renamed from: I */
    private static Drawable m8763I(C0637h c0637h, int i3, int i4, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0450a.m1638j(i4, i3, 0.1f), i3}), c0637h, c0637h);
    }

    /* JADX INFO: renamed from: J */
    private int m8764J(int i3, boolean z2) {
        return i3 + ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f8102e.getCompoundPaddingLeft() : this.f8098c.m8968y() : this.f8096b.m8722c());
    }

    /* JADX INFO: renamed from: K */
    private int m8765K(int i3, boolean z2) {
        return i3 - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f8102e.getCompoundPaddingRight() : this.f8096b.m8722c() : this.f8098c.m8968y());
    }

    /* JADX INFO: renamed from: L */
    private static Drawable m8766L(Context context, C0637h c0637h, int i3, int[][] iArr) {
        int iM1631c = AbstractC0450a.m1631c(context, AbstractC0140a.f341i, "TextInputLayout");
        C0637h c0637h2 = new C0637h(c0637h.m2261H());
        int iM1638j = AbstractC0450a.m1638j(i3, iM1631c, 0.1f);
        c0637h2.m2274c0(new ColorStateList(iArr, new int[]{iM1638j, 0}));
        c0637h2.setTint(iM1631c);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM1638j, iM1631c});
        C0637h c0637h3 = new C0637h(c0637h.m2261H());
        c0637h3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0637h2, c0637h3), c0637h});
    }

    /* JADX INFO: renamed from: M */
    private void m8767M() {
        TextView textView = this.f8134u;
        if (textView == null || !this.f8132t) {
            return;
        }
        textView.setText((CharSequence) null);
        AbstractC1275t.m6449a(this.f8094a, this.f8142y);
        this.f8134u.setVisibility(4);
    }

    /* JADX INFO: renamed from: R */
    private boolean m8768R() {
        return getHintMaxLines() == 1;
    }

    /* JADX INFO: renamed from: S */
    private boolean m8769S() {
        if (m8826d0()) {
            return true;
        }
        return this.f8124p != null && this.f8120n;
    }

    /* JADX INFO: renamed from: U */
    private boolean m8770U() {
        return this.f8086P == 1 && this.f8102e.getMinLines() <= 1;
    }

    /* JADX INFO: renamed from: V */
    private void m8771V() {
        m8801q();
        m8832s0();
        m8818C0();
        m8788h0();
        m8794l();
        if (this.f8086P != 0) {
            m8810v0();
        }
        m8778b0();
    }

    /* JADX INFO: renamed from: W */
    private void m8772W() {
        if (m8757C()) {
            RectF rectF = this.f8097b0;
            this.f8139w0.m8361o(rectF, this.f8102e.getWidth(), this.f8102e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            m8800p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f8088R);
            rectF.top = 0.0f;
            ((AbstractC1618h) this.f8077G).m8864y0(rectF);
        }
    }

    /* JADX INFO: renamed from: X */
    private void m8773X() {
        if (!m8757C() || this.f8137v0) {
            return;
        }
        m8816z();
        m8772W();
    }

    /* JADX INFO: renamed from: Y */
    private static void m8774Y(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m8774Y((ViewGroup) childAt, z2);
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m8776a0() {
        TextView textView = this.f8134u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m8778b0() {
        EditText editText = this.f8102e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f8086P;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m8779c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: e0 */
    private boolean m8782e0() {
        return (this.f8098c.m8917G() || ((this.f8098c.m8914A() && m8819N()) || this.f8098c.m8965w() != null)) && this.f8098c.getMeasuredWidth() > 0;
    }

    /* JADX INFO: renamed from: f0 */
    private boolean m8784f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f8096b.getMeasuredWidth() > 0;
    }

    /* JADX INFO: renamed from: g0 */
    private void m8786g0() {
        if (this.f8134u == null || !this.f8132t || TextUtils.isEmpty(this.f8130s)) {
            return;
        }
        this.f8134u.setText(this.f8130s);
        AbstractC1275t.m6449a(this.f8094a, this.f8140x);
        this.f8134u.setVisibility(0);
        this.f8134u.bringToFront();
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f8102e;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC1628r.m8892a(editText)) {
            return this.f8077G;
        }
        int iM1632d = AbstractC0450a.m1632d(this.f8102e, AbstractC1760a.f8719t);
        int i3 = this.f8086P;
        if (i3 == 2) {
            return m8766L(getContext(), this.f8077G, iM1632d, f8067E0);
        }
        if (i3 == 1) {
            return m8763I(this.f8077G, this.f8092V, iM1632d, f8067E0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f8079I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f8079I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f8079I.addState(new int[0], m8762H(false));
        }
        return this.f8079I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f8078H == null) {
            this.f8078H = m8762H(true);
        }
        return this.f8078H;
    }

    /* JADX INFO: renamed from: h0 */
    private void m8788h0() {
        if (this.f8086P == 1) {
            if (AbstractC0557c.m2088l(getContext())) {
                this.f8087Q = getResources().getDimensionPixelSize(AbstractC0142c.f382P);
            } else if (AbstractC0557c.m2087k(getContext())) {
                this.f8087Q = getResources().getDimensionPixelSize(AbstractC0142c.f381O);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    private void m8790i0(Rect rect) {
        C0637h c0637h = this.f8081K;
        if (c0637h != null) {
            int i3 = rect.bottom;
            c0637h.setBounds(rect.left, i3 - this.f8089S, rect.right, i3);
        }
        C0637h c0637h2 = this.f8082L;
        if (c0637h2 != null) {
            int i4 = rect.bottom;
            c0637h2.setBounds(rect.left, i4 - this.f8090T, rect.right, i4);
        }
    }

    /* JADX INFO: renamed from: j0 */
    private void m8791j0(int i3) {
        this.f8139w0.m8366s0(i3);
        Rect rect = this.f8093W;
        AbstractC1532c.m8373a(this, this.f8102e, rect);
        this.f8139w0.m8341S(m8804s(rect));
        m8810v0();
        m8794l();
        m8806t0(i3);
    }

    /* JADX INFO: renamed from: k */
    private void m8792k() {
        TextView textView = this.f8134u;
        if (textView != null) {
            this.f8094a.addView(textView);
            this.f8134u.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m8793k0() {
        if (this.f8124p != null) {
            EditText editText = this.f8102e;
            m8828l0(editText == null ? null : editText.getText());
        }
    }

    /* JADX INFO: renamed from: l */
    private void m8794l() {
        if (this.f8102e == null || this.f8086P != 1) {
            return;
        }
        if (!m8768R()) {
            EditText editText = this.f8102e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f8139w0.m8365q() + this.f8100d), this.f8102e.getPaddingEnd(), getResources().getDimensionPixelSize(AbstractC0142c.f377K));
        } else if (AbstractC0557c.m2088l(getContext())) {
            EditText editText2 = this.f8102e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(AbstractC0142c.f380N), this.f8102e.getPaddingEnd(), getResources().getDimensionPixelSize(AbstractC0142c.f379M));
        } else if (AbstractC0557c.m2087k(getContext())) {
            EditText editText3 = this.f8102e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(AbstractC0142c.f378L), this.f8102e.getPaddingEnd(), getResources().getDimensionPixelSize(AbstractC0142c.f377K));
        }
    }

    /* JADX INFO: renamed from: m0 */
    private static void m8795m0(Context context, TextView textView, int i3, int i4, boolean z2) {
        textView.setContentDescription(context.getString(z2 ? AbstractC0148i.f543c : AbstractC0148i.f542b, Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    /* JADX INFO: renamed from: n */
    private void m8796n() {
        C0637h c0637h = this.f8077G;
        if (c0637h == null) {
            return;
        }
        C0641l c0641lM2261H = c0637h.m2261H();
        C0641l c0641l = this.f8083M;
        if (c0641lM2261H != c0641l) {
            this.f8077G.setShapeAppearanceModel(c0641l);
        }
        if (m8812x()) {
            this.f8077G.m2280i0(this.f8088R, this.f8091U);
        }
        int iM8802r = m8802r();
        this.f8092V = iM8802r;
        this.f8077G.m2274c0(ColorStateList.valueOf(iM8802r));
        m8798o();
        m8832s0();
    }

    /* JADX INFO: renamed from: n0 */
    private void m8797n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f8124p;
        if (textView != null) {
            m8825c0(textView, this.f8120n ? this.f8126q : this.f8128r);
            if (!this.f8120n && (colorStateList2 = this.f8144z) != null) {
                this.f8124p.setTextColor(colorStateList2);
            }
            if (!this.f8120n || (colorStateList = this.f8068A) == null) {
                return;
            }
            this.f8124p.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m8798o() {
        if (this.f8081K == null || this.f8082L == null) {
            return;
        }
        if (m8814y()) {
            this.f8081K.m2274c0(this.f8102e.isFocused() ? ColorStateList.valueOf(this.f8117l0) : ColorStateList.valueOf(this.f8091U));
            this.f8082L.m2274c0(ColorStateList.valueOf(this.f8091U));
        }
        invalidate();
    }

    /* JADX INFO: renamed from: o0 */
    private void m8799o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListM1635g = this.f8070B;
        if (colorStateListM1635g == null) {
            colorStateListM1635g = AbstractC0450a.m1635g(getContext(), AbstractC1760a.f8718s);
        }
        EditText editText = this.f8102e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = AbstractC0000a.m17r(this.f8102e.getTextCursorDrawable()).mutate();
        if (m8769S() && (colorStateList = this.f8072C) != null) {
            colorStateListM1635g = colorStateList;
        }
        drawableMutate.setTintList(colorStateListM1635g);
    }

    /* JADX INFO: renamed from: p */
    private void m8800p(RectF rectF) {
        float f3 = rectF.left;
        int i3 = this.f8085O;
        rectF.left = f3 - i3;
        rectF.right += i3;
    }

    /* JADX INFO: renamed from: q */
    private void m8801q() {
        int i3 = this.f8086P;
        if (i3 == 0) {
            this.f8077G = null;
            this.f8081K = null;
            this.f8082L = null;
            return;
        }
        if (i3 == 1) {
            this.f8077G = new C0637h(this.f8083M);
            this.f8081K = new C0637h();
            this.f8082L = new C0637h();
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException(this.f8086P + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f8074D || (this.f8077G instanceof AbstractC1618h)) {
                this.f8077G = new C0637h(this.f8083M);
            } else {
                this.f8077G = AbstractC1618h.m8859t0(this.f8083M);
            }
            this.f8081K = null;
            this.f8082L = null;
        }
    }

    /* JADX INFO: renamed from: r */
    private int m8802r() {
        return this.f8086P == 1 ? AbstractC0450a.m1637i(AbstractC0450a.m1633e(this, AbstractC0140a.f341i, 0), this.f8092V) : this.f8092V;
    }

    /* JADX INFO: renamed from: r0 */
    private void m8803r0() {
        this.f8102e.setBackground(getEditTextBoxBackground());
    }

    /* JADX INFO: renamed from: s */
    private Rect m8804s(Rect rect) {
        if (this.f8102e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f8095a0;
        boolean zM8502g = AbstractC1549t.m8502g(this);
        rect2.bottom = rect.bottom;
        int i3 = this.f8086P;
        if (i3 == 1) {
            rect2.left = m8764J(rect.left, zM8502g);
            rect2.top = rect.top + this.f8087Q;
            rect2.right = m8765K(rect.right, zM8502g);
            return rect2;
        }
        if (i3 != 2) {
            rect2.left = m8764J(rect.left, zM8502g);
            rect2.top = getPaddingTop();
            rect2.right = m8765K(rect.right, zM8502g);
            return rect2;
        }
        rect2.left = rect.left + this.f8102e.getPaddingLeft();
        rect2.top = rect.top - m8811w();
        rect2.right = rect.right - this.f8102e.getPaddingRight();
        return rect2;
    }

    private void setEditText(EditText editText) {
        if (this.f8102e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f8102e = editText;
        int i3 = this.f8106g;
        if (i3 != -1) {
            setMinEms(i3);
        } else {
            setMinWidth(this.f8110i);
        }
        int i4 = this.f8108h;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.f8112j);
        }
        this.f8080J = false;
        m8771V();
        setTextInputAccessibilityDelegate(new C1608e(this));
        this.f8139w0.m8364p0(this.f8102e.getTypeface());
        this.f8139w0.m8353h0(this.f8102e.getTextSize());
        this.f8139w0.m8350d0(this.f8102e.getLetterSpacing());
        int gravity = this.f8102e.getGravity();
        this.f8139w0.m8345X((gravity & (-113)) | 48);
        this.f8139w0.m8352g0(gravity);
        this.f8135u0 = editText.getMinimumHeight();
        this.f8102e.addTextChangedListener(new C1604a(editText));
        if (this.f8113j0 == null) {
            this.f8113j0 = this.f8102e.getHintTextColors();
        }
        if (this.f8074D) {
            if (TextUtils.isEmpty(this.f8075E)) {
                CharSequence hint = this.f8102e.getHint();
                this.f8104f = hint;
                setHint(hint);
                this.f8102e.setHint((CharSequence) null);
            }
            this.f8076F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m8799o0();
        }
        if (this.f8124p != null) {
            m8828l0(this.f8102e.getText());
        }
        m8831q0();
        this.f8114k.m9016f();
        this.f8096b.bringToFront();
        this.f8098c.bringToFront();
        m8758D();
        this.f8098c.m8967x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m8813x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f8075E)) {
            return;
        }
        this.f8075E = charSequence;
        this.f8139w0.m8360n0(charSequence);
        if (this.f8137v0) {
            return;
        }
        m8772W();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f8132t == z2) {
            return;
        }
        if (z2) {
            m8792k();
        } else {
            m8776a0();
            this.f8134u = null;
        }
        this.f8132t = z2;
    }

    /* JADX INFO: renamed from: t */
    private int m8805t(Rect rect, Rect rect2, float f3) {
        return m8770U() ? (int) (rect2.top + f3) : rect.bottom - this.f8102e.getCompoundPaddingBottom();
    }

    /* JADX INFO: renamed from: t0 */
    private void m8806t0(int i3) {
        if (this.f8102e == null) {
            return;
        }
        float fM8371z = this.f8139w0.m8371z();
        if (this.f8130s != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.f8134u.getPaint());
            textPaint.setTextSize(this.f8134u.getTextSize());
            textPaint.setTypeface(this.f8134u.getTypeface());
            textPaint.setLetterSpacing(this.f8134u.getLetterSpacing());
            fM8365q = (this.f8086P == 1 ? this.f8100d + this.f8139w0.m8365q() + this.f8087Q : 0.0f) + C1541l.m8454b(this.f8130s, textPaint, i3).m8460g(getLayoutDirection() == 1).m8459f(true).m8461h(this.f8134u.getLineSpacingExtra(), this.f8134u.getLineSpacingMultiplier()).m8463j(new InterfaceC1542m() { // from class: com.google.android.material.textfield.K
                @Override // com.google.android.material.internal.InterfaceC1542m
                /* JADX INFO: renamed from: a */
                public final void mo8464a(StaticLayout.Builder builder) {
                    builder.setBreakStrategy(this.f8063a.f8134u.getBreakStrategy());
                }
            }).m8455a().getHeight();
        }
        float fMax = Math.max(fM8371z, fM8365q);
        if (this.f8102e.getMeasuredHeight() < fMax) {
            this.f8102e.setMinimumHeight(Math.round(fMax));
        }
    }

    /* JADX INFO: renamed from: u */
    private int m8807u(Rect rect, float f3) {
        if (m8770U()) {
            return (int) (rect.centerY() - (f3 / 2.0f));
        }
        return (rect.top + this.f8102e.getCompoundPaddingTop()) - ((this.f8086P != 0 || m8768R()) ? 0 : (int) (this.f8139w0.m8333A() / 2.0f));
    }

    /* JADX INFO: renamed from: u0 */
    private boolean m8808u0() {
        int iMax;
        if (this.f8102e == null || this.f8102e.getMeasuredHeight() >= (iMax = Math.max(this.f8098c.getMeasuredHeight(), this.f8096b.getMeasuredHeight()))) {
            return false;
        }
        this.f8102e.setMinimumHeight(iMax);
        return true;
    }

    /* JADX INFO: renamed from: v */
    private Rect m8809v(Rect rect) {
        if (this.f8102e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f8095a0;
        float fM8333A = m8768R() ? this.f8139w0.m8333A() : this.f8139w0.m8370y() * this.f8139w0.m8368w();
        rect2.left = rect.left + this.f8102e.getCompoundPaddingLeft();
        rect2.top = m8807u(rect, fM8333A);
        rect2.right = rect.right - this.f8102e.getCompoundPaddingRight();
        rect2.bottom = m8805t(rect, rect2, fM8333A);
        return rect2;
    }

    /* JADX INFO: renamed from: v0 */
    private void m8810v0() {
        if (this.f8086P != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8094a.getLayoutParams();
            int iM8811w = m8811w();
            if (iM8811w != layoutParams.topMargin) {
                layoutParams.topMargin = iM8811w;
                this.f8094a.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private int m8811w() {
        if (!this.f8074D) {
            return 0;
        }
        int i3 = this.f8086P;
        if (i3 == 0) {
            return (int) this.f8139w0.m8365q();
        }
        if (i3 != 2) {
            return 0;
        }
        return m8768R() ? (int) (this.f8139w0.m8365q() / 2.0f) : Math.max(0, (int) (this.f8139w0.m8365q() - (this.f8139w0.m8359n() / 2.0f)));
    }

    /* JADX INFO: renamed from: x */
    private boolean m8812x() {
        return this.f8086P == 2 && m8814y();
    }

    /* JADX INFO: renamed from: x0 */
    private void m8813x0(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f8102e;
        boolean z4 = false;
        boolean z5 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f8102e;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        }
        ColorStateList colorStateList2 = this.f8113j0;
        if (colorStateList2 != null) {
            this.f8139w0.m8339Q(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f8113j0;
            this.f8139w0.m8339Q(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f8133t0) : this.f8133t0));
        } else if (m8826d0()) {
            this.f8139w0.m8339Q(this.f8114k.m9023r());
        } else if (this.f8120n && (textView = this.f8124p) != null) {
            this.f8139w0.m8339Q(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f8115k0) != null) {
            this.f8139w0.m8344W(colorStateList);
        }
        if (z5 || !this.f8141x0 || (isEnabled() && z4)) {
            if (z3 || this.f8137v0) {
                m8753A(z2);
                return;
            }
            return;
        }
        if (z3 || !this.f8137v0) {
            m8761G(z2);
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m8814y() {
        return this.f8088R > -1 && this.f8091U != 0;
    }

    /* JADX INFO: renamed from: y0 */
    private void m8815y0() {
        EditText editText;
        if (this.f8134u == null || (editText = this.f8102e) == null) {
            return;
        }
        this.f8134u.setGravity(editText.getGravity());
        this.f8134u.setPadding(this.f8102e.getCompoundPaddingLeft(), this.f8102e.getCompoundPaddingTop(), this.f8102e.getCompoundPaddingRight(), this.f8102e.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: z */
    private void m8816z() {
        if (m8757C()) {
            ((AbstractC1618h) this.f8077G).m8862w0();
        }
    }

    /* JADX INFO: renamed from: z0 */
    private void m8817z0() {
        EditText editText = this.f8102e;
        m8754A0(editText == null ? null : editText.getText());
    }

    /* JADX INFO: renamed from: C0 */
    void m8818C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f8077G == null || this.f8086P == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f8102e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f8102e) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f8091U = this.f8133t0;
        } else if (m8826d0()) {
            if (this.f8123o0 != null) {
                m8756B0(z3, z2);
            } else {
                this.f8091U = getErrorCurrentTextColors();
            }
        } else if (!this.f8120n || (textView = this.f8124p) == null) {
            if (z3) {
                this.f8091U = this.f8121n0;
            } else if (z2) {
                this.f8091U = this.f8119m0;
            } else {
                this.f8091U = this.f8117l0;
            }
        } else if (this.f8123o0 != null) {
            m8756B0(z3, z2);
        } else {
            this.f8091U = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m8799o0();
        }
        this.f8098c.m8919I();
        m8824Z();
        if (this.f8086P == 2) {
            int i3 = this.f8088R;
            if (z3 && isEnabled()) {
                this.f8088R = this.f8090T;
            } else {
                this.f8088R = this.f8089S;
            }
            if (this.f8088R != i3) {
                m8773X();
            }
        }
        if (this.f8086P == 1) {
            if (!isEnabled()) {
                this.f8092V = this.f8127q0;
            } else if (z2 && !z3) {
                this.f8092V = this.f8131s0;
            } else if (z3) {
                this.f8092V = this.f8129r0;
            } else {
                this.f8092V = this.f8125p0;
            }
        }
        m8796n();
    }

    /* JADX INFO: renamed from: N */
    public boolean m8819N() {
        return this.f8098c.m8916F();
    }

    /* JADX INFO: renamed from: O */
    public boolean m8820O() {
        return this.f8114k.m9001A();
    }

    /* JADX INFO: renamed from: P */
    public boolean m8821P() {
        return this.f8114k.m9002B();
    }

    /* JADX INFO: renamed from: Q */
    final boolean m8822Q() {
        return this.f8137v0;
    }

    /* JADX INFO: renamed from: T */
    public boolean m8823T() {
        return this.f8076F;
    }

    /* JADX INFO: renamed from: Z */
    public void m8824Z() {
        this.f8096b.m8730m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i3, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f8094a.addView(view, layoutParams2);
        this.f8094a.setLayoutParams(layoutParams);
        m8810v0();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: c0 */
    void m8825c0(TextView textView, int i3) {
        try {
            AbstractC0988i.m4394m(textView, i3);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        AbstractC0988i.m4394m(textView, AbstractC1768i.f8871c);
        textView.setTextColor(AbstractC0966b.getColor(getContext(), AbstractC0141b.f359a));
    }

    /* JADX INFO: renamed from: d0 */
    boolean m8826d0() {
        return this.f8114k.m9018l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i3) {
        EditText editText = this.f8102e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i3);
            return;
        }
        if (this.f8104f != null) {
            boolean z2 = this.f8076F;
            this.f8076F = false;
            CharSequence hint = editText.getHint();
            this.f8102e.setHint(this.f8104f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i3);
                return;
            } finally {
                this.f8102e.setHint(hint);
                this.f8076F = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i3);
        onProvideAutofillVirtualStructure(viewStructure, i3);
        viewStructure.setChildCount(this.f8094a.getChildCount());
        for (int i4 = 0; i4 < this.f8094a.getChildCount(); i4++) {
            View childAt = this.f8094a.getChildAt(i4);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i3);
            if (childAt == this.f8102e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f8071B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f8071B0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m8760F(canvas);
        m8759E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f8069A0) {
            return;
        }
        this.f8069A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1530a c1530a = this.f8139w0;
        boolean zM8358m0 = c1530a != null ? c1530a.m8358m0(drawableState) : false;
        if (this.f8102e != null) {
            m8833w0(isLaidOut() && isEnabled());
        }
        m8831q0();
        m8818C0();
        if (zM8358m0) {
            invalidate();
        }
        this.f8069A0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f8102e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m8811w() : super.getBaseline();
    }

    C0637h getBoxBackground() {
        int i3 = this.f8086P;
        if (i3 == 1 || i3 == 2) {
            return this.f8077G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f8092V;
    }

    public int getBoxBackgroundMode() {
        return this.f8086P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f8087Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return AbstractC1549t.m8502g(this) ? this.f8083M.m2314j().mo2214a(this.f8097b0) : this.f8083M.m2316l().mo2214a(this.f8097b0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return AbstractC1549t.m8502g(this) ? this.f8083M.m2316l().mo2214a(this.f8097b0) : this.f8083M.m2314j().mo2214a(this.f8097b0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return AbstractC1549t.m8502g(this) ? this.f8083M.m2321r().mo2214a(this.f8097b0) : this.f8083M.m2323t().mo2214a(this.f8097b0);
    }

    public float getBoxCornerRadiusTopStart() {
        return AbstractC1549t.m8502g(this) ? this.f8083M.m2323t().mo2214a(this.f8097b0) : this.f8083M.m2321r().mo2214a(this.f8097b0);
    }

    public int getBoxStrokeColor() {
        return this.f8121n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8123o0;
    }

    public int getBoxStrokeWidth() {
        return this.f8089S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f8090T;
    }

    public int getCounterMaxLength() {
        return this.f8118m;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f8116l && this.f8120n && (textView = this.f8124p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f8068A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f8144z;
    }

    public ColorStateList getCursorColor() {
        return this.f8070B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f8072C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8113j0;
    }

    public EditText getEditText() {
        return this.f8102e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f8098c.m8948l();
    }

    public Drawable getEndIconDrawable() {
        return this.f8098c.m8952n();
    }

    public int getEndIconMinSize() {
        return this.f8098c.m8954o();
    }

    public int getEndIconMode() {
        return this.f8098c.m8956p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f8098c.m8958q();
    }

    CheckableImageButton getEndIconView() {
        return this.f8098c.m8960r();
    }

    public CharSequence getError() {
        if (this.f8114k.m9001A()) {
            return this.f8114k.m9021p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f8114k.m9019n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f8114k.m9020o();
    }

    public int getErrorCurrentTextColors() {
        return this.f8114k.m9022q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f8098c.m8962s();
    }

    public CharSequence getHelperText() {
        if (this.f8114k.m9002B()) {
            return this.f8114k.m9024s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8114k.m9026u();
    }

    public CharSequence getHint() {
        if (this.f8074D) {
            return this.f8075E;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f8139w0.m8365q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f8139w0.m8367t();
    }

    public int getHintMaxLines() {
        return this.f8139w0.m8369x();
    }

    public ColorStateList getHintTextColor() {
        return this.f8115k0;
    }

    public InterfaceC1609f getLengthCounter() {
        return this.f8122o;
    }

    public int getMaxEms() {
        return this.f8108h;
    }

    public int getMaxWidth() {
        return this.f8112j;
    }

    public int getMinEms() {
        return this.f8106g;
    }

    public int getMinWidth() {
        return this.f8110i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8098c.m8963u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8098c.m8964v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f8132t) {
            return this.f8130s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f8138w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f8136v;
    }

    public CharSequence getPrefixText() {
        return this.f8096b.m8720a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f8096b.m8721b();
    }

    public TextView getPrefixTextView() {
        return this.f8096b.m8723d();
    }

    public C0641l getShapeAppearanceModel() {
        return this.f8083M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f8096b.m8724e();
    }

    public Drawable getStartIconDrawable() {
        return this.f8096b.m8725f();
    }

    public int getStartIconMinSize() {
        return this.f8096b.m8726g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f8096b.m8727h();
    }

    public CharSequence getSuffixText() {
        return this.f8098c.m8965w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f8098c.m8966x();
    }

    public TextView getSuffixTextView() {
        return this.f8098c.m8969z();
    }

    public Typeface getTypeface() {
        return this.f8099c0;
    }

    /* JADX INFO: renamed from: j */
    public void m8827j(InterfaceC1610g interfaceC1610g) {
        this.f8105f0.add(interfaceC1610g);
        if (this.f8102e != null) {
            interfaceC1610g.mo8837a(this);
        }
    }

    /* JADX INFO: renamed from: l0 */
    void m8828l0(Editable editable) {
        int iMo8751a = this.f8122o.mo8751a(editable);
        boolean z2 = this.f8120n;
        int i3 = this.f8118m;
        if (i3 == -1) {
            this.f8124p.setText(String.valueOf(iMo8751a));
            this.f8124p.setContentDescription(null);
            this.f8120n = false;
        } else {
            this.f8120n = iMo8751a > i3;
            m8795m0(getContext(), this.f8124p, iMo8751a, this.f8118m, this.f8120n);
            if (z2 != this.f8120n) {
                m8797n0();
            }
            this.f8124p.setText(C0183a.m541c().m548j(getContext().getString(AbstractC0148i.f544d, Integer.valueOf(iMo8751a), Integer.valueOf(this.f8118m))));
        }
        if (this.f8102e == null || z2 == this.f8120n) {
            return;
        }
        m8833w0(false);
        m8818C0();
        m8831q0();
    }

    /* JADX INFO: renamed from: m */
    void m8829m(float f3) {
        if (this.f8139w0.m8334B() == f3) {
            return;
        }
        if (this.f8145z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8145z0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0528h.m1911g(getContext(), AbstractC0140a.f314G, AbstractC0176a.f1126b));
            this.f8145z0.setDuration(AbstractC0528h.m1910f(getContext(), AbstractC0140a.f308A, 167));
            this.f8145z0.addUpdateListener(new C1607d());
        }
        this.f8145z0.setFloatValues(this.f8139w0.m8334B(), f3);
        this.f8145z0.start();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8139w0.m8336L(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f8098c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f8073C0 = false;
        boolean zM8808u0 = m8808u0();
        boolean zM8830p0 = m8830p0();
        if (zM8808u0 || zM8830p0) {
            this.f8102e.post(new Runnable() { // from class: com.google.android.material.textfield.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8062d.f8102e.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        EditText editText = this.f8102e;
        if (editText != null) {
            Rect rect = this.f8093W;
            AbstractC1532c.m8373a(this, editText, rect);
            m8790i0(rect);
            if (this.f8074D) {
                this.f8139w0.m8353h0(this.f8102e.getTextSize());
                int gravity = this.f8102e.getGravity();
                this.f8139w0.m8345X((gravity & (-113)) | 48);
                this.f8139w0.m8352g0(gravity);
                this.f8139w0.m8341S(m8804s(rect));
                this.f8139w0.m8349c0(m8809v(rect));
                this.f8139w0.m8337N();
                if (!m8757C() || this.f8137v0) {
                    return;
                }
                m8772W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (!this.f8073C0) {
            this.f8098c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f8073C0 = true;
        }
        m8815y0();
        this.f8098c.m8967x0();
        if (m8768R()) {
            return;
        }
        m8791j0((this.f8102e.getMeasuredWidth() - this.f8102e.getCompoundPaddingLeft()) - this.f8102e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m4418a());
        setError(savedState.f8146f);
        if (savedState.f8147g) {
            post(new RunnableC1606c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        boolean z2 = i3 == 1;
        if (z2 != this.f8084N) {
            float fMo2214a = this.f8083M.m2321r().mo2214a(this.f8097b0);
            float fMo2214a2 = this.f8083M.m2323t().mo2214a(this.f8097b0);
            C0641l c0641lM2351m = C0641l.m2304a().m2344B(this.f8083M.m2322s()).m2348F(this.f8083M.m2320q()).m2357t(this.f8083M.m2315k()).m2361x(this.f8083M.m2313i()).m2345C(fMo2214a2).m2349G(fMo2214a).m2358u(this.f8083M.m2316l().mo2214a(this.f8097b0)).m2362y(this.f8083M.m2314j().mo2214a(this.f8097b0)).m2351m();
            this.f8084N = z2;
            setShapeAppearanceModel(c0641lM2351m);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m8826d0()) {
            savedState.f8146f = getError();
        }
        savedState.f8147g = this.f8098c.m8915E();
        return savedState;
    }

    /* JADX INFO: renamed from: p0 */
    boolean m8830p0() {
        boolean z2;
        if (this.f8102e == null) {
            return false;
        }
        boolean z3 = true;
        if (m8784f0()) {
            int measuredWidth = this.f8096b.getMeasuredWidth() - this.f8102e.getPaddingLeft();
            if (this.f8101d0 == null || this.f8103e0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f8101d0 = colorDrawable;
                this.f8103e0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f8102e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f8101d0;
            if (drawable != drawable2) {
                this.f8102e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.f8101d0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f8102e.getCompoundDrawablesRelative();
                this.f8102e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f8101d0 = null;
                z2 = true;
            }
            z2 = false;
        }
        if (m8782e0()) {
            int measuredWidth2 = this.f8098c.m8969z().getMeasuredWidth() - this.f8102e.getPaddingRight();
            CheckableImageButton checkableImageButtonM8946k = this.f8098c.m8946k();
            if (checkableImageButtonM8946k != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonM8946k.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonM8946k.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f8102e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f8107g0;
            if (drawable3 != null && this.f8109h0 != measuredWidth2) {
                this.f8109h0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f8102e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f8107g0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f8107g0 = colorDrawable2;
                this.f8109h0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f8107g0;
            if (drawable4 != drawable5) {
                this.f8111i0 = drawable4;
                this.f8102e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f8107g0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f8102e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f8107g0) {
                this.f8102e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f8111i0, compoundDrawablesRelative4[3]);
            } else {
                z3 = z2;
            }
            this.f8107g0 = null;
            return z3;
        }
        return z2;
    }

    /* JADX INFO: renamed from: q0 */
    void m8831q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f8102e;
        if (editText == null || this.f8086P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (AbstractC0836M.m3450a(background)) {
            background = background.mutate();
        }
        if (m8826d0()) {
            background.setColorFilter(C0897j.m3814e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f8120n && (textView = this.f8124p) != null) {
            background.setColorFilter(C0897j.m3814e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC0000a.m2c(background);
            this.f8102e.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: s0 */
    void m8832s0() {
        EditText editText = this.f8102e;
        if (editText == null || this.f8077G == null) {
            return;
        }
        if ((this.f8080J || editText.getBackground() == null) && this.f8086P != 0) {
            m8803r0();
            this.f8080J = true;
        }
    }

    public void setBoxBackgroundColor(int i3) {
        if (this.f8092V != i3) {
            this.f8092V = i3;
            this.f8125p0 = i3;
            this.f8129r0 = i3;
            this.f8131s0 = i3;
            m8796n();
        }
    }

    public void setBoxBackgroundColorResource(int i3) {
        setBoxBackgroundColor(AbstractC0966b.getColor(getContext(), i3));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f8125p0 = defaultColor;
        this.f8092V = defaultColor;
        this.f8127q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f8129r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f8131s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m8796n();
    }

    public void setBoxBackgroundMode(int i3) {
        if (i3 == this.f8086P) {
            return;
        }
        this.f8086P = i3;
        if (this.f8102e != null) {
            m8771V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i3) {
        this.f8087Q = i3;
    }

    public void setBoxCornerFamily(int i3) {
        this.f8083M = this.f8083M.m2326w().m2343A(i3, this.f8083M.m2321r()).m2347E(i3, this.f8083M.m2323t()).m2356s(i3, this.f8083M.m2314j()).m2360w(i3, this.f8083M.m2316l()).m2351m();
        m8796n();
    }

    public void setBoxStrokeColor(int i3) {
        if (this.f8121n0 != i3) {
            this.f8121n0 = i3;
            m8818C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f8117l0 = colorStateList.getDefaultColor();
            this.f8133t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f8119m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f8121n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f8121n0 != colorStateList.getDefaultColor()) {
            this.f8121n0 = colorStateList.getDefaultColor();
        }
        m8818C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8123o0 != colorStateList) {
            this.f8123o0 = colorStateList;
            m8818C0();
        }
    }

    public void setBoxStrokeWidth(int i3) {
        this.f8089S = i3;
        m8818C0();
    }

    public void setBoxStrokeWidthFocused(int i3) {
        this.f8090T = i3;
        m8818C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i3) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i3));
    }

    public void setBoxStrokeWidthResource(int i3) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i3));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f8116l != z2) {
            if (z2) {
                C0824B c0824b = new C0824B(getContext());
                this.f8124p = c0824b;
                c0824b.setId(AbstractC0144e.f474S);
                Typeface typeface = this.f8099c0;
                if (typeface != null) {
                    this.f8124p.setTypeface(typeface);
                }
                this.f8124p.setMaxLines(1);
                this.f8114k.m9015e(this.f8124p, 2);
                ((ViewGroup.MarginLayoutParams) this.f8124p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(AbstractC0142c.f368B0));
                m8797n0();
                m8793k0();
            } else {
                this.f8114k.m9003C(this.f8124p, 2);
                this.f8124p = null;
            }
            this.f8116l = z2;
        }
    }

    public void setCounterMaxLength(int i3) {
        if (this.f8118m != i3) {
            if (i3 > 0) {
                this.f8118m = i3;
            } else {
                this.f8118m = -1;
            }
            if (this.f8116l) {
                m8793k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i3) {
        if (this.f8126q != i3) {
            this.f8126q = i3;
            m8797n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f8068A != colorStateList) {
            this.f8068A = colorStateList;
            m8797n0();
        }
    }

    public void setCounterTextAppearance(int i3) {
        if (this.f8128r != i3) {
            this.f8128r = i3;
            m8797n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f8144z != colorStateList) {
            this.f8144z = colorStateList;
            m8797n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f8070B != colorStateList) {
            this.f8070B = colorStateList;
            m8799o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f8072C != colorStateList) {
            this.f8072C = colorStateList;
            if (m8769S()) {
                m8799o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f8113j0 = colorStateList;
        this.f8115k0 = colorStateList;
        if (this.f8102e != null) {
            m8833w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m8774Y(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f8098c.m8923N(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f8098c.m8924O(z2);
    }

    public void setEndIconContentDescription(int i3) {
        this.f8098c.m8925P(i3);
    }

    public void setEndIconDrawable(int i3) {
        this.f8098c.m8927R(i3);
    }

    public void setEndIconMinSize(int i3) {
        this.f8098c.m8929T(i3);
    }

    public void setEndIconMode(int i3) {
        this.f8098c.m8930U(i3);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8098c.m8931V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8098c.m8932W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f8098c.m8933X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f8098c.m8934Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f8098c.m8935Z(mode);
    }

    public void setEndIconVisible(boolean z2) {
        this.f8098c.m8936a0(z2);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8114k.m9001A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f8114k.m9027w();
        } else {
            this.f8114k.m9013Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i3) {
        this.f8114k.m9004E(i3);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f8114k.m9005F(charSequence);
    }

    public void setErrorEnabled(boolean z2) {
        this.f8114k.m9006G(z2);
    }

    public void setErrorIconDrawable(int i3) {
        this.f8098c.m8937b0(i3);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8098c.m8939d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8098c.m8940e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f8098c.m8941f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f8098c.m8942g0(mode);
    }

    public void setErrorTextAppearance(int i3) {
        this.f8114k.m9007H(i3);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8114k.m9008I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f8141x0 != z2) {
            this.f8141x0 = z2;
            m8833w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m8821P()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!m8821P()) {
                setHelperTextEnabled(true);
            }
            this.f8114k.m9014R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8114k.m9011L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.f8114k.m9010K(z2);
    }

    public void setHelperTextTextAppearance(int i3) {
        this.f8114k.m9009J(i3);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f8074D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f8143y0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f8074D) {
            this.f8074D = z2;
            if (z2) {
                CharSequence hint = this.f8102e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f8075E)) {
                        setHint(hint);
                    }
                    this.f8102e.setHint((CharSequence) null);
                }
                this.f8076F = true;
            } else {
                this.f8076F = false;
                if (!TextUtils.isEmpty(this.f8075E) && TextUtils.isEmpty(this.f8102e.getHint())) {
                    this.f8102e.setHint(this.f8075E);
                }
                setHintInternal(null);
            }
            if (this.f8102e != null) {
                m8810v0();
            }
        }
    }

    public void setHintMaxLines(int i3) {
        this.f8139w0.m8342T(i3);
        this.f8139w0.m8351e0(i3);
        requestLayout();
    }

    public void setHintTextAppearance(int i3) {
        this.f8139w0.m8343U(i3);
        this.f8115k0 = this.f8139w0.m8363p();
        if (this.f8102e != null) {
            m8833w0(false);
            m8810v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8115k0 != colorStateList) {
            if (this.f8113j0 == null) {
                this.f8139w0.m8344W(colorStateList);
            }
            this.f8115k0 = colorStateList;
            if (this.f8102e != null) {
                m8833w0(false);
            }
        }
    }

    public void setLengthCounter(InterfaceC1609f interfaceC1609f) {
        this.f8122o = interfaceC1609f;
    }

    public void setMaxEms(int i3) {
        this.f8108h = i3;
        EditText editText = this.f8102e;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMaxEms(i3);
    }

    public void setMaxWidth(int i3) {
        this.f8112j = i3;
        EditText editText = this.f8102e;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMaxWidth(i3);
    }

    public void setMaxWidthResource(int i3) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    public void setMinEms(int i3) {
        this.f8106g = i3;
        EditText editText = this.f8102e;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMinEms(i3);
    }

    public void setMinWidth(int i3) {
        this.f8110i = i3;
        EditText editText = this.f8102e;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMinWidth(i3);
    }

    public void setMinWidthResource(int i3) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i3) {
        this.f8098c.m8944i0(i3);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i3) {
        this.f8098c.m8947k0(i3);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        this.f8098c.m8951m0(z2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f8098c.m8953n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f8098c.m8955o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f8134u == null) {
            C0824B c0824b = new C0824B(getContext());
            this.f8134u = c0824b;
            c0824b.setId(AbstractC0144e.f477V);
            this.f8134u.setImportantForAccessibility(1);
            this.f8134u.setAccessibilityLiveRegion(1);
            C1258c c1258cM8755B = m8755B();
            this.f8140x = c1258cM8755B;
            c1258cM8755B.mo6422e0(67L);
            this.f8142y = m8755B();
            setPlaceholderTextAppearance(this.f8138w);
            setPlaceholderTextColor(this.f8136v);
            AbstractC0268W.m775i0(this.f8134u, new C1605b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f8132t) {
                setPlaceholderTextEnabled(true);
            }
            this.f8130s = charSequence;
        }
        m8817z0();
    }

    public void setPlaceholderTextAppearance(int i3) {
        this.f8138w = i3;
        TextView textView = this.f8134u;
        if (textView != null) {
            AbstractC0988i.m4394m(textView, i3);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f8136v != colorStateList) {
            this.f8136v = colorStateList;
            TextView textView = this.f8134u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f8096b.m8731n(charSequence);
    }

    public void setPrefixTextAppearance(int i3) {
        this.f8096b.m8732o(i3);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f8096b.m8733p(colorStateList);
    }

    public void setShapeAppearanceModel(C0641l c0641l) {
        C0637h c0637h = this.f8077G;
        if (c0637h == null || c0637h.m2261H() == c0641l) {
            return;
        }
        this.f8083M = c0641l;
        m8796n();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f8096b.m8734q(z2);
    }

    public void setStartIconContentDescription(int i3) {
        setStartIconContentDescription(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setStartIconDrawable(int i3) {
        setStartIconDrawable(i3 != 0 ? AbstractC1832a.m9609b(getContext(), i3) : null);
    }

    public void setStartIconMinSize(int i3) {
        this.f8096b.m8737t(i3);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8096b.m8738u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8096b.m8739v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f8096b.m8740w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f8096b.m8741x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f8096b.m8742y(mode);
    }

    public void setStartIconVisible(boolean z2) {
        this.f8096b.m8743z(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f8098c.m8957p0(charSequence);
    }

    public void setSuffixTextAppearance(int i3) {
        this.f8098c.m8959q0(i3);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f8098c.m8961r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C1608e c1608e) {
        EditText editText = this.f8102e;
        if (editText != null) {
            AbstractC0268W.m775i0(editText, c1608e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8099c0) {
            this.f8099c0 = typeface;
            this.f8139w0.m8364p0(typeface);
            this.f8114k.m9012N(typeface);
            TextView textView = this.f8124p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    void m8833w0(boolean z2) {
        m8813x0(z2, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f8066D0;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i4), attributeSet, i3);
        this.f8106g = -1;
        this.f8108h = -1;
        this.f8110i = -1;
        this.f8112j = -1;
        this.f8114k = new C1632v(this);
        this.f8122o = new InterfaceC1609f() { // from class: com.google.android.material.textfield.J
            @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1609f
            /* JADX INFO: renamed from: a */
            public final int mo8751a(Editable editable) {
                return TextInputLayout.m8779c(editable);
            }
        };
        this.f8093W = new Rect();
        this.f8095a0 = new Rect();
        this.f8097b0 = new RectF();
        this.f8105f0 = new LinkedHashSet();
        C1530a c1530a = new C1530a(this);
        this.f8139w0 = c1530a;
        this.f8073C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f8094a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AbstractC0176a.f1125a;
        c1530a.m8362o0(timeInterpolator);
        c1530a.m8356l0(timeInterpolator);
        c1530a.m8345X(8388659);
        int[] iArr = AbstractC0150k.f727O6;
        int i5 = AbstractC0150k.f946l7;
        int i6 = AbstractC0150k.f926j7;
        int i7 = AbstractC0150k.f629D7;
        int i8 = AbstractC0150k.f674I7;
        int i9 = AbstractC0150k.f719N7;
        C0888e0 c0888e0M8489j = AbstractC1546q.m8489j(context2, attributeSet, iArr, i3, i4, i5, i6, i7, i8, i9);
        C1592A c1592a = new C1592A(this, c0888e0M8489j);
        this.f8096b = c1592a;
        this.f8074D = c0888e0M8489j.m3766a(AbstractC0150k.f701L7, true);
        setHint(c0888e0M8489j.m3781p(AbstractC0150k.f772T6));
        this.f8143y0 = c0888e0M8489j.m3766a(AbstractC0150k.f692K7, true);
        this.f8141x0 = c0888e0M8489j.m3766a(AbstractC0150k.f647F7, true);
        int i10 = AbstractC0150k.f790V6;
        if (c0888e0M8489j.m3784s(i10)) {
            setMinEms(c0888e0M8489j.m3776k(i10, -1));
        } else {
            int i11 = AbstractC0150k.f763S6;
            if (c0888e0M8489j.m3784s(i11)) {
                setMinWidth(c0888e0M8489j.m3771f(i11, -1));
            }
        }
        int i12 = AbstractC0150k.f781U6;
        if (c0888e0M8489j.m3784s(i12)) {
            setMaxEms(c0888e0M8489j.m3776k(i12, -1));
        } else {
            int i13 = AbstractC0150k.f754R6;
            if (c0888e0M8489j.m3784s(i13)) {
                setMaxWidth(c0888e0M8489j.m3771f(i13, -1));
            }
        }
        this.f8083M = C0641l.m2308e(context2, attributeSet, i3, i4).m2351m();
        this.f8085O = context2.getResources().getDimensionPixelOffset(AbstractC0142c.f442y0);
        this.f8087Q = c0888e0M8489j.m3770e(AbstractC0150k.f817Y6, 0);
        this.f8100d = getResources().getDimensionPixelSize(AbstractC0142c.f367B);
        this.f8089S = c0888e0M8489j.m3771f(AbstractC0150k.f886f7, context2.getResources().getDimensionPixelSize(AbstractC0142c.f444z0));
        this.f8090T = c0888e0M8489j.m3771f(AbstractC0150k.f896g7, context2.getResources().getDimensionPixelSize(AbstractC0142c.f366A0));
        this.f8088R = this.f8089S;
        float fM3769d = c0888e0M8489j.m3769d(AbstractC0150k.f856c7, -1.0f);
        float fM3769d2 = c0888e0M8489j.m3769d(AbstractC0150k.f846b7, -1.0f);
        float fM3769d3 = c0888e0M8489j.m3769d(AbstractC0150k.f826Z6, -1.0f);
        float fM3769d4 = c0888e0M8489j.m3769d(AbstractC0150k.f836a7, -1.0f);
        C0641l.b bVarM2326w = this.f8083M.m2326w();
        if (fM3769d >= 0.0f) {
            bVarM2326w.m2345C(fM3769d);
        }
        if (fM3769d2 >= 0.0f) {
            bVarM2326w.m2349G(fM3769d2);
        }
        if (fM3769d3 >= 0.0f) {
            bVarM2326w.m2362y(fM3769d3);
        }
        if (fM3769d4 >= 0.0f) {
            bVarM2326w.m2358u(fM3769d4);
        }
        this.f8083M = bVarM2326w.m2351m();
        ColorStateList colorStateListM2078b = AbstractC0557c.m2078b(context2, c0888e0M8489j, AbstractC0150k.f799W6);
        if (colorStateListM2078b != null) {
            int defaultColor = colorStateListM2078b.getDefaultColor();
            this.f8125p0 = defaultColor;
            this.f8092V = defaultColor;
            if (colorStateListM2078b.isStateful()) {
                this.f8127q0 = colorStateListM2078b.getColorForState(new int[]{-16842910}, -1);
                this.f8129r0 = colorStateListM2078b.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f8131s0 = colorStateListM2078b.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f8129r0 = this.f8125p0;
                ColorStateList colorStateListM9608a = AbstractC1832a.m9608a(context2, AbstractC0141b.f361c);
                this.f8127q0 = colorStateListM9608a.getColorForState(new int[]{-16842910}, -1);
                this.f8131s0 = colorStateListM9608a.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f8092V = 0;
            this.f8125p0 = 0;
            this.f8127q0 = 0;
            this.f8129r0 = 0;
            this.f8131s0 = 0;
        }
        int i14 = AbstractC0150k.f745Q6;
        if (c0888e0M8489j.m3784s(i14)) {
            ColorStateList colorStateListM3768c = c0888e0M8489j.m3768c(i14);
            this.f8115k0 = colorStateListM3768c;
            this.f8113j0 = colorStateListM3768c;
        }
        int i15 = AbstractC0150k.f866d7;
        ColorStateList colorStateListM2078b2 = AbstractC0557c.m2078b(context2, c0888e0M8489j, i15);
        this.f8121n0 = c0888e0M8489j.m3767b(i15, 0);
        this.f8117l0 = AbstractC0966b.getColor(context2, AbstractC0141b.f362d);
        this.f8133t0 = AbstractC0966b.getColor(context2, AbstractC0141b.f363e);
        this.f8119m0 = AbstractC0966b.getColor(context2, AbstractC0141b.f364f);
        if (colorStateListM2078b2 != null) {
            setBoxStrokeColorStateList(colorStateListM2078b2);
        }
        int i16 = AbstractC0150k.f876e7;
        if (c0888e0M8489j.m3784s(i16)) {
            setBoxStrokeErrorColor(AbstractC0557c.m2078b(context2, c0888e0M8489j, i16));
        }
        if (c0888e0M8489j.m3779n(i9, -1) != -1) {
            setHintTextAppearance(c0888e0M8489j.m3779n(i9, 0));
        }
        this.f8070B = c0888e0M8489j.m3768c(AbstractC0150k.f966n7);
        this.f8072C = c0888e0M8489j.m3768c(AbstractC0150k.f976o7);
        int iM3779n = c0888e0M8489j.m3779n(i7, 0);
        CharSequence charSequenceM3781p = c0888e0M8489j.m3781p(AbstractC0150k.f1067y7);
        int iM3776k = c0888e0M8489j.m3776k(AbstractC0150k.f1058x7, 1);
        boolean zM3766a = c0888e0M8489j.m3766a(AbstractC0150k.f1076z7, false);
        int iM3779n2 = c0888e0M8489j.m3779n(i8, 0);
        boolean zM3766a2 = c0888e0M8489j.m3766a(AbstractC0150k.f665H7, false);
        CharSequence charSequenceM3781p2 = c0888e0M8489j.m3781p(AbstractC0150k.f656G7);
        int iM3779n3 = c0888e0M8489j.m3779n(AbstractC0150k.f791V7, 0);
        CharSequence charSequenceM3781p3 = c0888e0M8489j.m3781p(AbstractC0150k.f782U7);
        boolean zM3766a3 = c0888e0M8489j.m3766a(AbstractC0150k.f906h7, false);
        setCounterMaxLength(c0888e0M8489j.m3776k(AbstractC0150k.f916i7, -1));
        this.f8128r = c0888e0M8489j.m3779n(i5, 0);
        this.f8126q = c0888e0M8489j.m3779n(i6, 0);
        setBoxBackgroundMode(c0888e0M8489j.m3776k(AbstractC0150k.f808X6, 0));
        setErrorContentDescription(charSequenceM3781p);
        setErrorAccessibilityLiveRegion(iM3776k);
        setCounterOverflowTextAppearance(this.f8126q);
        setHelperTextTextAppearance(iM3779n2);
        setErrorTextAppearance(iM3779n);
        setCounterTextAppearance(this.f8128r);
        setPlaceholderText(charSequenceM3781p3);
        setPlaceholderTextAppearance(iM3779n3);
        int i17 = AbstractC0150k.f638E7;
        if (c0888e0M8489j.m3784s(i17)) {
            setErrorTextColor(c0888e0M8489j.m3768c(i17));
        }
        int i18 = AbstractC0150k.f683J7;
        if (c0888e0M8489j.m3784s(i18)) {
            setHelperTextColor(c0888e0M8489j.m3768c(i18));
        }
        int i19 = AbstractC0150k.f728O7;
        if (c0888e0M8489j.m3784s(i19)) {
            setHintTextColor(c0888e0M8489j.m3768c(i19));
        }
        int i20 = AbstractC0150k.f956m7;
        if (c0888e0M8489j.m3784s(i20)) {
            setCounterTextColor(c0888e0M8489j.m3768c(i20));
        }
        int i21 = AbstractC0150k.f936k7;
        if (c0888e0M8489j.m3784s(i21)) {
            setCounterOverflowTextColor(c0888e0M8489j.m3768c(i21));
        }
        int i22 = AbstractC0150k.f800W7;
        if (c0888e0M8489j.m3784s(i22)) {
            setPlaceholderTextColor(c0888e0M8489j.m3768c(i22));
        }
        C1629s c1629s = new C1629s(this, c0888e0M8489j);
        this.f8098c = c1629s;
        boolean zM3766a4 = c0888e0M8489j.m3766a(AbstractC0150k.f736P6, true);
        setHintMaxLines(c0888e0M8489j.m3776k(AbstractC0150k.f710M7, 1));
        c0888e0M8489j.m3786x();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(c1592a);
        frameLayout.addView(c1629s);
        addView(frameLayout);
        setEnabled(zM3766a4);
        setHelperTextEnabled(zM3766a2);
        setErrorEnabled(zM3766a);
        setCounterEnabled(zM3766a3);
        setHelperText(charSequenceM3781p2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f8098c.m8926Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f8098c.m8928S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f8098c.m8938c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f8098c.m8945j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f8098c.m8949l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f8096b.m8735r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f8096b.m8736s(drawable);
    }

    public void setHint(int i3) {
        setHint(i3 != 0 ? getResources().getText(i3) : null);
    }
}
