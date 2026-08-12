package p067W0;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;

/* JADX INFO: renamed from: W0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0556b {
    /* JADX INFO: renamed from: a */
    public static TypedValue m2069a(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2070b(Context context, int i3, boolean z2) {
        TypedValue typedValueM2069a = m2069a(context, i3);
        return (typedValueM2069a == null || typedValueM2069a.type != 18) ? z2 : typedValueM2069a.data != 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m2071c(Context context, int i3, int i4) {
        TypedValue typedValueM2069a = m2069a(context, i3);
        return (int) ((typedValueM2069a == null || typedValueM2069a.type != 5) ? context.getResources().getDimension(i4) : typedValueM2069a.getDimension(context.getResources().getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: d */
    public static int m2072d(Context context, int i3, int i4) {
        TypedValue typedValueM2069a = m2069a(context, i3);
        return (typedValueM2069a == null || typedValueM2069a.type != 16) ? i4 : typedValueM2069a.data;
    }

    /* JADX INFO: renamed from: e */
    public static int m2073e(Context context) {
        return m2071c(context, AbstractC0140a.f356x, AbstractC0142c.f426q0);
    }

    /* JADX INFO: renamed from: f */
    public static int m2074f(Context context, int i3, String str) {
        return m2075g(context, i3, str).data;
    }

    /* JADX INFO: renamed from: g */
    public static TypedValue m2075g(Context context, int i3, String str) {
        TypedValue typedValueM2069a = m2069a(context, i3);
        if (typedValueM2069a != null) {
            return typedValueM2069a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i3)));
    }

    /* JADX INFO: renamed from: h */
    public static TypedValue m2076h(View view, int i3) {
        return m2075g(view.getContext(), i3, view.getClass().getCanonicalName());
    }
}
