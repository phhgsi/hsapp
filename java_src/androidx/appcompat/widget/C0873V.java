package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.C0926f;
import androidx.collection.C0928h;
import androidx.collection.C0929i;
import androidx.collection.C0930j;
import androidx.core.content.AbstractC0966b;
import androidx.vectordrawable.graphics.drawable.C1284c;
import androidx.vectordrawable.graphics.drawable.C1289h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000A.AbstractC0000a;
import p099f.C1882a;
import p103g.AbstractC1972a;
import p103g.AbstractC1973b;

/* JADX INFO: renamed from: androidx.appcompat.widget.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0873V {

    /* JADX INFO: renamed from: i */
    private static C0873V f3569i;

    /* JADX INFO: renamed from: a */
    private WeakHashMap f3571a;

    /* JADX INFO: renamed from: b */
    private C0929i f3572b;

    /* JADX INFO: renamed from: c */
    private C0930j f3573c;

    /* JADX INFO: renamed from: d */
    private final WeakHashMap f3574d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e */
    private TypedValue f3575e;

    /* JADX INFO: renamed from: f */
    private boolean f3576f;

    /* JADX INFO: renamed from: g */
    private f f3577g;

    /* JADX INFO: renamed from: h */
    private static final PorterDuff.Mode f3568h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j */
    private static final c f3570j = new c(6);

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$a */
    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.C0873V.e
        /* JADX INFO: renamed from: a */
        public Drawable mo3699a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1882a.m9694n(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e3) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e3);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$b */
    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.C0873V.e
        /* JADX INFO: renamed from: a */
        public Drawable mo3699a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1284c.m6478b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e3) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$c */
    private static class c extends C0928h {
        public c(int i3) {
            super(i3);
        }

        /* JADX INFO: renamed from: b */
        private static int m3700b(int i3, PorterDuff.Mode mode) {
            return ((i3 + 31) * 31) + mode.hashCode();
        }

        /* JADX INFO: renamed from: c */
        PorterDuffColorFilter m3701c(int i3, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(m3700b(i3, mode)));
        }

        /* JADX INFO: renamed from: d */
        PorterDuffColorFilter m3702d(int i3, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(m3700b(i3, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$d */
    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.C0873V.e
        /* JADX INFO: renamed from: a */
        public Drawable mo3699a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC1972a.m10044c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e3) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e3);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$e */
    private interface e {
        /* JADX INFO: renamed from: a */
        Drawable mo3699a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        boolean mo3703a(Context context, int i3, Drawable drawable);

        /* JADX INFO: renamed from: b */
        PorterDuff.Mode mo3704b(int i3);

        /* JADX INFO: renamed from: c */
        Drawable mo3705c(C0873V c0873v, Context context, int i3);

        /* JADX INFO: renamed from: d */
        ColorStateList mo3706d(Context context, int i3);

        /* JADX INFO: renamed from: e */
        boolean mo3707e(Context context, int i3, Drawable drawable);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.V$g */
    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.C0873V.e
        /* JADX INFO: renamed from: a */
        public Drawable mo3699a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1289h.m6510c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e3) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e3);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3675a(String str, e eVar) {
        if (this.f3572b == null) {
            this.f3572b = new C0929i();
        }
        this.f3572b.put(str, eVar);
    }

    /* JADX INFO: renamed from: b */
    private synchronized boolean m3676b(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C0926f c0926f = (C0926f) this.f3574d.get(context);
            if (c0926f == null) {
                c0926f = new C0926f();
                this.f3574d.put(context, c0926f);
            }
            c0926f.m3932h(j3, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3677c(Context context, int i3, ColorStateList colorStateList) {
        if (this.f3571a == null) {
            this.f3571a = new WeakHashMap();
        }
        C0930j c0930j = (C0930j) this.f3571a.get(context);
        if (c0930j == null) {
            c0930j = new C0930j();
            this.f3571a.put(context, c0930j);
        }
        c0930j.m3949a(i3, colorStateList);
    }

    /* JADX INFO: renamed from: d */
    private void m3678d(Context context) {
        if (this.f3576f) {
            return;
        }
        this.f3576f = true;
        Drawable drawableM3691j = m3691j(context, AbstractC1973b.f9492a);
        if (drawableM3691j == null || !m3687q(drawableM3691j)) {
            this.f3576f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* JADX INFO: renamed from: e */
    private static long m3679e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* JADX INFO: renamed from: f */
    private Drawable m3680f(Context context, int i3) {
        if (this.f3575e == null) {
            this.f3575e = new TypedValue();
        }
        TypedValue typedValue = this.f3575e;
        context.getResources().getValue(i3, typedValue, true);
        long jM3679e = m3679e(typedValue);
        Drawable drawableM3683i = m3683i(context, jM3679e);
        if (drawableM3683i != null) {
            return drawableM3683i;
        }
        f fVar = this.f3577g;
        Drawable drawableMo3705c = fVar == null ? null : fVar.mo3705c(this, context, i3);
        if (drawableMo3705c != null) {
            drawableMo3705c.setChangingConfigurations(typedValue.changingConfigurations);
            m3676b(context, jM3679e, drawableMo3705c);
        }
        return drawableMo3705c;
    }

    /* JADX INFO: renamed from: g */
    private static PorterDuffColorFilter m3681g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m3684l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized C0873V m3682h() {
        try {
            if (f3569i == null) {
                C0873V c0873v = new C0873V();
                f3569i = c0873v;
                m3686p(c0873v);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3569i;
    }

    /* JADX INFO: renamed from: i */
    private synchronized Drawable m3683i(Context context, long j3) {
        C0926f c0926f = (C0926f) this.f3574d.get(context);
        if (c0926f == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0926f.m3928d(j3);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0926f.m3933i(j3);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static synchronized PorterDuffColorFilter m3684l(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM3701c;
        c cVar = f3570j;
        porterDuffColorFilterM3701c = cVar.m3701c(i3, mode);
        if (porterDuffColorFilterM3701c == null) {
            porterDuffColorFilterM3701c = new PorterDuffColorFilter(i3, mode);
            cVar.m3702d(i3, mode, porterDuffColorFilterM3701c);
        }
        return porterDuffColorFilterM3701c;
    }

    /* JADX INFO: renamed from: n */
    private ColorStateList m3685n(Context context, int i3) {
        C0930j c0930j;
        WeakHashMap weakHashMap = this.f3571a;
        if (weakHashMap == null || (c0930j = (C0930j) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) c0930j.m3952d(i3);
    }

    /* JADX INFO: renamed from: p */
    private static void m3686p(C0873V c0873v) {
        if (Build.VERSION.SDK_INT < 24) {
            c0873v.m3675a("vector", new g());
            c0873v.m3675a("animated-vector", new b());
            c0873v.m3675a("animated-selector", new a());
            c0873v.m3675a("drawable", new d());
        }
    }

    /* JADX INFO: renamed from: q */
    private static boolean m3687q(Drawable drawable) {
        return (drawable instanceof C1289h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX INFO: renamed from: r */
    private Drawable m3688r(Context context, int i3) {
        int next;
        C0929i c0929i = this.f3572b;
        if (c0929i == null || c0929i.isEmpty()) {
            return null;
        }
        C0930j c0930j = this.f3573c;
        if (c0930j != null) {
            String str = (String) c0930j.m3952d(i3);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f3572b.get(str) == null)) {
                return null;
            }
        } else {
            this.f3573c = new C0930j();
        }
        if (this.f3575e == null) {
            this.f3575e = new TypedValue();
        }
        TypedValue typedValue = this.f3575e;
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        long jM3679e = m3679e(typedValue);
        Drawable drawableM3683i = m3683i(context, jM3679e);
        if (drawableM3683i != null) {
            return drawableM3683i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i3);
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
                String name = xml.getName();
                this.f3573c.m3949a(i3, name);
                e eVar = (e) this.f3572b.get(name);
                if (eVar != null) {
                    drawableM3683i = eVar.mo3699a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM3683i != null) {
                    drawableM3683i.setChangingConfigurations(typedValue.changingConfigurations);
                    m3676b(context, jM3679e, drawableM3683i);
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (drawableM3683i == null) {
            this.f3573c.m3949a(i3, "appcompat_skip_skip");
        }
        return drawableM3683i;
    }

    /* JADX INFO: renamed from: v */
    private Drawable m3689v(Context context, int i3, boolean z2, Drawable drawable) {
        ColorStateList colorStateListM3693m = m3693m(context, i3);
        if (colorStateListM3693m != null) {
            Drawable drawableM17r = AbstractC0000a.m17r(drawable.mutate());
            AbstractC0000a.m14o(drawableM17r, colorStateListM3693m);
            PorterDuff.Mode modeM3694o = m3694o(i3);
            if (modeM3694o != null) {
                AbstractC0000a.m15p(drawableM17r, modeM3694o);
            }
            return drawableM17r;
        }
        f fVar = this.f3577g;
        if ((fVar == null || !fVar.mo3707e(context, i3, drawable)) && !m3698x(context, i3, drawable) && z2) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: w */
    static void m3690w(Drawable drawable, C0884c0 c0884c0, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c0884c0.f3643d;
        if (z2 || c0884c0.f3642c) {
            drawable.setColorFilter(m3681g(z2 ? c0884c0.f3640a : null, c0884c0.f3642c ? c0884c0.f3641b : f3568h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized Drawable m3691j(Context context, int i3) {
        return m3692k(context, i3, false);
    }

    /* JADX INFO: renamed from: k */
    synchronized Drawable m3692k(Context context, int i3, boolean z2) {
        Drawable drawableM3688r;
        try {
            m3678d(context);
            drawableM3688r = m3688r(context, i3);
            if (drawableM3688r == null) {
                drawableM3688r = m3680f(context, i3);
            }
            if (drawableM3688r == null) {
                drawableM3688r = AbstractC0966b.getDrawable(context, i3);
            }
            if (drawableM3688r != null) {
                drawableM3688r = m3689v(context, i3, z2, drawableM3688r);
            }
            if (drawableM3688r != null) {
                AbstractC0836M.m3451b(drawableM3688r);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM3688r;
    }

    /* JADX INFO: renamed from: m */
    synchronized ColorStateList m3693m(Context context, int i3) {
        ColorStateList colorStateListM3685n;
        colorStateListM3685n = m3685n(context, i3);
        if (colorStateListM3685n == null) {
            f fVar = this.f3577g;
            colorStateListM3685n = fVar == null ? null : fVar.mo3706d(context, i3);
            if (colorStateListM3685n != null) {
                m3677c(context, i3, colorStateListM3685n);
            }
        }
        return colorStateListM3685n;
    }

    /* JADX INFO: renamed from: o */
    PorterDuff.Mode m3694o(int i3) {
        f fVar = this.f3577g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo3704b(i3);
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m3695s(Context context) {
        C0926f c0926f = (C0926f) this.f3574d.get(context);
        if (c0926f != null) {
            c0926f.m3926b();
        }
    }

    /* JADX INFO: renamed from: t */
    synchronized Drawable m3696t(Context context, C0908o0 c0908o0, int i3) {
        try {
            Drawable drawableM3688r = m3688r(context, i3);
            if (drawableM3688r == null) {
                drawableM3688r = c0908o0.m3709a(i3);
            }
            if (drawableM3688r == null) {
                return null;
            }
            return m3689v(context, i3, false, drawableM3688r);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m3697u(f fVar) {
        this.f3577g = fVar;
    }

    /* JADX INFO: renamed from: x */
    boolean m3698x(Context context, int i3, Drawable drawable) {
        f fVar = this.f3577g;
        return fVar != null && fVar.mo3703a(context, i3, drawable);
    }
}
