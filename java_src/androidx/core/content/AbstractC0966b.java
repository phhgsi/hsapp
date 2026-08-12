package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Executor;
import p012E.AbstractC0109f;
import p012E.AbstractC0111h;
import p012E.C0112i;
import p024I.AbstractC0206c;
import p161x.AbstractC2509h;
import p161x.C2516o;
import p164y.AbstractC2538k;

/* JADX INFO: renamed from: androidx.core.content.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0966b {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* JADX INFO: renamed from: androidx.core.content.b$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static File m4215a(Context context) {
            return context.getCodeCacheDir();
        }

        /* JADX INFO: renamed from: b */
        static Drawable m4216b(Context context, int i3) {
            return context.getDrawable(i3);
        }

        /* JADX INFO: renamed from: c */
        static File m4217c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static int m4218a(Context context, int i3) {
            return context.getColor(i3);
        }

        /* JADX INFO: renamed from: b */
        static Object m4219b(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        /* JADX INFO: renamed from: c */
        static String m4220c(Context context, Class cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static Context m4221a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* JADX INFO: renamed from: b */
        static File m4222b(Context context) {
            return context.getDataDir();
        }

        /* JADX INFO: renamed from: c */
        static boolean m4223c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$d */
    static class d {
        /* JADX INFO: renamed from: a */
        static Intent m4224a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
            return ((i3 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, AbstractC0966b.obtainAndCheckReceiverPermission(context), handler);
        }

        /* JADX INFO: renamed from: b */
        static ComponentName m4225b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$e */
    static class e {
        /* JADX INFO: renamed from: a */
        static Executor m4226a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$f */
    static class f {
        /* JADX INFO: renamed from: a */
        static Context m4227a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        /* JADX INFO: renamed from: b */
        static String m4228b(Context context) {
            return context.getAttributionTag();
        }

        /* JADX INFO: renamed from: c */
        static Display m4229c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(AbstractC0966b.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$g */
    static class g {
        /* JADX INFO: renamed from: a */
        static Intent m4230a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        AbstractC0206c.m599d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : C2516o.m12040b(context).m12041a() ? 0 : -1;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.m4227a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.m4221a(context);
        }
        return null;
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.m4228b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return a.m4215a(context);
    }

    public static int getColor(Context context, int i3) {
        return b.m4218a(context, i3);
    }

    public static ColorStateList getColorStateList(Context context, int i3) {
        return AbstractC2538k.m12139e(context.getResources(), i3, context.getTheme());
    }

    public static Context getContextForLanguage(Context context) {
        C0112i c0112iM11922a = AbstractC2509h.m11922a(context);
        if (Build.VERSION.SDK_INT > 32 || c0112iM11922a.m342f()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        AbstractC0109f.m332b(configuration, c0112iM11922a);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.m4222b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.m4229c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i3) {
        return a.m4216b(context, i3);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.m4226a(context) : AbstractC0111h.m335a(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return a.m4217c(context);
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i3) {
        return getContextForLanguage(context).getString(i3);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) b.m4219b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return b.m4220c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.m4223c(context);
        }
        return false;
    }

    static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getApplicationContext().getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (AbstractC0969e.m4232b(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
            if (AbstractC0969e.m4232b(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i3) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i3);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.m4225b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
        int i4 = i3 & 1;
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i4 != 0) {
            i3 |= 2;
        }
        int i5 = i3;
        int i6 = i5 & 2;
        if (i6 == 0 && (i5 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i6 != 0 && (i5 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 33 ? g.m4230a(context, broadcastReceiver, intentFilter, str, handler, i5) : i7 >= 26 ? d.m4224a(context, broadcastReceiver, intentFilter, str, handler, i5) : ((i5 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
