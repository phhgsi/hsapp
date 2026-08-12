package p128m0;

import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.appcompat.app.AbstractC0751g;
import p135o0.C2287a;

/* JADX INFO: renamed from: m0.e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2207e1 {
    /* JADX INFO: renamed from: a */
    public static String m10762a(Context context) {
        C2238p c2238p = new C2238p(context);
        String strM10815a = c2238p.m10815a();
        if (!TextUtils.isEmpty(strM10815a)) {
            return strM10815a;
        }
        C2287a c2287aM10903f = C2287a.m10903f(context);
        String str = !TextUtils.isEmpty(c2287aM10903f.f10474E0) ? c2287aM10903f.f10474E0 : "light";
        c2238p.m10816c(str);
        return str;
    }

    /* JADX INFO: renamed from: b */
    private static SharedPreferences m10763b(Context context) {
        return context.getSharedPreferences("median_theme_preference", 0);
    }

    /* JADX INFO: renamed from: c */
    public static void m10764c(Context context) {
        m10763b(context).edit().putBoolean("THEME_PREFERENCE_KEY_INITIAL_THEME_SET", true).apply();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10765d(Context context) {
        int i3 = context.getResources().getConfiguration().uiMode & 48;
        return i3 != 16 && i3 == 32;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10766e(Context context) {
        return m10763b(context).getBoolean("THEME_PREFERENCE_KEY_INITIAL_THEME_SET", false);
    }

    /* JADX INFO: renamed from: f */
    public static void m10767f(String str) {
        if ("light".equals(str)) {
            AbstractC0751g.m2815N(1);
            return;
        }
        if ("dark".equals(str)) {
            AbstractC0751g.m2815N(2);
        } else if ("auto".equals(str)) {
            AbstractC0751g.m2815N(-1);
        } else {
            AbstractC0751g.m2815N(1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m10768g(Context context, String str) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if ("light".equals(str)) {
            uiModeManager.setApplicationNightMode(1);
            return;
        }
        if ("dark".equals(str)) {
            uiModeManager.setApplicationNightMode(2);
        } else if ("auto".equals(str)) {
            uiModeManager.setApplicationNightMode(0);
        } else {
            uiModeManager.setApplicationNightMode(1);
        }
    }
}
