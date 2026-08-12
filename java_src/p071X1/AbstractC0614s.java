package p071X1;

import p090c2.InterfaceC1315b;
import p090c2.InterfaceC1316c;
import p090c2.InterfaceC1317d;
import p090c2.InterfaceC1318e;

/* JADX INFO: renamed from: X1.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0614s {

    /* JADX INFO: renamed from: a */
    private static final C0615t f2013a;

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1315b[] f2014b;

    static {
        C0615t c0615t = null;
        try {
            c0615t = (C0615t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0615t == null) {
            c0615t = new C0615t();
        }
        f2013a = c0615t;
        f2014b = new InterfaceC1315b[0];
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1317d m2155a(AbstractC0604i abstractC0604i) {
        return f2013a.m2161a(abstractC0604i);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1315b m2156b(Class cls) {
        return f2013a.m2162b(cls);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC1316c m2157c(Class cls) {
        return f2013a.m2163c(cls, "");
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC1318e m2158d(AbstractC0609n abstractC0609n) {
        return f2013a.m2164d(abstractC0609n);
    }

    /* JADX INFO: renamed from: e */
    public static String m2159e(InterfaceC0603h interfaceC0603h) {
        return f2013a.m2165e(interfaceC0603h);
    }

    /* JADX INFO: renamed from: f */
    public static String m2160f(AbstractC0607l abstractC0607l) {
        return f2013a.m2166f(abstractC0607l);
    }
}
