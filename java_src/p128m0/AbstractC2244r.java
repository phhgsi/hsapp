package p128m0;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: m0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2244r {

    /* JADX INFO: renamed from: a */
    private static final List f10376a = Arrays.asList("shikshak.educationportal3.in", "hamareshikshak.educationportal3.mp.gov.in");

    /* JADX INFO: renamed from: a */
    public static String m10820a(Context context, String str) {
        String strM10821b = m10821b(context);
        if (str == null || str.isEmpty()) {
            return strM10821b;
        }
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        return strM10821b + str;
    }

    /* JADX INFO: renamed from: b */
    public static String m10821b(Context context) {
        String string = context.getSharedPreferences("dynamic_route_cache", 0).getString("active_url", "https://hamareshikshak.educationportal3.mp.gov.in");
        return (string == null || !string.endsWith("/")) ? string : string.substring(0, string.length() - 1);
    }

    /* JADX INFO: renamed from: c */
    public static String m10822c(Context context) {
        try {
            return Uri.parse(m10821b(context)).getHost();
        } catch (Exception e3) {
            Log.e("DynamicRouteHelper", "Error parsing active URL host", e3);
            return "hamareshikshak.educationportal3.mp.gov.in";
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10823d(Context context) {
        return System.currentTimeMillis() < context.getSharedPreferences("dynamic_route_cache", 0).getLong("next_check_time", 0L);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10824e(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            if (str.contains(m10822c(context))) {
                return true;
            }
            Iterator it = f10376a.iterator();
            while (it.hasNext()) {
                if (str.contains((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static void m10825f(Context context, String str, int i3) {
        context.getSharedPreferences("dynamic_route_cache", 0).edit().putString("active_url", str).putLong("next_check_time", System.currentTimeMillis() + (((long) i3) * 60000)).apply();
    }

    /* JADX INFO: renamed from: g */
    public static String m10826g(Context context, String str) {
        String str2;
        String str3;
        if (str == null) {
            return m10821b(context);
        }
        String strM10821b = m10821b(context);
        for (String str4 : f10376a) {
            String str5 = "https://" + str4;
            String str6 = "http://" + str4;
            if (str.startsWith(str5)) {
                return str.replace(str5, strM10821b);
            }
            if (str.startsWith(str6)) {
                return str.replace(str6, strM10821b);
            }
        }
        try {
            String host = Uri.parse(strM10821b).getHost();
            str2 = "https://" + host;
            str3 = "http://" + host;
        } catch (Exception unused) {
        }
        if (!str.startsWith(str2)) {
            if (!str.startsWith(str3)) {
                if (str.startsWith("https://median.co")) {
                    return strM10821b;
                }
                if (str.startsWith("/")) {
                    return strM10821b + str;
                }
            }
        }
        return str;
    }
}
