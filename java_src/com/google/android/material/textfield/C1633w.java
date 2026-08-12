package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0841S;
import androidx.appcompat.widget.C0883c;
import com.google.android.material.internal.AbstractC1535f;
import com.google.android.material.internal.AbstractC1546q;
import java.util.List;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0146g;
import p016F0.AbstractC0150k;
import p043O0.AbstractC0450a;
import p067W0.AbstractC0557c;
import p076Z0.C0637h;
import p089c1.AbstractC1313a;
import p091d.AbstractC1760a;
import p091d.AbstractC1768i;

/* JADX INFO: renamed from: com.google.android.material.textfield.w */
/* JADX INFO: loaded from: classes.dex */
public class C1633w extends C0883c {

    /* JADX INFO: renamed from: e */
    private final C0841S f8263e;

    /* JADX INFO: renamed from: f */
    private final AccessibilityManager f8264f;

    /* JADX INFO: renamed from: g */
    private final Rect f8265g;

    /* JADX INFO: renamed from: h */
    private final int f8266h;

    /* JADX INFO: renamed from: i */
    private final float f8267i;

    /* JADX INFO: renamed from: j */
    private ColorStateList f8268j;

    /* JADX INFO: renamed from: k */
    private int f8269k;

    /* JADX INFO: renamed from: l */
    private ColorStateList f8270l;

