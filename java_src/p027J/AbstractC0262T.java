package p027J;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: J.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0262T {

    /* JADX INFO: renamed from: a */
    private static Map f1267a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: J.T$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static float m702a(VelocityTracker velocityTracker, int i3) {
            return velocityTracker.getAxisVelocity(i3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m697a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f1267a.containsKey(velocityTracker)) {
                f1267a.put(velocityTracker, new C0264U());
            }
            ((C0264U) f1267a.get(velocityTracker)).m707a(motionEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m698b(VelocityTracker velocityTracker, int i3) {
        m699c(velocityTracker, i3, Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static void m699c(VelocityTracker velocityTracker, int i3, float f3) {
        velocityTracker.computeCurrentVelocity(i3, f3);
        C0264U c0264uM701e = m701e(velocityTracker);
        if (c0264uM701e != null) {
            c0264uM701e.m708c(i3, f3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m700d(VelocityTracker velocityTracker, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m702a(velocityTracker, i3);
        }
        if (i3 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i3 == 1) {
            return velocityTracker.getYVelocity();
        }
        C0264U c0264uM701e = m701e(velocityTracker);
        if (c0264uM701e != null) {
            return c0264uM701e.m709d(i3);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: e */
    private static C0264U m701e(VelocityTracker velocityTracker) {
        return (C0264U) f1267a.get(velocityTracker);
    }
}
