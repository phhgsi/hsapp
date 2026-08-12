package p164y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p024I.AbstractC0206c;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: y.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2538k {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f11819a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    private static final WeakHashMap f11820b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    private static final Object f11821c = new Object();

    /* JADX INFO: renamed from: y.k$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Drawable m12150a(Resources resources, int i3, Resources.Theme theme) {
            return resources.getDrawable(i3, theme);
        }

        /* JADX INFO: renamed from: b */
        static Drawable m12151b(Resources resources, int i3, int i4, Resources.Theme theme) {
            return resources.getDrawableForDensity(i3, i4, theme);
        }
    }

    /* JADX INFO: renamed from: y.k$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static int m12152a(Resources resources, int i3, Resources.Theme theme) {
            return resources.getColor(i3, theme);
        }

        /* JADX INFO: renamed from: b */
        static ColorStateList m12153b(Resources resources, int i3, Resources.Theme theme) {
            return resources.getColorStateList(i3, theme);
        }
    }

    /* JADX INFO: renamed from: y.k$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        final ColorStateList f11822a;

        /* JADX INFO: renamed from: b */
        final Configuration f11823b;

        /* JADX INFO: renamed from: c */
        final int f11824c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f11822a = colorStateList;
            this.f11823b = configuration;
            this.f11824c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: y.k$d */
    private static final class d {

        /* JADX INFO: renamed from: a */
        final Resources f11825a;

        /* JADX INFO: renamed from: b */
        final Resources.Theme f11826b;

        d(Resources resources, Resources.Theme theme) {
            this.f11825a = resources;
            this.f11826b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f11825a.equals(dVar.f11825a) && AbstractC0206c.m596a(this.f11826b, dVar.f11826b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC0206c.m597b(this.f11825a, this.f11826b);
        }
    }

    /* JADX INFO: renamed from: y.k$e */
    public static abstract class e {
        /* JADX INFO: renamed from: e */
        public static Handler m12156e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* JADX INFO: renamed from: c */
        public final void m12157c(final int i3, Handler handler) {
            m12156e(handler).post(new Runnable() { // from class: y.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11832d.mo2108f(i3);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public final void m12158d(final Typeface typeface, Handler handler) {
            m12156e(handler).post(new Runnable() { // from class: y.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11830d.mo2109g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo2108f(int i3);

        /* JADX INFO: renamed from: g */
        public abstract void mo2109g(Typeface typeface);
    }

    /* JADX INFO: renamed from: y.k$f */
    public static final class f {

        /* JADX INFO: renamed from: y.k$f$a */
        static class a {

            /* JADX INFO: renamed from: a */
            private static final Object f11827a = new Object();

            /* JADX INFO: renamed from: b */
            private static Method f11828b;

            /* JADX INFO: renamed from: c */
            private static boolean f11829c;

            /* JADX WARN: Removed duplicated region for block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            static void m12160a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = p164y.AbstractC2538k.f.a.f11827a
                    monitor-enter(r0)
                    boolean r1 = p164y.AbstractC2538k.f.a.f11829c     // Catch: java.lang.Throwable -> L17
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    p164y.AbstractC2538k.f.a.f11828b = r3     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    goto L21
                L17:
                    r6 = move-exception
                    goto L39
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L17
                L21:
                    p164y.AbstractC2538k.f.a.f11829c = r1     // Catch: java.lang.Throwable -> L17
                L23:
                    java.lang.reflect.Method r1 = p164y.AbstractC2538k.f.a.f11828b     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L37
                    r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L17 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
                    goto L37
                L2b:
                    r6 = move-exception
                    goto L2e
                L2d:
                    r6 = move-exception
                L2e:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L17
                    p164y.AbstractC2538k.f.a.f11828b = r2     // Catch: java.lang.Throwable -> L17
                L37:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    return
                L39:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p164y.AbstractC2538k.f.a.m12160a(android.content.res.Resources$Theme):void");
            }
        }

        /* JADX INFO: renamed from: y.k$f$b */
        static class b {
            /* JADX INFO: renamed from: a */
            static void m12161a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m12159a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.m12161a(theme);
            } else {
                a.m12160a(theme);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m12135a(d dVar, int i3, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f11821c) {
            try {
                WeakHashMap weakHashMap = f11820b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i3, new c(colorStateList, dVar.f11825a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f11824c == r5.hashCode()) goto L22;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList m12136b(p164y.AbstractC2538k.d r5, int r6) {
        /*
            java.lang.Object r0 = p164y.AbstractC2538k.f11821c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = p164y.AbstractC2538k.f11820b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            y.k$c r2 = (p164y.AbstractC2538k.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f11823b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f11825a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f11826b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f11824c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f11824c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f11822a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164y.AbstractC2538k.m12136b(y.k$d, int):android.content.res.ColorStateList");
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m12137c(Context context, int i3) {
        if (context.isRestricted()) {
            return null;
        }
        return m12148n(context, i3, new TypedValue(), 0, null, null, false, true);
    }

    /* JADX INFO: renamed from: d */
    public static int m12138d(Resources resources, int i3, Resources.Theme theme) {
        return b.m12152a(resources, i3, theme);
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m12139e(Resources resources, int i3, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListM12136b = m12136b(dVar, i3);
        if (colorStateListM12136b != null) {
            return colorStateListM12136b;
        }
        ColorStateList colorStateListM12146l = m12146l(resources, i3, theme);
        if (colorStateListM12146l == null) {
            return b.m12153b(resources, i3, theme);
        }
        m12135a(dVar, i3, colorStateListM12146l, theme);
        return colorStateListM12146l;
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m12140f(Resources resources, int i3, Resources.Theme theme) {
        return a.m12150a(resources, i3, theme);
    }

    /* JADX INFO: renamed from: g */
    public static Drawable m12141g(Resources resources, int i3, int i4, Resources.Theme theme) {
        return a.m12151b(resources, i3, i4, theme);
    }

    /* JADX INFO: renamed from: h */
    public static Typeface m12142h(Context context, int i3) {
        if (context.isRestricted()) {
            return null;
        }
        return m12148n(context, i3, new TypedValue(), 0, null, null, false, false);
    }

    /* JADX INFO: renamed from: i */
    public static Typeface m12143i(Context context, int i3, TypedValue typedValue, int i4, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m12148n(context, i3, typedValue, i4, eVar, null, true, false);
    }

    /* JADX INFO: renamed from: j */
    public static void m12144j(Context context, int i3, e eVar, Handler handler) {
        AbstractC0211h.m610g(eVar);
        if (context.isRestricted()) {
            eVar.m12157c(-4, handler);
        } else {
            m12148n(context, i3, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    /* JADX INFO: renamed from: k */
    private static TypedValue m12145k() {
        ThreadLocal threadLocal = f11819a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: l */
    private static ColorStateList m12146l(Resources resources, int i3, Resources.Theme theme) {
        if (m12147m(resources, i3)) {
            return null;
        }
        try {
            return AbstractC2530c.m12084a(resources, resources.getXml(i3), theme);
        } catch (Exception e3) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    private static boolean m12147m(Resources resources, int i3) {
        TypedValue typedValueM12145k = m12145k();
        resources.getValue(i3, typedValueM12145k, true);
        int i4 = typedValueM12145k.type;
        return i4 >= 28 && i4 <= 31;
    }

    /* JADX INFO: renamed from: n */
    private static Typeface m12148n(Context context, int i3, TypedValue typedValue, int i4, e eVar, Handler handler, boolean z2, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        Typeface typefaceM12149o = m12149o(context, resources, typedValue, i3, i4, eVar, handler, z2, z3);
        if (typefaceM12149o != null || eVar != null || z3) {
            return typefaceM12149o;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i3) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface m12149o(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, p164y.AbstractC2538k.e r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p164y.AbstractC2538k.m12149o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, y.k$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
