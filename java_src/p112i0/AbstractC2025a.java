package p112i0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: i0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2025a {

    /* JADX INFO: renamed from: a */
    private static long f9641a;

    /* JADX INFO: renamed from: b */
    private static Method f9642b;

    /* JADX INFO: renamed from: a */
    public static void m10210a(String str) {
        AbstractC2026b.m10216a(m10215f(str));
    }

    /* JADX INFO: renamed from: b */
    public static void m10211b() {
        AbstractC2026b.m10217b();
    }

    /* JADX INFO: renamed from: c */
    private static void m10212c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10213d() {
        return Build.VERSION.SDK_INT >= 29 ? AbstractC2027c.m10218a() : m10214e();
    }

    /* JADX INFO: renamed from: e */
    private static boolean m10214e() {
        try {
            if (f9642b == null) {
                f9641a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9642b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9642b.invoke(null, Long.valueOf(f9641a))).booleanValue();
        } catch (Exception e3) {
            m10212c("isTagEnabled", e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m10215f(String str) {
        return str.length() <= 127 ? str : str.substring(0, ModuleDescriptor.MODULE_VERSION);
    }
}
