package p164y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: y.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2541n {
    /* JADX INFO: renamed from: a */
    public static int m12162a(Context context, int i3, int i4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i3, typedValue, true);
        return typedValue.resourceId != 0 ? i3 : i4;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12163b(TypedArray typedArray, int i3, int i4, boolean z2) {
        return typedArray.getBoolean(i3, typedArray.getBoolean(i4, z2));
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m12164c(TypedArray typedArray, int i3, int i4) {
        Drawable drawable = typedArray.getDrawable(i3);
        return drawable == null ? typedArray.getDrawable(i4) : drawable;
    }

    /* JADX INFO: renamed from: d */
    public static int m12165d(TypedArray typedArray, int i3, int i4, int i5) {
        return typedArray.getInt(i3, typedArray.getInt(i4, i5));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12166e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i3, boolean z2) {
        return !m12179r(xmlPullParser, str) ? z2 : typedArray.getBoolean(i3, z2);
    }

    /* JADX INFO: renamed from: f */
    public static int m12167f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i3, int i4) {
        return !m12179r(xmlPullParser, str) ? i4 : typedArray.getColor(i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m12168g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i3) {
        if (!m12179r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i3, typedValue);
        int i4 = typedValue.type;
        if (i4 != 2) {
            return (i4 < 28 || i4 > 31) ? AbstractC2530c.m12087d(typedArray.getResources(), typedArray.getResourceId(i3, 0), theme) : m12169h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i3 + ": " + typedValue);
    }

    /* JADX INFO: renamed from: h */
    private static ColorStateList m12169h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* JADX INFO: renamed from: i */
    public static C2531d m12170i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i3, int i4) {
        if (m12179r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i3, typedValue);
            int i5 = typedValue.type;
            if (i5 >= 28 && i5 <= 31) {
                return C2531d.m12093b(typedValue.data);
            }
            C2531d c2531dM12096g = C2531d.m12096g(typedArray.getResources(), typedArray.getResourceId(i3, 0), theme);
            if (c2531dM12096g != null) {
                return c2531dM12096g;
            }
        }
        return C2531d.m12093b(i4);
    }

    /* JADX INFO: renamed from: j */
    public static float m12171j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i3, float f3) {
        return !m12179r(xmlPullParser, str) ? f3 : typedArray.getFloat(i3, f3);
    }

    /* JADX INFO: renamed from: k */
    public static int m12172k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i3, int i4) {
        return !m12179r(xmlPullParser, str) ? i4 : typedArray.getInt(i3, i4);
    }

    /* JADX INFO: renamed from: l */
    public static int m12173l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i3, int i4) {
        return !m12179r(xmlPullParser, str) ? i4 : typedArray.getResourceId(i3, i4);
    }

    /* JADX INFO: renamed from: m */
    public static String m12174m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i3) {
        if (m12179r(xmlPullParser, str)) {
            return typedArray.getString(i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static int m12175n(TypedArray typedArray, int i3, int i4, int i5) {
        return typedArray.getResourceId(i3, typedArray.getResourceId(i4, i5));
    }

    /* JADX INFO: renamed from: o */
    public static String m12176o(TypedArray typedArray, int i3, int i4) {
        String string = typedArray.getString(i3);
        return string == null ? typedArray.getString(i4) : string;
    }

    /* JADX INFO: renamed from: p */
    public static CharSequence m12177p(TypedArray typedArray, int i3, int i4) {
        CharSequence text = typedArray.getText(i3);
        return text == null ? typedArray.getText(i4) : text;
    }

    /* JADX INFO: renamed from: q */
    public static CharSequence[] m12178q(TypedArray typedArray, int i3, int i4) {
        CharSequence[] textArray = typedArray.getTextArray(i3);
        return textArray == null ? typedArray.getTextArray(i4) : textArray;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m12179r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: s */
    public static TypedArray m12180s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: t */
    public static TypedValue m12181t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i3) {
        if (m12179r(xmlPullParser, str)) {
            return typedArray.peekValue(i3);
        }
        return null;
    }
}
