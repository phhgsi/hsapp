package p161x;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: x.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2511j {
    /* JADX INFO: renamed from: a */
    public static Intent m11926a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strM11928c = m11928c(activity);
        if (strM11928c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM11928c);
        try {
            return m11929d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM11928c + "' in manifest");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m11927b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM11929d = m11929d(context, componentName);
        if (strM11929d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM11929d);
        return m11929d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: c */
    public static String m11928c(Activity activity) {
        try {
            return m11929d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m11929d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i3 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i3 >= 29 ? 269222528 : i3 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: e */
    public static void m11930e(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11931f(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
