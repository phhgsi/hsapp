package p128m0;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import p135o0.C2287a;

/* JADX INFO: renamed from: m0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2241q {
    /* JADX INFO: renamed from: a */
    public static Map m10818a(Context context) {
        String strM10819b;
        C2287a c2287aM10903f = C2287a.m10903f(context);
        if (c2287aM10903f.f10481I == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry entry : c2287aM10903f.f10481I.entrySet()) {
            String str = (String) entry.getKey();
            try {
                strM10819b = m10819b(context, (String) entry.getValue());
            } catch (UnsupportedEncodingException unused) {
                strM10819b = null;
            }
            if ((strM10819b != null) & (str != null)) {
                map.put(str, strM10819b);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    private static String m10819b(Context context, String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("%DEVICEID%")) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null) {
                string = "";
            }
            str = str.replace("%DEVICEID%", string);
        }
        if (!str.contains("%DEVICENAME64%")) {
            return str;
        }
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        if (!str3.startsWith(str2)) {
            str3 = str2 + " " + str3;
        }
        return str.replace("%DEVICENAME64%", Base64.encodeToString(str3.getBytes("UTF-8"), 2));
    }
}
