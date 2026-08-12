package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnSuccessListener;
import p092d0.ExecutorC1782m;

/* JADX INFO: renamed from: com.google.firebase.messaging.Q */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1708Q {
    /* JADX INFO: renamed from: b */
    private static SharedPreferences m9345b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: renamed from: c */
    static boolean m9346c(Context context) {
        return m9345b(context).getBoolean("proxy_notification_initialized", false);
    }

    /* JADX INFO: renamed from: d */
    static boolean m9347d(SharedPreferences sharedPreferences, boolean z2) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z2;
    }

    /* JADX INFO: renamed from: e */
    static void m9348e(Context context, boolean z2) {
        SharedPreferences.Editor editorEdit = m9345b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z2);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: f */
    static void m9349f(final Context context, C1694D c1694d, final boolean z2) {
        if (PlatformVersion.isAtLeastQ() && !m9347d(m9345b(context), z2)) {
            c1694d.m9215j(z2).addOnSuccessListener(new ExecutorC1782m(), new OnSuccessListener() { // from class: com.google.firebase.messaging.P
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AbstractC1708Q.m9350g(context, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: g */
    public static void m9350g(Context context, boolean z2) {
        SharedPreferences.Editor editorEdit = m9345b(context).edit();
        editorEdit.putBoolean("proxy_retention", z2);
        editorEdit.apply();
    }
}
