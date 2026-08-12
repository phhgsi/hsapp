package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.internal.AbstractC1546q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p030K.C0356y;
import p076Z0.C0630a;
import p076Z0.C0648s;
import p089c1.AbstractC1313a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends AbstractC1470d {

    /* JADX INFO: renamed from: r */
    private static final int f7221r = AbstractC0149j.f589v;

    /* JADX INFO: renamed from: l */
    private final LinkedHashSet f7222l;

    /* JADX INFO: renamed from: m */
    private boolean f7223m;

    /* JADX INFO: renamed from: n */
    private boolean f7224n;

    /* JADX INFO: renamed from: o */
    private boolean f7225o;

    /* JADX INFO: renamed from: p */
    private final int f7226p;

    /* JADX INFO: renamed from: q */
    private Set f7227q;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    class C1465a extends C0273a {
        C1465a() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            c0356y.m1292v0(C0356y.g.m1319a(0, 1, MaterialButtonToggleGroup.this.m7704u(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public interface InterfaceC1466b {
        /* JADX INFO: renamed from: a */
        void mo7712a(MaterialButtonToggleGroup materialButtonToggleGroup, int i3, boolean z2);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f350r);
    }

    private String getChildrenA11yClassName() {
        return (this.f7224n ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof MaterialButton) && m7700j(i4)) {
                i3++;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: j */
    private boolean m7700j(int i3) {
        return getChildAt(i3).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: r */
    private void m7702r(int i3, boolean z2) {
        if (i3 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i3);
            return;
        }
        HashSet hashSet = new HashSet(this.f7227q);
        if (z2 && !hashSet.contains(Integer.valueOf(i3))) {
            if (this.f7224n && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i3));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i3))) {
                return;
            }
            if (!this.f7225o || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i3));
            }
        }
        m7706y(hashSet);
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    /* JADX INFO: renamed from: t */
    private void m7703t(int i3, boolean z2) {
        Iterator it = this.f7222l.iterator();
        while (it.hasNext()) {
            ((InterfaceC1466b) it.next()).mo7712a(this, i3, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public int m7704u(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == view) {
                return i3;
            }
            if ((getChildAt(i4) instanceof MaterialButton) && m7700j(i4)) {
                i3++;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x */
    private void m7705x(int i3, boolean z2) {
        View viewFindViewById = findViewById(i3);
        if (viewFindViewById instanceof MaterialButton) {
            this.f7223m = true;
            ((MaterialButton) viewFindViewById).setChecked(z2);
            this.f7223m = false;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m7706y(Set set) {
        Set set2 = this.f7227q;
        this.f7227q = new HashSet(set);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = m7725f(i3).getId();
            m7705x(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                m7703t(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    private void m7707z() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            m7725f(i3).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.AbstractC1470d, android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i3, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        m7702r(materialButton.getId(), materialButton.isChecked());
        AbstractC0268W.m775i0(materialButton, new C1465a());
    }

    public int getCheckedButtonId() {
        if (!this.f7224n || this.f7227q.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f7227q.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = m7725f(i3).getId();
            if (this.f7227q.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i3 = this.f7226p;
        if (i3 != -1) {
            m7706y(Collections.singleton(Integer.valueOf(i3)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0356y.m1204V0(accessibilityNodeInfo).m1290u0(C0356y.f.m1318b(1, getVisibleButtonCount(), false, m7710v() ? 1 : 2));
    }

    /* JADX INFO: renamed from: q */
    public void m7708q(InterfaceC1466b interfaceC1466b) {
        this.f7222l.add(interfaceC1466b);
    }

    /* JADX INFO: renamed from: s */
    public void m7709s() {
        m7706y(new HashSet());
    }

    public void setSelectionRequired(boolean z2) {
        this.f7225o = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f7224n != z2) {
            this.f7224n = z2;
            m7709s();
        }
        m7707z();
    }

    /* JADX INFO: renamed from: v */
    public boolean m7710v() {
        return this.f7224n;
    }

    /* JADX INFO: renamed from: w */
    void m7711w(MaterialButton materialButton, boolean z2) {
        if (this.f7223m) {
            return;
        }
        m7702r(materialButton.getId(), z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i3) {
        int i4 = f7221r;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i4), attributeSet, i3);
        this.f7222l = new LinkedHashSet();
        this.f7223m = false;
        this.f7227q = new HashSet();
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(getContext(), attributeSet, AbstractC0150k.f862d3, i3, i4, new int[0]);
        setSingleSelection(typedArrayM8488i.getBoolean(AbstractC0150k.f902h3, false));
        this.f7226p = typedArrayM8488i.getResourceId(AbstractC0150k.f882f3, -1);
        this.f7225o = typedArrayM8488i.getBoolean(AbstractC0150k.f892g3, false);
        if (this.f7238f == null) {
            this.f7238f = C0648s.m2446b(new C0630a(0.0f));
        }
        setEnabled(typedArrayM8488i.getBoolean(AbstractC0150k.f872e3, true));
        typedArrayM8488i.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i3) {
        setSingleSelection(getResources().getBoolean(i3));
    }
}
