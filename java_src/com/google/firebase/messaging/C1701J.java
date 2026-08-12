package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.firebase.messaging.J */
/* JADX INFO: loaded from: classes.dex */
public class C1701J {

    /* JADX INFO: renamed from: a */
    private final Bundle f8503a;

    public C1701J(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f8503a = new Bundle(bundle);
    }

    /* JADX INFO: renamed from: d */
    private static int m9309d(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* JADX INFO: renamed from: s */
    private static boolean m9310s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m9311t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m9313v("gcm.n.e")));
    }

    /* JADX INFO: renamed from: u */
    private static boolean m9312u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* JADX INFO: renamed from: v */
    private static String m9313v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* JADX INFO: renamed from: w */
    private String m9314w(String str) {
        if (!this.f8503a.containsKey(str) && str.startsWith("gcm.n.")) {
            String strM9313v = m9313v(str);
            if (this.f8503a.containsKey(strM9313v)) {
                return strM9313v;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: z */
    private static String m9315z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m9316a(String str) {
        String strM9330p = m9330p(str);
        return "1".equals(strM9330p) || Boolean.parseBoolean(strM9330p);
    }

    /* JADX INFO: renamed from: b */
    public Integer m9317b(String str) {
        String strM9330p = m9330p(str);
        if (TextUtils.isEmpty(strM9330p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM9330p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m9315z(str) + "(" + strM9330p + ") into an int");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public JSONArray m9318c(String str) {
        String strM9330p = m9330p(str);
        if (TextUtils.isEmpty(strM9330p)) {
            return null;
        }
        try {
            return new JSONArray(strM9330p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m9315z(str) + ": " + strM9330p + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    int[] m9319e() {
        JSONArray jSONArrayM9318c = m9318c("gcm.n.light_settings");
        if (jSONArrayM9318c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM9318c.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = m9309d(jSONArrayM9318c.optString(0));
            iArr[1] = jSONArrayM9318c.optInt(1);
            iArr[2] = jSONArrayM9318c.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e3) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM9318c + ". " + e3.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM9318c + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public Uri m9320f() {
        String strM9330p = m9330p("gcm.n.link_android");
        if (TextUtils.isEmpty(strM9330p)) {
            strM9330p = m9330p("gcm.n.link");
        }
        if (TextUtils.isEmpty(strM9330p)) {
            return null;
        }
        return Uri.parse(strM9330p);
    }

    /* JADX INFO: renamed from: g */
    public Object[] m9321g(String str) {
        JSONArray jSONArrayM9318c = m9318c(str + "_loc_args");
        if (jSONArrayM9318c == null) {
            return null;
        }
        int length = jSONArrayM9318c.length();
        String[] strArr = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            strArr[i3] = jSONArrayM9318c.optString(i3);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: h */
    public String m9322h(String str) {
        return m9330p(str + "_loc_key");
    }

    /* JADX INFO: renamed from: i */
    public String m9323i(Resources resources, String str, String str2) {
        String strM9322h = m9322h(str2);
        if (TextUtils.isEmpty(strM9322h)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM9322h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m9315z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrM9321g = m9321g(str2);
        if (objArrM9321g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM9321g);
        } catch (MissingFormatArgumentException e3) {
            Log.w("NotificationParams", "Missing format argument for " + m9315z(str2) + ": " + Arrays.toString(objArrM9321g) + " Default value will be used.", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public Long m9324j(String str) {
        String strM9330p = m9330p(str);
        if (TextUtils.isEmpty(strM9330p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strM9330p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m9315z(str) + "(" + strM9330p + ") into a long");
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public String m9325k() {
        return m9330p("gcm.n.android_channel_id");
    }

    /* JADX INFO: renamed from: l */
    Integer m9326l() {
        Integer numM9317b = m9317b("gcm.n.notification_count");
        if (numM9317b == null) {
            return null;
        }
        if (numM9317b.intValue() >= 0) {
            return numM9317b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM9317b + ". Skipping setting notificationCount.");
        return null;
    }

    /* JADX INFO: renamed from: m */
    Integer m9327m() {
        Integer numM9317b = m9317b("gcm.n.notification_priority");
        if (numM9317b == null) {
            return null;
        }
        if (numM9317b.intValue() >= -2 && numM9317b.intValue() <= 2) {
            return numM9317b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM9317b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public String m9328n(Resources resources, String str, String str2) {
        String strM9330p = m9330p(str2);
        return !TextUtils.isEmpty(strM9330p) ? strM9330p : m9323i(resources, str, str2);
    }

    /* JADX INFO: renamed from: o */
    public String m9329o() {
        String strM9330p = m9330p("gcm.n.sound2");
        return TextUtils.isEmpty(strM9330p) ? m9330p("gcm.n.sound") : strM9330p;
    }

    /* JADX INFO: renamed from: p */
    public String m9330p(String str) {
        return this.f8503a.getString(m9314w(str));
    }

    /* JADX INFO: renamed from: q */
    public long[] m9331q() {
        JSONArray jSONArrayM9318c = m9318c("gcm.n.vibrate_timings");
        if (jSONArrayM9318c == null) {
            return null;
        }
        try {
            if (jSONArrayM9318c.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM9318c.length();
            long[] jArr = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                jArr[i3] = jSONArrayM9318c.optLong(i3);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM9318c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    Integer m9332r() {
        Integer numM9317b = m9317b("gcm.n.visibility");
        if (numM9317b == null) {
            return null;
        }
        if (numM9317b.intValue() >= -1 && numM9317b.intValue() <= 1) {
            return numM9317b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + numM9317b + ". Skipping setting visibility.");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public Bundle m9333x() {
        Bundle bundle = new Bundle(this.f8503a);
        for (String str : this.f8503a.keySet()) {
            if (!m9310s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: y */
    public Bundle m9334y() {
        Bundle bundle = new Bundle(this.f8503a);
        for (String str : this.f8503a.keySet()) {
            if (m9312u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
