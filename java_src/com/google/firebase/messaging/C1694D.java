package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.AbstractC1684g;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p002A1.InterfaceC0027b;
import p005B1.InterfaceC0081e;
import p026I1.InterfaceC0224i;
import p092d0.ExecutorC1782m;
import p129m1.C2267e;
import p166y1.InterfaceC2555j;

/* JADX INFO: renamed from: com.google.firebase.messaging.D */
/* JADX INFO: loaded from: classes.dex */
class C1694D {

    /* JADX INFO: renamed from: a */
    private final C2267e f8465a;

    /* JADX INFO: renamed from: b */
    private final C1700I f8466b;

    /* JADX INFO: renamed from: c */
    private final Rpc f8467c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0027b f8468d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0027b f8469e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0081e f8470f;

    C1694D(C2267e c2267e, C1700I c1700i, InterfaceC0027b interfaceC0027b, InterfaceC0027b interfaceC0027b2, InterfaceC0081e interfaceC0081e) {
        this(c2267e, c1700i, new Rpc(c2267e.m10848j()), interfaceC0027b, interfaceC0027b2, interfaceC0081e);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m9205a(C1694D c1694d, Task task) {
        c1694d.getClass();
        return c1694d.m9209g((Bundle) task.getResult(IOException.class));
    }

    /* JADX INFO: renamed from: b */
    private static String m9206b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX INFO: renamed from: c */
    private Task m9207c(Task task) {
        return task.continueWith(new ExecutorC1782m(), new Continuation() { // from class: com.google.firebase.messaging.C
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C1694D.m9205a(this.f8464a, task2);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private String m9208d() {
        try {
            return m9206b(MessageDigest.getInstance("SHA-1").digest(this.f8465a.m10849l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* JADX INFO: renamed from: g */
    private String m9209g(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: renamed from: h */
    static boolean m9210h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: renamed from: i */
    private void m9211i(String str, String str2, Bundle bundle) {
        InterfaceC2555j.a aVarMo12202b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f8465a.m10850m().m10862c());
        bundle.putString("gmsv", Integer.toString(this.f8466b.m9306d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f8466b.m9304a());
        bundle.putString("app_ver_name", this.f8466b.m9305b());
        bundle.putString("firebase-app-name-hash", m9208d());
        try {
            String strMo9152b = ((AbstractC1684g) Tasks.await(this.f8470f.mo194c(false))).mo9152b();
            if (TextUtils.isEmpty(strMo9152b)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strMo9152b);
            }
        } catch (InterruptedException e3) {
            e = e3;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e4) {
            e = e4;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(this.f8470f.mo193b()));
        bundle.putString("cliv", "fcm-24.1.0");
        InterfaceC2555j interfaceC2555j = (InterfaceC2555j) this.f8469e.get();
        InterfaceC0224i interfaceC0224i = (InterfaceC0224i) this.f8468d.get();
        if (interfaceC2555j == null || interfaceC0224i == null || (aVarMo12202b = interfaceC2555j.mo12202b("fire-iid")) == InterfaceC2555j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarMo12202b.m12206b()));
        bundle.putString("Firebase-Client", interfaceC0224i.mo619a());
    }

    /* JADX INFO: renamed from: k */
    private Task m9212k(String str, String str2, Bundle bundle) {
        try {
            m9211i(str, str2, bundle);
            return this.f8467c.send(bundle);
        } catch (InterruptedException | ExecutionException e3) {
            return Tasks.forException(e3);
        }
    }

    /* JADX INFO: renamed from: e */
    Task m9213e() {
        return this.f8467c.getProxiedNotificationData();
    }

    /* JADX INFO: renamed from: f */
    Task m9214f() {
        return m9207c(m9212k(C1700I.m9301c(this.f8465a), "*", new Bundle()));
    }

    /* JADX INFO: renamed from: j */
    Task m9215j(boolean z2) {
        return this.f8467c.setRetainProxiedNotifications(z2);
    }

    /* JADX INFO: renamed from: l */
    Task m9216l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m9207c(m9212k(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: renamed from: m */
    Task m9217m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m9207c(m9212k(str, "/topics/" + str2, bundle));
    }

    C1694D(C2267e c2267e, C1700I c1700i, Rpc rpc, InterfaceC0027b interfaceC0027b, InterfaceC0027b interfaceC0027b2, InterfaceC0081e interfaceC0081e) {
        this.f8465a = c2267e;
        this.f8466b = c1700i;
        this.f8467c = rpc;
        this.f8468d = interfaceC0027b;
        this.f8469e = interfaceC0027b2;
        this.f8470f = interfaceC0081e;
    }
}
