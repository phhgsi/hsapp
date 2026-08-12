package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.firebase.messaging.W */
/* JADX INFO: loaded from: classes.dex */
public class C1715W {

    /* JADX INFO: renamed from: e */
    private static C1715W f8544e;

    /* JADX INFO: renamed from: a */
    private String f8545a = null;

    /* JADX INFO: renamed from: b */
    private Boolean f8546b = null;

    /* JADX INFO: renamed from: c */
    private Boolean f8547c = null;

    /* JADX INFO: renamed from: d */
    private final Queue f8548d = new ArrayDeque();

    private C1715W() {
    }

    /* JADX INFO: renamed from: a */
    private int m9362a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strM9364f = m9364f(context, intent);
        if (strM9364f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strM9364f);
            }
            intent.setClassName(context.getPackageName(), strM9364f);
        }
        try {
            if (m9367e(context)) {
                componentNameStartService = AbstractC1734h0.m9469g(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e3) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e3);
            return 402;
        } catch (SecurityException e4) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e4);
            return 401;
        }
    }

    /* JADX INFO: renamed from: b */
    static synchronized C1715W m9363b() {
        try {
            if (f8544e == null) {
                f8544e = new C1715W();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8544e;
    }

    /* JADX INFO: renamed from: f */
    private synchronized String m9364f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f8545a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f8545a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f8545a = serviceInfo.name;
                    }
                    return this.f8545a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    Intent m9365c() {
        return (Intent) this.f8548d.poll();
    }

    /* JADX INFO: renamed from: d */
    boolean m9366d(Context context) {
        if (this.f8547c == null) {
            this.f8547c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f8546b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f8547c.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    boolean m9367e(Context context) {
        if (this.f8546b == null) {
            this.f8546b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f8546b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f8546b.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public int m9368g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f8548d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m9362a(context, intent2);
    }
}
