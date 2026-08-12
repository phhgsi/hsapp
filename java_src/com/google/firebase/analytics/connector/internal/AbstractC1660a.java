package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjj;
import p117j1.AbstractC2081o;
import p117j1.AbstractC2084r;

/* JADX INFO: renamed from: com.google.firebase.analytics.connector.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1660a {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2084r f8362a = AbstractC2084r.m10441p("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b */
    private static final AbstractC2081o f8363b = AbstractC2081o.m10411p("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c */
    private static final AbstractC2081o f8364c = AbstractC2081o.m10410o("auto", "app", "am");

    /* JADX INFO: renamed from: d */
    private static final AbstractC2081o f8365d = AbstractC2081o.m10409n("_r", "_dbg");

    /* JADX INFO: renamed from: e */
    private static final AbstractC2081o f8366e = new AbstractC2081o.a().m10419e(zzjj.zza).m10419e(zzjj.zzb).m10420f();

    /* JADX INFO: renamed from: f */
    private static final AbstractC2081o f8367f = AbstractC2081o.m10409n("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: a */
    public static void m9111a(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9112b(String str, Bundle bundle) {
        if (f8363b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC2081o abstractC2081o = f8365d;
        int size = abstractC2081o.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = abstractC2081o.get(i3);
            i3++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9113c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (f8366e.contains(str2)) {
            return false;
        }
        AbstractC2081o abstractC2081o = f8367f;
        int size = abstractC2081o.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = abstractC2081o.get(i3);
            i3++;
            if (str2.matches((String) obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9114d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m9115e(str) || bundle == null) {
            return false;
        }
        AbstractC2081o abstractC2081o = f8365d;
        int size = abstractC2081o.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = abstractC2081o.get(i3);
            i3++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.getClass();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m9115e(String str) {
        return !f8364c.contains(str);
    }
}
