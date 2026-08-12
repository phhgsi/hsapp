package p164y;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p158w.AbstractC2486d;

/* JADX INFO: renamed from: y.i */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2536i {
    /* JADX INFO: renamed from: a */
    private static a m12128a(a aVar, int i3, int i4, boolean z2, int i5) {
        return aVar != null ? aVar : z2 ? new a(i3, i5, i4) : new a(i3, i4);
    }

    /* JADX INFO: renamed from: b */
    static Shader m12129b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC2486d.f11561F);
        float fM12171j = AbstractC2541n.m12171j(typedArrayM12180s, xmlPullParser, "startX", AbstractC2486d.f11570O, 0.0f);
        float fM12171j2 = AbstractC2541n.m12171j(typedArrayM12180s, xmlPullParser, "startY", AbstractC2486d.f11571P, 0.0f);
        float fM12171j3 = AbstractC2541n.m12171j(typedArrayM12180s, xmlPullParser, "endX", AbstractC2486d.f11572Q, 0.0f);
        float fM12171j4 = AbstractC2541n.m12171j(typedArrayM12180s, xmlPullParser, "endY", AbstractC2486d.f11573R, 0.0f);
        float fM12171j5 = AbstractC2541n.m12171j(typedArrayM12180s, xmlPullParser, "centerX", AbstractC2486d.f11565J, 0.0f);
        float fM12171j6 = AbstractC2541n.m12171j(typedArrayM12180s, xmlPullParser, "centerY", AbstractC2486d.f11566K, 0.0f);
        int iM12172k = AbstractC2541n.m12172k(typedArrayM12180s, xmlPullParser, "type", AbstractC2486d.f11564I, 0);
        int iM12167f = AbstractC2541n.m12167f(typedArrayM12180s, xmlPullParser, "startColor", AbstractC2486d.f11562G, 0);
        boolean zM12179r = AbstractC2541n.m12179r(xmlPullParser, "centerColor");
        int iM12167f2 = AbstractC2541n.m12167f(typedArrayM12180s, xmlPullParser, "centerColor", AbstractC2486d.f11569N, 0);
        int iM12167f3 = AbstractC2541n.m12167f(typedArrayM12180s, xmlPullParser, "endColor", AbstractC2486d.f11563H, 0);
        int iM12172k2 = AbstractC2541n.m12172k(typedArrayM12180s, xmlPullParser, "tileMode", AbstractC2486d.f11568M, 0);
        float fM12171j7 = AbstractC2541n.m12171j(typedArrayM12180s, xmlPullParser, "gradientRadius", AbstractC2486d.f11567L, 0.0f);
        typedArrayM12180s.recycle();
        a aVarM12128a = m12128a(m12130c(resources, xmlPullParser, attributeSet, theme), iM12167f, iM12167f3, zM12179r, iM12167f2);
        if (iM12172k != 1) {
            return iM12172k != 2 ? new LinearGradient(fM12171j, fM12171j2, fM12171j3, fM12171j4, aVarM12128a.f11817a, aVarM12128a.f11818b, m12131d(iM12172k2)) : new SweepGradient(fM12171j5, fM12171j6, aVarM12128a.f11817a, aVarM12128a.f11818b);
        }
        if (fM12171j7 > 0.0f) {
            return new RadialGradient(fM12171j5, fM12171j6, fM12171j7, aVarM12128a.f11817a, aVarM12128a.f11818b, m12131d(iM12172k2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new p164y.AbstractC2536i.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static p164y.AbstractC2536i.a m12130c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p158w.AbstractC2486d.f11574S
            android.content.res.TypedArray r3 = p164y.AbstractC2541n.m12180s(r9, r12, r11, r3)
            int r5 = p158w.AbstractC2486d.f11575T
            boolean r6 = r3.hasValue(r5)
            int r7 = p158w.AbstractC2486d.f11576U
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            y.i$a r9 = new y.i$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p164y.AbstractC2536i.m12130c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):y.i$a");
    }

    /* JADX INFO: renamed from: d */
    private static Shader.TileMode m12131d(int i3) {
        return i3 != 1 ? i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: renamed from: y.i$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        final int[] f11817a;

        /* JADX INFO: renamed from: b */
        final float[] f11818b;

        a(List list, List list2) {
            int size = list.size();
            this.f11817a = new int[size];
            this.f11818b = new float[size];
            for (int i3 = 0; i3 < size; i3++) {
                this.f11817a[i3] = ((Integer) list.get(i3)).intValue();
                this.f11818b[i3] = ((Float) list2.get(i3)).floatValue();
            }
        }

        a(int i3, int i4) {
            this.f11817a = new int[]{i3, i4};
            this.f11818b = new float[]{0.0f, 1.0f};
        }

        a(int i3, int i4, int i5) {
            this.f11817a = new int[]{i3, i4, i5};
            this.f11818b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
