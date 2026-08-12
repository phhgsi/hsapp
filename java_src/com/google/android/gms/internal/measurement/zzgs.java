package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class zzgs {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzgs() {
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }

    public static boolean zzb(Context context) {
        return !zza() || zzc(context);
    }

    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzgs.class) {
            try {
                if (zzb) {
                    return true;
                }
                boolean zZzd = zzd(context);
                if (zZzd) {
                    zzb = zZzd;
                }
                return zZzd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean zzd(Context context) {
        boolean z2;
        boolean z3 = true;
        int i3 = 1;
        while (true) {
            z2 = false;
            if (i3 > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z3 = false;
                }
            } catch (NullPointerException e3) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e3);
                zza = null;
                i3++;
            }
        }
        z2 = z3;
        if (z2) {
            zza = null;
        }
        return z2;
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
