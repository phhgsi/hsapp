package p167z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.C0929i;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p015F.AbstractC0138j;
import p164y.AbstractC2535h;

/* JADX INFO: renamed from: z.x */
/* JADX INFO: loaded from: classes.dex */
class C2591x extends AbstractC2566C {

    /* JADX INFO: renamed from: b */
    private static final Class f11917b;

    /* JADX INFO: renamed from: c */
    private static final Constructor f11918c;

    /* JADX INFO: renamed from: d */
    private static final Method f11919d;

    /* JADX INFO: renamed from: e */
    private static final Method f11920e;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f11918c = constructor;
        f11917b = cls;
        f11919d = method2;
        f11920e = method;
    }

    C2591x() {
    }

    /* JADX INFO: renamed from: i */
    private static boolean m12327i(Object obj, ByteBuffer byteBuffer, int i3, int i4, boolean z2) {
        try {
            return ((Boolean) f11919d.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    private static Typeface m12328j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f11917b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f11920e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12329k() {
        Method method = f11919d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* JADX INFO: renamed from: l */
    private static Object m12330l() {
        try {
            return f11918c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: a */
    public Typeface mo12231a(Context context, AbstractC2535h.c cVar, Resources resources, int i3) {
        Object objM12330l = m12330l();
        if (objM12330l == null) {
            return null;
        }
        for (AbstractC2535h.d dVar : cVar.m12117a()) {
            ByteBuffer byteBufferM12247b = AbstractC2567D.m12247b(context, resources, dVar.m12119b());
            if (byteBufferM12247b == null || !m12327i(objM12330l, byteBufferM12247b, dVar.m12120c(), dVar.m12122e(), dVar.m12123f())) {
                return null;
            }
        }
        return m12328j(objM12330l);
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: b */
    public Typeface mo12232b(Context context, CancellationSignal cancellationSignal, AbstractC0138j.b[] bVarArr, int i3) {
        Object objM12330l = m12330l();
        if (objM12330l == null) {
            return null;
        }
        C0929i c0929i = new C0929i();
        for (AbstractC0138j.b bVar : bVarArr) {
            Uri uriM413e = bVar.m413e();
            ByteBuffer byteBufferM12251f = (ByteBuffer) c0929i.get(uriM413e);
            if (byteBufferM12251f == null) {
                byteBufferM12251f = AbstractC2567D.m12251f(context, cancellationSignal, uriM413e);
                c0929i.put(uriM413e, byteBufferM12251f);
            }
            if (byteBufferM12251f == null || !m12327i(objM12330l, byteBufferM12251f, bVar.m412d(), bVar.m415g(), bVar.m416h())) {
                return null;
            }
        }
        Typeface typefaceM12328j = m12328j(objM12330l);
        if (typefaceM12328j == null) {
            return null;
        }
        return Typeface.create(typefaceM12328j, i3);
    }
}
