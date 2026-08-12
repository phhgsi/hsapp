package p067W0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0888e0;
import p016F0.AbstractC0150k;
import p091d.AbstractC1769j;
import p095e.AbstractC1832a;

/* JADX INFO: renamed from: W0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0557c {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m2077a(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        ColorStateList colorStateListM9608a;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (colorStateListM9608a = AbstractC1832a.m9608a(context, resourceId)) == null) ? typedArray.getColorStateList(i3) : colorStateListM9608a;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m2078b(Context context, C0888e0 c0888e0, int i3) {
        int iM3779n;
        ColorStateList colorStateListM9608a;
        return (!c0888e0.m3784s(i3) || (iM3779n = c0888e0.m3779n(i3, 0)) == 0 || (colorStateListM9608a = AbstractC1832a.m9608a(context, iM3779n)) == null) ? c0888e0.m3768c(i3) : colorStateListM9608a;
    }

    /* JADX INFO: renamed from: c */
    private static int m2079c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    /* JADX INFO: renamed from: d */
    public static int m2080d(Context context, TypedArray typedArray, int i3, int i4) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i3, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i3, i4);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i4);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m2081e(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        Drawable drawableM9609b;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (drawableM9609b = AbstractC1832a.m9609b(context, resourceId)) == null) ? typedArray.getDrawable(i3) : drawableM9609b;
    }

    /* JADX INFO: renamed from: f */
    public static float m2082f(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    /* JADX INFO: renamed from: g */
    static int m2083g(TypedArray typedArray, int i3, int i4) {
        return typedArray.hasValue(i3) ? i3 : i4;
    }

    /* JADX INFO: renamed from: h */
    public static C0559e m2084h(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        if (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) {
            return null;
        }
        return new C0559e(context, resourceId);
    }

    /* JADX INFO: renamed from: i */
    public static int m2085i(Context context, int i3, int i4) {
        if (i3 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC0150k.f883f4);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(AbstractC0150k.f933k4, typedValue);
            if (!value) {
                value = typedArrayObtainStyledAttributes.getValue(AbstractC0150k.f913i4, typedValue);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return m2079c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: j */
    public static int m2086j(Context context, int i3, int i4) {
        if (i3 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC1769j.f9010a3);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(AbstractC1769j.f9016b3, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return m2079c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2087k(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2088l(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
