package p076Z0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0150k;
import p076Z0.C0641l;

/* JADX INFO: renamed from: Z0.t */
/* JADX INFO: loaded from: classes.dex */
public class C0649t {

    /* JADX INFO: renamed from: a */
    final int f2313a;

    /* JADX INFO: renamed from: b */
    final C0641l f2314b;

    /* JADX INFO: renamed from: c */
    final int[][] f2315c;

    /* JADX INFO: renamed from: d */
    final C0641l[] f2316d;

    /* JADX INFO: renamed from: e */
    final C0648s f2317e;

    /* JADX INFO: renamed from: f */
    final C0648s f2318f;

    /* JADX INFO: renamed from: g */
    final C0648s f2319g;

    /* JADX INFO: renamed from: h */
    final C0648s f2320h;

    /* JADX INFO: renamed from: Z0.t$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private int f2321a;

        /* JADX INFO: renamed from: b */
        private C0641l f2322b;

        /* JADX INFO: renamed from: c */
        private int[][] f2323c;

        /* JADX INFO: renamed from: d */
        private C0641l[] f2324d;

        /* JADX INFO: renamed from: e */
        private C0648s f2325e;

        /* JADX INFO: renamed from: f */
        private C0648s f2326f;

        /* JADX INFO: renamed from: g */
        private C0648s f2327g;

        /* JADX INFO: renamed from: h */
        private C0648s f2328h;

        /* JADX INFO: renamed from: k */
        private boolean m2471k(int i3, int i4) {
            return (i4 | i3) == i3;
        }

        /* JADX INFO: renamed from: l */
        private void m2472l(int i3, int i4) {
            int[][] iArr = new int[i4][];
            System.arraycopy(this.f2323c, 0, iArr, 0, i3);
            this.f2323c = iArr;
            C0641l[] c0641lArr = new C0641l[i4];
            System.arraycopy(this.f2324d, 0, c0641lArr, 0, i3);
            this.f2324d = c0641lArr;
        }

        /* JADX INFO: renamed from: m */
        private void m2473m() {
            this.f2322b = new C0641l();
            this.f2323c = new int[10][];
            this.f2324d = new C0641l[10];
        }

