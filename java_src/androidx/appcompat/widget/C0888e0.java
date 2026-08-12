package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p095e.AbstractC1832a;
import p164y.AbstractC2538k;

/* JADX INFO: renamed from: androidx.appcompat.widget.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C0888e0 {

    /* JADX INFO: renamed from: a */
    private final Context f3654a;

    /* JADX INFO: renamed from: b */
    private final TypedArray f3655b;

    /* JADX INFO: renamed from: c */
    private TypedValue f3656c;

    private C0888e0(Context context, TypedArray typedArray) {
        this.f3654a = context;
        this.f3655b = typedArray;
    }

    /* JADX INFO: renamed from: t */
    public static C0888e0 m3763t(Context context, int i3, int[] iArr) {
        return new C0888e0(context, context.obtainStyledAttributes(i3, iArr));
    }

    /* JADX INFO: renamed from: u */
    public static C0888e0 m3764u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0888e0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: v */
    public static C0888e0 m3765v(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4) {
        return new C0888e0(context, context.obtainStyledAttributes(attributeSet, iArr, i3, i4));
    }

    /* JADX INFO: renamed from: a */
    public boolean m3766a(int i3, boolean z2) {
        return this.f3655b.getBoolean(i3, z2);
    }

    /* JADX INFO: renamed from: b */
    public int m3767b(int i3, int i4) {
        return this.f3655b.getColor(i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m3768c(int i3) {
        int resourceId;
        ColorStateList colorStateListM9608a;
        return (!this.f3655b.hasValue(i3) || (resourceId = this.f3655b.getResourceId(i3, 0)) == 0 || (colorStateListM9608a = AbstractC1832a.m9608a(this.f3654a, resourceId)) == null) ? this.f3655b.getColorStateList(i3) : colorStateListM9608a;
    }

    /* JADX INFO: renamed from: d */
    public float m3769d(int i3, float f3) {
        return this.f3655b.getDimension(i3, f3);
    }

    /* JADX INFO: renamed from: e */
    public int m3770e(int i3, int i4) {
        return this.f3655b.getDimensionPixelOffset(i3, i4);
    }

    /* JADX INFO: renamed from: f */
    public int m3771f(int i3, int i4) {
        return this.f3655b.getDimensionPixelSize(i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public Drawable m3772g(int i3) {
        int resourceId;
        return (!this.f3655b.hasValue(i3) || (resourceId = this.f3655b.getResourceId(i3, 0)) == 0) ? this.f3655b.getDrawable(i3) : AbstractC1832a.m9609b(this.f3654a, resourceId);
    }

    /* JADX INFO: renamed from: h */
    public Drawable m3773h(int i3) {
        int resourceId;
        if (!this.f3655b.hasValue(i3) || (resourceId = this.f3655b.getResourceId(i3, 0)) == 0) {
            return null;
        }
        return C0897j.m3813b().m3818d(this.f3654a, resourceId, true);
    }

    /* JADX INFO: renamed from: i */
    public float m3774i(int i3, float f3) {
        return this.f3655b.getFloat(i3, f3);
    }

    /* JADX INFO: renamed from: j */
    public Typeface m3775j(int i3, int i4, AbstractC2538k.e eVar) {
        int resourceId = this.f3655b.getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3656c == null) {
            this.f3656c = new TypedValue();
        }
        return AbstractC2538k.m12143i(this.f3654a, resourceId, this.f3656c, i4, eVar);
    }

    /* JADX INFO: renamed from: k */
    public int m3776k(int i3, int i4) {
        return this.f3655b.getInt(i3, i4);
    }

    /* JADX INFO: renamed from: l */
    public int m3777l(int i3, int i4) {
        return this.f3655b.getInteger(i3, i4);
    }

    /* JADX INFO: renamed from: m */
    public int m3778m(int i3, int i4) {
        return this.f3655b.getLayoutDimension(i3, i4);
    }

    /* JADX INFO: renamed from: n */
    public int m3779n(int i3, int i4) {
        return this.f3655b.getResourceId(i3, i4);
    }

    /* JADX INFO: renamed from: o */
    public String m3780o(int i3) {
        return this.f3655b.getString(i3);
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m3781p(int i3) {
        return this.f3655b.getText(i3);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence[] m3782q(int i3) {
        return this.f3655b.getTextArray(i3);
    }

    /* JADX INFO: renamed from: r */
    public TypedArray m3783r() {
        return this.f3655b;
    }

    /* JADX INFO: renamed from: s */
    public boolean m3784s(int i3) {
        return this.f3655b.hasValue(i3);
    }

    /* JADX INFO: renamed from: w */
    public TypedValue m3785w(int i3) {
        return this.f3655b.peekValue(i3);
    }

    /* JADX INFO: renamed from: x */
    public void m3786x() {
        this.f3655b.recycle();
    }
}