    /* JADX INFO: renamed from: com.google.android.material.textfield.w$a */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
            C1633w c1633w = C1633w.this;
            Object objM3536v = i3 < 0 ? c1633w.f8263e.m3536v() : c1633w.getAdapter().getItem(i3);
            C1633w c1633w2 = C1633w.this;
            c1633w2.setText(c1633w2.convertSelectionToString(objM3536v), false);
            AdapterView.OnItemClickListener onItemClickListener = C1633w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i3 < 0) {
                    view = C1633w.this.f8263e.m3539y();
                    i3 = C1633w.this.f8263e.m3538x();
                    j3 = C1633w.this.f8263e.m3537w();
                }
                onItemClickListener.onItemClick(C1633w.this.f8263e.mo3088g(), view, i3, j3);
            }
            C1633w.this.f8263e.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.w$b */
    private class b extends ArrayAdapter {

        /* JADX INFO: renamed from: a */
        private ColorStateList f8272a;

        /* JADX INFO: renamed from: b */
        private ColorStateList f8273b;

        b(Context context, int i3, String[] strArr) {
            super(context, i3, strArr);
            m9045f();
        }

        /* JADX INFO: renamed from: a */
        private ColorStateList m9040a() {
            if (!m9042c() || !m9043d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{AbstractC0450a.m1637i(C1633w.this.f8269k, C1633w.this.f8270l.getColorForState(iArr2, 0)), AbstractC0450a.m1637i(C1633w.this.f8269k, C1633w.this.f8270l.getColorForState(iArr, 0)), C1633w.this.f8269k});
        }

        /* JADX INFO: renamed from: b */
        private Drawable m9041b() {
            if (!m9042c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(C1633w.this.f8269k);
            if (this.f8273b == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f8272a);
            return new RippleDrawable(this.f8273b, colorDrawable, null);
        }

        /* JADX INFO: renamed from: c */
        private boolean m9042c() {
            return C1633w.this.f8269k != 0;
        }

        /* JADX INFO: renamed from: d */
        private boolean m9043d() {
            return C1633w.this.f8270l != null;
        }

        /* JADX INFO: renamed from: e */
        private ColorStateList m9044e() {
            if (!m9043d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{C1633w.this.f8270l.getColorForState(iArr, 0), 0});
        }

        /* JADX INFO: renamed from: f */
        void m9045f() {
            this.f8273b = m9044e();
            this.f8272a = m9040a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i3, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i3, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(C1633w.this.getText().toString().contentEquals(textView.getText()) ? m9041b() : null);
            }
            return view2;
        }
    }

    public C1633w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8712m);
    }

    /* JADX INFO: renamed from: f */
    private TextInputLayout m9034f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private boolean m9035g() {
        return m9037i() || m9036h();
    }

    /* JADX INFO: renamed from: h */
    private boolean m9036h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f8264f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f8264f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private boolean m9037i() {
        AccessibilityManager accessibilityManager = this.f8264f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: renamed from: j */
    private int m9038j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutM9034f = m9034f();
        int i3 = 0;
        if (adapter == null || textInputLayoutM9034f == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f8263e.m3538x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutM9034f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableM3528f = this.f8263e.m3528f();
        if (drawableM3528f != null) {
            drawableM3528f.getPadding(this.f8265g);
            Rect rect = this.f8265g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutM9034f.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: renamed from: k */
    private void m9039k() {
        TextInputLayout textInputLayoutM9034f = m9034f();
        if (textInputLayoutM9034f != null) {
            textInputLayoutM9034f.m8832s0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (m9035g()) {
            this.f8263e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f8268j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM9034f = m9034f();
        return (textInputLayoutM9034f == null || !textInputLayoutM9034f.m8823T()) ? super.getHint() : textInputLayoutM9034f.getHint();
    }

    public float getPopupElevation() {
        return this.f8267i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f8269k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f8270l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM9034f = m9034f();
        if (textInputLayoutM9034f != null && textInputLayoutM9034f.m8823T() && super.getHint() == null && AbstractC1535f.m8383b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8263e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m9038j()), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z2) {
        if (m9035g()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f8263e.mo3354p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0841S c0841s = this.f8263e;
        if (c0841s != null) {
            c0841s.m3529i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i3) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i3));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f8268j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0637h) {
            ((C0637h) dropDownBackground).m2274c0(this.f8268j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f8263e.m3522M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i3) {
        super.setRawInputType(i3);
        m9039k();
    }

    public void setSimpleItemSelectedColor(int i3) {
        this.f8269k = i3;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).m9045f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f8270l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).m9045f();
        }
    }

    public void setSimpleItems(int i3) {
        setSimpleItems(getResources().getStringArray(i3));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (m9035g()) {
            this.f8263e.mo3086e();
        } else {
            super.showDropDown();
        }
    }

    public C1633w(Context context, AttributeSet attributeSet, int i3) {
        super(AbstractC1313a.m6668d(context, attributeSet, i3, 0), attributeSet, i3);
        this.f8265g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context2, attributeSet, AbstractC0150k.f990q2, i3, AbstractC1768i.f8875g, new int[0]);
        int i4 = AbstractC0150k.f999r2;
        if (typedArrayM8488i.hasValue(i4) && typedArrayM8488i.getInt(i4, 0) == 0) {
            setKeyListener(null);
        }
        this.f8266h = typedArrayM8488i.getResourceId(AbstractC0150k.f1026u2, AbstractC0146g.f527r);
        this.f8267i = typedArrayM8488i.getDimensionPixelOffset(AbstractC0150k.f1008s2, AbstractC0142c.f422o0);
        int i5 = AbstractC0150k.f1017t2;
        if (typedArrayM8488i.hasValue(i5)) {
            this.f8268j = ColorStateList.valueOf(typedArrayM8488i.getColor(i5, 0));
        }
        this.f8269k = typedArrayM8488i.getColor(AbstractC0150k.f1035v2, 0);
        this.f8270l = AbstractC0557c.m2077a(context2, typedArrayM8488i, AbstractC0150k.f1044w2);
        this.f8264f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0841S c0841s = new C0841S(context2);
        this.f8263e = c0841s;
        c0841s.m3519J(true);
        c0841s.m3513D(this);
        c0841s.m3518I(2);
        c0841s.mo3354p(getAdapter());
        c0841s.m3521L(new a());
        int i6 = AbstractC0150k.f1053x2;
        if (typedArrayM8488i.hasValue(i6)) {
            setSimpleItems(typedArrayM8488i.getResourceId(i6, 0));
        }
        typedArrayM8488i.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f8266h, strArr));
    }
}
