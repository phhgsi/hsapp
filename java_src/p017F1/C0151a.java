package p017F1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.AbstractC0966b;
import p163x1.InterfaceC2526c;

/* JADX INFO: renamed from: F1.a */
/* JADX INFO: loaded from: classes.dex */
public class C0151a {

    /* JADX INFO: renamed from: a */
    private final Context f1077a;

    /* JADX INFO: renamed from: b */
    private final SharedPreferences f1078b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2526c f1079c;

    /* JADX INFO: renamed from: d */
    private boolean f1080d;

    public C0151a(Context context, String str, InterfaceC2526c interfaceC2526c) {
        Context contextM424a = m424a(context);
        this.f1077a = contextM424a;
        this.f1078b = contextM424a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f1079c = interfaceC2526c;
        this.f1080d = m425c();
    }

    /* JADX INFO: renamed from: a */
    private static Context m424a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : AbstractC0966b.createDeviceProtectedStorageContext(context);
    }

    /* JADX INFO: renamed from: c */
    private boolean m425c() {
        return this.f1078b.contains("firebase_data_collection_default_enabled") ? this.f1078b.getBoolean("firebase_data_collection_default_enabled", true) : m426d();
    }

    /* JADX INFO: renamed from: d */
    private boolean m426d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f1077a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f1077a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m427b() {
        return this.f1080d;
    }
}
