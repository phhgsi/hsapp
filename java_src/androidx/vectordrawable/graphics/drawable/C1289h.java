package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.collection.C0921a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000A.AbstractC0000a;
import p164y.AbstractC2538k;
import p164y.AbstractC2541n;
import p164y.C2531d;
import p167z.AbstractC2574g;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h */
/* JADX INFO: loaded from: classes.dex */
public class C1289h extends AbstractC1288g {

    /* JADX INFO: renamed from: k */
    static final PorterDuff.Mode f6251k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    private h f6252b;

    /* JADX INFO: renamed from: c */
    private PorterDuffColorFilter f6253c;

    /* JADX INFO: renamed from: d */
    private ColorFilter f6254d;

    /* JADX INFO: renamed from: e */
    private boolean f6255e;

    /* JADX INFO: renamed from: f */
    private boolean f6256f;

    /* JADX INFO: renamed from: g */
    private Drawable.ConstantState f6257g;

    /* JADX INFO: renamed from: h */
    private final float[] f6258h;

    /* JADX INFO: renamed from: i */
    private final Matrix f6259i;

    /* JADX INFO: renamed from: j */
    private final Rect f6260j;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$b */
    private static class b extends f {
        b() {
        }

        /* JADX INFO: renamed from: f */
        private void m6518f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6287b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f6286a = AbstractC2574g.m12281d(string2);
            }
            this.f6288c = AbstractC2541n.m12172k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1289h.f
        /* JADX INFO: renamed from: c */
        public boolean mo6519c() {
            return true;
        }

        /* JADX INFO: renamed from: e */
        public void m6520e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (AbstractC2541n.m12179r(xmlPullParser, "pathData")) {
                TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6222d);
                m6518f(typedArrayM12180s, xmlPullParser);
                typedArrayM12180s.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$e */
    private static abstract class e {
        private e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo6524a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo6525b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$h */
    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        int f6307a;

        /* JADX INFO: renamed from: b */
        g f6308b;

        /* JADX INFO: renamed from: c */
        ColorStateList f6309c;

        /* JADX INFO: renamed from: d */
        PorterDuff.Mode f6310d;

        /* JADX INFO: renamed from: e */
        boolean f6311e;

        /* JADX INFO: renamed from: f */
        Bitmap f6312f;

        /* JADX INFO: renamed from: g */
        ColorStateList f6313g;

        /* JADX INFO: renamed from: h */
        PorterDuff.Mode f6314h;

        /* JADX INFO: renamed from: i */
        int f6315i;

        /* JADX INFO: renamed from: j */
        boolean f6316j;

        /* JADX INFO: renamed from: k */
        boolean f6317k;

        /* JADX INFO: renamed from: l */
        Paint f6318l;

