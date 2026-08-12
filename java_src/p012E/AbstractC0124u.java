package p012E;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: E.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0124u {

    /* JADX INFO: renamed from: a */
    private static long f243a;

    /* JADX INFO: renamed from: b */
    private static Method f244b;

    /* JADX INFO: renamed from: c */
    private static Method f245c;

    /* JADX INFO: renamed from: d */
    private static Method f246d;

    /* JADX INFO: renamed from: e */
    private static Method f247e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f243a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f244b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f245c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f246d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f247e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e3) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m359a(String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m360b() {
        Trace.endSection();
    }
}