        /* JADX INFO: renamed from: i */
        public b m2474i(int[] iArr, C0641l c0641l) {
            int i3 = this.f2321a;
            if (i3 == 0 || iArr.length == 0) {
                this.f2322b = c0641l;
            }
            if (i3 >= this.f2323c.length) {
                m2472l(i3, i3 + 10);
            }
            int[][] iArr2 = this.f2323c;
            int i4 = this.f2321a;
            iArr2[i4] = iArr;
            this.f2324d[i4] = c0641l;
            this.f2321a = i4 + 1;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C0649t m2475j() {
            if (this.f2321a == 0) {
                return null;
            }
            return new C0649t(this);
        }

        /* JADX INFO: renamed from: n */
        public b m2476n(C0648s c0648s, int i3) {
            if (m2471k(i3, 1)) {
                this.f2325e = c0648s;
            }
            if (m2471k(i3, 2)) {
                this.f2326f = c0648s;
            }
            if (m2471k(i3, 4)) {
                this.f2327g = c0648s;
            }
            if (m2471k(i3, 8)) {
                this.f2328h = c0648s;
            }
            return this;
        }

        public b(C0649t c0649t) {
            int i3 = c0649t.f2313a;
            this.f2321a = i3;
            this.f2322b = c0649t.f2314b;
            int[][] iArr = c0649t.f2315c;
            int[][] iArr2 = new int[iArr.length][];
            this.f2323c = iArr2;
            this.f2324d = new C0641l[c0649t.f2316d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(c0649t.f2316d, 0, this.f2324d, 0, this.f2321a);
            this.f2325e = c0649t.f2317e;
            this.f2326f = c0649t.f2318f;
            this.f2327g = c0649t.f2319g;
            this.f2328h = c0649t.f2320h;
        }

        public b(C0641l c0641l) {
            m2473m();
            m2474i(StateSet.WILD_CARD, c0641l);
        }

        private b(Context context, int i3) {
            int next;
            m2473m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i3);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            C0649t.m2457g(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
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
                m2473m();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0649t m2455b(Context context, TypedArray typedArray, int i3) {
        int resourceId = typedArray.getResourceId(i3, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).m2475j();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private int m2456e(int[] iArr) {
        int[][] iArr2 = this.f2315c;
        for (int i3 = 0; i3 < this.f2313a; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m2457g(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, AbstractC0150k.f814Y3) : theme.obtainStyledAttributes(attributeSet, AbstractC0150k.f814Y3, 0, 0);
                C0641l c0641lM2351m = C0641l.m2305b(context, typedArrayObtainAttributes.getResourceId(AbstractC0150k.f823Z3, 0), typedArrayObtainAttributes.getResourceId(AbstractC0150k.f833a4, 0)).m2351m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != AbstractC0140a.f321N && attributeNameResource != AbstractC0140a.f322O) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                bVar.m2474i(StateSet.trimStateSet(iArr, i3), c0641lM2351m);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m2458h(int i3) {
        int i4 = i3 & 5;
        return ((i3 & 10) >> 1) | (i4 << 1);
    }

    /* JADX INFO: renamed from: c */
    public C0641l m2459c(boolean z2) {
        if (!z2 || (this.f2317e == null && this.f2318f == null && this.f2319g == null && this.f2320h == null)) {
            return this.f2314b;
        }
        C0641l.b bVarM2326w = this.f2314b.m2326w();
        C0648s c0648s = this.f2317e;
        if (c0648s != null) {
            bVarM2326w.m2346D(c0648s.m2452e());
        }
        C0648s c0648s2 = this.f2318f;
        if (c0648s2 != null) {
            bVarM2326w.m2350H(c0648s2.m2452e());
        }
        C0648s c0648s3 = this.f2319g;
        if (c0648s3 != null) {
            bVarM2326w.m2359v(c0648s3.m2452e());
        }
        C0648s c0648s4 = this.f2320h;
        if (c0648s4 != null) {
            bVarM2326w.m2363z(c0648s4.m2452e());
        }
        return bVarM2326w.m2351m();
    }

    /* JADX INFO: renamed from: d */
    protected C0641l m2460d(int[] iArr) {
        int iM2456e = m2456e(iArr);
        if (iM2456e < 0) {
            iM2456e = m2456e(StateSet.WILD_CARD);
        }
        if (this.f2317e == null && this.f2318f == null && this.f2319g == null && this.f2320h == null) {
            return this.f2316d[iM2456e];
        }
        C0641l.b bVarM2326w = this.f2316d[iM2456e].m2326w();
        C0648s c0648s = this.f2317e;
        if (c0648s != null) {
            bVarM2326w.m2346D(c0648s.m2451d(iArr));
        }
        C0648s c0648s2 = this.f2318f;
        if (c0648s2 != null) {
            bVarM2326w.m2350H(c0648s2.m2451d(iArr));
        }
        C0648s c0648s3 = this.f2319g;
        if (c0648s3 != null) {
            bVarM2326w.m2359v(c0648s3.m2451d(iArr));
        }
        C0648s c0648s4 = this.f2320h;
        if (c0648s4 != null) {
            bVarM2326w.m2363z(c0648s4.m2451d(iArr));
        }
        return bVarM2326w.m2351m();
    }

    /* JADX INFO: renamed from: f */
    public boolean m2461f() {
        C0648s c0648s;
        C0648s c0648s2;
        C0648s c0648s3;
        C0648s c0648s4;
        return this.f2313a > 1 || ((c0648s = this.f2317e) != null && c0648s.m2453h()) || (((c0648s2 = this.f2318f) != null && c0648s2.m2453h()) || (((c0648s3 = this.f2319g) != null && c0648s3.m2453h()) || ((c0648s4 = this.f2320h) != null && c0648s4.m2453h())));
    }

    /* JADX INFO: renamed from: i */
    public b m2462i() {
        return new b(this);
    }

    private C0649t(b bVar) {
        this.f2313a = bVar.f2321a;
        this.f2314b = bVar.f2322b;
        this.f2315c = bVar.f2323c;
        this.f2316d = bVar.f2324d;
        this.f2317e = bVar.f2325e;
        this.f2318f = bVar.f2326f;
        this.f2319g = bVar.f2327g;
        this.f2320h = bVar.f2328h;
    }
}
