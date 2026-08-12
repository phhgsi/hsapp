package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import p129m1.C2267e;

/* JADX INFO: renamed from: com.google.firebase.messaging.I */
/* JADX INFO: loaded from: classes.dex */
class C1700I {

    /* JADX INFO: renamed from: a */
    private final Context f8498a;

    /* JADX INFO: renamed from: b */
    private String f8499b;

    /* JADX INFO: renamed from: c */
    private String f8500c;

    /* JADX INFO: renamed from: d */
    private int f8501d;

    /* JADX INFO: renamed from: e */
    private int f8502e = 0;

    C1700I(Context context) {
        this.f8498a = context;
    }

    /* JADX INFO: renamed from: c */
    static String m9301c(C2267e c2267e) {
        String strM10863d = c2267e.m10850m().m10863d();
        if (strM10863d != null) {
            return strM10863d;
        }
        String strM10862c = c2267e.m10850m().m10862c();
        if (!strM10862c.startsWith("1:")) {
            return strM10862c;
        }
        String[] strArrSplit = strM10862c.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    private PackageInfo m9302f(String str) {
        try {
            return this.f8498a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("FirebaseMessaging", "Failed to find package " + e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private synchronized void m9303h() {
        PackageInfo packageInfoM9302f = m9302f(this.f8498a.getPackageName());
        if (packageInfoM9302f != null) {
            this.f8499b = Integer.toString(packageInfoM9302f.versionCode);
            this.f8500c = packageInfoM9302f.versionName;
        }
    }

    /* JADX INFO: renamed from: a */
    synchronized String m9304a() {
        try {
            if (this.f8499b == null) {
                m9303h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8499b;
    }

    /* JADX INFO: renamed from: b */
    synchronized String m9305b() {
        try {
            if (this.f8500c == null) {
                m9303h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8500c;
    }

    /* JADX INFO: renamed from: d */
    synchronized int m9306d() {
        PackageInfo packageInfoM9302f;
        try {
            if (this.f8501d == 0 && (packageInfoM9302f = m9302f("com.google.android.gms")) != null) {
                this.f8501d = packageInfoM9302f.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8501d;
    }

    /* JADX INFO: renamed from: e */
    synchronized int m9307e() {
        int i3 = this.f8502e;
        if (i3 != 0) {
            return i3;
        }
        PackageManager packageManager = this.f8498a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f8502e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f8502e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f8502e = 2;
        } else {
            this.f8502e = 1;
        }
        return this.f8502e;
    }

    /* JADX INFO: renamed from: g */
    boolean m9308g() {
        return m9307e() != 0;
    }
}
