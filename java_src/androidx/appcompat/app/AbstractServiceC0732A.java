package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;

/* JADX INFO: renamed from: androidx.appcompat.app.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC0732A extends Service {

    /* JADX INFO: renamed from: androidx.appcompat.app.A$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static int m2654a() {
            return 512;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ServiceInfo m2653a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0732A.class), Build.VERSION.SDK_INT >= 24 ? a.m2654a() | 128 : 640);
    }
}