        public h(h hVar) {
            this.f6309c = null;
            this.f6310d = C1289h.f6251k;
            if (hVar != null) {
                this.f6307a = hVar.f6307a;
                g gVar = new g(hVar.f6308b);
                this.f6308b = gVar;
                if (hVar.f6308b.f6295e != null) {
                    gVar.f6295e = new Paint(hVar.f6308b.f6295e);
                }
                if (hVar.f6308b.f6294d != null) {
                    this.f6308b.f6294d = new Paint(hVar.f6308b.f6294d);
                }
                this.f6309c = hVar.f6309c;
                this.f6310d = hVar.f6310d;
                this.f6311e = hVar.f6311e;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m6538a(int i3, int i4) {
            return i3 == this.f6312f.getWidth() && i4 == this.f6312f.getHeight();
        }

        /* JADX INFO: renamed from: b */
        public boolean m6539b() {
            return !this.f6317k && this.f6313g == this.f6309c && this.f6314h == this.f6310d && this.f6316j == this.f6311e && this.f6315i == this.f6308b.getRootAlpha();
        }

        /* JADX INFO: renamed from: c */
        public void m6540c(int i3, int i4) {
            if (this.f6312f == null || !m6538a(i3, i4)) {
                this.f6312f = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                this.f6317k = true;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m6541d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f6312f, (Rect) null, rect, m6542e(colorFilter));
        }

        /* JADX INFO: renamed from: e */
        public Paint m6542e(ColorFilter colorFilter) {
            if (!m6543f() && colorFilter == null) {
                return null;
            }
            if (this.f6318l == null) {
                Paint paint = new Paint();
                this.f6318l = paint;
                paint.setFilterBitmap(true);
            }
            this.f6318l.setAlpha(this.f6308b.getRootAlpha());
            this.f6318l.setColorFilter(colorFilter);
            return this.f6318l;
        }

        /* JADX INFO: renamed from: f */
        public boolean m6543f() {
            return this.f6308b.getRootAlpha() < 255;
        }

        /* JADX INFO: renamed from: g */
        public boolean m6544g() {
            return this.f6308b.m6536f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6307a;
        }

        /* JADX INFO: renamed from: h */
        public boolean m6545h(int[] iArr) {
            boolean zM6537g = this.f6308b.m6537g(iArr);
            this.f6317k |= zM6537g;
            return zM6537g;
        }

        /* JADX INFO: renamed from: i */
        public void m6546i() {
            this.f6313g = this.f6309c;
            this.f6314h = this.f6310d;
            this.f6315i = this.f6308b.getRootAlpha();
            this.f6316j = this.f6311e;
            this.f6317k = false;
        }

        /* JADX INFO: renamed from: j */
        public void m6547j(int i3, int i4) {
            this.f6312f.eraseColor(0);
            this.f6308b.m6535b(new Canvas(this.f6312f), i3, i4, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1289h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1289h(this);
        }

        public h() {
            this.f6309c = null;
            this.f6310d = C1289h.f6251k;
            this.f6308b = new g();
        }
    }

    C1289h() {
        this.f6256f = true;
        this.f6258h = new float[9];
        this.f6259i = new Matrix();
        this.f6260j = new Rect();
        this.f6252b = new h();
    }

    /* JADX INFO: renamed from: a */
    static int m6508a(int i3, float f3) {
        return (i3 & 16777215) | (((int) (Color.alpha(i3) * f3)) << 24);
    }

    /* JADX INFO: renamed from: b */
    public static C1289h m6509b(Resources resources, int i3, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C1289h c1289h = new C1289h();
            c1289h.f6250a = AbstractC2538k.m12140f(resources, i3, theme);
            c1289h.f6257g = new i(c1289h.f6250a.getConstantState());
            return c1289h;
        }
        try {
            XmlResourceParser xml = resources.getXml(i3);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m6510c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        } catch (XmlPullParserException e4) {
            Log.e("VectorDrawableCompat", "parser error", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1289h m6510c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1289h c1289h = new C1289h();
        c1289h.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1289h;
    }

    /* JADX INFO: renamed from: e */
    private void m6511e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f6252b;
        g gVar = hVar.f6308b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f6298h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m6526g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6274b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f6306p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f6307a = cVar.f6289d | hVar.f6307a;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m6520e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6274b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f6306p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f6307a = bVar.f6289d | hVar.f6307a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m6529c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6274b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f6306p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f6307a = dVar2.f6283k | hVar.f6307a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m6512f() {
        return isAutoMirrored() && AbstractC0000a.m5f(this) == 1;
    }

    /* JADX INFO: renamed from: g */
    private static PorterDuff.Mode m6513g(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m6514i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f6252b;
        g gVar = hVar.f6308b;
        hVar.f6310d = m6513g(AbstractC2541n.m12172k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListM12168g = AbstractC2541n.m12168g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListM12168g != null) {
            hVar.f6309c = colorStateListM12168g;
        }
        hVar.f6311e = AbstractC2541n.m12166e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f6311e);
        gVar.f6301k = AbstractC2541n.m12171j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f6301k);
        float fM12171j = AbstractC2541n.m12171j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f6302l);
        gVar.f6302l = fM12171j;
        if (gVar.f6301k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM12171j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f6299i = typedArray.getDimension(3, gVar.f6299i);
        float dimension = typedArray.getDimension(2, gVar.f6300j);
        gVar.f6300j = dimension;
        if (gVar.f6299i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(AbstractC2541n.m12171j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f6304n = string;
            gVar.f6306p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6250a;
        if (drawable == null) {
            return false;
        }
        AbstractC0000a.m1b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    Object m6515d(String str) {
        return this.f6252b.f6308b.f6306p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f6260j);
        if (this.f6260j.width() <= 0 || this.f6260j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f6254d;
        if (colorFilter == null) {
            colorFilter = this.f6253c;
        }
        canvas.getMatrix(this.f6259i);
        this.f6259i.getValues(this.f6258h);
        float fAbs = Math.abs(this.f6258h[0]);
        float fAbs2 = Math.abs(this.f6258h[4]);
        float fAbs3 = Math.abs(this.f6258h[1]);
        float fAbs4 = Math.abs(this.f6258h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f6260j.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f6260j.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f6260j;
        canvas.translate(rect.left, rect.top);
        if (m6512f()) {
            canvas.translate(this.f6260j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f6260j.offsetTo(0, 0);
        this.f6252b.m6540c(iMin, iMin2);
        if (!this.f6256f) {
            this.f6252b.m6547j(iMin, iMin2);
        } else if (!this.f6252b.m6539b()) {
            this.f6252b.m6547j(iMin, iMin2);
            this.f6252b.m6546i();
        }
        this.f6252b.m6541d(canvas, colorFilter, this.f6260j);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6250a;
        return drawable != null ? AbstractC0000a.m3d(drawable) : this.f6252b.f6308b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6252b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6250a;
        return drawable != null ? AbstractC0000a.m4e(drawable) : this.f6254d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6250a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f6250a.getConstantState());
        }
        this.f6252b.f6307a = getChangingConfigurations();
        return this.f6252b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6252b.f6308b.f6300j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6252b.f6308b.f6299i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: renamed from: h */
    void m6516h(boolean z2) {
        this.f6256f = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6250a;
        return drawable != null ? AbstractC0000a.m7h(drawable) : this.f6252b.f6311e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f6252b;
        if (hVar == null) {
            return false;
        }
        if (hVar.m6544g()) {
            return true;
        }
        ColorStateList colorStateList = this.f6252b.f6309c;
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: j */
    PorterDuffColorFilter m6517j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6255e && super.mutate() == this) {
            this.f6252b = new h(this.f6252b);
            this.f6255e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f6252b;
        ColorStateList colorStateList = hVar.f6309c;
        if (colorStateList == null || (mode = hVar.f6310d) == null) {
            z2 = false;
        } else {
            this.f6253c = m6517j(this.f6253c, colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        if (!hVar.m6544g() || !hVar.m6545h(iArr)) {
            return z2;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else if (this.f6252b.f6308b.getRootAlpha() != i3) {
            this.f6252b.f6308b.setRootAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m9j(drawable, z2);
        } else {
            this.f6252b.f6311e = z2;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i3) {
        super.setChangingConfigurations(i3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i3, PorterDuff.Mode mode) {
        super.setColorFilter(i3, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f3, float f4) {
        super.setHotspot(f3, f4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i3, int i4, int i5, int i6) {
        super.setHotspotBounds(i3, i4, i5, i6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1288g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i3) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m13n(drawable, i3);
        } else {
            setTintList(ColorStateList.valueOf(i3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m14o(drawable, colorStateList);
            return;
        }
        h hVar = this.f6252b;
        if (hVar.f6309c != colorStateList) {
            hVar.f6309c = colorStateList;
            this.f6253c = m6517j(this.f6253c, colorStateList, hVar.f6310d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m15p(drawable, mode);
            return;
        }
        h hVar = this.f6252b;
        if (hVar.f6310d != mode) {
            hVar.f6310d = mode;
            this.f6253c = m6517j(this.f6253c, hVar.f6309c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f6250a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$i */
    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        private final Drawable.ConstantState f6319a;

        public i(Drawable.ConstantState constantState) {
            this.f6319a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6319a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6319a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1289h c1289h = new C1289h();
            c1289h.f6250a = (VectorDrawable) this.f6319a.newDrawable();
            return c1289h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1289h c1289h = new C1289h();
            c1289h.f6250a = (VectorDrawable) this.f6319a.newDrawable(resources);
            return c1289h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1289h c1289h = new C1289h();
            c1289h.f6250a = (VectorDrawable) this.f6319a.newDrawable(resources, theme);
            return c1289h;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6254d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$f */
    private static abstract class f extends e {

        /* JADX INFO: renamed from: a */
        protected AbstractC2574g.b[] f6286a;

        /* JADX INFO: renamed from: b */
        String f6287b;

        /* JADX INFO: renamed from: c */
        int f6288c;

        /* JADX INFO: renamed from: d */
        int f6289d;

        public f() {
            super();
            this.f6286a = null;
            this.f6288c = 0;
        }

        /* JADX INFO: renamed from: c */
        public boolean mo6519c() {
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void m6530d(Path path) {
            path.reset();
            AbstractC2574g.b[] bVarArr = this.f6286a;
            if (bVarArr != null) {
                AbstractC2574g.b.m12296i(bVarArr, path);
            }
        }

        public AbstractC2574g.b[] getPathData() {
            return this.f6286a;
        }

        public String getPathName() {
            return this.f6287b;
        }

        public void setPathData(AbstractC2574g.b[] bVarArr) {
            if (AbstractC2574g.m12279b(this.f6286a, bVarArr)) {
                AbstractC2574g.m12288k(this.f6286a, bVarArr);
            } else {
                this.f6286a = AbstractC2574g.m12283f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f6286a = null;
            this.f6288c = 0;
            this.f6287b = fVar.f6287b;
            this.f6289d = fVar.f6289d;
            this.f6286a = AbstractC2574g.m12283f(fVar.f6286a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6250a;
        if (drawable != null) {
            AbstractC0000a.m6g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f6252b;
        hVar.f6308b = new g();
        TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6219a);
        m6514i(typedArrayM12180s, xmlPullParser, theme);
        typedArrayM12180s.recycle();
        hVar.f6307a = getChangingConfigurations();
        hVar.f6317k = true;
        m6511e(resources, xmlPullParser, attributeSet, theme);
        this.f6253c = m6517j(this.f6253c, hVar.f6309c, hVar.f6310d);
    }

    C1289h(h hVar) {
        this.f6256f = true;
        this.f6258h = new float[9];
        this.f6259i = new Matrix();
        this.f6260j = new Rect();
        this.f6252b = hVar;
        this.f6253c = m6517j(this.f6253c, hVar.f6309c, hVar.f6310d);
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$c */
    private static class c extends f {

        /* JADX INFO: renamed from: e */
        private int[] f6261e;

        /* JADX INFO: renamed from: f */
        C2531d f6262f;

        /* JADX INFO: renamed from: g */
        float f6263g;

        /* JADX INFO: renamed from: h */
        C2531d f6264h;

        /* JADX INFO: renamed from: i */
        float f6265i;

        /* JADX INFO: renamed from: j */
        float f6266j;

        /* JADX INFO: renamed from: k */
        float f6267k;

        /* JADX INFO: renamed from: l */
        float f6268l;

        /* JADX INFO: renamed from: m */
        float f6269m;

        /* JADX INFO: renamed from: n */
        Paint.Cap f6270n;

        /* JADX INFO: renamed from: o */
        Paint.Join f6271o;

        /* JADX INFO: renamed from: p */
        float f6272p;

        c() {
            this.f6263g = 0.0f;
            this.f6265i = 1.0f;
            this.f6266j = 1.0f;
            this.f6267k = 0.0f;
            this.f6268l = 1.0f;
            this.f6269m = 0.0f;
            this.f6270n = Paint.Cap.BUTT;
            this.f6271o = Paint.Join.MITER;
            this.f6272p = 4.0f;
        }

        /* JADX INFO: renamed from: e */
        private Paint.Cap m6521e(int i3, Paint.Cap cap) {
            return i3 != 0 ? i3 != 1 ? i3 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* JADX INFO: renamed from: f */
        private Paint.Join m6522f(int i3, Paint.Join join) {
            return i3 != 0 ? i3 != 1 ? i3 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* JADX INFO: renamed from: h */
        private void m6523h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f6261e = null;
            if (AbstractC2541n.m12179r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f6287b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f6286a = AbstractC2574g.m12281d(string2);
                }
                this.f6264h = AbstractC2541n.m12170i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f6266j = AbstractC2541n.m12171j(typedArray, xmlPullParser, "fillAlpha", 12, this.f6266j);
                this.f6270n = m6521e(AbstractC2541n.m12172k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f6270n);
                this.f6271o = m6522f(AbstractC2541n.m12172k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f6271o);
                this.f6272p = AbstractC2541n.m12171j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f6272p);
                this.f6262f = AbstractC2541n.m12170i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f6265i = AbstractC2541n.m12171j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f6265i);
                this.f6263g = AbstractC2541n.m12171j(typedArray, xmlPullParser, "strokeWidth", 4, this.f6263g);
                this.f6268l = AbstractC2541n.m12171j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f6268l);
                this.f6269m = AbstractC2541n.m12171j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f6269m);
                this.f6267k = AbstractC2541n.m12171j(typedArray, xmlPullParser, "trimPathStart", 5, this.f6267k);
                this.f6288c = AbstractC2541n.m12172k(typedArray, xmlPullParser, "fillType", 13, this.f6288c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1289h.e
        /* JADX INFO: renamed from: a */
        public boolean mo6524a() {
            return this.f6264h.m12100i() || this.f6262f.m12100i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1289h.e
        /* JADX INFO: renamed from: b */
        public boolean mo6525b(int[] iArr) {
            return this.f6262f.m12101j(iArr) | this.f6264h.m12101j(iArr);
        }

        /* JADX INFO: renamed from: g */
        public void m6526g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6221c);
            m6523h(typedArrayM12180s, xmlPullParser, theme);
            typedArrayM12180s.recycle();
        }

        float getFillAlpha() {
            return this.f6266j;
        }

        int getFillColor() {
            return this.f6264h.m12097e();
        }

        float getStrokeAlpha() {
            return this.f6265i;
        }

        int getStrokeColor() {
            return this.f6262f.m12097e();
        }

        float getStrokeWidth() {
            return this.f6263g;
        }

        float getTrimPathEnd() {
            return this.f6268l;
        }

        float getTrimPathOffset() {
            return this.f6269m;
        }

        float getTrimPathStart() {
            return this.f6267k;
        }

        void setFillAlpha(float f3) {
            this.f6266j = f3;
        }

        void setFillColor(int i3) {
            this.f6264h.m12102k(i3);
        }

        void setStrokeAlpha(float f3) {
            this.f6265i = f3;
        }

        void setStrokeColor(int i3) {
            this.f6262f.m12102k(i3);
        }

        void setStrokeWidth(float f3) {
            this.f6263g = f3;
        }

        void setTrimPathEnd(float f3) {
            this.f6268l = f3;
        }

        void setTrimPathOffset(float f3) {
            this.f6269m = f3;
        }

        void setTrimPathStart(float f3) {
            this.f6267k = f3;
        }

        c(c cVar) {
            super(cVar);
            this.f6263g = 0.0f;
            this.f6265i = 1.0f;
            this.f6266j = 1.0f;
            this.f6267k = 0.0f;
            this.f6268l = 1.0f;
            this.f6269m = 0.0f;
            this.f6270n = Paint.Cap.BUTT;
            this.f6271o = Paint.Join.MITER;
            this.f6272p = 4.0f;
            this.f6261e = cVar.f6261e;
            this.f6262f = cVar.f6262f;
            this.f6263g = cVar.f6263g;
            this.f6265i = cVar.f6265i;
            this.f6264h = cVar.f6264h;
            this.f6288c = cVar.f6288c;
            this.f6266j = cVar.f6266j;
            this.f6267k = cVar.f6267k;
            this.f6268l = cVar.f6268l;
            this.f6269m = cVar.f6269m;
            this.f6270n = cVar.f6270n;
            this.f6271o = cVar.f6271o;
            this.f6272p = cVar.f6272p;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$g */
    private static class g {

        /* JADX INFO: renamed from: q */
        private static final Matrix f6290q = new Matrix();

        /* JADX INFO: renamed from: a */
        private final Path f6291a;

        /* JADX INFO: renamed from: b */
        private final Path f6292b;

        /* JADX INFO: renamed from: c */
        private final Matrix f6293c;

        /* JADX INFO: renamed from: d */
        Paint f6294d;

        /* JADX INFO: renamed from: e */
        Paint f6295e;

        /* JADX INFO: renamed from: f */
        private PathMeasure f6296f;

        /* JADX INFO: renamed from: g */
        private int f6297g;

        /* JADX INFO: renamed from: h */
        final d f6298h;

        /* JADX INFO: renamed from: i */
        float f6299i;

        /* JADX INFO: renamed from: j */
        float f6300j;

        /* JADX INFO: renamed from: k */
        float f6301k;

        /* JADX INFO: renamed from: l */
        float f6302l;

        /* JADX INFO: renamed from: m */
        int f6303m;

        /* JADX INFO: renamed from: n */
        String f6304n;

        /* JADX INFO: renamed from: o */
        Boolean f6305o;

        /* JADX INFO: renamed from: p */
        final C0921a f6306p;

        public g() {
            this.f6293c = new Matrix();
            this.f6299i = 0.0f;
            this.f6300j = 0.0f;
            this.f6301k = 0.0f;
            this.f6302l = 0.0f;
            this.f6303m = 255;
            this.f6304n = null;
            this.f6305o = null;
            this.f6306p = new C0921a();
            this.f6298h = new d();
            this.f6291a = new Path();
            this.f6292b = new Path();
        }

        /* JADX INFO: renamed from: a */
        private static float m6531a(float f3, float f4, float f5, float f6) {
            return (f3 * f6) - (f4 * f5);
        }

        /* JADX INFO: renamed from: c */
        private void m6532c(d dVar, Matrix matrix, Canvas canvas, int i3, int i4, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f6273a.set(matrix);
            dVar2.f6273a.preConcat(dVar2.f6282j);
            canvas.save();
            int i5 = 0;
            while (i5 < dVar2.f6274b.size()) {
                e eVar = (e) dVar2.f6274b.get(i5);
                if (eVar instanceof d) {
                    m6532c((d) eVar, dVar2.f6273a, canvas, i3, i4, colorFilter);
                } else if (eVar instanceof f) {
                    m6533d(dVar2, (f) eVar, canvas, i3, i4, colorFilter);
                }
                i5++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        /* JADX INFO: renamed from: d */
        private void m6533d(d dVar, f fVar, Canvas canvas, int i3, int i4, ColorFilter colorFilter) {
            float f3 = i3 / this.f6301k;
            float f4 = i4 / this.f6302l;
            float fMin = Math.min(f3, f4);
            Matrix matrix = dVar.f6273a;
            this.f6293c.set(matrix);
            this.f6293c.postScale(f3, f4);
            float fM6534e = m6534e(matrix);
            if (fM6534e == 0.0f) {
                return;
            }
            fVar.m6530d(this.f6291a);
            Path path = this.f6291a;
            this.f6292b.reset();
            if (fVar.mo6519c()) {
                this.f6292b.setFillType(fVar.f6288c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f6292b.addPath(path, this.f6293c);
                canvas.clipPath(this.f6292b);
                return;
            }
            c cVar = (c) fVar;
            float f5 = cVar.f6267k;
            if (f5 != 0.0f || cVar.f6268l != 1.0f) {
                float f6 = cVar.f6269m;
                float f7 = (f5 + f6) % 1.0f;
                float f8 = (cVar.f6268l + f6) % 1.0f;
                if (this.f6296f == null) {
                    this.f6296f = new PathMeasure();
                }
                this.f6296f.setPath(this.f6291a, false);
                float length = this.f6296f.getLength();
                float f9 = f7 * length;
                float f10 = f8 * length;
                path.reset();
                if (f9 > f10) {
                    this.f6296f.getSegment(f9, length, path, true);
                    this.f6296f.getSegment(0.0f, f10, path, true);
                } else {
                    this.f6296f.getSegment(f9, f10, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f6292b.addPath(path, this.f6293c);
            if (cVar.f6264h.m12103l()) {
                C2531d c2531d = cVar.f6264h;
                if (this.f6295e == null) {
                    Paint paint = new Paint(1);
                    this.f6295e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f6295e;
                if (c2531d.m12099h()) {
                    Shader shaderM12098f = c2531d.m12098f();
                    shaderM12098f.setLocalMatrix(this.f6293c);
                    paint2.setShader(shaderM12098f);
                    paint2.setAlpha(Math.round(cVar.f6266j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C1289h.m6508a(c2531d.m12097e(), cVar.f6266j));
                }
                paint2.setColorFilter(colorFilter);
                this.f6292b.setFillType(cVar.f6288c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f6292b, paint2);
            }
            if (cVar.f6262f.m12103l()) {
                C2531d c2531d2 = cVar.f6262f;
                if (this.f6294d == null) {
                    Paint paint3 = new Paint(1);
                    this.f6294d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f6294d;
                Paint.Join join = cVar.f6271o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f6270n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f6272p);
                if (c2531d2.m12099h()) {
                    Shader shaderM12098f2 = c2531d2.m12098f();
                    shaderM12098f2.setLocalMatrix(this.f6293c);
                    paint4.setShader(shaderM12098f2);
                    paint4.setAlpha(Math.round(cVar.f6265i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C1289h.m6508a(c2531d2.m12097e(), cVar.f6265i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f6263g * fMin * fM6534e);
                canvas.drawPath(this.f6292b, paint4);
            }
        }

        /* JADX INFO: renamed from: e */
        private float m6534e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM6531a = m6531a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM6531a) / fMax;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: b */
        public void m6535b(Canvas canvas, int i3, int i4, ColorFilter colorFilter) {
            m6532c(this.f6298h, f6290q, canvas, i3, i4, colorFilter);
        }

        /* JADX INFO: renamed from: f */
        public boolean m6536f() {
            if (this.f6305o == null) {
                this.f6305o = Boolean.valueOf(this.f6298h.mo6524a());
            }
            return this.f6305o.booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public boolean m6537g(int[] iArr) {
            return this.f6298h.mo6525b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f6303m;
        }

        public void setAlpha(float f3) {
            setRootAlpha((int) (f3 * 255.0f));
        }

        public void setRootAlpha(int i3) {
            this.f6303m = i3;
        }

        public g(g gVar) {
            this.f6293c = new Matrix();
            this.f6299i = 0.0f;
            this.f6300j = 0.0f;
            this.f6301k = 0.0f;
            this.f6302l = 0.0f;
            this.f6303m = 255;
            this.f6304n = null;
            this.f6305o = null;
            C0921a c0921a = new C0921a();
            this.f6306p = c0921a;
            this.f6298h = new d(gVar.f6298h, c0921a);
            this.f6291a = new Path(gVar.f6291a);
            this.f6292b = new Path(gVar.f6292b);
            this.f6299i = gVar.f6299i;
            this.f6300j = gVar.f6300j;
            this.f6301k = gVar.f6301k;
            this.f6302l = gVar.f6302l;
            this.f6297g = gVar.f6297g;
            this.f6303m = gVar.f6303m;
            this.f6304n = gVar.f6304n;
            String str = gVar.f6304n;
            if (str != null) {
                c0921a.put(str, this);
            }
            this.f6305o = gVar.f6305o;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.h$d */
    private static class d extends e {

        /* JADX INFO: renamed from: a */
        final Matrix f6273a;

        /* JADX INFO: renamed from: b */
        final ArrayList f6274b;

        /* JADX INFO: renamed from: c */
        float f6275c;

        /* JADX INFO: renamed from: d */
        private float f6276d;

        /* JADX INFO: renamed from: e */
        private float f6277e;

        /* JADX INFO: renamed from: f */
        private float f6278f;

        /* JADX INFO: renamed from: g */
        private float f6279g;

        /* JADX INFO: renamed from: h */
        private float f6280h;

        /* JADX INFO: renamed from: i */
        private float f6281i;

        /* JADX INFO: renamed from: j */
        final Matrix f6282j;

        /* JADX INFO: renamed from: k */
        int f6283k;

        /* JADX INFO: renamed from: l */
        private int[] f6284l;

        /* JADX INFO: renamed from: m */
        private String f6285m;

        public d(d dVar, C0921a c0921a) {
            f bVar;
            super();
            this.f6273a = new Matrix();
            this.f6274b = new ArrayList();
            this.f6275c = 0.0f;
            this.f6276d = 0.0f;
            this.f6277e = 0.0f;
            this.f6278f = 1.0f;
            this.f6279g = 1.0f;
            this.f6280h = 0.0f;
            this.f6281i = 0.0f;
            Matrix matrix = new Matrix();
            this.f6282j = matrix;
            this.f6285m = null;
            this.f6275c = dVar.f6275c;
            this.f6276d = dVar.f6276d;
            this.f6277e = dVar.f6277e;
            this.f6278f = dVar.f6278f;
            this.f6279g = dVar.f6279g;
            this.f6280h = dVar.f6280h;
            this.f6281i = dVar.f6281i;
            this.f6284l = dVar.f6284l;
            String str = dVar.f6285m;
            this.f6285m = str;
            this.f6283k = dVar.f6283k;
            if (str != null) {
                c0921a.put(str, this);
            }
            matrix.set(dVar.f6282j);
            ArrayList arrayList = dVar.f6274b;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Object obj = arrayList.get(i3);
                if (obj instanceof d) {
                    this.f6274b.add(new d((d) obj, c0921a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f6274b.add(bVar);
                    Object obj2 = bVar.f6287b;
                    if (obj2 != null) {
                        c0921a.put(obj2, bVar);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        private void m6527d() {
            this.f6282j.reset();
            this.f6282j.postTranslate(-this.f6276d, -this.f6277e);
            this.f6282j.postScale(this.f6278f, this.f6279g);
            this.f6282j.postRotate(this.f6275c, 0.0f, 0.0f);
            this.f6282j.postTranslate(this.f6280h + this.f6276d, this.f6281i + this.f6277e);
        }

        /* JADX INFO: renamed from: e */
        private void m6528e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f6284l = null;
            this.f6275c = AbstractC2541n.m12171j(typedArray, xmlPullParser, "rotation", 5, this.f6275c);
            this.f6276d = typedArray.getFloat(1, this.f6276d);
            this.f6277e = typedArray.getFloat(2, this.f6277e);
            this.f6278f = AbstractC2541n.m12171j(typedArray, xmlPullParser, "scaleX", 3, this.f6278f);
            this.f6279g = AbstractC2541n.m12171j(typedArray, xmlPullParser, "scaleY", 4, this.f6279g);
            this.f6280h = AbstractC2541n.m12171j(typedArray, xmlPullParser, "translateX", 6, this.f6280h);
            this.f6281i = AbstractC2541n.m12171j(typedArray, xmlPullParser, "translateY", 7, this.f6281i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6285m = string;
            }
            m6527d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1289h.e
        /* JADX INFO: renamed from: a */
        public boolean mo6524a() {
            for (int i3 = 0; i3 < this.f6274b.size(); i3++) {
                if (((e) this.f6274b.get(i3)).mo6524a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1289h.e
        /* JADX INFO: renamed from: b */
        public boolean mo6525b(int[] iArr) {
            boolean zMo6525b = false;
            for (int i3 = 0; i3 < this.f6274b.size(); i3++) {
                zMo6525b |= ((e) this.f6274b.get(i3)).mo6525b(iArr);
            }
            return zMo6525b;
        }

        /* JADX INFO: renamed from: c */
        public void m6529c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1282a.f6220b);
            m6528e(typedArrayM12180s, xmlPullParser);
            typedArrayM12180s.recycle();
        }

        public String getGroupName() {
            return this.f6285m;
        }

        public Matrix getLocalMatrix() {
            return this.f6282j;
        }

        public float getPivotX() {
            return this.f6276d;
        }

        public float getPivotY() {
            return this.f6277e;
        }

        public float getRotation() {
            return this.f6275c;
        }

        public float getScaleX() {
            return this.f6278f;
        }

        public float getScaleY() {
            return this.f6279g;
        }

        public float getTranslateX() {
            return this.f6280h;
        }

        public float getTranslateY() {
            return this.f6281i;
        }

        public void setPivotX(float f3) {
            if (f3 != this.f6276d) {
                this.f6276d = f3;
                m6527d();
            }
        }

        public void setPivotY(float f3) {
            if (f3 != this.f6277e) {
                this.f6277e = f3;
                m6527d();
            }
        }

        public void setRotation(float f3) {
            if (f3 != this.f6275c) {
                this.f6275c = f3;
                m6527d();
            }
        }

        public void setScaleX(float f3) {
            if (f3 != this.f6278f) {
                this.f6278f = f3;
                m6527d();
            }
        }

        public void setScaleY(float f3) {
            if (f3 != this.f6279g) {
                this.f6279g = f3;
                m6527d();
            }
        }

        public void setTranslateX(float f3) {
            if (f3 != this.f6280h) {
                this.f6280h = f3;
                m6527d();
            }
        }

        public void setTranslateY(float f3) {
            if (f3 != this.f6281i) {
                this.f6281i = f3;
                m6527d();
            }
        }

        public d() {
            super();
            this.f6273a = new Matrix();
            this.f6274b = new ArrayList();
            this.f6275c = 0.0f;
            this.f6276d = 0.0f;
            this.f6277e = 0.0f;
            this.f6278f = 1.0f;
            this.f6279g = 1.0f;
            this.f6280h = 0.0f;
            this.f6281i = 0.0f;
            this.f6282j = new Matrix();
            this.f6285m = null;
        }
    }
}
