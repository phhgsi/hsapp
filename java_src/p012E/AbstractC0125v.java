package p012E;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* JADX INFO: renamed from: E.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0125v {

    /* JADX INFO: renamed from: E.v$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m362a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m361a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m362a(context);
        }
        return true;
    }
}
