package p164y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p009D.AbstractC0091a;

/* JADX INFO: renamed from: y.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2530c {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f11802a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m12084a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m12085b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m12085b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m12088e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX INFO: renamed from: c */
    private static TypedValue m12086c() {
        ThreadLocal threadLocal = f11802a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m12087d(Resources resources, int i3, Resources.Theme theme) {
        try {
            return m12084a(resources, resources.getXml(i3), theme);
        } catch (Exception e3) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList m12088e(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p164y.AbstractC2530c.m12088e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX INFO: renamed from: f */
    private static boolean m12089f(Resources resources, int i3) {
        TypedValue typedValueM12086c = m12086c();
        resources.getValue(i3, typedValueM12086c, true);
        int i4 = typedValueM12086c.type;
        return i4 >= 28 && i4 <= 31;
    }

    /* JADX INFO: renamed from: g */
    private static int m12090g(int i3, float f3, float f4) {
        boolean z2 = f4 >= 0.0f && f4 <= 100.0f;
        if (f3 == 1.0f && !z2) {
            return i3;
        }
        int iM258b = AbstractC0091a.m258b((int) ((Color.alpha(i3) * f3) + 0.5f), 0, 255);
        if (z2) {
            C2528a c2528aM12061c = C2528a.m12061c(i3);
            i3 = C2528a.m12065m(c2528aM12061c.m12071j(), c2528aM12061c.m12070i(), f4);
        }
        return (i3 & 16777215) | (iM258b << 24);
    }

    /* JADX INFO: renamed from: h */
    private static TypedArray m12091h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
