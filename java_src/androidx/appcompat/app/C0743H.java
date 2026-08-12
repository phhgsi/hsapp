package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.AbstractC0969e;
import java.util.Calendar;

/* JADX INFO: renamed from: androidx.appcompat.app.H */
/* JADX INFO: loaded from: classes.dex */
class C0743H {

    /* JADX INFO: renamed from: d */
    private static C0743H f2614d;

    /* JADX INFO: renamed from: a */
    private final Context f2615a;

    /* JADX INFO: renamed from: b */
    private final LocationManager f2616b;

    /* JADX INFO: renamed from: c */
    private final a f2617c = new a();

    /* JADX INFO: renamed from: androidx.appcompat.app.H$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        boolean f2618a;

        /* JADX INFO: renamed from: b */
        long f2619b;

        a() {
        }
    }

    C0743H(Context context, LocationManager locationManager) {
        this.f2615a = context;
        this.f2616b = locationManager;
    }

    /* JADX INFO: renamed from: a */
    static C0743H m2724a(Context context) {
        if (f2614d == null) {
            Context applicationContext = context.getApplicationContext();
            f2614d = new C0743H(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2614d;
    }

    /* JADX INFO: renamed from: b */
    private Location m2725b() {
        Location locationM2726c = AbstractC0969e.m4232b(this.f2615a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m2726c("network") : null;
        Location locationM2726c2 = AbstractC0969e.m4232b(this.f2615a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m2726c("gps") : null;
        return (locationM2726c2 == null || locationM2726c == null) ? locationM2726c2 != null ? locationM2726c2 : locationM2726c : locationM2726c2.getTime() > locationM2726c.getTime() ? locationM2726c2 : locationM2726c;
    }

    /* JADX INFO: renamed from: c */
    private Location m2726c(String str) {
        try {
            if (this.f2616b.isProviderEnabled(str)) {
                return this.f2616b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e3) {
            Log.d("TwilightManager", "Failed to get last known location", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m2727e() {
        return this.f2617c.f2619b > System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: f */
    private void m2728f(Location location) {
        long j3;
        a aVar = this.f2617c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0742G c0742gM2722b = C0742G.m2722b();
        c0742gM2722b.m2723a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        c0742gM2722b.m2723a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z2 = c0742gM2722b.f2613c == 1;
        long j4 = c0742gM2722b.f2612b;
        long j5 = c0742gM2722b.f2611a;
        c0742gM2722b.m2723a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j6 = c0742gM2722b.f2612b;
        if (j4 == -1 || j5 == -1) {
            j3 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j5) {
                j4 = j6;
            } else if (jCurrentTimeMillis > j4) {
                j4 = j5;
            }
            j3 = j4 + 60000;
        }
        aVar.f2618a = z2;
        aVar.f2619b = j3;
    }

    /* JADX INFO: renamed from: d */
    boolean m2729d() {
        a aVar = this.f2617c;
        if (m2727e()) {
            return aVar.f2618a;
        }
        Location locationM2725b = m2725b();
        if (locationM2725b != null) {
            m2728f(locationM2725b);
            return aVar.f2618a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i3 = Calendar.getInstance().get(11);
        return i3 < 6 || i3 >= 22;
    }
}
