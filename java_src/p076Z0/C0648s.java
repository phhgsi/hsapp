package p076Z0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0150k;

/* JADX INFO: renamed from: Z0.s */
/* JADX INFO: loaded from: classes.dex */
public class C0648s {

    /* JADX INFO: renamed from: a */
    int f2309a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0633d f2310b;

    /* JADX INFO: renamed from: c */
    int[][] f2311c = new int[10][];

    /* JADX INFO: renamed from: d */
    InterfaceC0633d[] f2312d = new InterfaceC0633d[10];

    /* JADX INFO: renamed from: a */
    private void m2445a(int[] iArr, InterfaceC0633d interfaceC0633d) {
        int i3 = this.f2309a;
        if (i3 == 0 || iArr.length == 0) {
            this.f2310b = interfaceC0633d;
        }
        if (i3 >= this.f2311c.length) {
            m2448f(i3, i3 + 10);
        }
        int[][] iArr2 = this.f2311c;
        int i4 = this.f2309a;
        iArr2[i4] = iArr;
        this.f2312d[i4] = interfaceC0633d;
        this.f2309a = i4 + 1;
    }

    /* JADX INFO: renamed from: b */
    public static C0648s m2446b(InterfaceC0633d interfaceC0633d) {
        C0648s c0648s = new C0648s();
        c0648s.m2445a(StateSet.WILD_CARD, interfaceC0633d);
        return c0648s;
    }

    /* JADX INFO: renamed from: c */
    public static C0648s m2447c(Context context, TypedArray typedArray, int i3, InterfaceC0633d interfaceC0633d) {
        int next;
        int resourceId = typedArray.getResourceId(i3, 0);
        if (resourceId == 0) {
            return m2446b(C0641l.m2311m(typedArray, i3, interfaceC0633d));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return m2446b(C0641l.m2311m(typedArray, i3, interfaceC0633d));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                C0648s c0648s = new C0648s();
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
                    c0648s.m2450i(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return c0648s;
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
            return m2446b(interfaceC0633d);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m2448f(int i3, int i4) {
        int[][] iArr = new int[i4][];
        System.arraycopy(this.f2311c, 0, iArr, 0, i3);
        this.f2311c = iArr;
        InterfaceC0633d[] interfaceC0633dArr = new InterfaceC0633d[i4];
        System.arraycopy(this.f2312d, 0, interfaceC0633dArr, 0, i3);
        this.f2312d = interfaceC0633dArr;
    }

    /* JADX INFO: renamed from: g */
    private int m2449g(int[] iArr) {
        int[][] iArr2 = this.f2311c;
        for (int i3 = 0; i3 < this.f2309a; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    private void m2450i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, AbstractC0150k.f855c6) : theme.obtainStyledAttributes(attributeSet, AbstractC0150k.f855c6, 0, 0);
                InterfaceC0633d interfaceC0633dM2311m = C0641l.m2311m(typedArrayObtainAttributes, AbstractC0150k.f915i6, new C0630a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != AbstractC0140a.f342j) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                m2445a(StateSet.trimStateSet(iArr, i3), interfaceC0633dM2311m);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0633d m2451d(int[] iArr) {
        int iM2449g = m2449g(iArr);
        if (iM2449g < 0) {
            iM2449g = m2449g(StateSet.WILD_CARD);
        }
        return iM2449g < 0 ? this.f2310b : this.f2312d[iM2449g];
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0633d m2452e() {
        return this.f2310b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m2453h() {
        return this.f2309a > 1;
    }
}
