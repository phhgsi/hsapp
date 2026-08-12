package p099f;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0873V;
import androidx.collection.C0926f;
import androidx.collection.C0930j;
import androidx.vectordrawable.graphics.drawable.C1284c;
import androidx.vectordrawable.graphics.drawable.C1289h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p099f.AbstractC1883b;
import p099f.C1886e;
import p103g.AbstractC1972a;
import p103g.AbstractC1974c;
import p164y.AbstractC2541n;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: loaded from: classes.dex */
public class C1882a extends C1886e {

    /* JADX INFO: renamed from: o */
    private c f9311o;

    /* JADX INFO: renamed from: p */
    private g f9312p;

    /* JADX INFO: renamed from: q */
    private int f9313q;

    /* JADX INFO: renamed from: r */
    private int f9314r;

    /* JADX INFO: renamed from: s */
    private boolean f9315s;

    /* JADX INFO: renamed from: f.a$b */
    private static class b extends g {

        /* JADX INFO: renamed from: a */
        private final Animatable f9316a;

        b(Animatable animatable) {
            super();
            this.f9316a = animatable;
        }

        @Override // p099f.C1882a.g
        /* JADX INFO: renamed from: c */
        public void mo9706c() {
            this.f9316a.start();
        }

        @Override // p099f.C1882a.g
        /* JADX INFO: renamed from: d */
        public void mo9707d() {
            this.f9316a.stop();
        }
    }

    /* JADX INFO: renamed from: f.a$c */
    static class c extends C1886e.a {

        /* JADX INFO: renamed from: K */
        C0926f f9317K;

        /* JADX INFO: renamed from: L */
        C0930j f9318L;

        c(c cVar, C1882a c1882a, Resources resources) {
            super(cVar, c1882a, resources);
            if (cVar != null) {
                this.f9317K = cVar.f9317K;
                this.f9318L = cVar.f9318L;
            } else {
                this.f9317K = new C0926f();
                this.f9318L = new C0930j();
            }
        }

        /* JADX INFO: renamed from: D */
        private static long m9708D(int i3, int i4) {
            return ((long) i4) | (((long) i3) << 32);
        }

        /* JADX INFO: renamed from: B */
        int m9709B(int[] iArr, Drawable drawable, int i3) {
            int iM9768z = super.m9768z(iArr, drawable);
            this.f9318L.m3956h(iM9768z, Integer.valueOf(i3));
            return iM9768z;
        }

        /* JADX INFO: renamed from: C */
        int m9710C(int i3, int i4, Drawable drawable, boolean z2) {
            int iM9735a = super.m9735a(drawable);
            long jM9708D = m9708D(i3, i4);
            long j3 = z2 ? 8589934592L : 0L;
            long j4 = iM9735a;
            this.f9317K.m3925a(jM9708D, Long.valueOf(j4 | j3));
            if (z2) {
                this.f9317K.m3925a(m9708D(i4, i3), Long.valueOf(4294967296L | j4 | j3));
            }
            return iM9735a;
        }

        /* JADX INFO: renamed from: E */
        int m9711E(int i3) {
            if (i3 < 0) {
                return 0;
            }
            return ((Integer) this.f9318L.m3953e(i3, 0)).intValue();
        }

        /* JADX INFO: renamed from: F */
        int m9712F(int[] iArr) {
            int iM9767A = super.m9767A(iArr);
            return iM9767A >= 0 ? iM9767A : super.m9767A(StateSet.WILD_CARD);
        }

        /* JADX INFO: renamed from: G */
        int m9713G(int i3, int i4) {
            return (int) ((Long) this.f9317K.m3929e(m9708D(i3, i4), -1L)).longValue();
        }

        /* JADX INFO: renamed from: H */
        boolean m9714H(int i3, int i4) {
            return (((Long) this.f9317K.m3929e(m9708D(i3, i4), -1L)).longValue() & 4294967296L) != 0;
        }

