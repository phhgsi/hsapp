package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p164y.AbstractC2541n;
import p167z.AbstractC2574g;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1286e {

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.e$a */
    private static class a implements TypeEvaluator {

        /* JADX INFO: renamed from: a */
        private AbstractC2574g.b[] f6248a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2574g.b[] evaluate(float f3, AbstractC2574g.b[] bVarArr, AbstractC2574g.b[] bVarArr2) {
            if (!AbstractC2574g.m12279b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!AbstractC2574g.m12279b(this.f6248a, bVarArr)) {
                this.f6248a = AbstractC2574g.m12283f(bVarArr);
            }
            for (int i3 = 0; i3 < bVarArr.length; i3++) {
                this.f6248a[i3].m12297h(bVarArr[i3], bVarArr2[i3], f3);
            }
            return this.f6248a;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Animator m6487a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f3) {
        return m6488b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (r18 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r10 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        r13 = new android.animation.Animator[r10.size()];
        r14 = r10.size();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (r15 >= r14) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        r0 = r10.get(r15);
        r15 = r15 + 1;
        r13[r11] = (android.animation.Animator) r0;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r19 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        r18.playTogether(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
    
        r18.playSequentially(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
    
        return r6;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator m6488b(android.content.Context r13, android.content.res.Resources r14, android.content.res.Resources.Theme r15, org.xmlpull.v1.XmlPullParser r16, android.util.AttributeSet r17, android.animation.AnimatorSet r18, int r19, float r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AbstractC1286e.m6488b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* JADX INFO: renamed from: c */
    private static Keyframe m6489c(Keyframe keyframe, float f3) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f3) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f3) : Keyframe.ofObject(f3);
    }

    /* JADX INFO: renamed from: d */
    private static void m6490d(Keyframe[] keyframeArr, float f3, int i3, int i4) {
        float f4 = f3 / ((i4 - i3) + 2);
        while (i3 <= i4) {
            keyframeArr[i3].setFraction(keyframeArr[i3 - 1].getFraction() + f4);
            i3++;
        }
    }

    /* JADX INFO: renamed from: e */
    private static PropertyValuesHolder m6491e(TypedArray typedArray, int i3, int i4, int i5, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i4);
        boolean z2 = typedValuePeekValue != null;
        int i6 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i5);
        boolean z3 = typedValuePeekValue2 != null;
        int i7 = z3 ? typedValuePeekValue2.type : 0;
        if (i3 == 4) {
            i3 = ((z2 && m6494h(i6)) || (z3 && m6494h(i7))) ? 3 : 0;
        }
        boolean z4 = i3 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i3 != 2) {
            C1287f c1287fM6507a = i3 == 3 ? C1287f.m6507a() : null;
            if (z4) {
                if (z2) {
                    float dimension = i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f);
                    if (z3) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i7 == 5 ? typedArray.getDimension(i5, 0.0f) : typedArray.getFloat(i5, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i7 == 5 ? typedArray.getDimension(i5, 0.0f) : typedArray.getFloat(i5, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z2) {
                int dimension2 = i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : m6494h(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0);
                if (z3) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i7 == 5 ? (int) typedArray.getDimension(i5, 0.0f) : m6494h(i7) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z3) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i7 == 5 ? (int) typedArray.getDimension(i5, 0.0f) : m6494h(i7) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0));
            }
            if (propertyValuesHolderOfInt != null && c1287fM6507a != null) {
                propertyValuesHolderOfInt.setEvaluator(c1287fM6507a);
            }
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i4);
        String string2 = typedArray.getString(i5);
        AbstractC2574g.b[] bVarArrM12281d = AbstractC2574g.m12281d(string);
        AbstractC2574g.b[] bVarArrM12281d2 = AbstractC2574g.m12281d(string2);
        if (bVarArrM12281d != null || bVarArrM12281d2 != null) {
            if (bVarArrM12281d != null) {
                a aVar = new a();
                if (bVarArrM12281d2 == null) {
                    return PropertyValuesHolder.ofObject(str, aVar, bVarArrM12281d);
                }
                if (AbstractC2574g.m12279b(bVarArrM12281d, bVarArrM12281d2)) {
                    return PropertyValuesHolder.ofObject(str, aVar, bVarArrM12281d, bVarArrM12281d2);
                }
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            if (bVarArrM12281d2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), bVarArrM12281d2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static int m6492f(TypedArray typedArray, int i3, int i4) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue != null;
        int i5 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i4);
        boolean z3 = typedValuePeekValue2 != null;
        int i6 = z3 ? typedValuePeekValue2.type : 0;
        if (z2 && m6494h(i5)) {
            return 3;
        }
        return (z3 && m6494h(i6)) ? 3 : 0;
    }

    /* JADX INFO: renamed from: g */
    private static int m6493g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6228j);
        int i3 = 0;
        TypedValue typedValueM12181t = AbstractC2541n.m12181t(typedArrayM12180s, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0);
        if (typedValueM12181t != null && m6494h(typedValueM12181t.type)) {
            i3 = 3;
        }
        typedArrayM12180s.recycle();
        return i3;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m6494h(int i3) {
        return i3 >= 28 && i3 <= 31;
    }

    /* JADX INFO: renamed from: i */
    public static Animator m6495i(Context context, int i3) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i3) : m6496j(context, context.getResources(), context.getTheme(), i3);
    }

    /* JADX INFO: renamed from: j */
    public static Animator m6496j(Context context, Resources resources, Resources.Theme theme, int i3) {
        return m6497k(context, resources, theme, i3, 1.0f);
    }

    /* JADX INFO: renamed from: k */
    public static Animator m6497k(Context context, Resources resources, Resources.Theme theme, int i3, float f3) {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i3);
                    return m6487a(context, resources, theme, animation, f3);
                } catch (IOException e3) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i3));
                    notFoundException.initCause(e3);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e4) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i3));
                notFoundException2.initCause(e4);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private static ValueAnimator m6498l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f3, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6225g);
        TypedArray typedArrayM12180s2 = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6229k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m6503q(valueAnimator, typedArrayM12180s, typedArrayM12180s2, f3, xmlPullParser);
        int iM12173l = AbstractC2541n.m12173l(typedArrayM12180s, xmlPullParser, "interpolator", 0, 0);
        if (iM12173l > 0) {
            valueAnimator.setInterpolator(AbstractC1285d.m6486a(context, iM12173l));
        }
        typedArrayM12180s.recycle();
        if (typedArrayM12180s2 != null) {
            typedArrayM12180s2.recycle();
        }
        return valueAnimator;
    }

    /* JADX INFO: renamed from: m */
    private static Keyframe m6499m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i3, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6228j);
        float fM12171j = AbstractC2541n.m12171j(typedArrayM12180s, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueM12181t = AbstractC2541n.m12181t(typedArrayM12180s, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0);
        boolean z2 = typedValueM12181t != null;
        if (i3 == 4) {
            i3 = (z2 && m6494h(typedValueM12181t.type)) ? 3 : 0;
        }
        Keyframe keyframeOfInt = z2 ? i3 != 0 ? (i3 == 1 || i3 == 3) ? Keyframe.ofInt(fM12171j, AbstractC2541n.m12172k(typedArrayM12180s, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, 0)) : null : Keyframe.ofFloat(fM12171j, AbstractC2541n.m12171j(typedArrayM12180s, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, 0.0f)) : i3 == 0 ? Keyframe.ofFloat(fM12171j) : Keyframe.ofInt(fM12171j);
        int iM12173l = AbstractC2541n.m12173l(typedArrayM12180s, xmlPullParser, "interpolator", 1, 0);
        if (iM12173l > 0) {
            keyframeOfInt.setInterpolator(AbstractC1285d.m6486a(context, iM12173l));
        }
        typedArrayM12180s.recycle();
        return keyframeOfInt;
    }

    /* JADX INFO: renamed from: n */
    private static ObjectAnimator m6500n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f3, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m6498l(context, resources, theme, attributeSet, objectAnimator, f3, xmlPullParser);
        return objectAnimator;
    }

    /* JADX INFO: renamed from: o */
    private static PropertyValuesHolder m6501o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i3) throws XmlPullParserException, IOException {
        int size;
        Context context2;
        Resources.Theme theme2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i3 == 4) {
                    i3 = m6493g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                int i4 = i3;
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
                Keyframe keyframeM6499m = m6499m(context2, resources, theme2, Xml.asAttributeSet(xmlPullParser), i4, xmlPullParser2);
                if (keyframeM6499m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeM6499m);
                }
                xmlPullParser2.next();
                i3 = i4;
            } else {
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
            }
            context = context2;
            theme = theme2;
            xmlPullParser = xmlPullParser2;
        }
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return null;
        }
        Keyframe keyframe = (Keyframe) arrayList.get(0);
        Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction < 1.0f) {
            if (fraction < 0.0f) {
                keyframe2.setFraction(1.0f);
            } else {
                arrayList.add(arrayList.size(), m6489c(keyframe2, 1.0f));
                size++;
            }
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList.add(0, m6489c(keyframe, 0.0f));
                size++;
            }
        }
        Keyframe[] keyframeArr = new Keyframe[size];
        arrayList.toArray(keyframeArr);
        for (int i5 = 0; i5 < size; i5++) {
            Keyframe keyframe3 = keyframeArr[i5];
            if (keyframe3.getFraction() < 0.0f) {
                if (i5 == 0) {
                    keyframe3.setFraction(0.0f);
                } else {
                    int i6 = size - 1;
                    if (i5 == i6) {
                        keyframe3.setFraction(1.0f);
                    } else {
                        int i7 = i5;
                        for (int i8 = i5 + 1; i8 < i6 && keyframeArr[i8].getFraction() < 0.0f; i8++) {
                            i7 = i8;
                        }
                        m6490d(keyframeArr, keyframeArr[i7 + 1].getFraction() - keyframeArr[i5 - 1].getFraction(), i5, i7);
                    }
                }
            }
        }
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i3 == 3) {
            propertyValuesHolderOfKeyframe.setEvaluator(C1287f.m6507a());
        }
        return propertyValuesHolderOfKeyframe;
    }

    /* JADX INFO: renamed from: p */
    private static PropertyValuesHolder[] m6502p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i3;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser2.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser2.next();
            } else {
                if (xmlPullParser2.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6227i);
                    String strM12174m = AbstractC2541n.m12174m(typedArrayM12180s, xmlPullParser2, "propertyName", 3);
                    int iM12172k = AbstractC2541n.m12172k(typedArrayM12180s, xmlPullParser2, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderM6501o = m6501o(context, resources, theme, xmlPullParser2, strM12174m, iM12172k);
                    if (propertyValuesHolderM6501o == null) {
                        propertyValuesHolderM6501o = m6491e(typedArrayM12180s, iM12172k, 0, 1, strM12174m);
                    }
                    if (propertyValuesHolderM6501o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderM6501o);
                    }
                    typedArrayM12180s.recycle();
                }
                xmlPullParser.next();
                xmlPullParser2 = xmlPullParser;
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (i3 = 0; i3 < size; i3++) {
            propertyValuesHolderArr[i3] = (PropertyValuesHolder) arrayList.get(i3);
        }
        return propertyValuesHolderArr;
    }

    /* JADX INFO: renamed from: q */
    private static void m6503q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f3, XmlPullParser xmlPullParser) {
        long jM12172k = AbstractC2541n.m12172k(typedArray, xmlPullParser, "duration", 1, 300);
        long jM12172k2 = AbstractC2541n.m12172k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iM12172k = AbstractC2541n.m12172k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (AbstractC2541n.m12179r(xmlPullParser, "valueFrom") && AbstractC2541n.m12179r(xmlPullParser, "valueTo")) {
            if (iM12172k == 4) {
                iM12172k = m6492f(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderM6491e = m6491e(typedArray, iM12172k, 5, 6, "");
            if (propertyValuesHolderM6491e != null) {
                valueAnimator.setValues(propertyValuesHolderM6491e);
            }
        }
        valueAnimator.setDuration(jM12172k);
        valueAnimator.setStartDelay(jM12172k2);
        valueAnimator.setRepeatCount(AbstractC2541n.m12172k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(AbstractC2541n.m12172k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m6504r(valueAnimator, typedArray2, iM12172k, f3, xmlPullParser);
        }
    }

    /* JADX INFO: renamed from: r */
    private static void m6504r(ValueAnimator valueAnimator, TypedArray typedArray, int i3, float f3, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM12174m = AbstractC2541n.m12174m(typedArray, xmlPullParser, "pathData", 1);
        if (strM12174m == null) {
            objectAnimator.setPropertyName(AbstractC2541n.m12174m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM12174m2 = AbstractC2541n.m12174m(typedArray, xmlPullParser, "propertyXName", 2);
        String strM12174m3 = AbstractC2541n.m12174m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i3 != 2) {
        }
        if (strM12174m2 != null || strM12174m3 != null) {
            m6505s(AbstractC2574g.m12282e(strM12174m), objectAnimator, f3 * 0.5f, strM12174m2, strM12174m3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* JADX INFO: renamed from: s */
    private static void m6505s(Path path, ObjectAnimator objectAnimator, float f3, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f4 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f3)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f5 = length / (iMin - 1);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
            fArr[i3] = fArr3[0];
            fArr2[i3] = fArr3[1];
            f4 += f5;
            int i5 = i4 + 1;
            if (i5 < arrayList.size() && f4 > ((Float) arrayList.get(i5)).floatValue()) {
                pathMeasure2.nextContour();
                i4 = i5;
            }
            i3++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}
