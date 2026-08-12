package com.google.firebase.messaging;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.AbstractC0966b;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.atomic.AtomicInteger;
import p128m0.AbstractC2218i0;
import p161x.AbstractC2513l;

/* JADX INFO: renamed from: com.google.firebase.messaging.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1725d {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f8597a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: com.google.firebase.messaging.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC2513l.e f8598a;

        /* JADX INFO: renamed from: b */
        public final String f8599b;

        /* JADX INFO: renamed from: c */
        public final int f8600c;

        a(AbstractC2513l.e eVar, String str, int i3) {
            this.f8598a = eVar;
            this.f8599b = str;
            this.f8600c = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    private static PendingIntent m9413a(Context context, C1701J c1701j, String str, PackageManager packageManager) {
        Intent intentM9418f = m9418f(str, c1701j, packageManager);
        if (intentM9418f == null) {
            return null;
        }
        intentM9418f.addFlags(67108864);
        intentM9418f.putExtras(c1701j.m9334y());
        if (m9429q(c1701j)) {
            intentM9418f.putExtra("gcm.n.analytics_data", c1701j.m9333x());
        }
        return PendingIntent.getActivity(context, m9419g(), intentM9418f, m9424l(1073741824));
    }

    /* JADX INFO: renamed from: b */
    private static PendingIntent m9414b(Context context, Context context2, C1701J c1701j) {
        if (m9429q(c1701j)) {
            return m9415c(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(c1701j.m9333x()));
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static PendingIntent m9415c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m9419g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), m9424l(1073741824));
    }

    /* JADX INFO: renamed from: d */
    public static a m9416d(Context context, Context context2, C1701J c1701j, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        AbstractC2513l.e eVar = new AbstractC2513l.e(context2, str);
        String strM9328n = c1701j.m9328n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strM9328n)) {
            eVar.m11969j(strM9328n);
        }
        String strM9328n2 = c1701j.m9328n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strM9328n2)) {
            eVar.m11968i(strM9328n2);
            eVar.m11980v(new AbstractC2513l.c().m11956h(strM9328n2));
        }
        eVar.m11978t(m9425m(packageManager, resources, packageName, c1701j.m9330p("gcm.n.icon"), bundle));
        Uri uriM9426n = m9426n(packageName, c1701j, resources);
        if (uriM9426n != null) {
            eVar.m11979u(uriM9426n);
        }
        eVar.m11967h(m9413a(context, c1701j, packageName, packageManager));
        PendingIntent pendingIntentM9414b = m9414b(context, context2, c1701j);
        if (pendingIntentM9414b != null) {
            eVar.m11971l(pendingIntentM9414b);
        }
        Integer numM9420h = m9420h(context2, c1701j.m9330p("gcm.n.color"), bundle);
        if (numM9420h != null) {
            eVar.m11966g(numM9420h.intValue());
        }
        eVar.m11964e(!c1701j.m9316a("gcm.n.sticky"));
        eVar.m11974p(c1701j.m9316a("gcm.n.local_only"));
        String strM9330p = c1701j.m9330p("gcm.n.ticker");
        if (strM9330p != null) {
            eVar.m11981w(strM9330p);
        }
        Integer numM9327m = c1701j.m9327m();
        if (numM9327m != null) {
            eVar.m11976r(numM9327m.intValue());
        }
        Integer numM9332r = c1701j.m9332r();
        if (numM9332r != null) {
            eVar.m11983y(numM9332r.intValue());
        }
        Integer numM9326l = c1701j.m9326l();
        if (numM9326l != null) {
            eVar.m11975q(numM9326l.intValue());
        }
        Long lM9324j = c1701j.m9324j("gcm.n.event_time");
        if (lM9324j != null) {
            eVar.m11977s(true);
            eVar.m11984z(lM9324j.longValue());
        }
        long[] jArrM9331q = c1701j.m9331q();
        if (jArrM9331q != null) {
            eVar.m11982x(jArrM9331q);
        }
        int[] iArrM9319e = c1701j.m9319e();
        if (iArrM9319e != null) {
            eVar.m11973o(iArrM9319e[0], iArrM9319e[1], iArrM9319e[2]);
        }
        eVar.m11970k(m9421i(c1701j));
        return new a(eVar, m9427o(c1701j), 0);
    }

    /* JADX INFO: renamed from: e */
    static a m9417e(Context context, C1701J c1701j) {
        Bundle bundleM9422j = m9422j(context.getPackageManager(), context.getPackageName());
        return m9416d(context, context, c1701j, m9423k(context, c1701j.m9325k(), bundleM9422j), bundleM9422j);
    }

    /* JADX INFO: renamed from: f */
    private static Intent m9418f(String str, C1701J c1701j, PackageManager packageManager) {
        String strM9330p = c1701j.m9330p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strM9330p)) {
            Intent intent = new Intent(strM9330p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriM9320f = c1701j.m9320f();
        if (uriM9320f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriM9320f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* JADX INFO: renamed from: g */
    private static int m9419g() {
        return f8597a.incrementAndGet();
    }

    /* JADX INFO: renamed from: h */
    private static Integer m9420h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i3 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i3 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(AbstractC0966b.getColor(context, i3));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: i */
    private static int m9421i(C1701J c1701j) {
        boolean zM9316a = c1701j.m9316a("gcm.n.default_sound");
        ?? r02 = zM9316a;
        if (c1701j.m9316a("gcm.n.default_vibrate_timings")) {
            r02 = (zM9316a ? 1 : 0) | 2;
        }
        return c1701j.m9316a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    /* JADX INFO: renamed from: j */
    private static Bundle m9422j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e3);
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: k */
    public static String m9423k(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(AbstractC2218i0.m10781a("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    private static int m9424l(int i3) {
        return i3 | 67108864;
    }

    /* JADX INFO: renamed from: m */
    private static int m9425m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m9428p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m9428p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i3 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i3 == 0 || !m9428p(resources, i3)) {
            try {
                i3 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e3);
            }
        }
        return (i3 == 0 || !m9428p(resources, i3)) ? R.drawable.sym_def_app_icon : i3;
    }

    /* JADX INFO: renamed from: n */
    private static Uri m9426n(String str, C1701J c1701j, Resources resources) {
        String strM9329o = c1701j.m9329o();
        if (TextUtils.isEmpty(strM9329o)) {
            return null;
        }
        if ("default".equals(strM9329o) || resources.getIdentifier(strM9329o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strM9329o);
    }

    /* JADX INFO: renamed from: o */
    private static String m9427o(C1701J c1701j) {
        String strM9330p = c1701j.m9330p("gcm.n.tag");
        if (!TextUtils.isEmpty(strM9330p)) {
            return strM9330p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: p */
    private static boolean m9428p(Resources resources, int i3) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC1723c.m9408a(resources.getDrawable(i3, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i3);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i3 + ", treating it as an invalid icon");
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    static boolean m9429q(C1701J c1701j) {
        return c1701j.m9316a("google.c.a.e");
    }
}
