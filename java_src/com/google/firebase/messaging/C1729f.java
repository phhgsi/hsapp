package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.AbstractC1725d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p161x.AbstractC2513l;

/* JADX INFO: renamed from: com.google.firebase.messaging.f */
/* JADX INFO: loaded from: classes.dex */
class C1729f {

    /* JADX INFO: renamed from: a */
    private final ExecutorService f8616a;

    /* JADX INFO: renamed from: b */
    private final Context f8617b;

    /* JADX INFO: renamed from: c */
    private final C1701J f8618c;

    public C1729f(Context context, C1701J c1701j, ExecutorService executorService) {
        this.f8616a = executorService;
        this.f8617b = context;
        this.f8618c = c1701j;
    }

    /* JADX INFO: renamed from: b */
    private boolean m9447b() {
        if (((KeyguardManager) this.f8617b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f8617b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private void m9448c(AbstractC1725d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f8617b.getSystemService("notification")).notify(aVar.f8599b, aVar.f8600c, aVar.f8598a.m11962b());
    }

    /* JADX INFO: renamed from: d */
    private C1696F m9449d() {
        C1696F c1696fM9220d = C1696F.m9220d(this.f8618c.m9330p("gcm.n.image"));
        if (c1696fM9220d != null) {
            c1696fM9220d.m9223h(this.f8616a);
        }
        return c1696fM9220d;
    }

    /* JADX INFO: renamed from: e */
    private void m9450e(AbstractC2513l.e eVar, C1696F c1696f) {
        if (c1696f == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(c1696f.m9222g(), 5L, TimeUnit.SECONDS);
            eVar.m11972n(bitmap);
            eVar.m11980v(new AbstractC2513l.b().m11948i(bitmap).m11947h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c1696f.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e3.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c1696f.close();
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m9451a() {
        if (this.f8618c.m9316a("gcm.n.noui")) {
            return true;
        }
        if (m9447b()) {
            return false;
        }
        C1696F c1696fM9449d = m9449d();
        AbstractC1725d.a aVarM9417e = AbstractC1725d.m9417e(this.f8617b, this.f8618c);
        m9450e(aVarM9417e.f8598a, c1696fM9449d);
        m9448c(aVarM9417e);
        return true;
    }
}
