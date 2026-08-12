package p161x;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: x.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2507f {

    /* JADX INFO: renamed from: x.f$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Object m11914a(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        /* JADX INFO: renamed from: b */
        static int m11915b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* JADX INFO: renamed from: c */
        static String m11916c(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: renamed from: x.f$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static int m11917a(AppOpsManager appOpsManager, String str, int i3, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i3, str2);
        }

        /* JADX INFO: renamed from: b */
        static String m11918b(Context context) {
            return context.getOpPackageName();
        }

        /* JADX INFO: renamed from: c */
        static AppOpsManager m11919c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m11911a(Context context, int i3, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m11912b(context, str, str2);
        }
        AppOpsManager appOpsManagerM11919c = b.m11919c(context);
        int iM11917a = b.m11917a(appOpsManagerM11919c, str, Binder.getCallingUid(), str2);
        return iM11917a != 0 ? iM11917a : b.m11917a(appOpsManagerM11919c, str, i3, b.m11918b(context));
    }

    /* JADX INFO: renamed from: b */
    public static int m11912b(Context context, String str, String str2) {
        return a.m11915b((AppOpsManager) a.m11914a(context, AppOpsManager.class), str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static String m11913c(String str) {
        return a.m11916c(str);
    }
}
