package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.d */
/* JADX INFO: loaded from: classes.dex */
public class C0942d {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f3987a;

    /* JADX INFO: renamed from: b */
    int f3988b = -1;

    /* JADX INFO: renamed from: c */
    int f3989c = -1;

    /* JADX INFO: renamed from: d */
    private SparseArray f3990d = new SparseArray();

    /* JADX INFO: renamed from: e */
    private SparseArray f3991e = new SparseArray();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a */
    static class a {

        /* JADX INFO: renamed from: a */
        int f3992a;

        /* JADX INFO: renamed from: b */
        ArrayList f3993b = new ArrayList();

        /* JADX INFO: renamed from: c */
        int f3994c;

        /* JADX INFO: renamed from: d */
        C0943e f3995d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f3994c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0947i.f4379c7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0947i.f4388d7) {
                    this.f3992a = typedArrayObtainStyledAttributes.getResourceId(index, this.f3992a);
                } else if (index == AbstractC0947i.f4397e7) {
                    this.f3994c = typedArrayObtainStyledAttributes.getResourceId(index, this.f3994c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3994c);
                    context.getResources().getResourceName(this.f3994c);
                    if ("layout".equals(resourceTypeName)) {
                        C0943e c0943e = new C0943e();
                        this.f3995d = c0943e;
                        c0943e.m4064e(context, this.f3994c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        void m4050a(b bVar) {
            this.f3993b.add(bVar);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$b */
    static class b {

        /* JADX INFO: renamed from: a */
        float f3996a;

        /* JADX INFO: renamed from: b */
        float f3997b;

        /* JADX INFO: renamed from: c */
        float f3998c;

        /* JADX INFO: renamed from: d */
        float f3999d;

        /* JADX INFO: renamed from: e */
        int f4000e;

        /* JADX INFO: renamed from: f */
        C0943e f4001f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f3996a = Float.NaN;
            this.f3997b = Float.NaN;
            this.f3998c = Float.NaN;
            this.f3999d = Float.NaN;
            this.f4000e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0947i.f4142A7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0947i.f4151B7) {
                    this.f4000e = typedArrayObtainStyledAttributes.getResourceId(index, this.f4000e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4000e);
                    context.getResources().getResourceName(this.f4000e);
                    if ("layout".equals(resourceTypeName)) {
                        C0943e c0943e = new C0943e();
                        this.f4001f = c0943e;
                        c0943e.m4064e(context, this.f4000e);
                    }
                } else if (index == AbstractC0947i.f4160C7) {
                    this.f3999d = typedArrayObtainStyledAttributes.getDimension(index, this.f3999d);
                } else if (index == AbstractC0947i.f4169D7) {
                    this.f3997b = typedArrayObtainStyledAttributes.getDimension(index, this.f3997b);
                } else if (index == AbstractC0947i.f4178E7) {
                    this.f3998c = typedArrayObtainStyledAttributes.getDimension(index, this.f3998c);
                } else if (index == AbstractC0947i.f4187F7) {
                    this.f3996a = typedArrayObtainStyledAttributes.getDimension(index, this.f3996a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    C0942d(Context context, ConstraintLayout constraintLayout, int i3) {
        this.f3987a = constraintLayout;
        m4047a(context, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4047a(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto L8d
            if (r0 == 0) goto L7e
            r3 = 2
            if (r0 == r3) goto L17
            goto L81
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L50;
                case 80204913: goto L46;
                case 1382829617: goto L3d;
                case 1657696882: goto L33;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
        L24:
            goto L5a
        L25:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = r6
            goto L5b
        L2f:
            r8 = move-exception
            goto L86
        L31:
            r8 = move-exception
            goto L8a
        L33:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = 0
            goto L5b
        L3d:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            goto L5b
        L46:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = r3
            goto L5b
        L50:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = r5
            goto L5b
        L5a:
            r2 = -1
        L5b:
            if (r2 == r3) goto L71
            if (r2 == r6) goto L66
            if (r2 == r5) goto L62
            goto L81
        L62:
            r7.m4048b(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto L81
        L66:
            androidx.constraintlayout.widget.d$b r0 = new androidx.constraintlayout.widget.d$b     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r1 == 0) goto L81
            r1.m4050a(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto L81
        L71:
            androidx.constraintlayout.widget.d$a r1 = new androidx.constraintlayout.widget.d$a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            android.util.SparseArray r0 = r7.f3990d     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            int r2 = r1.f3992a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r0.put(r2, r1)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto L81
        L7e:
            r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
        L81:
            int r0 = r9.next()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto Ld
        L86:
            r8.printStackTrace()
            goto L8d
        L8a:
            r8.printStackTrace()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0942d.m4047a(android.content.Context, int):void");
    }

    /* JADX INFO: renamed from: b */
    private void m4048b(Context context, XmlPullParser xmlPullParser) {
        C0943e c0943e = new C0943e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c0943e.m4068l(context, xmlPullParser);
                this.f3991e.put(identifier, c0943e);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4049c(AbstractC0944f abstractC0944f) {
    }
}
