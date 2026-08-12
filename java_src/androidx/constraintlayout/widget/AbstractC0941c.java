package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p146s.C2383e;
import p146s.InterfaceC2387i;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0941c extends View {

    /* JADX INFO: renamed from: a */
    protected int[] f3978a;

    /* JADX INFO: renamed from: b */
    protected int f3979b;

    /* JADX INFO: renamed from: c */
    protected Context f3980c;

    /* JADX INFO: renamed from: d */
    protected InterfaceC2387i f3981d;

    /* JADX INFO: renamed from: e */
    protected boolean f3982e;

    /* JADX INFO: renamed from: f */
    protected String f3983f;

    /* JADX INFO: renamed from: g */
    protected String f3984g;

    /* JADX INFO: renamed from: h */
    private View[] f3985h;

    /* JADX INFO: renamed from: i */
    protected HashMap f3986i;

    public AbstractC0941c(Context context) {
        super(context);
        this.f3978a = new int[32];
        this.f3982e = false;
        this.f3985h = null;
        this.f3986i = new HashMap();
        this.f3980c = context;
        mo4001i(null);
    }

    /* JADX INFO: renamed from: a */
    private void m4034a(String str) {
        if (str == null || str.length() == 0 || this.f3980c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iM4038h = m4038h(strTrim);
        if (iM4038h != 0) {
            this.f3986i.put(Integer.valueOf(iM4038h), strTrim);
            m4035b(iM4038h);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    /* JADX INFO: renamed from: b */
    private void m4035b(int i3) {
        if (i3 == getId()) {
            return;
        }
        int i4 = this.f3979b + 1;
        int[] iArr = this.f3978a;
        if (i4 > iArr.length) {
            this.f3978a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3978a;
        int i5 = this.f3979b;
        iArr2[i5] = i3;
        this.f3979b = i5 + 1;
    }

    /* JADX INFO: renamed from: c */
    private void m4036c(String str) {
        if (str == null || str.length() == 0 || this.f3980c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C0937b) && strTrim.equals(((ConstraintLayout.C0937b) layoutParams).f3903b0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m4035b(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private int m4037g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f3980c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    private int m4038h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iM4037g = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objM4015h = constraintLayout.m4015h(0, str);
            if (objM4015h instanceof Integer) {
                iM4037g = ((Integer) objM4015h).intValue();
            }
        }
        if (iM4037g == 0 && constraintLayout != null) {
            iM4037g = m4037g(constraintLayout, str);
        }
        if (iM4037g == 0) {
            try {
                iM4037g = AbstractC0946h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iM4037g == 0 ? this.f3980c.getResources().getIdentifier(str, "id", this.f3980c.getPackageName()) : iM4037g;
    }

    /* JADX INFO: renamed from: d */
    protected void m4039d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m4040e((ConstraintLayout) parent);
    }

    /* JADX INFO: renamed from: e */
    protected void m4040e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i3 = 0; i3 < this.f3979b; i3++) {
            View viewM4016l = constraintLayout.m4016l(this.f3978a[i3]);
            if (viewM4016l != null) {
                viewM4016l.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewM4016l.setTranslationZ(viewM4016l.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    protected void mo4041f(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3978a, this.f3979b);
    }

    /* JADX INFO: renamed from: i */
    protected void mo4001i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0947i.f4463m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0947i.f4181F1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f3983f = string;
                    setIds(string);
                } else if (index == AbstractC0947i.f4190G1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f3984g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo4002j(C2383e c2383e, boolean z2);

    /* JADX INFO: renamed from: k */
    public void m4042k(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: l */
    public void m4043l(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: m */
    public void m4044m(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: n */
    public void m4045n(ConstraintLayout constraintLayout) {
        String str;
        int iM4037g;
        if (isInEditMode()) {
            setIds(this.f3983f);
        }
        InterfaceC2387i interfaceC2387i = this.f3981d;
        if (interfaceC2387i == null) {
            return;
        }
        interfaceC2387i.mo11468c();
        for (int i3 = 0; i3 < this.f3979b; i3++) {
            int i4 = this.f3978a[i3];
            View viewM4016l = constraintLayout.m4016l(i4);
            if (viewM4016l == null && (iM4037g = m4037g(constraintLayout, (str = (String) this.f3986i.get(Integer.valueOf(i4))))) != 0) {
                this.f3978a[i3] = iM4037g;
                this.f3986i.put(Integer.valueOf(iM4037g), str);
                viewM4016l = constraintLayout.m4016l(iM4037g);
            }
            if (viewM4016l != null) {
                this.f3981d.mo11466a(constraintLayout.m4017p(viewM4016l));
            }
        }
        this.f3981d.mo11467b(constraintLayout.f3852c);
    }

    /* JADX INFO: renamed from: o */
    public void m4046o() {
        if (this.f3981d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0937b) {
            ((ConstraintLayout.C0937b) layoutParams).f3941u0 = (C2383e) this.f3981d;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3983f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3984g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        if (this.f3982e) {
            super.onMeasure(i3, i4);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f3983f = str;
        if (str == null) {
            return;
        }
        int i3 = 0;
        this.f3979b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i3);
            if (iIndexOf == -1) {
                m4034a(str.substring(i3));
                return;
            } else {
                m4034a(str.substring(i3, iIndexOf));
                i3 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f3984g = str;
        if (str == null) {
            return;
        }
        int i3 = 0;
        this.f3979b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i3);
            if (iIndexOf == -1) {
                m4036c(str.substring(i3));
                return;
            } else {
                m4036c(str.substring(i3, iIndexOf));
                i3 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3983f = null;
        this.f3979b = 0;
        for (int i3 : iArr) {
            m4035b(i3);
        }
    }

    @Override // android.view.View
    public void setTag(int i3, Object obj) {
        super.setTag(i3, obj);
        if (obj == null && this.f3983f == null) {
            m4035b(i3);
        }
    }

    public AbstractC0941c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3978a = new int[32];
        this.f3982e = false;
        this.f3985h = null;
        this.f3986i = new HashMap();
        this.f3980c = context;
        mo4001i(attributeSet);
    }
}
