package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.AbstractC0966b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.messaging.Z */
/* JADX INFO: loaded from: classes.dex */
class C1718Z {

    /* JADX INFO: renamed from: a */
    final SharedPreferences f8556a;

    /* JADX INFO: renamed from: com.google.firebase.messaging.Z$a */
    static class a {

        /* JADX INFO: renamed from: d */
        private static final long f8557d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a */
        final String f8558a;

        /* JADX INFO: renamed from: b */
        final String f8559b;

        /* JADX INFO: renamed from: c */
        final long f8560c;

        private a(String str, String str2, long j3) {
            this.f8558a = str;
            this.f8559b = str2;
            this.f8560c = j3;
        }

        /* JADX INFO: renamed from: a */
        static String m9384a(String str, String str2, long j3) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j3);
                return jSONObject.toString();
            } catch (JSONException e3) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e3);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        static a m9385c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e3) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e3);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        boolean m9386b(String str) {
            return System.currentTimeMillis() > this.f8560c + f8557d || !str.equals(this.f8559b);
        }
    }

    public C1718Z(Context context) {
        this.f8556a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m9378a(context, "com.google.android.gms.appid-no-backup");
    }

    /* JADX INFO: renamed from: a */
    private void m9378a(Context context, String str) {
        File file = new File(AbstractC0966b.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m9382e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            m9380c();
        } catch (IOException e3) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e3.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private String m9379b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m9380c() {
        this.f8556a.edit().clear().commit();
    }

    /* JADX INFO: renamed from: d */
    public synchronized a m9381d(String str, String str2) {
        return a.m9385c(this.f8556a.getString(m9379b(str, str2), null));
    }

    /* JADX INFO: renamed from: e */
    public synchronized boolean m9382e() {
        return this.f8556a.getAll().isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m9383f(String str, String str2, String str3, String str4) {
        String strM9384a = a.m9384a(str3, str4, System.currentTimeMillis());
        if (strM9384a == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f8556a.edit();
        editorEdit.putString(m9379b(str, str2), strM9384a);
        editorEdit.commit();
    }
}
