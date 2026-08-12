package p067W0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import p016F0.AbstractC0150k;
import p091d.AbstractC1769j;
import p158w.AbstractC2486d;
import p164y.AbstractC2538k;

/* JADX INFO: renamed from: W0.e */
/* JADX INFO: loaded from: classes.dex */
public class C0559e {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f1952a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f1953b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f1954c;

    /* JADX INFO: renamed from: d */
    public final String f1955d;

    /* JADX INFO: renamed from: e */
    public String f1956e;

    /* JADX INFO: renamed from: f */
    public final int f1957f;

    /* JADX INFO: renamed from: g */
    public final int f1958g;

    /* JADX INFO: renamed from: h */
    public final boolean f1959h;

    /* JADX INFO: renamed from: i */
    public final float f1960i;

    /* JADX INFO: renamed from: j */
    public final float f1961j;

    /* JADX INFO: renamed from: k */
    public final float f1962k;

    /* JADX INFO: renamed from: l */
    public final boolean f1963l;

    /* JADX INFO: renamed from: m */
    public final float f1964m;

    /* JADX INFO: renamed from: n */
    private ColorStateList f1965n;

    /* JADX INFO: renamed from: o */
    private float f1966o;

    /* JADX INFO: renamed from: p */
    private final int f1967p;

    /* JADX INFO: renamed from: q */
    private boolean f1968q = false;

    /* JADX INFO: renamed from: r */
    private boolean f1969r = false;

    /* JADX INFO: renamed from: s */
    private Typeface f1970s;

    /* JADX INFO: renamed from: W0.e$a */
    class a extends AbstractC2538k.e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0561g f1971a;

        a(AbstractC0561g abstractC0561g) {
            this.f1971a = abstractC0561g;
        }

        @Override // p164y.AbstractC2538k.e
        /* JADX INFO: renamed from: f */
        public void mo2108f(int i3) {
            C0559e.this.f1968q = true;
            this.f1971a.mo2065a(i3);
        }