        /* JADX INFO: renamed from: I */
        boolean m9715I(int i3, int i4) {
            return (((Long) this.f9317K.m3929e(m9708D(i3, i4), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // p099f.C1886e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1882a(this, null);
        }

        @Override // p099f.C1886e.a, p099f.AbstractC1883b.d
        /* JADX INFO: renamed from: r */
        void mo9716r() {
            this.f9317K = this.f9317K.clone();
            this.f9318L = this.f9318L.clone();
        }

        @Override // p099f.C1886e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1882a(this, resources);
        }
    }

    /* JADX INFO: renamed from: f.a$d */
    private static class d extends g {

        /* JADX INFO: renamed from: a */
        private final C1284c f9319a;

        d(C1284c c1284c) {
            super();
            this.f9319a = c1284c;
        }

        @Override // p099f.C1882a.g
        /* JADX INFO: renamed from: c */
        public void mo9706c() {
            this.f9319a.start();
        }

        @Override // p099f.C1882a.g
        /* JADX INFO: renamed from: d */
        public void mo9707d() {
            this.f9319a.stop();
        }
    }

    /* JADX INFO: renamed from: f.a$e */
    private static class e extends g {

        /* JADX INFO: renamed from: a */
        private final ObjectAnimator f9320a;

        /* JADX INFO: renamed from: b */
        private final boolean f9321b;

        e(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i3 = z2 ? numberOfFrames - 1 : 0;
            int i4 = z2 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z2);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i3, i4);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.m9719a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f9321b = z3;
            this.f9320a = objectAnimatorOfInt;
        }

        @Override // p099f.C1882a.g
        /* JADX INFO: renamed from: a */
        public boolean mo9717a() {
            return this.f9321b;
        }

        @Override // p099f.C1882a.g
        /* JADX INFO: renamed from: b */
        public void mo9718b() {
            this.f9320a.reverse();
        }

        @Override // p099f.C1882a.g
        /* JADX INFO: renamed from: c */
        public void mo9706c() {
            this.f9320a.start();
        }

        @Override // p099f.C1882a.g
        /* JADX INFO: renamed from: d */
        public void mo9707d() {
            this.f9320a.cancel();
        }
    }

    /* JADX INFO: renamed from: f.a$f */
    private static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a */
        private int[] f9322a;

        /* JADX INFO: renamed from: b */
        private int f9323b;

        /* JADX INFO: renamed from: c */
        private int f9324c;

        f(AnimationDrawable animationDrawable, boolean z2) {
            m9720b(animationDrawable, z2);
        }

        /* JADX INFO: renamed from: a */
        int m9719a() {
            return this.f9324c;
        }

