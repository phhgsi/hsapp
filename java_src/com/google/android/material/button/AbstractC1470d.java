package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.common.api.Api;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.AbstractC1549t;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p076Z0.C0630a;
import p076Z0.C0641l;
import p076Z0.C0648s;
import p076Z0.C0649t;
import p076Z0.C0650u;
import p076Z0.InterfaceC0633d;
import p089c1.AbstractC1313a;

/* JADX INFO: renamed from: com.google.android.material.button.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1470d extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private static final int f7232k = AbstractC0149j.f579l;

    /* JADX INFO: renamed from: a */
    private final List f7233a;

    /* JADX INFO: renamed from: b */
    private final List f7234b;

    /* JADX INFO: renamed from: c */
    private final b f7235c;

    /* JADX INFO: renamed from: d */
    private final Comparator f7236d;

    /* JADX INFO: renamed from: e */
    private Integer[] f7237e;

    /* JADX INFO: renamed from: f */
    C0648s f7238f;

    /* JADX INFO: renamed from: g */
    private C0649t f7239g;

    /* JADX INFO: renamed from: h */
    private int f7240h;

    /* JADX INFO: renamed from: i */
    private C0650u f7241i;

    /* JADX INFO: renamed from: j */
    private boolean f7242j;

    /* JADX INFO: renamed from: com.google.android.material.button.d$b */
    private class b implements MaterialButton.InterfaceC1464b {
        private b() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC1464b
        /* JADX INFO: renamed from: a */
        public void mo7699a(MaterialButton materialButton, boolean z2) {
            AbstractC1470d.this.invalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1470d(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f7232k;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i4), attributeSet, i3);
        this.f7233a = new ArrayList();
        this.f7234b = new ArrayList();
        this.f7235c = new b();
        this.f7236d = new Comparator() { // from class: com.google.android.material.button.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC1470d.m7713a(this.f7231d, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.f7242j = true;
        Context context2 = getContext();
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context2, attributeSet, AbstractC0150k.f795W2, i3, i4, new int[0]);
        int i5 = AbstractC0150k.f822Z2;
        if (typedArrayM8488i.hasValue(i5)) {
            this.f7241i = C0650u.m2478b(context2, typedArrayM8488i, i5);
        }
        int i6 = AbstractC0150k.f842b3;
        if (typedArrayM8488i.hasValue(i6)) {
            C0649t c0649tM2455b = C0649t.m2455b(context2, typedArrayM8488i, i6);
            this.f7239g = c0649tM2455b;
            if (c0649tM2455b == null) {
                this.f7239g = new C0649t.b(C0641l.m2305b(context2, typedArrayM8488i.getResourceId(i6, 0), typedArrayM8488i.getResourceId(AbstractC0150k.f852c3, 0)).m2351m()).m2475j();
            }
        }
        int i7 = AbstractC0150k.f832a3;
        if (typedArrayM8488i.hasValue(i7)) {
            this.f7238f = C0648s.m2447c(context2, typedArrayM8488i, i7, new C0630a(0.0f));
        }
        this.f7240h = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f813Y2, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM8488i.getBoolean(AbstractC0150k.f804X2, true));
        typedArrayM8488i.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m7713a(AbstractC1470d abstractC1470d, MaterialButton materialButton, MaterialButton materialButton2) {
        abstractC1470d.getClass();
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(abstractC1470d.indexOfChild(materialButton), abstractC1470d.indexOfChild(materialButton2));
    }

    /* JADX INFO: renamed from: b */
    private void m7714b() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i3 = firstVisibleChildIndex + 1; i3 < getChildCount(); i3++) {
            MaterialButton materialButtonM7725f = m7725f(i3);
            MaterialButton materialButtonM7725f2 = m7725f(i3 - 1);
            if (this.f7240h <= 0) {
                iMin = Math.min(materialButtonM7725f.getStrokeWidth(), materialButtonM7725f2.getStrokeWidth());
                materialButtonM7725f.setShouldDrawSurfaceColorStroke(true);
                materialButtonM7725f2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButtonM7725f.setShouldDrawSurfaceColorStroke(false);
                materialButtonM7725f2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsM7724d = m7724d(materialButtonM7725f);
            if (getOrientation() == 0) {
                layoutParamsM7724d.setMarginEnd(0);
                layoutParamsM7724d.setMarginStart(this.f7240h - iMin);
                layoutParamsM7724d.topMargin = 0;
            } else {
                layoutParamsM7724d.bottomMargin = 0;
                layoutParamsM7724d.topMargin = this.f7240h - iMin;
                layoutParamsM7724d.setMarginStart(0);
            }
            materialButtonM7725f.setLayoutParams(layoutParamsM7724d);
        }
        m7722m(firstVisibleChildIndex);
    }

    /* JADX INFO: renamed from: c */
    private void m7715c() {
        if (this.f7241i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i3 = firstVisibleChildIndex; i3 <= lastVisibleChildIndex; i3++) {
            if (m7720j(i3)) {
                int iM7716e = m7716e(i3);
                if (i3 != firstVisibleChildIndex && i3 != lastVisibleChildIndex) {
                    iM7716e /= 2;
                }
                iMin = Math.min(iMin, iM7716e);
            }
        }
        int i4 = firstVisibleChildIndex;
        while (i4 <= lastVisibleChildIndex) {
            if (m7720j(i4)) {
                m7725f(i4).setSizeChange(this.f7241i);
                m7725f(i4).setWidthChangeMax((i4 == firstVisibleChildIndex || i4 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: e */
    private int m7716e(int i3) {
        if (!m7720j(i3) || this.f7241i == null) {
            return 0;
        }
        int iMax = Math.max(0, this.f7241i.m2483c(m7725f(i3).getWidth()));
        MaterialButton materialButtonM7719i = m7719i(i3);
        int allowedWidthDecrease = materialButtonM7719i == null ? 0 : materialButtonM7719i.getAllowedWidthDecrease();
        MaterialButton materialButtonM7717g = m7717g(i3);
        return Math.min(iMax, allowedWidthDecrease + (materialButtonM7717g != null ? materialButtonM7717g.getAllowedWidthDecrease() : 0));
    }

    /* JADX INFO: renamed from: g */
    private MaterialButton m7717g(int i3) {
        int childCount = getChildCount();
        do {
            i3++;
            if (i3 >= childCount) {
                return null;
            }
        } while (!m7720j(i3));
        return m7725f(i3);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (m7720j(i3)) {
                return i3;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m7720j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    private C0649t.b m7718h(boolean z2, boolean z3, int i3) {
        C0649t c0649t = this.f7239g;
        if (c0649t == null || (!z2 && !z3)) {
            c0649t = (C0649t) this.f7234b.get(i3);
        }
        return c0649t == null ? new C0649t.b((C0641l) this.f7233a.get(i3)) : c0649t.m2462i();
    }

    /* JADX INFO: renamed from: i */
    private MaterialButton m7719i(int i3) {
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (m7720j(i4)) {
                return m7725f(i4);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private boolean m7720j(int i3) {
        return getChildAt(i3).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: l */
    private void m7721l() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            m7725f(i3).m7692o();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m7722m(int i3) {
        if (getChildCount() == 0 || i3 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m7725f(i3).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m7723n() {
        TreeMap treeMap = new TreeMap(this.f7236d);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            treeMap.put(m7725f(i3), Integer.valueOf(i3));
        }
        this.f7237e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        m7721l();
        this.f7242j = true;
        super.addView(view, i3, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f7235c);
        this.f7233a.add(materialButton.getShapeAppearanceModel());
        this.f7234b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    /* JADX INFO: renamed from: d */
    LinearLayout.LayoutParams m7724d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m7723n();
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: f */
    MaterialButton m7725f(int i3) {
        return (MaterialButton) getChildAt(i3);
    }

    public C0650u getButtonSizeChange() {
        return this.f7241i;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i3, int i4) {
        Integer[] numArr = this.f7237e;
        if (numArr != null && i4 < numArr.length) {
            return numArr[i4].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i4;
    }

    public InterfaceC0633d getInnerCornerSize() {
        return this.f7238f.m2452e();
    }

    public C0648s getInnerCornerSizeStateList() {
        return this.f7238f;
    }

    public C0641l getShapeAppearance() {
        C0649t c0649t = this.f7239g;
        if (c0649t == null) {
            return null;
        }
        return c0649t.m2459c(true);
    }

    public int getSpacing() {
        return this.f7240h;
    }

    public C0649t getStateListShapeAppearance() {
        return this.f7239g;
    }

    /* JADX INFO: renamed from: k */
    void m7726k(MaterialButton materialButton, int i3) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton materialButtonM7719i = m7719i(iIndexOfChild);
        MaterialButton materialButtonM7717g = m7717g(iIndexOfChild);
        if (materialButtonM7719i == null && materialButtonM7717g == null) {
            return;
        }
        if (materialButtonM7719i == null) {
            materialButtonM7717g.setDisplayedWidthDecrease(i3);
        }
        if (materialButtonM7717g == null) {
            materialButtonM7719i.setDisplayedWidthDecrease(i3);
        }
        if (materialButtonM7719i == null || materialButtonM7717g == null) {
            return;
        }
        materialButtonM7719i.setDisplayedWidthDecrease(i3 / 2);
        materialButtonM7717g.setDisplayedWidthDecrease((i3 + 1) / 2);
    }

    /* JADX INFO: renamed from: o */
    void m7727o() {
        int iM2458h;
        if (!(this.f7238f == null && this.f7239g == null) && this.f7242j) {
            this.f7242j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i3 = 0;
            while (i3 < childCount) {
                MaterialButton materialButtonM7725f = m7725f(i3);
                if (materialButtonM7725f.getVisibility() != 8) {
                    boolean z2 = i3 == firstVisibleChildIndex;
                    boolean z3 = i3 == lastVisibleChildIndex;
                    C0649t.b bVarM7718h = m7718h(z2, z3, i3);
                    boolean z4 = getOrientation() == 0;
                    boolean zM8502g = AbstractC1549t.m8502g(this);
                    if (z4) {
                        iM2458h = z2 ? 5 : 0;
                        if (z3) {
                            iM2458h |= 10;
                        }
                        if (zM8502g) {
                            iM2458h = C0649t.m2458h(iM2458h);
                        }
                    } else {
                        iM2458h = z2 ? 3 : 0;
                        if (z3) {
                            iM2458h |= 12;
                        }
                    }
                    C0649t c0649tM2475j = bVarM7718h.m2476n(this.f7238f, ~iM2458h).m2475j();
                    if (c0649tM2475j.m2461f()) {
                        materialButtonM7725f.setStateListShapeAppearanceModel(c0649tM2475j);
                    } else {
                        materialButtonM7725f.setShapeAppearanceModel(c0649tM2475j.m2459c(true));
                    }
                }
                i3++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        if (z2) {
            m7721l();
            m7715c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        m7727o();
        m7714b();
        super.onMeasure(i3, i4);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f7233a.remove(iIndexOfChild);
            this.f7234b.remove(iIndexOfChild);
        }
        this.f7242j = true;
        m7727o();
        m7721l();
        m7714b();
    }

    public void setButtonSizeChange(C0650u c0650u) {
        if (this.f7241i != c0650u) {
            this.f7241i = c0650u;
            m7715c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            m7725f(i3).setEnabled(z2);
        }
    }

    public void setInnerCornerSize(InterfaceC0633d interfaceC0633d) {
        this.f7238f = C0648s.m2446b(interfaceC0633d);
        this.f7242j = true;
        m7727o();
        invalidate();
    }

    public void setInnerCornerSizeStateList(C0648s c0648s) {
        this.f7238f = c0648s;
        this.f7242j = true;
        m7727o();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i3) {
        if (getOrientation() != i3) {
            this.f7242j = true;
        }
        super.setOrientation(i3);
    }

    public void setShapeAppearance(C0641l c0641l) {
        this.f7239g = new C0649t.b(c0641l).m2475j();
        this.f7242j = true;
        m7727o();
        invalidate();
    }

    public void setSpacing(int i3) {
        this.f7240h = i3;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C0649t c0649t) {
        this.f7239g = c0649t;
        this.f7242j = true;
        m7727o();
        invalidate();
    }
}