        @Override // p164y.AbstractC2538k.e
        /* JADX INFO: renamed from: g */
        public void mo2109g(Typeface typeface) {
            C0559e c0559e = C0559e.this;
            c0559e.f1970s = Typeface.create(typeface, c0559e.f1957f);
            C0559e.this.f1968q = true;
            this.f1971a.mo2066b(C0559e.this.f1970s, false);
        }
    }

    /* JADX INFO: renamed from: W0.e$b */
    class b extends AbstractC0561g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f1973a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextPaint f1974b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC0561g f1975c;

        b(Context context, TextPaint textPaint, AbstractC0561g abstractC0561g) {
            this.f1973a = context;
            this.f1974b = textPaint;
            this.f1975c = abstractC0561g;
        }

        @Override // p067W0.AbstractC0561g
        /* JADX INFO: renamed from: a */
        public void mo2065a(int i3) {
            this.f1975c.mo2065a(i3);
        }

        @Override // p067W0.AbstractC0561g
        /* JADX INFO: renamed from: b */
        public void mo2066b(Typeface typeface, boolean z2) {
            C0559e.this.m2107r(this.f1973a, this.f1974b, typeface);
            this.f1975c.mo2066b(typeface, z2);
        }
    }

    public C0559e(Context context, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC1769j.f9010a3);
        m2104o(typedArrayObtainStyledAttributes.getDimension(AbstractC1769j.f9016b3, 0.0f));
        m2103n(AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC1769j.f9034e3));
        this.f1952a = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC1769j.f9040f3);
        this.f1953b = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC1769j.f9046g3);
        this.f1957f = typedArrayObtainStyledAttributes.getInt(AbstractC1769j.f9028d3, 0);
        this.f1958g = typedArrayObtainStyledAttributes.getInt(AbstractC1769j.f9022c3, 1);
        int iM2083g = AbstractC0557c.m2083g(typedArrayObtainStyledAttributes, AbstractC1769j.f9081n3, AbstractC1769j.f9071l3);
        this.f1967p = typedArrayObtainStyledAttributes.getResourceId(iM2083g, 0);
        this.f1955d = typedArrayObtainStyledAttributes.getString(iM2083g);
        this.f1959h = typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f9091p3, false);
        this.f1954c = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC1769j.f9051h3);
        this.f1960i = typedArrayObtainStyledAttributes.getFloat(AbstractC1769j.f9056i3, 0.0f);
        this.f1961j = typedArrayObtainStyledAttributes.getFloat(AbstractC1769j.f9061j3, 0.0f);
        this.f1962k = typedArrayObtainStyledAttributes.getFloat(AbstractC1769j.f9066k3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i3, AbstractC0150k.f883f4);
        int i4 = AbstractC0150k.f893g4;
        this.f1963l = typedArrayObtainStyledAttributes2.hasValue(i4);
        this.f1964m = typedArrayObtainStyledAttributes2.getFloat(i4, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1956e = typedArrayObtainStyledAttributes2.getString(AbstractC0557c.m2083g(typedArrayObtainStyledAttributes2, AbstractC0150k.f923j4, AbstractC0150k.f903h4));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: d */
    private void m2093d() {
        String str;
        if (this.f1970s == null && (str = this.f1955d) != null) {
            this.f1970s = Typeface.create(str, this.f1957f);
        }
        if (this.f1970s == null) {
            int i3 = this.f1958g;
            if (i3 == 1) {
                this.f1970s = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f1970s = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f1970s = Typeface.DEFAULT;
            } else {
                this.f1970s = Typeface.MONOSPACE;
            }
            this.f1970s = Typeface.create(this.f1970s, this.f1957f);
        }
    }

    /* JADX INFO: renamed from: i */
    private Typeface m2094i(Context context) {
        Typeface typefaceCreate;
        if (this.f1969r) {
            return null;
        }
        this.f1969r = true;
        String strM2096m = m2096m(context, this.f1967p);
        if (strM2096m == null || (typefaceCreate = Typeface.create(strM2096m, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f1957f);
    }

    /* JADX INFO: renamed from: l */
    private boolean m2095l(Context context) {
        if (AbstractC0560f.m2110a()) {
            m2098f(context);
            return true;
        }
        if (this.f1968q) {
            return true;
        }
        int i3 = this.f1967p;
        if (i3 == 0) {
            return false;
        }
        Typeface typefaceM12137c = AbstractC2538k.m12137c(context, i3);
        if (typefaceM12137c != null) {
            this.f1970s = typefaceM12137c;
            this.f1968q = true;
            return true;
        }
        Typeface typefaceM2094i = m2094i(context);
        if (typefaceM2094i == null) {
            return false;
        }
        this.f1970s = typefaceM2094i;
        this.f1968q = true;
        return true;
    }

    /* JADX INFO: renamed from: m */
    private static String m2096m(Context context, int i3) {
        Resources resources = context.getResources();
        if (i3 != 0 && resources.getResourceTypeName(i3).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i3);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC2486d.f11584h);
                        String string = typedArrayObtainAttributes.getString(AbstractC2486d.f11592p);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Typeface m2097e() {
        m2093d();
        return this.f1970s;
    }

    /* JADX INFO: renamed from: f */
    public Typeface m2098f(Context context) {
        if (this.f1968q) {
            return this.f1970s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM12142h = AbstractC2538k.m12142h(context, this.f1967p);
                this.f1970s = typefaceM12142h;
                if (typefaceM12142h != null) {
                    this.f1970s = Typeface.create(typefaceM12142h, this.f1957f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e3) {
                Log.d("TextAppearance", "Error loading font " + this.f1955d, e3);
            }
        }
        m2093d();
        this.f1968q = true;
        return this.f1970s;
    }

    /* JADX INFO: renamed from: g */
    public void m2099g(Context context, AbstractC0561g abstractC0561g) {
        if (!m2095l(context)) {
            m2093d();
        }
        int i3 = this.f1967p;
        if (i3 == 0) {
            this.f1968q = true;
        }
        if (this.f1968q) {
            abstractC0561g.mo2066b(this.f1970s, true);
            return;
        }
        try {
            AbstractC2538k.m12144j(context, i3, new a(abstractC0561g), null);
        } catch (Resources.NotFoundException unused) {
            this.f1968q = true;
            abstractC0561g.mo2065a(1);
        } catch (Exception e3) {
            Log.d("TextAppearance", "Error loading font " + this.f1955d, e3);
            this.f1968q = true;
            abstractC0561g.mo2065a(-3);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2100h(Context context, TextPaint textPaint, AbstractC0561g abstractC0561g) {
        m2107r(context, textPaint, m2097e());
        m2099g(context, new b(context, textPaint, abstractC0561g));
    }

    /* JADX INFO: renamed from: j */
    public ColorStateList m2101j() {
        return this.f1965n;
    }

    /* JADX INFO: renamed from: k */
    public float m2102k() {
        return this.f1966o;
    }

    /* JADX INFO: renamed from: n */
    public void m2103n(ColorStateList colorStateList) {
        this.f1965n = colorStateList;
    }

    /* JADX INFO: renamed from: o */
    public void m2104o(float f3) {
        this.f1966o = f3;
    }

    /* JADX INFO: renamed from: p */
    public void m2105p(Context context, TextPaint textPaint, AbstractC0561g abstractC0561g) {
        m2106q(context, textPaint, abstractC0561g);
        ColorStateList colorStateList = this.f1965n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f3 = this.f1962k;
        float f4 = this.f1960i;
        float f5 = this.f1961j;
        ColorStateList colorStateList2 = this.f1954c;
        textPaint.setShadowLayer(f3, f4, f5, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: q */
    public void m2106q(Context context, TextPaint textPaint, AbstractC0561g abstractC0561g) {
        Typeface typeface;
        if (m2095l(context) && this.f1968q && (typeface = this.f1970s) != null) {
            m2107r(context, textPaint, typeface);
        } else {
            m2100h(context, textPaint, abstractC0561g);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2107r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM2114a = AbstractC0565k.m2114a(context, typeface);
        if (typefaceM2114a != null) {
            typeface = typefaceM2114a;
        }
        textPaint.setTypeface(typeface);
        int i3 = this.f1957f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i3 & 1) != 0);
        textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1966o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f1956e);
        }
        if (this.f1963l) {
            textPaint.setLetterSpacing(this.f1964m);
        }
    }
}
