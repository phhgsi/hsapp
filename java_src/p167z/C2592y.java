package p167z;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p015F.AbstractC0138j;
import p164y.AbstractC2535h;

/* JADX INFO: renamed from: z.y */
/* JADX INFO: loaded from: classes.dex */
public class C2592y extends C2590w {

    /* JADX INFO: renamed from: g */
    protected final Class f11921g;

    /* JADX INFO: renamed from: h */
    protected final Constructor f11922h;

    /* JADX INFO: renamed from: i */
    protected final Method f11923i;

    /* JADX INFO: renamed from: j */
    protected final Method f11924j;

    /* JADX INFO: renamed from: k */
    protected final Method f11925k;

    /* JADX INFO: renamed from: l */
    protected final Method f11926l;

    /* JADX INFO: renamed from: m */
    protected final Method f11927m;

    public C2592y() {
        Class clsM12342w;
        Constructor constructorM12343x;
        Method methodM12339t;
        Method methodM12340u;
        Method methodM12344y;
        Method methodM12338s;
        Method methodMo12341v;
        try {
            clsM12342w = m12342w();
            constructorM12343x = m12343x(clsM12342w);
            methodM12339t = m12339t(clsM12342w);
            methodM12340u = m12340u(clsM12342w);
            methodM12344y = m12344y(clsM12342w);
            methodM12338s = m12338s(clsM12342w);
            methodMo12341v = mo12341v(clsM12342w);
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e3.getClass().getName(), e3);
            clsM12342w = null;
            constructorM12343x = null;
            methodM12339t = null;
            methodM12340u = null;
            methodM12344y = null;
            methodM12338s = null;
            methodMo12341v = null;
        }
        this.f11921g = clsM12342w;
        this.f11922h = constructorM12343x;
        this.f11923i = methodM12339t;
        this.f11924j = methodM12340u;
        this.f11925k = methodM12344y;
        this.f11926l = methodM12338s;
        this.f11927m = methodMo12341v;
    }

    /* JADX INFO: renamed from: m */
    private Object m12331m() {
        try {
            return this.f11922h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m12332n(Object obj) {
        try {
            this.f11926l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    private boolean m12333o(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f11923i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m12334p(Object obj, ByteBuffer byteBuffer, int i3, int i4, int i5) {
        try {
            return ((Boolean) this.f11924j.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Integer.valueOf(i5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    private boolean m12335q(Object obj) {
        try {
            return ((Boolean) this.f11925k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    private boolean m12336r() {
        if (this.f11923i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f11923i != null;
    }

    @Override // p167z.C2590w, p167z.AbstractC2566C
    /* JADX INFO: renamed from: a */
    public Typeface mo12231a(Context context, AbstractC2535h.c cVar, Resources resources, int i3) {
        if (!m12336r()) {
            return super.mo12231a(context, cVar, resources, i3);
        }
        Object objM12331m = m12331m();
        if (objM12331m == null) {
            return null;
        }
        AbstractC2535h.d[] dVarArrM12117a = cVar.m12117a();
        int length = dVarArrM12117a.length;
        int i4 = 0;
        while (i4 < length) {
            AbstractC2535h.d dVar = dVarArrM12117a[i4];
            Context context2 = context;
            if (!m12333o(context2, objM12331m, dVar.m12118a(), dVar.m12120c(), dVar.m12122e(), dVar.m12123f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.m12121d()))) {
                m12332n(objM12331m);
                return null;
            }
            i4++;
            context = context2;
        }
        if (m12335q(objM12331m)) {
            return mo12337j(objM12331m);
        }
        return null;
    }

    @Override // p167z.C2590w, p167z.AbstractC2566C
    /* JADX INFO: renamed from: b */
    public Typeface mo12232b(Context context, CancellationSignal cancellationSignal, AbstractC0138j.b[] bVarArr, int i3) {
        Typeface typefaceMo12337j;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (m12336r()) {
            Map mapM12253h = AbstractC2567D.m12253h(context, bVarArr, cancellationSignal);
            Object objM12331m = m12331m();
            if (objM12331m == null) {
                return null;
            }
            int length = bVarArr.length;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                AbstractC0138j.b bVar = bVarArr[i4];
                ByteBuffer byteBuffer = (ByteBuffer) mapM12253h.get(bVar.m413e());
                if (byteBuffer == null) {
                    obj = objM12331m;
                } else {
                    boolean zM12334p = m12334p(objM12331m, byteBuffer, bVar.m412d(), bVar.m415g(), bVar.m416h() ? 1 : 0);
                    obj = objM12331m;
                    if (!zM12334p) {
                        m12332n(obj);
                        return null;
                    }
                    z2 = true;
                }
                i4++;
                objM12331m = obj;
                z2 = z2;
            }
            Object obj2 = objM12331m;
            if (!z2) {
                m12332n(obj2);
                return null;
            }
            if (m12335q(obj2) && (typefaceMo12337j = mo12337j(obj2)) != null) {
                return Typeface.create(typefaceMo12337j, i3);
            }
            return null;
        }
        AbstractC0138j.b bVarMo12235h = mo12235h(bVarArr, i3);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarMo12235h.m413e(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarMo12235h.m415g()).setItalic(bVarMo12235h.m416h()).build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceBuild;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ Typeface mo12233c(Context context, CancellationSignal cancellationSignal, List list, int i3) {
        return super.mo12233c(context, cancellationSignal, list, i3);
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: e */
    public Typeface mo12234e(Context context, Resources resources, int i3, String str, int i4) {
        if (!m12336r()) {
            return super.mo12234e(context, resources, i3, str, i4);
        }
        Object objM12331m = m12331m();
        if (objM12331m == null) {
            return null;
        }
        if (!m12333o(context, objM12331m, str, 0, -1, -1, null)) {
            m12332n(objM12331m);
            return null;
        }
        if (m12335q(objM12331m)) {
            return mo12337j(objM12331m);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    protected Typeface mo12337j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f11921g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f11927m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    protected Method m12338s(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    /* JADX INFO: renamed from: t */
    protected Method m12339t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: u */
    protected Method m12340u(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: v */
    protected Method mo12341v(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: w */
    protected Class m12342w() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* JADX INFO: renamed from: x */
    protected Constructor m12343x(Class cls) {
        return cls.getConstructor(null);
    }

    /* JADX INFO: renamed from: y */
    protected Method m12344y(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
