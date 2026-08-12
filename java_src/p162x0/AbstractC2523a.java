package p162x0;

import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2523a {
    /* JADX INFO: renamed from: a */
    private static String m12053a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* JADX INFO: renamed from: b */
    public static void m12054b(String str, String str2, Object obj) {
        String strM12057e = m12057e(str);
        if (Log.isLoggable(strM12057e, 3)) {
            Log.d(strM12057e, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12055c(String str, String str2, Object... objArr) {
        String strM12057e = m12057e(str);
        if (Log.isLoggable(strM12057e, 3)) {
            Log.d(strM12057e, String.format(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12056d(String str, String str2, Throwable th) {
        String strM12057e = m12057e(str);
        if (Log.isLoggable(strM12057e, 6)) {
            Log.e(strM12057e, str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m12057e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m12053a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* JADX INFO: renamed from: f */
    public static void m12058f(String str, String str2, Object obj) {
        String strM12057e = m12057e(str);
        if (Log.isLoggable(strM12057e, 4)) {
            Log.i(strM12057e, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m12059g(String str, String str2, Object obj) {
        String strM12057e = m12057e(str);
        if (Log.isLoggable(strM12057e, 5)) {
            Log.w(strM12057e, String.format(str2, obj));
        }
    }
}