        /* JADX INFO: renamed from: b */
        int m9720b(AnimationDrawable animationDrawable, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f9323b = numberOfFrames;
            int[] iArr = this.f9322a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f9322a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f9322a;
            int i3 = 0;
            for (int i4 = 0; i4 < numberOfFrames; i4++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames - i4) - 1 : i4);
                iArr2[i4] = duration;
                i3 += duration;
            }
            this.f9324c = i3;
            return i3;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            int i3 = (int) ((f3 * this.f9324c) + 0.5f);
            int i4 = this.f9323b;
            int[] iArr = this.f9322a;
            int i5 = 0;
            while (i5 < i4) {
                int i6 = iArr[i5];
                if (i3 < i6) {
                    break;
                }
                i3 -= i6;
                i5++;
            }
            return (i5 / i4) + (i5 < i4 ? i3 / this.f9324c : 0.0f);
        }
    }

    public C1882a() {
        this(null, null);
    }

    /* JADX INFO: renamed from: n */
    public static C1882a m9694n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1882a c1882a = new C1882a();
            c1882a.m9705o(context, resources, xmlPullParser, attributeSet, theme);
            return c1882a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* JADX INFO: renamed from: p */
    private void m9695p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m9697r(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m9698s(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m9696q() {
        onStateChange(getState());
    }

    /* JADX INFO: renamed from: r */
    private int m9697r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1974c.f9500h);
        int resourceId = typedArrayM12180s.getResourceId(AbstractC1974c.f9501i, 0);
        int resourceId2 = typedArrayM12180s.getResourceId(AbstractC1974c.f9502j, -1);
        Drawable drawableM3691j = resourceId2 > 0 ? C0873V.m3682h().m3691j(context, resourceId2) : null;
        typedArrayM12180s.recycle();
        int[] iArrM9766l = m9766l(attributeSet);
        if (drawableM3691j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableM3691j = xmlPullParser.getName().equals("vector") ? C1289h.m6510c(resources, xmlPullParser, attributeSet, theme) : AbstractC1972a.m10042a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableM3691j != null) {
            return this.f9311o.m9709B(iArrM9766l, drawableM3691j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* JADX INFO: renamed from: s */
    private int m9698s(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1974c.f9503k);
        int resourceId = typedArrayM12180s.getResourceId(AbstractC1974c.f9506n, -1);
        int resourceId2 = typedArrayM12180s.getResourceId(AbstractC1974c.f9505m, -1);
        int resourceId3 = typedArrayM12180s.getResourceId(AbstractC1974c.f9504l, -1);
        Drawable drawableM3691j = resourceId3 > 0 ? C0873V.m3682h().m3691j(context, resourceId3) : null;
        boolean z2 = typedArrayM12180s.getBoolean(AbstractC1974c.f9507o, false);
        typedArrayM12180s.recycle();
        if (drawableM3691j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableM3691j = xmlPullParser.getName().equals("animated-vector") ? C1284c.m6478b(context, resources, xmlPullParser, attributeSet, theme) : AbstractC1972a.m10042a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableM3691j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f9311o.m9710C(resourceId, resourceId2, drawableM3691j, z2);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* JADX INFO: renamed from: t */
    private boolean m9699t(int i3) {
        int iM9725c;
        int iM9713G;
        g bVar;
        g gVar = this.f9312p;
        if (gVar == null) {
            iM9725c = m9725c();
        } else {
            if (i3 == this.f9313q) {
                return true;
            }
            if (i3 == this.f9314r && gVar.mo9717a()) {
                gVar.mo9718b();
                this.f9313q = this.f9314r;
                this.f9314r = i3;
                return true;
            }
            iM9725c = this.f9313q;
            gVar.mo9707d();
        }
        this.f9312p = null;
        this.f9314r = -1;
        this.f9313q = -1;
        c cVar = this.f9311o;
        int iM9711E = cVar.m9711E(iM9725c);
        int iM9711E2 = cVar.m9711E(i3);
        if (iM9711E2 == 0 || iM9711E == 0 || (iM9713G = cVar.m9713G(iM9711E, iM9711E2)) < 0) {
            return false;
        }
        boolean zM9715I = cVar.m9715I(iM9711E, iM9711E2);
        m9726g(iM9713G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m9714H(iM9711E, iM9711E2), zM9715I);
        } else {
            if (!(current instanceof C1284c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C1284c) current);
        }
        bVar.mo9706c();
        this.f9312p = bVar;
        this.f9314r = iM9725c;
        this.f9313q = i3;
        return true;
    }

    /* JADX INFO: renamed from: u */
    private void m9700u(TypedArray typedArray) {
        c cVar = this.f9311o;
        cVar.f9351d |= AbstractC1972a.m10043b(typedArray);
        cVar.m9755x(typedArray.getBoolean(AbstractC1974c.f9496d, cVar.f9356i));
        cVar.m9751t(typedArray.getBoolean(AbstractC1974c.f9497e, cVar.f9359l));
        cVar.m9752u(typedArray.getInt(AbstractC1974c.f9498f, cVar.f9339A));
        cVar.m9753v(typedArray.getInt(AbstractC1974c.f9499g, cVar.f9340B));
        setDither(typedArray.getBoolean(AbstractC1974c.f9494b, cVar.f9371x));
    }

    @Override // p099f.C1886e, p099f.AbstractC1883b
    /* JADX INFO: renamed from: h */
    void mo9702h(AbstractC1883b.d dVar) {
        super.mo9702h(dVar);
        if (dVar instanceof c) {
            this.f9311o = (c) dVar;
        }
    }

    @Override // p099f.C1886e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p099f.AbstractC1883b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f9312p;
        if (gVar != null) {
            gVar.mo9707d();
            this.f9312p = null;
            m9726g(this.f9313q);
            this.f9313q = -1;
            this.f9314r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p099f.C1886e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public c mo9701b() {
        return new c(this.f9311o, this, null);
    }

    @Override // p099f.C1886e, p099f.AbstractC1883b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9315s && super.mutate() == this) {
            this.f9311o.mo9716r();
            this.f9315s = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public void m9705o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayM12180s = AbstractC2541n.m12180s(resources, theme, attributeSet, AbstractC1974c.f9493a);
        setVisible(typedArrayM12180s.getBoolean(AbstractC1974c.f9495c, true), true);
        m9700u(typedArrayM12180s);
        m9727i(resources);
        typedArrayM12180s.recycle();
        m9695p(context, resources, xmlPullParser, attributeSet, theme);
        m9696q();
    }

    @Override // p099f.C1886e, p099f.AbstractC1883b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iM9712F = this.f9311o.m9712F(iArr);
        boolean z2 = iM9712F != m9725c() && (m9699t(iM9712F) || m9726g(iM9712F));
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z2 : z2;
    }

    @Override // p099f.AbstractC1883b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        g gVar = this.f9312p;
        if (gVar != null && (visible || z3)) {
            if (z2) {
                gVar.mo9706c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    C1882a(c cVar, Resources resources) {
        super(null);
        this.f9313q = -1;
        this.f9314r = -1;
        mo9702h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX INFO: renamed from: f.a$g */
    private static abstract class g {
        private g() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo9717a() {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo9706c();

        /* JADX INFO: renamed from: d */
        public abstract void mo9707d();

        /* JADX INFO: renamed from: b */
        public void mo9718b() {
        }
    }
}
