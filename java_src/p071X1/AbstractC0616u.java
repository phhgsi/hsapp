package p071X1;

import java.util.Map;
import p035L1.InterfaceC0371c;
import p068W1.InterfaceC0566a;
import p068W1.InterfaceC0577l;
import p068W1.InterfaceC0581p;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: X1.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0616u {
    /* JADX INFO: renamed from: a */
    public static Map m2167a(Object obj) {
        if (obj instanceof InterfaceC0622a) {
            m2174h(obj, "kotlin.collections.MutableMap");
        }
        return m2169c(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Object m2168b(Object obj, int i3) {
        if (obj != null && !m2171e(obj, i3)) {
            m2174h(obj, "kotlin.jvm.functions.Function" + i3);
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static Map m2169c(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e3) {
            throw m2173g(e3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m2170d(Object obj) {
        if (obj instanceof InterfaceC0603h) {
            return ((InterfaceC0603h) obj).mo1771b();
        }
        if (obj instanceof InterfaceC0566a) {
            return 0;
        }
        if (obj instanceof InterfaceC0577l) {
            return 1;
        }
        return obj instanceof InterfaceC0581p ? 2 : -1;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2171e(Object obj, int i3) {
        return (obj instanceof InterfaceC0371c) && m2170d(obj) == i3;
    }

    /* JADX INFO: renamed from: f */
    private static Throwable m2172f(Throwable th) {
        return AbstractC0606k.m2149i(th, AbstractC0616u.class.getName());
    }

    /* JADX INFO: renamed from: g */
    public static ClassCastException m2173g(ClassCastException classCastException) {
        throw ((ClassCastException) m2172f(classCastException));
    }

    /* JADX INFO: renamed from: h */
    public static void m2174h(Object obj, String str) {
        m2175i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* JADX INFO: renamed from: i */
    public static void m2175i(String str) {
        throw m2173g(new ClassCastException(str));
    }
}
