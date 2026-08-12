package p164y;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p015F.C0134f;
import p158w.AbstractC2486d;

/* JADX INFO: renamed from: y.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2535h {

    /* JADX INFO: renamed from: y.h$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static int m12116a(TypedArray typedArray, int i3) {
            return typedArray.getType(i3);
        }
    }

    /* JADX INFO: renamed from: y.h$b */
    public interface b {
    }

    /* JADX INFO: renamed from: y.h$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        private final d[] f11806a;

        public c(d[] dVarArr) {
            this.f11806a = dVarArr;
        }

        /* JADX INFO: renamed from: a */
        public d[] m12117a() {
            return this.f11806a;
        }
    }

    /* JADX INFO: renamed from: y.h$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final String f11807a;

        /* JADX INFO: renamed from: b */
        private final int f11808b;

        /* JADX INFO: renamed from: c */
        private final boolean f11809c;

        /* JADX INFO: renamed from: d */
        private final String f11810d;

        /* JADX INFO: renamed from: e */
        private final int f11811e;

        /* JADX INFO: renamed from: f */
        private final int f11812f;

        public d(String str, int i3, boolean z2, String str2, int i4, int i5) {
            this.f11807a = str;
            this.f11808b = i3;
            this.f11809c = z2;
            this.f11810d = str2;
            this.f11811e = i4;
            this.f11812f = i5;
        }

        /* JADX INFO: renamed from: a */
        public String m12118a() {
            return this.f11807a;
        }

        /* JADX INFO: renamed from: b */
        public int m12119b() {
            return this.f11812f;
        }

        /* JADX INFO: renamed from: c */
        public int m12120c() {
            return this.f11811e;
        }

        /* JADX INFO: renamed from: d */
        public String m12121d() {
            return this.f11810d;
        }

        /* JADX INFO: renamed from: e */
        public int m12122e() {
            return this.f11808b;
        }

        /* JADX INFO: renamed from: f */
        public boolean m12123f() {
            return this.f11809c;
        }
    }

    /* JADX INFO: renamed from: y.h$e */
    public static final class e implements b {

        /* JADX INFO: renamed from: a */
        private final List f11813a;

        /* JADX INFO: renamed from: b */
        private final int f11814b;

        /* JADX INFO: renamed from: c */
        private final int f11815c;

        /* JADX INFO: renamed from: d */
        private final String f11816d;

        public e(List list, int i3, int i4, String str) {
            this.f11813a = list;
            this.f11815c = i3;
            this.f11814b = i4;
            this.f11816d = str;
        }

        /* JADX INFO: renamed from: a */
        public int m12124a() {
            return this.f11815c;
        }

        /* JADX INFO: renamed from: b */
        public List m12125b() {
            return this.f11813a;
        }

        /* JADX INFO: renamed from: c */
        public String m12126c() {
            return this.f11816d;
        }

        /* JADX INFO: renamed from: d */
        public int m12127d() {
            return this.f11814b;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m12107a(TypedArray typedArray, int i3) {
        return a.m12116a(typedArray, i3);
    }

    /* JADX INFO: renamed from: b */
    public static b m12108b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m12111e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: c */
    public static List m12109c(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (m12107a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i4 = 0; i4 < typedArrayObtainTypedArray.length(); i4++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        arrayList.add(m12115i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m12115i(resources.getStringArray(i3)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    private static C0134f m12110d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List list) throws Exception {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC2486d.f11557B);
        try {
            String string = typedArrayObtainAttributes.getString(AbstractC2486d.f11558C);
            String string2 = typedArrayObtainAttributes.getString(AbstractC2486d.f11559D);
            String string3 = typedArrayObtainAttributes.getString(AbstractC2486d.f11560E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                m12114h(xmlPullParser);
            }
            C0134f c0134f = new C0134f(str, str2, string, list, string2, string3);
            AbstractC2532e.m12104a(typedArrayObtainAttributes);
            return c0134f;
        } catch (Throwable th) {
            if (typedArrayObtainAttributes == null) {
                throw th;
            }
            try {
                AbstractC2532e.m12104a(typedArrayObtainAttributes);
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static b m12111e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m12112f(xmlPullParser, resources);
        }
        m12114h(xmlPullParser);
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static b m12112f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC2486d.f11584h);
        String string = typedArrayObtainAttributes.getString(AbstractC2486d.f11585i);
        String string2 = typedArrayObtainAttributes.getString(AbstractC2486d.f11590n);
        String string3 = typedArrayObtainAttributes.getString(AbstractC2486d.f11591o);
        String string4 = typedArrayObtainAttributes.getString(AbstractC2486d.f11587k);
        int resourceId = typedArrayObtainAttributes.getResourceId(AbstractC2486d.f11586j, 0);
        int integer = typedArrayObtainAttributes.getInteger(AbstractC2486d.f11588l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(AbstractC2486d.f11589m, 500);
        String string5 = typedArrayObtainAttributes.getString(AbstractC2486d.f11592p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m12113g(xmlPullParser, resources));
                    } else {
                        m12114h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List listM12109c = m12109c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(m12110d(xmlPullParser, resources, string, string2, listM12109c));
                } else {
                    m12114h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new C0134f(string, string2, string3, listM12109c, null, null));
        if (string4 != null) {
            arrayList2.add(new C0134f(string, string2, string4, listM12109c, null, null));
        }
        return new e(arrayList2, integer, integer2, string5);
    }

    /* JADX INFO: renamed from: g */
    private static d m12113g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC2486d.f11593q);
        int i3 = AbstractC2486d.f11602z;
        if (!typedArrayObtainAttributes.hasValue(i3)) {
            i3 = AbstractC2486d.f11595s;
        }
        int i4 = typedArrayObtainAttributes.getInt(i3, 400);
        int i5 = AbstractC2486d.f11600x;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = AbstractC2486d.f11596t;
        }
        boolean z2 = 1 == typedArrayObtainAttributes.getInt(i5, 0);
        int i6 = AbstractC2486d.f11556A;
        if (!typedArrayObtainAttributes.hasValue(i6)) {
            i6 = AbstractC2486d.f11597u;
        }
        int i7 = AbstractC2486d.f11601y;
        if (!typedArrayObtainAttributes.hasValue(i7)) {
            i7 = AbstractC2486d.f11598v;
        }
        String string = typedArrayObtainAttributes.getString(i7);
        int i8 = typedArrayObtainAttributes.getInt(i6, 0);
        int i9 = AbstractC2486d.f11599w;
        if (!typedArrayObtainAttributes.hasValue(i9)) {
            i9 = AbstractC2486d.f11594r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i9, 0);
        String string2 = typedArrayObtainAttributes.getString(i9);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m12114h(xmlPullParser);
        }
        return new d(string2, i4, z2, string, i8, resourceId);
    }

    /* JADX INFO: renamed from: h */
    private static void m12114h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static List m12115i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
