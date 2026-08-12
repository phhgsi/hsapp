package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C1680c;
import java.util.concurrent.ExecutionException;
import p020G1.C0181a;
import p020G1.C0182b;
import p129m1.C2267e;
import p133n1.InterfaceC2280a;
import p144r0.AbstractC2367d;
import p144r0.AbstractC2369f;
import p144r0.C2366c;
import p144r0.InterfaceC2370g;
import p144r0.InterfaceC2372i;

/* JADX INFO: renamed from: com.google.firebase.messaging.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1699H {
    /* JADX INFO: renamed from: A */
    static void m9270A(String str, Bundle bundle) {
        try {
            C2267e.m10839k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strM9278d = m9278d(bundle);
            if (strM9278d != null) {
                bundle2.putString("_nmid", strM9278d);
            }
            String strM9279e = m9279e(bundle);
            if (strM9279e != null) {
                bundle2.putString("_nmn", strM9279e);
            }
            String strM9283i = m9283i(bundle);
            if (!TextUtils.isEmpty(strM9283i)) {
                bundle2.putString("label", strM9283i);
            }
            String strM9281g = m9281g(bundle);
            if (!TextUtils.isEmpty(strM9281g)) {
                bundle2.putString("message_channel", strM9281g);
            }
            String strM9292r = m9292r(bundle);
            if (strM9292r != null) {
                bundle2.putString("_nt", strM9292r);
            }
            String strM9286l = m9286l(bundle);
            if (strM9286l != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strM9286l));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e3);
                }
            }
            String strM9294t = m9294t(bundle);
            if (strM9294t != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strM9294t));
                } catch (NumberFormatException e4) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e4);
                }
            }
            String strM9288n = m9288n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strM9288n);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC2280a interfaceC2280a = (InterfaceC2280a) C2267e.m10839k().m10847i(InterfaceC2280a.class);
            if (interfaceC2280a != null) {
                interfaceC2280a.mo10887b(AppMeasurement.FCM_ORIGIN, str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: renamed from: B */
    private static void m9271B(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC2280a interfaceC2280a = (InterfaceC2280a) C2267e.m10839k().m10847i(InterfaceC2280a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC2280a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC2280a.mo10886a(AppMeasurement.FCM_ORIGIN, "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        interfaceC2280a.mo10887b(AppMeasurement.FCM_ORIGIN, "_cmp", bundle2);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m9272C(Intent intent) {
        if (intent == null || m9295u(intent)) {
            return false;
        }
        return m9275a();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m9273D(Intent intent) {
        if (intent == null || m9295u(intent)) {
            return false;
        }
        return m9274E(intent.getExtras());
    }

    /* JADX INFO: renamed from: E */
    public static boolean m9274E(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* JADX INFO: renamed from: a */
    static boolean m9275a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C2267e.m10839k();
            Context contextM10848j = C2267e.m10839k().m10848j();
            SharedPreferences sharedPreferences = contextM10848j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextM10848j.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextM10848j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    static C0181a m9276b(C0181a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C0181a.a aVarM525j = C0181a.m500p().m529n(m9293s(extras)).m520e(bVar).m521f(m9280f(extras)).m524i(m9289o()).m527l(C0181a.d.ANDROID).m523h(m9287m(extras)).m525j(m9285k(extras));
        String strM9282h = m9282h(extras);
        if (strM9282h != null) {
            aVarM525j.m522g(strM9282h);
        }
        String strM9292r = m9292r(extras);
        if (strM9292r != null) {
            aVarM525j.m528m(strM9292r);
        }
        String strM9277c = m9277c(extras);
        if (strM9277c != null) {
            aVarM525j.m518c(strM9277c);
        }
        String strM9283i = m9283i(extras);
        if (strM9283i != null) {
            aVarM525j.m517b(strM9283i);
        }
        String strM9279e = m9279e(extras);
        if (strM9279e != null) {
            aVarM525j.m519d(strM9279e);
        }
        long jM9291q = m9291q(extras);
        if (jM9291q > 0) {
            aVarM525j.m526k(jM9291q);
        }
        return aVarM525j.m516a();
    }

    /* JADX INFO: renamed from: c */
    static String m9277c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* JADX INFO: renamed from: d */
    static String m9278d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* JADX INFO: renamed from: e */
    static String m9279e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* JADX INFO: renamed from: f */
    static String m9280f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(C1680c.m9177r(C2267e.m10839k()).mo193b());
        } catch (InterruptedException | ExecutionException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: g */
    static String m9281g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* JADX INFO: renamed from: h */
    static String m9282h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* JADX INFO: renamed from: i */
    static String m9283i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* JADX INFO: renamed from: j */
    private static int m9284j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: k */
    static int m9285k(Bundle bundle) {
        int iM9290p = m9290p(bundle);
        if (iM9290p == 2) {
            return 5;
        }
        return iM9290p == 1 ? 10 : 0;
    }

    /* JADX INFO: renamed from: l */
    static String m9286l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* JADX INFO: renamed from: m */
    static C0181a.c m9287m(Bundle bundle) {
        return (bundle == null || !C1701J.m9311t(bundle)) ? C0181a.c.DATA_MESSAGE : C0181a.c.DISPLAY_NOTIFICATION;
    }

    /* JADX INFO: renamed from: n */
    static String m9288n(Bundle bundle) {
        return (bundle == null || !C1701J.m9311t(bundle)) ? "data" : "display";
    }

    /* JADX INFO: renamed from: o */
    static String m9289o() {
        return C2267e.m10839k().m10848j().getPackageName();
    }

    /* JADX INFO: renamed from: p */
    static int m9290p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return m9284j(string);
    }

    /* JADX INFO: renamed from: q */
    static long m9291q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing project number", e3);
            }
        }
        C2267e c2267eM10839k = C2267e.m10839k();
        String strM10863d = c2267eM10839k.m10850m().m10863d();
        if (strM10863d != null) {
            try {
                return Long.parseLong(strM10863d);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e4);
            }
        }
        String strM10862c = c2267eM10839k.m10850m().m10862c();
        if (strM10862c.startsWith("1:")) {
            String[] strArrSplit = strM10862c.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e5) {
                Log.w("FirebaseMessaging", "error parsing app ID", e5);
            }
        } else {
            try {
                return Long.parseLong(strM10862c);
            } catch (NumberFormatException e6) {
                Log.w("FirebaseMessaging", "error parsing app ID", e6);
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    static String m9292r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: s */
    static int m9293s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* JADX INFO: renamed from: t */
    static String m9294t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    private static boolean m9295u(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* JADX INFO: renamed from: v */
    public static void m9296v(Intent intent) {
        m9270A("_nd", intent.getExtras());
    }

    /* JADX INFO: renamed from: w */
    public static void m9297w(Intent intent) {
        m9270A("_nf", intent.getExtras());
    }

    /* JADX INFO: renamed from: x */
    public static void m9298x(Bundle bundle) {
        m9271B(bundle);
        m9270A("_no", bundle);
    }

    /* JADX INFO: renamed from: y */
    public static void m9299y(Intent intent) {
        if (m9273D(intent)) {
            m9270A("_nr", intent.getExtras());
        }
        if (m9272C(intent)) {
            m9300z(C0181a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m9239s());
        }
    }

    /* JADX INFO: renamed from: z */
    private static void m9300z(C0181a.b bVar, Intent intent, InterfaceC2372i interfaceC2372i) {
        if (interfaceC2372i == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C0181a c0181aM9276b = m9276b(bVar, intent);
        if (c0181aM9276b == null) {
            return;
        }
        try {
            interfaceC2372i.mo11218a("FCM_CLIENT_EVENT_LOGGING", C0182b.class, C2366c.m11213b("proto"), new InterfaceC2370g() { // from class: com.google.firebase.messaging.G
                @Override // p144r0.InterfaceC2370g
                public final Object apply(Object obj) {
                    return ((C0182b) obj).m536c();
                }
            }).mo11217a(AbstractC2367d.m11215e(C0182b.m534b().m538b(c0181aM9276b).m537a(), AbstractC2369f.m11216b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e3) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e3);
        }
    }
}
