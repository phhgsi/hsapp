package p128m0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import p075Z.AbstractC0624b;

/* JADX INFO: renamed from: m0.p */
/* JADX INFO: loaded from: classes.dex */
public class C2238p {

    /* JADX INFO: renamed from: a */
    private Context f10365a;

    /* JADX INFO: renamed from: b */
    private SharedPreferences f10366b;

    public C2238p(Context context) {
        this.f10365a = context;
    }

    /* JADX INFO: renamed from: b */
    private SharedPreferences m10814b() {
        if (this.f10366b == null) {
            this.f10366b = AbstractC0624b.m2211a(this.f10365a);
        }
        return this.f10366b;
    }

    /* JADX INFO: renamed from: a */
    public String m10815a() {
        return m10814b().getString("io.gonative.android.appTheme", null);
    }

    /* JADX INFO: renamed from: c */
    public void m10816c(String str) {
        SharedPreferences sharedPreferencesM10814b = m10814b();
        if (TextUtils.isEmpty(str)) {
            sharedPreferencesM10814b.edit().remove("io.gonative.android.appTheme").commit();
        } else {
            sharedPreferencesM10814b.edit().putString("io.gonative.android.appTheme", str).commit();
        }
    }
}
