package p043O0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.AbstractC0966b;
import p067W0.AbstractC0556b;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: O0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0450a {
    /* JADX INFO: renamed from: a */
    public static int m1629a(int i3, int i4) {
        return AbstractC2571d.m12269k(i3, (Color.alpha(i3) * i4) / 255);
    }

    /* JADX INFO: renamed from: b */
    public static int m1630b(Context context, int i3, int i4) {
        Integer numM1634f = m1634f(context, i3);
        return numM1634f != null ? numM1634f.intValue() : i4;
    }

    /* JADX INFO: renamed from: c */
    public static int m1631c(Context context, int i3, String str) {
        return m1640l(context, AbstractC0556b.m2075g(context, i3, str));
    }

    /* JADX INFO: renamed from: d */
    public static int m1632d(View view, int i3) {
        return m1640l(view.getContext(), AbstractC0556b.m2076h(view, i3));
    }

    /* JADX INFO: renamed from: e */
    public static int m1633e(View view, int i3, int i4) {
        return m1630b(view.getContext(), i3, i4);
    }

    /* JADX INFO: renamed from: f */
    public static Integer m1634f(Context context, int i3) {
        TypedValue typedValueM2069a = AbstractC0556b.m2069a(context, i3);
        if (typedValueM2069a != null) {
            return Integer.valueOf(m1640l(context, typedValueM2069a));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m1635g(Context context, int i3) {
        TypedValue typedValueM2069a = AbstractC0556b.m2069a(context, i3);
        if (typedValueM2069a == null) {
            return null;
        }
        int i4 = typedValueM2069a.resourceId;
        if (i4 != 0) {
            return AbstractC0966b.getColorStateList(context, i4);
        }
        int i5 = typedValueM2069a.data;
        if (i5 != 0) {
            return ColorStateList.valueOf(i5);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1636h(int i3) {
        return i3 != 0 && AbstractC2571d.m12262d(i3) > 0.5d;
    }

    /* JADX INFO: renamed from: i */
    public static int m1637i(int i3, int i4) {
        return AbstractC2571d.m12265g(i4, i3);
    }

    /* JADX INFO: renamed from: j */
    public static int m1638j(int i3, int i4, float f3) {
        return m1637i(i3, AbstractC2571d.m12269k(i4, Math.round(Color.alpha(i4) * f3)));
    }

    /* JADX INFO: renamed from: k */
    public static int m1639k(View view, int i3, int i4, float f3) {
        return m1638j(m1632d(view, i3), m1632d(view, i4), f3);
    }

    /* JADX INFO: renamed from: l */
    private static int m1640l(Context context, TypedValue typedValue) {
        int i3 = typedValue.resourceId;
        return i3 != 0 ? AbstractC0966b.getColor(context, i3) : typedValue.data;
    }
}
