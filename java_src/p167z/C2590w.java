package p167z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p015F.AbstractC0138j;
import p164y.AbstractC2535h;

/* JADX INFO: renamed from: z.w */
/* JADX INFO: loaded from: classes.dex */
class C2590w extends AbstractC2566C {

    /* JADX INFO: renamed from: b */
    private static Class f11912b = null;

    /* JADX INFO: renamed from: c */
    private static Constructor f11913c = null;

    /* JADX INFO: renamed from: d */
    private static Method f11914d = null;

    /* JADX INFO: renamed from: e */
    private static Method f11915e = null;

    /* JADX INFO: renamed from: f */
    private static boolean f11916f = false;

    C2590w() {
    }

    /* JADX INFO: renamed from: i */
    private static boolean m12322i(Object obj, String str, int i3, boolean z2) throws NoSuchMethodException {
        m12325l();
        try {
            try {
                return ((Boolean) f11914d.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
            } catch (InvocationTargetException e3) {
                e = e3;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: j */
    private static Typeface m12323j(Object obj) throws NoSuchMethodException {
        m12325l();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f11912b, 1);
            Array.set(objNewInstance, 0, obj);
            try {
                return (Typeface) f11915e.invoke(null, objNewInstance);
            } catch (InvocationTargetException e3) {
                e = e3;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: k */
    private File m12324k(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private static void m12325l() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f11916f) {
            return;
        }
        f11916f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f11913c = constructor;
        f11912b = cls;
        f11914d = method2;
        f11915e = method;
    }

    /* JADX INFO: renamed from: m */
    private static Object m12326m() throws NoSuchMethodException {
        m12325l();
        try {
            return f11913c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: a */
    public Typeface mo12231a(Context context, AbstractC2535h.c cVar, Resources resources, int i3) throws NoSuchMethodException {
        Object objM12326m = m12326m();
        for (AbstractC2535h.d dVar : cVar.m12117a()) {
            File fileM12250e = AbstractC2567D.m12250e(context);
            if (fileM12250e == null) {
                return null;
            }
            try {
                if (!AbstractC2567D.m12248c(fileM12250e, resources, dVar.m12119b())) {
                    return null;
                }
                if (!m12322i(objM12326m, fileM12250e.getPath(), dVar.m12122e(), dVar.m12123f())) {
                    return null;
                }
                fileM12250e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM12250e.delete();
            }
        }
        return m12323j(objM12326m);
    }

    @Override // p167z.AbstractC2566C
    /* JADX INFO: renamed from: b */
    public Typeface mo12232b(Context context, CancellationSignal cancellationSignal, AbstractC0138j.b[] bVarArr, int i3) {
        Typeface typefaceM12241d;
        if (bVarArr.length < 1) {
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
                File fileM12324k = m12324k(parcelFileDescriptorOpenFileDescriptor);
                if (fileM12324k == null || !fileM12324k.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceM12241d = super.m12241d(context, fileInputStream);
                        fileInputStream.close();
                    } finally {
                    }
                } else {
                    typefaceM12241d = Typeface.createFromFile(fileM12324k);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceM12241d;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
