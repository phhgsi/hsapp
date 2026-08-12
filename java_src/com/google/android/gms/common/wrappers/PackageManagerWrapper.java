package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p024I.C0207d;

/* JADX INFO: loaded from: classes.dex */
public class PackageManagerWrapper {
    protected final Context zza;

    public PackageManagerWrapper(Context context) {
        this.zza = context;
    }

    public int checkCallingOrSelfPermission(String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    public int checkPermission(String str, String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @ResultIgnorabilityUnspecified
    public ApplicationInfo getApplicationInfo(String str, int i3) {
        return this.zza.getPackageManager().getApplicationInfo(str, i3);
    }

    public CharSequence getApplicationLabel(String str) {
        Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    public C0207d getApplicationLabelAndIcon(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return C0207d.m600a(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @ResultIgnorabilityUnspecified
    public PackageInfo getPackageInfo(String str, int i3) {
        return this.zza.getPackageManager().getPackageInfo(str, i3);
    }

    public boolean isCallerInstantApp() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (!PlatformVersion.isAtLeastO() || (nameForUid = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zza.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean zza(int i3, String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.zza.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i3, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.zza.getPackageManager().getPackagesForUid(i3);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
