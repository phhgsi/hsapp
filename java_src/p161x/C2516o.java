package p161x;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: x.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2516o {

    /* JADX INFO: renamed from: c */
    private static final Object f11780c = new Object();

    /* JADX INFO: renamed from: d */
    private static Set f11781d = new HashSet();

    /* JADX INFO: renamed from: e */
    private static final Object f11782e = new Object();

    /* JADX INFO: renamed from: a */
    private final Context f11783a;

    /* JADX INFO: renamed from: b */
    private final NotificationManager f11784b;

    /* JADX INFO: renamed from: x.o$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m12042a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    private C2516o(Context context) {
        this.f11783a = context;
        this.f11784b = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: b */
    public static C2516o m12040b(Context context) {
        return new C2516o(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean m12041a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m12042a(this.f11784b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f11783a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f11783a.getApplicationInfo();
        String packageName = this.f11783a.getApplicationContext().getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i3), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
