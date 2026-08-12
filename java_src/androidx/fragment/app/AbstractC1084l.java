package androidx.fragment.app;

import androidx.collection.C0929i;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1084l {

    /* JADX INFO: renamed from: a */
    private static final C0929i f5185a = new C0929i();

    /* JADX INFO: renamed from: b */
    static boolean m4959b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m4960c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Class m4960c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0929i c0929i = f5185a;
        C0929i c0929i2 = (C0929i) c0929i.get(classLoader);
        if (c0929i2 == null) {
            c0929i2 = new C0929i();
            c0929i.put(classLoader, c0929i2);
        }
        Class cls = (Class) c0929i2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0929i2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: d */
    public static Class m4961d(ClassLoader classLoader, String str) {
        try {
            return m4960c(classLoader, str);
        } catch (ClassCastException e3) {
            throw new Fragment.C1052l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e3);
        } catch (ClassNotFoundException e4) {
            throw new Fragment.C1052l("Unable to instantiate fragment " + str + ": make sure class name exists", e4);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Fragment mo4868a(ClassLoader classLoader, String str);
}
