package p006C;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.location.FusedLocationProviderClient;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: C.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0084a {

    /* JADX INFO: renamed from: C.a$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static float m208a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        /* JADX INFO: renamed from: b */
        static float m209b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        /* JADX INFO: renamed from: c */
        static float m210c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        /* JADX INFO: renamed from: d */
        static boolean m211d(Location location) {
            return location.hasBearingAccuracy();
        }

        /* JADX INFO: renamed from: e */
        static boolean m212e(Location location) {
            return location.hasSpeedAccuracy();
        }

        /* JADX INFO: renamed from: f */
        static boolean m213f(Location location) {
            return location.hasVerticalAccuracy();
        }
    }

    /* JADX INFO: renamed from: C.a$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static boolean m214a(Location location) {
            return location.isMock();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m199a(Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public static float m200b(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.m208a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("bearingAccuracy", 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public static long m201c(Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    /* JADX INFO: renamed from: d */
    public static float m202d(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.m209b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("speedAccuracy", 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public static float m203e(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.m210c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m204f(Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.m211d(location) : m199a(location, "bearingAccuracy");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m205g(Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.m212e(location) : m199a(location, "speedAccuracy");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m206h(Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.m213f(location) : m199a(location, FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m207i(Location location) {
        return Build.VERSION.SDK_INT >= 31 ? b.m214a(location) : location.isFromMockProvider();
    }
}
