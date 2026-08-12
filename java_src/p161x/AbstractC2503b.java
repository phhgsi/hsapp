package p161x;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.content.AbstractC0966b;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: x.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2503b extends AbstractC0966b {

    /* JADX INFO: renamed from: x.b$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m11896a(Activity activity, String[] strArr, int i3) {
            activity.requestPermissions(strArr, i3);
        }

        /* JADX INFO: renamed from: b */
        static boolean m11897b(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: x.b$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static boolean m11898a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: renamed from: x.b$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static boolean m11899a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: x.b$d */
    public interface d {
        /* JADX INFO: renamed from: b */
        void mo4927b(int i3);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11889a(Activity activity) {
        if (activity.isFinishing() || AbstractC2505d.m11908i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* JADX INFO: renamed from: b */
    public static void m11890b(Activity activity) {
        activity.finishAffinity();
    }

    /* JADX INFO: renamed from: c */
    public static void m11891c(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: x.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2503b.m11889a(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m11892d(Activity activity, String[] strArr, int i3) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (TextUtils.isEmpty(strArr[i4])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < strArr.length; i6++) {
                if (!hashSet.contains(Integer.valueOf(i6))) {
                    strArr2[i5] = strArr[i6];
                    i5++;
                }
            }
        }
        if (activity instanceof d) {
            ((d) activity).mo4927b(i3);
        }
        a.m11896a(activity, strArr, i3);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11893e(Activity activity, String str) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i3 >= 32 ? c.m11899a(activity, str) : i3 == 31 ? b.m11898a(activity, str) : a.m11897b(activity, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static void m11894f(Activity activity, Intent intent, int i3, Bundle bundle) {
        activity.startActivityForResult(intent, i3, bundle);
    }

    /* JADX INFO: renamed from: g */
    public static void m11895g(Activity activity, IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }
}
