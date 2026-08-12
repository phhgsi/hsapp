package p135o0;

import android.app.Activity;
import android.net.Uri;
import android.webkit.URLUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2296j {
    /* JADX INFO: renamed from: a */
    public static boolean m10964a(String str, Activity activity) {
        if (str != null && activity != null) {
            List list = C2287a.m10903f(activity).f10576v;
            if (list == null) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Pattern) it.next()).matcher(str).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m10965b(String str, JSONObject jSONObject) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (typeof ");
        sb.append(str);
        sb.append(" === 'function') { ");
        sb.append(str);
        sb.append("(");
        if (jSONObject != null) {
            sb.append(jSONObject.toString());
        }
        sb.append("); }");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static List m10966c(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj != null) {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    String strOptString = jSONArray.optString(i3);
                    if (strOptString != null && !strOptString.isEmpty()) {
                        try {
                            arrayList.add(Pattern.compile(strOptString));
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if (!str.isEmpty()) {
                    try {
                        arrayList.add(Pattern.compile(str));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static String m10967d(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    /* JADX INFO: renamed from: e */
    public static String m10968e(String str, String str2, String str3) {
        return URLUtil.guessFileName(str, str2, str3);
    }

    /* JADX INFO: renamed from: f */
    public static String m10969f(String str) {
        if (str == null) {
            return "null";
        }
        return "\"" + str.replace("\\", "\\\\").replace("'", "\\'").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r") + "\"";
    }

    /* JADX INFO: renamed from: g */
    public static String m10970g(JSONObject jSONObject, String str) {
        if (jSONObject == null || str == null || jSONObject.isNull(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str, null);
        if (strOptString == null || !strOptString.equals("null")) {
            return strOptString;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m10971h(String str, List list) {
        if (str != null && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Pattern) it.next()).matcher(str).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m10972i(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return str.replaceAll("/+$", "").equals(str2.replaceAll("/+$", ""));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m10973j(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                Uri uri = Uri.parse(str);
                Uri uri2 = Uri.parse(str2);
                String host = uri.getHost();
                String host2 = uri2.getHost();
                String path = uri.getPath();
                String path2 = uri2.getPath();
                if (host == null || host2 == null || !host.equalsIgnoreCase(host2)) {
                    return false;
                }
                if (path == null) {
                    path = "/";
                }
                if (path2 == null) {
                    path2 = "/";
                }
                return path.equals(path2);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
