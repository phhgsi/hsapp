package p085b1;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0824B;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0150k;
import p067W0.AbstractC0556b;
import p067W0.AbstractC0557c;
import p089c1.AbstractC1313a;

/* JADX INFO: renamed from: b1.a */
/* JADX INFO: loaded from: classes.dex */
public class C1300a extends C0824B {
    public C1300a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX INFO: renamed from: s */
    private void m6616s(Resources.Theme theme, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i3, AbstractC0150k.f883f4);
        int iM6620w = m6620w(getContext(), typedArrayObtainStyledAttributes, AbstractC0150k.f913i4, AbstractC0150k.f933k4);
        typedArrayObtainStyledAttributes.recycle();
        if (iM6620w >= 0) {
            setLineHeight(iM6620w);
        }
    }

    /* JADX INFO: renamed from: t */
    private static boolean m6617t(Context context) {
        return AbstractC0556b.m2070b(context, AbstractC0140a.f330W, true);
    }

    /* JADX INFO: renamed from: u */
    private static int m6618u(Resources.Theme theme, AttributeSet attributeSet, int i3, int i4) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC0150k.f943l4, i3, i4);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f953m4, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: v */
    private void m6619v(AttributeSet attributeSet, int i3, int i4) {
        int iM6618u;
        Context context = getContext();
        if (m6617t(context)) {
            Resources.Theme theme = context.getTheme();
            if (m6621x(context, theme, attributeSet, i3, i4) || (iM6618u = m6618u(theme, attributeSet, i3, i4)) == -1) {
                return;
            }
            m6616s(theme, iM6618u);
        }
    }

    /* JADX INFO: renamed from: w */
    private static int m6620w(Context context, TypedArray typedArray, int... iArr) {
        int iM2080d = -1;
        for (int i3 = 0; i3 < iArr.length && iM2080d < 0; i3++) {
            iM2080d = AbstractC0557c.m2080d(context, typedArray, iArr[i3], -1);
        }
        return iM2080d;
    }

    /* JADX INFO: renamed from: x */
    private static boolean m6621x(Context context, Resources.Theme theme, AttributeSet attributeSet, int i3, int i4) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC0150k.f943l4, i3, i4);
        int iM6620w = m6620w(context, typedArrayObtainStyledAttributes, AbstractC0150k.f963n4, AbstractC0150k.f973o4);
        typedArrayObtainStyledAttributes.recycle();
        return iM6620w != -1;
    }

    @Override // androidx.appcompat.widget.C0824B, android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        if (m6617t(context)) {
            m6616s(context.getTheme(), i3);
        }
    }

    public C1300a(Context context, AttributeSet attributeSet, int i3) {
        super(AbstractC1313a.m6668d(context, attributeSet, i3, 0), attributeSet, i3);
        m6619v(attributeSet, i3, 0);
    }
}
