package p076Z0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0150k;

/* JADX INFO: renamed from: Z0.u */
/* JADX INFO: loaded from: classes.dex */
public class C0650u {

    /* JADX INFO: renamed from: a */
    int f2329a;

    /* JADX INFO: renamed from: b */
    private a f2330b;

    /* JADX INFO: renamed from: c */
    int[][] f2331c = new int[10][];

    /* JADX INFO: renamed from: d */
    a[] f2332d = new a[10];

    /* JADX INFO: renamed from: Z0.u$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public b f2333a;

        a(b bVar) {
            this.f2333a = bVar;
        }
    }

    /* JADX INFO: renamed from: Z0.u$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        c f2334a;

        /* JADX INFO: renamed from: b */
        float f2335b;

        b(c cVar, float f3) {
            this.f2334a = cVar;
            this.f2335b = f3;
        }

        /* JADX INFO: renamed from: a */
        public int m2485a(int i3) {
            c cVar = this.f2334a;
            if (cVar == c.PERCENT) {
                return (int) (this.f2335b * i3);
            }
            if (cVar == c.PIXELS) {
                return (int) this.f2335b;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: Z0.u$c */
    public enum c {
        PERCENT,
        PIXELS
    }

    /* JADX INFO: renamed from: a */
    private void m2477a(int[] iArr, a aVar) {
        int i3 = this.f2329a;
        if (i3 == 0 || iArr.length == 0) {
            this.f2330b = aVar;
        }
        if (i3 >= this.f2331c.length) {
            m2480f(i3, i3 + 10);
        }
        int[][] iArr2 = this.f2331c;
        int i4 = this.f2329a;
        iArr2[i4] = iArr;
        this.f2332d[i4] = aVar;
        this.f2329a = i4 + 1;
    }

    /* JADX INFO: renamed from: b */
    public static C0650u m2478b(Context context, TypedArray typedArray, int i3) {
        int next;
        int resourceId = typedArray.getResourceId(i3, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                C0650u c0650u = new C0650u();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    c0650u.m2482h(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return c0650u;
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private b m2479d(TypedArray typedArray, int i3, b bVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        if (typedValuePeekValue != null) {
            int i4 = typedValuePeekValue.type;
            if (i4 == 5) {
                return new b(c.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new b(c.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bVar;
    }

    /* JADX INFO: renamed from: f */
    private void m2480f(int i3, int i4) {
        int[][] iArr = new int[i4][];
        System.arraycopy(this.f2331c, 0, iArr, 0, i3);
        this.f2331c = iArr;
        a[] aVarArr = new a[i4];
        System.arraycopy(this.f2332d, 0, aVarArr, 0, i3);
        this.f2332d = aVarArr;
    }

    /* JADX INFO: renamed from: g */
    private int m2481g(int[] iArr) {
        int[][] iArr2 = this.f2331c;
        for (int i3 = 0; i3 < this.f2329a; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    private void m2482h(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, AbstractC0150k.f664H6) : theme.obtainStyledAttributes(attributeSet, AbstractC0150k.f664H6, 0, 0);
                b bVarM2479d = m2479d(typedArrayObtainAttributes, AbstractC0150k.f673I6, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != AbstractC0140a.f332Y) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                m2477a(StateSet.trimStateSet(iArr, i3), new a(bVarM2479d));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public int m2483c(int i3) {
        float fMax;
        int i4 = -i3;
        for (int i5 = 0; i5 < this.f2329a; i5++) {
            b bVar = this.f2332d[i5].f2333a;
            c cVar = bVar.f2334a;
            if (cVar == c.PIXELS) {
                fMax = Math.max(i4, bVar.f2335b);
            } else if (cVar == c.PERCENT) {
                fMax = Math.max(i4, i3 * bVar.f2335b);
            }
            i4 = (int) fMax;
        }
        return i4;
    }

    /* JADX INFO: renamed from: e */
    public a m2484e(int[] iArr) {
        int iM2481g = m2481g(iArr);
        if (iM2481g < 0) {
            iM2481g = m2481g(StateSet.WILD_CARD);
        }
        return iM2481g < 0 ? this.f2330b : this.f2332d[iM2481g];
    }
}
