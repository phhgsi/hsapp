package p128m0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import p135o0.C2287a;
import p135o0.C2292f;

/* JADX INFO: renamed from: m0.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2181U {

    /* JADX INFO: renamed from: a */
    private static final String f10042a = "m0.U";

    /* JADX INFO: renamed from: b */
    private static String f10043b;

    /* JADX INFO: renamed from: a */
    private static String m10673a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    /* JADX INFO: renamed from: b */
    public static Map m10674b(Context context) {
        String installerPackageName;
        HashMap map = new HashMap();
        map.put("platform", "android");
        String str = C2287a.m10903f(context).f10523c;
        if (str == null) {
            str = "";
        }
        map.put("publicKey", str);
        String packageName = context.getPackageName();
        map.put("appId", packageName);
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            map.put("appVersion", packageInfo.versionName);
            map.put("appVersionCode", Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e3) {
            C2292f.m10956b().m10960f(f10042a, e3.getMessage(), e3);
        }
        if ((context.getApplicationInfo().flags & 2) != 0) {
            installerPackageName = "debug";
        } else {
            installerPackageName = packageManager.getInstallerPackageName(packageName);
            if (installerPackageName == null) {
                installerPackageName = "adhoc";
            } else if (installerPackageName.equals("com.android.vending") || installerPackageName.equals("com.google.market")) {
                installerPackageName = "playstore";
            } else if (installerPackageName.equals("com.amazon.venezia")) {
                installerPackageName = "amazon";
            }
        }
        map.put("distribution", installerPackageName);
        map.put("language", Locale.getDefault().getLanguage());
        map.put("os", "Android");
        map.put("osVersion", Build.VERSION.RELEASE);
        map.put("model", Build.MANUFACTURER + " " + Build.MODEL);
        map.put("hardware", Build.FINGERPRINT);
        map.put("timeZone", TimeZone.getDefault().getID());
        map.put("deviceName", m10673a());
        Log.d(f10042a, "getInfo: Carrier name collection skipped (READ_PHONE_STATE removed)");
        map.put("installationId", m10676d(context));
        if (Build.VERSION.SDK_INT >= 28) {
            map.put("androidSha1", m10675c(context));
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    private static String m10675c(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728);
            if (packageInfo.signingInfo == null) {
                return "";
            }
            Signature[] apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(apkContentsSigners[0].toByteArray());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b3 : bArrDigest) {
                sb.append(String.format("%02X:", Byte.valueOf(b3)));
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Exception e3) {
            Log.e(f10042a, "getSHA1: ", e3);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m10676d(Context context) {
        try {
            if (f10043b == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        m10678f(file);
                    }
                    f10043b = m10677e(file);
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10043b;
    }

    /* JADX INFO: renamed from: e */
    private static String m10677e(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr);
    }

    /* JADX INFO: renamed from: f */
    private static void m10678f(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(UUID.randomUUID().toString().getBytes());
        fileOutputStream.close();
    }
}
